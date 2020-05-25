package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30447d;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout.C31096c;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a.C31059b;
import com.p683ss.android.ugc.aweme.settings.DislikeReason;
import com.p683ss.android.ugc.aweme.settings.DislikeReasonsSettings;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a */
public final class C31051a implements C30313ae<C30332aw>, C30447d {

    /* renamed from: a */
    public final C31080f f81297a;

    /* renamed from: b */
    public Aweme f81298b;

    /* renamed from: c */
    public String f81299c;

    /* renamed from: d */
    public SharePackage f81300d;

    /* renamed from: e */
    public final LiveRoomStruct f81301e;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo60714a(Object obj) {
    }

    /* renamed from: c */
    public final void mo63837c() {
        C31080f fVar = this.f81297a;
        if (fVar != null) {
            fVar.dismiss();
        }
    }

    /* renamed from: b */
    public final List<C31078d> mo63836b() {
        DislikeReason[] dislikeReasonArr;
        List<C31078d> arrayList = new ArrayList<>();
        try {
            Object a = C10193n.m20607a().mo18202a(DislikeReasonsSettings.class, "dislike_reasons", C10181b.m20511a().mo18175c().getDislikeReasons(), "com.ss.android.ugc.aweme.settings.DislikeReason[]", DislikeReason[].class);
            C52711k.m112236a(a, "SettingsManager.getInsta…sonsSettings::class.java)");
            for (DislikeReason dislikeReason : (DislikeReason[]) a) {
                arrayList.add(new C31078d(new C31096c(dislikeReason.getId(), dislikeReason.getText()), new C31059b(this)));
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007b, code lost:
        if (r1.isAd() == false) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31081g> mo63835a() {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r11.f81298b
            boolean r1 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72843k(r1)
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0031
            java.lang.String r1 = r11.f81299c
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r11.f81298b
            com.p683ss.android.ugc.aweme.share.C41994c.m91965a(r3, r1, r5)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.h r1 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.h
            com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.f r5 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.f
            r6 = 2131953774(0x7f13086e, float:1.9544028E38)
            r7 = 2132548577(0x7f1c1be1, float:2.0750432E38)
            r5.<init>(r6, r7)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a.e r6 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.a.e
            r6.<init>(r11)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a.i r6 = (com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a.C31068i) r6
            r1.<init>(r5, r6)
            goto L_0x0039
        L_0x0031:
            java.lang.String r1 = r11.f81299c
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r11.f81298b
            com.p683ss.android.ugc.aweme.share.C41994c.m91965a(r2, r1, r5)
            r1 = r4
        L_0x0039:
            r0.add(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r11.f81298b
            if (r1 == 0) goto L_0x004d
            boolean r1 = r1.isCollected()
            if (r1 != r3) goto L_0x004d
            r1 = 2132541884(0x7f1c01bc, float:2.0736857E38)
            r5 = 2131953779(0x7f130873, float:1.9544039E38)
            goto L_0x0053
        L_0x004d:
            r1 = 2132541883(0x7f1c01bb, float:2.0736855E38)
            r5 = 2131953780(0x7f130874, float:1.954404E38)
        L_0x0053:
            com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.f r6 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.f
            r6.<init>(r5, r1)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.h r1 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.h
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f r5 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f
            r5.<init>(r11)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a.i r5 = (com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a.C31068i) r5
            r1.<init>(r6, r5)
            r0.add(r1)
            boolean r1 = com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31076b.m72676a()
            r5 = 2132547025(0x7f1c15d1, float:2.0747284E38)
            r6 = 2131953783(0x7f130877, float:1.9544047E38)
            if (r1 == 0) goto L_0x007f
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r11.f81298b
            if (r1 == 0) goto L_0x007f
            boolean r1 = r1.isAd()
            if (r1 != 0) goto L_0x007f
        L_0x007d:
            r1 = r4
            goto L_0x00b7
        L_0x007f:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r11.f81298b
            boolean r1 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r1)
            if (r1 != 0) goto L_0x00a4
            java.lang.String r1 = r11.f81299c
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r7 = "homepage_hot"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r1 = android.text.TextUtils.equals(r1, r7)
            if (r1 != 0) goto L_0x00a3
            java.lang.String r1 = r11.f81299c
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r7 = "homepage_fresh"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r1 = android.text.TextUtils.equals(r1, r7)
            if (r1 == 0) goto L_0x00a4
        L_0x00a3:
            r2 = 1
        L_0x00a4:
            if (r2 == 0) goto L_0x007d
            com.ss.android.ugc.aweme.feed.ui.masklayer2.h r1 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.h
            com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.f r2 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.f
            r2.<init>(r6, r5)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a.h r7 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.a.h
            r7.<init>(r11)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a.i r7 = (com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a.C31068i) r7
            r1.<init>(r2, r7)
        L_0x00b7:
            r0.add(r1)
            boolean r1 = com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31076b.m72676a()
            if (r1 != 0) goto L_0x00c2
        L_0x00c0:
            r1 = r4
            goto L_0x00f4
        L_0x00c2:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r11.f81298b
            if (r1 == 0) goto L_0x00cd
            boolean r1 = r1.isAd()
            if (r1 != r3) goto L_0x00cd
            goto L_0x00c0
        L_0x00cd:
            java.lang.String r1 = r11.f81299c
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = "homepage_hot"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x00dc
            goto L_0x00c0
        L_0x00dc:
            com.ss.android.ugc.aweme.feed.ui.masklayer2.c r1 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.c
            com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.f r2 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.f
            r2.<init>(r6, r5)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a.h r3 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.a.h
            r3.<init>(r11)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a.i r3 = (com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a.C31068i) r3
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a.j r5 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.a.j
            r5.<init>(r11)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a.i r5 = (com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a.C31068i) r5
            r1.<init>(r2, r3, r5)
        L_0x00f4:
            r0.add(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r11.f81298b
            boolean r1 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r1)
            if (r1 != 0) goto L_0x0128
            com.bytedance.ies.abmock.b r5 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.report.VideoReportEnhanceExperiment> r6 = com.p683ss.android.ugc.aweme.report.VideoReportEnhanceExperiment.class
            r7 = 1
            java.lang.String r8 = "enable_enhance_report"
            r9 = 31744(0x7c00, float:4.4483E-41)
            r10 = 0
            boolean r1 = r5.mo18172a(r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x0128
            com.ss.android.ugc.aweme.feed.ui.masklayer2.h r4 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.h
            com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.f r1 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.f
            r2 = 2131953785(0x7f130879, float:1.954405E38)
            r3 = 2132548403(0x7f1c1b33, float:2.075008E38)
            r1.<init>(r2, r3)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.k r2 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.k
            r2.<init>(r11)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a.i r2 = (com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a.C31068i) r2
            r4.<init>(r1, r2)
        L_0x0128:
            r0.add(r4)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = p2628d.p2629a.C52575l.m112128b(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r0 = p2628d.p2629a.C52575l.m112139e(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31051a.mo63835a():java.util.List");
    }

    /* renamed from: g */
    public final String mo60874g(boolean z) {
        return this.f81299c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        if (r8 == null) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C31051a(com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31080f r8, com.p683ss.android.ugc.aweme.feed.model.Aweme r9, java.lang.String r10) {
        /*
            r7 = this;
            java.lang.String r0 = "enterFrom"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            r7.<init>()
            r7.f81297a = r8
            r7.f81298b = r9
            r7.f81299c = r10
            com.ss.android.ugc.aweme.share.ShareService r1 = com.p683ss.android.ugc.aweme.share.C41979aq.m91946a()
            android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            if (r9 != 0) goto L_0x001b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x001b:
            r4 = 0
            java.lang.String r6 = "long_press_download"
            r3 = r9
            r5 = r10
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r8 = r1.parseAweme(r2, r3, r4, r5, r6)
            r7.f81300d = r8
            com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct r8 = r9.getRoomFeedCellStruct()
            if (r8 == 0) goto L_0x0030
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r8 = r8.room
            if (r8 != 0) goto L_0x004a
        L_0x0030:
            com.ss.android.ugc.aweme.video.k r8 = com.p683ss.android.ugc.aweme.video.C48039k.m104036a()
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.follow.presenter.RoomStruct> r8 = r8.f120722b
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r7.f81298b
            if (r9 == 0) goto L_0x0043
            com.ss.android.ugc.aweme.feed.model.StreamUrlModel r9 = r9.getStreamUrlModel()
            if (r9 == 0) goto L_0x0043
            java.lang.String r9 = r9.f79733id
            goto L_0x0044
        L_0x0043:
            r9 = 0
        L_0x0044:
            java.lang.Object r8 = r8.get(r9)
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r8 = (com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct) r8
        L_0x004a:
            r7.f81301e = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31051a.<init>(com.ss.android.ugc.aweme.feed.ui.masklayer2.f, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }
}
