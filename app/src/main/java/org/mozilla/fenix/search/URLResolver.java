package org.mozilla.fenix.search;

import static org.web3j.crypto.Hash.sha3;

import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.tx.gas.DefaultGasProvider;


public class URLResolver {
    private final Web3j web3j;
    private final String contractAddress;

    public  URLResolver(Web3j web3j, String contractAddress) {
        this.web3j = web3j;
        this.contractAddress = contractAddress;
    }

    public String namehash(String inputname) {
        //Should normalize in the future
        inputname = inputname.toLowerCase();
        String[] nameparts = inputname.split("\\.");
        String namehash = "";
        for (int i = 0;i<32;i++) {
            namehash += "00";
        }

        String[] labels = inputname.split("\\.");

        for(int i = labels.length - 1; i>=0; i--) {
            String labelSha = sha3(labels[i]);
            namehash = sha3(namehash + labelSha);
        }
        return "0x"+namehash;
    }

    public String ensToURL(String name) {
        String nh = namehash(name);
        try {
            Resolver resolver = Resolver.load(contractAddress, web3j, Credentials.create("0x"+"0000000000000000000000000000000000000000000000000000000000000000"), new DefaultGasProvider());
            byte[] output = stringToBytes32(nh);
            String url = resolver.text(stringToBytes32(nh), "url").sendAsync().get();
            return url;
        } catch (Exception e) {
            e.printStackTrace();
            return name + ".xyz";
        }
    }
    public static byte[] stringToBytes32(String string) {
        byte[] byteValue = string.getBytes();
        byte[] byteValueLen32 = new byte[32];
        System.arraycopy(byteValue, 0, byteValueLen32, 0, byteValue.length);
        return byteValueLen32;
    }
}
