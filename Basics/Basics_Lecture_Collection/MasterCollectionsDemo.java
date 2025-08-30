import java.util.*;
import java.util.concurrent.*;

import java.util.stream.Collectors;

public class MasterCollectionsDemo {

    // Simple POJO used for Comparable / Hashing examples
    static class Person implements Comparable<Person> {
        private final String name;
        private final int age;

        Person(String name, int age) {
            this.name = name;
            this.age  = age;
        }

        public String getName() { return name; }
        public int getAge() { return age; }

        @Override
        public String toString() { return name + "(" + age + ")"; }

        // Important for HashSet/HashMap keys
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person p = (Person) o;
            return age == p.age && Objects.equals(name, p.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        // Natural order: by age then name
        @Override
        public int compareTo(Person other) {
            int cmp = Integer.compare(this.age, other.age);
            if (cmp != 0) return cmp;
            return this.name.compareTo(other.name);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== ARRAYS & Conversions ===");
        Integer[] arr = {5, 3, 9, 1};
        List<Integer> listFromArray = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Array -> List: " + listFromArray);

        System.out.println("\n=== LISTS ===");
        List<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(4, 7, 1, 4, 9));
        System.out.println("ArrayList (with duplicates): " + arrayList);

        List<Integer> linkedList = new LinkedList<>(Arrays.asList(10, 20, 30));
        linkedList.addFirst(0); // LinkedList specific
        System.out.println("LinkedList: " + linkedList);

        // Iteration styles
        System.out.print("Iterating ArrayList (for-each): ");
        for (Integer i : arrayList) System.out.print(i + " ");
        System.out.println();

        System.out.print("Iterating LinkedList (iterator remove example): ");
        Iterator<Integer> it = linkedList.iterator();
        while (it.hasNext()) {
            Integer x = it.next();
            System.out.print(x + " ");
            if (x == 20) it.remove();
        }
        System.out.println("\nAfter iterator-remove: " + linkedList);

        // Sorting
        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList: " + arrayList);

        // Using Comparator
        List<Person> people = new ArrayList<>(Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 30),
            new Person("David", 22)
        ));
        System.out.println("\nPeople (unsorted): " + people);
        // Natural order (Comparable)
        Collections.sort(people);
        System.out.println("People sorted by natural order (age, then name): " + people);

        // Custom Comparator: by name desc
        people.sort(Comparator.comparing(Person::getName).reversed());
        System.out.println("People sorted by name desc: " + people);

        System.out.println("\n=== SETS ===");
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(3, 1, 4, 1, 5));
        System.out.println("HashSet (unique, no order guarantee): " + hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(3, 1, 4, 1, 5));
        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(3, 1, 4, 1, 5));
        System.out.println("TreeSet (sorted): " + treeSet);

        // Custom object in HashSet (equals/hashCode)
        Set<Person> personSet = new HashSet<>(people);
        personSet.add(new Person("Alice", 30)); // duplicate by equals -> won't be added
        System.out.println("Person HashSet (duplicates removed by equals/hashCode): " + personSet);

        System.out.println("\n=== MAPS ===");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 3);
        hashMap.put("banana", 2);
        hashMap.put("orange", 5);
        System.out.println("HashMap: " + hashMap);

        // iterate map entries
        System.out.println("Iterate map entries:");
        for (Map.Entry<String, Integer> e : hashMap.entrySet()) {
            System.out.println("  " + e.getKey() + " -> " + e.getValue());
        }

        // computeIfAbsent
        hashMap.computeIfAbsent("pear", k -> 7);
        System.out.println("After computeIfAbsent('pear'): " + hashMap);

        // merge
        hashMap.merge("apple", 2, Integer::sum); // apple = 3 + 2 = 5
        System.out.println("After merge('apple', 2): " + hashMap);

        // LinkedHashMap preserves insertion, TreeMap sorts keys
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("one",1); linkedMap.put("two",2);
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("LinkedHashMap: " + linkedMap);
        System.out.println("TreeMap (sorted keys): " + treeMap);

        System.out.println("\n=== QUEUE & DEQUE ===");
        Queue<Integer> priorityQueue = new PriorityQueue<>(Arrays.asList(5,2,8,1));
        System.out.println("PriorityQueue (poll gives smallest):");
        while (!priorityQueue.isEmpty()) System.out.print(priorityQueue.poll() + " ");
        System.out.println();

        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("front"); deque.addLast("back"); deque.addLast("tail");
        System.out.println("Deque after adds: " + deque);
        System.out.println("pollFirst(): " + deque.pollFirst());
        System.out.println("pollLast(): " + deque.pollLast());
        System.out.println("Deque now: " + deque);

        System.out.println("\n=== COLLECTIONS UTILS ===");
        List<Integer> utilList = new ArrayList<>(Arrays.asList(9, 2, 7, 3, 5));
        System.out.println("Original: " + utilList);
        Collections.shuffle(utilList);
        System.out.println("Shuffled: " + utilList);
        Collections.reverse(utilList);
        System.out.println("Reversed: " + utilList);
        Collections.sort(utilList);
        System.out.println("Sorted: " + utilList);
        int idx = Collections.binarySearch(utilList, 7);
        System.out.println("binarySearch for 7 -> index: " + idx);

        System.out.println("\n=== IMMUTABLE COLLECTIONS (Java 9+) ===");
        List<String> imm = List.of("x","y","z");
        System.out.println("Immutable list (List.of): " + imm);
        try {
            imm.add("oops"); // throws UnsupportedOperationException
        } catch (UnsupportedOperationException ex) {
            System.out.println("Attempting to modify immutable list throws: " + ex);
        }

        System.out.println("\n=== FAIL-FAST vs FAIL-SAFE ITERATORS ===");
        List<Integer> fastList = new ArrayList<>(Arrays.asList(1,2,3,4));
        try {
            for (Integer v : fastList) {
                if (v == 2) fastList.remove(v); // will throw ConcurrentModificationException
            }
        } catch (ConcurrentModificationException cme) {
            System.out.println("Caught ConcurrentModificationException (fail-fast): " + cme);
        }

        // Fail-safe example: CopyOnWriteArrayList (safe to modify while iterating)
        CopyOnWriteArrayList<Integer> cow = new CopyOnWriteArrayList<>(Arrays.asList(1,2,3,4));
        for (Integer v : cow) {
            if (v == 2) cow.remove(Integer.valueOf(2)); // safe
        }
        System.out.println("CopyOnWriteArrayList after safe remove during iteration: " + cow);

        System.out.println("\n=== SYNCHRONIZED WRAPPERS & CONCURRENT MAP ===");
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());
        syncList.addAll(Arrays.asList(10,20,30));
        System.out.println("Synchronized wrapper list: " + syncList);

        ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<>();
        chm.putIfAbsent("a", 1);
        chm.merge("a", 5, Integer::sum); // a -> 6
        System.out.println("ConcurrentHashMap operations: " + chm);

        System.out.println("\n=== STREAMS & COLLECTORS ===");
        List<String> words = Arrays.asList("apple","banana","avocado","blueberry","apricot");
        List<String> startsWithA = words.stream()
                .filter(w -> w.startsWith("a"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Words starting with 'a' (uppercased): " + startsWithA);

        // grouping and counting
        Map<Character, Long> grouped = words.stream()
                .collect(Collectors.groupingBy(w -> w.charAt(0), Collectors.counting()));
        System.out.println("Grouped by first char: " + grouped);

        System.out.println("\n=== CONVERSIONS BETWEEN COLLECTIONS ===");
        Set<String> setFromWords = new HashSet<>(words);
        List<String> listFromSet = new ArrayList<>(setFromWords);
        System.out.println("Set from words: " + setFromWords);
        System.out.println("Back to List: " + listFromSet);

        System.out.println("\n=== CUSTOM EXAMPLES: Map of lists (useful pattern) ===");
        Map<String, List<Person>> mapOfLists = new HashMap<>();
        for (Person p : people) {
            mapOfLists.computeIfAbsent(p.getName().substring(0,1), k -> new ArrayList<>()).add(p);
        }
        System.out.println("Map of lists grouped by first letter of name: " + mapOfLists);

        System.out.println("\n=== USEFUL TIPS ===");
        System.out.println("1) Prefer interfaces (List, Set, Map) in variable types.");
        System.out.println("2) Use ArrayList for random access; LinkedList for heavy insert/remove in middle.");
        System.out.println("3) Override equals/hashCode for objects used in HashSet/HashMap.");
        System.out.println("4) For thread-safety, prefer java.util.concurrent classes over synchronized wrappers if heavy concurrency.");
    }
}
