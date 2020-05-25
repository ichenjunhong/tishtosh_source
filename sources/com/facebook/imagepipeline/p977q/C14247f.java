package com.facebook.imagepipeline.p977q;

import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.common.C13953e;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p974n.C14203q;
import com.facebook.p955h.C13899b;
import com.facebook.p955h.C13900c;

/* renamed from: com.facebook.imagepipeline.q.f */
public final class C14247f implements C14243b {

    /* renamed from: a */
    private final boolean f37153a;

    /* renamed from: b */
    private final int f37154b;

    public final String getIdentifier() {
        return "SimpleImageTranscoder";
    }

    public final boolean canTranscode(C13900c cVar) {
        if (cVar == C13899b.f36273k || cVar == C13899b.f36263a) {
            return true;
        }
        return false;
    }

    public C14247f(boolean z, int i) {
        this.f37153a = z;
        this.f37154b = i;
    }

    public final boolean canResize(C14044e eVar, C13953e eVar2, C13952d dVar) {
        if (eVar2 == null) {
            eVar2 = C13953e.m28428a();
        }
        if (!this.f37153a || C14203q.m29128a(eVar2, dVar, eVar, this.f37154b) <= 1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ec A[Catch:{ OutOfMemoryError -> 0x00db }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.imagepipeline.p977q.C14242a transcode(com.facebook.imagepipeline.p970j.C14044e r19, java.io.OutputStream r20, com.facebook.imagepipeline.common.C13953e r21, com.facebook.imagepipeline.common.C13952d r22, com.facebook.p955h.C13900c r23, java.lang.Integer r24) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r23
            if (r24 != 0) goto L_0x0010
            r3 = 85
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = r3
            goto L_0x0012
        L_0x0010:
            r4 = r24
        L_0x0012:
            if (r21 != 0) goto L_0x0019
            com.facebook.imagepipeline.common.e r3 = com.facebook.imagepipeline.common.C13953e.m28428a()
            goto L_0x001b
        L_0x0019:
            r3 = r21
        L_0x001b:
            boolean r5 = r1.f37153a
            r6 = 1
            if (r5 != 0) goto L_0x0022
            r5 = 1
            goto L_0x002a
        L_0x0022:
            int r5 = r1.f37154b
            r7 = r22
            int r5 = com.facebook.imagepipeline.p974n.C14203q.m29128a(r3, r7, r0, r5)
        L_0x002a:
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options
            r7.<init>()
            r7.inSampleSize = r5
            r8 = 2
            java.io.InputStream r9 = r19.mo26265c()     // Catch:{ OutOfMemoryError -> 0x0111 }
            r10 = 0
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r9, r10, r7)     // Catch:{ OutOfMemoryError -> 0x0111 }
            if (r7 != 0) goto L_0x004a
            java.lang.String r0 = "SimpleImageTranscoder"
            java.lang.String r2 = "Couldn't decode the EncodedImage InputStream ! "
            com.facebook.common.p921e.C13697a.m27695c(r0, r2)
            com.facebook.imagepipeline.q.a r0 = new com.facebook.imagepipeline.q.a
            r0.<init>(r8)
            return r0
        L_0x004a:
            com.facebook.common.d.e<java.lang.Integer> r9 = com.facebook.imagepipeline.p977q.C14245d.f37148a
            int r11 = r19.mo26269f()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r9 = r9.contains(r11)
            if (r9 == 0) goto L_0x0090
            int r0 = com.facebook.imagepipeline.p977q.C14245d.m29195b(r3, r0)
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r9 = 1065353216(0x3f800000, float:1.0)
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == r8) goto L_0x008b
            r12 = 7
            if (r0 == r12) goto L_0x0082
            switch(r0) {
                case 4: goto L_0x0079;
                case 5: goto L_0x0070;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x009f
        L_0x0070:
            r0 = 1119092736(0x42b40000, float:90.0)
            r3.setRotate(r0)
            r3.postScale(r11, r9)
            goto L_0x008e
        L_0x0079:
            r0 = 1127481344(0x43340000, float:180.0)
            r3.setRotate(r0)
            r3.postScale(r11, r9)
            goto L_0x008e
        L_0x0082:
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r3.setRotate(r0)
            r3.postScale(r11, r9)
            goto L_0x008e
        L_0x008b:
            r3.setScale(r11, r9)
        L_0x008e:
            r10 = r3
            goto L_0x009f
        L_0x0090:
            int r0 = com.facebook.imagepipeline.p977q.C14245d.m29193a(r3, r0)
            if (r0 == 0) goto L_0x009f
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            float r0 = (float) r0
            r10.setRotate(r0)
        L_0x009f:
            r16 = r10
            if (r16 == 0) goto L_0x00bc
            r12 = 0
            r13 = 0
            int r14 = r7.getWidth()     // Catch:{ OutOfMemoryError -> 0x00b9, all -> 0x00b6 }
            int r15 = r7.getHeight()     // Catch:{ OutOfMemoryError -> 0x00b9, all -> 0x00b6 }
            r17 = 0
            r11 = r7
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ OutOfMemoryError -> 0x00b9, all -> 0x00b6 }
            r3 = r0
            goto L_0x00bd
        L_0x00b6:
            r0 = move-exception
            r3 = r7
            goto L_0x010a
        L_0x00b9:
            r0 = move-exception
            r3 = r7
            goto L_0x00f7
        L_0x00bc:
            r3 = r7
        L_0x00bd:
            if (r2 == 0) goto L_0x00dd
            com.facebook.h.c r0 = com.facebook.p955h.C13899b.f36263a     // Catch:{ OutOfMemoryError -> 0x00db }
            if (r2 == r0) goto L_0x00dd
            com.facebook.h.c r0 = com.facebook.p955h.C13899b.f36264b     // Catch:{ OutOfMemoryError -> 0x00db }
            if (r2 != r0) goto L_0x00ca
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ OutOfMemoryError -> 0x00db }
            goto L_0x00df
        L_0x00ca:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ OutOfMemoryError -> 0x00db }
            r9 = 14
            if (r0 < r9) goto L_0x00dd
            boolean r0 = com.facebook.p955h.C13899b.m28309b(r23)     // Catch:{ OutOfMemoryError -> 0x00db }
            if (r0 == 0) goto L_0x00dd
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.WEBP     // Catch:{ OutOfMemoryError -> 0x00db }
            goto L_0x00df
        L_0x00d9:
            r0 = move-exception
            goto L_0x010a
        L_0x00db:
            r0 = move-exception
            goto L_0x00f7
        L_0x00dd:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ OutOfMemoryError -> 0x00db }
        L_0x00df:
            int r2 = r4.intValue()     // Catch:{ OutOfMemoryError -> 0x00db }
            r4 = r20
            r3.compress(r0, r2, r4)     // Catch:{ OutOfMemoryError -> 0x00db }
            com.facebook.imagepipeline.q.a r0 = new com.facebook.imagepipeline.q.a     // Catch:{ OutOfMemoryError -> 0x00db }
            if (r5 <= r6) goto L_0x00ed
            r6 = 0
        L_0x00ed:
            r0.<init>(r6)     // Catch:{ OutOfMemoryError -> 0x00db }
            r3.recycle()
            r7.recycle()
            return r0
        L_0x00f7:
            java.lang.String r2 = "SimpleImageTranscoder"
            java.lang.String r4 = "Out-Of-Memory during transcode"
            com.facebook.common.p921e.C13697a.m27696c(r2, r4, r0)     // Catch:{ all -> 0x00d9 }
            com.facebook.imagepipeline.q.a r0 = new com.facebook.imagepipeline.q.a     // Catch:{ all -> 0x00d9 }
            r0.<init>(r8)     // Catch:{ all -> 0x00d9 }
            r3.recycle()
            r7.recycle()
            return r0
        L_0x010a:
            r3.recycle()
            r7.recycle()
            throw r0
        L_0x0111:
            r0 = move-exception
            java.lang.String r2 = "SimpleImageTranscoder"
            java.lang.String r3 = "Out-Of-Memory during transcode"
            com.facebook.common.p921e.C13697a.m27696c(r2, r3, r0)
            com.facebook.imagepipeline.q.a r0 = new com.facebook.imagepipeline.q.a
            r0.<init>(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p977q.C14247f.transcode(com.facebook.imagepipeline.j.e, java.io.OutputStream, com.facebook.imagepipeline.common.e, com.facebook.imagepipeline.common.d, com.facebook.h.c, java.lang.Integer):com.facebook.imagepipeline.q.a");
    }
}
