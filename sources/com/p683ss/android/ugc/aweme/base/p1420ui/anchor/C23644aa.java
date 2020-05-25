package com.p683ss.android.ugc.aweme.base.p1420ui.anchor;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.aa */
public class C23644aa extends C23649b {

    /* renamed from: a */
    private final Activity f63045a;

    /* renamed from: b */
    private final String f63046b;

    /* renamed from: f */
    public String mo49078f() {
        return "prop";
    }

    /* renamed from: g */
    public Activity mo49079g() {
        return this.f63045a;
    }

    /* renamed from: h */
    public String mo49080h() {
        return this.f63046b;
    }

    /* renamed from: a */
    public final void mo49074a() {
        C26890h.m65012a("anchor_entrance_show", m57989a(""));
    }

    /* renamed from: b */
    public final void mo49077b() {
        String s = C23198ae.m56883s(this.f63071q);
        C52711k.m112236a((Object) s, "MobUtils.getDistributeTypeDes(aweme)");
        C26890h.m65014b("enter_prop_detail", m57989a(s));
        C26890h.m65012a("anchor_entrance_click", m57989a(""));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0 == null) goto L_0x000c;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m57990j() {
        /*
            r2 = this;
            org.json.JSONObject r0 = r2.f63072r
            if (r0 == 0) goto L_0x000c
            java.lang.String r1 = "request_id"
            java.lang.String r0 = r0.optString(r1)
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            java.lang.String r0 = ""
        L_0x000e:
            com.ss.android.ugc.aweme.feed.model.LogPbBean r1 = new com.ss.android.ugc.aweme.feed.model.LogPbBean
            r1.<init>()
            r1.setImprId(r0)
            com.ss.android.ugc.aweme.feed.aa r0 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            java.lang.String r0 = r0.mo60160a(r1)
            java.lang.String r1 = "LogPbManager.getInstance().formatLogPb(logPb)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23644aa.m57990j():java.lang.String");
    }

    /* renamed from: a */
    public void mo49075a(View view) {
        super.mo49075a(view);
        Aweme aweme = this.f63071q;
        if (aweme != null) {
            C23794bh.m58404r().mo92587a(aweme, mo49079g(), m57990j());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (r2 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r2 == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r2 == null) goto L_0x0032;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m57989a(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "imprType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            com.ss.android.ugc.aweme.common.j r0 = new com.ss.android.ugc.aweme.common.j
            r0.<init>()
            java.lang.String r1 = "log_pb"
            java.lang.String r2 = r3.m57990j()
            com.ss.android.ugc.aweme.common.j r0 = r0.mo54849a(r1, r2)
            java.lang.String r1 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f63071q
            if (r2 == 0) goto L_0x0020
            java.lang.String r2 = r2.getAuthorUid()
            if (r2 != 0) goto L_0x0022
        L_0x0020:
            java.lang.String r2 = ""
        L_0x0022:
            com.ss.android.ugc.aweme.common.j r0 = r0.mo54849a(r1, r2)
            java.lang.String r1 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f63071q
            if (r2 == 0) goto L_0x0032
            java.lang.String r2 = r2.getAid()
            if (r2 != 0) goto L_0x0034
        L_0x0032:
            java.lang.String r2 = ""
        L_0x0034:
            com.ss.android.ugc.aweme.common.j r0 = r0.mo54849a(r1, r2)
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = r3.mo49080h()
            if (r2 != 0) goto L_0x0042
            java.lang.String r2 = ""
        L_0x0042:
            com.ss.android.ugc.aweme.common.j r0 = r0.mo54849a(r1, r2)
            java.lang.String r1 = "prop_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f63071q
            if (r2 == 0) goto L_0x0056
            com.ss.android.ugc.aweme.sticker.model.d r2 = r2.getStickerEntranceInfo()
            if (r2 == 0) goto L_0x0056
            java.lang.String r2 = r2.f116246id
            if (r2 != 0) goto L_0x0058
        L_0x0056:
            java.lang.String r2 = ""
        L_0x0058:
            com.ss.android.ugc.aweme.common.j r0 = r0.mo54849a(r1, r2)
            java.lang.String r1 = "anchor_type"
            java.lang.String r2 = r3.mo49078f()
            com.ss.android.ugc.aweme.common.j r0 = r0.mo54849a(r1, r2)
            r1 = r4
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0074
            java.lang.String r1 = "impr_type"
            r0.mo54849a(r1, r4)
        L_0x0074:
            org.json.JSONObject r4 = r0.mo54850a()
            java.lang.String r0 = "helper.build()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23644aa.m57989a(java.lang.String):org.json.JSONObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo49076a(com.p683ss.android.ugc.aweme.feed.model.Aweme r4, org.json.JSONObject r5) {
        /*
            r3 = this;
            super.mo49076a(r4, r5)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = r3.f63057c
            r0 = 2131952592(0x7f1303d0, float:1.9541631E38)
            r5.setImageResource(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r3.f63058d
            if (r4 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.sticker.model.d r0 = r4.getStickerEntranceInfo()
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = r0.name
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r5.setText(r0)
            if (r4 != 0) goto L_0x0023
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0023:
            r5 = 0
            if (r4 == 0) goto L_0x0065
            com.ss.android.ugc.aweme.sticker.model.d r0 = r4.getStickerEntranceInfo()
            if (r0 == 0) goto L_0x0065
            com.ss.android.ugc.aweme.sticker.model.d r0 = r4.getStickerEntranceInfo()
            java.lang.String r0 = r0.f116246id
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0039
            goto L_0x0065
        L_0x0039:
            boolean r0 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73095a()
            if (r0 == 0) goto L_0x0065
            com.ss.android.ugc.aweme.l.c r0 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73104e()
            if (r0 == 0) goto L_0x0065
            com.ss.android.ugc.aweme.l.c r1 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73104e()
            java.lang.String r1 = r1.f29307h
            if (r1 == 0) goto L_0x0065
            java.util.List<java.lang.String> r1 = r0.f29309j
            boolean r1 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)
            if (r1 != 0) goto L_0x0065
            java.util.List<java.lang.String> r0 = r0.f29309j
            com.ss.android.ugc.aweme.sticker.model.d r4 = r4.getStickerEntranceInfo()
            java.lang.String r4 = r4.f116246id
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x0065
            r4 = 1
            goto L_0x0066
        L_0x0065:
            r4 = 0
        L_0x0066:
            if (r4 == 0) goto L_0x00bf
            com.ss.android.ugc.aweme.l.c r4 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73104e()
            java.lang.String r0 = "CommonFestivalActivityHelper.getFestivalEntity()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            java.lang.String r4 = r4.f29307h
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00bf
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r3.f63070p
            com.ss.android.ugc.aweme.l.c r0 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73104e()
            if (r0 == 0) goto L_0x009f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "#"
            r0.<init>(r1)
            com.ss.android.ugc.aweme.l.c r1 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73104e()
            java.lang.String r2 = "CommonFestivalActivityHelper.getFestivalEntity()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.String r1 = r1.f29307h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x009c:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L_0x00a2
        L_0x009f:
            java.lang.String r0 = ""
            goto L_0x009c
        L_0x00a2:
            r4.setText(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r3.f63070p
            r4.setVisibility(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r3.f63070p
            android.app.Activity r5 = r3.mo49079g()
            android.content.res.Resources r5 = r5.getResources()
            r0 = 2131821039(0x7f1101ef, float:1.927481E38)
            int r5 = r5.getColor(r0)
            r4.setTextColor(r5)
            return
        L_0x00bf:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r3.f63070p
            r5 = 8
            r4.setVisibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23644aa.mo49076a(com.ss.android.ugc.aweme.feed.model.Aweme, org.json.JSONObject):void");
    }

    public C23644aa(ViewGroup viewGroup, Activity activity, String str) {
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(activity, "activity");
        super(viewGroup);
        this.f63045a = activity;
        this.f63046b = str;
    }
}
