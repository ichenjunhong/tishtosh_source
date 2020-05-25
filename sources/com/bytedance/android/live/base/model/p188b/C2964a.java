package com.bytedance.android.live.base.model.p188b;

import java.io.Serializable;

/* renamed from: com.bytedance.android.live.base.model.b.a */
public final class C2964a implements Serializable {
    public String douPlusEntry;
    public boolean hasDouPlusEntry;

    public static C2964a defaultOne() {
        return new C2964a(false, "");
    }

    public C2964a(boolean z, String str) {
        this.hasDouPlusEntry = z;
        this.douPlusEntry = str;
    }
}
