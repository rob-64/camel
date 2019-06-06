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
 * Represents a nsq endpoint.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class NsqEndpoint {


    public static class NsqCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        NsqCommon(String path) {
            super("nsq", path);
        }
        /**
         * The hostnames of one or more nsqlookupd servers (consumer) or nsqd
         * servers (producer). The option is a java.lang.String type.
         */
        public T servers(String servers) {
            this.properties.put("servers", servers);
            return (T) this;
        }
        /**
         * The name of topic we want to use. The option is a java.lang.String
         * type.
         */
        public T topic(String topic) {
            this.properties.put("topic", topic);
            return (T) this;
        }
        /**
         * A String to identify the kind of client. The option is a
         * java.lang.String type.
         */
        public T userAgent(String userAgent) {
            this.properties.put("userAgent", userAgent);
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
         * Set secure option indicating TLS is required. The option is a boolean
         * type.
         */
        public T secure(boolean secure) {
            this.properties.put("secure", secure);
            return (T) this;
        }
        /**
         * To configure security using SSLContextParameters. The option is a
         * org.apache.camel.support.jsse.SSLContextParameters type.
         */
        public T sslContextParameters(Object sslContextParameters) {
            this.properties.put("sslContextParameters", sslContextParameters);
            return (T) this;
        }
    }

    public static class NsqConsumer
            extends
                NsqCommon<NsqConsumer>
            implements
                EndpointDefinition.Consumer {
        public NsqConsumer(String path) {
            super(path);
        }
        /**
         * Automatically finish the NSQ message when it is retrieved from the
         * quese and before the Exchange is processed. The option is a
         * java.lang.Boolean type.
         */
        public NsqConsumer autoFinish(Boolean autoFinish) {
            this.properties.put("autoFinish", autoFinish);
            return (NsqConsumer) this;
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
        public NsqConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (NsqConsumer) this;
        }
        /**
         * The name of channel we want to use. The option is a java.lang.String
         * type.
         */
        public NsqConsumer channel(String channel) {
            this.properties.put("channel", channel);
            return (NsqConsumer) this;
        }
        /**
         * The lookup retry interval. The option is a long type.
         */
        public NsqConsumer lookupInterval(long lookupInterval) {
            this.properties.put("lookupInterval", lookupInterval);
            return (NsqConsumer) this;
        }
        /**
         * The port of the nsqdlookupd server. The option is a int type.
         */
        public NsqConsumer lookupServerPort(int lookupServerPort) {
            this.properties.put("lookupServerPort", lookupServerPort);
            return (NsqConsumer) this;
        }
        /**
         * The NSQ message timeout for a consumer. The option is a long type.
         */
        public NsqConsumer messageTimeout(long messageTimeout) {
            this.properties.put("messageTimeout", messageTimeout);
            return (NsqConsumer) this;
        }
        /**
         * Consumer pool size. The option is a int type.
         */
        public NsqConsumer poolSize(int poolSize) {
            this.properties.put("poolSize", poolSize);
            return (NsqConsumer) this;
        }
        /**
         * The requeue interval. The option is a long type.
         */
        public NsqConsumer requeueInterval(long requeueInterval) {
            this.properties.put("requeueInterval", requeueInterval);
            return (NsqConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public NsqConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (NsqConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public NsqConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (NsqConsumer) this;
        }
    }

    public static class NsqProducer
            extends
                NsqCommon<NsqProducer>
            implements
                EndpointDefinition.Producer {
        public NsqProducer(String path) {
            super(path);
        }
        /**
         * The port of the nsqd server. The option is a int type.
         */
        public NsqProducer port(int port) {
            this.properties.put("port", port);
            return (NsqProducer) this;
        }
    }
}