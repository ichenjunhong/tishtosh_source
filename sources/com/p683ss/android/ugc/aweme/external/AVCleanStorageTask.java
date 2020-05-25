package com.p683ss.android.ugc.aweme.external;

import android.content.Context;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.p829r.C12660a;
import com.bytedance.p829r.C12662c;
import com.p683ss.android.ugc.aweme.abtest.StorageRegisterStrategy;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p1445bp.p1446a.C23873a;
import com.p683ss.android.ugc.aweme.p1445bp.p1446a.C23875b;
import com.p683ss.android.ugc.aweme.p1445bp.p1455f.C23910a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p683ss.android.ugc.aweme.services.storage.StorageServiceImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.external.AVCleanStorageTask */
public final class AVCleanStorageTask implements LegoTask {

    /* renamed from: com.ss.android.ugc.aweme.external.AVCleanStorageTask$a */
    public static final class C29510a implements C52682m<Boolean, Long, C52860x> {
        C29510a() {
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object obj3;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((Number) obj2).longValue();
            if (booleanValue) {
                C23873a aVar = C23873a.f63547c;
                if (C39630m.m88234a().mo58607e().mo74140b()) {
                    int a = C10181b.m20511a().mo18168a(StorageRegisterStrategy.class, true, "av_storage_strategy", 31744, 1);
                    Iterator it = ((List) C23873a.f63546b.getValue()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it.next();
                        if (((C23875b) obj3).mo49485a(a)) {
                            break;
                        }
                    }
                    C23875b bVar = (C23875b) obj3;
                    if (bVar != null) {
                        List a2 = bVar.mo49484a();
                        if (a2 != null) {
                            Iterable<C23910a> iterable = a2;
                            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                            for (C23910a aVar2 : iterable) {
                                C12662c.m25453a((C12660a) aVar2);
                                aVar2.mo49513e().length();
                                arrayList.add(C52860x.f131107a);
                            }
                        }
                    }
                }
            }
            return C52860x.f131107a;
        }
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        new StorageServiceImpl().checkStorageClean();
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
        C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
        createIAVServiceProxybyMonsterPlugin.getDecompressService().mo74197a((C52682m<? super Boolean, ? super Long, C52860x>) new C29510a<Object,Object,C52860x>());
    }
}
