package com.p683ss.android.ugc.aweme.notification.newstyle.p2023c.p2024a;

import android.os.Handler;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.api.C23453a;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import com.p683ss.android.ugc.aweme.notification.followrequest.model.FollowRequestResponse;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c.a.a */
public final class C38318a extends C26832a<FollowRequestResponse> {

    /* renamed from: e */
    public static final C38319a f97534e = new C38319a(null);

    /* renamed from: a */
    public long f97535a;

    /* renamed from: b */
    public long f97536b;

    /* renamed from: c */
    public boolean f97537c;

    /* renamed from: d */
    public boolean f97538d;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c.a.a$a */
    public static final class C38319a {
        private C38319a() {
        }

        public /* synthetic */ C38319a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c.a.a$b */
    static final class C38320b<V> implements Callable<FollowRequestResponse> {

        /* renamed from: a */
        final /* synthetic */ long f97539a;

        /* renamed from: b */
        final /* synthetic */ long f97540b;

        /* renamed from: c */
        final /* synthetic */ int f97541c;

        C38320b(long j, long j2, int i) {
            this.f97539a = j;
            this.f97540b = j2;
            this.f97541c = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FollowRequestResponse call() {
            try {
                return FollowRequestApiManager.m85373a(this.f97539a, this.f97540b, this.f97541c);
            } catch (ExecutionException e) {
                RuntimeException compatibleException = C23453a.getCompatibleException(e);
                C52711k.m112236a((Object) compatibleException, "getCompatibleException(e)");
                throw compatibleException;
            }
        }
    }

    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        return true;
    }

    /* renamed from: a */
    public final void mo78271a() {
        this.f97538d = true;
        this.f97537c = false;
        mo78272a(System.currentTimeMillis() / 1000, 1, 0);
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
        if (!this.f97537c || this.mData == null) {
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
    public final void mo78272a(long j, long j2, int i) {
        C23566n a = C23566n.m57766a();
        Handler handler = this.mHandler;
        C38320b bVar = new C38320b(j, j2, i);
        a.mo48750a(handler, bVar, 0);
    }
}
