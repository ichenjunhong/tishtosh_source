package com.p683ss.android.ugc.aweme.commercialize.egg;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.feed.model.EditHint;
import com.p683ss.android.ugc.aweme.feed.model.ItemCommentEggData;
import java.util.List;
import p2628d.p2650m.C52820l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.d */
public final class C25770d {

    /* renamed from: a */
    public static C25751b f68142a;

    /* renamed from: b */
    public static List<C25751b> f68143b;

    /* renamed from: c */
    public static List<? extends EditHint> f68144c;

    /* renamed from: d */
    public static boolean f68145d;

    /* renamed from: e */
    public static boolean f68146e;

    /* renamed from: f */
    public static final C25770d f68147f = new C25770d();

    private C25770d() {
    }

    /* renamed from: a */
    public static final C25751b m62388a(String str) {
        List<C25751b> list = f68143b;
        if (list == null || str == null) {
            return null;
        }
        for (C25751b bVar : list) {
            C25743a aVar = bVar.f68096c;
            if (aVar != null) {
                String str2 = aVar.f68079b;
                if (str2 != null) {
                    if (new C52820l(str2).matches(str)) {
                        return bVar;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final boolean m62389a(ItemCommentEggData itemCommentEggData) {
        if (itemCommentEggData == null) {
            return false;
        }
        String[] strArr = {itemCommentEggData.getEggId(), itemCommentEggData.getFileType(), itemCommentEggData.getMaterialUrl(), itemCommentEggData.getRegex()};
        for (int i = 0; i < 4; i++) {
            if (TextUtils.isEmpty(strArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r3 == null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r1 == null) goto L_0x000d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.p683ss.android.ugc.aweme.commercialize.egg.p1556a.C25746b m62386a(com.p683ss.android.ugc.aweme.feed.model.Aweme r3, java.lang.String r4) {
        /*
            com.ss.android.ugc.aweme.commercialize.egg.a.c r0 = new com.ss.android.ugc.aweme.commercialize.egg.a.c
            r0.<init>()
            if (r3 == 0) goto L_0x000d
            java.lang.String r1 = r3.getAid()
            if (r1 != 0) goto L_0x000f
        L_0x000d:
            java.lang.String r1 = ""
        L_0x000f:
            java.lang.String r2 = "<set-?>"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            r0.f68091a = r1
            if (r3 == 0) goto L_0x0024
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()
            if (r3 == 0) goto L_0x0024
            java.lang.String r3 = r3.getUid()
            if (r3 != 0) goto L_0x0026
        L_0x0024:
            java.lang.String r3 = ""
        L_0x0026:
            java.lang.String r1 = "<set-?>"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r1)
            r0.f68092b = r3
            if (r4 != 0) goto L_0x0031
            java.lang.String r4 = ""
        L_0x0031:
            java.lang.String r3 = "<set-?>"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r3)
            r0.f68093c = r4
            com.ss.android.ugc.aweme.commercialize.egg.a.b r0 = (com.p683ss.android.ugc.aweme.commercialize.egg.p1556a.C25746b) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.egg.C25770d.m62386a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):com.ss.android.ugc.aweme.commercialize.egg.a.b");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.p683ss.android.ugc.aweme.commercialize.egg.C25751b m62387a(com.p683ss.android.ugc.aweme.feed.model.Aweme r11, boolean r12) {
        /*
            r12 = 0
            if (r11 == 0) goto L_0x00a6
            com.ss.android.ugc.aweme.feed.model.ItemLikeEggData r0 = r11.getCommerceAdLikeDigg()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x000d
        L_0x000b:
            r0 = 0
            goto L_0x0027
        L_0x000d:
            java.lang.String r3 = r0.getFileType()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x000b
            java.lang.String r0 = r0.getMaterialUrl()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0026
            goto L_0x000b
        L_0x0026:
            r0 = 1
        L_0x0027:
            if (r0 == 0) goto L_0x00a6
            com.ss.android.ugc.aweme.commercialize.egg.e r0 = new com.ss.android.ugc.aweme.commercialize.egg.e
            java.lang.String r4 = "like"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r11.getAwemeRawAd()
            if (r3 == 0) goto L_0x0039
            java.lang.String r3 = r3.getCreativeIdStr()
            r5 = r3
            goto L_0x003a
        L_0x0039:
            r5 = r12
        L_0x003a:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r11.getAwemeRawAd()
            if (r3 == 0) goto L_0x0046
            java.lang.String r3 = r3.getLogExtra()
            r6 = r3
            goto L_0x0047
        L_0x0046:
            r6 = r12
        L_0x0047:
            java.lang.String r7 = r11.getAid()
            r8 = 0
            r9 = 16
            r10 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.feed.model.ItemLikeEggData r11 = r11.getCommerceAdLikeDigg()
            if (r11 == 0) goto L_0x009f
            java.lang.String r3 = r11.getMaterialUrl()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x006a
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0068
            goto L_0x006a
        L_0x0068:
            r3 = 0
            goto L_0x006b
        L_0x006a:
            r3 = 1
        L_0x006b:
            if (r3 != 0) goto L_0x009f
            java.lang.String r3 = r11.getFileType()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x007b
            int r3 = r3.length()
            if (r3 != 0) goto L_0x007c
        L_0x007b:
            r2 = 1
        L_0x007c:
            if (r2 == 0) goto L_0x007f
            goto L_0x009f
        L_0x007f:
            com.ss.android.ugc.aweme.commercialize.egg.c r2 = new com.ss.android.ugc.aweme.commercialize.egg.c
            java.lang.String r3 = r11.getMaterialUrl()
            java.lang.String r4 = "rawData.materialUrl"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.String r11 = r11.getFileType()
            java.lang.String r4 = "rawData.fileType"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r4)
            r2.<init>(r3, r11)
            r2.f68127a = r1
            r2.f68129c = r0
            com.ss.android.ugc.aweme.commercialize.egg.b r11 = r2.mo52961a()
            goto L_0x00a0
        L_0x009f:
            r11 = r12
        L_0x00a0:
            if (r11 == 0) goto L_0x00a6
            com.p683ss.android.ugc.aweme.commercialize.egg.C25782g.m62404a(r11)
            return r11
        L_0x00a6:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.egg.C25770d.m62387a(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):com.ss.android.ugc.aweme.commercialize.egg.b");
    }
}
