

Map<String, Integer> wordFrequency = new HashMap<>();

String[] words = text.toLowerCase().replaceAll("[^a-z0-9\\s]", " ").split(" ");

for (String word : words) {
  if (!word.isBlank())
    wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
}

Integer javaCount = wordFrequency.get("java");
Integer unknownCount = wordFrequency.get("unknown");
Integer programmingCount = wordFrequency.getOrDefault("programming", 0);

boolean hasJava = wordFrequency.containsKey("java");
boolean hasCount5 = wordFrequency.containsValue(5);
boolean hasCount2 = wordFrequency.containsValue(2);

wordFrequency.put("applications", 10); // (matches your existing print)

for (String word : wordFrequency.keySet())
  System.out.println("     '" + word + "' appears " + wordFrequency.get(word) + " times");

for (Map.Entry<String, Integer> entry : wordFrequency.entrySet())
  System.out.println("     '" + entry.getKey() + "' appears " + entry.getValue() + " times");

String mostFrequent = "";
String leastFrequent = "";
int maxCount = 0;
int minCount = Integer.MAX_VALUE;
for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
  if (entry.getValue() > maxCount) { maxCount = entry.getValue(); mostFrequent = entry.getKey(); }
  if (entry.getValue() < minCount) { minCount = entry.getValue(); leastFrequent = entry.getKey(); }
}