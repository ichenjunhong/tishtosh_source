package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.p1027a.C14886d;

/* renamed from: com.google.android.gms.internal.ads.yq */
final class C16407yq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C16138or f46007a;

    /* renamed from: b */
    private final /* synthetic */ zzyv f46008b;

    /* renamed from: c */
    private final /* synthetic */ C16413yw f46009c;

    /* renamed from: d */
    private final /* synthetic */ C16405yo f46010d;

    C16407yq(C16405yo yoVar, C16138or orVar, zzyv zzyv, C16413yw ywVar) {
        this.f46010d = yoVar;
        this.f46007a = orVar;
        this.f46008b = zzyv;
        this.f46009c = ywVar;
    }

    public final void run() {
        try {
            this.f46007a.mo31243a(C14886d.m30544a(this.f46010d.f45991b), this.f46008b, (String) null, (C16421zd) this.f46009c, this.f46010d.f45992c);
        } catch (RemoteException e) {
            String str = "Fail to initialize adapter ";
            String valueOf = String.valueOf(this.f46010d.f45990a);
            abv.m32795c(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
            this.f46010d.mo31514a(this.f46010d.f45990a, 0);
        }
    }
}
