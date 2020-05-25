package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44625e;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2239g.C44630c;
import com.p683ss.android.ugc.aweme.sticker.C46063m;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.f */
public final class C44660f extends C44643a {

    /* renamed from: a */
    private View f112976a;

    /* renamed from: b */
    private final C44630c f112977b;

    /* renamed from: a */
    public final int mo90484a() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo90490c() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f112937h);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        DmtTextView dmtTextView = new DmtTextView(this.f112937h);
        dmtTextView.setTextColor(this.f112937h.getResources().getColor(R.color.a1k));
        dmtTextView.setTextSize(13.0f);
        dmtTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        dmtTextView.setMaxLines(1);
        dmtTextView.setGravity(16);
        dmtTextView.setText(this.f112937h.getString(R.string.dcc));
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

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e3, code lost:
        if (r4 == null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0132, code lost:
        if (r4 == null) goto L_0x0134;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0164  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90489b() {
        /*
            r12 = this;
            com.ss.android.ugc.aweme.sticker.m r0 = r12.f112939j
            r1 = 0
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = r0.f116221f
            goto L_0x0009
        L_0x0008:
            r0 = r1
        L_0x0009:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0018
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r0 = 0
            goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            if (r0 != 0) goto L_0x0085
            android.content.Context r4 = r12.f112937h
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.c r0 = r12.f112977b
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r0.f112906a
            java.lang.String r0 = r0.getPoiId()
            com.ss.android.ugc.aweme.sticker.m r5 = r12.f112939j
            if (r5 == 0) goto L_0x002c
            java.lang.String r5 = r5.f116221f
            goto L_0x002d
        L_0x002c:
            r5 = r1
        L_0x002d:
            com.ss.android.ugc.aweme.sticker.m r6 = r12.f112939j
            if (r6 == 0) goto L_0x0035
            java.lang.String r6 = r6.f116222g
            r8 = r6
            goto L_0x0036
        L_0x0035:
            r8 = r1
        L_0x0036:
            com.ss.android.ugc.aweme.sticker.m r6 = r12.f112939j
            if (r6 == 0) goto L_0x0041
            long r6 = r6.f116223h
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            goto L_0x0042
        L_0x0041:
            r6 = r1
        L_0x0042:
            java.lang.String r9 = java.lang.String.valueOf(r6)
            com.ss.android.ugc.aweme.sticker.m r6 = r12.f112939j
            if (r6 == 0) goto L_0x0051
            long r6 = r6.f116224i
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            goto L_0x0052
        L_0x0051:
            r6 = r1
        L_0x0052:
            if (r6 != 0) goto L_0x0057
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0057:
            long r10 = r6.longValue()
            java.lang.String r6 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r6)
            java.lang.String r6 = "cid"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r6)
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x0070
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0071
        L_0x0070:
            r2 = 1
        L_0x0071:
            if (r2 != 0) goto L_0x0085
            java.lang.String r2 = "draw_ad"
            java.lang.String r6 = "poi_sticker_click"
            java.lang.String r3 = "ad poi click event"
            org.json.JSONObject r3 = com.p683ss.android.ugc.aweme.commercialize.log.C26050aq.m63098a(r4, r5, r3)
            org.json.JSONObject r7 = com.p683ss.android.ugc.aweme.commercialize.log.C26050aq.m63099a(r3, r0)
            r5 = r2
            com.p683ss.android.ugc.aweme.commercialize.log.C26050aq.m63102a(r4, r5, r6, r7, r8, r9, r10)
        L_0x0085:
            java.lang.String r0 = "poi_prop_click"
            com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.sticker.m r4 = r12.f112939j
            if (r4 == 0) goto L_0x0098
            com.ss.android.ugc.aweme.sticker.l r4 = r4.f116231p
            if (r4 == 0) goto L_0x0098
            java.lang.String r4 = r4.f116214d
            goto L_0x0099
        L_0x0098:
            r4 = r1
        L_0x0099:
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "author_id"
            com.ss.android.ugc.aweme.sticker.m r4 = r12.f112939j
            if (r4 == 0) goto L_0x00aa
            com.ss.android.ugc.aweme.sticker.l r4 = r4.f116231p
            if (r4 == 0) goto L_0x00aa
            java.lang.String r4 = r4.f116213c
            goto L_0x00ab
        L_0x00aa:
            r4 = r1
        L_0x00ab:
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "log_pb"
            com.ss.android.ugc.aweme.sticker.m r4 = r12.f112939j
            if (r4 == 0) goto L_0x00bc
            com.ss.android.ugc.aweme.sticker.l r4 = r4.f116231p
            if (r4 == 0) goto L_0x00bc
            java.lang.String r4 = r4.f116215e
            goto L_0x00bd
        L_0x00bc:
            r4 = r1
        L_0x00bd:
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "enter_from"
            com.ss.android.ugc.aweme.sticker.m r4 = r12.f112939j
            if (r4 == 0) goto L_0x00ce
            com.ss.android.ugc.aweme.sticker.l r4 = r4.f116231p
            if (r4 == 0) goto L_0x00ce
            java.lang.String r4 = r4.f116212b
            goto L_0x00cf
        L_0x00ce:
            r4 = r1
        L_0x00cf:
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "prop_id"
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r4 = r12.mo90578g()
            com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct r4 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c.m97546c(r4)
            if (r4 == 0) goto L_0x00e5
            java.lang.String r4 = r4.getPoiStickerId()
            if (r4 != 0) goto L_0x00e7
        L_0x00e5:
            java.lang.String r4 = ""
        L_0x00e7:
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "poi_id"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.c r4 = r12.f112977b
            com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r4.f112906a
            java.lang.String r4 = r4.getPoiId()
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "poi_type"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.c r4 = r12.f112977b
            com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r4.f112906a
            long r4 = r4.poiType
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47827a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r2)
            java.lang.String r0 = "poi_sticker_toast_show"
            com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "enter_from"
            com.ss.android.ugc.aweme.sticker.m r4 = r12.f112939j
            if (r4 == 0) goto L_0x011d
            com.ss.android.ugc.aweme.sticker.l r4 = r4.f116231p
            if (r4 == 0) goto L_0x011d
            java.lang.String r4 = r4.f116212b
            goto L_0x011e
        L_0x011d:
            r4 = r1
        L_0x011e:
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "prop_id"
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r4 = r12.mo90578g()
            com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct r4 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c.m97546c(r4)
            if (r4 == 0) goto L_0x0134
            java.lang.String r4 = r4.getPoiStickerId()
            if (r4 != 0) goto L_0x0136
        L_0x0134:
            java.lang.String r4 = ""
        L_0x0136:
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.sticker.m r4 = r12.f112939j
            if (r4 == 0) goto L_0x0147
            com.ss.android.ugc.aweme.sticker.l r4 = r4.f116231p
            if (r4 == 0) goto L_0x0147
            java.lang.String r4 = r4.f116214d
            goto L_0x0148
        L_0x0147:
            r4 = r1
        L_0x0148:
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "log_pb"
            com.ss.android.ugc.aweme.sticker.m r4 = r12.f112939j
            if (r4 == 0) goto L_0x0159
            com.ss.android.ugc.aweme.sticker.l r4 = r4.f116231p
            if (r4 == 0) goto L_0x0159
            java.lang.String r4 = r4.f116215e
            goto L_0x015a
        L_0x0159:
            r4 = r1
        L_0x015a:
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "author_id"
            com.ss.android.ugc.aweme.sticker.m r4 = r12.f112939j
            if (r4 == 0) goto L_0x016a
            com.ss.android.ugc.aweme.sticker.l r4 = r4.f116231p
            if (r4 == 0) goto L_0x016a
            java.lang.String r1 = r4.f116213c
        L_0x016a:
            com.ss.android.ugc.aweme.app.f.d r1 = r2.mo47829a(r3, r1)
            java.lang.String r2 = "poi_id"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.c r3 = r12.f112977b
            com.ss.android.ugc.aweme.poi.model.PoiStruct r3 = r3.f112906a
            java.lang.String r3 = r3.getPoiId()
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44660f.mo90489b():void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x018b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90491d() {
        /*
            r13 = this;
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.c r0 = r13.f112977b
            com.ss.android.ugc.aweme.poi.model.PoiStruct r1 = r0.f112906a
            java.lang.String r1 = r1.getPoiId()
            if (r1 == 0) goto L_0x01a2
            com.ss.android.ugc.aweme.sticker.m r1 = r0.f112904f
            r2 = 0
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = r1.f116221f
            goto L_0x0013
        L_0x0012:
            r1 = r2
        L_0x0013:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0022
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r1 = 0
            goto L_0x0023
        L_0x0022:
            r1 = 1
        L_0x0023:
            if (r1 != 0) goto L_0x008d
            android.content.Context r5 = r0.f112901c
            com.ss.android.ugc.aweme.poi.model.PoiStruct r1 = r0.f112906a
            java.lang.String r1 = r1.getPoiId()
            com.ss.android.ugc.aweme.sticker.m r6 = r0.f112904f
            if (r6 == 0) goto L_0x0034
            java.lang.String r6 = r6.f116221f
            goto L_0x0035
        L_0x0034:
            r6 = r2
        L_0x0035:
            com.ss.android.ugc.aweme.sticker.m r7 = r0.f112904f
            if (r7 == 0) goto L_0x003d
            java.lang.String r7 = r7.f116222g
            r9 = r7
            goto L_0x003e
        L_0x003d:
            r9 = r2
        L_0x003e:
            com.ss.android.ugc.aweme.sticker.m r7 = r0.f112904f
            if (r7 == 0) goto L_0x0049
            long r7 = r7.f116223h
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            goto L_0x004a
        L_0x0049:
            r7 = r2
        L_0x004a:
            java.lang.String r10 = java.lang.String.valueOf(r7)
            com.ss.android.ugc.aweme.sticker.m r7 = r0.f112904f
            if (r7 == 0) goto L_0x0059
            long r7 = r7.f116224i
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            goto L_0x005a
        L_0x0059:
            r7 = r2
        L_0x005a:
            if (r7 != 0) goto L_0x005f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x005f:
            long r11 = r7.longValue()
            java.lang.String r7 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r7)
            java.lang.String r7 = "cid"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r7)
            r7 = r6
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 == 0) goto L_0x0078
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0079
        L_0x0078:
            r3 = 1
        L_0x0079:
            if (r3 != 0) goto L_0x008d
            java.lang.String r3 = "draw_ad"
            java.lang.String r7 = "poi_sticker_jump"
            java.lang.String r4 = "ad poi jump event"
            org.json.JSONObject r4 = com.p683ss.android.ugc.aweme.commercialize.log.C26050aq.m63098a(r5, r6, r4)
            org.json.JSONObject r8 = com.p683ss.android.ugc.aweme.commercialize.log.C26050aq.m63099a(r4, r1)
            r6 = r3
            com.p683ss.android.ugc.aweme.commercialize.log.C26050aq.m63102a(r5, r6, r7, r8, r9, r10, r11)
        L_0x008d:
            java.lang.String r1 = "poi_prop_label_click"
            com.ss.android.ugc.aweme.app.f.d r3 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r4 = "group_id"
            com.ss.android.ugc.aweme.sticker.m r5 = r0.f112904f
            if (r5 == 0) goto L_0x00a0
            com.ss.android.ugc.aweme.sticker.l r5 = r5.f116231p
            if (r5 == 0) goto L_0x00a0
            java.lang.String r5 = r5.f116214d
            goto L_0x00a1
        L_0x00a0:
            r5 = r2
        L_0x00a1:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "author_id"
            com.ss.android.ugc.aweme.sticker.m r5 = r0.f112904f
            if (r5 == 0) goto L_0x00b2
            com.ss.android.ugc.aweme.sticker.l r5 = r5.f116231p
            if (r5 == 0) goto L_0x00b2
            java.lang.String r5 = r5.f116213c
            goto L_0x00b3
        L_0x00b2:
            r5 = r2
        L_0x00b3:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "log_pb"
            com.ss.android.ugc.aweme.sticker.m r5 = r0.f112904f
            if (r5 == 0) goto L_0x00c4
            com.ss.android.ugc.aweme.sticker.l r5 = r5.f116231p
            if (r5 == 0) goto L_0x00c4
            java.lang.String r5 = r5.f116215e
            goto L_0x00c5
        L_0x00c4:
            r5 = r2
        L_0x00c5:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "enter_from"
            com.ss.android.ugc.aweme.sticker.m r5 = r0.f112904f
            if (r5 == 0) goto L_0x00d6
            com.ss.android.ugc.aweme.sticker.l r5 = r5.f116231p
            if (r5 == 0) goto L_0x00d6
            java.lang.String r5 = r5.f116212b
            goto L_0x00d7
        L_0x00d6:
            r5 = r2
        L_0x00d7:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "prop_id"
            com.ss.android.ugc.aweme.sticker.m r5 = r0.f112904f
            if (r5 == 0) goto L_0x00e8
            com.ss.android.ugc.aweme.sticker.l r5 = r5.f116231p
            if (r5 == 0) goto L_0x00e8
            java.lang.String r5 = r5.f116211a
            goto L_0x00e9
        L_0x00e8:
            r5 = r2
        L_0x00e9:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "poi_id"
            com.ss.android.ugc.aweme.poi.model.PoiStruct r5 = r0.f112906a
            java.lang.String r5 = r5.getPoiId()
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "poi_type"
            com.ss.android.ugc.aweme.poi.model.PoiStruct r5 = r0.f112906a
            long r5 = r5.poiType
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47827a(r4, r5)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r1, r3)
            android.content.Context r1 = r0.f112901c
            java.lang.String r3 = "//poi/detail"
            com.bytedance.router.SmartRoute r1 = com.bytedance.router.SmartRouter.buildRoute(r1, r3)
            java.lang.String r3 = "poi_bundle"
            com.ss.android.ugc.aweme.poi.model.m r4 = new com.ss.android.ugc.aweme.poi.model.m
            r4.<init>()
            com.ss.android.ugc.aweme.poi.model.PoiStruct r5 = r0.f112906a
            java.lang.String r5 = r5.getPoiId()
            com.ss.android.ugc.aweme.poi.model.m r4 = r4.mo79718a(r5)
            com.ss.android.ugc.aweme.poi.model.PoiStruct r5 = r0.f112906a
            java.lang.String r5 = r5.poiName
            com.ss.android.ugc.aweme.poi.model.m r4 = r4.mo79724f(r5)
            com.ss.android.ugc.aweme.poi.model.PoiStruct r5 = r0.f112906a
            java.lang.String r5 = r5.typeCode
            com.ss.android.ugc.aweme.poi.model.m r4 = r4.mo79723e(r5)
            com.ss.android.ugc.aweme.poi.model.PoiStruct r5 = r0.f112906a
            com.ss.android.ugc.aweme.poi.model.m r4 = r4.mo79717a(r5)
            java.lang.String r5 = "click_poi_prop"
            com.ss.android.ugc.aweme.poi.model.m r4 = r4.mo79727i(r5)
            com.ss.android.ugc.aweme.sticker.m r5 = r0.f112904f
            if (r5 == 0) goto L_0x0148
            com.ss.android.ugc.aweme.sticker.l r5 = r5.f116231p
            if (r5 == 0) goto L_0x0148
            java.lang.String r5 = r5.f116212b
            goto L_0x0149
        L_0x0148:
            r5 = r2
        L_0x0149:
            com.ss.android.ugc.aweme.poi.model.m r4 = r4.mo79726h(r5)
            java.lang.String r5 = "0"
            com.ss.android.ugc.aweme.poi.model.m r4 = r4.mo79732n(r5)
            java.lang.String r5 = "click_poi_prop"
            com.ss.android.ugc.aweme.poi.model.m r4 = r4.mo79729k(r5)
            com.ss.android.ugc.aweme.sticker.m r5 = r0.f112904f
            if (r5 == 0) goto L_0x0164
            com.ss.android.ugc.aweme.sticker.l r5 = r5.f116231p
            if (r5 == 0) goto L_0x0164
            java.lang.String r5 = r5.f116214d
            goto L_0x0165
        L_0x0164:
            r5 = r2
        L_0x0165:
            com.ss.android.ugc.aweme.poi.model.m r4 = r4.mo79728j(r5)
            com.ss.android.ugc.aweme.sticker.m r5 = r0.f112904f
            if (r5 == 0) goto L_0x0174
            com.ss.android.ugc.aweme.sticker.l r5 = r5.f116231p
            if (r5 == 0) goto L_0x0174
            java.lang.String r5 = r5.f116213c
            goto L_0x0175
        L_0x0174:
            r5 = r2
        L_0x0175:
            com.ss.android.ugc.aweme.poi.model.m r4 = r4.mo79725g(r5)
            com.ss.android.ugc.aweme.poi.model.PoiStruct r5 = r0.f112906a
            int r5 = r5.getPoiSubTitleType()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            com.ss.android.ugc.aweme.poi.model.m r4 = r4.mo79735q(r5)
            com.ss.android.ugc.aweme.sticker.m r0 = r0.f112904f
            if (r0 == 0) goto L_0x0191
            com.ss.android.ugc.aweme.sticker.l r0 = r0.f116231p
            if (r0 == 0) goto L_0x0191
            java.lang.String r2 = r0.f116215e
        L_0x0191:
            com.ss.android.ugc.aweme.poi.model.m r0 = r4.mo79731m(r2)
            com.ss.android.ugc.aweme.poi.model.l r0 = r0.mo79713a()
            java.io.Serializable r0 = (java.io.Serializable) r0
            com.bytedance.router.SmartRoute r0 = r1.withParam(r3, r0)
            r0.open()
        L_0x01a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44660f.mo90491d():void");
    }

    /* renamed from: a */
    public final void mo90486a(C46063m mVar) {
        C52711k.m112240b(mVar, "interactStickerParams");
        super.mo90486a(mVar);
        this.f112977b.mo90486a(mVar);
    }

    /* renamed from: a */
    public final View mo90485a(int i) {
        if (C44588c.m97541a(this.f112937h)) {
            if (this.f112976a == null) {
                this.f112976a = new C44661g(this.f112937h);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                View view = this.f112976a;
                if (view == null) {
                    C52711k.m112234a();
                }
                view.setLayoutParams(layoutParams);
                View view2 = this.f112976a;
                if (view2 != null) {
                    ((C44661g) view2).setPoints(this.f112977b.f112907b);
                    View view3 = this.f112976a;
                    if (view3 == null) {
                        C52711k.m112234a();
                    }
                    view3.postInvalidate();
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.PoiStickerFeedView");
                }
            }
            return this.f112976a;
        }
        if (this.f112976a == null) {
            this.f112976a = new FrameLayout(this.f112937h);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            View view4 = this.f112976a;
            if (view4 != null) {
                view4.setLayoutParams(layoutParams2);
            }
        }
        return this.f112976a;
    }

    /* renamed from: a */
    public final boolean mo90487a(long j, int i, float f, float f2) {
        return this.f112977b.mo90487a(j, i, f, f2);
    }

    public C44660f(int i, Context context, View view, InteractStickerStruct interactStickerStruct, C46063m mVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(view, "contentView");
        C52711k.m112240b(interactStickerStruct, "stickerStruct");
        super(i, context, view, interactStickerStruct, mVar);
        this.f112977b = new C44630c(context, this, interactStickerStruct, mVar);
    }

    /* renamed from: a */
    public final boolean mo90488a(long j, int i, float f, float f2, C44625e eVar) {
        C52711k.m112240b(eVar, "poiPopListener");
        return this.f112977b.mo90488a(j, i, f, f2, eVar);
    }
}
