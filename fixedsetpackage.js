java

 class SetLab {
   static main(String[] args) {

    Set<String> mathPassers = new HashSet<>();
    Set<String> englishPassers = new HashSet<>();
    Set<String> sciencePassers = new HashSet<>();

    mathPassers.addAll(List.of("Alice","Bob","Charlie","Diana","Eve"));
    englishPassers.addAll(List.of("Alice","Bob","Frank","Grace","Diana"));
    sciencePassers.addAll(List.of("Charlie","Diana","Eve","Frank","Henry"));

    boolean alicePassedMath = mathPassers.contains("Alice");
    boolean johnPassedEnglish = englishPassers.contains("John");

    boolean addedAlice = mathPassers.add("Alice");
    boolean addedNewStudent = mathPassers.add("Zoe");

    Set<String> allThreePassers = new HashSet<>(mathPassers);
    allThreePassers.retainAll(englishPassers);
    allThreePassers.retainAll(sciencePassers);

    Set<String> atLeastOnePassers = new HashSet<>(mathPassers);
    atLeastOnePassers.addAll(englishPassers);
    atLeastOnePassers.addAll(sciencePassers);

    Set<String> exactlyTwoPassers = new HashSet<>(atLeastOnePassers);

    Set<String> onlyMath = new HashSet<>(mathPassers);
    onlyMath.removeAll(englishPassers);
    onlyMath.removeAll(sciencePassers);

    Set<String> onlyEnglish = new HashSet<>(englishPassers);
    onlyEnglish.removeAll(mathPassers);
    onlyEnglish.removeAll(sciencePassers);

    Set<String> onlyScience = new HashSet<>(sciencePassers);
    onlyScience.removeAll(mathPassers);
    onlyScience.removeAll(englishPassers);

    exactlyTwoPassers.removeAll(allThreePassers);
    exactlyTwoPassers.removeAll(onlyMath);
    exactlyTwoPassers.removeAll(onlyEnglish);
    exactlyTwoPassers.removeAll(onlyScience);

    for (String student : atLeastOnePassers) {
      System.out.print("   " + student + " passed: ");
      if (mathPassers.contains(student)) System.out.print("Math ");
      if (englishPassers.contains(student)) System.out.print("English ");
      if (sciencePassers.contains(student)) System.out.print("Science ");
      System.out.println();
    }

    Set<String> testSet = new HashSet<>(mathPassers);
    boolean removed = testSet.remove("Alice");
    boolean removedAgain = testSet.remove("Alice");

    int exactlyOneCount =
        atLeastOnePassers.size() - allThreePassers.size() - exactlyTwoPassers.size();
  }
}
