package com.p683ss.android.ugc.aweme.base.p1420ui.anchor;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.base.p1420ui.HollowTextView;
import com.p683ss.android.ugc.aweme.commercialize.log.C26050aq;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.forward.p1777e.C32401a;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.FollowFeedTagGroup;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.poi.C39054d;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.poi.model.C39129m;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.service.IPoiService;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.u */
public final class C23678u extends C23649b {

    /* renamed from: A */
    public final Activity f63127A;

    /* renamed from: B */
    public final String f63128B;

    /* renamed from: C */
    private final ImageView f63129C;

    /* renamed from: D */
    private final DmtTextView f63130D;

    /* renamed from: E */
    private final LinearLayout f63131E;

    /* renamed from: F */
    private final float f63132F = (((float) C9432q.m18670a((Context) this.f63127A)) - C9432q.m18687b((Context) this.f63127A, 160.0f));

    /* renamed from: G */
    private C39054d f63133G;

    /* renamed from: H */
    private JSONObject f63134H;

    /* renamed from: a */
    public final DmtTextView f63135a;

    /* renamed from: b */
    public final FollowFeedTagGroup f63136b;

    /* renamed from: s */
    public HollowTextView f63137s;

    /* renamed from: u */
    public PoiStruct f63138u;

    /* renamed from: v */
    public String f63139v = "list";

    /* renamed from: w */
    public C30313ae<C30332aw> f63140w;

    /* renamed from: x */
    public String f63141x;

    /* renamed from: y */
    public String f63142y;

    /* renamed from: z */
    public String f63143z;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.u$a */
    public static final class C23679a implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C23678u f63144a;

        public final void onGlobalLayout() {
            int i;
            String str;
            if (this.f63144a.f63137s == null) {
                this.f63144a.f63136b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            }
            TextPaint paint = this.f63144a.f63135a.getPaint();
            HollowTextView hollowTextView = this.f63144a.f63137s;
            if (hollowTextView != null) {
                i = hollowTextView.getWidth();
            } else {
                i = 0;
            }
            int b = i - ((int) C9432q.m18687b((Context) this.f63144a.f63127A, 4.0f));
            if (b <= 0) {
                b = 0;
            }
            HollowTextView hollowTextView2 = this.f63144a.f63137s;
            if (hollowTextView2 != null) {
                str = hollowTextView2.getText();
            } else {
                str = null;
            }
            String obj = TextUtils.ellipsize(str, paint, (float) b, TruncateAt.MIDDLE, false, null).toString();
            HollowTextView hollowTextView3 = this.f63144a.f63137s;
            if (hollowTextView3 != null) {
                hollowTextView3.setText(obj);
            }
            this.f63144a.f63064j.setVisibility(8);
            this.f63144a.f63136b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        C23679a(C23678u uVar) {
            this.f63144a = uVar;
        }
    }

    /* renamed from: f */
    private final void m58106f() {
        this.f63135a.setVisibility(8);
        this.f63129C.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo49074a() {
        C26890h.m65012a("anchor_entrance_show", m58107g());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0 == null) goto L_0x000c;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final org.json.JSONObject m58107g() {
        /*
            r6 = this;
            org.json.JSONObject r0 = r6.f63134H
            if (r0 == 0) goto L_0x000c
            java.lang.String r1 = "request_id"
            java.lang.String r0 = r0.optString(r1)
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            java.lang.String r0 = ""
        L_0x000e:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.f63071q
            java.lang.String r1 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56861e(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f63071q
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56877m(r2)
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = new com.ss.android.ugc.aweme.feed.model.LogPbBean
            r3.<init>()
            r3.setImprId(r0)
            com.ss.android.ugc.aweme.common.j r0 = new com.ss.android.ugc.aweme.common.j
            r0.<init>()
            java.lang.String r4 = "log_pb"
            com.ss.android.ugc.aweme.feed.aa r5 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            java.lang.String r3 = r5.mo60160a(r3)
            com.ss.android.ugc.aweme.common.j r0 = r0.mo54849a(r4, r3)
            java.lang.String r3 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r6.f63071q
            if (r4 == 0) goto L_0x0040
            java.lang.String r4 = r4.getAuthorUid()
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            com.ss.android.ugc.aweme.common.j r0 = r0.mo54849a(r3, r4)
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.common.j r0 = r0.mo54849a(r3, r2)
            java.lang.String r2 = "impr_type"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r6.f63071q
            java.lang.String r3 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56883s(r3)
            com.ss.android.ugc.aweme.common.j r0 = r0.mo54849a(r2, r3)
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r6.f63128B
            if (r3 != 0) goto L_0x005f
            java.lang.String r3 = ""
        L_0x005f:
            com.ss.android.ugc.aweme.common.j r0 = r0.mo54849a(r2, r3)
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.common.j r0 = r0.mo54849a(r2, r1)
            java.lang.String r1 = "anchor_type"
            java.lang.String r2 = "poi"
            com.ss.android.ugc.aweme.common.j r0 = r0.mo54849a(r1, r2)
            org.json.JSONObject r0 = r0.mo54850a()
            java.lang.String r1 = "MobJsonHelper()\n        …oi\")\n            .build()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23678u.m58107g():org.json.JSONObject");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r3 == null) goto L_0x001e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49077b() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f63071q
            java.lang.String r0 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56861e(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f63071q
            java.lang.String r1 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56867h(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.f63071q
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56877m(r2)
            org.json.JSONObject r3 = r7.f63134H     // Catch:{ Exception -> 0x009a }
            if (r3 == 0) goto L_0x001e
            java.lang.String r4 = "request_id"
            java.lang.String r3 = r3.optString(r4)     // Catch:{ Exception -> 0x009a }
            if (r3 != 0) goto L_0x0020
        L_0x001e:
            java.lang.String r3 = ""
        L_0x0020:
            com.ss.android.ugc.aweme.common.MobClick r4 = com.p683ss.android.ugc.aweme.common.MobClick.obtain()     // Catch:{ Exception -> 0x009a }
            java.lang.String r5 = "poi_click"
            com.ss.android.ugc.aweme.common.MobClick r4 = r4.setEventName(r5)     // Catch:{ Exception -> 0x009a }
            java.lang.String r5 = r7.f63128B     // Catch:{ Exception -> 0x009a }
            if (r5 != 0) goto L_0x0030
            java.lang.String r5 = ""
        L_0x0030:
            com.ss.android.ugc.aweme.common.MobClick r4 = r4.setLabelName(r5)     // Catch:{ Exception -> 0x009a }
            com.ss.android.ugc.aweme.common.MobClick r4 = r4.setValue(r2)     // Catch:{ Exception -> 0x009a }
            com.ss.android.ugc.aweme.app.f.c r5 = new com.ss.android.ugc.aweme.app.f.c     // Catch:{ Exception -> 0x009a }
            r5.<init>()     // Catch:{ Exception -> 0x009a }
            java.lang.String r6 = "poi_id"
            com.ss.android.ugc.aweme.app.f.c r5 = r5.mo47824a(r6, r0)     // Catch:{ Exception -> 0x009a }
            java.lang.String r6 = "poi_type"
            com.ss.android.ugc.aweme.app.f.c r5 = r5.mo47824a(r6, r1)     // Catch:{ Exception -> 0x009a }
            java.lang.String r6 = "request_id"
            com.ss.android.ugc.aweme.app.f.c r5 = r5.mo47824a(r6, r3)     // Catch:{ Exception -> 0x009a }
            java.lang.String r6 = "group_id"
            com.ss.android.ugc.aweme.app.f.c r2 = r5.mo47824a(r6, r2)     // Catch:{ Exception -> 0x009a }
            java.lang.String r5 = "content_type"
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r7.f63071q     // Catch:{ Exception -> 0x009a }
            java.lang.String r6 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56879o(r6)     // Catch:{ Exception -> 0x009a }
            com.ss.android.ugc.aweme.app.f.c r2 = r2.mo47824a(r5, r6)     // Catch:{ Exception -> 0x009a }
            org.json.JSONObject r2 = r2.mo47825b()     // Catch:{ Exception -> 0x009a }
            com.ss.android.ugc.aweme.common.MobClick r2 = r4.setJsonObject(r2)     // Catch:{ Exception -> 0x009a }
            com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r2)     // Catch:{ Exception -> 0x009a }
            java.lang.String r2 = "anchor_entrance_click"
            org.json.JSONObject r4 = r7.m58107g()     // Catch:{ Exception -> 0x009a }
            com.p683ss.android.ugc.aweme.common.C26890h.m65012a(r2, r4)     // Catch:{ Exception -> 0x009a }
            com.ss.android.ugc.aweme.aq.i r2 = new com.ss.android.ugc.aweme.aq.i     // Catch:{ Exception -> 0x009a }
            r2.<init>()     // Catch:{ Exception -> 0x009a }
            java.lang.String r4 = r7.f63128B     // Catch:{ Exception -> 0x009a }
            if (r4 != 0) goto L_0x0080
            java.lang.String r4 = ""
        L_0x0080:
            com.ss.android.ugc.aweme.aq.i r2 = r2.mo48092a(r4)     // Catch:{ Exception -> 0x009a }
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f63071q     // Catch:{ Exception -> 0x009a }
            com.ss.android.ugc.aweme.aq.i r2 = r2.mo48096e(r4)     // Catch:{ Exception -> 0x009a }
            com.ss.android.ugc.aweme.aq.i r2 = r2.mo48093b(r3)     // Catch:{ Exception -> 0x009a }
            com.ss.android.ugc.aweme.aq.i r0 = r2.mo48094c(r0)     // Catch:{ Exception -> 0x009a }
            com.ss.android.ugc.aweme.aq.i r0 = r0.mo48095d(r1)     // Catch:{ Exception -> 0x009a }
            r0.mo48076e()     // Catch:{ Exception -> 0x009a }
            return
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23678u.mo49077b():void");
    }

    /* renamed from: a */
    public final void mo49075a(View view) {
        String str;
        PoiStruct poiStruct;
        super.mo49075a(view);
        String e = C23198ae.m56861e(this.f63071q);
        String g = C23198ae.m56865g(this.f63071q);
        String h = C23198ae.m56867h(this.f63071q);
        Context context = this.f63127A;
        Aweme aweme = this.f63071q;
        C26088l.m63322b(context, "location_click", aweme, C26050aq.m63099a(C26088l.m63373m(context, aweme, "raw ad click location"), e));
        IPoiService createIPoiServicebyMonsterPlugin = PoiServiceImpl.createIPoiServicebyMonsterPlugin();
        if (createIPoiServicebyMonsterPlugin.needHideLabel(this.f63133G, this.f63138u) || !createIPoiServicebyMonsterPlugin.isPoiLabelCoupon(this.f63138u)) {
            str = "0";
        } else {
            str = "1";
        }
        SmartRoute buildRoute = SmartRouter.buildRoute((Context) this.f63127A, "//poi/detail");
        String str2 = "poi_bundle";
        C39129m e2 = new C39129m().mo79718a(e).mo79724f(g).mo79723e(h);
        Aweme aweme2 = this.f63071q;
        String str3 = null;
        if (aweme2 != null) {
            poiStruct = aweme2.getPoiStruct();
        } else {
            poiStruct = null;
        }
        C39129m i = e2.mo79717a(poiStruct).mo79714a(this.f63071q).mo79719a(C32401a.m74903b(this.f63071q, this.f63139v)).mo79727i(this.f63139v);
        String str4 = this.f63128B;
        if (str4 == null) {
            str4 = "";
        }
        C39129m n = i.mo79726h(str4).mo79732n(str);
        PoiStruct poiStruct2 = this.f63138u;
        if (poiStruct2 != null) {
            str3 = String.valueOf(poiStruct2.getPoiSubTitleType());
        }
        C39129m q = n.mo79735q(str3);
        q.f99835a = this.f63143z;
        Context context2 = this.f63101t.getContext();
        C52711k.m112236a((Object) context2, "parent.context");
        q.f99855u = createIPoiServicebyMonsterPlugin.getMobDistance(context2, this.f63138u);
        buildRoute.withParam(str2, (Serializable) q.mo79713a()).open();
        C30313ae<C30332aw> aeVar = this.f63140w;
        if (aeVar != null) {
            aeVar.mo60714a(new C30332aw(33, this.f63071q));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ed, code lost:
        if (r9 == null) goto L_0x00ef;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01b3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49076a(com.p683ss.android.ugc.aweme.feed.model.Aweme r22, org.json.JSONObject r23) {
        /*
            r21 = this;
            r0 = r21
            super.mo49076a(r22, r23)
            r1 = r23
            r0.f63134H = r1
            r1 = 0
            if (r22 == 0) goto L_0x0011
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r22.getPoiStruct()
            goto L_0x0012
        L_0x0011:
            r2 = r1
        L_0x0012:
            r0.f63138u = r2
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r0.f63138u
            if (r2 != 0) goto L_0x0019
            return
        L_0x0019:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r0.f63135a
            r3 = 0
            r2.setVisibility(r3)
            android.widget.ImageView r2 = r0.f63129C
            r2.setVisibility(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r0.f63130D
            r2.setVisibility(r3)
            android.widget.LinearLayout r2 = r0.f63131E
            r4 = 8
            r2.setVisibility(r4)
            com.ss.android.ugc.aweme.poi.service.IPoiService r2 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.poi.service.IPoiService r2 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r2
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = r0.f63057c
            com.ss.android.ugc.aweme.poi.model.PoiStruct r6 = r0.f63138u
            r2.setupLocationIcon(r5, r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r0.f63058d
            com.ss.android.ugc.aweme.poi.model.PoiStruct r5 = r0.f63138u
            if (r5 == 0) goto L_0x0046
            java.lang.String r5 = r5.poiName
            goto L_0x0047
        L_0x0046:
            r5 = r1
        L_0x0047:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r2.setText(r5)
            com.ss.android.ugc.aweme.app.AwemeApplication r2 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            android.content.Context r2 = (android.content.Context) r2
            com.ss.android.ugc.aweme.location.l r2 = com.p683ss.android.ugc.aweme.location.C36272l.m81897a(r2)
            com.ss.android.ugc.aweme.poi.d r2 = r2.mo75072a()
            r0.f63133G = r2
            java.lang.String r2 = "poi_map"
            java.lang.String r5 = r0.f63128B
            r6 = 1
            boolean r2 = p2628d.p2650m.C52830p.m112406a(r2, r5, r6)
            if (r2 == 0) goto L_0x00c8
            java.lang.String r2 = r0.f63141x
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00c5
            java.lang.String r2 = r0.f63142y
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x007c
            goto L_0x00c5
        L_0x007c:
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r0.f63138u
            r7 = 0
            if (r2 == 0) goto L_0x008d
            java.lang.String r2 = r2.poiLatitude
            if (r2 == 0) goto L_0x008d
            double r9 = java.lang.Double.parseDouble(r2)
            r17 = r9
            goto L_0x008f
        L_0x008d:
            r17 = r7
        L_0x008f:
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r0.f63138u
            if (r2 == 0) goto L_0x009e
            java.lang.String r2 = r2.poiLongitude
            if (r2 == 0) goto L_0x009e
            double r9 = java.lang.Double.parseDouble(r2)
            r19 = r9
            goto L_0x00a0
        L_0x009e:
            r19 = r7
        L_0x00a0:
            java.lang.String r2 = r0.f63141x
            if (r2 == 0) goto L_0x00aa
            double r9 = java.lang.Double.parseDouble(r2)
            r13 = r9
            goto L_0x00ab
        L_0x00aa:
            r13 = r7
        L_0x00ab:
            java.lang.String r2 = r0.f63142y
            if (r2 == 0) goto L_0x00b3
            double r7 = java.lang.Double.parseDouble(r2)
        L_0x00b3:
            r15 = r7
            com.ss.android.ugc.aweme.poi.service.IPoiService r2 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
            r11 = r2
            com.ss.android.ugc.aweme.poi.service.IPoiService r11 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r11
            android.app.Activity r2 = r0.f63127A
            r12 = r2
            android.content.Context r12 = (android.content.Context) r12
            java.lang.String r2 = r11.getDistanceBetweenLocations(r12, r13, r15, r17, r19)
            goto L_0x00c9
        L_0x00c5:
            java.lang.String r2 = ""
            goto L_0x00c9
        L_0x00c8:
            r2 = r1
        L_0x00c9:
            r5 = r2
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L_0x0134
            if (r2 != 0) goto L_0x00d7
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00d7:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = r0.f63062h
            android.text.TextPaint r7 = r7.getPaint()
            float r7 = r7.measureText(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r0.f63058d
            android.text.TextPaint r8 = r8.getPaint()
            com.ss.android.ugc.aweme.poi.model.PoiStruct r9 = r0.f63138u
            if (r9 == 0) goto L_0x00ef
            java.lang.String r9 = r9.poiName
            if (r9 != 0) goto L_0x00f1
        L_0x00ef:
            java.lang.String r9 = ""
        L_0x00f1:
            float r8 = r8.measureText(r9)
            float r8 = r8 + r7
            float r9 = r0.f63132F
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x00fe
        L_0x00fc:
            r7 = 1
            goto L_0x0106
        L_0x00fe:
            r8 = 1127219200(0x43300000, float:176.0)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x0105
            goto L_0x00fc
        L_0x0105:
            r7 = 0
        L_0x0106:
            if (r7 == 0) goto L_0x011c
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r0.f63062h
            r2.setVisibility(r3)
            android.widget.ImageView r2 = r0.f63061g
            r2.setVisibility(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r0.f63062h
            r2.setText(r5)
            r21.m58106f()
            goto L_0x01c8
        L_0x011c:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = r0.f63062h
            r7.setVisibility(r4)
            android.widget.ImageView r7 = r0.f63061g
            r7.setVisibility(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = r0.f63063i
            r7.setVisibility(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = r0.f63063i
            r7.setText(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r0.f63135a
            goto L_0x01c3
        L_0x0134:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r0.f63062h
            r2.setVisibility(r4)
            android.widget.ImageView r2 = r0.f63061g
            r2.setVisibility(r4)
            com.ss.android.ugc.aweme.poi.service.IPoiService r2 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.poi.service.IPoiService r2 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r2
            com.ss.android.ugc.aweme.poi.model.PoiStruct r5 = r0.f63138u
            com.ss.android.ugc.aweme.poi.d r7 = r0.f63133G
            boolean r5 = r2.isSameCity(r5, r7)
            if (r5 == 0) goto L_0x0185
            com.ss.android.ugc.aweme.poi.model.PoiStruct r5 = r0.f63138u
            if (r5 == 0) goto L_0x0175
            com.ss.android.ugc.aweme.poi.model.PoiStruct r5 = r0.f63138u
            if (r5 == 0) goto L_0x0159
            java.lang.String r5 = r5.poiLatitude
            goto L_0x015a
        L_0x0159:
            r5 = r1
        L_0x015a:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0175
            com.ss.android.ugc.aweme.poi.model.PoiStruct r5 = r0.f63138u
            if (r5 == 0) goto L_0x0169
            java.lang.String r5 = r5.poiLongitude
            goto L_0x016a
        L_0x0169:
            r5 = r1
        L_0x016a:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x0173
            goto L_0x0175
        L_0x0173:
            r5 = 0
            goto L_0x0176
        L_0x0175:
            r5 = 1
        L_0x0176:
            if (r5 != 0) goto L_0x0185
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r0.f63135a
            android.app.Activity r7 = r0.f63127A
            android.content.Context r7 = (android.content.Context) r7
            com.ss.android.ugc.aweme.poi.model.PoiStruct r8 = r0.f63138u
            java.lang.String r2 = r2.getDistance(r7, r8)
            goto L_0x01c3
        L_0x0185:
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r0.f63138u
            if (r2 == 0) goto L_0x01ac
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r0.f63138u
            if (r2 == 0) goto L_0x0190
            com.ss.android.ugc.aweme.poi.model.b r2 = r2.address
            goto L_0x0191
        L_0x0190:
            r2 = r1
        L_0x0191:
            if (r2 == 0) goto L_0x01ac
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r0.f63138u
            if (r2 == 0) goto L_0x01a0
            com.ss.android.ugc.aweme.poi.model.b r2 = r2.address
            if (r2 == 0) goto L_0x01a0
            java.lang.String r2 = r2.getCity()
            goto L_0x01a1
        L_0x01a0:
            r2 = r1
        L_0x01a1:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x01aa
            goto L_0x01ac
        L_0x01aa:
            r2 = 0
            goto L_0x01ad
        L_0x01ac:
            r2 = 1
        L_0x01ad:
            if (r2 == 0) goto L_0x01b3
            r21.m58106f()
            goto L_0x01c8
        L_0x01b3:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r0.f63135a
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r0.f63138u
            if (r2 == 0) goto L_0x01c2
            com.ss.android.ugc.aweme.poi.model.b r2 = r2.address
            if (r2 == 0) goto L_0x01c2
            java.lang.String r2 = r2.getCity()
            goto L_0x01c3
        L_0x01c2:
            r2 = r1
        L_0x01c3:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r5.setText(r2)
        L_0x01c8:
            com.ss.android.ugc.aweme.poi.service.IPoiService r2 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.poi.service.IPoiService r2 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r2
            android.app.Activity r5 = r0.f63127A
            android.content.Context r5 = (android.content.Context) r5
            com.ss.android.ugc.aweme.poi.model.PoiStruct r7 = r0.f63138u
            java.lang.String r2 = r2.getDisplayCount(r5, r7)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r0.f63130D
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r5.setText(r2)
            com.ss.android.ugc.aweme.poi.service.IPoiService r2 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.poi.service.IPoiService r2 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r2
            com.ss.android.ugc.aweme.poi.d r5 = r0.f63133G
            com.ss.android.ugc.aweme.poi.model.PoiStruct r7 = r0.f63138u
            boolean r2 = r2.needHideLabel(r5, r7)
            if (r2 == 0) goto L_0x01fc
            android.widget.LinearLayout r2 = r0.f63131E
            r2.removeAllViews()
            android.widget.LinearLayout r2 = r0.f63131E
            r2.setVisibility(r4)
            r0.f63137s = r1
            goto L_0x0269
        L_0x01fc:
            android.widget.LinearLayout r2 = r0.f63131E
            r2.setVisibility(r3)
            android.widget.LinearLayout r2 = r0.f63131E
            r2.removeAllViews()
            com.ss.android.ugc.aweme.base.ui.HollowTextView$a r2 = new com.ss.android.ugc.aweme.base.ui.HollowTextView$a
            r2.<init>()
            android.app.Activity r5 = r0.f63127A
            android.content.Context r5 = (android.content.Context) r5
            r7 = 1093664768(0x41300000, float:11.0)
            float r5 = com.bytedance.common.utility.C9432q.m18687b(r5, r7)
            int r5 = (int) r5
            r2.f62958b = r5
            r5 = 2131821804(0x7f1104ec, float:1.9276362E38)
            int r5 = com.p683ss.android.ugc.aweme.base.utils.C23723j.m58216a(r5)
            r2.f62959c = r5
            android.app.Activity r5 = r0.f63127A
            android.content.Context r5 = (android.content.Context) r5
            r7 = 1073741824(0x40000000, float:2.0)
            float r5 = com.bytedance.common.utility.C9432q.m18687b(r5, r7)
            int r5 = (int) r5
            r2.f62960d = r5
            r2.f62963g = r6
            r2.f62962f = r6
            r2.f62964h = r6
            r2.f62961e = r6
            com.ss.android.ugc.aweme.base.ui.HollowTextView r5 = new com.ss.android.ugc.aweme.base.ui.HollowTextView
            android.app.Activity r8 = r0.f63127A
            android.content.Context r8 = (android.content.Context) r8
            r5.<init>(r8, r2)
            r0.f63137s = r5
            android.app.Activity r2 = r0.f63127A
            android.content.Context r2 = (android.content.Context) r2
            float r2 = com.bytedance.common.utility.C9432q.m18687b(r2, r7)
            int r2 = (int) r2
            com.ss.android.ugc.aweme.base.ui.HollowTextView r5 = r0.f63137s
            if (r5 == 0) goto L_0x0251
            r5.setPadding(r2, r2, r2, r2)
        L_0x0251:
            com.ss.android.ugc.aweme.base.ui.HollowTextView r2 = r0.f63137s
            if (r2 == 0) goto L_0x0260
            com.ss.android.ugc.aweme.poi.model.PoiStruct r5 = r0.f63138u
            if (r5 == 0) goto L_0x025d
            java.lang.String r1 = r5.getPoiSubTitle()
        L_0x025d:
            r2.setText(r1)
        L_0x0260:
            android.widget.LinearLayout r1 = r0.f63131E
            com.ss.android.ugc.aweme.base.ui.HollowTextView r2 = r0.f63137s
            android.view.View r2 = (android.view.View) r2
            r1.addView(r2)
        L_0x0269:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f63135a
            android.text.TextPaint r1 = r1.getPaint()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r0.f63135a
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0287
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r0.f63135a
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            float r2 = r1.measureText(r2)
            int r2 = (int) r2
            goto L_0x0288
        L_0x0287:
            r2 = 0
        L_0x0288:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r0.f63130D
            java.lang.CharSequence r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            float r5 = r1.measureText(r5)
            int r5 = (int) r5
            com.ss.android.ugc.aweme.base.ui.HollowTextView r7 = r0.f63137s
            if (r7 == 0) goto L_0x02ba
            java.lang.String r7 = r7.getText()
            r8 = r7
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x02ba
            float r1 = r1.measureText(r7)
            int r1 = (int) r1
            android.app.Activity r7 = r0.f63127A
            android.content.Context r7 = (android.content.Context) r7
            r8 = 1104150528(0x41d00000, float:26.0)
            float r7 = com.bytedance.common.utility.C9432q.m18687b(r7, r8)
            int r7 = (int) r7
            int r1 = r1 + r7
            goto L_0x02bb
        L_0x02ba:
            r1 = 0
        L_0x02bb:
            android.app.Activity r7 = r0.f63127A
            android.content.Context r7 = (android.content.Context) r7
            int r7 = com.bytedance.common.utility.C9432q.m18670a(r7)
            android.app.Activity r8 = r0.f63127A
            android.content.Context r8 = (android.content.Context) r8
            r9 = 1123811328(0x42fc0000, float:126.0)
            float r8 = com.bytedance.common.utility.C9432q.m18687b(r8, r9)
            int r8 = (int) r8
            int r7 = r7 - r8
            int r7 = r7 - r1
            int r1 = r7 - r2
            android.app.Activity r8 = r0.f63127A
            android.content.Context r8 = (android.content.Context) r8
            r9 = 1109393408(0x42200000, float:40.0)
            float r8 = com.bytedance.common.utility.C9432q.m18687b(r8, r9)
            int r8 = (int) r8
            int r1 = r1 - r8
            android.app.Activity r8 = r0.f63127A
            android.content.Context r8 = (android.content.Context) r8
            r9 = 1101004800(0x41a00000, float:20.0)
            float r8 = com.bytedance.common.utility.C9432q.m18687b(r8, r9)
            int r8 = (int) r8
            int r7 = r7 - r8
            if (r1 >= r5) goto L_0x02f7
            android.widget.ImageView r1 = r0.f63129C
            r1.setVisibility(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f63130D
            r1.setVisibility(r4)
            goto L_0x0301
        L_0x02f7:
            android.widget.ImageView r1 = r0.f63129C
            r1.setVisibility(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f63130D
            r1.setVisibility(r3)
        L_0x0301:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f63135a
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x031a
            if (r7 > r2) goto L_0x0315
            com.ss.android.ugc.aweme.base.ui.HollowTextView r1 = r0.f63137s
            if (r1 == 0) goto L_0x0315
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f63135a
            r1.setVisibility(r4)
            goto L_0x031a
        L_0x0315:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f63135a
            r1.setMaxWidth(r7)
        L_0x031a:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f63135a
            int r1 = r1.getVisibility()
            if (r1 == r4) goto L_0x0334
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f63135a
            java.lang.CharSequence r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0339
        L_0x0334:
            android.widget.ImageView r1 = r0.f63129C
            r1.setVisibility(r4)
        L_0x0339:
            com.ss.android.ugc.aweme.base.ui.HollowTextView r1 = r0.f63137s
            if (r1 == 0) goto L_0x0353
            android.view.ViewGroup r1 = r0.f63064j
            r2 = 4
            r1.setVisibility(r2)
            com.ss.android.ugc.aweme.newfollow.ui.FollowFeedTagGroup r1 = r0.f63136b
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            com.ss.android.ugc.aweme.base.ui.anchor.u$a r2 = new com.ss.android.ugc.aweme.base.ui.anchor.u$a
            r2.<init>(r0)
            android.view.ViewTreeObserver$OnGlobalLayoutListener r2 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r2
            r1.addOnGlobalLayoutListener(r2)
        L_0x0353:
            com.ss.android.ugc.aweme.poi.service.IPoiService r1 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.poi.service.IPoiService r1 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r1
            boolean r1 = r1.isPoiAreaFilterNotOnlineStyle()
            if (r1 == 0) goto L_0x0373
            com.ss.android.ugc.aweme.poi.model.PoiStruct r1 = r0.f63138u
            if (r1 == 0) goto L_0x0372
            boolean r1 = r1.isAdminArea
            if (r1 != r6) goto L_0x0373
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f63062h
            r1.setVisibility(r4)
            android.widget.ImageView r1 = r0.f63061g
            r1.setVisibility(r4)
            goto L_0x0373
        L_0x0372:
            return
        L_0x0373:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23678u.mo49076a(com.ss.android.ugc.aweme.feed.model.Aweme, org.json.JSONObject):void");
    }

    public C23678u(ViewGroup viewGroup, Activity activity, String str) {
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(activity, "activity");
        super(viewGroup);
        this.f63127A = activity;
        this.f63128B = str;
        View findViewById = viewGroup.findViewById(R.id.tg);
        C52711k.m112236a((Object) findViewById, "parent.findViewById(R.id.city_name_or_distance)");
        this.f63135a = (DmtTextView) findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.a6h);
        C52711k.m112236a((Object) findViewById2, "parent.findViewById(R.id.divider)");
        this.f63129C = (ImageView) findViewById2;
        View findViewById3 = viewGroup.findViewById(R.id.avf);
        C52711k.m112236a((Object) findViewById3, "parent.findViewById(R.id.item_count)");
        this.f63130D = (DmtTextView) findViewById3;
        View findViewById4 = viewGroup.findViewById(R.id.a1m);
        C52711k.m112236a((Object) findViewById4, "parent.findViewById(R.id.coupon_container)");
        this.f63131E = (LinearLayout) findViewById4;
        View findViewById5 = viewGroup.findViewById(R.id.c2q);
        C52711k.m112236a((Object) findViewById5, "parent.findViewById(R.id.poi_top_info_layout)");
        this.f63136b = (FollowFeedTagGroup) findViewById5;
    }
}
