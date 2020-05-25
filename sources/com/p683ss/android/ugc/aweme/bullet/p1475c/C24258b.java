package com.p683ss.android.ugc.aweme.bullet.p1475c;

import android.content.Context;
import com.bytedance.ies.bullet.kit.web.C10527j;
import com.bytedance.ies.bullet.kit.web.C10530m;
import com.bytedance.ies.bullet.kit.web.p648a.C10487d;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import com.bytedance.ies.bullet.p653ui.common.p655b.C10565b;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad.AdInfoMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad.GetWebViewInfo;
import com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad.OpenAdLandPageLinksMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad.UpdateNavBarMethod;
import com.p683ss.android.ugc.aweme.bullet.business.C24252a;
import com.p683ss.android.ugc.aweme.bullet.business.C24254b;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24295a;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24296b;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24302c;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h;
import com.p683ss.android.ugc.aweme.bullet.utils.C24347a;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48299a;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48339b;
import com.p683ss.android.ugc.aweme.web.jsbridge.CloseJuStickerWindowMethod;
import com.p683ss.android.ugc.aweme.web.jsbridge.CloseWebViewLoadingMethod;
import com.p683ss.android.ugc.aweme.web.jsbridge.DidLoadFinishMethod;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.c.b */
public class C24258b extends C24261c {

    /* renamed from: a */
    public static final C24259a f64380a = new C24259a(null);

    /* renamed from: com.ss.android.ugc.aweme.bullet.c.b$a */
    public static final class C24259a {
        private C24259a() {
        }

        public /* synthetic */ C24259a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.c.b$b */
    public static final class C24260b extends C10487d {
        C24260b() {
        }

        /* renamed from: a */
        public final C10423r mo18356a(C10326b bVar) {
            C52711k.m112240b(bVar, "providerFactory");
            return new C24310h();
        }
    }

    /* renamed from: e */
    public final List<C10423r> mo18258e(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        return C52575l.m112092a(new C24302c());
    }

    /* renamed from: h */
    public final C10527j mo18616h(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        return new C24260b();
    }

    /* renamed from: d */
    public final C10565b mo18257d(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        return new C24296b(bVar, new C24252a());
    }

    /* renamed from: b */
    public final List<C10268e> mo18255b(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        Collection c = C52575l.m112133c(super.mo18255b(bVar), C52575l.m112099b((Object[]) new BaseBridgeMethod[]{new GetWebViewInfo(bVar), new AdInfoMethod(bVar), new UpdateNavBarMethod(bVar), new OpenAdLandPageLinksMethod(bVar)}));
        List arrayList = new ArrayList();
        C10757a aVar = (C10757a) bVar.mo18401c(C10757a.class);
        Context context = (Context) bVar.mo18401c(Context.class);
        if (!(aVar == null || context == null)) {
            C48299a aVar2 = new C48299a(new WeakReference(context));
            C52711k.m112240b(aVar, "iesJsBridge");
            aVar2.f121534a = aVar.f28930d.hashCode();
            C10326b bVar2 = bVar;
            C10762d dVar = aVar2;
            arrayList.add(C24347a.m59706a(bVar2, "getPageData", dVar, C10269a.PRIVATE));
            arrayList.add(C24347a.m59706a(bVar2, "cardClick", dVar, C10269a.PRIVATE));
            arrayList.add(C24347a.m59706a(bVar2, "cardStatus", dVar, C10269a.PRIVATE));
            arrayList.add(C24347a.m59706a(bVar2, "closeCardDialog", dVar, C10269a.PRIVATE));
            arrayList.add(C24347a.m59706a(bVar2, "openHalfScreenForm", dVar, C10269a.PRIVATE));
            arrayList.add(C24347a.m59706a(bVar2, "callNativePhone", dVar, C10269a.PRIVATE));
            arrayList.add(C24347a.m59706a(bVar2, "download_click", dVar, C10269a.PRIVATE));
            arrayList.add(C24347a.m59706a(bVar2, "setCard", dVar, C10269a.PRIVATE));
            arrayList.add(C24347a.m59706a(bVar2, "closeAdModal", dVar, C10269a.PRIVATE));
            arrayList.add(C24347a.m59706a(bVar2, "modalInteractionURL", dVar, C10269a.PRIVATE));
            arrayList.add(C24347a.m59706a(bVar2, "showModalPage", dVar, C10269a.PRIVATE));
            arrayList.add(C24347a.m59706a(bVar2, "setModalSize", dVar, C10269a.PRIVATE));
            arrayList.add(C24347a.m59706a(bVar2, "cardInteriorShow", dVar, C10269a.PRIVATE));
        }
        Collection c2 = C52575l.m112133c(c, arrayList);
        List arrayList2 = new ArrayList();
        C10757a aVar3 = (C10757a) bVar.mo18401c(C10757a.class);
        if (aVar3 != null) {
            C48339b bVar3 = new C48339b(aVar3);
            C10326b bVar4 = bVar;
            C10762d dVar2 = bVar3;
            arrayList2.add(C24347a.m59706a(bVar4, "openPanel", dVar2, C10269a.PRIVATE));
            arrayList2.add(C24347a.m59706a(bVar4, "openLightLandingPage", dVar2, C10269a.PRIVATE));
            arrayList2.add(C24347a.m59706a(bVar4, "closeLightLandingPage", dVar2, C10269a.PRIVATE));
        }
        Collection c3 = C52575l.m112133c(c2, arrayList2);
        List arrayList3 = new ArrayList();
        C10757a aVar4 = (C10757a) bVar.mo18401c(C10757a.class);
        arrayList3.add(C24347a.m59706a(bVar, "closeLoading", new CloseWebViewLoadingMethod(aVar4), C10269a.PRIVATE));
        arrayList3.add(C24347a.m59706a(bVar, "closeJuStickerWindow", new CloseJuStickerWindowMethod(aVar4), C10269a.PRIVATE));
        arrayList3.add(C24347a.m59706a(bVar, "didFinishLoad", new DidLoadFinishMethod(aVar4), C10269a.PRIVATE));
        return C52575l.m112133c(c3, arrayList3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C10530m mo50025a(C10326b bVar, C24254b bVar2, C10530m mVar) {
        C52711k.m112240b(bVar, "ctx");
        C52711k.m112240b(bVar2, "biz");
        return new C24295a(bVar, bVar2, mVar);
    }
}
