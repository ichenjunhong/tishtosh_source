package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;

public final class brc implements brg, brh {

    /* renamed from: a */
    private final Uri f43649a;

    /* renamed from: b */
    private final bss f43650b;

    /* renamed from: c */
    private final bon f43651c;

    /* renamed from: d */
    private final int f43652d = -1;

    /* renamed from: e */
    private final Handler f43653e;

    /* renamed from: f */
    private final brd f43654f;

    /* renamed from: g */
    private final bmr f43655g;

    /* renamed from: h */
    private final int f43656h;

    /* renamed from: i */
    private brh f43657i;

    /* renamed from: j */
    private bmp f43658j;

    /* renamed from: k */
    private boolean f43659k;

    public brc(Uri uri, bss bss, bon bon, int i, Handler handler, brd brd, String str, int i2) {
        this.f43649a = uri;
        this.f43650b = bss;
        this.f43651c = bon;
        this.f43653e = handler;
        this.f43654f = brd;
        this.f43656h = i2;
        this.f43655g = new bmr();
    }

    /* renamed from: a */
    public final void mo30600a(blu blu, boolean z, brh brh) {
        this.f43657i = brh;
        this.f43658j = new bru(-9223372036854775807L, false);
        brh.mo30384a(this.f43658j, null);
    }

    /* renamed from: a */
    public final bre mo30598a(int i, bsp bsp) {
        bti.m36699a(i == 0);
        bqt bqt = new bqt(this.f43649a, this.f43650b.mo29075a(), this.f43651c.mo29076a(), this.f43652d, this.f43653e, this.f43654f, this, bsp, null, this.f43656h);
        return bqt;
    }

    /* renamed from: a */
    public final void mo30601a(bre bre) {
        bqt bqt = (bqt) bre;
        bra bra = bqt.f43607f;
        btc btc = bqt.f43606e;
        bqx bqx = new bqx(bqt, bra);
        if (btc.f43832b != null) {
            btc.f43832b.mo30681a(true);
        }
        btc.f43831a.execute(bqx);
        btc.f43831a.shutdown();
        bqt.f43610i.removeCallbacksAndMessages(null);
        bqt.f43622u = true;
    }

    /* renamed from: a */
    public final void mo30599a() {
        this.f43657i = null;
    }

    /* renamed from: a */
    public final void mo30384a(bmp bmp, Object obj) {
        boolean z = false;
        if (bmp.mo30410a(0, this.f43655g, false).f42980d != -9223372036854775807L) {
            z = true;
        }
        if (!this.f43659k || z) {
            this.f43658j = bmp;
            this.f43659k = z;
            this.f43657i.mo30384a(this.f43658j, null);
        }
    }
}
