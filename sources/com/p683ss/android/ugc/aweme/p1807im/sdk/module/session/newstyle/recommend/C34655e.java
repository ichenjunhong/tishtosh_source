package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.recommend;

import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35268h;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p001a.C0011g;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.e */
public final class C34655e extends C26832a<C34654d> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f89274a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34655e.class), "mRecommendApi", "getMRecommendApi()Lcom/ss/android/ugc/aweme/im/sdk/module/session/newstyle/recommend/RecommendApi;"))};

    /* renamed from: e */
    public static final C34656a f89275e = new C34656a(null);

    /* renamed from: b */
    volatile int f89276b;

    /* renamed from: c */
    public List<? extends User> f89277c = C52575l.m112097a();

    /* renamed from: d */
    public boolean f89278d;

    /* renamed from: f */
    private final C52668f f89279f = C52732g.m112285a(C34658c.f89281a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.e$a */
    public static final class C34656a {
        private C34656a() {
        }

        public /* synthetic */ C34656a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.e$b */
    static final class C34657b<V> implements Callable<C34654d> {

        /* renamed from: a */
        final /* synthetic */ C34655e f89280a;

        C34657b(C34655e eVar) {
            this.f89280a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C34654d call() {
            try {
                C34654d dVar = (C34654d) this.f89280a.mData;
                dVar.f89268a = this.f89280a.f89277c;
                C34655e eVar = this.f89280a;
                List<? extends User> a = C52575l.m112097a();
                C52711k.m112240b(a, "<set-?>");
                eVar.f89277c = a;
                return dVar;
            } catch (ExecutionException e) {
                throw e;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.e$c */
    static final class C34658c extends C52712l implements C52670a<RecommendApi> {

        /* renamed from: a */
        public static final C34658c f89281a = new C34658c();

        C34658c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RecommendApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C35268h.f90601b).create(RecommendApi.class);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final RecommendApi mo72719a() {
        return (RecommendApi) this.f89279f.getValue();
    }

    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo72720a(int i) {
        int i2;
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (g.isUidContactPermisioned()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        RecommendApi a = mo72719a();
        Integer valueOf = Integer.valueOf(20);
        Integer valueOf2 = Integer.valueOf(this.f89276b);
        Integer valueOf3 = Integer.valueOf(10);
        Integer valueOf4 = Integer.valueOf(i2);
        C34004b a2 = C34004b.m77717a();
        C52711k.m112236a((Object) a2, "AwemeImManager.instance()");
        C35460j f = a2.mo71949f();
        C52711k.m112236a((Object) f, "AwemeImManager.instance().proxy");
        a.recommendList(valueOf, valueOf2, null, valueOf3, null, valueOf4, f.getToReportId(), Integer.valueOf(C34653c.m78628b()), null).mo19a((C0011g<TResult, TContinuationResult>) new C34651a<TResult,TContinuationResult>(this.mHandler, 0));
    }

    public final /* synthetic */ void handleData(Object obj) {
        C34654d dVar = (C34654d) obj;
        super.handleData(dVar);
        if (dVar != null) {
            boolean z = true;
            String str = null;
            if (!this.f89278d) {
                C34004b a = C34004b.m77717a();
                C52711k.m112236a((Object) a, "AwemeImManager.instance()");
                if (a.mo71949f().checkIMInsertRecommendContact()) {
                    C34004b a2 = C34004b.m77717a();
                    C52711k.m112236a((Object) a2, "AwemeImManager.instance()");
                    C35460j f = a2.mo71949f();
                    C52711k.m112236a((Object) f, "AwemeImManager.instance().proxy");
                    int recommendContactPosition = f.getRecommendContactPosition();
                    if (recommendContactPosition > 0) {
                        if (dVar.f89268a.size() > recommendContactPosition) {
                            dVar.f89268a.add(recommendContactPosition, new RecommendContact(null, 1, null));
                        } else {
                            dVar.f89268a.add(new RecommendContact(null, 1, null));
                        }
                    }
                }
                List<User> list = dVar.f89268a;
                C52711k.m112236a((Object) list, "userList");
                if ((!list.isEmpty()) && !(dVar.f89268a.get(0) instanceof C34660g)) {
                    dVar.f89268a.add(0, new C34660g());
                }
            }
            this.f89276b = dVar.f89270c;
            Collection collection = dVar.f89268a;
            if (collection != null && !collection.isEmpty()) {
                z = false;
            }
            if (z) {
                dVar.f89271d = false;
            }
            this.mData = dVar;
            C34004b a3 = C34004b.m77717a();
            C52711k.m112236a((Object) a3, "AwemeImManager.instance()");
            C35460j f2 = a3.mo71949f();
            Object obj2 = this.mData;
            C52711k.m112236a(obj2, "mData");
            String str2 = ((C34654d) obj2).f89269b;
            LogPbBean logPbBean = ((C34654d) this.mData).f89273f;
            if (logPbBean != null) {
                str = logPbBean.getImprId();
            }
            f2.saveLogPb(str2, str);
        }
    }
}
