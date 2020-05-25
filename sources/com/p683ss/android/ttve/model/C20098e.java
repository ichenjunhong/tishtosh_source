package com.p683ss.android.ttve.model;

import java.util.Map;

/* renamed from: com.ss.android.ttve.model.e */
public final class C20098e {

    /* renamed from: a */
    public String f55263a;

    /* renamed from: b */
    public float f55264b;

    /* renamed from: c */
    public float f55265c;

    /* renamed from: d */
    public Map<Integer, Float> f55266d;

    public C20098e() {
        this("", 0.0f, 0.0f);
    }

    /* renamed from: a */
    public final void mo42261a(Map<Integer, Float> map) {
        if (this.f55266d == null) {
            this.f55266d = map;
        } else {
            this.f55266d.putAll(map);
        }
    }

    private C20098e(String str, float f, float f2) {
        this.f55263a = str;
        this.f55264b = 0.0f;
        this.f55265c = 0.0f;
    }
}
