package com.google.android.gms.internal.measurement;

import android.util.DisplayMetrics;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.ay */
public final class C16554ay extends C16860r {
    C16554ay(C16862t tVar) {
        super(tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31765a() {
    }

    /* renamed from: b */
    public final C16583c mo31817b() {
        mo32516r();
        DisplayMetrics displayMetrics = mo32509j().f38972a.getResources().getDisplayMetrics();
        C16583c cVar = new C16583c();
        cVar.f46596a = C16585cb.m39588a(Locale.getDefault());
        cVar.f46598c = displayMetrics.widthPixels;
        cVar.f46599d = displayMetrics.heightPixels;
        return cVar;
    }
}
