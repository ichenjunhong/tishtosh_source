package com.p683ss.android.ugc.aweme.sharer;

import android.os.Bundle;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.e */
public abstract class C42317e {

    /* renamed from: a */
    private final Bundle f106875a = new Bundle();

    /* renamed from: a */
    public final C42317e mo86232a(String str, String str2) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(str2, "value");
        this.f106875a.putString(str, str2);
        return this;
    }

    /* renamed from: b */
    public final String mo86233b(String str, String str2) {
        C52711k.m112240b(str, "key");
        String string = this.f106875a.getString(str, str2);
        C52711k.m112236a((Object) string, "params.getString(key, default)");
        return string;
    }
}
