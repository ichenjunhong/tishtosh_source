package com.facebook.imagepipeline.p973m;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import com.C2240a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p921e.C13697a;
import com.facebook.imagepipeline.p969i.C14039a;
import com.facebook.imagepipeline.p975o.C14228a;
import com.facebook.p914c.p915a.C13619c;
import com.facebook.p914c.p915a.C13624h;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;

/* renamed from: com.facebook.imagepipeline.m.a */
public final class C14057a extends C14228a {

    /* renamed from: a */
    private static final boolean f36723a;

    /* renamed from: b */
    private final int f36724b;

    /* renamed from: c */
    private final Context f36725c;

    /* renamed from: d */
    private final int f36726d;

    /* renamed from: e */
    private C13619c f36727e;

    static {
        boolean z;
        if (VERSION.SDK_INT >= 17) {
            z = true;
        } else {
            z = false;
        }
        f36723a = z;
    }

    public final C13619c getPostprocessorCacheKey() {
        String str;
        if (this.f36727e == null) {
            if (f36723a) {
                str = C2240a.m6773a(null, "IntrinsicBlur;%d", new Object[]{Integer.valueOf(this.f36726d)});
            } else {
                str = C2240a.m6773a(null, "IterativeBoxBlur;%d;%d", new Object[]{Integer.valueOf(this.f36724b), Integer.valueOf(this.f36726d)});
            }
            this.f36727e = new C13624h(str);
        }
        return this.f36727e;
    }

    public final void process(Bitmap bitmap) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3 = this.f36724b;
        int i4 = this.f36726d;
        C13689i.m27652a(bitmap);
        C13689i.m27655a(bitmap.isMutable());
        int i5 = 1;
        if (((float) bitmap.getHeight()) <= 2048.0f) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        if (((float) bitmap.getWidth()) <= 2048.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13689i.m27655a(z2);
        if (i4 <= 0 || i4 > 25) {
            z3 = false;
        } else {
            z3 = true;
        }
        C13689i.m27655a(z3);
        if (i3 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        C13689i.m27655a(z4);
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[(width * height)];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int i6 = i4 + 1;
            int i7 = i6 + i4;
            int[] iArr2 = new int[(i7 * UnReadVideoExperiment.BROWSE_RECORD_LIST)];
            int i8 = i6;
            int i9 = 1;
            while (i9 <= 255) {
                int i10 = i8;
                for (int i11 = 0; i11 < i7; i11++) {
                    iArr2[i10] = i9;
                    i10++;
                }
                i9++;
                i8 = i10;
            }
            int[] iArr3 = new int[Math.max(width, height)];
            int i12 = 0;
            while (i12 < i3) {
                int i13 = 0;
                while (i13 < height) {
                    int i14 = width * i13;
                    int i15 = i13 + 1;
                    int i16 = (width * i15) - i5;
                    int i17 = i7 >> 1;
                    int i18 = -i17;
                    int i19 = 0;
                    int i20 = 0;
                    int i21 = 0;
                    int i22 = 0;
                    while (i18 < width + i17) {
                        int i23 = iArr[C14039a.m28685a(i14 + i18, i14, i16)];
                        int i24 = i15;
                        i19 += (i23 >> 16) & NormalGiftView.ALPHA_255;
                        i20 += (i23 >> 8) & NormalGiftView.ALPHA_255;
                        i21 += i23 & NormalGiftView.ALPHA_255;
                        i22 += i23 >>> 24;
                        if (i18 >= i17) {
                            iArr3[i18 - i17] = (iArr2[i22] << 24) | (iArr2[i19] << 16) | (iArr2[i20] << 8) | iArr2[i21];
                            int i25 = iArr[C14039a.m28685a((i18 - (i7 - 1)) + i14, i14, i16)];
                            i19 -= (i25 >> 16) & NormalGiftView.ALPHA_255;
                            i20 -= (i25 >> 8) & NormalGiftView.ALPHA_255;
                            i21 -= i25 & NormalGiftView.ALPHA_255;
                            i22 -= i25 >>> 24;
                        }
                        i18++;
                        i15 = i24;
                    }
                    int i26 = i15;
                    System.arraycopy(iArr3, 0, iArr, i14, width);
                    i13 = i26;
                    i5 = 1;
                }
                int i27 = 0;
                while (i27 < width) {
                    int i28 = ((height - 1) * width) + i27;
                    int i29 = (i7 >> 1) * width;
                    int i30 = (i7 - 1) * width;
                    int i31 = i27 - i29;
                    int i32 = i7;
                    int i33 = 0;
                    int i34 = 0;
                    int i35 = 0;
                    int i36 = 0;
                    int i37 = 0;
                    while (i31 <= i28 + i29) {
                        int i38 = iArr[C14039a.m28685a(i31, i27, i28)];
                        i2 = i4;
                        i = i3;
                        i33 += (i38 >> 16) & NormalGiftView.ALPHA_255;
                        i34 += (i38 >> 8) & NormalGiftView.ALPHA_255;
                        i35 += i38 & NormalGiftView.ALPHA_255;
                        i36 += i38 >>> 24;
                        if (i31 - i29 >= i27) {
                            try {
                                iArr3[i37] = (iArr2[i36] << 24) | (iArr2[i33] << 16) | (iArr2[i34] << 8) | iArr2[i35];
                                i37++;
                                int i39 = iArr[C14039a.m28685a(i31 - i30, i27, i28)];
                                i33 -= (i39 >> 16) & NormalGiftView.ALPHA_255;
                                i34 -= (i39 >> 8) & NormalGiftView.ALPHA_255;
                                i35 -= i39 & NormalGiftView.ALPHA_255;
                                i36 -= i39 >>> 24;
                            } catch (OutOfMemoryError e) {
                                e = e;
                                C13697a.m27695c("IterativeBoxBlurFilter", C2240a.m6773a(null, "OOM: %d iterations on %dx%d with %d radius", new Object[]{Integer.valueOf(i), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(i2)}));
                                throw e;
                            }
                        }
                        i31 += width;
                        i4 = i2;
                        i3 = i;
                    }
                    int i40 = i3;
                    int i41 = i4;
                    int i42 = i27;
                    for (int i43 = 0; i43 < height; i43++) {
                        iArr[i42] = iArr3[i43];
                        i42 += width;
                    }
                    i27++;
                    i7 = i32;
                    i4 = i41;
                    i3 = i40;
                }
                int i44 = i3;
                int i45 = i4;
                i12++;
                i7 = i7;
                i5 = 1;
            }
            int i46 = i3;
            int i47 = i4;
            bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        } catch (OutOfMemoryError e2) {
            e = e2;
            i = i3;
            i2 = i4;
            C13697a.m27695c("IterativeBoxBlurFilter", C2240a.m6773a(null, "OOM: %d iterations on %dx%d with %d radius", new Object[]{Integer.valueOf(i), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(i2)}));
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void process(android.graphics.Bitmap r5, android.graphics.Bitmap r6) {
        /*
            r4 = this;
            boolean r0 = f36723a
            if (r0 == 0) goto L_0x0050
            android.content.Context r0 = r4.f36725c
            int r1 = r4.f36726d
            com.facebook.common.p920d.C13689i.m27652a(r5)
            com.facebook.common.p920d.C13689i.m27652a(r6)
            com.facebook.common.p920d.C13689i.m27652a(r0)
            if (r1 <= 0) goto L_0x0019
            r2 = 25
            if (r1 > r2) goto L_0x0019
            r2 = 1
            goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            com.facebook.common.p920d.C13689i.m27655a(r2)
            r2 = 0
            android.renderscript.RenderScript r0 = android.renderscript.RenderScript.create(r0)     // Catch:{ all -> 0x0048 }
            android.renderscript.Element r2 = android.renderscript.Element.U8_4(r0)     // Catch:{ all -> 0x0046 }
            android.renderscript.ScriptIntrinsicBlur r2 = android.renderscript.ScriptIntrinsicBlur.create(r0, r2)     // Catch:{ all -> 0x0046 }
            android.renderscript.Allocation r6 = android.renderscript.Allocation.createFromBitmap(r0, r6)     // Catch:{ all -> 0x0046 }
            android.renderscript.Allocation r3 = android.renderscript.Allocation.createFromBitmap(r0, r5)     // Catch:{ all -> 0x0046 }
            float r1 = (float) r1     // Catch:{ all -> 0x0046 }
            r2.setRadius(r1)     // Catch:{ all -> 0x0046 }
            r2.setInput(r6)     // Catch:{ all -> 0x0046 }
            r2.forEach(r3)     // Catch:{ all -> 0x0046 }
            r3.copyTo(r5)     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0045
            r0.destroy()
            goto L_0x0053
        L_0x0045:
            return
        L_0x0046:
            r5 = move-exception
            goto L_0x004a
        L_0x0048:
            r5 = move-exception
            r0 = r2
        L_0x004a:
            if (r0 == 0) goto L_0x004f
            r0.destroy()
        L_0x004f:
            throw r5
        L_0x0050:
            super.process(r5, r6)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p973m.C14057a.process(android.graphics.Bitmap, android.graphics.Bitmap):void");
    }

    public C14057a(int i, Context context, int i2) {
        boolean z;
        boolean z2 = true;
        if (i <= 0 || i > 25) {
            z = false;
        } else {
            z = true;
        }
        C13689i.m27655a(z);
        if (i2 <= 0) {
            z2 = false;
        }
        C13689i.m27655a(z2);
        C13689i.m27652a(context);
        this.f36724b = i2;
        this.f36726d = i;
        this.f36725c = context;
    }
}
