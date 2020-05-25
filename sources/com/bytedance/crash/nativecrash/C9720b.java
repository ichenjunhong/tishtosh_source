package com.bytedance.crash.nativecrash;

import com.bytedance.crash.C9577e;
import com.bytedance.crash.p555n.C9697i;
import com.bytedance.crash.p555n.C9705m;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

/* renamed from: com.bytedance.crash.nativecrash.b */
public final class C9720b {

    /* renamed from: a */
    public HashMap<String, String> f26449a;

    public C9720b(File file) {
        File b = C9705m.m19394b(file);
        if (b.exists() && b.length() != 0) {
            this.f26449a = new HashMap<>();
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(b));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            C9697i.m19370a((Closeable) bufferedReader2);
                            return;
                        } else if (readLine.length() > 25 && readLine.substring(25).startsWith("[FUNNEL]:")) {
                            String[] split = readLine.substring(34).split(" ");
                            if (split.length >= 2) {
                                this.f26449a.put(split[0], split[1]);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        C9697i.m19370a((Closeable) bufferedReader2);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                C9577e.m18999a().mo17384a("NPTH_CATCH", th);
                C9697i.m19370a((Closeable) bufferedReader);
            }
        }
    }
}
