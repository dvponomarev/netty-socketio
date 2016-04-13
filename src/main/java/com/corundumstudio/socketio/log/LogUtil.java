/**
 * Copyright 2012 Nikita Koksharov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.corundumstudio.socketio.log;

import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.HandshakeData;
import com.corundumstudio.socketio.transport.MainBaseClient;

public class LogUtil {

    public static String getValue(MainBaseClient client) {
        return getValue(client.getHandshakeData(), client.getHandshakeParamToLog());
    }

    public static String getValue(HandshakeData data, Configuration configuration) {
        return getValue(data, configuration.getHandshakeParamToLog());
    }

    private static String getValue(HandshakeData data, String param) {
        return data.getSingleUrlParam(param);
    }

}
