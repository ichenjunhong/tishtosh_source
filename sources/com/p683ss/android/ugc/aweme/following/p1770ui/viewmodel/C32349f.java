package com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel;

import com.p683ss.android.ugc.aweme.p1807im.C33200k;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.f */
public final class C32349f {

    /* renamed from: a */
    public List<IMUser> f84213a = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.f$a */
    static final class C32350a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C32349f f84214a;

        C32350a(C32349f fVar) {
            this.f84214a = fVar;
        }

        public final /* synthetic */ Object call() {
            C32349f fVar = this.f84214a;
            IIMService d = C33200k.m76279d();
            C52711k.m112236a((Object) d, "IMProxy.get()");
            List<IMUser> allFollowIMUsers = d.getAllFollowIMUsers();
            C52711k.m112236a((Object) allFollowIMUsers, "IMProxy.get().allFollowIMUsers");
            fVar.f84213a = allFollowIMUsers;
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo65480a() {
        C0013i.m16a((Callable<TResult>) new C32350a<TResult>(this));
    }
}
