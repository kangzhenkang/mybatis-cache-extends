package org.mybatis.caches.redis.serializer;

import java.io.*;

/**
 * Created by anduo on 2015/3/15.
 */
public class BinaryRedisSerializer<T> implements RedisSerializer<T> {
    @Override
    public byte[] serialize(T obj) {
        if (obj == null) {
            return EMPTY_BYTES;
        }
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(obj);
            byte[] bytes = bos.toByteArray();
            return bytes;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) oos.close();
                if (bos != null) bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public T deserialize(byte[] bytes) {
        if (bytes == null) return null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            // 反序列化
            bis = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(bis);
            return (T) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) ois.close();
                if (bis != null) bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
