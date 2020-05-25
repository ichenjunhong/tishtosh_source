package com.p683ss.android.ugc.gamora.recorder.p2481o;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Matrix;
import android.media.ExifInterface;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45380af;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.o.g */
public final class C49939g {

    /* renamed from: a */
    public static final C49939g f125127a = new C49939g();

    private C49939g() {
    }

    /* renamed from: a */
    private static void m107760a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m107759a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    /* renamed from: a */
    public static int m107757a(String str) {
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

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0028 A[SYNTHETIC, Splitter:B:16:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0032 A[SYNTHETIC, Splitter:B:25:0x0032] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m107758a(java.io.File r3) {
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
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002f, all -> 0x0025 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x002f, all -> 0x0025 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0030, all -> 0x0022 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r3, r0)     // Catch:{ Exception -> 0x0030, all -> 0x0022 }
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
            if (r1 != 0) goto L_0x002b
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x002e }
        L_0x002b:
            r1.close()     // Catch:{ Exception -> 0x002e }
        L_0x002e:
            throw r3
        L_0x002f:
            r2 = r1
        L_0x0030:
            if (r2 != 0) goto L_0x0035
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x0038 }
        L_0x0035:
            r2.close()     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2481o.C49939g.m107758a(java.io.File):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public final Bitmap mo97738a(String str, int i, int i2) {
        int i3;
        int i4;
        Bitmap a = m107758a(new File(str));
        if (!(i2 == 0 || a == null)) {
            try {
                Matrix matrix = new Matrix();
                matrix.setRotate((float) i2);
                Bitmap createBitmap = Bitmap.createBitmap(a, 0, 0, a.getWidth(), a.getHeight(), matrix, false);
                m107759a(a);
                a = createBitmap;
            } catch (OutOfMemoryError unused) {
                C45380af a2 = C45380af.m98935a();
                C52711k.m112236a((Object) a2, "MemoryUtil.getInstance()");
                long j = a2.f114756f;
                StringBuilder sb = new StringBuilder(" totalPss: ");
                sb.append(j);
                sb.append(", bitmap size:");
                if (a == null) {
                    C52711k.m112234a();
                }
                sb.append(a.getByteCount());
                C50203g.m108361b(sb.toString());
                return null;
            }
        }
        if (a == null) {
            return null;
        }
        C49939g gVar = f125127a;
        int width = a.getWidth();
        int height = a.getHeight();
        int i5 = width * 16;
        if (i5 < height * 9) {
            int i6 = i5 / 9;
            i4 = (height - i6) / 2;
            i3 = i6;
        } else {
            i3 = height;
            i4 = 0;
        }
        Matrix matrix2 = new Matrix();
        float f = ((float) i) / ((float) width);
        matrix2.postScale(f, f);
        Bitmap createBitmap2 = Bitmap.createBitmap(a, 0, i4, width, i3, matrix2, false);
        m107759a(a);
        return createBitmap2;
    }

    /* renamed from: a */
    public final boolean mo97739a(Bitmap bitmap, File file, int i, CompressFormat compressFormat) {
        BufferedOutputStream bufferedOutputStream = null;
        boolean z = false;
        try {
            if (bitmap.isRecycled()) {
                m107760a((OutputStream) null);
                return false;
            }
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bitmap.compress(compressFormat, 100, bufferedOutputStream2);
                bufferedOutputStream2.flush();
                z = true;
                m107760a((OutputStream) bufferedOutputStream2);
            } catch (Exception unused) {
                bufferedOutputStream = bufferedOutputStream2;
                m107760a((OutputStream) bufferedOutputStream);
                return z;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                m107760a((OutputStream) bufferedOutputStream);
                throw th;
            }
            return z;
        } catch (Exception unused2) {
            m107760a((OutputStream) bufferedOutputStream);
            return z;
        } catch (Throwable th2) {
            th = th2;
            m107760a((OutputStream) bufferedOutputStream);
            throw th;
        }
    }
}
