package com.p683ss.android.ugc.aweme.share.improve;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.miniapp_api.p1958b.C36943e;
import com.p683ss.android.ugc.aweme.p1807im.service.share.C35475a;
import com.p683ss.android.ugc.aweme.share.improve.pkg.MicroAppSharePackage;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42346c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42346c.C42347a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d.C42350b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.c */
public final class C42146c extends C42131b {

    /* renamed from: com.ss.android.ugc.aweme.share.improve.c$a */
    public static final class C42147a implements C42346c {

        /* renamed from: a */
        final /* synthetic */ C36943e f106615a;

        C42147a(C36943e eVar) {
            this.f106615a = eVar;
        }

        /* renamed from: a */
        public final void mo55492a(SharePackage sharePackage) {
            C52711k.m112240b(sharePackage, "sharePackage");
            this.f106615a.mo76191a(null);
        }

        /* renamed from: b */
        public final boolean mo55494b(SharePackage sharePackage) {
            C52711k.m112240b(sharePackage, "sharePackage");
            return C42347a.m92965a(this, sharePackage);
        }

        /* renamed from: a */
        public final void mo55493a(String str, SharePackage sharePackage) {
            C52711k.m112240b(str, "channel");
            C52711k.m112240b(sharePackage, "sharePackage");
            if (!(sharePackage instanceof MicroAppSharePackage)) {
                sharePackage = null;
            }
            MicroAppSharePackage microAppSharePackage = (MicroAppSharePackage) sharePackage;
            if (microAppSharePackage != null) {
                C36943e eVar = microAppSharePackage.f106692a;
                if (eVar != null) {
                    eVar.mo76192a(str, true);
                }
            }
        }
    }

    /* renamed from: a */
    public final SharePackage mo86145a() {
        return this.f106982f.f106953i;
    }

    /* renamed from: a */
    public final void mo86146a(SharePackage sharePackage, C36943e eVar) {
        C52711k.m112240b(sharePackage, "sharePackage");
        C52711k.m112240b(eVar, "callback");
        C42348d dVar = this.f106982f;
        C42350b bVar = new C42350b();
        C42348d dVar2 = dVar;
        List<C42307b> list = dVar2.f106945a;
        C52711k.m112240b(list, "<set-?>");
        bVar.f106960a = list;
        List<C42357g> list2 = dVar2.f106946b;
        C52711k.m112240b(list2, "<set-?>");
        bVar.f106961b = list2;
        bVar.f106963d = dVar2.f106947c;
        bVar.f106964e = dVar2.f106948d;
        bVar.f106968i = dVar2.f106949e;
        bVar.f106969j = dVar2.f106950f;
        bVar.f106970k = dVar2.f106951g;
        bVar.f106971l = dVar2.f106952h;
        bVar.f106973n = dVar2.f106954j;
        bVar.f106974o = dVar2.f106955k;
        bVar.f106975p = dVar2.f106956l;
        bVar.f106976q = dVar2.f106957m;
        bVar.f106977r = dVar2.f106958n;
        C42348d a = bVar.mo86259a(sharePackage).mo86260a((C42346c) new C42147a(eVar)).mo86266a();
        C52711k.m112240b(a, "<set-?>");
        this.f106982f = a;
        C35475a aVar = this.f106592d;
        if (aVar != null) {
            aVar.mo73265a(this.f106982f);
        }
    }

    public C42146c(Activity activity, C42348d dVar, int i) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(dVar, "config");
        super(activity, dVar, R.style.t9);
    }
}
