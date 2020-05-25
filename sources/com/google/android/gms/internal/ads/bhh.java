package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;

public final class bhh extends bhl {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final bhk f42388f;

    /* renamed from: g */
    private final bil f42389g;

    /* renamed from: h */
    private int f42390h;

    /* renamed from: i */
    private long f42391i;

    public bhh(bii bii, Handler handler, bhk bhk) {
        this(bii, null, true, handler, bhk);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo30185a() {
        return true;
    }

    private bhh(bii bii, biu biu, boolean z, Handler handler, bhk bhk) {
        super(bii, null, true, handler, bhk);
        this.f42388f = bhk;
        this.f42389g = new bil();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bgx mo30180a(String str, boolean z) throws bht {
        if (blk.m36008c(str)) {
            return new bgx("OMX.google.raw.decoder", true);
        }
        return super.mo30180a(str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30183a(MediaCodec mediaCodec, String str, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        if ("OMX.google.raw.decoder".equals(str)) {
            String string = mediaFormat.getString("mime");
            mediaFormat.setString("mime", "audio/raw");
            mediaCodec.configure(mediaFormat, null, mediaCrypto, 0);
            mediaFormat.setString("mime", string);
            return;
        }
        mediaCodec.configure(mediaFormat, null, mediaCrypto, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo30187a(String str) {
        return blk.m36007b(str) && super.mo30187a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30182a(long j, boolean z) {
        super.mo30182a(j, z);
        this.f42391i = Long.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30184a(bie bie, MediaFormat mediaFormat) {
        if (blk.m36008c(bie.f42471a)) {
            this.f42389g.mo30235a(bie.mo30219a(), 0);
        } else {
            this.f42389g.mo30235a(mediaFormat, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30188b() {
        super.mo30188b();
        this.f42389g.mo30238b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo30189c() {
        bil bil = this.f42389g;
        if (bil.mo30236a()) {
            bil.mo30241e();
            bil.f42498b.pause();
        }
        super.mo30189c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo30190d() {
        if (super.mo30190d()) {
            if (this.f42389g.mo30239c()) {
                bil bil = this.f42389g;
                if (!(bil.f42503g > ((long) ((bil.f42501e * 3) / 2)))) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo30191e() {
        return this.f42389g.mo30239c() || (super.mo30191e() && this.f42405d == 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final long mo30192f() {
        long a = this.f42389g.mo30233a(mo30190d());
        if (a == Long.MIN_VALUE) {
            this.f42391i = Math.max(this.f42391i, super.mo30192f());
        } else {
            this.f42391i = Math.max(this.f42391i, a);
        }
        return this.f42391i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo30193g() {
        this.f42390h = 0;
        try {
            this.f42389g.mo30240d();
        } finally {
            super.mo30193g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30181a(long j) throws bgy {
        super.mo30181a(j);
        this.f42389g.mo30240d();
        this.f42391i = Long.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0109 A[Catch:{ biq -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012b A[Catch:{ biq -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0159 A[Catch:{ biq -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0163 A[Catch:{ biq -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0192 A[SYNTHETIC, Splitter:B:94:0x0192] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo30186a(long r19, long r21, android.media.MediaCodec r23, java.nio.ByteBuffer r24, android.media.MediaCodec.BufferInfo r25, int r26, boolean r27) throws com.google.android.gms.internal.ads.bgy {
        /*
            r18 = this;
            r1 = r18
            r0 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = 2
            r6 = 0
            r7 = 1
            if (r27 == 0) goto L_0x0022
            r0.releaseOutputBuffer(r4, r6)
            com.google.android.gms.internal.ads.bgu r0 = r1.f42402a
            int r2 = r0.f42331f
            int r2 = r2 + r7
            r0.f42331f = r2
            com.google.android.gms.internal.ads.bil r0 = r1.f42389g
            int r2 = r0.f42504h
            if (r2 != r7) goto L_0x0021
            r0.f42504h = r5
        L_0x0021:
            return r7
        L_0x0022:
            com.google.android.gms.internal.ads.bil r8 = r1.f42389g
            boolean r8 = r8.mo30236a()
            if (r8 != 0) goto L_0x0062
            int r8 = r1.f42390h     // Catch:{ bip -> 0x0049 }
            if (r8 == 0) goto L_0x0036
            com.google.android.gms.internal.ads.bil r8 = r1.f42389g     // Catch:{ bip -> 0x0049 }
            int r9 = r1.f42390h     // Catch:{ bip -> 0x0049 }
            r8.mo30231a(r9)     // Catch:{ bip -> 0x0049 }
            goto L_0x003e
        L_0x0036:
            com.google.android.gms.internal.ads.bil r8 = r1.f42389g     // Catch:{ bip -> 0x0049 }
            int r8 = r8.mo30231a(r6)     // Catch:{ bip -> 0x0049 }
            r1.f42390h = r8     // Catch:{ bip -> 0x0049 }
        L_0x003e:
            int r8 = r1.f42494e
            r9 = 3
            if (r8 != r9) goto L_0x0062
            com.google.android.gms.internal.ads.bil r8 = r1.f42389g
            r8.mo30238b()
            goto L_0x0062
        L_0x0049:
            r0 = move-exception
            android.os.Handler r2 = r1.f42403b
            if (r2 == 0) goto L_0x005c
            com.google.android.gms.internal.ads.bhk r2 = r1.f42388f
            if (r2 == 0) goto L_0x005c
            android.os.Handler r2 = r1.f42403b
            com.google.android.gms.internal.ads.bhi r3 = new com.google.android.gms.internal.ads.bhi
            r3.<init>(r1, r0)
            r2.post(r3)
        L_0x005c:
            com.google.android.gms.internal.ads.bgy r2 = new com.google.android.gms.internal.ads.bgy
            r2.<init>(r0)
            throw r2
        L_0x0062:
            com.google.android.gms.internal.ads.bil r8 = r1.f42389g     // Catch:{ biq -> 0x0198 }
            int r9 = r3.offset     // Catch:{ biq -> 0x0198 }
            int r10 = r3.size     // Catch:{ biq -> 0x0198 }
            long r11 = r3.presentationTimeUs     // Catch:{ biq -> 0x0198 }
            if (r10 != 0) goto L_0x006f
            r6 = 2
            goto L_0x0178
        L_0x006f:
            int r3 = com.google.android.gms.internal.ads.blp.f42854a     // Catch:{ biq -> 0x0198 }
            r13 = 22
            r14 = 0
            if (r3 > r13) goto L_0x0099
            boolean r3 = r8.f42509m     // Catch:{ biq -> 0x0198 }
            if (r3 == 0) goto L_0x0099
            android.media.AudioTrack r3 = r8.f42498b     // Catch:{ biq -> 0x0198 }
            int r3 = r3.getPlayState()     // Catch:{ biq -> 0x0198 }
            if (r3 != r5) goto L_0x0085
            goto L_0x0178
        L_0x0085:
            android.media.AudioTrack r3 = r8.f42498b     // Catch:{ biq -> 0x0198 }
            int r3 = r3.getPlayState()     // Catch:{ biq -> 0x0198 }
            if (r3 != r7) goto L_0x0099
            com.google.android.gms.internal.ads.bin r3 = r8.f42497a     // Catch:{ biq -> 0x0198 }
            long r16 = r3.mo30245b()     // Catch:{ biq -> 0x0198 }
            int r3 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x0099
            goto L_0x0178
        L_0x0099:
            int r3 = r8.f42508l     // Catch:{ biq -> 0x0198 }
            if (r3 != 0) goto L_0x0102
            boolean r3 = r8.f42509m     // Catch:{ biq -> 0x0198 }
            if (r3 == 0) goto L_0x00b5
            int r3 = r8.f42510n     // Catch:{ biq -> 0x0198 }
            if (r3 != 0) goto L_0x00b5
            int r3 = r8.f42499c     // Catch:{ biq -> 0x0198 }
            int r13 = r10 << 3
            int r13 = r13 * r3
            r3 = 768000(0xbb800, float:1.076197E-39)
            int r13 = r13 + r3
            r3 = 1536000(0x177000, float:2.152394E-39)
            int r13 = r13 / r3
            r8.f42510n = r13     // Catch:{ biq -> 0x0198 }
        L_0x00b5:
            long r5 = (long) r10     // Catch:{ biq -> 0x0198 }
            long r5 = r8.mo30232a(r5)     // Catch:{ biq -> 0x0198 }
            long r5 = r8.mo30237b(r5)     // Catch:{ biq -> 0x0198 }
            r3 = 0
            long r11 = r11 - r5
            long r5 = r8.f42505i     // Catch:{ biq -> 0x0198 }
            int r3 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r3 != 0) goto L_0x00cf
            long r5 = java.lang.Math.max(r14, r11)     // Catch:{ biq -> 0x0198 }
            r8.f42505i = r5     // Catch:{ biq -> 0x0198 }
            r8.f42504h = r7     // Catch:{ biq -> 0x0198 }
            goto L_0x0102
        L_0x00cf:
            long r5 = r8.f42505i     // Catch:{ biq -> 0x0198 }
            long r13 = r8.f42503g     // Catch:{ biq -> 0x0198 }
            long r13 = r8.mo30232a(r13)     // Catch:{ biq -> 0x0198 }
            long r13 = r8.mo30237b(r13)     // Catch:{ biq -> 0x0198 }
            r3 = 0
            long r5 = r5 + r13
            int r3 = r8.f42504h     // Catch:{ biq -> 0x0198 }
            if (r3 != r7) goto L_0x00f2
            long r13 = r5 - r11
            long r13 = java.lang.Math.abs(r13)     // Catch:{ biq -> 0x0198 }
            r15 = 200000(0x30d40, double:9.8813E-319)
            int r3 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r3 <= 0) goto L_0x00f2
            r3 = 2
            r8.f42504h = r3     // Catch:{ biq -> 0x0198 }
            goto L_0x00f3
        L_0x00f2:
            r3 = 2
        L_0x00f3:
            int r13 = r8.f42504h     // Catch:{ biq -> 0x0198 }
            if (r13 != r3) goto L_0x0102
            long r13 = r8.f42505i     // Catch:{ biq -> 0x0198 }
            r3 = 0
            long r11 = r11 - r5
            long r13 = r13 + r11
            r8.f42505i = r13     // Catch:{ biq -> 0x0198 }
            r8.f42504h = r7     // Catch:{ biq -> 0x0198 }
            r3 = 1
            goto L_0x0103
        L_0x0102:
            r3 = 0
        L_0x0103:
            int r5 = r8.f42508l     // Catch:{ biq -> 0x0198 }
            r6 = 21
            if (r5 != 0) goto L_0x0127
            r8.f42508l = r10     // Catch:{ biq -> 0x0198 }
            r2.position(r9)     // Catch:{ biq -> 0x0198 }
            int r5 = com.google.android.gms.internal.ads.blp.f42854a     // Catch:{ biq -> 0x0198 }
            if (r5 >= r6) goto L_0x0127
            byte[] r5 = r8.f42506j     // Catch:{ biq -> 0x0198 }
            if (r5 == 0) goto L_0x011b
            byte[] r5 = r8.f42506j     // Catch:{ biq -> 0x0198 }
            int r5 = r5.length     // Catch:{ biq -> 0x0198 }
            if (r5 >= r10) goto L_0x011f
        L_0x011b:
            byte[] r5 = new byte[r10]     // Catch:{ biq -> 0x0198 }
            r8.f42506j = r5     // Catch:{ biq -> 0x0198 }
        L_0x011f:
            byte[] r5 = r8.f42506j     // Catch:{ biq -> 0x0198 }
            r9 = 0
            r2.get(r5, r9, r10)     // Catch:{ biq -> 0x0198 }
            r8.f42507k = r9     // Catch:{ biq -> 0x0198 }
        L_0x0127:
            int r5 = com.google.android.gms.internal.ads.blp.f42854a     // Catch:{ biq -> 0x0198 }
            if (r5 >= r6) goto L_0x0159
            long r5 = r8.f42503g     // Catch:{ biq -> 0x0198 }
            com.google.android.gms.internal.ads.bin r2 = r8.f42497a     // Catch:{ biq -> 0x0198 }
            long r9 = r2.mo30245b()     // Catch:{ biq -> 0x0198 }
            int r2 = r8.f42500d     // Catch:{ biq -> 0x0198 }
            long r11 = (long) r2     // Catch:{ biq -> 0x0198 }
            long r9 = r9 * r11
            long r5 = r5 - r9
            int r2 = (int) r5     // Catch:{ biq -> 0x0198 }
            int r5 = r8.f42502f     // Catch:{ biq -> 0x0198 }
            int r5 = r5 - r2
            if (r5 <= 0) goto L_0x0157
            int r2 = r8.f42508l     // Catch:{ biq -> 0x0198 }
            int r2 = java.lang.Math.min(r2, r5)     // Catch:{ biq -> 0x0198 }
            android.media.AudioTrack r5 = r8.f42498b     // Catch:{ biq -> 0x0198 }
            byte[] r6 = r8.f42506j     // Catch:{ biq -> 0x0198 }
            int r9 = r8.f42507k     // Catch:{ biq -> 0x0198 }
            int r6 = r5.write(r6, r9, r2)     // Catch:{ biq -> 0x0198 }
            if (r6 < 0) goto L_0x0161
            int r2 = r8.f42507k     // Catch:{ biq -> 0x0198 }
            int r2 = r2 + r6
            r8.f42507k = r2     // Catch:{ biq -> 0x0198 }
            goto L_0x0161
        L_0x0157:
            r6 = 0
            goto L_0x0161
        L_0x0159:
            android.media.AudioTrack r5 = r8.f42498b     // Catch:{ biq -> 0x0198 }
            int r6 = r8.f42508l     // Catch:{ biq -> 0x0198 }
            int r6 = r5.write(r2, r6, r7)     // Catch:{ biq -> 0x0198 }
        L_0x0161:
            if (r6 < 0) goto L_0x0192
            int r2 = r8.f42508l     // Catch:{ biq -> 0x0198 }
            int r2 = r2 - r6
            r8.f42508l = r2     // Catch:{ biq -> 0x0198 }
            long r9 = r8.f42503g     // Catch:{ biq -> 0x0198 }
            long r5 = (long) r6     // Catch:{ biq -> 0x0198 }
            long r9 = r9 + r5
            r8.f42503g = r9     // Catch:{ biq -> 0x0198 }
            int r2 = r8.f42508l     // Catch:{ biq -> 0x0198 }
            if (r2 != 0) goto L_0x0176
            r2 = r3 | 2
            r5 = r2
            goto L_0x0177
        L_0x0176:
            r5 = r3
        L_0x0177:
            r6 = r5
        L_0x0178:
            r2 = r6 & 1
            if (r2 == 0) goto L_0x0180
            r2 = -9223372036854775808
            r1.f42391i = r2
        L_0x0180:
            r2 = 2
            r2 = r2 & r6
            if (r2 == 0) goto L_0x0190
            r2 = 0
            r0.releaseOutputBuffer(r4, r2)
            com.google.android.gms.internal.ads.bgu r0 = r1.f42402a
            int r2 = r0.f42330e
            int r2 = r2 + r7
            r0.f42330e = r2
            return r7
        L_0x0190:
            r2 = 0
            return r2
        L_0x0192:
            com.google.android.gms.internal.ads.biq r0 = new com.google.android.gms.internal.ads.biq     // Catch:{ biq -> 0x0198 }
            r0.<init>(r6)     // Catch:{ biq -> 0x0198 }
            throw r0     // Catch:{ biq -> 0x0198 }
        L_0x0198:
            r0 = move-exception
            android.os.Handler r2 = r1.f42403b
            if (r2 == 0) goto L_0x01ab
            com.google.android.gms.internal.ads.bhk r2 = r1.f42388f
            if (r2 == 0) goto L_0x01ab
            android.os.Handler r2 = r1.f42403b
            com.google.android.gms.internal.ads.bhj r3 = new com.google.android.gms.internal.ads.bhj
            r3.<init>(r1, r0)
            r2.post(r3)
        L_0x01ab:
            com.google.android.gms.internal.ads.bgy r2 = new com.google.android.gms.internal.ads.bgy
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bhh.mo30186a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, android.media.MediaCodec$BufferInfo, int, boolean):boolean");
    }

    /* renamed from: a */
    public final void mo30161a(int i, Object obj) throws bgy {
        if (i == 1) {
            this.f42389g.mo30234a(((Float) obj).floatValue());
        } else {
            super.mo30161a(i, obj);
        }
    }
}
