/*
 * Copyright 2013-2015 the original author or authors.
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

package org.cloudfoundry.client.spring.v2;

import java.util.List;

/**
 * A builder for in filters
 */
public interface InFilterBuilder {

    /**
     * Add in filter
     *
     * @param in the in filter
     * @return {@code this}
     */
    InFilterBuilder in(String in);

    /**
     * Add in filters
     *
     * @param ins the ins filters
     * @return {@code this}
     */
    InFilterBuilder in(List<String> ins);

    /**
     * Builds a new instance of the filter
     *
     * @return a new instance of the filter
     */
    String build();

}