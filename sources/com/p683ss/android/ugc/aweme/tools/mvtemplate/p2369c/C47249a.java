package com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.media.ExifInterface;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.c.a */
public final class C47249a {
    /* renamed from: a */
    private static void m102573a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m102572a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    /* renamed from: a */
    public static int[] m102575a(String str) {
        if (!C48016e.m103944b(str)) {
            return null;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x002b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m102570a(java.io.File r3) {
        /*
            boolean r0 = r3.exists()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565
            r0.inPreferredConfig = r2
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002a, all -> 0x0025 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x002a, all -> 0x0025 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x002b, all -> 0x0022 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r3, r0)     // Catch:{ Exception -> 0x002b, all -> 0x0022 }
            r2.close()     // Catch:{ Exception -> 0x0021 }
        L_0x0021:
            return r3
        L_0x0022:
            r3 = move-exception
            r1 = r2
            goto L_0x0026
        L_0x0025:
            r3 = move-exception
        L_0x0026:
            r1.close()     // Catch:{ Exception -> 0x0029 }
        L_0x0029:
            throw r3
        L_0x002a:
            r2 = r1
        L_0x002b:
            r2.close()     // Catch:{ Exception -> 0x002e }
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47249a.m102570a(java.io.File):android.graphics.Bitmap");
    }

    /* renamed from: b */
    public static int m102576b(String str) {
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

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m102569a(android.graphics.Bitmap r13, int r14, int r15) {
        /*
            int r0 = r13.getWidth()
            float r0 = (float) r0
            int r1 = r13.getHeight()
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            if (r14 <= r15) goto L_0x002b
            float r5 = (float) r14
            float r5 = r5 * r2
            float r2 = (float) r15
            float r5 = r5 / r2
            float r2 = r0 / r5
            int r6 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0022
            float r1 = r1 - r2
            float r1 = r1 / r3
        L_0x001e:
            r3 = r1
            r1 = r2
            r2 = 0
            goto L_0x004f
        L_0x0022:
            float r2 = r1 * r5
            float r0 = r0 - r2
            float r0 = r0 / r3
        L_0x0026:
            r3 = 0
            r12 = r2
            r2 = r0
            r0 = r12
            goto L_0x004f
        L_0x002b:
            if (r14 >= r15) goto L_0x0040
            float r5 = (float) r15
            float r5 = r5 * r2
            float r2 = (float) r14
            float r5 = r5 / r2
            float r2 = r1 / r5
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x003b
            float r0 = r0 - r2
            float r0 = r0 / r3
            goto L_0x0026
        L_0x003b:
            float r2 = r0 * r5
            float r1 = r1 - r2
            float r1 = r1 / r3
            goto L_0x001e
        L_0x0040:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x004a
            float r0 = r0 - r1
            float r0 = r0 / r3
            r2 = r0
            r0 = r1
            r3 = 0
            goto L_0x004f
        L_0x004a:
            float r1 = r1 - r0
            float r1 = r1 / r3
            r3 = r1
            r2 = 0
            r1 = r0
        L_0x004f:
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            float r5 = (float) r14
            float r5 = r5 / r0
            float r6 = (float) r15
            float r6 = r6 / r1
            r10.postScale(r5, r6)
            int r6 = (int) r2
            int r7 = (int) r3
            int r8 = (int) r0
            int r9 = (int) r1
            r11 = 0
            r5 = r13
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)
            if (r0 != 0) goto L_0x0069
            r13 = 0
            return r13
        L_0x0069:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r14 = android.graphics.Bitmap.createBitmap(r14, r15, r1)
            android.graphics.Canvas r15 = new android.graphics.Canvas
            r15.<init>(r14)
            android.graphics.PaintFlagsDrawFilter r1 = new android.graphics.PaintFlagsDrawFilter
            r2 = 0
            r3 = 3
            r1.<init>(r2, r3)
            r15.setDrawFilter(r1)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r2 = 1
            r1.setAntiAlias(r2)
            r15.drawBitmap(r0, r4, r4, r1)
            m102572a(r13)
            m102572a(r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47249a.m102569a(android.graphics.Bitmap, int, int):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public static boolean m102574a(Bitmap bitmap, File file, int i, CompressFormat compressFormat) {
        BufferedOutputStream bufferedOutputStream = null;
        boolean z = false;
        try {
            if (bitmap.isRecycled()) {
                m102573a((OutputStream) null);
                return false;
            }
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bitmap.compress(compressFormat, 100, bufferedOutputStream2);
                bufferedOutputStream2.flush();
                z = true;
                m102573a((OutputStream) bufferedOutputStream2);
            } catch (Exception unused) {
                bufferedOutputStream = bufferedOutputStream2;
                m102573a((OutputStream) bufferedOutputStream);
                return z;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                m102573a((OutputStream) bufferedOutputStream);
                throw th;
            }
            return z;
        } catch (Exception unused2) {
            m102573a((OutputStream) bufferedOutputStream);
            return z;
        } catch (Throwable th2) {
            th = th2;
            m102573a((OutputStream) bufferedOutputStream);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r3 < r6) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (r3 < r6) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a1 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m102571a(java.lang.String r17, int r18, int r19, int r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            java.io.File r4 = new java.io.File
            r5 = r17
            r4.<init>(r5)
            android.graphics.Bitmap r4 = m102570a(r4)
            r12 = 0
            if (r4 != 0) goto L_0x0017
            return r12
        L_0x0017:
            if (r2 != 0) goto L_0x001b
            r2 = r4
            goto L_0x003b
        L_0x001b:
            if (r4 != 0) goto L_0x001f
            r2 = r12
            goto L_0x003b
        L_0x001f:
            android.graphics.Matrix r10 = new android.graphics.Matrix     // Catch:{ OutOfMemoryError -> 0x01bf }
            r10.<init>()     // Catch:{ OutOfMemoryError -> 0x01bf }
            float r2 = (float) r2     // Catch:{ OutOfMemoryError -> 0x01bf }
            r10.setRotate(r2)     // Catch:{ OutOfMemoryError -> 0x01bf }
            int r8 = r4.getWidth()     // Catch:{ OutOfMemoryError -> 0x01bf }
            int r9 = r4.getHeight()     // Catch:{ OutOfMemoryError -> 0x01bf }
            r6 = 0
            r7 = 0
            r11 = 0
            r5 = r4
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ OutOfMemoryError -> 0x01bf }
            m102572a(r4)     // Catch:{ OutOfMemoryError -> 0x01bf }
        L_0x003b:
            r4 = 1
            if (r3 != r4) goto L_0x0043
            android.graphics.Bitmap r0 = m102569a(r2, r0, r1)
            return r0
        L_0x0043:
            r13 = 0
            r14 = 3
            r15 = 2
            r11 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r3 != r14) goto L_0x00ef
            int r8 = r2.getWidth()
            int r9 = r2.getHeight()
            float r3 = (float) r0
            float r3 = r3 * r5
            float r6 = (float) r8
            float r3 = r3 / r6
            float r6 = (float) r1
            float r6 = r6 * r5
            float r7 = (float) r9
            float r6 = r6 / r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0070
            int r7 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0070
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x006c
        L_0x0069:
            r16 = 1
            goto L_0x0091
        L_0x006c:
            r3 = r6
        L_0x006d:
            r16 = 0
            goto L_0x0091
        L_0x0070:
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0079
            int r7 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0079
            goto L_0x0069
        L_0x0079:
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0081
            int r7 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x006c
        L_0x0081:
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x008e
            int r7 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x008e
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x006c
            goto L_0x0069
        L_0x008e:
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x006d
        L_0x0091:
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 > 0) goto L_0x0097
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0097:
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            r10.postScale(r3, r3)
            if (r8 <= 0) goto L_0x00ee
            if (r9 > 0) goto L_0x00a4
            goto L_0x00ee
        L_0x00a4:
            r6 = 0
            r7 = 0
            r3 = 0
            r5 = r2
            r13 = 0
            r11 = r3
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)
            if (r3 != 0) goto L_0x00b1
            return r12
        L_0x00b1:
            if (r16 == 0) goto L_0x00be
            int r5 = r3.getHeight()
            int r5 = r1 - r5
            int r11 = r5 / 2
            r5 = r11
            r11 = 0
            goto L_0x00c7
        L_0x00be:
            int r5 = r3.getWidth()
            int r5 = r0 - r5
            int r11 = r5 / 2
            r5 = 0
        L_0x00c7:
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r6)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            android.graphics.PaintFlagsDrawFilter r6 = new android.graphics.PaintFlagsDrawFilter
            r6.<init>(r13, r14)
            r1.setDrawFilter(r6)
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>()
            r6.setAntiAlias(r4)
            float r4 = (float) r11
            float r5 = (float) r5
            r1.drawBitmap(r3, r4, r5, r6)
            m102572a(r2)
            m102572a(r3)
            return r0
        L_0x00ee:
            return r12
        L_0x00ef:
            if (r3 != r15) goto L_0x014b
            int r8 = r2.getWidth()
            int r9 = r2.getHeight()
            float r3 = (float) r0
            float r3 = r3 * r5
            float r5 = (float) r8
            float r3 = r3 / r5
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            r10.postScale(r3, r3)
            if (r8 <= 0) goto L_0x014a
            if (r9 > 0) goto L_0x010b
            goto L_0x014a
        L_0x010b:
            r6 = 0
            r7 = 0
            r3 = 0
            r5 = r2
            r13 = 0
            r11 = r3
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)
            if (r3 != 0) goto L_0x0118
            return r12
        L_0x0118:
            int r5 = r3.getHeight()
            int r5 = r1 - r5
            int r11 = r5 / 2
            if (r11 >= 0) goto L_0x0123
            r11 = 0
        L_0x0123:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r5)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            android.graphics.PaintFlagsDrawFilter r5 = new android.graphics.PaintFlagsDrawFilter
            r5.<init>(r13, r14)
            r1.setDrawFilter(r5)
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r5.setAntiAlias(r4)
            float r4 = (float) r11
            r6 = 0
            r1.drawBitmap(r3, r6, r4, r5)
            m102572a(r2)
            m102572a(r3)
            return r0
        L_0x014a:
            return r12
        L_0x014b:
            r13 = 0
            r4 = 4
            if (r3 != r4) goto L_0x0185
            int r8 = r2.getWidth()
            int r9 = r2.getHeight()
            if (r8 <= 0) goto L_0x0184
            if (r9 > 0) goto L_0x015c
            goto L_0x0184
        L_0x015c:
            if (r8 <= r0) goto L_0x0183
            if (r9 > r1) goto L_0x0161
            goto L_0x0183
        L_0x0161:
            float r0 = (float) r0
            float r0 = r0 * r5
            float r3 = (float) r8
            float r0 = r0 / r3
            float r1 = (float) r1
            float r1 = r1 * r5
            float r3 = (float) r9
            float r1 = r1 / r3
            float r0 = java.lang.Math.min(r0, r1)
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            r10.postScale(r0, r0)
            r6 = 0
            r7 = 0
            r11 = 0
            r5 = r2
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)
            m102572a(r2)
            return r0
        L_0x0183:
            return r2
        L_0x0184:
            return r12
        L_0x0185:
            r4 = 5
            if (r3 != r4) goto L_0x01ba
            int r8 = r2.getWidth()
            int r1 = r2.getHeight()
            if (r8 <= 0) goto L_0x01b9
            if (r1 > 0) goto L_0x0195
            goto L_0x01b9
        L_0x0195:
            int r3 = r8 * 16
            int r4 = r1 * 9
            if (r3 >= r4) goto L_0x01a2
            int r3 = r3 / 9
            int r1 = r1 - r3
            int r1 = r1 / r15
            r7 = r1
            r9 = r3
            goto L_0x01a4
        L_0x01a2:
            r9 = r1
            r7 = 0
        L_0x01a4:
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            int r0 = r0 / r8
            float r0 = (float) r0
            r10.postScale(r0, r0)
            r6 = 0
            r11 = 0
            r5 = r2
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)
            m102572a(r2)
            return r0
        L_0x01b9:
            return r12
        L_0x01ba:
            android.graphics.Bitmap r0 = m102569a(r2, r0, r1)
            return r0
        L_0x01bf:
            com.ss.android.ugc.aweme.shortvideo.util.af r0 = com.p683ss.android.ugc.aweme.shortvideo.util.C45380af.m98935a()
            long r0 = r0.f114756f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " totalPss: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", bitmap size:"
            r2.append(r0)
            int r0 = r4.getByteCount()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.p683ss.android.ugc.tools.utils.C50203g.m108361b(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47249a.m102571a(java.lang.String, int, int, int, int):android.graphics.Bitmap");
    }
}
