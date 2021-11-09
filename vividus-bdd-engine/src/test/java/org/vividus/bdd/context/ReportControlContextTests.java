/*
 * Copyright 2019-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.vividus.bdd.context;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.vividus.testcontext.SimpleTestContext;

class ReportControlContextTests
{
    @Test
    void shouldEnableAndDisableReporting()
    {
        ReportControlContext context = new ReportControlContext(new SimpleTestContext());
        assertFalse(context.isReportingEnabled());
        context.enableReporting();
        assertTrue(context.isReportingEnabled());
        context.disableReporting();
        assertFalse(context.isReportingEnabled());
    }
}