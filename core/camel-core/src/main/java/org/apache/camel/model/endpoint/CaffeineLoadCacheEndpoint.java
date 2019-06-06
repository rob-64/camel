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
 * The caffeine-loadcache component is used for integration with Caffeine Load
 * Cache.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class CaffeineLoadCacheEndpoint {


    public static class CaffeineLoadCacheCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        CaffeineLoadCacheCommon(String path) {
            super("caffeine-loadcache", path);
        }
        /**
         * the cache name. The option is a java.lang.String type.
         */
        public T cacheName(String cacheName) {
            this.properties.put("cacheName", cacheName);
            return (T) this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured. The option is a boolean type.
         */
        public T createCacheIfNotExist(boolean createCacheIfNotExist) {
            this.properties.put("createCacheIfNotExist", createCacheIfNotExist);
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
         * The cache key type, default java.lang.Object. The option is a
         * java.lang.String type.
         */
        public T keyType(Class<Object> keyType) {
            this.properties.put("keyType", keyType);
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
        /**
         * The cache value type, default java.lang.Object. The option is a
         * java.lang.String type.
         */
        public T valueType(Class<Object> valueType) {
            this.properties.put("valueType", valueType);
            return (T) this;
        }
    }

    public static class CaffeineLoadCacheConsumer
            extends
                CaffeineLoadCacheCommon<CaffeineLoadCacheConsumer>
            implements
                EndpointDefinition.Consumer {
        public CaffeineLoadCacheConsumer(String path) {
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
        public CaffeineLoadCacheConsumer bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (CaffeineLoadCacheConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public CaffeineLoadCacheConsumer exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (CaffeineLoadCacheConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public CaffeineLoadCacheConsumer exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (CaffeineLoadCacheConsumer) this;
        }
    }

    public static class CaffeineLoadCacheProducer
            extends
                CaffeineLoadCacheCommon<CaffeineLoadCacheProducer>
            implements
                EndpointDefinition.Producer {
        public CaffeineLoadCacheProducer(String path) {
            super(path);
        }
        /**
         * To configure the default cache action. If an action is set in the
         * message header, then the operation from the header takes precedence.
         * The option is a java.lang.String type.
         */
        public CaffeineLoadCacheProducer action(String action) {
            this.properties.put("action", action);
            return (CaffeineLoadCacheProducer) this;
        }
        /**
         * To configure an already instantiated cache to be used. The option is
         * a com.github.benmanes.caffeine.cache.Cache type.
         */
        public CaffeineLoadCacheProducer cache(Object cache) {
            this.properties.put("cache", cache);
            return (CaffeineLoadCacheProducer) this;
        }
        /**
         * To configure a CacheLoader in case of a LoadCache use. The option is
         * a com.github.benmanes.caffeine.cache.CacheLoader type.
         */
        public CaffeineLoadCacheProducer cacheLoader(Object cacheLoader) {
            this.properties.put("cacheLoader", cacheLoader);
            return (CaffeineLoadCacheProducer) this;
        }
        /**
         * Set the eviction Type for this cache. The option is a
         * org.apache.camel.component.caffeine.EvictionType type.
         */
        public CaffeineLoadCacheProducer evictionType(EvictionType evictionType) {
            this.properties.put("evictionType", evictionType);
            return (CaffeineLoadCacheProducer) this;
        }
        /**
         * Set the expire After Access Time in case of time based Eviction (in
         * seconds). The option is a int type.
         */
        public CaffeineLoadCacheProducer expireAfterAccessTime(
                int expireAfterAccessTime) {
            this.properties.put("expireAfterAccessTime", expireAfterAccessTime);
            return (CaffeineLoadCacheProducer) this;
        }
        /**
         * Set the expire After Access Write in case of time based Eviction (in
         * seconds). The option is a int type.
         */
        public CaffeineLoadCacheProducer expireAfterWriteTime(
                int expireAfterWriteTime) {
            this.properties.put("expireAfterWriteTime", expireAfterWriteTime);
            return (CaffeineLoadCacheProducer) this;
        }
        /**
         * Set the initial Capacity for the cache. The option is a int type.
         */
        public CaffeineLoadCacheProducer initialCapacity(int initialCapacity) {
            this.properties.put("initialCapacity", initialCapacity);
            return (CaffeineLoadCacheProducer) this;
        }
        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence. The option is
         * a java.lang.Object type.
         */
        public CaffeineLoadCacheProducer key(Object key) {
            this.properties.put("key", key);
            return (CaffeineLoadCacheProducer) this;
        }
        /**
         * Set the maximum size for the cache. The option is a int type.
         */
        public CaffeineLoadCacheProducer maximumSize(int maximumSize) {
            this.properties.put("maximumSize", maximumSize);
            return (CaffeineLoadCacheProducer) this;
        }
        /**
         * Set a specific removal Listener for the cache. The option is a
         * com.github.benmanes.caffeine.cache.RemovalListener type.
         */
        public CaffeineLoadCacheProducer removalListener(Object removalListener) {
            this.properties.put("removalListener", removalListener);
            return (CaffeineLoadCacheProducer) this;
        }
        /**
         * Set a specific Stats Counter for the cache stats. The option is a
         * com.github.benmanes.caffeine.cache.stats.StatsCounter type.
         */
        public CaffeineLoadCacheProducer statsCounter(Object statsCounter) {
            this.properties.put("statsCounter", statsCounter);
            return (CaffeineLoadCacheProducer) this;
        }
        /**
         * To enable stats on the cache. The option is a boolean type.
         */
        public CaffeineLoadCacheProducer statsEnabled(boolean statsEnabled) {
            this.properties.put("statsEnabled", statsEnabled);
            return (CaffeineLoadCacheProducer) this;
        }
    }

    public static enum EvictionType {
        SIZE_BASED, TIME_BASED;
    }
}