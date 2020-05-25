package com.p683ss.android.ugc.aweme.shortvideo;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.greenscreen.GreenScreenImage;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.tools.C47339t;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.em */
public final class C43789em extends ArrayList<TimeSpeedModelExtension> {

    /* renamed from: a */
    transient C47339t f110873a;

    /* renamed from: b */
    transient FaceStickerBean f110874b;

    /* renamed from: c */
    transient AVChallenge f110875c;

    /* renamed from: d */
    transient int f110876d = -1;

    /* renamed from: e */
    private BeautyMetadata f110877e;

    /* renamed from: f */
    private String f110878f;

    /* renamed from: g */
    private GreenScreenImage f110879g;

    public C43789em() {
    }

    public final void removeLast() {
        remove(size() - 1);
    }

    public C43789em(Collection<? extends TimeSpeedModelExtension> collection) {
        super(collection);
    }

    public final long end(long j) {
        return end(j, null, null, null, null);
    }

    public final void begin(C47339t tVar, FaceStickerBean faceStickerBean, AVChallenge aVChallenge, Bundle bundle) {
        this.f110873a = tVar;
        this.f110874b = faceStickerBean;
        this.f110875c = aVChallenge;
        this.f110876d = bundle.getInt("cameraId", -1);
        this.f110877e = (BeautyMetadata) bundle.getSerializable("beautyMetadata");
        this.f110878f = bundle.getString("cameraLensInfo");
        this.f110879g = (GreenScreenImage) bundle.getSerializable("greenscreenImage");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00dc, code lost:
        if (r5 != false) goto L_0x00de;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long end(long r26, com.p683ss.android.ugc.aweme.shortvideo.p2242ui.EmbaddedWindowInfo r28, java.util.List<java.lang.String> r29, java.util.List<java.lang.String> r30, com.p683ss.android.ugc.aweme.sticker.model.C46066a r31) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            com.ss.android.ugc.aweme.tools.t r3 = r0.f110873a
            if (r3 != 0) goto L_0x000b
            r1 = 0
            return r1
        L_0x000b:
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r3 = r0.f110874b
            if (r3 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r3 = r0.f110874b
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r6 = com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean.NONE
            if (r3 != r6) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r3 = 0
            goto L_0x0019
        L_0x0018:
            r3 = 1
        L_0x0019:
            com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension r15 = new com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension
            int r7 = (int) r1
            com.ss.android.ugc.aweme.tools.t r6 = r0.f110873a
            float r6 = r6.value()
            double r8 = (double) r6
            r6 = 0
            if (r3 == 0) goto L_0x0028
            r10 = r6
            goto L_0x0032
        L_0x0028:
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r10 = r0.f110874b
            long r10 = r10.getStickerId()
            java.lang.String r10 = java.lang.String.valueOf(r10)
        L_0x0032:
            if (r3 == 0) goto L_0x0036
            r11 = r6
            goto L_0x003c
        L_0x0036:
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r11 = r0.f110874b
            com.ss.android.ugc.aweme.shortvideo.ui.aq r11 = r11.getStickerPoi()
        L_0x003c:
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r12 = r0.f110874b
            if (r12 != 0) goto L_0x0042
            r12 = r6
            goto L_0x0053
        L_0x0042:
            com.ss.android.ugc.aweme.sticker.n r12 = new com.ss.android.ugc.aweme.sticker.n
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r13 = r0.f110874b
            java.lang.String r13 = r13.getPropSource()
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r14 = r0.f110874b
            java.lang.String r14 = r14.getGradeKey()
            r12.<init>(r13, r14)
        L_0x0053:
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r13 = r0.f110875c
            if (r3 == 0) goto L_0x0059
        L_0x0057:
            r14 = r6
            goto L_0x0060
        L_0x0059:
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r6 = r0.f110874b
            java.util.List r6 = r6.getMusicIds()
            goto L_0x0057
        L_0x0060:
            int r6 = r0.f110876d
            if (r3 != 0) goto L_0x006f
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r3 = r0.f110874b
            boolean r3 = r3.isBusi()
            if (r3 == 0) goto L_0x006f
            r19 = 1
            goto L_0x0071
        L_0x006f:
            r19 = 0
        L_0x0071:
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r3 = r0.f110874b
            if (r3 == 0) goto L_0x00e1
            if (r3 == 0) goto L_0x0098
            java.util.List r16 = r3.getTags()
            if (r16 != 0) goto L_0x007e
            goto L_0x0098
        L_0x007e:
            java.util.List r4 = r3.getTags()
            java.lang.String r5 = "instrument"
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L_0x0096
            java.util.List r4 = r3.getTypes()
            java.lang.String r5 = "Instrument"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x0098
        L_0x0096:
            r4 = 1
            goto L_0x0099
        L_0x0098:
            r4 = 0
        L_0x0099:
            if (r4 != 0) goto L_0x00de
            if (r3 == 0) goto L_0x00ab
            java.util.List r4 = r3.getTypes()
            java.lang.String r5 = "Game2DV2"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x00ab
            r4 = 1
            goto L_0x00ac
        L_0x00ab:
            r4 = 0
        L_0x00ac:
            if (r4 != 0) goto L_0x00de
            if (r3 == 0) goto L_0x00c2
            java.util.List r4 = r3.getTags()
            if (r4 != 0) goto L_0x00b7
            goto L_0x00c2
        L_0x00b7:
            java.util.List r4 = r3.getTags()
            java.lang.String r5 = "audio_effect"
            boolean r5 = r4.contains(r5)
            goto L_0x00c3
        L_0x00c2:
            r5 = 0
        L_0x00c3:
            if (r5 != 0) goto L_0x00de
            if (r3 == 0) goto L_0x00db
            java.lang.String r4 = r3.getSdkExtra()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x00d2
            goto L_0x00db
        L_0x00d2:
            java.lang.String r3 = r3.getSdkExtra()
            boolean r5 = com.p683ss.android.ugc.aweme.shortvideo.sticker.C44518a.m97416a(r3)
            goto L_0x00dc
        L_0x00db:
            r5 = 0
        L_0x00dc:
            if (r5 == 0) goto L_0x00e1
        L_0x00de:
            r20 = 0
            goto L_0x00e3
        L_0x00e1:
            r20 = 1
        L_0x00e3:
            com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata r3 = r0.f110877e
            r22 = r3
            java.lang.String r3 = r0.f110878f
            r23 = r3
            com.ss.android.ugc.aweme.greenscreen.GreenScreenImage r3 = r0.f110879g
            r24 = r3
            r3 = r6
            r6 = r15
            r4 = r15
            r15 = r28
            r16 = r29
            r17 = r30
            r18 = r3
            r21 = r31
            r6.<init>(r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0.add(r4)
            com.ss.android.ugc.aweme.tools.t r3 = r0.f110873a
            float r3 = r3.value()
            double r3 = (double) r3
            long r1 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension.calculateRealTime(r1, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.C43789em.end(long, com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo, java.util.List, java.util.List, com.ss.android.ugc.aweme.sticker.model.a):long");
    }
}
