import java.util.ArrayList;
import java.util.List;

/**
 * Data Structures Lab 1: List - To-Do List Manager
 * 
 * This lab demonstrates how ArrayList works through a simple to-do list application.
 * You'll learn about:
 * - Creating and initializing lists
 * - Adding elements (add, add at index)
 * - Accessing elements (get, indexOf)
 * - Removing elements (remove by index, remove by value)
 * - Checking list properties (size, isEmpty, contains)
 * - Iterating through lists
 * 
 * Instructions:
 * 1. Read each section carefully
 * 2. Uncomment the code blocks marked with TODO
 * 3. Fill in any missing variable names or method calls
 * 4. Run the program and observe the output
 */

public class ListLab {
    
    public static void main(String[] args) {
        System.out.println("=== TO-DO LIST MANAGER ===");
        
        // ========== SECTION 1: Creating and Initializing the List ==========
        System.out.println("1. Creating a new to-do list...");
        
        // create a list of String called todoList, using ArrayList as the implementation
        List<String> todoList = new ArrayList<>();
        
        System.out.println("   Empty list created successfully!");
        System.out.println("   List size: " + todoList.size());
        System.out.println("   Is empty: " + todoList.isEmpty());
        System.out.println();
        
        // ========== SECTION 2: Adding Tasks to the List ==========
        System.out.println("2. Adding tasks to our to-do list...");
        
        // add tasks to the list
        todoList.add("Buy groceries");
        todoList.add("Walk the dog");
        todoList.add("Study for exam");
        todoList.add("Call mom");
        
        System.out.println("   Tasks added successfully!");
        System.out.println("   List size: " + todoList.size());
        System.out.println("   Current tasks: " + todoList);
        System.out.println();
        
        // ========== SECTION 3: Accessing Specific Tasks ==========
        System.out.println("3. Accessing specific tasks...");
        
        // get the first task and the last task
        String firstTask = todoList.get(0);
        String lastTask = todoList.get(todoList.size() - 1);
        
        System.out.println("   First task: " + firstTask);
        System.out.println("   Last task: " + lastTask);
        System.out.println("   Task at index 2: " + todoList.get(2));
        System.out.println();
        
        // ========== SECTION 4: Inserting a Priority Task ==========
        System.out.println("4. Inserting a priority task at the beginning...");
        
        // insert a priority task at index 0
        todoList.add(0, "URGENT: Submit assignment");
        
        System.out.println("   Priority task inserted!");
        System.out.println("   Updated list: " + todoList);
        System.out.println("   New list size: " + todoList.size());
        System.out.println();
        
        // ========== SECTION 5: Searching for Tasks ==========
        System.out.println("5. Searching for specific tasks...");
        
        String searchTask = "Walk the dog";
        
        // check if the list contains the task
        boolean containsTask = todoList.contains(searchTask);
        
        // find the index of the task
        int taskIndex = todoList.indexOf(searchTask);
        
        System.out.println("   Does list contain '" + searchTask + "'? " + containsTask);
        System.out.println("   Index of '" + searchTask + "': " + taskIndex);
        System.out.println();
        
        // ========== SECTION 6: Completing Tasks (Removing) ==========
        System.out.println("6. Completing tasks (removing from list)...");
        
        System.out.println("   Before completing tasks: " + todoList);
        
        // remove by index (completing the first task)
        String completedTask = todoList.remove(0);
        
        // remove by value (completing "Walk the dog")
        boolean removed = todoList.remove("Walk the dog");
        
        // NOTE: remove(int index) returns a String while remove(String value) returns a boolean
        
        System.out.println("   Completed task: " + completedTask);
        System.out.println("   Successfully removed 'Walk the dog': " + removed);
        System.out.println("   After completing tasks: " + todoList);
        System.out.println("   Remaining tasks: " + todoList.size());
        System.out.println();
        
        // ========== SECTION 7: Iterating Through Remaining Tasks ==========
        System.out.println("7. Displaying all remaining tasks...");
        
        // for each loop to print all remaining tasks
        for (String task : todoList) {
            System.out.println("   - " + task);
        }
        
        System.out.println();
        
        // ========== SECTION 8: List Operations Summary ==========
        System.out.println("8. Final list summary:");
        System.out.println("   Total remaining tasks: " + todoList.size());
        System.out.println("   Is list empty: " + todoList.isEmpty());
        System.out.println("   Final list: " + todoList);
        
        System.out.println("\n=== LAB COMPLETE ===");

    }
}