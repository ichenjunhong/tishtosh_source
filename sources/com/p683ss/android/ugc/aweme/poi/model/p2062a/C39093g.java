package com.p683ss.android.ugc.aweme.poi.model.p2062a;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.a.g */
public final class C39093g implements Serializable {
    @C17952c(mo34828a = "code")

    /* renamed from: a */
    long f99715a;
    @C17952c(mo34828a = "name")

    /* renamed from: b */
    String f99716b;

    /* renamed from: c */
    boolean f99717c;

    /* renamed from: d */
    int f99718d;

    /* renamed from: e */
    boolean f99719e;

    public final long getCode() {
        return this.f99715a;
    }

    public final String getName() {
        return this.f99716b;
    }

    public final int getType() {
        return this.f99718d;
    }

    public final boolean isDefault() {
        return this.f99719e;
    }

    public final boolean isSelected() {
        return this.f99717c;
    }

    public final void setCode(long j) {
        this.f99715a = j;
    }

    public final C39093g setDefault(boolean z) {
        this.f99719e = z;
        return this;
    }

    public final void setName(String str) {
        this.f99716b = str;
    }

    public final void setSelected(boolean z) {
        this.f99717c = z;
    }

    public final void setType(int i) {
        this.f99718d = i;
    }
}
