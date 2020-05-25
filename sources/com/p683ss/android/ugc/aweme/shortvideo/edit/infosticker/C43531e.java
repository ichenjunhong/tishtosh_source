package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.e */
final /* synthetic */ class C43531e implements Runnable {

    /* renamed from: a */
    private final C43530d f110124a;

    /* renamed from: b */
    private final boolean f110125b;

    /* renamed from: c */
    private final C43501am f110126c;

    /* renamed from: d */
    private final int f110127d;

    C43531e(C43530d dVar, boolean z, C43501am amVar, int i) {
        this.f110124a = dVar;
        this.f110125b = z;
        this.f110126c = amVar;
        this.f110127d = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.d r0 = r11.f110124a
            boolean r6 = r11.f110125b
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.am r1 = r11.f110126c
            int r2 = r11.f110127d
            r3 = 3
            r4 = 0
            r5 = 0
            r7 = 1
            if (r6 == 0) goto L_0x006c
            r8 = 2
            float[] r8 = new float[r8]
            com.ss.android.ugc.asve.c.c r9 = r0.f110111e
            com.ss.android.ugc.aweme.infosticker.StickerItemModel r10 = r1.f110003d
            int r10 = r10.f91605id
            r9.mo42988a(r10, r8)
            com.ss.android.ugc.asve.c.c r8 = r0.f110111e     // Catch:{ p -> 0x0041 }
            float[] r2 = r8.mo43064g(r2)     // Catch:{ p -> 0x0041 }
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r8 = r0.f110110d     // Catch:{ p -> 0x0041 }
            int r8 = r8.f109926a     // Catch:{ p -> 0x0041 }
            float r8 = (float) r8     // Catch:{ p -> 0x0041 }
            r9 = r2[r5]     // Catch:{ p -> 0x0041 }
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r10 = r0.f110110d     // Catch:{ p -> 0x0041 }
            int r10 = r10.f109928c     // Catch:{ p -> 0x0041 }
            float r10 = (float) r10
            float r9 = r9 * r10
            float r8 = r8 + r9
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r9 = r0.f110110d     // Catch:{ p -> 0x0042 }
            int r9 = r9.f109927b     // Catch:{ p -> 0x0042 }
            float r9 = (float) r9     // Catch:{ p -> 0x0042 }
            r2 = r2[r3]     // Catch:{ p -> 0x0042 }
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r10 = r0.f110110d     // Catch:{ p -> 0x0042 }
            int r10 = r10.f109929d     // Catch:{ p -> 0x0042 }
            float r4 = (float) r10
            float r2 = r2 * r4
            float r9 = r9 + r2
            r2 = r8
            r4 = r9
            goto L_0x007e
        L_0x0041:
            r8 = 0
        L_0x0042:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r7 = "getInfoStickerBoundingBox error in infoStickerHint, index is "
            r2.<init>(r7)
            com.ss.android.ugc.aweme.infosticker.StickerItemModel r7 = r1.f110003d
            int r7 = r7.f91605id
            r2.append(r7)
            java.lang.String r7 = " veState is "
            r2.append(r7)
            com.ss.android.ugc.asve.c.c r7 = r0.f110111e
            com.ss.android.vesdk.o$h r7 = r7.mo43063g()
            int r7 = r7.getValue()
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay.m98971b(r2)
            r2 = r8
            r7 = 0
            goto L_0x007e
        L_0x006c:
            android.graphics.RectF r2 = r1.f110008i
            float r2 = r2.left
            android.graphics.RectF r4 = r1.f110008i
            float r4 = r4.width()
            r8 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r8
            float r2 = r2 + r4
            android.graphics.RectF r4 = r1.f110008i
            float r4 = r4.top
        L_0x007e:
            boolean r1 = r1.f110020x
            if (r1 != 0) goto L_0x00a7
            if (r7 == 0) goto L_0x00a7
            com.ss.android.ugc.aweme.shortvideo.sticker.StickerHintTextViewModel r0 = r0.f110115i
            android.arch.lifecycle.r r0 = r0.mo90442b()
            com.ss.android.ugc.aweme.shortvideo.sticker.c r7 = new com.ss.android.ugc.aweme.shortvideo.sticker.c
            if (r6 == 0) goto L_0x0095
            r1 = 2132543559(0x7f1c0847, float:2.0740255E38)
            r8 = 2132543559(0x7f1c0847, float:2.0740255E38)
            goto L_0x009b
        L_0x0095:
            r1 = 2132543568(0x7f1c0850, float:2.0740273E38)
            r8 = 2132543568(0x7f1c0850, float:2.0740273E38)
        L_0x009b:
            if (r6 == 0) goto L_0x009e
            r5 = 3
        L_0x009e:
            r1 = r7
            r3 = r4
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r0.postValue(r7)
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43531e.run():void");
    }
}
