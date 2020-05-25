package com.google.android.gms.internal.ads;

import java.util.Map;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.hy */
public final class C15956hy implements C15948hq<Object> {

    /* renamed from: a */
    private final C15957hz f45055a;

    public C15956hy(C15957hz hzVar) {
        this.f45055a = hzVar;
    }

    /* renamed from: a */
    public final void mo27606a(Object obj, Map<String, String> map) {
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            abv.m32793b("Fail to parse float", e);
        }
        this.f45055a.mo27665d(equals);
        this.f45055a.mo27663a(equals2, f);
    }
}
