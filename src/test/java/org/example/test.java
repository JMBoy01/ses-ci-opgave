package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class test {
    @Test
    public void tel2En3Op_Verwacht5(){
        Calculator cal = new Calculator();
        int result = cal.telOp(2, 3);
        Assertions.assertEquals(5, result);
    }
}
