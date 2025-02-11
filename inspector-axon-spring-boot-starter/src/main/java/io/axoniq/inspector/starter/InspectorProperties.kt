/*
 * Copyright (c) 2022-2023. Inspector Axon
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

package io.axoniq.inspector.starter

import org.springframework.boot.context.properties.ConfigurationProperties


@ConfigurationProperties("axon.inspector")
class InspectorProperties {
    var host: String = "connector.inspector.axoniq.io"
    var port: Int = 7000
    var secure: Boolean = true
    var credentials: String? = null
    var initialDelay: Long = 0
    var applicationName: String? = null
}
