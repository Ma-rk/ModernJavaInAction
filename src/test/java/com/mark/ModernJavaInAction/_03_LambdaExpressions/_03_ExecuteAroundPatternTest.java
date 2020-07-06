package com.mark.ModernJavaInAction._03_LambdaExpressions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class _03_ExecuteAroundPatternTest {
  _03_ExecuteAroundPattern executeAroundPattern;

  @BeforeEach
  public void init() {
    executeAroundPattern = new _03_ExecuteAroundPattern();
  }

  @Test
  public void testExecuteAroundPattern() throws IOException {
    String aaa = executeAroundPattern.processFile();
    System.out.println(aaa);
  }
}
