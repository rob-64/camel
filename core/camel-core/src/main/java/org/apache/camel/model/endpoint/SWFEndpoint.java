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
 * The aws-swf component is used for managing workflows from Amazon Simple
 * Workflow.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class SWFEndpoint {


    public static class SWFCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        SWFCommon(String path) {
            super("aws-swf", path);
        }
        /**
         * Activity or workflow. The option is a java.lang.String type.
         */
        public T type(String type) {
            this.properties.put("type", type);
            return (T) this;
        }
        /**
         * To use the given AmazonSimpleWorkflowClient as client. The option is
         * a com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow type.
         */
        public T amazonSWClient(Object amazonSWClient) {
            this.properties.put("amazonSWClient", amazonSWClient);
            return (T) this;
        }
        /**
         * An instance of
         * com.amazonaws.services.simpleworkflow.flow.DataConverter to use for
         * serializing/deserializing the data. The option is a
         * com.amazonaws.services.simpleworkflow.flow.DataConverter type.
         */
        public T dataConverter(Object dataConverter) {
            this.properties.put("dataConverter", dataConverter);
            return (T) this;
        }
        /**
         * The workflow domain to use. The option is a java.lang.String type.
         */
        public T domainName(String domainName) {
            this.properties.put("domainName", domainName);
            return (T) this;
        }
        /**
         * The workflow or activity event name to use. The option is a
         * java.lang.String type.
         */
        public T eventName(String eventName) {
            this.properties.put("eventName", eventName);
            return (T) this;
        }
        /**
         * Amazon AWS Region. The option is a java.lang.String type.
         */
        public T region(String region) {
            this.properties.put("region", region);
            return (T) this;
        }
        /**
         * The workflow or activity event version to use. The option is a
         * java.lang.String type.
         */
        public T version(String version) {
            this.properties.put("version", version);
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
         * To configure the ClientConfiguration using the key/values from the
         * Map. The option is a java.util.Map<java.lang.String,java.lang.Object>
         * type.
         */
        public T clientConfigurationParameters(
                Map<String, Object> clientConfigurationParameters) {
            this.properties.put("clientConfigurationParameters", clientConfigurationParameters);
            return (T) this;
        }
        /**
         * To configure the StartWorkflowOptions using the key/values from the
         * Map. The option is a java.util.Map<java.lang.String,java.lang.Object>
         * type.
         */
        public T startWorkflowOptionsParameters(
                Map<String, Object> startWorkflowOptionsParameters) {
            this.properties.put("startWorkflowOptionsParameters", startWorkflowOptionsParameters);
            return (T) this;
        }
        /**
         * To configure the AmazonSimpleWorkflowClient using the key/values from
         * the Map. The option is a
         * java.util.Map<java.lang.String,java.lang.Object> type.
         */
        public T sWClientParameters(Map<String, Object> sWClientParameters) {
            this.properties.put("sWClientParameters", sWClientParameters);
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
         * Amazon AWS Access Key. The option is a java.lang.String type.
         */
        public T accessKey(String accessKey) {
            this.properties.put("accessKey", accessKey);
            return (T) this;
        }
        /**
         * Amazon AWS Secret Key. The option is a java.lang.String type.
         */
        public T secretKey(String secretKey) {
            this.properties.put("secretKey", secretKey);
            return (T) this;
        }
    }

    public static class SWFConsumer
            extends
                SWFCommon<SWFConsumer>
            implements
                EndpointDefinition.Consumer {
        public SWFConsumer(String path) {
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
        public SWFConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (SWFConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public SWFConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (SWFConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public SWFConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (SWFConsumer) this;
        }
        /**
         * The list name to consume activities from. The option is a
         * java.lang.String type.
         */
        public SWFConsumer activityList(String activityList) {
            this.properties.put("activityList", activityList);
            return (SWFConsumer) this;
        }
        /**
         * Maximum number of threads in work pool for activity. The option is a
         * int type.
         */
        public SWFConsumer activityThreadPoolSize(int activityThreadPoolSize) {
            this.properties.put("activityThreadPoolSize", activityThreadPoolSize);
            return (SWFConsumer) this;
        }
        /**
         * Activity execution options. The option is a
         * com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeExecutionOptions type.
         */
        public SWFConsumer activityTypeExecutionOptions(
                Object activityTypeExecutionOptions) {
            this.properties.put("activityTypeExecutionOptions", activityTypeExecutionOptions);
            return (SWFConsumer) this;
        }
        /**
         * Activity registration options. The option is a
         * com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeRegistrationOptions type.
         */
        public SWFConsumer activityTypeRegistrationOptions(
                Object activityTypeRegistrationOptions) {
            this.properties.put("activityTypeRegistrationOptions", activityTypeRegistrationOptions);
            return (SWFConsumer) this;
        }
        /**
         * The list name to consume workflows from. The option is a
         * java.lang.String type.
         */
        public SWFConsumer workflowList(String workflowList) {
            this.properties.put("workflowList", workflowList);
            return (SWFConsumer) this;
        }
        /**
         * Workflow registration options. The option is a
         * com.amazonaws.services.simpleworkflow.flow.WorkflowTypeRegistrationOptions type.
         */
        public SWFConsumer workflowTypeRegistrationOptions(
                Object workflowTypeRegistrationOptions) {
            this.properties.put("workflowTypeRegistrationOptions", workflowTypeRegistrationOptions);
            return (SWFConsumer) this;
        }
    }

    public static class SWFProducer
            extends
                SWFCommon<SWFProducer>
            implements
                EndpointDefinition.Producer {
        public SWFProducer(String path) {
            super(path);
        }
        /**
         * Activity scheduling options. The option is a
         * com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions
         * type.
         */
        public SWFProducer activitySchedulingOptions(
                Object activitySchedulingOptions) {
            this.properties.put("activitySchedulingOptions", activitySchedulingOptions);
            return (SWFProducer) this;
        }
        /**
         * The policy to use on child workflows when terminating a workflow. The
         * option is a java.lang.String type.
         */
        public SWFProducer childPolicy(String childPolicy) {
            this.properties.put("childPolicy", childPolicy);
            return (SWFProducer) this;
        }
        /**
         * Set the execution start to close timeout. The option is a
         * java.lang.String type.
         */
        public SWFProducer executionStartToCloseTimeout(
                String executionStartToCloseTimeout) {
            this.properties.put("executionStartToCloseTimeout", executionStartToCloseTimeout);
            return (SWFProducer) this;
        }
        /**
         * Workflow operation. The option is a java.lang.String type.
         */
        public SWFProducer operation(String operation) {
            this.properties.put("operation", operation);
            return (SWFProducer) this;
        }
        /**
         * The name of the signal to send to the workflow. The option is a
         * java.lang.String type.
         */
        public SWFProducer signalName(String signalName) {
            this.properties.put("signalName", signalName);
            return (SWFProducer) this;
        }
        /**
         * The type of the result when a workflow state is queried. The option
         * is a java.lang.String type.
         */
        public SWFProducer stateResultType(String stateResultType) {
            this.properties.put("stateResultType", stateResultType);
            return (SWFProducer) this;
        }
        /**
         * Set the task start to close timeout. The option is a java.lang.String
         * type.
         */
        public SWFProducer taskStartToCloseTimeout(
                String taskStartToCloseTimeout) {
            this.properties.put("taskStartToCloseTimeout", taskStartToCloseTimeout);
            return (SWFProducer) this;
        }
        /**
         * Details for terminating a workflow. The option is a java.lang.String
         * type.
         */
        public SWFProducer terminationDetails(String terminationDetails) {
            this.properties.put("terminationDetails", terminationDetails);
            return (SWFProducer) this;
        }
        /**
         * The reason for terminating a workflow. The option is a
         * java.lang.String type.
         */
        public SWFProducer terminationReason(String terminationReason) {
            this.properties.put("terminationReason", terminationReason);
            return (SWFProducer) this;
        }
    }
}