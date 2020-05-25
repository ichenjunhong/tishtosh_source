package com.p683ss.android.ttvecamera.p1232g;

import android.graphics.SurfaceTexture;
import android.hardware.Camera.PreviewCallback;
import android.view.Surface;
import com.p683ss.android.ttvecamera.C20201f;
import com.p683ss.android.ttvecamera.C20285m;
import com.p683ss.android.ttvecamera.TEFrameSizei;
import com.p683ss.android.ttvecamera.p1232g.C20217c.C20218a;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.g.a */
public class C20212a extends C20214b {

    /* renamed from: i */
    private static final String f55540i = "a";

    /* renamed from: a */
    public PreviewCallback f55541a;

    /* renamed from: b */
    int f55542b;

    /* renamed from: j */
    private SurfaceTexture f55543j;

    /* renamed from: a */
    public final Surface mo42801a() {
        return null;
    }

    /* renamed from: b */
    public final SurfaceTexture mo42802b() {
        return this.f55543j;
    }

    /* renamed from: c */
    public final int mo42803c() {
        return 4;
    }

    /* renamed from: d */
    public final void mo42804d() {
    }

    public C20212a(C20218a aVar, C20201f fVar) {
        super(aVar, fVar);
        this.f55543j = aVar.f55558d;
    }

    /* renamed from: a */
    public final int mo42800a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f55548e = C20285m.m50046a(list, tEFrameSizei);
        }
        this.f55543j.setDefaultBufferSize(this.f55548e.f55398a, this.f55548e.f55399b);
        this.f55541a = new PreviewCallback() {
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
                if (r0 == false) goto L_0x0048;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onPreviewFrame(byte[] r10, android.hardware.Camera r11) {
                /*
                    r9 = this;
                    com.ss.android.ttvecamera.g.a r0 = com.p683ss.android.ttvecamera.p1232g.C20212a.this
                    r1 = 0
                    if (r10 == 0) goto L_0x0007
                    int r2 = r10.length
                    goto L_0x0008
                L_0x0007:
                    r2 = 0
                L_0x0008:
                    r3 = 1
                    if (r2 <= 0) goto L_0x0047
                    com.ss.android.ttvecamera.TEFrameSizei r2 = r0.f55548e
                    if (r2 == 0) goto L_0x0047
                    int r2 = r0.f55542b
                    r4 = 3
                    if (r2 >= r4) goto L_0x0047
                    int r2 = r0.f55542b
                    int r2 = r2 + r3
                    r0.f55542b = r2
                    com.ss.android.ttvecamera.TEFrameSizei r2 = r0.f55548e
                    int r2 = r2.f55398a
                    com.ss.android.ttvecamera.TEFrameSizei r0 = r0.f55548e
                    int r0 = r0.f55399b
                    int r2 = r2 * r0
                    int r0 = r2 / 300
                    int r4 = r0 / 2
                    byte r5 = r10[r1]
                    byte r6 = r10[r2]
                    r7 = 0
                L_0x002c:
                    r8 = 300(0x12c, float:4.2E-43)
                    if (r7 >= r8) goto L_0x0043
                    int r8 = r7 * r0
                    byte r8 = r10[r8]
                    if (r5 != r8) goto L_0x0041
                    int r8 = r7 * r4
                    int r8 = r8 + r2
                    byte r8 = r10[r8]
                    if (r6 == r8) goto L_0x003e
                    goto L_0x0041
                L_0x003e:
                    int r7 = r7 + 1
                    goto L_0x002c
                L_0x0041:
                    r0 = 1
                    goto L_0x0044
                L_0x0043:
                    r0 = 0
                L_0x0044:
                    if (r0 != 0) goto L_0x0047
                    goto L_0x0048
                L_0x0047:
                    r1 = 1
                L_0x0048:
                    if (r1 == 0) goto L_0x007d
                    com.ss.android.ttvecamera.i r0 = new com.ss.android.ttvecamera.i
                    com.ss.android.ttvecamera.g.a r1 = com.p683ss.android.ttvecamera.p1232g.C20212a.this
                    com.ss.android.ttvecamera.TEFrameSizei r1 = r1.f55548e
                    int r1 = r1.f55398a
                    com.ss.android.ttvecamera.g.a r2 = com.p683ss.android.ttvecamera.p1232g.C20212a.this
                    com.ss.android.ttvecamera.TEFrameSizei r2 = r2.f55548e
                    int r2 = r2.f55399b
                    long r3 = java.lang.System.currentTimeMillis()
                    r5 = 1000(0x3e8, double:4.94E-321)
                    long r3 = r3 * r5
                    r0.<init>(r1, r2, r3)
                    com.ss.android.ttvecamera.g.a r1 = com.p683ss.android.ttvecamera.p1232g.C20212a.this
                    com.ss.android.ttvecamera.f r1 = r1.f55549f
                    int r1 = r1.mo42779r()
                    com.ss.android.ttvecamera.i$b r2 = com.p683ss.android.ttvecamera.C20232i.C20235b.PIXEL_FORMAT_NV21
                    com.ss.android.ttvecamera.g.a r3 = com.p683ss.android.ttvecamera.p1232g.C20212a.this
                    com.ss.android.ttvecamera.f r3 = r3.f55549f
                    com.ss.android.ttvecamera.l r3 = r3.f55520h
                    int r3 = r3.f55723e
                    r0.mo42838a(r10, r1, r2, r3)
                    com.ss.android.ttvecamera.g.a r1 = com.p683ss.android.ttvecamera.p1232g.C20212a.this
                    r1.mo42807a(r0)
                L_0x007d:
                    if (r11 == 0) goto L_0x0082
                    r11.addCallbackBuffer(r10)
                L_0x0082:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttvecamera.p1232g.C20212a.C202131.onPreviewFrame(byte[], android.hardware.Camera):void");
            }
        };
        return 0;
    }
}
