package com.p683ss.android.ugc.aweme.feed;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.feed.api.FeedApi;
import com.p683ss.android.ugc.aweme.feed.cache.C30176c;
import com.p683ss.android.ugc.aweme.feed.cache.IFeedApi;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.feed.netdetector.C30539a;
import com.p683ss.android.ugc.aweme.feed.netdetector.C30550b;
import com.p683ss.android.ugc.aweme.feed.netdetector.C30551c;
import com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.C30566f;
import com.p683ss.android.ugc.aweme.feed.netdetector.p1734a.C30546b;
import com.p683ss.android.ugc.aweme.feed.netdetector.p1734a.C30547c;
import com.p683ss.android.ugc.aweme.feed.netdetector.p1734a.C30548d;
import com.p683ss.android.ugc.aweme.feed.netdetector.p1734a.C30549e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.FeedApiService */
public class FeedApiService implements IFeedApi {
    /* renamed from: a */
    public static IFeedApi m70129a() {
        Object a = C27991b.m66756a(IFeedApi.class);
        if (a != null) {
            return (IFeedApi) a;
        }
        return new FeedApiService();
    }

    /* renamed from: a */
    static final /* synthetic */ FeedItemList m70130a(int i, long j, long j2, int i2, Integer num, String str, int i3, int i4, String str2, String str3, String str4, long j3, C30176c cVar) {
        try {
            return FeedApi.m70732a(i, j, j2, i2, num, str, i3, i4, str2, str3, str4, j3, cVar);
        } catch (Throwable th) {
            throw new C30548d(th);
        }
    }

    public FeedItemList fetchFeedList(int i, long j, long j2, int i2, Integer num, String str, int i3, int i4, String str2, String str3, String str4, long j3, C30176c cVar) throws Exception {
        C30546b bVar;
        if ((C30550b.m71529a() & C30551c.m71532a(C11010c.m22280a())) && C30550b.m71530a(i, i3)) {
            C30539a aVar = C30539a.f79807b;
            C30549e fVar = new C30566f(C30539a.f79807b.mo62735a());
            C52711k.m112240b(fVar, "requestDetectInterceptor");
            if (C30550b.m71529a()) {
                aVar.mo62735a().mo62746a(fVar);
            }
            bVar = fVar;
        } else {
            bVar = null;
        }
        C30546b bVar2 = bVar;
        C30684q qVar = r1;
        C30684q qVar2 = new C30684q(i, j, j2, i2, num, str, i3, i4, str2, str3, str4, j3, cVar);
        return (FeedItemList) C30547c.m71527a(bVar2, qVar);
    }
}
