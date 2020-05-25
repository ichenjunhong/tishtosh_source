package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.C15335g;

/* renamed from: com.google.android.gms.common.internal.w */
public final class C15473w extends C15445f {

    /* renamed from: a */
    private final /* synthetic */ Intent f39878a;

    /* renamed from: b */
    private final /* synthetic */ C15335g f39879b;

    /* renamed from: c */
    private final /* synthetic */ int f39880c;

    public C15473w(Intent intent, C15335g gVar, int i) {
        this.f39878a = intent;
        this.f39879b = gVar;
        this.f39880c = i;
    }

    /* renamed from: a */
    public final void mo28433a() {
        if (this.f39878a != null) {
            this.f39879b.startActivityForResult(this.f39878a, this.f39880c);
        }
    }
}
