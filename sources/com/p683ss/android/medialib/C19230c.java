package com.p683ss.android.medialib;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Pair;
import android.view.Surface;
import java.io.BufferedOutputStream;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.ss.android.medialib.c */
public class C19230c {

    /* renamed from: a */
    public static final String f53033a = "c";

    /* renamed from: b */
    static C19310d f53034b = null;

    /* renamed from: t */
    private static int f53035t = 2000;

    /* renamed from: A */
    private int f53036A = 0;

    /* renamed from: B */
    private int f53037B = 0;

    /* renamed from: c */
    BufferInfo f53038c;

    /* renamed from: d */
    ByteBuffer[] f53039d;

    /* renamed from: e */
    ByteBuffer[] f53040e;

    /* renamed from: f */
    public MediaCodec f53041f;

    /* renamed from: g */
    public Surface f53042g;

    /* renamed from: h */
    public C19345j f53043h;

    /* renamed from: i */
    public int f53044i = 0;

    /* renamed from: j */
    public int f53045j = 30;

    /* renamed from: k */
    public float f53046k = 1.0f;

    /* renamed from: l */
    public int f53047l = 1;

    /* renamed from: m */
    public float f53048m = 1.0f;

    /* renamed from: n */
    public float f53049n = 1.0f;

    /* renamed from: o */
    public float f53050o = 1.0f;

    /* renamed from: p */
    public float f53051p = 1.0f;

    /* renamed from: q */
    public float f53052q = 1.0f;

    /* renamed from: r */
    public float f53053r = 1.0f;

    /* renamed from: s */
    BufferedOutputStream f53054s = null;

    /* renamed from: u */
    private String f53055u = "video/avc";

    /* renamed from: v */
    private MediaCodecInfo f53056v;

    /* renamed from: w */
    private int f53057w;

    /* renamed from: x */
    private int f53058x;

    /* renamed from: y */
    private boolean f53059y;

    /* renamed from: z */
    private Queue<Pair<Integer, Integer>> f53060z = new LinkedList();

    static {
        new Thread(new Runnable() {
            public final void run() {
                MediaCodecList.getCodecCount();
            }
        }).start();
    }

    /* renamed from: a */
    private MediaCodecInfo m46874a() {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                for (String equalsIgnoreCase : supportedTypes) {
                    if (equalsIgnoreCase.equalsIgnoreCase(this.f53055u)) {
                        return codecInfoAt;
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m46875a(C19310d dVar) {
        f53034b = dVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:77|78|79) */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0139, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0138 */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a1 A[Catch:{ Exception -> 0x0138 }, LOOP:3: B:49:0x00a1->B:54:0x00ae, LOOP_START, PHI: r15 
      PHI: (r15v6 int) = (r15v2 int), (r15v8 int) binds: [B:48:0x009f, B:54:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b6 A[SYNTHETIC, Splitter:B:60:0x00b6] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.Surface mo39621a(int r11, int r12, int r13, int r14, boolean r15) {
        /*
            r10 = this;
            r14 = 0
            if (r15 != 0) goto L_0x0004
            return r14
        L_0x0004:
            int r15 = android.os.Build.VERSION.SDK_INT
            r0 = 18
            if (r15 >= r0) goto L_0x000b
            return r14
        L_0x000b:
            r15 = 0
            r10.f53036A = r15
            r10.f53037B = r15
            if (r11 <= 0) goto L_0x013c
            if (r12 > 0) goto L_0x0016
            goto L_0x013c
        L_0x0016:
            r10.f53057w = r11
            r10.f53058x = r12
            monitor-enter(r10)
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0138 }
            r1 = 21
            r2 = 1
            if (r0 < r1) goto L_0x005b
            android.media.MediaCodecList r0 = new android.media.MediaCodecList     // Catch:{ Exception -> 0x0138 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0138 }
            android.media.MediaCodecInfo[] r0 = r0.getCodecInfos()     // Catch:{ Exception -> 0x0138 }
            if (r0 == 0) goto L_0x0059
            int r3 = r0.length     // Catch:{ Exception -> 0x0138 }
            if (r3 != 0) goto L_0x0031
            goto L_0x0059
        L_0x0031:
            int r3 = r0.length     // Catch:{ Exception -> 0x0138 }
            r4 = 0
        L_0x0033:
            if (r4 >= r3) goto L_0x0059
            r5 = r0[r4]     // Catch:{ Exception -> 0x0138 }
            if (r5 == 0) goto L_0x0056
            boolean r6 = r5.isEncoder()     // Catch:{ Exception -> 0x0138 }
            if (r6 == 0) goto L_0x0056
            java.lang.String[] r6 = r5.getSupportedTypes()     // Catch:{ Exception -> 0x0138 }
            r7 = 0
        L_0x0044:
            int r8 = r6.length     // Catch:{ Exception -> 0x0138 }
            if (r7 >= r8) goto L_0x0056
            r8 = r6[r7]     // Catch:{ Exception -> 0x0138 }
            java.lang.String r9 = r10.f53055u     // Catch:{ Exception -> 0x0138 }
            boolean r8 = r8.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0138 }
            if (r8 == 0) goto L_0x0053
            r0 = r5
            goto L_0x005f
        L_0x0053:
            int r7 = r7 + 1
            goto L_0x0044
        L_0x0056:
            int r4 = r4 + 1
            goto L_0x0033
        L_0x0059:
            r0 = r14
            goto L_0x005f
        L_0x005b:
            android.media.MediaCodecInfo r0 = r10.m46874a()     // Catch:{ Exception -> 0x0138 }
        L_0x005f:
            r10.f53056v = r0     // Catch:{ Exception -> 0x0138 }
            android.media.MediaCodecInfo r0 = r10.f53056v     // Catch:{ Exception -> 0x0138 }
            if (r0 != 0) goto L_0x0067
        L_0x0065:
            r4 = r14
            goto L_0x009f
        L_0x0067:
            android.media.MediaCodecInfo r0 = r10.f53056v     // Catch:{ Exception -> 0x0138 }
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r3 = "OMX.google."
            boolean r3 = r0.startsWith(r3)     // Catch:{ Exception -> 0x0138 }
            if (r3 != 0) goto L_0x0065
            java.lang.String r3 = "OMX.Nvidia."
            boolean r3 = r0.startsWith(r3)     // Catch:{ Exception -> 0x0138 }
            if (r3 != 0) goto L_0x0065
            java.lang.String r3 = "OMX.TI.DUCATI1.VIDEO.H264E"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0138 }
            if (r0 == 0) goto L_0x0086
            goto L_0x0065
        L_0x0086:
            android.media.MediaCodecInfo r0 = r10.f53056v     // Catch:{ Exception -> 0x0138 }
            java.lang.String r3 = r10.f53055u     // Catch:{ Exception -> 0x0138 }
            android.media.MediaCodecInfo$CodecCapabilities r0 = r0.getCapabilitiesForType(r3)     // Catch:{ Exception -> 0x0138 }
            int[] r3 = r0.colorFormats     // Catch:{ Exception -> 0x0138 }
            int r3 = r3.length     // Catch:{ Exception -> 0x0138 }
            int[] r4 = new int[r3]     // Catch:{ Exception -> 0x0138 }
            r5 = 0
        L_0x0094:
            if (r5 >= r3) goto L_0x009f
            int[] r6 = r0.colorFormats     // Catch:{ Exception -> 0x0138 }
            r6 = r6[r5]     // Catch:{ Exception -> 0x0138 }
            r4[r5] = r6     // Catch:{ Exception -> 0x0138 }
            int r5 = r5 + 1
            goto L_0x0094
        L_0x009f:
            if (r4 == 0) goto L_0x00b1
        L_0x00a1:
            int r0 = r4.length     // Catch:{ Exception -> 0x0138 }
            if (r15 >= r0) goto L_0x00b1
            r0 = r4[r15]     // Catch:{ Exception -> 0x0138 }
            r3 = 2130708361(0x7f000789, float:1.701803E38)
            if (r0 != r3) goto L_0x00ae
            r15 = r4[r15]     // Catch:{ Exception -> 0x0138 }
            goto L_0x00b2
        L_0x00ae:
            int r15 = r15 + 1
            goto L_0x00a1
        L_0x00b1:
            r15 = -1
        L_0x00b2:
            if (r15 >= 0) goto L_0x00b6
            monitor-exit(r10)     // Catch:{ all -> 0x0136 }
            return r14
        L_0x00b6:
            com.ss.android.medialib.d r0 = f53034b     // Catch:{ Exception -> 0x0138 }
            if (r0 == 0) goto L_0x00bf
            com.ss.android.medialib.d r0 = f53034b     // Catch:{ Exception -> 0x0138 }
            r0.setColorFormatMark(r15)     // Catch:{ Exception -> 0x0138 }
        L_0x00bf:
            java.lang.String r0 = r10.f53055u     // Catch:{ Exception -> 0x0138 }
            android.media.MediaCodec r0 = android.media.MediaCodec.createEncoderByType(r0)     // Catch:{ Exception -> 0x0138 }
            r10.f53041f = r0     // Catch:{ Exception -> 0x0138 }
            r10.f53044i = r2     // Catch:{ Exception -> 0x0138 }
            java.lang.String r0 = r10.f53055u     // Catch:{ Exception -> 0x0138 }
            android.media.MediaFormat r11 = android.media.MediaFormat.createVideoFormat(r0, r11, r12)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r12 = "color-format"
            r11.setInteger(r12, r15)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r12 = "bitrate"
            int r13 = r13 * 1024
            int r13 = r13 * 1024
            r11.setInteger(r12, r13)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r12 = "frame-rate"
            int r13 = r10.f53045j     // Catch:{ Exception -> 0x0138 }
            r11.setInteger(r12, r13)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r12 = "i-frame-interval"
            r11.setInteger(r12, r2)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r12 = f53033a     // Catch:{ Exception -> 0x0138 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
            java.lang.String r15 = "initAVCEncoder: format = "
            r13.<init>(r15)     // Catch:{ Exception -> 0x0138 }
            r13.append(r11)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0138 }
            com.p683ss.android.vesdk.C50792y.m109909a(r12, r13)     // Catch:{ Exception -> 0x0138 }
            android.media.MediaCodec r12 = r10.f53041f     // Catch:{ Exception -> 0x0138 }
            r12.configure(r11, r14, r14, r2)     // Catch:{ Exception -> 0x0138 }
            android.media.MediaCodec r11 = r10.f53041f     // Catch:{ Exception -> 0x0138 }
            android.view.Surface r11 = r11.createInputSurface()     // Catch:{ Exception -> 0x0138 }
            r10.f53042g = r11     // Catch:{ Exception -> 0x0138 }
            android.media.MediaCodec r11 = r10.f53041f     // Catch:{ Exception -> 0x0138 }
            r11.start()     // Catch:{ Exception -> 0x0138 }
            r11 = 2
            r10.f53044i = r11     // Catch:{ Exception -> 0x0138 }
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0138 }
            if (r11 >= r1) goto L_0x0125
            android.media.MediaCodec r11 = r10.f53041f     // Catch:{ Exception -> 0x0138 }
            java.nio.ByteBuffer[] r11 = r11.getInputBuffers()     // Catch:{ Exception -> 0x0138 }
            r10.f53039d = r11     // Catch:{ Exception -> 0x0138 }
            android.media.MediaCodec r11 = r10.f53041f     // Catch:{ Exception -> 0x0138 }
            java.nio.ByteBuffer[] r11 = r11.getOutputBuffers()     // Catch:{ Exception -> 0x0138 }
            r10.f53040e = r11     // Catch:{ Exception -> 0x0138 }
        L_0x0125:
            android.media.MediaCodec$BufferInfo r11 = new android.media.MediaCodec$BufferInfo     // Catch:{ Exception -> 0x0138 }
            r11.<init>()     // Catch:{ Exception -> 0x0138 }
            r10.f53038c = r11     // Catch:{ Exception -> 0x0138 }
            android.view.Surface r11 = r10.f53042g     // Catch:{ all -> 0x0136 }
            if (r11 != 0) goto L_0x0132
            monitor-exit(r10)     // Catch:{ all -> 0x0136 }
            return r14
        L_0x0132:
            monitor-exit(r10)     // Catch:{ all -> 0x0136 }
            android.view.Surface r11 = r10.f53042g
            return r11
        L_0x0136:
            r11 = move-exception
            goto L_0x013a
        L_0x0138:
            monitor-exit(r10)     // Catch:{ all -> 0x0136 }
            return r14
        L_0x013a:
            monitor-exit(r10)     // Catch:{ all -> 0x0136 }
            throw r11
        L_0x013c:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.C19230c.mo39621a(int, int, int, int, boolean):android.view.Surface");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:24|25|26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ff, code lost:
        if (r12 >= 0) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0101, code lost:
        com.p683ss.android.vesdk.C50792y.m109913c(f53033a, "encode: error.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0117, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011a, code lost:
        if (android.os.Build.VERSION.SDK_INT < 21) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011c, code lost:
        r11 = r9.f53041f.getOutputBuffer(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0123, code lost:
        r11 = r9.f53040e[r12];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0127, code lost:
        r13 = r9.f53038c.size - r9.f53038c.offset;
        r11.position(r9.f53038c.offset);
        r0 = new byte[r13];
        r11.get(r0, 0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0141, code lost:
        if ((r9.f53038c.flags & 2) == 0) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0145, code lost:
        if (f53034b == null) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0147, code lost:
        f53034b.onMarkSetCodecConfig(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014c, code lost:
        r9.f53038c.size = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0156, code lost:
        if ((r9.f53038c.flags & 1) == 0) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0158, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015a, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015d, code lost:
        if (f53034b == null) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015f, code lost:
        r13 = f53033a;
        r5 = new java.lang.StringBuilder("encode: pts queue size = ");
        r5.append(r9.f53060z.size());
        com.p683ss.android.vesdk.C50792y.m109911b(r13, r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x017e, code lost:
        if (r9.f53060z.size() <= 0) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0180, code lost:
        r9.f53037B++;
        r13 = (android.util.Pair) r9.f53060z.poll();
        f53034b.onMarkWriteFile(r0, ((java.lang.Integer) r13.first).intValue(), ((java.lang.Integer) r13.second).intValue(), r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a3, code lost:
        com.p683ss.android.vesdk.C50792y.m109911b(f53033a, "encode: no available pts!!!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ab, code lost:
        com.p683ss.android.vesdk.C50792y.m109911b(f53033a, "encode: no output.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0093 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo39622b(int r10, int r11, int r12, int r13, boolean r14) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r9.f53044i     // Catch:{ all -> 0x01e1 }
            r1 = 2
            r2 = -1
            if (r0 != r1) goto L_0x01d8
            android.media.MediaCodec r0 = r9.f53041f     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x000d
            goto L_0x01d8
        L_0x000d:
            if (r10 <= 0) goto L_0x01bb
            if (r12 >= 0) goto L_0x0013
            goto L_0x01bb
        L_0x0013:
            com.ss.android.medialib.j r0 = r9.f53043h     // Catch:{ all -> 0x01e1 }
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0058
            android.view.Surface r0 = r9.f53042g     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = f53033a     // Catch:{ all -> 0x01e1 }
            java.lang.String r5 = "initEGLCtx: MediaCodec should initialized ahead."
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r5)     // Catch:{ all -> 0x01e1 }
            r0 = 0
            goto L_0x0054
        L_0x0026:
            float r0 = r9.f53052q     // Catch:{ all -> 0x01e1 }
            float r5 = r9.f53053r     // Catch:{ all -> 0x01e1 }
            com.ss.android.medialib.j r0 = com.p683ss.android.medialib.C19345j.m47241a(r0, r5)     // Catch:{ all -> 0x01e1 }
            r9.f53043h = r0     // Catch:{ all -> 0x01e1 }
            com.ss.android.medialib.j r0 = r9.f53043h     // Catch:{ all -> 0x01e1 }
            r5 = 0
            r0.mo39881a(r5)     // Catch:{ all -> 0x01e1 }
            com.ss.android.medialib.j r0 = r9.f53043h     // Catch:{ all -> 0x01e1 }
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.mo39885b(r5, r6)     // Catch:{ all -> 0x01e1 }
            com.ss.android.medialib.j r0 = r9.f53043h     // Catch:{ all -> 0x01e1 }
            float r5 = r9.f53046k     // Catch:{ all -> 0x01e1 }
            r0.mo39884b(r5)     // Catch:{ all -> 0x01e1 }
            com.ss.android.medialib.j r0 = r9.f53043h     // Catch:{ all -> 0x01e1 }
            float r5 = r9.f53048m     // Catch:{ all -> 0x01e1 }
            float r6 = r9.f53049n     // Catch:{ all -> 0x01e1 }
            float r7 = r9.f53050o     // Catch:{ all -> 0x01e1 }
            float r8 = r9.f53051p     // Catch:{ all -> 0x01e1 }
            r0.mo39882a(r5, r6, r7, r8)     // Catch:{ all -> 0x01e1 }
            r0 = 1
        L_0x0054:
            if (r0 != 0) goto L_0x0058
            monitor-exit(r9)     // Catch:{ all -> 0x01e1 }
            return r2
        L_0x0058:
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r0 = r9.f53060z     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x01e1 }
            android.util.Pair r12 = android.util.Pair.create(r12, r13)     // Catch:{ all -> 0x01e1 }
            r0.offer(r12)     // Catch:{ all -> 0x01e1 }
            int r12 = r9.f53057w     // Catch:{ all -> 0x01e1 }
            int r13 = r9.f53058x     // Catch:{ all -> 0x01e1 }
            android.opengl.GLES20.glViewport(r4, r4, r12, r13)     // Catch:{ all -> 0x01e1 }
            com.ss.android.medialib.j r12 = r9.f53043h     // Catch:{ all -> 0x01e1 }
            r13 = 3553(0xde1, float:4.979E-42)
            r12.mo39883a(r10, r11, r13)     // Catch:{ all -> 0x01e1 }
            android.opengl.GLES20.glFinish()     // Catch:{ all -> 0x01e1 }
            int r10 = r9.f53036A     // Catch:{ all -> 0x01e1 }
            int r10 = r10 + r3
            r9.f53036A = r10     // Catch:{ all -> 0x01e1 }
            com.ss.android.medialib.d r10 = f53034b     // Catch:{ all -> 0x01e1 }
            r10.onMarkSwapGlBuffers()     // Catch:{ all -> 0x01e1 }
            boolean r10 = r9.f53059y     // Catch:{ all -> 0x01e1 }
            if (r10 == 0) goto L_0x008a
            r9.f53059y = r4     // Catch:{ all -> 0x01e1 }
        L_0x008a:
            r10 = -2
            if (r14 == 0) goto L_0x0095
            android.media.MediaCodec r11 = r9.f53041f     // Catch:{ Throwable -> 0x0093 }
            r11.signalEndOfInputStream()     // Catch:{ Throwable -> 0x0093 }
            goto L_0x0095
        L_0x0093:
            monitor-exit(r9)     // Catch:{ all -> 0x01e1 }
            return r10
        L_0x0095:
            r11 = 0
        L_0x0096:
            int r11 = r11 + r3
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x01b9 }
            r13 = 21
            if (r12 >= r13) goto L_0x00a5
            android.media.MediaCodec r12 = r9.f53041f     // Catch:{ Throwable -> 0x01b9 }
            java.nio.ByteBuffer[] r12 = r12.getOutputBuffers()     // Catch:{ Throwable -> 0x01b9 }
            r9.f53040e = r12     // Catch:{ Throwable -> 0x01b9 }
        L_0x00a5:
            android.media.MediaCodec r12 = r9.f53041f     // Catch:{ Throwable -> 0x01b9 }
            android.media.MediaCodec$BufferInfo r0 = r9.f53038c     // Catch:{ Throwable -> 0x01b9 }
            int r5 = f53035t     // Catch:{ Throwable -> 0x01b9 }
            long r5 = (long) r5     // Catch:{ Throwable -> 0x01b9 }
            int r12 = r12.dequeueOutputBuffer(r0, r5)     // Catch:{ Throwable -> 0x01b9 }
            java.lang.String r0 = f53033a     // Catch:{ all -> 0x01e1 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            java.lang.String r6 = "outputBufferIndex = "
            r5.<init>(r6)     // Catch:{ all -> 0x01e1 }
            r5.append(r12)     // Catch:{ all -> 0x01e1 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x01e1 }
            com.p683ss.android.vesdk.C50792y.m109911b(r0, r5)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = f53033a     // Catch:{ all -> 0x01e1 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            java.lang.String r6 = "mBufferInfo.flags = "
            r5.<init>(r6)     // Catch:{ all -> 0x01e1 }
            android.media.MediaCodec$BufferInfo r6 = r9.f53038c     // Catch:{ all -> 0x01e1 }
            int r6 = r6.flags     // Catch:{ all -> 0x01e1 }
            r5.append(r6)     // Catch:{ all -> 0x01e1 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x01e1 }
            com.p683ss.android.vesdk.C50792y.m109911b(r0, r5)     // Catch:{ all -> 0x01e1 }
            if (r12 != r2) goto L_0x00e9
            if (r14 == 0) goto L_0x0108
            int r12 = r9.f53036A     // Catch:{ all -> 0x01e1 }
            int r13 = r9.f53037B     // Catch:{ all -> 0x01e1 }
            if (r12 == r13) goto L_0x0108
            r12 = 10
            if (r11 >= r12) goto L_0x0108
            goto L_0x0096
        L_0x00e9:
            r0 = -3
            if (r12 != r0) goto L_0x00f5
            android.media.MediaCodec r12 = r9.f53041f     // Catch:{ all -> 0x01e1 }
            java.nio.ByteBuffer[] r12 = r12.getOutputBuffers()     // Catch:{ all -> 0x01e1 }
            r9.f53040e = r12     // Catch:{ all -> 0x01e1 }
            goto L_0x0096
        L_0x00f5:
            if (r12 != r10) goto L_0x00ff
            java.lang.String r12 = f53033a     // Catch:{ all -> 0x01e1 }
            java.lang.String r13 = "encode: output format change!"
            com.p683ss.android.vesdk.C50792y.m109913c(r12, r13)     // Catch:{ all -> 0x01e1 }
            goto L_0x0096
        L_0x00ff:
            if (r12 >= 0) goto L_0x0118
            java.lang.String r10 = f53033a     // Catch:{ all -> 0x01e1 }
            java.lang.String r11 = "encode: error."
            com.p683ss.android.vesdk.C50792y.m109913c(r10, r11)     // Catch:{ all -> 0x01e1 }
        L_0x0108:
            if (r14 == 0) goto L_0x0116
            com.ss.android.medialib.j r10 = r9.f53043h     // Catch:{ all -> 0x01e1 }
            if (r10 == 0) goto L_0x0116
            com.ss.android.medialib.j r10 = r9.f53043h     // Catch:{ all -> 0x01e1 }
            r10.mo39880a()     // Catch:{ all -> 0x01e1 }
            r10 = 0
            r9.f53043h = r10     // Catch:{ all -> 0x01e1 }
        L_0x0116:
            monitor-exit(r9)     // Catch:{ all -> 0x01e1 }
            return r4
        L_0x0118:
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01e1 }
            if (r11 < r13) goto L_0x0123
            android.media.MediaCodec r11 = r9.f53041f     // Catch:{ all -> 0x01e1 }
            java.nio.ByteBuffer r11 = r11.getOutputBuffer(r12)     // Catch:{ all -> 0x01e1 }
            goto L_0x0127
        L_0x0123:
            java.nio.ByteBuffer[] r11 = r9.f53040e     // Catch:{ all -> 0x01e1 }
            r11 = r11[r12]     // Catch:{ all -> 0x01e1 }
        L_0x0127:
            android.media.MediaCodec$BufferInfo r13 = r9.f53038c     // Catch:{ all -> 0x01e1 }
            int r13 = r13.size     // Catch:{ all -> 0x01e1 }
            android.media.MediaCodec$BufferInfo r0 = r9.f53038c     // Catch:{ all -> 0x01e1 }
            int r0 = r0.offset     // Catch:{ all -> 0x01e1 }
            int r13 = r13 - r0
            android.media.MediaCodec$BufferInfo r0 = r9.f53038c     // Catch:{ all -> 0x01e1 }
            int r0 = r0.offset     // Catch:{ all -> 0x01e1 }
            r11.position(r0)     // Catch:{ all -> 0x01e1 }
            byte[] r0 = new byte[r13]     // Catch:{ all -> 0x01e1 }
            r11.get(r0, r4, r13)     // Catch:{ all -> 0x01e1 }
            android.media.MediaCodec$BufferInfo r11 = r9.f53038c     // Catch:{ all -> 0x01e1 }
            int r11 = r11.flags     // Catch:{ all -> 0x01e1 }
            r11 = r11 & r1
            if (r11 == 0) goto L_0x0151
            com.ss.android.medialib.d r11 = f53034b     // Catch:{ all -> 0x01e1 }
            if (r11 == 0) goto L_0x014c
            com.ss.android.medialib.d r11 = f53034b     // Catch:{ all -> 0x01e1 }
            r11.onMarkSetCodecConfig(r0)     // Catch:{ all -> 0x01e1 }
        L_0x014c:
            android.media.MediaCodec$BufferInfo r11 = r9.f53038c     // Catch:{ all -> 0x01e1 }
            r11.size = r4     // Catch:{ all -> 0x01e1 }
            goto L_0x01b2
        L_0x0151:
            android.media.MediaCodec$BufferInfo r11 = r9.f53038c     // Catch:{ all -> 0x01e1 }
            int r11 = r11.flags     // Catch:{ all -> 0x01e1 }
            r11 = r11 & r3
            if (r11 == 0) goto L_0x015a
            r11 = 1
            goto L_0x015b
        L_0x015a:
            r11 = 0
        L_0x015b:
            com.ss.android.medialib.d r13 = f53034b     // Catch:{ all -> 0x01e1 }
            if (r13 == 0) goto L_0x01ab
            java.lang.String r13 = f53033a     // Catch:{ all -> 0x01e1 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            java.lang.String r6 = "encode: pts queue size = "
            r5.<init>(r6)     // Catch:{ all -> 0x01e1 }
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r6 = r9.f53060z     // Catch:{ all -> 0x01e1 }
            int r6 = r6.size()     // Catch:{ all -> 0x01e1 }
            r5.append(r6)     // Catch:{ all -> 0x01e1 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x01e1 }
            com.p683ss.android.vesdk.C50792y.m109911b(r13, r5)     // Catch:{ all -> 0x01e1 }
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r13 = r9.f53060z     // Catch:{ all -> 0x01e1 }
            int r13 = r13.size()     // Catch:{ all -> 0x01e1 }
            if (r13 <= 0) goto L_0x01a3
            int r13 = r9.f53037B     // Catch:{ all -> 0x01e1 }
            int r13 = r13 + r3
            r9.f53037B = r13     // Catch:{ all -> 0x01e1 }
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r13 = r9.f53060z     // Catch:{ all -> 0x01e1 }
            java.lang.Object r13 = r13.poll()     // Catch:{ all -> 0x01e1 }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x01e1 }
            com.ss.android.medialib.d r5 = f53034b     // Catch:{ all -> 0x01e1 }
            java.lang.Object r6 = r13.first     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x01e1 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x01e1 }
            java.lang.Object r13 = r13.second     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x01e1 }
            int r13 = r13.intValue()     // Catch:{ all -> 0x01e1 }
            r5.onMarkWriteFile(r0, r6, r13, r11)     // Catch:{ all -> 0x01e1 }
            goto L_0x01b2
        L_0x01a3:
            java.lang.String r11 = f53033a     // Catch:{ all -> 0x01e1 }
            java.lang.String r13 = "encode: no available pts!!!"
            com.p683ss.android.vesdk.C50792y.m109911b(r11, r13)     // Catch:{ all -> 0x01e1 }
            goto L_0x01b2
        L_0x01ab:
            java.lang.String r11 = f53033a     // Catch:{ all -> 0x01e1 }
            java.lang.String r13 = "encode: no output."
            com.p683ss.android.vesdk.C50792y.m109911b(r11, r13)     // Catch:{ all -> 0x01e1 }
        L_0x01b2:
            android.media.MediaCodec r11 = r9.f53041f     // Catch:{ all -> 0x01e1 }
            r11.releaseOutputBuffer(r12, r4)     // Catch:{ all -> 0x01e1 }
            goto L_0x0095
        L_0x01b9:
            monitor-exit(r9)     // Catch:{ all -> 0x01e1 }
            return r10
        L_0x01bb:
            java.lang.String r11 = f53033a     // Catch:{ all -> 0x01e1 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            java.lang.String r14 = "encode: invalidate params: texID = "
            r13.<init>(r14)     // Catch:{ all -> 0x01e1 }
            r13.append(r10)     // Catch:{ all -> 0x01e1 }
            java.lang.String r10 = ", pts = "
            r13.append(r10)     // Catch:{ all -> 0x01e1 }
            r13.append(r12)     // Catch:{ all -> 0x01e1 }
            java.lang.String r10 = r13.toString()     // Catch:{ all -> 0x01e1 }
            com.p683ss.android.vesdk.C50792y.m109914d(r11, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r9)     // Catch:{ all -> 0x01e1 }
            return r2
        L_0x01d8:
            java.lang.String r10 = f53033a     // Catch:{ all -> 0x01e1 }
            java.lang.String r11 = "encode: codec is not reayd."
            com.p683ss.android.vesdk.C50792y.m109913c(r10, r11)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r9)     // Catch:{ all -> 0x01e1 }
            return r2
        L_0x01e1:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01e1 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.C19230c.mo39622b(int, int, int, int, boolean):int");
    }
}
