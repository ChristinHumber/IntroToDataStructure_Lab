import java.util.HashSet;
import java.util.Set;

public class SetLab {

    public static void main(String[] args) {

        System.out.println("=== STUDENT EXAM RESULTS ANALYSIS ===");
        System.out.println("Learning HashSet operations through exam result analysis\n");

        System.out.println("1. Creating sets for students who passed each exam...");

        Set<String> mathPassers = new HashSet<>();
        Set<String> englishPassers = new HashSet<>();
        Set<String> sciencePassers = new HashSet<>();

        System.out.println("Three subject sets created!");

        System.out.println();

        System.out.println("2. Adding students...");

        mathPassers.add("Alice");
        mathPassers.add("Bob");
        mathPassers.add("Charlie");
        mathPassers.add("Diana");
        mathPassers.add("Eve");

        englishPassers.add("Alice");
        englishPassers.add("Bob");
        englishPassers.add("Frank");
        englishPassers.add("Grace");
        englishPassers.add("Diana");

        sciencePassers.add("Charlie");
        sciencePassers.add("Diana");
        sciencePassers.add("Eve");
        sciencePassers.add("Frank");
        sciencePassers.add("Henry");

        System.out.println("Math: " + mathPassers);
        System.out.println("English: " + englishPassers);
        System.out.println("Science: " + sciencePassers);

        System.out.println();

        boolean alicePassedMath = mathPassers.contains("Alice");
        boolean johnPassedEnglish = englishPassers.contains("John");

        System.out.println("Alice passed Math: " + alicePassedMath);
        System.out.println("John passed English: " + johnPassedEnglish);

        System.out.println();

        boolean addedAlice = mathPassers.add("Alice");
        boolean addedNewStudent = mathPassers.add("Zoe");

        System.out.println("Added Alice again: " + addedAlice);
        System.out.println("Added Zoe: " + addedNewStudent);

        System.out.println();

        Set<String> allThreePassers = new HashSet<>(mathPassers);
        allThreePassers.retainAll(englishPassers);
        allThreePassers.retainAll(sciencePassers);

        System.out.println("Passed all three: " + allThreePassers);

        Set<String> atLeastOnePassers = new HashSet<>(mathPassers);
        atLeastOnePassers.addAll(englishPassers);
        atLeastOnePassers.addAll(sciencePassers);

        System.out.println("Passed at least one: " + atLeastOnePassers);

        Set<String> onlyMath = new HashSet<>(mathPassers);
        onlyMath.removeAll(englishPassers);
        onlyMath.removeAll(sciencePassers);

        Set<String> onlyEnglish = new HashSet<>(englishPassers);
        onlyEnglish.removeAll(mathPassers);
        onlyEnglish.removeAll(sciencePassers);

        Set<String> onlyScience = new HashSet<>(sciencePassers);
        onlyScience.removeAll(mathPassers);
        onlyScience.removeAll(englishPassers);

        Set<String> exactlyTwoPassers = new HashSet<>(atLeastOnePassers);
        exactlyTwoPassers.removeAll(allThreePassers);
        exactlyTwoPassers.removeAll(onlyMath);
        exactlyTwoPassers.removeAll(onlyEnglish);
        exactlyTwoPassers.removeAll(onlyScience);

        System.out.println("Exactly two exams: " + exactlyTwoPassers);

        System.out.println();

        for (String student : atLeastOnePassers) {
            System.out.print(student + ": ");

            if (mathPassers.contains(student))
                System.out.print("Math ");

            if (englishPassers.contains(student))
                System.out.print("English ");

            if (sciencePassers.contains(student))
                System.out.print("Science ");

            System.out.println();
        }

        System.out.println();

        Set<String> testSet = new HashSet<>(mathPassers);

        System.out.println("Before removal: " + testSet);

        boolean removed = testSet.remove("Alice");
        boolean removedAgain = testSet.remove("Alice");

        System.out.println("Removed Alice: " + removed);
        System.out.println("Removed again: " + removedAgain);

        int exactlyOneCount =
                atLeastOnePassers.size()
                        - allThreePassers.size()
                        - exactlyTwoPassers.size();

        System.out.println();
        System.out.println("Exactly one exam: " + exactlyOneCount);

        System.out.println("\n=== LAB COMPLETE ===");
    }
}