package com.google.firebase.iid;

import android.content.Intent;

/* renamed from: com.google.firebase.iid.af */
final class C17895af implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Intent f49727a;

    /* renamed from: b */
    private final /* synthetic */ Intent f49728b;

    /* renamed from: c */
    private final /* synthetic */ zzb f49729c;

    C17895af(zzb zzb, Intent intent, Intent intent2) {
        this.f49729c = zzb;
        this.f49727a = intent;
        this.f49728b = intent2;
    }

    public final void run() {
        this.f49729c.zzd(this.f49727a);
        this.f49729c.zza(this.f49728b);
    }
}
