package com.mark.ModernJavaInAction._03_LambdaExpressions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _05_TypeCheckingTypeInferenceAndRestrictionsTest {
  @Test
  public void testSameLambdaDifferentFunctionalInterfaces() {
    new _05_TypeCheckingTypeInferenceAndRestrictions().sameLambdaDifferentFunctionalInterfaces();
  }

  @Test
  public void testTypeInference() {
    new _05_TypeCheckingTypeInferenceAndRestrictions().typeInference();
  }

  @Test
  public void testUsingLocalVariables() {
    new _05_TypeCheckingTypeInferenceAndRestrictions().usingLocalVariables();
  }
}

