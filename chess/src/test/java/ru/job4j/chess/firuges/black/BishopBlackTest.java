package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class BishopBlackTest {
    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        assertThat(bishopBlack.position(), is(Cell.A1));
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A2);
        assertThat(bishopBlack.copy(Cell.A2), is(Cell.A2));
    }
}