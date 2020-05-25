package com.bytedance.common.p520c;

import android.app.ActivityManager.MemoryInfo;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;

/* renamed from: com.bytedance.common.c.c */
public final class C9355c {

    /* renamed from: a */
    public static final C9357a f25596a;

    /* renamed from: com.bytedance.common.c.c$a */
    public static class C9357a {
        private C9357a() {
        }

        /* renamed from: a */
        public long mo16980a(MemoryInfo memoryInfo) {
            return 0;
        }

        /* renamed from: a */
        public void mo16981a(View view, Drawable drawable) {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: com.bytedance.common.c.c$b */
    static class C9358b extends C9357a {
        private C9358b() {
            super();
        }

        /* renamed from: a */
        public final long mo16980a(MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }

        /* renamed from: a */
        public final void mo16981a(View view, Drawable drawable) {
            try {
                view.setBackground(drawable);
            } catch (Throwable unused) {
                view.setBackgroundDrawable(drawable);
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            f25596a = new C9358b();
        } else {
            f25596a = new C9357a();
        }
    }

    /* renamed from: a */
    public static long m18536a(MemoryInfo memoryInfo) {
        return f25596a.mo16980a(memoryInfo);
    }
}
