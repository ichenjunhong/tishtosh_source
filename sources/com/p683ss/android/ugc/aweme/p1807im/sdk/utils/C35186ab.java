package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.media.ExifInterface;
import android.text.TextUtils;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.p524d.C9396a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.drawee.p940f.C13834b;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.io.File;
import java.security.MessageDigest;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ab */
public final class C35186ab {
    /* renamed from: b */
    public static void m79434b(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(m79431a(str));
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* renamed from: d */
    public static boolean m79436d(String str) {
        if (str == null || !str.toLowerCase().equals("gif")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static String m79435c(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    StringBuilder sb = new StringBuilder("0");
                    sb.append(hexString);
                    hexString = sb.toString();
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m79431a(String str) {
        if (!TextUtils.isEmpty(str) && C9396a.m18583b(str)) {
            String c = m79435c(str);
            if (!TextUtils.isEmpty(c)) {
                StringBuilder sb = new StringBuilder();
                sb.append(C11010c.m22280a().getFilesDir().getPath());
                sb.append("/thumb/");
                sb.append(c);
                sb.append(".jpg");
                return sb.toString();
            }
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030 A[SYNTHETIC, Splitter:B:16:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC, Splitter:B:22:0x0036] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.File m79430a(android.graphics.Bitmap r3, java.lang.String r4) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            java.io.File r4 = r0.getParentFile()
            boolean r4 = r4.exists()
            if (r4 != 0) goto L_0x0017
            java.io.File r4 = r0.getParentFile()
            boolean r4 = r4.mkdirs()
        L_0x0017:
            r4 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0034, all -> 0x002d }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0034, all -> 0x002d }
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x002b, all -> 0x0028 }
            r2 = 100
            r3.compress(r4, r2, r1)     // Catch:{ FileNotFoundException -> 0x002b, all -> 0x0028 }
            r1.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x0039
        L_0x0028:
            r3 = move-exception
            r4 = r1
            goto L_0x002e
        L_0x002b:
            r4 = r1
            goto L_0x0034
        L_0x002d:
            r3 = move-exception
        L_0x002e:
            if (r4 == 0) goto L_0x0033
            r4.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            throw r3
        L_0x0034:
            if (r4 == 0) goto L_0x0039
            r4.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35186ab.m79430a(android.graphics.Bitmap, java.lang.String):java.io.File");
    }

    /* renamed from: a */
    public static int m79427a(String str, String str2) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        if (!C9396a.m18583b(str) || C9396a.m18582b(new File(str))) {
            return 1;
        }
        if (TextUtils.isEmpty(str2)) {
            return 2;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 0);
            if (attributeInt == 3) {
                i = NormalGiftView.ALPHA_180;
            } else if (attributeInt != 6) {
                if (attributeInt == 8) {
                    i = 270;
                }
                i = 0;
            } else {
                i = 90;
            }
        } catch (Throwable th) {
            C32458a.m75148a(th);
        }
        int[] iArr = new int[2];
        int i4 = options.outWidth;
        int i5 = options.outHeight;
        if (i4 > i5) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = i5;
        } else {
            i2 = i4;
        }
        if (!z) {
            i4 = i5;
        }
        int i6 = 1920;
        int i7 = 1080;
        if (i2 > 1080 || i4 > 1920) {
            float f = ((float) i2) / ((float) i4);
            if (f >= 0.5625f) {
                i6 = (int) (1080.0f / f);
            } else {
                i7 = (int) (f * 1920.0f);
            }
            if (z) {
                i3 = i6;
            } else {
                i3 = i7;
            }
            iArr[0] = i3;
            if (z) {
                i6 = i7;
            }
            iArr[1] = i6;
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && i == 0) {
            return 1;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            iArr[0] = options.outWidth;
            iArr[1] = options.outHeight;
        }
        Bitmap a = m79429a(str, options, iArr[0], iArr[1]);
        if (a == null || TextUtils.isEmpty(str2)) {
            return 2;
        }
        if (i > 0) {
            Bitmap rotateBitmap = BitmapUtils.rotateBitmap(a, i);
            a.recycle();
            a = rotateBitmap;
        }
        File a2 = m79430a(a, str2);
        a.recycle();
        if (!a2.exists() || a2.length() > 3145728) {
            return 2;
        }
        return 3;
    }

    /* renamed from: a */
    public static int m79428a(String str, String str2, int i, int i2) {
        Bitmap bitmap;
        if (!C9396a.m18583b(str) || C9396a.m18582b(new File(str))) {
            return 1;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int[] iArr = new int[2];
        if (!m79433a(iArr, options.outWidth, options.outHeight, i, i2)) {
            bitmap = BitmapFactory.decodeFile(str);
        } else {
            bitmap = m79429a(str, options, iArr[0], iArr[1]);
        }
        if (bitmap == null || TextUtils.isEmpty(str2)) {
            return 2;
        }
        File a = m79430a(bitmap, str2);
        bitmap.recycle();
        if (a.exists()) {
            return 3;
        }
        return 2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001a */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0015  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m79429a(java.lang.String r6, android.graphics.BitmapFactory.Options r7, int r8, int r9) {
        /*
            r0 = 0
            r1 = 1
            r2 = 0
            r7.inJustDecodeBounds = r0     // Catch:{ OutOfMemoryError -> 0x0019, Exception -> 0x0012 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r6, r7)     // Catch:{ OutOfMemoryError -> 0x0019, Exception -> 0x0012 }
            if (r3 == 0) goto L_0x0010
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createScaledBitmap(r3, r8, r9, r1)     // Catch:{ OutOfMemoryError -> 0x001a, Exception -> 0x0013 }
            goto L_0x004e
        L_0x0010:
            r8 = r3
            goto L_0x004e
        L_0x0012:
            r3 = r2
        L_0x0013:
            if (r3 == 0) goto L_0x0018
            r3.recycle()
        L_0x0018:
            return r2
        L_0x0019:
            r3 = r2
        L_0x001a:
            int r8 = r7.outWidth     // Catch:{ Exception -> 0x004f }
            int r9 = r7.outHeight     // Catch:{ Exception -> 0x004f }
            if (r8 <= r9) goto L_0x0021
            r0 = 1
        L_0x0021:
            r8 = 1080(0x438, float:1.513E-42)
            r9 = 1920(0x780, float:2.69E-42)
            if (r0 == 0) goto L_0x002a
            r4 = 1920(0x780, float:2.69E-42)
            goto L_0x002c
        L_0x002a:
            r4 = 1080(0x438, float:1.513E-42)
        L_0x002c:
            if (r0 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r8 = 1920(0x780, float:2.69E-42)
        L_0x0031:
            int r9 = r7.outHeight     // Catch:{ Exception -> 0x004f }
            int r0 = r7.outWidth     // Catch:{ Exception -> 0x004f }
            if (r9 > r8) goto L_0x0039
            if (r0 <= r4) goto L_0x0048
        L_0x0039:
            int r9 = r9 / 2
            int r0 = r0 / 2
        L_0x003d:
            int r5 = r9 / r1
            if (r5 < r8) goto L_0x0048
            int r5 = r0 / r1
            if (r5 < r4) goto L_0x0048
            int r1 = r1 * 2
            goto L_0x003d
        L_0x0048:
            r7.inSampleSize = r1     // Catch:{ Exception -> 0x004f }
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeFile(r6, r7)     // Catch:{ Exception -> 0x004f }
        L_0x004e:
            return r8
        L_0x004f:
            if (r3 == 0) goto L_0x0055
            r3.recycle()
        L_0x0055:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35186ab.m79429a(java.lang.String, android.graphics.BitmapFactory$Options, int, int):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public static void m79432a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2) {
        if (remoteImageView != null && remoteImageView.getContext() != null) {
            C13834b bVar = new C13834b(remoteImageView.getContext().getResources());
            bVar.mo25920b(i2);
            bVar.mo25926d(i);
            remoteImageView.setHierarchy(bVar.mo25912a());
            C23515d.m57669a(remoteImageView, urlModel);
        }
    }

    /* renamed from: a */
    private static boolean m79433a(int[] iArr, int i, int i2, int i3, int i4) {
        if (i <= i3 && i <= i4) {
            return false;
        }
        float f = ((float) i) / ((float) i2);
        float f2 = (float) i3;
        float f3 = (float) i4;
        if (f > f2 / f3) {
            i4 = (int) (f2 / f);
        } else {
            i3 = (int) (f3 * f);
        }
        iArr[0] = i3;
        iArr[1] = i4;
        return true;
    }
}
