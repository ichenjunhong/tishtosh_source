package com.p683ss.avframework.utils;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.avframework.utils.MiscUtils */
public class MiscUtils {
    private static AtomicInteger mUUIDSuffix = new AtomicInteger(0);

    public static String getUUID(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append("-");
        sb.append(mUUIDSuffix.incrementAndGet());
        String sb2 = sb.toString();
        if (str == null) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("-");
        sb3.append(sb2);
        return sb3.toString();
    }
}
