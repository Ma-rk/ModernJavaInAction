package com.mark.ModernJavaInAction._02;

import lombok.Getter;

public class Apple {
  public Apple(Color color) {
    this.color = color;
  }

  @Getter
  public Color color;
}
