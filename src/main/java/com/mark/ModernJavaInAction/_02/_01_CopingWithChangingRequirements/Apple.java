package com.mark.ModernJavaInAction._02._01_CopingWithChangingRequirements;

import lombok.Getter;

public class Apple {
  public Apple(Color color) {
    this.color = color;
  }

  public Apple(int weight) {
    this.weight = weight;
  }

  @Getter
  public Color color;

  @Getter
  public Integer weight;
}
