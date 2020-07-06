package com.mark.ModernJavaInAction._03_LambdaExpressions;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface _03_BufferedReaderProcessor {
  String process(BufferedReader br) throws IOException;
}
