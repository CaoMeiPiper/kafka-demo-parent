package com.janita.kafka.two.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Janita on 2017-03-17 14:16
 */
@ConfigurationProperties(prefix = "kafka")
public class KafkaProps {

    private static String bootstrapServers;
    private static int  retries;
    private static long batchSize;
    private static int lingerMs;
    private static long bufferMemory;
    private static String autoCommitIntervalMs;
    private static String sessionTimeoutMs;
    private static String groupId;
    private static String autoOffsetReset;

    public static String getBootstrapServers() {
        return bootstrapServers;
    }

    public static void setBootstrapServers(String bootstrapServers) {
        KafkaProps.bootstrapServers = bootstrapServers;
    }

    public static int getRetries() {
        return retries;
    }

    public static void setRetries(int retries) {
        KafkaProps.retries = retries;
    }

    public static long getBatchSize() {
        return batchSize;
    }

    public static void setBatchSize(long batchSize) {
        KafkaProps.batchSize = batchSize;
    }

    public static int getLingerMs() {
        return lingerMs;
    }

    public static void setLingerMs(int lingerMs) {
        KafkaProps.lingerMs = lingerMs;
    }

    public static long getBufferMemory() {
        return bufferMemory;
    }

    public static void setBufferMemory(long bufferMemory) {
        KafkaProps.bufferMemory = bufferMemory;
    }

    public static String getAutoCommitIntervalMs() {
        return autoCommitIntervalMs;
    }

    public static void setAutoCommitIntervalMs(String autoCommitIntervalMs) {
        KafkaProps.autoCommitIntervalMs = autoCommitIntervalMs;
    }

    public static String getSessionTimeoutMs() {
        return sessionTimeoutMs;
    }

    public static void setSessionTimeoutMs(String sessionTimeoutMs) {
        KafkaProps.sessionTimeoutMs = sessionTimeoutMs;
    }

    public static String getGroupId() {
        return groupId;
    }

    public static void setGroupId(String groupId) {
        KafkaProps.groupId = groupId;
    }

    public static String getAutoOffsetReset() {
        return autoOffsetReset;
    }

    public static void setAutoOffsetReset(String autoOffsetReset) {
        KafkaProps.autoOffsetReset = autoOffsetReset;
    }
}
