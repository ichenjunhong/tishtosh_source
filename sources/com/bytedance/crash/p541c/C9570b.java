package com.bytedance.crash.p541c;

import com.bytedance.crash.C9616k;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.crash.c.b */
public final class C9570b {

    /* renamed from: a */
    private static AtomicBoolean f26107a = new AtomicBoolean(false);

    /* renamed from: a */
    public static boolean m18982a() {
        synchronized (f26107a) {
            if (f26107a.get()) {
                return false;
            }
            f26107a.set(true);
            return m18983b();
        }
    }

    /* renamed from: b */
    public static boolean m18983b() {
        if (C9616k.m19156h().mo17477b() == null || !C9616k.m19156h().mo17477b().getLogTypeSwitch("npth_force_apm_crash")) {
            return false;
        }
        try {
            File file = new File(C9616k.m19155g().getFilesDir(), "crashCommand");
            file.mkdirs();
            StringBuilder sb = new StringBuilder("0_");
            sb.append(System.currentTimeMillis());
            new File(file, sb.toString()).createNewFile();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
