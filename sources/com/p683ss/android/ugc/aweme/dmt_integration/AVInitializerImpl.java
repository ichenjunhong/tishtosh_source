package com.p683ss.android.ugc.aweme.dmt_integration;

import android.app.Application;
import android.graphics.Typeface;
import com.bytedance.ies.dmt.p664ui.p669e.C10703a;
import com.bytedance.ies.dmt.p664ui.widget.util.C10748a;
import com.bytedance.ies.dmt.p664ui.widget.util.C10749b;
import com.google.p1057b.p1058a.C17421k;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.common.p1595g.C26884a;
import com.p683ss.android.ugc.aweme.common.p1595g.C26885b;
import com.p683ss.android.ugc.aweme.common.p1595g.C26886c;
import com.p683ss.android.ugc.aweme.common.p1595g.C26887d;
import com.p683ss.android.ugc.aweme.common.p1595g.C26888e;
import com.p683ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p683ss.android.ugc.aweme.p1389au.C23292a;
import com.p683ss.android.ugc.aweme.p1389au.C23293b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39553ak;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.port.p2082in.C39639u;
import com.p683ss.android.ugc.aweme.services.IAVInitializer;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService;
import com.p683ss.android.ugc.aweme.services.IFoundationAVServiceProxy;
import com.p683ss.android.ugc.aweme.services.storage.AVStorageManagerImpl;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43049j;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43050k;
import com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a;
import com.p683ss.android.ugc.aweme.sticker.C46073p;
import com.p683ss.android.ugc.gamora.C48922a;
import com.p683ss.android.ugc.tools.C50179a;
import com.p683ss.android.ugc.tools.C50179a.C50180a;
import com.p683ss.android.ugc.tools.C50187b;
import com.p683ss.android.ugc.tools.p2505b.C50189b;
import com.p683ss.android.ugc.tools.p2505b.C50190c;
import com.p683ss.android.ugc.tools.p2505b.C50191d;
import com.p683ss.android.ugc.tools.view.p2513f.C50236b;
import com.p683ss.android.ugc.tools.view.p2513f.C50237c;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl */
public class AVInitializerImpl implements IAVInitializer {
    private void hootAvToast() {
        C50275d.f126140a = C29008e.f75921a;
        C50275d.f126141b = C29009f.f75922a;
    }

    static final /* synthetic */ Integer lambda$hootAvToast$2$AVInitializerImpl() {
        if (C10703a.m21576a()) {
            return Integer.valueOf(2);
        }
        return Integer.valueOf(1);
    }

    public static IAVInitializer createIAVInitializerbyMonsterPlugin() {
        Object a = C27991b.m66756a(IAVInitializer.class);
        if (a != null) {
            return (IAVInitializer) a;
        }
        if (C27991b.f73459aP == null) {
            synchronized (IAVInitializer.class) {
                if (C27991b.f73459aP == null) {
                    C27991b.f73459aP = new AVInitializerImpl();
                }
            }
        }
        return (AVInitializerImpl) C27991b.f73459aP;
    }

    private void initCukaie() {
        C29010g gVar = new C29010g(this);
        C52711k.m112240b(gVar, "block");
        gVar.invoke(C50189b.f125741c);
        if (C50189b.f125739a.compareAndSet(false, true)) {
            Boolean bool = C50189b.f125740b.f125738a;
            if (bool != null) {
                C50187b.f125736a = bool.booleanValue();
            }
            C50191d dVar = C50189b.f125741c;
            C52670a<? extends Typeface> aVar = dVar.f125744b;
            if (aVar != null) {
                C52711k.m112240b(aVar, "provider");
                C50237c.f125849b = aVar;
            }
            C50236b bVar = dVar.f125743a;
            if (bVar != null) {
                C50237c.f125848a = bVar;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ C52860x lambda$initCukaie$4$AVInitializerImpl(C50190c cVar) {
        cVar.mo97974a(C29011h.f75924a);
        cVar.mo97973a((C50236b) new C50236b() {
            /* renamed from: a */
            public final Typeface mo58561a(int i) {
                return C10748a.m21784a().mo19434a(i);
            }

            /* renamed from: a */
            public final Typeface mo58562a(String str) {
                return C10749b.m21787a().mo19435a(str);
            }
        });
        return C52860x.f131107a;
    }

    public void initialize(Application application) {
        C28984a aVar = new C28984a(application);
        C39629l.f101204a = (Application) C17421k.m42653a(application);
        C39629l.f101205b = (C39639u) C17421k.m42653a(aVar);
        C39630m.f101206a = (C39553ak) C17421k.m42653a(new C29012i());
        C50179a a = C50180a.m108284a();
        a.f125721a = false;
        a.f125722b = true;
        a.f125723c = false;
        a.f125724d = true;
        a.f125725e = 18;
        a.f125726f = true;
        a.f125727g = true;
        C23292a aVar2 = new C23292a();
        C52711k.m112240b(aVar2, "navigator");
        C44403a.f112341a = aVar2;
        C23293b bVar = new C23293b();
        C52711k.m112240b(bVar, "navigator");
        C46073p.f116249a = bVar;
        C26888e.m65001a(new C26887d());
        C39629l.m88232a().mo58577h().mo49487a(new AVStorageManagerImpl());
        C26888e.m65001a(new C26885b());
        C26888e.m65001a(new C26886c());
        ServiceManager.get().bind(IFoundationAVService.class, C29005b.f75918a);
        ServiceManager.get().bind(IFoundationAVServiceProxy.class, C29006c.f75919a);
        C26888e.m65001a(new C26884a());
        C43050k kVar = new C43050k();
        C52711k.m112240b(kVar, "stickPointManager");
        C43049j.f108670a = kVar;
        ServiceManager.get().bind(C48922a.class, C29007d.f75920a);
        hootAvToast();
        initCukaie();
    }
}
