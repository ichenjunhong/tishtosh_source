package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.os.Handler;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26371ae;
import com.p683ss.android.ugc.aweme.commercialize.views.C26722d;
import com.p683ss.android.ugc.aweme.commercialize.views.C26722d.C26723a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.poi.widget.BubbleLayout;
import com.p683ss.android.ugc.aweme.poi.widget.C39481c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44625e;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44626f;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2239g.C44629b;
import com.p683ss.android.ugc.aweme.sticker.C46063m;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b */
public final class C44650b extends C44643a {

    /* renamed from: n */
    public static final C44652a f112948n = new C44652a(null);

    /* renamed from: a */
    View f112949a;

    /* renamed from: b */
    final C44629b f112950b;

    /* renamed from: k */
    public Handler f112951k;

    /* renamed from: l */
    public Runnable f112952l;

    /* renamed from: m */
    final C44626f f112953m;

    /* renamed from: o */
    private final BusinessExtraData f112954o;

    /* renamed from: p */
    private final Aweme f112955p;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b$a */
    public static final class C44652a {
        private C44652a() {
        }

        public /* synthetic */ C44652a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo90484a() {
        return 2;
    }

    /* renamed from: e */
    public final void mo90575e() {
        super.mo90575e();
        Handler handler = this.f112951k;
        if (handler != null) {
            handler.post(this.f112952l);
        }
    }

    /* renamed from: f */
    public final void mo90576f() {
        super.mo90576f();
        Handler handler = this.f112951k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90489b() {
        /*
            r6 = this;
            java.lang.String r0 = "function_prop_click"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r3 = r6.f112954o
            r4 = 0
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = r3.getStickerId()
            goto L_0x0013
        L_0x0012:
            r3 = r4
        L_0x0013:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.sticker.m r3 = r6.f112939j
            if (r3 == 0) goto L_0x0024
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0024
            java.lang.String r3 = r3.f116212b
            goto L_0x0025
        L_0x0024:
            r3 = r4
        L_0x0025:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.sticker.m r3 = r6.f112939j
            if (r3 == 0) goto L_0x0036
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0036
            java.lang.String r3 = r3.f116215e
            goto L_0x0037
        L_0x0036:
            r3 = r4
        L_0x0037:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.sticker.m r3 = r6.f112939j
            if (r3 == 0) goto L_0x0048
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0048
            java.lang.String r3 = r3.f116213c
            goto L_0x0049
        L_0x0048:
            r3 = r4
        L_0x0049:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.sticker.m r3 = r6.f112939j
            if (r3 == 0) goto L_0x005a
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x005a
            java.lang.String r3 = r3.f116214d
            goto L_0x005b
        L_0x005a:
            r3 = r4
        L_0x005b:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "enter_method"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r3 = r6.f112954o
            if (r3 == 0) goto L_0x006a
            java.lang.String r3 = r3.getSchemaUrlWebFirst()
            goto L_0x006b
        L_0x006a:
            r3 = r4
        L_0x006b:
            java.lang.String r3 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c.m97538a(r3)
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "url"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r3 = r6.f112954o
            if (r3 == 0) goto L_0x007e
            java.lang.String r3 = r3.getSchemaUrlWebFirst()
            goto L_0x007f
        L_0x007e:
            r3 = r4
        L_0x007f:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f112955p
            if (r0 == 0) goto L_0x00b4
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f112955p
            boolean r0 = r0.isAd()
            if (r0 == 0) goto L_0x00b4
            android.content.Context r0 = r6.f112937h
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.f112955p
            java.lang.String r2 = "otherclick"
            java.lang.String r3 = "raw ad prop otherclick"
            java.lang.String r5 = "sticker"
            org.json.JSONObject r3 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63345e(r0, r1, r3, r5)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63322b(r0, r2, r1, r3)
            java.lang.String r0 = "function_prop_click"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r1 = r6.f112954o
            if (r1 == 0) goto L_0x00b0
            java.lang.String r1 = r1.getStickerId()
            goto L_0x00b1
        L_0x00b0:
            r1 = r4
        L_0x00b1:
            com.p683ss.android.ugc.aweme.crossplatform.business.p1614a.C27170a.m65584a(r0, r1, r4)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44650b.mo90489b():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo90490c() {
        String str;
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f112937h);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        CircleImageView circleImageView = new CircleImageView(this.f112937h);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) C9432q.m18687b(this.f112937h, 32.0f), (int) C9432q.m18687b(this.f112937h, 32.0f));
        layoutParams2.setMargins(0, 0, (int) C9432q.m18687b(this.f112937h, 8.0f), 0);
        circleImageView.setLayoutParams(layoutParams2);
        ((C13833a) circleImageView.getHierarchy()).mo25902b((int) R.drawable.b0h);
        ((C13833a) circleImageView.getHierarchy()).mo25907c((int) R.drawable.b0h);
        RemoteImageView remoteImageView = circleImageView;
        BusinessExtraData businessExtraData = this.f112954o;
        String str2 = null;
        if (businessExtraData != null) {
            str = businessExtraData.getPopIcon();
        } else {
            str = null;
        }
        C23515d.m57677a(remoteImageView, str);
        DmtTextView dmtTextView = new DmtTextView(this.f112937h);
        dmtTextView.setTextColor(this.f112937h.getResources().getColor(R.color.aso));
        dmtTextView.setTextSize(13.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.topMargin = (int) C9432q.m18687b(this.f112937h, 1.0f);
        dmtTextView.setLayoutParams(layoutParams3);
        dmtTextView.setMaxLines(1);
        dmtTextView.setGravity(16);
        BusinessExtraData businessExtraData2 = this.f112954o;
        if (businessExtraData2 != null) {
            str2 = businessExtraData2.getPopText();
        }
        dmtTextView.setText(str2);
        TextPaint paint = dmtTextView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        dmtTextView.setEllipsize(TruncateAt.END);
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.f112937h);
        autoRTLImageView.setImageResource(R.drawable.b6i);
        linearLayout.addView(circleImageView);
        linearLayout.addView(dmtTextView);
        linearLayout.addView(autoRTLImageView);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0171  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90491d() {
        /*
            r12 = this;
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r0 = r12.f112954o
            r1 = 0
            if (r0 == 0) goto L_0x000a
            java.lang.String r0 = r0.getStickerId()
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26371ae.m63818a(r0)
            r2 = 0
            if (r0 == 0) goto L_0x01ac
            com.ss.android.ugc.aweme.commercialize.utils.ae r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26371ae.f69581e
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r0 = r12.f112954o
            com.ss.android.ugc.aweme.sticker.m r3 = r12.f112939j
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r12.f112955p
            android.content.Context r5 = r12.f112937h
            if (r5 != 0) goto L_0x001f
            return
        L_0x001f:
            if (r0 == 0) goto L_0x0026
            java.lang.String r6 = r0.getStickerId()
            goto L_0x0027
        L_0x0026:
            r6 = r1
        L_0x0027:
            if (r6 != 0) goto L_0x002a
            return
        L_0x002a:
            java.lang.String r7 = com.p683ss.android.ugc.aweme.commercialize.utils.C26371ae.m63817a()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x00aa
            java.util.List<java.lang.String> r7 = com.p683ss.android.ugc.aweme.commercialize.utils.C26371ae.f69577a
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r7 = p2628d.p2629a.C52575l.m112125a(r7, r6)
            r8 = 108511772(0x677c21c, float:4.6598146E-35)
            r9 = 3317767(0x32a007, float:4.649182E-39)
            if (r7 == 0) goto L_0x0069
            java.lang.String r6 = com.p683ss.android.ugc.aweme.commercialize.utils.C26371ae.f69579c
            int r7 = r6.hashCode()
            if (r7 == r9) goto L_0x005c
            if (r7 == r8) goto L_0x0051
            goto L_0x0067
        L_0x0051:
            java.lang.String r7 = "right"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0067
            java.lang.String r6 = "south"
            goto L_0x0093
        L_0x005c:
            java.lang.String r7 = "left"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0067
            java.lang.String r6 = "north"
            goto L_0x0093
        L_0x0067:
            r6 = r1
            goto L_0x0093
        L_0x0069:
            java.util.List<java.lang.String> r7 = com.p683ss.android.ugc.aweme.commercialize.utils.C26371ae.f69578b
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r6 = p2628d.p2629a.C52575l.m112125a(r7, r6)
            if (r6 == 0) goto L_0x0067
            java.lang.String r6 = com.p683ss.android.ugc.aweme.commercialize.utils.C26371ae.f69579c
            int r7 = r6.hashCode()
            if (r7 == r9) goto L_0x0089
            if (r7 == r8) goto L_0x007e
            goto L_0x0067
        L_0x007e:
            java.lang.String r7 = "right"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0067
            java.lang.String r6 = "north"
            goto L_0x0093
        L_0x0089:
            java.lang.String r7 = "left"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0067
            java.lang.String r6 = "south"
        L_0x0093:
            com.p683ss.android.ugc.aweme.commercialize.utils.C26371ae.f69580d = r6
            com.ss.android.ugc.aweme.app.SharePrefCache r7 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r8 = "SharePrefCache.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            com.ss.android.ugc.aweme.app.bf r7 = r7.getAdSouthNorthFirstSupportTeam()
            java.lang.String r8 = "SharePrefCache.inst().adSouthNorthFirstSupportTeam"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            r7.mo47776a(r6)
        L_0x00aa:
            java.lang.String r6 = r0.getInteractionUrl()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r7 = 1
            if (r6 != 0) goto L_0x0104
            com.ss.android.ugc.aweme.commercialize.views.d$a r6 = com.p683ss.android.ugc.aweme.commercialize.views.C26722d.f70404e
            java.lang.String r6 = com.p683ss.android.ugc.aweme.commercialize.utils.C26371ae.m63817a()
            java.lang.String r8 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r8)
            android.support.v4.app.k r8 = com.p683ss.android.ugc.aweme.commercialize.views.C26722d.C26723a.m64621a(r5)
            r9 = 2132017320(0x7f1400a8, float:1.9672915E38)
            android.support.v4.app.Fragment r9 = r8.mo2222a(r9)
            if (r9 != 0) goto L_0x00d1
        L_0x00cf:
            r6 = 0
            goto L_0x00f7
        L_0x00d1:
            boolean r10 = r9 instanceof com.p683ss.android.ugc.aweme.commercialize.views.C26722d
            if (r10 == 0) goto L_0x00dd
            r10 = r9
            com.ss.android.ugc.aweme.commercialize.views.d r10 = (com.p683ss.android.ugc.aweme.commercialize.views.C26722d) r10
            boolean r10 = r10.f70408d
            if (r10 != 0) goto L_0x00dd
            goto L_0x00cf
        L_0x00dd:
            android.os.Bundle r10 = r9.getArguments()
            if (r10 == 0) goto L_0x00e8
            java.lang.String r11 = "support_team"
            r10.putString(r11, r6)
        L_0x00e8:
            r9.setUserVisibleHint(r7)
            android.support.v4.app.r r6 = r8.mo2225a()
            android.support.v4.app.r r6 = r6.mo2196c(r9)
            r6.mo2195c()
            r6 = 1
        L_0x00f7:
            if (r6 != 0) goto L_0x0104
            com.ss.android.ugc.aweme.router.w r6 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            java.lang.String r8 = r0.getInteractionUrl()
            r6.mo83861a(r8)
        L_0x0104:
            java.lang.String r6 = com.p683ss.android.ugc.aweme.commercialize.utils.C26371ae.m63817a()
            if (r6 != 0) goto L_0x010b
            goto L_0x012d
        L_0x010b:
            int r8 = r6.hashCode()
            r9 = 105007365(0x6424905, float:3.654099E-35)
            if (r8 == r9) goto L_0x0124
            r7 = 109627853(0x688c9cd, float:5.1454034E-35)
            if (r8 == r7) goto L_0x011a
            goto L_0x012d
        L_0x011a:
            java.lang.String r7 = "south"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x012d
            r2 = 2
            goto L_0x012d
        L_0x0124:
            java.lang.String r8 = "north"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x012d
            r2 = 1
        L_0x012d:
            java.lang.String r6 = "function_prop_label_click"
            com.ss.android.ugc.aweme.app.f.d r7 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r8 = "prop_id"
            java.lang.String r9 = r0.getStickerId()
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r8, r9)
            java.lang.String r8 = "enter_from"
            if (r3 == 0) goto L_0x0148
            com.ss.android.ugc.aweme.sticker.l r9 = r3.f116231p
            if (r9 == 0) goto L_0x0148
            java.lang.String r9 = r9.f116212b
            goto L_0x0149
        L_0x0148:
            r9 = r1
        L_0x0149:
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r8, r9)
            java.lang.String r8 = "log_pb"
            if (r3 == 0) goto L_0x0158
            com.ss.android.ugc.aweme.sticker.l r9 = r3.f116231p
            if (r9 == 0) goto L_0x0158
            java.lang.String r9 = r9.f116215e
            goto L_0x0159
        L_0x0158:
            r9 = r1
        L_0x0159:
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r8, r9)
            java.lang.String r8 = "author_id"
            if (r3 == 0) goto L_0x0168
            com.ss.android.ugc.aweme.sticker.l r9 = r3.f116231p
            if (r9 == 0) goto L_0x0168
            java.lang.String r9 = r9.f116213c
            goto L_0x0169
        L_0x0168:
            r9 = r1
        L_0x0169:
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r8, r9)
            java.lang.String r8 = "group_id"
            if (r3 == 0) goto L_0x0177
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0177
            java.lang.String r1 = r3.f116214d
        L_0x0177:
            com.ss.android.ugc.aweme.app.f.d r1 = r7.mo47829a(r8, r1)
            java.lang.String r3 = "enter_method"
            java.lang.String r7 = r0.getInteractionUrl()
            java.lang.String r7 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c.m97538a(r7)
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r3, r7)
            java.lang.String r3 = "url"
            java.lang.String r0 = r0.getInteractionUrl()
            com.ss.android.ugc.aweme.app.f.d r0 = r1.mo47829a(r3, r0)
            java.lang.String r1 = "support_team"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r6, r0)
            if (r4 == 0) goto L_0x01ab
            boolean r0 = r4.isAd()
            if (r0 == 0) goto L_0x01ab
            java.lang.String r0 = "sticker"
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63340d(r5, r4, r0)
        L_0x01ab:
            return
        L_0x01ac:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r0 = r12.f112954o
            if (r0 == 0) goto L_0x01b5
            java.lang.String r0 = r0.getSchemaUrlOpenFirst()
            goto L_0x01b6
        L_0x01b5:
            r0 = r1
        L_0x01b6:
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0280
            com.ss.android.ugc.aweme.miniapp_api.services.a r3 = com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a.m83185b()
            java.lang.String r4 = "MiniAppServiceProxy.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r3 = r3.mo76294a()
            boolean r4 = com.p683ss.android.ugc.aweme.miniapp_api.C36949e.m83168d(r0)
            if (r4 == 0) goto L_0x01f2
            com.ss.android.ugc.aweme.miniapp_api.model.b.b$a r2 = new com.ss.android.ugc.aweme.miniapp_api.model.b.b$a
            r2.<init>()
            com.ss.android.ugc.aweme.sticker.m r4 = r12.f112939j
            if (r4 == 0) goto L_0x01e2
            com.ss.android.ugc.aweme.sticker.l r4 = r4.f116231p
            if (r4 == 0) goto L_0x01e2
            java.lang.String r4 = r4.f116212b
            goto L_0x01e3
        L_0x01e2:
            r4 = r1
        L_0x01e3:
            com.ss.android.ugc.aweme.miniapp_api.model.b.b$a r2 = r2.mo76222b(r4)
            com.ss.android.ugc.aweme.miniapp_api.model.b.b r2 = r2.mo76221a()
            android.content.Context r4 = r12.f112937h
            r3.openMiniApp(r4, r0, r2)
            goto L_0x0280
        L_0x01f2:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r3 = r12.f112954o
            if (r3 == 0) goto L_0x01fb
            java.lang.String r3 = r3.getClickableOpenUrl()
            goto L_0x01fc
        L_0x01fb:
            r3 = r1
        L_0x01fc:
            boolean r3 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b.m60182a(r3)
            if (r3 == 0) goto L_0x0212
            android.content.Context r3 = r12.f112937h
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r4 = r12.f112954o
            if (r4 == 0) goto L_0x020d
            java.lang.String r4 = r4.getClickableOpenUrl()
            goto L_0x020e
        L_0x020d:
            r4 = r1
        L_0x020e:
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64226a(r3, r4, r2)
        L_0x0212:
            if (r2 != 0) goto L_0x025f
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r2 = r12.f112954o
            if (r2 == 0) goto L_0x021d
            java.lang.String r2 = r2.getClickableWebUrl()
            goto L_0x021e
        L_0x021d:
            r2 = r1
        L_0x021e:
            boolean r2 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b.m60182a(r2)
            if (r2 == 0) goto L_0x025f
            android.content.Context r0 = r12.f112937h
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r2 = r12.f112954o
            if (r2 == 0) goto L_0x022f
            java.lang.String r2 = r2.getClickableWebUrl()
            goto L_0x0230
        L_0x022f:
            r2 = r1
        L_0x0230:
            java.lang.String r3 = "commerce_sticker_view"
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0251
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.net.Uri$Builder r2 = r2.buildUpon()
            java.lang.String r4 = "commerce_enter_from"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r4, r3)
            android.net.Uri r2 = r2.build()
            java.lang.String r2 = r2.toString()
        L_0x0251:
            com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64222a(r0, r2, r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r0 = r12.f112954o
            if (r0 == 0) goto L_0x025d
            java.lang.String r0 = r0.getClickableWebUrl()
            goto L_0x0280
        L_0x025d:
            r0 = r1
            goto L_0x0280
        L_0x025f:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r2 = r12.f112954o
            if (r2 == 0) goto L_0x0268
            java.lang.String r2 = r2.getInteractionUrl()
            goto L_0x0269
        L_0x0268:
            r2 = r1
        L_0x0269:
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0280
            com.ss.android.ugc.aweme.router.w r2 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r3 = r12.f112954o
            if (r3 == 0) goto L_0x027c
            java.lang.String r3 = r3.getInteractionUrl()
            goto L_0x027d
        L_0x027c:
            r3 = r1
        L_0x027d:
            r2.mo83861a(r3)
        L_0x0280:
            java.lang.String r2 = "function_prop_label_click"
            com.ss.android.ugc.aweme.app.f.d r3 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r4 = "prop_id"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r5 = r12.f112954o
            if (r5 == 0) goto L_0x0291
            java.lang.String r5 = r5.getStickerId()
            goto L_0x0292
        L_0x0291:
            r5 = r1
        L_0x0292:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "enter_from"
            com.ss.android.ugc.aweme.sticker.m r5 = r12.f112939j
            if (r5 == 0) goto L_0x02a3
            com.ss.android.ugc.aweme.sticker.l r5 = r5.f116231p
            if (r5 == 0) goto L_0x02a3
            java.lang.String r5 = r5.f116212b
            goto L_0x02a4
        L_0x02a3:
            r5 = r1
        L_0x02a4:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "log_pb"
            com.ss.android.ugc.aweme.sticker.m r5 = r12.f112939j
            if (r5 == 0) goto L_0x02b5
            com.ss.android.ugc.aweme.sticker.l r5 = r5.f116231p
            if (r5 == 0) goto L_0x02b5
            java.lang.String r5 = r5.f116215e
            goto L_0x02b6
        L_0x02b5:
            r5 = r1
        L_0x02b6:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "author_id"
            com.ss.android.ugc.aweme.sticker.m r5 = r12.f112939j
            if (r5 == 0) goto L_0x02c7
            com.ss.android.ugc.aweme.sticker.l r5 = r5.f116231p
            if (r5 == 0) goto L_0x02c7
            java.lang.String r5 = r5.f116213c
            goto L_0x02c8
        L_0x02c7:
            r5 = r1
        L_0x02c8:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "group_id"
            com.ss.android.ugc.aweme.sticker.m r5 = r12.f112939j
            if (r5 == 0) goto L_0x02d9
            com.ss.android.ugc.aweme.sticker.l r5 = r5.f116231p
            if (r5 == 0) goto L_0x02d9
            java.lang.String r5 = r5.f116214d
            goto L_0x02da
        L_0x02d9:
            r5 = r1
        L_0x02da:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "enter_method"
            java.lang.String r5 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c.m97538a(r0)
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "url"
            com.ss.android.ugc.aweme.app.f.d r0 = r3.mo47829a(r4, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r2, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r12.f112955p
            if (r0 == 0) goto L_0x0317
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r12.f112955p
            boolean r0 = r0.isAd()
            if (r0 == 0) goto L_0x0317
            android.content.Context r0 = r12.f112937h
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r12.f112955p
            java.lang.String r3 = "sticker"
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63340d(r0, r2, r3)
            java.lang.String r0 = "function_prop_label_click"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r2 = r12.f112954o
            if (r2 == 0) goto L_0x0313
            java.lang.String r2 = r2.getStickerId()
            goto L_0x0314
        L_0x0313:
            r2 = r1
        L_0x0314:
            com.p683ss.android.ugc.aweme.crossplatform.business.p1614a.C27170a.m65584a(r0, r2, r1)
        L_0x0317:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44650b.mo90491d():void");
    }

    /* renamed from: a */
    public final void mo90486a(C46063m mVar) {
        C52711k.m112240b(mVar, "interactStickerParams");
        super.mo90486a(mVar);
        this.f112950b.mo90486a(mVar);
    }

    /* renamed from: a */
    public final void mo90607a(C39481c cVar) {
        C52711k.m112240b(cVar, "popWindow");
        int b = (int) C9432q.m18687b(this.f112937h, 57.9f);
        cVar.f100990e = b;
        cVar.setHeight(b);
        BubbleLayout.f100911h = b;
    }

    /* renamed from: a */
    public final View mo90485a(int i) {
        if (C44588c.m97541a(this.f112937h)) {
            if (this.f112949a == null) {
                this.f112949a = new C44653c(this.f112937h);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                View view = this.f112949a;
                if (view != null) {
                    view.setLayoutParams(layoutParams);
                }
            }
            return this.f112949a;
        }
        if (this.f112949a == null) {
            this.f112949a = new FrameLayout(this.f112937h);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            View view2 = this.f112949a;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams2);
            }
        }
        return this.f112949a;
    }

    /* renamed from: b */
    public final void mo90573b(int i) {
        super.mo90573b(i);
        Handler handler = this.f112951k;
        String str = null;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        C26371ae aeVar = C26371ae.f69581e;
        Context context = this.f112937h;
        BusinessExtraData businessExtraData = this.f112954o;
        C52711k.m112240b(context, "context");
        if (businessExtraData != null) {
            str = businessExtraData.getStickerId();
        }
        if (C26371ae.m63818a(str)) {
            C26723a aVar = C26722d.f70404e;
            C52711k.m112240b(context, "context");
            C0654k a = C26723a.m64621a(context);
            Fragment a2 = a.mo2222a((int) R.id.cp);
            if (a2 != null) {
                a2.setUserVisibleHint(false);
                a.mo2225a().mo2177a(a2).mo2195c();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo90487a(long j, int i, float f, float f2) {
        return this.f112950b.mo90487a(j, i, f, f2);
    }

    /* renamed from: a */
    public final boolean mo90488a(long j, int i, float f, float f2, C44625e eVar) {
        C52711k.m112240b(eVar, "poiPopListener");
        return this.f112950b.mo90488a(j, i, f, f2, eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C44650b(int r8, android.content.Context r9, android.view.View r10, com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct r11, com.p683ss.android.ugc.aweme.sticker.C46063m r12, com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44626f r13, com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r14, com.p683ss.android.ugc.aweme.feed.model.Aweme r15) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            java.lang.String r0 = "contentView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            java.lang.String r0 = "stickerStruct"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
            r7.<init>(r8, r9, r10, r11, r12)
            r7.f112953m = r13
            r7.f112954o = r14
            r7.f112955p = r15
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.b r8 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.b
            r3 = r7
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a r3 = (com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44643a) r3
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r6 = r7.f112954o
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f112950b = r8
            boolean r8 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c.m97541a(r9)
            if (r8 == 0) goto L_0x0047
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b$1 r8 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b$1
            r8.<init>(r7)
            java.lang.Runnable r8 = (java.lang.Runnable) r8
            r7.f112952l = r8
            android.os.Handler r8 = new android.os.Handler
            r8.<init>()
            r7.f112951k = r8
            android.os.Handler r8 = r7.f112951k
            if (r8 == 0) goto L_0x0047
            java.lang.Runnable r10 = r7.f112952l
            r8.post(r10)
        L_0x0047:
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f112955p
            if (r8 == 0) goto L_0x0062
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f112955p
            boolean r8 = r8.isAd()
            if (r8 == 0) goto L_0x0062
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f112955p
            java.lang.String r10 = "othershow"
            java.lang.String r11 = "raw ad othershow"
            java.lang.String r13 = "sticker"
            org.json.JSONObject r11 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63345e(r9, r8, r11, r13)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63322b(r9, r10, r8, r11)
        L_0x0062:
            java.lang.String r8 = "function_prop_show"
            com.ss.android.ugc.aweme.app.f.d r10 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r11 = "prop_id"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r13 = r7.f112954o
            r14 = 0
            if (r13 == 0) goto L_0x0074
            java.lang.String r13 = r13.getStickerId()
            goto L_0x0075
        L_0x0074:
            r13 = r14
        L_0x0075:
            com.ss.android.ugc.aweme.app.f.d r10 = r10.mo47829a(r11, r13)
            java.lang.String r11 = "enter_from"
            if (r12 == 0) goto L_0x0084
            com.ss.android.ugc.aweme.sticker.l r13 = r12.f116231p
            if (r13 == 0) goto L_0x0084
            java.lang.String r13 = r13.f116212b
            goto L_0x0085
        L_0x0084:
            r13 = r14
        L_0x0085:
            com.ss.android.ugc.aweme.app.f.d r10 = r10.mo47829a(r11, r13)
            java.lang.String r11 = "log_pb"
            if (r12 == 0) goto L_0x0094
            com.ss.android.ugc.aweme.sticker.l r13 = r12.f116231p
            if (r13 == 0) goto L_0x0094
            java.lang.String r13 = r13.f116215e
            goto L_0x0095
        L_0x0094:
            r13 = r14
        L_0x0095:
            com.ss.android.ugc.aweme.app.f.d r10 = r10.mo47829a(r11, r13)
            java.lang.String r11 = "author_id"
            if (r12 == 0) goto L_0x00a4
            com.ss.android.ugc.aweme.sticker.l r13 = r12.f116231p
            if (r13 == 0) goto L_0x00a4
            java.lang.String r13 = r13.f116213c
            goto L_0x00a5
        L_0x00a4:
            r13 = r14
        L_0x00a5:
            com.ss.android.ugc.aweme.app.f.d r10 = r10.mo47829a(r11, r13)
            java.lang.String r11 = "group_id"
            if (r12 == 0) goto L_0x00b4
            com.ss.android.ugc.aweme.sticker.l r12 = r12.f116231p
            if (r12 == 0) goto L_0x00b4
            java.lang.String r12 = r12.f116214d
            goto L_0x00b5
        L_0x00b4:
            r12 = r14
        L_0x00b5:
            com.ss.android.ugc.aweme.app.f.d r10 = r10.mo47829a(r11, r12)
            java.lang.String r11 = "enter_method"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r12 = r7.f112954o
            if (r12 == 0) goto L_0x00c4
            java.lang.String r12 = r12.getSchemaUrlWebFirst()
            goto L_0x00c5
        L_0x00c4:
            r12 = r14
        L_0x00c5:
            java.lang.String r12 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c.m97538a(r12)
            com.ss.android.ugc.aweme.app.f.d r10 = r10.mo47829a(r11, r12)
            java.lang.String r11 = "url"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r12 = r7.f112954o
            if (r12 == 0) goto L_0x00d8
            java.lang.String r12 = r12.getSchemaUrlWebFirst()
            goto L_0x00d9
        L_0x00d8:
            r12 = r14
        L_0x00d9:
            com.ss.android.ugc.aweme.app.f.d r10 = r10.mo47829a(r11, r12)
            java.util.Map<java.lang.String, java.lang.String> r10 = r10.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r8, r10)
            com.ss.android.ugc.aweme.commercialize.utils.ae r8 = com.p683ss.android.ugc.aweme.commercialize.utils.C26371ae.f69581e
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r8 = r7.f112954o
            java.lang.String r10 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r10)
            if (r8 == 0) goto L_0x00f1
            java.lang.String r14 = r8.getStickerId()
        L_0x00f1:
            if (r14 != 0) goto L_0x00f4
            return
        L_0x00f4:
            java.lang.String r8 = r8.getInteractionUrl()
            if (r8 != 0) goto L_0x00fb
            return
        L_0x00fb:
            android.net.Uri r10 = android.net.Uri.parse(r8)
            java.lang.String r11 = "awe_region"
            java.lang.String r10 = r10.getQueryParameter(r11)
            if (r10 != 0) goto L_0x0108
            goto L_0x0132
        L_0x0108:
            int r11 = r10.hashCode()
            r12 = 105007365(0x6424905, float:3.654099E-35)
            if (r11 == r12) goto L_0x0125
            r12 = 109627853(0x688c9cd, float:5.1454034E-35)
            if (r11 == r12) goto L_0x0117
            goto L_0x0132
        L_0x0117:
            java.lang.String r11 = "south"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0132
            java.util.List<java.lang.String> r10 = com.p683ss.android.ugc.aweme.commercialize.utils.C26371ae.f69578b
            r10.add(r14)
            goto L_0x0132
        L_0x0125:
            java.lang.String r11 = "north"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0132
            java.util.List<java.lang.String> r10 = com.p683ss.android.ugc.aweme.commercialize.utils.C26371ae.f69577a
            r10.add(r14)
        L_0x0132:
            boolean r10 = com.p683ss.android.ugc.aweme.commercialize.utils.C26371ae.m63818a(r14)
            if (r10 == 0) goto L_0x01bf
            com.ss.android.ugc.aweme.commercialize.views.d$a r10 = com.p683ss.android.ugc.aweme.commercialize.views.C26722d.f70404e
            java.lang.String r10 = "url"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r10)
            java.lang.String r10 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r10)
            boolean r10 = android.text.TextUtils.isEmpty(r8)
            if (r10 != 0) goto L_0x015c
            java.lang.String r10 = "aweme://webview/"
            boolean r10 = r8.startsWith(r10)
            if (r10 != 0) goto L_0x015a
            java.lang.String r10 = "aweme://ame/webview/"
            boolean r10 = r8.startsWith(r10)
            if (r10 == 0) goto L_0x015c
        L_0x015a:
            r10 = 1
            goto L_0x015d
        L_0x015c:
            r10 = 0
        L_0x015d:
            if (r10 == 0) goto L_0x016d
            android.net.Uri r8 = android.net.Uri.parse(r8)
            java.lang.String r10 = "url"
            java.lang.String r8 = r8.getQueryParameter(r10)
            if (r8 != 0) goto L_0x016d
            java.lang.String r8 = ""
        L_0x016d:
            r10 = r8
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x01bf
            android.net.Uri r8 = android.net.Uri.parse(r8)
            android.net.Uri$Builder r8 = r8.buildUpon()
            java.lang.String r10 = "isNew"
            java.lang.String r11 = "1"
            android.net.Uri$Builder r8 = r8.appendQueryParameter(r10, r11)
            android.net.Uri r8 = r8.build()
            java.lang.String r8 = r8.toString()
            java.lang.String r10 = "Uri.parse(url)\n         …              .toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r10)
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            java.lang.String r11 = "url"
            r10.putString(r11, r8)
            com.ss.android.ugc.aweme.commercialize.views.d r8 = new com.ss.android.ugc.aweme.commercialize.views.d
            r8.<init>()
            r8.setArguments(r10)
            android.support.v4.app.k r9 = com.p683ss.android.ugc.aweme.commercialize.views.C26722d.C26723a.m64621a(r9)
            android.support.v4.app.r r9 = r9.mo2225a()
            r10 = 2132017320(0x7f1400a8, float:1.9672915E38)
            android.support.v4.app.Fragment r8 = (android.support.p030v4.app.Fragment) r8
            java.lang.String r11 = "AdSouthNorthSticker"
            android.support.v4.app.r r9 = r9.mo2176a(r10, r8, r11)
            android.support.v4.app.r r8 = r9.mo2193b(r8)
            r8.mo2195c()
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44650b.<init>(int, android.content.Context, android.view.View, com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct, com.ss.android.ugc.aweme.sticker.m, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.f, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
