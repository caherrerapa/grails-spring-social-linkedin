/* Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package grails.plugins.springsocial.config.linkedin

import javax.inject.Inject

import org.springframework.social.connect.Connection
import org.springframework.social.connect.ConnectionFactoryLocator
import org.springframework.social.connect.ConnectionRepository
import org.springframework.social.connect.support.ConnectionFactoryRegistry

import grails.plugins.springsocial.linkedin.SpringSocialLinkedInUtils
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Scope
import org.springframework.context.annotation.ScopedProxyMode
import org.springframework.social.linkedin.api.LinkedIn
import org.springframework.social.linkedin.api.impl.LinkedInTemplate
import org.springframework.social.linkedin.connect.LinkedInConnectionFactory

@Configuration
class LinkedInConfig {
    @Inject
    ConnectionFactoryLocator connectionFactoryLocator
    @Inject
    ConnectionRepository connectionRepository

    @Bean
    String fooLinkedIn() {
        println "Configuring SpringSocial LinkedIn"
        def linkedInConfig = SpringSocialLinkedInUtils.config.linkedin
        def clientId = linkedInConfig.clientId
        def clientSecret = linkedInConfig.clientSecret
        ((ConnectionFactoryRegistry) connectionFactoryLocator).addConnectionFactory(new LinkedInConnectionFactory(clientId, clientSecret))
        "fooLinkedIn"
    }

    @Bean
    @Scope(value = "request", proxyMode = ScopedProxyMode.INTERFACES)
    public LinkedIn linkedIn() {
        Connection<LinkedIn> linkedIn = connectionRepository.findPrimaryConnection(LinkedIn)
        linkedIn != null ? linkedIn.getApi() : new LinkedInTemplate()
    }
}
