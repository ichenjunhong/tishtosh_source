package com.facebook.imagepipeline.p972l;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import android.support.p030v4.p038f.C0795l.C0798c;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.memory.C14073d;
import com.facebook.imagepipeline.p970j.C14044e;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.imagepipeline.l.b */
public abstract class C14052b implements C14056f {

    /* renamed from: b */
    private static final Class<?> f36716b = C14052b.class;

    /* renamed from: d */
    private static final byte[] f36717d = {-1, -39};

    /* renamed from: a */
    final C0798c<ByteBuffer> f36718a;

    /* renamed from: c */
    private final C14073d f36719c;

    /* renamed from: a */
    public abstract int mo26284a(int i, int i2, Options options);

    /* renamed from: a */
    private static Options m28734a(C14044e eVar, Config config) {
        Options options = new Options();
        options.inSampleSize = eVar.f36707h;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(eVar.mo26265c(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }

    public C14052b(C14073d dVar, int i, C0798c cVar) {
        this.f36719c = dVar;
        this.f36718a = cVar;
        for (int i2 = 0; i2 < i; i2++) {
            this.f36718a.release(ByteBuffer.allocate(16384));
        }
    }

    public C13715a<Bitmap> decodeJPEGFromEncodedImage(C14044e eVar, Config config, Rect rect, int i) {
        return decodeJPEGFromEncodedImageWithColorSpace(eVar, config, rect, i, false);
    }

    public C13715a<Bitmap> decodeFromEncodedImageWithColorSpace(C14044e eVar, Config config, Rect rect, boolean z) {
        boolean z2;
        Options a = m28734a(eVar, config);
        if (a.inPreferredConfig != Config.ARGB_8888) {
            z2 = true;
        } else {
            z2 = false;
        }
        try {
            return m28735a(eVar.mo26265c(), a, rect, z);
        } catch (RuntimeException e) {
            if (z2) {
                return decodeFromEncodedImageWithColorSpace(eVar, Config.ARGB_8888, rect, z);
            }
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        com.facebook.common.p921e.C13697a.m27694c(f36716b, "Could not decode region %s, decoding full bitmap instead.", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r0 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r0.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007a, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
        r0.recycle();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0068 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x00d6 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007d A[Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6, all -> 0x00a4, IOException -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0084 A[Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6, all -> 0x00a4, IOException -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0096  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.common.p924h.C13715a<android.graphics.Bitmap> m28735a(java.io.InputStream r9, android.graphics.BitmapFactory.Options r10, android.graphics.Rect r11, boolean r12) {
        /*
            r8 = this;
            com.facebook.common.p920d.C13689i.m27652a(r9)
            int r0 = r10.outWidth
            int r1 = r10.outHeight
            if (r11 == 0) goto L_0x0017
            int r0 = r11.width()
            int r1 = r10.inSampleSize
            int r0 = r0 / r1
            int r1 = r11.height()
            int r2 = r10.inSampleSize
            int r1 = r1 / r2
        L_0x0017:
            int r2 = r8.mo26284a(r0, r1, r10)
            com.facebook.imagepipeline.memory.d r3 = r8.f36719c
            java.lang.Object r2 = r3.mo25599a(r2)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x00dd
            r10.inBitmap = r2
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L_0x0037
            if (r12 == 0) goto L_0x0037
            android.graphics.ColorSpace$Named r12 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r12 = android.graphics.ColorSpace.get(r12)
            r10.inPreferredColorSpace = r12
        L_0x0037:
            android.support.v4.f.l$c<java.nio.ByteBuffer> r12 = r8.f36718a
            java.lang.Object r12 = r12.acquire()
            java.nio.ByteBuffer r12 = (java.nio.ByteBuffer) r12
            if (r12 != 0) goto L_0x0047
            r12 = 16384(0x4000, float:2.2959E-41)
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocate(r12)
        L_0x0047:
            r3 = 1
            r4 = 0
            byte[] r5 = r12.array()     // Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6 }
            r10.inTempStorage = r5     // Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6 }
            if (r11 == 0) goto L_0x0081
            android.graphics.Bitmap$Config r5 = r10.inPreferredConfig     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            r2.reconfigure(r0, r1, r5)     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            android.graphics.BitmapRegionDecoder r0 = android.graphics.BitmapRegionDecoder.newInstance(r9, r3)     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            android.graphics.Bitmap r1 = r0.decodeRegion(r11, r10)     // Catch:{ IOException -> 0x0068 }
            if (r0 == 0) goto L_0x0082
            r0.recycle()     // Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6 }
            goto L_0x0082
        L_0x0064:
            r11 = move-exception
            r0 = r4
            goto L_0x007b
        L_0x0067:
            r0 = r4
        L_0x0068:
            java.lang.Class<?> r1 = f36716b     // Catch:{ all -> 0x007a }
            java.lang.String r5 = "Could not decode region %s, decoding full bitmap instead."
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x007a }
            r7 = 0
            r6[r7] = r11     // Catch:{ all -> 0x007a }
            com.facebook.common.p921e.C13697a.m27694c(r1, r5, r6)     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0081
            r0.recycle()     // Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6 }
            goto L_0x0081
        L_0x007a:
            r11 = move-exception
        L_0x007b:
            if (r0 == 0) goto L_0x0080
            r0.recycle()     // Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6 }
        L_0x0080:
            throw r11     // Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6 }
        L_0x0081:
            r1 = r4
        L_0x0082:
            if (r1 != 0) goto L_0x0088
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r9, r4, r10)     // Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6 }
        L_0x0088:
            android.support.v4.f.l$c<java.nio.ByteBuffer> r9 = r8.f36718a
            r9.release(r12)
            if (r2 != r1) goto L_0x0096
            com.facebook.imagepipeline.memory.d r9 = r8.f36719c
            com.facebook.common.h.a r9 = com.facebook.common.p924h.C13715a.m27747a(r1, r9)
            return r9
        L_0x0096:
            com.facebook.imagepipeline.memory.d r9 = r8.f36719c
            r9.mo25600a(r2)
            r1.recycle()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L_0x00a4:
            r9 = move-exception
            goto L_0x00d7
        L_0x00a6:
            r9 = move-exception
            com.facebook.imagepipeline.memory.d r10 = r8.f36719c     // Catch:{ all -> 0x00a4 }
            r10.mo25600a(r2)     // Catch:{ all -> 0x00a4 }
            throw r9     // Catch:{ all -> 0x00a4 }
        L_0x00ad:
            r11 = move-exception
            com.facebook.imagepipeline.memory.d r0 = r8.f36719c     // Catch:{ all -> 0x00a4 }
            r0.mo25600a(r2)     // Catch:{ all -> 0x00a4 }
            r9.reset()     // Catch:{ IOException -> 0x00d6 }
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x00d6 }
            r0.<init>()     // Catch:{ IOException -> 0x00d6 }
            r0.inMutable = r3     // Catch:{ IOException -> 0x00d6 }
            int r10 = r10.inSampleSize     // Catch:{ IOException -> 0x00d6 }
            r0.inSampleSize = r10     // Catch:{ IOException -> 0x00d6 }
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r9, r4, r0)     // Catch:{ IOException -> 0x00d6 }
            if (r9 == 0) goto L_0x00d5
            com.facebook.imagepipeline.c.g r10 = com.facebook.imagepipeline.p963c.C13948g.m28419a()     // Catch:{ IOException -> 0x00d6 }
            com.facebook.common.h.a r9 = com.facebook.common.p924h.C13715a.m27747a(r9, r10)     // Catch:{ IOException -> 0x00d6 }
            android.support.v4.f.l$c<java.nio.ByteBuffer> r10 = r8.f36718a
            r10.release(r12)
            return r9
        L_0x00d5:
            throw r11     // Catch:{ IOException -> 0x00d6 }
        L_0x00d6:
            throw r11     // Catch:{ all -> 0x00a4 }
        L_0x00d7:
            android.support.v4.f.l$c<java.nio.ByteBuffer> r10 = r8.f36718a
            r10.release(r12)
            throw r9
        L_0x00dd:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "BitmapPool.get returned null"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p972l.C14052b.m28735a(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect, boolean):com.facebook.common.h.a");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.common.p924h.C13715a<android.graphics.Bitmap> decodeJPEGFromEncodedImageWithColorSpace(com.facebook.imagepipeline.p970j.C14044e r10, android.graphics.Bitmap.Config r11, android.graphics.Rect r12, int r13, boolean r14) {
        /*
            r9 = this;
            com.facebook.h.c r0 = r10.f36702c
            com.facebook.h.c r1 = com.facebook.p955h.C13899b.f36263a
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x000a
        L_0x0008:
            r0 = 1
            goto L_0x0031
        L_0x000a:
            com.facebook.common.d.k<java.io.FileInputStream> r0 = r10.f36701b
            if (r0 == 0) goto L_0x000f
            goto L_0x0008
        L_0x000f:
            com.facebook.common.h.a<com.facebook.common.g.h> r0 = r10.f36700a
            com.facebook.common.p920d.C13689i.m27652a(r0)
            com.facebook.common.h.a<com.facebook.common.g.h> r0 = r10.f36700a
            java.lang.Object r0 = r0.mo25630a()
            com.facebook.common.g.h r0 = (com.facebook.common.p923g.C13709h) r0
            int r1 = r13 + -2
            byte r1 = r0.mo25607a(r1)
            r4 = -1
            if (r1 != r4) goto L_0x0030
            int r1 = r13 + -1
            byte r0 = r0.mo25607a(r1)
            r1 = -39
            if (r0 != r1) goto L_0x0030
            goto L_0x0008
        L_0x0030:
            r0 = 0
        L_0x0031:
            android.graphics.BitmapFactory$Options r11 = m28734a(r10, r11)
            java.io.InputStream r1 = r10.mo26265c()
            com.facebook.common.p920d.C13689i.m27652a(r1)
            int r4 = r10.mo26272i()
            if (r4 <= r13) goto L_0x0048
            com.facebook.common.j.a r4 = new com.facebook.common.j.a
            r4.<init>(r1, r13)
            r1 = r4
        L_0x0048:
            if (r0 != 0) goto L_0x0052
            com.facebook.common.j.b r0 = new com.facebook.common.j.b
            byte[] r4 = f36717d
            r0.<init>(r1, r4)
            goto L_0x0053
        L_0x0052:
            r0 = r1
        L_0x0053:
            android.graphics.Bitmap$Config r1 = r11.inPreferredConfig
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            if (r1 == r4) goto L_0x005a
            r2 = 1
        L_0x005a:
            com.facebook.common.h.a r11 = r9.m28735a(r0, r11, r12, r14)     // Catch:{ RuntimeException -> 0x005f }
            return r11
        L_0x005f:
            r11 = move-exception
            if (r2 == 0) goto L_0x006e
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            r3 = r9
            r4 = r10
            r6 = r12
            r7 = r13
            r8 = r14
            com.facebook.common.h.a r10 = r3.decodeJPEGFromEncodedImageWithColorSpace(r4, r5, r6, r7, r8)
            return r10
        L_0x006e:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p972l.C14052b.decodeJPEGFromEncodedImageWithColorSpace(com.facebook.imagepipeline.j.e, android.graphics.Bitmap$Config, android.graphics.Rect, int, boolean):com.facebook.common.h.a");
    }
}
