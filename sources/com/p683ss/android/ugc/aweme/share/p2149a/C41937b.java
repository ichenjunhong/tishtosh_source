package com.p683ss.android.ugc.aweme.share.p2149a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.google.p1057b.p1060c.C17530ab;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42091h;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42116p;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42354e;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42356f;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.C42345e;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.a.b */
public final class C41937b {

    /* renamed from: a */
    public final int f106138a = this.f106152o.getInt("page_type");

    /* renamed from: b */
    public final String f106139b = this.f106152o.getString("event_type", "");

    /* renamed from: c */
    public final String f106140c = this.f106152o.getString("enter_method", "");

    /* renamed from: d */
    public final String f106141d = this.f106152o.getString("play_list_id", "");

    /* renamed from: e */
    public final String f106142e = this.f106152o.getString("play_list_id_key", "");

    /* renamed from: f */
    public final String f106143f = this.f106152o.getString("play_list_type", "");

    /* renamed from: g */
    public final String f106144g = this.f106152o.getString("tab_name", "");

    /* renamed from: h */
    public final String f106145h = this.f106152o.getString("from", "");

    /* renamed from: i */
    public final String f106146i = this.f106152o.getString("creation_id", "");

    /* renamed from: j */
    public final Activity f106147j;

    /* renamed from: k */
    public final Fragment f106148k;

    /* renamed from: l */
    public final Aweme f106149l;

    /* renamed from: m */
    public final boolean f106150m;

    /* renamed from: n */
    public final C30313ae<C30332aw> f106151n;

    /* renamed from: o */
    public final Bundle f106152o;

    /* renamed from: p */
    private final List<String> f106153p;

    /* renamed from: com.ss.android.ugc.aweme.share.a.b$a */
    public static final class C41938a extends C42356f {

        /* renamed from: a */
        final /* synthetic */ C41937b f106154a;

        public C41938a(C41937b bVar) {
            this.f106154a = bVar;
        }

        /* renamed from: b */
        public final void mo49962b(SharePackage sharePackage, Context context) {
            C52711k.m112240b(sharePackage, "sharePackage");
            C52711k.m112240b(context, "context");
            this.f106154a.f106151n.mo60714a(new C30332aw(28));
        }

        /* renamed from: a */
        public final void mo49961a(C42357g gVar, SharePackage sharePackage, Context context) {
            C52711k.m112240b(gVar, "action");
            C52711k.m112240b(sharePackage, "sharePackage");
            C52711k.m112240b(context, "context");
            if (gVar instanceof C42091h) {
                this.f106154a.mo86046a(gVar.mo49954c(), true, sharePackage, context, this.f106154a.f106149l);
            }
            if (gVar instanceof C42116p) {
                this.f106154a.mo86046a(gVar.mo49954c(), true, sharePackage, context, this.f106154a.f106149l);
            }
            if (C52711k.m112239a((Object) gVar.mo49954c(), (Object) "live_photo")) {
                this.f106154a.mo86046a(gVar.mo49954c(), true, sharePackage, context, this.f106154a.f106149l);
            }
        }

        /* renamed from: a */
        public final void mo49959a(C42307b bVar, boolean z, SharePackage sharePackage, Context context) {
            C52711k.m112240b(bVar, "channel");
            C52711k.m112240b(context, "context");
            this.f106154a.mo86046a(bVar.mo86136b(), z, sharePackage, context, this.f106154a.f106149l);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.a.b$b */
    public static final class C41939b implements C42345e {

        /* renamed from: a */
        final /* synthetic */ C41937b f106155a;

        /* renamed from: b */
        final /* synthetic */ C42348d f106156b;

        /* renamed from: c */
        final /* synthetic */ Dialog f106157c;

        /* renamed from: a */
        public final void mo66353a(C42307b bVar) {
            C52711k.m112240b(bVar, "channel");
            if (!this.f106156b.f106953i.mo85939a(bVar, (Context) this.f106155a.f106147j)) {
                bVar.mo49947a(this.f106156b.f106953i.mo73884a(bVar), (Context) this.f106155a.f106147j);
            }
            C42354e eVar = this.f106156b.f106956l;
            if (eVar != null) {
                eVar.mo49959a(bVar, true, this.f106156b.f106953i, this.f106155a.f106147j);
            }
            if (!bVar.mo86143g()) {
                Dialog dialog = this.f106157c;
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }

        public C41939b(C41937b bVar, C42348d dVar, Dialog dialog) {
            this.f106155a = bVar;
            this.f106156b = dVar;
            this.f106157c = dialog;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86046a(java.lang.String r19, boolean r20, com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage r21, android.content.Context r22, com.p683ss.android.ugc.aweme.feed.model.Aweme r23) {
        /*
            r18 = this;
            r0 = r18
            r8 = r19
            r9 = r22
            r10 = r23
            java.lang.String r2 = "aweme_share_error_rate"
            r3 = r20 ^ 1
            com.ss.android.ugc.aweme.app.f.c r4 = new com.ss.android.ugc.aweme.app.f.c
            r4.<init>()
            java.lang.String r5 = "platform"
            r11 = r8
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r6 = android.text.TextUtils.isEmpty(r11)
            if (r6 != 0) goto L_0x0061
            int r6 = r19.hashCode()
            r7 = -1374807695(0xffffffffae0e1971, float:-3.230966E-11)
            if (r6 == r7) goto L_0x0056
            r7 = -1194195335(0xffffffffb8d20679, float:-1.0014786E-4)
            if (r6 == r7) goto L_0x004b
            r7 = 28903346(0x1b907b2, float:6.796931E-38)
            if (r6 == r7) goto L_0x0040
            r7 = 497130182(0x1da19ac6, float:4.2776377E-21)
            if (r6 == r7) goto L_0x0035
            goto L_0x0061
        L_0x0035:
            java.lang.String r6 = "facebook"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0061
            java.lang.String r6 = "FB"
            goto L_0x0062
        L_0x0040:
            java.lang.String r6 = "instagram"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0061
            java.lang.String r6 = "Ins"
            goto L_0x0062
        L_0x004b:
            java.lang.String r6 = "kakao_story"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0061
            java.lang.String r6 = "kakaostory"
            goto L_0x0062
        L_0x0056:
            java.lang.String r6 = "naver_blog"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0061
            java.lang.String r6 = "naver"
            goto L_0x0062
        L_0x0061:
            r6 = r8
        L_0x0062:
            com.ss.android.ugc.aweme.app.f.c r4 = r4.mo47824a(r5, r6)
            org.json.JSONObject r4 = r4.mo47825b()
            com.p683ss.android.ugc.aweme.app.C23131p.m57776a(r2, r3, r4)
            if (r20 != 0) goto L_0x0070
            return
        L_0x0070:
            com.ss.android.ugc.aweme.share.ShareDependService r1 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            r2 = 0
            java.lang.String r3 = ""
            r1.logForAdShare(r9, r10, r2, r3)
            java.lang.String r2 = "share_video"
            java.lang.String r4 = r23.getAid()
            r5 = 0
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r1 = com.p683ss.android.ugc.aweme.awemeservice.C23325e.m57379a()
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r1 = (com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService) r1
            int r3 = r0.f106138a
            org.json.JSONObject r1 = r1.getRequestIdAndOrderJsonObject(r10, r3)
            com.ss.android.ugc.aweme.app.f.c r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56632a(r1)
            java.lang.String r3 = "enter_from"
            java.lang.String r7 = r0.f106139b
            r1.mo47824a(r3, r7)
            com.bytedance.ies.abmock.b r12 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.ShareButtonStyleExperiment> r13 = com.p683ss.android.ugc.aweme.feed.experiment.ShareButtonStyleExperiment.class
            r14 = 1
            java.lang.String r15 = "share_button_style"
            r16 = 31744(0x7c00, float:4.4483E-41)
            r17 = 0
            int r3 = r12.mo18168a(r13, r14, r15, r16, r17)
            java.lang.String r7 = ""
            r12 = 1
            if (r3 != r12) goto L_0x00b2
            java.lang.String r7 = "plain"
            goto L_0x00bd
        L_0x00b2:
            r13 = 2
            if (r3 != r13) goto L_0x00b8
            java.lang.String r7 = "text"
            goto L_0x00bd
        L_0x00b8:
            r13 = 3
            if (r3 != r13) goto L_0x00bd
            java.lang.String r7 = "num"
        L_0x00bd:
            java.lang.String r3 = "style"
            r1.mo47824a(r3, r7)
            com.ss.android.ugc.aweme.forward.e.c r3 = com.p683ss.android.ugc.aweme.C23794bh.m58391e()
            java.lang.String r7 = r0.f106139b
            r3.mo65595b(r1, r10, r7)
            com.ss.android.ugc.aweme.forward.e.c r3 = com.p683ss.android.ugc.aweme.C23794bh.m58391e()
            com.ss.android.ugc.aweme.forward.e.c r7 = com.p683ss.android.ugc.aweme.C23794bh.m58391e()
            java.lang.String r7 = r7.mo65589a()
            r3.mo65588a(r1, r10, r7)
            org.json.JSONObject r7 = r1.mo47825b()
            r1 = r22
            r3 = r19
            com.p683ss.android.ugc.aweme.common.C26890h.m65006a(r1, r2, r3, r4, r5, r7)
            java.lang.String r1 = "chat_merge"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.equals(r11, r1)
            if (r1 != 0) goto L_0x0144
            com.ss.android.ugc.aweme.aq.am r1 = new com.ss.android.ugc.aweme.aq.am
            r1.<init>()
            java.lang.String r2 = r0.f106139b
            com.ss.android.ugc.aweme.aq.am r1 = r1.mo47988a(r2)
            com.ss.android.ugc.aweme.aq.am r1 = r1.mo47954f(r10)
            java.lang.String r2 = r0.f106141d
            r1.f61752e = r2
            java.lang.String r2 = r0.f106142e
            r1.f61751d = r2
            java.lang.String r2 = r0.f106143f
            r1.f61750c = r2
            java.lang.String r2 = r0.f106144g
            com.ss.android.ugc.aweme.aq.k r1 = r1.mo48100j(r2)
            com.ss.android.ugc.aweme.aq.am r1 = (com.p683ss.android.ugc.aweme.p1382aq.C23207am) r1
            int r2 = r0.f106138a
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56854b(r10, r2)
            com.ss.android.ugc.aweme.aq.k r1 = r1.mo48101k(r2)
            com.ss.android.ugc.aweme.aq.am r1 = (com.p683ss.android.ugc.aweme.p1382aq.C23207am) r1
            com.ss.android.ugc.aweme.aq.am r1 = r1.mo47989b(r8)
            java.lang.String r2 = "normal_share"
            r1.f61743a = r2
            com.ss.android.ugc.aweme.comment.services.a r2 = com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a.m61494a()
            int r2 = r2.getIsLongItem(r9)
            r1.f61749b = r2
            java.util.List<java.lang.String> r2 = r0.f106153p
            boolean r2 = r2.contains(r8)
            r2 = r2 ^ r12
            com.ss.android.ugc.aweme.aq.am r1 = r1.mo47987a(r2)
            java.lang.String r2 = r0.f106146i
            com.ss.android.ugc.aweme.aq.am r1 = r1.mo47990c(r2)
            r1.mo48076e()
        L_0x0144:
            com.ss.android.ugc.aweme.feed.h.ae<com.ss.android.ugc.aweme.feed.h.aw> r1 = r0.f106151n
            if (r1 == 0) goto L_0x0170
            java.lang.String r1 = "copy"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.equals(r11, r1)
            if (r1 != 0) goto L_0x0170
            com.bytedance.ies.abmock.b r2 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.DownloadMaskExperiment> r3 = com.p683ss.android.ugc.aweme.experiment.DownloadMaskExperiment.class
            r4 = 0
            java.lang.String r5 = "downloading_no_mask"
            r6 = 31744(0x7c00, float:4.4483E-41)
            r7 = 0
            boolean r1 = r2.mo18172a(r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x0170
            com.ss.android.ugc.aweme.feed.h.ae<com.ss.android.ugc.aweme.feed.h.aw> r1 = r0.f106151n
            com.ss.android.ugc.aweme.feed.h.aw r2 = new com.ss.android.ugc.aweme.feed.h.aw
            r3 = 16
            r2.<init>(r3, r10)
            r1.mo60714a(r2)
        L_0x0170:
            com.ss.android.ugc.aweme.common.b r1 = new com.ss.android.ugc.aweme.common.b
            r1.<init>()
            com.ss.android.ugc.aweme.feed.m.a r2 = new com.ss.android.ugc.aweme.feed.m.a
            r2.<init>()
            com.ss.android.ugc.aweme.common.a r2 = (com.p683ss.android.ugc.aweme.common.C26832a) r2
            r1.mo54799a(r2)
            java.lang.Object[] r2 = new java.lang.Object[r12]
            com.ss.android.ugc.aweme.feed.m.c$a r3 = new com.ss.android.ugc.aweme.feed.m.c$a
            r3.<init>()
            java.lang.String r4 = r23.getAid()
            com.ss.android.ugc.aweme.feed.m.c$a r3 = r3.mo60897a(r4)
            com.ss.android.ugc.aweme.feed.m.c$a r3 = r3.mo60896a(r12)
            r4 = 0
            com.ss.android.ugc.aweme.feed.m.c$a r3 = r3.mo60899b(r4)
            com.ss.android.ugc.aweme.feed.m.c$a r3 = r3.mo60902d(r12)
            com.ss.android.ugc.aweme.feed.m.c$a r3 = r3.mo60900b(r8)
            com.ss.android.ugc.aweme.feed.m.c r3 = r3.mo60898a()
            r2[r4] = r3
            r1.mo44934a_(r2)
            com.p683ss.android.ugc.aweme.feed.C30130ag.m70700a(r19)
            com.ss.android.ugc.aweme.share.e.a r1 = com.p683ss.android.ugc.aweme.share.p2154e.C42006a.m91978a()
            r1.mo86083a(r8, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.share.p2149a.C41937b.mo86046a(java.lang.String, boolean, com.ss.android.ugc.aweme.sharer.ui.SharePackage, android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public C41937b(Activity activity, Fragment fragment, Aweme aweme, boolean z, C30313ae<C30332aw> aeVar, Bundle bundle) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(fragment, "fragment");
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(aeVar, "eventListener");
        C52711k.m112240b(bundle, "extras");
        this.f106147j = activity;
        this.f106148k = fragment;
        this.f106149l = aweme;
        this.f106150m = z;
        this.f106151n = aeVar;
        this.f106152o = bundle;
        C17530ab of = C17530ab.m43064of("instagram", "instagram_story", "snapchat", "imo", "bbm", "zalo", "whatsapp", "kakaotalk");
        C52711k.m112236a((Object) of, "ImmutableList.of(\n      …akaotalkChannel.KEY\n    )");
        this.f106153p = of;
    }
}
