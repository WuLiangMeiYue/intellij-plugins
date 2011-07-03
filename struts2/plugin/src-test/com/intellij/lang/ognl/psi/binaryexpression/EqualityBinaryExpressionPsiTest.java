/*
 * Copyright 2011 The authors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intellij.lang.ognl.psi.binaryexpression;

import com.intellij.lang.ognl.psi.OgnlTokenTypes;

/**
 * @author Yann C&eacute;bron
 */
public class EqualityBinaryExpressionPsiTest extends BinaryExpressionPsiTestCase {

  public void testEqual() {
    assertConstantBinaryExpression("1 == 1", 1, OgnlTokenTypes.EQUAL, 1);
  }

  public void testEqualKeyword() {
    assertConstantBinaryExpression("1 eq 1", 1, OgnlTokenTypes.EQ_KEYWORD, 1);
  }

  public void testNotEqual() {
    assertConstantBinaryExpression("1 != 1", 1, OgnlTokenTypes.NOT_EQUAL, 1);
  }

  public void testNotEqualKeyword() {
    assertConstantBinaryExpression("1 neq 1", 1, OgnlTokenTypes.NEQ_KEYWORD, 1);
  }

}