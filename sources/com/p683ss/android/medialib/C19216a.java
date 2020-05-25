package com.p683ss.android.medialib;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Pair;
import android.view.Surface;
import com.p683ss.android.medialib.p1180b.C19229e;
import com.p683ss.android.vesdk.C50792y;
import java.io.BufferedOutputStream;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.ss.android.medialib.a */
public class C19216a {

    /* renamed from: a */
    static C19221b f52979a;

    /* renamed from: j */
    private static final String[] f52980j = {"BITRATE_MODE_CQ", "BITRATE_MODE_VBR", "BITRATE_MODE_CBR"};

    /* renamed from: k */
    private static int f52981k = 5000;

    /* renamed from: b */
    BufferInfo f52982b;

    /* renamed from: c */
    ByteBuffer[] f52983c;

    /* renamed from: d */
    ByteBuffer[] f52984d;

    /* renamed from: e */
    int f52985e = 0;

    /* renamed from: f */
    public int f52986f = 30;

    /* renamed from: g */
    public int f52987g = 1;

    /* renamed from: h */
    public boolean f52988h = false;

    /* renamed from: i */
    BufferedOutputStream f52989i = null;

    /* renamed from: l */
    private MediaCodec f52990l;

    /* renamed from: m */
    private String f52991m = "video/avc";

    /* renamed from: n */
    private MediaCodecInfo f52992n;

    /* renamed from: o */
    private Surface f52993o;

    /* renamed from: p */
    private C19229e f52994p;

    /* renamed from: q */
    private int f52995q;

    /* renamed from: r */
    private int f52996r;

    /* renamed from: s */
    private boolean f52997s;

    /* renamed from: t */
    private Queue<Pair<Integer, Integer>> f52998t = new LinkedList();

    /* renamed from: u */
    private int f52999u;

    /* renamed from: v */
    private int f53000v = 0;

    /* renamed from: w */
    private int f53001w = 0;

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d1 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d3 A[SYNTHETIC, Splitter:B:56:0x00d3] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo39595a() {
        /*
            r11 = this;
            monitor-enter(r11)
            int r0 = r11.f52985e     // Catch:{ all -> 0x012c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r11)
            return
        L_0x0007:
            java.lang.String r0 = "AVCEncoder"
            java.lang.String r1 = "start == "
            com.p683ss.android.vesdk.C50792y.m109909a(r0, r1)     // Catch:{ all -> 0x012c }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x012c }
            r1 = 21
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 < r1) goto L_0x006c
            android.media.MediaCodecList r0 = new android.media.MediaCodecList     // Catch:{ all -> 0x012c }
            r0.<init>(r4)     // Catch:{ all -> 0x012c }
            android.media.MediaCodecInfo[] r0 = r0.getCodecInfos()     // Catch:{ all -> 0x012c }
            if (r0 == 0) goto L_0x006a
            int r1 = r0.length     // Catch:{ all -> 0x012c }
            if (r1 != 0) goto L_0x0026
            goto L_0x006a
        L_0x0026:
            int r1 = r0.length     // Catch:{ all -> 0x012c }
            r5 = 0
        L_0x0028:
            if (r5 >= r1) goto L_0x006a
            r6 = r0[r5]     // Catch:{ all -> 0x012c }
            if (r6 == 0) goto L_0x0067
            boolean r7 = r6.isEncoder()     // Catch:{ all -> 0x012c }
            if (r7 == 0) goto L_0x0067
            java.lang.String r7 = r6.getName()     // Catch:{ all -> 0x012c }
            java.lang.String r8 = "OMX.google."
            boolean r8 = r7.startsWith(r8)     // Catch:{ all -> 0x012c }
            if (r8 != 0) goto L_0x0067
            java.lang.String r8 = "OMX.Nvidia."
            boolean r8 = r7.startsWith(r8)     // Catch:{ all -> 0x012c }
            if (r8 != 0) goto L_0x0067
            java.lang.String r8 = "OMX.TI.DUCATI1.VIDEO.H264E"
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x012c }
            if (r7 != 0) goto L_0x0067
            java.lang.String[] r7 = r6.getSupportedTypes()     // Catch:{ all -> 0x012c }
            r8 = 0
        L_0x0055:
            int r9 = r7.length     // Catch:{ all -> 0x012c }
            if (r8 >= r9) goto L_0x0067
            r9 = r7[r8]     // Catch:{ all -> 0x012c }
            java.lang.String r10 = r11.f52991m     // Catch:{ all -> 0x012c }
            boolean r9 = r9.equalsIgnoreCase(r10)     // Catch:{ all -> 0x012c }
            if (r9 == 0) goto L_0x0064
            r0 = r6
            goto L_0x0070
        L_0x0064:
            int r8 = r8 + 1
            goto L_0x0055
        L_0x0067:
            int r5 = r5 + 1
            goto L_0x0028
        L_0x006a:
            r0 = r2
            goto L_0x0070
        L_0x006c:
            android.media.MediaCodecInfo r0 = r11.m46840d()     // Catch:{ all -> 0x012c }
        L_0x0070:
            r11.f52992n = r0     // Catch:{ all -> 0x012c }
            java.lang.String r0 = "AVCEncoder"
            java.lang.String r1 = "end == "
            com.p683ss.android.vesdk.C50792y.m109909a(r0, r1)     // Catch:{ all -> 0x012c }
            android.media.MediaCodecInfo r0 = r11.f52992n     // Catch:{ all -> 0x012c }
            if (r0 != 0) goto L_0x007e
            goto L_0x00b0
        L_0x007e:
            java.lang.String r0 = "AVCEncoder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            java.lang.String r2 = "mMediaCodecInfo name = "
            r1.<init>(r2)     // Catch:{ all -> 0x012c }
            android.media.MediaCodecInfo r2 = r11.f52992n     // Catch:{ all -> 0x012c }
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x012c }
            r1.append(r2)     // Catch:{ all -> 0x012c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x012c }
            com.p683ss.android.vesdk.C50792y.m109909a(r0, r1)     // Catch:{ all -> 0x012c }
            android.media.MediaCodecInfo r0 = r11.f52992n     // Catch:{ all -> 0x012c }
            java.lang.String r1 = r11.f52991m     // Catch:{ all -> 0x012c }
            android.media.MediaCodecInfo$CodecCapabilities r0 = r0.getCapabilitiesForType(r1)     // Catch:{ all -> 0x012c }
            int[] r1 = r0.colorFormats     // Catch:{ all -> 0x012c }
            int r1 = r1.length     // Catch:{ all -> 0x012c }
            int[] r2 = new int[r1]     // Catch:{ all -> 0x012c }
            r5 = 0
        L_0x00a5:
            if (r5 >= r1) goto L_0x00b0
            int[] r6 = r0.colorFormats     // Catch:{ all -> 0x012c }
            r6 = r6[r5]     // Catch:{ all -> 0x012c }
            r2[r5] = r6     // Catch:{ all -> 0x012c }
            int r5 = r5 + 1
            goto L_0x00a5
        L_0x00b0:
            if (r2 == 0) goto L_0x00ca
            r0 = 0
        L_0x00b3:
            int r1 = r2.length     // Catch:{ all -> 0x012c }
            if (r0 >= r1) goto L_0x00ca
            r1 = r2[r0]     // Catch:{ all -> 0x012c }
            r5 = 2130708361(0x7f000789, float:1.701803E38)
            if (r1 != r5) goto L_0x00c7
            java.lang.String r1 = "AVCEncoder"
            java.lang.String r5 = "====== mColorFormat support COLOR_FormatSurface ======"
            com.p683ss.android.vesdk.C50792y.m109909a(r1, r5)     // Catch:{ all -> 0x012c }
            r0 = r2[r0]     // Catch:{ all -> 0x012c }
            goto L_0x00cb
        L_0x00c7:
            int r0 = r0 + 1
            goto L_0x00b3
        L_0x00ca:
            r0 = -1
        L_0x00cb:
            r11.f52999u = r0     // Catch:{ all -> 0x012c }
            int r0 = r11.f52999u     // Catch:{ all -> 0x012c }
            if (r0 >= 0) goto L_0x00d3
            monitor-exit(r11)
            return
        L_0x00d3:
            java.lang.String r0 = r11.f52991m     // Catch:{ IOException -> 0x0112 }
            android.media.MediaCodec r0 = android.media.MediaCodec.createEncoderByType(r0)     // Catch:{ IOException -> 0x0112 }
            r11.f52990l = r0     // Catch:{ IOException -> 0x0112 }
            android.media.MediaCodec r0 = r11.f52990l     // Catch:{ all -> 0x012c }
            android.media.MediaCodecInfo r0 = r0.getCodecInfo()     // Catch:{ all -> 0x012c }
            java.lang.String r1 = r0.getName()     // Catch:{ all -> 0x012c }
            java.lang.String r2 = "OMX.google."
            boolean r1 = r1.startsWith(r2)     // Catch:{ all -> 0x012c }
            if (r1 == 0) goto L_0x00ef
            monitor-exit(r11)
            return
        L_0x00ef:
            java.lang.String[] r0 = r0.getSupportedTypes()     // Catch:{ all -> 0x012c }
            int r1 = r0.length     // Catch:{ all -> 0x012c }
        L_0x00f4:
            if (r3 >= r1) goto L_0x010e
            r2 = r0[r3]     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "AVCEncoder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            java.lang.String r7 = "CodecNames: "
            r6.<init>(r7)     // Catch:{ all -> 0x012c }
            r6.append(r2)     // Catch:{ all -> 0x012c }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x012c }
            com.p683ss.android.vesdk.C50792y.m109909a(r5, r2)     // Catch:{ all -> 0x012c }
            int r3 = r3 + 1
            goto L_0x00f4
        L_0x010e:
            r11.f52985e = r4     // Catch:{ all -> 0x012c }
            monitor-exit(r11)
            return
        L_0x0112:
            r0 = move-exception
            java.lang.String r1 = "AVCEncoder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            java.lang.String r3 = "createEncoderByTyp: "
            r2.<init>(r3)     // Catch:{ all -> 0x012c }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x012c }
            r2.append(r0)     // Catch:{ all -> 0x012c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x012c }
            com.p683ss.android.vesdk.C50792y.m109914d(r1, r0)     // Catch:{ all -> 0x012c }
            monitor-exit(r11)
            return
        L_0x012c:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.C19216a.mo39595a():void");
    }

    static {
        new Thread(new Runnable() {
            public final void run() {
                synchronized (C19216a.class) {
                    MediaCodecList.getCodecCount();
                }
            }
        }).start();
    }

    /* renamed from: b */
    public final void mo39596b() {
        C50792y.m109909a("AVCEncoder", "uninitAVCEncoder == enter");
        synchronized (this) {
            if (this.f52985e != 0) {
                if (this.f52990l != null) {
                    if (this.f52985e == 2) {
                        try {
                            this.f52990l.stop();
                        } catch (Exception unused) {
                            C50792y.m109914d("AVCEncoder", "MediaCodec Exception");
                        }
                    }
                    this.f52985e = 3;
                    if (this.f52993o != null) {
                        this.f52993o.release();
                    }
                    mo39597c();
                    C50792y.m109909a("AVCEncoder", "uninitAVCEncoder == exit");
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized void mo39597c() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.f52990l.release();
        } catch (Exception unused) {
        }
        this.f52990l = null;
        this.f52985e = 0;
        StringBuilder sb = new StringBuilder("time cost: ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        C50792y.m109909a("AVCEncoder", sb.toString());
    }

    /* renamed from: d */
    private MediaCodecInfo m46840d() {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    for (String equalsIgnoreCase : supportedTypes) {
                        if (equalsIgnoreCase.equalsIgnoreCase(this.f52991m)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m46837a(int i) {
        f52981k = i;
    }

    /* renamed from: a */
    public static void m46839a(C19221b bVar) {
        f52979a = bVar;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059 A[SYNTHETIC, Splitter:B:27:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005e A[SYNTHETIC, Splitter:B:31:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0067 A[SYNTHETIC, Splitter:B:38:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006c A[SYNTHETIC, Splitter:B:42:0x006c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m46838a(android.graphics.Bitmap r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "AVCEncoder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "saving Bitmap : "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.p683ss.android.vesdk.C50792y.m109909a(r0, r1)
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            r1.<init>(r5)     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0050 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0050 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            r3 = 100
            r4.compress(r0, r3, r2)     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            r2.flush()     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            r2.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            r1.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            java.lang.String r4 = "AVCEncoder"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bitmap "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = " saved!"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.p683ss.android.vesdk.C50792y.m109909a(r4, r5)
            return
        L_0x0047:
            r4 = move-exception
            r0 = r2
            goto L_0x0065
        L_0x004a:
            r0 = r2
            goto L_0x0050
        L_0x004c:
            r4 = move-exception
            r1 = r0
            goto L_0x0065
        L_0x004f:
            r1 = r0
        L_0x0050:
            java.lang.String r4 = "AVCEncoder"
            java.lang.String r5 = "Err when saving bitmap..."
            com.p683ss.android.vesdk.C50792y.m109914d(r4, r5)     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x005c
            r0.close()     // Catch:{ IOException -> 0x005c }
        L_0x005c:
            if (r1 == 0) goto L_0x0063
            r1.close()     // Catch:{ IOException -> 0x0062 }
            goto L_0x0063
        L_0x0062:
            return
        L_0x0063:
            return
        L_0x0064:
            r4 = move-exception
        L_0x0065:
            if (r0 == 0) goto L_0x006a
            r0.close()     // Catch:{ IOException -> 0x006a }
        L_0x006a:
            if (r1 == 0) goto L_0x006f
            r1.close()     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.C19216a.m46838a(android.graphics.Bitmap, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a2, code lost:
        return 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo39593a(byte[] r22, int r23, boolean r24) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r23
            r3 = r24
            monitor-enter(r21)
            int r4 = r1.f52985e     // Catch:{ all -> 0x01a6 }
            r5 = 2
            if (r4 != r5) goto L_0x01a3
            android.media.MediaCodec r4 = r1.f52990l     // Catch:{ all -> 0x01a6 }
            if (r4 != 0) goto L_0x0014
            goto L_0x01a3
        L_0x0014:
            java.lang.String r4 = "AVCEncoder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            java.lang.String r7 = "encodeBuffer pts: "
            r6.<init>(r7)     // Catch:{ all -> 0x01a6 }
            r6.append(r2)     // Catch:{ all -> 0x01a6 }
            java.lang.String r7 = "  isEndStream = "
            r6.append(r7)     // Catch:{ all -> 0x01a6 }
            r6.append(r3)     // Catch:{ all -> 0x01a6 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x01a6 }
            com.p683ss.android.vesdk.C50792y.m109911b(r4, r6)     // Catch:{ all -> 0x01a6 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01a6 }
            r6 = 21
            r7 = 0
            r9 = 4
            r10 = -1
            r12 = 1
            r13 = 0
            if (r4 < r6) goto L_0x00fe
            android.media.MediaCodec r4 = r1.f52990l     // Catch:{ all -> 0x01a6 }
            int r15 = r4.dequeueInputBuffer(r10)     // Catch:{ all -> 0x01a6 }
            if (r15 < 0) goto L_0x0065
            android.media.MediaCodec r4 = r1.f52990l     // Catch:{ all -> 0x01a6 }
            java.nio.ByteBuffer r4 = r4.getInputBuffer(r15)     // Catch:{ all -> 0x01a6 }
            r4.clear()     // Catch:{ all -> 0x01a6 }
            int r6 = r0.length     // Catch:{ all -> 0x01a6 }
            r4.put(r0, r13, r6)     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec r14 = r1.f52990l     // Catch:{ all -> 0x01a6 }
            r16 = 0
            int r0 = r0.length     // Catch:{ all -> 0x01a6 }
            long r10 = (long) r2     // Catch:{ all -> 0x01a6 }
            if (r3 != r12) goto L_0x005c
            r20 = 4
            goto L_0x005e
        L_0x005c:
            r20 = 0
        L_0x005e:
            r17 = r0
            r18 = r10
            r14.queueInputBuffer(r15, r16, r17, r18, r20)     // Catch:{ all -> 0x01a6 }
        L_0x0065:
            android.media.MediaCodec r0 = r1.f52990l     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r2 = r1.f52982b     // Catch:{ all -> 0x01a6 }
            int r3 = f52981k     // Catch:{ all -> 0x01a6 }
            long r3 = (long) r3     // Catch:{ all -> 0x01a6 }
            int r0 = r0.dequeueOutputBuffer(r2, r3)     // Catch:{ all -> 0x01a6 }
            java.lang.String r2 = "AVCEncoder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            java.lang.String r4 = "outputBufferIndex = "
            r3.<init>(r4)     // Catch:{ all -> 0x01a6 }
            r3.append(r0)     // Catch:{ all -> 0x01a6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01a6 }
            com.p683ss.android.vesdk.C50792y.m109911b(r2, r3)     // Catch:{ all -> 0x01a6 }
            java.lang.String r2 = "AVCEncoder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            java.lang.String r4 = "mBufferInfo.flags = "
            r3.<init>(r4)     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r4 = r1.f52982b     // Catch:{ all -> 0x01a6 }
            int r4 = r4.flags     // Catch:{ all -> 0x01a6 }
            r3.append(r4)     // Catch:{ all -> 0x01a6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01a6 }
            com.p683ss.android.vesdk.C50792y.m109911b(r2, r3)     // Catch:{ all -> 0x01a6 }
        L_0x009a:
            if (r0 < 0) goto L_0x01a1
            android.media.MediaCodec r2 = r1.f52990l     // Catch:{ all -> 0x01a6 }
            java.nio.ByteBuffer r2 = r2.getOutputBuffer(r0)     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r3 = r1.f52982b     // Catch:{ all -> 0x01a6 }
            int r3 = r3.offset     // Catch:{ all -> 0x01a6 }
            r2.position(r3)     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r3 = r1.f52982b     // Catch:{ all -> 0x01a6 }
            int r3 = r3.offset     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r4 = r1.f52982b     // Catch:{ all -> 0x01a6 }
            int r4 = r4.size     // Catch:{ all -> 0x01a6 }
            int r3 = r3 + r4
            r2.limit(r3)     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r3 = r1.f52982b     // Catch:{ all -> 0x01a6 }
            int r3 = r3.flags     // Catch:{ all -> 0x01a6 }
            r3 = r3 & r5
            if (r3 == 0) goto L_0x00d1
            java.lang.String r3 = "AVCEncoder"
            java.lang.String r4 = "mEncoderCaller.onSetCodecConfig"
            com.p683ss.android.vesdk.C50792y.m109911b(r3, r4)     // Catch:{ all -> 0x01a6 }
            com.ss.android.medialib.b r3 = f52979a     // Catch:{ all -> 0x01a6 }
            if (r3 == 0) goto L_0x00cc
            com.ss.android.medialib.b r3 = f52979a     // Catch:{ all -> 0x01a6 }
            r3.onSetCodecConfig(r2)     // Catch:{ all -> 0x01a6 }
        L_0x00cc:
            android.media.MediaCodec$BufferInfo r2 = r1.f52982b     // Catch:{ all -> 0x01a6 }
            r2.size = r13     // Catch:{ all -> 0x01a6 }
            goto L_0x00f0
        L_0x00d1:
            android.media.MediaCodec$BufferInfo r3 = r1.f52982b     // Catch:{ all -> 0x01a6 }
            long r3 = r3.presentationTimeUs     // Catch:{ all -> 0x01a6 }
            int r3 = (int) r3     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r4 = r1.f52982b     // Catch:{ all -> 0x01a6 }
            int r4 = r4.flags     // Catch:{ all -> 0x01a6 }
            r4 = r4 & r12
            if (r4 == 0) goto L_0x00df
            r4 = 1
            goto L_0x00e0
        L_0x00df:
            r4 = 0
        L_0x00e0:
            java.lang.String r6 = "AVCEncoder"
            java.lang.String r9 = "mEncoderCaller.onWriteFile"
            com.p683ss.android.vesdk.C50792y.m109911b(r6, r9)     // Catch:{ all -> 0x01a6 }
            com.ss.android.medialib.b r6 = f52979a     // Catch:{ all -> 0x01a6 }
            if (r6 == 0) goto L_0x00f0
            com.ss.android.medialib.b r6 = f52979a     // Catch:{ all -> 0x01a6 }
            r6.onWriteFile(r2, r3, r13, r4)     // Catch:{ all -> 0x01a6 }
        L_0x00f0:
            android.media.MediaCodec r2 = r1.f52990l     // Catch:{ all -> 0x01a6 }
            r2.releaseOutputBuffer(r0, r13)     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec r0 = r1.f52990l     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r2 = r1.f52982b     // Catch:{ all -> 0x01a6 }
            int r0 = r0.dequeueOutputBuffer(r2, r7)     // Catch:{ all -> 0x01a6 }
            goto L_0x009a
        L_0x00fe:
            android.media.MediaCodec r4 = r1.f52990l     // Catch:{ all -> 0x01a6 }
            int r15 = r4.dequeueInputBuffer(r10)     // Catch:{ all -> 0x01a6 }
            if (r15 < 0) goto L_0x0125
            java.nio.ByteBuffer[] r4 = r1.f52983c     // Catch:{ all -> 0x01a6 }
            r4 = r4[r15]     // Catch:{ all -> 0x01a6 }
            r4.clear()     // Catch:{ all -> 0x01a6 }
            int r6 = r0.length     // Catch:{ all -> 0x01a6 }
            r4.put(r0, r13, r6)     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec r14 = r1.f52990l     // Catch:{ all -> 0x01a6 }
            r16 = 0
            int r0 = r0.length     // Catch:{ all -> 0x01a6 }
            long r10 = (long) r2     // Catch:{ all -> 0x01a6 }
            if (r3 != r12) goto L_0x011c
            r20 = 4
            goto L_0x011e
        L_0x011c:
            r20 = 0
        L_0x011e:
            r17 = r0
            r18 = r10
            r14.queueInputBuffer(r15, r16, r17, r18, r20)     // Catch:{ all -> 0x01a6 }
        L_0x0125:
            android.media.MediaCodec r0 = r1.f52990l     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r2 = r1.f52982b     // Catch:{ all -> 0x01a6 }
            int r3 = f52981k     // Catch:{ all -> 0x01a6 }
            long r3 = (long) r3     // Catch:{ all -> 0x01a6 }
            int r0 = r0.dequeueOutputBuffer(r2, r3)     // Catch:{ all -> 0x01a6 }
        L_0x0130:
            if (r0 < 0) goto L_0x01a1
            r2 = -3
            if (r0 != r2) goto L_0x013e
            android.media.MediaCodec r0 = r1.f52990l     // Catch:{ all -> 0x01a6 }
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()     // Catch:{ all -> 0x01a6 }
            r1.f52984d = r0     // Catch:{ all -> 0x01a6 }
            goto L_0x0198
        L_0x013e:
            r2 = -2
            if (r0 == r2) goto L_0x0198
            java.nio.ByteBuffer[] r2 = r1.f52984d     // Catch:{ all -> 0x01a6 }
            r2 = r2[r0]     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r3 = r1.f52982b     // Catch:{ all -> 0x01a6 }
            int r3 = r3.offset     // Catch:{ all -> 0x01a6 }
            r2.position(r3)     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r3 = r1.f52982b     // Catch:{ all -> 0x01a6 }
            int r3 = r3.offset     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r4 = r1.f52982b     // Catch:{ all -> 0x01a6 }
            int r4 = r4.size     // Catch:{ all -> 0x01a6 }
            int r3 = r3 + r4
            r2.limit(r3)     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r3 = r1.f52982b     // Catch:{ all -> 0x01a6 }
            int r3 = r3.flags     // Catch:{ all -> 0x01a6 }
            r3 = r3 & r5
            if (r3 == 0) goto L_0x0174
            java.lang.String r3 = "AVCEncoder"
            java.lang.String r4 = "mEncoderCaller.onSetCodecConfig"
            com.p683ss.android.vesdk.C50792y.m109911b(r3, r4)     // Catch:{ all -> 0x01a6 }
            com.ss.android.medialib.b r3 = f52979a     // Catch:{ all -> 0x01a6 }
            if (r3 == 0) goto L_0x016f
            com.ss.android.medialib.b r3 = f52979a     // Catch:{ all -> 0x01a6 }
            r3.onSetCodecConfig(r2)     // Catch:{ all -> 0x01a6 }
        L_0x016f:
            android.media.MediaCodec$BufferInfo r2 = r1.f52982b     // Catch:{ all -> 0x01a6 }
            r2.size = r13     // Catch:{ all -> 0x01a6 }
            goto L_0x0193
        L_0x0174:
            android.media.MediaCodec$BufferInfo r3 = r1.f52982b     // Catch:{ all -> 0x01a6 }
            long r3 = r3.presentationTimeUs     // Catch:{ all -> 0x01a6 }
            int r3 = (int) r3     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r4 = r1.f52982b     // Catch:{ all -> 0x01a6 }
            int r4 = r4.flags     // Catch:{ all -> 0x01a6 }
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0182
            r4 = 1
            goto L_0x0183
        L_0x0182:
            r4 = 0
        L_0x0183:
            java.lang.String r6 = "AVCEncoder"
            java.lang.String r9 = "mEncoderCaller.onWriteFile"
            com.p683ss.android.vesdk.C50792y.m109911b(r6, r9)     // Catch:{ all -> 0x01a6 }
            com.ss.android.medialib.b r6 = f52979a     // Catch:{ all -> 0x01a6 }
            if (r6 == 0) goto L_0x0193
            com.ss.android.medialib.b r6 = f52979a     // Catch:{ all -> 0x01a6 }
            r6.onWriteFile(r2, r3, r13, r4)     // Catch:{ all -> 0x01a6 }
        L_0x0193:
            android.media.MediaCodec r2 = r1.f52990l     // Catch:{ all -> 0x01a6 }
            r2.releaseOutputBuffer(r0, r13)     // Catch:{ all -> 0x01a6 }
        L_0x0198:
            android.media.MediaCodec r0 = r1.f52990l     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r2 = r1.f52982b     // Catch:{ all -> 0x01a6 }
            int r0 = r0.dequeueOutputBuffer(r2, r7)     // Catch:{ all -> 0x01a6 }
            goto L_0x0130
        L_0x01a1:
            monitor-exit(r21)     // Catch:{ all -> 0x01a6 }
            return r13
        L_0x01a3:
            r0 = -1
            monitor-exit(r21)     // Catch:{ all -> 0x01a6 }
            return r0
        L_0x01a6:
            r0 = move-exception
            monitor-exit(r21)     // Catch:{ all -> 0x01a6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.C19216a.mo39593a(byte[], int, boolean):int");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:22|23|24|(1:26)|27|28|29|(2:31|32)|44|45|(1:47)(1:48)|49) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:33|34|35|(1:37)|38|39) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:52|53|54|55|56|57) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x020f, code lost:
        f52979a.onSetCodecConfig(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0214, code lost:
        r1.f52982b.size = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x021f, code lost:
        if ((r1.f52982b.flags & 1) == 0) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0221, code lost:
        r17 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0224, code lost:
        r17 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0226, code lost:
        com.p683ss.android.vesdk.C50792y.m109911b("AVCEncoder", "mEncoderCaller.onWriteFile");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x022f, code lost:
        if (f52979a == null) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0231, code lost:
        r4 = new java.lang.StringBuilder("encode: pts queue size = ");
        r4.append(r1.f52998t.size());
        com.p683ss.android.vesdk.C50792y.m109911b("AVCEncoder", r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0250, code lost:
        if (r1.f52998t.size() <= 0) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0252, code lost:
        r1.f53001w++;
        r2 = (android.util.Pair) r1.f52998t.poll();
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0267, code lost:
        if (r1.f52982b.presentationTimeUs <= 0) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0269, code lost:
        r14 = r1.f52982b.presentationTimeUs;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x026d, code lost:
        f52979a.onWriteFile(r11, r14 / 1000, (long) ((java.lang.Integer) r2.first).intValue(), ((java.lang.Integer) r2.second).intValue(), r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0288, code lost:
        com.p683ss.android.vesdk.C50792y.m109913c("AVCEncoder", "encode: no available pts!!!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0290, code lost:
        com.p683ss.android.vesdk.C50792y.m109911b("AVCEncoder", "encode: no output.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c0, code lost:
        if (r6 >= 0) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c2, code lost:
        com.p683ss.android.vesdk.C50792y.m109911b("AVCEncoder", "encode: error.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d8, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01db, code lost:
        if (android.os.Build.VERSION.SDK_INT < 21) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01dd, code lost:
        r2 = r1.f52990l.getOutputBuffer(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01e3, code lost:
        r11 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e5, code lost:
        r2 = r1.f52984d[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ea, code lost:
        r11.position(r1.f52982b.offset);
        r11.limit(r1.f52982b.offset + r1.f52982b.size);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0202, code lost:
        if ((r1.f52982b.flags & 2) == 0) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0204, code lost:
        com.p683ss.android.vesdk.C50792y.m109911b("AVCEncoder", "mEncoderCaller.onSetCodecConfig");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x020d, code lost:
        if (f52979a == null) goto L_0x0214;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0116 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0117 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x011e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x0146 */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d A[Catch:{ IOException -> 0x0117, all -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0133 A[Catch:{ IOException -> 0x0117, all -> 0x010c }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:38:0x0116=Splitter:B:38:0x0116, B:54:0x0146=Splitter:B:54:0x0146, B:44:0x011e=Splitter:B:44:0x011e} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo39592a(int r19, int r20, int r21, boolean r22) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            r3 = r22
            java.lang.String r4 = "AVCEncoder"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "encodeTexture::texID: "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r6 = " pts: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = " duration:"
            r5.append(r6)
            r6 = r21
            r5.append(r6)
            java.lang.String r7 = "  isEndStream = "
            r5.append(r7)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.p683ss.android.vesdk.C50792y.m109911b(r4, r5)
            monitor-enter(r18)
            int r4 = r1.f52985e     // Catch:{ all -> 0x02e4 }
            r5 = 2
            r7 = -1
            if (r4 != r5) goto L_0x02db
            android.media.MediaCodec r4 = r1.f52990l     // Catch:{ all -> 0x02e4 }
            if (r4 != 0) goto L_0x0042
            goto L_0x02db
        L_0x0042:
            if (r0 <= 0) goto L_0x02be
            if (r2 >= 0) goto L_0x0048
            goto L_0x02be
        L_0x0048:
            com.ss.android.medialib.b.e r4 = r1.f52994p     // Catch:{ all -> 0x02e4 }
            r8 = 1
            r9 = 0
            if (r4 != 0) goto L_0x0075
            android.view.Surface r4 = r1.f52993o     // Catch:{ all -> 0x02e4 }
            if (r4 != 0) goto L_0x005b
            java.lang.String r4 = "AVCEncoder"
            java.lang.String r10 = "initEGLCtx: MediaCodec should initialized ahead."
            com.p683ss.android.vesdk.C50792y.m109914d(r4, r10)     // Catch:{ all -> 0x02e4 }
            r4 = 0
            goto L_0x0071
        L_0x005b:
            com.ss.android.medialib.b.e r4 = com.p683ss.android.medialib.p1180b.C19229e.m46869a()     // Catch:{ all -> 0x02e4 }
            r1.f52994p = r4     // Catch:{ all -> 0x02e4 }
            com.ss.android.medialib.b.e r4 = r1.f52994p     // Catch:{ all -> 0x02e4 }
            r10 = 0
            r4.mo39617a(r10)     // Catch:{ all -> 0x02e4 }
            com.ss.android.medialib.b.e r4 = r1.f52994p     // Catch:{ all -> 0x02e4 }
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.mo39618a(r10, r11)     // Catch:{ all -> 0x02e4 }
            r4 = 1
        L_0x0071:
            if (r4 != 0) goto L_0x0075
            monitor-exit(r18)     // Catch:{ all -> 0x02e4 }
            return r7
        L_0x0075:
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r4 = r1.f52998t     // Catch:{ all -> 0x02e4 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x02e4 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x02e4 }
            android.util.Pair r2 = android.util.Pair.create(r2, r6)     // Catch:{ all -> 0x02e4 }
            r4.offer(r2)     // Catch:{ all -> 0x02e4 }
            int r2 = r1.f52995q     // Catch:{ all -> 0x02e4 }
            int r4 = r1.f52996r     // Catch:{ all -> 0x02e4 }
            android.opengl.GLES20.glViewport(r9, r9, r2, r4)     // Catch:{ all -> 0x02e4 }
            java.lang.String r2 = "AVCEncoder"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e4 }
            java.lang.String r6 = "encode: width = "
            r4.<init>(r6)     // Catch:{ all -> 0x02e4 }
            int r6 = r1.f52995q     // Catch:{ all -> 0x02e4 }
            r4.append(r6)     // Catch:{ all -> 0x02e4 }
            java.lang.String r6 = " height = "
            r4.append(r6)     // Catch:{ all -> 0x02e4 }
            int r6 = r1.f52996r     // Catch:{ all -> 0x02e4 }
            r4.append(r6)     // Catch:{ all -> 0x02e4 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x02e4 }
            com.p683ss.android.vesdk.C50792y.m109911b(r2, r4)     // Catch:{ all -> 0x02e4 }
            com.ss.android.medialib.b.e r2 = r1.f52994p     // Catch:{ all -> 0x02e4 }
            r4 = 3553(0xde1, float:4.979E-42)
            r2.mo39619a(r0, r4)     // Catch:{ all -> 0x02e4 }
            android.opengl.GLES20.glFinish()     // Catch:{ all -> 0x02e4 }
            int r0 = r1.f53000v     // Catch:{ all -> 0x02e4 }
            int r0 = r0 + r8
            r1.f53000v = r0     // Catch:{ all -> 0x02e4 }
            com.ss.android.medialib.b r0 = f52979a     // Catch:{ all -> 0x02e4 }
            r0.onSwapGlBuffers()     // Catch:{ all -> 0x02e4 }
            boolean r0 = r1.f52997s     // Catch:{ all -> 0x02e4 }
            if (r0 == 0) goto L_0x013d
            int r0 = r1.f52995q     // Catch:{ all -> 0x02e4 }
            int r2 = r1.f52996r     // Catch:{ all -> 0x02e4 }
            int r0 = r0 * r2
            int r0 = r0 * 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch:{ all -> 0x02e4 }
            java.nio.ByteOrder r2 = java.nio.ByteOrder.nativeOrder()     // Catch:{ all -> 0x02e4 }
            java.nio.ByteBuffer r0 = r0.order(r2)     // Catch:{ all -> 0x02e4 }
            r10 = 0
            r11 = 0
            int r12 = r1.f52995q     // Catch:{ all -> 0x02e4 }
            int r13 = r1.f52996r     // Catch:{ all -> 0x02e4 }
            r14 = 6408(0x1908, float:8.98E-42)
            r15 = 5121(0x1401, float:7.176E-42)
            r16 = r0
            android.opengl.GLES20.glReadPixels(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x02e4 }
            java.io.BufferedOutputStream r2 = r1.f52989i     // Catch:{ IOException -> 0x0117, all -> 0x010c }
            if (r2 != 0) goto L_0x00f9
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0117, all -> 0x010c }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0117, all -> 0x010c }
            java.lang.String r6 = "/storage/emulated/0/xzw/rgbaBig.rgba"
            r4.<init>(r6)     // Catch:{ IOException -> 0x0117, all -> 0x010c }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0117, all -> 0x010c }
            r1.f52989i = r2     // Catch:{ IOException -> 0x0117, all -> 0x010c }
        L_0x00f9:
            java.io.BufferedOutputStream r2 = r1.f52989i     // Catch:{ IOException -> 0x0117, all -> 0x010c }
            byte[] r4 = r0.array()     // Catch:{ IOException -> 0x0117, all -> 0x010c }
            r2.write(r4)     // Catch:{ IOException -> 0x0117, all -> 0x010c }
            java.io.BufferedOutputStream r2 = r1.f52989i     // Catch:{ IOException -> 0x011e }
            if (r2 == 0) goto L_0x011e
            java.io.BufferedOutputStream r2 = r1.f52989i     // Catch:{ IOException -> 0x011e }
        L_0x0108:
            r2.close()     // Catch:{ IOException -> 0x011e }
            goto L_0x011e
        L_0x010c:
            r0 = move-exception
            java.io.BufferedOutputStream r2 = r1.f52989i     // Catch:{ IOException -> 0x0116 }
            if (r2 == 0) goto L_0x0116
            java.io.BufferedOutputStream r2 = r1.f52989i     // Catch:{ IOException -> 0x0116 }
            r2.close()     // Catch:{ IOException -> 0x0116 }
        L_0x0116:
            throw r0     // Catch:{ all -> 0x02e4 }
        L_0x0117:
            java.io.BufferedOutputStream r2 = r1.f52989i     // Catch:{ IOException -> 0x011e }
            if (r2 == 0) goto L_0x011e
            java.io.BufferedOutputStream r2 = r1.f52989i     // Catch:{ IOException -> 0x011e }
            goto L_0x0108
        L_0x011e:
            int r2 = r1.f52995q     // Catch:{ all -> 0x02e4 }
            int r4 = r1.f52996r     // Catch:{ all -> 0x02e4 }
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x02e4 }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r4, r6)     // Catch:{ all -> 0x02e4 }
            r2.copyPixelsFromBuffer(r0)     // Catch:{ all -> 0x02e4 }
            if (r3 == 0) goto L_0x0133
            java.lang.String r0 = "/sdcard/aweme/picture/record_e.jpeg"
            m46838a(r2, r0)     // Catch:{ all -> 0x02e4 }
            goto L_0x0138
        L_0x0133:
            java.lang.String r0 = "/sdcard/aweme/picture/record_s.jpeg"
            m46838a(r2, r0)     // Catch:{ all -> 0x02e4 }
        L_0x0138:
            r2.recycle()     // Catch:{ all -> 0x02e4 }
            r1.f52997s = r9     // Catch:{ all -> 0x02e4 }
        L_0x013d:
            r0 = -2
            if (r3 == 0) goto L_0x014a
            android.media.MediaCodec r2 = r1.f52990l     // Catch:{ Throwable -> 0x0146 }
            r2.signalEndOfInputStream()     // Catch:{ Throwable -> 0x0146 }
            goto L_0x014a
        L_0x0146:
            r1.f52988h = r8     // Catch:{ all -> 0x02e4 }
            monitor-exit(r18)     // Catch:{ all -> 0x02e4 }
            return r0
        L_0x014a:
            r2 = 0
        L_0x014b:
            int r2 = r2 + r8
            r4 = -3
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x029e }
            r10 = 21
            if (r6 >= r10) goto L_0x015b
            android.media.MediaCodec r6 = r1.f52990l     // Catch:{ Throwable -> 0x029e }
            java.nio.ByteBuffer[] r6 = r6.getOutputBuffers()     // Catch:{ Throwable -> 0x029e }
            r1.f52984d = r6     // Catch:{ Throwable -> 0x029e }
        L_0x015b:
            android.media.MediaCodec r6 = r1.f52990l     // Catch:{ Throwable -> 0x029e }
            android.media.MediaCodec$BufferInfo r11 = r1.f52982b     // Catch:{ Throwable -> 0x029e }
            int r12 = f52981k     // Catch:{ Throwable -> 0x029e }
            long r12 = (long) r12     // Catch:{ Throwable -> 0x029e }
            int r6 = r6.dequeueOutputBuffer(r11, r12)     // Catch:{ Throwable -> 0x029e }
            java.lang.String r11 = "AVCEncoder"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e4 }
            java.lang.String r13 = "outputBufferIndex = "
            r12.<init>(r13)     // Catch:{ all -> 0x02e4 }
            r12.append(r6)     // Catch:{ all -> 0x02e4 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x02e4 }
            com.p683ss.android.vesdk.C50792y.m109911b(r11, r12)     // Catch:{ all -> 0x02e4 }
            java.lang.String r11 = "AVCEncoder"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e4 }
            java.lang.String r13 = "mBufferInfo.flags = "
            r12.<init>(r13)     // Catch:{ all -> 0x02e4 }
            android.media.MediaCodec$BufferInfo r13 = r1.f52982b     // Catch:{ all -> 0x02e4 }
            int r13 = r13.flags     // Catch:{ all -> 0x02e4 }
            r12.append(r13)     // Catch:{ all -> 0x02e4 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x02e4 }
            com.p683ss.android.vesdk.C50792y.m109911b(r11, r12)     // Catch:{ all -> 0x02e4 }
            if (r6 != r7) goto L_0x01ab
            if (r3 == 0) goto L_0x019e
            int r4 = f52981k     // Catch:{ all -> 0x02e4 }
            r6 = 5000(0x1388, float:7.006E-42)
            if (r4 >= r6) goto L_0x019e
            r4 = 10000(0x2710, float:1.4013E-41)
            f52981k = r4     // Catch:{ all -> 0x02e4 }
        L_0x019e:
            if (r3 == 0) goto L_0x01c9
            int r4 = r1.f53000v     // Catch:{ all -> 0x02e4 }
            int r6 = r1.f53001w     // Catch:{ all -> 0x02e4 }
            if (r4 == r6) goto L_0x01c9
            r4 = 10
            if (r2 >= r4) goto L_0x01c9
            goto L_0x014b
        L_0x01ab:
            if (r6 != r4) goto L_0x01b6
            android.media.MediaCodec r4 = r1.f52990l     // Catch:{ all -> 0x02e4 }
            java.nio.ByteBuffer[] r4 = r4.getOutputBuffers()     // Catch:{ all -> 0x02e4 }
            r1.f52984d = r4     // Catch:{ all -> 0x02e4 }
            goto L_0x014b
        L_0x01b6:
            if (r6 != r0) goto L_0x01c0
            java.lang.String r4 = "AVCEncoder"
            java.lang.String r6 = "encode: output format change!"
            com.p683ss.android.vesdk.C50792y.m109911b(r4, r6)     // Catch:{ all -> 0x02e4 }
            goto L_0x014b
        L_0x01c0:
            if (r6 >= 0) goto L_0x01d9
            java.lang.String r0 = "AVCEncoder"
            java.lang.String r2 = "encode: error."
            com.p683ss.android.vesdk.C50792y.m109911b(r0, r2)     // Catch:{ all -> 0x02e4 }
        L_0x01c9:
            if (r3 == 0) goto L_0x01d7
            com.ss.android.medialib.b.e r0 = r1.f52994p     // Catch:{ all -> 0x02e4 }
            if (r0 == 0) goto L_0x01d7
            com.ss.android.medialib.b.e r0 = r1.f52994p     // Catch:{ all -> 0x02e4 }
            r0.mo39620b()     // Catch:{ all -> 0x02e4 }
            r0 = 0
            r1.f52994p = r0     // Catch:{ all -> 0x02e4 }
        L_0x01d7:
            monitor-exit(r18)     // Catch:{ all -> 0x02e4 }
            return r9
        L_0x01d9:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x02e4 }
            if (r2 < r10) goto L_0x01e5
            android.media.MediaCodec r2 = r1.f52990l     // Catch:{ all -> 0x02e4 }
            java.nio.ByteBuffer r2 = r2.getOutputBuffer(r6)     // Catch:{ all -> 0x02e4 }
        L_0x01e3:
            r11 = r2
            goto L_0x01ea
        L_0x01e5:
            java.nio.ByteBuffer[] r2 = r1.f52984d     // Catch:{ all -> 0x02e4 }
            r2 = r2[r6]     // Catch:{ all -> 0x02e4 }
            goto L_0x01e3
        L_0x01ea:
            android.media.MediaCodec$BufferInfo r2 = r1.f52982b     // Catch:{ all -> 0x02e4 }
            int r2 = r2.offset     // Catch:{ all -> 0x02e4 }
            r11.position(r2)     // Catch:{ all -> 0x02e4 }
            android.media.MediaCodec$BufferInfo r2 = r1.f52982b     // Catch:{ all -> 0x02e4 }
            int r2 = r2.offset     // Catch:{ all -> 0x02e4 }
            android.media.MediaCodec$BufferInfo r4 = r1.f52982b     // Catch:{ all -> 0x02e4 }
            int r4 = r4.size     // Catch:{ all -> 0x02e4 }
            int r2 = r2 + r4
            r11.limit(r2)     // Catch:{ all -> 0x02e4 }
            android.media.MediaCodec$BufferInfo r2 = r1.f52982b     // Catch:{ all -> 0x02e4 }
            int r2 = r2.flags     // Catch:{ all -> 0x02e4 }
            r2 = r2 & r5
            if (r2 == 0) goto L_0x021a
            java.lang.String r2 = "AVCEncoder"
            java.lang.String r4 = "mEncoderCaller.onSetCodecConfig"
            com.p683ss.android.vesdk.C50792y.m109911b(r2, r4)     // Catch:{ all -> 0x02e4 }
            com.ss.android.medialib.b r2 = f52979a     // Catch:{ all -> 0x02e4 }
            if (r2 == 0) goto L_0x0214
            com.ss.android.medialib.b r2 = f52979a     // Catch:{ all -> 0x02e4 }
            r2.onSetCodecConfig(r11)     // Catch:{ all -> 0x02e4 }
        L_0x0214:
            android.media.MediaCodec$BufferInfo r2 = r1.f52982b     // Catch:{ all -> 0x02e4 }
            r2.size = r9     // Catch:{ all -> 0x02e4 }
            goto L_0x0297
        L_0x021a:
            android.media.MediaCodec$BufferInfo r2 = r1.f52982b     // Catch:{ all -> 0x02e4 }
            int r2 = r2.flags     // Catch:{ all -> 0x02e4 }
            r2 = r2 & r8
            if (r2 == 0) goto L_0x0224
            r17 = 1
            goto L_0x0226
        L_0x0224:
            r17 = 0
        L_0x0226:
            java.lang.String r2 = "AVCEncoder"
            java.lang.String r4 = "mEncoderCaller.onWriteFile"
            com.p683ss.android.vesdk.C50792y.m109911b(r2, r4)     // Catch:{ all -> 0x02e4 }
            com.ss.android.medialib.b r2 = f52979a     // Catch:{ all -> 0x02e4 }
            if (r2 == 0) goto L_0x0290
            java.lang.String r2 = "AVCEncoder"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e4 }
            java.lang.String r10 = "encode: pts queue size = "
            r4.<init>(r10)     // Catch:{ all -> 0x02e4 }
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r10 = r1.f52998t     // Catch:{ all -> 0x02e4 }
            int r10 = r10.size()     // Catch:{ all -> 0x02e4 }
            r4.append(r10)     // Catch:{ all -> 0x02e4 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x02e4 }
            com.p683ss.android.vesdk.C50792y.m109911b(r2, r4)     // Catch:{ all -> 0x02e4 }
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r2 = r1.f52998t     // Catch:{ all -> 0x02e4 }
            int r2 = r2.size()     // Catch:{ all -> 0x02e4 }
            if (r2 <= 0) goto L_0x0288
            int r2 = r1.f53001w     // Catch:{ all -> 0x02e4 }
            int r2 = r2 + r8
            r1.f53001w = r2     // Catch:{ all -> 0x02e4 }
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r2 = r1.f52998t     // Catch:{ all -> 0x02e4 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x02e4 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x02e4 }
            android.media.MediaCodec$BufferInfo r4 = r1.f52982b     // Catch:{ all -> 0x02e4 }
            long r12 = r4.presentationTimeUs     // Catch:{ all -> 0x02e4 }
            r14 = 0
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x026d
            android.media.MediaCodec$BufferInfo r4 = r1.f52982b     // Catch:{ all -> 0x02e4 }
            long r14 = r4.presentationTimeUs     // Catch:{ all -> 0x02e4 }
        L_0x026d:
            com.ss.android.medialib.b r10 = f52979a     // Catch:{ all -> 0x02e4 }
            r12 = 1000(0x3e8, double:4.94E-321)
            long r12 = r14 / r12
            java.lang.Object r4 = r2.first     // Catch:{ all -> 0x02e4 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x02e4 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x02e4 }
            long r14 = (long) r4     // Catch:{ all -> 0x02e4 }
            java.lang.Object r2 = r2.second     // Catch:{ all -> 0x02e4 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x02e4 }
            int r16 = r2.intValue()     // Catch:{ all -> 0x02e4 }
            r10.onWriteFile(r11, r12, r14, r16, r17)     // Catch:{ all -> 0x02e4 }
            goto L_0x0297
        L_0x0288:
            java.lang.String r2 = "AVCEncoder"
            java.lang.String r4 = "encode: no available pts!!!"
            com.p683ss.android.vesdk.C50792y.m109913c(r2, r4)     // Catch:{ all -> 0x02e4 }
            goto L_0x0297
        L_0x0290:
            java.lang.String r2 = "AVCEncoder"
            java.lang.String r4 = "encode: no output."
            com.p683ss.android.vesdk.C50792y.m109911b(r2, r4)     // Catch:{ all -> 0x02e4 }
        L_0x0297:
            android.media.MediaCodec r2 = r1.f52990l     // Catch:{ all -> 0x02e4 }
            r2.releaseOutputBuffer(r6, r9)     // Catch:{ all -> 0x02e4 }
            goto L_0x014a
        L_0x029e:
            r0 = move-exception
            boolean r2 = r1.f52988h     // Catch:{ all -> 0x02e4 }
            if (r2 != 0) goto L_0x02ba
            java.lang.String r2 = "AVCEncoder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e4 }
            java.lang.String r5 = "dequeueOutputBuffer failed with: "
            r3.<init>(r5)     // Catch:{ all -> 0x02e4 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x02e4 }
            r3.append(r0)     // Catch:{ all -> 0x02e4 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x02e4 }
            com.p683ss.android.vesdk.C50792y.m109914d(r2, r0)     // Catch:{ all -> 0x02e4 }
        L_0x02ba:
            r1.f52988h = r8     // Catch:{ all -> 0x02e4 }
            monitor-exit(r18)     // Catch:{ all -> 0x02e4 }
            return r4
        L_0x02be:
            java.lang.String r3 = "AVCEncoder"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e4 }
            java.lang.String r5 = "encode: invalidate params: texID = "
            r4.<init>(r5)     // Catch:{ all -> 0x02e4 }
            r4.append(r0)     // Catch:{ all -> 0x02e4 }
            java.lang.String r0 = ", pts = "
            r4.append(r0)     // Catch:{ all -> 0x02e4 }
            r4.append(r2)     // Catch:{ all -> 0x02e4 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x02e4 }
            com.p683ss.android.vesdk.C50792y.m109914d(r3, r0)     // Catch:{ all -> 0x02e4 }
            monitor-exit(r18)     // Catch:{ all -> 0x02e4 }
            return r7
        L_0x02db:
            java.lang.String r0 = "AVCEncoder"
            java.lang.String r2 = "encode: codec is not ready."
            com.p683ss.android.vesdk.C50792y.m109913c(r0, r2)     // Catch:{ all -> 0x02e4 }
            monitor-exit(r18)     // Catch:{ all -> 0x02e4 }
            return r7
        L_0x02e4:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x02e4 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.C19216a.mo39592a(int, int, int, boolean):int");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:81|82|83|84) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010c, code lost:
        if (r13.profile < 8) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0309, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0307 */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0113 A[Catch:{ Exception -> 0x0307 }, LOOP:0: B:24:0x00be->B:40:0x0113, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0118 A[EDGE_INSN: B:89:0x0118->B:41:0x0118 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.Surface mo39594a(int r17, int r18, int r19, int r20, int r21, int r22, boolean r23) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r23
            r7 = 0
            if (r6 != 0) goto L_0x0012
            return r7
        L_0x0012:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 18
            if (r8 >= r9) goto L_0x0019
            return r7
        L_0x0019:
            r8 = 0
            r1.f53000v = r8
            r1.f53001w = r8
            java.lang.String r9 = "AVCEncoder"
            java.lang.String r10 = "initAVCEncoder == enter"
            com.p683ss.android.vesdk.C50792y.m109909a(r9, r10)
            r9 = 2
            r10 = 1
            if (r4 < 0) goto L_0x002b
            if (r4 <= r9) goto L_0x0044
        L_0x002b:
            java.lang.String r11 = "AVCEncoder"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Do not support bitrate mode "
            r12.<init>(r13)
            r12.append(r4)
            java.lang.String r4 = ", set VBR mode"
            r12.append(r4)
            java.lang.String r4 = r12.toString()
            com.p683ss.android.vesdk.C50792y.m109909a(r11, r4)
            r4 = 1
        L_0x0044:
            if (r5 <= 0) goto L_0x004a
            r11 = 64
            if (r5 <= r11) goto L_0x0063
        L_0x004a:
            java.lang.String r11 = "AVCEncoder"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Do not support profile "
            r12.<init>(r13)
            r12.append(r5)
            java.lang.String r5 = ", use baseline"
            r12.append(r5)
            java.lang.String r5 = r12.toString()
            com.p683ss.android.vesdk.C50792y.m109909a(r11, r5)
            r5 = 1
        L_0x0063:
            java.lang.String r11 = "AVCEncoder"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "width + "
            r12.<init>(r13)
            r12.append(r0)
            java.lang.String r13 = "\theight = "
            r12.append(r13)
            r12.append(r2)
            java.lang.String r13 = "\tbitrate = "
            r12.append(r13)
            r12.append(r3)
            java.lang.String r13 = "\tuseTextureInput = "
            r12.append(r13)
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            com.p683ss.android.vesdk.C50792y.m109909a(r11, r6)
            if (r0 <= 0) goto L_0x030c
            if (r2 > 0) goto L_0x0094
            goto L_0x030c
        L_0x0094:
            r1.f52995q = r0
            r1.f52996r = r2
            monitor-enter(r16)
            r16.mo39595a()     // Catch:{ Exception -> 0x0307 }
            com.ss.android.medialib.b r6 = f52979a     // Catch:{ Exception -> 0x0307 }
            if (r6 == 0) goto L_0x00a7
            com.ss.android.medialib.b r6 = f52979a     // Catch:{ Exception -> 0x0307 }
            int r11 = r1.f52999u     // Catch:{ Exception -> 0x0307 }
            r6.setColorFormat(r11)     // Catch:{ Exception -> 0x0307 }
        L_0x00a7:
            java.lang.String r6 = r1.f52991m     // Catch:{ Exception -> 0x0307 }
            android.media.MediaFormat r0 = android.media.MediaFormat.createVideoFormat(r6, r0, r2)     // Catch:{ Exception -> 0x0307 }
            android.media.MediaCodec r2 = r1.f52990l     // Catch:{ Exception -> 0x0307 }
            android.media.MediaCodecInfo r2 = r2.getCodecInfo()     // Catch:{ Exception -> 0x0307 }
            java.lang.String r6 = r1.f52991m     // Catch:{ Exception -> 0x0307 }
            android.media.MediaCodecInfo$CodecCapabilities r2 = r2.getCapabilitiesForType(r6)     // Catch:{ Exception -> 0x0307 }
            android.media.MediaCodecInfo$CodecProfileLevel[] r6 = r2.profileLevels     // Catch:{ Exception -> 0x0307 }
            int r11 = r6.length     // Catch:{ Exception -> 0x0307 }
            r13 = r7
            r12 = 0
        L_0x00be:
            if (r12 >= r11) goto L_0x0118
            r15 = r6[r12]     // Catch:{ Exception -> 0x0307 }
            java.lang.String r7 = "AVCEncoder"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0307 }
            java.lang.String r14 = "Profile = "
            r8.<init>(r14)     // Catch:{ Exception -> 0x0307 }
            int r14 = r15.profile     // Catch:{ Exception -> 0x0307 }
            r8.append(r14)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r14 = ", Level = "
            r8.append(r14)     // Catch:{ Exception -> 0x0307 }
            int r14 = r15.level     // Catch:{ Exception -> 0x0307 }
            r8.append(r14)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0307 }
            com.p683ss.android.vesdk.C50792y.m109909a(r7, r8)     // Catch:{ Exception -> 0x0307 }
            int r7 = r15.profile     // Catch:{ Exception -> 0x0307 }
            if (r7 != r10) goto L_0x00ed
            java.lang.String r7 = "AVCEncoder"
            java.lang.String r8 = "Support Baseline Profile!"
            com.p683ss.android.vesdk.C50792y.m109909a(r7, r8)     // Catch:{ Exception -> 0x0307 }
            goto L_0x010e
        L_0x00ed:
            int r7 = r15.profile     // Catch:{ Exception -> 0x0307 }
            if (r7 != r9) goto L_0x00fd
            java.lang.String r7 = "AVCEncoder"
            java.lang.String r8 = "Support Main Profile!"
            com.p683ss.android.vesdk.C50792y.m109909a(r7, r8)     // Catch:{ Exception -> 0x0307 }
            int r7 = r13.profile     // Catch:{ Exception -> 0x0307 }
            if (r7 >= r9) goto L_0x010f
            goto L_0x010e
        L_0x00fd:
            int r7 = r15.profile     // Catch:{ Exception -> 0x0307 }
            r8 = 8
            if (r7 != r8) goto L_0x010f
            java.lang.String r7 = "AVCEncoder"
            java.lang.String r14 = "Support High Profile!"
            com.p683ss.android.vesdk.C50792y.m109909a(r7, r14)     // Catch:{ Exception -> 0x0307 }
            int r7 = r13.profile     // Catch:{ Exception -> 0x0307 }
            if (r7 >= r8) goto L_0x010f
        L_0x010e:
            r13 = r15
        L_0x010f:
            int r7 = r15.profile     // Catch:{ Exception -> 0x0307 }
            if (r7 == r5) goto L_0x0118
            int r12 = r12 + 1
            r7 = 0
            r8 = 0
            goto L_0x00be
        L_0x0118:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0307 }
            r7 = 3
            r8 = 21
            if (r6 < r8) goto L_0x014a
            android.media.MediaCodecInfo$EncoderCapabilities r6 = r2.getEncoderCapabilities()     // Catch:{ Exception -> 0x0307 }
            r11 = 0
        L_0x0124:
            if (r11 >= r7) goto L_0x014a
            java.lang.String r12 = "AVCEncoder"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0307 }
            r14.<init>()     // Catch:{ Exception -> 0x0307 }
            java.lang.String[] r15 = f52980j     // Catch:{ Exception -> 0x0307 }
            r15 = r15[r11]     // Catch:{ Exception -> 0x0307 }
            r14.append(r15)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r15 = ": "
            r14.append(r15)     // Catch:{ Exception -> 0x0307 }
            boolean r15 = r6.isBitrateModeSupported(r11)     // Catch:{ Exception -> 0x0307 }
            r14.append(r15)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x0307 }
            com.p683ss.android.vesdk.C50792y.m109911b(r12, r14)     // Catch:{ Exception -> 0x0307 }
            int r11 = r11 + 1
            goto L_0x0124
        L_0x014a:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0307 }
            r11 = 24
            if (r6 < r11) goto L_0x01bb
            if (r13 == 0) goto L_0x01bb
            java.lang.String r5 = "AVCEncoder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0307 }
            java.lang.String r11 = "Set Profile: "
            r6.<init>(r11)     // Catch:{ Exception -> 0x0307 }
            int r11 = r13.profile     // Catch:{ Exception -> 0x0307 }
            r6.append(r11)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r11 = ", Level = "
            r6.append(r11)     // Catch:{ Exception -> 0x0307 }
            int r11 = r13.level     // Catch:{ Exception -> 0x0307 }
            r6.append(r11)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0307 }
            com.p683ss.android.vesdk.C50792y.m109909a(r5, r6)     // Catch:{ Exception -> 0x0307 }
            int r5 = r13.profile     // Catch:{ Exception -> 0x0307 }
            r1.f52987g = r5     // Catch:{ Exception -> 0x0307 }
            java.lang.String r5 = "profile"
            int r6 = r13.profile     // Catch:{ Exception -> 0x0307 }
            r0.setInteger(r5, r6)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r5 = "level"
            int r6 = r13.level     // Catch:{ Exception -> 0x0307 }
            r0.setInteger(r5, r6)     // Catch:{ Exception -> 0x0307 }
            int r5 = r13.profile     // Catch:{ Exception -> 0x0307 }
            if (r5 == r9) goto L_0x019b
            r6 = 8
            if (r5 == r6) goto L_0x018d
            r5 = r3
            goto L_0x01a9
        L_0x018d:
            java.lang.String r5 = "AVCEncoder"
            java.lang.String r6 = "Set High Profile"
            com.p683ss.android.vesdk.C50792y.m109909a(r5, r6)     // Catch:{ Exception -> 0x0307 }
            float r5 = (float) r3     // Catch:{ Exception -> 0x0307 }
            r6 = 1061158912(0x3f400000, float:0.75)
            float r5 = r5 * r6
            int r5 = (int) r5     // Catch:{ Exception -> 0x0307 }
            goto L_0x01a9
        L_0x019b:
            java.lang.String r5 = "AVCEncoder"
            java.lang.String r6 = "Set Main Profile"
            com.p683ss.android.vesdk.C50792y.m109909a(r5, r6)     // Catch:{ Exception -> 0x0307 }
            float r5 = (float) r3     // Catch:{ Exception -> 0x0307 }
            r6 = 1062836634(0x3f59999a, float:0.85)
            float r5 = r5 * r6
            int r5 = (int) r5     // Catch:{ Exception -> 0x0307 }
        L_0x01a9:
            java.lang.String r6 = "te_mediacodec_profile"
            int r11 = r13.profile     // Catch:{ Exception -> 0x0307 }
            long r11 = (long) r11     // Catch:{ Exception -> 0x0307 }
            r14 = 0
            com.p683ss.android.ttve.monitor.C20114g.m49645a(r14, r6, r11)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r6 = "iesve_record_mediacodec_profile"
            int r11 = r13.profile     // Catch:{ Exception -> 0x0307 }
            long r11 = (long) r11     // Catch:{ Exception -> 0x0307 }
            com.p683ss.android.ttve.monitor.C20114g.m49648a(r6, r11)     // Catch:{ Exception -> 0x0307 }
            goto L_0x01e1
        L_0x01bb:
            java.lang.String r6 = "AVCEncoder"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0307 }
            java.lang.String r12 = "Do not support profile "
            r11.<init>(r12)     // Catch:{ Exception -> 0x0307 }
            r11.append(r5)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r5 = ", use baseline"
            r11.append(r5)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r5 = r11.toString()     // Catch:{ Exception -> 0x0307 }
            com.p683ss.android.vesdk.C50792y.m109913c(r6, r5)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r5 = "te_mediacodec_profile"
            r11 = 1
            r6 = 0
            com.p683ss.android.ttve.monitor.C20114g.m49645a(r6, r5, r11)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r5 = "iesve_record_mediacodec_profile"
            com.p683ss.android.ttve.monitor.C20114g.m49648a(r5, r11)     // Catch:{ Exception -> 0x0307 }
            r5 = r3
        L_0x01e1:
            r6 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r5 <= r6) goto L_0x01e9
            r5 = 12000000(0xb71b00, float:1.6815582E-38)
        L_0x01e9:
            java.lang.String r6 = "AVCEncoder"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0307 }
            java.lang.String r12 = "bitrate = "
            r11.<init>(r12)     // Catch:{ Exception -> 0x0307 }
            float r12 = (float) r5     // Catch:{ Exception -> 0x0307 }
            r13 = 1065353216(0x3f800000, float:1.0)
            float r12 = r12 * r13
            r13 = 1232348160(0x49742400, float:1000000.0)
            float r12 = r12 / r13
            r11.append(r12)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r12 = "Mb/s"
            r11.append(r12)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0307 }
            com.p683ss.android.vesdk.C50792y.m109909a(r6, r11)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r6 = "AVCEncoder"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0307 }
            java.lang.String r12 = "speed = "
            r11.<init>(r12)     // Catch:{ Exception -> 0x0307 }
            r12 = r22
            r11.append(r12)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0307 }
            com.p683ss.android.vesdk.C50792y.m109909a(r6, r11)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r6 = "bitrate"
            r0.setInteger(r6, r5)     // Catch:{ Exception -> 0x0307 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0307 }
            if (r5 < r8) goto L_0x0292
            android.media.MediaCodecInfo$EncoderCapabilities r2 = r2.getEncoderCapabilities()     // Catch:{ Exception -> 0x0307 }
            r5 = 0
        L_0x022d:
            if (r5 >= r7) goto L_0x0253
            java.lang.String r6 = "AVCEncoder"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0307 }
            r11.<init>()     // Catch:{ Exception -> 0x0307 }
            java.lang.String[] r12 = f52980j     // Catch:{ Exception -> 0x0307 }
            r12 = r12[r5]     // Catch:{ Exception -> 0x0307 }
            r11.append(r12)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r12 = ": "
            r11.append(r12)     // Catch:{ Exception -> 0x0307 }
            boolean r12 = r2.isBitrateModeSupported(r5)     // Catch:{ Exception -> 0x0307 }
            r11.append(r12)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0307 }
            com.p683ss.android.vesdk.C50792y.m109909a(r6, r11)     // Catch:{ Exception -> 0x0307 }
            int r5 = r5 + 1
            goto L_0x022d
        L_0x0253:
            java.lang.String r5 = "bitrate-mode"
            r0.setInteger(r5, r4)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r5 = "AVCEncoder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0307 }
            java.lang.String r7 = "Bitrate mode = "
            r6.<init>(r7)     // Catch:{ Exception -> 0x0307 }
            r6.append(r4)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0307 }
            com.p683ss.android.vesdk.C50792y.m109909a(r5, r6)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r5 = "te_record_mediacodec_rate_control"
            long r6 = (long) r4     // Catch:{ Exception -> 0x0307 }
            r4 = 0
            com.p683ss.android.ttve.monitor.C20114g.m49645a(r4, r5, r6)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r4 = "max-bitrate"
            r0.setInteger(r4, r3)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r3 = "AVCEncoder"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0307 }
            java.lang.String r5 = "Encoder ComplexityRange: "
            r4.<init>(r5)     // Catch:{ Exception -> 0x0307 }
            android.util.Range r2 = r2.getComplexityRange()     // Catch:{ Exception -> 0x0307 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0307 }
            r4.append(r2)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x0307 }
            com.p683ss.android.vesdk.C50792y.m109909a(r3, r2)     // Catch:{ Exception -> 0x0307 }
        L_0x0292:
            java.lang.String r2 = "color-format"
            int r3 = r1.f52999u     // Catch:{ Exception -> 0x0307 }
            r0.setInteger(r2, r3)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r2 = "frame-rate"
            int r3 = r1.f52986f     // Catch:{ Exception -> 0x0307 }
            r0.setInteger(r2, r3)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r2 = "i-frame-interval"
            r0.setInteger(r2, r10)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r2 = "te_record_video_encode_gop"
            int r3 = r1.f52986f     // Catch:{ Exception -> 0x0307 }
            int r3 = r3 * 1
            long r3 = (long) r3     // Catch:{ Exception -> 0x0307 }
            r5 = 0
            com.p683ss.android.ttve.monitor.C20114g.m49645a(r5, r2, r3)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r2 = "AVCEncoder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0307 }
            java.lang.String r4 = "initAVCEncoder: format = "
            r3.<init>(r4)     // Catch:{ Exception -> 0x0307 }
            r3.append(r0)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0307 }
            com.p683ss.android.vesdk.C50792y.m109909a(r2, r3)     // Catch:{ Exception -> 0x0307 }
            android.media.MediaCodec r2 = r1.f52990l     // Catch:{ Exception -> 0x0307 }
            r3 = 0
            r2.configure(r0, r3, r3, r10)     // Catch:{ Exception -> 0x0307 }
            android.media.MediaCodec r0 = r1.f52990l     // Catch:{ Exception -> 0x0307 }
            android.view.Surface r0 = r0.createInputSurface()     // Catch:{ Exception -> 0x0307 }
            r1.f52993o = r0     // Catch:{ Exception -> 0x0307 }
            android.media.MediaCodec r0 = r1.f52990l     // Catch:{ Exception -> 0x0307 }
            r0.start()     // Catch:{ Exception -> 0x0307 }
            r1.f52985e = r9     // Catch:{ Exception -> 0x0307 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0307 }
            if (r0 >= r8) goto L_0x02ec
            android.media.MediaCodec r0 = r1.f52990l     // Catch:{ Exception -> 0x0307 }
            java.nio.ByteBuffer[] r0 = r0.getInputBuffers()     // Catch:{ Exception -> 0x0307 }
            r1.f52983c = r0     // Catch:{ Exception -> 0x0307 }
            android.media.MediaCodec r0 = r1.f52990l     // Catch:{ Exception -> 0x0307 }
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()     // Catch:{ Exception -> 0x0307 }
            r1.f52984d = r0     // Catch:{ Exception -> 0x0307 }
        L_0x02ec:
            android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo     // Catch:{ Exception -> 0x0307 }
            r0.<init>()     // Catch:{ Exception -> 0x0307 }
            r1.f52982b = r0     // Catch:{ Exception -> 0x0307 }
            android.view.Surface r0 = r1.f52993o     // Catch:{ all -> 0x0305 }
            if (r0 != 0) goto L_0x02fa
            monitor-exit(r16)     // Catch:{ all -> 0x0305 }
            r0 = 0
            return r0
        L_0x02fa:
            monitor-exit(r16)     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = "AVCEncoder"
            java.lang.String r2 = "initAVCEncoder == exit"
            com.p683ss.android.vesdk.C50792y.m109909a(r0, r2)
            android.view.Surface r0 = r1.f52993o
            return r0
        L_0x0305:
            r0 = move-exception
            goto L_0x030a
        L_0x0307:
            monitor-exit(r16)     // Catch:{ all -> 0x0305 }
            r0 = 0
            return r0
        L_0x030a:
            monitor-exit(r16)     // Catch:{ all -> 0x0305 }
            throw r0
        L_0x030c:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.C19216a.mo39594a(int, int, int, int, int, int, boolean):android.view.Surface");
    }
}
