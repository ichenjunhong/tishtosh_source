package com.google.android.gms.internal.ads;

import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.gx */
public final class C15928gx implements C15948hq<Object> {

    /* renamed from: a */
    private final C15929gy f45007a;

    public C15928gx(C15929gy gyVar) {
        this.f45007a = gyVar;
    }

    /* renamed from: a */
    public final void mo27606a(Object obj, Map<String, String> map) {
        String str = (String) map.get(LeakCanaryFileProvider.f132049i);
        if (str == null) {
            abv.m32798e("App event with no name parameter.");
        } else {
            this.f45007a.mo27473a(str, (String) map.get("info"));
        }
    }
}
