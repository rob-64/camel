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
 * To send and receive messages to PubNub data stream network for connected
 * devices.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class PubNubEndpoint {


    public static class PubNubCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        PubNubCommon(String path) {
            super("pubnub", path);
        }
        /**
         * The channel used for subscribing/publishing events. The option is a
         * java.lang.String type.
         */
        public T channel(String channel) {
            this.properties.put("channel", channel);
            return (T) this;
        }
        /**
         * UUID to be used as a device identifier, a default UUID is generated
         * if not passed. The option is a java.lang.String type.
         */
        public T uuid(String uuid) {
            this.properties.put("uuid", uuid);
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
         * Reference to a Pubnub client in the registry. The option is a
         * com.pubnub.api.PubNub type.
         */
        public T pubnub(Object pubnub) {
            this.properties.put("pubnub", pubnub);
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
         * If Access Manager is utilized, client will use this authKey in all
         * restricted requests. The option is a java.lang.String type.
         */
        public T authKey(String authKey) {
            this.properties.put("authKey", authKey);
            return (T) this;
        }
        /**
         * If cipher is passed, all communicatons to/from PubNub will be
         * encrypted. The option is a java.lang.String type.
         */
        public T cipherKey(String cipherKey) {
            this.properties.put("cipherKey", cipherKey);
            return (T) this;
        }
        /**
         * The publish key obtained from your PubNub account. Required when
         * publishing messages. The option is a java.lang.String type.
         */
        public T publishKey(String publishKey) {
            this.properties.put("publishKey", publishKey);
            return (T) this;
        }
        /**
         * The secret key used for message signing. The option is a
         * java.lang.String type.
         */
        public T secretKey(String secretKey) {
            this.properties.put("secretKey", secretKey);
            return (T) this;
        }
        /**
         * Use SSL for secure transmission. The option is a boolean type.
         */
        public T secure(boolean secure) {
            this.properties.put("secure", secure);
            return (T) this;
        }
        /**
         * The subscribe key obtained from your PubNub account. Required when
         * subscribing to channels or listening for presence events. The option
         * is a java.lang.String type.
         */
        public T subscribeKey(String subscribeKey) {
            this.properties.put("subscribeKey", subscribeKey);
            return (T) this;
        }
    }

    public static class PubNubConsumer
            extends
                PubNubCommon<PubNubConsumer>
            implements
                EndpointDefinition.Consumer {
        public PubNubConsumer(String path) {
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
        public PubNubConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (PubNubConsumer) this;
        }
        /**
         * Also subscribe to related presence information. The option is a
         * boolean type.
         */
        public PubNubConsumer withPresence(boolean withPresence) {
            this.properties.put("withPresence", withPresence);
            return (PubNubConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public PubNubConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (PubNubConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public PubNubConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (PubNubConsumer) this;
        }
    }

    public static class PubNubProducer
            extends
                PubNubCommon<PubNubProducer>
            implements
                EndpointDefinition.Producer {
        public PubNubProducer(String path) {
            super(path);
        }
        /**
         * The operation to perform. PUBLISH: Default. Send a message to all
         * subscribers of a channel. FIRE: allows the client to send a message
         * to BLOCKS Event Handlers. These messages will go directly to any
         * Event Handlers registered on the channel. HERENOW: Obtain information
         * about the current state of a channel including a list of unique
         * user-ids currently subscribed to the channel and the total occupancy
         * count. WHERENOW: Obtain information about the current list of
         * channels to which a uuid is subscribed to. GETSTATE: Used to get
         * key/value pairs specific to a subscriber uuid. State information is
         * supplied as a JSON object of key/value pairs SETSTATE: Used to set
         * key/value pairs specific to a subscriber uuid GETHISTORY: Fetches
         * historical messages of a channel. The option is a java.lang.String
         * type.
         */
        public PubNubProducer operation(String operation) {
            this.properties.put("operation", operation);
            return (PubNubProducer) this;
        }
    }
}