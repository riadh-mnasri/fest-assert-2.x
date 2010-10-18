/*
 * Created on Oct 18, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.assertions.api;

import static junit.framework.Assert.assertSame;
import static org.mockito.Mockito.*;

import org.fest.assertions.internal.Comparables;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for <code>{@link IntegerAssert#isNotZero()}</code>.
 *
 * @author Alex Ruiz
 */
public class IntegerAssert_isNotZero_Test {

  private Comparables comparables;
  private IntegerAssert assertions;

  @Before public void setUp() {
    comparables = mock(Comparables.class);
    assertions = new IntegerAssert(6);
    assertions.comparables = comparables;
  }

  @Test public void should_verify_that_actual_is_not_equal_to_expected() {
    assertions.isNotZero();
    verify(comparables).assertNotEqual(assertions.info, assertions.actual, 0);
  }

  @Test public void should_return_this() {
    IntegerAssert returned = assertions.isNotZero();
    assertSame(assertions, returned);
  }
}
