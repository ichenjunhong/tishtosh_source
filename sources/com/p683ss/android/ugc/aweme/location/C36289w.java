package com.p683ss.android.ugc.aweme.location;

import android.content.Context;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.netwok.C9244b;
import com.bytedance.bdlocation.service.C9248a;
import com.p683ss.android.ugc.aweme.lego.C35889c;
import com.p683ss.android.ugc.aweme.lego.C35897g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.location.w */
public final class C36289w implements C35889c {
    /* renamed from: a */
    public final C35897g mo46246a() {
        return C35897g.IDLE;
    }

    /* renamed from: a */
    public final void mo46247a(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        if (BDLocationConfig.getContext() != null && context != null) {
            try {
                C9248a.m18347a();
                C9244b.m18345a(context);
            } catch (Exception unused) {
            }
        }
    }
}
