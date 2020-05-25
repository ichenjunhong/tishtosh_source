package com.p683ss.android.ugc.aweme.feed.cache;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.frameworks.baselib.network.http.p574e.C9917l;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.p621b.p622a.C10201a;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.ttnet.INetworkApi;
import com.p683ss.android.common.p1146d.C18894a;
import com.p683ss.android.ugc.aweme.feed.FeedApiService;
import com.p683ss.android.ugc.aweme.feed.experiment.FeedLoadCacheV3DelayExperiment;
import com.p683ss.android.ugc.aweme.feed.experiment.FeedLoadCacheV3TimeExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import com.p683ss.android.ugc.aweme.utils.GsonProvider;
import com.p683ss.android.ugc.aweme.video.preload.C48071a;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import p001a.C0013i;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52808d;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.feed.cache.b */
public final class C30163b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f78727a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C30163b.class), "START_CACHE", "getSTART_CACHE()Lio/reactivex/disposables/Disposable;"))};

    /* renamed from: b */
    static volatile FeedItemList f78728b;

    /* renamed from: c */
    public static volatile boolean f78729c;

    /* renamed from: d */
    public static CountDownLatch f78730d = new CountDownLatch(1);

    /* renamed from: e */
    public static volatile String f78731e;
    /* access modifiers changed from: 0000 */

    /* renamed from: f */
    public static volatile boolean f78732f;

    /* renamed from: g */
    static Object f78733g = new Object();

    /* renamed from: h */
    public static volatile boolean f78734h;

    /* renamed from: i */
    public static final C52668f f78735i = C52732g.m112286a(C52757k.SYNCHRONIZED, C30164a.f78740a);

    /* renamed from: j */
    public static final C30163b f78736j = new C30163b();

    /* renamed from: k */
    private static volatile boolean f78737k;

    /* renamed from: l */
    private static boolean f78738l;

    /* renamed from: m */
    private static volatile boolean f78739m = true;

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.b$a */
    static final class C30164a extends C52712l implements C52670a<C1690c> {

        /* renamed from: a */
        public static final C30164a f78740a = new C30164a();

        C30164a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C2201v g = C11016e.f29598e.mo6548g();
            C52711k.m112236a((Object) g, "activityStoppedSubject.share()");
            return g.mo6545f((C1710e<? super T>) C301651.f78741a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.b$b */
    static final class C30166b<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C30166b f78742a = new C30166b();

        C30166b() {
        }

        public final Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 1);
                C18894a.m46006a("cache_video_request_response", jSONObject);
                return C52860x.f131107a;
            } catch (Exception e) {
                return Integer.valueOf(Log.e("FeedCacheLoader", "", e));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.b$c */
    static final class C30167c<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C30167c f78743a = new C30167c();

        C30167c() {
        }

        public final Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 0);
                jSONObject.put("errorCode", 200);
                C18894a.m46006a("cache_video_request_response", jSONObject);
                return C52860x.f131107a;
            } catch (Exception e) {
                return Integer.valueOf(Log.e("FeedCacheLoader", "", e));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.b$d */
    static final class C30168d<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C30168d f78744a = new C30168d();

        C30168d() {
        }

        public final Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 1);
                C18894a.m46006a("cache_feed_request", jSONObject);
                return C52860x.f131107a;
            } catch (Exception e) {
                return Integer.valueOf(Log.e("FeedCacheLoader", "", e));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.b$e */
    static final class C30169e<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C52727e f78745a;

        C30169e(C52727e eVar) {
            this.f78745a = eVar;
        }

        public final Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                if (((Integer) this.f78745a.element) == null) {
                    jSONObject.put("is_success", 1);
                } else {
                    jSONObject.put("is_success", 0);
                    jSONObject.put("errorCode", ((Integer) this.f78745a.element).intValue());
                }
                C18894a.m46006a("cache_feed_request_response", jSONObject);
                return C52860x.f131107a;
            } catch (Exception e) {
                return Integer.valueOf(Log.e("FeedCacheLoader", "", e));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.b$f */
    static final class C30170f<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C30170f f78746a = new C30170f();

        C30170f() {
        }

        public final Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 1);
                C18894a.m46006a("cache_video_request", jSONObject);
                return C52860x.f131107a;
            } catch (Exception e) {
                return Integer.valueOf(Log.e("FeedCacheLoader", "", e));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.b$g */
    static final class C30171g<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ Exception f78747a;

        C30171g(Exception exc) {
            this.f78747a = exc;
        }

        public final Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 0);
                jSONObject.put("errorCode", C10201a.m20661a((Throwable) this.f78747a, (String[]) null));
                C18894a.m46006a("cache_video_request_response", jSONObject);
                return C52860x.f131107a;
            } catch (Exception e) {
                return Integer.valueOf(Log.e("FeedCacheLoader", "", e));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.b$h */
    static final class C30172h implements Runnable {

        /* renamed from: a */
        public static final C30172h f78748a = new C30172h();

        C30172h() {
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00fd A[SYNTHETIC, Splitter:B:41:0x00fd] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0100 A[SYNTHETIC, Splitter:B:43:0x0100] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r13 = this;
                com.bytedance.ies.abmock.b r0 = com.bytedance.ies.abmock.C10181b.m20511a()     // Catch:{ all -> 0x01ea }
                java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.FeedLoadCacheV3Experiment> r1 = com.p683ss.android.ugc.aweme.feed.experiment.FeedLoadCacheV3Experiment.class
                r2 = 1
                java.lang.String r3 = "is_feed_load_cache_v3"
                r4 = 31744(0x7c00, float:4.4483E-41)
                r5 = 0
                int r0 = r0.mo18168a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x01ea }
                r1 = 1
                if (r0 != r1) goto L_0x01e6
                com.p683ss.android.ugc.aweme.video.preload.C48071a.f120796a = r1     // Catch:{ all -> 0x01ea }
                java.lang.Object r0 = com.p683ss.android.ugc.aweme.feed.cache.C30163b.f78733g     // Catch:{ all -> 0x01ea }
                monitor-enter(r0)     // Catch:{ all -> 0x01ea }
                com.ss.android.ugc.aweme.feed.cache.b r2 = com.p683ss.android.ugc.aweme.feed.cache.C30163b.f78736j     // Catch:{ all -> 0x01e3 }
                boolean r2 = com.p683ss.android.ugc.aweme.feed.cache.C30163b.m70780g()     // Catch:{ all -> 0x01e3 }
                r3 = 10
                r4 = 0
                r5 = 0
                if (r2 != 0) goto L_0x00aa
                android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ all -> 0x01e3 }
                java.lang.String r6 = "feed_video_cache"
                android.content.SharedPreferences r2 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r2, r6, r5)     // Catch:{ all -> 0x01e3 }
                java.lang.String r6 = "feed_video_group_key"
                java.lang.String r2 = r2.getString(r6, r4)     // Catch:{ all -> 0x01e3 }
                com.p683ss.android.ugc.aweme.feed.cache.C30163b.f78731e = r2     // Catch:{ all -> 0x01e3 }
                com.p683ss.android.ugc.aweme.feed.cache.C30163b.m70782i()     // Catch:{ all -> 0x01e3 }
                r6 = r2
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ all -> 0x01e3 }
                boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x01e3 }
                if (r6 != 0) goto L_0x00fa
                java.lang.String r6 = "values"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r6)     // Catch:{ all -> 0x01e3 }
                r7 = r2
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ all -> 0x01e3 }
                char[] r8 = new char[r1]     // Catch:{ all -> 0x01e3 }
                r2 = 44
                r8[r5] = r2     // Catch:{ all -> 0x01e3 }
                r9 = 0
                r10 = 0
                r11 = 6
                r12 = 0
                java.util.List r2 = p2628d.p2650m.C52830p.m112437a(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x01e3 }
                if (r2 == 0) goto L_0x00fa
                r6 = r2
                java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ all -> 0x01e3 }
                boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x01e3 }
                r6 = r6 ^ r1
                if (r6 == 0) goto L_0x00fa
                java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x01e3 }
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x01e3 }
                int r7 = p2628d.p2629a.C52575l.m112104a(r2, r3)     // Catch:{ all -> 0x01e3 }
                r6.<init>(r7)     // Catch:{ all -> 0x01e3 }
                java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ all -> 0x01e3 }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x01e3 }
            L_0x0075:
                boolean r7 = r2.hasNext()     // Catch:{ all -> 0x01e3 }
                if (r7 == 0) goto L_0x00a8
                java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x01e3 }
                java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01e3 }
                java.lang.String r7 = com.p683ss.android.ugc.aweme.video.preload.C48071a.m104096a(r7)     // Catch:{ all -> 0x01e3 }
                r8 = r7
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ all -> 0x01e3 }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x01e3 }
                if (r8 != 0) goto L_0x00a0
                java.io.File r8 = new java.io.File     // Catch:{ all -> 0x01e3 }
                r8.<init>(r7)     // Catch:{ all -> 0x01e3 }
                boolean r7 = r8.exists()     // Catch:{ all -> 0x01e3 }
                if (r7 != 0) goto L_0x009a
                goto L_0x00a0
            L_0x009a:
                d.x r7 = p2628d.C52860x.f131107a     // Catch:{ all -> 0x01e3 }
                r6.add(r7)     // Catch:{ all -> 0x01e3 }
                goto L_0x0075
            L_0x00a0:
                com.p683ss.android.ugc.aweme.feed.cache.C30163b.m70781h()     // Catch:{ all -> 0x01e3 }
                java.lang.String r2 = ""
                com.p683ss.android.ugc.aweme.feed.cache.C30163b.f78731e = r2     // Catch:{ all -> 0x01e3 }
                goto L_0x00fa
            L_0x00a8:
                r2 = 1
                goto L_0x00fb
            L_0x00aa:
                android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ all -> 0x01e3 }
                if (r2 == 0) goto L_0x00fa
                android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ all -> 0x01e3 }
                java.io.File r2 = r2.getCacheDir()     // Catch:{ all -> 0x01e3 }
                java.lang.String r6 = "AppContextManager.getApplicationContext().cacheDir"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r6)     // Catch:{ all -> 0x01e3 }
                java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x01e3 }
                if (r2 != 0) goto L_0x00c4
                goto L_0x00fa
            L_0x00c4:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e3 }
                r6.<init>()     // Catch:{ all -> 0x01e3 }
                r6.append(r2)     // Catch:{ all -> 0x01e3 }
                java.lang.String r2 = java.io.File.separator     // Catch:{ all -> 0x01e3 }
                r6.append(r2)     // Catch:{ all -> 0x01e3 }
                java.lang.String r2 = "feedCache"
                r6.append(r2)     // Catch:{ all -> 0x01e3 }
                java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x01e3 }
                java.io.File r6 = new java.io.File     // Catch:{ all -> 0x01e3 }
                r6.<init>(r2)     // Catch:{ all -> 0x01e3 }
                boolean r2 = r6.exists()     // Catch:{ all -> 0x01e3 }
                if (r2 == 0) goto L_0x00f6
                java.io.File[] r2 = r6.listFiles()     // Catch:{ all -> 0x01e3 }
                if (r2 == 0) goto L_0x00f1
                int r2 = r2.length     // Catch:{ all -> 0x01e3 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01e3 }
                goto L_0x00f2
            L_0x00f1:
                r2 = r4
            L_0x00f2:
                p2628d.p2638e.C52659i.m112211c(r6)     // Catch:{ all -> 0x01e3 }
                goto L_0x00f7
            L_0x00f6:
                r2 = r4
            L_0x00f7:
                com.p683ss.android.ugc.aweme.feed.cache.C30163b.m70769a(r1, r1, r2)     // Catch:{ all -> 0x01e3 }
            L_0x00fa:
                r2 = 0
            L_0x00fb:
                if (r2 != 0) goto L_0x0100
                monitor-exit(r0)     // Catch:{ all -> 0x01ea }
                goto L_0x01e6
            L_0x0100:
                com.ss.android.ugc.aweme.feed.cache.b r2 = com.p683ss.android.ugc.aweme.feed.cache.C30163b.f78736j     // Catch:{ all -> 0x01e3 }
                com.ss.android.ugc.aweme.feed.model.FeedItemList r2 = r2.mo60452b()     // Catch:{ all -> 0x01e3 }
                if (r2 != 0) goto L_0x010e
                com.p683ss.android.ugc.aweme.feed.cache.C30163b.m70781h()     // Catch:{ all -> 0x01e3 }
                monitor-exit(r0)     // Catch:{ all -> 0x01ea }
                goto L_0x01e6
            L_0x010e:
                java.lang.String r6 = com.p683ss.android.ugc.aweme.feed.cache.C30163b.f78731e     // Catch:{ all -> 0x01e3 }
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ all -> 0x01e3 }
                boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x01e3 }
                if (r6 != 0) goto L_0x0179
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x01e3 }
                r6.<init>()     // Catch:{ all -> 0x01e3 }
                java.util.List r7 = r2.getItems()     // Catch:{ all -> 0x01e3 }
                java.lang.String r8 = "itemList.items"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)     // Catch:{ all -> 0x01e3 }
                java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch:{ all -> 0x01e3 }
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x01e3 }
                int r3 = p2628d.p2629a.C52575l.m112104a(r7, r3)     // Catch:{ all -> 0x01e3 }
                r8.<init>(r3)     // Catch:{ all -> 0x01e3 }
                java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ all -> 0x01e3 }
                java.util.Iterator r3 = r7.iterator()     // Catch:{ all -> 0x01e3 }
            L_0x0137:
                boolean r7 = r3.hasNext()     // Catch:{ all -> 0x01e3 }
                if (r7 == 0) goto L_0x0175
                java.lang.Object r7 = r3.next()     // Catch:{ all -> 0x01e3 }
                com.ss.android.ugc.aweme.feed.model.Aweme r7 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r7     // Catch:{ all -> 0x01e3 }
                java.lang.String r9 = com.p683ss.android.ugc.aweme.feed.cache.C30163b.f78731e     // Catch:{ all -> 0x01e3 }
                if (r9 == 0) goto L_0x0163
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x01e3 }
                java.lang.String r10 = "it"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r10)     // Catch:{ all -> 0x01e3 }
                java.lang.String r10 = r7.getAid()     // Catch:{ all -> 0x01e3 }
                java.lang.String r11 = "it.aid"
                p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)     // Catch:{ all -> 0x01e3 }
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ all -> 0x01e3 }
                r11 = 2
                boolean r9 = p2628d.p2650m.C52830p.m112456b(r9, r10, r5, r11, r4)     // Catch:{ all -> 0x01e3 }
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x01e3 }
                goto L_0x0164
            L_0x0163:
                r9 = r4
            L_0x0164:
                if (r9 == 0) goto L_0x016f
                boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x01e3 }
                if (r9 == 0) goto L_0x016f
                r6.add(r7)     // Catch:{ all -> 0x01e3 }
            L_0x016f:
                d.x r7 = p2628d.C52860x.f131107a     // Catch:{ all -> 0x01e3 }
                r8.add(r7)     // Catch:{ all -> 0x01e3 }
                goto L_0x0137
            L_0x0175:
                java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x01e3 }
                r2.items = r6     // Catch:{ all -> 0x01e3 }
            L_0x0179:
                java.util.List r3 = r2.getItems()     // Catch:{ all -> 0x01e3 }
                int r3 = r3.size()     // Catch:{ all -> 0x01e3 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01e3 }
                com.p683ss.android.ugc.aweme.feed.cache.C30163b.m70769a(r1, r5, r3)     // Catch:{ all -> 0x01e3 }
                com.p683ss.android.ugc.aweme.feed.cache.C30163b.f78728b = r2     // Catch:{ all -> 0x01e3 }
                if (r2 == 0) goto L_0x0194
                java.util.List r3 = r2.getItems()     // Catch:{ all -> 0x01e3 }
                if (r3 != 0) goto L_0x0193
                goto L_0x0194
            L_0x0193:
                r1 = 0
            L_0x0194:
                if (r1 != 0) goto L_0x01ca
                com.ss.android.ugc.aweme.commercialize.api.b r1 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62924o()     // Catch:{ Throwable -> 0x01a4 }
                java.lang.String r3 = "feed"
                java.util.List r4 = r2.getItems()     // Catch:{ Throwable -> 0x01a4 }
                r1.mo52800a(r3, r4)     // Catch:{ Throwable -> 0x01a4 }
                goto L_0x01ab
            L_0x01a4:
                java.lang.String r1 = "CacheDataProcessor"
                java.lang.String r3 = "requestLinkData error"
                com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75150b(r1, r3)     // Catch:{ all -> 0x01e3 }
            L_0x01ab:
                java.lang.String r1 = r2.getRequestId()     // Catch:{ all -> 0x01e3 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x01e3 }
                if (r1 != 0) goto L_0x01ca
                com.ss.android.ugc.aweme.feed.aa r1 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()     // Catch:{ Throwable -> 0x01c3 }
                java.lang.String r3 = r2.getRequestId()     // Catch:{ Throwable -> 0x01c3 }
                com.ss.android.ugc.aweme.feed.model.LogPbBean r2 = r2.logPb     // Catch:{ Throwable -> 0x01c3 }
                r1.mo60162a(r3, r2)     // Catch:{ Throwable -> 0x01c3 }
                goto L_0x01ca
            L_0x01c3:
                java.lang.String r1 = "CacheDataProcessor"
                java.lang.String r2 = "putAwemeLogPbData error"
                com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75150b(r1, r2)     // Catch:{ all -> 0x01e3 }
            L_0x01ca:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e3 }
                java.lang.String r2 = "preloadCache end "
                r1.<init>(r2)     // Catch:{ all -> 0x01e3 }
                java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x01e3 }
                java.lang.String r3 = "Thread.currentThread()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ all -> 0x01e3 }
                java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x01e3 }
                r1.append(r2)     // Catch:{ all -> 0x01e3 }
                monitor-exit(r0)     // Catch:{ all -> 0x01ea }
                goto L_0x01e6
            L_0x01e3:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x01ea }
                throw r1     // Catch:{ all -> 0x01ea }
            L_0x01e6:
                com.p683ss.android.ugc.aweme.feed.cache.C30163b.m70782i()
                return
            L_0x01ea:
                r0 = move-exception
                com.p683ss.android.ugc.aweme.feed.cache.C30163b.m70782i()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.cache.C30163b.C30172h.run():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.b$i */
    static final class C30173i implements Runnable {

        /* renamed from: a */
        public static final C30173i f78749a = new C30173i();

        C30173i() {
        }

        public final void run() {
            FileOutputStream fileOutputStream;
            boolean z;
            Boolean bool;
            try {
                FileOutputStream fileOutputStream2 = null;
                if (C11010c.m22280a() != null) {
                    if (!TextUtils.isEmpty(C30163b.f78731e)) {
                        File cacheDir = C11010c.m22280a().getCacheDir();
                        C52711k.m112236a((Object) cacheDir, "AppContextManager.getApplicationContext().cacheDir");
                        String absolutePath = cacheDir.getAbsolutePath();
                        if (absolutePath != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(absolutePath);
                            sb.append(File.separator);
                            sb.append("feedCache");
                            File file = new File(sb.toString());
                            if (file.exists()) {
                                File[] listFiles = file.listFiles();
                                if (listFiles != null) {
                                    if (listFiles.length == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (!z) {
                                        Collection arrayList = new ArrayList(listFiles.length);
                                        for (File file2 : listFiles) {
                                            String str = C30163b.f78731e;
                                            if (str != null) {
                                                CharSequence charSequence = str;
                                                C52711k.m112236a((Object) file2, "it");
                                                String name = file2.getName();
                                                C52711k.m112236a((Object) name, "it.name");
                                                bool = Boolean.valueOf(C52830p.m112456b(charSequence, (CharSequence) name, false, 2, (Object) null));
                                            } else {
                                                bool = null;
                                            }
                                            if (bool == null || !bool.booleanValue()) {
                                                file2.delete();
                                            }
                                            arrayList.add(C52860x.f131107a);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                FeedItemList c = C30163b.f78736j.mo60453c();
                C30163b bVar = C30163b.f78736j;
                if (!(c == null || c.getItems() == null)) {
                    if (c.getItems().size() > 0) {
                        if (C11010c.m22280a() != null) {
                            File cacheDir2 = C11010c.m22280a().getCacheDir();
                            C52711k.m112236a((Object) cacheDir2, "AppContextManager.getApplicationContext().cacheDir");
                            String absolutePath2 = cacheDir2.getAbsolutePath();
                            if (absolutePath2 != null) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(absolutePath2);
                                sb2.append(File.separator);
                                sb2.append("feedCache");
                                String sb3 = sb2.toString();
                                File file3 = new File(sb3);
                                if (!file3.exists()) {
                                    file3.mkdir();
                                }
                                if (!bVar.mo60451a(c, sb3)) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(sb3);
                                    sb4.append(File.separator);
                                    sb4.append("feed.json");
                                    File file4 = new File(sb4.toString());
                                    if (C30163b.m70773a(file4)) {
                                        GsonProvider a = C47759cc.m103382a();
                                        C52711k.m112236a((Object) a, "GsonProvider.get()");
                                        String b = a.getGson().mo34889b(c);
                                        if (!TextUtils.isEmpty(b)) {
                                            try {
                                                fileOutputStream = new FileOutputStream(file4);
                                                try {
                                                    C52711k.m112236a((Object) b, "value");
                                                    Charset charset = C52808d.f131043a;
                                                    if (b != null) {
                                                        byte[] bytes = b.getBytes(charset);
                                                        C52711k.m112236a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                                                        fileOutputStream.write(bytes);
                                                        C30163b.m70777d();
                                                        C47723bk.m103309a((Closeable) fileOutputStream);
                                                    } else {
                                                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                                                    }
                                                } catch (Exception unused) {
                                                    fileOutputStream2 = fileOutputStream;
                                                    C47723bk.m103309a((Closeable) fileOutputStream2);
                                                    C30163b.f78736j.mo60450a(c);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    C47723bk.m103309a((Closeable) fileOutputStream);
                                                    throw th;
                                                }
                                            } catch (Exception unused2) {
                                                C47723bk.m103309a((Closeable) fileOutputStream2);
                                                C30163b.f78736j.mo60450a(c);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                fileOutputStream = null;
                                                C47723bk.m103309a((Closeable) fileOutputStream);
                                                throw th;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C30163b.f78736j.mo60450a(c);
            } finally {
                C30163b.f78732f = false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.b$j */
    static final class C30174j<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C30174j f78750a = new C30174j();

        C30174j() {
        }

        public final Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_cache", 0);
                C18894a.m46006a("pull_out_cache_video", jSONObject);
                return C52860x.f131107a;
            } catch (Exception e) {
                return Integer.valueOf(Log.e("FeedCacheLoader", "", e));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.b$k */
    static final class C30175k<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ int f78751a;

        /* renamed from: b */
        final /* synthetic */ int f78752b;

        /* renamed from: c */
        final /* synthetic */ Integer f78753c;

        C30175k(int i, int i2, Integer num) {
            this.f78751a = i;
            this.f78752b = i2;
            this.f78753c = num;
        }

        public final Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_cache", this.f78751a);
                jSONObject.put("is_timeout", this.f78752b);
                jSONObject.put("cache_num", this.f78753c);
                C18894a.m46006a("pull_out_cache_video", jSONObject);
                return C52860x.f131107a;
            } catch (Exception e) {
                return Integer.valueOf(Log.e("FeedCacheLoader", "", e));
            }
        }
    }

    private C30163b() {
    }

    /* renamed from: h */
    static void m70781h() {
        C0013i.m16a((Callable<TResult>) C30174j.f78750a);
    }

    /* renamed from: j */
    public static boolean m70783j() {
        return C48071a.m104097a();
    }

    /* renamed from: i */
    public static void m70782i() {
        f78729c = true;
        f78730d.countDown();
    }

    /* renamed from: a */
    public static boolean m70771a() {
        boolean z = f78737k;
        if (f78737k) {
            f78737k = false;
        }
        return z;
    }

    /* renamed from: f */
    public static void m70779f() {
        if (!f78738l) {
            f78738l = true;
            C24076h.m58902c().execute(C30172h.f78748a);
        }
    }

    /* renamed from: k */
    public static void m70784k() {
        C35807d.m80935a(C11010c.m22280a(), "feed_video_cache", 0).edit().putLong("feed_video_cache_time", 0).apply();
    }

    /* renamed from: d */
    static void m70777d() {
        Editor edit = C35807d.m80935a(C11010c.m22280a(), "feed_video_cache", 0).edit();
        edit.putLong("feed_video_cache_time", System.currentTimeMillis());
        edit.putString("feed_video_group_key", "");
        edit.apply();
    }

    /* renamed from: e */
    public static FeedItemList m70778e() {
        C52727e eVar = new C52727e();
        synchronized (f78733g) {
            eVar.element = f78728b;
        }
        if (((FeedItemList) eVar.element) != null) {
            f78737k = true;
            f78734h = true;
        }
        f78728b = null;
        return (FeedItemList) eVar.element;
    }

    /* renamed from: g */
    static boolean m70780g() {
        SharedPreferences a = C35807d.m80935a(C11010c.m22280a(), "feed_video_cache", 0);
        long j = a.getLong("feed_video_cache_time", 0);
        int a2 = C10181b.m20511a().mo18168a(FeedLoadCacheV3TimeExperiment.class, true, "is_feed_load_cache_v3_time", 31744, 0) * 3600000;
        String string = a.getString("feed_video_group_key", null);
        if (a2 <= 0 || (System.currentTimeMillis() - j < ((long) a2) && !TextUtils.isEmpty(string))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x0015] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.p683ss.android.ugc.aweme.feed.model.FeedItemList m70786m() {
        /*
            r5 = this;
            java.lang.String r0 = "feed.json"
            java.io.File r0 = m70776b(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0061
            com.google.gson.c.a r2 = new com.google.gson.c.a     // Catch:{ Exception -> 0x0058, all -> 0x0050 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x0058, all -> 0x0050 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0058, all -> 0x0050 }
            java.io.Reader r3 = (java.io.Reader) r3     // Catch:{ Exception -> 0x0058, all -> 0x0050 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0058, all -> 0x0050 }
            com.ss.android.ugc.aweme.utils.GsonProvider r3 = com.p683ss.android.ugc.aweme.utils.C47759cc.m103382a()     // Catch:{ Exception -> 0x0059, all -> 0x004e }
            java.lang.String r4 = "GsonProvider.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)     // Catch:{ Exception -> 0x0059, all -> 0x004e }
            com.google.gson.f r3 = r3.getGson()     // Catch:{ Exception -> 0x0059, all -> 0x004e }
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.FeedItemList> r4 = com.p683ss.android.ugc.aweme.feed.model.FeedItemList.class
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4     // Catch:{ Exception -> 0x0059, all -> 0x004e }
            java.lang.Object r3 = r3.mo34880a(r2, r4)     // Catch:{ Exception -> 0x0059, all -> 0x004e }
            com.ss.android.ugc.aweme.feed.model.FeedItemList r3 = (com.p683ss.android.ugc.aweme.feed.model.FeedItemList) r3     // Catch:{ Exception -> 0x0059, all -> 0x004e }
            if (r3 == 0) goto L_0x0048
            java.util.List r4 = r3.getItems()     // Catch:{ Exception -> 0x0046, all -> 0x004e }
            if (r4 == 0) goto L_0x0048
            java.util.List r4 = r3.getItems()     // Catch:{ Exception -> 0x0046, all -> 0x004e }
            int r4 = r4.size()     // Catch:{ Exception -> 0x0046, all -> 0x004e }
            if (r4 > 0) goto L_0x003f
            goto L_0x0048
        L_0x003f:
            java.io.Closeable r2 = (java.io.Closeable) r2
            com.p683ss.android.ugc.aweme.utils.C47723bk.m103309a(r2)
            r1 = r3
            goto L_0x005e
        L_0x0046:
            r1 = r3
            goto L_0x0059
        L_0x0048:
            java.io.Closeable r2 = (java.io.Closeable) r2
            com.p683ss.android.ugc.aweme.utils.C47723bk.m103309a(r2)
            return r1
        L_0x004e:
            r0 = move-exception
            goto L_0x0052
        L_0x0050:
            r0 = move-exception
            r2 = r1
        L_0x0052:
            java.io.Closeable r2 = (java.io.Closeable) r2
            com.p683ss.android.ugc.aweme.utils.C47723bk.m103309a(r2)
            throw r0
        L_0x0058:
            r2 = r1
        L_0x0059:
            java.io.Closeable r2 = (java.io.Closeable) r2
            com.p683ss.android.ugc.aweme.utils.C47723bk.m103309a(r2)
        L_0x005e:
            r0.delete()
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.cache.C30163b.m70786m():com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    /* renamed from: c */
    public final FeedItemList mo60453c() {
        FeedItemList feedItemList;
        C0013i.m16a((Callable<TResult>) C30168d.f78744a);
        C52727e eVar = new C52727e();
        eVar.element = null;
        try {
            feedItemList = FeedApiService.m70129a().fetchFeedList(0, 0, 0, 0, null, null, 8, 0, "", null, null, 0, null);
            if (feedItemList != null) {
                try {
                    if (!C9376b.m18558a((Collection<T>) feedItemList.getItems())) {
                        Iterator it = feedItemList.getItems().iterator();
                        while (it.hasNext()) {
                            Aweme aweme = (Aweme) it.next();
                            if (aweme != null && aweme.isLive()) {
                                it.remove();
                            }
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    eVar.element = Integer.valueOf(C10201a.m20661a((Throwable) e, (String[]) null));
                    C0013i.m16a((Callable<TResult>) new C30169e<TResult>(eVar));
                    return feedItemList;
                }
            }
        } catch (Exception e2) {
            e = e2;
            feedItemList = null;
            eVar.element = Integer.valueOf(C10201a.m20661a((Throwable) e, (String[]) null));
            C0013i.m16a((Callable<TResult>) new C30169e<TResult>(eVar));
            return feedItemList;
        }
        C0013i.m16a((Callable<TResult>) new C30169e<TResult>(eVar));
        return feedItemList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final FeedItemList mo60452b() {
        long a = C10181b.m20511a().mo18169a(FeedLoadCacheV3DelayExperiment.class, true, "feed_load_cache_delay_new", 31744, 0);
        if (a > 0) {
            try {
                Thread.sleep(a);
            } catch (InterruptedException unused) {
            }
        }
        if (!f78739m) {
            return null;
        }
        FeedItemList l = m70785l();
        if (l == null) {
            l = m70786m();
        }
        C35807d.m80935a(C11010c.m22280a(), "feed_video_cache", 0).edit().putString("feed_video_group_key", null).apply();
        return l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a6, code lost:
        if (r1.getItems().size() > 0) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f1, code lost:
        if (r1.getItems().size() > 0) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f3, code lost:
        m70769a(-2, 0, java.lang.Integer.valueOf(r1.getItems().size()));
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e3  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.p683ss.android.ugc.aweme.feed.model.FeedItemList m70785l() {
        /*
            r8 = this;
            java.lang.String r0 = "feed.pb"
            java.io.File r0 = m70776b(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0112
            r2 = -2
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x00e0, all -> 0x00ae }
            r4.<init>(r0)     // Catch:{ Throwable -> 0x00e0, all -> 0x00ae }
            java.io.InputStream r4 = (java.io.InputStream) r4     // Catch:{ Throwable -> 0x00e0, all -> 0x00ae }
            com.squareup.wire.ProtoAdapter<com.ss.ugc.aweme.proto.aweme_v2_feed_response> r5 = com.p683ss.ugc.aweme.proto.aweme_v2_feed_response.ADAPTER     // Catch:{ Throwable -> 0x00ac, all -> 0x00a9 }
            java.lang.Object r5 = r5.decode(r4)     // Catch:{ Throwable -> 0x00ac, all -> 0x00a9 }
            com.ss.ugc.aweme.proto.aweme_v2_feed_response r5 = (com.p683ss.ugc.aweme.proto.aweme_v2_feed_response) r5     // Catch:{ Throwable -> 0x00ac, all -> 0x00a9 }
            if (r5 == 0) goto L_0x0096
            com.ss.android.ugc.aweme.feed.model.FeedItemList r5 = com.p683ss.android.ugc.aweme.feed.api.C30156n.m70763a(r5, r1)     // Catch:{ Throwable -> 0x00ac, all -> 0x00a9 }
            if (r5 == 0) goto L_0x0067
            java.util.List r6 = r5.getItems()     // Catch:{ Throwable -> 0x0064, all -> 0x0062 }
            if (r6 == 0) goto L_0x0067
            java.util.List r6 = r5.getItems()     // Catch:{ Throwable -> 0x0064, all -> 0x0062 }
            int r6 = r6.size()     // Catch:{ Throwable -> 0x0064, all -> 0x0062 }
            if (r6 > 0) goto L_0x0033
            goto L_0x0067
        L_0x0033:
            if (r5 == 0) goto L_0x0060
            android.content.Context r6 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Throwable -> 0x0064, all -> 0x0062 }
            java.lang.String r7 = "feed_video_cache"
            android.content.SharedPreferences r6 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r6, r7, r3)     // Catch:{ Throwable -> 0x0064, all -> 0x0062 }
            java.lang.String r7 = "feed_cache_request_id"
            java.lang.String r1 = r6.getString(r7, r1)     // Catch:{ Throwable -> 0x0064, all -> 0x0062 }
            r7 = r1
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Throwable -> 0x0064, all -> 0x0062 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x0064, all -> 0x0062 }
            if (r7 != 0) goto L_0x0051
            r5.setRequestId(r1)     // Catch:{ Throwable -> 0x0064, all -> 0x0062 }
        L_0x0051:
            android.content.SharedPreferences$Editor r1 = r6.edit()     // Catch:{ Throwable -> 0x0064, all -> 0x0062 }
            java.lang.String r6 = "feed_cache_request_id"
            java.lang.String r7 = ""
            android.content.SharedPreferences$Editor r1 = r1.putString(r6, r7)     // Catch:{ Throwable -> 0x0064, all -> 0x0062 }
            r1.apply()     // Catch:{ Throwable -> 0x0064, all -> 0x0062 }
        L_0x0060:
            r1 = r5
            goto L_0x0096
        L_0x0062:
            r0 = move-exception
            goto L_0x00b1
        L_0x0064:
            r1 = r5
            goto L_0x00e1
        L_0x0067:
            if (r5 == 0) goto L_0x0089
            java.util.List r0 = r5.getItems()
            if (r0 == 0) goto L_0x0089
            java.util.List r0 = r5.getItems()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0089
            java.util.List r0 = r5.getItems()
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            m70769a(r2, r3, r0)
            goto L_0x0090
        L_0x0089:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            m70769a(r2, r3, r0)
        L_0x0090:
            java.io.Closeable r4 = (java.io.Closeable) r4
            com.p683ss.android.ugc.aweme.utils.C47723bk.m103309a(r4)
            return r1
        L_0x0096:
            if (r1 == 0) goto L_0x0103
            java.util.List r5 = r1.getItems()
            if (r5 == 0) goto L_0x0103
            java.util.List r5 = r1.getItems()
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x0103
            goto L_0x00f3
        L_0x00a9:
            r0 = move-exception
            r5 = r1
            goto L_0x00b1
        L_0x00ac:
            goto L_0x00e1
        L_0x00ae:
            r0 = move-exception
            r4 = r1
            r5 = r4
        L_0x00b1:
            if (r5 == 0) goto L_0x00d3
            java.util.List r1 = r5.getItems()
            if (r1 == 0) goto L_0x00d3
            java.util.List r1 = r5.getItems()
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00d3
            java.util.List r1 = r5.getItems()
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            m70769a(r2, r3, r1)
            goto L_0x00da
        L_0x00d3:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            m70769a(r2, r3, r1)
        L_0x00da:
            java.io.Closeable r4 = (java.io.Closeable) r4
            com.p683ss.android.ugc.aweme.utils.C47723bk.m103309a(r4)
            throw r0
        L_0x00e0:
            r4 = r1
        L_0x00e1:
            if (r1 == 0) goto L_0x0103
            java.util.List r5 = r1.getItems()
            if (r5 == 0) goto L_0x0103
            java.util.List r5 = r1.getItems()
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x0103
        L_0x00f3:
            java.util.List r5 = r1.getItems()
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            m70769a(r2, r3, r5)
            goto L_0x010a
        L_0x0103:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            m70769a(r2, r3, r5)
        L_0x010a:
            java.io.Closeable r4 = (java.io.Closeable) r4
            com.p683ss.android.ugc.aweme.utils.C47723bk.m103309a(r4)
            r0.delete()
        L_0x0112:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.cache.C30163b.m70785l():com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    /* renamed from: a */
    static boolean m70773a(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m70774a(String str) {
        if (str == null || f78731e == null) {
            return false;
        }
        String str2 = f78731e;
        Boolean bool = null;
        if (str2 != null) {
            bool = Boolean.valueOf(C52830p.m112456b((CharSequence) str2, (CharSequence) str, false, 2, (Object) null));
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: b */
    private static File m70776b(String str) {
        if (C11010c.m22280a() == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        File cacheDir = C11010c.m22280a().getCacheDir();
        C52711k.m112236a((Object) cacheDir, "AppContextManager.getApplicationContext().cacheDir");
        sb.append(cacheDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append("feedCache");
        sb.append(File.separator);
        sb.append(str);
        File file = new File(sb.toString());
        if (!file.exists()) {
            return null;
        }
        return file;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60450a(com.p683ss.android.ugc.aweme.feed.model.FeedItemList r12) {
        /*
            r11 = this;
            if (r12 == 0) goto L_0x000f
            java.util.List r0 = r12.getItems()
            if (r0 == 0) goto L_0x000f
            java.util.List r0 = r12.getItems()
            r0.size()
        L_0x000f:
            d.f.b.v$a r0 = new d.f.b.v$a
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "feed size = "
            r2.<init>(r3)
            r3 = 0
            if (r12 == 0) goto L_0x0032
            java.util.List r4 = r12.getItems()
            if (r4 == 0) goto L_0x0032
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0033
        L_0x0032:
            r4 = r3
        L_0x0033:
            r2.append(r4)
            com.bytedance.ies.abmock.b r5 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.FeedLoadCacheV3CountExperiment> r6 = com.p683ss.android.ugc.aweme.feed.experiment.FeedLoadCacheV3CountExperiment.class
            r7 = 1
            java.lang.String r8 = "is_feed_load_cache_v3_count"
            r9 = 31744(0x7c00, float:4.4483E-41)
            r10 = 2
            int r2 = r5.mo18168a(r6, r7, r8, r9, r10)
            if (r2 > 0) goto L_0x004e
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0052
        L_0x004e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0052:
            if (r12 == 0) goto L_0x015d
            java.util.List r12 = r12.getItems()
            if (r12 == 0) goto L_0x015d
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = p2628d.p2629a.C52575l.m112104a(r12, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r12 = r12.iterator()
            r5 = 0
            r6 = 0
        L_0x006f:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto L_0x015c
            java.lang.Object r7 = r12.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r7
            if (r7 == 0) goto L_0x0155
            com.ss.android.ugc.aweme.feed.model.Video r8 = r7.getVideo()
            if (r8 == 0) goto L_0x0155
            com.ss.android.ugc.aweme.feed.model.Video r8 = r7.getVideo()
            java.lang.String r9 = "it.video"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r8 = r8.getPlayAddr()
            if (r8 == 0) goto L_0x0155
            com.ss.android.ugc.aweme.feed.model.Video r8 = r7.getVideo()
            java.lang.String r9 = "it.video"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r8 = r8.getPlayAddr()
            java.lang.String r9 = "it.video.playAddr"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            java.util.List r8 = r8.getUrlList()
            if (r8 == 0) goto L_0x0155
            com.ss.android.ugc.aweme.feed.model.Video r8 = r7.getVideo()
            java.lang.String r9 = "it.video"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r8 = r8.getPlayAddr()
            java.lang.String r9 = "it.video.playAddr"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            java.util.List r8 = r8.getUrlList()
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0155
            if (r2 == 0) goto L_0x0155
            int r8 = r2.intValue()
            int r8 = p2628d.p2639f.p2641b.C52711k.m112230a(r6, r8)
            if (r8 >= 0) goto L_0x0155
            com.ss.android.ugc.aweme.feed.cache.b r8 = f78736j
            com.ss.android.ugc.aweme.feed.model.Video r9 = r7.getVideo()
            java.lang.String r10 = "it.video"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r9 = r9.getPlayAddr()
            java.lang.String r10 = "it.video.playAddr"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            java.util.List r9 = r9.getUrlList()
            java.lang.Object r9 = r9.get(r5)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = r7.getAid()
            boolean r8 = r8.m70775a(r9, r10)
            r0.element = r8
            boolean r8 = r0.element
            if (r8 == 0) goto L_0x0155
            int r6 = r6 + 1
            java.lang.String r8 = r7.getAid()
            r1.add(r8)
            java.lang.String r7 = r7.getAid()
            android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            if (r8 == 0) goto L_0x0155
            r8 = r7
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L_0x011b
            goto L_0x0155
        L_0x011b:
            android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            java.lang.String r9 = "feed_video_cache"
            android.content.SharedPreferences r8 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r8, r9, r5)
            java.lang.String r9 = "feed_video_group_key"
            java.lang.String r9 = r8.getString(r9, r3)
            r10 = r9
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0135
            goto L_0x0149
        L_0x0135:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r9 = 44
            r10.append(r9)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
        L_0x0149:
            android.content.SharedPreferences$Editor r8 = r8.edit()
            java.lang.String r9 = "feed_video_group_key"
            r8.putString(r9, r7)
            r8.apply()
        L_0x0155:
            d.x r7 = p2628d.C52860x.f131107a
            r4.add(r7)
            goto L_0x006f
        L_0x015c:
            return
        L_0x015d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.cache.C30163b.mo60450a(com.ss.android.ugc.aweme.feed.model.FeedItemList):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:44|43|47|48|(0)|42|58) */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d6, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d7, code lost:
        r5 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00d9 */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e2 A[SYNTHETIC, Splitter:B:50:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e8 A[SYNTHETIC, Splitter:B:53:0x00e8] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m70772a(com.bytedance.retrofit2.C12799u<com.bytedance.retrofit2.mime.TypedInput> r8, java.lang.String r9) {
        /*
            r0 = r9
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            boolean r0 = r8.mo23960c()
            if (r0 == 0) goto L_0x00ef
            T r0 = r8.f33552b
            com.bytedance.retrofit2.mime.TypedInput r0 = (com.bytedance.retrofit2.mime.TypedInput) r0
            java.io.InputStream r0 = r0.mo9554in()
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            com.bytedance.retrofit2.a.d r3 = r8.f33551a
            r4 = 1
            if (r3 == 0) goto L_0x0090
            com.bytedance.retrofit2.a.d r3 = r8.f33551a
            java.lang.String r5 = "response.raw()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            java.util.List<com.bytedance.retrofit2.a.b> r3 = r3.f33349d
            if (r3 == 0) goto L_0x0090
            com.bytedance.retrofit2.a.d r3 = r8.f33551a
            java.lang.String r5 = "response.raw()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            java.util.List<com.bytedance.retrofit2.a.b> r3 = r3.f33349d
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0090
            com.bytedance.retrofit2.a.d r8 = r8.f33551a
            java.lang.String r3 = "response.raw()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r3)
            java.util.List<com.bytedance.retrofit2.a.b> r8 = r8.f33349d
            java.lang.String r3 = "response.raw().headers"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r3)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = p2628d.p2629a.C52575l.m112104a(r8, r5)
            r3.<init>(r5)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r8 = r8.iterator()
        L_0x005f:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L_0x0090
            java.lang.Object r5 = r8.next()
            com.bytedance.retrofit2.a.b r5 = (com.bytedance.retrofit2.p830a.C12685b) r5
            java.lang.String r6 = "Content-Length"
            java.lang.String r7 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
            java.lang.String r7 = r5.f33318a
            boolean r6 = p2628d.p2650m.C52830p.m112406a(r6, r7, r4)
            if (r6 == 0) goto L_0x008a
            java.lang.String r5 = r5.f33319b     // Catch:{ Exception -> 0x008a }
            java.lang.String r6 = "it.value"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)     // Catch:{ Exception -> 0x008a }
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ Exception -> 0x008a }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x008a }
            r2 = r5
        L_0x008a:
            d.x r5 = p2628d.C52860x.f131107a
            r3.add(r5)
            goto L_0x005f
        L_0x0090:
            if (r0 == 0) goto L_0x00ef
            java.lang.String r8 = com.p683ss.android.ugc.aweme.video.preload.C48071a.m104096a(r9)
            if (r8 != 0) goto L_0x0099
            return r1
        L_0x0099:
            r9 = 0
            r3 = 8192(0x2000, float:1.14794E-41)
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x00d9 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00d9 }
            r5.<init>(r8)     // Catch:{ Exception -> 0x00d9 }
            java.io.OutputStream r5 = (java.io.OutputStream) r5     // Catch:{ Exception -> 0x00d9 }
            r9 = 0
        L_0x00a6:
            if (r9 < 0) goto L_0x00b4
            int r9 = r0.read(r3)     // Catch:{ Exception -> 0x00d4, all -> 0x00b2 }
            if (r9 <= 0) goto L_0x00a6
            r5.write(r3, r1, r9)     // Catch:{ Exception -> 0x00d4, all -> 0x00b2 }
            goto L_0x00a6
        L_0x00b2:
            r8 = move-exception
            goto L_0x00e6
        L_0x00b4:
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x00d4, all -> 0x00b2 }
            r9.<init>(r8)     // Catch:{ Exception -> 0x00d4, all -> 0x00b2 }
            long r8 = r9.length()     // Catch:{ Exception -> 0x00d4, all -> 0x00b2 }
            long r2 = r2.longValue()     // Catch:{ Exception -> 0x00d4, all -> 0x00b2 }
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x00cd
            com.ss.android.ugc.aweme.feed.cache.b$b r8 = com.p683ss.android.ugc.aweme.feed.cache.C30163b.C30166b.f78742a     // Catch:{ Exception -> 0x00d4, all -> 0x00b2 }
            java.util.concurrent.Callable r8 = (java.util.concurrent.Callable) r8     // Catch:{ Exception -> 0x00d4, all -> 0x00b2 }
            p001a.C0013i.m16a(r8)     // Catch:{ Exception -> 0x00d4, all -> 0x00b2 }
            r1 = 1
        L_0x00cd:
            r5.close()     // Catch:{ Exception -> 0x00ef }
        L_0x00d0:
            r0.close()     // Catch:{ Exception -> 0x00ef }
            goto L_0x00ef
        L_0x00d4:
            r9 = r5
            goto L_0x00d9
        L_0x00d6:
            r8 = move-exception
            r5 = r9
            goto L_0x00e6
        L_0x00d9:
            com.ss.android.ugc.aweme.feed.cache.b$c r8 = com.p683ss.android.ugc.aweme.feed.cache.C30163b.C30167c.f78743a     // Catch:{ all -> 0x00d6 }
            java.util.concurrent.Callable r8 = (java.util.concurrent.Callable) r8     // Catch:{ all -> 0x00d6 }
            p001a.C0013i.m16a(r8)     // Catch:{ all -> 0x00d6 }
            if (r9 == 0) goto L_0x00d0
            r9.close()     // Catch:{ Exception -> 0x00ef }
            goto L_0x00d0
        L_0x00e6:
            if (r5 == 0) goto L_0x00eb
            r5.close()     // Catch:{ Exception -> 0x00ee }
        L_0x00eb:
            r0.close()     // Catch:{ Exception -> 0x00ee }
        L_0x00ee:
            throw r8
        L_0x00ef:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.cache.C30163b.m70772a(com.bytedance.retrofit2.u, java.lang.String):boolean");
    }

    /* renamed from: a */
    private final boolean m70775a(String str, String str2) {
        C12799u uVar;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Map linkedHashMap = new LinkedHashMap();
        Pair a = C9917l.m19876a(str, linkedHashMap);
        String str3 = (String) a.first;
        String str4 = (String) a.second;
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            return false;
        }
        C0013i.m16a((Callable<TResult>) C30170f.f78746a);
        try {
            uVar = ((INetworkApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(str3).mo19926b(false).mo19925a().mo19930a(INetworkApi.class)).downloadFile(false, -1, str4, linkedHashMap).execute();
        } catch (Exception e) {
            C0013i.m16a((Callable<TResult>) new C30171g<TResult>(e));
            uVar = null;
        }
        if (uVar == null) {
            return false;
        }
        return m70772a(uVar, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo60451a(FeedItemList feedItemList, String str) {
        OutputStream outputStream;
        if (!(feedItemList == null || feedItemList.pbData == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            sb.append("feed.pb");
            File file = new File(sb.toString());
            if (m70773a(file)) {
                OutputStream outputStream2 = null;
                try {
                    outputStream = new FileOutputStream(file);
                } catch (Throwable th) {
                    th = th;
                    outputStream = null;
                    C47723bk.m103309a((Closeable) outputStream);
                    throw th;
                }
                try {
                    feedItemList.pbData.encode(outputStream);
                    m70777d();
                    String requestId = feedItemList.getRequestId();
                    if (!TextUtils.isEmpty(requestId)) {
                        Editor edit = C35807d.m80935a(C11010c.m22280a(), "feed_video_cache", 0).edit();
                        edit.putString("feed_cache_request_id", requestId);
                        edit.apply();
                    }
                    C47723bk.m103309a((Closeable) outputStream);
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                    C47723bk.m103309a((Closeable) outputStream);
                    throw th;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static void m70769a(int i, int i2, Integer num) {
        C0013i.m16a((Callable<TResult>) new C30175k<TResult>(i, i2, num));
    }
}
