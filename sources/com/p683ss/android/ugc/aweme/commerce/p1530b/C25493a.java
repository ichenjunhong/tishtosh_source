package com.p683ss.android.ugc.aweme.commerce.p1530b;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.commerce.C25512d;
import com.p683ss.android.ugc.aweme.commerce.p1530b.C25504h.C25506b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26060ay;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26514h;
import com.p683ss.android.ugc.aweme.effect.C29094ad;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p888c.p889a.p890a.p891a.C13383a;
import com.p888c.p889a.p890a.p891a.p893b.C13390a;
import com.p888c.p889a.p890a.p891a.p893b.C13394b;
import com.p888c.p889a.p890a.p891a.p893b.C13395c;
import com.p888c.p889a.p890a.p891a.p893b.C13396d;
import com.p888c.p889a.p890a.p891a.p893b.C13398f;
import com.p888c.p889a.p890a.p891a.p893b.C13400h;
import com.p888c.p889a.p890a.p891a.p893b.C13401i;
import com.p888c.p889a.p890a.p891a.p893b.C13402j;
import com.p888c.p889a.p890a.p891a.p893b.C13403k;
import com.p888c.p889a.p890a.p891a.p893b.p894a.C13391a;
import com.p888c.p889a.p890a.p891a.p893b.p894a.C13392b;
import com.p888c.p889a.p890a.p891a.p893b.p894a.C13393c;
import com.p888c.p889a.p890a.p891a.p897e.C13426e;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commerce.b.a */
public class C25493a implements C25512d {

    /* renamed from: a */
    public static final String f67424a = "a";

    /* renamed from: h */
    private static volatile C25493a f67425h;

    /* renamed from: b */
    public boolean f67426b;

    /* renamed from: c */
    public boolean f67427c;

    /* renamed from: d */
    public boolean f67428d;

    /* renamed from: e */
    public int f67429e = 0;

    /* renamed from: f */
    public C25497a f67430f;

    /* renamed from: g */
    public Handler f67431g = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    private Map<String, C13391a> f67432i = Collections.synchronizedMap(new HashMap());

    /* renamed from: j */
    private Map<String, C13394b> f67433j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    private C25504h f67434k = new C25504h(AwemeApplication.m56199a().getApplicationContext());

    /* renamed from: l */
    private Handler f67435l = new Handler(Looper.getMainLooper());

    /* renamed from: m */
    private long f67436m = -1;

    /* renamed from: n */
    private Runnable f67437n = new Runnable() {
        public final void run() {
            long n = C48121w.m104249M().mo95256n();
            long i = C48121w.m104249M().mo95251i();
            if (i != 0 && C25493a.this.f67430f != null) {
                C25493a.this.mo52099a(n, i);
                C25493a.this.f67431g.postDelayed(this, 200);
            }
        }
    };

    /* renamed from: o */
    private long f67438o = 0;

    /* renamed from: p */
    private long f67439p = -1;

    /* renamed from: com.ss.android.ugc.aweme.commerce.b.a$a */
    interface C25497a {
        /* renamed from: a */
        void mo52107a();

        /* renamed from: a */
        void mo52108a(long j, long j2, long j3);

        /* renamed from: b */
        void mo52109b();

        /* renamed from: c */
        void mo52110c();
    }

    /* renamed from: a */
    public final void mo52102a(Aweme aweme, Context context, View view, int i) {
        C32458a.m75144a("AdOM onPlayComplete ");
        if (i == 1) {
            String d = C25503g.m62036d(aweme);
            C13391a aVar = (C13391a) this.f67432i.get(d);
            if (aVar != null) {
                aVar.mo25086d();
            }
            C13394b bVar = (C13394b) this.f67433j.get(d);
            if (bVar != null) {
                bVar.mo25091b();
            }
            m62006a(d, bVar);
            long i2 = C48121w.m104249M().mo95251i();
            mo52099a(i2, i2);
            long j = this.f67438o;
            long j2 = this.f67439p;
            HashMap hashMap = new HashMap();
            hashMap.put("start_cid", Long.valueOf(j));
            hashMap.put("start_duration", Long.valueOf(j2));
            hashMap.put("complete_duration", Long.valueOf(i2));
            C26088l.m63322b(context, "complete", aweme, C26088l.m63264a(context, aweme, "raw ad complete", false, C26088l.m63261a((Map<String, Object>) hashMap)));
        }
        C26471cd.m64015a("complete", aweme, "play_over");
        this.f67429e++;
        this.f67426b = false;
        this.f67427c = false;
        this.f67428d = false;
    }

    /* renamed from: a */
    public final void mo52101a(Aweme aweme) {
        m62009d(aweme);
        if (this.f67434k != null) {
            C25504h hVar = this.f67434k;
            if (hVar.f67456c) {
                try {
                    hVar.f67454a.unregisterReceiver(hVar.f67457d);
                    hVar.f67457d = null;
                    hVar.f67458e = null;
                    hVar.f67456c = false;
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo52100a(final Context context, final Aweme aweme, final View view, boolean z) {
        if (z) {
            this.f67430f = new C25497a() {
                /* renamed from: a */
                public final void mo52107a() {
                    if (!C25493a.this.f67426b) {
                        C25493a aVar = C25493a.this;
                        Aweme aweme = aweme;
                        Context context = context;
                        View view = view;
                        C26088l.m63322b(context, "test_first_quartile", aweme, C26088l.m63264a(context, aweme, "raw feed first quartile", false, C26088l.m63260a(aVar.f67429e + 1)));
                        if (aVar.f67429e == 0) {
                            C13391a a = aVar.mo52097a(context, aweme, view);
                            if (a != null) {
                                a.mo25082a();
                            }
                        }
                        C26471cd.m64015a("firstQuartile", aweme, "play_25");
                        if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                            C26060ay.f68819a.mo53546a("play_25", aweme.getRawAdPlayNodeTrackUrlList(25), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C25499c<Object,Object,Object>(aweme));
                        }
                        C26088l.m63322b(context, "first_quartile", aweme, C26088l.m63264a(context, aweme, "raw feed first quartile", false, C26088l.m63260a(aVar.f67429e + 1)));
                    }
                    C25493a.this.f67426b = true;
                }

                /* renamed from: b */
                public final void mo52109b() {
                    if (!C25493a.this.f67427c) {
                        C25493a aVar = C25493a.this;
                        Aweme aweme = aweme;
                        Context context = context;
                        View view = view;
                        C26088l.m63322b(context, "test_midpoint", aweme, C26088l.m63264a(context, aweme, "raw feed midpoint", false, C26088l.m63260a(aVar.f67429e + 1)));
                        C32458a.m75144a("trackSecondQuartile");
                        if (aVar.f67429e == 0) {
                            C13391a a = aVar.mo52097a(context, aweme, view);
                            if (a != null) {
                                a.mo25084b();
                            }
                        }
                        C26471cd.m64015a("midpoint", aweme, "play_50");
                        if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                            C26060ay.f68819a.mo53546a("play_50", aweme.getRawAdPlayNodeTrackUrlList(50), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C25500d<Object,Object,Object>(aweme));
                        }
                        C26088l.m63322b(context, "midpoint", aweme, C26088l.m63264a(context, aweme, "raw feed midpoint", false, C26088l.m63260a(aVar.f67429e + 1)));
                    }
                    C25493a.this.f67427c = true;
                }

                /* renamed from: c */
                public final void mo52110c() {
                    if (!C25493a.this.f67428d) {
                        C25493a aVar = C25493a.this;
                        Aweme aweme = aweme;
                        Context context = context;
                        View view = view;
                        C26088l.m63322b(context, "test_third_quartile", aweme, C26088l.m63264a(context, aweme, "raw feed third_quartile", false, C26088l.m63260a(aVar.f67429e + 1)));
                        if (aVar.f67429e == 0) {
                            C13391a a = aVar.mo52097a(context, aweme, view);
                            if (a != null) {
                                a.mo25085c();
                            }
                        }
                        C26471cd.m64015a("thirdQuartile", aweme, "play_75");
                        if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                            C26060ay.f68819a.mo53546a("play_75", aweme.getRawAdPlayNodeTrackUrlList(75), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C25501e<Object,Object,Object>(aweme));
                        }
                        C26088l.m63322b(context, "third_quartile", aweme, C26088l.m63264a(context, aweme, "raw feed third_quartile", false, C26088l.m63260a(aVar.f67429e + 1)));
                    }
                    C25493a.this.f67428d = true;
                }

                /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
                /* JADX WARNING: Removed duplicated region for block: B:23:0x0066 A[LOOP:0: B:21:0x0060->B:23:0x0066, LOOP_END] */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo52108a(long r17, long r19, long r21) {
                    /*
                        r16 = this;
                        r0 = r16
                        com.ss.android.ugc.aweme.feed.model.Aweme r11 = r3
                        r12 = 3
                        boolean r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc.m63997a(r11, r12)
                        r13 = 0
                        r14 = 1
                        if (r3 == 0) goto L_0x00a0
                        int r3 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
                        if (r3 == 0) goto L_0x00a0
                        int r3 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
                        if (r3 >= 0) goto L_0x0018
                        r8 = r17
                        goto L_0x001b
                    L_0x0018:
                        r3 = -1
                        r8 = r3
                    L_0x001b:
                        if (r11 == 0) goto L_0x002c
                        com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r11.getAwemeRawAd()
                        if (r3 == 0) goto L_0x002c
                        com.ss.android.ugc.aweme.commercialize.model.y r3 = r3.getOmVast()
                        if (r3 == 0) goto L_0x002c
                        com.bytedance.t.b.f r3 = r3.vast
                        goto L_0x002d
                    L_0x002c:
                        r3 = 0
                    L_0x002d:
                        if (r3 == 0) goto L_0x0045
                        java.util.List<com.bytedance.t.b.b> r3 = r3.creativeList
                        if (r3 == 0) goto L_0x0045
                        java.lang.Iterable r3 = (java.lang.Iterable) r3
                        d.l.g r3 = p2628d.p2629a.C52575l.m112148k(r3)
                        com.ss.android.ugc.aweme.commercialize.utils.cd$z r4 = new com.ss.android.ugc.aweme.commercialize.utils.cd$z
                        r4.<init>()
                        d.f.a.b r4 = (p2628d.p2639f.p2640a.C52671b) r4
                        d.l.g r3 = p2628d.p2649l.C52786h.m112346c(r3, r4)
                        goto L_0x0049
                    L_0x0045:
                        d.l.g r3 = p2628d.p2649l.C52786h.m112334a()
                    L_0x0049:
                        r6 = r3
                        com.ss.android.ugc.aweme.commercialize.utils.cd$aa r15 = new com.ss.android.ugc.aweme.commercialize.utils.cd$aa
                        r3 = r15
                        r4 = r21
                        r12 = r6
                        r6 = r19
                        r3.<init>(r4, r6, r8)
                        r3 = r15
                        d.f.a.b r3 = (p2628d.p2639f.p2640a.C52671b) r3
                        d.l.g r3 = p2628d.p2649l.C52786h.m112340a(r12, r3)
                        java.util.Iterator r3 = r3.mo110157a()
                    L_0x0060:
                        boolean r4 = r3.hasNext()
                        if (r4 == 0) goto L_0x00a0
                        java.lang.Object r4 = r3.next()
                        com.bytedance.t.b.e r4 = (com.bytedance.p879t.p881b.C13237e) r4
                        java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
                        java.lang.String r6 = r4.offset
                        java.lang.String r7 = "it.offset"
                        p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
                        r7 = r21
                        long r9 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64005a(r7, r6)
                        long r5 = r5.toSeconds(r9)
                        java.lang.String[] r9 = new java.lang.String[r14]
                        java.lang.String r4 = r4.url
                        r9[r13] = r4
                        d.l.g r4 = p2628d.p2649l.C52786h.m112337a(r9)
                        java.lang.StringBuilder r9 = new java.lang.StringBuilder
                        java.lang.String r10 = "cpv_"
                        r9.<init>(r10)
                        r9.append(r5)
                        r5 = 115(0x73, float:1.61E-43)
                        r9.append(r5)
                        java.lang.String r5 = r9.toString()
                        com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64013a(r4, r5, r11)
                        goto L_0x0060
                    L_0x00a0:
                        com.ss.android.ugc.aweme.commerce.b.a r3 = com.p683ss.android.ugc.aweme.commerce.p1530b.C25493a.this
                        int r3 = r3.f67429e
                        if (r3 != 0) goto L_0x0103
                        r3 = 2000(0x7d0, double:9.88E-321)
                        int r5 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
                        if (r5 >= 0) goto L_0x0103
                        int r5 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
                        if (r5 < 0) goto L_0x0103
                        com.ss.android.ugc.aweme.commerce.b.a r1 = com.p683ss.android.ugc.aweme.commerce.p1530b.C25493a.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3
                        android.content.Context r3 = r2
                        android.view.View r4 = r4
                        int r4 = r1.f67429e
                        if (r4 != 0) goto L_0x0103
                        boolean r4 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64022c(r2)
                        if (r4 == 0) goto L_0x0103
                        if (r2 == 0) goto L_0x00f1
                        boolean r4 = r2.isAd()
                        if (r4 != r14) goto L_0x00f1
                        r4 = 3
                        boolean r4 = com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc.m63997a(r2, r4)
                        if (r4 != 0) goto L_0x00d2
                        goto L_0x00f1
                    L_0x00d2:
                        com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r2.getAwemeRawAd()
                        if (r4 == 0) goto L_0x00f1
                        com.ss.android.ugc.aweme.commercialize.model.y r4 = r4.getOmVast()
                        if (r4 == 0) goto L_0x00f1
                        com.bytedance.t.b.f r4 = r4.vast
                        if (r4 == 0) goto L_0x00f1
                        java.util.Set<java.lang.String> r4 = r4.viewableSet
                        if (r4 == 0) goto L_0x00f1
                        java.lang.Iterable r4 = (java.lang.Iterable) r4
                        d.l.g r4 = p2628d.p2629a.C52575l.m112148k(r4)
                        java.lang.String r5 = "viewable"
                        com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64013a(r4, r5, r2)
                    L_0x00f1:
                        int r1 = r1.f67429e
                        int r1 = r1 + r14
                        java.lang.String r4 = "viewable"
                        java.lang.String r5 = "raw feed viewable"
                        java.util.Map r1 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63260a(r1)
                        org.json.JSONObject r1 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63264a(r3, r2, r5, r13, r1)
                        com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63322b(r3, r4, r2, r1)
                    L_0x0103:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commerce.p1530b.C25493a.C254941.mo52108a(long, long, long):void");
                }
            };
            this.f67434k.f67458e = new C25506b() {
                /* renamed from: a */
                public final void mo52111a(int i) {
                    C25493a aVar = C25493a.this;
                    Aweme aweme = aweme;
                    Context context = context;
                    View view = view;
                    C26471cd.m64014a("unmute", aweme);
                    C26088l.m63353f(context, aweme, aVar.f67429e + 1);
                }

                /* renamed from: b */
                public final void mo52112b(int i) {
                    C25493a aVar = C25493a.this;
                    Aweme aweme = aweme;
                    Context context = context;
                    View view = view;
                    C32458a.m75144a("AdOM playerMute ");
                    C26471cd.m64014a("mute", aweme);
                    C26088l.m63347e(context, aweme, aVar.f67429e + 1);
                }
            };
            return;
        }
        m62009d(aweme);
    }

    /* renamed from: b */
    public static boolean m62007b() {
        return C26514h.m64152a();
    }

    /* renamed from: a */
    public static C25493a m62004a() {
        if (f67425h == null) {
            synchronized (C25493a.class) {
                if (f67425h == null) {
                    f67425h = new C25493a();
                }
            }
        }
        return f67425h;
    }

    private C25493a() {
        C25504h hVar = this.f67434k;
        hVar.f67457d = new C25505a(hVar);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        intentFilter.addAction("android.media.STREAM_MUTE_CHANGED_ACTION");
        hVar.f67454a.registerReceiver(hVar.f67457d, intentFilter);
        hVar.f67456c = true;
    }

    /* renamed from: b */
    public final void mo52103b(Aweme aweme) {
        if (C26512f.m64061d(aweme)) {
            m62009d(aweme);
        }
    }

    /* renamed from: d */
    private void m62009d(Aweme aweme) {
        this.f67429e = 0;
        this.f67430f = null;
        this.f67434k.f67458e = null;
        C13394b bVar = (C13394b) this.f67433j.get(C25503g.m62036d(aweme));
        if (bVar != null) {
            bVar.mo25091b();
        }
        m62006a(C25503g.m62036d(aweme), bVar);
        this.f67431g.removeCallbacks(this.f67437n);
        this.f67426b = false;
        this.f67427c = false;
        this.f67428d = false;
    }

    /* renamed from: c */
    private static List<C13403k> m62008c(Aweme aweme) {
        if (TextUtils.isEmpty(C25503g.m62031a(aweme)) || TextUtils.isEmpty(C25503g.m62033b(aweme))) {
            return Collections.emptyList();
        }
        try {
            URL url = new URL(C25503g.m62031a(aweme));
            String b = C25503g.m62033b(aweme);
            String c = C25503g.m62035c(aweme);
            if (TextUtils.isEmpty(c)) {
                c = "placementId=1&placementName=test";
            }
            if (c.contains("{TS}") || c.contains("__TS__")) {
                String valueOf = String.valueOf(System.currentTimeMillis());
                c = c.replace("{TS}", valueOf).replace("__TS__", valueOf);
            }
            return Collections.singletonList(C13403k.m27010a(b, url, c));
        } catch (MalformedURLException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public static void m62005a(Context context, Aweme aweme) {
        if (C26471cd.m64022c(aweme) && C26469cc.m63997a(aweme, 3)) {
            C26471cd.m64015a("start", aweme, "play");
        }
    }

    /* renamed from: a */
    private void m62006a(String str, C13394b bVar) {
        this.f67433j.remove(str);
        this.f67432i.remove(str);
        this.f67435l.postDelayed(new C25498b(new C13394b[]{bVar}), 2000);
    }

    /* renamed from: a */
    public final void mo52099a(long j, long j2) {
        if (j != this.f67436m && j2 != 0) {
            if (this.f67430f != null) {
                float f = (float) j2;
                float f2 = ((float) j) / f;
                float f3 = ((float) this.f67436m) / f;
                if (f2 >= 0.25f && f3 < 0.25f) {
                    this.f67430f.mo52107a();
                }
                if (f2 >= 0.5f && f3 < 0.5f) {
                    this.f67430f.mo52109b();
                }
                if (f2 >= 0.75f && f3 < 0.75f) {
                    this.f67430f.mo52110c();
                }
                this.f67430f.mo52108a(this.f67436m, j, j2);
            }
            this.f67436m = j;
        }
    }

    /* renamed from: a */
    private C13391a m62003a(Aweme aweme, Context context, View view) {
        C13394b a = mo52098a(aweme, context, true);
        if (a == null) {
            return null;
        }
        C13391a a2 = C13391a.m26991a(a);
        a.mo25090a(view);
        if (context instanceof Activity) {
            List<View> a3 = C25503g.m62032a(((Activity) context).getWindow().getDecorView().findViewById(16908290), C9432q.m18688b(context), C9432q.m18670a(context));
            a3.remove(view);
            for (View b : a3) {
                a.mo25092b(b);
            }
        }
        a.mo25089a();
        C13390a a4 = C13390a.m26988a(a);
        a4.mo25081a(C13393c.m26997a(true, C13392b.STANDALONE));
        a4.mo25080a();
        return a2;
    }

    /* renamed from: a */
    public C13391a mo52097a(Context context, Aweme aweme, View view) {
        String d = C25503g.m62036d(aweme);
        C13391a aVar = (C13391a) this.f67432i.get(d);
        if (aVar == null) {
            aVar = m62003a(aweme, context, view);
            if (aVar != null) {
                this.f67432i.put(d, aVar);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public C13394b mo52098a(Aweme aweme, Context context, boolean z) {
        C13398f fVar;
        C13400h hVar;
        if (!C26471cd.m64023d(aweme)) {
            return null;
        }
        String d = C25503g.m62036d(aweme);
        if (this.f67433j.get(d) != null) {
            return (C13394b) this.f67433j.get(d);
        }
        C32458a.m75144a("ensureOmidActivition");
        if (!C13383a.m26982a()) {
            C13383a.m26981a(context);
        }
        if (!C13383a.m26982a()) {
            return null;
        }
        try {
            C13396d a = C13396d.m27006a(C13402j.m27009a("Bytedance", "16.0.41"), C25502f.m62030a(AwemeApplication.m56199a()), m62008c(aweme), null);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C52711k.m112240b(awemeRawAd, C29094ad.f76264a);
            if (awemeRawAd.getOmVast() != null) {
                switch (awemeRawAd.getOmVast().creative_type) {
                    case 1:
                        fVar = C13398f.DEFINED_BY_JAVASCRIPT;
                        break;
                    case 2:
                        fVar = C13398f.HTML_DISPLAY;
                        break;
                    case 3:
                        fVar = C13398f.NATIVE_DISPLAY;
                        break;
                    case 4:
                        fVar = C13398f.VIDEO;
                        break;
                    case 5:
                        fVar = C13398f.AUDIO;
                        break;
                    default:
                        fVar = C13398f.VIDEO;
                        break;
                }
            } else {
                fVar = C13398f.VIDEO;
            }
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            C52711k.m112240b(awemeRawAd2, C29094ad.f76264a);
            if (awemeRawAd2.getOmVast() != null) {
                switch (awemeRawAd2.getOmVast().impression_type) {
                    case 1:
                        hVar = C13400h.DEFINED_BY_JAVASCRIPT;
                        break;
                    case 2:
                        hVar = C13400h.UNSPECIFIED;
                        break;
                    case 3:
                        hVar = C13400h.LOADED;
                        break;
                    case 4:
                        hVar = C13400h.BEGIN_TO_RENDER;
                        break;
                    case 5:
                        hVar = C13400h.ONE_PIXEL;
                        break;
                    case 6:
                        hVar = C13400h.VIEWABLE;
                        break;
                    case 7:
                        hVar = C13400h.AUDIBLE;
                        break;
                    case 8:
                        hVar = C13400h.OTHER;
                        break;
                    default:
                        hVar = C13400h.BEGIN_TO_RENDER;
                        break;
                }
            } else {
                hVar = C13400h.BEGIN_TO_RENDER;
            }
            C13401i iVar = C13401i.NATIVE;
            C13394b a2 = C13394b.m26999a(C13395c.m27004a(fVar, hVar, iVar, iVar, false), a);
            C23131p.m57776a("OmAdSessionMonitor", 1, (JSONObject) null);
            this.f67433j.put(d, a2);
            return a2;
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("create ad session failed");
            sb.append(th);
            C32458a.m75144a(sb.toString());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("exception_message", th.getMessage());
                StringWriter stringWriter = new StringWriter();
                C17840a.m43751a(th, new PrintWriter(stringWriter));
                jSONObject.put("exception_stack", stringWriter.toString());
            } catch (JSONException unused) {
            }
            C23131p.m57776a("OmAdSessionMonitor", 0, jSONObject);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo52104b(Aweme aweme, Context context, View view, int i) {
        if (i == 0) {
            C13391a a = mo52097a(context, aweme, view);
            if (a != null) {
                C13426e.m27073b(a.f34901a);
                a.f34901a.mo25100c().mo25129a("bufferStart");
            }
        }
        C26471cd.m64014a("bufferStart", aweme);
        C26088l.m63322b(context, "buffer_start", aweme, C26088l.m63264a(context, aweme, "raw feed buffer_start", false, C26088l.m63260a(this.f67429e + 1)));
    }

    /* renamed from: c */
    public final void mo52105c(Aweme aweme, Context context, View view, int i) {
        if (i == 0) {
            C13391a a = mo52097a(context, aweme, view);
            if (a != null) {
                C13426e.m27073b(a.f34901a);
                a.f34901a.mo25100c().mo25129a("bufferFinish");
            }
        }
        C26471cd.m64014a("bufferEnd", aweme);
        C26088l.m63322b(context, "buffer_end", aweme, C26088l.m63264a(context, aweme, "raw feed buffer_end", false, C26088l.m63260a(this.f67429e + 1)));
    }

    /* renamed from: d */
    public final void mo52106d(Aweme aweme, Context context, View view, int i) {
        int i2;
        if (i == 0) {
            C13391a a = mo52097a(context, aweme, view);
            float duration = (float) aweme.getVideo().getDuration();
            if (duration <= 0.0f) {
                duration = (float) C48121w.m104249M().mo95251i();
            }
            float a2 = (float) this.f67434k.mo52115a();
            C25504h hVar = this.f67434k;
            if (hVar.f67455b != null) {
                i2 = hVar.f67455b.getStreamMaxVolume(3);
            } else {
                i2 = -1;
            }
            float f = a2 / ((float) i2);
            if (a != null) {
                a.mo25083a(duration, 1.0f);
            }
            this.f67431g.postDelayed(this.f67437n, 200);
            if (C26471cd.m64022c(aweme)) {
                if (C26469cc.m63997a(aweme, 3)) {
                    if (f > 0.0f) {
                        C26471cd.m64014a("unmute", aweme);
                    } else {
                        C26471cd.m64014a("mute", aweme);
                    }
                }
                C26088l.m63322b(context, "auto_full_screen", aweme, C26088l.m63373m(context, aweme, "raw ad auto full screen"));
                C26471cd.m64014a("playerExpand", aweme);
                C26471cd.m64014a("fullscreen", aweme);
            }
            if (f > 0.0f) {
                C26088l.m63353f(context, aweme, this.f67429e + 1);
            } else {
                C26088l.m63347e(context, aweme, this.f67429e + 1);
            }
            long i3 = C48121w.m104249M().mo95251i();
            this.f67436m = -1;
            mo52099a(0, i3);
            if (aweme != null && aweme.getAwemeRawAd() != null) {
                this.f67438o = aweme.getAwemeRawAd().getCreativeId().longValue();
                this.f67439p = i3;
            }
        }
    }
}
