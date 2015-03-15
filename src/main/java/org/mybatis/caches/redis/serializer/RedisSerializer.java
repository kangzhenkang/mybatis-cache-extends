package org.mybatis.caches.redis.serializer;

/**
 * Created by anduo on 2015/3/15.
 */
public interface RedisSerializer<T> {
    byte[] EMPTY_BYTES = new byte[0];

    /***
     * 序列化
     * @param obj
     * @return
     */
    byte[] serialize(T obj);

    /**
     * 反序列化
     * @param bytes
     * @return
     */
    T deserialize(byte[] bytes);
}
