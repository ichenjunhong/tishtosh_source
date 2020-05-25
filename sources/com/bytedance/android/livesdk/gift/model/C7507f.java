package com.bytedance.android.livesdk.gift.model;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.gift.model.f */
public final class C7507f {
    @C17952c(mo34828a = "group_count")

    /* renamed from: a */
    public int f20571a;
    @C17952c(mo34828a = "group_text")

    /* renamed from: b */
    public String f20572b;

    /* renamed from: c */
    public boolean f20573c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7507f)) {
            return false;
        }
        C7507f fVar = (C7507f) obj;
        if (fVar.f20571a != this.f20571a || !TextUtils.equals(fVar.f20572b, this.f20572b)) {
            return false;
        }
        return true;
    }
}
