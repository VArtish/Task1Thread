package com.azati.task1.util;

public class PierIdGenerator {
    public static long currentId = 0;

    private PierIdGenerator() {
    }

    public static long generate() {
        return ++currentId;
    }
}
