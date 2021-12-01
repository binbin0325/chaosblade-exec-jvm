/*
 * Copyright 1999-2019 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
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

package com.alibaba.chaosblade.exec.plugin.ddubbo;

import com.alibaba.chaosblade.exec.common.plugin.MethodConstant;

/**
 * @author Changjun Xiao
 */
public interface DDubboConstant {

    String TIMEOUT_KEY = "timeout";
    String TIMEOUT_EXCEPTION_MSG = "from chaosblade mock timeout";

    String VERSION_KEY = "version";
    String APP_KEY = "appname";
    String SERVICE_KEY = "service";
    String METHOD_KEY = MethodConstant.METHOD_MATCHER_NAME;
    String GROUP_KEY = "group";

    String TARGET_NAME = "ddubbo";

    String CONSUMER_KEY = "consumer";
    String PROVIDER_KEY = "provider";

    String CALL_POINT_KEY = "call-point";

    String TRACE_ID = "traceid";

    String HINT_CODE = "hintCode";

    String CHAOS_TRACE_UPLOAD = "http://10.96.76.117:8090/openapi/v1/traceId/upload?Token=4f597ea26176f81089f46a50a2ecdf9c";
}
