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

package org.cellocad.v2.placing.algorithm.data;

import org.cellocad.v2.common.algorithm.data.NetlistDataFactory;
import org.cellocad.v2.placing.algorithm.Eugene.data.EugeneNetlistData;
import org.cellocad.v2.placing.algorithm.GPCC_GRID.data.GpccGridNetlistData;

/**
 * The PLNetlistDataFactory class is a NetlistData factory for the <i>placing</i> stage.
 *
 * @author Vincent Mirian
 * @date 2018-05-21
 */
public class PLNetlistDataFactory extends NetlistDataFactory<PLNetlistData> {

  /**
   * Returns the {@link PLNetlistData} object that has the same name as the parameter {@code name}
   * within the {@link PLNetlistDataFactory}.
   *
   * @param name string used for searching this instance.
   * @return The {@link PLNetlistData} instance if the {@link PLNetlistData} type exists within the
   *     {@link PLNetlistDataFactory}, otherwise null.
   */
  @Override
  protected PLNetlistData getNetlistData(final String name) {
    PLNetlistData rtn = null;
    if (name.equals("Eugene")) {
      rtn = new EugeneNetlistData();
    }
    if (name.equals("GPCC_GRID")) {
      rtn = new GpccGridNetlistData();
    }
    return rtn;
  }
}
