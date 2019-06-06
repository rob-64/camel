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

import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.model.EndpointDefinition;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.PollingConsumerPollStrategy;
import org.apache.camel.spi.ScheduledPollConsumerScheduler;

/**
 * The Twitter Streaming component consumes twitter statuses using Streaming
 * API.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class TwitterStreamingEndpoint {


    public static class TwitterStreamingCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        TwitterStreamingCommon(String path) {
            super("twitter-streaming", path);
        }
        /**
         * The streaming type to consume. The option is a
         * org.apache.camel.component.twitter.data.StreamingType type.
         */
        public T streamingType(StreamingType streamingType) {
            this.properties.put("streamingType", streamingType);
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
        /**
         * The http proxy host which can be used for the camel-twitter. Can also
         * be configured on the TwitterComponent level instead. The option is a
         * java.lang.String type.
         */
        public T httpProxyHost(String httpProxyHost) {
            this.properties.put("httpProxyHost", httpProxyHost);
            return (T) this;
        }
        /**
         * The http proxy password which can be used for the camel-twitter. Can
         * also be configured on the TwitterComponent level instead. The option
         * is a java.lang.String type.
         */
        public T httpProxyPassword(String httpProxyPassword) {
            this.properties.put("httpProxyPassword", httpProxyPassword);
            return (T) this;
        }
        /**
         * The http proxy port which can be used for the camel-twitter. Can also
         * be configured on the TwitterComponent level instead. The option is a
         * java.lang.Integer type.
         */
        public T httpProxyPort(Integer httpProxyPort) {
            this.properties.put("httpProxyPort", httpProxyPort);
            return (T) this;
        }
        /**
         * The http proxy user which can be used for the camel-twitter. Can also
         * be configured on the TwitterComponent level instead. The option is a
         * java.lang.String type.
         */
        public T httpProxyUser(String httpProxyUser) {
            this.properties.put("httpProxyUser", httpProxyUser);
            return (T) this;
        }
        /**
         * The access token. Can also be configured on the TwitterComponent
         * level instead. The option is a java.lang.String type.
         */
        public T accessToken(String accessToken) {
            this.properties.put("accessToken", accessToken);
            return (T) this;
        }
        /**
         * The access secret. Can also be configured on the TwitterComponent
         * level instead. The option is a java.lang.String type.
         */
        public T accessTokenSecret(String accessTokenSecret) {
            this.properties.put("accessTokenSecret", accessTokenSecret);
            return (T) this;
        }
        /**
         * The consumer key. Can also be configured on the TwitterComponent
         * level instead. The option is a java.lang.String type.
         */
        public T consumerKey(String consumerKey) {
            this.properties.put("consumerKey", consumerKey);
            return (T) this;
        }
        /**
         * The consumer secret. Can also be configured on the TwitterComponent
         * level instead. The option is a java.lang.String type.
         */
        public T consumerSecret(String consumerSecret) {
            this.properties.put("consumerSecret", consumerSecret);
            return (T) this;
        }
    }

    public static class TwitterStreamingConsumer
            extends
                TwitterStreamingCommon<TwitterStreamingConsumer>
            implements
                EndpointDefinition.Consumer {
        public TwitterStreamingConsumer(String path) {
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
        public TwitterStreamingConsumer bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option is a
         * boolean type.
         */
        public TwitterStreamingConsumer sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            this.properties.put("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * Endpoint type to use. Only streaming supports event type. The option
         * is a org.apache.camel.component.twitter.data.EndpointType type.
         */
        public TwitterStreamingConsumer type(EndpointType type) {
            this.properties.put("type", type);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * Used by the non-stream geography search, to search by radius using
         * the configured metrics. The unit can either be mi for miles, or km
         * for kilometers. You need to configure all the following options:
         * longitude, latitude, radius, and distanceMetric. The option is a
         * java.lang.String type.
         */
        public TwitterStreamingConsumer distanceMetric(String distanceMetric) {
            this.properties.put("distanceMetric", distanceMetric);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public TwitterStreamingConsumer exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public TwitterStreamingConsumer exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * Used for enabling full text from twitter (eg receive tweets that
         * contains more than 140 characters). The option is a boolean type.
         */
        public TwitterStreamingConsumer extendedMode(boolean extendedMode) {
            this.properties.put("extendedMode", extendedMode);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * Used by the non-stream geography search to search by latitude. You
         * need to configure all the following options: longitude, latitude,
         * radius, and distanceMetric. The option is a java.lang.Double type.
         */
        public TwitterStreamingConsumer latitude(Double latitude) {
            this.properties.put("latitude", latitude);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * Bounding boxes, created by pairs of lat/lons. Can be used for
         * streaming/filter. A pair is defined as lat,lon. And multiple paris
         * can be separated by semi colon. The option is a java.lang.String
         * type.
         */
        public TwitterStreamingConsumer locations(String locations) {
            this.properties.put("locations", locations);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * Used by the non-stream geography search to search by longitude. You
         * need to configure all the following options: longitude, latitude,
         * radius, and distanceMetric. The option is a java.lang.Double type.
         */
        public TwitterStreamingConsumer longitude(Double longitude) {
            this.properties.put("longitude", longitude);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option is a
         * org.apache.camel.spi.PollingConsumerPollStrategy type.
         */
        public TwitterStreamingConsumer pollStrategy(
                PollingConsumerPollStrategy pollStrategy) {
            this.properties.put("pollStrategy", pollStrategy);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * Used by the non-stream geography search to search by radius. You need
         * to configure all the following options: longitude, latitude, radius,
         * and distanceMetric. The option is a java.lang.Double type.
         */
        public TwitterStreamingConsumer radius(Double radius) {
            this.properties.put("radius", radius);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * To use a custom instance of TwitterStream. The option is a
         * twitter4j.TwitterStream type.
         */
        public TwitterStreamingConsumer twitterStream(Object twitterStream) {
            this.properties.put("twitterStream", twitterStream);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * Limiting number of results per page. The option is a
         * java.lang.Integer type.
         */
        public TwitterStreamingConsumer count(Integer count) {
            this.properties.put("count", count);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * Filter out old tweets, that has previously been polled. This state is
         * stored in memory only, and based on last tweet id. The option is a
         * boolean type.
         */
        public TwitterStreamingConsumer filterOld(boolean filterOld) {
            this.properties.put("filterOld", filterOld);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * Can be used for a streaming filter. Multiple values can be separated
         * with comma. The option is a java.lang.String type.
         */
        public TwitterStreamingConsumer keywords(String keywords) {
            this.properties.put("keywords", keywords);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * The lang string ISO_639-1 which will be used for searching. The
         * option is a java.lang.String type.
         */
        public TwitterStreamingConsumer lang(String lang) {
            this.properties.put("lang", lang);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * The number of pages result which you want camel-twitter to consume.
         * The option is a java.lang.Integer type.
         */
        public TwitterStreamingConsumer numberOfPages(Integer numberOfPages) {
            this.properties.put("numberOfPages", numberOfPages);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * The last tweet id which will be used for pulling the tweets. It is
         * useful when the camel route is restarted after a long running. The
         * option is a long type.
         */
        public TwitterStreamingConsumer sinceId(long sinceId) {
            this.properties.put("sinceId", sinceId);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * To filter by user ids for streaming/filter. Multiple values can be
         * separated by comma. The option is a java.lang.String type.
         */
        public TwitterStreamingConsumer userIds(String userIds) {
            this.properties.put("userIds", userIds);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * is a int type.
         */
        public TwitterStreamingConsumer backoffErrorThreshold(
                int backoffErrorThreshold) {
            this.properties.put("backoffErrorThreshold", backoffErrorThreshold);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option is a int type.
         */
        public TwitterStreamingConsumer backoffIdleThreshold(
                int backoffIdleThreshold) {
            this.properties.put("backoffIdleThreshold", backoffIdleThreshold);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option is a int type.
         */
        public TwitterStreamingConsumer backoffMultiplier(int backoffMultiplier) {
            this.properties.put("backoffMultiplier", backoffMultiplier);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * Milliseconds before the next poll. The option is a long type.
         */
        public TwitterStreamingConsumer delay(long delay) {
            this.properties.put("delay", delay);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option is a boolean type.
         */
        public TwitterStreamingConsumer greedy(boolean greedy) {
            this.properties.put("greedy", greedy);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a long type.
         */
        public TwitterStreamingConsumer initialDelay(long initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * is a org.apache.camel.LoggingLevel type.
         */
        public TwitterStreamingConsumer runLoggingLevel(
                LoggingLevel runLoggingLevel) {
            this.properties.put("runLoggingLevel", runLoggingLevel);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option is a java.util.concurrent.ScheduledExecutorService
         * type.
         */
        public TwitterStreamingConsumer scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            this.properties.put("scheduledExecutorService", scheduledExecutorService);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option is a
         * org.apache.camel.spi.ScheduledPollConsumerScheduler type.
         */
        public TwitterStreamingConsumer scheduler(
                ScheduledPollConsumerScheduler scheduler) {
            this.properties.put("scheduler", scheduler);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option is a
         * java.util.Map<java.lang.String,java.lang.Object> type.
         */
        public TwitterStreamingConsumer schedulerProperties(
                Map<String, Object> schedulerProperties) {
            this.properties.put("schedulerProperties", schedulerProperties);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * Whether the scheduler should be auto started. The option is a boolean
         * type.
         */
        public TwitterStreamingConsumer startScheduler(boolean startScheduler) {
            this.properties.put("startScheduler", startScheduler);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * Time unit for initialDelay and delay options. The option is a
         * java.util.concurrent.TimeUnit type.
         */
        public TwitterStreamingConsumer timeUnit(TimeUnit timeUnit) {
            this.properties.put("timeUnit", timeUnit);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option is a boolean
         * type.
         */
        public TwitterStreamingConsumer useFixedDelay(boolean useFixedDelay) {
            this.properties.put("useFixedDelay", useFixedDelay);
            return (TwitterStreamingConsumer) this;
        }
        /**
         * Sorts by id, so the oldest are first, and newest last. The option is
         * a boolean type.
         */
        public TwitterStreamingConsumer sortById(boolean sortById) {
            this.properties.put("sortById", sortById);
            return (TwitterStreamingConsumer) this;
        }
    }

    public static class TwitterStreamingProducer
            extends
                TwitterStreamingCommon<TwitterStreamingProducer>
            implements
                EndpointDefinition.Producer {
        public TwitterStreamingProducer(String path) {
            super(path);
        }
    }

    public static enum StreamingType {
        SAMPLE, FILTER, USER, UNKNOWN;
    }

    public static enum EndpointType {
        polling, direct, event;
    }
}