/*
 * Copyright 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package flash.geom;

import com.google.gwt.core.client.JavaScriptObject;

import flash.gwt.FlashImport;
import playn.flash.FlashImageLayer;

@FlashImport({"flash.geom.Rectangle"})
public class Point extends JavaScriptObject {
  protected Point() {}

  public static native Point create(int x, int y) /*-{
    return new flash.geom.Point(x, y);
  }-*/;
}
