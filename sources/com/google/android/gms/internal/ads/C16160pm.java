package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.C15070l;
import com.google.android.gms.ads.mediation.C15072n;

/* renamed from: com.google.android.gms.internal.ads.pm */
final class C16160pm implements C15072n<Object, Object> {

    /* renamed from: a */
    private final /* synthetic */ C16141ou f45404a;

    /* renamed from: b */
    private final /* synthetic */ C15070l f45405b;

    /* renamed from: c */
    private final /* synthetic */ C16159pl f45406c;

    C16160pm(C16159pl plVar, C16141ou ouVar, C15070l lVar) {
        this.f45406c = plVar;
        this.f45404a = ouVar;
        this.f45405b = lVar;
    }

    /* renamed from: a */
    public final void mo27792a(String str) {
        try {
            String canonicalName = this.f45405b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(str).length());
            sb.append(canonicalName);
            sb.append("failed to loaded medation ad: ");
            sb.append(str);
            afc.m32792b(sb.toString());
            this.f45404a.mo31202a(0);
        } catch (RemoteException e) {
            afc.m32793b("", e);
        }
    }
}
