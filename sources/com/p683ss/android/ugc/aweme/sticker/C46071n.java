package com.p683ss.android.ugc.aweme.sticker;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.sticker.n */
public final class C46071n implements Serializable {
    @C17952c(mo34828a = "prop_source")

    /* renamed from: a */
    private String f116247a;
    @C17952c(mo34828a = "grade_key")

    /* renamed from: b */
    private String f116248b;

    public C46071n() {
    }

    public final String getPropSource() {
        return C46072o.m100125a(this.f116247a);
    }

    public final String getGradeKey() {
        boolean z;
        CharSequence charSequence = this.f116248b;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        return this.f116248b;
    }

    public final void setGradeKey(String str) {
        this.f116248b = str;
    }

    public final void setPropSource(String str) {
        this.f116247a = str;
    }

    public C46071n(String str, String str2) {
        this();
        this.f116247a = str;
        this.f116248b = str2;
    }
}
