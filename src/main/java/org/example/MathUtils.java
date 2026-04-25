package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.file.Path;

public class MathUtils {
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public int add(int a, int b) {
        logger.info("Đang thực hiện phép cộng: {} + {}", a, b);
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            logger.error("Lỗi: Chia cho số không!");
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    public String getFilePath() {
        // Cố tình dùng dấu gạch chéo ngược của Windows
        return "logs" + File.separator + "text.txt";
    }
}