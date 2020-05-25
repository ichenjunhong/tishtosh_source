package com.p683ss.android.ugc.aweme.discover.hitrank;

import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.discover.C27937c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.utils.C47865ew;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.hitrank.g */
public final class C28220g {

    /* renamed from: a */
    static RankApi f74082a;

    /* renamed from: b */
    public static final C28220g f74083b = new C28220g();

    /* renamed from: com.ss.android.ugc.aweme.discover.hitrank.g$a */
    static final class C28221a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ String f74084a;

        /* renamed from: b */
        final /* synthetic */ int f74085b;

        /* renamed from: c */
        final /* synthetic */ List f74086c;

        C28221a(String str, int i, List list) {
            this.f74084a = str;
            this.f74085b = i;
            this.f74086c = list;
        }

        public final /* synthetic */ Object call() {
            C28220g gVar = C28220g.f74083b;
            RankApi rankApi = C28220g.f74082a;
            if (rankApi == null) {
                C52711k.m112234a();
            }
            return (BaseResponse) rankApi.finishHitRankTask(this.f74084a, 1, this.f74085b, this.f74086c, C47865ew.m103536a().mo95083c(this.f74084a)).get();
        }
    }

    private C28220g() {
    }

    /* renamed from: a */
    public final void mo56653a(String str, int i) {
        C52711k.m112240b(str, "uid");
        m67132a(str, i, null);
    }

    /* renamed from: a */
    public final void mo56651a(Aweme aweme, int i) {
        if (C27937c.f73358a.checkHitRankByAweme(aweme, i)) {
            if (aweme == null) {
                C52711k.m112234a();
            }
            mo56652a(aweme.getAuthor(), i);
        }
    }

    /* renamed from: a */
    public final void mo56652a(User user, int i) {
        if (C27937c.f73358a.checkHitRankByUser(user, i)) {
            if (user == null) {
                C52711k.m112234a();
            }
            String uid = user.getUid();
            C52711k.m112236a((Object) uid, "user!!.uid");
            mo56653a(uid, i);
        }
    }

    /* renamed from: a */
    public static void m67132a(String str, int i, List<String> list) {
        C52711k.m112240b(str, "uid");
        IAccountUserService userService = C20854a.m53161a().userService();
        C52711k.m112236a((Object) userService, "AccountProxyService.get().userService()");
        if (userService.isLogin()) {
            if (f74082a == null) {
                f74082a = (RankApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(RankApi.class);
            }
            C0013i.m16a((Callable<TResult>) new C28221a<TResult>(str, i, list));
        }
    }
}
