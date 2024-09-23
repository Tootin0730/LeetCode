import java.util.*;

public class RandomizedSet {
    private Map<Integer, Integer> map; // Maps value to its index in the list
    private List<Integer> list; // Stores the values for random access
    private Random random;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    /** Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise. */
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false; // Value already exists
        }
        map.put(val, list.size()); // Store the index of the value
        list.add(val); // Add the value to the list
        return true; // Value was inserted successfully
    }

    /** Removes an item val from the set if present. Returns true if the item was present, false otherwise. */
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false; // Value does not exist
        }
        // Get the index of the value to be removed
        int index = map.get(val);
        // Get the last element and move it to the index of the element to be removed
        int lastElement = list.get(list.size() - 1);
        list.set(index, lastElement);
        map.put(lastElement, index); // Update the index of the last element
        // Remove the last element from the list
        list.remove(list.size() - 1);
        map.remove(val); // Remove the value from the map
        return true; // Value was removed successfully
    }

    /** Get a random element from the current set of elements. */
    public int getRandom() {
        return list.get(random.nextInt(list.size())); // Return a random element from the list
    }
}
