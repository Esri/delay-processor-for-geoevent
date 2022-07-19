package com.esri.geoevent.processor.delay;

/* Copyright 2022 Esri
 *
 * Licensed under the Apache License Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public interface DelayProperties
{
  static final String STRINGS_PATH            = "${com.esri.geoevent.processor.delay-processor.";

  static final String DELAY_VALUE             = "delayValue";
  static final String DELAY_VALUE_UNITS       = "delayValueUnits";
  static final String DELAY_FIELD             = "delayField";
  static final String ENFORCE_DELAY_THRESHOLD = "enforceDelayThreshold";
  static final String ALLOW_DUPLICATES        = "allowDuplicates";
  static final String USE_LOCATION            = "useLocation";
  static final String USE_TRACK_ID            = "useTrackID";
  static final String CLEAR_CACHE             = "clearCache";
  static final String TIME_START              = "TIME_START";
  static final String TIME_END                = "TIME_END";
  static final String RECEIVED_TIME           = "RECEIVED_TIME";
}
