package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1883d;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34849f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.d.a */
public final class C34954a {

    /* renamed from: a */
    public static final C34954a f89960a = new C34954a();

    /* renamed from: b */
    private static long f89961b = -1;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.d.a$a */
    static final class C34955a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ List f89962a;

        C34955a(List list) {
            this.f89962a = list;
        }

        public final /* synthetic */ Object call() {
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            List<IMContact> e = C52575l.m112139e((Collection<? extends T>) this.f89962a);
            if (e.size() > 30) {
                e = e.subList(0, 30);
            }
            for (IMContact iMContact : e) {
                if (iMContact instanceof IMUser) {
                    IMUser iMUser = (IMUser) iMContact;
                    String secUid = iMUser.getSecUid();
                    C52711k.m112236a((Object) secUid, "contact.secUid");
                    arrayList.add(secUid);
                    String uid = iMUser.getUid();
                    C52711k.m112236a((Object) uid, "contact.uid");
                    arrayList2.add(uid);
                }
            }
            List a = C34387b.m78292a().mo72390a(arrayList2, 30, 0, C34387b.m78304h());
            C52711k.m112236a((Object) a, "IMUserDao.inst().findWit…_PAGE_ITEM, 0, condition)");
            List<IMUser> e2 = C52575l.m112139e((Collection<? extends T>) a);
            if (!C9376b.m18558a((Collection<T>) e2)) {
                for (IMUser iMUser2 : e2) {
                    if (!arrayList.contains(iMUser2.getSecUid())) {
                        String secUid2 = iMUser2.getSecUid();
                        C52711k.m112236a((Object) secUid2, "user.secUid");
                        arrayList.add(secUid2);
                    }
                }
            }
            if (arrayList.size() > 30) {
                arrayList = arrayList.subList(0, 30);
            }
            if (arrayList.size() > 0) {
                C35286u.m79879b(C34849f.m78931a(arrayList), C349561.f89963a);
            }
            return C52860x.f131107a;
        }
    }

    private C34954a() {
    }

    /* renamed from: a */
    public static final void m79087a(List<IMContact> list) {
        C52711k.m112240b(list, "recentContacts");
        if (System.currentTimeMillis() - f89961b >= 30000) {
            f89961b = System.currentTimeMillis();
            C0013i.m16a((Callable<TResult>) new C34955a<TResult>(list));
        }
    }
}
