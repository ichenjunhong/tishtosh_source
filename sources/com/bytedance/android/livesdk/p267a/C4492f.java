package com.bytedance.android.livesdk.p267a;

import android.text.TextUtils;

/* renamed from: com.bytedance.android.livesdk.a.f */
public final class C4492f {

    /* renamed from: a */
    public C4489d f12260a;

    /* renamed from: b */
    public C4493g f12261b;

    /* renamed from: c */
    public String f12262c;

    public C4492f(C4489d dVar) {
        this.f12260a = dVar;
        C4488c cVar = (C4488c) dVar.getClass().getAnnotation(C4488c.class);
        if (dVar != null) {
            this.f12262c = cVar.mo10289a();
            if (!TextUtils.isEmpty(this.f12262c)) {
                this.f12261b = cVar.mo10290b();
                return;
            }
            throw new IllegalArgumentException("action name can't be null");
        }
        throw new IllegalArgumentException("没有ActionMethod注解");
    }
}
