package com.p683ss.android.ugc.aweme.base.p1420ui.anchor;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.opensdk.C38511e;
import com.p683ss.android.ugc.aweme.opensdk.p2038a.C38484a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.s */
public final class C23676s extends C23649b {

    /* renamed from: a */
    public final Activity f63121a;

    /* renamed from: b */
    public final String f63122b;

    /* renamed from: s */
    private C38484a f63123s;

    /* renamed from: a */
    public final void mo49074a() {
        C26890h.m65011a("anchor_entrance_show", m58097f());
    }

    /* renamed from: b */
    public final void mo49077b() {
        C26890h.m65011a("anchor_entrance_click", m58097f());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r0 == null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r2 == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3 == null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r5 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007a, code lost:
        if (r5 == null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0 == null) goto L_0x000c;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map<java.lang.String, java.lang.String> m58097f() {
        /*
            r7 = this;
            org.json.JSONObject r0 = r7.f63072r
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
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f63071q
            if (r0 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r0 = r0.getAnchorInfo()
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = r0.getId()
            if (r0 != 0) goto L_0x0028
        L_0x0026:
            java.lang.String r0 = ""
        L_0x0028:
            com.ss.android.ugc.aweme.opensdk.a.a r2 = r7.f63123s
            if (r2 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.opensdk.a.a$c r2 = r2.getShareInfo()
            if (r2 == 0) goto L_0x0038
            java.lang.String r2 = r2.getStyleId()
            if (r2 != 0) goto L_0x003a
        L_0x0038:
            java.lang.String r2 = ""
        L_0x003a:
            com.ss.android.ugc.aweme.opensdk.a.a r3 = r7.f63123s
            if (r3 == 0) goto L_0x004a
            com.ss.android.ugc.aweme.opensdk.a.a$c r3 = r3.getShareInfo()
            if (r3 == 0) goto L_0x004a
            java.lang.String r3 = r3.getShareId()
            if (r3 != 0) goto L_0x004c
        L_0x004a:
            java.lang.String r3 = ""
        L_0x004c:
            com.ss.android.ugc.aweme.app.f.d r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r5 = "logpb"
            com.ss.android.ugc.aweme.feed.aa r6 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            java.lang.String r1 = r6.mo60160a(r1)
            com.ss.android.ugc.aweme.app.f.d r1 = r4.mo47829a(r5, r1)
            java.lang.String r4 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r7.f63071q
            if (r5 == 0) goto L_0x006a
            java.lang.String r5 = r5.getAuthorUid()
            if (r5 != 0) goto L_0x006c
        L_0x006a:
            java.lang.String r5 = ""
        L_0x006c:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r4, r5)
            java.lang.String r4 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r7.f63071q
            if (r5 == 0) goto L_0x007c
            java.lang.String r5 = r5.getAid()
            if (r5 != 0) goto L_0x007e
        L_0x007c:
            java.lang.String r5 = ""
        L_0x007e:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r4, r5)
            java.lang.String r4 = "enter_from"
            java.lang.String r5 = r7.f63122b
            if (r5 != 0) goto L_0x008a
            java.lang.String r5 = ""
        L_0x008a:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r4, r5)
            java.lang.String r4 = "anchor_type"
            java.lang.String r5 = "third_party"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r4, r5)
            java.lang.String r4 = "client_key"
            com.ss.android.ugc.aweme.app.f.d r0 = r1.mo47829a(r4, r0)
            java.lang.String r1 = "style_id"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "share_id"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r3)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            java.lang.String r1 = "EventMapBuilder.newBuild…               .builder()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23676s.m58097f():java.util.Map");
    }

    /* renamed from: a */
    public final void mo49075a(View view) {
        super.mo49075a(view);
        Aweme aweme = this.f63071q;
        if (aweme != null) {
            C38511e.m85843a(this.f63121a, aweme);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r2 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r2 == null) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49076a(com.p683ss.android.ugc.aweme.feed.model.Aweme r1, org.json.JSONObject r2) {
        /*
            r0 = this;
            super.mo49076a(r1, r2)
            if (r1 == 0) goto L_0x0010
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r1 = r1.getAnchorInfo()
            if (r1 == 0) goto L_0x0010
            java.lang.String r1 = r1.getExtra()
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            if (r1 != 0) goto L_0x0015
            java.lang.String r1 = ""
        L_0x0015:
            com.ss.android.ugc.aweme.opensdk.a.a r1 = com.p683ss.android.ugc.aweme.opensdk.C38511e.m85842a(r1)
            r0.f63123s = r1
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r0.f63057c
            com.ss.android.ugc.aweme.opensdk.a.a r2 = r0.f63123s
            if (r2 == 0) goto L_0x002d
            com.ss.android.ugc.aweme.opensdk.a.a$a r2 = r2.getAnchorInfo()
            if (r2 == 0) goto L_0x002d
            java.lang.String r2 = r2.getIcon()
            if (r2 != 0) goto L_0x002f
        L_0x002d:
            java.lang.String r2 = ""
        L_0x002f:
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r1, r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f63058d
            com.ss.android.ugc.aweme.opensdk.a.a r2 = r0.f63123s
            if (r2 == 0) goto L_0x0044
            com.ss.android.ugc.aweme.opensdk.a.a$a r2 = r2.getAnchorInfo()
            if (r2 == 0) goto L_0x0044
            java.lang.String r2 = r2.getName()
            if (r2 != 0) goto L_0x0046
        L_0x0044:
            java.lang.String r2 = ""
        L_0x0046:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23676s.mo49076a(com.ss.android.ugc.aweme.feed.model.Aweme, org.json.JSONObject):void");
    }

    public C23676s(ViewGroup viewGroup, Activity activity, String str) {
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(activity, "activity");
        super(viewGroup);
        this.f63121a = activity;
        this.f63122b = str;
    }
}
