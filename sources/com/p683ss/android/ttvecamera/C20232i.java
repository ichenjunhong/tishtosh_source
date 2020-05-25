package com.p683ss.android.ttvecamera;

import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;

/* renamed from: com.ss.android.ttvecamera.i */
public final class C20232i {

    /* renamed from: a */
    public int f55591a;

    /* renamed from: b */
    public int f55592b;

    /* renamed from: c */
    public long f55593c;

    /* renamed from: d */
    public C20237d f55594d;

    /* renamed from: com.ss.android.ttvecamera.i$a */
    public static class C20234a extends C20237d {

        /* renamed from: a */
        public int f55596a;

        /* renamed from: b */
        public byte[] f55597b;

        public C20234a(int i, int i2, long j, byte[] bArr, int i3, C20235b bVar, int i4) {
            super(i, i2, j, i4);
            this.f55603e = 2;
            this.f55604f = i3;
            this.f55602d = bVar;
            this.f55597b = bArr;
            this.f55596a = i * i2 * 4;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.i$b */
    public enum C20235b {
        PIXEL_FORMAT_YUV420,
        PIXEL_FORMAT_YUV420P,
        PIXEL_FORMAT_NV12,
        PIXEL_FORMAT_NV21,
        PIXEL_FORMAT_YUYV422,
        PIXEL_FORMAT_YUV422P,
        PIXEL_FORMAT_UYVY422,
        PIXEL_FORMAT_GRAY8,
        PIXEL_FORMAT_RGB8,
        PIXEL_FORMAT_BGR8,
        PIXEL_FORMAT_ARGB8,
        PIXEL_FORMAT_RGBA8,
        PIXEL_FORMAT_BGRA8,
        PIXEL_FORMAT_OpenGL_GRAY,
        PIXEL_FORMAT_OpenGL_RGB8,
        PIXEL_FORMAT_OpenGL_RGBA8,
        PIXEL_FORMAT_OpenGL_OES,
        PIXEL_FORMAT_JPEG,
        PIXEL_FORMAT_BUFFER,
        PIXEL_FORMAT_Count
    }

    /* renamed from: com.ss.android.ttvecamera.i$c */
    public static class C20236c extends C20237d {

        /* renamed from: a */
        public int f55599a;

        /* renamed from: b */
        public float[] f55600b;

        public C20236c(int i, int i2, long j, int i3, int i4, float[] fArr, C20235b bVar, int i5) {
            super(i, i2, j, i5);
            this.f55603e = 1;
            this.f55599a = i3;
            this.f55604f = i4;
            this.f55600b = fArr;
            this.f55602d = bVar;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.i$d */
    public static class C20237d {

        /* renamed from: c */
        public TEFrameSizei f55601c;

        /* renamed from: d */
        public C20235b f55602d;

        /* renamed from: e */
        public int f55603e;

        /* renamed from: f */
        public int f55604f;

        /* renamed from: g */
        public long f55605g;

        /* renamed from: h */
        public int f55606h;

        public C20237d(int i, int i2, long j) {
            this(0, 0, 0, 0);
        }

        public C20237d(int i, int i2, long j, int i3) {
            this.f55601c = new TEFrameSizei(i, i2);
            this.f55605g = j;
            this.f55606h = i3;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.i$e */
    public static class C20238e extends C20237d {

        /* renamed from: a */
        public C20298q f55607a;

        public C20238e(int i, int i2, long j, C20298q qVar, int i3, C20235b bVar, int i4) {
            super(i, i2, j, i4);
            this.f55603e = 3;
            this.f55604f = i3;
            this.f55602d = bVar;
            this.f55607a = qVar;
        }
    }

    /* renamed from: a */
    public final int mo42836a() {
        return this.f55594d.f55604f;
    }

    /* renamed from: b */
    public final TEFrameSizei mo42839b() {
        return this.f55594d.f55601c;
    }

    /* renamed from: c */
    public final int mo42840c() {
        return this.f55594d.f55606h;
    }

    /* renamed from: a */
    public static int m50010a(C20235b bVar) {
        switch (bVar) {
            case PIXEL_FORMAT_YUV420:
                return 35;
            case PIXEL_FORMAT_YUV420P:
                return 842094169;
            case PIXEL_FORMAT_NV21:
                return 17;
            case PIXEL_FORMAT_YUV422P:
                return 16;
            case PIXEL_FORMAT_YUYV422:
            case PIXEL_FORMAT_UYVY422:
                return 39;
            case PIXEL_FORMAT_RGB8:
                return 41;
            case PIXEL_FORMAT_RGBA8:
                return 42;
            case PIXEL_FORMAT_JPEG:
                return UnReadVideoExperiment.BROWSE_RECORD_LIST;
            default:
                return 0;
        }
    }

    public C20232i(int i, int i2, long j) {
        this.f55594d = new C20237d(0, 0, 0);
        this.f55591a = i;
        this.f55592b = i2;
        this.f55593c = j;
    }

    /* renamed from: a */
    public final void mo42837a(C20298q qVar, int i, C20235b bVar, int i2) {
        C20238e eVar = new C20238e(this.f55591a, this.f55592b, this.f55593c, qVar, i, bVar, i2);
        this.f55594d = eVar;
    }

    /* renamed from: a */
    public final void mo42838a(byte[] bArr, int i, C20235b bVar, int i2) {
        C20234a aVar = new C20234a(this.f55591a, this.f55592b, this.f55593c, bArr, i, bVar, i2);
        this.f55594d = aVar;
    }

    public C20232i(C20298q qVar, C20235b bVar, int i, int i2, int i3) {
        this(i, i2, 0);
        mo42837a(qVar, i3, bVar, 0);
    }

    public C20232i(byte[] bArr, C20235b bVar, int i, int i2, int i3) {
        this(i, i2, 0);
        mo42838a(bArr, i3, bVar, 0);
    }
}
