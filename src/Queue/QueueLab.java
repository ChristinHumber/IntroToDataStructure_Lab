import java.util.LinkedList;
import java.util.Queue;

/**
 * Data Structures Lab 2: Queue - Customer Service Queue System
 * 
 * This lab demonstrates how Queue works through a customer service simulation.
 * You'll learn about:
 * - Creating queues using LinkedList
 * - Adding elements to the queue (offer/add)
 * - Removing elements from the queue (poll/remove)
 * - Peeking at the front element (peek/element)
 * - Checking queue properties (size, isEmpty)
 * - FIFO (First In, First Out) behavior
 * 
 * Instructions:
 * 1. Read each section carefully
 * 2. Uncomment the code blocks marked with TODO
 * 3. Fill in any missing variable names or method calls
 * 4. Run the program and observe the FIFO behavior
 */

public class QueueLab {
    
    public static void main(String[] args) {
        System.out.println("=== CUSTOMER SERVICE QUEUE SYSTEM ===");
        System.out.println("Learning Queue operations through customer service simulation\n");
        
        // ========== SECTION 1: Creating the Queue ==========
        System.out.println("1. Setting up the customer service queue...");
        
        // create a Queue of String, using LinkedList as the implementation
        Queue<String> customerQueue = new LinkedList<>();
        
        System.out.println("   Queue created successfully!");
        System.out.println("   Queue size: " + customerQueue.size());
        System.out.println("   Is queue empty: " + customerQueue.isEmpty());
        System.out.println();
        
        // ========== SECTION 2: Customers Arriving (Adding to Queue) ==========
        System.out.println("2. Customers arriving at the service desk...");
        
        // add 5 customers to the queue
        customerQueue.offer("Alice");
        customerQueue.offer("Bob");
        customerQueue.offer("Charlie");
        customerQueue.offer("Diana");
        customerQueue.offer("Eve");
        
        System.out.println("   Customers added to queue!");
        System.out.println("   Queue size: " + customerQueue.size());
        System.out.println("   Current queue: " + customerQueue);
        System.out.println();
        
        // ========== SECTION 3: Checking Who's Next (Peek Operations) ==========
        System.out.println("3. Checking who's next in line...");
        
        // peek at the next customer without removing them
        String nextCustomer = customerQueue.peek();
        
        System.out.println("   Next customer to be served: " + nextCustomer);
        System.out.println("   Queue after peek: " + customerQueue); //showing that the queue didn't change
        System.out.println("   Queue size after peek: " + customerQueue.size());
        System.out.println("   (Notice: peek doesn't remove the element!)");
        System.out.println();
        
        // ========== SECTION 4: Serving Customers (Removing from Queue) ==========
        System.out.println("4. Serving customers one by one...");
        
        // serve the first customer using poll()
        System.out.println("   Serving customer: " + customerQueue.poll());
        
        // printing the queue state and size
        System.out.println("   Queue after serving the first customer: " + customerQueue);
        System.out.println("   Queue size after serving the first customer: " + customerQueue.size());

        
        System.out.println();
        
        // serve another customer using poll()
        System.out.println("   Serving customer: " + customerQueue.poll());
        System.out.println("   Queue after serving: " + customerQueue);
        
        System.out.println();
        
        // ========== SECTION 5: More Customers Arriving ==========
        System.out.println("5. More customers arriving while others are being served...");
        
        // add 2 more customers
        customerQueue.offer("Frank");
        customerQueue.offer("Grace");
        
        System.out.println("   New customers added!");
        System.out.println("   Updated queue: " + customerQueue);
        System.out.println("   Queue size: " + customerQueue.size());
        System.out.println();
        
        // ========== SECTION 6: Processing All Remaining Customers ==========
        System.out.println("6. Processing all remaining customers...");
        
        // process all remaining customers using a while loop
        while (!customerQueue.isEmpty()) {
            String served = customerQueue.poll();
            System.out.println("   Serving: " + served);
            System.out.println("   Remaining in queue: " + customerQueue.size());
        }
        
        System.out.println();
        
        // ========== SECTION 7: Queue Operations with Empty Queue ==========
        System.out.println("7. Testing operations on empty queue...");
        
        System.out.println("   Queue after serving all customers: " + customerQueue);
        System.out.println("   Is queue empty: " + customerQueue.isEmpty());
        System.out.println("   Queue size: " + customerQueue.size());
        
        // test empty queue behavior
        String emptyPeek = customerQueue.peek();
        String emptyPoll = customerQueue.poll();
        
        System.out.println("   Peek on empty queue: " + emptyPeek);
        System.out.println("   Poll on empty queue: " + emptyPoll);
        System.out.println("   (Notice: peek() and poll() return null for empty queue)");
        System.out.println();
        
        // ========== SECTION 8: Demonstrating FIFO Behavior ==========
        System.out.println("8. Demonstrating FIFO (First In, First Out) behavior...");
        
        System.out.println("   Adding customers in order: John, Jane, Jack");
        customerQueue.offer("John");
        customerQueue.offer("Jane");
        customerQueue.offer("Jack");
        
        System.out.println("   Queue: " + customerQueue);
        System.out.println("   Serving in FIFO order:");
        System.out.println("   First out: " + customerQueue.poll());
        System.out.println("   Second out: " + customerQueue.poll());
        System.out.println("   Third out: " + customerQueue.poll());
        
        System.out.println();
        
        // ========== SECTION 9: Summary ==========
        System.out.println("9. Customer service session summary:");
        System.out.println("   Final queue state: " + customerQueue);
        System.out.println("   Is queue empty: " + customerQueue.isEmpty());
        System.out.println("   Final queue size: " + customerQueue.size());
        
        System.out.println("\n=== LAB COMPLETE ===");
        
    }
}