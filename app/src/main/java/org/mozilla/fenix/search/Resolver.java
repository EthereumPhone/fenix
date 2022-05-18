package org.mozilla.fenix.search;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.DynamicBytes;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple2;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.4.1.
 */
@SuppressWarnings("rawtypes")
public class Resolver extends Contract {
    public static final String BINARY = "Bin file was not provided";

    public static final String FUNC_ABI = "ABI";

    public static final String FUNC_addr = "addr";

    public static final String FUNC_CONTENTHASH = "contenthash";

    public static final String FUNC_DNSRR = "dnsrr";

    public static final String FUNC_NAME = "name";

    public static final String FUNC_PUBKEY = "pubkey";

    public static final String FUNC_TEXT = "text";

    public static final String FUNC_INTERFACEIMPLEMENTER = "interfaceImplementer";

    public static final String FUNC_SETABI = "setABI";

    public static final String FUNC_setAddr = "setAddr";

    public static final String FUNC_SETCONTENTHASH = "setContenthash";

    public static final String FUNC_SETDNSRR = "setDnsrr";

    public static final String FUNC_SETNAME = "setName";

    public static final String FUNC_SETPUBKEY = "setPubkey";

    public static final String FUNC_SETTEXT = "setText";

    public static final String FUNC_SETINTERFACE = "setInterface";

    public static final String FUNC_SUPPORTSINTERFACE = "supportsInterface";

    public static final String FUNC_MULTICALL = "multicall";

    public static final String FUNC_CONTENT = "content";

    public static final String FUNC_MULTIHASH = "multihash";

    public static final String FUNC_SETCONTENT = "setContent";

    public static final String FUNC_SETMULTIHASH = "setMultihash";

    public static final Event ABICHANGED_EVENT = new Event("ABIChanged", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>(true) {}, new TypeReference<Uint256>(true) {}));
    ;

    public static final Event ADDRCHANGED_EVENT = new Event("AddrChanged", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>(true) {}, new TypeReference<Address>() {}));
    ;

    public static final Event ADDRESSCHANGED_EVENT = new Event("AddressChanged", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>(true) {}, new TypeReference<Uint256>() {}, new TypeReference<DynamicBytes>() {}));
    ;

    public static final Event CONTENTCHANGED_EVENT = new Event("ContentChanged", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>(true) {}, new TypeReference<Bytes32>() {}));
    ;

    public static final Event CONTENTHASHCHANGED_EVENT = new Event("ContenthashChanged", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>(true) {}, new TypeReference<DynamicBytes>() {}));
    ;

    public static final Event NAMECHANGED_EVENT = new Event("NameChanged", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>(true) {}, new TypeReference<Utf8String>() {}));
    ;

    public static final Event PUBKEYCHANGED_EVENT = new Event("PubkeyChanged", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>(true) {}, new TypeReference<Bytes32>() {}, new TypeReference<Bytes32>() {}));
    ;

    public static final Event TEXTCHANGED_EVENT = new Event("TextChanged", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>(true) {}, new TypeReference<Utf8String>(true) {}, new TypeReference<Utf8String>() {}));
    ;

    @Deprecated
    protected Resolver(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Resolver(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Resolver(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Resolver(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }


    public List<ABIChangedEventResponse> getABIChangedEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(ABICHANGED_EVENT, transactionReceipt);
        ArrayList<ABIChangedEventResponse> responses = new ArrayList<ABIChangedEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            ABIChangedEventResponse typedResponse = new ABIChangedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.node = (byte[]) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.contentType = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<ABIChangedEventResponse> aBIChangedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, ABIChangedEventResponse>() {
            @Override
            public ABIChangedEventResponse apply(Log log) {
                EventValuesWithLog eventValues = extractEventParametersWithLog(ABICHANGED_EVENT, log);
                ABIChangedEventResponse typedResponse = new ABIChangedEventResponse();
                typedResponse.log = log;
                typedResponse.node = (byte[]) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.contentType = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<ABIChangedEventResponse> aBIChangedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ABICHANGED_EVENT));
        return aBIChangedEventFlowable(filter);
    }

    public List<AddrChangedEventResponse> getAddrChangedEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(ADDRCHANGED_EVENT, transactionReceipt);
        ArrayList<AddrChangedEventResponse> responses = new ArrayList<AddrChangedEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            AddrChangedEventResponse typedResponse = new AddrChangedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.node = (byte[]) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.a = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<AddrChangedEventResponse> addrChangedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, AddrChangedEventResponse>() {
            @Override
            public AddrChangedEventResponse apply(Log log) {
                EventValuesWithLog eventValues = extractEventParametersWithLog(ADDRCHANGED_EVENT, log);
                AddrChangedEventResponse typedResponse = new AddrChangedEventResponse();
                typedResponse.log = log;
                typedResponse.node = (byte[]) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.a = (String) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<AddrChangedEventResponse> addrChangedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ADDRCHANGED_EVENT));
        return addrChangedEventFlowable(filter);
    }

    public List<AddressChangedEventResponse> getAddressChangedEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(ADDRESSCHANGED_EVENT, transactionReceipt);
        ArrayList<AddressChangedEventResponse> responses = new ArrayList<AddressChangedEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            AddressChangedEventResponse typedResponse = new AddressChangedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.node = (byte[]) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.coinType = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.newAddress = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<AddressChangedEventResponse> addressChangedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, AddressChangedEventResponse>() {
            @Override
            public AddressChangedEventResponse apply(Log log) {
                EventValuesWithLog eventValues = extractEventParametersWithLog(ADDRESSCHANGED_EVENT, log);
                AddressChangedEventResponse typedResponse = new AddressChangedEventResponse();
                typedResponse.log = log;
                typedResponse.node = (byte[]) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.coinType = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.newAddress = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<AddressChangedEventResponse> addressChangedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ADDRESSCHANGED_EVENT));
        return addressChangedEventFlowable(filter);
    }

    public List<ContentChangedEventResponse> getContentChangedEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(CONTENTCHANGED_EVENT, transactionReceipt);
        ArrayList<ContentChangedEventResponse> responses = new ArrayList<ContentChangedEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            ContentChangedEventResponse typedResponse = new ContentChangedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.node = (byte[]) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.hash = (byte[]) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<ContentChangedEventResponse> contentChangedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, ContentChangedEventResponse>() {
            @Override
            public ContentChangedEventResponse apply(Log log) {
                EventValuesWithLog eventValues = extractEventParametersWithLog(CONTENTCHANGED_EVENT, log);
                ContentChangedEventResponse typedResponse = new ContentChangedEventResponse();
                typedResponse.log = log;
                typedResponse.node = (byte[]) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.hash = (byte[]) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<ContentChangedEventResponse> contentChangedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(CONTENTCHANGED_EVENT));
        return contentChangedEventFlowable(filter);
    }

    public List<ContenthashChangedEventResponse> getContenthashChangedEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(CONTENTHASHCHANGED_EVENT, transactionReceipt);
        ArrayList<ContenthashChangedEventResponse> responses = new ArrayList<ContenthashChangedEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            ContenthashChangedEventResponse typedResponse = new ContenthashChangedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.node = (byte[]) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.hash = (byte[]) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<ContenthashChangedEventResponse> contenthashChangedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, ContenthashChangedEventResponse>() {
            @Override
            public ContenthashChangedEventResponse apply(Log log) {
                EventValuesWithLog eventValues = extractEventParametersWithLog(CONTENTHASHCHANGED_EVENT, log);
                ContenthashChangedEventResponse typedResponse = new ContenthashChangedEventResponse();
                typedResponse.log = log;
                typedResponse.node = (byte[]) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.hash = (byte[]) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<ContenthashChangedEventResponse> contenthashChangedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(CONTENTHASHCHANGED_EVENT));
        return contenthashChangedEventFlowable(filter);
    }

    public List<NameChangedEventResponse> getNameChangedEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(NAMECHANGED_EVENT, transactionReceipt);
        ArrayList<NameChangedEventResponse> responses = new ArrayList<NameChangedEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            NameChangedEventResponse typedResponse = new NameChangedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.node = (byte[]) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.name = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<NameChangedEventResponse> nameChangedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, NameChangedEventResponse>() {
            @Override
            public NameChangedEventResponse apply(Log log) {
                EventValuesWithLog eventValues = extractEventParametersWithLog(NAMECHANGED_EVENT, log);
                NameChangedEventResponse typedResponse = new NameChangedEventResponse();
                typedResponse.log = log;
                typedResponse.node = (byte[]) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.name = (String) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<NameChangedEventResponse> nameChangedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(NAMECHANGED_EVENT));
        return nameChangedEventFlowable(filter);
    }

    public List<PubkeyChangedEventResponse> getPubkeyChangedEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(PUBKEYCHANGED_EVENT, transactionReceipt);
        ArrayList<PubkeyChangedEventResponse> responses = new ArrayList<PubkeyChangedEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            PubkeyChangedEventResponse typedResponse = new PubkeyChangedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.node = (byte[]) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.x = (byte[]) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.y = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<PubkeyChangedEventResponse> pubkeyChangedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, PubkeyChangedEventResponse>() {
            @Override
            public PubkeyChangedEventResponse apply(Log log) {
                EventValuesWithLog eventValues = extractEventParametersWithLog(PUBKEYCHANGED_EVENT, log);
                PubkeyChangedEventResponse typedResponse = new PubkeyChangedEventResponse();
                typedResponse.log = log;
                typedResponse.node = (byte[]) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.x = (byte[]) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.y = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<PubkeyChangedEventResponse> pubkeyChangedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(PUBKEYCHANGED_EVENT));
        return pubkeyChangedEventFlowable(filter);
    }

    public List<TextChangedEventResponse> getTextChangedEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(TEXTCHANGED_EVENT, transactionReceipt);
        ArrayList<TextChangedEventResponse> responses = new ArrayList<TextChangedEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            TextChangedEventResponse typedResponse = new TextChangedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.node = (byte[]) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.indexedKey = (byte[]) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.key = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<TextChangedEventResponse> textChangedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, TextChangedEventResponse>() {
            @Override
            public TextChangedEventResponse apply(Log log) {
                EventValuesWithLog eventValues = extractEventParametersWithLog(TEXTCHANGED_EVENT, log);
                TextChangedEventResponse typedResponse = new TextChangedEventResponse();
                typedResponse.log = log;
                typedResponse.node = (byte[]) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.indexedKey = (byte[]) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.key = (String) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<TextChangedEventResponse> textChangedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(TEXTCHANGED_EVENT));
        return textChangedEventFlowable(filter);
    }

    public RemoteFunctionCall<Tuple2<BigInteger, byte[]>> ABI(byte[] node, BigInteger contentTypes) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_ABI, 
                Arrays.<Type>asList(new Bytes32(node),
                new Uint256(contentTypes)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<DynamicBytes>() {}));
        return new RemoteFunctionCall<Tuple2<BigInteger, byte[]>>(function,
                new Callable<Tuple2<BigInteger, byte[]>>() {
                    @Override
                    public Tuple2<BigInteger, byte[]> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<BigInteger, byte[]>(
                                (BigInteger) results.get(0).getValue(), 
                                (byte[]) results.get(1).getValue());
                    }
                });
    }

    public RemoteFunctionCall<String> addr(byte[] node) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_addr, 
                Arrays.<Type>asList(new Bytes32(node)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<byte[]> addr(byte[] node, BigInteger coinType) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_addr, 
                Arrays.<Type>asList(new Bytes32(node),
                new Uint256(coinType)),
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> contenthash(byte[] node) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_CONTENTHASH, 
                Arrays.<Type>asList(new Bytes32(node)),
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> dnsrr(byte[] node) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_DNSRR, 
                Arrays.<Type>asList(new Bytes32(node)),
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<String> name(byte[] node) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_NAME, 
                Arrays.<Type>asList(new Bytes32(node)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<Tuple2<byte[], byte[]>> pubkey(byte[] node) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_PUBKEY, 
                Arrays.<Type>asList(new Bytes32(node)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}, new TypeReference<Bytes32>() {}));
        return new RemoteFunctionCall<Tuple2<byte[], byte[]>>(function,
                new Callable<Tuple2<byte[], byte[]>>() {
                    @Override
                    public Tuple2<byte[], byte[]> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<byte[], byte[]>(
                                (byte[]) results.get(0).getValue(), 
                                (byte[]) results.get(1).getValue());
                    }
                });
    }

    public RemoteFunctionCall<String> text(byte[] node, String key) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_TEXT, 
                Arrays.<Type>asList(new Bytes32(node),
                new Utf8String(key)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> interfaceImplementer(byte[] node, byte[] interfaceID) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_INTERFACEIMPLEMENTER, 
                Arrays.<Type>asList(new Bytes32(node),
                new org.web3j.abi.datatypes.generated.Bytes4(interfaceID)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> setABI(byte[] node, BigInteger contentType, byte[] data) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SETABI, 
                Arrays.<Type>asList(new Bytes32(node),
                new Uint256(contentType),
                new DynamicBytes(data)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setAddr(byte[] node, BigInteger coinType, byte[] a) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_setAddr, 
                Arrays.<Type>asList(new Bytes32(node),
                new Uint256(coinType),
                new DynamicBytes(a)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setAddr(byte[] node, String addr) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_setAddr, 
                Arrays.<Type>asList(new Bytes32(node),
                new Address(160, addr)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setContenthash(byte[] node, byte[] hash) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SETCONTENTHASH, 
                Arrays.<Type>asList(new Bytes32(node),
                new DynamicBytes(hash)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setDnsrr(byte[] node, byte[] data) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SETDNSRR, 
                Arrays.<Type>asList(new Bytes32(node),
                new DynamicBytes(data)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setName(byte[] node, String _name) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SETNAME, 
                Arrays.<Type>asList(new Bytes32(node),
                new Utf8String(_name)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setPubkey(byte[] node, byte[] x, byte[] y) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SETPUBKEY, 
                Arrays.<Type>asList(new Bytes32(node),
                new Bytes32(x),
                new Bytes32(y)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setText(byte[] node, String key, String value) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SETTEXT, 
                Arrays.<Type>asList(new Bytes32(node),
                new Utf8String(key),
                new Utf8String(value)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setInterface(byte[] node, byte[] interfaceID, String implementer) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SETINTERFACE, 
                Arrays.<Type>asList(new Bytes32(node),
                new org.web3j.abi.datatypes.generated.Bytes4(interfaceID), 
                new Address(160, implementer)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Boolean> supportsInterface(byte[] interfaceID) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_SUPPORTSINTERFACE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes4(interfaceID)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<TransactionReceipt> multicall(List<byte[]> data) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_MULTICALL, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<DynamicBytes>(
                        DynamicBytes.class,
                        org.web3j.abi.Utils.typeMap(data, DynamicBytes.class))),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<byte[]> content(byte[] node) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_CONTENT, 
                Arrays.<Type>asList(new Bytes32(node)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> multihash(byte[] node) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_MULTIHASH, 
                Arrays.<Type>asList(new Bytes32(node)),
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<TransactionReceipt> setContent(byte[] node, byte[] hash) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SETCONTENT, 
                Arrays.<Type>asList(new Bytes32(node),
                new Bytes32(hash)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setMultihash(byte[] node, byte[] hash) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SETMULTIHASH, 
                Arrays.<Type>asList(new Bytes32(node),
                new DynamicBytes(hash)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static Resolver load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Resolver(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Resolver load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Resolver(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Resolver load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Resolver(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Resolver load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Resolver(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static class ABIChangedEventResponse extends BaseEventResponse {
        public byte[] node;

        public BigInteger contentType;
    }

    public static class AddrChangedEventResponse extends BaseEventResponse {
        public byte[] node;

        public String a;
    }

    public static class AddressChangedEventResponse extends BaseEventResponse {
        public byte[] node;

        public BigInteger coinType;

        public byte[] newAddress;
    }

    public static class ContentChangedEventResponse extends BaseEventResponse {
        public byte[] node;

        public byte[] hash;
    }

    public static class ContenthashChangedEventResponse extends BaseEventResponse {
        public byte[] node;

        public byte[] hash;
    }

    public static class NameChangedEventResponse extends BaseEventResponse {
        public byte[] node;

        public String name;
    }

    public static class PubkeyChangedEventResponse extends BaseEventResponse {
        public byte[] node;

        public byte[] x;

        public byte[] y;
    }

    public static class TextChangedEventResponse extends BaseEventResponse {
        public byte[] node;

        public byte[] indexedKey;

        public String key;
    }
}
