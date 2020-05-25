package com.p683ss.android.ugc.aweme.feed;

import android.os.SystemClock;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.feed.cache.C30163b;
import com.p683ss.android.ugc.aweme.feed.model.FeedAppLogParams;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.p1382aq.p1384b.C23223a;
import com.p683ss.android.ugc.aweme.utils.C47831dv;
import com.p683ss.android.ugc.aweme.utils.C47832dw;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.v */
public final class C31219v {

    /* renamed from: b */
    public static final int f81665b = 200;

    /* renamed from: c */
    public static final C31220a f81666c = new C31220a(null);

    /* renamed from: f */
    private static final String f81667f = f81667f;

    /* renamed from: a */
    public volatile boolean f81668a = C47832dw.m103471a().mo95066a(C47831dv.FEED_REQ);

    /* renamed from: d */
    private long f81669d;

    /* renamed from: e */
    private final Fragment f81670e;

    /* renamed from: com.ss.android.ugc.aweme.feed.v$a */
    public static final class C31220a {
        private C31220a() {
        }

        public /* synthetic */ C31220a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.v$b */
    static final class C31221b<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ C31219v f81671a;

        /* renamed from: b */
        final /* synthetic */ int f81672b;

        /* renamed from: c */
        final /* synthetic */ FeedAppLogParams f81673c;

        /* renamed from: d */
        final /* synthetic */ Exception f81674d;

        /* renamed from: e */
        final /* synthetic */ long f81675e;

        /* renamed from: f */
        final /* synthetic */ String f81676f;

        /* renamed from: g */
        final /* synthetic */ String f81677g;

        /* renamed from: h */
        final /* synthetic */ String f81678h;

        /* renamed from: i */
        final /* synthetic */ String f81679i;

        /* renamed from: j */
        final /* synthetic */ boolean f81680j;

        /* renamed from: k */
        final /* synthetic */ long f81681k;

        C31221b(C31219v vVar, int i, FeedAppLogParams feedAppLogParams, Exception exc, long j, String str, String str2, String str3, String str4, boolean z, long j2) {
            this.f81671a = vVar;
            this.f81672b = i;
            this.f81673c = feedAppLogParams;
            this.f81674d = exc;
            this.f81675e = j;
            this.f81676f = str;
            this.f81677g = str2;
            this.f81678h = str3;
            this.f81679i = str4;
            this.f81680j = z;
            this.f81681k = j2;
        }

        public final /* synthetic */ Object call() {
            return this.f81671a.mo64021a(this.f81672b, this.f81673c, this.f81674d, this.f81675e, this.f81676f, this.f81677g, this.f81678h, this.f81679i, this.f81680j, this.f81681k);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.v$c */
    static final class C31222c<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ C31219v f81682a;

        /* renamed from: b */
        final /* synthetic */ String f81683b;

        /* renamed from: c */
        final /* synthetic */ String f81684c;

        /* renamed from: d */
        final /* synthetic */ String f81685d;

        /* renamed from: e */
        final /* synthetic */ String f81686e;

        C31222c(C31219v vVar, String str, String str2, String str3, String str4) {
            this.f81682a = vVar;
            this.f81683b = str;
            this.f81684c = str2;
            this.f81685d = str3;
            this.f81686e = str4;
        }

        public final /* synthetic */ Object call() {
            JSONObject a = new C26898j().mo54849a("is_first", String.valueOf(this.f81682a.f81668a ? 1 : 0)).mo54849a("feed_tab", this.f81683b).mo54849a("top_activity", this.f81684c).mo54849a("request_method", this.f81685d).mo54849a("duration", this.f81686e).mo54850a();
            C26890h.onEvent(MobClick.obtain().setEventName("feed_request").setLabelName("perf_monitor").setJsonObject(a));
            C26890h.m65014b("feed_request", a);
            C23223a.m57035a("feed_request", a);
            return null;
        }
    }

    public C31219v(Fragment fragment) {
        this.f81670e = fragment;
    }

    /* renamed from: a */
    public final void mo64024a(String str) {
        C52711k.m112240b(str, "requestMethod");
        this.f81669d = SystemClock.elapsedRealtime();
        long j = C29978a.f78230a;
        long j2 = 0;
        C29978a.f78230a = 0;
        if (j > 0) {
            j2 = SystemClock.elapsedRealtime() - j;
        }
        String l = Long.toString(j2);
        C31222c cVar = new C31222c(this, C30578o.m71569c(), C30578o.m71570d(), str, l);
        C0013i.m18a((Callable<TResult>) cVar, (Executor) C26890h.m65003a());
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0094 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005f A[Catch:{ Exception -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072 A[Catch:{ Exception -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0075 A[Catch:{ Exception -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cb A[Catch:{ Exception -> 0x01fb }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p683ss.android.ugc.aweme.feed.C29983ab m72909a(org.json.JSONObject r7, com.p683ss.android.ugc.aweme.feed.model.FeedAppLogParams r8) {
        /*
            r0 = 1
            java.lang.String r1 = "flag"
            r7.put(r1, r0)     // Catch:{ JSONException -> 0x0007 }
            goto L_0x000d
        L_0x0007:
            r1 = move-exception
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r1)
        L_0x000d:
            r1 = -1
            if (r8 == 0) goto L_0x0205
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r8.mItems     // Catch:{ Exception -> 0x01fd }
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ Exception -> 0x01fd }
            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)     // Catch:{ Exception -> 0x01fd }
            if (r2 != 0) goto L_0x0051
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r8.mItems     // Catch:{ Exception -> 0x01fd }
            r3 = 0
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x01fd }
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r2     // Catch:{ Exception -> 0x01fd }
            if (r2 == 0) goto L_0x0051
            com.ss.android.ugc.aweme.feed.model.Video r2 = r2.getVideo()     // Catch:{ Exception -> 0x01fd }
            if (r2 == 0) goto L_0x0051
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r3 = r2.getPlayAddr()     // Catch:{ Exception -> 0x01fd }
            if (r3 == 0) goto L_0x0051
            java.util.List r3 = r3.getUrlList()     // Catch:{ Exception -> 0x01fd }
            int r3 = r3.size()     // Catch:{ Exception -> 0x01fd }
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getCover()     // Catch:{ Exception -> 0x004d }
            if (r2 == 0) goto L_0x004a
            java.util.List r2 = r2.getUrlList()     // Catch:{ Exception -> 0x004d }
            if (r2 == 0) goto L_0x004a
            int r2 = r2.size()     // Catch:{ Exception -> 0x004d }
            r1 = r2
        L_0x004a:
            r2 = r1
            r1 = r3
            goto L_0x0052
        L_0x004d:
            r7 = move-exception
            r1 = r3
            goto L_0x01fe
        L_0x0051:
            r2 = -1
        L_0x0052:
            com.ss.android.ugc.aweme.feed.model.FeedItemList r8 = r8.mLastFeedItemList     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "params.feedItemList"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r3)     // Catch:{ Exception -> 0x01fb }
            java.lang.Long r8 = r8.getNetworkInfoKey()     // Catch:{ Exception -> 0x01fb }
            if (r8 == 0) goto L_0x0072
            r8.longValue()     // Catch:{ Exception -> 0x01fb }
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.ugc.aweme.feed.api.l> r3 = com.p683ss.android.ugc.aweme.feed.api.C30155m.f78706a     // Catch:{ Exception -> 0x01fb }
            java.lang.Object r3 = r3.get(r8)     // Catch:{ Exception -> 0x01fb }
            com.ss.android.ugc.aweme.feed.api.l r3 = (com.p683ss.android.ugc.aweme.feed.api.C30154l) r3     // Catch:{ Exception -> 0x01fb }
            if (r3 == 0) goto L_0x0073
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.ugc.aweme.feed.api.l> r4 = com.p683ss.android.ugc.aweme.feed.api.C30155m.f78706a     // Catch:{ Exception -> 0x01fb }
            r4.remove(r8)     // Catch:{ Exception -> 0x01fb }
            goto L_0x0073
        L_0x0072:
            r3 = 0
        L_0x0073:
            if (r3 == 0) goto L_0x0206
            java.lang.String r8 = "networkExtraInfo"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r8)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r8 = "netInfo"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r8)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r8 = r3.f78703a     // Catch:{ Exception -> 0x01fb }
            java.lang.String r4 = ""
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0094 }
            java.lang.String r6 = r3.f78705c     // Catch:{ MalformedURLException -> 0x0094 }
            r5.<init>(r6)     // Catch:{ MalformedURLException -> 0x0094 }
            java.lang.String r5 = r5.getHost()     // Catch:{ MalformedURLException -> 0x0094 }
            java.lang.String r6 = "urlObj.host"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)     // Catch:{ MalformedURLException -> 0x0094 }
            r4 = r5
        L_0x0094:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x01fb }
            r5.<init>(r8)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r8 = "flag"
            r6 = 2
            r7.put(r8, r6)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r8 = "status_code"
            r6 = 200(0xc8, float:2.8E-43)
            r7.put(r8, r6)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r8 = "retry_times"
            java.lang.Integer r3 = r3.f78704b     // Catch:{ Exception -> 0x01fb }
            r7.put(r8, r3)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r8 = "host"
            r7.put(r8, r4)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r8 = "redirect_times"
            java.lang.String r3 = "base"
            org.json.JSONObject r3 = r5.optJSONObject(r3)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r4 = "redirect_times"
            int r3 = r3.optInt(r4)     // Catch:{ Exception -> 0x01fb }
            r7.put(r8, r3)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r8 = "redirect_times"
            int r8 = r7.optInt(r8)     // Catch:{ Exception -> 0x01fb }
            if (r8 <= 0) goto L_0x0104
            java.lang.String r8 = "base"
            org.json.JSONObject r8 = r5.optJSONObject(r8)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "redirecting_list"
            org.json.JSONArray r8 = r8.optJSONArray(r3)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "redirect_times"
            int r3 = r7.optInt(r3)     // Catch:{ Exception -> 0x01fb }
            int r3 = r3 - r0
            java.lang.String r8 = r8.optString(r3)     // Catch:{ Exception -> 0x01fb }
            r0 = r8
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x01fb }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x01fb }
            if (r0 != 0) goto L_0x0104
            java.lang.String r0 = "host"
            java.lang.String r3 = "newHost"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r3)     // Catch:{ Exception -> 0x01fb }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "https?://"
            d.m.l r4 = new d.m.l     // Catch:{ Exception -> 0x01fb }
            r4.<init>(r3)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = ""
            java.lang.String r8 = r4.replace(r8, r3)     // Catch:{ Exception -> 0x01fb }
            r7.put(r0, r8)     // Catch:{ Exception -> 0x01fb }
        L_0x0104:
            java.lang.String r8 = "socket_reuse"
            java.lang.String r0 = "socket"
            org.json.JSONObject r0 = r5.optJSONObject(r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "socket_reused"
            boolean r0 = r0.getBoolean(r3)     // Catch:{ Exception -> 0x01fb }
            r7.put(r8, r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r8 = "handshake"
            java.lang.String r0 = "ssl"
            org.json.JSONObject r0 = r5.optJSONObject(r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "handshake_type"
            int r0 = r0.optInt(r3)     // Catch:{ Exception -> 0x01fb }
            r7.put(r8, r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r8 = "conn_status"
            java.lang.String r0 = "ssl"
            org.json.JSONObject r0 = r5.optJSONObject(r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "connection_status"
            int r0 = r0.optInt(r3)     // Catch:{ Exception -> 0x01fb }
            r7.put(r8, r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r8 = "conn_info"
            java.lang.String r0 = "response"
            org.json.JSONObject r0 = r5.optJSONObject(r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "connection_info"
            int r0 = r0.optInt(r3)     // Catch:{ Exception -> 0x01fb }
            r7.put(r8, r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r8 = "rip"
            java.lang.String r0 = "socket"
            org.json.JSONObject r0 = r5.optJSONObject(r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "remote"
            java.lang.String r0 = r0.optString(r3)     // Catch:{ Exception -> 0x01fb }
            r7.put(r8, r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r8 = "ttfb"
            java.lang.String r0 = "timing"
            org.json.JSONObject r0 = r5.optJSONObject(r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "detailed_duration"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "ttfb"
            int r0 = r0.optInt(r3)     // Catch:{ Exception -> 0x01fb }
            r7.put(r8, r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r8 = "dns"
            java.lang.String r0 = "timing"
            org.json.JSONObject r0 = r5.optJSONObject(r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "detailed_duration"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "dns"
            int r0 = r0.optInt(r3)     // Catch:{ Exception -> 0x01fb }
            r7.put(r8, r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r8 = "inner"
            java.lang.String r0 = "timing"
            org.json.JSONObject r0 = r5.optJSONObject(r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "detailed_duration"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "inner"
            int r0 = r0.optInt(r3)     // Catch:{ Exception -> 0x01fb }
            r7.put(r8, r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r8 = "origin"
            java.lang.String r0 = "timing"
            org.json.JSONObject r0 = r5.optJSONObject(r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "detailed_duration"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "origin"
            int r0 = r0.optInt(r3)     // Catch:{ Exception -> 0x01fb }
            r7.put(r8, r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r8 = "proxy"
            java.lang.String r0 = "timing"
            org.json.JSONObject r0 = r5.optJSONObject(r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "detailed_duration"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "proxy"
            int r0 = r0.optInt(r3)     // Catch:{ Exception -> 0x01fb }
            r7.put(r8, r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r8 = "tcp"
            java.lang.String r0 = "timing"
            org.json.JSONObject r0 = r5.optJSONObject(r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "detailed_duration"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "tcp"
            int r0 = r0.optInt(r3)     // Catch:{ Exception -> 0x01fb }
            r7.put(r8, r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r8 = "dur"
            java.lang.String r0 = "timing"
            org.json.JSONObject r0 = r5.optJSONObject(r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "request"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r3 = "duration"
            int r0 = r0.optInt(r3)     // Catch:{ Exception -> 0x01fb }
            r7.put(r8, r0)     // Catch:{ Exception -> 0x01fb }
            goto L_0x0206
        L_0x01fb:
            r7 = move-exception
            goto L_0x01ff
        L_0x01fd:
            r7 = move-exception
        L_0x01fe:
            r2 = -1
        L_0x01ff:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r7)
            goto L_0x0206
        L_0x0205:
            r2 = -1
        L_0x0206:
            com.ss.android.ugc.aweme.feed.ab r7 = new com.ss.android.ugc.aweme.feed.ab
            r7.<init>(r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.C31219v.m72909a(org.json.JSONObject, com.ss.android.ugc.aweme.feed.model.FeedAppLogParams):com.ss.android.ugc.aweme.feed.ab");
    }

    /* renamed from: a */
    public final void mo64022a(int i, String str, FeedAppLogParams feedAppLogParams) {
        boolean z;
        String str2 = str;
        FeedAppLogParams feedAppLogParams2 = feedAppLogParams;
        C52711k.m112240b(str2, "requestMethod");
        C30690u uVar = C30690u.f80319a;
        long j = this.f81669d;
        boolean z2 = this.f81668a;
        if (this.f81670e == null || this.f81670e.getUserVisibleHint()) {
            z = false;
        } else {
            z = true;
        }
        C52711k.m112240b(str2, "requestMethod");
        C30692b bVar = new C30692b(C47832dw.m103471a().mo95066a(C47831dv.FEED_FIRST_REQUEST_RESPONSE), i, SystemClock.elapsedRealtime() - C29978a.f78231b, feedAppLogParams, str, SystemClock.elapsedRealtime() - j);
        C0013i.m18a((Callable<TResult>) bVar, (Executor) C26890h.m65003a());
        if (!(feedAppLogParams2 == null || feedAppLogParams2.mData == null)) {
            FeedItemList feedItemList = feedAppLogParams2.mData;
            C52711k.m112236a((Object) feedItemList, "params.data");
            if (feedItemList.isFromLocalCache) {
                return;
            }
        }
        C30691a aVar = new C30691a(i, feedAppLogParams, z, SystemClock.elapsedRealtime() - j, z2, str, C30578o.m71569c());
        C0013i.m18a((Callable<TResult>) aVar, (Executor) C26890h.m65003a());
    }

    /* renamed from: a */
    public final void mo64023a(int i, String str, FeedAppLogParams feedAppLogParams, Exception exc) {
        int i2;
        C52711k.m112240b(str, "requestMethod");
        boolean z = C30163b.f78734h;
        C30163b.f78734h = false;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f81669d;
        long currentTimeMillis = System.currentTimeMillis();
        String c = C30578o.m71569c();
        String d = C30578o.m71570d();
        if (z) {
            i2 = -1;
        } else if (this.f81668a) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C31221b bVar = new C31221b(this, i, feedAppLogParams, exc, elapsedRealtime, String.valueOf(i2), str, c, d, z, currentTimeMillis);
        C0013i.m18a((Callable<TResult>) bVar, (Executor) C26890h.m65003a());
        if (C30436k.f79558b < 0) {
            C30436k.f79558b = SystemClock.elapsedRealtime();
        }
        if (!z) {
            this.f81668a = false;
        }
        if (i == 1) {
            C30137am.m70725a(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0160  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Void mo64021a(int r16, com.p683ss.android.ugc.aweme.feed.model.FeedAppLogParams r17, java.lang.Exception r18, long r19, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, long r26) {
        /*
            r15 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r21
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r6 = 1
            if (r1 != r6) goto L_0x0015
            com.ss.android.ugc.aweme.feed.ab r0 = m72909a(r5, r2)
            goto L_0x0035
        L_0x0015:
            if (r3 == 0) goto L_0x001b
            com.p683ss.android.ugc.aweme.feed.api.C30155m.m70762a(r3, r5)
            goto L_0x002f
        L_0x001b:
            java.lang.String r0 = "flag"
            r7 = 5
            r5.put(r0, r7)     // Catch:{ JSONException -> 0x0029 }
            java.lang.String r0 = "err_msg"
            java.lang.String r7 = "exception is null"
            r5.put(r0, r7)     // Catch:{ JSONException -> 0x0029 }
            goto L_0x002f
        L_0x0029:
            r0 = move-exception
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r0)
        L_0x002f:
            com.ss.android.ugc.aweme.feed.ab r0 = new com.ss.android.ugc.aweme.feed.ab
            r7 = -1
            r0.<init>(r7, r7)
        L_0x0035:
            int r7 = r0.f78239a
            int r0 = r0.f78240b
            r8 = 0
            r9 = 0
            if (r2 == 0) goto L_0x0048
            com.ss.android.ugc.aweme.feed.model.FeedItemList r2 = r2.mLastFeedItemList
            if (r2 == 0) goto L_0x0048
            int r10 = r2.blockCode
            java.lang.String r2 = r2.getRequestId()
            goto L_0x004a
        L_0x0048:
            r2 = r9
            r10 = 0
        L_0x004a:
            android.content.Context r11 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            if (r1 == r6) goto L_0x0081
            if (r3 != 0) goto L_0x0053
            goto L_0x0081
        L_0x0053:
            java.lang.String r12 = r18.getMessage()
            if (r12 != 0) goto L_0x005b
            java.lang.String r12 = ""
        L_0x005b:
            boolean r13 = com.p683ss.android.ugc.aweme.utils.C47891fl.m103593a(r12)
            if (r13 == 0) goto L_0x007f
            int r13 = r12.length()
            int r14 = f81665b
            if (r13 <= r14) goto L_0x007f
            int r13 = f81665b
            if (r12 == 0) goto L_0x0077
            java.lang.String r8 = r12.substring(r8, r13)
            java.lang.String r12 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r12)
            goto L_0x0082
        L_0x0077:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x007f:
            r8 = r12
            goto L_0x0082
        L_0x0081:
            r8 = r9
        L_0x0082:
            if (r1 != r6) goto L_0x0087
            java.lang.String r3 = "-1"
            goto L_0x0091
        L_0x0087:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            int r3 = com.bytedance.ies.p621b.p622a.C10201a.m20660a(r11, r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L_0x0091:
            com.ss.android.ugc.aweme.common.j r11 = new com.ss.android.ugc.aweme.common.j
            r11.<init>()
            java.lang.String r12 = "is_success"
            java.lang.String r13 = java.lang.String.valueOf(r16)
            r11.mo54849a(r12, r13)
            java.lang.String r12 = "duration"
            java.lang.String r13 = java.lang.String.valueOf(r19)
            r11.mo54849a(r12, r13)
            java.lang.String r12 = "is_first"
            r11.mo54849a(r12, r4)
            java.lang.String r12 = "request_method"
            r13 = r22
            r11.mo54849a(r12, r13)
            java.lang.String r12 = "feed_tab"
            r13 = r23
            r11.mo54849a(r12, r13)
            java.lang.String r12 = "top_activity"
            r13 = r24
            r11.mo54849a(r12, r13)
            java.lang.String r12 = "video_num"
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r11.mo54849a(r12, r7)
            java.lang.String r7 = "image_num"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r11.mo54849a(r7, r0)
            java.lang.String r0 = "blockCode"
            java.lang.String r7 = java.lang.String.valueOf(r10)
            r11.mo54849a(r0, r7)
            java.lang.String r0 = "err_code"
            r11.mo54849a(r0, r3)
            java.lang.String r0 = "err_msg"
            r11.mo54849a(r0, r8)
            java.lang.String r0 = "is_from_feed_cache"
            java.lang.String r3 = java.lang.String.valueOf(r25)
            r11.mo54849a(r0, r3)
            java.lang.String r0 = "request_id"
            r11.mo54849a(r0, r2)
            org.json.JSONObject r2 = r11.mo54850a()
            java.lang.String r0 = "1"
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r4)
            if (r0 == 0) goto L_0x0129
            if (r1 != r6) goto L_0x0113
            java.lang.String r0 = "succes_num"
            java.util.concurrent.atomic.AtomicInteger r1 = com.p683ss.android.ugc.aweme.feed.helper.C30361b.f79288d
            int r1 = r1.get()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.put(r0, r1)
            goto L_0x011a
        L_0x0113:
            java.lang.String r0 = "succes_num"
            java.lang.String r1 = "0"
            r2.put(r0, r1)
        L_0x011a:
            java.lang.String r0 = "feed_req_num"
            java.util.concurrent.atomic.AtomicInteger r1 = com.p683ss.android.ugc.aweme.feed.helper.C30361b.f79289e
            int r1 = r1.get()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.put(r0, r1)
        L_0x0129:
            com.ss.android.ugc.aweme.common.MobClick r0 = com.p683ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r1 = "feed_request_response"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r1)
            java.lang.String r1 = "perf_monitor"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r1)
            com.ss.android.ugc.aweme.common.MobClick r1 = r0.setJsonObject(r2)
            java.lang.String r0 = "net_info"
            r2.put(r0, r5)     // Catch:{ JSONException -> 0x0143 }
            goto L_0x0149
        L_0x0143:
            r0 = move-exception
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r0)
        L_0x0149:
            com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r1)
            java.lang.String r0 = "feed_request_response"
            com.p683ss.android.ugc.aweme.common.C26890h.m65014b(r0, r2)
            java.lang.String r0 = "feed_request_response"
            r3 = r26
            com.p683ss.android.ugc.aweme.p1382aq.p1384b.C23223a.m57036a(r0, r2, r3)
            long r0 = com.p683ss.android.ugc.aweme.feed.api.C30146d.f78686a
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x017d
            java.lang.String r0 = "log_bean_copy_convert"
            java.lang.String r1 = "log_bean_copy_convert"
            com.ss.android.ugc.aweme.app.f.c r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
            java.lang.String r5 = "spendTime"
            long r6 = com.p683ss.android.ugc.aweme.feed.api.C30146d.f78686a
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            com.ss.android.ugc.aweme.app.f.c r4 = r4.mo47823a(r5, r6)
            org.json.JSONObject r4 = r4.mo47825b()
            com.p683ss.android.ugc.aweme.app.C23131p.m56692a(r0, r1, r4)
            com.p683ss.android.ugc.aweme.feed.api.C30146d.f78686a = r2
        L_0x017d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.C31219v.mo64021a(int, com.ss.android.ugc.aweme.feed.model.FeedAppLogParams, java.lang.Exception, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, long):java.lang.Void");
    }
}
