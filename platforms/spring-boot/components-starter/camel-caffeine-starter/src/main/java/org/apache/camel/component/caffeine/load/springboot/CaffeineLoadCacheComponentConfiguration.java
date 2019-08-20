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
package org.apache.camel.component.caffeine.load.springboot;

import javax.annotation.Generated;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.CacheLoader;
import com.github.benmanes.caffeine.cache.RemovalListener;
import com.github.benmanes.caffeine.cache.stats.StatsCounter;
import org.apache.camel.component.caffeine.EvictionType;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The caffeine-loadcache component is used for integration with Caffeine Load
 * Cache.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.caffeine-loadcache")
public class CaffeineLoadCacheComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the caffeine-loadcache component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Sets the global component configuration
     */
    private CaffeineConfigurationNestedConfiguration configuration;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;

    public CaffeineConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            CaffeineConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public static class CaffeineConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.caffeine.CaffeineConfiguration.class;
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         */
        private Boolean createCacheIfNotExist = true;
        /**
         * To configure the default cache action. If an action is set in the
         * message header, then the operation from the header takes precedence.
         */
        private String action;
        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence.
         */
        private Object key;
        /**
         * The cache key type, default "java.lang.Object"
         */
        private String keyType;
        /**
         * The cache value type, default "java.lang.Object"
         */
        private String valueType;
        /**
         * To configure an already instantiated cache to be used
         */
        private Cache cache;
        /**
         * To configure a CacheLoader in case of a LoadCache use
         */
        private CacheLoader cacheLoader;
        /**
         * To enable stats on the cache
         */
        private Boolean statsEnabled = false;
        /**
         * Set the initial Capacity for the cache
         */
        private Integer initialCapacity = 10000;
        /**
         * Set the maximum size for the cache
         */
        private Integer maximumSize = 10000;
        /**
         * Set the eviction Type for this cache
         */
        private EvictionType evictionType = EvictionType.SIZE_BASED;
        /**
         * Set the expire After Access Time in case of time based Eviction (in
         * seconds)
         */
        private Integer expireAfterAccessTime = 300;
        /**
         * Set the expire After Access Write in case of time based Eviction (in
         * seconds)
         */
        private Integer expireAfterWriteTime = 300;
        /**
         * Set a specific removal Listener for the cache
         */
        private RemovalListener removalListener;
        /**
         * Set a specific Stats Counter for the cache stats
         */
        private StatsCounter statsCounter;

        public Boolean getCreateCacheIfNotExist() {
            return createCacheIfNotExist;
        }

        public void setCreateCacheIfNotExist(Boolean createCacheIfNotExist) {
            this.createCacheIfNotExist = createCacheIfNotExist;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public Object getKey() {
            return key;
        }

        public void setKey(Object key) {
            this.key = key;
        }

        public String getKeyType() {
            return keyType;
        }

        public void setKeyType(String keyType) {
            this.keyType = keyType;
        }

        public String getValueType() {
            return valueType;
        }

        public void setValueType(String valueType) {
            this.valueType = valueType;
        }

        public Cache getCache() {
            return cache;
        }

        public void setCache(Cache cache) {
            this.cache = cache;
        }

        public CacheLoader getCacheLoader() {
            return cacheLoader;
        }

        public void setCacheLoader(CacheLoader cacheLoader) {
            this.cacheLoader = cacheLoader;
        }

        public Boolean getStatsEnabled() {
            return statsEnabled;
        }

        public void setStatsEnabled(Boolean statsEnabled) {
            this.statsEnabled = statsEnabled;
        }

        public Integer getInitialCapacity() {
            return initialCapacity;
        }

        public void setInitialCapacity(Integer initialCapacity) {
            this.initialCapacity = initialCapacity;
        }

        public Integer getMaximumSize() {
            return maximumSize;
        }

        public void setMaximumSize(Integer maximumSize) {
            this.maximumSize = maximumSize;
        }

        public EvictionType getEvictionType() {
            return evictionType;
        }

        public void setEvictionType(EvictionType evictionType) {
            this.evictionType = evictionType;
        }

        public Integer getExpireAfterAccessTime() {
            return expireAfterAccessTime;
        }

        public void setExpireAfterAccessTime(Integer expireAfterAccessTime) {
            this.expireAfterAccessTime = expireAfterAccessTime;
        }

        public Integer getExpireAfterWriteTime() {
            return expireAfterWriteTime;
        }

        public void setExpireAfterWriteTime(Integer expireAfterWriteTime) {
            this.expireAfterWriteTime = expireAfterWriteTime;
        }

        public RemovalListener getRemovalListener() {
            return removalListener;
        }

        public void setRemovalListener(RemovalListener removalListener) {
            this.removalListener = removalListener;
        }

        public StatsCounter getStatsCounter() {
            return statsCounter;
        }

        public void setStatsCounter(StatsCounter statsCounter) {
            this.statsCounter = statsCounter;
        }
    }
}