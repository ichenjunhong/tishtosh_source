package com.bytedance.android.livesdk;

import android.arch.lifecycle.C0198r;

/* renamed from: com.bytedance.android.livesdk.b */
public class C4642b {

    /* renamed from: b */
    private static volatile C4642b f12686b;

    /* renamed from: c */
    private static volatile int f12687c;

    /* renamed from: a */
    public C0198r<Boolean> f12688a = new C0198r<>();

    /* renamed from: b */
    public final void mo10428b() {
        f12687c++;
        this.f12688a.postValue(Boolean.valueOf(true));
    }

    /* renamed from: a */
    public static C4642b m11130a() {
        if (f12686b == null) {
            synchronized (C4642b.class) {
                if (f12686b == null) {
                    f12686b = new C4642b();
                }
            }
        }
        return f12686b;
    }

    /* renamed from: c */
    public final void mo10429c() {
        int i = f12687c - 1;
        f12687c = i;
        if (i < 0) {
            f12687c = 0;
        }
        if (f12687c == 0) {
            this.f12688a.postValue(Boolean.valueOf(false));
        }
    }
}
