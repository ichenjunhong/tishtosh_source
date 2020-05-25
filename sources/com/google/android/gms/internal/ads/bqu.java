package com.google.android.gms.internal.ads;

final class bqu implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bqt f43628a;

    bqu(bqt bqt) {
        this.f43628a = bqt;
    }

    public final void run() {
        bqt bqt = this.f43628a;
        if (!bqt.f43622u && !bqt.f43615n && bqt.f43613l != null && bqt.f43614m) {
            int size = bqt.f43611j.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (((bro) bqt.f43611j.valueAt(i)).mo30620c() == null) {
                        break;
                    }
                    i++;
                } else {
                    bqt.f43608g.mo30685b();
                    brv[] brvArr = new brv[size];
                    bqt.f43619r = new boolean[size];
                    bqt.f43618q = new boolean[size];
                    bqt.f43617p = bqt.f43613l.mo30495b();
                    int i2 = 0;
                    while (true) {
                        boolean z = true;
                        if (i2 >= size) {
                            break;
                        }
                        zzlg c = ((bro) bqt.f43611j.valueAt(i2)).mo30620c();
                        brvArr[i2] = new brv(c);
                        String str = c.f46253c;
                        if (!btn.m36715b(str) && !btn.m36714a(str)) {
                            z = false;
                        }
                        bqt.f43619r[i2] = z;
                        bqt.f43620s = z | bqt.f43620s;
                        i2++;
                    }
                    bqt.f43616o = new brx(brvArr);
                    bqt.f43615n = true;
                    bqt.f43603b.mo30384a(new bru(bqt.f43617p, bqt.f43613l.mo30494a()), null);
                    bqt.f43612k.mo30385a(bqt);
                }
            }
        }
    }
}
