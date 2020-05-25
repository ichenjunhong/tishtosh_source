package com.google.android.play.core.p1053e;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.play.core.e.s */
final class C17354s implements C17353r {

    /* renamed from: a */
    final /* synthetic */ C17342g f48864a;

    /* renamed from: b */
    final /* synthetic */ Intent f48865b;

    /* renamed from: c */
    final /* synthetic */ Context f48866c;

    /* renamed from: d */
    final /* synthetic */ C17321ab f48867d;

    C17354s(C17321ab abVar, C17342g gVar, Intent intent, Context context) {
        this.f48867d = abVar;
        this.f48864a = gVar;
        this.f48865b = intent;
        this.f48866c = context;
    }

    /* renamed from: a */
    public final void mo33626a() {
        this.f48867d.m42406a(this.f48864a, 5, 0);
    }

    /* renamed from: a */
    public final void mo33627a(int i) {
        this.f48867d.m42406a(this.f48864a, 6, i);
    }

    /* renamed from: b */
    public final void mo33628b() {
        if (!this.f48865b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.f48865b.putExtra("triggered_from_app_after_verification", true);
            this.f48866c.sendBroadcast(this.f48865b);
            return;
        }
        this.f48867d.f48780a.mo33689d("Splits copied and verified more than once.", new Object[0]);
    }
}
