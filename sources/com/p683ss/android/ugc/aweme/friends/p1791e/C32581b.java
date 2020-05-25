package com.p683ss.android.ugc.aweme.friends.p1791e;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.friends.utils.C32783c;
import com.p683ss.android.ugc.aweme.lego.C35889c;
import com.p683ss.android.ugc.aweme.lego.C35897g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.e.b */
public final class C32581b implements C35889c {
    /* renamed from: a */
    public final C35897g mo46246a() {
        return C35897g.IDLE;
    }

    /* renamed from: a */
    public final void mo46247a(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        if (Keva.getRepo("friendslist_permission_keva_name").getLong("contact_upload_next_time_key", 0) < System.currentTimeMillis()) {
            C32783c.m75668b();
        }
    }
}
