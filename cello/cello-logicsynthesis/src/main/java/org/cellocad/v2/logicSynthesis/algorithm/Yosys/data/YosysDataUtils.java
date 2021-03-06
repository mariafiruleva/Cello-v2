/*
 * Copyright (C) 2020 Boston University (BU)
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

package org.cellocad.v2.logicSynthesis.algorithm.Yosys.data;

import org.cellocad.v2.common.target.data.TargetData;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Utility methods for the data in the <i>Yosys</i> algorithm.
 *
 * @author Timothy Jones
 * @date 2020-01-31
 */
public class YosysDataUtils {

  /**
   * Get the motif library from the target data.
   *
   * @param td The target data.
   * @return The motif library from the target data.
   */
  @SuppressWarnings("unchecked")
  public static JSONArray getMotifLibrary(final TargetData td) {
    final JSONArray rtn = new JSONArray();
    for (int i = 0; i < td.getNumJsonObject(YosysDataUtils.S_MOTIFLIBRARY); i++) {
      final JSONObject jObj = td.getJsonObjectAtIdx(YosysDataUtils.S_MOTIFLIBRARY, i);
      rtn.add(jObj);
    }
    return rtn;
  }

  private static String S_MOTIFLIBRARY = "motif_library";
}
