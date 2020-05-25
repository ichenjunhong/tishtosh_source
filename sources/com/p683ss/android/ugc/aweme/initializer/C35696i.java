package com.p683ss.android.ugc.aweme.initializer;

import android.content.Context;
import com.p683ss.android.ugc.aweme.location.C36265i;
import com.p683ss.android.ugc.aweme.location.C36272l;
import com.p683ss.android.ugc.aweme.poi.C39054d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39640v.C39642b;

/* renamed from: com.ss.android.ugc.aweme.initializer.i */
final /* synthetic */ class C35696i implements C36265i {

    /* renamed from: a */
    private final Context f91654a;

    /* renamed from: b */
    private final C39642b f91655b;

    C35696i(Context context, C39642b bVar) {
        this.f91654a = context;
        this.f91655b = bVar;
    }

    public final void bF_() {
        Context context = this.f91654a;
        C39642b bVar = this.f91655b;
        C39054d a = C36272l.m81897a(context.getApplicationContext()).mo75072a();
        if (a == null || !a.isValid()) {
            if (bVar != null) {
                bVar.mo74041a();
            }
        } else if (bVar != null) {
            bVar.mo74042a(a.latitude, a.longitude);
        }
    }
}
