package com.google.android.gms.internal.ads;

import java.util.Map;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.rg */
public final class C16208rg {

    /* renamed from: a */
    final ama f45483a;

    /* renamed from: b */
    final boolean f45484b;

    /* renamed from: c */
    final String f45485c;

    public C16208rg(ama ama, Map<String, String> map) {
        this.f45483a = ama;
        this.f45485c = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.f45484b = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        } else {
            this.f45484b = true;
        }
    }
}
