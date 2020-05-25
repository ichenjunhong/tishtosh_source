package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import android.graphics.Bitmap;
import android.media.ExifInterface;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.video.C48016e;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.b */
public final class C44294b {

    /* renamed from: a */
    public static final C44294b f112119a = new C44294b();

    private C44294b() {
    }

    /* renamed from: a */
    public static void m97013a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    /* renamed from: a */
    private static int m97012a(String str) {
        int i = 0;
        if (!C48016e.m103944b(str)) {
            return 0;
        }
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                i = NormalGiftView.ALPHA_180;
            } else if (attributeInt == 6) {
                i = 90;
            } else if (attributeInt == 8) {
                i = 270;
            }
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[SYNTHETIC, Splitter:B:14:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0037 A[SYNTHETIC, Splitter:B:23:0x0037] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m97014b(java.lang.String r3) {
        /*
            boolean r0 = com.p683ss.android.ugc.aweme.video.C48016e.m103944b(r3)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options
            r3.<init>()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565
            r3.inPreferredConfig = r2
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0034, all -> 0x002a }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0034, all -> 0x002a }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x0035, all -> 0x0027 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r0, r3)     // Catch:{ Exception -> 0x0035, all -> 0x0027 }
            r2.close()     // Catch:{ Exception -> 0x003e }
            goto L_0x003e
        L_0x0027:
            r3 = move-exception
            r1 = r2
            goto L_0x002b
        L_0x002a:
            r3 = move-exception
        L_0x002b:
            if (r1 != 0) goto L_0x0030
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x0033 }
        L_0x0030:
            r1.close()     // Catch:{ Exception -> 0x0033 }
        L_0x0033:
            throw r3
        L_0x0034:
            r2 = r1
        L_0x0035:
            if (r2 != 0) goto L_0x003a
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x003d }
        L_0x003a:
            r2.close()     // Catch:{ Exception -> 0x003d }
        L_0x003d:
            r3 = r1
        L_0x003e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44294b.m97014b(java.lang.String):android.graphics.Bitmap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0087  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo90185a(java.lang.String r12, int r13, int r14) {
        /*
            r11 = this;
            boolean r13 = com.p683ss.android.ugc.aweme.video.C48016e.m103944b(r12)
            r14 = 0
            if (r13 != 0) goto L_0x0008
            return r14
        L_0x0008:
            android.graphics.Bitmap r13 = m97014b(r12)
            if (r13 != 0) goto L_0x000f
            return r14
        L_0x000f:
            if (r13 != 0) goto L_0x0014
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0014:
            int r0 = r13.getWidth()
            int r1 = r13.getHeight()
            r7 = 1280(0x500, float:1.794E-42)
            r8 = 720(0x2d0, float:1.009E-42)
            if (r0 > r8) goto L_0x0025
            if (r1 > r7) goto L_0x0025
            return r13
        L_0x0025:
            if (r12 != 0) goto L_0x002a
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ OutOfMemoryError -> 0x00e1 }
        L_0x002a:
            int r12 = m97012a(r12)     // Catch:{ OutOfMemoryError -> 0x00e1 }
            if (r12 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            if (r13 != 0) goto L_0x0035
        L_0x0033:
            r12 = r13
            goto L_0x0051
        L_0x0035:
            android.graphics.Matrix r5 = new android.graphics.Matrix     // Catch:{ OutOfMemoryError -> 0x00e1 }
            r5.<init>()     // Catch:{ OutOfMemoryError -> 0x00e1 }
            float r12 = (float) r12     // Catch:{ OutOfMemoryError -> 0x00e1 }
            r5.setRotate(r12)     // Catch:{ OutOfMemoryError -> 0x00e1 }
            int r3 = r13.getWidth()     // Catch:{ OutOfMemoryError -> 0x00e1 }
            int r4 = r13.getHeight()     // Catch:{ OutOfMemoryError -> 0x00e1 }
            r1 = 0
            r2 = 0
            r6 = 0
            r0 = r13
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ OutOfMemoryError -> 0x00e1 }
            m97013a(r13)     // Catch:{ OutOfMemoryError -> 0x00e1 }
        L_0x0051:
            if (r12 != 0) goto L_0x0056
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0056:
            int r3 = r12.getWidth()
            int r4 = r12.getHeight()
            if (r3 <= r4) goto L_0x0061
            goto L_0x0065
        L_0x0061:
            r7 = 720(0x2d0, float:1.009E-42)
            r8 = 1280(0x500, float:1.794E-42)
        L_0x0065:
            r13 = 1
            r0 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            if (r3 < r4) goto L_0x0074
            if (r3 <= r7) goto L_0x0074
            float r1 = (float) r7
            float r1 = r1 * r0
            float r2 = (float) r3
            float r1 = r1 / r2
            r10 = 1
            goto L_0x0081
        L_0x0074:
            if (r3 >= r4) goto L_0x007e
            if (r4 <= r8) goto L_0x007e
            float r1 = (float) r8
            float r1 = r1 * r0
            float r2 = (float) r4
            float r1 = r1 / r2
            goto L_0x0080
        L_0x007e:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0080:
            r10 = 0
        L_0x0081:
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r0 = r1
        L_0x0088:
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r5.postScale(r0, r0)
            if (r3 <= 0) goto L_0x00e0
            if (r4 > 0) goto L_0x0095
            goto L_0x00e0
        L_0x0095:
            r1 = 0
            r2 = 0
            r6 = 0
            r0 = r12
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x00a0
            return r14
        L_0x00a0:
            if (r10 == 0) goto L_0x00ad
            int r14 = r0.getHeight()
            int r14 = r8 - r14
            int r14 = r14 / 2
            r1 = r14
            r14 = 0
            goto L_0x00b6
        L_0x00ad:
            int r14 = r0.getWidth()
            int r14 = r7 - r14
            int r14 = r14 / 2
            r1 = 0
        L_0x00b6:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r7, r8, r2)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            android.graphics.PaintFlagsDrawFilter r4 = new android.graphics.PaintFlagsDrawFilter
            r5 = 3
            r4.<init>(r9, r5)
            android.graphics.DrawFilter r4 = (android.graphics.DrawFilter) r4
            r3.setDrawFilter(r4)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r4.setAntiAlias(r13)
            float r13 = (float) r14
            float r14 = (float) r1
            r3.drawBitmap(r0, r13, r14, r4)
            m97013a(r12)
            m97013a(r0)
            return r2
        L_0x00e0:
            return r14
        L_0x00e1:
            com.ss.android.ugc.aweme.shortvideo.util.af r12 = com.p683ss.android.ugc.aweme.shortvideo.util.C45380af.m98935a()
            java.lang.String r0 = "MemoryUtil.getInstance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r0)
            long r0 = r12.f114756f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r2 = " totalPss: "
            r12.<init>(r2)
            r12.append(r0)
            java.lang.String r0 = ", bitmap size:"
            r12.append(r0)
            int r13 = r13.getByteCount()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.p683ss.android.ugc.tools.utils.C50203g.m108361b(r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44294b.mo90185a(java.lang.String, int, int):android.graphics.Bitmap");
    }
}
