package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

public final class bue extends bqd {

    /* renamed from: k */
    private static final int[] f43909k = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: A */
    private int f43910A;

    /* renamed from: B */
    private int f43911B;

    /* renamed from: C */
    private int f43912C;

    /* renamed from: D */
    private float f43913D;

    /* renamed from: E */
    private int f43914E;

    /* renamed from: F */
    private int f43915F;

    /* renamed from: G */
    private int f43916G;

    /* renamed from: H */
    private float f43917H;

    /* renamed from: I */
    private int f43918I;

    /* renamed from: J */
    private int f43919J;

    /* renamed from: K */
    private int f43920K;

    /* renamed from: L */
    private float f43921L;

    /* renamed from: M */
    private boolean f43922M;

    /* renamed from: N */
    private int f43923N;

    /* renamed from: O */
    private long f43924O;

    /* renamed from: P */
    private int f43925P;

    /* renamed from: g */
    buh f43926g;

    /* renamed from: l */
    private final Context f43927l;

    /* renamed from: m */
    private final bui f43928m;

    /* renamed from: n */
    private final bul f43929n;

    /* renamed from: o */
    private final long f43930o;

    /* renamed from: p */
    private final int f43931p;

    /* renamed from: q */
    private final boolean f43932q;

    /* renamed from: r */
    private final long[] f43933r;

    /* renamed from: s */
    private zzlg[] f43934s;

    /* renamed from: t */
    private bug f43935t;

    /* renamed from: u */
    private Surface f43936u;

    /* renamed from: v */
    private Surface f43937v;

    /* renamed from: w */
    private int f43938w;

    /* renamed from: x */
    private boolean f43939x;

    /* renamed from: y */
    private long f43940y;

    /* renamed from: z */
    private long f43941z;

    public bue(Context context, bqf bqf, long j, Handler handler, buk buk, int i) {
        this(context, bqf, 0, null, false, handler, buk, -1);
    }

    /* renamed from: b */
    private static boolean m36781b(long j) {
        return j < -30000;
    }

    private bue(Context context, bqf bqf, long j, boh<Object> boh, boolean z, Handler handler, buk buk, int i) {
        boolean z2 = false;
        super(2, bqf, null, false);
        this.f43931p = -1;
        this.f43927l = context.getApplicationContext();
        this.f43928m = new bui(context);
        this.f43929n = new bul(handler, buk);
        if (btw.f43878a <= 22 && "foster".equals(btw.f43879b) && "NVIDIA".equals(btw.f43880c)) {
            z2 = true;
        }
        this.f43932q = z2;
        this.f43933r = new long[10];
        this.f43924O = -9223372036854775807L;
        this.f43940y = -9223372036854775807L;
        this.f43914E = -1;
        this.f43915F = -1;
        this.f43917H = -1.0f;
        this.f43913D = -1.0f;
        this.f43938w = 1;
        m36787x();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00fb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo30463a(com.google.android.gms.internal.ads.bqf r17, com.google.android.gms.internal.ads.zzlg r18) throws com.google.android.gms.internal.ads.bqj {
        /*
            r16 = this;
            r0 = r18
            java.lang.String r1 = r0.f46253c
            boolean r2 = com.google.android.gms.internal.ads.btn.m36715b(r1)
            r3 = 0
            if (r2 != 0) goto L_0x000c
            return r3
        L_0x000c:
            com.google.android.gms.internal.ads.zznd r2 = r0.f46256f
            if (r2 == 0) goto L_0x0023
            r4 = 0
            r5 = 0
        L_0x0012:
            int r6 = r2.f46278b
            if (r4 >= r6) goto L_0x0020
            com.google.android.gms.internal.ads.zznd$zza[] r6 = r2.f46277a
            r6 = r6[r4]
            boolean r6 = r6.f46280a
            r5 = r5 | r6
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0020:
            r2 = r17
            goto L_0x0026
        L_0x0023:
            r2 = r17
            r5 = 0
        L_0x0026:
            com.google.android.gms.internal.ads.bqc r1 = r2.mo30556a(r1, r5)
            r2 = 1
            if (r1 != 0) goto L_0x002e
            return r2
        L_0x002e:
            java.lang.String r4 = r0.f46252b
            r5 = 4
            r6 = 2
            r7 = 3
            if (r4 == 0) goto L_0x0261
            java.lang.String r8 = r1.f43536e
            if (r8 != 0) goto L_0x003b
            goto L_0x0261
        L_0x003b:
            r8 = 0
            if (r4 == 0) goto L_0x00f6
            java.lang.String r9 = r4.trim()
            java.lang.String r10 = "avc1"
            boolean r10 = r9.startsWith(r10)
            if (r10 != 0) goto L_0x00f3
            java.lang.String r10 = "avc3"
            boolean r10 = r9.startsWith(r10)
            if (r10 == 0) goto L_0x0054
            goto L_0x00f3
        L_0x0054:
            java.lang.String r10 = "hev1"
            boolean r10 = r9.startsWith(r10)
            if (r10 != 0) goto L_0x00f0
            java.lang.String r10 = "hvc1"
            boolean r10 = r9.startsWith(r10)
            if (r10 == 0) goto L_0x0066
            goto L_0x00f0
        L_0x0066:
            java.lang.String r10 = "vp9"
            boolean r10 = r9.startsWith(r10)
            if (r10 == 0) goto L_0x0072
            java.lang.String r9 = "video/x-vnd.on2.vp9"
            goto L_0x00f7
        L_0x0072:
            java.lang.String r10 = "vp8"
            boolean r10 = r9.startsWith(r10)
            if (r10 == 0) goto L_0x007e
            java.lang.String r9 = "video/x-vnd.on2.vp8"
            goto L_0x00f7
        L_0x007e:
            java.lang.String r10 = "mp4a"
            boolean r10 = r9.startsWith(r10)
            if (r10 == 0) goto L_0x008a
            java.lang.String r9 = "audio/mp4a-latm"
            goto L_0x00f7
        L_0x008a:
            java.lang.String r10 = "ac-3"
            boolean r10 = r9.startsWith(r10)
            if (r10 != 0) goto L_0x00ed
            java.lang.String r10 = "dac3"
            boolean r10 = r9.startsWith(r10)
            if (r10 == 0) goto L_0x009b
            goto L_0x00ed
        L_0x009b:
            java.lang.String r10 = "ec-3"
            boolean r10 = r9.startsWith(r10)
            if (r10 != 0) goto L_0x00ea
            java.lang.String r10 = "dec3"
            boolean r10 = r9.startsWith(r10)
            if (r10 == 0) goto L_0x00ac
            goto L_0x00ea
        L_0x00ac:
            java.lang.String r10 = "dtsc"
            boolean r10 = r9.startsWith(r10)
            if (r10 != 0) goto L_0x00e7
            java.lang.String r10 = "dtse"
            boolean r10 = r9.startsWith(r10)
            if (r10 == 0) goto L_0x00bd
            goto L_0x00e7
        L_0x00bd:
            java.lang.String r10 = "dtsh"
            boolean r10 = r9.startsWith(r10)
            if (r10 != 0) goto L_0x00e4
            java.lang.String r10 = "dtsl"
            boolean r10 = r9.startsWith(r10)
            if (r10 == 0) goto L_0x00ce
            goto L_0x00e4
        L_0x00ce:
            java.lang.String r10 = "opus"
            boolean r10 = r9.startsWith(r10)
            if (r10 == 0) goto L_0x00d9
            java.lang.String r9 = "audio/opus"
            goto L_0x00f7
        L_0x00d9:
            java.lang.String r10 = "vorbis"
            boolean r9 = r9.startsWith(r10)
            if (r9 == 0) goto L_0x00f6
            java.lang.String r9 = "audio/vorbis"
            goto L_0x00f7
        L_0x00e4:
            java.lang.String r9 = "audio/vnd.dts.hd"
            goto L_0x00f7
        L_0x00e7:
            java.lang.String r9 = "audio/vnd.dts"
            goto L_0x00f7
        L_0x00ea:
            java.lang.String r9 = "audio/eac3"
            goto L_0x00f7
        L_0x00ed:
            java.lang.String r9 = "audio/ac3"
            goto L_0x00f7
        L_0x00f0:
            java.lang.String r9 = "video/hevc"
            goto L_0x00f7
        L_0x00f3:
            java.lang.String r9 = "video/avc"
            goto L_0x00f7
        L_0x00f6:
            r9 = r8
        L_0x00f7:
            if (r9 != 0) goto L_0x00fb
            goto L_0x0261
        L_0x00fb:
            java.lang.String r10 = r1.f43536e
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L_0x012e
            java.lang.String r8 = java.lang.String.valueOf(r4)
            int r8 = r8.length()
            int r8 = r8 + 13
            java.lang.String r10 = java.lang.String.valueOf(r9)
            int r10 = r10.length()
            int r8 = r8 + r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r8)
            java.lang.String r8 = "codec.mime "
            r10.append(r8)
            r10.append(r4)
            java.lang.String r4 = ", "
            r10.append(r4)
            r10.append(r9)
        L_0x012b:
            r4 = 0
            goto L_0x0262
        L_0x012e:
            if (r4 == 0) goto L_0x020e
            java.lang.String r10 = "\\."
            java.lang.String[] r10 = r4.split(r10)
            r11 = r10[r3]
            r12 = -1
            int r13 = r11.hashCode()
            switch(r13) {
                case 3006243: goto L_0x015f;
                case 3006244: goto L_0x0155;
                case 3199032: goto L_0x014b;
                case 3214780: goto L_0x0141;
                default: goto L_0x0140;
            }
        L_0x0140:
            goto L_0x0168
        L_0x0141:
            java.lang.String r13 = "hvc1"
            boolean r11 = r11.equals(r13)
            if (r11 == 0) goto L_0x0168
            r12 = 1
            goto L_0x0168
        L_0x014b:
            java.lang.String r13 = "hev1"
            boolean r11 = r11.equals(r13)
            if (r11 == 0) goto L_0x0168
            r12 = 0
            goto L_0x0168
        L_0x0155:
            java.lang.String r13 = "avc2"
            boolean r11 = r11.equals(r13)
            if (r11 == 0) goto L_0x0168
            r12 = 3
            goto L_0x0168
        L_0x015f:
            java.lang.String r13 = "avc1"
            boolean r11 = r11.equals(r13)
            if (r11 == 0) goto L_0x0168
            r12 = 2
        L_0x0168:
            switch(r12) {
                case 0: goto L_0x0173;
                case 1: goto L_0x0173;
                case 2: goto L_0x016d;
                case 3: goto L_0x016d;
                default: goto L_0x016b;
            }
        L_0x016b:
            goto L_0x020e
        L_0x016d:
            android.util.Pair r8 = com.google.android.gms.internal.ads.bqh.m36470a(r4, r10)
            goto L_0x020e
        L_0x0173:
            int r11 = r10.length
            if (r11 >= r5) goto L_0x018e
            java.lang.String r10 = "Ignoring malformed HEVC codec string: "
            java.lang.String r11 = java.lang.String.valueOf(r4)
            int r12 = r11.length()
            if (r12 == 0) goto L_0x0187
            r10.concat(r11)
            goto L_0x020e
        L_0x0187:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r10)
            goto L_0x020e
        L_0x018e:
            java.util.regex.Pattern r11 = com.google.android.gms.internal.ads.bqh.f43583b
            r12 = r10[r2]
            java.util.regex.Matcher r11 = r11.matcher(r12)
            boolean r12 = r11.matches()
            if (r12 != 0) goto L_0x01b2
            java.lang.String r10 = "Ignoring malformed HEVC codec string: "
            java.lang.String r11 = java.lang.String.valueOf(r4)
            int r12 = r11.length()
            if (r12 == 0) goto L_0x01ac
            r10.concat(r11)
            goto L_0x020e
        L_0x01ac:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r10)
            goto L_0x020e
        L_0x01b2:
            java.lang.String r12 = r11.group(r2)
            java.lang.String r13 = "1"
            boolean r13 = r13.equals(r12)
            if (r13 == 0) goto L_0x01c0
            r12 = 1
            goto L_0x01c9
        L_0x01c0:
            java.lang.String r13 = "2"
            boolean r13 = r13.equals(r12)
            if (r13 == 0) goto L_0x01f9
            r12 = 2
        L_0x01c9:
            java.util.Map<java.lang.String, java.lang.Integer> r13 = com.google.android.gms.internal.ads.bqh.f43584c
            r10 = r10[r7]
            java.lang.Object r10 = r13.get(r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 != 0) goto L_0x01ef
            java.lang.String r10 = "Unknown HEVC level string: "
            java.lang.String r11 = r11.group(r2)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r12 = r11.length()
            if (r12 == 0) goto L_0x01e9
            r10.concat(r11)
            goto L_0x020e
        L_0x01e9:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r10)
            goto L_0x020e
        L_0x01ef:
            android.util.Pair r8 = new android.util.Pair
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r8.<init>(r11, r10)
            goto L_0x020e
        L_0x01f9:
            java.lang.String r10 = "Unknown HEVC profile string: "
            java.lang.String r11 = java.lang.String.valueOf(r12)
            int r12 = r11.length()
            if (r12 == 0) goto L_0x0209
            r10.concat(r11)
            goto L_0x020e
        L_0x0209:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r10)
        L_0x020e:
            if (r8 != 0) goto L_0x0211
            goto L_0x0261
        L_0x0211:
            android.media.MediaCodecInfo$CodecProfileLevel[] r10 = r1.mo30549a()
            int r11 = r10.length
            r12 = 0
        L_0x0217:
            if (r12 >= r11) goto L_0x0237
            r13 = r10[r12]
            int r14 = r13.profile
            java.lang.Object r15 = r8.first
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            if (r14 != r15) goto L_0x0234
            int r13 = r13.level
            java.lang.Object r14 = r8.second
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            if (r13 < r14) goto L_0x0234
            goto L_0x0261
        L_0x0234:
            int r12 = r12 + 1
            goto L_0x0217
        L_0x0237:
            java.lang.String r8 = java.lang.String.valueOf(r4)
            int r8 = r8.length()
            int r8 = r8 + 22
            java.lang.String r10 = java.lang.String.valueOf(r9)
            int r10 = r10.length()
            int r8 = r8 + r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r8)
            java.lang.String r8 = "codec.profileLevel, "
            r10.append(r8)
            r10.append(r4)
            java.lang.String r4 = ", "
            r10.append(r4)
            r10.append(r9)
            goto L_0x012b
        L_0x0261:
            r4 = 1
        L_0x0262:
            if (r4 == 0) goto L_0x028e
            int r8 = r0.f46257g
            if (r8 <= 0) goto L_0x028e
            int r8 = r0.f46258h
            if (r8 <= 0) goto L_0x028e
            int r4 = com.google.android.gms.internal.ads.btw.f43878a
            r8 = 21
            if (r4 < r8) goto L_0x027f
            int r2 = r0.f46257g
            int r4 = r0.f46258h
            float r0 = r0.f46259i
            double r8 = (double) r0
            boolean r0 = r1.mo30548a(r2, r4, r8)
            r4 = r0
            goto L_0x028e
        L_0x027f:
            int r4 = r0.f46257g
            int r0 = r0.f46258h
            int r4 = r4 * r0
            int r0 = com.google.android.gms.internal.ads.bqh.m36469a()
            if (r4 > r0) goto L_0x028d
            r4 = 1
            goto L_0x028e
        L_0x028d:
            r4 = 0
        L_0x028e:
            boolean r0 = r1.f43533b
            if (r0 == 0) goto L_0x0294
            r5 = 8
        L_0x0294:
            boolean r0 = r1.f43534c
            if (r0 == 0) goto L_0x029a
            r3 = 16
        L_0x029a:
            if (r4 == 0) goto L_0x029d
            r6 = 3
        L_0x029d:
            r0 = r5 | r3
            r0 = r0 | r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bue.mo30463a(com.google.android.gms.internal.ads.bqf, com.google.android.gms.internal.ads.zzlg):int");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30346a(boolean z) throws blt {
        super.mo30346a(z);
        this.f43923N = this.f42858a.f42975b;
        this.f43922M = this.f43923N != 0;
        bul bul = this.f43929n;
        bob bob = this.f43560j;
        if (bul.f43964b != null) {
            bul.f43963a.post(new bum(bul, bob));
        }
        bui bui = this.f43928m;
        bui.f43953h = false;
        if (bui.f43947b) {
            bui.f43946a.f43959c.sendEmptyMessage(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30347a(zzlg[] zzlgArr, long j) throws blt {
        this.f43934s = zzlgArr;
        if (this.f43924O == -9223372036854775807L) {
            this.f43924O = j;
        } else {
            if (this.f43925P != this.f43933r.length) {
                this.f43925P++;
            }
            this.f43933r[this.f43925P - 1] = j;
        }
        super.mo30347a(zzlgArr, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30344a(long j, boolean z) throws blt {
        super.mo30344a(j, z);
        m36786w();
        this.f43911B = 0;
        if (this.f43925P != 0) {
            this.f43924O = this.f43933r[this.f43925P - 1];
            this.f43925P = 0;
        }
        if (z) {
            m36785s();
        } else {
            this.f43940y = -9223372036854775807L;
        }
    }

    /* renamed from: p */
    public final boolean mo30403p() {
        if (super.mo30403p() && (this.f43939x || ((this.f43937v != null && this.f43936u == this.f43937v) || this.f43558h == null))) {
            this.f43940y = -9223372036854775807L;
            return true;
        } else if (this.f43940y == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f43940y) {
                return true;
            }
            this.f43940y = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo30360m() {
        super.mo30360m();
        this.f43910A = 0;
        this.f43941z = SystemClock.elapsedRealtime();
        this.f43940y = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo30361n() {
        m36775A();
        super.mo30361n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo30362o() {
        this.f43914E = -1;
        this.f43915F = -1;
        this.f43917H = -1.0f;
        this.f43913D = -1.0f;
        this.f43924O = -9223372036854775807L;
        this.f43925P = 0;
        m36787x();
        m36786w();
        bui bui = this.f43928m;
        if (bui.f43947b) {
            bui.f43946a.f43959c.sendEmptyMessage(2);
        }
        this.f43926g = null;
        this.f43922M = false;
        try {
            super.mo30362o();
        } finally {
            this.f43929n.mo30732a(this.f43560j);
        }
    }

    /* renamed from: a */
    public final void mo30342a(int i, Object obj) throws blt {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                if (this.f43937v != null) {
                    surface = this.f43937v;
                } else {
                    bqc bqc = this.f43559i;
                    if (bqc != null && m36782b(bqc.f43535d)) {
                        this.f43937v = zztc.m39293a(this.f43927l, bqc.f43535d);
                        surface = this.f43937v;
                    }
                }
            }
            if (this.f43936u != surface) {
                this.f43936u = surface;
                int d = mo30351d();
                if (d == 1 || d == 2) {
                    MediaCodec mediaCodec = this.f43558h;
                    if (btw.f43878a < 23 || mediaCodec == null || surface == null) {
                        mo30554v();
                        mo30553u();
                    } else {
                        mediaCodec.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.f43937v) {
                    m36787x();
                    m36786w();
                } else {
                    m36789z();
                    m36786w();
                    if (d == 2) {
                        m36785s();
                        return;
                    }
                }
                return;
            }
            if (!(surface == null || surface == this.f43937v)) {
                m36789z();
                if (this.f43939x) {
                    this.f43929n.mo30731a(this.f43936u);
                }
            }
        } else if (i == 4) {
            this.f43938w = ((Integer) obj).intValue();
            MediaCodec mediaCodec2 = this.f43558h;
            if (mediaCodec2 != null) {
                mediaCodec2.setVideoScalingMode(this.f43938w);
            }
        } else {
            super.mo30342a(i, obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo30552a(bqc bqc) {
        return this.f43936u != null || m36782b(bqc.f43535d);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0112 A[EDGE_INSN: B:84:0x0112->B:57:0x0112 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0100 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30467a(com.google.android.gms.internal.ads.bqc r22, android.media.MediaCodec r23, com.google.android.gms.internal.ads.zzlg r24, android.media.MediaCrypto r25) throws com.google.android.gms.internal.ads.bqj {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            com.google.android.gms.internal.ads.zzlg[] r4 = r0.f43934s
            int r5 = r3.f46257g
            int r6 = r3.f46258h
            int r7 = m36783c(r24)
            int r8 = r4.length
            r9 = -1
            r11 = 1
            if (r8 != r11) goto L_0x001e
            com.google.android.gms.internal.ads.bug r4 = new com.google.android.gms.internal.ads.bug
            r4.<init>(r5, r6, r7)
            goto L_0x0134
        L_0x001e:
            int r8 = r4.length
            r13 = r6
            r14 = r7
            r6 = 0
            r7 = r5
            r5 = 0
        L_0x0024:
            if (r5 >= r8) goto L_0x0056
            r15 = r4[r5]
            boolean r10 = r1.f43533b
            boolean r10 = m36779a(r10, r3, r15)
            if (r10 == 0) goto L_0x0053
            int r10 = r15.f46257g
            if (r10 == r9) goto L_0x003b
            int r10 = r15.f46258h
            if (r10 != r9) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r10 = 0
            goto L_0x003c
        L_0x003b:
            r10 = 1
        L_0x003c:
            r6 = r6 | r10
            int r10 = r15.f46257g
            int r7 = java.lang.Math.max(r7, r10)
            int r10 = r15.f46258h
            int r10 = java.lang.Math.max(r13, r10)
            int r13 = m36783c(r15)
            int r13 = java.lang.Math.max(r14, r13)
            r14 = r13
            r13 = r10
        L_0x0053:
            int r5 = r5 + 1
            goto L_0x0024
        L_0x0056:
            if (r6 == 0) goto L_0x012f
            int r4 = r3.f46258h
            int r5 = r3.f46257g
            if (r4 <= r5) goto L_0x0060
            r4 = 1
            goto L_0x0061
        L_0x0060:
            r4 = 0
        L_0x0061:
            if (r4 == 0) goto L_0x0066
            int r5 = r3.f46258h
            goto L_0x0068
        L_0x0066:
            int r5 = r3.f46257g
        L_0x0068:
            if (r4 == 0) goto L_0x006d
            int r6 = r3.f46257g
            goto L_0x006f
        L_0x006d:
            int r6 = r3.f46258h
        L_0x006f:
            float r8 = (float) r6
            float r10 = (float) r5
            float r8 = r8 / r10
            int[] r10 = f43909k
            int r15 = r10.length
            r11 = 0
        L_0x0076:
            if (r11 >= r15) goto L_0x010f
            r12 = r10[r11]
            float r9 = (float) r12
            float r9 = r9 * r8
            int r9 = (int) r9
            if (r12 <= r5) goto L_0x010f
            if (r9 > r6) goto L_0x0084
            goto L_0x010f
        L_0x0084:
            r16 = r5
            int r5 = com.google.android.gms.internal.ads.btw.f43878a
            r17 = r6
            r6 = 21
            if (r5 < r6) goto L_0x00d5
            if (r4 == 0) goto L_0x0092
            r5 = r9
            goto L_0x0093
        L_0x0092:
            r5 = r12
        L_0x0093:
            if (r4 == 0) goto L_0x0096
            goto L_0x0097
        L_0x0096:
            r12 = r9
        L_0x0097:
            android.media.MediaCodecInfo$CodecCapabilities r6 = r1.f43537f
            if (r6 != 0) goto L_0x009f
        L_0x009b:
            r18 = r8
            r8 = 0
            goto L_0x00c3
        L_0x009f:
            android.media.MediaCodecInfo$CodecCapabilities r6 = r1.f43537f
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()
            if (r6 != 0) goto L_0x00a8
            goto L_0x009b
        L_0x00a8:
            int r9 = r6.getWidthAlignment()
            int r6 = r6.getHeightAlignment()
            r18 = r8
            android.graphics.Point r8 = new android.graphics.Point
            int r5 = com.google.android.gms.internal.ads.btw.m36755a(r5, r9)
            int r5 = r5 * r9
            int r9 = com.google.android.gms.internal.ads.btw.m36755a(r12, r6)
            int r9 = r9 * r6
            r8.<init>(r5, r9)
        L_0x00c3:
            float r5 = r3.f46259i
            int r6 = r8.x
            int r9 = r8.y
            r19 = r14
            r20 = r15
            double r14 = (double) r5
            boolean r5 = r1.mo30548a(r6, r9, r14)
            if (r5 == 0) goto L_0x0100
            goto L_0x0112
        L_0x00d5:
            r18 = r8
            r19 = r14
            r20 = r15
            r5 = 16
            int r6 = com.google.android.gms.internal.ads.btw.m36755a(r12, r5)
            int r6 = r6 << 4
            int r5 = com.google.android.gms.internal.ads.btw.m36755a(r9, r5)
            int r5 = r5 << 4
            int r8 = r6 * r5
            int r9 = com.google.android.gms.internal.ads.bqh.m36469a()
            if (r8 > r9) goto L_0x0100
            android.graphics.Point r10 = new android.graphics.Point
            if (r4 == 0) goto L_0x00f7
            r8 = r5
            goto L_0x00f8
        L_0x00f7:
            r8 = r6
        L_0x00f8:
            if (r4 == 0) goto L_0x00fb
            r5 = r6
        L_0x00fb:
            r10.<init>(r8, r5)
            r8 = r10
            goto L_0x0112
        L_0x0100:
            int r11 = r11 + 1
            r5 = r16
            r6 = r17
            r8 = r18
            r14 = r19
            r15 = r20
            r9 = -1
            goto L_0x0076
        L_0x010f:
            r19 = r14
            r8 = 0
        L_0x0112:
            if (r8 == 0) goto L_0x012d
            int r4 = r8.x
            int r7 = java.lang.Math.max(r7, r4)
            int r4 = r8.y
            int r13 = java.lang.Math.max(r13, r4)
            java.lang.String r4 = r3.f46253c
            int r4 = m36776a(r4, r7, r13)
            r14 = r19
            int r14 = java.lang.Math.max(r14, r4)
            goto L_0x012f
        L_0x012d:
            r14 = r19
        L_0x012f:
            com.google.android.gms.internal.ads.bug r4 = new com.google.android.gms.internal.ads.bug
            r4.<init>(r7, r13, r14)
        L_0x0134:
            r0.f43935t = r4
            com.google.android.gms.internal.ads.bug r4 = r0.f43935t
            boolean r5 = r0.f43932q
            int r6 = r0.f43923N
            android.media.MediaFormat r3 = r24.mo31603b()
            java.lang.String r7 = "max-width"
            int r8 = r4.f43942a
            r3.setInteger(r7, r8)
            java.lang.String r7 = "max-height"
            int r8 = r4.f43943b
            r3.setInteger(r7, r8)
            int r7 = r4.f43944c
            r8 = -1
            if (r7 == r8) goto L_0x015a
            java.lang.String r7 = "max-input-size"
            int r4 = r4.f43944c
            r3.setInteger(r7, r4)
        L_0x015a:
            if (r5 == 0) goto L_0x0162
            java.lang.String r4 = "auto-frc"
            r5 = 0
            r3.setInteger(r4, r5)
        L_0x0162:
            if (r6 == 0) goto L_0x016f
            java.lang.String r4 = "tunneled-playback"
            r5 = 1
            r3.setFeatureEnabled(r4, r5)
            java.lang.String r4 = "audio-session-id"
            r3.setInteger(r4, r6)
        L_0x016f:
            android.view.Surface r4 = r0.f43936u
            if (r4 != 0) goto L_0x018e
            boolean r4 = r1.f43535d
            boolean r4 = r0.m36782b(r4)
            com.google.android.gms.internal.ads.bti.m36701b(r4)
            android.view.Surface r4 = r0.f43937v
            if (r4 != 0) goto L_0x018a
            android.content.Context r4 = r0.f43927l
            boolean r1 = r1.f43535d
            com.google.android.gms.internal.ads.zztc r1 = com.google.android.gms.internal.ads.zztc.m39293a(r4, r1)
            r0.f43937v = r1
        L_0x018a:
            android.view.Surface r1 = r0.f43937v
            r0.f43936u = r1
        L_0x018e:
            android.view.Surface r1 = r0.f43936u
            r4 = 0
            r5 = 0
            r2.configure(r3, r1, r5, r4)
            int r1 = com.google.android.gms.internal.ads.btw.f43878a
            r3 = 23
            if (r1 < r3) goto L_0x01a6
            boolean r1 = r0.f43922M
            if (r1 == 0) goto L_0x01a6
            com.google.android.gms.internal.ads.buh r1 = new com.google.android.gms.internal.ads.buh
            r1.<init>(r0, r2)
            r0.f43926g = r1
        L_0x01a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bue.mo30467a(com.google.android.gms.internal.ads.bqc, android.media.MediaCodec, com.google.android.gms.internal.ads.zzlg, android.media.MediaCrypto):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo30554v() {
        try {
            super.mo30554v();
        } finally {
            if (this.f43937v != null) {
                if (this.f43936u == this.f43937v) {
                    this.f43936u = null;
                }
                this.f43937v.release();
                this.f43937v = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30468a(String str, long j, long j2) {
        bul bul = this.f43929n;
        if (bul.f43964b != null) {
            Handler handler = bul.f43963a;
            bun bun = new bun(bul, str, j, j2);
            handler.post(bun);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30470b(zzlg zzlg) throws blt {
        super.mo30470b(zzlg);
        bul bul = this.f43929n;
        if (bul.f43964b != null) {
            bul.f43963a.post(new buo(bul, zzlg));
        }
        this.f43913D = zzlg.f46261k == -1.0f ? 1.0f : zzlg.f46261k;
        this.f43912C = m36784d(zzlg);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30550a(boc boc) {
        if (btw.f43878a < 23 && this.f43922M) {
            mo30471r();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30466a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.f43914E = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.f43915F = i2;
        this.f43917H = this.f43913D;
        if (btw.f43878a < 21) {
            this.f43916G = this.f43912C;
        } else if (this.f43912C == 90 || this.f43912C == 270) {
            int i3 = this.f43914E;
            this.f43914E = this.f43915F;
            this.f43915F = i3;
            this.f43917H = 1.0f / this.f43917H;
        }
        mediaCodec.setVideoScalingMode(this.f43938w);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo30551a(MediaCodec mediaCodec, boolean z, zzlg zzlg, zzlg zzlg2) {
        return m36779a(z, zzlg, zzlg2) && zzlg2.f46257g <= this.f43935t.f43942a && zzlg2.f46258h <= this.f43935t.f43943b && zzlg2.f46254d <= this.f43935t.f43944c;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x016e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo30469a(long r26, long r28, android.media.MediaCodec r30, java.nio.ByteBuffer r31, int r32, int r33, long r34, boolean r36) {
        /*
            r25 = this;
            r7 = r25
            r1 = r30
            r2 = r32
            r3 = r34
        L_0x0008:
            int r0 = r7.f43925P
            r5 = 0
            r8 = 1
            if (r0 == 0) goto L_0x002b
            long[] r0 = r7.f43933r
            r9 = r0[r5]
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x002b
            long[] r0 = r7.f43933r
            r9 = r0[r5]
            r7.f43924O = r9
            int r0 = r7.f43925P
            int r0 = r0 - r8
            r7.f43925P = r0
            long[] r0 = r7.f43933r
            long[] r6 = r7.f43933r
            int r9 = r7.f43925P
            java.lang.System.arraycopy(r0, r8, r6, r5, r9)
            goto L_0x0008
        L_0x002b:
            long r9 = r7.f43924O
            long r9 = r3 - r9
            if (r36 == 0) goto L_0x0035
            r7.m36777a(r1, r2, r9)
            return r8
        L_0x0035:
            r0 = 0
            long r11 = r3 - r26
            android.view.Surface r0 = r7.f43936u
            android.view.Surface r6 = r7.f43937v
            if (r0 != r6) goto L_0x0049
            boolean r0 = m36781b(r11)
            if (r0 == 0) goto L_0x0048
            r7.m36777a(r1, r2, r9)
            return r8
        L_0x0048:
            return r5
        L_0x0049:
            boolean r0 = r7.f43939x
            r6 = 21
            if (r0 != 0) goto L_0x0066
            int r0 = com.google.android.gms.internal.ads.btw.f43878a
            if (r0 < r6) goto L_0x0062
            long r5 = java.lang.System.nanoTime()
            r0 = r25
            r1 = r30
            r2 = r32
            r3 = r9
            r0.m36778a(r1, r2, r3, r5)
            goto L_0x0065
        L_0x0062:
            r7.m36780b(r1, r2, r9)
        L_0x0065:
            return r8
        L_0x0066:
            int r0 = r25.mo30351d()
            r13 = 2
            if (r0 == r13) goto L_0x006e
            return r5
        L_0x006e:
            long r13 = android.os.SystemClock.elapsedRealtime()
            r15 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r15
            long r13 = r13 - r28
            long r11 = r11 - r13
            long r13 = java.lang.System.nanoTime()
            long r11 = r11 * r15
            long r11 = r11 + r13
            com.google.android.gms.internal.ads.bui r0 = r7.f43928m
            long r6 = r3 * r15
            boolean r15 = r0.f43953h
            if (r15 == 0) goto L_0x00d6
            r17 = r9
            long r8 = r0.f43950e
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x009b
            long r8 = r0.f43956k
            r15 = 1
            long r8 = r8 + r15
            r0.f43956k = r8
            long r8 = r0.f43952g
            r0.f43951f = r8
        L_0x009b:
            long r8 = r0.f43956k
            r15 = 6
            int r10 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r10 < 0) goto L_0x00cb
            long r8 = r0.f43955j
            long r8 = r6 - r8
            r19 = r6
            long r5 = r0.f43956k
            long r8 = r8 / r5
            long r5 = r0.f43951f
            long r5 = r5 + r8
            boolean r7 = r0.mo30726a(r5, r11)
            if (r7 == 0) goto L_0x00bb
            r7 = 0
            r0.f43953h = r7
            r5 = r19
            goto L_0x00d9
        L_0x00bb:
            r7 = 0
            long r8 = r0.f43954i
            long r8 = r8 + r5
            r21 = r5
            long r5 = r0.f43955j
            long r5 = r8 - r5
            r9 = r5
            r5 = r19
            r7 = r21
            goto L_0x00db
        L_0x00cb:
            r5 = r6
            r7 = 0
            boolean r8 = r0.mo30726a(r5, r11)
            if (r8 == 0) goto L_0x00d9
            r0.f43953h = r7
            goto L_0x00d9
        L_0x00d6:
            r5 = r6
            r17 = r9
        L_0x00d9:
            r7 = r5
            r9 = r11
        L_0x00db:
            boolean r15 = r0.f43953h
            r1 = 0
            if (r15 != 0) goto L_0x00ea
            r0.f43955j = r5
            r0.f43954i = r11
            r0.f43956k = r1
            r5 = 1
            r0.f43953h = r5
        L_0x00ea:
            r0.f43950e = r3
            r0.f43952g = r7
            com.google.android.gms.internal.ads.buj r3 = r0.f43946a
            if (r3 == 0) goto L_0x0124
            com.google.android.gms.internal.ads.buj r3 = r0.f43946a
            long r3 = r3.f43958a
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x00fb
            goto L_0x0124
        L_0x00fb:
            com.google.android.gms.internal.ads.buj r1 = r0.f43946a
            long r1 = r1.f43958a
            long r3 = r0.f43948c
            long r5 = r9 - r1
            long r5 = r5 / r3
            long r5 = r5 * r3
            long r1 = r1 + r5
            int r5 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x010e
            long r3 = r1 - r3
            goto L_0x0115
        L_0x010e:
            r5 = 0
            long r3 = r3 + r1
            r23 = r1
            r1 = r3
            r3 = r23
        L_0x0115:
            r5 = 0
            long r5 = r1 - r9
            long r9 = r9 - r3
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x011e
            goto L_0x011f
        L_0x011e:
            r1 = r3
        L_0x011f:
            long r3 = r0.f43949d
            long r1 = r1 - r3
            r5 = r1
            goto L_0x0125
        L_0x0124:
            r5 = r9
        L_0x0125:
            r0 = 0
            long r0 = r5 - r13
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            boolean r2 = m36781b(r0)
            if (r2 == 0) goto L_0x016e
            java.lang.String r0 = "dropVideoBuffer"
            com.google.android.gms.internal.ads.btv.m36752a(r0)
            r0 = 0
            r2 = r30
            r3 = r32
            r2.releaseOutputBuffer(r3, r0)
            com.google.android.gms.internal.ads.btv.m36751a()
            r7 = r25
            com.google.android.gms.internal.ads.bob r0 = r7.f43560j
            int r1 = r0.f43179f
            r2 = 1
            int r1 = r1 + r2
            r0.f43179f = r1
            int r0 = r7.f43910A
            int r0 = r0 + r2
            r7.f43910A = r0
            int r0 = r7.f43911B
            int r0 = r0 + r2
            r7.f43911B = r0
            com.google.android.gms.internal.ads.bob r0 = r7.f43560j
            int r1 = r7.f43911B
            com.google.android.gms.internal.ads.bob r2 = r7.f43560j
            int r2 = r2.f43180g
            int r1 = java.lang.Math.max(r1, r2)
            r0.f43180g = r1
            int r0 = r7.f43910A
            int r1 = r7.f43931p
            if (r0 != r1) goto L_0x016c
            r25.m36775A()
        L_0x016c:
            r0 = 1
            return r0
        L_0x016e:
            r2 = r30
            r3 = r32
            r7 = r25
            int r4 = com.google.android.gms.internal.ads.btw.f43878a
            r8 = 21
            if (r4 < r8) goto L_0x0190
            r8 = 50000(0xc350, double:2.47033E-319)
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x018e
            r0 = r25
            r1 = r30
            r2 = r32
            r3 = r17
            r0.m36778a(r1, r2, r3, r5)
            r0 = 1
            return r0
        L_0x018e:
            r0 = 0
            goto L_0x01b4
        L_0x0190:
            r4 = 30000(0x7530, double:1.4822E-319)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x018e
            r4 = 11000(0x2af8, double:5.4347E-320)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x01ad
            r4 = 10000(0x2710, double:4.9407E-320)
            long r0 = r0 - r4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r4
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x01a6 }
            goto L_0x01ad
        L_0x01a6:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x01ad:
            r0 = r17
            r7.m36780b(r2, r3, r0)
            r0 = 1
            return r0
        L_0x01b4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bue.mo30469a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean):boolean");
    }

    /* renamed from: a */
    private final void m36777a(MediaCodec mediaCodec, int i, long j) {
        btv.m36752a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        btv.m36751a();
        this.f43560j.f43178e++;
    }

    /* renamed from: b */
    private final void m36780b(MediaCodec mediaCodec, int i, long j) {
        m36788y();
        btv.m36752a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        btv.m36751a();
        this.f43560j.f43177d++;
        this.f43911B = 0;
        mo30471r();
    }

    /* renamed from: a */
    private final void m36778a(MediaCodec mediaCodec, int i, long j, long j2) {
        m36788y();
        btv.m36752a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        btv.m36751a();
        this.f43560j.f43177d++;
        this.f43911B = 0;
        mo30471r();
    }

    /* renamed from: b */
    private final boolean m36782b(boolean z) {
        return btw.f43878a >= 23 && !this.f43922M && (!z || zztc.m39294a(this.f43927l));
    }

    /* renamed from: s */
    private final void m36785s() {
        this.f43940y = this.f43930o > 0 ? SystemClock.elapsedRealtime() + this.f43930o : -9223372036854775807L;
    }

    /* renamed from: w */
    private final void m36786w() {
        this.f43939x = false;
        if (btw.f43878a >= 23 && this.f43922M) {
            MediaCodec mediaCodec = this.f43558h;
            if (mediaCodec != null) {
                this.f43926g = new buh(this, mediaCodec);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final void mo30471r() {
        if (!this.f43939x) {
            this.f43939x = true;
            this.f43929n.mo30731a(this.f43936u);
        }
    }

    /* renamed from: x */
    private final void m36787x() {
        this.f43918I = -1;
        this.f43919J = -1;
        this.f43921L = -1.0f;
        this.f43920K = -1;
    }

    /* renamed from: y */
    private final void m36788y() {
        if (this.f43918I != this.f43914E || this.f43919J != this.f43915F || this.f43920K != this.f43916G || this.f43921L != this.f43917H) {
            this.f43929n.mo30729a(this.f43914E, this.f43915F, this.f43916G, this.f43917H);
            this.f43918I = this.f43914E;
            this.f43919J = this.f43915F;
            this.f43920K = this.f43916G;
            this.f43921L = this.f43917H;
        }
    }

    /* renamed from: z */
    private final void m36789z() {
        if (this.f43918I != -1 || this.f43919J != -1) {
            this.f43929n.mo30729a(this.f43914E, this.f43915F, this.f43916G, this.f43917H);
        }
    }

    /* renamed from: A */
    private final void m36775A() {
        if (this.f43910A > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f43929n.mo30730a(this.f43910A, elapsedRealtime - this.f43941z);
            this.f43910A = 0;
            this.f43941z = elapsedRealtime;
        }
    }

    /* renamed from: c */
    private static int m36783c(zzlg zzlg) {
        if (zzlg.f46254d != -1) {
            return zzlg.f46254d;
        }
        return m36776a(zzlg.f46253c, zzlg.f46257g, zzlg.f46258h);
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m36776a(java.lang.String r5, int r6, int r7) {
        /*
            r0 = -1
            if (r6 == r0) goto L_0x007e
            if (r7 != r0) goto L_0x0007
            goto L_0x007e
        L_0x0007:
            int r1 = r5.hashCode()
            r2 = 3
            r3 = 4
            r4 = 2
            switch(r1) {
                case -1664118616: goto L_0x0044;
                case -1662541442: goto L_0x003a;
                case 1187890754: goto L_0x0030;
                case 1331836730: goto L_0x0026;
                case 1599127256: goto L_0x001c;
                case 1599127257: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x004e
        L_0x0012:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 5
            goto L_0x004f
        L_0x001c:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 3
            goto L_0x004f
        L_0x0026:
            java.lang.String r1 = "video/avc"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 2
            goto L_0x004f
        L_0x0030:
            java.lang.String r1 = "video/mp4v-es"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 1
            goto L_0x004f
        L_0x003a:
            java.lang.String r1 = "video/hevc"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 4
            goto L_0x004f
        L_0x0044:
            java.lang.String r1 = "video/3gpp"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 0
            goto L_0x004f
        L_0x004e:
            r5 = -1
        L_0x004f:
            switch(r5) {
                case 0: goto L_0x0075;
                case 1: goto L_0x0075;
                case 2: goto L_0x0059;
                case 3: goto L_0x0056;
                case 4: goto L_0x0053;
                case 5: goto L_0x0053;
                default: goto L_0x0052;
            }
        L_0x0052:
            return r0
        L_0x0053:
            int r6 = r6 * r7
            goto L_0x0078
        L_0x0056:
            int r6 = r6 * r7
            goto L_0x0077
        L_0x0059:
            java.lang.String r5 = "BRAVIA 4K 2015"
            java.lang.String r1 = com.google.android.gms.internal.ads.btw.f43881d
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0064
            return r0
        L_0x0064:
            r5 = 16
            int r6 = com.google.android.gms.internal.ads.btw.m36755a(r6, r5)
            int r5 = com.google.android.gms.internal.ads.btw.m36755a(r7, r5)
            int r6 = r6 * r5
            int r5 = r6 << 4
            int r6 = r5 << 4
            goto L_0x0077
        L_0x0075:
            int r6 = r6 * r7
        L_0x0077:
            r3 = 2
        L_0x0078:
            int r6 = r6 * 3
            int r3 = r3 * 2
            int r6 = r6 / r3
            return r6
        L_0x007e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bue.m36776a(java.lang.String, int, int):int");
    }

    /* renamed from: a */
    private static boolean m36779a(boolean z, zzlg zzlg, zzlg zzlg2) {
        return zzlg.f46253c.equals(zzlg2.f46253c) && m36784d(zzlg) == m36784d(zzlg2) && (z || (zzlg.f46257g == zzlg2.f46257g && zzlg.f46258h == zzlg2.f46258h));
    }

    /* renamed from: d */
    private static int m36784d(zzlg zzlg) {
        if (zzlg.f46260j == -1) {
            return 0;
        }
        return zzlg.f46260j;
    }
}
