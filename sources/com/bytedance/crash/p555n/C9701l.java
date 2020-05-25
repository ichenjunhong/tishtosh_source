package com.bytedance.crash.p555n;

import android.app.ActivityManager.MemoryInfo;
import android.os.Build.VERSION;

/* renamed from: com.bytedance.crash.n.l */
public final class C9701l {

    /* renamed from: a */
    static final C9703a f26432a;

    /* renamed from: com.bytedance.crash.n.l$a */
    static class C9703a {
        private C9703a() {
        }

        /* renamed from: a */
        public long mo17539a(MemoryInfo memoryInfo) {
            return 0;
        }
    }

    /* renamed from: com.bytedance.crash.n.l$b */
    static class C9704b extends C9703a {
        private C9704b() {
            super();
        }

        /* renamed from: a */
        public final long mo17539a(MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            f26432a = new C9704b();
        } else {
            f26432a = new C9703a();
        }
    }

    /* renamed from: a */
    public static long m19387a(MemoryInfo memoryInfo) {
        return f26432a.mo17539a(memoryInfo);
    }
}
