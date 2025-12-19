package com.saurabh.learning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    void reverseStringTest() {
        StringUtil util = new StringUtil();
        assertEquals("ved", util.reverse("dev"));
    }
}
