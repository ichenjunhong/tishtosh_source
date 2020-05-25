package com.p683ss.android.ugc.aweme.feed;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ttnet.p885c.C13297b;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.newmedia.C19561i;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26467cb;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26511e;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.feed.experiment.FeedCacheV2EnabledExperiment;
import com.p683ss.android.ugc.aweme.feed.experiment.FeedCacheV2TimeExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.feed.netdetector.C30550b;
import com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.C30569g;
import com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.C30569g.C30571a;
import com.p683ss.android.ugc.aweme.feed.p1721g.C30259a;
import com.p683ss.android.ugc.aweme.feed.p1721g.C30259a.C30262a;
import com.p683ss.android.ugc.aweme.feed.preload.C30679e;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p1382aq.p1384b.C23223a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.k */
public final class C30436k {

    /* renamed from: a */
    public static Boolean f79557a = null;

    /* renamed from: b */
    public static long f79558b = -1;

    /* renamed from: c */
    public static volatile Boolean f79559c = null;

    /* renamed from: d */
    public static boolean f79560d = false;

    /* renamed from: e */
    public static long f79561e = -1;

    /* renamed from: f */
    public static long f79562f = -1;

    /* renamed from: g */
    public static long f79563g = -1;

    /* renamed from: h */
    public static List<Aweme> f79564h = new ArrayList();

    /* renamed from: i */
    public static C30442b f79565i;

    /* renamed from: j */
    public static Queue<Runnable> f79566j;

    /* renamed from: k */
    public static String f79567k;

    /* renamed from: l */
    public static Throwable f79568l;

    /* renamed from: m */
    public static long f79569m;

    /* renamed from: n */
    public static C13297b f79570n;

    /* renamed from: o */
    public static JSONObject f79571o;

    /* renamed from: p */
    private static final long f79572p = TimeUnit.SECONDS.toMillis(3);

    /* renamed from: com.ss.android.ugc.aweme.feed.k$a */
    static class C30441a implements Callable {

        /* renamed from: a */
        private Callable f79577a;

        public final Object call() throws Exception {
            if (C23794bh.m58409w().mo46905a()) {
                return C30436k.m71374e();
            }
            C23324d.m57378a();
            C30259a.m71089a();
            Object b = C30679e.m71957a().mo63255a(4).mo63254b();
            C22574a.m55738f().mo46921b("feed_api_to_ui_response", false);
            C22574a.m55738f().mo46917a("feed_ui_response_to_post_msg", false);
            if (b == null) {
                C30436k.m71364a((Object) null, false, 0);
            } else if (!((FeedItemList) b).isFromLocalCache) {
                return b;
            } else {
                long a = C23542f.m57715a().mo48700a("key_feed_cache_time", 0);
                if (System.currentTimeMillis() - a <= ((long) (C10181b.m20511a().mo18168a(FeedCacheV2TimeExperiment.class, true, "is_feed_load_cache_v2_time", 31744, 0) * 3600000))) {
                    C30436k.m71364a(b, false, a);
                    return b;
                }
                C30436k.m71364a(b, true, a);
            }
            return this.f79577a.call();
        }

        C30441a(Callable callable) {
            this.f79577a = callable;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.k$b */
    static class C30442b extends Handler {

        /* renamed from: a */
        public Handler f79578a;

        /* renamed from: b */
        boolean f79579b;

        private C30442b(Handler handler) {
            this.f79578a = handler;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            C30436k.f79557a = Boolean.valueOf(false);
            C30436k.f79565i = null;
            if (this.f79579b && message.obj != null && (message.obj instanceof FeedItemList)) {
                ((FeedItemList) message.obj).setReplaceFake();
            }
            this.f79578a.handleMessage(message);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.k$c */
    static class C30443c extends Handler {
        C30443c() {
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.obj == null) {
                C30436k.m71366a("load_empty_feed");
                C30436k.m71370b("no_response", "fake_failed");
            } else if (message.obj instanceof Exception) {
                C30436k.m71366a("exec_failed");
                C30436k.m71370b("no_response", "fake_failed");
            } else if (C30436k.m71372c()) {
                C30436k.f79565i.f79579b = true;
                C30436k.f79565i.f79578a.sendMessage(Message.obtain(message));
                C30436k.f79557a = Boolean.valueOf(false);
                C30436k.f79565i = null;
                C30436k.m71366a("fake_response");
                C30436k.m71370b("no_response", "fake_response");
            } else {
                C30436k.m71366a("valid_response_received_after_do_fake");
                C30436k.m71370b("no_response", "valid_response");
            }
        }
    }

    /* renamed from: g */
    public static Boolean m71376g() {
        return f79559c;
    }

    /* renamed from: a */
    public static boolean m71369a() {
        return C10181b.m20511a().mo18172a(FeedCacheV2EnabledExperiment.class, true, "is_feed_load_cache_v2", 31744, false);
    }

    /* renamed from: f */
    public static boolean m71375f() {
        if (C23542f.m57719d().mo48699a("cold_start_times", 0) <= 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m71371b() {
        return C30522n.m71487a(C11010c.m22280a());
    }

    /* renamed from: c */
    public static boolean m71372c() {
        if (f79557a == null || !f79557a.booleanValue() || f79565i == null) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static FeedItemList m71374e() {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            inputStream = C11010c.m22280a().getAssets().open("feed_response.json");
            try {
                byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    } catch (Throwable th) {
                        th = th;
                        C47723bk.m103309a((Closeable) inputStream);
                        C47723bk.m103309a((Closeable) byteArrayOutputStream);
                        throw th;
                    }
                }
                FeedItemList feedItemList = (FeedItemList) C47759cc.m103382a().getGson().mo34884a(new String(byteArrayOutputStream.toByteArray()), FeedItemList.class);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis2 < f79572p) {
                    Thread.sleep(f79572p - currentTimeMillis2);
                }
                C47723bk.m103309a((Closeable) inputStream);
                C47723bk.m103309a((Closeable) byteArrayOutputStream);
                return feedItemList;
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
                C47723bk.m103309a((Closeable) inputStream);
                C47723bk.m103309a((Closeable) byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            byteArrayOutputStream = null;
            C47723bk.m103309a((Closeable) inputStream);
            C47723bk.m103309a((Closeable) byteArrayOutputStream);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012b A[LOOP:2: B:44:0x0125->B:46:0x012b, LOOP_END] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p683ss.android.ugc.aweme.feed.model.FeedItemList m71373d() {
        /*
            r0 = 0
            java.lang.String r1 = com.p683ss.android.ugc.aweme.language.C35837h.m80973a()     // Catch:{ IOException -> 0x00bf }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ IOException -> 0x00bf }
            android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ IOException -> 0x00bf }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ IOException -> 0x00bf }
            android.content.res.AssetManager r3 = r2.getAssets()     // Catch:{ IOException -> 0x00bf }
            java.lang.String r4 = ""
            java.lang.String[] r3 = r3.list(r4)     // Catch:{ IOException -> 0x00bf }
            if (r3 == 0) goto L_0x00bf
            r4 = 0
            r6 = r0
            r5 = 0
        L_0x0020:
            int r7 = r3.length     // Catch:{ IOException -> 0x00bf }
            if (r5 >= r7) goto L_0x0078
            r7 = r3[r5]     // Catch:{ IOException -> 0x00bf }
            java.lang.String r8 = "i18#lang_"
            boolean r7 = r7.contains(r8)     // Catch:{ IOException -> 0x00bf }
            if (r7 == 0) goto L_0x0075
            android.content.res.AssetManager r7 = r2.getAssets()     // Catch:{ IOException -> 0x00bf }
            r8 = r3[r5]     // Catch:{ IOException -> 0x00bf }
            java.lang.String[] r7 = r7.list(r8)     // Catch:{ IOException -> 0x00bf }
            if (r7 == 0) goto L_0x0075
            r8 = 0
        L_0x003a:
            int r9 = r7.length     // Catch:{ IOException -> 0x00bf }
            if (r8 >= r9) goto L_0x0075
            r9 = r7[r8]     // Catch:{ IOException -> 0x00bf }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00bf }
            r10.<init>()     // Catch:{ IOException -> 0x00bf }
            r10.append(r1)     // Catch:{ IOException -> 0x00bf }
            java.lang.String r11 = ".json"
            r10.append(r11)     // Catch:{ IOException -> 0x00bf }
            java.lang.String r10 = r10.toString()     // Catch:{ IOException -> 0x00bf }
            boolean r9 = android.text.TextUtils.equals(r9, r10)     // Catch:{ IOException -> 0x00bf }
            if (r9 == 0) goto L_0x0072
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00bf }
            r6.<init>()     // Catch:{ IOException -> 0x00bf }
            r7 = r3[r5]     // Catch:{ IOException -> 0x00bf }
            r6.append(r7)     // Catch:{ IOException -> 0x00bf }
            java.lang.String r7 = "/"
            r6.append(r7)     // Catch:{ IOException -> 0x00bf }
            r6.append(r1)     // Catch:{ IOException -> 0x00bf }
            java.lang.String r7 = ".json"
            r6.append(r7)     // Catch:{ IOException -> 0x00bf }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x00bf }
            goto L_0x0075
        L_0x0072:
            int r8 = r8 + 1
            goto L_0x003a
        L_0x0075:
            int r5 = r5 + 1
            goto L_0x0020
        L_0x0078:
            if (r6 != 0) goto L_0x00b6
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x00bf }
            r3 = 24
            if (r1 < r3) goto L_0x0091
            android.content.res.Configuration r1 = r2.getConfiguration()     // Catch:{ IOException -> 0x00bf }
            android.os.LocaleList r1 = r1.getLocales()     // Catch:{ IOException -> 0x00bf }
            java.util.Locale r1 = r1.get(r4)     // Catch:{ IOException -> 0x00bf }
            java.lang.String r1 = r1.getLanguage()     // Catch:{ IOException -> 0x00bf }
            goto L_0x009b
        L_0x0091:
            android.content.res.Configuration r1 = r2.getConfiguration()     // Catch:{ IOException -> 0x00bf }
            java.util.Locale r1 = r1.locale     // Catch:{ IOException -> 0x00bf }
            java.lang.String r1 = r1.getLanguage()     // Catch:{ IOException -> 0x00bf }
        L_0x009b:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IOException -> 0x00bf }
            if (r2 == 0) goto L_0x00a3
            java.lang.String r1 = "en"
        L_0x00a3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00bf }
            java.lang.String r3 = "i18#lang_"
            r2.<init>(r3)     // Catch:{ IOException -> 0x00bf }
            r2.append(r1)     // Catch:{ IOException -> 0x00bf }
            java.lang.String r1 = "/default.json"
            r2.append(r1)     // Catch:{ IOException -> 0x00bf }
            java.lang.String r6 = r2.toString()     // Catch:{ IOException -> 0x00bf }
        L_0x00b6:
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ IOException -> 0x00bf }
            java.lang.String r1 = m71360a(r1, r6)     // Catch:{ IOException -> 0x00bf }
            goto L_0x00c0
        L_0x00bf:
            r1 = r0
        L_0x00c0:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x00d0
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            java.lang.String r2 = "default_feed/us.json"
            java.lang.String r1 = m71360a(r1, r2)
        L_0x00d0:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x00de
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.FeedItemList> r0 = com.p683ss.android.ugc.aweme.feed.model.FeedItemList.class
            java.lang.Object r0 = com.alibaba.fastjson.JSON.parseObject(r1, r0)
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.p683ss.android.ugc.aweme.feed.model.FeedItemList) r0
        L_0x00de:
            if (r0 == 0) goto L_0x0138
            java.util.List r1 = r0.getItems()
            if (r1 == 0) goto L_0x0138
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 2
            r1.<init>(r2)
            java.util.List r2 = r0.getItems()
            int r2 = r2.size()
            java.util.Random r3 = new java.util.Random
            r3.<init>()
            int r3 = r3.nextInt(r2)
            java.util.Random r4 = new java.util.Random
            r4.<init>()
            int r4 = r4.nextInt(r2)
            if (r4 != r3) goto L_0x010b
            int r4 = r3 + 1
            int r4 = r4 % r2
        L_0x010b:
            java.util.List r2 = r0.getItems()
            java.lang.Object r2 = r2.get(r3)
            r1.add(r2)
            java.util.List r2 = r0.getItems()
            java.lang.Object r2 = r2.get(r4)
            r1.add(r2)
            java.util.Iterator r2 = r1.iterator()
        L_0x0125:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0136
            java.lang.Object r3 = r2.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r3
            r4 = 1
            r3.setFakeResponse(r4)
            goto L_0x0125
        L_0x0136:
            r0.items = r1
        L_0x0138:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.C30436k.m71373d():com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    /* renamed from: a */
    public static void m71366a(String str) {
        m71367a(str, "");
    }

    /* renamed from: a */
    private static void m71365a(Runnable runnable) {
        if (f79562f != -1) {
            C18842a.m45932a(runnable);
            return;
        }
        if (f79566j == null) {
            f79566j = new LinkedBlockingQueue();
        }
        f79566j.offer(runnable);
    }

    /* renamed from: a */
    public static String m71361a(FeedItemList feedItemList) {
        StringBuilder sb = new StringBuilder();
        if (!C9376b.m18558a((Collection<T>) feedItemList.getItems())) {
            for (Aweme aid : feedItemList.getItems()) {
                sb.append(aid.getAid());
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m71367a(final String str, final String str2) {
        m71365a((Runnable) new Runnable() {
            public final void run() {
                C23131p.m57779a("aweme_feed_0vv", new C23088c().mo47824a("message", str).mo47819a("network_connected", Boolean.valueOf(C30436k.m71371b())).mo47823a("mainCreate2ResumeDuration", Long.valueOf(C30436k.f79562f)).mo47823a("sMainActivityCreate2FeedRequestDuration", Long.valueOf(C30436k.f79563g)).mo47824a("requestId", str2).mo47825b());
            }
        });
    }

    /* renamed from: b */
    public static void m71370b(final String str, final String str2) {
        m71365a((Runnable) new Runnable() {
            public final void run() {
                JSONObject b = new C23088c().mo47824a("fake_reason", str).mo47824a("fake_type", str2).mo47824a("has_network", String.valueOf(C30436k.m71371b())).mo47823a("mainCreate2ResumeDuration", Long.valueOf(C30436k.f79562f)).mo47823a("sMainActivityCreate2FeedRequestDuration", Long.valueOf(C30436k.f79563g)).mo47825b();
                C26890h.onEvent(MobClick.obtain().setEventName("fake_feed_response").setLabelName("perf_monitor").setJsonObject(b));
                C26890h.m65012a("fake_feed_response", b);
                C23223a.m57035a("fake_feed_response", b);
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025 A[SYNTHETIC, Splitter:B:14:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002c A[SYNTHETIC, Splitter:B:22:0x002c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m71360a(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ IOException -> 0x0029, all -> 0x0021 }
            java.io.InputStream r3 = r3.open(r4)     // Catch:{ IOException -> 0x0029, all -> 0x0021 }
            int r4 = r3.available()     // Catch:{ IOException -> 0x002a, all -> 0x001f }
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x002a, all -> 0x001f }
            r3.read(r4)     // Catch:{ IOException -> 0x002a, all -> 0x001f }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x002a, all -> 0x001f }
            java.lang.String r2 = "utf-8"
            r1.<init>(r4, r2)     // Catch:{ IOException -> 0x002a, all -> 0x001f }
            if (r3 == 0) goto L_0x001e
            r3.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            return r1
        L_0x001f:
            r4 = move-exception
            goto L_0x0023
        L_0x0021:
            r4 = move-exception
            r3 = r0
        L_0x0023:
            if (r3 == 0) goto L_0x0028
            r3.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            throw r4
        L_0x0029:
            r3 = r0
        L_0x002a:
            if (r3 == 0) goto L_0x002f
            r3.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.C30436k.m71360a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    static void m71363a(FeedItemList feedItemList, int i) {
        boolean z;
        List items = feedItemList.getItems();
        if (!C9376b.m18558a((Collection<T>) items)) {
            int size = items.size();
            for (int i2 = 0; i2 < size; i2++) {
                Aweme aweme = (Aweme) items.get(i2);
                if (C26503d.m64061d(aweme)) {
                    C25945k.m62911b().mo53147k(C11010c.m22280a(), aweme);
                }
            }
        }
        C25945k.m62909a().getAdShowFilterManager().mo53108a(feedItemList);
        List items2 = feedItemList.getItems();
        if (!C9376b.m18558a((Collection<T>) items2)) {
            for (int size2 = items2.size() - 1; size2 >= 0; size2--) {
                Aweme aweme2 = (Aweme) items2.get(size2);
                if (aweme2 != null && aweme2.isAd()) {
                    AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                    String str = "feed_download_ad";
                    if (awemeRawAd != null && awemeRawAd.isHideIfExists() && awemeRawAd.isAppAd() && C18920g.m46052b(C11010c.m22280a(), awemeRawAd.getPackageName())) {
                        C25945k.m62911b().mo53123a(C11010c.m22280a(), awemeRawAd, str);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        break;
                    }
                    items2.remove(size2);
                }
            }
        }
        m71368a(feedItemList.getItems(), feedItemList.getRequestId(), i);
        List<Aweme> items3 = feedItemList.getItems();
        if (items3 != null) {
            for (Aweme aweme3 : items3) {
                if (!(aweme3 == null || aweme3.getAid() == null)) {
                    Set<String> set = C26511e.f69832a;
                    String aid = aweme3.getAid();
                    C52711k.m112236a((Object) aid, "aweme.aid");
                    set.add(aid);
                    if (aweme3.isAd()) {
                        try {
                            AwemeRawAd awemeRawAd2 = aweme3.getAwemeRawAd();
                            if (awemeRawAd2 != null) {
                                Long creativeId = awemeRawAd2.getCreativeId();
                                if (creativeId != null) {
                                    C26511e.f69833b.add(Long.valueOf(creativeId.longValue()));
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            C26467cb.f69755b.mo54181a(C26511e.f69833b);
        }
        if (C19561i.m47861a() && feedItemList.localExtra != null) {
            String str2 = (String) feedItemList.localExtra.get("aweme_id");
            C30259a a = C30259a.m71089a();
            List items4 = feedItemList.getItems();
            if (items4 != null) {
                synchronized (a) {
                    a.mo60622b();
                    Iterator it = items4.iterator();
                    while (it.hasNext()) {
                        Aweme aweme4 = (Aweme) it.next();
                        if (aweme4 != null && !C9431p.m18665a(str2, aweme4.getAid())) {
                            for (C30262a aVar : a.f79049a) {
                                if (aVar != null && C9431p.m18665a(aVar.f79053a, aweme4.getAid())) {
                                    it.remove();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m71364a(Object obj, boolean z, long j) {
        String str;
        C23089d a = C23089d.m56640a();
        if (obj == null || !(obj instanceof FeedItemList)) {
            a.mo47829a("is_cache", "0").mo47829a("is_timeout", "0").mo47826a("cache_num", 0).mo47829a("group_id_list", "").mo47827a("cache_time", j);
        } else {
            C23089d a2 = a.mo47829a("is_cache", "1");
            String str2 = "is_timeout";
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            FeedItemList feedItemList = (FeedItemList) obj;
            a2.mo47829a(str2, str).mo47826a("cache_num", feedItemList.getItems().size()).mo47829a("group_id_list", m71361a(feedItemList)).mo47827a("cache_time", j);
        }
        C26890h.m65011a("pull_out_cache_video", a.f61491a);
    }

    /* renamed from: a */
    public static void m71368a(List<Aweme> list, String str, int i) {
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Aweme aweme = (Aweme) list.get(i2);
                aweme.setRequestId(str);
                Aweme updateAweme = C23324d.m57378a().updateAweme(aweme);
                IRequestIdService a = C23325e.m57379a();
                StringBuilder sb = new StringBuilder();
                sb.append(updateAweme.getAid());
                sb.append(i + 0);
                a.setRequestIdAndIndex(sb.toString(), str, i2);
                list.set(i2, updateAweme);
            }
        }
    }

    /* renamed from: a */
    public static void m71362a(int i, C9381g gVar, Callable callable, int i2, boolean z) {
        Handler handler;
        if (!z || i != 0 || f79557a != null || gVar == 0) {
            handler = gVar;
        } else {
            f79557a = Boolean.valueOf(true);
            if (f79561e != -1) {
                f79563g = SystemClock.elapsedRealtime() - f79561e;
            }
            C30442b bVar = new C30442b(gVar);
            f79565i = bVar;
            callable = new C30441a(callable);
            handler = bVar;
        }
        if (C30550b.m71531b() && C30550b.m71530a(i, 1) && C30550b.m71531b()) {
            synchronized (C30569g.f79855e) {
                C30569g.f79854d = new C30571a(gVar);
            }
        }
        C0013i.m18a((Callable<TResult>) new C30470m<TResult>(new C30465l(callable, handler, i, i2)), (Executor) C24076h.m58902c());
    }
}
