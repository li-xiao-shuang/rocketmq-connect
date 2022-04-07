/*
 * Copyright 2021 Gypsophila open source organization.
 *
 * Licensed under the Apache License,Version2.0(the"License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
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
import io.openmessaging.connector.api.component.task.Task;
import io.openmessaging.connector.api.component.task.source.SourceConnector;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lixiaoshuang
 */
public class MysqlSourceConnector extends SourceConnector {

    private KeyValue config;

    @Override public void pause() {

    }

    @Override public void resume() {

    }

    @Override public List<KeyValue> taskConfigs(int maxTasks) {
        List<KeyValue> configs = new ArrayList<>();
        configs.add(this.config);
        return configs;
    }

    @Override public Class<? extends Task> taskClass() {
        return null;
    }

    @Override public void validate(KeyValue config) {

    }

    @Override public void init(KeyValue config) {
        this.config = config;
    }

    @Override public void stop() {

    }
}
