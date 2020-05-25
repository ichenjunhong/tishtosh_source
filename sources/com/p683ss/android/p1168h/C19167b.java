package com.p683ss.android.p1168h;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.p683ss.android.vesdk.C50792y;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.ss.android.h.b */
public class C19167b {

    /* renamed from: a */
    public static String f52831a = "b";

    /* renamed from: b */
    public static boolean f52832b = true;

    /* renamed from: c */
    public static String f52833c = null;

    /* renamed from: n */
    private static String f52834n = "video/avc";

    /* renamed from: d */
    public boolean f52835d;

    /* renamed from: e */
    public int[] f52836e;

    /* renamed from: f */
    public SurfaceTexture f52837f;

    /* renamed from: g */
    public Surface f52838g;

    /* renamed from: h */
    public C19169a f52839h;

    /* renamed from: i */
    public MediaCodec f52840i;

    /* renamed from: j */
    public HandlerThread f52841j;

    /* renamed from: k */
    public Object f52842k;

    /* renamed from: l */
    public boolean f52843l;

    /* renamed from: m */
    public int f52844m;

    /* renamed from: o */
    private int f52845o;

    /* renamed from: p */
    private int f52846p;

    /* renamed from: q */
    private MediaFormat f52847q;

    /* renamed from: r */
    private BufferInfo f52848r;

    /* renamed from: s */
    private ByteBuffer[] f52849s;

    /* renamed from: t */
    private Handler f52850t;

    /* renamed from: u */
    private OnFrameAvailableListener f52851u;

    /* renamed from: v */
    private boolean f52852v;

    /* renamed from: w */
    private long f52853w;

    /* renamed from: x */
    private long f52854x;

    /* renamed from: com.ss.android.h.b$a */
    public static class C19169a {

        /* renamed from: a */
        FloatBuffer f52856a = ByteBuffer.allocateDirect(this.f52866k.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();

        /* renamed from: b */
        float[] f52857b = new float[16];

        /* renamed from: c */
        float[] f52858c = new float[16];

        /* renamed from: d */
        public int f52859d;

        /* renamed from: e */
        int f52860e;

        /* renamed from: f */
        int f52861f;

        /* renamed from: g */
        int f52862g;

        /* renamed from: h */
        int f52863h;

        /* renamed from: i */
        public int[] f52864i = new int[1];

        /* renamed from: j */
        int f52865j;

        /* renamed from: k */
        private final float[] f52866k = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

        /* renamed from: a */
        public static void m46735a(String str) {
            while (true) {
                int glGetError = GLES20.glGetError();
                if (glGetError != 0) {
                    String str2 = C19167b.f52831a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(": glError ");
                    sb.append(glGetError);
                    C50792y.m109914d(str2, sb.toString());
                } else {
                    return;
                }
            }
        }

        public C19169a(SurfaceTexture surfaceTexture) {
            this.f52856a.put(this.f52866k).position(0);
            if (surfaceTexture != null) {
                surfaceTexture.getTransformMatrix(this.f52858c);
            } else {
                Matrix.setIdentityM(this.f52858c, 0);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo39114a(int i, String str) {
            int glCreateShader = GLES20.glCreateShader(i);
            StringBuilder sb = new StringBuilder("glCreateShader type=");
            sb.append(i);
            m46735a(sb.toString());
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 0) {
                return glCreateShader;
            }
            String str2 = C19167b.f52831a;
            StringBuilder sb2 = new StringBuilder("Could not compile shader ");
            sb2.append(i);
            sb2.append(":");
            C50792y.m109914d(str2, sb2.toString());
            String str3 = C19167b.f52831a;
            StringBuilder sb3 = new StringBuilder(" ");
            sb3.append(GLES20.glGetShaderInfoLog(glCreateShader));
            C50792y.m109914d(str3, sb3.toString());
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
    }

    public C19167b() {
        this.f52835d = true;
        this.f52836e = new int[1];
        this.f52848r = new BufferInfo();
        this.f52842k = new Object();
        this.f52843l = false;
        this.f52851u = new OnFrameAvailableListener() {
            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                synchronized (C19167b.this.f52842k) {
                    C19167b.this.f52843l = true;
                    C19167b.this.f52842k.notify();
                }
            }
        };
        this.f52852v = false;
        this.f52853w = 10000;
        this.f52854x = 10000;
        this.f52844m = 0;
        this.f52841j = new HandlerThread(f52831a);
        this.f52841j.start();
        this.f52850t = new Handler(this.f52841j.getLooper());
    }

    /* renamed from: a */
    private static MediaCodecInfo m46732a(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    for (String equalsIgnoreCase : supportedTypes) {
                        if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public C19167b(boolean z, String str) {
        this();
        f52832b = z;
        f52833c = str;
    }

    /* renamed from: a */
    private int m46731a(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int i4) {
        int i5;
        int i6 = i3;
        int i7 = i4;
        MediaCodecInfo mediaCodecInfo = null;
        if (VERSION.SDK_INT >= 21) {
            String str = f52834n;
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            if (codecInfos != null && codecInfos.length != 0) {
                int length = codecInfos.length;
                int i8 = 0;
                loop0:
                while (true) {
                    if (i8 >= length) {
                        break;
                    }
                    MediaCodecInfo mediaCodecInfo2 = codecInfos[i8];
                    if (mediaCodecInfo2 != null && !mediaCodecInfo2.isEncoder()) {
                        String name = mediaCodecInfo2.getName();
                        if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                            String[] supportedTypes = mediaCodecInfo2.getSupportedTypes();
                            for (String equalsIgnoreCase : supportedTypes) {
                                if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                                    mediaCodecInfo = mediaCodecInfo2;
                                    break loop0;
                                }
                            }
                            continue;
                        }
                    }
                    i8++;
                }
            }
        } else {
            mediaCodecInfo = m46732a(f52834n);
        }
        if (mediaCodecInfo == null) {
            String str2 = f52831a;
            StringBuilder sb = new StringBuilder("MediaCodecInfo is null, ");
            sb.append(f52834n);
            sb.append(" is not supported!");
            C50792y.m109914d(str2, sb.toString());
            return C19166a.f52822d;
        } else if (!mediaCodecInfo.getCapabilitiesForType(f52834n).getVideoCapabilities().isSizeSupported(i6, i7)) {
            String str3 = f52831a;
            StringBuilder sb2 = new StringBuilder("is not size support! width: ");
            sb2.append(i6);
            sb2.append(" height: ");
            sb2.append(i7);
            C50792y.m109914d(str3, sb2.toString());
            return C19166a.f52823e;
        } else {
            this.f52845o = i6;
            this.f52846p = i7;
            this.f52847q = MediaFormat.createVideoFormat(f52834n, i6, i7);
            if (bArr != null && i > 0) {
                this.f52847q.setByteBuffer("csd-0", ByteBuffer.wrap(bArr));
            }
            if (bArr2 != null && i2 > 0) {
                this.f52847q.setByteBuffer("csd-1", ByteBuffer.wrap(bArr2));
            }
            MediaFormat mediaFormat = this.f52847q;
            String str4 = "color-format";
            if (this.f52835d) {
                i5 = 2130708361;
            } else {
                i5 = 2135033992;
            }
            mediaFormat.setInteger(str4, i5);
            try {
                this.f52840i = MediaCodec.createDecoderByType(f52834n);
                return C19166a.f52819a;
            } catch (IOException e) {
                String str5 = f52831a;
                StringBuilder sb3 = new StringBuilder("createDecoderByType failed: ");
                sb3.append(e.getMessage());
                C50792y.m109914d(str5, sb3.toString());
                return C19166a.f52824f;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:33|34|35|36) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00ea */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo39111a(byte[] r21, int r22, long r23, byte[] r25, int r26, int r27, int r28) {
        /*
            r20 = this;
            r1 = r20
            r0 = r22
            r9 = r25
            r10 = r26
            boolean r2 = r1.f52852v
            r11 = 1
            r12 = 0
            if (r2 != 0) goto L_0x0083
            android.media.MediaCodec r2 = r1.f52840i
            long r3 = r1.f52853w
            int r2 = r2.dequeueInputBuffer(r3)
            r14 = r2
            r2 = 1
        L_0x0018:
            if (r14 >= 0) goto L_0x0041
            r3 = 10
            if (r2 > r3) goto L_0x0041
            int r2 = r2 + 1
            java.lang.String r3 = f52831a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "try input index count: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.p683ss.android.vesdk.C50792y.m109914d(r3, r4)
            r3 = 5
            java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x0038 }
        L_0x0038:
            android.media.MediaCodec r3 = r1.f52840i
            long r4 = r1.f52853w
            int r14 = r3.dequeueInputBuffer(r4)
            goto L_0x0018
        L_0x0041:
            if (r14 < 0) goto L_0x0079
            if (r0 > 0) goto L_0x005b
            android.media.MediaCodec r13 = r1.f52840i
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 4
            r13.queueInputBuffer(r14, r15, r16, r17, r19)
            r1.f52852v = r11
            java.lang.String r0 = f52831a
            java.lang.String r2 = "input signal EOS!"
            com.p683ss.android.vesdk.C50792y.m109909a(r0, r2)
            goto L_0x0083
        L_0x005b:
            android.media.MediaCodec r2 = r1.f52840i
            java.nio.ByteBuffer r2 = r2.getInputBuffer(r14)
            r2.clear()
            r2.position(r12)
            r3 = r21
            r2.put(r3, r12, r0)
            android.media.MediaCodec r2 = r1.f52840i
            r4 = 0
            r8 = 0
            r3 = r14
            r5 = r22
            r6 = r23
            r2.queueInputBuffer(r3, r4, r5, r6, r8)
            goto L_0x0083
        L_0x0079:
            java.lang.String r0 = f52831a
            java.lang.String r2 = "inputIndex < 0"
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r2)
            int r0 = com.p683ss.android.p1168h.C19166a.f52827i
            return r0
        L_0x0083:
            android.media.MediaCodec r0 = r1.f52840i
            android.media.MediaCodec$BufferInfo r2 = r1.f52848r
            long r3 = r1.f52854x
            int r0 = r0.dequeueOutputBuffer(r2, r3)
            int r2 = com.p683ss.android.p1168h.C19166a.f52819a
            switch(r0) {
                case -3: goto L_0x00b6;
                case -2: goto L_0x00ad;
                case -1: goto L_0x00a4;
                default: goto L_0x0092;
            }
        L_0x0092:
            android.media.MediaCodec$BufferInfo r2 = r1.f52848r
            int r2 = r2.flags
            r3 = 4
            r2 = r2 & r3
            if (r2 == 0) goto L_0x00c7
            java.lang.String r0 = f52831a
            java.lang.String r2 = "decode output accept EOS, all decode tasks has been done!"
            com.p683ss.android.vesdk.C50792y.m109909a(r0, r2)
            int r0 = com.p683ss.android.p1168h.C19166a.f52820b
            return r0
        L_0x00a4:
            java.lang.String r0 = f52831a
            java.lang.String r3 = "MediaCodec output try again later!"
            com.p683ss.android.vesdk.C50792y.m109909a(r0, r3)
            goto L_0x02d4
        L_0x00ad:
            java.lang.String r0 = f52831a
            java.lang.String r3 = "MediaCodec output format changed!"
            com.p683ss.android.vesdk.C50792y.m109909a(r0, r3)
            goto L_0x02d4
        L_0x00b6:
            java.lang.String r0 = f52831a
            java.lang.String r3 = "MediaCodec output buffers changed!"
            com.p683ss.android.vesdk.C50792y.m109909a(r0, r3)
            android.media.MediaCodec r0 = r1.f52840i
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()
            r1.f52849s = r0
            goto L_0x02d4
        L_0x00c7:
            java.lang.String r2 = f52831a
            java.lang.String r4 = "MediaCodec output new decodeFrame!"
            com.p683ss.android.vesdk.C50792y.m109911b(r2, r4)
            int r2 = r1.f52844m
            int r2 = r2 + r11
            r1.f52844m = r2
            int r2 = com.p683ss.android.p1168h.C19166a.f52821c
            boolean r4 = r1.f52835d
            if (r4 == 0) goto L_0x0294
            android.media.MediaCodec r4 = r1.f52840i
            r4.releaseOutputBuffer(r0, r11)
            java.lang.Object r4 = r1.f52842k
            monitor-enter(r4)
            boolean r0 = r1.f52843l     // Catch:{ all -> 0x0291 }
            if (r0 != 0) goto L_0x00ec
            java.lang.Object r0 = r1.f52842k     // Catch:{ InterruptedException -> 0x00ea }
            r0.wait()     // Catch:{ InterruptedException -> 0x00ea }
        L_0x00ea:
            r1.f52843l = r12     // Catch:{ all -> 0x0291 }
        L_0x00ec:
            monitor-exit(r4)     // Catch:{ all -> 0x0291 }
            android.graphics.SurfaceTexture r0 = r1.f52837f
            r0.updateTexImage()
            com.ss.android.h.b$a r0 = r1.f52839h
            int[] r4 = r1.f52836e
            r4 = r4[r12]
            r5 = r27
            r6 = r28
            android.opengl.GLES20.glViewport(r12, r12, r5, r6)
            r5 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r5, r10)
            java.lang.String r6 = "glBindTexture"
            com.p683ss.android.p1168h.C19167b.C19169a.m46735a(r6)
            int[] r6 = r0.f52864i
            r6 = r6[r12]
            r7 = 36160(0x8d40, float:5.0671E-41)
            android.opengl.GLES20.glBindFramebuffer(r7, r6)
            r6 = 36064(0x8ce0, float:5.0536E-41)
            android.opengl.GLES20.glFramebufferTexture2D(r7, r6, r5, r10, r12)
            java.lang.String r8 = "glFramebufferTexture2D"
            com.p683ss.android.p1168h.C19167b.C19169a.m46735a(r8)
            java.lang.String r8 = "onDrawFrame start"
            com.p683ss.android.p1168h.C19167b.C19169a.m46735a(r8)
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            android.opengl.GLES20.glClearColor(r9, r8, r9, r8)
            r8 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r8)
            int r8 = r0.f52859d
            android.opengl.GLES20.glUseProgram(r8)
            java.lang.String r8 = "glUseProgram"
            com.p683ss.android.p1168h.C19167b.C19169a.m46735a(r8)
            r8 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r8)
            r8 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r8, r4)
            java.lang.String r4 = "glBindTexture"
            com.p683ss.android.p1168h.C19167b.C19169a.m46735a(r4)
            java.nio.FloatBuffer r4 = r0.f52856a
            r4.position(r12)
            int r4 = r0.f52862g
            r9 = 3
            r10 = 5126(0x1406, float:7.183E-42)
            r13 = 0
            r14 = 20
            java.nio.FloatBuffer r15 = r0.f52856a
            r21 = r4
            r22 = r9
            r23 = r10
            r24 = r13
            r25 = r14
            r26 = r15
            android.opengl.GLES20.glVertexAttribPointer(r21, r22, r23, r24, r25, r26)
            java.lang.String r4 = "glVertexAttribPointer maPosition"
            com.p683ss.android.p1168h.C19167b.C19169a.m46735a(r4)
            int r4 = r0.f52862g
            android.opengl.GLES20.glEnableVertexAttribArray(r4)
            java.lang.String r4 = "glEnableVertexAttribArray maPositionHandle"
            com.p683ss.android.p1168h.C19167b.C19169a.m46735a(r4)
            java.nio.FloatBuffer r4 = r0.f52856a
            r4.position(r9)
            int r4 = r0.f52863h
            r9 = 2
            java.nio.FloatBuffer r15 = r0.f52856a
            r21 = r4
            r22 = r9
            r26 = r15
            android.opengl.GLES20.glVertexAttribPointer(r21, r22, r23, r24, r25, r26)
            java.lang.String r4 = "glVertexAttribPointer maTextureHandle"
            com.p683ss.android.p1168h.C19167b.C19169a.m46735a(r4)
            int r4 = r0.f52863h
            android.opengl.GLES20.glEnableVertexAttribArray(r4)
            java.lang.String r4 = "glEnableVertexAttribArray maTextureHandle"
            com.p683ss.android.p1168h.C19167b.C19169a.m46735a(r4)
            float[] r4 = r0.f52857b
            android.opengl.Matrix.setIdentityM(r4, r12)
            int r4 = r0.f52860e
            float[] r9 = r0.f52857b
            android.opengl.GLES20.glUniformMatrix4fv(r4, r11, r12, r9, r12)
            int r4 = r0.f52861f
            float[] r9 = r0.f52858c
            android.opengl.GLES20.glUniformMatrix4fv(r4, r11, r12, r9, r12)
            r4 = 5
            android.opengl.GLES20.glDrawArrays(r4, r12, r3)
            java.lang.String r3 = "glDrawArrays"
            com.p683ss.android.p1168h.C19167b.C19169a.m46735a(r3)
            int r3 = r0.f52862g
            android.opengl.GLES20.glDisableVertexAttribArray(r3)
            int r3 = r0.f52863h
            android.opengl.GLES20.glDisableVertexAttribArray(r3)
            android.opengl.GLES20.glBindTexture(r8, r12)
            android.opengl.GLES20.glBindTexture(r5, r12)
            boolean r3 = f52832b
            if (r3 == 0) goto L_0x0287
            r3 = 3686400(0x384000, float:5.165747E-39)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocateDirect(r3)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.nativeOrder()
            r3.order(r4)
            r3.position(r12)
            r4 = 0
            r8 = 0
            r9 = 720(0x2d0, float:1.009E-42)
            r10 = 1280(0x500, float:1.794E-42)
            r13 = 6408(0x1908, float:8.98E-42)
            r14 = 5121(0x1401, float:7.176E-42)
            r21 = r4
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r13
            r26 = r14
            r27 = r3
            android.opengl.GLES20.glReadPixels(r21, r22, r23, r24, r25, r26, r27)
            r4 = 720(0x2d0, float:1.009E-42)
            r8 = 1280(0x500, float:1.794E-42)
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r8, r9)
            r4.copyPixelsFromBuffer(r3)
            int r3 = r0.f52865j
            int r3 = r3 + r11
            r0.f52865j = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r8 = f52833c
            r3.<init>(r8)
            java.lang.String r8 = "decode"
            r3.append(r8)
            int r0 = r0.f52865j
            r3.append(r0)
            java.lang.String r0 = ".jpg"
            r3.append(r0)
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x026d, all -> 0x0251 }
            java.lang.String r8 = r3.toString()     // Catch:{ IOException -> 0x026d, all -> 0x0251 }
            r0.<init>(r8)     // Catch:{ IOException -> 0x026d, all -> 0x0251 }
            boolean r8 = r0.exists()     // Catch:{ IOException -> 0x026d, all -> 0x0251 }
            if (r8 != 0) goto L_0x0235
            java.io.File r8 = r0.getParentFile()     // Catch:{ IOException -> 0x026d, all -> 0x0251 }
            r8.mkdirs()     // Catch:{ IOException -> 0x026d, all -> 0x0251 }
            r0.createNewFile()     // Catch:{ IOException -> 0x026d, all -> 0x0251 }
        L_0x0235:
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x026d, all -> 0x0251 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x026d, all -> 0x0251 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x026d, all -> 0x0251 }
            r9 = 100
            r4.compress(r0, r9, r8)     // Catch:{ IOException -> 0x026d, all -> 0x0251 }
            r8.flush()     // Catch:{ IOException -> 0x026d, all -> 0x0251 }
            r8.close()     // Catch:{ IOException -> 0x026d, all -> 0x0251 }
            java.lang.String r0 = f52831a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "saveFile: "
            r8.<init>(r9)
            goto L_0x0276
        L_0x0251:
            r0 = move-exception
            java.lang.String r2 = f52831a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "saveFile: "
            r5.<init>(r6)
            java.lang.String r3 = r3.toString()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.p683ss.android.vesdk.C50792y.m109909a(r2, r3)
            r4.recycle()
            throw r0
        L_0x026d:
            java.lang.String r0 = f52831a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "saveFile: "
            r8.<init>(r9)
        L_0x0276:
            java.lang.String r3 = r3.toString()
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            com.p683ss.android.vesdk.C50792y.m109909a(r0, r3)
            r4.recycle()
        L_0x0287:
            android.opengl.GLES20.glFramebufferTexture2D(r7, r6, r5, r12, r12)
            android.opengl.GLES20.glBindFramebuffer(r7, r12)
            android.opengl.GLES20.glFinish()
            goto L_0x02d4
        L_0x0291:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0291 }
            throw r0
        L_0x0294:
            java.nio.ByteBuffer[] r3 = r1.f52849s
            r3 = r3[r0]
            int r4 = r9.length
            if (r4 >= 0) goto L_0x02a5
            java.lang.String r2 = f52831a
            java.lang.String r3 = "dstBuffer is invalid!"
            com.p683ss.android.vesdk.C50792y.m109914d(r2, r3)
            int r2 = com.p683ss.android.p1168h.C19166a.f52830l
            goto L_0x02cf
        L_0x02a5:
            java.lang.String r4 = f52831a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r6 = r9.length
            r5.append(r6)
            java.lang.String r6 = ", "
            r5.append(r6)
            int r6 = r3.remaining()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.p683ss.android.vesdk.C50792y.m109911b(r4, r5)
            int r4 = r9.length
            int r5 = r3.remaining()
            int r4 = java.lang.Math.min(r4, r5)
            r3.get(r9, r12, r4)
        L_0x02cf:
            android.media.MediaCodec r3 = r1.f52840i
            r3.releaseOutputBuffer(r0, r12)
        L_0x02d4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1168h.C19167b.mo39111a(byte[], int, long, byte[], int, int, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0173  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo39112a(byte[] r3, int r4, byte[] r5, int r6, int r7, int r8, boolean r9) {
        /*
            r2 = this;
            r2.f52835d = r9
            int r3 = r2.m46731a(r3, r4, r5, r6, r7, r8)
            int r4 = com.p683ss.android.p1168h.C19166a.f52819a
            if (r3 == r4) goto L_0x000b
            return r3
        L_0x000b:
            java.lang.String r3 = f52831a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "use decode to surface: "
            r4.<init>(r5)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            com.p683ss.android.vesdk.C50792y.m109909a(r3, r4)
            r3 = 0
            r4 = 0
            if (r9 == 0) goto L_0x017b
            int[] r5 = r2.f52836e
            r5 = r5[r4]
            r6 = 1
            if (r5 != 0) goto L_0x0066
            int[] r5 = r2.f52836e
            android.opengl.GLES20.glGenTextures(r6, r5, r4)
            int[] r5 = r2.f52836e
            r5 = r5[r4]
            if (r5 > 0) goto L_0x003c
            java.lang.String r5 = f52831a
            java.lang.String r7 = "createTexture failed"
            com.p683ss.android.vesdk.C50792y.m109914d(r5, r7)
            goto L_0x0066
        L_0x003c:
            int[] r5 = r2.f52836e
            r5 = r5[r4]
            r7 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r7, r5)
            r5 = 10241(0x2801, float:1.435E-41)
            r8 = 1175977984(0x46180000, float:9728.0)
            android.opengl.GLES20.glTexParameterf(r7, r5, r8)
            r5 = 10240(0x2800, float:1.4349E-41)
            r8 = 1175979008(0x46180400, float:9729.0)
            android.opengl.GLES20.glTexParameterf(r7, r5, r8)
            r5 = 10242(0x2802, float:1.4352E-41)
            r8 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r7, r5, r8)
            r5 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r7, r5, r8)
            int[] r5 = r2.f52836e
            r5 = r5[r4]
        L_0x0066:
            android.graphics.SurfaceTexture r5 = new android.graphics.SurfaceTexture
            int[] r7 = r2.f52836e
            r7 = r7[r4]
            r5.<init>(r7)
            r2.f52837f = r5
            android.graphics.SurfaceTexture r5 = r2.f52837f
            android.graphics.SurfaceTexture$OnFrameAvailableListener r7 = r2.f52851u
            android.os.Handler r8 = r2.f52850t
            r5.setOnFrameAvailableListener(r7, r8)
            android.view.Surface r5 = new android.view.Surface
            android.graphics.SurfaceTexture r7 = r2.f52837f
            r5.<init>(r7)
            r2.f52838g = r5
            com.ss.android.h.b$a r5 = new com.ss.android.h.b$a
            android.graphics.SurfaceTexture r7 = r2.f52837f
            r5.<init>(r7)
            r2.f52839h = r5
            com.ss.android.h.b$a r5 = r2.f52839h
            java.lang.String r7 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n"
            java.lang.String r8 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"
            r9 = 35633(0x8b31, float:4.9932E-41)
            int r7 = r5.mo39114a(r9, r7)
            if (r7 != 0) goto L_0x009d
        L_0x009b:
            r9 = 0
            goto L_0x00ec
        L_0x009d:
            r9 = 35632(0x8b30, float:4.9931E-41)
            int r8 = r5.mo39114a(r9, r8)
            if (r8 != 0) goto L_0x00a7
            goto L_0x009b
        L_0x00a7:
            int r9 = android.opengl.GLES20.glCreateProgram()
            java.lang.String r0 = "glCreateProgram"
            com.p683ss.android.p1168h.C19167b.C19169a.m46735a(r0)
            if (r9 != 0) goto L_0x00b9
            java.lang.String r0 = f52831a
            java.lang.String r1 = "Could not create program"
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r1)
        L_0x00b9:
            android.opengl.GLES20.glAttachShader(r9, r7)
            java.lang.String r7 = "glAttachShader"
            com.p683ss.android.p1168h.C19167b.C19169a.m46735a(r7)
            android.opengl.GLES20.glAttachShader(r9, r8)
            java.lang.String r7 = "glAttachShader"
            com.p683ss.android.p1168h.C19167b.C19169a.m46735a(r7)
            android.opengl.GLES20.glLinkProgram(r9)
            int[] r7 = new int[r6]
            r8 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r9, r8, r7, r4)
            r7 = r7[r4]
            if (r7 == r6) goto L_0x00ec
            java.lang.String r7 = f52831a
            java.lang.String r8 = "Could not link program: "
            com.p683ss.android.vesdk.C50792y.m109914d(r7, r8)
            java.lang.String r7 = f52831a
            java.lang.String r8 = android.opengl.GLES20.glGetProgramInfoLog(r9)
            com.p683ss.android.vesdk.C50792y.m109914d(r7, r8)
            android.opengl.GLES20.glDeleteProgram(r9)
            goto L_0x009b
        L_0x00ec:
            r5.f52859d = r9
            int r7 = r5.f52859d
            if (r7 == 0) goto L_0x0173
            int r7 = r5.f52859d
            java.lang.String r8 = "aPosition"
            int r7 = android.opengl.GLES20.glGetAttribLocation(r7, r8)
            r5.f52862g = r7
            java.lang.String r7 = "glGetAttribLocation aPosition"
            com.p683ss.android.p1168h.C19167b.C19169a.m46735a(r7)
            int r7 = r5.f52862g
            r8 = -1
            if (r7 == r8) goto L_0x016b
            int r7 = r5.f52859d
            java.lang.String r9 = "aTextureCoord"
            int r7 = android.opengl.GLES20.glGetAttribLocation(r7, r9)
            r5.f52863h = r7
            java.lang.String r7 = "glGetAttribLocation aTextureCoord"
            com.p683ss.android.p1168h.C19167b.C19169a.m46735a(r7)
            int r7 = r5.f52863h
            if (r7 == r8) goto L_0x0163
            int r7 = r5.f52859d
            java.lang.String r9 = "uMVPMatrix"
            int r7 = android.opengl.GLES20.glGetUniformLocation(r7, r9)
            r5.f52860e = r7
            java.lang.String r7 = "glGetUniformLocation uMVPMatrix"
            com.p683ss.android.p1168h.C19167b.C19169a.m46735a(r7)
            int r7 = r5.f52860e
            if (r7 == r8) goto L_0x015b
            int r7 = r5.f52859d
            java.lang.String r9 = "uSTMatrix"
            int r7 = android.opengl.GLES20.glGetUniformLocation(r7, r9)
            r5.f52861f = r7
            java.lang.String r7 = "glGetUniformLocation uSTMatrix"
            com.p683ss.android.p1168h.C19167b.C19169a.m46735a(r7)
            int r7 = r5.f52861f
            if (r7 == r8) goto L_0x0153
            int[] r5 = r5.f52864i
            android.opengl.GLES20.glGenFramebuffers(r6, r5, r4)
            java.lang.String r5 = "glGenFramebuffers"
            com.p683ss.android.p1168h.C19167b.C19169a.m46735a(r5)
            android.media.MediaCodec r5 = r2.f52840i
            android.media.MediaFormat r6 = r2.f52847q
            android.view.Surface r7 = r2.f52838g
            r5.configure(r6, r7, r3, r4)
            goto L_0x0182
        L_0x0153:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Could not get attrib location for uSTMatrix"
            r3.<init>(r4)
            throw r3
        L_0x015b:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Could not get attrib location for uMVPMatrix"
            r3.<init>(r4)
            throw r3
        L_0x0163:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Could not get attrib location for aTextureCoord"
            r3.<init>(r4)
            throw r3
        L_0x016b:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Could not get attrib location for aPosition"
            r3.<init>(r4)
            throw r3
        L_0x0173:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "failed creating program"
            r3.<init>(r4)
            throw r3
        L_0x017b:
            android.media.MediaCodec r5 = r2.f52840i
            android.media.MediaFormat r6 = r2.f52847q
            r5.configure(r6, r3, r3, r4)
        L_0x0182:
            android.media.MediaCodec r3 = r2.f52840i
            r3.start()
            int r3 = com.p683ss.android.p1168h.C19166a.f52819a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1168h.C19167b.mo39112a(byte[], int, byte[], int, int, int, boolean):int");
    }
}
