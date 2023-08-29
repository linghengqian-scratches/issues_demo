package com.ingsha.application.app.util;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import jakarta.annotation.PostConstruct;
import org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Properties;
import java.util.UUID;

/**
 * @author Yi
 * @ClassName IdGenerator
 * @Date 2022/5/30 11:06
 */


@Component
public class IdGenerator implements ShardingKeyGenerator {

    /**
     * 机房id  0-31
     */
    @Value("${machine.datacenter-id}")
    private long datacenterId;

    // 机器id 0-31
    @Value("${machine.worker-id}")
    private long workerId;

    private Snowflake snowflake;

    @PostConstruct
    public void init() {
        snowflake = IdUtil.createSnowflake(workerId, datacenterId);
    }

    /**
     * 生成
     */
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

    @Override
    public Properties getProperties() {
        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }

    public String[] chars = new String[]{"a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z"};


    public String generateShortUuid() {
        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            shortBuffer.append(chars[x % 0x3E]);
        }
        return shortBuffer.append(datacenterId).append(workerId).toString();

    }

}