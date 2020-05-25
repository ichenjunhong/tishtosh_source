package com.p683ss.android.ugc.aweme.miniapp.impl;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.miniapp_api.p1958b.C36943e;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.improve.C42146c;
import com.p683ss.android.ugc.aweme.share.improve.pkg.MicroAppSharePackage;
import com.p683ss.android.ugc.aweme.share.improve.pkg.MicroAppSharePackage.C42187a.C42188a;
import com.p683ss.android.ugc.aweme.share.improve.pkg.MicroAppSharePackage.C42187a.C42189b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d.C42350b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42354e;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage.C42326a;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.miniapp.impl.l */
final /* synthetic */ class C36903l implements Callable {

    /* renamed from: a */
    private final C36899j f94283a;

    /* renamed from: b */
    private final Activity f94284b;

    /* renamed from: c */
    private final C36943e f94285c;

    C36903l(C36899j jVar, Activity activity, C36943e eVar) {
        this.f94283a = jVar;
        this.f94284b = activity;
        this.f94285c = eVar;
    }

    public final Object call() {
        C36899j jVar = this.f94283a;
        Activity activity = this.f94284b;
        C36943e eVar = this.f94285c;
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(eVar, "listener");
        MicroAppSharePackage microAppSharePackage = new MicroAppSharePackage(new C42326a().mo86236a("game"));
        microAppSharePackage.f106692a = eVar;
        C42350b bVar = new C42350b();
        C41979aq.m91946a().injectUniversalConfig(bVar, activity, true);
        bVar.mo86270b(false);
        bVar.mo86259a((SharePackage) microAppSharePackage);
        bVar.mo86261a((C42354e) new C42188a(activity, microAppSharePackage, eVar));
        C42146c cVar = new C42146c(activity, bVar.mo86266a(), R.style.t9);
        cVar.setOnCancelListener(new C42189b(eVar));
        cVar.show();
        jVar.f94276a = cVar;
        return null;
    }
}
