package com.p683ss.android.ugc.tools.utils;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: com.ss.android.ugc.tools.utils.c */
public final class C50199c {
    /* renamed from: a */
    public static void m108336a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m108335a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    /* renamed from: a */
    public static Bitmap m108334a(String str, int[] iArr) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        options.inPreferredConfig = Config.RGB_565;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (i2 >= i3 && i2 > i4) {
            i = i2 / i4;
        } else if (i2 >= i3 || i3 <= i5) {
            i = 1;
        } else {
            i = i3 / i5;
        }
        if (i <= 0) {
            i = 1;
        }
        options.inSampleSize = i;
        return BitmapFactory.decodeFile(str, options);
    }

    /* renamed from: a */
    public static int m108333a(Options options, int i, int i2) {
        int i3 = 1;
        if (i == 0 || i2 == 0) {
            return 1;
        }
        int i4 = options.outWidth;
        int i5 = options.outHeight;
        if (i4 > i || i5 > i2) {
            int i6 = i4 >> 1;
            int i7 = i5 >> 1;
            while (i6 / i3 > i && i7 / i3 > i2) {
                i3 <<= 1;
            }
        }
        return i3;
    }

    /* renamed from: a */
    public static boolean m108337a(Bitmap bitmap, File file, int i, CompressFormat compressFormat) {
        BufferedOutputStream bufferedOutputStream = null;
        boolean z = false;
        try {
            if (bitmap.isRecycled()) {
                m108336a((OutputStream) null);
                return false;
            }
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bitmap.compress(compressFormat, i, bufferedOutputStream2);
                bufferedOutputStream2.flush();
                z = true;
                m108336a((OutputStream) bufferedOutputStream2);
            } catch (Exception unused) {
                bufferedOutputStream = bufferedOutputStream2;
                m108336a((OutputStream) bufferedOutputStream);
                return z;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                m108336a((OutputStream) bufferedOutputStream);
                throw th;
            }
            return z;
        } catch (Exception unused2) {
            m108336a((OutputStream) bufferedOutputStream);
            return z;
        } catch (Throwable th2) {
            th = th2;
            m108336a((OutputStream) bufferedOutputStream);
            throw th;
        }
    }
}
