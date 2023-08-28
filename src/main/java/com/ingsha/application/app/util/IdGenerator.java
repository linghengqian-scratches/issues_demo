package com.ingsha.application.app.util;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import lombok.Getter;
import org.apache.shardingsphere.sharding.spi.KeyGenerateAlgorithm;

import java.util.Properties;

@Getter
public final class IdGenerator implements KeyGenerateAlgorithm {

    private long datacenterId;

    private long workerId;

    private Snowflake snowflake;

    private Properties props;

    private final String[] chars = new String[]{"a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z"};

    @Override
    public void init(final Properties props) {
        this.props = props;
        this.snowflake = IdUtil.createSnowflake(workerId, datacenterId);
        this.datacenterId = Long.parseLong(props.getProperty("custom_datacenter_id"));
        this.workerId = Long.parseLong(props.getProperty("custom_worker_id"));
    }

    public long snowflakeId() {
        return snowflake.nextId();
    }

    @Override
    public Comparable<?> generateKey() {
        return snowflakeId();
    }

    @Override
    public String getType() {
        return "MyShardingKeyGenerator";
    }
}