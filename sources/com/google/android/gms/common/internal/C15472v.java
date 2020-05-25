package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.v */
public final class C15472v extends C15445f {

    /* renamed from: a */
    private final /* synthetic */ Intent f39875a;

    /* renamed from: b */
    private final /* synthetic */ Activity f39876b;

    /* renamed from: c */
    private final /* synthetic */ int f39877c;

    public C15472v(Intent intent, Activity activity, int i) {
        this.f39875a = intent;
        this.f39876b = activity;
        this.f39877c = i;
    }

    /* renamed from: a */
    public final void mo28433a() {
        if (this.f39875a != null) {
            this.f39876b.startActivityForResult(this.f39875a, this.f39877c);
        }
    }
}
