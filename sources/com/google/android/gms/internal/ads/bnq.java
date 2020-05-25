package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;

public final class bnq extends bqd implements btm {

    /* renamed from: g */
    boolean f43105g;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final bmy f43106k;

    /* renamed from: l */
    private final bng f43107l;

    /* renamed from: m */
    private boolean f43108m;

    /* renamed from: n */
    private boolean f43109n;

    /* renamed from: o */
    private MediaFormat f43110o;

    /* renamed from: p */
    private int f43111p;

    /* renamed from: q */
    private int f43112q;

    /* renamed from: r */
    private long f43113r;

    public bnq(bqf bqf) {
        this(bqf, null, true);
    }

    /* renamed from: c */
    public final btm mo30350c() {
        return this;
    }

    private bnq(bqf bqf, boh<Object> boh, boolean z) {
        this(bqf, null, true, null, null);
    }

    private bnq(bqf bqf, boh<Object> boh, boolean z, Handler handler, bmx bmx) {
        this(bqf, null, true, null, null, null, new bmv[0]);
    }

    private bnq(bqf bqf, boh<Object> boh, boolean z, Handler handler, bmx bmx, bmu bmu, bmv... bmvArr) {
        super(1, bqf, null, true);
        this.f43107l = new bng(null, bmvArr, new bns(this));
        this.f43106k = new bmy(null, null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        if (r3 == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008c, code lost:
        if (r9 == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008f, code lost:
        r0 = false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo30463a(com.google.android.gms.internal.ads.bqf r9, com.google.android.gms.internal.ads.zzlg r10) throws com.google.android.gms.internal.ads.bqj {
        /*
            r8 = this;
            java.lang.String r0 = r10.f46253c
            boolean r1 = com.google.android.gms.internal.ads.btn.m36714a(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = com.google.android.gms.internal.ads.btw.f43878a
            r3 = 21
            if (r1 < r3) goto L_0x0013
            r1 = 16
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            boolean r4 = r8.m36232a(r0)
            r5 = 3
            if (r4 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.bqc r4 = r9.mo30555a()
            if (r4 == 0) goto L_0x0025
            r9 = r1 | 4
            r9 = r9 | r5
            return r9
        L_0x0025:
            com.google.android.gms.internal.ads.bqc r9 = r9.mo30556a(r0, r2)
            r0 = 1
            if (r9 != 0) goto L_0x002d
            return r0
        L_0x002d:
            int r4 = com.google.android.gms.internal.ads.btw.f43878a
            if (r4 < r3) goto L_0x0090
            int r3 = r10.f46263m
            r4 = -1
            if (r3 == r4) goto L_0x0060
            int r3 = r10.f46263m
            android.media.MediaCodecInfo$CodecCapabilities r6 = r9.f43537f
            if (r6 != 0) goto L_0x003e
        L_0x003c:
            r3 = 0
            goto L_0x005e
        L_0x003e:
            android.media.MediaCodecInfo$CodecCapabilities r6 = r9.f43537f
            android.media.MediaCodecInfo$AudioCapabilities r6 = r6.getAudioCapabilities()
            if (r6 != 0) goto L_0x0047
            goto L_0x003c
        L_0x0047:
            boolean r6 = r6.isSampleRateSupported(r3)
            if (r6 != 0) goto L_0x005d
            r6 = 31
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "sampleRate.support, "
            r7.append(r6)
            r7.append(r3)
            goto L_0x003c
        L_0x005d:
            r3 = 1
        L_0x005e:
            if (r3 == 0) goto L_0x008f
        L_0x0060:
            int r3 = r10.f46262l
            if (r3 == r4) goto L_0x0090
            int r10 = r10.f46262l
            android.media.MediaCodecInfo$CodecCapabilities r3 = r9.f43537f
            if (r3 != 0) goto L_0x006c
        L_0x006a:
            r9 = 0
            goto L_0x008c
        L_0x006c:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r9.f43537f
            android.media.MediaCodecInfo$AudioCapabilities r9 = r9.getAudioCapabilities()
            if (r9 != 0) goto L_0x0075
            goto L_0x006a
        L_0x0075:
            int r9 = r9.getMaxInputChannelCount()
            if (r9 >= r10) goto L_0x008b
            r9 = 33
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r9)
            java.lang.String r9 = "channelCount.support, "
            r3.append(r9)
            r3.append(r10)
            goto L_0x006a
        L_0x008b:
            r9 = 1
        L_0x008c:
            if (r9 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r0 = 0
        L_0x0090:
            if (r0 == 0) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r5 = 2
        L_0x0094:
            r9 = r1 | 4
            r9 = r9 | r5
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bnq.mo30463a(com.google.android.gms.internal.ads.bqf, com.google.android.gms.internal.ads.zzlg):int");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqc mo30465a(bqf bqf, zzlg zzlg, boolean z) throws bqj {
        if (m36232a(zzlg.f46253c)) {
            bqc a = bqf.mo30555a();
            if (a != null) {
                this.f43108m = true;
                return a;
            }
        }
        this.f43108m = false;
        return super.mo30465a(bqf, zzlg, z);
    }

    /* renamed from: a */
    private final boolean m36232a(String str) {
        return this.f43107l.mo30440a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30467a(bqc bqc, MediaCodec mediaCodec, zzlg zzlg, MediaCrypto mediaCrypto) {
        this.f43109n = btw.f43878a < 24 && "OMX.SEC.aac.dec".equals(bqc.f43532a) && "samsung".equals(btw.f43880c) && (btw.f43879b.startsWith("zeroflte") || btw.f43879b.startsWith("herolte") || btw.f43879b.startsWith("heroqlte"));
        if (this.f43108m) {
            this.f43110o = zzlg.mo31603b();
            this.f43110o.setString("mime", "audio/raw");
            mediaCodec.configure(this.f43110o, null, null, 0);
            this.f43110o.setString("mime", zzlg.f46253c);
            return;
        }
        mediaCodec.configure(zzlg.mo31603b(), null, null, 0);
        this.f43110o = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30468a(String str, long j, long j2) {
        bmy bmy = this.f43106k;
        if (bmy.f43004b != null) {
            Handler handler = bmy.f43003a;
            bnb bnb = new bnb(bmy, str, j, j2);
            handler.post(bnb);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30470b(zzlg zzlg) throws blt {
        super.mo30470b(zzlg);
        bmy bmy = this.f43106k;
        if (bmy.f43004b != null) {
            bmy.f43003a.post(new bnc(bmy, zzlg));
        }
        this.f43111p = "audio/raw".equals(zzlg.f46253c) ? zzlg.f46264n : 2;
        this.f43112q = zzlg.f46262l;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x016d A[Catch:{ bmw -> 0x0082, bnk -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0173 A[Catch:{ bmw -> 0x0082, bnk -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0114 A[Catch:{ bmw -> 0x0082, bnk -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0115 A[Catch:{ bmw -> 0x0082, bnk -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0120 A[Catch:{ bmw -> 0x0082, bnk -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0130 A[Catch:{ bmw -> 0x0082, bnk -> 0x019c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30466a(android.media.MediaCodec r18, android.media.MediaFormat r19) throws com.google.android.gms.internal.ads.blt {
        /*
            r17 = this;
            r1 = r17
            android.media.MediaFormat r0 = r1.f43110o
            r3 = 1
            if (r0 == 0) goto L_0x0009
            r0 = 1
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            if (r0 == 0) goto L_0x0015
            android.media.MediaFormat r4 = r1.f43110o
            java.lang.String r5 = "mime"
            java.lang.String r4 = r4.getString(r5)
            goto L_0x0017
        L_0x0015:
            java.lang.String r4 = "audio/raw"
        L_0x0017:
            if (r0 == 0) goto L_0x001c
            android.media.MediaFormat r0 = r1.f43110o
            goto L_0x001e
        L_0x001c:
            r0 = r19
        L_0x001e:
            java.lang.String r5 = "channel-count"
            int r5 = r0.getInteger(r5)
            java.lang.String r6 = "sample-rate"
            int r0 = r0.getInteger(r6)
            boolean r6 = r1.f43109n
            r7 = 6
            if (r6 == 0) goto L_0x0043
            if (r5 != r7) goto L_0x0043
            int r6 = r1.f43112q
            if (r6 >= r7) goto L_0x0043
            int r6 = r1.f43112q
            int[] r6 = new int[r6]
            r8 = 0
        L_0x003a:
            int r9 = r1.f43112q
            if (r8 >= r9) goto L_0x0044
            r6[r8] = r8
            int r8 = r8 + 1
            goto L_0x003a
        L_0x0043:
            r6 = 0
        L_0x0044:
            com.google.android.gms.internal.ads.bng r8 = r1.f43107l     // Catch:{ bnk -> 0x019c }
            int r9 = r1.f43111p     // Catch:{ bnk -> 0x019c }
            java.lang.String r10 = "audio/raw"
            boolean r10 = r10.equals(r4)     // Catch:{ bnk -> 0x019c }
            r10 = r10 ^ r3
            if (r10 == 0) goto L_0x0056
            int r4 = com.google.android.gms.internal.ads.bng.m36186b(r4)     // Catch:{ bnk -> 0x019c }
            goto L_0x0057
        L_0x0056:
            r4 = r9
        L_0x0057:
            r11 = 2
            if (r10 != 0) goto L_0x0092
            int r9 = com.google.android.gms.internal.ads.btw.m36764b(r9, r5)     // Catch:{ bnk -> 0x019c }
            r8.f43064n = r9     // Catch:{ bnk -> 0x019c }
            com.google.android.gms.internal.ads.bnp r9 = r8.f43047a     // Catch:{ bnk -> 0x019c }
            r9.f43097b = r6     // Catch:{ bnk -> 0x019c }
            com.google.android.gms.internal.ads.bmv[] r6 = r8.f43052b     // Catch:{ bnk -> 0x019c }
            int r9 = r6.length     // Catch:{ bnk -> 0x019c }
            r13 = r4
            r12 = r5
            r4 = 0
            r5 = 0
        L_0x006b:
            if (r4 >= r9) goto L_0x008a
            r14 = r6[r4]     // Catch:{ bnk -> 0x019c }
            boolean r15 = r14.mo30422a(r0, r12, r13)     // Catch:{ bmw -> 0x0082 }
            r5 = r5 | r15
            boolean r15 = r14.mo30421a()     // Catch:{ bnk -> 0x019c }
            if (r15 == 0) goto L_0x007f
            int r12 = r14.mo30423b()     // Catch:{ bnk -> 0x019c }
            r13 = 2
        L_0x007f:
            int r4 = r4 + 1
            goto L_0x006b
        L_0x0082:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.internal.ads.bnk r0 = new com.google.android.gms.internal.ads.bnk     // Catch:{ bnk -> 0x019c }
            r0.<init>(r2)     // Catch:{ bnk -> 0x019c }
            throw r0     // Catch:{ bnk -> 0x019c }
        L_0x008a:
            if (r5 == 0) goto L_0x008f
            r8.mo30439a()     // Catch:{ bnk -> 0x019c }
        L_0x008f:
            r4 = r5
            r5 = r12
            goto L_0x0094
        L_0x0092:
            r13 = r4
            r4 = 0
        L_0x0094:
            r6 = 252(0xfc, float:3.53E-43)
            r9 = 12
            switch(r5) {
                case 1: goto L_0x00b4;
                case 2: goto L_0x00b1;
                case 3: goto L_0x00ae;
                case 4: goto L_0x00ab;
                case 5: goto L_0x00a8;
                case 6: goto L_0x00a5;
                case 7: goto L_0x00a2;
                case 8: goto L_0x009f;
                default: goto L_0x009b;
            }     // Catch:{ bnk -> 0x019c }
        L_0x009b:
            com.google.android.gms.internal.ads.bnk r0 = new com.google.android.gms.internal.ads.bnk     // Catch:{ bnk -> 0x019c }
            goto L_0x0185
        L_0x009f:
            int r12 = com.google.android.gms.internal.ads.bls.f42866a     // Catch:{ bnk -> 0x019c }
            goto L_0x00b5
        L_0x00a2:
            r12 = 1276(0x4fc, float:1.788E-42)
            goto L_0x00b5
        L_0x00a5:
            r12 = 252(0xfc, float:3.53E-43)
            goto L_0x00b5
        L_0x00a8:
            r12 = 220(0xdc, float:3.08E-43)
            goto L_0x00b5
        L_0x00ab:
            r12 = 204(0xcc, float:2.86E-43)
            goto L_0x00b5
        L_0x00ae:
            r12 = 28
            goto L_0x00b5
        L_0x00b1:
            r12 = 12
            goto L_0x00b5
        L_0x00b4:
            r12 = 4
        L_0x00b5:
            int r14 = com.google.android.gms.internal.ads.btw.f43878a     // Catch:{ bnk -> 0x019c }
            r15 = 23
            r2 = 5
            if (r14 > r15) goto L_0x00dc
            java.lang.String r14 = "foster"
            java.lang.String r15 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ bnk -> 0x019c }
            boolean r14 = r14.equals(r15)     // Catch:{ bnk -> 0x019c }
            if (r14 == 0) goto L_0x00dc
            java.lang.String r14 = "NVIDIA"
            java.lang.String r15 = com.google.android.gms.internal.ads.btw.f43880c     // Catch:{ bnk -> 0x019c }
            boolean r14 = r14.equals(r15)     // Catch:{ bnk -> 0x019c }
            if (r14 == 0) goto L_0x00dc
            r14 = 3
            if (r5 == r14) goto L_0x00dd
            if (r5 == r2) goto L_0x00dd
            r6 = 7
            if (r5 == r6) goto L_0x00d9
            goto L_0x00dc
        L_0x00d9:
            int r6 = com.google.android.gms.internal.ads.bls.f42866a     // Catch:{ bnk -> 0x019c }
            goto L_0x00dd
        L_0x00dc:
            r6 = r12
        L_0x00dd:
            int r12 = com.google.android.gms.internal.ads.btw.f43878a     // Catch:{ bnk -> 0x019c }
            r14 = 25
            if (r12 > r14) goto L_0x00f3
            java.lang.String r12 = "fugu"
            java.lang.String r14 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ bnk -> 0x019c }
            boolean r12 = r12.equals(r14)     // Catch:{ bnk -> 0x019c }
            if (r12 == 0) goto L_0x00f3
            if (r10 == 0) goto L_0x00f3
            if (r5 != r3) goto L_0x00f3
            r6 = 12
        L_0x00f3:
            if (r4 != 0) goto L_0x0107
            boolean r4 = r8.mo30448g()     // Catch:{ bnk -> 0x019c }
            if (r4 == 0) goto L_0x0107
            int r4 = r8.f43056f     // Catch:{ bnk -> 0x019c }
            if (r4 != r13) goto L_0x0107
            int r4 = r8.f43054d     // Catch:{ bnk -> 0x019c }
            if (r4 != r0) goto L_0x0107
            int r4 = r8.f43055e     // Catch:{ bnk -> 0x019c }
            if (r4 == r6) goto L_0x0184
        L_0x0107:
            r8.mo30447f()     // Catch:{ bnk -> 0x019c }
            r8.f43056f = r13     // Catch:{ bnk -> 0x019c }
            r8.f43059i = r10     // Catch:{ bnk -> 0x019c }
            r8.f43054d = r0     // Catch:{ bnk -> 0x019c }
            r8.f43055e = r6     // Catch:{ bnk -> 0x019c }
            if (r10 == 0) goto L_0x0115
            goto L_0x0116
        L_0x0115:
            r13 = 2
        L_0x0116:
            r8.f43057g = r13     // Catch:{ bnk -> 0x019c }
            int r4 = com.google.android.gms.internal.ads.btw.m36764b(r11, r5)     // Catch:{ bnk -> 0x019c }
            r8.f43065o = r4     // Catch:{ bnk -> 0x019c }
            if (r10 == 0) goto L_0x0130
            int r0 = r8.f43057g     // Catch:{ bnk -> 0x019c }
            if (r0 == r2) goto L_0x012d
            int r0 = r8.f43057g     // Catch:{ bnk -> 0x019c }
            if (r0 != r7) goto L_0x0129
            goto L_0x012d
        L_0x0129:
            r0 = 49152(0xc000, float:6.8877E-41)
            goto L_0x0169
        L_0x012d:
            r0 = 20480(0x5000, float:2.8699E-41)
            goto L_0x0169
        L_0x0130:
            int r2 = r8.f43057g     // Catch:{ bnk -> 0x019c }
            int r0 = android.media.AudioTrack.getMinBufferSize(r0, r6, r2)     // Catch:{ bnk -> 0x019c }
            r2 = -2
            if (r0 == r2) goto L_0x013c
            r16 = 1
            goto L_0x013e
        L_0x013c:
            r16 = 0
        L_0x013e:
            com.google.android.gms.internal.ads.bti.m36701b(r16)     // Catch:{ bnk -> 0x019c }
            int r2 = r0 << 2
            r3 = 250000(0x3d090, double:1.235164E-318)
            long r3 = r8.mo30442b(r3)     // Catch:{ bnk -> 0x019c }
            int r3 = (int) r3     // Catch:{ bnk -> 0x019c }
            int r4 = r8.f43065o     // Catch:{ bnk -> 0x019c }
            int r3 = r3 * r4
            long r4 = (long) r0     // Catch:{ bnk -> 0x019c }
            r6 = 750000(0xb71b0, double:3.70549E-318)
            long r6 = r8.mo30442b(r6)     // Catch:{ bnk -> 0x019c }
            int r0 = r8.f43065o     // Catch:{ bnk -> 0x019c }
            long r11 = (long) r0     // Catch:{ bnk -> 0x019c }
            long r6 = r6 * r11
            long r4 = java.lang.Math.max(r4, r6)     // Catch:{ bnk -> 0x019c }
            int r0 = (int) r4     // Catch:{ bnk -> 0x019c }
            if (r2 >= r3) goto L_0x0165
            r0 = r3
            goto L_0x0169
        L_0x0165:
            if (r2 <= r0) goto L_0x0168
            goto L_0x0169
        L_0x0168:
            r0 = r2
        L_0x0169:
            r8.f43060j = r0     // Catch:{ bnk -> 0x019c }
            if (r10 == 0) goto L_0x0173
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x017d
        L_0x0173:
            int r0 = r8.f43060j     // Catch:{ bnk -> 0x019c }
            int r2 = r8.f43065o     // Catch:{ bnk -> 0x019c }
            int r0 = r0 / r2
            long r2 = (long) r0     // Catch:{ bnk -> 0x019c }
            long r2 = r8.mo30436a(r2)     // Catch:{ bnk -> 0x019c }
        L_0x017d:
            r8.f43061k = r2     // Catch:{ bnk -> 0x019c }
            com.google.android.gms.internal.ads.bml r0 = r8.f43062l     // Catch:{ bnk -> 0x019c }
            r8.mo30438a(r0)     // Catch:{ bnk -> 0x019c }
        L_0x0184:
            return
        L_0x0185:
            r2 = 38
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ bnk -> 0x019c }
            r3.<init>(r2)     // Catch:{ bnk -> 0x019c }
            java.lang.String r2 = "Unsupported channel count: "
            r3.append(r2)     // Catch:{ bnk -> 0x019c }
            r3.append(r5)     // Catch:{ bnk -> 0x019c }
            java.lang.String r2 = r3.toString()     // Catch:{ bnk -> 0x019c }
            r0.<init>(r2)     // Catch:{ bnk -> 0x019c }
            throw r0     // Catch:{ bnk -> 0x019c }
        L_0x019c:
            r0 = move-exception
            int r2 = r1.f42859b
            com.google.android.gms.internal.ads.blt r0 = com.google.android.gms.internal.ads.blt.zza(r0, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bnq.mo30466a(android.media.MediaCodec, android.media.MediaFormat):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30346a(boolean z) throws blt {
        super.mo30346a(z);
        bmy bmy = this.f43106k;
        bob bob = this.f43560j;
        if (bmy.f43004b != null) {
            bmy.f43003a.post(new bna(bmy, bob));
        }
        int i = this.f42858a.f42975b;
        boolean z2 = false;
        if (i != 0) {
            bng bng = this.f43107l;
            if (btw.f43878a >= 21) {
                z2 = true;
            }
            bti.m36701b(z2);
            if (!bng.f43071u || bng.f43070t != i) {
                bng.f43071u = true;
                bng.f43070t = i;
                bng.mo30447f();
            }
            return;
        }
        bng bng2 = this.f43107l;
        if (bng2.f43071u) {
            bng2.f43071u = false;
            bng2.f43070t = 0;
            bng2.mo30447f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30344a(long j, boolean z) throws blt {
        super.mo30344a(j, z);
        this.f43107l.mo30447f();
        this.f43113r = j;
        this.f43105g = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo30360m() {
        super.mo30360m();
        this.f43107l.mo30443b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo30361n() {
        bng bng = this.f43107l;
        bng.f43069s = false;
        if (bng.mo30448g()) {
            bng.mo30450i();
            bng.f43053c.mo30452a();
        }
        super.mo30361n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo30362o() {
        try {
            bng bng = this.f43107l;
            bng.mo30447f();
            for (bmv g : bng.f43052b) {
                g.mo30428g();
            }
            bng.f43070t = 0;
            bng.f43069s = false;
            try {
                super.mo30362o();
            } finally {
                this.f43106k.mo30429a(this.f43560j);
            }
        } catch (Throwable th) {
            super.mo30362o();
            throw th;
        } finally {
            this.f43106k.mo30429a(this.f43560j);
        }
    }

    /* renamed from: q */
    public final boolean mo30404q() {
        if (super.mo30404q()) {
            bng bng = this.f43107l;
            if (!bng.mo30448g() || (bng.f43068r && !bng.mo30445d())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public final boolean mo30403p() {
        return this.f43107l.mo30445d() || super.mo30403p();
    }

    /* renamed from: r */
    public final long mo30471r() {
        long a = this.f43107l.mo30437a(mo30404q());
        if (a != Long.MIN_VALUE) {
            if (!this.f43105g) {
                a = Math.max(this.f43113r, a);
            }
            this.f43113r = a;
            this.f43105g = false;
        }
        return this.f43113r;
    }

    /* renamed from: a */
    public final bml mo30464a(bml bml) {
        return this.f43107l.mo30438a(bml);
    }

    /* renamed from: s */
    public final bml mo30472s() {
        return this.f43107l.f43062l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo30469a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws blt {
        if (this.f43108m && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f43560j.f43178e++;
            bng bng = this.f43107l;
            if (bng.f43066p == 1) {
                bng.f43066p = 2;
            }
            return true;
        } else {
            try {
                if (!this.f43107l.mo30441a(byteBuffer, j3)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.f43560j.f43177d++;
                return true;
            } catch (bnl | bno e) {
                throw blt.zza(e, this.f42859b);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo30473t() throws blt {
        try {
            bng bng = this.f43107l;
            if (!bng.f43068r) {
                if (bng.mo30448g()) {
                    if (bng.mo30444c()) {
                        bng.f43053c.mo30453a(bng.mo30449h());
                        bng.f43063m = 0;
                        bng.f43068r = true;
                    }
                }
            }
        } catch (bno e) {
            throw blt.zza(e, this.f42859b);
        }
    }

    /* renamed from: a */
    public final void mo30342a(int i, Object obj) throws blt {
        switch (i) {
            case 2:
                bng bng = this.f43107l;
                float floatValue = ((Float) obj).floatValue();
                if (bng.f43067q != floatValue) {
                    bng.f43067q = floatValue;
                    bng.mo30446e();
                }
                return;
            case 3:
                int intValue = ((Integer) obj).intValue();
                bng bng2 = this.f43107l;
                if (bng2.f43058h != intValue) {
                    bng2.f43058h = intValue;
                    if (!bng2.f43071u) {
                        bng2.mo30447f();
                        bng2.f43070t = 0;
                    }
                }
                return;
            default:
                super.mo30342a(i, obj);
                return;
        }
    }
}
