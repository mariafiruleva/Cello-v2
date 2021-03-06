/*
 * Copyright (C) 2020 Boston University (BU)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.cellocad.v2.common.target.data.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * A tree of rules.
 *
 * @author Timothy Jones
 * @date 2020-06-15
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleTree {

  public RuleTree() {}

  /**
   * Initializes a newly created {@link RuleTree}.
   *
   * @param other The other rule tree.
   */
  public RuleTree(final RuleTree other) {
    this();
    RuleTreeNode root = other.getRoot();
    if (root instanceof TerminalRuleTreeNode) {
      TerminalRuleTreeNode terminal = (TerminalRuleTreeNode) root;
      this.root = new TerminalRuleTreeNode(terminal);
    } else if (root instanceof ParentRuleTreeNode) {
      ParentRuleTreeNode parent = (ParentRuleTreeNode) root;
      this.root = new ParentRuleTreeNode(parent);
    }
  }

  private RuleTreeNode root;

  /**
   * Getter for {@code root}.
   *
   * @return The value of {@code root}.
   */
  public RuleTreeNode getRoot() {
    return root;
  }

  /**
   * Setter for {@code root}.
   *
   * @param root The value to set {@code root}.
   */
  @JsonSetter("rules")
  public void setRoot(RuleTreeNode root) {
    this.root = root;
  }
}
