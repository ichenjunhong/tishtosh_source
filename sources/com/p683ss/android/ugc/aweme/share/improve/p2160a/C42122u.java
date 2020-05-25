package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.u */
public final class C42122u extends C42130z {
    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        Aweme rawAdAwemeById = C23324d.m57378a().getRawAdAwemeById(sharePackage.f106900i.getString("aweme_id"));
        if (rawAdAwemeById != null) {
            C26088l.m63293a(context, "open_url_h5", rawAdAwemeById, C26088l.m63373m(context, rawAdAwemeById, "open_url_h5"));
            super.mo49950a(context, sharePackage);
        }
    }
}
