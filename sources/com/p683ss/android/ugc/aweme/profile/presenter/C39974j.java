package com.p683ss.android.ugc.aweme.profile.presenter;

import android.os.Handler;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.api.C23453a;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.followrequest.api.FollowRequestApiManager;
import com.p683ss.android.ugc.aweme.followrequest.model.FollowRequestResponse;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.j */
public final class C39974j extends C26832a<FollowRequestResponse> {

    /* renamed from: e */
    public static final C39975a f101914e = new C39975a(null);

    /* renamed from: a */
    public long f101915a;

    /* renamed from: b */
    public long f101916b;

    /* renamed from: c */
    public boolean f101917c;

    /* renamed from: d */
    public boolean f101918d;

    /* renamed from: com.ss.android.ugc.aweme.profile.presenter.j$a */
    public static final class C39975a {
        private C39975a() {
        }

        public /* synthetic */ C39975a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.presenter.j$b */
    static final class C39976b<V> implements Callable<FollowRequestResponse> {

        /* renamed from: a */
        final /* synthetic */ long f101919a;

        /* renamed from: b */
        final /* synthetic */ long f101920b;

        /* renamed from: c */
        final /* synthetic */ int f101921c;

        C39976b(long j, long j2, int i) {
            this.f101919a = j;
            this.f101920b = j2;
            this.f101921c = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FollowRequestResponse call() {
            try {
                return FollowRequestApiManager.m74704a(this.f101919a, this.f101920b, this.f101921c);
            } catch (ExecutionException e) {
                RuntimeException compatibleException = C23453a.getCompatibleException(e);
                C52711k.m112236a((Object) compatibleException, "ModelChecker.getCompatibleException(e)");
                throw compatibleException;
            }
        }
    }

    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        return true;
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        FollowRequestResponse followRequestResponse = (FollowRequestResponse) obj;
        if (followRequestResponse == null) {
            this.mData = null;
            return;
        }
        Collection collection = followRequestResponse.userRequestList;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            followRequestResponse.hasMore = false;
        }
        if (!this.f101917c || this.mData == null) {
            this.mData = followRequestResponse;
            return;
        }
        ((FollowRequestResponse) this.mData).maxTime = followRequestResponse.maxTime;
        ((FollowRequestResponse) this.mData).minTime = followRequestResponse.minTime;
        ((FollowRequestResponse) this.mData).hasMore = followRequestResponse.hasMore;
        List<User> list = ((FollowRequestResponse) this.mData).userRequestList;
        List<User> list2 = followRequestResponse.userRequestList;
        C52711k.m112236a((Object) list2, "data.userRequestList");
        list.addAll(list2);
    }

    /* renamed from: a */
    public final void mo81881a(long j, long j2, int i) {
        C23566n a = C23566n.m57766a();
        Handler handler = this.mHandler;
        C39976b bVar = new C39976b(j, j2, 20);
        a.mo48750a(handler, bVar, 0);
    }
}
