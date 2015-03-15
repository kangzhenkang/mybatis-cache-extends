package org.mybatis.caches.redis.serializer;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;

/**
 * Created by anduo on 2015/3/15.
 */
public class FstRedisSerializer<T> implements RedisSerializer<T> {

    private static Log logger = LogFactory.getLog(FstRedisSerializer.class);

    @Override
    public byte[] serialize(T obj) {
        return new byte[0];
    }

    @Override
    public T deserialize(byte[] bytes) {
        return null;
    }
}
