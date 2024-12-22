package blind75.others.insertDeleteGetRandom;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author karamanmert
 * @date 21.12.2024
 */
class RandomizedSet {

    Set<Integer> ints = new HashSet<>();

    public RandomizedSet() {

    }

    public boolean insert(int val) {
        if (!ints.contains(val)) return ints.add(val);

        return false;
    }

    public boolean remove(int val) {
        if (ints.contains(val)) return ints.remove(val);

        return false;
    }

    public int getRandom() {
        int nextInt = new Random().nextInt(ints.size());

        return ints.stream()
                .skip(nextInt)
                .findFirst()
                .orElse(-1);
    }
}