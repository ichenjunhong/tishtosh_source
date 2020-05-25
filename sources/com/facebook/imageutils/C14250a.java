package com.facebook.imageutils;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.ColorSpace;
import android.os.Build.VERSION;
import android.support.p030v4.p038f.C0795l.C0798c;
import android.util.Pair;
import com.facebook.common.p920d.C13689i;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.imageutils.a */
public final class C14250a {

    /* renamed from: a */
    private static final C0798c<ByteBuffer> f37156a = new C0798c<>(12);

    /* renamed from: com.facebook.imageutils.a$1 */
    static /* synthetic */ class C142511 {

        /* renamed from: a */
        static final /* synthetic */ int[] f37157a = new int[Config.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37157a = r0
                int[] r0 = f37157a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f37157a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f37157a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f37157a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f37157a     // Catch:{ NoSuchFieldError -> 0x0040 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imageutils.C14250a.C142511.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m29203a(Config config) {
        switch (C142511.f37157a[config.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 2;
            case 5:
                return 8;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    /* renamed from: a */
    public static int m29204a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        if (VERSION.SDK_INT > 19) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
            }
        }
        if (VERSION.SDK_INT >= 12) {
            return bitmap.getByteCount();
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    /* renamed from: b */
    public static C14255d m29206b(InputStream inputStream) {
        C13689i.m27652a(inputStream);
        ByteBuffer byteBuffer = (ByteBuffer) f37156a.acquire();
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocate(16384);
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBuffer.array();
            ColorSpace colorSpace = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (VERSION.SDK_INT >= 26) {
                colorSpace = options.outColorSpace;
            }
            C14255d dVar = new C14255d(options.outWidth, options.outHeight, colorSpace);
            return dVar;
        } finally {
            f37156a.release(byteBuffer);
        }
    }

    /* renamed from: a */
    public static Pair<Integer, Integer> m29205a(InputStream inputStream) {
        C13689i.m27652a(inputStream);
        ByteBuffer byteBuffer = (ByteBuffer) f37156a.acquire();
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocate(16384);
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBuffer.array();
            Pair<Integer, Integer> pair = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (options.outWidth != -1) {
                if (options.outHeight != -1) {
                    pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                }
            }
            return pair;
        } finally {
            f37156a.release(byteBuffer);
        }
    }

    /* renamed from: a */
    public static int m29202a(int i, int i2, Config config) {
        return i * i2 * m29203a(config);
    }
}
