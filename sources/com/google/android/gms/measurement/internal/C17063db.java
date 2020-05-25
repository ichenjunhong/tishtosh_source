package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.db */
final class C17063db implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f48159a;

    /* renamed from: b */
    private final /* synthetic */ boolean f48160b;

    /* renamed from: c */
    private final /* synthetic */ zzag f48161c;

    /* renamed from: d */
    private final /* synthetic */ zzk f48162d;

    /* renamed from: e */
    private final /* synthetic */ String f48163e;

    /* renamed from: f */
    private final /* synthetic */ C17055cu f48164f;

    C17063db(C17055cu cuVar, boolean z, boolean z2, zzag zzag, zzk zzk, String str) {
        this.f48164f = cuVar;
        this.f48159a = z;
        this.f48160b = z2;
        this.f48161c = zzag;
        this.f48162d = zzk;
        this.f48163e = str;
    }

    public final void run() {
        C17124i c = this.f48164f.f48131a;
        if (c == null) {
            this.f48164f.mo32854q().f48445b.mo33376a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f48159a) {
            this.f48164f.mo33028a(c, this.f48160b ? null : this.f48161c, this.f48162d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f48163e)) {
                    c.mo32950a(this.f48161c, this.f48162d);
                } else {
                    c.mo32951a(this.f48161c, this.f48163e, this.f48164f.mo32854q().mo33372Q_());
                }
            } catch (RemoteException e) {
                this.f48164f.mo32854q().f48445b.mo33377a("Failed to send event to the service", e);
            }
        }
        this.f48164f.m41431F();
    }
}
