package com.google.android.gms.internal.ads;

import android.media.AudioAttributes.Builder;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public final class bng {

    /* renamed from: A */
    private final LinkedList<bnn> f43021A;

    /* renamed from: B */
    private AudioTrack f43022B;

    /* renamed from: C */
    private bml f43023C;

    /* renamed from: D */
    private long f43024D;

    /* renamed from: E */
    private long f43025E;

    /* renamed from: F */
    private ByteBuffer f43026F;

    /* renamed from: G */
    private int f43027G;

    /* renamed from: H */
    private int f43028H;

    /* renamed from: I */
    private long f43029I;

    /* renamed from: J */
    private long f43030J;

    /* renamed from: K */
    private boolean f43031K;

    /* renamed from: L */
    private long f43032L;

    /* renamed from: M */
    private Method f43033M;

    /* renamed from: N */
    private long f43034N;

    /* renamed from: O */
    private long f43035O;

    /* renamed from: P */
    private long f43036P;

    /* renamed from: Q */
    private long f43037Q;

    /* renamed from: R */
    private int f43038R;

    /* renamed from: S */
    private long f43039S;

    /* renamed from: T */
    private long f43040T;

    /* renamed from: U */
    private long f43041U;

    /* renamed from: V */
    private bmv[] f43042V;

    /* renamed from: W */
    private ByteBuffer[] f43043W;

    /* renamed from: X */
    private ByteBuffer f43044X;

    /* renamed from: Y */
    private ByteBuffer f43045Y;

    /* renamed from: Z */
    private byte[] f43046Z;

    /* renamed from: a */
    final bnp f43047a;

    /* renamed from: aa */
    private int f43048aa;

    /* renamed from: ab */
    private int f43049ab;

    /* renamed from: ac */
    private boolean f43050ac;

    /* renamed from: ad */
    private long f43051ad;

    /* renamed from: b */
    final bmv[] f43052b;

    /* renamed from: c */
    final bni f43053c;

    /* renamed from: d */
    int f43054d;

    /* renamed from: e */
    int f43055e;

    /* renamed from: f */
    int f43056f;

    /* renamed from: g */
    int f43057g;

    /* renamed from: h */
    int f43058h;

    /* renamed from: i */
    boolean f43059i;

    /* renamed from: j */
    int f43060j;

    /* renamed from: k */
    long f43061k;

    /* renamed from: l */
    public bml f43062l;

    /* renamed from: m */
    int f43063m;

    /* renamed from: n */
    int f43064n;

    /* renamed from: o */
    int f43065o;

    /* renamed from: p */
    int f43066p;

    /* renamed from: q */
    float f43067q;

    /* renamed from: r */
    boolean f43068r;

    /* renamed from: s */
    boolean f43069s;

    /* renamed from: t */
    int f43070t;

    /* renamed from: u */
    boolean f43071u;

    /* renamed from: v */
    private final bmu f43072v;

    /* renamed from: w */
    private final bnv f43073w;

    /* renamed from: x */
    private final bnm f43074x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final ConditionVariable f43075y = new ConditionVariable(true);

    /* renamed from: z */
    private final long[] f43076z;

    public bng(bmu bmu, bmv[] bmvArr, bnm bnm) {
        this.f43074x = bnm;
        if (btw.f43878a >= 18) {
            try {
                this.f43033M = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (btw.f43878a >= 19) {
            this.f43053c = new bnj();
        } else {
            this.f43053c = new bni(null);
        }
        this.f43047a = new bnp();
        this.f43073w = new bnv();
        this.f43052b = new bmv[(bmvArr.length + 3)];
        this.f43052b[0] = new bnt();
        this.f43052b[1] = this.f43047a;
        System.arraycopy(bmvArr, 0, this.f43052b, 2, bmvArr.length);
        this.f43052b[bmvArr.length + 2] = this.f43073w;
        this.f43076z = new long[10];
        this.f43067q = 1.0f;
        this.f43066p = 0;
        this.f43058h = 3;
        this.f43070t = 0;
        this.f43062l = bml.f42970a;
        this.f43049ab = -1;
        this.f43042V = new bmv[0];
        this.f43043W = new ByteBuffer[0];
        this.f43021A = new LinkedList<>();
    }

    /* renamed from: a */
    public final boolean mo30440a(String str) {
        if (this.f43072v != null) {
            if (Arrays.binarySearch(this.f43072v.f43000a, m36186b(str)) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final long mo30437a(boolean z) {
        long j;
        long j2;
        long j3;
        if (!(mo30448g() && this.f43066p != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.f43022B.getPlayState() == 3) {
            long c = this.f43053c.mo30456c();
            if (c != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f43030J >= 30000) {
                    this.f43076z[this.f43027G] = c - nanoTime;
                    this.f43027G = (this.f43027G + 1) % 10;
                    if (this.f43028H < 10) {
                        this.f43028H++;
                    }
                    this.f43030J = nanoTime;
                    this.f43029I = 0;
                    for (int i = 0; i < this.f43028H; i++) {
                        this.f43029I += this.f43076z[i] / ((long) this.f43028H);
                    }
                }
                if (!m36189j() && nanoTime - this.f43032L >= 500000) {
                    this.f43031K = this.f43053c.mo30457d();
                    if (this.f43031K) {
                        long e = this.f43053c.mo30458e() / 1000;
                        long f = this.f43053c.mo30459f();
                        if (e < this.f43040T) {
                            this.f43031K = false;
                        } else if (Math.abs(e - nanoTime) > 5000000) {
                            StringBuilder sb = new StringBuilder(136);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(f);
                            sb.append(", ");
                            sb.append(e);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(c);
                            this.f43031K = false;
                        } else if (Math.abs(mo30436a(f) - c) > 5000000) {
                            StringBuilder sb2 = new StringBuilder(138);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(f);
                            sb2.append(", ");
                            sb2.append(e);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(c);
                            this.f43031K = false;
                        }
                    }
                    if (this.f43033M != null && !this.f43059i) {
                        try {
                            this.f43041U = (((long) ((Integer) this.f43033M.invoke(this.f43022B, null)).intValue()) * 1000) - this.f43061k;
                            this.f43041U = Math.max(this.f43041U, 0);
                            if (this.f43041U > 5000000) {
                                this.f43041U = 0;
                            }
                        } catch (Exception unused) {
                            this.f43033M = null;
                        }
                    }
                    this.f43032L = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.f43031K) {
            j = mo30436a(this.f43053c.mo30459f() + mo30442b(nanoTime2 - (this.f43053c.mo30458e() / 1000)));
        } else {
            if (this.f43028H == 0) {
                j3 = this.f43053c.mo30456c();
            } else {
                j3 = nanoTime2 + this.f43029I;
            }
            j = j3;
            if (!z) {
                j -= this.f43041U;
            }
        }
        long j4 = this.f43039S;
        while (!this.f43021A.isEmpty() && j >= ((bnn) this.f43021A.getFirst()).f43095c) {
            bnn bnn = (bnn) this.f43021A.remove();
            this.f43062l = bnn.f43094b;
            this.f43025E = bnn.f43095c;
            this.f43024D = bnn.f43093a - this.f43039S;
        }
        if (this.f43062l.f42971b == 1.0f) {
            j2 = (j + this.f43024D) - this.f43025E;
        } else if (!this.f43021A.isEmpty() || this.f43073w.f43146c < 1024) {
            long j5 = this.f43024D;
            double d = (double) this.f43062l.f42971b;
            double d2 = (double) (j - this.f43025E);
            Double.isNaN(d);
            Double.isNaN(d2);
            j2 = ((long) (d * d2)) + j5;
        } else {
            j2 = btw.m36758a(j - this.f43025E, this.f43073w.f43145b, this.f43073w.f43146c) + this.f43024D;
        }
        return j4 + j2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30439a() {
        bmv[] bmvArr;
        ArrayList arrayList = new ArrayList();
        for (bmv bmv : this.f43052b) {
            if (bmv.mo30421a()) {
                arrayList.add(bmv);
            } else {
                bmv.mo30427f();
            }
        }
        int size = arrayList.size();
        this.f43042V = (bmv[]) arrayList.toArray(new bmv[size]);
        this.f43043W = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            bmv bmv2 = this.f43042V[i];
            bmv2.mo30427f();
            this.f43043W[i] = bmv2.mo30425d();
        }
    }

    /* renamed from: b */
    public final void mo30443b() {
        this.f43069s = true;
        if (mo30448g()) {
            this.f43040T = System.nanoTime() / 1000;
            this.f43022B.play();
        }
    }

    /* renamed from: a */
    public final boolean mo30441a(ByteBuffer byteBuffer, long j) throws bnl, bno {
        int i;
        int i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        bti.m36699a(this.f43044X == null || byteBuffer2 == this.f43044X);
        if (!mo30448g()) {
            this.f43075y.block();
            if (this.f43071u) {
                AudioTrack audioTrack = new AudioTrack(new Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.f43055e).setEncoding(this.f43057g).setSampleRate(this.f43054d).build(), this.f43060j, 1, this.f43070t);
                this.f43022B = audioTrack;
            } else if (this.f43070t == 0) {
                AudioTrack audioTrack2 = new AudioTrack(this.f43058h, this.f43054d, this.f43055e, this.f43057g, this.f43060j, 1);
                this.f43022B = audioTrack2;
            } else {
                AudioTrack audioTrack3 = new AudioTrack(this.f43058h, this.f43054d, this.f43055e, this.f43057g, this.f43060j, 1, this.f43070t);
                this.f43022B = audioTrack3;
            }
            int state = this.f43022B.getState();
            if (state == 1) {
                int audioSessionId = this.f43022B.getAudioSessionId();
                if (this.f43070t != audioSessionId) {
                    this.f43070t = audioSessionId;
                    this.f43074x.mo30461a(audioSessionId);
                }
                this.f43053c.mo30454a(this.f43022B, m36189j());
                mo30446e();
                this.f43050ac = false;
                if (this.f43069s) {
                    mo30443b();
                }
            } else {
                try {
                    this.f43022B.release();
                } catch (Exception unused) {
                } finally {
                    this.f43022B = null;
                }
                throw new bnl(state, this.f43054d, this.f43055e, this.f43060j);
            }
        }
        if (m36189j()) {
            if (this.f43022B.getPlayState() == 2) {
                this.f43050ac = false;
                return false;
            } else if (this.f43022B.getPlayState() == 1 && this.f43053c.mo30455b() != 0) {
                return false;
            }
        }
        boolean z = this.f43050ac;
        this.f43050ac = mo30445d();
        if (z && !this.f43050ac && this.f43022B.getPlayState() != 1) {
            this.f43074x.mo30462a(this.f43060j, bls.m36048a(this.f43061k), SystemClock.elapsedRealtime() - this.f43051ad);
        }
        if (this.f43044X == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f43059i && this.f43038R == 0) {
                int i3 = this.f43057g;
                int i4 = 6;
                if (i3 == 7 || i3 == 8) {
                    int position = byteBuffer.position();
                    i2 = ((((byteBuffer2.get(position + 5) & 252) >> 2) | ((byteBuffer2.get(position + 4) & 1) << 6)) + 1) << 5;
                } else if (i3 == 5) {
                    i2 = 1536;
                } else if (i3 == 6) {
                    if (((byteBuffer2.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
                        i4 = bmt.f42993a[(byteBuffer2.get(byteBuffer.position() + 4) & 48) >> 4];
                    }
                    i2 = i4 * UnReadVideoExperiment.BROWSE_RECORD_LIST;
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unexpected audio encoding: ");
                    sb.append(i3);
                    throw new IllegalStateException(sb.toString());
                }
                this.f43038R = i2;
            }
            if (this.f43023C != null) {
                if (!mo30444c()) {
                    return false;
                }
                LinkedList<bnn> linkedList = this.f43021A;
                bnn bnn = new bnn(this.f43023C, Math.max(0, j2), mo30436a(mo30449h()), null);
                linkedList.add(bnn);
                this.f43023C = null;
                mo30439a();
            }
            if (this.f43066p == 0) {
                this.f43039S = Math.max(0, j2);
                this.f43066p = 1;
            } else {
                long a = this.f43039S + mo30436a(this.f43059i ? this.f43035O : this.f43034N / ((long) this.f43064n));
                if (this.f43066p != 1 || Math.abs(a - j2) <= 200000) {
                    i = 2;
                } else {
                    i = 2;
                    this.f43066p = 2;
                }
                if (this.f43066p == i) {
                    this.f43039S += j2 - a;
                    this.f43066p = 1;
                    this.f43074x.mo30460a();
                }
            }
            if (this.f43059i) {
                this.f43035O += (long) this.f43038R;
            } else {
                this.f43034N += (long) byteBuffer.remaining();
            }
            this.f43044X = byteBuffer2;
        }
        if (this.f43059i) {
            m36187b(this.f43044X, j2);
        } else {
            m36188c(j2);
        }
        if (this.f43044X.hasRemaining()) {
            return false;
        }
        this.f43044X = null;
        return true;
    }

    /* renamed from: c */
    private final void m36188c(long j) throws bno {
        int length = this.f43042V.length;
        int i = length;
        while (i >= 0) {
            ByteBuffer byteBuffer = i > 0 ? this.f43043W[i - 1] : this.f43044X != null ? this.f43044X : bmv.f43002a;
            if (i == length) {
                m36187b(byteBuffer, j);
            } else {
                bmv bmv = this.f43042V[i];
                bmv.mo30420a(byteBuffer);
                ByteBuffer d = bmv.mo30425d();
                this.f43043W[i] = d;
                if (d.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00dd, code lost:
        if (r11 < r10) goto L_0x007a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m36187b(java.nio.ByteBuffer r9, long r10) throws com.google.android.gms.internal.ads.bno {
        /*
            r8 = this;
            boolean r0 = r9.hasRemaining()
            r1 = 1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.nio.ByteBuffer r0 = r8.f43045Y
            r2 = 21
            r3 = 0
            if (r0 == 0) goto L_0x001a
            java.nio.ByteBuffer r0 = r8.f43045Y
            if (r0 != r9) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            com.google.android.gms.internal.ads.bti.m36699a(r0)
            goto L_0x003f
        L_0x001a:
            r8.f43045Y = r9
            int r0 = com.google.android.gms.internal.ads.btw.f43878a
            if (r0 >= r2) goto L_0x003f
            int r0 = r9.remaining()
            byte[] r4 = r8.f43046Z
            if (r4 == 0) goto L_0x002d
            byte[] r4 = r8.f43046Z
            int r4 = r4.length
            if (r4 >= r0) goto L_0x0031
        L_0x002d:
            byte[] r4 = new byte[r0]
            r8.f43046Z = r4
        L_0x0031:
            int r4 = r9.position()
            byte[] r5 = r8.f43046Z
            r9.get(r5, r3, r0)
            r9.position(r4)
            r8.f43048aa = r3
        L_0x003f:
            int r0 = r9.remaining()
            int r4 = com.google.android.gms.internal.ads.btw.f43878a
            if (r4 >= r2) goto L_0x007d
            long r10 = r8.f43036P
            com.google.android.gms.internal.ads.bni r2 = r8.f43053c
            long r4 = r2.mo30455b()
            int r2 = r8.f43065o
            long r6 = (long) r2
            long r4 = r4 * r6
            long r10 = r10 - r4
            int r10 = (int) r10
            int r11 = r8.f43060j
            int r11 = r11 - r10
            if (r11 <= 0) goto L_0x007a
            int r10 = java.lang.Math.min(r0, r11)
            android.media.AudioTrack r11 = r8.f43022B
            byte[] r2 = r8.f43046Z
            int r4 = r8.f43048aa
            int r10 = r11.write(r2, r4, r10)
            if (r10 <= 0) goto L_0x00f6
            int r11 = r8.f43048aa
            int r11 = r11 + r10
            r8.f43048aa = r11
            int r11 = r9.position()
            int r11 = r11 + r10
            r9.position(r11)
            goto L_0x00f6
        L_0x007a:
            r10 = 0
            goto L_0x00f6
        L_0x007d:
            boolean r2 = r8.f43071u
            if (r2 == 0) goto L_0x00f0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x008c
            r2 = 1
            goto L_0x008d
        L_0x008c:
            r2 = 0
        L_0x008d:
            com.google.android.gms.internal.ads.bti.m36701b(r2)
            android.media.AudioTrack r2 = r8.f43022B
            java.nio.ByteBuffer r4 = r8.f43026F
            if (r4 != 0) goto L_0x00ad
            r4 = 16
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r8.f43026F = r4
            java.nio.ByteBuffer r4 = r8.f43026F
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r4.order(r5)
            java.nio.ByteBuffer r4 = r8.f43026F
            r5 = 1431633921(0x55550001, float:1.46372496E13)
            r4.putInt(r5)
        L_0x00ad:
            int r4 = r8.f43063m
            if (r4 != 0) goto L_0x00c9
            java.nio.ByteBuffer r4 = r8.f43026F
            r5 = 4
            r4.putInt(r5, r0)
            java.nio.ByteBuffer r4 = r8.f43026F
            r5 = 8
            r6 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r6
            r4.putLong(r5, r10)
            java.nio.ByteBuffer r10 = r8.f43026F
            r10.position(r3)
            r8.f43063m = r0
        L_0x00c9:
            java.nio.ByteBuffer r10 = r8.f43026F
            int r10 = r10.remaining()
            if (r10 <= 0) goto L_0x00e0
            java.nio.ByteBuffer r11 = r8.f43026F
            int r11 = r2.write(r11, r10, r1)
            if (r11 >= 0) goto L_0x00dd
            r8.f43063m = r3
            r10 = r11
            goto L_0x00f6
        L_0x00dd:
            if (r11 >= r10) goto L_0x00e0
            goto L_0x007a
        L_0x00e0:
            int r9 = r2.write(r9, r0, r1)
            if (r9 >= 0) goto L_0x00e9
            r8.f43063m = r3
            goto L_0x00ee
        L_0x00e9:
            int r10 = r8.f43063m
            int r10 = r10 - r9
            r8.f43063m = r10
        L_0x00ee:
            r10 = r9
            goto L_0x00f6
        L_0x00f0:
            android.media.AudioTrack r10 = r8.f43022B
            int r10 = r10.write(r9, r0, r1)
        L_0x00f6:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r8.f43051ad = r4
            if (r10 < 0) goto L_0x011b
            boolean r9 = r8.f43059i
            if (r9 != 0) goto L_0x0108
            long r4 = r8.f43036P
            long r6 = (long) r10
            long r4 = r4 + r6
            r8.f43036P = r4
        L_0x0108:
            if (r10 != r0) goto L_0x011a
            boolean r9 = r8.f43059i
            if (r9 == 0) goto L_0x0116
            long r9 = r8.f43037Q
            int r11 = r8.f43038R
            long r2 = (long) r11
            long r9 = r9 + r2
            r8.f43037Q = r9
        L_0x0116:
            r9 = 0
            r8.f43045Y = r9
            return r1
        L_0x011a:
            return r3
        L_0x011b:
            com.google.android.gms.internal.ads.bno r9 = new com.google.android.gms.internal.ads.bno
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bng.m36187b(java.nio.ByteBuffer, long):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo30444c() throws com.google.android.gms.internal.ads.bno {
        /*
            r8 = this;
            int r0 = r8.f43049ab
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r8.f43059i
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.bmv[] r0 = r8.f43042V
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r8.f43049ab = r0
        L_0x0012:
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r8.f43049ab
            com.google.android.gms.internal.ads.bmv[] r5 = r8.f43042V
            int r5 = r5.length
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r5) goto L_0x003c
            com.google.android.gms.internal.ads.bmv[] r4 = r8.f43042V
            int r5 = r8.f43049ab
            r4 = r4[r5]
            if (r0 == 0) goto L_0x002c
            r4.mo30424c()
        L_0x002c:
            r8.m36188c(r6)
            boolean r0 = r4.mo30426e()
            if (r0 != 0) goto L_0x0036
            return r3
        L_0x0036:
            int r0 = r8.f43049ab
            int r0 = r0 + r2
            r8.f43049ab = r0
            goto L_0x0012
        L_0x003c:
            java.nio.ByteBuffer r0 = r8.f43045Y
            if (r0 == 0) goto L_0x004a
            java.nio.ByteBuffer r0 = r8.f43045Y
            r8.m36187b(r0, r6)
            java.nio.ByteBuffer r0 = r8.f43045Y
            if (r0 == 0) goto L_0x004a
            return r3
        L_0x004a:
            r8.f43049ab = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bng.mo30444c():boolean");
    }

    /* renamed from: d */
    public final boolean mo30445d() {
        if (mo30448g()) {
            if (mo30449h() <= this.f43053c.mo30455b()) {
                if (m36189j() && this.f43022B.getPlayState() == 2 && this.f43022B.getPlaybackHeadPosition() == 0) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final bml mo30438a(bml bml) {
        bml bml2;
        if (this.f43059i) {
            this.f43062l = bml.f42970a;
            return this.f43062l;
        }
        bml bml3 = new bml(this.f43073w.mo30476a(bml.f42971b), this.f43073w.mo30477b(bml.f42972c));
        if (this.f43023C != null) {
            bml2 = this.f43023C;
        } else if (!this.f43021A.isEmpty()) {
            bml2 = ((bnn) this.f43021A.getLast()).f43094b;
        } else {
            bml2 = this.f43062l;
        }
        if (!bml3.equals(bml2)) {
            if (mo30448g()) {
                this.f43023C = bml3;
            } else {
                this.f43062l = bml3;
            }
        }
        return this.f43062l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo30446e() {
        if (mo30448g()) {
            if (btw.f43878a >= 21) {
                this.f43022B.setVolume(this.f43067q);
                return;
            }
            AudioTrack audioTrack = this.f43022B;
            float f = this.f43067q;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* renamed from: f */
    public final void mo30447f() {
        if (mo30448g()) {
            this.f43034N = 0;
            this.f43035O = 0;
            this.f43036P = 0;
            this.f43037Q = 0;
            this.f43038R = 0;
            if (this.f43023C != null) {
                this.f43062l = this.f43023C;
                this.f43023C = null;
            } else if (!this.f43021A.isEmpty()) {
                this.f43062l = ((bnn) this.f43021A.getLast()).f43094b;
            }
            this.f43021A.clear();
            this.f43024D = 0;
            this.f43025E = 0;
            this.f43044X = null;
            this.f43045Y = null;
            for (int i = 0; i < this.f43042V.length; i++) {
                bmv bmv = this.f43042V[i];
                bmv.mo30427f();
                this.f43043W[i] = bmv.mo30425d();
            }
            this.f43068r = false;
            this.f43049ab = -1;
            this.f43026F = null;
            this.f43063m = 0;
            this.f43066p = 0;
            this.f43041U = 0;
            mo30450i();
            if (this.f43022B.getPlayState() == 3) {
                this.f43022B.pause();
            }
            AudioTrack audioTrack = this.f43022B;
            this.f43022B = null;
            this.f43053c.mo30454a(null, false);
            this.f43075y.close();
            new bnh(this, audioTrack).start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo30448g() {
        return this.f43022B != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo30436a(long j) {
        return (j * 1000000) / ((long) this.f43054d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final long mo30442b(long j) {
        return (j * ((long) this.f43054d)) / 1000000;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final long mo30449h() {
        return this.f43059i ? this.f43037Q : this.f43036P / ((long) this.f43065o);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo30450i() {
        this.f43029I = 0;
        this.f43028H = 0;
        this.f43027G = 0;
        this.f43030J = 0;
        this.f43031K = false;
        this.f43032L = 0;
    }

    /* renamed from: j */
    private final boolean m36189j() {
        return btw.f43878a < 23 && (this.f43057g == 5 || this.f43057g == 6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m36186b(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = -1095064472(0xffffffffbebaa468, float:-0.36453557)
            r2 = 0
            if (r0 == r1) goto L_0x0038
            r1 = 187078296(0xb269698, float:3.208373E-32)
            if (r0 == r1) goto L_0x002e
            r1 = 1504578661(0x59ae0c65, float:6.1237842E15)
            if (r0 == r1) goto L_0x0024
            r1 = 1505942594(0x59c2dc42, float:6.8560402E15)
            if (r0 == r1) goto L_0x001a
            goto L_0x0042
        L_0x001a:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0042
            r3 = 3
            goto L_0x0043
        L_0x0024:
            java.lang.String r0 = "audio/eac3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0042
            r3 = 1
            goto L_0x0043
        L_0x002e:
            java.lang.String r0 = "audio/ac3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0042
            r3 = 0
            goto L_0x0043
        L_0x0038:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0042
            r3 = 2
            goto L_0x0043
        L_0x0042:
            r3 = -1
        L_0x0043:
            switch(r3) {
                case 0: goto L_0x004e;
                case 1: goto L_0x004c;
                case 2: goto L_0x004a;
                case 3: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            return r2
        L_0x0047:
            r3 = 8
            return r3
        L_0x004a:
            r3 = 7
            return r3
        L_0x004c:
            r3 = 6
            return r3
        L_0x004e:
            r3 = 5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bng.m36186b(java.lang.String):int");
    }
}
