package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.p1029b.C14902a;
import com.google.android.gms.common.C15373d;
import com.google.android.gms.common.C15382e;
import java.io.IOException;

final class aaz implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Context f40080a;

    /* renamed from: b */
    private final /* synthetic */ agl f40081b;

    aaz(aay aay, Context context, agl agl) {
        this.f40080a = context;
        this.f40081b = agl;
    }

    public final void run() {
        try {
            this.f40081b.mo28823b(C14902a.m30575a(this.f40080a));
        } catch (C15373d | C15382e | IOException | IllegalStateException e) {
            this.f40081b.mo28822a(e);
            afc.m32793b("Exception while getting advertising Id info", e);
        }
    }
}
