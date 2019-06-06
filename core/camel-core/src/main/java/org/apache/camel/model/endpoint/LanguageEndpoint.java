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
import org.apache.camel.model.EndpointDefinition;

/**
 * The language component allows you to send a message to an endpoint which
 * executes a script by any of the supported Languages in Camel.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class LanguageEndpoint {


    public static class LanguageCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        LanguageCommon(String path) {
            super("language", path);
        }
        /**
         * Sets the name of the language to use. The option is a
         * java.lang.String type.
         */
        public T languageName(String languageName) {
            this.properties.put("languageName", languageName);
            return (T) this;
        }
        /**
         * Path to the resource, or a reference to lookup a bean in the Registry
         * to use as the resource. The option is a java.lang.String type.
         */
        public T resourceUri(String resourceUri) {
            this.properties.put("resourceUri", resourceUri);
            return (T) this;
        }
        /**
         * Whether the script is binary content or text content. By default the
         * script is read as text content (eg java.lang.String). The option is a
         * boolean type.
         */
        public T binary(boolean binary) {
            this.properties.put("binary", binary);
            return (T) this;
        }
        /**
         * Whether to cache the compiled script and reuse Notice reusing the
         * script can cause side effects from processing one Camel
         * org.apache.camel.Exchange to the next org.apache.camel.Exchange. The
         * option is a boolean type.
         */
        public T cacheScript(boolean cacheScript) {
            this.properties.put("cacheScript", cacheScript);
            return (T) this;
        }
        /**
         * Sets whether to use resource content cache or not. The option is a
         * boolean type.
         */
        public T contentCache(boolean contentCache) {
            this.properties.put("contentCache", contentCache);
            return (T) this;
        }
        /**
         * Sets the script to execute. The option is a java.lang.String type.
         */
        public T script(String script) {
            this.properties.put("script", script);
            return (T) this;
        }
        /**
         * Whether or not the result of the script should be used as message
         * body. This options is default true. The option is a boolean type.
         */
        public T transform(boolean transform) {
            this.properties.put("transform", transform);
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

    public static class LanguageConsumer
            extends
                LanguageCommon<LanguageConsumer>
            implements
                EndpointDefinition.Consumer {
        public LanguageConsumer(String path) {
            super(path);
        }
    }

    public static class LanguageProducer
            extends
                LanguageCommon<LanguageProducer>
            implements
                EndpointDefinition.Producer {
        public LanguageProducer(String path) {
            super(path);
        }
    }
}