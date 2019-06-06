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
 * The Ignite ID Generator endpoint is one of camel-ignite endpoints which
 * allows you to interact with Ignite Atomic Sequences and ID Generators.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class IgniteIdGenEndpoint {


    public static class IgniteIdGenCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        IgniteIdGenCommon(String path) {
            super("ignite-idgen", path);
        }
        /**
         * The sequence name. The option is a java.lang.String type.
         */
        public T name(String name) {
            this.properties.put("name", name);
            return (T) this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void. The option is a boolean type.
         */
        public T propagateIncomingBodyIfNoReturnValue(
                boolean propagateIncomingBodyIfNoReturnValue) {
            this.properties.put("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return (T) this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc. The option is a boolean type.
         */
        public T treatCollectionsAsCacheObjects(
                boolean treatCollectionsAsCacheObjects) {
            this.properties.put("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
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

    public static class IgniteIdGenConsumer
            extends
                IgniteIdGenCommon<IgniteIdGenConsumer>
            implements
                EndpointDefinition.Consumer {
        public IgniteIdGenConsumer(String path) {
            super(path);
        }
    }

    public static class IgniteIdGenProducer
            extends
                IgniteIdGenCommon<IgniteIdGenProducer>
            implements
                EndpointDefinition.Producer {
        public IgniteIdGenProducer(String path) {
            super(path);
        }
        /**
         * The batch size. The option is a java.lang.Integer type.
         */
        public IgniteIdGenProducer batchSize(Integer batchSize) {
            this.properties.put("batchSize", batchSize);
            return (IgniteIdGenProducer) this;
        }
        /**
         * The initial value. The option is a java.lang.Long type.
         */
        public IgniteIdGenProducer initialValue(Long initialValue) {
            this.properties.put("initialValue", initialValue);
            return (IgniteIdGenProducer) this;
        }
        /**
         * The operation to invoke on the Ignite ID Generator. Superseded by the
         * IgniteConstants.IGNITE_IDGEN_OPERATION header in the IN message.
         * Possible values: ADD_AND_GET, GET, GET_AND_ADD, GET_AND_INCREMENT,
         * INCREMENT_AND_GET. The option is a
         * org.apache.camel.component.ignite.idgen.IgniteIdGenOperation type.
         */
        public IgniteIdGenProducer operation(IgniteIdGenOperation operation) {
            this.properties.put("operation", operation);
            return (IgniteIdGenProducer) this;
        }
    }

    public static enum IgniteIdGenOperation {
        ADD_AND_GET, GET, GET_AND_ADD, GET_AND_INCREMENT, INCREMENT_AND_GET;
    }
}