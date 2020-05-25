package com.p683ss.android.ugc.aweme.follow.api;

import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.experiment.FollowFeedV2UseGetExperiment;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.ExecutionException;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.follow.api.b */
public final class C31861b {

    /* renamed from: a */
    public static IRetrofitService f83242a;

    /* renamed from: b */
    public static FollowFeedApiV2 f83243b;

    /* renamed from: c */
    public static final C31862a f83244c = new C31862a(null);

    /* renamed from: com.ss.android.ugc.aweme.follow.api.b$a */
    public static final class C31862a {
        private C31862a() {
        }

        public /* synthetic */ C31862a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static FollowFeedList m74261a(int i, long j, int i2, int i3, int i4, int i5, long j2, int i6, String str, String str2, String str3, String str4, String str5, int i7, int i8, int i9, int i10, int i11, int i12, Integer num) {
            try {
                if (FollowFeedV2UseGetExperiment.m69595a()) {
                    FollowFeedApiV2 followFeedApiV2 = C31861b.f83243b;
                    C37940g a = C37940g.m84832a();
                    C52711k.m112236a((Object) a, "RecUserImpressionReporter.getInstance()");
                    Object obj = followFeedApiV2.getFollowFeedListNew(i, j, i2, 20, i4, i5, j2, a.mo77416b(), str3, str4, str5, i10, C23794bh.m58376B().mo75770a(), i9, i11, null, null, null, null, null, null, Integer.valueOf(i12), num).get();
                    C52711k.m112236a(obj, "api.getFollowFeedListNew…hAfterVcdAuthorize).get()");
                    return (FollowFeedList) obj;
                }
                FollowFeedApiV2 followFeedApiV22 = C31861b.f83243b;
                C37940g a2 = C37940g.m84832a();
                C52711k.m112236a((Object) a2, "RecUserImpressionReporter.getInstance()");
                Object obj2 = followFeedApiV22.getFollowFeedList(i, j, i2, 20, i4, i5, j2, a2.mo77416b(), str3, str4, str5, str, str2, i10, C23794bh.m58376B().mo75770a(), i9, i11, null, null, null, null, null, null, Integer.valueOf(i12), num).get();
                C52711k.m112236a(obj2, "api.getFollowFeedList(re…hAfterVcdAuthorize).get()");
                return (FollowFeedList) obj2;
            } catch (ExecutionException e) {
                RuntimeException propagateCompatibleException = C31861b.f83242a.propagateCompatibleException(e);
                C52711k.m112236a((Object) propagateCompatibleException, "retrofitService.propagateCompatibleException(e)");
                throw propagateCompatibleException;
            }
        }
    }

    static {
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIRetrofitServicebyMonsterPlugin, "ServiceManager.get().get…rofitService::class.java)");
        IRetrofitService iRetrofitService = createIRetrofitServicebyMonsterPlugin;
        f83242a = iRetrofitService;
        Object create = iRetrofitService.createNewRetrofit(C18845b.f52040e).create(FollowFeedApiV2.class);
        C52711k.m112236a(create, "retrofitService.createNe…lowFeedApiV2::class.java)");
        f83243b = (FollowFeedApiV2) create;
    }
}
