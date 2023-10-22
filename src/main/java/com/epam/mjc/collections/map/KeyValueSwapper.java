package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();

        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            int keyToValue = entry.getKey();
            String valueToKey = entry.getValue();

            if (map.containsKey(valueToKey) && map.get(valueToKey) < keyToValue) {
                continue;
            }
            map.put(valueToKey, keyToValue);
        }

        return map;
    }
}
