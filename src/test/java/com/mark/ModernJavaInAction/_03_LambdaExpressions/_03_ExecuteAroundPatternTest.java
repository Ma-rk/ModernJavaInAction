package com.mark.ModernJavaInAction._03_LambdaExpressions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
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

  @Test
  public void testExecuteAroundPatternWithLamda() throws IOException {
    String oneLine = executeAroundPattern.processFileWithLamda((BufferedReader br) -> br.readLine());
    System.out.println(oneLine);
    String twoLine = executeAroundPattern.processFileWithLamda((BufferedReader br) -> br.readLine() + br.readLine());
    System.out.println(twoLine);
  }
}
