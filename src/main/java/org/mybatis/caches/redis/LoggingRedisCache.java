package org.mybatis.caches.redis;

import org.apache.ibatis.cache.decorators.LoggingCache;

/**
 * Created by anduo on 2015/3/15.
 */
public final class LoggingRedisCache extends LoggingCache {

    public LoggingRedisCache(String id) {
        super(new RedisCache(id));
    }

}
