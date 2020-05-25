package com.p683ss.android.ugc.aweme.base.p1420ui.anchor;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.AnchorInfo;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b.C36961a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.o */
public final class C23671o extends C23649b {

    /* renamed from: a */
    public final Activity f63108a;

    /* renamed from: b */
    public final String f63109b;

    /* renamed from: a */
    public final void mo49074a() {
        C26890h.m65011a("anchor_entrance_show", C23089d.m56640a().f61491a);
    }

    /* renamed from: b */
    public final void mo49077b() {
        C26890h.m65011a("anchor_entrance_click", C23089d.m56640a().f61491a);
    }

    /* renamed from: a */
    private static boolean m58079a(AnchorInfo anchorInfo) {
        Integer type = anchorInfo.getType();
        int type2 = C25600a.MICRO_APP.getTYPE();
        if (type != null && type.intValue() == type2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo49075a(View view) {
        String str;
        String str2;
        String str3;
        super.mo49075a(view);
        Aweme aweme = this.f63071q;
        Context context = null;
        if (aweme != null) {
            C36961a d = new C36961a().mo76222b(this.f63109b).mo76220a("in_video_tag").mo76224d(aweme.getAid());
            if (C26512f.m64061d(aweme)) {
                str = "025002";
            } else {
                str = "023001";
            }
            C36960b a = d.mo76223c(str).mo76221a();
            AnchorInfo anchorInfo = aweme.getAnchorInfo();
            if (anchorInfo != null) {
                String openUrl = anchorInfo.getOpenUrl();
                if (openUrl != null) {
                    C36983a b = C36983a.m83185b();
                    C52711k.m112236a((Object) b, "MiniAppServiceProxy.inst()");
                    b.mo76294a().openMiniApp((Context) this.f63108a, openUrl, a);
                    String str4 = "mp_click";
                    C23089d a2 = C23089d.m56640a().mo47829a("group_id", aweme.getAid());
                    String str5 = "mp_id";
                    AnchorInfo anchorInfo2 = aweme.getAnchorInfo();
                    if (anchorInfo2 != null) {
                        str2 = anchorInfo2.getId();
                    } else {
                        str2 = null;
                    }
                    C23089d a3 = a2.mo47829a(str5, str2).mo47829a("author_id", aweme.getAuthorUid()).mo47829a("enter_from", this.f63109b).mo47829a("position", "in_video_tag");
                    String str6 = "_param_for_special";
                    AnchorInfo anchorInfo3 = aweme.getAnchorInfo();
                    C52711k.m112236a((Object) anchorInfo3, "aweme.anchorInfo");
                    if (m58079a(anchorInfo3)) {
                        str3 = "micro_app";
                    } else {
                        str3 = "micro_game";
                    }
                    C26890h.m65011a(str4, a3.mo47829a(str6, str3).f61491a);
                }
            }
        }
        if (C26512f.m64064g(this.f63071q)) {
            if (view != null) {
                context = view.getContext();
            }
            C26088l.m63376n(context, this.f63071q, "draw_ad");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49076a(com.p683ss.android.ugc.aweme.feed.model.Aweme r5, org.json.JSONObject r6) {
        /*
            r4 = this;
            super.mo49076a(r5, r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r4.f63058d
            r0 = 0
            if (r5 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r1 = r5.getAnchorInfo()
            if (r1 == 0) goto L_0x0013
            java.lang.String r1 = r1.getTitle()
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r6.setText(r1)
            if (r5 == 0) goto L_0x0037
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r6 = r5.getAnchorInfo()
            if (r6 == 0) goto L_0x0037
            java.lang.String r6 = r6.getOpenUrl()
            if (r6 == 0) goto L_0x0037
            com.ss.android.ugc.aweme.miniapp_api.services.a r1 = com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a.m83185b()
            java.lang.String r2 = "MiniAppServiceProxy.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r1 = r1.mo76294a()
            r1.preloadMiniApp(r6)
        L_0x0037:
            if (r5 == 0) goto L_0x004b
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r6 = r5.getAnchorInfo()
            if (r6 == 0) goto L_0x004b
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = r6.getIcon()
            if (r6 == 0) goto L_0x004b
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r4.f63057c
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r1, r6)
            goto L_0x007c
        L_0x004b:
            r6 = r4
            com.ss.android.ugc.aweme.base.ui.anchor.o r6 = (com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23671o) r6
            if (r5 == 0) goto L_0x005b
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r1 = r5.getAnchorInfo()
            if (r1 == 0) goto L_0x005b
            java.lang.Integer r1 = r1.getType()
            goto L_0x005c
        L_0x005b:
            r1 = r0
        L_0x005c:
            com.ss.android.ugc.aweme.commercialize.anchor.a r2 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.MICRO_GAME
            int r2 = r2.getTYPE()
            if (r1 != 0) goto L_0x0065
            goto L_0x0074
        L_0x0065:
            int r1 = r1.intValue()
            if (r1 != r2) goto L_0x0074
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = r6.f63057c
            r1 = 2131953124(0x7f1305e4, float:1.954271E38)
            r6.setImageResource(r1)
            goto L_0x007c
        L_0x0074:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = r6.f63057c
            r1 = 2131953123(0x7f1305e3, float:1.9542708E38)
            r6.setImageResource(r1)
        L_0x007c:
            java.lang.String r6 = "mp_show"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "group_id"
            if (r5 == 0) goto L_0x008b
            java.lang.String r3 = r5.getAid()
            goto L_0x008c
        L_0x008b:
            r3 = r0
        L_0x008c:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "mp_id"
            if (r5 == 0) goto L_0x009f
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r3 = r5.getAnchorInfo()
            if (r3 == 0) goto L_0x009f
            java.lang.String r3 = r3.getId()
            goto L_0x00a0
        L_0x009f:
            r3 = r0
        L_0x00a0:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "author_id"
            if (r5 == 0) goto L_0x00ac
            java.lang.String r0 = r5.getAuthorUid()
        L_0x00ac:
            com.ss.android.ugc.aweme.app.f.d r0 = r1.mo47829a(r2, r0)
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = r4.f63109b
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "position"
            java.lang.String r2 = "in_video_tag"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "_param_for_special"
            if (r5 == 0) goto L_0x00d4
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r5 = r5.getAnchorInfo()
            if (r5 == 0) goto L_0x00d4
            boolean r5 = m58079a(r5)
            r2 = 1
            if (r5 != r2) goto L_0x00d4
            java.lang.String r5 = "micro_app"
            goto L_0x00d6
        L_0x00d4:
            java.lang.String r5 = "micro_game"
        L_0x00d6:
            com.ss.android.ugc.aweme.app.f.d r5 = r0.mo47829a(r1, r5)
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23671o.mo49076a(com.ss.android.ugc.aweme.feed.model.Aweme, org.json.JSONObject):void");
    }

    public C23671o(ViewGroup viewGroup, Activity activity, String str) {
        C52711k.m112240b(viewGroup, "parent");
        super(viewGroup);
        this.f63108a = activity;
        this.f63109b = str;
    }
}
