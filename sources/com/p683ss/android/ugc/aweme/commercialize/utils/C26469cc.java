package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.p879t.p881b.C13234b;
import com.bytedance.p879t.p881b.C13235c;
import com.p683ss.android.ugc.aweme.commercialize.model.C26146y;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2649l.C52785g;
import p2628d.p2649l.C52786h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cc */
public final class C26469cc {

    /* renamed from: a */
    public static final C26469cc f69761a = new C26469cc();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cc$a */
    public static final class C26470a extends C52712l implements C52671b<C13234b, C52785g<? extends C13235c>> {
        public C26470a() {
            super(1);
        }

        public final C52785g<C13235c> invoke(C13234b bVar) {
            C52785g<C13235c> gVar;
            if (bVar != null) {
                List<C13235c> list = bVar.iconList;
                if (list != null) {
                    gVar = C52575l.m112148k(list);
                } else {
                    gVar = null;
                }
                if (gVar != null) {
                    return gVar;
                }
            }
            return C52786h.m112334a();
        }
    }

    private C26469cc() {
    }

    /* renamed from: a */
    public static final boolean m63996a(Aweme aweme) {
        return m63997a(aweme, 3);
    }

    /* renamed from: c */
    public static final C13235c m64002c(Aweme aweme) {
        return m63995a(aweme, "AdChoices");
    }

    /* renamed from: d */
    public static final C13235c m64003d(Aweme aweme) {
        return m63995a(aweme, "icon");
    }

    /* renamed from: b */
    public static final boolean m64000b(Aweme aweme) {
        if (!m63999a(aweme, false) || !m63997a(aweme, 3)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m63997a(Aweme aweme, int i) {
        if (aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                C26146y omVast = awemeRawAd.getOmVast();
                if (omVast != null && omVast.providerType == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m63999a(Aweme aweme, boolean z) {
        if (aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                C26146y omVast = awemeRawAd.getOmVast();
                if (omVast != null && omVast.loaded == z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m64001b(Aweme aweme, int i) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                C26146y omVast = awemeRawAd.getOmVast();
                if (omVast != null && omVast.providerType == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e A[EDGE_INSN: B:22:0x004e->B:19:0x004e ?: BREAK  
    EDGE_INSN: B:22:0x004e->B:19:0x004e ?: BREAK  
    EDGE_INSN: B:22:0x004e->B:19:0x004e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e A[EDGE_INSN: B:22:0x004e->B:19:0x004e ?: BREAK  
    EDGE_INSN: B:22:0x004e->B:19:0x004e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.bytedance.p879t.p881b.C13235c m63995a(com.p683ss.android.ugc.aweme.feed.model.Aweme r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "name"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            r0 = 0
            if (r3 == 0) goto L_0x0017
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            if (r3 == 0) goto L_0x0017
            com.ss.android.ugc.aweme.commercialize.model.y r3 = r3.getOmVast()
            if (r3 == 0) goto L_0x0017
            com.bytedance.t.b.f r3 = r3.vast
            goto L_0x0018
        L_0x0017:
            r3 = r0
        L_0x0018:
            if (r3 == 0) goto L_0x0030
            java.util.List<com.bytedance.t.b.b> r3 = r3.creativeList
            if (r3 == 0) goto L_0x0030
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            d.l.g r3 = p2628d.p2629a.C52575l.m112148k(r3)
            com.ss.android.ugc.aweme.commercialize.utils.cc$a r1 = new com.ss.android.ugc.aweme.commercialize.utils.cc$a
            r1.<init>()
            d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
            d.l.g r3 = p2628d.p2649l.C52786h.m112346c(r3, r1)
            goto L_0x0034
        L_0x0030:
            d.l.g r3 = p2628d.p2649l.C52786h.m112334a()
        L_0x0034:
            java.util.Iterator r3 = r3.mo110157a()
        L_0x0038:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x004e
            java.lang.Object r1 = r3.next()
            r2 = r1
            com.bytedance.t.b.c r2 = (com.bytedance.p879t.p881b.C13235c) r2
            java.lang.String r2 = r2.program
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r4)
            if (r2 == 0) goto L_0x0038
            r0 = r1
        L_0x004e:
            com.bytedance.t.b.c r0 = (com.bytedance.p879t.p881b.C13235c) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc.m63995a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):com.bytedance.t.b.c");
    }

    /* renamed from: a */
    public static final boolean m63998a(Aweme aweme, SmartImageView smartImageView) {
        Object obj;
        boolean z;
        if (!m63997a(aweme, 3)) {
            return false;
        }
        C13235c d = m64003d(aweme);
        if (d == null) {
            return false;
        }
        Set<String> set = d.staticResource;
        if (set != null) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String str = (String) obj;
                C52711k.m112236a((Object) str, "it");
                if (str.length() > 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            String str2 = (String) obj;
            if (str2 != null) {
                C12203q.m24646a(str2).mo23116a((C12197k) smartImageView).mo23121a();
                return true;
            }
        }
        return false;
    }
}
