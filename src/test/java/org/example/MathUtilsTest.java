package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Path;

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
        String expectedPath = "logs" + File.separator + "text.txt";
        assertEquals(expectedPath ,math.getFilePath());
    }
}
