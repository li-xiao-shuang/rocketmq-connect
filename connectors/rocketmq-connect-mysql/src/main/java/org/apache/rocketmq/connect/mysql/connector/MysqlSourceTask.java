/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.rocketmq.connect.mysql.connector;

import io.openmessaging.KeyValue;
import io.openmessaging.connector.api.component.task.source.SourceTask;
import io.openmessaging.connector.api.data.ConnectRecord;
import java.util.List;
import org.apache.rocketmq.connect.mysql.Config;
import org.apache.rocketmq.connect.mysql.Replicator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MysqlSourceTask extends SourceTask {


    private static final Logger log = LoggerFactory.getLogger(MysqlSourceTask.class);

    private Replicator replicator;

    private Config config;


    @Override public List<ConnectRecord> poll() throws InterruptedException {

        return null;
    }

    @Override public void pause() {

    }

    @Override public void resume() {

    }

    @Override public void validate(KeyValue config) {

    }

    @Override public void init(KeyValue config) {

    }

    @Override public void stop() {

    }
}
