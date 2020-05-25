package com.p992g.p993a;

import android.text.TextUtils;
import android.util.Log;
import com.C2240a;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.ttnet.C13281b;
import com.bytedance.ttnet.p885c.C13297b;
import com.facebook.common.p921e.C13697a;
import com.facebook.imagepipeline.p971k.C14050c;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p976p.C14237b;
import com.facebook.net.C14543c;
import com.facebook.net.C14551d;
import com.facebook.net.C14556g;
import com.facebook.net.C14557h;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.p2544b.p2545a.C51151a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.g.a.d */
public final class C14711d implements C14050c {

    /* renamed from: c */
    private static ExecutorService f38113c = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49846a((ThreadFactory) new ThreadFactory() {
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "fresco-trace-monitor");
        }
    }).mo49847a());

    /* renamed from: a */
    public ConcurrentHashMap<String, C14717a> f38114a;

    /* renamed from: b */
    public C14551d f38115b;

    /* renamed from: com.g.a.d$a */
    class C14717a {

        /* renamed from: a */
        String f38129a;

        /* renamed from: b */
        long f38130b;

        /* renamed from: c */
        Map<String, Long> f38131c = new HashMap();

        /* renamed from: d */
        JSONObject f38132d;

        /* renamed from: e */
        Object f38133e;

        C14717a() {
        }
    }

    public final void onProducerEvent(String str, String str2, String str3) {
    }

    public final void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map) {
    }

    public final boolean requiresExtraMap(String str) {
        return true;
    }

    public C14711d() {
        this(false);
    }

    /* renamed from: a */
    private static long m30088a() {
        return System.currentTimeMillis();
    }

    public final void onRequestCancellation(final String str) {
        final long a = m30088a();
        f38113c.submit(new Runnable() {
            public final void run() {
                C14711d dVar = C14711d.this;
                String str = str;
                long j = a;
                C14717a aVar = (C14717a) dVar.f38114a.remove(str);
                if (aVar != null && C14709b.m30086b()) {
                    Object[] objArr = {Long.valueOf(j), str, Long.valueOf(C14711d.m30089a(Long.valueOf(aVar.f38130b), j))};
                    C51151a.m110018b("Fresco", C14711d.m30090a("time %d: onRequestCancellation: {requestId: %s, elapsedTime: %d ms}", objArr));
                }
            }
        });
    }

    private C14711d(boolean z) {
        this.f38115b = new C14551d() {
            /* renamed from: a */
            public final void mo26790a(long j, long j2, C14556g gVar, C13297b bVar, Throwable th, JSONObject jSONObject) {
                m30094c(j, j2, gVar, bVar, th, jSONObject);
            }

            /* renamed from: b */
            public final void mo26791b(long j, long j2, C14556g gVar, C13297b bVar, Throwable th, JSONObject jSONObject) {
                m30094c(j, j2, gVar, bVar, null, jSONObject);
            }

            /* renamed from: c */
            private void m30094c(long j, long j2, C14556g gVar, C13297b bVar, Throwable th, JSONObject jSONObject) {
                long j3;
                Object remove = jSONObject.remove("requestId");
                Object remove2 = jSONObject.remove("retryCount");
                Object remove3 = jSONObject.remove("queue_time");
                Object remove4 = jSONObject.remove("fetch_time");
                try {
                    if (remove instanceof String) {
                        String str = (String) remove;
                        if (!TextUtils.isEmpty(str)) {
                            int i = -1;
                            if (remove2 instanceof Integer) {
                                i = ((Integer) remove2).intValue();
                            }
                            long j4 = -1;
                            if (remove3 instanceof Long) {
                                j3 = ((Long) remove3).longValue();
                            } else {
                                j3 = -1;
                            }
                            if (remove4 instanceof Long) {
                                j4 = ((Long) remove4).longValue();
                            }
                            C14717a aVar = (C14717a) C14711d.this.f38114a.get(str);
                            if (aVar != null) {
                                JSONObject jSONObject2 = aVar.f38132d;
                                jSONObject2.put("is_request_network", true);
                                jSONObject2.put("http_status", jSONObject.optInt("http_status", 0));
                                jSONObject2.put("retry_count", i);
                                jSONObject2.put("queue_duration", j3);
                                jSONObject2.put("download_duration", j4);
                                C14711d.m30091a(bVar, jSONObject2);
                                C14711d.m30092a(gVar, jSONObject2);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        };
        this.f38114a = new ConcurrentHashMap<>();
        C14543c.f37778b = this.f38115b;
    }

    /* renamed from: a */
    static boolean m30093a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.contains("Canceled") || str.contains("canceled")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static long m30089a(Long l, long j) {
        if (l != null) {
            return j - l.longValue();
        }
        return -1;
    }

    /* renamed from: a */
    static String m30090a(String str, Object... objArr) {
        return C2240a.m6773a(null, str, objArr);
    }

    public final void onProducerStart(String str, String str2) {
        long a = m30088a();
        C14717a aVar = (C14717a) this.f38114a.get(str);
        if (aVar != null) {
            StringBuilder sb = new StringBuilder(str);
            Map<String, Long> map = aVar.f38131c;
            sb.append(str2);
            map.put(sb.toString(), Long.valueOf(a));
            JSONObject jSONObject = aVar.f38132d;
            if (jSONObject != null) {
                try {
                    JSONObject optJSONObject = jSONObject.optJSONObject("image_monitor_data");
                    if (optJSONObject != null) {
                        optJSONObject.put(str2, new JSONObject());
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m30092a(C14556g gVar, JSONObject jSONObject) {
        String str = "";
        String str2 = "";
        try {
            if (gVar.f37819a != null) {
                C12685b a = gVar.f37819a.f33551a.mo23865a("Nw-Session-Trace");
                C12685b a2 = gVar.f37819a.f33551a.mo23865a("x-net-info.remoteaddr");
                if (a != null) {
                    str = gVar.f37819a.f33551a.mo23865a("Nw-Session-Trace").f33319b;
                }
                if (a2 != null) {
                    str2 = gVar.f37819a.f33551a.mo23865a("x-net-info.remoteaddr").f33319b;
                }
            } else if (gVar.f37820b != null) {
                str = gVar.f37820b.mo111276b("Nw-Session-Trace");
                str2 = gVar.f37820b.mo111276b("x-snssdk.remoteaddr");
            }
            String str3 = "nw-session-trace";
            if (str == null) {
                str = "";
            }
            jSONObject.put(str3, str);
            String str4 = "server_ip";
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put(str4, str2);
        } catch (Exception e) {
            if (C14720g.m30099a()) {
                new StringBuilder("packageResponseHeader ").append(Log.getStackTraceString(e));
            }
        }
    }

    /* renamed from: a */
    protected static void m30091a(C13297b bVar, JSONObject jSONObject) {
        if (bVar != null && jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("requestStart", bVar.f26755e);
                jSONObject2.put("responseBack", bVar.f26756f);
                jSONObject2.put("completeReadResponse", bVar.f26757g);
                jSONObject2.put("requestEnd", bVar.f26758h);
                jSONObject2.put("recycleCount", bVar.f26759i);
                if (bVar.f26772v == 0) {
                    jSONObject2.put("timing_dns", bVar.f26760j);
                    jSONObject2.put("timing_connect", bVar.f26761k);
                    jSONObject2.put("timing_ssl", bVar.f26762l);
                    jSONObject2.put("timing_send", bVar.f26763m);
                    jSONObject2.put("timing_wait", bVar.f26767q);
                    jSONObject2.put("timing_receive", bVar.f26765o);
                    jSONObject2.put("timing_total", bVar.f26768r);
                    jSONObject2.put("timing_isSocketReused", bVar.f26766p);
                    jSONObject2.put("timing_totalSendBytes", bVar.f26769s);
                    jSONObject2.put("timing_totalReceivedBytes", bVar.f26770t);
                    jSONObject2.put("timing_remoteIP", bVar.f26751a);
                    jSONObject2.put("request_log", bVar.f26774x);
                }
                if (bVar.f26775y != null) {
                    jSONObject2.put("req_info", bVar.f26775y);
                }
                jSONObject2.put("download", bVar.f26776z);
                jSONObject.put("net_timing_detail", jSONObject2);
                if (C13281b.m26758a()) {
                    jSONObject.put("netClientType", "CronetClient");
                } else {
                    jSONObject.put("netClientType", "TTOkhttp3Client");
                }
            } catch (JSONException e) {
                if (C14720g.m30099a()) {
                    new StringBuilder("packageRequestParameters ").append(Log.getStackTraceString(e));
                }
            }
        }
    }

    public final void onRequestSuccess(C14229b bVar, String str, boolean z) {
        final long a = m30088a();
        ExecutorService executorService = f38113c;
        final C14229b bVar2 = bVar;
        final String str2 = str;
        C147143 r0 = new Runnable() {
            public final void run() {
                boolean z;
                C14711d dVar = C14711d.this;
                C14229b bVar = bVar2;
                String str = str2;
                long j = a;
                if (C14237b.m29187b()) {
                    C14237b.m29186a("FrescoMonitor#onImageLoaded");
                }
                C14717a aVar = (C14717a) dVar.f38114a.remove(str);
                if (aVar != null) {
                    JSONObject jSONObject = aVar.f38132d;
                    if (!C14709b.m30084a()) {
                        z = jSONObject.optBoolean("is_request_network", false);
                    } else if (bVar.mSourceUriType == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        try {
                            if (aVar.f38133e instanceof String) {
                                jSONObject.put("scene_tag", aVar.f38133e);
                            }
                            jSONObject.put("duration", C14711d.m30089a(Long.valueOf(aVar.f38130b), j));
                            jSONObject.put("load_status", "success");
                            jSONObject.put("timestamp", Long.valueOf(aVar.f38130b));
                            jSONObject.put("log_type", "image_monitor_v2");
                            jSONObject.put("log_version", 1);
                            jSONObject.put("uri", bVar.mSourceUri.toString());
                            jSONObject.put("image_sdk_version", "1.12.5-douyin-rc.43");
                            jSONObject.put("retry_open", C14557h.m29810a().mo26794b() ? 1 : 0);
                            JSONObject optJSONObject = jSONObject.optJSONObject("image_monitor_data");
                            if (optJSONObject != null) {
                                optJSONObject.put("image_status", 0);
                                if (optJSONObject.opt("image_origin") == null) {
                                    optJSONObject.put("image_origin", 7);
                                }
                                optJSONObject.put("disk_cache_type", C14718e.m30097a(bVar.mCacheChoice));
                            }
                        } catch (JSONException unused) {
                        }
                        C14709b.m30083a(true, str, jSONObject);
                    }
                    if (jSONObject.optBoolean("is_request_network", false) && C14709b.m30086b()) {
                        Object[] objArr = {Long.valueOf(j), bVar.mSourceUri.toString(), str, Long.valueOf(C14711d.m30089a(Long.valueOf(aVar.f38130b), j)), jSONObject.optString("scene_tag")};
                        C51151a.m110018b("Fresco", C14711d.m30090a("time %d: onRequestSuccess: {url: %s, requestId: %s, elapsedTime: %d ms, scene_tag: %s}", objArr));
                    }
                    if (C14237b.m29187b()) {
                        C14237b.m29185a();
                    }
                }
            }
        };
        executorService.submit(r0);
    }

    public final void onUltimateProducerReached(String str, String str2, boolean z) {
        C14717a aVar = (C14717a) this.f38114a.get(str);
        if (aVar != null) {
            JSONObject jSONObject = aVar.f38132d;
            if (jSONObject != null) {
                try {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("image_monitor_data");
                    String str3 = "image_origin";
                    char c = 65535;
                    int i = 6;
                    switch (str2.hashCode()) {
                        case -1914072202:
                            if (str2.equals("BitmapMemoryCacheGetProducer")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -1307634203:
                            if (str2.equals("EncodedMemoryCacheProducer")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -1224383234:
                            if (str2.equals("NetworkFetchProducer")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 656304759:
                            if (str2.equals("DiskCacheProducer")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 957714404:
                            if (str2.equals("BitmapMemoryCacheProducer")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 1023071510:
                            if (str2.equals("PostprocessedBitmapMemoryCacheProducer")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 2109593398:
                            if (str2.equals("PartialDiskCacheProducer")) {
                                c = 1;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            i = 1;
                            break;
                        case 1:
                            i = 2;
                            break;
                        case 2:
                            i = 3;
                            break;
                        case 3:
                            i = 4;
                            break;
                        case 4:
                        case 5:
                            i = 5;
                            break;
                        case 6:
                            break;
                        default:
                            i = 7;
                            break;
                    }
                    jSONObject2.put(str3, i);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        JSONObject jSONObject;
        String str3;
        long a = m30088a();
        C14717a aVar = (C14717a) this.f38114a.get(str);
        if (aVar != null) {
            Map<String, Long> map2 = aVar.f38131c;
            if (!map2.isEmpty()) {
                StringBuilder sb = new StringBuilder(str);
                sb.append(str2);
                Long l = (Long) map2.remove(sb.toString());
                JSONObject jSONObject2 = aVar.f38132d;
                if (jSONObject2 != null) {
                    try {
                        jSONObject = jSONObject2.optJSONObject("image_monitor_data");
                        if (jSONObject != null) {
                            try {
                                JSONObject optJSONObject = jSONObject.optJSONObject(str2);
                                if (optJSONObject != null) {
                                    optJSONObject.put("producer_start", l.longValue() - Long.valueOf(aVar.f38130b).longValue());
                                    optJSONObject.put("producer_end", a - aVar.f38130b);
                                }
                            } catch (JSONException unused) {
                            }
                        }
                    } catch (JSONException unused2) {
                        jSONObject = null;
                    }
                    if (map != null) {
                        if ("NetworkFetchProducer".equals(str2)) {
                            try {
                                long parseLong = Long.parseLong((String) map.get("content_length"));
                                jSONObject2.put("content_length", parseLong);
                                long parseLong2 = Long.parseLong((String) map.get("image_size"));
                                jSONObject2.put("file_size", parseLong2);
                                String str4 = "file_consistent";
                                if (parseLong == parseLong2) {
                                    str3 = "1";
                                } else {
                                    str3 = "0";
                                }
                                jSONObject2.put(str4, str3);
                                jSONObject2.put("hit_cdn_cache", map.get("hit_cdn_cache"));
                            } catch (NumberFormatException | JSONException unused3) {
                            }
                            return;
                        }
                        if ("DecodeProducer".equals(str2)) {
                            try {
                                String str5 = (String) map.get("requestedImageSize");
                                if ("unknown".equals(str5)) {
                                    str5 = "0x0";
                                }
                                jSONObject2.put("intended_image_size", str5);
                                String str6 = (String) map.get("encodedImageSize");
                                if ("-1x-1".equals(str6) || "unknown".equals(str6)) {
                                    str6 = (String) map.get("bitmapSize");
                                }
                                jSONObject2.put("applied_image_size", str6);
                                jSONObject2.put("decode_duration", a - l.longValue());
                                jSONObject2.put("image_type", map.get("imageFormat"));
                                if (jSONObject != null) {
                                    jSONObject.put("decode_queue_duration", Long.parseLong((String) map.get("queueTime")));
                                }
                            } catch (JSONException unused4) {
                            } catch (NumberFormatException unused5) {
                            }
                        }
                    }
                }
            }
        }
    }

    public final void onRequestFailure(C14229b bVar, String str, Throwable th, boolean z) {
        final long a = m30088a();
        ExecutorService executorService = f38113c;
        final C14229b bVar2 = bVar;
        final String str2 = str;
        final Throwable th2 = th;
        C147154 r0 = new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:28:0x0069  */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
            /* JADX WARNING: Removed duplicated region for block: B:33:0x0077 A[Catch:{ JSONException -> 0x0220 }] */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0 A[Catch:{ JSONException -> 0x0220 }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r16 = this;
                    r0 = r16
                    com.g.a.d r1 = com.p992g.p993a.C14711d.this
                    com.facebook.imagepipeline.o.b r2 = r2
                    java.lang.String r3 = r3
                    long r4 = r4
                    java.lang.Throwable r6 = r6
                    boolean r7 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
                    if (r7 == 0) goto L_0x0017
                    java.lang.String r7 = "FrescoMonitor#onRequestFailure"
                    com.facebook.imagepipeline.p976p.C14237b.m29186a(r7)
                L_0x0017:
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, com.g.a.d$a> r1 = r1.f38114a
                    java.lang.Object r1 = r1.remove(r3)
                    com.g.a.d$a r1 = (com.p992g.p993a.C14711d.C14717a) r1
                    if (r1 == 0) goto L_0x027d
                    org.json.JSONObject r7 = r1.f38132d
                    boolean r8 = com.p992g.p993a.C14709b.m30084a()
                    r9 = 0
                    r10 = 1
                    if (r8 == 0) goto L_0x0033
                    int r8 = r2.mSourceUriType
                    if (r8 != 0) goto L_0x0031
                    r8 = 1
                    goto L_0x0039
                L_0x0031:
                    r8 = 0
                    goto L_0x0039
                L_0x0033:
                    java.lang.String r8 = "is_request_network"
                    boolean r8 = r7.optBoolean(r8, r9)
                L_0x0039:
                    if (r8 == 0) goto L_0x0223
                    if (r6 == 0) goto L_0x0066
                    java.lang.String r8 = r6.getMessage()
                    if (r8 == 0) goto L_0x0066
                    int r13 = r8.length()
                    if (r13 == 0) goto L_0x0066
                    java.lang.String r13 = "canceled"
                    boolean r13 = r8.contains(r13)
                    if (r13 != 0) goto L_0x0064
                    java.lang.String r13 = "Canceled"
                    boolean r13 = r8.contains(r13)
                    if (r13 == 0) goto L_0x005a
                    goto L_0x0064
                L_0x005a:
                    java.lang.String r13 = "network not available"
                    boolean r8 = r8.contains(r13)
                    if (r8 == 0) goto L_0x0066
                    r8 = 3
                    goto L_0x0067
                L_0x0064:
                    r8 = 2
                    goto L_0x0067
                L_0x0066:
                    r8 = 1
                L_0x0067:
                    if (r6 != 0) goto L_0x006c
                    r13 = 200(0xc8, float:2.8E-43)
                    goto L_0x0071
                L_0x006c:
                    r13 = 0
                    int r13 = com.facebook.net.C14555f.m29809a(r6, r13)
                L_0x0071:
                    java.lang.Object r14 = r1.f38133e     // Catch:{ JSONException -> 0x0220 }
                    boolean r14 = r14 instanceof java.lang.String     // Catch:{ JSONException -> 0x0220 }
                    if (r14 == 0) goto L_0x007e
                    java.lang.String r14 = "scene_tag"
                    java.lang.Object r15 = r1.f38133e     // Catch:{ JSONException -> 0x0220 }
                    r7.put(r14, r15)     // Catch:{ JSONException -> 0x0220 }
                L_0x007e:
                    java.lang.String r14 = "load_status"
                    java.lang.String r15 = "fail"
                    r7.put(r14, r15)     // Catch:{ JSONException -> 0x0220 }
                    java.lang.String r14 = "duration"
                    long r11 = r1.f38130b     // Catch:{ JSONException -> 0x0220 }
                    java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ JSONException -> 0x0220 }
                    long r11 = com.p992g.p993a.C14711d.m30089a(r11, r4)     // Catch:{ JSONException -> 0x0220 }
                    r7.put(r14, r11)     // Catch:{ JSONException -> 0x0220 }
                    java.lang.String r11 = "err_code"
                    r7.put(r11, r13)     // Catch:{ JSONException -> 0x0220 }
                    java.lang.String r11 = "err_desc"
                    java.lang.String r12 = android.util.Log.getStackTraceString(r6)     // Catch:{ JSONException -> 0x0220 }
                    r7.put(r11, r12)     // Catch:{ JSONException -> 0x0220 }
                    java.lang.String r11 = "timestamp"
                    long r14 = r1.f38130b     // Catch:{ JSONException -> 0x0220 }
                    java.lang.Long r12 = java.lang.Long.valueOf(r14)     // Catch:{ JSONException -> 0x0220 }
                    r7.put(r11, r12)     // Catch:{ JSONException -> 0x0220 }
                    java.lang.String r11 = "log_type"
                    java.lang.String r12 = "image_monitor_v2"
                    r7.put(r11, r12)     // Catch:{ JSONException -> 0x0220 }
                    java.lang.String r11 = "log_version"
                    r7.put(r11, r10)     // Catch:{ JSONException -> 0x0220 }
                    java.lang.String r11 = "uri"
                    android.net.Uri r12 = r2.mSourceUri     // Catch:{ JSONException -> 0x0220 }
                    java.lang.String r12 = r12.toString()     // Catch:{ JSONException -> 0x0220 }
                    r7.put(r11, r12)     // Catch:{ JSONException -> 0x0220 }
                    java.lang.String r11 = "image_sdk_version"
                    java.lang.String r12 = "1.12.5-douyin-rc.43"
                    r7.put(r11, r12)     // Catch:{ JSONException -> 0x0220 }
                    java.lang.String r11 = "retry_open"
                    com.facebook.net.h r12 = com.facebook.net.C14557h.m29810a()     // Catch:{ JSONException -> 0x0220 }
                    boolean r12 = r12.mo26794b()     // Catch:{ JSONException -> 0x0220 }
                    r7.put(r11, r12)     // Catch:{ JSONException -> 0x0220 }
                    java.lang.String r11 = "image_monitor_data"
                    org.json.JSONObject r11 = r7.optJSONObject(r11)     // Catch:{ JSONException -> 0x0220 }
                    if (r11 == 0) goto L_0x0220
                    java.lang.String r12 = "image_status"
                    r11.put(r12, r8)     // Catch:{ JSONException -> 0x0220 }
                    java.lang.String r8 = "image_load_error_code"
                    if (r13 == r10) goto L_0x00eb
                    r12 = 1
                    goto L_0x00ec
                L_0x00eb:
                    r12 = 0
                L_0x00ec:
                    r13 = 700(0x2bc, float:9.81E-43)
                    if (r6 != 0) goto L_0x00f2
                    goto L_0x0212
                L_0x00f2:
                    java.lang.String r14 = r6.getMessage()     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x00fc
                    r13 = 100
                    goto L_0x0212
                L_0x00fc:
                    boolean r12 = r6 instanceof java.io.IOException     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x0104
                    r13 = 201(0xc9, float:2.82E-43)
                    goto L_0x0212
                L_0x0104:
                    boolean r12 = r6 instanceof java.lang.InterruptedException     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x010c
                    r13 = 501(0x1f5, float:7.02E-43)
                    goto L_0x0212
                L_0x010c:
                    boolean r12 = r6 instanceof com.facebook.imagepipeline.common.C13954f     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x0114
                    r13 = 601(0x259, float:8.42E-43)
                    goto L_0x0212
                L_0x0114:
                    boolean r12 = r6 instanceof java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x0148
                    java.lang.String r12 = "ByteBuffer must be direct"
                    boolean r12 = r14.contains(r12)     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x0124
                    r13 = 301(0x12d, float:4.22E-43)
                    goto L_0x0212
                L_0x0124:
                    java.lang.String r12 = "Failed to create demuxer"
                    boolean r12 = r14.contains(r12)     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x0130
                    r13 = 302(0x12e, float:4.23E-43)
                    goto L_0x0212
                L_0x0130:
                    java.lang.String r12 = "Width or height is negative"
                    boolean r12 = r14.contains(r12)     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x013c
                    r13 = 303(0x12f, float:4.25E-43)
                    goto L_0x0212
                L_0x013c:
                    java.lang.String r12 = "Problem decoding into existing bitmap"
                    boolean r12 = r14.contains(r12)     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x0212
                    r13 = 304(0x130, float:4.26E-43)
                    goto L_0x0212
                L_0x0148:
                    boolean r12 = r6 instanceof java.lang.IllegalStateException     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x01d8
                    java.lang.String r12 = "Invalid dimensions"
                    boolean r12 = r14.contains(r12)     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x0158
                    r13 = 305(0x131, float:4.27E-43)
                    goto L_0x0212
                L_0x0158:
                    java.lang.String r12 = "Failed to slurp image"
                    boolean r12 = r14.contains(r12)     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x0164
                    r13 = 306(0x132, float:4.29E-43)
                    goto L_0x0212
                L_0x0164:
                    java.lang.String r12 = "No fames in image"
                    boolean r12 = r14.contains(r12)     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x0170
                    r13 = 307(0x133, float:4.3E-43)
                    goto L_0x0212
                L_0x0170:
                    java.lang.String r12 = "Already disposed"
                    boolean r12 = r14.contains(r12)     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x017c
                    r13 = 308(0x134, float:4.32E-43)
                    goto L_0x0212
                L_0x017c:
                    java.lang.String r12 = "unable to get frame"
                    boolean r12 = r14.contains(r12)     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x0188
                    r13 = 309(0x135, float:4.33E-43)
                    goto L_0x0212
                L_0x0188:
                    java.lang.String r12 = "Bad bitmap"
                    boolean r12 = r14.contains(r12)     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x0194
                    r13 = 310(0x136, float:4.34E-43)
                    goto L_0x0212
                L_0x0194:
                    java.lang.String r12 = "Width or height is too small"
                    boolean r12 = r14.contains(r12)     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x01a0
                    r13 = 311(0x137, float:4.36E-43)
                    goto L_0x0212
                L_0x01a0:
                    java.lang.String r12 = "Wrong color format"
                    boolean r12 = r14.contains(r12)     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x01ac
                    r13 = 312(0x138, float:4.37E-43)
                    goto L_0x0212
                L_0x01ac:
                    java.lang.String r12 = "WebPInitDecoderConfig failed"
                    boolean r12 = r14.contains(r12)     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x01b7
                    r13 = 313(0x139, float:4.39E-43)
                    goto L_0x0212
                L_0x01b7:
                    java.lang.String r12 = "WebPGetFeatures failed"
                    boolean r12 = r14.contains(r12)     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x01c2
                    r13 = 314(0x13a, float:4.4E-43)
                    goto L_0x0212
                L_0x01c2:
                    java.lang.String r12 = "Failed to decode frame. VP8StatusCode:"
                    boolean r12 = r14.contains(r12)     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x01cd
                    r13 = 315(0x13b, float:4.41E-43)
                    goto L_0x0212
                L_0x01cd:
                    java.lang.String r12 = "WebpBitmapFactory is null"
                    boolean r12 = r14.contains(r12)     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x0212
                    r13 = 316(0x13c, float:4.43E-43)
                    goto L_0x0212
                L_0x01d8:
                    boolean r12 = r6 instanceof java.lang.RuntimeException     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x0212
                    java.lang.String r12 = "Could not create WebPDemux from image. This webp might be malformed"
                    boolean r12 = r14.contains(r12)     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x01e7
                    r13 = 317(0x13d, float:4.44E-43)
                    goto L_0x0212
                L_0x01e7:
                    java.lang.String r12 = "unrecognized pixel format"
                    boolean r12 = r14.contains(r12)     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x01f2
                    r13 = 318(0x13e, float:4.46E-43)
                    goto L_0x0212
                L_0x01f2:
                    java.lang.String r12 = "Wrong pixel format for jpeg encoding"
                    boolean r12 = r14.contains(r12)     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x01fd
                    r13 = 401(0x191, float:5.62E-43)
                    goto L_0x0212
                L_0x01fd:
                    java.lang.String r12 = "Could not write scanline"
                    boolean r12 = r14.contains(r12)     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x0208
                    r13 = 402(0x192, float:5.63E-43)
                    goto L_0x0212
                L_0x0208:
                    java.lang.String r12 = "could not allocate memory"
                    boolean r12 = r14.contains(r12)     // Catch:{ JSONException -> 0x0220 }
                    if (r12 == 0) goto L_0x0212
                    r13 = 602(0x25a, float:8.44E-43)
                L_0x0212:
                    r11.put(r8, r13)     // Catch:{ JSONException -> 0x0220 }
                    java.lang.String r8 = "disk_cache_type"
                    com.facebook.imagepipeline.o.b$a r12 = r2.mCacheChoice     // Catch:{ JSONException -> 0x0220 }
                    int r12 = com.p992g.p993a.C14718e.m30097a(r12)     // Catch:{ JSONException -> 0x0220 }
                    r11.put(r8, r12)     // Catch:{ JSONException -> 0x0220 }
                L_0x0220:
                    com.p992g.p993a.C14709b.m30083a(r9, r3, r7)
                L_0x0223:
                    boolean r8 = com.p992g.p993a.C14709b.m30086b()
                    if (r8 == 0) goto L_0x0274
                    if (r6 == 0) goto L_0x0230
                    java.lang.String r8 = r6.toString()
                    goto L_0x0232
                L_0x0230:
                    java.lang.String r8 = ""
                L_0x0232:
                    java.lang.String r11 = "time %d: onRequestFailure: {url: %s, requestId: %s, elapsedTime: %d ms, throwable: %s, scene_tag: %s}"
                    r12 = 6
                    java.lang.Object[] r12 = new java.lang.Object[r12]
                    java.lang.Long r13 = java.lang.Long.valueOf(r4)
                    r12[r9] = r13
                    android.net.Uri r2 = r2.mSourceUri
                    java.lang.String r2 = r2.toString()
                    r12[r10] = r2
                    r2 = 2
                    r12[r2] = r3
                    long r1 = r1.f38130b
                    java.lang.Long r1 = java.lang.Long.valueOf(r1)
                    long r1 = com.p992g.p993a.C14711d.m30089a(r1, r4)
                    java.lang.Long r1 = java.lang.Long.valueOf(r1)
                    r2 = 3
                    r12[r2] = r1
                    r1 = 4
                    r12[r1] = r8
                    r1 = 5
                    java.lang.String r2 = "scene_tag"
                    java.lang.String r2 = r7.optString(r2)
                    r12[r1] = r2
                    java.lang.String r1 = com.p992g.p993a.C14711d.m30090a(r11, r12)
                    boolean r2 = com.p992g.p993a.C14711d.m30093a(r8)
                    if (r2 != 0) goto L_0x0274
                    java.lang.String r2 = "Fresco"
                    com.p683ss.p2544b.p2545a.C51151a.m110019b(r2, r1, r6)
                L_0x0274:
                    boolean r1 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
                    if (r1 == 0) goto L_0x027d
                    com.facebook.imagepipeline.p976p.C14237b.m29185a()
                L_0x027d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p992g.p993a.C14711d.C147154.run():void");
            }
        };
        executorService.submit(r0);
    }

    public final void onRequestStart(C14229b bVar, Object obj, String str, boolean z) {
        long a = m30088a();
        if (C14237b.m29187b()) {
            C14237b.m29186a("FrescoMonitor#onRequestStart");
        }
        C14717a aVar = new C14717a();
        aVar.f38129a = str;
        aVar.f38130b = a;
        aVar.f38133e = obj;
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            if (C14709b.f38110c) {
                try {
                    jSONObject.put("image_monitor_data", new JSONObject());
                } catch (JSONException unused) {
                }
            }
            aVar.f38132d = jSONObject;
        }
        this.f38114a.put(str, aVar);
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
    }

    public final void onProducerFinishWithFailure(String str, String str2, Throwable th, Map<String, String> map) {
        String str3;
        long a = m30088a();
        C14717a aVar = (C14717a) this.f38114a.get(str);
        if (aVar != null) {
            JSONObject jSONObject = aVar.f38132d;
            if (jSONObject != null) {
                if (map == null) {
                    map = new HashMap<>();
                    map.put("image_size", "-1");
                    map.put("queue_time", "-1");
                    map.put("fetch_time", "-1");
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("image_monitor_data");
                if ("NetworkFetchProducer".equals(str2)) {
                    try {
                        jSONObject.put("fail_phase", "download");
                        jSONObject.put("download_duration", -1);
                        long parseLong = Long.parseLong((String) map.get("content_length"));
                        jSONObject.put("content_length", parseLong);
                        long parseLong2 = Long.parseLong((String) map.get("image_size"));
                        jSONObject.put("file_size", parseLong2);
                        String str4 = "file_consistent";
                        if (parseLong == parseLong2) {
                            str3 = "1";
                        } else {
                            str3 = "0";
                        }
                        jSONObject.put(str4, str3);
                        jSONObject.put("queue_duration", Long.parseLong((String) map.get("queue_time")));
                    } catch (NumberFormatException | JSONException unused) {
                    }
                } else if ("DecodeProducer".equals(str2)) {
                    jSONObject.put("fail_phase", "decode");
                    jSONObject.put("download_duration", Long.parseLong((String) map.get("fetch_time")));
                    if (optJSONObject != null) {
                        optJSONObject.put("decode_queue_duration", Long.parseLong((String) map.get("queueTime")));
                    }
                }
                StringBuilder sb = new StringBuilder(str);
                Map<String, Long> map2 = aVar.f38131c;
                if (!map2.isEmpty()) {
                    sb.append(str2);
                    Long l = (Long) map2.remove(sb.toString());
                    if (C14709b.m30086b()) {
                        String th2 = th.toString();
                        String a2 = m30090a("time %d: onProducerFinishWithFailure: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s, throwable: %s}", Long.valueOf(a), str, str2, Long.valueOf(m30089a(l, a)), map, th2);
                        if (m30093a(th2)) {
                            C51151a.m110023e("Fresco", a2);
                        } else {
                            C51151a.m110019b("Fresco", a2, th);
                        }
                        C13697a.m27696c("Fresco", a2, th);
                    }
                    if (optJSONObject != null) {
                        try {
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject(str2);
                            if (optJSONObject2 != null) {
                                optJSONObject2.put("producer_start", l.longValue() - Long.valueOf(aVar.f38130b).longValue());
                                optJSONObject2.put("producer_end", a - aVar.f38130b);
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
        }
    }
}
