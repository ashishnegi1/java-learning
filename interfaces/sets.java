package interfaces;

import java.util.*;
import java.util.stream.*;

public class sets {
    public static void main(String[] args) {
        // int[] arr = {3, 4, 5, 2, 5, 5, 3, 8};
        Set<String> distinctWords = Arrays.asList(args).stream()
                                    .collect(Collectors.toSet());
        System.out.println(distinctWords.size() + " Distinct words : " + distinctWords);
    }
}
