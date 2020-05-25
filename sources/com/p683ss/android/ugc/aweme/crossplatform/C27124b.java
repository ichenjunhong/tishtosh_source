package com.p683ss.android.ugc.aweme.crossplatform;

import com.p683ss.android.ugc.aweme.C22787ap;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27302d;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.C28682a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.greenrobot.eventbus.C53771m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.b */
public final class C27124b implements C27302d {

    /* renamed from: a */
    public boolean f71559a;

    /* renamed from: b */
    public final CrossPlatformWebView f71560b;

    public C27124b(CrossPlatformWebView crossPlatformWebView) {
        C52711k.m112240b(crossPlatformWebView, C23060d.f61427a);
        this.f71560b = crossPlatformWebView;
        CrossPlatformWebView crossPlatformWebView2 = this.f71560b;
        C27302d dVar = this;
        C52711k.m112240b(dVar, "listener");
        crossPlatformWebView2.f71976b.add(dVar);
        C47718bf.m103290c(this);
    }

    @C53771m
    public final void onH5ComponentDidMount(C28682a aVar) {
        C52711k.m112240b(aVar, "event");
        this.f71559a = true;
        C22787ap I = C23794bh.m58383I();
        C52711k.m112236a((Object) I, "LegacyServiceUtils.getCrossPlatformLegacyService()");
        I.onSearchIntermindateComponentDidMount(this.f71560b);
        if (this.f71560b.getDisplayed()) {
            I.sendInitDataToFe(this.f71560b);
        }
    }
}
