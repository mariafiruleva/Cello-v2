/*
 * Copyright (C) 2017 Massachusetts Institute of Technology (MIT)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package org.cellocad.v2.common.stage.runtime.environment;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.cellocad.v2.common.runtime.environment.ArgString;
import org.cellocad.v2.common.runtime.environment.RuntimeEnv;

/**
 * The StageRuntimeEnv class is a class for managing and parsing common command line argument(s) for
 * a stage.
 *
 * @author Vincent Mirian
 * @date Nov 20, 2017
 */
public class StageRuntimeEnv extends RuntimeEnv {

  /**
   * Initializes a newly created {@link StageRuntimeEnv} with command line argument(s), <i>args</i>.
   *
   * @param args command line argument(s).
   */
  public StageRuntimeEnv(final String[] args) {
    super(args);
  }

  /** Setter for {@code options}. */
  @Override
  protected void setOptions() {
    super.setOptions();
    final Options options = getOptions();
    options.addOption(getAlgorithmNameOption());
    options.addOption(getStageNameOption());
  }

  /*
   * Options
   */
  /**
   * Getter for the ALGORITHMNAME Option. This option is required.
   *
   * @return The ALGORITHMNAME Option for this instance.
   */
  protected Option getAlgorithmNameOption() {
    final Option rtn =
        new Option(
            StageArgString.ALGORITHMNAME, true, StageArgDescription.ALGORITHMNAME_DESCRIPTION);
    makeRequired(rtn);
    return rtn;
  }

  /**
   * Getter for the STAGENAME Option. This option is required.
   *
   * @return The STAGENAME Option for this instance.
   */
  protected Option getStageNameOption() {
    final Option rtn =
        new Option(StageArgString.STAGENAME, true, StageArgDescription.STAGENAME_DESCRIPTION);
    return rtn;
  }

  /**
   * Getter for the INPUTNETLIST Option. This option is required.
   *
   * @return The INPUTNETLIST Option for this instance.
   */
  @Override
  protected Option getInputNetlistOption() {
    final Option rtn =
        new Option(ArgString.INPUTNETLIST, true, StageArgDescription.INPUTNETLIST_DESCRIPTION);
    makeRequired(rtn);
    return rtn;
  }

  /**
   * Getter for the OUTPUTNETLIST Option. This option is required.
   *
   * @return The OUTPUTNETLIST Option for this instance.
   */
  @Override
  protected Option getOutputNetlistOption() {
    final Option rtn =
        new Option(ArgString.OUTPUTNETLIST, true, StageArgDescription.OUTPUTNETLIST_DESCRIPTION);
    return rtn;
  }
}
