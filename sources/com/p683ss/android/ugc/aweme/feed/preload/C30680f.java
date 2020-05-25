package com.p683ss.android.ugc.aweme.feed.preload;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.feed.C30436k;
import com.p683ss.android.ugc.aweme.feed.FeedApiService;
import com.p683ss.android.ugc.aweme.feed.cache.C30163b;
import com.p683ss.android.ugc.aweme.feed.cache.C30176c;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.feed.preload.f */
public final class C30680f implements C30678d<FeedItemList> {

    /* renamed from: b */
    public static volatile boolean f80294b;

    /* renamed from: a */
    FeedItemList f80295a;

    /* renamed from: c */
    private volatile C0013i f80296c;

    /* renamed from: d */
    private volatile boolean f80297d;

    /* renamed from: d */
    private void m71960d() {
        this.f80296c = null;
        this.f80295a = null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001d */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p683ss.android.ugc.aweme.feed.model.FeedItemList mo63254b() {
        /*
            r1 = this;
            a.i r0 = r1.f80296c
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = r1.f80295a
            if (r0 == 0) goto L_0x0010
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = r1.f80295a
            r1.m71960d()
            return r0
        L_0x0010:
            a.i r0 = r1.f80296c
            boolean r0 = r0.mo26b()
            if (r0 != 0) goto L_0x001d
            a.i r0 = r1.f80296c     // Catch:{ InterruptedException -> 0x001d }
            r0.mo36g()     // Catch:{ InterruptedException -> 0x001d }
        L_0x001d:
            a.i r0 = r1.f80296c     // Catch:{ Exception -> 0x0022 }
            r0.mo33d()     // Catch:{ Exception -> 0x0022 }
        L_0x0022:
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = r1.f80295a
            r1.m71960d()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.preload.C30680f.mo63254b():com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    /* renamed from: a */
    public final void mo63253a() {
        if (!this.f80297d) {
            synchronized (this) {
                if (!this.f80297d) {
                    this.f80297d = true;
                    this.f80296c = C0013i.m18a((Callable<TResult>) new Callable<FeedItemList>() {
                        public final /* synthetic */ Object call() throws Exception {
                            int i;
                            C30680f fVar = C30680f.this;
                            if (!C30683g.m71964a(C11010c.m22280a())) {
                                return null;
                            }
                            if (C30680f.f80294b) {
                                C30680f.f80294b = false;
                                return null;
                            }
                            if (C30436k.m71375f()) {
                                i = 4;
                            } else {
                                i = 0;
                            }
                            C306811 r21 = r2;
                            C306811 r2 = new C30176c() {
                                /* renamed from: a */
                                public final String mo60464a() {
                                    C22574a.m55738f().mo46917a("feed_wait_feed_cache", false);
                                    if (!C30163b.f78729c) {
                                        try {
                                            C30163b.f78730d.await(500, TimeUnit.MILLISECONDS);
                                        } catch (InterruptedException unused) {
                                        }
                                    }
                                    C22574a.m55738f().mo46921b("feed_wait_feed_cache", false);
                                    return C30163b.f78731e;
                                }
                            };
                            FeedItemList fetchFeedList = FeedApiService.m70129a().fetchFeedList(0, 0, 0, 6, null, null, i, 0, "", null, null, 0, r21);
                            if (C30163b.m70783j() && fetchFeedList != null) {
                                fetchFeedList.appendCache = C30163b.m70771a();
                            }
                            if (fetchFeedList != null) {
                                C36173w.m81665a().getLiveStateManager().mo74802a(fetchFeedList.getItems());
                            }
                            fVar.f80295a = fetchFeedList;
                            return fetchFeedList;
                        }
                    }, (Executor) C24076h.m58902c());
                }
            }
        }
    }
}
