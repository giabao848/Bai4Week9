package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    private MathUtils math;
    @BeforeEach
    void setUp() {
        math = new MathUtils();
    }
    @Test
    void testFilePath() {
        // Bài test này sẽ CHẠY ĐÚNG trên Windows nhưng LỖI trên Ubuntu/macOS
        assertEquals("logs\\test.txt", math.getFilePath());
    }
}
