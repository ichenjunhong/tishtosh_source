package com.facebook.imagepipeline.p972l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.os.MemoryFile;
import com.facebook.common.p920d.C13678a;
import com.facebook.common.p920d.C13679b;
import com.facebook.common.p920d.C13696m;
import com.facebook.common.p923g.C13709h;
import com.facebook.common.p923g.C13712j;
import com.facebook.common.p924h.C13715a;
import com.facebook.common.p926j.C13723a;
import com.facebook.common.p928l.C13733b;
import com.facebook.common.p928l.C13735c;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;

/* renamed from: com.facebook.imagepipeline.l.c */
public final class C14053c extends DalvikPurgeableDecoder {

    /* renamed from: a */
    private static Method f36720a;

    /* renamed from: b */
    private final C13733b f36721b = C13735c.m27785a();

    /* renamed from: a */
    private synchronized Method m28740a() {
        if (f36720a == null) {
            try {
                f36720a = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e) {
                throw C13696m.m27667b(e);
            }
        }
        return f36720a;
    }

    /* renamed from: a */
    private FileDescriptor m28739a(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) m28740a().invoke(memoryFile, new Object[0]);
        } catch (Exception e) {
            throw C13696m.m27667b(e);
        }
    }

    public final Bitmap decodeByteArrayAsPurgeable(C13715a<C13709h> aVar, Options options) {
        return m28737a(aVar, ((C13709h) aVar.mo25630a()).mo25608a(), null, options);
    }

    public final Bitmap decodeJPEGByteArrayAsPurgeable(C13715a<C13709h> aVar, int i, Options options) {
        byte[] bArr;
        if (endsWithEOI(aVar, i)) {
            bArr = null;
        } else {
            bArr = EOI;
        }
        return m28737a(aVar, i, bArr, options);
    }

    /* renamed from: a */
    private static MemoryFile m28738a(C13715a<C13709h> aVar, int i, byte[] bArr) throws IOException {
        int i2;
        OutputStream outputStream;
        InputStream inputStream;
        C13723a aVar2;
        if (bArr == null) {
            i2 = 0;
        } else {
            i2 = bArr.length;
        }
        InputStream inputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, i2 + i);
        memoryFile.allowPurging(false);
        try {
            inputStream = new C13712j((C13709h) aVar.mo25630a());
            try {
                aVar2 = new C13723a(inputStream, i);
            } catch (Throwable th) {
                th = th;
                outputStream = null;
                C13715a.m27752c(aVar);
                C13679b.m27634a(inputStream);
                C13679b.m27634a(inputStream2);
                C13679b.m27633a(outputStream, true);
                throw th;
            }
            try {
                outputStream = memoryFile.getOutputStream();
                try {
                    C13678a.m27632a(aVar2, outputStream);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    C13715a.m27752c(aVar);
                    C13679b.m27634a(inputStream);
                    C13679b.m27634a(aVar2);
                    C13679b.m27633a(outputStream, true);
                    return memoryFile;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = aVar2;
                    C13715a.m27752c(aVar);
                    C13679b.m27634a(inputStream);
                    C13679b.m27634a(inputStream2);
                    C13679b.m27633a(outputStream, true);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                outputStream = null;
                inputStream2 = aVar2;
                C13715a.m27752c(aVar);
                C13679b.m27634a(inputStream);
                C13679b.m27634a(inputStream2);
                C13679b.m27633a(outputStream, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            outputStream = null;
            C13715a.m27752c(aVar);
            C13679b.m27634a(inputStream);
            C13679b.m27634a(inputStream2);
            C13679b.m27633a(outputStream, true);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0037  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m28737a(com.facebook.common.p924h.C13715a<com.facebook.common.p923g.C13709h> r2, int r3, byte[] r4, android.graphics.BitmapFactory.Options r5) {
        /*
            r1 = this;
            r0 = 0
            android.os.MemoryFile r2 = m28738a(r2, r3, r4)     // Catch:{ IOException -> 0x002f }
            java.io.FileDescriptor r3 = r1.m28739a(r2)     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            com.facebook.common.l.b r4 = r1.f36721b     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            if (r4 == 0) goto L_0x001f
            com.facebook.common.l.b r4 = r1.f36721b     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            android.graphics.Bitmap r3 = r4.decodeFileDescriptor(r3, r0, r5)     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            java.lang.String r4 = "BitmapFactory returned null"
            java.lang.Object r3 = com.facebook.common.p920d.C13689i.m27653a(r3, r4)     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            r2.close()
            return r3
        L_0x001f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            java.lang.String r4 = "WebpBitmapFactory is null"
            r3.<init>(r4)     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            throw r3     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
        L_0x0027:
            r3 = move-exception
            goto L_0x0035
        L_0x0029:
            r3 = move-exception
            r0 = r2
            goto L_0x0030
        L_0x002c:
            r3 = move-exception
            r2 = r0
            goto L_0x0035
        L_0x002f:
            r3 = move-exception
        L_0x0030:
            java.lang.RuntimeException r2 = com.facebook.common.p920d.C13696m.m27667b(r3)     // Catch:{ all -> 0x002c }
            throw r2     // Catch:{ all -> 0x002c }
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            r2.close()
        L_0x003a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p972l.C14053c.m28737a(com.facebook.common.h.a, int, byte[], android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }
}
