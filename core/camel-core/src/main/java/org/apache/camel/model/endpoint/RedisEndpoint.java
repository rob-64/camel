/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model.endpoint;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.EndpointDefinition;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The spring-redis component allows sending and receiving messages from Redis.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class RedisEndpoint {


    public static class RedisCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        RedisCommon(String path) {
            super("spring-redis", path);
        }
        /**
         * The host where Redis server is running. The option is a
         * java.lang.String type.
         */
        public T host(String host) {
            this.properties.put("host", host);
            return (T) this;
        }
        /**
         * Redis server port number. The option is a java.lang.Integer type.
         */
        public T port(Integer port) {
            this.properties.put("port", port);
            return (T) this;
        }
        /**
         * List of topic names or name patterns to subscribe to. Multiple names
         * can be separated by comma. The option is a java.lang.String type.
         */
        public T channels(String channels) {
            this.properties.put("channels", channels);
            return (T) this;
        }
        /**
         * Default command, which can be overridden by message header. Notice
         * the consumer only supports the following commands: PSUBSCRIBE and
         * SUBSCRIBE. The option is a org.apache.camel.component.redis.Command
         * type.
         */
        public T command(Command command) {
            this.properties.put("command", command);
            return (T) this;
        }
        /**
         * Reference to a pre-configured RedisConnectionFactory instance to use.
         * The option is a
         * org.springframework.data.redis.connection.RedisConnectionFactory
         * type.
         */
        public T connectionFactory(Object connectionFactory) {
            this.properties.put("connectionFactory", connectionFactory);
            return (T) this;
        }
        /**
         * Reference to a pre-configured RedisTemplate instance to use. The
         * option is a org.springframework.data.redis.core.RedisTemplate type.
         */
        public T redisTemplate(Object redisTemplate) {
            this.properties.put("redisTemplate", redisTemplate);
            return (T) this;
        }
        /**
         * Reference to a pre-configured RedisSerializer instance to use. The
         * option is a org.springframework.data.redis.serializer.RedisSerializer
         * type.
         */
        public T serializer(Object serializer) {
            this.properties.put("serializer", serializer);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        public T basicPropertyBinding(boolean basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        public T synchronous(boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
    }

    public static class RedisConsumer
            extends
                RedisCommon<RedisConsumer>
            implements
                EndpointDefinition.Consumer {
        public RedisConsumer(String path) {
            super(path);
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option is a boolean type.
         */
        public RedisConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (RedisConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public RedisConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (RedisConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public RedisConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (RedisConsumer) this;
        }
        /**
         * Reference to a pre-configured RedisMessageListenerContainer instance
         * to use. The option is a
         * org.springframework.data.redis.listener.RedisMessageListenerContainer
         * type.
         */
        public RedisConsumer listenerContainer(Object listenerContainer) {
            this.properties.put("listenerContainer", listenerContainer);
            return (RedisConsumer) this;
        }
    }

    public static class RedisProducer
            extends
                RedisCommon<RedisProducer>
            implements
                EndpointDefinition.Producer {
        public RedisProducer(String path) {
            super(path);
        }
    }

    public static enum Command {
        PING, SET, GET, QUIT, EXISTS, DEL, TYPE, FLUSHDB, KEYS, RANDOMKEY, RENAME, RENAMENX, RENAMEX, DBSIZE, EXPIRE, EXPIREAT, TTL, SELECT, MOVE, FLUSHALL, GETSET, MGET, SETNX, SETEX, MSET, MSETNX, DECRBY, DECR, INCRBY, INCR, APPEND, SUBSTR, HSET, HGET, HSETNX, HMSET, HMGET, HINCRBY, HEXISTS, HDEL, HLEN, HKEYS, HVALS, HGETALL, RPUSH, LPUSH, LLEN, LRANGE, LTRIM, LINDEX, LSET, LREM, LPOP, RPOP, RPOPLPUSH, SADD, SMEMBERS, SREM, SPOP, SMOVE, SCARD, SISMEMBER, SINTER, SINTERSTORE, SUNION, SUNIONSTORE, SDIFF, SDIFFSTORE, SRANDMEMBER, ZADD, ZRANGE, ZREM, ZINCRBY, ZRANK, ZREVRANK, ZREVRANGE, ZCARD, ZSCORE, MULTI, DISCARD, EXEC, WATCH, UNWATCH, SORT, BLPOP, BRPOP, AUTH, SUBSCRIBE, PUBLISH, UNSUBSCRIBE, PSUBSCRIBE, PUNSUBSCRIBE, ZCOUNT, ZRANGEBYSCORE, ZREVRANGEBYSCORE, ZREMRANGEBYRANK, ZREMRANGEBYSCORE, ZUNIONSTORE, ZINTERSTORE, SAVE, BGSAVE, BGREWRITEAOF, LASTSAVE, SHUTDOWN, INFO, MONITOR, SLAVEOF, CONFIG, STRLEN, SYNC, LPUSHX, PERSIST, RPUSHX, ECHO, LINSERT, DEBUG, BRPOPLPUSH, SETBIT, GETBIT, SETRANGE, GETRANGE, PEXPIRE, PEXPIREAT, GEOADD, GEODIST, GEOHASH, GEOPOS, GEORADIUS, GEORADIUSBYMEMBER;
    }
}