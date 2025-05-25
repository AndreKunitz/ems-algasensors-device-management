package com.akunitz.algasensors.device.management;

import io.hypersistence.tsid.TSID;

import java.util.Optional;

public class IdGenerator {

    private static final TSID.Factory tsidFactory;

    static {
        // Static initializer for any required setup
        Optional.ofNullable(System.getenv("sid.node"))
                .ifPresent(tsidNode -> System.setProperty("tsid.node", tsidNode));

        Optional.ofNullable(System.getenv("tsid.node.count"))
                .ifPresent(tsidNodeCount -> System.setProperty("tsid.node.count", tsidNodeCount));

        tsidFactory = TSID.Factory.builder().build();
    }

    private IdGenerator() {
        // Private constructor to prevent instantiation
    }

    public static TSID generateTSID() {
        return tsidFactory.generate();
    }
}
