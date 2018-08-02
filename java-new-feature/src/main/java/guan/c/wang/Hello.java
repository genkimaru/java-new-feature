package guan.c.wang;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Hello {
  public static void main(String args[]) {
    // Using interface as variable types
    List<String> rawMessage = Arrays.asList("one", "two", "three");
    List<String> allcaps = toCapitalCase(rawMessage);
    System.out.println(allcaps);
  }
  /**
   * Using Interface as type of argument and return type
   */
  public static List<String> toCapitalCase(List<String> messages) {
    return messages.stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
  }
}