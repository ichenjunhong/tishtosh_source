package com.p683ss.android.ugc.aweme.commercialize.link;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26428bm;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeNationalTask;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStarAtlas;
import com.p683ss.android.ugc.aweme.feed.model.CardStruct;
import com.p683ss.android.ugc.aweme.feed.model.NationalTaskLink;
import com.p683ss.android.ugc.aweme.feed.model.StarAtlasLink;
import java.util.List;
import p2628d.p2629a.C52575l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.h */
public final class C25973h {

    /* renamed from: a */
    public static List<String> f68562a = C52575l.m112101c("dou+", "company_link", "iron_man", "shopping_cart", "star_atlas_link", "national_task_link", "link", "poi", "open_platform", "movie", "sticker");

    /* renamed from: b */
    public static final C25973h f68563b = new C25973h();

    private C25973h() {
    }

    /* renamed from: a */
    public static final boolean m62966a(Aweme aweme) {
        return m62968a(aweme, false, 0, 6, null);
    }

    /* renamed from: b */
    public static final boolean m62971b(Aweme aweme) {
        return m62973b(aweme, false, 0, 6, null);
    }

    /* renamed from: c */
    public static final boolean m62974c(Aweme aweme) {
        return m62979d(aweme, false, 0, 6, null);
    }

    /* renamed from: d */
    public static final boolean m62977d(Aweme aweme) {
        return m62970a("open_platform", aweme, false, 0);
    }

    /* renamed from: e */
    public static final boolean m62980e(Aweme aweme) {
        return m62970a("movie", aweme, false, 0);
    }

    /* renamed from: f */
    public static final boolean m62983f(Aweme aweme) {
        return m62970a("sticker", aweme, false, 0);
    }

    /* renamed from: g */
    public static final boolean m62986g(Aweme aweme) {
        StarAtlasLink starAtlasLink;
        if (aweme == null || C26512f.m64112N(aweme)) {
            return false;
        }
        C26138s a = C26428bm.m63902a(aweme);
        if (a != null && a.showOnFeed()) {
            return false;
        }
        AwemeStarAtlas starAtlasInfo = aweme.getStarAtlasInfo();
        NationalTaskLink nationalTaskLink = null;
        if (starAtlasInfo != null) {
            starAtlasLink = starAtlasInfo.getStarAtlasLink();
        } else {
            starAtlasLink = null;
        }
        if (starAtlasLink != null) {
            return false;
        }
        AwemeNationalTask awemeNationalTask = aweme.getAwemeNationalTask();
        if (awemeNationalTask != null) {
            nationalTaskLink = awemeNationalTask.getNationalTaskLink();
        }
        if (nationalTaskLink != null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static final String m62965a(Aweme aweme, int i) {
        CardStruct cardStruct = null;
        if (aweme == null) {
            return null;
        }
        if (aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                cardStruct = awemeRawAd.getDefaultCardInfo();
            }
            if (cardStruct != null) {
                return "ad_card";
            }
        }
        return m62989h(aweme, false, i);
    }

    /* renamed from: g */
    private static boolean m62987g(Aweme aweme, boolean z, int i) {
        return m62970a("poi", aweme, z, i);
    }

    /* renamed from: a */
    public static final boolean m62967a(Aweme aweme, boolean z, int i) {
        return m62970a("link", aweme, false, 0);
    }

    /* renamed from: b */
    public static final boolean m62972b(Aweme aweme, boolean z, int i) {
        return m62970a("company_link", aweme, false, 0);
    }

    /* renamed from: c */
    public static final boolean m62975c(Aweme aweme, boolean z, int i) {
        return m62970a("shopping_cart", aweme, z, i);
    }

    /* renamed from: d */
    private static boolean m62978d(Aweme aweme, boolean z, int i) {
        return m62970a("star_atlas_link", aweme, z, i);
    }

    /* renamed from: e */
    private static boolean m62981e(Aweme aweme, boolean z, int i) {
        return m62970a("national_task_link", aweme, z, i);
    }

    /* renamed from: f */
    private static boolean m62984f(Aweme aweme, boolean z, int i) {
        return m62970a("iron_man", aweme, z, i);
    }

    /* renamed from: a */
    static boolean m62969a(String str, Aweme aweme, int i) {
        return TextUtils.equals(str, m62965a(aweme, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x015a, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x015a, code lost:
        continue;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.String m62989h(com.p683ss.android.ugc.aweme.feed.model.Aweme r6, boolean r7, int r8) {
        /*
            r8 = 0
            if (r6 != 0) goto L_0x0004
            return r8
        L_0x0004:
            java.util.List<java.lang.String> r0 = f68562a
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x015d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            r3 = 1
            r4 = 0
            switch(r2) {
                case -1890252483: goto L_0x014e;
                case -1648893033: goto L_0x0119;
                case -309942941: goto L_0x0109;
                case -261388249: goto L_0x00f1;
                case -210508088: goto L_0x00c9;
                case 111178: goto L_0x00b4;
                case 3089441: goto L_0x00a6;
                case 3321850: goto L_0x0078;
                case 104087344: goto L_0x006a;
                case 711707451: goto L_0x0051;
                case 1429828220: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x015a
        L_0x0021:
            java.lang.String r2 = "company_link"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x015a
            com.ss.android.ugc.aweme.commercialize.model.s r2 = com.p683ss.android.ugc.aweme.commercialize.utils.C26428bm.m63902a(r6)
            if (r2 == 0) goto L_0x0038
            int r3 = r2.getLinkType()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0039
        L_0x0038:
            r3 = r8
        L_0x0039:
            if (r3 != 0) goto L_0x003d
            goto L_0x015a
        L_0x003d:
            int r3 = r3.intValue()
            if (r3 != 0) goto L_0x015a
            if (r7 == 0) goto L_0x004c
            boolean r2 = r2.showOnComment()
        L_0x0049:
            r4 = r2
            goto L_0x015a
        L_0x004c:
            boolean r2 = r2.showOnFeed()
            goto L_0x0049
        L_0x0051:
            java.lang.String r2 = "star_atlas_link"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x015a
            com.ss.android.ugc.aweme.feed.model.AwemeStarAtlas r2 = r6.getStarAtlasInfo()
            if (r2 == 0) goto L_0x0064
            com.ss.android.ugc.aweme.feed.model.StarAtlasLink r2 = r2.getStarAtlasLink()
            goto L_0x0065
        L_0x0064:
            r2 = r8
        L_0x0065:
            if (r2 == 0) goto L_0x015a
        L_0x0067:
            r4 = 1
            goto L_0x015a
        L_0x006a:
            java.lang.String r2 = "movie"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x015a
            boolean r4 = com.p683ss.android.ugc.aweme.movie.p1969c.C37180a.C37181a.m83421a(r6)
            goto L_0x015a
        L_0x0078:
            java.lang.String r2 = "link"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x015a
            com.ss.android.ugc.aweme.commercialize.model.s r2 = com.p683ss.android.ugc.aweme.commercialize.utils.C26428bm.m63902a(r6)
            if (r2 == 0) goto L_0x008f
            int r5 = r2.getLinkType()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0090
        L_0x008f:
            r5 = r8
        L_0x0090:
            if (r5 != 0) goto L_0x0094
            goto L_0x015a
        L_0x0094:
            int r5 = r5.intValue()
            if (r5 != r3) goto L_0x015a
            if (r7 == 0) goto L_0x00a1
            boolean r2 = r2.showOnComment()
            goto L_0x0049
        L_0x00a1:
            boolean r2 = r2.showOnFeed()
            goto L_0x0049
        L_0x00a6:
            java.lang.String r2 = "dou+"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x015a
            boolean r4 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64112N(r6)
            goto L_0x015a
        L_0x00b4:
            java.lang.String r2 = "poi"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x015a
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r6.getPoiStruct()
            if (r2 != 0) goto L_0x0067
            boolean r2 = com.p683ss.android.ugc.aweme.p1257ab.p1258a.C20850b.m53158a(r6)
            if (r2 == 0) goto L_0x015a
            goto L_0x0067
        L_0x00c9:
            java.lang.String r2 = "open_platform"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x015a
            if (r7 != 0) goto L_0x015a
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r2 = r6.getAnchorInfo()
            if (r2 == 0) goto L_0x00de
            java.lang.Integer r2 = r2.getType()
            goto L_0x00df
        L_0x00de:
            r2 = r8
        L_0x00df:
            com.ss.android.ugc.aweme.commercialize.anchor.a r5 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.OPEN_PLATFORM_ANCHOR
            int r5 = r5.getTYPE()
            if (r2 != 0) goto L_0x00e9
            goto L_0x015a
        L_0x00e9:
            int r2 = r2.intValue()
            if (r2 != r5) goto L_0x015a
            goto L_0x0067
        L_0x00f1:
            java.lang.String r2 = "national_task_link"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x015a
            com.ss.android.ugc.aweme.feed.model.AwemeNationalTask r2 = r6.getAwemeNationalTask()
            if (r2 == 0) goto L_0x0104
            com.ss.android.ugc.aweme.feed.model.NationalTaskLink r2 = r2.getNationalTaskLink()
            goto L_0x0105
        L_0x0104:
            r2 = r8
        L_0x0105:
            if (r2 == 0) goto L_0x015a
            goto L_0x0067
        L_0x0109:
            java.lang.String r2 = "iron_man"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x015a
            com.ss.android.ugc.aweme.miniapp_api.model.e r2 = r6.getMicroAppInfo()
            if (r2 == 0) goto L_0x015a
            goto L_0x0067
        L_0x0119:
            java.lang.String r2 = "shopping_cart"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x015a
            if (r7 == 0) goto L_0x015a
            com.ss.android.ugc.aweme.commerce.model.e r2 = r6.getPromotion()
            if (r2 == 0) goto L_0x015a
            com.ss.android.ugc.aweme.app.v r2 = com.p683ss.android.ugc.aweme.app.C23183v.m56778a()
            java.lang.String r5 = "CommonSharePrefCache.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            com.ss.android.ugc.aweme.app.bf r2 = r2.mo47891B()
            java.lang.String r5 = "CommonSharePrefCache.inst().enableShoppingTotal"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            java.lang.Object r2 = r2.mo47782d()
            java.lang.String r5 = "CommonSharePrefCache.ins…enableShoppingTotal.cache"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x015a
            goto L_0x0067
        L_0x014e:
            java.lang.String r2 = "sticker"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x015a
            boolean r4 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30760am.m72129a(r6)
        L_0x015a:
            if (r4 == 0) goto L_0x000a
            return r1
        L_0x015d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.link.C25973h.m62989h(com.ss.android.ugc.aweme.feed.model.Aweme, boolean, int):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m62970a(String str, Aweme aweme, boolean z, int i) {
        return TextUtils.equals(str, m62989h(aweme, z, i));
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m62973b(Aweme aweme, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aweme = null;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m62981e(aweme, z, 0);
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m62976c(Aweme aweme, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aweme = null;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m62984f(aweme, z, 0);
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m62979d(Aweme aweme, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aweme = null;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m62987g(aweme, z, 0);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m62968a(Aweme aweme, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aweme = null;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m62978d(aweme, z, 0);
    }
}
