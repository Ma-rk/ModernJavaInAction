package com.mark.ModernJavaInAction._02;

import com.mark.ModernJavaInAction._02._01_CopingWithChangingRequirements.Apple;
import com.mark.ModernJavaInAction._02._01_CopingWithChangingRequirements.Color;
import com.mark.ModernJavaInAction._02._01_CopingWithChangingRequirements._1_FilterApple;
import com.mark.ModernJavaInAction._02._02_BehaviorParameterization.AppleGreenColorPredicate;
import com.mark.ModernJavaInAction._02._02_BehaviorParameterization.AppleHeavyWeightPredicate;
import com.mark.ModernJavaInAction._02._02_Quiz.PrettyPrintApple;
import com.mark.ModernJavaInAction._02._02_BehaviorParameterization._1_BehaviorParameterization;
import com.mark.ModernJavaInAction._02._02_Quiz.AppleFancyFormatter;
import com.mark.ModernJavaInAction._02._02_Quiz.AppleSimpleFormatter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _1_FilterAppleTest {
  private List<Apple> colorAppleList;
  private List<Apple> weightAppleList;

  @BeforeEach
  void init() {
    colorAppleList = new ArrayList<>();
    colorAppleList.add(new Apple(Color.GREEN));
    colorAppleList.add(new Apple(Color.RED));
    colorAppleList.add(new Apple(Color.GREEN));
    colorAppleList.add(new Apple(Color.RED));
    colorAppleList.add(new Apple(Color.GREEN));

    weightAppleList = new ArrayList<>();
    weightAppleList.add(new Apple(130));
    weightAppleList.add(new Apple(140));
    weightAppleList.add(new Apple(150));
    weightAppleList.add(new Apple(160));
    weightAppleList.add(new Apple(170));
  }

  @Test
  public void testFilterGreenApples() {
    List<Apple> filteredList = _1_FilterApple._1_filterGreenApples(this.colorAppleList);
    filteredList.forEach(apple -> assertEquals(apple.getColor(), Color.GREEN));
    assertEquals(3, filteredList.size());
  }

  @Test
  public void testFilterAppleByColor() {
    List<Apple> greenAppleList = _1_FilterApple._2_filterAppleByColor(this.colorAppleList, Color.GREEN);
    greenAppleList.forEach(apple -> assertEquals(apple.getColor(), Color.GREEN));
    assertEquals(3, greenAppleList.size());

    List<Apple> redAppleList = _1_FilterApple._2_filterAppleByColor(this.colorAppleList, Color.RED);
    redAppleList.forEach(apple -> assertEquals(apple.getColor(), Color.RED));
    assertEquals(2, redAppleList.size());
  }

  @Test
  public void testFilterAppleByWeight() {
    List<Apple> filteredList = _1_FilterApple._2_filterAppleByWeight(this.weightAppleList, 150);
    filteredList.forEach(apple -> assertTrue(150 < apple.getWeight()));
    assertEquals(2, filteredList.size());
  }

  @Test
  public void testFilterApplesByPredicate() {
    List<Apple> greenAppleList
            = _1_BehaviorParameterization.filterApples(this.colorAppleList, new AppleGreenColorPredicate());
    greenAppleList.forEach(apple -> assertEquals(apple.getColor(), Color.GREEN));
    assertEquals(3, greenAppleList.size());

    List<Apple> heavyAppleList
            = _1_BehaviorParameterization.filterApples(this.weightAppleList, new AppleHeavyWeightPredicate());
    heavyAppleList.forEach(apple -> assertTrue(150 < apple.getWeight()));
    assertEquals(2, heavyAppleList.size());
  }

  @Test
  public void testPrettyPrintApple(){
    PrettyPrintApple.prettyPrintApple(this.weightAppleList, new AppleSimpleFormatter());
    PrettyPrintApple.prettyPrintApple(this.colorAppleList, new AppleFancyFormatter());
  }

}
