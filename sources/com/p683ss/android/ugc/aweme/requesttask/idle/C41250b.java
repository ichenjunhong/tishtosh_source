package com.p683ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.p683ss.android.ugc.aweme.app.C23098h;
import com.p683ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p683ss.android.ugc.aweme.lego.C35889c;
import com.p683ss.android.ugc.aweme.lego.C35897g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.b */
public final class C41250b implements C35889c {

    /* renamed from: com.ss.android.ugc.aweme.requesttask.idle.b$a */
    static final class C41251a implements Runnable {

        /* renamed from: a */
        public static final C41251a f104694a = new C41251a();

        C41251a() {
        }

        public final void run() {
            AnchorListManager.m62138a();
        }
    }

    /* renamed from: a */
    public final C35897g mo46246a() {
        return C35897g.SPARSE;
    }

    /* renamed from: a */
    public final void mo46247a(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        long a = C23098h.f61512f.mo47840a("anchor_list");
        Handler handler = new Handler(Looper.getMainLooper());
        Runnable runnable = C41251a.f104694a;
        AnchorListManager anchorListManager = AnchorListManager.f67772d;
        boolean z2 = false;
        if (AnchorListManager.f67769a.getBoolean("anchor_local_success", false) && AnchorListManager.m62139c()) {
            z2 = true;
        }
        if (!z2) {
            a = 0;
        }
        handler.postDelayed(runnable, a);
    }
}
