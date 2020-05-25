package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.t */
public final class C42121t extends C42079d {
    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        Aweme rawAdAwemeById = C23324d.m57378a().getRawAdAwemeById(sharePackage.f106900i.getString("aweme_id"));
        if (rawAdAwemeById != null) {
            C26088l.m63293a(context, "copy", rawAdAwemeById, C26088l.m63373m(context, rawAdAwemeById, "copy"));
            super.mo49950a(context, sharePackage);
        }
    }

    public C42121t(String str, boolean z, boolean z2) {
        C52711k.m112240b(str, "enterFrom");
        super(str, false, true);
    }
}
