package com.p683ss.android.medialib;

/* renamed from: com.ss.android.medialib.FFMpegManager */
public class FFMpegManager {

    /* renamed from: b */
    private static volatile FFMpegManager f52943b;

    /* renamed from: a */
    public FFMpegInvoker f52944a = new FFMpegInvoker();

    /* renamed from: com.ss.android.medialib.FFMpegManager$EncoderListener */
    public interface EncoderListener {
        void onChooseEncoder(int i);
    }

    /* renamed from: com.ss.android.medialib.FFMpegManager$a */
    public static class C19212a {

        /* renamed from: a */
        public String f52945a = "";

        /* renamed from: b */
        public String f52946b = "";

        /* renamed from: c */
        public String f52947c = "";

        /* renamed from: d */
        public long f52948d;

        /* renamed from: e */
        public long f52949e;

        /* renamed from: f */
        public int f52950f;

        /* renamed from: g */
        public boolean f52951g;

        /* renamed from: h */
        public int f52952h;

        /* renamed from: i */
        public String f52953i = "";

        /* renamed from: j */
        public int f52954j;

        /* renamed from: k */
        public String f52955k = "";

        /* renamed from: l */
        public float f52956l = 1.0f;

        /* renamed from: m */
        public boolean f52957m;

        /* renamed from: n */
        public int f52958n = 3000;

        /* renamed from: o */
        public int f52959o = -1;

        /* renamed from: p */
        public int f52960p = -1;

        /* renamed from: q */
        public int f52961q = -1;

        /* renamed from: r */
        public int f52962r = -1;

        /* renamed from: s */
        public int f52963s = -1;

        /* renamed from: t */
        public int f52964t = -1;

        /* renamed from: u */
        public boolean f52965u = true;

        /* renamed from: v */
        public EncoderListener f52966v;
    }

    /* renamed from: b */
    public final int mo39234b() {
        return this.f52944a.uninitVideoToGraph();
    }

    /* renamed from: a */
    public static FFMpegManager m46826a() {
        synchronized (FFMpegManager.class) {
            if (f52943b == null) {
                synchronized (FFMpegManager.class) {
                    if (f52943b == null) {
                        f52943b = new FFMpegManager();
                    }
                }
            }
        }
        return f52943b;
    }

    /* renamed from: a */
    public final int[] mo39233a(String str) {
        return this.f52944a.initVideoToGraph(str, -1, -1);
    }

    /* renamed from: b */
    public final int mo39235b(String str) {
        return this.f52944a.checkAudioFile(str);
    }

    /* renamed from: a */
    public final int mo39231a(C19212a aVar) {
        C19212a aVar2 = aVar;
        C19216a.m46837a(0);
        FFMpegInvoker fFMpegInvoker = this.f52944a;
        String str = aVar2.f52945a;
        String str2 = aVar2.f52946b;
        String str3 = aVar2.f52947c;
        long j = aVar2.f52948d;
        long j2 = aVar2.f52949e;
        int i = aVar2.f52950f;
        boolean z = aVar2.f52951g;
        int rencodeAndSplitFile = fFMpegInvoker.rencodeAndSplitFile(str, str2, str3, j, j2, i, z ? 1 : 0, aVar2.f52952h, aVar2.f52953i, aVar2.f52954j, aVar2.f52955k, aVar2.f52956l, aVar2.f52957m, aVar2.f52965u, aVar2.f52958n, aVar2.f52959o, aVar2.f52960p, aVar2.f52961q, aVar2.f52962r, aVar2.f52963s, aVar2.f52964t, aVar2.f52966v);
        C19216a.m46837a(10000);
        return rencodeAndSplitFile;
    }

    /* renamed from: a */
    public final int mo39232a(String str, long j, long j2) {
        return this.f52944a.isCanImport(str, j, j2);
    }
}
