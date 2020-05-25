package com.p683ss.android.ugc.aweme.shortvideo.sticker.p2228c;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44625e;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44626f;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44643a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44661g;
import com.p683ss.android.ugc.aweme.sticker.C46063m;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c.a */
public final class C44546a extends C44643a {

    /* renamed from: a */
    private View f112715a;

    /* renamed from: b */
    private final C44547b f112716b;

    /* renamed from: k */
    private final C44626f f112717k;

    /* renamed from: a */
    public final int mo90484a() {
        return 4;
    }

    /* renamed from: c */
    public final View mo90490c() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f112937h);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        DmtTextView dmtTextView = new DmtTextView(this.f112937h);
        dmtTextView.setTextColor(this.f112937h.getResources().getColor(R.color.aso));
        dmtTextView.setTextSize(13.0f);
        dmtTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        dmtTextView.setMaxLines(1);
        dmtTextView.setGravity(16);
        dmtTextView.setText(this.f112937h.getString(R.string.fw6));
        TextPaint paint = dmtTextView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.f112937h);
        autoRTLImageView.setImageResource(R.drawable.b6i);
        linearLayout.addView(dmtTextView);
        linearLayout.addView(autoRTLImageView);
        return linearLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        if (r3 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006b, code lost:
        if (r3 == null) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90489b() {
        /*
            r5 = this;
            java.lang.String r0 = "sticker_click"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f112939j
            r4 = 0
            if (r3 == 0) goto L_0x0014
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0014
            java.lang.String r3 = r3.f116214d
            goto L_0x0015
        L_0x0014:
            r3 = r4
        L_0x0015:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f112939j
            if (r3 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0026
            java.lang.String r3 = r3.f116213c
            goto L_0x0027
        L_0x0026:
            r3 = r4
        L_0x0027:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f112939j
            if (r3 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0038
            java.lang.String r3 = r3.f116215e
            goto L_0x0039
        L_0x0038:
            r3 = r4
        L_0x0039:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f112939j
            if (r3 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0049
            java.lang.String r4 = r3.f116212b
        L_0x0049:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r4)
            java.lang.String r2 = "reply_comment_id"
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f112939j
            if (r3 == 0) goto L_0x005d
            com.ss.android.ugc.aweme.feed.model.VideoReplyStruct r3 = r3.f116232q
            if (r3 == 0) goto L_0x005d
            java.lang.String r3 = r3.getCommentId()
            if (r3 != 0) goto L_0x005f
        L_0x005d:
            java.lang.String r3 = ""
        L_0x005f:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "reply_user_id"
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f112939j
            if (r3 == 0) goto L_0x006d
            java.lang.String r3 = r3.f116233r
            if (r3 != 0) goto L_0x006f
        L_0x006d:
            java.lang.String r3 = ""
        L_0x006f:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "sticker_type"
            java.lang.String r3 = "comment_reply"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.p2228c.C44546a.mo90489b():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        if (r3 == null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006d, code lost:
        if (r3 == null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f7, code lost:
        if (r5 == null) goto L_0x00f9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90491d() {
        /*
            r8 = this;
            java.lang.String r0 = "sticker_toast_click"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.sticker.m r3 = r8.f112939j
            r4 = 0
            if (r3 == 0) goto L_0x0014
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0014
            java.lang.String r3 = r3.f116214d
            goto L_0x0015
        L_0x0014:
            r3 = r4
        L_0x0015:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.sticker.m r3 = r8.f112939j
            if (r3 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0026
            java.lang.String r3 = r3.f116213c
            goto L_0x0027
        L_0x0026:
            r3 = r4
        L_0x0027:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.sticker.m r3 = r8.f112939j
            if (r3 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0038
            java.lang.String r3 = r3.f116215e
            goto L_0x0039
        L_0x0038:
            r3 = r4
        L_0x0039:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.sticker.m r3 = r8.f112939j
            if (r3 == 0) goto L_0x004a
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x004a
            java.lang.String r3 = r3.f116212b
            goto L_0x004b
        L_0x004a:
            r3 = r4
        L_0x004b:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "reply_comment_id"
            com.ss.android.ugc.aweme.sticker.m r3 = r8.f112939j
            if (r3 == 0) goto L_0x005f
            com.ss.android.ugc.aweme.feed.model.VideoReplyStruct r3 = r3.f116232q
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = r3.getCommentId()
            if (r3 != 0) goto L_0x0061
        L_0x005f:
            java.lang.String r3 = ""
        L_0x0061:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "reply_user_id"
            com.ss.android.ugc.aweme.sticker.m r3 = r8.f112939j
            if (r3 == 0) goto L_0x006f
            java.lang.String r3 = r3.f116233r
            if (r3 != 0) goto L_0x0071
        L_0x006f:
            java.lang.String r3 = ""
        L_0x0071:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            com.ss.android.ugc.aweme.sticker.m r0 = r8.f112939j
            if (r0 == 0) goto L_0x0081
            com.ss.android.ugc.aweme.feed.model.VideoReplyStruct r0 = r0.f116232q
            goto L_0x0082
        L_0x0081:
            r0 = r4
        L_0x0082:
            r1 = 0
            if (r0 != 0) goto L_0x0089
            m97467a(r1)
            return
        L_0x0089:
            com.ss.android.ugc.aweme.sticker.m r0 = r8.f112939j
            if (r0 == 0) goto L_0x008f
            com.ss.android.ugc.aweme.feed.model.VideoReplyStruct r4 = r0.f116232q
        L_0x008f:
            if (r4 != 0) goto L_0x0094
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0094:
            java.lang.String r0 = r4.getAwemeId()
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = r4.getAwemeId()
            goto L_0x00a1
        L_0x009f:
            java.lang.String r0 = ""
        L_0x00a1:
            java.lang.String r2 = r4.getCommentId()
            if (r2 == 0) goto L_0x00ac
            java.lang.String r2 = r4.getCommentId()
            goto L_0x00ae
        L_0x00ac:
            java.lang.String r2 = ""
        L_0x00ae:
            java.lang.String r3 = r4.getAliasCommentId()
            if (r3 == 0) goto L_0x00b9
            java.lang.String r3 = r4.getAliasCommentId()
            goto L_0x00bb
        L_0x00b9:
            java.lang.String r3 = ""
        L_0x00bb:
            android.content.Context r4 = r8.f112937h
            java.lang.String r5 = "aweme://aweme/detail/"
            com.bytedance.router.SmartRoute r4 = com.bytedance.router.SmartRouter.buildRoute(r4, r5)
            java.lang.String r5 = "id"
            com.bytedance.router.SmartRoute r4 = r4.withParam(r5, r0)
            java.lang.String r5 = "refer"
            java.lang.String r6 = "click_comment_bubble"
            com.bytedance.router.SmartRoute r4 = r4.withParam(r5, r6)
            java.lang.String r5 = "cid"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            r7 = 44
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            com.bytedance.router.SmartRoute r3 = r4.withParam(r5, r3)
            java.lang.String r4 = "video_from"
            com.ss.android.ugc.aweme.sticker.m r5 = r8.f112939j
            if (r5 == 0) goto L_0x00f9
            com.ss.android.ugc.aweme.sticker.l r5 = r5.f116231p
            if (r5 == 0) goto L_0x00f9
            java.lang.String r5 = r5.f116212b
            if (r5 != 0) goto L_0x00fb
        L_0x00f9:
            java.lang.String r5 = ""
        L_0x00fb:
            com.bytedance.router.SmartRoute r3 = r3.withParam(r4, r5)
            r3.open()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0113
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0113
            r1 = 1
        L_0x0113:
            m97467a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.p2228c.C44546a.mo90491d():void");
    }

    /* renamed from: a */
    private static void m97467a(boolean z) {
        try {
            C23569o.m57776a("stcker_awemeid_issue_error_rate", z ^ true ? 1 : 0, (JSONObject) null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo90486a(C46063m mVar) {
        C52711k.m112240b(mVar, "interactStickerParams");
        super.mo90486a(mVar);
        this.f112716b.mo90486a(mVar);
    }

    /* renamed from: a */
    public final View mo90485a(int i) {
        if (C44588c.m97541a(this.f112937h)) {
            if (this.f112715a == null) {
                this.f112715a = new C44661g(this.f112937h);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                View view = this.f112715a;
                if (view == null) {
                    C52711k.m112234a();
                }
                view.setLayoutParams(layoutParams);
                View view2 = this.f112715a;
                if (view2 != null) {
                    ((C44661g) view2).setPoints(this.f112716b.f112718a);
                    View view3 = this.f112715a;
                    if (view3 == null) {
                        C52711k.m112234a();
                    }
                    view3.postInvalidate();
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.PoiStickerFeedView");
                }
            }
            return this.f112715a;
        }
        if (this.f112715a == null) {
            this.f112715a = new FrameLayout(this.f112937h);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            View view4 = this.f112715a;
            if (view4 != null) {
                view4.setLayoutParams(layoutParams2);
            }
        }
        return this.f112715a;
    }

    /* renamed from: a */
    public final boolean mo90487a(long j, int i, float f, float f2) {
        return this.f112716b.mo90487a(j, i, f, f2);
    }

    /* renamed from: a */
    public final boolean mo90488a(long j, int i, float f, float f2, C44625e eVar) {
        C52711k.m112240b(eVar, "poiPopListener");
        return this.f112716b.mo90488a(j, i, f, f2, eVar);
    }

    public C44546a(int i, Context context, View view, InteractStickerStruct interactStickerStruct, C46063m mVar, C44626f fVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(view, "contentView");
        C52711k.m112240b(interactStickerStruct, "stickerStruct");
        super(i, context, view, interactStickerStruct, mVar);
        this.f112717k = fVar;
        C44547b bVar = new C44547b(context, this, interactStickerStruct, mVar, this.f112717k);
        this.f112716b = bVar;
    }
}
