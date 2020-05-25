package com.google.android.gms.common.api.internal;

import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.C15147b;
import com.google.android.gms.common.api.C15233f;
import com.google.android.gms.common.api.C15358j;
import com.google.android.gms.common.api.C15359k;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.ar */
final class C15261ar implements C15359k<Status> {

    /* renamed from: a */
    private final /* synthetic */ C15344m f39404a;

    /* renamed from: b */
    private final /* synthetic */ boolean f39405b;

    /* renamed from: c */
    private final /* synthetic */ C15233f f39406c;

    /* renamed from: d */
    private final /* synthetic */ C15256am f39407d;

    C15261ar(C15256am amVar, C15344m mVar, boolean z, C15233f fVar) {
        this.f39407d = amVar;
        this.f39404a = mVar;
        this.f39405b = z;
        this.f39406c = fVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo23334a(C15358j jVar) {
        Status status = (Status) jVar;
        C15147b a = C15147b.m31320a(this.f39407d.f39374b);
        String a2 = a.mo27952a("defaultGoogleSignInAccount");
        a.mo27955b("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(a2)) {
            a.mo27955b(C15147b.m31321a("googleSignInAccount", a2));
            a.mo27955b(C15147b.m31321a("googleSignInOptions", a2));
        }
        if (status.mo28060c() && this.f39407d.mo28114j()) {
            this.f39407d.mo28112h();
        }
        this.f39404a.mo28131a(status);
        if (this.f39405b) {
            this.f39406c.mo28111g();
        }
    }
}
