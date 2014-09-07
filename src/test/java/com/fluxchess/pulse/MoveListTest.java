/*
 * Copyright (C) 2013-2014 Phokham Nonava
 *
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */
package com.fluxchess.pulse;

import org.junit.Test;

import static com.fluxchess.pulse.MoveList.MoveEntry;
import static org.junit.Assert.assertEquals;

public class MoveListTest {

  @Test
  public void test() {
    MoveList<MoveEntry> moveList = new MoveList<>(MoveEntry.class);

    assertEquals(0, moveList.size);

    moveList.entries[moveList.size++].move = 1;
    assertEquals(1, moveList.size);
  }

}
