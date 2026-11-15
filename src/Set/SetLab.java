import java.util.HashSet;


public class SetLab {
    
    public static void main(String[] args) {
        System.out.println("=== STUDENT EXAM RESULTS ANALYSIS ===");
        System.out.println("Learning HashSet operations through exam result analysis\n");
        
        // ========== SECTION 1: Creating Sets for Each Subject ==========
        System.out.println("1. Creating sets for students who passed each exam...");
        
        // creating three HashSet<String> variables:
        HashSet<String> mathPassers = new HashSet<>();
        HashSet<String> englishPassers = new HashSet<>();
        HashSet<String> sciencePassers = new HashSet<>();
        
        System.out.println("   Three subject sets created!");
        System.out.println("   Math passers size: " + mathPassers.size());
        System.out.println("   English passers size: " + englishPassers.size());
        System.out.println("   Science passers size: " + sciencePassers.size());
        System.out.println();
        
        // ========== SECTION 2: Adding Students to Each Set ==========
        System.out.println("2. Adding students who passed each exam...");
        
        // adding students to the math passers set
        mathPassers.add("Alice");
        mathPassers.add("Bob");
        mathPassers.add("Charlie");
        mathPassers.add("Diana");
        mathPassers.add("Eve");
        
        // adding students to the english passers set
        englishPassers.add("Alice");
        englishPassers.add("Bob");
        englishPassers.add("Frank");
        englishPassers.add("Grace");
        englishPassers.add("Diana");
        
        // adding students to sciencePassers using add() method
        sciencePassers.add("Charlie");
        sciencePassers.add("Diana");
        sciencePassers.add("Eve");
        sciencePassers.add("Frank");
        sciencePassers.add("Henry");
        
        System.out.println("   Students added to all sets!");
        System.out.println("   Math passers: " + mathPassers);
        System.out.println("   English passers: " + englishPassers);
        System.out.println("   Science passers: " + sciencePassers);
        System.out.println();
        
        // ========== SECTION 3: Testing Set Properties ==========
        System.out.println("3. Testing set properties and membership...");
        
        // testing set membership
        boolean alicePassedMath = mathPassers.contains("Alice");
        boolean johnPassedEnglish = englishPassers.contains("John");
        
        System.out.println("   Did Alice pass Math? " + alicePassedMath);
        System.out.println("   Did John pass English? " + johnPassedEnglish);
        System.out.println("   Math passers count: " + mathPassers.size());
        System.out.println("   English passers count: " + englishPassers.size());
        System.out.println("   Science passers count: " + sciencePassers.size());
        System.out.println();
        
        // ========== SECTION 4: Testing Duplicate Handling ==========
        System.out.println("4. Testing how sets handle duplicates...");
        
        System.out.println("   Before adding duplicate - Math passers: " + mathPassers);
        System.out.println("   Math passers size: " + mathPassers.size());
        
        // testing duplicate handling
        boolean addedAlice = mathPassers.add("Alice");
        boolean addedNewStudent = mathPassers.add("Zoe");
        
        System.out.println("   Adding Alice again returned: " + addedAlice);
        System.out.println("   Adding Zoe returned: " + addedNewStudent);
        System.out.println("   After adding - Math passers: " + mathPassers);
        System.out.println("   Math passers size: " + mathPassers.size());
        System.out.println();
        
        // ========== SECTION 5: Finding Students Who Passed All Three Exams ==========
        System.out.println("5. Finding students who passed ALL three exams (intersection)...");
        
        // finding intersection 
        HashSet<String> allThreePassers = new HashSet<>(mathPassers);
        allThreePassers.retainAll(englishPassers);
        allThreePassers.retainAll(sciencePassers);

        System.out.println("   Students who passed all three exams: " + allThreePassers);
        System.out.println("   Number of students who passed all three: " + allThreePassers.size());
        System.out.println();
        
        // ========== SECTION 6: Finding Students Who Passed At Least One Exam ==========
        System.out.println("6. Finding students who passed AT LEAST one exam (union)...");
        
        // finding union
        HashSet<String> atLeastOnePassers = new HashSet<>(mathPassers);
        atLeastOnePassers.addAll(englishPassers);
        atLeastOnePassers.addAll(sciencePassers);

        System.out.println("   Students who passed at least one exam: " + atLeastOnePassers);
        System.out.println("   Number of students who passed at least one: " + atLeastOnePassers.size());
        System.out.println();
        
     
        // ========== SECTION 7:  Set Operations for Exactly Two ==========
        System.out.println("7.  Finding students who passed exactly two exams...");
        
        // Only Math 
        HashSet<String> onlyMath = new HashSet<>(mathPassers);
        onlyMath.removeAll(englishPassers);
        onlyMath.removeAll(sciencePassers);
        
        // Only English 
        HashSet<String> onlyEnglish = new HashSet<>(englishPassers);
        onlyEnglish.removeAll(mathPassers);
        onlyEnglish.removeAll(sciencePassers);
        
        // Only Science
        HashSet<String> onlyScience = new HashSet<>(sciencePassers);
        onlyScience.removeAll(mathPassers);
        onlyScience.removeAll(englishPassers);
        
        //exactly 2 
        HashSet<String> exactlyTwoPassers = new HashSet<>(atLeastOnePassers);
        exactlyTwoPassers.removeAll(allThreePassers);
        exactlyTwoPassers.removeAll(onlyMath);
        exactlyTwoPassers.removeAll(onlyEnglish);
        exactlyTwoPassers.removeAll(onlyScience);


        System.out.println(" Student who passed exactly 2 exams result: " + exactlyTwoPassers);
        System.out.println();
        
        // ========== SECTION 9: Detailed Analysis by Student ==========
        System.out.println("9. Detailed analysis for each student...");
        
        System.out.println("   Individual student analysis:");
         // creating a for-each loop to analyze each student
        for (String student : atLeastOnePassers) {
            System.out.print("   " + student + " passed: ");
            if (mathPassers.contains(student)) System.out.print("Math ");
            if (englishPassers.contains(student)) System.out.print("English ");
            if (sciencePassers.contains(student)) System.out.print("Science ");
            System.out.println();
        }
        
        System.out.println();
        
        // ========== SECTION 10: Set Operations Summary ==========
        System.out.println("10. Summary of set operations performed...");
        
        System.out.println("   Math passers: " + mathPassers);
        System.out.println("   English passers: " + englishPassers);
        System.out.println("   Science passers: " + sciencePassers);
        System.out.println();
        
        System.out.println("   Intersection (all three): " + allThreePassers);
        System.out.println("   Union (at least one): " + atLeastOnePassers);
        System.out.println("   Exactly two passers: " + exactlyTwoPassers);
        System.out.println();
        
        // ========== SECTION 11: Removing Students (Demonstrating remove operations) ==========
        System.out.println("11. Demonstrating remove operations...");
        
        // testing remove operations
        HashSet<String> testSet = new HashSet<>(mathPassers);
        boolean removed = testSet.remove("Alice");
        boolean removedAgain = testSet.remove("Alice");
        
        System.out.println("   Test set before removal: " + testSet);
        System.out.println("   Removed Alice: " + removed);
        System.out.println("   Test set after removing Alice: " + testSet);
        System.out.println("   Tried to remove Alice again: " + removedAgain);
        System.out.println("   Test set unchanged: " + testSet);
        System.out.println();
        
        // ========== SECTION 12: Final Statistics ==========
        System.out.println("12. Final statistics...");
        
        // calculating students who passed exactly one exam
        int exactlyOneCount = atLeastOnePassers.size() - allThreePassers.size() - exactlyTwoPassers.size();
        
        System.out.println("   Total unique students: " + atLeastOnePassers.size());
        System.out.println("   Students who passed all three: " + allThreePassers.size());
        System.out.println("   Students who passed exactly two: " + exactlyTwoPassers.size());
        System.out.println("   Students who passed exactly one: " + exactlyOneCount);
        System.out.println();
        
        System.out.println("   Math pass rate: " + mathPassers.size() + "/" + atLeastOnePassers.size() + " students");
        System.out.println("   English pass rate: " + englishPassers.size() + "/" + atLeastOnePassers.size() + " students");
        System.out.println("   Science pass rate: " + sciencePassers.size() + "/" + atLeastOnePassers.size() + " students");
        
        System.out.println("\n=== LAB COMPLETE ===");
       
    }
}