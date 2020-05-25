package com.p683ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi;
import com.p683ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi.C25637b;
import com.p683ss.android.ugc.aweme.lego.C35889c;
import com.p683ss.android.ugc.aweme.lego.C35897g;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.e */
public final class C41255e implements C35889c {
    /* renamed from: a */
    public final C35897g mo46246a() {
        return C35897g.IDLE;
    }

    /* renamed from: a */
    public final void mo46247a(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        if (CommerceSettingsApi.f67857b == null) {
            C0013i.m18a((Callable<TResult>) C25637b.f67861a, (Executor) C24076h.m58902c());
        }
    }
}
