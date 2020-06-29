package com.mark.ModernJavaInAction._02;

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
  public int weight;
}
