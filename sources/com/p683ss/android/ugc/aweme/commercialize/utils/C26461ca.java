package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.commercialize.log.C26060ay;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.feed.experiment.FeedAdAsyncLogExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2643g.C52733a;
import p2628d.p2648k.C52767h;
import p2628d.p2649l.C52786h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ca */
public final class C26461ca {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f69746a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26461ca.class), "awemeState", "getAwemeState()Ljava/util/Map;"))};

    /* renamed from: b */
    public static final C26461ca f69747b = new C26461ca();

    /* renamed from: c */
    private static final C52668f f69748c = C52732g.m112285a(C26462a.f69749a);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ca$a */
    static final class C26462a extends C52712l implements C52670a<Map<Aweme, Integer>> {

        /* renamed from: a */
        public static final C26462a f69749a = new C26462a();

        C26462a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (FeedAdAsyncLogExperiment.m70945a()) {
                return Collections.synchronizedMap(new WeakHashMap());
            }
            return new WeakHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ca$b */
    static final class C26463b extends C52712l implements C52682m<C26080b, Boolean, C26080b> {

        /* renamed from: a */
        final /* synthetic */ AwemeRawAd f69750a;

        C26463b(AwemeRawAd awemeRawAd) {
            this.f69750a = awemeRawAd;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C26080b bVar = (C26080b) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(bVar, "$receiver");
            if (booleanValue) {
                C26080b b = bVar.mo53591b(this.f69750a);
                C52711k.m112236a((Object) b, "fill(this@apply)");
                return b;
            }
            C26080b a = bVar.mo53579a(this.f69750a);
            C52711k.m112236a((Object) a, "adId(this@apply)");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ca$c */
    static final class C26464c extends C52712l implements C52671b<Entry<? extends Aweme, ? extends Integer>, Aweme> {

        /* renamed from: a */
        public static final C26464c f69751a = new C26464c();

        C26464c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Entry entry = (Entry) obj;
            C52711k.m112240b(entry, "it");
            return (Aweme) entry.getKey();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ca$d */
    static final class C26465d extends C52712l implements C52671b<Aweme, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f69752a;

        C26465d(String str) {
            this.f69752a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            boolean z;
            Aweme aweme = (Aweme) obj;
            C52711k.m112236a((Object) aweme, "it");
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                str = awemeRawAd.getCreativeIdStr();
            } else {
                str = null;
            }
            if (!C52711k.m112239a((Object) str, (Object) this.f69752a) || C26461ca.f69747b.mo54180c(aweme)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ca$e */
    static final class C26466e extends C52712l implements C52682m<C26080b, Boolean, C26080b> {

        /* renamed from: a */
        final /* synthetic */ AwemeRawAd f69753a;

        C26466e(AwemeRawAd awemeRawAd) {
            this.f69753a = awemeRawAd;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C26080b bVar = (C26080b) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(bVar, "$receiver");
            if (booleanValue) {
                C26080b b = bVar.mo53591b(this.f69753a);
                C52711k.m112236a((Object) b, "fill(this@apply)");
                return b;
            }
            C26080b a = bVar.mo53579a(this.f69753a);
            C52711k.m112236a((Object) a, "adId(this@apply)");
            return a;
        }
    }

    private C26461ca() {
    }

    /* renamed from: a */
    private final Map<Aweme, Integer> m63981a() {
        return (Map) f69748c.getValue();
    }

    /* renamed from: d */
    public static final boolean m63987d(Aweme aweme) {
        if (aweme == null || !f69747b.m63990g(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private final boolean m63990g(Aweme aweme) {
        if ((m63980a(aweme, 0) & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo54180c(Aweme aweme) {
        if ((m63980a(aweme, 0) & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m63988e(Aweme aweme) {
        if (C26512f.m64061d(aweme) && aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && awemeRawAd.useEffectivePlayAction()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static final long m63989f(Aweme aweme) {
        float f;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                Float effectivePlayTime = awemeRawAd.getEffectivePlayTime();
                if (effectivePlayTime != null) {
                    f = effectivePlayTime.floatValue();
                    return C52733a.m112279b(f * 1000.0f);
                }
            }
        }
        f = 3.0f;
        return C52733a.m112279b(f * 1000.0f);
    }

    /* renamed from: a */
    public static final void m63982a(Aweme aweme) {
        if (aweme != null && C26512f.m64061d(aweme)) {
            m63989f(aweme);
            Map a = f69747b.m63981a();
            C52711k.m112236a((Object) a, "awemeState");
            a.put(aweme, Integer.valueOf(0));
        }
    }

    /* renamed from: b */
    public static final void m63985b(Aweme aweme) {
        if (aweme != null && C26512f.m64061d(aweme)) {
            m63989f(aweme);
            if (!f69747b.mo54180c(aweme)) {
                if (m63988e(aweme)) {
                    C26088l.m63282a(C11010c.m22280a(), aweme, "play");
                } else {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        C26060ay.f68819a.mo53545a("play_valid", awemeRawAd.getEffectivePlayTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26466e<Object,Object,Object>(awemeRawAd));
                    }
                }
            }
            f69747b.m63981a().remove(aweme);
        }
    }

    /* renamed from: a */
    public static final void m63984a(String str) {
        C52711k.m112240b(str, "creativeId");
        Map a = f69747b.m63981a();
        C52711k.m112236a((Object) a, "awemeState");
        for (Aweme aweme : C52786h.m112353g(C52786h.m112340a(C52786h.m112348d(C52550ab.m112060e(a), C26464c.f69751a), (C52671b<? super T, Boolean>) new C26465d<Object,Boolean>(str)))) {
            if (m63988e(aweme)) {
                C26088l.m63282a(C11010c.m22280a(), aweme, "click");
                f69747b.mo54179a(aweme, true);
            }
            f69747b.m63986b(aweme, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final int m63980a(Aweme aweme, int i) {
        if (aweme == null) {
            return i;
        }
        Integer num = (Integer) m63981a().get(aweme);
        if (num != null) {
            return num.intValue();
        }
        return i;
    }

    /* renamed from: b */
    private final void m63986b(Aweme aweme, boolean z) {
        Map a = m63981a();
        C52711k.m112236a((Object) a, "awemeState");
        a.put(aweme, Integer.valueOf(m63980a(aweme, 0) | 1));
    }

    /* renamed from: a */
    public static final void m63983a(Aweme aweme, long j) {
        if (aweme != null && C26512f.m64061d(aweme)) {
            if (j >= m63989f(aweme) && !f69747b.mo54180c(aweme)) {
                if (m63988e(aweme)) {
                    C26088l.m63282a(C11010c.m22280a(), aweme, "play");
                } else {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        C26060ay.f68819a.mo53545a("play_valid", awemeRawAd.getEffectivePlayTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26463b<Object,Object,Object>(awemeRawAd));
                    }
                }
            }
            f69747b.m63981a().remove(aweme);
        }
    }

    /* renamed from: a */
    public final void mo54179a(Aweme aweme, boolean z) {
        Map a = m63981a();
        C52711k.m112236a((Object) a, "awemeState");
        a.put(aweme, Integer.valueOf(2 | m63980a(aweme, 0)));
    }
}
