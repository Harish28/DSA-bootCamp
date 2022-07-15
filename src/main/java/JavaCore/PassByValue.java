package JavaCore;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassByValue {
    @Test
    public void whenModifyingPrimitives_thenOriginalValuesNotModified() {

        int x = 1;
        int y = 2;

        // Before Modification
        assertEquals(x, 1);
        assertEquals(y, 2);

        modify(x, y);

        // After Modification
        assertEquals(x, 1);
        assertEquals(y, 2);
    }

    @Test
    public void whenModifyingNonPrimitives_thenOriginalValuesNotModified() {

        Foo f1 = new Foo(1);
        Foo f2 = new Foo(2);

        // Before Modification
        assertEquals(f1.num, 1);
        assertEquals(f2.num, 2);

        modify(f1, f2);

        // After Modification
        assertEquals(f1.num, 1);
        assertEquals(f2.num, 2);
    }

    public static void modify(int x1, int y1) {
        x1 = 5;
        y1 = 10;
    }

    public static void modify(Foo a1, Foo b1) {
        a1.num++;

        b1 = new Foo(1);
        b1.num++;
    }
}
class Foo {
    public int num;

    public Foo(int num) {
        this.num = num;
    }
}
