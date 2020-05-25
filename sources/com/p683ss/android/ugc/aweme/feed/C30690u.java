package com.p683ss.android.ugc.aweme.feed;

import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.feed.model.FeedAppLogParams;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.u */
public final class C30690u {

    /* renamed from: a */
    public static final C30690u f80319a = new C30690u();

    /* renamed from: com.ss.android.ugc.aweme.feed.u$a */
    static final class C30691a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ int f80320a;

        /* renamed from: b */
        final /* synthetic */ FeedAppLogParams f80321b;

        /* renamed from: c */
        final /* synthetic */ boolean f80322c;

        /* renamed from: d */
        final /* synthetic */ long f80323d;

        /* renamed from: e */
        final /* synthetic */ boolean f80324e;

        /* renamed from: f */
        final /* synthetic */ String f80325f;

        /* renamed from: g */
        final /* synthetic */ String f80326g;

        C30691a(int i, FeedAppLogParams feedAppLogParams, boolean z, long j, boolean z2, String str, String str2) {
            this.f80320a = i;
            this.f80321b = feedAppLogParams;
            this.f80322c = z;
            this.f80323d = j;
            this.f80324e = z2;
            this.f80325f = str;
            this.f80326g = str2;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00c9  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
                r8 = this;
                java.lang.String r0 = "0"
                int r1 = r8.f80320a
                r2 = 0
                r3 = -1
                r4 = 1
                if (r1 != r4) goto L_0x00b4
                com.ss.android.ugc.aweme.feed.model.FeedAppLogParams r1 = r8.f80321b
                if (r1 == 0) goto L_0x00b4
                com.ss.android.ugc.aweme.feed.model.FeedAppLogParams r1 = r8.f80321b
                com.ss.android.ugc.aweme.feed.model.FeedItemList r1 = r1.mLastFeedItemList
                if (r1 == 0) goto L_0x00b4
                com.ss.android.ugc.aweme.feed.model.FeedAppLogParams r1 = r8.f80321b
                com.ss.android.ugc.aweme.feed.model.FeedItemList r1 = r1.mLastFeedItemList
                java.lang.String r4 = "params.feedItemList"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
                java.util.List r1 = r1.getItems()
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)
                if (r1 != 0) goto L_0x00b4
                com.ss.android.ugc.aweme.feed.model.FeedAppLogParams r0 = r8.f80321b     // Catch:{ Exception -> 0x008a }
                com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = r0.mLastFeedItemList     // Catch:{ Exception -> 0x008a }
                java.lang.String r1 = "params.feedItemList"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)     // Catch:{ Exception -> 0x008a }
                java.util.List r0 = r0.getItems()     // Catch:{ Exception -> 0x008a }
                java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x008a }
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r0     // Catch:{ Exception -> 0x008a }
                if (r0 == 0) goto L_0x0092
                com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()     // Catch:{ Exception -> 0x008a }
                if (r0 == 0) goto L_0x0092
                com.ss.android.ugc.aweme.feed.model.VideoUrlModel r1 = r0.getPlayAddr()     // Catch:{ Exception -> 0x008a }
                if (r1 == 0) goto L_0x0092
                com.ss.android.ugc.aweme.feed.model.VideoUrlModel r1 = r0.getPlayAddr()     // Catch:{ Exception -> 0x008a }
                java.lang.String r2 = "video.playAddr"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ Exception -> 0x008a }
                java.util.List r1 = r1.getUrlList()     // Catch:{ Exception -> 0x008a }
                int r1 = r1.size()     // Catch:{ Exception -> 0x008a }
                com.ss.android.ugc.aweme.base.model.UrlModel r2 = r0.getCover()     // Catch:{ Exception -> 0x0088 }
                if (r2 == 0) goto L_0x0091
                com.ss.android.ugc.aweme.base.model.UrlModel r2 = r0.getCover()     // Catch:{ Exception -> 0x0088 }
                java.lang.String r4 = "video.cover"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)     // Catch:{ Exception -> 0x0088 }
                java.util.List r2 = r2.getUrlList()     // Catch:{ Exception -> 0x0088 }
                java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ Exception -> 0x0088 }
                boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)     // Catch:{ Exception -> 0x0088 }
                if (r2 != 0) goto L_0x0091
                com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getCover()     // Catch:{ Exception -> 0x0088 }
                java.lang.String r2 = "video.cover"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)     // Catch:{ Exception -> 0x0088 }
                java.util.List r0 = r0.getUrlList()     // Catch:{ Exception -> 0x0088 }
                int r0 = r0.size()     // Catch:{ Exception -> 0x0088 }
                r3 = r1
                goto L_0x0093
            L_0x0088:
                r0 = move-exception
                goto L_0x008c
            L_0x008a:
                r0 = move-exception
                r1 = -1
            L_0x008c:
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r0)
            L_0x0091:
                r3 = r1
            L_0x0092:
                r0 = -1
            L_0x0093:
                com.ss.android.ugc.aweme.feed.model.FeedAppLogParams r1 = r8.f80321b
                com.ss.android.ugc.aweme.feed.model.FeedItemList r1 = r1.mLastFeedItemList
                java.lang.String r2 = "params.feedItemList"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                int r2 = r1.blockCode
                com.ss.android.ugc.aweme.feed.model.FeedAppLogParams r1 = r8.f80321b
                com.ss.android.ugc.aweme.feed.model.FeedItemList r1 = r1.mLastFeedItemList
                java.lang.String r4 = "params.feedItemList"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
                java.lang.String r1 = r1.getRequestId()
                java.lang.String r4 = "params.feedItemList.requestId"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
                r7 = r1
                r1 = r0
                r0 = r7
                goto L_0x00b5
            L_0x00b4:
                r1 = -1
            L_0x00b5:
                com.ss.android.ugc.aweme.app.f.d r4 = new com.ss.android.ugc.aweme.app.f.d
                r4.<init>()
                java.lang.String r5 = "request_id"
                com.ss.android.ugc.aweme.app.f.d r0 = r4.mo47829a(r5, r0)
                java.lang.String r4 = "is_success"
                boolean r5 = r8.f80322c
                if (r5 != 0) goto L_0x00c9
                int r5 = r8.f80320a
                goto L_0x00ca
            L_0x00c9:
                r5 = 2
            L_0x00ca:
                java.lang.String r5 = java.lang.String.valueOf(r5)
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r5)
                java.lang.String r4 = "duration"
                long r5 = r8.f80323d
                java.lang.String r5 = java.lang.String.valueOf(r5)
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r5)
                java.lang.String r4 = "is_first"
                boolean r5 = r8.f80324e
                java.lang.String r5 = java.lang.String.valueOf(r5)
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r5)
                java.lang.String r4 = "request_method"
                java.lang.String r5 = r8.f80325f
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r5)
                java.lang.String r4 = "feed_tab"
                java.lang.String r5 = r8.f80326g
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r5)
                java.lang.String r4 = "video_num"
                java.lang.String r3 = java.lang.String.valueOf(r3)
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r3)
                java.lang.String r3 = "image_num"
                java.lang.String r1 = java.lang.String.valueOf(r1)
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r3, r1)
                java.lang.String r1 = "blockCode"
                java.lang.String r2 = java.lang.String.valueOf(r2)
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                java.lang.String r1 = "feed_request_response_test_v3"
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>(r0)
                com.p683ss.android.ugc.aweme.app.C23131p.m57779a(r1, r2)
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.C30690u.C30691a.call():java.lang.Void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.u$b */
    static final class C30692b<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ boolean f80327a;

        /* renamed from: b */
        final /* synthetic */ int f80328b;

        /* renamed from: c */
        final /* synthetic */ long f80329c;

        /* renamed from: d */
        final /* synthetic */ FeedAppLogParams f80330d;

        /* renamed from: e */
        final /* synthetic */ String f80331e;

        /* renamed from: f */
        final /* synthetic */ long f80332f;

        C30692b(boolean z, int i, long j, FeedAppLogParams feedAppLogParams, String str, long j2) {
            this.f80327a = z;
            this.f80328b = i;
            this.f80329c = j;
            this.f80330d = feedAppLogParams;
            this.f80331e = str;
            this.f80332f = j2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            String str;
            String str2;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("is_first", String.valueOf(this.f80327a));
                jSONObject.put("is_success", String.valueOf(this.f80328b));
                if (this.f80327a) {
                    jSONObject.put("app_to_success", String.valueOf(this.f80329c));
                }
                if (this.f80330d == null || this.f80330d.mLastFeedItemList == null) {
                    jSONObject.put("cache_count", TEVideoRecorder.FACE_BEAUTY_NULL);
                    jSONObject.put("is_cache", TEVideoRecorder.FACE_BEAUTY_NULL);
                    jSONObject.put("cache_time", TEVideoRecorder.FACE_BEAUTY_NULL);
                } else {
                    FeedItemList feedItemList = this.f80330d.mLastFeedItemList;
                    C52711k.m112236a((Object) feedItemList, "params.feedItemList");
                    boolean z = feedItemList.isFromLocalCache;
                    jSONObject.put("is_cache", String.valueOf(z));
                    String str3 = "cache_count";
                    if (z) {
                        FeedItemList feedItemList2 = this.f80330d.mLastFeedItemList;
                        C52711k.m112236a((Object) feedItemList2, "params.feedItemList");
                        str = String.valueOf(feedItemList2.getItems().size());
                    } else {
                        str = "-1";
                    }
                    jSONObject.put(str3, str);
                    String str4 = "cache_time";
                    if (z) {
                        str2 = String.valueOf(C23542f.m57715a().mo48700a("key_feed_cache_time", 0));
                    } else {
                        str2 = "";
                    }
                    jSONObject.put(str4, str2);
                    if (z) {
                        jSONObject.put("cache_aid", C30436k.m71361a(this.f80330d.mLastFeedItemList));
                    }
                }
                jSONObject.put("request_method", this.f80331e);
                jSONObject.put("duration", String.valueOf(this.f80332f));
            } catch (JSONException unused) {
            }
            C23131p.m57779a("feed_cache_response", jSONObject);
            return null;
        }
    }

    private C30690u() {
    }
}
