package org.mybatis.caches.redis.serializer;

/**
 * Created by anduo on 2015/3/15.
 */
public class SnappyRedisSerializer implements RedisSerializer {

    @Override
    public byte[] serialize(Object obj) {
        return new byte[0];
    }

    @Override
    public Object deserialize(byte[] bytes) {
        return null;
    }
}
