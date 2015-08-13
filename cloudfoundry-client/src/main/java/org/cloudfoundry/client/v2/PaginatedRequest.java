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

package org.cloudfoundry.client.v2;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Base class for requests that are paginated
 *
 * <p><b>This class is NOT threadsafe.</b>
 *
 * @param <T> the "self" type.  Used to ensure the appropriate type is returned from builder APIs.
 */
public abstract class PaginatedRequest<T extends PaginatedRequest<T>> {

    private volatile OrderDirection orderDirection;

    private volatile Integer page;

    private volatile Integer resultsPerPage;

    /**
     * Returns the order direction
     *
     * @return the order direction
     */
    @JsonProperty("order-direction")
    public final OrderDirection getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * Configure the order direction
     *
     * @param orderDirection the order direction
     * @return {@code this}
     */
    @SuppressWarnings("unchecked")
    public final T withOrderDirection(OrderDirection orderDirection) {
        this.orderDirection = orderDirection;
        return (T) this;
    }

    /**
     * Returns the page
     *
     * @return the page
     */
    @JsonProperty("page")
    public final Integer getPage() {
        return this.page;
    }

    /**
     * Configure the page
     *
     * @param page the page
     * @return {@code this}
     */
    @SuppressWarnings("unchecked")
    public final T withPage(Integer page) {
        this.page = page;
        return (T) this;
    }

    /**
     * Returns the results per page
     *
     * @return the results per page
     */
    @JsonProperty("results-per-page")
    public final Integer getResultsPerPage() {
        return this.resultsPerPage;
    }

    /**
     * Configure the results per page
     *
     * @param resultsPerPage the results per page
     * @return {@code this}
     */
    @SuppressWarnings("unchecked")
    public final T withResultsPerPage(Integer resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
        return (T) this;
    }

    /**
     * The order direction of the {@link PaginatedRequest}
     */
    public enum OrderDirection {

        /**
         * Indicates that order should be ascending
         */
        ASC,

        /**
         * Indicates that order should be descending
         */
        DESC;

        @Override
        public String toString() {
            return name().toLowerCase();
        }

    }
}