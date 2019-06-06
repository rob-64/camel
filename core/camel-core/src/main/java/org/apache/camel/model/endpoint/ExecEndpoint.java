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
 * The exec component can be used to execute OS system commands.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class ExecEndpoint {


    public static class ExecCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        ExecCommon(String path) {
            super("exec", path);
        }
        /**
         * Sets the executable to be executed. The executable must not be empty
         * or null. The option is a java.lang.String type.
         */
        public T executable(String executable) {
            this.properties.put("executable", executable);
            return (T) this;
        }
        /**
         * The arguments may be one or many whitespace-separated tokens. The
         * option is a java.lang.String type.
         */
        public T args(String args) {
            this.properties.put("args", args);
            return (T) this;
        }
        /**
         * A reference to a org.apache.commons.exec.ExecBinding in the Registry.
         * The option is a org.apache.camel.component.exec.ExecBinding type.
         */
        public T binding(Object binding) {
            this.properties.put("binding", binding);
            return (T) this;
        }
        /**
         * A reference to a org.apache.commons.exec.ExecCommandExecutor in the
         * Registry that customizes the command execution. The default command
         * executor utilizes the commons-exec library, which adds a shutdown
         * hook for every executed command. The option is a
         * org.apache.camel.component.exec.ExecCommandExecutor type.
         */
        public T commandExecutor(Object commandExecutor) {
            this.properties.put("commandExecutor", commandExecutor);
            return (T) this;
        }
        /**
         * The name of a file, created by the executable, that should be
         * considered as its output. If no outFile is set, the standard output
         * (stdout) of the executable will be used instead. The option is a
         * java.lang.String type.
         */
        public T outFile(String outFile) {
            this.properties.put("outFile", outFile);
            return (T) this;
        }
        /**
         * The timeout, in milliseconds, after which the executable should be
         * terminated. If execution has not completed within the timeout, the
         * component will send a termination request. The option is a long type.
         */
        public T timeout(long timeout) {
            this.properties.put("timeout", timeout);
            return (T) this;
        }
        /**
         * A boolean indicating that when stdout is empty, this component will
         * populate the Camel Message Body with stderr. This behavior is
         * disabled (false) by default. The option is a boolean type.
         */
        public T useStderrOnEmptyStdout(boolean useStderrOnEmptyStdout) {
            this.properties.put("useStderrOnEmptyStdout", useStderrOnEmptyStdout);
            return (T) this;
        }
        /**
         * The directory in which the command should be executed. If null, the
         * working directory of the current process will be used. The option is
         * a java.lang.String type.
         */
        public T workingDir(String workingDir) {
            this.properties.put("workingDir", workingDir);
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

    public static class ExecConsumer
            extends
                ExecCommon<ExecConsumer>
            implements
                EndpointDefinition.Consumer {
        public ExecConsumer(String path) {
            super(path);
        }
    }

    public static class ExecProducer
            extends
                ExecCommon<ExecProducer>
            implements
                EndpointDefinition.Producer {
        public ExecProducer(String path) {
            super(path);
        }
    }
}