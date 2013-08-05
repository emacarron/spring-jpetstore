/*
 *    Copyright 2010-2013 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package ik.am.jpetstore.domain.repository.sequence;

import ik.am.jpetstore.domain.model.Sequence;


/**
 * @author Eduardo Macarron
 *
 */
public interface SequenceRepository {

  Sequence getSequence(Sequence sequence);
  void updateSequence(Sequence sequence);
}
