package com.mark.ModernJavaInAction._02._01_CopingWithChangingRequirements;

import lombok.Getter;

public class Apple {
  public Apple() {
  }

  public Apple(Color color) {
    this.color = color;
  }

  public Apple(int weight) {
    this.weight = weight;
  }

  public Apple(Color color, int weight) {
    this.color = color;
    this.weight = weight;
  }


  @Getter
  public Color color;

  @Getter
  public Integer weight;
}
