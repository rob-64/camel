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
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.EndpointDefinition;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The stream: component provides access to the system-in, system-out and
 * system-err streams as well as allowing streaming of file and URL.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class StreamEndpoint {


    public static class StreamCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        StreamCommon(String path) {
            super("stream", path);
        }
        /**
         * Kind of stream to use such as System.in or System.out. The option is
         * a java.lang.String type.
         */
        public T kind(String kind) {
            this.properties.put("kind", kind);
            return (T) this;
        }
        /**
         * You can configure the encoding (is a charset name) to use text-based
         * streams (for example, message body is a String object). If not
         * provided, Camel uses the JVM default Charset. The option is a
         * java.lang.String type.
         */
        public T encoding(String encoding) {
            this.properties.put("encoding", encoding);
            return (T) this;
        }
        /**
         * When using the stream:file URI format, this option specifies the
         * filename to stream to/from. The option is a java.lang.String type.
         */
        public T fileName(String fileName) {
            this.properties.put("fileName", fileName);
            return (T) this;
        }
        /**
         * When using the stream:url URI format, this option specifies the URL
         * to stream to/from. The input/output stream will be opened using the
         * JDK URLConnection facility. The option is a java.lang.String type.
         */
        public T url(String url) {
            this.properties.put("url", url);
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
         * Sets a specified timeout value, in milliseconds, to be used when
         * opening a communications link to the resource referenced by this
         * URLConnection. If the timeout expires before the connection can be
         * established, a java.net.SocketTimeoutException is raised. A timeout
         * of zero is interpreted as an infinite timeout. The option is a int
         * type.
         */
        public T connectTimeout(int connectTimeout) {
            this.properties.put("connectTimeout", connectTimeout);
            return (T) this;
        }
        /**
         * Optional http headers to use in request when using HTTP URL. The
         * option is a java.util.Map<java.lang.String,java.lang.Object> type.
         */
        public T httpHeaders(Map<String, Object> httpHeaders) {
            this.properties.put("httpHeaders", httpHeaders);
            return (T) this;
        }
        /**
         * Sets the read timeout to a specified timeout, in milliseconds. A
         * non-zero value specifies the timeout when reading from Input stream
         * when a connection is established to a resource. If the timeout
         * expires before there is data available for read, a
         * java.net.SocketTimeoutException is raised. A timeout of zero is
         * interpreted as an infinite timeout. The option is a int type.
         */
        public T readTimeout(int readTimeout) {
            this.properties.put("readTimeout", readTimeout);
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

    public static class StreamConsumer
            extends
                StreamCommon<StreamConsumer>
            implements
                EndpointDefinition.Consumer {
        public StreamConsumer(String path) {
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
        public StreamConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (StreamConsumer) this;
        }
        /**
         * To use JVM file watcher to listen for file change events to support
         * re-loading files that may be overwritten, somewhat like tail --retry.
         * The option is a boolean type.
         */
        public StreamConsumer fileWatcher(boolean fileWatcher) {
            this.properties.put("fileWatcher", fileWatcher);
            return (StreamConsumer) this;
        }
        /**
         * To group X number of lines in the consumer. For example to group 10
         * lines and therefore only spit out an Exchange with 10 lines, instead
         * of 1 Exchange per line. The option is a int type.
         */
        public StreamConsumer groupLines(int groupLines) {
            this.properties.put("groupLines", groupLines);
            return (StreamConsumer) this;
        }
        /**
         * Allows to use a custom GroupStrategy to control how to group lines.
         * The option is a org.apache.camel.component.stream.GroupStrategy type.
         */
        public StreamConsumer groupStrategy(Object groupStrategy) {
            this.properties.put("groupStrategy", groupStrategy);
            return (StreamConsumer) this;
        }
        /**
         * Initial delay in milliseconds before showing the message prompt. This
         * delay occurs only once. Can be used during system startup to avoid
         * message prompts being written while other logging is done to the
         * system out. The option is a long type.
         */
        public StreamConsumer initialPromptDelay(long initialPromptDelay) {
            this.properties.put("initialPromptDelay", initialPromptDelay);
            return (StreamConsumer) this;
        }
        /**
         * Optional delay in milliseconds before showing the message prompt. The
         * option is a long type.
         */
        public StreamConsumer promptDelay(long promptDelay) {
            this.properties.put("promptDelay", promptDelay);
            return (StreamConsumer) this;
        }
        /**
         * Message prompt to use when reading from stream:in; for example, you
         * could set this to Enter a command:. The option is a java.lang.String
         * type.
         */
        public StreamConsumer promptMessage(String promptMessage) {
            this.properties.put("promptMessage", promptMessage);
            return (StreamConsumer) this;
        }
        /**
         * Will retry opening the stream if it's overwritten, somewhat like tail
         * --retry If reading from files then you should also enable the
         * fileWatcher option, to make it work reliable. The option is a boolean
         * type.
         */
        public StreamConsumer retry(boolean retry) {
            this.properties.put("retry", retry);
            return (StreamConsumer) this;
        }
        /**
         * To be used for continuously reading a stream such as the unix tail
         * command. The option is a boolean type.
         */
        public StreamConsumer scanStream(boolean scanStream) {
            this.properties.put("scanStream", scanStream);
            return (StreamConsumer) this;
        }
        /**
         * Delay in milliseconds between read attempts when using scanStream.
         * The option is a long type.
         */
        public StreamConsumer scanStreamDelay(long scanStreamDelay) {
            this.properties.put("scanStreamDelay", scanStreamDelay);
            return (StreamConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public StreamConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (StreamConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public StreamConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (StreamConsumer) this;
        }
    }

    public static class StreamProducer
            extends
                StreamCommon<StreamProducer>
            implements
                EndpointDefinition.Producer {
        public StreamProducer(String path) {
            super(path);
        }
        /**
         * Number of messages to process before closing stream on Producer side.
         * Never close stream by default (only when Producer is stopped). If
         * more messages are sent, the stream is reopened for another
         * autoCloseCount batch. The option is a int type.
         */
        public StreamProducer autoCloseCount(int autoCloseCount) {
            this.properties.put("autoCloseCount", autoCloseCount);
            return (StreamProducer) this;
        }
        /**
         * This option is used in combination with Splitter and streaming to the
         * same file. The idea is to keep the stream open and only close when
         * the Splitter is done, to improve performance. Mind this requires that
         * you only stream to the same file, and not 2 or more files. The option
         * is a boolean type.
         */
        public StreamProducer closeOnDone(boolean closeOnDone) {
            this.properties.put("closeOnDone", closeOnDone);
            return (StreamProducer) this;
        }
        /**
         * Initial delay in milliseconds before producing the stream. The option
         * is a long type.
         */
        public StreamProducer delay(long delay) {
            this.properties.put("delay", delay);
            return (StreamProducer) this;
        }
    }
}