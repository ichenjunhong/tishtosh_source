package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.bef.effectsdk.message.MessageCenter;
import com.google.android.gms.internal.ads.zzpn.zza;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.util.ArrayList;
import java.util.List;

final class bpk {

    /* renamed from: a */
    private static final int f43417a = btw.m36765b("vide");

    /* renamed from: b */
    private static final int f43418b = btw.m36765b("soun");

    /* renamed from: c */
    private static final int f43419c = btw.m36765b("text");

    /* renamed from: d */
    private static final int f43420d = btw.m36765b("sbtl");

    /* renamed from: e */
    private static final int f43421e = btw.m36765b("subt");

    /* renamed from: f */
    private static final int f43422f = btw.m36765b("clcp");

    /* renamed from: g */
    private static final int f43423g = btw.m36765b("cenc");

    /* renamed from: h */
    private static final int f43424h = btw.m36765b("meta");

    /* JADX WARNING: Removed duplicated region for block: B:270:0x050e  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0557  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0733  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0776  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x07f4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x07f5  */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x074b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01a5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.bpy m36399a(com.google.android.gms.internal.ads.bpi r79, com.google.android.gms.internal.ads.bpj r80, long r81, com.google.android.gms.internal.ads.zznd r83, boolean r84) throws com.google.android.gms.internal.ads.bmk {
        /*
            r0 = r79
            int r2 = com.google.android.gms.internal.ads.bph.f43410y
            com.google.android.gms.internal.ads.bpi r2 = r0.mo30541d(r2)
            int r3 = com.google.android.gms.internal.ads.bph.f43329K
            com.google.android.gms.internal.ads.bpj r3 = r2.mo30540c(r3)
            com.google.android.gms.internal.ads.btr r3 = r3.f43416az
            r4 = 16
            r3.mo30697c(r4)
            int r3 = r3.mo30703g()
            int r5 = f43418b
            r6 = 3
            r8 = 4
            r9 = -1
            if (r3 != r5) goto L_0x0022
            r13 = 1
            goto L_0x0042
        L_0x0022:
            int r5 = f43417a
            if (r3 != r5) goto L_0x0028
            r13 = 2
            goto L_0x0042
        L_0x0028:
            int r5 = f43419c
            if (r3 == r5) goto L_0x0041
            int r5 = f43420d
            if (r3 == r5) goto L_0x0041
            int r5 = f43421e
            if (r3 == r5) goto L_0x0041
            int r5 = f43422f
            if (r3 != r5) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            int r5 = f43424h
            if (r3 != r5) goto L_0x003f
            r13 = 4
            goto L_0x0042
        L_0x003f:
            r13 = -1
            goto L_0x0042
        L_0x0041:
            r13 = 3
        L_0x0042:
            r3 = 0
            if (r13 != r9) goto L_0x0046
            return r3
        L_0x0046:
            int r5 = com.google.android.gms.internal.ads.bph.f43325G
            com.google.android.gms.internal.ads.bpj r5 = r0.mo30540c(r5)
            com.google.android.gms.internal.ads.btr r5 = r5.f43416az
            r11 = 8
            r5.mo30697c(r11)
            int r12 = r5.mo30703g()
            int r12 = com.google.android.gms.internal.ads.bph.m36392a(r12)
            if (r12 != 0) goto L_0x0060
            r14 = 8
            goto L_0x0062
        L_0x0060:
            r14 = 16
        L_0x0062:
            r5.mo30699d(r14)
            int r14 = r5.mo30703g()
            r5.mo30699d(r8)
            int r15 = r5.f43868b
            if (r12 != 0) goto L_0x0072
            r3 = 4
            goto L_0x0074
        L_0x0072:
            r3 = 8
        L_0x0074:
            r10 = 0
        L_0x0075:
            if (r10 >= r3) goto L_0x0084
            byte[] r7 = r5.f43867a
            int r16 = r15 + r10
            byte r7 = r7[r16]
            if (r7 == r9) goto L_0x0081
            r7 = 0
            goto L_0x0085
        L_0x0081:
            int r10 = r10 + 1
            goto L_0x0075
        L_0x0084:
            r7 = 1
        L_0x0085:
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 == 0) goto L_0x0091
            r5.mo30699d(r3)
        L_0x008f:
            r9 = r15
            goto L_0x00a5
        L_0x0091:
            if (r12 != 0) goto L_0x0098
            long r17 = r5.mo30702f()
            goto L_0x009c
        L_0x0098:
            long r17 = r5.mo30706j()
        L_0x009c:
            r19 = 0
            int r3 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x00a3
            goto L_0x008f
        L_0x00a3:
            r9 = r17
        L_0x00a5:
            r5.mo30699d(r4)
            int r3 = r5.mo30703g()
            int r7 = r5.mo30703g()
            r5.mo30699d(r8)
            int r12 = r5.mo30703g()
            int r5 = r5.mo30703g()
            r8 = -65536(0xffffffffffff0000, float:NaN)
            if (r3 != 0) goto L_0x00ca
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r7 != r4) goto L_0x00ca
            if (r12 != r8) goto L_0x00ca
            if (r5 != 0) goto L_0x00ca
            r7 = 90
            goto L_0x00e3
        L_0x00ca:
            if (r3 != 0) goto L_0x00d7
            if (r7 != r8) goto L_0x00d7
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r12 != r4) goto L_0x00d7
            if (r5 != 0) goto L_0x00d7
            r7 = 270(0x10e, float:3.78E-43)
            goto L_0x00e3
        L_0x00d7:
            if (r3 != r8) goto L_0x00e2
            if (r7 != 0) goto L_0x00e2
            if (r12 != 0) goto L_0x00e2
            if (r5 != r8) goto L_0x00e2
            r7 = 180(0xb4, float:2.52E-43)
            goto L_0x00e3
        L_0x00e2:
            r7 = 0
        L_0x00e3:
            com.google.android.gms.internal.ads.bpq r3 = new com.google.android.gms.internal.ads.bpq
            r3.<init>(r14, r9, r7)
            long r4 = r3.f43446a
            r7 = r80
            com.google.android.gms.internal.ads.btr r7 = r7.f43416az
            r7.mo30697c(r11)
            int r8 = r7.mo30703g()
            int r8 = com.google.android.gms.internal.ads.bph.m36392a(r8)
            if (r8 != 0) goto L_0x00fe
            r8 = 8
            goto L_0x0100
        L_0x00fe:
            r8 = 16
        L_0x0100:
            r7.mo30699d(r8)
            long r7 = r7.mo30702f()
            int r9 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r9 != 0) goto L_0x010e
            r18 = r15
            goto L_0x011b
        L_0x010e:
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r17 = r4
            r21 = r7
            long r4 = com.google.android.gms.internal.ads.btw.m36758a(r17, r19, r21)
            r18 = r4
        L_0x011b:
            int r4 = com.google.android.gms.internal.ads.bph.f43411z
            com.google.android.gms.internal.ads.bpi r4 = r2.mo30541d(r4)
            int r5 = com.google.android.gms.internal.ads.bph.f43319A
            com.google.android.gms.internal.ads.bpi r4 = r4.mo30541d(r5)
            int r5 = com.google.android.gms.internal.ads.bph.f43328J
            com.google.android.gms.internal.ads.bpj r2 = r2.mo30540c(r5)
            com.google.android.gms.internal.ads.btr r2 = r2.f43416az
            r2.mo30697c(r11)
            int r5 = r2.mo30703g()
            int r5 = com.google.android.gms.internal.ads.bph.m36392a(r5)
            if (r5 != 0) goto L_0x013f
            r9 = 8
            goto L_0x0141
        L_0x013f:
            r9 = 16
        L_0x0141:
            r2.mo30699d(r9)
            long r9 = r2.mo30702f()
            if (r5 != 0) goto L_0x014c
            r5 = 4
            goto L_0x014e
        L_0x014c:
            r5 = 8
        L_0x014e:
            r2.mo30699d(r5)
            int r2 = r2.mo30700e()
            int r5 = r2 >> 10
            r5 = r5 & 31
            int r5 = r5 + 96
            char r5 = (char) r5
            int r12 = r2 >> 5
            r12 = r12 & 31
            int r12 = r12 + 96
            char r12 = (char) r12
            r2 = r2 & 31
            int r2 = r2 + 96
            char r2 = (char) r2
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r6)
            r14.append(r5)
            r14.append(r12)
            r14.append(r2)
            java.lang.String r2 = r14.toString()
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            android.util.Pair r2 = android.util.Pair.create(r5, r2)
            int r5 = com.google.android.gms.internal.ads.bph.f43330L
            com.google.android.gms.internal.ads.bpj r4 = r4.mo30540c(r5)
            com.google.android.gms.internal.ads.btr r4 = r4.f43416az
            int r5 = r3.f43448c
            int r9 = r3.f43447b
            java.lang.Object r10 = r2.second
            java.lang.String r10 = (java.lang.String) r10
            r12 = 12
            r4.mo30697c(r12)
            int r12 = r4.mo30703g()
            com.google.android.gms.internal.ads.bpn r14 = new com.google.android.gms.internal.ads.bpn
            r14.<init>(r12)
            r15 = 0
        L_0x01a3:
            if (r15 >= r12) goto L_0x0764
            int r6 = r4.f43868b
            int r11 = r4.mo30703g()
            if (r11 <= 0) goto L_0x01b3
            r42 = r7
            r41 = r12
            r12 = 1
            goto L_0x01b8
        L_0x01b3:
            r42 = r7
            r41 = r12
            r12 = 0
        L_0x01b8:
            java.lang.String r7 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.bti.m36700a(r12, r7)
            int r7 = r4.mo30703g()
            int r8 = com.google.android.gms.internal.ads.bph.f43387b
            if (r7 == r8) goto L_0x05cc
            int r8 = com.google.android.gms.internal.ads.bph.f43388c
            if (r7 == r8) goto L_0x05cc
            int r8 = com.google.android.gms.internal.ads.bph.f43335Q
            if (r7 == r8) goto L_0x05cc
            int r8 = com.google.android.gms.internal.ads.bph.f43340V
            if (r7 == r8) goto L_0x05cc
            int r8 = com.google.android.gms.internal.ads.bph.f43389d
            if (r7 == r8) goto L_0x05cc
            int r8 = com.google.android.gms.internal.ads.bph.f43390e
            if (r7 == r8) goto L_0x05cc
            int r8 = com.google.android.gms.internal.ads.bph.f43391f
            if (r7 == r8) goto L_0x05cc
            int r8 = com.google.android.gms.internal.ads.bph.f43381at
            if (r7 == r8) goto L_0x05cc
            int r8 = com.google.android.gms.internal.ads.bph.f43382au
            if (r7 != r8) goto L_0x01e7
            goto L_0x05cc
        L_0x01e7:
            int r8 = com.google.android.gms.internal.ads.bph.f43393h
            if (r7 == r8) goto L_0x02f6
            int r8 = com.google.android.gms.internal.ads.bph.f43336R
            if (r7 == r8) goto L_0x02f6
            int r8 = com.google.android.gms.internal.ads.bph.f43398m
            if (r7 == r8) goto L_0x02f6
            int r8 = com.google.android.gms.internal.ads.bph.f43400o
            if (r7 == r8) goto L_0x02f6
            int r8 = com.google.android.gms.internal.ads.bph.f43402q
            if (r7 == r8) goto L_0x02f6
            int r8 = com.google.android.gms.internal.ads.bph.f43405t
            if (r7 == r8) goto L_0x02f6
            int r8 = com.google.android.gms.internal.ads.bph.f43403r
            if (r7 == r8) goto L_0x02f6
            int r8 = com.google.android.gms.internal.ads.bph.f43404s
            if (r7 == r8) goto L_0x02f6
            int r8 = com.google.android.gms.internal.ads.bph.f43370ai
            if (r7 == r8) goto L_0x02f6
            int r8 = com.google.android.gms.internal.ads.bph.f43371aj
            if (r7 == r8) goto L_0x02f6
            int r8 = com.google.android.gms.internal.ads.bph.f43396k
            if (r7 == r8) goto L_0x02f6
            int r8 = com.google.android.gms.internal.ads.bph.f43397l
            if (r7 == r8) goto L_0x02f6
            int r8 = com.google.android.gms.internal.ads.bph.f43394i
            if (r7 == r8) goto L_0x02f6
            int r8 = com.google.android.gms.internal.ads.bph.f43385ax
            if (r7 != r8) goto L_0x0221
            goto L_0x02f6
        L_0x0221:
            int r8 = com.google.android.gms.internal.ads.bph.f43339U
            if (r7 == r8) goto L_0x027e
            int r8 = com.google.android.gms.internal.ads.bph.f43366ae
            if (r7 == r8) goto L_0x027e
            int r8 = com.google.android.gms.internal.ads.bph.f43367af
            if (r7 == r8) goto L_0x027e
            int r8 = com.google.android.gms.internal.ads.bph.f43368ag
            if (r7 == r8) goto L_0x027e
            int r8 = com.google.android.gms.internal.ads.bph.f43369ah
            if (r7 != r8) goto L_0x0236
            goto L_0x027e
        L_0x0236:
            int r8 = com.google.android.gms.internal.ads.bph.f43384aw
            if (r7 != r8) goto L_0x02e6
            java.lang.String r45 = java.lang.Integer.toString(r5)
            java.lang.String r47 = "application/x-camera-motion"
            com.google.android.gms.internal.ads.zzlg r7 = new com.google.android.gms.internal.ads.zzlg
            r44 = r7
            r46 = 0
            r48 = 0
            r49 = -1
            r50 = -1
            r51 = -1
            r52 = -1
            r53 = -1082130432(0xffffffffbf800000, float:-1.0)
            r54 = -1
            r55 = -1082130432(0xffffffffbf800000, float:-1.0)
            r56 = 0
            r57 = -1
            r58 = 0
            r59 = -1
            r60 = -1
            r61 = -1
            r62 = -1
            r63 = -1
            r64 = 0
            r65 = 0
            r66 = -1
            r67 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r69 = 0
            r70 = 0
            r71 = 0
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r69, r70, r71)
            r14.f43435b = r7
            goto L_0x02e6
        L_0x027e:
            int r8 = r6 + 8
            r12 = 8
            int r8 = r8 + r12
            r4.mo30697c(r8)
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r8 = com.google.android.gms.internal.ads.bph.f43339U
            if (r7 != r8) goto L_0x0298
            java.lang.String r7 = "application/ttml+xml"
        L_0x0291:
            r27 = r7
            r34 = r16
            r36 = 0
            goto L_0x02d0
        L_0x0298:
            int r8 = com.google.android.gms.internal.ads.bph.f43366ae
            if (r7 != r8) goto L_0x02b6
            java.lang.String r7 = "application/x-quicktime-tx3g"
            int r8 = r11 + -8
            r12 = 8
            int r8 = r8 - r12
            byte[] r12 = new byte[r8]
            r72 = r7
            r7 = 0
            r4.mo30693a(r12, r7, r8)
            java.util.List r7 = java.util.Collections.singletonList(r12)
            r36 = r7
            r34 = r16
            r27 = r72
            goto L_0x02d0
        L_0x02b6:
            int r8 = com.google.android.gms.internal.ads.bph.f43367af
            if (r7 != r8) goto L_0x02bd
            java.lang.String r7 = "application/x-mp4-vtt"
            goto L_0x0291
        L_0x02bd:
            int r8 = com.google.android.gms.internal.ads.bph.f43368ag
            if (r7 != r8) goto L_0x02c6
            java.lang.String r7 = "application/ttml+xml"
            r16 = 0
            goto L_0x0291
        L_0x02c6:
            int r8 = com.google.android.gms.internal.ads.bph.f43369ah
            if (r7 != r8) goto L_0x02f0
            java.lang.String r7 = "application/x-mp4-cea-608"
            r8 = 1
            r14.f43437d = r8
            goto L_0x0291
        L_0x02d0:
            java.lang.String r26 = java.lang.Integer.toString(r5)
            r28 = 0
            r29 = -1
            r30 = 0
            r32 = -1
            r33 = 0
            r31 = r10
            com.google.android.gms.internal.ads.zzlg r7 = com.google.android.gms.internal.ads.zzlg.m39284a(r26, r27, r28, r29, r30, r31, r32, r33, r34, r36)
            r14.f43435b = r7
        L_0x02e6:
            r75 = r2
            r76 = r3
            r77 = r9
            r3 = r11
            r73 = r13
            goto L_0x0343
        L_0x02f0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x02f6:
            int r8 = r6 + 8
            r12 = 8
            int r8 = r8 + r12
            r4.mo30697c(r8)
            r8 = 6
            if (r84 == 0) goto L_0x030b
            int r16 = r4.mo30700e()
            r4.mo30699d(r8)
            r12 = r16
            goto L_0x030f
        L_0x030b:
            r4.mo30699d(r12)
            r12 = 0
        L_0x030f:
            if (r12 == 0) goto L_0x0346
            r8 = 1
            if (r12 != r8) goto L_0x0315
            goto L_0x0346
        L_0x0315:
            r8 = 2
            if (r12 != r8) goto L_0x033a
            r8 = 16
            r4.mo30699d(r8)
            long r16 = r4.mo30704h()
            double r16 = java.lang.Double.longBitsToDouble(r16)
            r73 = r13
            long r12 = java.lang.Math.round(r16)
            int r8 = (int) r12
            int r12 = r4.mo30705i()
            r13 = 20
            r4.mo30699d(r13)
            r75 = r2
            r76 = r3
            goto L_0x0383
        L_0x033a:
            r73 = r13
            r75 = r2
            r76 = r3
            r77 = r9
            r3 = r11
        L_0x0343:
            r8 = 3
            goto L_0x074b
        L_0x0346:
            r73 = r13
            int r8 = r4.mo30700e()
            r13 = 6
            r4.mo30699d(r13)
            byte[] r13 = r4.f43867a
            r74 = r8
            int r8 = r4.f43868b
            r75 = r2
            int r2 = r8 + 1
            r4.f43868b = r2
            byte r2 = r13[r8]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r8 = 8
            int r2 = r2 << r8
            byte[] r8 = r4.f43867a
            int r13 = r4.f43868b
            r76 = r3
            int r3 = r13 + 1
            r4.f43868b = r3
            byte r3 = r8[r13]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r8 = r2 | r3
            int r2 = r4.f43868b
            r3 = 2
            int r2 = r2 + r3
            r4.f43868b = r2
            r2 = 1
            if (r12 != r2) goto L_0x0381
            r2 = 16
            r4.mo30699d(r2)
        L_0x0381:
            r12 = r74
        L_0x0383:
            int r2 = r4.f43868b
            int r3 = com.google.android.gms.internal.ads.bph.f43336R
            if (r7 != r3) goto L_0x0390
            int r7 = m36397a(r4, r6, r11, r14, r15)
            r4.mo30697c(r2)
        L_0x0390:
            int r3 = com.google.android.gms.internal.ads.bph.f43398m
            if (r7 != r3) goto L_0x0397
            java.lang.String r3 = "audio/ac3"
            goto L_0x03e1
        L_0x0397:
            int r3 = com.google.android.gms.internal.ads.bph.f43400o
            if (r7 != r3) goto L_0x039e
            java.lang.String r3 = "audio/eac3"
            goto L_0x03e1
        L_0x039e:
            int r3 = com.google.android.gms.internal.ads.bph.f43402q
            if (r7 != r3) goto L_0x03a5
            java.lang.String r3 = "audio/vnd.dts"
            goto L_0x03e1
        L_0x03a5:
            int r3 = com.google.android.gms.internal.ads.bph.f43403r
            if (r7 == r3) goto L_0x03df
            int r3 = com.google.android.gms.internal.ads.bph.f43404s
            if (r7 != r3) goto L_0x03ae
            goto L_0x03df
        L_0x03ae:
            int r3 = com.google.android.gms.internal.ads.bph.f43405t
            if (r7 != r3) goto L_0x03b5
            java.lang.String r3 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x03e1
        L_0x03b5:
            int r3 = com.google.android.gms.internal.ads.bph.f43370ai
            if (r7 != r3) goto L_0x03bc
            java.lang.String r3 = "audio/3gpp"
            goto L_0x03e1
        L_0x03bc:
            int r3 = com.google.android.gms.internal.ads.bph.f43371aj
            if (r7 != r3) goto L_0x03c3
            java.lang.String r3 = "audio/amr-wb"
            goto L_0x03e1
        L_0x03c3:
            int r3 = com.google.android.gms.internal.ads.bph.f43396k
            if (r7 == r3) goto L_0x03dc
            int r3 = com.google.android.gms.internal.ads.bph.f43397l
            if (r7 != r3) goto L_0x03cc
            goto L_0x03dc
        L_0x03cc:
            int r3 = com.google.android.gms.internal.ads.bph.f43394i
            if (r7 != r3) goto L_0x03d3
            java.lang.String r3 = "audio/mpeg"
            goto L_0x03e1
        L_0x03d3:
            int r3 = com.google.android.gms.internal.ads.bph.f43385ax
            if (r7 != r3) goto L_0x03da
            java.lang.String r3 = "audio/alac"
            goto L_0x03e1
        L_0x03da:
            r3 = 0
            goto L_0x03e1
        L_0x03dc:
            java.lang.String r3 = "audio/raw"
            goto L_0x03e1
        L_0x03df:
            java.lang.String r3 = "audio/vnd.dts.hd"
        L_0x03e1:
            r7 = 0
        L_0x03e2:
            int r13 = r2 - r6
            if (r13 >= r11) goto L_0x0588
            r4.mo30697c(r2)
            int r13 = r4.mo30703g()
            if (r13 <= 0) goto L_0x03f3
            r77 = r9
            r0 = 1
            goto L_0x03f6
        L_0x03f3:
            r77 = r9
            r0 = 0
        L_0x03f6:
            java.lang.String r9 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.bti.m36700a(r0, r9)
            int r0 = r4.mo30703g()
            int r9 = com.google.android.gms.internal.ads.bph.f43322D
            if (r0 == r9) goto L_0x04d6
            if (r84 == 0) goto L_0x040b
            int r9 = com.google.android.gms.internal.ads.bph.f43395j
            if (r0 != r9) goto L_0x040b
            goto L_0x04d6
        L_0x040b:
            int r9 = com.google.android.gms.internal.ads.bph.f43399n
            if (r0 != r9) goto L_0x0455
            int r0 = r2 + 8
            r4.mo30697c(r0)
            java.lang.String r26 = java.lang.Integer.toString(r5)
            int r0 = r4.mo30698d()
            r0 = r0 & 192(0xc0, float:2.69E-43)
            r9 = 6
            int r0 = r0 >> r9
            int[] r9 = com.google.android.gms.internal.ads.bmt.f42994b
            r32 = r9[r0]
            int r0 = r4.mo30698d()
            int[] r9 = com.google.android.gms.internal.ads.bmt.f42995c
            r16 = r0 & 56
            r17 = 3
            int r16 = r16 >> 3
            r9 = r9[r16]
            r16 = 4
            r0 = r0 & 4
            if (r0 == 0) goto L_0x043a
            int r9 = r9 + 1
        L_0x043a:
            r31 = r9
            java.lang.String r27 = "audio/ac3"
            r28 = 0
            r29 = -1
            r30 = -1
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = r10
            com.google.android.gms.internal.ads.zzlg r0 = com.google.android.gms.internal.ads.zzlg.m39283a(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r14.f43435b = r0
        L_0x0452:
            r9 = 0
            goto L_0x04d0
        L_0x0455:
            int r9 = com.google.android.gms.internal.ads.bph.f43401p
            if (r0 != r9) goto L_0x049f
            int r0 = r2 + 8
            r4.mo30697c(r0)
            java.lang.String r26 = java.lang.Integer.toString(r5)
            r0 = 2
            r4.mo30699d(r0)
            int r0 = r4.mo30698d()
            r0 = r0 & 192(0xc0, float:2.69E-43)
            r9 = 6
            int r0 = r0 >> r9
            int[] r16 = com.google.android.gms.internal.ads.bmt.f42994b
            r32 = r16[r0]
            int r0 = r4.mo30698d()
            int[] r16 = com.google.android.gms.internal.ads.bmt.f42995c
            r17 = r0 & 14
            r20 = 1
            int r17 = r17 >> 1
            r16 = r16[r17]
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0486
            int r16 = r16 + 1
        L_0x0486:
            r31 = r16
            java.lang.String r27 = "audio/eac3"
            r28 = 0
            r29 = -1
            r30 = -1
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = r10
            com.google.android.gms.internal.ads.zzlg r0 = com.google.android.gms.internal.ads.zzlg.m39283a(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r14.f43435b = r0
            goto L_0x0452
        L_0x049f:
            int r9 = com.google.android.gms.internal.ads.bph.f43406u
            if (r0 != r9) goto L_0x04c2
            java.lang.String r26 = java.lang.Integer.toString(r5)
            r28 = 0
            r29 = -1
            r30 = -1
            r33 = 0
            r34 = 0
            r35 = 0
            r27 = r3
            r31 = r12
            r32 = r8
            r36 = r10
            com.google.android.gms.internal.ads.zzlg r0 = com.google.android.gms.internal.ads.zzlg.m39283a(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r14.f43435b = r0
            goto L_0x0452
        L_0x04c2:
            int r9 = com.google.android.gms.internal.ads.bph.f43385ax
            if (r0 != r9) goto L_0x0452
            byte[] r0 = new byte[r13]
            r4.mo30697c(r2)
            r9 = 0
            r4.mo30693a(r0, r9, r13)
            r7 = r0
        L_0x04d0:
            r78 = r11
        L_0x04d2:
            r9 = 4
            r11 = -1
            goto L_0x057f
        L_0x04d6:
            int r9 = com.google.android.gms.internal.ads.bph.f43322D
            if (r0 != r9) goto L_0x04df
            r9 = r2
            r78 = r11
        L_0x04dd:
            r0 = -1
            goto L_0x050c
        L_0x04df:
            int r0 = r4.f43868b
            r9 = r0
        L_0x04e2:
            int r0 = r9 - r2
            if (r0 >= r13) goto L_0x0508
            r4.mo30697c(r9)
            int r0 = r4.mo30703g()
            if (r0 <= 0) goto L_0x04f3
            r78 = r11
            r1 = 1
            goto L_0x04f6
        L_0x04f3:
            r78 = r11
            r1 = 0
        L_0x04f6:
            java.lang.String r11 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.bti.m36700a(r1, r11)
            int r1 = r4.mo30703g()
            int r11 = com.google.android.gms.internal.ads.bph.f43322D
            if (r1 != r11) goto L_0x0504
            goto L_0x04dd
        L_0x0504:
            int r9 = r9 + r0
            r11 = r78
            goto L_0x04e2
        L_0x0508:
            r78 = r11
            r0 = -1
            r9 = -1
        L_0x050c:
            if (r9 == r0) goto L_0x04d2
            android.util.Pair r0 = m36398a(r4, r9)
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.second
            r7 = r0
            byte[] r7 = (byte[]) r7
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x057c
            com.google.android.gms.internal.ads.btq r0 = new com.google.android.gms.internal.ads.btq
            r0.<init>(r7)
            int r3 = com.google.android.gms.internal.ads.btj.m36703a(r0)
            int r8 = com.google.android.gms.internal.ads.btj.m36705b(r0)
            r9 = 4
            int r11 = r0.mo30689a(r9)
            r9 = 5
            if (r3 == r9) goto L_0x053f
            r9 = 29
            if (r3 != r9) goto L_0x053d
            goto L_0x053f
        L_0x053d:
            r9 = 4
            goto L_0x0550
        L_0x053f:
            int r8 = com.google.android.gms.internal.ads.btj.m36705b(r0)
            int r3 = com.google.android.gms.internal.ads.btj.m36703a(r0)
            r9 = 22
            if (r3 != r9) goto L_0x053d
            r9 = 4
            int r11 = r0.mo30689a(r9)
        L_0x0550:
            int[] r0 = com.google.android.gms.internal.ads.btj.f43843a
            r0 = r0[r11]
            r11 = -1
            if (r0 == r11) goto L_0x0559
            r3 = 1
            goto L_0x055a
        L_0x0559:
            r3 = 0
        L_0x055a:
            com.google.android.gms.internal.ads.bti.m36699a(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r3, r0)
            java.lang.Object r3 = r0.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12 = r0
            r8 = r3
            goto L_0x057e
        L_0x057c:
            r9 = 4
            r11 = -1
        L_0x057e:
            r3 = r1
        L_0x057f:
            int r2 = r2 + r13
            r9 = r77
            r11 = r78
            r0 = r79
            goto L_0x03e2
        L_0x0588:
            r77 = r9
            r78 = r11
            r9 = 4
            r11 = -1
            com.google.android.gms.internal.ads.zzlg r0 = r14.f43435b
            if (r0 != 0) goto L_0x05c8
            if (r3 == 0) goto L_0x05c8
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x059f
            r33 = 2
            goto L_0x05a1
        L_0x059f:
            r33 = -1
        L_0x05a1:
            java.lang.String r26 = java.lang.Integer.toString(r5)
            r28 = 0
            r29 = -1
            r30 = -1
            if (r7 != 0) goto L_0x05b0
            r34 = 0
            goto L_0x05b6
        L_0x05b0:
            java.util.List r0 = java.util.Collections.singletonList(r7)
            r34 = r0
        L_0x05b6:
            r35 = 0
            r36 = 0
            r27 = r3
            r31 = r12
            r32 = r8
            r37 = r10
            com.google.android.gms.internal.ads.zzlg r0 = com.google.android.gms.internal.ads.zzlg.m39282a(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r14.f43435b = r0
        L_0x05c8:
            r3 = r78
            goto L_0x0343
        L_0x05cc:
            r75 = r2
            r76 = r3
            r77 = r9
            r78 = r11
            r73 = r13
            r9 = 4
            r11 = -1
            int r0 = r6 + 8
            r1 = 8
            int r0 = r0 + r1
            r4.mo30697c(r0)
            r0 = 16
            r4.mo30699d(r0)
            int r31 = r4.mo30700e()
            int r32 = r4.mo30700e()
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 50
            r4.mo30699d(r2)
            int r2 = r4.f43868b
            int r3 = com.google.android.gms.internal.ads.bph.f43335Q
            if (r7 != r3) goto L_0x0604
            r3 = r78
            int r7 = m36397a(r4, r6, r3, r14, r15)
            r4.mo30697c(r2)
            goto L_0x0606
        L_0x0604:
            r3 = r78
        L_0x0606:
            r1 = 0
            r27 = 0
            r34 = 0
            r36 = 1065353216(0x3f800000, float:1.0)
            r37 = 0
            r38 = -1
        L_0x0611:
            int r8 = r2 - r6
            if (r8 >= r3) goto L_0x0730
            r4.mo30697c(r2)
            int r8 = r4.f43868b
            int r12 = r4.mo30703g()
            if (r12 != 0) goto L_0x0625
            int r13 = r4.f43868b
            int r13 = r13 - r6
            if (r13 == r3) goto L_0x0730
        L_0x0625:
            if (r12 <= 0) goto L_0x0629
            r13 = 1
            goto L_0x062a
        L_0x0629:
            r13 = 0
        L_0x062a:
            java.lang.String r0 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.bti.m36700a(r13, r0)
            int r0 = r4.mo30703g()
            int r13 = com.google.android.gms.internal.ads.bph.f43320B
            if (r0 != r13) goto L_0x065d
            if (r27 != 0) goto L_0x063b
            r0 = 1
            goto L_0x063c
        L_0x063b:
            r0 = 0
        L_0x063c:
            com.google.android.gms.internal.ads.bti.m36701b(r0)
            java.lang.String r0 = "video/avc"
            int r8 = r8 + 8
            r4.mo30697c(r8)
            com.google.android.gms.internal.ads.bty r8 = com.google.android.gms.internal.ads.bty.m36767a(r4)
            java.util.List<byte[]> r13 = r8.f43888a
            int r9 = r8.f43889b
            r14.f43436c = r9
            if (r1 != 0) goto L_0x0656
            float r8 = r8.f43890c
            r36 = r8
        L_0x0656:
            r27 = r0
            r34 = r13
        L_0x065a:
            r8 = 3
            goto L_0x0729
        L_0x065d:
            int r9 = com.google.android.gms.internal.ads.bph.f43321C
            if (r0 != r9) goto L_0x067f
            if (r27 != 0) goto L_0x0665
            r0 = 1
            goto L_0x0666
        L_0x0665:
            r0 = 0
        L_0x0666:
            com.google.android.gms.internal.ads.bti.m36701b(r0)
            java.lang.String r0 = "video/hevc"
            int r8 = r8 + 8
            r4.mo30697c(r8)
            com.google.android.gms.internal.ads.bud r8 = com.google.android.gms.internal.ads.bud.m36774a(r4)
            java.util.List<byte[]> r9 = r8.f43907a
            int r8 = r8.f43908b
            r14.f43436c = r8
            r27 = r0
            r34 = r9
            goto L_0x065a
        L_0x067f:
            int r9 = com.google.android.gms.internal.ads.bph.f43383av
            if (r0 != r9) goto L_0x0695
            if (r27 != 0) goto L_0x0687
            r0 = 1
            goto L_0x0688
        L_0x0687:
            r0 = 0
        L_0x0688:
            com.google.android.gms.internal.ads.bti.m36701b(r0)
            int r0 = com.google.android.gms.internal.ads.bph.f43381at
            if (r7 != r0) goto L_0x0692
            java.lang.String r0 = "video/x-vnd.on2.vp8"
            goto L_0x06a3
        L_0x0692:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            goto L_0x06a3
        L_0x0695:
            int r9 = com.google.android.gms.internal.ads.bph.f43392g
            if (r0 != r9) goto L_0x06a6
            if (r27 != 0) goto L_0x069d
            r0 = 1
            goto L_0x069e
        L_0x069d:
            r0 = 0
        L_0x069e:
            com.google.android.gms.internal.ads.bti.m36701b(r0)
            java.lang.String r0 = "video/3gpp"
        L_0x06a3:
            r27 = r0
            goto L_0x065a
        L_0x06a6:
            int r9 = com.google.android.gms.internal.ads.bph.f43322D
            if (r0 != r9) goto L_0x06c7
            if (r27 != 0) goto L_0x06ae
            r0 = 1
            goto L_0x06af
        L_0x06ae:
            r0 = 0
        L_0x06af:
            com.google.android.gms.internal.ads.bti.m36701b(r0)
            android.util.Pair r0 = m36398a(r4, r8)
            java.lang.Object r8 = r0.first
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r0 = r0.second
            byte[] r0 = (byte[]) r0
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r34 = r0
            r27 = r8
            goto L_0x065a
        L_0x06c7:
            int r9 = com.google.android.gms.internal.ads.bph.f43338T
            if (r0 != r9) goto L_0x06df
            int r8 = r8 + 8
            r4.mo30697c(r8)
            int r0 = r4.mo30705i()
            int r1 = r4.mo30705i()
            float r0 = (float) r0
            float r1 = (float) r1
            float r36 = r0 / r1
            r1 = 1
            goto L_0x065a
        L_0x06df:
            int r9 = com.google.android.gms.internal.ads.bph.f43379ar
            if (r0 != r9) goto L_0x0708
            int r0 = r8 + 8
        L_0x06e5:
            int r9 = r0 - r8
            if (r9 >= r12) goto L_0x0703
            r4.mo30697c(r0)
            int r9 = r4.mo30703g()
            int r13 = r4.mo30703g()
            int r11 = com.google.android.gms.internal.ads.bph.f43380as
            if (r13 != r11) goto L_0x0700
            byte[] r8 = r4.f43867a
            int r9 = r9 + r0
            byte[] r0 = java.util.Arrays.copyOfRange(r8, r0, r9)
            goto L_0x0704
        L_0x0700:
            int r0 = r0 + r9
            r11 = -1
            goto L_0x06e5
        L_0x0703:
            r0 = 0
        L_0x0704:
            r37 = r0
            goto L_0x065a
        L_0x0708:
            int r8 = com.google.android.gms.internal.ads.bph.f43378aq
            if (r0 != r8) goto L_0x065a
            int r0 = r4.mo30698d()
            r8 = 3
            r4.mo30699d(r8)
            if (r0 != 0) goto L_0x0729
            int r0 = r4.mo30698d()
            switch(r0) {
                case 0: goto L_0x0727;
                case 1: goto L_0x0724;
                case 2: goto L_0x0721;
                case 3: goto L_0x071e;
                default: goto L_0x071d;
            }
        L_0x071d:
            goto L_0x0729
        L_0x071e:
            r38 = 3
            goto L_0x0729
        L_0x0721:
            r38 = 2
            goto L_0x0729
        L_0x0724:
            r38 = 1
            goto L_0x0729
        L_0x0727:
            r38 = 0
        L_0x0729:
            int r2 = r2 + r12
            r0 = 16
            r9 = 4
            r11 = -1
            goto L_0x0611
        L_0x0730:
            r8 = 3
            if (r27 == 0) goto L_0x074b
            java.lang.String r26 = java.lang.Integer.toString(r5)
            r28 = 0
            r29 = -1
            r30 = -1
            r33 = -1082130432(0xffffffffbf800000, float:-1.0)
            r39 = 0
            r40 = 0
            r35 = r77
            com.google.android.gms.internal.ads.zzlg r0 = com.google.android.gms.internal.ads.zzlg.m39281a(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r14.f43435b = r0
        L_0x074b:
            int r6 = r6 + r3
            r4.mo30697c(r6)
            int r15 = r15 + 1
            r12 = r41
            r7 = r42
            r13 = r73
            r2 = r75
            r3 = r76
            r9 = r77
            r0 = r79
            r6 = 3
            r11 = 8
            goto L_0x01a3
        L_0x0764:
            r75 = r2
            r76 = r3
            r42 = r7
            r73 = r13
            int r0 = com.google.android.gms.internal.ads.bph.f43326H
            r1 = r79
            com.google.android.gms.internal.ads.bpi r0 = r1.mo30541d(r0)
            if (r0 == 0) goto L_0x07eb
            int r1 = com.google.android.gms.internal.ads.bph.f43327I
            com.google.android.gms.internal.ads.bpj r0 = r0.mo30540c(r1)
            if (r0 != 0) goto L_0x077f
            goto L_0x07eb
        L_0x077f:
            com.google.android.gms.internal.ads.btr r0 = r0.f43416az
            r1 = 8
            r0.mo30697c(r1)
            int r1 = r0.mo30703g()
            int r1 = com.google.android.gms.internal.ads.bph.m36392a(r1)
            int r2 = r0.mo30705i()
            long[] r3 = new long[r2]
            long[] r4 = new long[r2]
            r5 = 0
        L_0x0797:
            if (r5 >= r2) goto L_0x07e4
            r6 = 1
            if (r1 != r6) goto L_0x07a1
            long r7 = r0.mo30706j()
            goto L_0x07a5
        L_0x07a1:
            long r7 = r0.mo30702f()
        L_0x07a5:
            r3[r5] = r7
            if (r1 != r6) goto L_0x07ae
            long r6 = r0.mo30704h()
            goto L_0x07b3
        L_0x07ae:
            int r6 = r0.mo30703g()
            long r6 = (long) r6
        L_0x07b3:
            r4[r5] = r6
            byte[] r6 = r0.f43867a
            int r7 = r0.f43868b
            int r8 = r7 + 1
            r0.f43868b = r8
            byte r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = 8
            int r6 = r6 << r7
            byte[] r8 = r0.f43867a
            int r9 = r0.f43868b
            int r10 = r9 + 1
            r0.f43868b = r10
            byte r8 = r8[r9]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r6 = r6 | r8
            short r6 = (short) r6
            r8 = 1
            if (r6 != r8) goto L_0x07dc
            r6 = 2
            r0.mo30699d(r6)
            int r5 = r5 + 1
            goto L_0x0797
        L_0x07dc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x07e4:
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
            r1 = r0
            r0 = 0
            goto L_0x07f0
        L_0x07eb:
            r0 = 0
            android.util.Pair r1 = android.util.Pair.create(r0, r0)
        L_0x07f0:
            com.google.android.gms.internal.ads.zzlg r2 = r14.f43435b
            if (r2 != 0) goto L_0x07f5
            return r0
        L_0x07f5:
            com.google.android.gms.internal.ads.bpy r0 = new com.google.android.gms.internal.ads.bpy
            int r12 = r76.f43448c
            r2 = r75
            java.lang.Object r2 = r2.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            com.google.android.gms.internal.ads.zzlg r4 = r14.f43435b
            int r5 = r14.f43437d
            com.google.android.gms.internal.ads.bqa[] r6 = r14.f43434a
            int r7 = r14.f43436c
            java.lang.Object r8 = r1.first
            r24 = r8
            long[] r24 = (long[]) r24
            java.lang.Object r1 = r1.second
            r25 = r1
            long[] r25 = (long[]) r25
            r11 = r0
            r13 = r73
            r14 = r2
            r16 = r42
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r11.<init>(r12, r13, r14, r16, r18, r20, r21, r22, r23, r24, r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bpk.m36399a(com.google.android.gms.internal.ads.bpi, com.google.android.gms.internal.ads.bpj, long, com.google.android.gms.internal.ads.zznd, boolean):com.google.android.gms.internal.ads.bpy");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ab  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.bqb m36400a(com.google.android.gms.internal.ads.bpy r51, com.google.android.gms.internal.ads.bpi r52, com.google.android.gms.internal.ads.boo r53) throws com.google.android.gms.internal.ads.bmk {
        /*
            r0 = r51
            r1 = r52
            r2 = r53
            int r3 = com.google.android.gms.internal.ads.bph.f43362aa
            com.google.android.gms.internal.ads.bpj r3 = r1.mo30540c(r3)
            if (r3 == 0) goto L_0x0014
            com.google.android.gms.internal.ads.bpo r4 = new com.google.android.gms.internal.ads.bpo
            r4.<init>(r3)
            goto L_0x0021
        L_0x0014:
            int r3 = com.google.android.gms.internal.ads.bph.f43363ab
            com.google.android.gms.internal.ads.bpj r3 = r1.mo30540c(r3)
            if (r3 == 0) goto L_0x0473
            com.google.android.gms.internal.ads.bpp r4 = new com.google.android.gms.internal.ads.bpp
            r4.<init>(r3)
        L_0x0021:
            int r3 = r4.mo30543a()
            r5 = 0
            if (r3 != 0) goto L_0x0038
            com.google.android.gms.internal.ads.bqb r0 = new com.google.android.gms.internal.ads.bqb
            long[] r7 = new long[r5]
            int[] r8 = new int[r5]
            r9 = 0
            long[] r10 = new long[r5]
            int[] r11 = new int[r5]
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return r0
        L_0x0038:
            int r6 = com.google.android.gms.internal.ads.bph.f43364ac
            com.google.android.gms.internal.ads.bpj r6 = r1.mo30540c(r6)
            r7 = 1
            if (r6 != 0) goto L_0x0049
            int r6 = com.google.android.gms.internal.ads.bph.f43365ad
            com.google.android.gms.internal.ads.bpj r6 = r1.mo30540c(r6)
            r8 = 1
            goto L_0x004a
        L_0x0049:
            r8 = 0
        L_0x004a:
            com.google.android.gms.internal.ads.btr r6 = r6.f43416az
            int r9 = com.google.android.gms.internal.ads.bph.f43344Z
            com.google.android.gms.internal.ads.bpj r9 = r1.mo30540c(r9)
            com.google.android.gms.internal.ads.btr r9 = r9.f43416az
            int r10 = com.google.android.gms.internal.ads.bph.f43341W
            com.google.android.gms.internal.ads.bpj r10 = r1.mo30540c(r10)
            com.google.android.gms.internal.ads.btr r10 = r10.f43416az
            int r11 = com.google.android.gms.internal.ads.bph.f43342X
            com.google.android.gms.internal.ads.bpj r11 = r1.mo30540c(r11)
            r12 = 0
            if (r11 == 0) goto L_0x0068
            com.google.android.gms.internal.ads.btr r11 = r11.f43416az
            goto L_0x0069
        L_0x0068:
            r11 = r12
        L_0x0069:
            int r13 = com.google.android.gms.internal.ads.bph.f43343Y
            com.google.android.gms.internal.ads.bpj r1 = r1.mo30540c(r13)
            if (r1 == 0) goto L_0x0074
            com.google.android.gms.internal.ads.btr r1 = r1.f43416az
            goto L_0x0075
        L_0x0074:
            r1 = r12
        L_0x0075:
            com.google.android.gms.internal.ads.bpl r13 = new com.google.android.gms.internal.ads.bpl
            r13.<init>(r9, r6, r8)
            r6 = 12
            r10.mo30697c(r6)
            int r8 = r10.mo30705i()
            int r8 = r8 - r7
            int r9 = r10.mo30705i()
            int r14 = r10.mo30705i()
            if (r1 == 0) goto L_0x0096
            r1.mo30697c(r6)
            int r15 = r1.mo30705i()
            goto L_0x0097
        L_0x0096:
            r15 = 0
        L_0x0097:
            r16 = -1
            if (r11 == 0) goto L_0x00ac
            r11.mo30697c(r6)
            int r6 = r11.mo30705i()
            if (r6 <= 0) goto L_0x00aa
            int r12 = r11.mo30705i()
            int r12 = r12 - r7
            goto L_0x00ae
        L_0x00aa:
            r11 = r12
            goto L_0x00ad
        L_0x00ac:
            r6 = 0
        L_0x00ad:
            r12 = -1
        L_0x00ae:
            boolean r17 = r4.mo30545c()
            if (r17 == 0) goto L_0x00c8
            java.lang.String r5 = "audio/raw"
            com.google.android.gms.internal.ads.zzlg r7 = r0.f43511f
            java.lang.String r7 = r7.f46253c
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x00c8
            if (r8 != 0) goto L_0x00c8
            if (r15 != 0) goto L_0x00c8
            if (r6 != 0) goto L_0x00c8
            r5 = 1
            goto L_0x00c9
        L_0x00c8:
            r5 = 0
        L_0x00c9:
            r20 = 0
            if (r5 != 0) goto L_0x01ab
            long[] r5 = new long[r3]
            int[] r7 = new int[r3]
            r22 = r6
            long[] r6 = new long[r3]
            r23 = r8
            int[] r8 = new int[r3]
            r29 = r9
            r2 = r14
            r26 = r15
            r24 = r20
            r28 = r22
            r30 = r23
            r9 = 0
            r15 = 0
            r17 = 0
            r27 = 0
            r14 = r12
            r22 = r24
            r12 = 0
        L_0x00ee:
            if (r9 >= r3) goto L_0x0186
        L_0x00f0:
            if (r27 != 0) goto L_0x010c
            boolean r22 = r13.mo30542a()
            com.google.android.gms.internal.ads.bti.m36701b(r22)
            r32 = r2
            r31 = r3
            long r2 = r13.f43428d
            r33 = r2
            int r2 = r13.f43427c
            r27 = r2
            r3 = r31
            r2 = r32
            r22 = r33
            goto L_0x00f0
        L_0x010c:
            r32 = r2
            r31 = r3
            if (r1 == 0) goto L_0x0123
        L_0x0112:
            if (r12 != 0) goto L_0x0121
            if (r26 <= 0) goto L_0x0121
            int r12 = r1.mo30705i()
            int r17 = r1.mo30703g()
            int r26 = r26 + -1
            goto L_0x0112
        L_0x0121:
            int r12 = r12 + -1
        L_0x0123:
            r2 = r17
            r5[r9] = r22
            int r3 = r4.mo30544b()
            r7[r9] = r3
            r3 = r7[r9]
            if (r3 <= r15) goto L_0x0134
            r3 = r7[r9]
            r15 = r3
        L_0x0134:
            r35 = r4
            long r3 = (long) r2
            long r3 = r24 + r3
            r6[r9] = r3
            if (r11 != 0) goto L_0x013f
            r3 = 1
            goto L_0x0140
        L_0x013f:
            r3 = 0
        L_0x0140:
            r8[r9] = r3
            if (r9 != r14) goto L_0x0153
            r3 = 1
            r8[r9] = r3
            int r28 = r28 + -1
            if (r28 <= 0) goto L_0x0153
            int r4 = r11.mo30705i()
            int r4 = r4 - r3
            r36 = r2
            goto L_0x0156
        L_0x0153:
            r36 = r2
            r4 = r14
        L_0x0156:
            r14 = r32
            long r2 = (long) r14
            long r24 = r24 + r2
            int r29 = r29 + -1
            if (r29 != 0) goto L_0x016f
            if (r30 <= 0) goto L_0x016f
            int r2 = r10.mo30705i()
            int r3 = r10.mo30705i()
            int r30 = r30 + -1
            r29 = r2
            r2 = r3
            goto L_0x0170
        L_0x016f:
            r2 = r14
        L_0x0170:
            r3 = r7[r9]
            r37 = r2
            long r2 = (long) r3
            long r22 = r22 + r2
            int r27 = r27 + -1
            int r9 = r9 + 1
            r14 = r4
            r3 = r31
            r4 = r35
            r17 = r36
            r2 = r37
            goto L_0x00ee
        L_0x0186:
            r31 = r3
            if (r12 != 0) goto L_0x018c
            r2 = 1
            goto L_0x018d
        L_0x018c:
            r2 = 0
        L_0x018d:
            com.google.android.gms.internal.ads.bti.m36699a(r2)
        L_0x0190:
            if (r26 <= 0) goto L_0x01a4
            int r2 = r1.mo30705i()
            if (r2 != 0) goto L_0x019a
            r2 = 1
            goto L_0x019b
        L_0x019a:
            r2 = 0
        L_0x019b:
            com.google.android.gms.internal.ads.bti.m36699a(r2)
            r1.mo30703g()
            int r26 = r26 + -1
            goto L_0x0190
        L_0x01a4:
            r10 = r5
            r13 = r6
            r11 = r7
            r14 = r8
            r12 = r15
            goto L_0x0242
        L_0x01ab:
            r31 = r3
            r35 = r4
            int r1 = r13.f43425a
            long[] r1 = new long[r1]
            int r2 = r13.f43425a
            int[] r2 = new int[r2]
        L_0x01b7:
            boolean r3 = r13.mo30542a()
            if (r3 == 0) goto L_0x01ca
            int r3 = r13.f43426b
            long r4 = r13.f43428d
            r1[r3] = r4
            int r3 = r13.f43426b
            int r4 = r13.f43427c
            r2[r3] = r4
            goto L_0x01b7
        L_0x01ca:
            int r3 = r35.mo30544b()
            long r4 = (long) r14
            r6 = 8192(0x2000, float:1.14794E-41)
            int r6 = r6 / r3
            int r7 = r2.length
            r8 = 0
            r9 = 0
        L_0x01d5:
            if (r8 >= r7) goto L_0x01e1
            r10 = r2[r8]
            int r10 = com.google.android.gms.internal.ads.btw.m36755a(r10, r6)
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L_0x01d5
        L_0x01e1:
            long[] r11 = new long[r9]
            int[] r12 = new int[r9]
            long[] r14 = new long[r9]
            int[] r15 = new int[r9]
            r7 = 0
            r8 = 0
            r9 = 0
            r13 = 0
        L_0x01ed:
            int r10 = r2.length
            if (r7 >= r10) goto L_0x0229
            r10 = r2[r7]
            r16 = r1[r7]
        L_0x01f4:
            if (r10 <= 0) goto L_0x0222
            int r22 = java.lang.Math.min(r6, r10)
            r11[r9] = r16
            int r23 = r3 * r22
            r12[r9] = r23
            r38 = r1
            r1 = r12[r9]
            int r13 = java.lang.Math.max(r13, r1)
            r39 = r2
            long r1 = (long) r8
            long r1 = r1 * r4
            r14[r9] = r1
            r1 = 1
            r15[r9] = r1
            r1 = r12[r9]
            long r1 = (long) r1
            long r16 = r16 + r1
            int r8 = r8 + r22
            int r10 = r10 - r22
            int r9 = r9 + 1
            r1 = r38
            r2 = r39
            goto L_0x01f4
        L_0x0222:
            r38 = r1
            r39 = r2
            int r7 = r7 + 1
            goto L_0x01ed
        L_0x0229:
            com.google.android.gms.internal.ads.bps r1 = new com.google.android.gms.internal.ads.bps
            r16 = 0
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15)
            long[] r5 = r1.f43449a
            int[] r7 = r1.f43450b
            int r2 = r1.f43451c
            long[] r6 = r1.f43452d
            int[] r8 = r1.f43453e
            r12 = r2
            r10 = r5
            r13 = r6
            r11 = r7
            r14 = r8
            r24 = r20
        L_0x0242:
            long[] r1 = r0.f43513h
            if (r1 == 0) goto L_0x0462
            boolean r1 = r53.mo30513a()
            if (r1 == 0) goto L_0x024e
            goto L_0x0462
        L_0x024e:
            long[] r1 = r0.f43513h
            int r1 = r1.length
            r4 = 1
            if (r1 != r4) goto L_0x02da
            int r1 = r0.f43507b
            if (r1 != r4) goto L_0x02da
            int r1 = r13.length
            r4 = 2
            if (r1 < r4) goto L_0x02da
            long[] r1 = r0.f43514i
            r4 = 0
            r5 = r1[r4]
            long[] r1 = r0.f43513h
            r32 = r1[r4]
            long r7 = r0.f43508c
            long r2 = r0.f43509d
            r34 = r7
            r36 = r2
            long r1 = com.google.android.gms.internal.ads.btw.m36758a(r32, r34, r36)
            long r1 = r1 + r5
            r7 = r13[r4]
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x02da
            r3 = 1
            r7 = r13[r3]
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x02da
            int r4 = r13.length
            int r4 = r4 - r3
            r3 = r13[r4]
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x02da
            int r3 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r3 > 0) goto L_0x02da
            long r32 = r24 - r1
            r1 = 0
            r2 = r13[r1]
            long r22 = r5 - r2
            com.google.android.gms.internal.ads.zzlg r1 = r0.f43511f
            int r1 = r1.f46263m
            long r1 = (long) r1
            long r3 = r0.f43508c
            r24 = r1
            r26 = r3
            long r1 = com.google.android.gms.internal.ads.btw.m36758a(r22, r24, r26)
            com.google.android.gms.internal.ads.zzlg r3 = r0.f43511f
            int r3 = r3.f46263m
            long r3 = (long) r3
            long r5 = r0.f43508c
            r34 = r3
            r36 = r5
            long r3 = com.google.android.gms.internal.ads.btw.m36758a(r32, r34, r36)
            int r5 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r5 != 0) goto L_0x02b8
            int r5 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r5 == 0) goto L_0x02da
        L_0x02b8:
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x02da
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x02da
            int r1 = (int) r1
            r2 = r53
            r2.f43200a = r1
            int r1 = (int) r3
            r2.f43201b = r1
            long r0 = r0.f43508c
            r2 = 1000000(0xf4240, double:4.940656E-318)
            com.google.android.gms.internal.ads.btw.m36761a(r13, r2, r0)
            com.google.android.gms.internal.ads.bqb r0 = new com.google.android.gms.internal.ads.bqb
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            return r0
        L_0x02da:
            long[] r1 = r0.f43513h
            int r1 = r1.length
            r2 = 1
            if (r1 != r2) goto L_0x030f
            long[] r1 = r0.f43513h
            r18 = 0
            r2 = r1[r18]
            int r1 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r1 != 0) goto L_0x030f
            r1 = 0
        L_0x02eb:
            int r2 = r13.length
            if (r1 >= r2) goto L_0x0308
            r2 = r13[r1]
            long[] r4 = r0.f43514i
            r5 = r4[r18]
            long r19 = r2 - r5
            r21 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r0.f43508c
            r23 = r2
            long r2 = com.google.android.gms.internal.ads.btw.m36758a(r19, r21, r23)
            r13[r1] = r2
            int r1 = r1 + 1
            r18 = 0
            goto L_0x02eb
        L_0x0308:
            com.google.android.gms.internal.ads.bqb r0 = new com.google.android.gms.internal.ads.bqb
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            return r0
        L_0x030f:
            int r1 = r0.f43507b
            r2 = 1
            if (r1 != r2) goto L_0x0316
            r1 = 1
            goto L_0x0317
        L_0x0316:
            r1 = 0
        L_0x0317:
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x031b:
            long[] r6 = r0.f43513h
            int r6 = r6.length
            r7 = -1
            if (r2 >= r6) goto L_0x0356
            long[] r6 = r0.f43514i
            r40 = r14
            r14 = r6[r2]
            int r6 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0351
            long[] r6 = r0.f43513h
            r22 = r6[r2]
            long r6 = r0.f43508c
            long r8 = r0.f43509d
            r24 = r6
            r26 = r8
            long r6 = com.google.android.gms.internal.ads.btw.m36758a(r22, r24, r26)
            r8 = 1
            int r9 = com.google.android.gms.internal.ads.btw.m36766b(r13, r14, r8, r8)
            long r14 = r14 + r6
            r6 = 0
            int r7 = com.google.android.gms.internal.ads.btw.m36766b(r13, r14, r1, r6)
            int r6 = r7 - r9
            int r4 = r4 + r6
            if (r5 == r9) goto L_0x034e
            r5 = 1
            goto L_0x034f
        L_0x034e:
            r5 = 0
        L_0x034f:
            r3 = r3 | r5
            r5 = r7
        L_0x0351:
            int r2 = r2 + 1
            r14 = r40
            goto L_0x031b
        L_0x0356:
            r40 = r14
            r2 = r31
            if (r4 == r2) goto L_0x035e
            r2 = 1
            goto L_0x035f
        L_0x035e:
            r2 = 0
        L_0x035f:
            r2 = r2 | r3
            if (r2 == 0) goto L_0x0365
            long[] r3 = new long[r4]
            goto L_0x0366
        L_0x0365:
            r3 = r10
        L_0x0366:
            if (r2 == 0) goto L_0x036b
            int[] r5 = new int[r4]
            goto L_0x036c
        L_0x036b:
            r5 = r11
        L_0x036c:
            if (r2 == 0) goto L_0x036f
            r12 = 0
        L_0x036f:
            if (r2 == 0) goto L_0x0374
            int[] r14 = new int[r4]
            goto L_0x0376
        L_0x0374:
            r14 = r40
        L_0x0376:
            long[] r4 = new long[r4]
            r25 = r12
            r15 = r20
            r6 = 0
            r9 = 0
        L_0x037e:
            long[] r12 = r0.f43513h
            int r12 = r12.length
            if (r6 >= r12) goto L_0x042e
            long[] r12 = r0.f43514i
            r7 = r12[r6]
            long[] r12 = r0.f43513h
            r32 = r12[r6]
            r34 = -1
            int r12 = (r7 > r34 ? 1 : (r7 == r34 ? 0 : -1))
            if (r12 == 0) goto L_0x040e
            r41 = r14
            r42 = r15
            long r14 = r0.f43508c
            r45 = r4
            r44 = r5
            long r4 = r0.f43509d
            r26 = r32
            r28 = r14
            r30 = r4
            long r4 = com.google.android.gms.internal.ads.btw.m36758a(r26, r28, r30)
            long r4 = r4 + r7
            r12 = 1
            int r14 = com.google.android.gms.internal.ads.btw.m36766b(r13, r7, r12, r12)
            r12 = 0
            int r4 = com.google.android.gms.internal.ads.btw.m36766b(r13, r4, r1, r12)
            if (r2 == 0) goto L_0x03c8
            int r5 = r4 - r14
            java.lang.System.arraycopy(r10, r14, r3, r9, r5)
            r15 = r44
            java.lang.System.arraycopy(r11, r14, r15, r9, r5)
            r46 = r1
            r1 = r40
            r12 = r41
            java.lang.System.arraycopy(r1, r14, r12, r9, r5)
            goto L_0x03d0
        L_0x03c8:
            r46 = r1
            r1 = r40
            r12 = r41
            r15 = r44
        L_0x03d0:
            r5 = r25
        L_0x03d2:
            if (r14 >= r4) goto L_0x0409
            r22 = 1000000(0xf4240, double:4.940656E-318)
            r47 = r3
            r48 = r4
            long r3 = r0.f43509d
            r20 = r42
            r24 = r3
            long r3 = com.google.android.gms.internal.ads.btw.m36758a(r20, r22, r24)
            r16 = r13[r14]
            long r20 = r16 - r7
            r49 = r7
            long r7 = r0.f43508c
            r24 = r7
            long r7 = com.google.android.gms.internal.ads.btw.m36758a(r20, r22, r24)
            long r3 = r3 + r7
            r45[r9] = r3
            if (r2 == 0) goto L_0x03fe
            r3 = r15[r9]
            if (r3 <= r5) goto L_0x03fe
            r5 = r11[r14]
        L_0x03fe:
            int r9 = r9 + 1
            int r14 = r14 + 1
            r3 = r47
            r4 = r48
            r7 = r49
            goto L_0x03d2
        L_0x0409:
            r47 = r3
            r25 = r5
            goto L_0x041a
        L_0x040e:
            r46 = r1
            r47 = r3
            r45 = r4
            r12 = r14
            r42 = r15
            r1 = r40
            r15 = r5
        L_0x041a:
            r3 = 0
            long r3 = r42 + r32
            int r6 = r6 + 1
            r40 = r1
            r14 = r12
            r5 = r15
            r7 = r34
            r1 = r46
            r15 = r3
            r4 = r45
            r3 = r47
            goto L_0x037e
        L_0x042e:
            r47 = r3
            r45 = r4
            r15 = r5
            r12 = r14
            r0 = 0
            r1 = 0
        L_0x0436:
            int r2 = r12.length
            if (r0 >= r2) goto L_0x0448
            if (r1 != 0) goto L_0x0448
            r2 = r12[r0]
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0443
            r2 = 1
            goto L_0x0444
        L_0x0443:
            r2 = 0
        L_0x0444:
            r1 = r1 | r2
            int r0 = r0 + 1
            goto L_0x0436
        L_0x0448:
            if (r1 == 0) goto L_0x045a
            com.google.android.gms.internal.ads.bqb r0 = new com.google.android.gms.internal.ads.bqb
            r22 = r0
            r23 = r47
            r24 = r15
            r26 = r45
            r27 = r12
            r22.<init>(r23, r24, r25, r26, r27)
            return r0
        L_0x045a:
            com.google.android.gms.internal.ads.bmk r0 = new com.google.android.gms.internal.ads.bmk
            java.lang.String r1 = "The edited sample sequence does not contain a sync sample."
            r0.<init>(r1)
            throw r0
        L_0x0462:
            r1 = r14
            long r2 = r0.f43508c
            r4 = 1000000(0xf4240, double:4.940656E-318)
            com.google.android.gms.internal.ads.btw.m36761a(r13, r4, r2)
            com.google.android.gms.internal.ads.bqb r0 = new com.google.android.gms.internal.ads.bqb
            r9 = r0
            r14 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            return r0
        L_0x0473:
            com.google.android.gms.internal.ads.bmk r0 = new com.google.android.gms.internal.ads.bmk
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bpk.m36400a(com.google.android.gms.internal.ads.bpy, com.google.android.gms.internal.ads.bpi, com.google.android.gms.internal.ads.boo):com.google.android.gms.internal.ads.bqb");
    }

    /* renamed from: a */
    public static zzpn m36401a(bpj bpj, boolean z) {
        if (z) {
            return null;
        }
        btr btr = bpj.f43416az;
        btr.mo30697c(8);
        while (btr.mo30694b() >= 8) {
            int i = btr.f43868b;
            int g = btr.mo30703g();
            if (btr.mo30703g() == bph.f43373al) {
                btr.mo30697c(i);
                int i2 = i + g;
                btr.mo30699d(12);
                while (true) {
                    if (btr.f43868b >= i2) {
                        break;
                    }
                    int i3 = btr.f43868b;
                    int g2 = btr.mo30703g();
                    if (btr.mo30703g() == bph.f43374am) {
                        btr.mo30697c(i3);
                        int i4 = i3 + g2;
                        btr.mo30699d(8);
                        ArrayList arrayList = new ArrayList();
                        while (btr.f43868b < i4) {
                            zza a = bpt.m36413a(btr);
                            if (a != null) {
                                arrayList.add(a);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new zzpn((List<? extends zza>) arrayList);
                        }
                    } else {
                        btr.mo30699d(g2 - 8);
                    }
                }
                return null;
            }
            btr.mo30699d(g - 8);
        }
        return null;
    }

    /* renamed from: a */
    private static Pair<String, byte[]> m36398a(btr btr, int i) {
        btr.mo30697c(i + 8 + 4);
        btr.mo30699d(1);
        m36396a(btr);
        btr.mo30699d(2);
        int d = btr.mo30698d();
        if ((d & 128) != 0) {
            btr.mo30699d(2);
        }
        if ((d & 64) != 0) {
            btr.mo30699d(btr.mo30700e());
        }
        if ((d & 32) != 0) {
            btr.mo30699d(2);
        }
        btr.mo30699d(1);
        m36396a(btr);
        String str = null;
        switch (btr.mo30698d()) {
            case 32:
                str = "video/mp4v-es";
                break;
            case 33:
                str = "video/avc";
                break;
            case MessageCenter.MSG_TYPE_FACE_VERIFY /*35*/:
                str = "video/hevc";
                break;
            case UnReadVideoExperiment.RELATION_LIST /*64*/:
            case 102:
            case 103:
            case 104:
                str = "audio/mp4a-latm";
                break;
            case 107:
                return Pair.create("audio/mpeg", null);
            case 165:
                str = "audio/ac3";
                break;
            case 166:
                str = "audio/eac3";
                break;
            case 169:
            case 172:
                return Pair.create("audio/vnd.dts", null);
            case 170:
            case 171:
                return Pair.create("audio/vnd.dts.hd", null);
        }
        btr.mo30699d(12);
        btr.mo30699d(1);
        int a = m36396a(btr);
        byte[] bArr = new byte[a];
        btr.mo30693a(bArr, 0, a);
        return Pair.create(str, bArr);
    }

    /* renamed from: a */
    private static int m36397a(btr btr, int i, int i2, bpn bpn, int i3) {
        Object obj;
        btr btr2 = btr;
        int i4 = btr2.f43868b;
        while (true) {
            boolean z = false;
            if (i4 - i >= i2) {
                return 0;
            }
            btr2.mo30697c(i4);
            int g = btr.mo30703g();
            bti.m36700a(g > 0, "childAtomSize should be positive");
            if (btr.mo30703g() == bph.f43331M) {
                int i5 = i4 + 8;
                Pair pair = null;
                Object obj2 = null;
                Object obj3 = null;
                boolean z2 = false;
                while (i5 - i4 < g) {
                    btr2.mo30697c(i5);
                    int g2 = btr.mo30703g();
                    int g3 = btr.mo30703g();
                    if (g3 == bph.f43337S) {
                        obj2 = Integer.valueOf(btr.mo30703g());
                    } else if (g3 == bph.f43332N) {
                        btr2.mo30699d(4);
                        z2 = btr.mo30703g() == f43423g;
                    } else if (g3 == bph.f43333O) {
                        int i6 = i5 + 8;
                        while (true) {
                            if (i6 - i5 >= g2) {
                                obj = null;
                                break;
                            }
                            btr2.mo30697c(i6);
                            int g4 = btr.mo30703g();
                            if (btr.mo30703g() == bph.f43334P) {
                                btr2.mo30699d(6);
                                boolean z3 = btr.mo30698d() == 1;
                                int d = btr.mo30698d();
                                byte[] bArr = new byte[16];
                                btr2.mo30693a(bArr, 0, 16);
                                obj = new bqa(z3, d, bArr);
                            } else {
                                i6 += g4;
                            }
                        }
                        obj3 = obj;
                    }
                    i5 += g2;
                }
                if (z2) {
                    bti.m36700a(obj2 != null, "frma atom is mandatory");
                    if (obj3 != null) {
                        z = true;
                    }
                    bti.m36700a(z, "schi->tenc atom is mandatory");
                    pair = Pair.create(obj2, obj3);
                }
                if (pair != null) {
                    bpn.f43434a[i3] = (bqa) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            bpn bpn2 = bpn;
            i4 += g;
        }
    }

    /* renamed from: a */
    private static int m36396a(btr btr) {
        int d = btr.mo30698d();
        int i = d & 127;
        while ((d & 128) == 128) {
            d = btr.mo30698d();
            i = (i << 7) | (d & 127);
        }
        return i;
    }
}
