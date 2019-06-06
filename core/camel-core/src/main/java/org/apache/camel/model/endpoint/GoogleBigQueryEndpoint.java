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
 * Google BigQuery data warehouse for analytics.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class GoogleBigQueryEndpoint {


    public static class GoogleBigQueryCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        GoogleBigQueryCommon(String path) {
            super("google-bigquery", path);
        }
        /**
         * Google Cloud Project Id. The option is a java.lang.String type.
         */
        public T projectId(String projectId) {
            this.properties.put("projectId", projectId);
            return (T) this;
        }
        /**
         * BigQuery Dataset Id. The option is a java.lang.String type.
         */
        public T datasetId(String datasetId) {
            this.properties.put("datasetId", datasetId);
            return (T) this;
        }
        /**
         * BigQuery table id. The option is a java.lang.String type.
         */
        public T tableId(String tableId) {
            this.properties.put("tableId", tableId);
            return (T) this;
        }
        /**
         * ConnectionFactory to obtain connection to Bigquery Service. If non
         * provided the default will be used. The option is a
         * org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory type.
         */
        public T connectionFactory(Object connectionFactory) {
            this.properties.put("connectionFactory", connectionFactory);
            return (T) this;
        }
        /**
         * Field name to use as insert id. The option is a java.lang.String
         * type.
         */
        public T useAsInsertId(String useAsInsertId) {
            this.properties.put("useAsInsertId", useAsInsertId);
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

    public static class GoogleBigQueryConsumer
            extends
                GoogleBigQueryCommon<GoogleBigQueryConsumer>
            implements
                EndpointDefinition.Consumer {
        public GoogleBigQueryConsumer(String path) {
            super(path);
        }
    }

    public static class GoogleBigQueryProducer
            extends
                GoogleBigQueryCommon<GoogleBigQueryProducer>
            implements
                EndpointDefinition.Producer {
        public GoogleBigQueryProducer(String path) {
            super(path);
        }
    }
}