package com.google.android.gms.common.api;

import android.support.p030v4.p038f.C0777a;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15211a.C15215d;
import com.google.android.gms.common.api.internal.C15306cf;
import com.google.android.gms.common.internal.C15464q;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.api.c */
public final class C15228c extends Exception {

    /* renamed from: a */
    private final C0777a<C15306cf<?>, ConnectionResult> f39282a;

    public C15228c(C0777a<C15306cf<?>, ConnectionResult> aVar) {
        this.f39282a = aVar;
    }

    public final ConnectionResult getConnectionResult(C15230e<? extends C15215d> eVar) {
        C15306cf<O> cfVar = eVar.f39286d;
        C15464q.m32134b(this.f39282a.get(cfVar) != null, "The given API was not part of the availability request.");
        return (ConnectionResult) this.f39282a.get(cfVar);
    }

    public final C0777a<C15306cf<?>, ConnectionResult> zaj() {
        return this.f39282a;
    }

    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C15306cf cfVar : this.f39282a.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.f39282a.get(cfVar);
            if (connectionResult.mo28024b()) {
                z = false;
            }
            String a = cfVar.mo28232a();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
