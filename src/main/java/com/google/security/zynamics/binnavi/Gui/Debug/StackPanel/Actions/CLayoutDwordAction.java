/*
Copyright 2015 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.security.zynamics.binnavi.Gui.Debug.StackPanel.Actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import com.google.security.zynamics.binnavi.Gui.Debug.StackPanel.CStackMemoryProvider;
import com.google.security.zynamics.binnavi.Gui.Debug.StackPanel.StackDataLayout;


/**
 * Action class for changing the display state of a stack view to Dwords.
 */
public final class CLayoutDwordAction extends AbstractAction {
  /**
   * Used for serialization.
   */
  private static final long serialVersionUID = 1816708905514089427L;

  /**
   * Provides information about the current state of the stack.
   */
  private final CStackMemoryProvider m_model;

  /**
   * Creates a new action object.
   *
   * @param model Provides information about the current state of the stack.
   */
  public CLayoutDwordAction(final CStackMemoryProvider model) {
    super("Dwords");

    m_model = model;
  }

  @Override
  public void actionPerformed(final ActionEvent event) {
    m_model.setDataLayout(StackDataLayout.Dwords);
  }
}
