package com.bytedance.crash.p555n;

import android.os.Build.VERSION;
import android.os.Debug.MemoryInfo;

/* renamed from: com.bytedance.crash.n.c */
public final class C9687c {

    /* renamed from: a */
    static final C9689a f26417a;

    /* renamed from: com.bytedance.crash.n.c$a */
    static class C9689a {
        private C9689a() {
        }

        /* renamed from: a */
        public int mo17534a(MemoryInfo memoryInfo) {
            return -1;
        }

        /* renamed from: b */
        public int mo17535b(MemoryInfo memoryInfo) {
            return -1;
        }

        /* renamed from: c */
        public int mo17536c(MemoryInfo memoryInfo) {
            return -1;
        }
    }

    /* renamed from: com.bytedance.crash.n.c$b */
    static class C9690b extends C9689a {
        private C9690b() {
            super();
        }

        /* renamed from: a */
        public final int mo17534a(MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        /* renamed from: b */
        public final int mo17535b(MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        /* renamed from: c */
        public final int mo17536c(MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f26417a = new C9690b();
        } else {
            f26417a = new C9689a();
        }
    }

    /* renamed from: a */
    public static int m19323a(MemoryInfo memoryInfo) {
        return f26417a.mo17534a(memoryInfo);
    }

    /* renamed from: b */
    public static int m19324b(MemoryInfo memoryInfo) {
        return f26417a.mo17535b(memoryInfo);
    }

    /* renamed from: c */
    public static int m19325c(MemoryInfo memoryInfo) {
        return f26417a.mo17536c(memoryInfo);
    }
}
