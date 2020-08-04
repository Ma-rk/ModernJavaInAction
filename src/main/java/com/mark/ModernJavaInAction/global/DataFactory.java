package com.mark.ModernJavaInAction.global;

import com.mark.ModernJavaInAction._02._01_CopingWithChangingRequirements.Apple;
import com.mark.ModernJavaInAction._02._01_CopingWithChangingRequirements.Color;

import java.util.ArrayList;
import java.util.List;

public class DataFactory {
  public static List<Apple> getWeightAppleList() {
    return new ArrayList<>(
            List.of(
                    new Apple(150),
                    new Apple(140),
                    new Apple(160),
                    new Apple(130),
                    new Apple(170)
            )
    );
  }

  public static List<Apple> getColorAppleList() {
    return new ArrayList<>(
            List.of(
                    new Apple(Color.GREEN),
                    new Apple(Color.RED),
                    new Apple(Color.GREEN),
                    new Apple(Color.RED),
                    new Apple(Color.GREEN)
            )
    );
  }
}
