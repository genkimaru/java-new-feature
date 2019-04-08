package jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Hello {
  public static void main(String args[]) {
    // Using interface as variable types
    List<String> rawMessage = Arrays.asList("one", "two", "three");
    List<String> allUpperCase = toCapitalCase(rawMessage);
    System.out.println(allUpperCase);
  }
  /**
   * Using Interface as type of argument and return type
   */
  private static List<String> toCapitalCase(List<String> messages) {
    return messages.stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
  }
}