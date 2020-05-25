package com.p683ss.android.ttve.common;

import android.os.Build;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ttve.common.a */
public final class C20071a {

    /* renamed from: a */
    public static Map<String, Integer> f55170a;

    static {
        HashMap hashMap = new HashMap();
        f55170a = hashMap;
        hashMap.put("sdm660", Integer.valueOf(120));
        f55170a.put("msm8994", Integer.valueOf(120));
        f55170a.put("sdm845", Integer.valueOf(240));
        f55170a.put("sm8150", Integer.valueOf(480));
    }

    /* renamed from: a */
    public static String m49580a() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            String str = "";
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                str = readLine;
            }
            if (str.contains("Hardware")) {
                return str.split(":\\s+", 2)[1];
            }
        } catch (FileNotFoundException | IOException unused) {
        }
        return Build.HARDWARE;
    }
}
