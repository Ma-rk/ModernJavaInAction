package com.mark.ModernJavaInAction._03_LambdaExpressions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _03_ExecuteAroundPattern {
  public String processFile() throws IOException {
    String fileName = "/Users/hakkyeol.kim/logs/sendBatch2.txt";
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
      return br.readLine();
    }
  }
}
