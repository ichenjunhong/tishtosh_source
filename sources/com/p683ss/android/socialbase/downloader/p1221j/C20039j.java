package com.p683ss.android.socialbase.downloader.p1221j;

import android.os.Environment;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.j.j */
public final class C20039j {

    /* renamed from: a */
    private static Boolean f55022a;

    /* renamed from: a */
    public static synchronized boolean m49469a() {
        synchronized (C20039j.class) {
            if (f55022a != null) {
                boolean booleanValue = f55022a.booleanValue();
                return booleanValue;
            }
            try {
                String path = Environment.getExternalStorageDirectory().getPath();
                Process exec = Runtime.getRuntime().exec("mount");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                exec.waitFor();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        String[] split = readLine.split("\\s+");
                        if (split.length != 0) {
                            List<String> asList = Arrays.asList(split);
                            if (asList.contains("fuse")) {
                                for (String startsWith : asList) {
                                    if (path.startsWith(startsWith)) {
                                        Boolean bool = Boolean.TRUE;
                                        f55022a = bool;
                                        boolean booleanValue2 = bool.booleanValue();
                                        return booleanValue2;
                                    }
                                }
                                continue;
                            } else {
                                continue;
                            }
                        }
                    } else {
                        bufferedReader.close();
                        exec.destroy();
                        Boolean bool2 = Boolean.FALSE;
                        f55022a = bool2;
                        boolean booleanValue3 = bool2.booleanValue();
                        return booleanValue3;
                    }
                }
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
