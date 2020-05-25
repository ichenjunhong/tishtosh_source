package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.dn */
public final /* synthetic */ class C17075dn implements Runnable {

    /* renamed from: a */
    private final C17074dm f48200a;

    /* renamed from: b */
    private final int f48201b;

    /* renamed from: c */
    private final C17133r f48202c;

    /* renamed from: d */
    private final Intent f48203d;

    public C17075dn(C17074dm dmVar, int i, C17133r rVar, Intent intent) {
        this.f48200a = dmVar;
        this.f48201b = i;
        this.f48202c = rVar;
        this.f48203d = intent;
    }

    public final void run() {
        C17074dm dmVar = this.f48200a;
        int i = this.f48201b;
        C17133r rVar = this.f48202c;
        Intent intent = this.f48203d;
        if (((C17079dr) dmVar.f48199a).mo32820a(i)) {
            rVar.f48453j.mo33377a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            dmVar.mo33065c().f48453j.mo33376a("Completed wakeful intent.");
            ((C17079dr) dmVar.f48199a).mo32819a(intent);
        }
    }
}
