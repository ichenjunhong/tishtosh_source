package com.p683ss.android.ugc.aweme.p1807im.service.share;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.C42322h;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage.C42326a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.service.share.ImWebSharePackage */
public final class ImWebSharePackage extends SharePackage {

    /* renamed from: a */
    public String f91191a;

    /* renamed from: b */
    public boolean f91192b = true;

    public ImWebSharePackage(C42326a aVar) {
        C52711k.m112240b(aVar, "builder");
        super(aVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C42318f mo73884a(C42307b bVar) {
        C52711k.m112240b(bVar, "channel");
        C42322h hVar = new C42322h(this.f106899h, this.f106897f, this.f106898g);
        String a = C23515d.m57665a(this.f91191a);
        if (!TextUtils.isEmpty(a)) {
            C52711k.m112236a((Object) a, "downloadedPath");
            hVar.mo86232a("thumb_path", a);
        }
        return hVar;
    }
}
