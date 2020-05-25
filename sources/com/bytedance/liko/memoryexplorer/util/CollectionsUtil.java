package com.bytedance.liko.memoryexplorer.util;

import java.util.Collection;

public class CollectionsUtil {
    private CollectionsUtil() {
    }

    public static boolean isEmpty(Collection<?> collection) {
        if (collection == null || collection.size() == 0) {
            return true;
        }
        return false;
    }
}
