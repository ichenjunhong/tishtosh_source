package com.p683ss.android.ugc.aweme.tools.beauty.service;

import com.p683ss.android.ugc.aweme.beauty.C23781e;
import com.p683ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p683ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify.ItemsBean;
import com.p683ss.android.ugc.aweme.tools.beauty.p2351c.C46867g;
import java.util.Collection;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.g */
public final class C46900g {

    /* renamed from: b */
    public static final C46901a f118470b = new C46901a(null);

    /* renamed from: a */
    public final C46867g f118471a;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.g$a */
    public static final class C46901a {
        private C46901a() {
        }

        public /* synthetic */ C46901a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.g$b */
    public static final class C46902b extends C52712l implements C52671b<ComposerBeauty, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C46900g f118472a;

        public C46902b(C46900g gVar) {
            this.f118472a = gVar;
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ComposerBeauty) obj);
            return C52860x.f131107a;
        }

        public final void invoke(ComposerBeauty composerBeauty) {
            boolean z;
            C52711k.m112240b(composerBeauty, "$this$convertValue");
            if (C46900g.m101907a(composerBeauty)) {
                List<ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
                Collection collection = items;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(!z)) {
                    items = null;
                }
                if (items != null) {
                    for (ItemsBean itemsBean : items) {
                        int a = this.f118472a.f118471a.mo94082a(composerBeauty, itemsBean.getTag(), -1);
                        int a2 = C23781e.m58369a(itemsBean.getTag());
                        if (a == -1 && a2 != -1) {
                            this.f118472a.f118471a.mo94095b(composerBeauty, itemsBean.getTag(), a2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.g$c */
    public static final class C46903c extends C52712l implements C52671b<ComposerBeauty, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C46900g f118473a;

        public C46903c(C46900g gVar) {
            this.f118473a = gVar;
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ComposerBeauty) obj);
            return C52860x.f131107a;
        }

        public final void invoke(ComposerBeauty composerBeauty) {
            boolean z;
            C52711k.m112240b(composerBeauty, "$this$convert");
            if (C46900g.m101907a(composerBeauty)) {
                List<ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
                Collection collection = items;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(!z)) {
                    items = null;
                }
                if (items != null) {
                    for (ItemsBean itemsBean : items) {
                        List b = C52830p.m112452b(itemsBean.getTag(), new String[]{"_"}, false, 0, 6, (Object) null);
                        if (!(!b.isEmpty())) {
                            b = null;
                        }
                        if (b != null) {
                            this.f118473a.mo94174a(composerBeauty, itemsBean, (String) b.get(0));
                        }
                    }
                }
            }
        }
    }

    public C46900g(C46867g gVar) {
        C52711k.m112240b(gVar, "beautySource");
        this.f118471a = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m101907a(com.p683ss.android.ugc.aweme.beauty.ComposerBeauty r3) {
        /*
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r3.getEffect()
            java.lang.String r0 = r0.getUnzipPath()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0017
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            if (r0 != 0) goto L_0x0034
            com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify r0 = r3.getBeautifyExtra()
            java.util.List r0 = r0.getItems()
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r0 = 0
            goto L_0x0030
        L_0x002f:
            r0 = 1
        L_0x0030:
            if (r0 != 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            if (r0 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r3 = 0
        L_0x0039:
            if (r3 == 0) goto L_0x003c
            return r2
        L_0x003c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.beauty.service.C46900g.m101907a(com.ss.android.ugc.aweme.beauty.ComposerBeauty):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ff  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94174a(com.p683ss.android.ugc.aweme.beauty.ComposerBeauty r18, com.p683ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify.ItemsBean r19, java.lang.String r20) {
        /*
            r17 = this;
            r0 = r17
            com.ss.android.ugc.aweme.port.in.u r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            com.ss.android.ugc.aweme.port.in.u r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.property.l r1 = r1.mo58574e()
            com.ss.android.ugc.aweme.tools.beauty.c.g r2 = r0.f118471a
            java.lang.String r4 = r19.getTag()
            r5 = 0
            r6 = 4
            r7 = 0
            r3 = r18
            int r2 = r2.mo94082a(r3, r4, -1)
            if (r20 == 0) goto L_0x0115
            java.lang.String r3 = r20.toLowerCase()
            java.lang.String r4 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.String r4 = "Smooth"
            java.lang.String r4 = r4.toLowerCase()
            java.lang.String r5 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)
            r5 = -1
            if (r4 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.UserSmoothSkinLevel
            int r1 = r1.mo83118b(r3)
        L_0x0043:
            r14 = r1
            goto L_0x00a6
        L_0x0045:
            java.lang.String r4 = "Eye"
            java.lang.String r4 = r4.toLowerCase()
            java.lang.String r6 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)
            if (r4 == 0) goto L_0x005d
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.UserBigEyeLevel
            int r1 = r1.mo83118b(r3)
            goto L_0x0043
        L_0x005d:
            java.lang.String r4 = "Face"
            java.lang.String r4 = r4.toLowerCase()
            java.lang.String r6 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)
            if (r4 == 0) goto L_0x0075
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.UserShapeLevel
            int r1 = r1.mo83118b(r3)
            goto L_0x0043
        L_0x0075:
            java.lang.String r4 = "Lips"
            java.lang.String r4 = r4.toLowerCase()
            java.lang.String r6 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)
            if (r4 == 0) goto L_0x008d
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.UserLipLevel
            int r1 = r1.mo83118b(r3)
            goto L_0x0043
        L_0x008d:
            java.lang.String r4 = "Blusher"
            java.lang.String r4 = r4.toLowerCase()
            java.lang.String r6 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)
            if (r3 == 0) goto L_0x00a5
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.UserBlushLevel
            int r1 = r1.mo83118b(r3)
            goto L_0x0043
        L_0x00a5:
            r14 = -1
        L_0x00a6:
            if (r2 != r5) goto L_0x0114
            if (r14 == r5) goto L_0x0114
            com.ss.android.ugc.aweme.beauty.f r1 = new com.ss.android.ugc.aweme.beauty.f
            boolean r7 = r19.getDoubleDirection()
            r8 = 100
            r9 = 0
            r10 = 0
            int r11 = r19.getMax()
            int r12 = r19.getMin()
            r13 = 0
            r15 = 76
            r16 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r2 = "data"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            boolean r2 = r1.f63377a
            r3 = 1120403456(0x42c80000, float:100.0)
            if (r2 == 0) goto L_0x00ff
            int r2 = r1.f63384h
            float r2 = (float) r2
            int r4 = r1.f63378b
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x00ee
            int r2 = r1.f63384h
            float r2 = (float) r2
            int r4 = r1.f63378b
            float r4 = (float) r4
            float r4 = r4 / r5
            float r2 = r2 - r4
            float r2 = r2 * r5
            int r1 = r1.f63381e
            float r1 = (float) r1
            float r2 = r2 * r1
            float r2 = r2 / r3
            goto L_0x0108
        L_0x00ee:
            int r2 = r1.f63378b
            float r2 = (float) r2
            float r2 = r2 / r5
            int r4 = r1.f63384h
            float r4 = (float) r4
            float r2 = r2 - r4
            float r2 = r2 * r5
            int r1 = r1.f63382f
            float r1 = (float) r1
            float r2 = r2 * r1
            float r2 = r2 / r3
            goto L_0x0108
        L_0x00ff:
            int r2 = r1.f63381e
            int r1 = r1.f63384h
            int r2 = r2 * r1
            float r1 = (float) r2
            float r2 = r1 / r3
        L_0x0108:
            com.ss.android.ugc.aweme.tools.beauty.c.g r1 = r0.f118471a
            java.lang.String r3 = r19.getTag()
            int r2 = (int) r2
            r4 = r18
            r1.mo94095b(r4, r3, r2)
        L_0x0114:
            return
        L_0x0115:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.beauty.service.C46900g.mo94174a(com.ss.android.ugc.aweme.beauty.ComposerBeauty, com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify$ItemsBean, java.lang.String):void");
    }
}
