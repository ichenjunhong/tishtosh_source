package com.p683ss.android.ugc.aweme.p1807im.sdk.feedupdate;

import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35268h;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.CancellationException;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdateApiManager */
public final class FeedUpdateApiManager {

    /* renamed from: a */
    private static UpdateTagApi f88287a = ((UpdateTagApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C35268h.f90601b).create(UpdateTagApi.class));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdateApiManager$UpdateTagApi */
    interface UpdateTagApi {
        @C53075f(mo110603a = "im/unreaditems/")
        C0013i<FeedUpdate> fetchFeedUpdate(@C53089t(mo110619a = "cursor") long j);
    }

    /* renamed from: a */
    public static FeedUpdate m77979a(long j) {
        try {
            C0013i fetchFeedUpdate = f88287a.fetchFeedUpdate(0);
            fetchFeedUpdate.mo36g();
            if (fetchFeedUpdate.mo33d()) {
                throw fetchFeedUpdate.mo35f();
            } else if (!fetchFeedUpdate.mo31c()) {
                return (FeedUpdate) fetchFeedUpdate.mo34e();
            } else {
                throw new CancellationException();
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
