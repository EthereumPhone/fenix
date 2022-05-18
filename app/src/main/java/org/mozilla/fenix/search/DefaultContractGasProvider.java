package org.mozilla.fenix.search;

import org.web3j.tx.gas.ContractGasProvider;

import java.math.BigInteger;

public class DefaultContractGasProvider implements ContractGasProvider {
    public static final BigInteger GAS_LIMIT = BigInteger.valueOf(9_000_000);
    public static final BigInteger GAS_PRICE = BigInteger.valueOf(4_100_000_000L);

    public DefaultContractGasProvider() {

    }

    @Override
    public BigInteger getGasPrice(String contractFunc) {
        return GAS_PRICE;
    }

    @Override
    public BigInteger getGasPrice() {
        return GAS_PRICE;
    }

    @Override
    public BigInteger getGasLimit(String contractFunc) {
        return GAS_LIMIT;
    }

    @Override
    public BigInteger getGasLimit() {
        return GAS_LIMIT;
    }
}


