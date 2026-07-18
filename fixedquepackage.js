java.util.LinkedList;
java.util.Queue;

 class QueueLab {
     static  main(String[] args) {
        System.out.println("=== CUSTOMER SERVICE QUEUE SYSTEM ===");

        Queue<String> customerQueue = new LinkedList<>();

        System.out.println("   Queue created successfully!");
        System.out.println("   Queue size: " + customerQueue.size());
        System.out.println("   Is queue empty: " + customerQueue.isEmpty());
        System.out.println();

        customerQueue.offer("Alice");
        customerQueue.offer("Bob");
        customerQueue.offer("Charlie");
        customerQueue.offer("Diana");
        customerQueue.offer("Eve");

        System.out.println("   Customers added to queue!");
        System.out.println("   Queue size: " + customerQueue.size());
        System.out.println("   Current queue: " + customerQueue);
        System.out.println();

        String nextCustomer = customerQueue.peek();

        System.out.println("   Next customer to be served: " + nextCustomer);
        System.out.println("   Queue after peek: " + customerQueue);
        System.out.println("   Queue size after peek: " + customerQueue.size());
        System.out.println();

        System.out.println("   Serving customer: " + customerQueue.poll());
        System.out.println("   Queue after serving the first customer: " + customerQueue);
        System.out.println("   Queue size after serving the first customer: " + customerQueue.size());

        System.out.println();
        System.out.println("   Serving another customer: " + customerQueue.poll());

        System.out.println();
        System.out.println("5. More customers arriving while others are being served...");
        customerQueue.offer("Frank");
        customerQueue.offer("Grace");

        System.out.println("   New customers added!");
        System.out.println("   Updated queue: " + customerQueue);
        System.out.println("   Queue size: " + customerQueue.size());
        System.out.println();

        System.out.println("6. Processing all remaining customers...");
        while (!customerQueue.isEmpty()) {
            System.out.println("   Serving: " + customerQueue.poll());
            System.out.println("   Remaining in queue: " + customerQueue.size());
        }

        System.out.println();
        System.out.println("7. Testing operations on empty queue...");
        System.out.println("   Queue after serving all customers: " + customerQueue);
        System.out.println("   Is queue empty: " + customerQueue.isEmpty());
        System.out.println("   Queue size: " + customerQueue.size());

        String emptyPeek = customerQueue.peek();
        String emptyPoll = customerQueue.poll();

        System.out.println("   Peek on empty queue: " + emptyPeek);
        System.out.println("   Poll on empty queue: " + emptyPoll);
        System.out.println();

        System.out.println("8. Demonstrating FIFO (First In, First Out) behavior...");
        customerQueue.offer("John");
        customerQueue.offer("Jane");
        customerQueue.offer("Jack");

        System.out.println("   Queue: " + customerQueue);
        System.out.println("   Serving in FIFO order:");
        System.out.println("   First out: " + customerQueue.poll());
        System.out.println("   Second out: " + customerQueue.poll());
        System.out.println("   Third out: " + customerQueue.poll());

        System.out.println();
        System.out.println("9. Customer service session summary:");
        System.out.println("   Final queue state: " + customerQueue);
        System.out.println("   Is queue empty: " + customerQueue.isEmpty());
        System.out.println("   Final queue size: " + customerQueue.size());

        System.out.println("\n=== LAB COMPLETE ===");
    }
