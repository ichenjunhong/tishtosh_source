package com.p683ss.android.ugc.aweme.pendant.p2044a;

import android.graphics.drawable.Animatable;
import android.view.View.OnClickListener;
import com.facebook.drawee.p936c.C13790c;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.p1555e.C25735b;
import com.p683ss.android.ugc.aweme.commercialize_ad_api.p1585a.C26820a;
import com.p683ss.android.ugc.aweme.commercialize_ad_api.p1585a.C26822c;
import com.p683ss.android.ugc.aweme.commercialize_ad_api.p1586b.C26825c;
import com.p683ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.pendant.a.a */
public final class C38583a implements OnClickListener, C26825c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f98118a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38583a.class), "adRedPacketIv", "getAdRedPacketIv()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38583a.class), "adDepend", "getAdDepend()Lcom/ss/android/ugc/aweme/commercialize_ad_api/depend/ICommercializeAdDepend;"))};

    /* renamed from: b */
    public final C26822c f98119b;

    /* renamed from: c */
    private final C52668f f98120c = C52732g.m112285a(new C38585b(this));

    /* renamed from: d */
    private Aweme f98121d;

    /* renamed from: e */
    private String f98122e = "";

    /* renamed from: f */
    private C25908e f98123f = new C25908e();

    /* renamed from: g */
    private final C52668f f98124g = C52732g.m112285a(C38584a.f98125a);

    /* renamed from: com.ss.android.ugc.aweme.pendant.a.a$a */
    static final class C38584a extends C52712l implements C52670a<C26820a> {

        /* renamed from: a */
        public static final C38584a f98125a = new C38584a();

        C38584a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return CommercializeAdServiceImpl.createICommercializeAdServicebyMonsterPlugin().getDepend();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a.a$b */
    static final class C38585b extends C52712l implements C52670a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ C38583a f98126a;

        C38585b(C38583a aVar) {
            this.f98126a = aVar;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return this.f98126a.f98119b.f70652a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a.a$c */
    static final class C38586c implements C25735b {

        /* renamed from: a */
        public static final C38586c f98127a = new C38586c();

        C38586c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a.a$d */
    public static final class C38587d extends C13790c<Object> {

        /* renamed from: a */
        final /* synthetic */ C38583a f98128a;

        /* renamed from: b */
        final /* synthetic */ boolean f98129b;

        /* renamed from: c */
        final /* synthetic */ Aweme f98130c;

        public final void onFailure(String str, Throwable th) {
            if (!this.f98129b) {
                C26820a a = this.f98128a.mo78519a();
                if (a != null) {
                    a.mo52813a(this.f98130c, 1);
                }
            }
        }

        public final void onSubmit(String str, Object obj) {
            if (!this.f98129b) {
                C26820a a = this.f98128a.mo78519a();
                if (a != null) {
                    a.mo52812a(this.f98130c);
                }
            }
        }

        C38587d(C38583a aVar, boolean z, Aweme aweme) {
            this.f98128a = aVar;
            this.f98129b = z;
            this.f98130c = aweme;
        }

        public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
            if (!this.f98129b) {
                C26820a a = this.f98128a.mo78519a();
                if (a != null) {
                    a.mo52813a(this.f98130c, 0);
                }
            }
        }
    }

    /* renamed from: b */
    private final RemoteImageView m85902b() {
        return (RemoteImageView) this.f98120c.getValue();
    }

    /* renamed from: a */
    public final C26820a mo78519a() {
        return (C26820a) this.f98124g.getValue();
    }

    public C38583a(C26822c cVar) {
        C52711k.m112240b(cVar, "viewParams");
        this.f98119b = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009f, code lost:
        if (r0 == null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0119, code lost:
        if (r0 == null) goto L_0x011b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r8) {
        /*
            r7 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r8)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f98121d
            if (r0 != 0) goto L_0x000c
            java.lang.String r1 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x000c:
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f98121d
            if (r1 != 0) goto L_0x0019
            java.lang.String r2 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0019:
            boolean r1 = com.p683ss.android.ugc.aweme.p1308ad.C22316a.m55220a(r1)
            if (r1 == 0) goto L_0x004d
            com.ss.android.ugc.aweme.ad.a.a r8 = com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22317a.m55223a()
            java.lang.String r0 = "AdDependManager.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
            com.ss.android.ugc.aweme.ad.a.d r1 = r8.f60114a
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r8 = r7.m85902b()
            android.content.Context r2 = r8.getContext()
            java.lang.String r8 = "adRedPacketIv.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r8)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.f98121d
            if (r3 != 0) goto L_0x0040
            java.lang.String r8 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x0040:
            com.ss.android.ugc.aweme.commercialize.feed.e r4 = r7.f98123f
            r5 = 9
            com.ss.android.ugc.aweme.pendant.a.a$c r8 = com.p683ss.android.ugc.aweme.pendant.p2044a.C38583a.C38586c.f98127a
            r6 = r8
            com.ss.android.ugc.aweme.commercialize.e.b r6 = (com.p683ss.android.ugc.aweme.commercialize.p1555e.C25735b) r6
            r1.mo46448a(r2, r3, r4, r5, r6)
            return
        L_0x004d:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f98121d
            if (r1 != 0) goto L_0x0056
            java.lang.String r2 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0056:
            boolean r1 = com.p683ss.android.ugc.aweme.p1308ad.C22316a.m55221b(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x00c6
            com.ss.android.ugc.aweme.commercialize_ad_api.a.a r1 = r7.mo78519a()
            if (r1 == 0) goto L_0x0076
            if (r8 == 0) goto L_0x006a
            android.content.Context r3 = r8.getContext()
        L_0x006a:
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f98121d
            if (r8 != 0) goto L_0x0073
            java.lang.String r4 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0073:
            r1.mo52810a(r3, r8)
        L_0x0076:
            java.lang.String r8 = "click_brand_sticker"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = r7.f98122e
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r3, r4)
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f98121d
            if (r4 != 0) goto L_0x008f
            java.lang.String r5 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x008f:
            java.lang.String r4 = r4.getAid()
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r3, r4)
            java.lang.String r3 = "author_id"
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = r0.getUid()
            if (r0 != 0) goto L_0x00a3
        L_0x00a1:
            java.lang.String r0 = ""
        L_0x00a3:
            com.ss.android.ugc.aweme.app.f.d r0 = r1.mo47829a(r3, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            java.lang.String r1 = "EventMapBuilder.newBuild…               .builder()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.p683ss.android.ugc.aweme.commercialize.log.C26083h.m63240a(r8, r0)
            com.ss.android.ugc.aweme.commercialize_ad_api.a.a r8 = r7.mo78519a()
            if (r8 == 0) goto L_0x00c5
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f98121d
            if (r0 != 0) goto L_0x00c0
            java.lang.String r1 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00c0:
            r8.mo52816b(r0, r2)
            goto L_0x0149
        L_0x00c5:
            return
        L_0x00c6:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f98121d
            if (r1 != 0) goto L_0x00cf
            java.lang.String r4 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x00cf:
            boolean r1 = com.p683ss.android.ugc.aweme.p1308ad.C22316a.m55222c(r1)
            if (r1 == 0) goto L_0x0149
            com.ss.android.ugc.aweme.commercialize_ad_api.a.a r1 = r7.mo78519a()
            if (r1 == 0) goto L_0x0148
            if (r8 == 0) goto L_0x00e1
            android.content.Context r3 = r8.getContext()
        L_0x00e1:
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f98121d
            if (r8 != 0) goto L_0x00ea
            java.lang.String r4 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x00ea:
            boolean r8 = r1.mo52817b(r3, r8)
            if (r8 != r2) goto L_0x0149
            java.lang.String r8 = "click_brand_sticker"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r7.f98122e
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.f98121d
            if (r3 != 0) goto L_0x0109
            java.lang.String r4 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0109:
            java.lang.String r3 = r3.getAid()
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "author_id"
            if (r0 == 0) goto L_0x011b
            java.lang.String r0 = r0.getUid()
            if (r0 != 0) goto L_0x011d
        L_0x011b:
            java.lang.String r0 = ""
        L_0x011d:
            com.ss.android.ugc.aweme.app.f.d r0 = r1.mo47829a(r2, r0)
            java.lang.String r1 = "sticker_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.f98121d
            if (r2 != 0) goto L_0x012c
            java.lang.String r3 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x012c:
            com.ss.android.ugc.aweme.feed.model.SpecialSticker r2 = r2.getSpecialSticker()
            java.lang.String r3 = "aweme.specialSticker"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.String r2 = r2.getStickerId()
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            java.lang.String r1 = "EventMapBuilder.newBuild…               .builder()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.p683ss.android.ugc.aweme.commercialize.log.C26083h.m63240a(r8, r0)
            goto L_0x0149
        L_0x0148:
            return
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.pendant.p2044a.C38583a.onClick(android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a2, code lost:
        if (r0 == null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0102, code lost:
        if (r0 == null) goto L_0x0104;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54717a(boolean r4, com.p683ss.android.ugc.aweme.feed.model.Aweme r5, java.lang.String r6) {
        /*
            r3 = this;
            java.lang.String r0 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            java.lang.String r0 = "eventType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            r3.f98121d = r5
            r3.f98122e = r6
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r3.m85902b()
            r1 = r3
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            boolean r0 = com.p683ss.android.ugc.aweme.p1308ad.C22316a.m55220a(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0062
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = r3.m85902b()
            r6.setVisibility(r1)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r6 = r5.getAwemeRawAd()
            r0 = 0
            if (r6 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r6.getRedImageUrl()
        L_0x0031:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = r3.m85902b()
            com.ss.android.ugc.aweme.pendant.a.a$d r2 = new com.ss.android.ugc.aweme.pendant.a.a$d
            r2.<init>(r3, r4, r5)
            com.facebook.drawee.c.d r2 = (com.facebook.drawee.p936c.C13791d) r2
            com.p683ss.android.ugc.aweme.commercialize.C25649b.m62169a(r6, r0, r1, r2)
            if (r4 == 0) goto L_0x0127
            com.ss.android.ugc.aweme.commercialize_ad_api.a.a r4 = r3.mo78519a()
            if (r4 == 0) goto L_0x004a
            r4.mo52815b(r5)
        L_0x004a:
            com.ss.android.ugc.aweme.commercialize_ad_api.a.a r4 = r3.mo78519a()
            if (r4 == 0) goto L_0x0061
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = r3.m85902b()
            android.content.Context r6 = r6.getContext()
            java.lang.String r0 = "othershow"
            java.lang.String r1 = "redpacket"
            r4.mo52811a(r6, r5, r0, r1)
            goto L_0x0127
        L_0x0061:
            return
        L_0x0062:
            boolean r0 = com.p683ss.android.ugc.aweme.p1308ad.C22316a.m55221b(r5)
            if (r0 == 0) goto L_0x00c0
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r3.m85902b()
            r0.setVisibility(r1)
            com.ss.android.ugc.aweme.commerce.model.b r0 = r5.getActivityPendant()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getImage()
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r3.m85902b()
            com.p683ss.android.ugc.aweme.commercialize.C25649b.m62168a(r1, r0)
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.getAuthor()
            if (r4 == 0) goto L_0x0127
            java.lang.String r4 = "show_brand_sticker"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.app.f.d r6 = r1.mo47829a(r2, r6)
            java.lang.String r1 = "group_id"
            java.lang.String r2 = r5.getAid()
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r1, r2)
            java.lang.String r1 = "author_id"
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = r0.getUid()
            if (r0 != 0) goto L_0x00a6
        L_0x00a4:
            java.lang.String r0 = ""
        L_0x00a6:
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f61491a
            java.lang.String r0 = "EventMapBuilder.newBuild…               .builder()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            com.p683ss.android.ugc.aweme.commercialize.log.C26083h.m63240a(r4, r6)
            com.ss.android.ugc.aweme.commercialize_ad_api.a.a r4 = r3.mo78519a()
            if (r4 == 0) goto L_0x00bf
            r6 = 1
            r4.mo52814a(r5, r6)
            goto L_0x0127
        L_0x00bf:
            return
        L_0x00c0:
            boolean r0 = com.p683ss.android.ugc.aweme.p1308ad.C22316a.m55222c(r5)
            if (r0 == 0) goto L_0x0127
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r3.m85902b()
            r0.setVisibility(r1)
            com.ss.android.ugc.aweme.feed.model.SpecialSticker r0 = r5.getSpecialSticker()
            if (r0 == 0) goto L_0x00de
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r3.m85902b()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getIconUrl()
            com.p683ss.android.ugc.aweme.commercialize.C25649b.m62168a(r1, r0)
        L_0x00de:
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.getAuthor()
            if (r4 == 0) goto L_0x0127
            java.lang.String r4 = "show_brand_sticker"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.app.f.d r6 = r1.mo47829a(r2, r6)
            java.lang.String r1 = "group_id"
            java.lang.String r2 = r5.getAid()
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r1, r2)
            java.lang.String r1 = "author_id"
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = r0.getUid()
            if (r0 != 0) goto L_0x0106
        L_0x0104:
            java.lang.String r0 = ""
        L_0x0106:
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r1, r0)
            java.lang.String r0 = "sticker_id"
            com.ss.android.ugc.aweme.feed.model.SpecialSticker r5 = r5.getSpecialSticker()
            java.lang.String r1 = "aweme.specialSticker"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r1)
            java.lang.String r5 = r5.getStickerId()
            com.ss.android.ugc.aweme.app.f.d r5 = r6.mo47829a(r0, r5)
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a
            java.lang.String r6 = "EventMapBuilder.newBuild…               .builder()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            com.p683ss.android.ugc.aweme.commercialize.log.C26083h.m63240a(r4, r5)
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.pendant.p2044a.C38583a.mo54717a(boolean, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }
}
