package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.C14963ax;
import java.io.InputStream;
import java.util.concurrent.Future;

@C16299uq
public final class bxt {

    /* renamed from: a */
    bxn f44520a;

    /* renamed from: b */
    boolean f44521b;

    /* renamed from: c */
    private final Context f44522c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f44523d = new Object();

    bxt(Context context) {
        this.f44522c = context;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Future<InputStream> mo30855a(zzwr zzwr) {
        bxu bxu = new bxu(this);
        bxv bxv = new bxv(this, zzwr, bxu);
        bya bya = new bya(this, bxu);
        synchronized (this.f44523d) {
            this.f44520a = new bxn(this.f44522c, C14963ax.m30844n().mo28747a(), bxv, bya);
            this.f44520a.mo28409l();
        }
        return bxu;
    }

    /* renamed from: a */
    static /* synthetic */ void m36971a(bxt bxt) {
        synchronized (bxt.f44523d) {
            if (bxt.f44520a != null) {
                bxt.f44520a.mo28403f();
                bxt.f44520a = null;
                Binder.flushPendingCommands();
            }
        }
    }
}
