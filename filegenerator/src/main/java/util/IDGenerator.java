package util;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Nilesh Sahu on 10/28/2017.
 */
public class IDGenerator {

    private static volatile List<Long> GENERATED_IDS = new ArrayList<>();
    private static final long[] ID = new Random().longs(10000, 0, 10000).toArray();

    public static Long generateId() {
        int i = new Random().nextInt(10000);
        int index = i < 0 ? 10000 + i : i;
        long id = ID[index];
        synchronized(GENERATED_IDS) {
            GENERATED_IDS.add(id);
        }
        return id;
    }

    public static List<Long> getGeneratedIds() {
        return GENERATED_IDS;
    }

    public static Long generatedUniqueIdCount() {
        return GENERATED_IDS.stream().distinct().count();
    }

    public static Map getIdsCountMap() {
        return GENERATED_IDS.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
