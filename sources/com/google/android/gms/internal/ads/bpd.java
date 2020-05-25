package com.google.android.gms.internal.ads;

import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import java.io.IOException;
import java.util.Arrays;

final class bpd implements bpa {

    /* renamed from: a */
    private final /* synthetic */ bpb f43270a;

    private bpd(bpb bpb) {
        this.f43270a = bpb;
    }

    /* renamed from: a */
    public final int mo30524a(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public final boolean mo30530b(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    /* renamed from: a */
    public final void mo30528a(int i, long j, long j2) throws bmk {
        bpb bpb = this.f43270a;
        if (i == 160) {
            bpb.f43222D = false;
        } else if (i == 174) {
            bpb.f43254k = new bpe(null);
        } else if (i == 187) {
            bpb.f43263t = false;
        } else if (i == 19899) {
            bpb.f43256m = -1;
            bpb.f43257n = -1;
        } else if (i != 20533) {
            if (i == 21968) {
                bpb.f43254k.f43303q = true;
            } else if (i == 25152) {
            } else {
                if (i != 408125543) {
                    if (i == 475249515) {
                        bpb.f43261r = new btl();
                        bpb.f43262s = new btl();
                    } else if (i == 524531317 && !bpb.f43255l) {
                        if (!bpb.f43246c || bpb.f43259p == -1) {
                            bpb.f43223E.mo30512a(new bos(bpb.f43253j));
                            bpb.f43255l = true;
                            return;
                        }
                        bpb.f43258o = true;
                    }
                } else if (bpb.f43250g == -1 || bpb.f43250g == j) {
                    bpb.f43250g = j;
                    bpb.f43249f = j2;
                } else {
                    throw new bmk("Multiple Segment elements not supported");
                }
            }
        } else {
            bpb.f43254k.f43291e = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:232:0x03ee, code lost:
        r41 = null;
        r23 = r11;
        r20 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x044d, code lost:
        r41 = null;
        r20 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x045b, code lost:
        r41 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x04f2, code lost:
        r41 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x050e, code lost:
        r41 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0510, code lost:
        r20 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0512, code lost:
        r23 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0514, code lost:
        r11 = r1.f43283M | false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0519, code lost:
        if (r1.f43282L == false) goto L_0x051d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x051b, code lost:
        r12 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x051d, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x051e, code lost:
        r11 = r11 | r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0523, code lost:
        if (com.google.android.gms.internal.ads.btn.m36714a(r10) == false) goto L_0x054b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0525, code lost:
        r5 = com.google.android.gms.internal.ads.zzlg.m39282a(java.lang.Integer.toString(r9), r10, null, -1, r20, r1.f43277G, r1.f43279I, r23, r41, r1.f43295i, r11 ? 1 : 0, r1.f43284N);
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x054f, code lost:
        if (com.google.android.gms.internal.ads.btn.m36715b(r10) == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0553, code lost:
        if (r1.f43300n != 0) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0557, code lost:
        if (r1.f43298l != -1) goto L_0x055c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0559, code lost:
        r6 = r1.f43296j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x055c, code lost:
        r6 = r1.f43298l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x055e, code lost:
        r1.f43298l = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0562, code lost:
        if (r1.f43299m != -1) goto L_0x0567;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0564, code lost:
        r6 = r1.f43297k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0567, code lost:
        r6 = r1.f43299m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0569, code lost:
        r1.f43299m = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x056f, code lost:
        if (r1.f43298l == -1) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0573, code lost:
        if (r1.f43299m == -1) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0575, code lost:
        r26 = ((float) (r1.f43297k * r1.f43298l)) / ((float) (r1.f43296j * r1.f43299m));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0587, code lost:
        r26 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x058b, code lost:
        if (r1.f43303q == false) goto L_0x0657;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0591, code lost:
        if (r1.f43309w == -1.0f) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0597, code lost:
        if (r1.f43310x == -1.0f) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x059d, code lost:
        if (r1.f43311y == -1.0f) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x05a3, code lost:
        if (r1.f43312z == -1.0f) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x05a9, code lost:
        if (r1.f43271A == -1.0f) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x05af, code lost:
        if (r1.f43272B == -1.0f) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x05b5, code lost:
        if (r1.f43273C == -1.0f) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x05bb, code lost:
        if (r1.f43274D == -1.0f) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x05c1, code lost:
        if (r1.f43275E == -1.0f) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x05c7, code lost:
        if (r1.f43276F != -1.0f) goto L_0x05cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x05cb, code lost:
        r6 = new byte[25];
        r8 = java.nio.ByteBuffer.wrap(r6);
        r8.put(0);
        r8.putShort((short) ((int) ((r1.f43309w * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r1.f43310x * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r1.f43311y * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r1.f43312z * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r1.f43271A * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r1.f43272B * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r1.f43273C * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r1.f43274D * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) (r1.f43275E + 0.5f)));
        r8.putShort((short) ((int) (r1.f43276F + 0.5f)));
        r8.putShort((short) r1.f43307u);
        r8.putShort((short) r1.f43308v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0648, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0649, code lost:
        r29 = new com.google.android.gms.internal.ads.zzta(r1.f43304r, r1.f43306t, r1.f43305s, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0657, code lost:
        r29 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0659, code lost:
        r5 = com.google.android.gms.internal.ads.zzlg.m39281a(java.lang.Integer.toString(r9), r10, null, -1, r20, r1.f43296j, r1.f43297k, -1.0f, r41, -1, r26, r1.f43301o, r1.f43302p, r29, r1.f43295i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0689, code lost:
        if ("application/x-subrip".equals(r10) == false) goto L_0x06b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x068b, code lost:
        r4 = com.google.android.gms.internal.ads.zzlg.m39284a(java.lang.Integer.toString(r9), r10, null, -1, r11 ? 1 : 0, r1.f43284N, -1, r1.f43295i, Long.MAX_VALUE, java.util.Collections.emptyList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x06ae, code lost:
        r5 = r4;
        r4 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x06b7, code lost:
        if ("application/vobsub".equals(r10) != false) goto L_0x06d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x06bf, code lost:
        if ("application/pgs".equals(r10) != false) goto L_0x06d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x06c7, code lost:
        if ("application/dvbsubs".equals(r10) == false) goto L_0x06ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x06d1, code lost:
        throw new com.google.android.gms.internal.ads.bmk("Unexpected MIME type.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x06d2, code lost:
        r16 = new com.google.android.gms.internal.ads.zzlg(java.lang.Integer.toString(r9), null, r10, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, r1.f43284N, -1, Long.MAX_VALUE, r41, r1.f43295i, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0715, code lost:
        r1.f43285O = r3.mo30510a(r1.f43288b, r4);
        r1.f43285O.mo30518a(r5);
        r2.f43245b.put(r2.f43254k.f43288b, r2.f43254k);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30531c(int r45) throws com.google.android.gms.internal.ads.bmk {
        /*
            r44 = this;
            r0 = r44
            r1 = r45
            com.google.android.gms.internal.ads.bpb r2 = r0.f43270a
            r3 = 160(0xa0, float:2.24E-43)
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == r3) goto L_0x0730
            r3 = 174(0xae, float:2.44E-43)
            r7 = 0
            r8 = -1
            if (r1 == r3) goto L_0x015e
            r3 = 19899(0x4dbb, float:2.7884E-41)
            r9 = -1
            r4 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r1 == r3) goto L_0x0143
            r3 = 25152(0x6240, float:3.5245E-41)
            if (r1 == r3) goto L_0x0112
            r3 = 28032(0x6d80, float:3.9281E-41)
            if (r1 == r3) goto L_0x00fc
            r3 = 357149030(0x1549a966, float:4.072526E-26)
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == r3) goto L_0x00e2
            r3 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r1 == r3) goto L_0x00cb
            if (r1 == r4) goto L_0x0037
            goto L_0x074f
        L_0x0037:
            boolean r1 = r2.f43255l
            if (r1 != 0) goto L_0x074f
            com.google.android.gms.internal.ads.bom r1 = r2.f43223E
            long r3 = r2.f43250g
            int r8 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x00ba
            long r3 = r2.f43253j
            int r8 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x00ba
            com.google.android.gms.internal.ads.btl r3 = r2.f43261r
            if (r3 == 0) goto L_0x00ba
            com.google.android.gms.internal.ads.btl r3 = r2.f43261r
            int r3 = r3.f43847a
            if (r3 == 0) goto L_0x00ba
            com.google.android.gms.internal.ads.btl r3 = r2.f43262s
            if (r3 == 0) goto L_0x00ba
            com.google.android.gms.internal.ads.btl r3 = r2.f43262s
            int r3 = r3.f43847a
            com.google.android.gms.internal.ads.btl r4 = r2.f43261r
            int r4 = r4.f43847a
            if (r3 == r4) goto L_0x0062
            goto L_0x00ba
        L_0x0062:
            com.google.android.gms.internal.ads.btl r3 = r2.f43261r
            int r3 = r3.f43847a
            int[] r4 = new int[r3]
            long[] r8 = new long[r3]
            long[] r9 = new long[r3]
            long[] r10 = new long[r3]
            r11 = 0
        L_0x006f:
            if (r11 >= r3) goto L_0x0087
            com.google.android.gms.internal.ads.btl r12 = r2.f43261r
            long r12 = r12.mo30687a(r11)
            r10[r11] = r12
            long r12 = r2.f43250g
            com.google.android.gms.internal.ads.btl r14 = r2.f43262s
            long r14 = r14.mo30687a(r11)
            long r12 = r12 + r14
            r8[r11] = r12
            int r11 = r11 + 1
            goto L_0x006f
        L_0x0087:
            int r11 = r3 + -1
            if (r5 >= r11) goto L_0x009e
            int r11 = r5 + 1
            r12 = r8[r11]
            r14 = r8[r5]
            long r12 = r12 - r14
            int r12 = (int) r12
            r4[r5] = r12
            r12 = r10[r11]
            r14 = r10[r5]
            long r12 = r12 - r14
            r9[r5] = r12
            r5 = r11
            goto L_0x0087
        L_0x009e:
            long r12 = r2.f43250g
            long r14 = r2.f43249f
            long r12 = r12 + r14
            r14 = r8[r11]
            long r12 = r12 - r14
            int r3 = (int) r12
            r4[r11] = r3
            long r12 = r2.f43253j
            r14 = r10[r11]
            long r12 = r12 - r14
            r9[r11] = r12
            r2.f43261r = r7
            r2.f43262s = r7
            com.google.android.gms.internal.ads.boi r3 = new com.google.android.gms.internal.ads.boi
            r3.<init>(r4, r8, r9, r10)
            goto L_0x00c5
        L_0x00ba:
            r2.f43261r = r7
            r2.f43262s = r7
            com.google.android.gms.internal.ads.bos r3 = new com.google.android.gms.internal.ads.bos
            long r4 = r2.f43253j
            r3.<init>(r4)
        L_0x00c5:
            r1.mo30512a(r3)
            r2.f43255l = r6
            return
        L_0x00cb:
            android.util.SparseArray<com.google.android.gms.internal.ads.bpe> r1 = r2.f43245b
            int r1 = r1.size()
            if (r1 == 0) goto L_0x00da
            com.google.android.gms.internal.ads.bom r1 = r2.f43223E
            r1.mo30511a()
            goto L_0x074f
        L_0x00da:
            com.google.android.gms.internal.ads.bmk r1 = new com.google.android.gms.internal.ads.bmk
            java.lang.String r2 = "No valid tracks were found"
            r1.<init>(r2)
            throw r1
        L_0x00e2:
            long r3 = r2.f43251h
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x00ed
            r3 = 1000000(0xf4240, double:4.940656E-318)
            r2.f43251h = r3
        L_0x00ed:
            long r3 = r2.f43252i
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 == 0) goto L_0x074f
            long r3 = r2.f43252i
            long r3 = r2.mo30532a(r3)
            r2.f43253j = r3
            return
        L_0x00fc:
            com.google.android.gms.internal.ads.bpe r1 = r2.f43254k
            boolean r1 = r1.f43291e
            if (r1 == 0) goto L_0x074f
            com.google.android.gms.internal.ads.bpe r1 = r2.f43254k
            byte[] r1 = r1.f43292f
            if (r1 != 0) goto L_0x010a
            goto L_0x074f
        L_0x010a:
            com.google.android.gms.internal.ads.bmk r1 = new com.google.android.gms.internal.ads.bmk
            java.lang.String r2 = "Combining encryption and compression is not supported"
            r1.<init>(r2)
            throw r1
        L_0x0112:
            com.google.android.gms.internal.ads.bpe r1 = r2.f43254k
            boolean r1 = r1.f43291e
            if (r1 == 0) goto L_0x074f
            com.google.android.gms.internal.ads.bpe r1 = r2.f43254k
            com.google.android.gms.internal.ads.bou r1 = r1.f43293g
            if (r1 == 0) goto L_0x013b
            com.google.android.gms.internal.ads.bpe r1 = r2.f43254k
            com.google.android.gms.internal.ads.zznd r3 = new com.google.android.gms.internal.ads.zznd
            com.google.android.gms.internal.ads.zznd$zza[] r4 = new com.google.android.gms.internal.ads.zznd.zza[r6]
            com.google.android.gms.internal.ads.zznd$zza r6 = new com.google.android.gms.internal.ads.zznd$zza
            java.util.UUID r7 = com.google.android.gms.internal.ads.bls.f42867b
            java.lang.String r8 = "video/webm"
            com.google.android.gms.internal.ads.bpe r2 = r2.f43254k
            com.google.android.gms.internal.ads.bou r2 = r2.f43293g
            byte[] r2 = r2.f43205b
            r6.<init>(r7, r8, r2)
            r4[r5] = r6
            r3.<init>(r4)
            r1.f43295i = r3
            return
        L_0x013b:
            com.google.android.gms.internal.ads.bmk r1 = new com.google.android.gms.internal.ads.bmk
            java.lang.String r2 = "Encrypted Track found but ContentEncKeyID was not found"
            r1.<init>(r2)
            throw r1
        L_0x0143:
            int r1 = r2.f43256m
            if (r1 == r8) goto L_0x0156
            long r5 = r2.f43257n
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x0156
            int r1 = r2.f43256m
            if (r1 != r4) goto L_0x074f
            long r3 = r2.f43257n
            r2.f43259p = r3
            return
        L_0x0156:
            com.google.android.gms.internal.ads.bmk r1 = new com.google.android.gms.internal.ads.bmk
            java.lang.String r2 = "Mandatory element SeekID or SeekPosition not found"
            r1.<init>(r2)
            throw r1
        L_0x015e:
            com.google.android.gms.internal.ads.bpe r1 = r2.f43254k
            java.lang.String r1 = r1.f43287a
            java.lang.String r3 = "V_VP8"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "V_VP9"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "V_MPEG2"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "V_MPEG4/ISO/SP"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "V_MPEG4/ISO/ASP"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "V_MPEG4/ISO/AP"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "V_MPEG4/ISO/AVC"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "V_MPEGH/ISO/HEVC"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "V_MS/VFW/FOURCC"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "V_THEORA"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "A_OPUS"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "A_VORBIS"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "A_AAC"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "A_MPEG/L2"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "A_MPEG/L3"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "A_AC3"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "A_EAC3"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "A_TRUEHD"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "A_DTS"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "A_DTS/EXPRESS"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "A_DTS/LOSSLESS"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "A_FLAC"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "A_MS/ACM"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "A_PCM/INT/LIT"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "S_TEXT/UTF8"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "S_VOBSUB"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "S_HDMV/PGS"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "S_DVBSUB"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0243
            goto L_0x0245
        L_0x0243:
            r1 = 0
            goto L_0x0246
        L_0x0245:
            r1 = 1
        L_0x0246:
            if (r1 == 0) goto L_0x072d
            com.google.android.gms.internal.ads.bpe r1 = r2.f43254k
            com.google.android.gms.internal.ads.bom r3 = r2.f43223E
            com.google.android.gms.internal.ads.bpe r9 = r2.f43254k
            int r9 = r9.f43288b
            java.lang.String r10 = r1.f43287a
            int r11 = r10.hashCode()
            r12 = 4
            r13 = 8
            r14 = 3
            switch(r11) {
                case -2095576542: goto L_0x0394;
                case -2095575984: goto L_0x038a;
                case -1985379776: goto L_0x037f;
                case -1784763192: goto L_0x0374;
                case -1730367663: goto L_0x0369;
                case -1482641358: goto L_0x035e;
                case -1482641357: goto L_0x0353;
                case -1373388978: goto L_0x0348;
                case -933872740: goto L_0x033d;
                case -538363189: goto L_0x0332;
                case -538363109: goto L_0x0327;
                case -425012669: goto L_0x031b;
                case -356037306: goto L_0x030f;
                case 62923557: goto L_0x0303;
                case 62923603: goto L_0x02f7;
                case 62927045: goto L_0x02eb;
                case 82338133: goto L_0x02e0;
                case 82338134: goto L_0x02d5;
                case 99146302: goto L_0x02c9;
                case 444813526: goto L_0x02bd;
                case 542569478: goto L_0x02b1;
                case 725957860: goto L_0x02a5;
                case 855502857: goto L_0x029a;
                case 1422270023: goto L_0x028e;
                case 1809237540: goto L_0x0283;
                case 1950749482: goto L_0x0277;
                case 1950789798: goto L_0x026b;
                case 1951062397: goto L_0x025f;
                default: goto L_0x025d;
            }
        L_0x025d:
            goto L_0x039e
        L_0x025f:
            java.lang.String r11 = "A_OPUS"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 11
            goto L_0x039f
        L_0x026b:
            java.lang.String r11 = "A_FLAC"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 21
            goto L_0x039f
        L_0x0277:
            java.lang.String r11 = "A_EAC3"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 16
            goto L_0x039f
        L_0x0283:
            java.lang.String r11 = "V_MPEG2"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 2
            goto L_0x039f
        L_0x028e:
            java.lang.String r11 = "S_TEXT/UTF8"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 24
            goto L_0x039f
        L_0x029a:
            java.lang.String r11 = "V_MPEGH/ISO/HEVC"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 7
            goto L_0x039f
        L_0x02a5:
            java.lang.String r11 = "A_PCM/INT/LIT"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 23
            goto L_0x039f
        L_0x02b1:
            java.lang.String r11 = "A_DTS/EXPRESS"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 19
            goto L_0x039f
        L_0x02bd:
            java.lang.String r11 = "V_THEORA"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 9
            goto L_0x039f
        L_0x02c9:
            java.lang.String r11 = "S_HDMV/PGS"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 26
            goto L_0x039f
        L_0x02d5:
            java.lang.String r11 = "V_VP9"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 1
            goto L_0x039f
        L_0x02e0:
            java.lang.String r11 = "V_VP8"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 0
            goto L_0x039f
        L_0x02eb:
            java.lang.String r11 = "A_DTS"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 18
            goto L_0x039f
        L_0x02f7:
            java.lang.String r11 = "A_AC3"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 15
            goto L_0x039f
        L_0x0303:
            java.lang.String r11 = "A_AAC"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 12
            goto L_0x039f
        L_0x030f:
            java.lang.String r11 = "A_DTS/LOSSLESS"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 20
            goto L_0x039f
        L_0x031b:
            java.lang.String r11 = "S_VOBSUB"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 25
            goto L_0x039f
        L_0x0327:
            java.lang.String r11 = "V_MPEG4/ISO/AVC"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 6
            goto L_0x039f
        L_0x0332:
            java.lang.String r11 = "V_MPEG4/ISO/ASP"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 4
            goto L_0x039f
        L_0x033d:
            java.lang.String r11 = "S_DVBSUB"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 27
            goto L_0x039f
        L_0x0348:
            java.lang.String r11 = "V_MS/VFW/FOURCC"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 8
            goto L_0x039f
        L_0x0353:
            java.lang.String r11 = "A_MPEG/L3"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 14
            goto L_0x039f
        L_0x035e:
            java.lang.String r11 = "A_MPEG/L2"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 13
            goto L_0x039f
        L_0x0369:
            java.lang.String r11 = "A_VORBIS"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 10
            goto L_0x039f
        L_0x0374:
            java.lang.String r11 = "A_TRUEHD"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 17
            goto L_0x039f
        L_0x037f:
            java.lang.String r11 = "A_MS/ACM"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 22
            goto L_0x039f
        L_0x038a:
            java.lang.String r11 = "V_MPEG4/ISO/SP"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 3
            goto L_0x039f
        L_0x0394:
            java.lang.String r11 = "V_MPEG4/ISO/AP"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039e
            r10 = 5
            goto L_0x039f
        L_0x039e:
            r10 = -1
        L_0x039f:
            r11 = 4096(0x1000, float:5.74E-42)
            switch(r10) {
                case 0: goto L_0x050c;
                case 1: goto L_0x0509;
                case 2: goto L_0x0506;
                case 3: goto L_0x04f5;
                case 4: goto L_0x04f5;
                case 5: goto L_0x04f5;
                case 6: goto L_0x04df;
                case 7: goto L_0x04cb;
                case 8: goto L_0x04b5;
                case 9: goto L_0x04b2;
                case 10: goto L_0x04a3;
                case 11: goto L_0x045f;
                case 12: goto L_0x0453;
                case 13: goto L_0x044b;
                case 14: goto L_0x0448;
                case 15: goto L_0x0444;
                case 16: goto L_0x0440;
                case 17: goto L_0x043c;
                case 18: goto L_0x0438;
                case 19: goto L_0x0438;
                case 20: goto L_0x0434;
                case 21: goto L_0x042b;
                case 22: goto L_0x03f6;
                case 23: goto L_0x03e0;
                case 24: goto L_0x03dc;
                case 25: goto L_0x03d2;
                case 26: goto L_0x03ce;
                case 27: goto L_0x03ac;
                default: goto L_0x03a4;
            }
        L_0x03a4:
            com.google.android.gms.internal.ads.bmk r1 = new com.google.android.gms.internal.ads.bmk
            java.lang.String r2 = "Unrecognized codec identifier."
            r1.<init>(r2)
            throw r1
        L_0x03ac:
            java.lang.String r10 = "application/dvbsubs"
            byte[] r11 = new byte[r12]
            byte[] r12 = r1.f43294h
            byte r12 = r12[r5]
            r11[r5] = r12
            byte[] r12 = r1.f43294h
            byte r12 = r12[r6]
            r11[r6] = r12
            byte[] r12 = r1.f43294h
            byte r12 = r12[r4]
            r11[r4] = r12
            byte[] r12 = r1.f43294h
            byte r12 = r12[r14]
            r11[r14] = r12
            java.util.List r11 = java.util.Collections.singletonList(r11)
            goto L_0x045b
        L_0x03ce:
            java.lang.String r10 = "application/pgs"
            goto L_0x050e
        L_0x03d2:
            java.lang.String r10 = "application/vobsub"
            byte[] r11 = r1.f43294h
            java.util.List r11 = java.util.Collections.singletonList(r11)
            goto L_0x045b
        L_0x03dc:
            java.lang.String r10 = "application/x-subrip"
            goto L_0x050e
        L_0x03e0:
            java.lang.String r10 = "audio/raw"
            int r11 = r1.f43278H
            int r11 = com.google.android.gms.internal.ads.btw.m36754a(r11)
            if (r11 != 0) goto L_0x03ee
            java.lang.String r10 = "audio/x-unknown"
            goto L_0x050e
        L_0x03ee:
            r41 = r7
            r23 = r11
            r20 = -1
            goto L_0x0514
        L_0x03f6:
            java.lang.String r10 = "audio/raw"
            com.google.android.gms.internal.ads.btr r11 = new com.google.android.gms.internal.ads.btr
            byte[] r12 = r1.f43294h
            r11.<init>(r12)
            boolean r11 = com.google.android.gms.internal.ads.bpe.m36386b(r11)
            if (r11 == 0) goto L_0x0411
            int r11 = r1.f43278H
            int r11 = com.google.android.gms.internal.ads.btw.m36754a(r11)
            if (r11 != 0) goto L_0x03ee
            java.lang.String r10 = "audio/x-unknown"
            goto L_0x050e
        L_0x0411:
            java.lang.String r10 = "audio/x-unknown"
            java.lang.String r11 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
            java.lang.String r12 = java.lang.String.valueOf(r10)
            int r13 = r12.length()
            if (r13 == 0) goto L_0x0424
            r11.concat(r12)
            goto L_0x050e
        L_0x0424:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r11)
            goto L_0x050e
        L_0x042b:
            java.lang.String r10 = "audio/x-flac"
            byte[] r11 = r1.f43294h
            java.util.List r11 = java.util.Collections.singletonList(r11)
            goto L_0x045b
        L_0x0434:
            java.lang.String r10 = "audio/vnd.dts.hd"
            goto L_0x050e
        L_0x0438:
            java.lang.String r10 = "audio/vnd.dts"
            goto L_0x050e
        L_0x043c:
            java.lang.String r10 = "audio/true-hd"
            goto L_0x050e
        L_0x0440:
            java.lang.String r10 = "audio/eac3"
            goto L_0x050e
        L_0x0444:
            java.lang.String r10 = "audio/ac3"
            goto L_0x050e
        L_0x0448:
            java.lang.String r10 = "audio/mpeg"
            goto L_0x044d
        L_0x044b:
            java.lang.String r10 = "audio/mpeg-L2"
        L_0x044d:
            r41 = r7
            r20 = 4096(0x1000, float:5.74E-42)
            goto L_0x0512
        L_0x0453:
            java.lang.String r10 = "audio/mp4a-latm"
            byte[] r11 = r1.f43294h
            java.util.List r11 = java.util.Collections.singletonList(r11)
        L_0x045b:
            r41 = r11
            goto L_0x0510
        L_0x045f:
            java.lang.String r10 = "audio/opus"
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r14)
            byte[] r15 = r1.f43294h
            r12.add(r15)
            java.nio.ByteBuffer r15 = java.nio.ByteBuffer.allocate(r13)
            java.nio.ByteOrder r11 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r11 = r15.order(r11)
            long r14 = r1.f43280J
            java.nio.ByteBuffer r11 = r11.putLong(r14)
            byte[] r11 = r11.array()
            r12.add(r11)
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r13)
            java.nio.ByteOrder r13 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r11 = r11.order(r13)
            long r13 = r1.f43281K
            java.nio.ByteBuffer r11 = r11.putLong(r13)
            byte[] r11 = r11.array()
            r12.add(r11)
            r41 = r12
            r20 = 5760(0x1680, float:8.071E-42)
            goto L_0x0512
        L_0x04a3:
            java.lang.String r10 = "audio/vorbis"
            r11 = 8192(0x2000, float:1.14794E-41)
            byte[] r12 = r1.f43294h
            java.util.List r12 = com.google.android.gms.internal.ads.bpe.m36385a(r12)
            r41 = r12
            r20 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0512
        L_0x04b2:
            java.lang.String r10 = "video/x-unknown"
            goto L_0x050e
        L_0x04b5:
            com.google.android.gms.internal.ads.btr r10 = new com.google.android.gms.internal.ads.btr
            byte[] r11 = r1.f43294h
            r10.<init>(r11)
            java.util.List r10 = com.google.android.gms.internal.ads.bpe.m36384a(r10)
            if (r10 == 0) goto L_0x04c8
            java.lang.String r11 = "video/wvc1"
        L_0x04c4:
            r41 = r10
            r10 = r11
            goto L_0x0510
        L_0x04c8:
            java.lang.String r11 = "video/x-unknown"
            goto L_0x04c4
        L_0x04cb:
            java.lang.String r10 = "video/hevc"
            com.google.android.gms.internal.ads.btr r11 = new com.google.android.gms.internal.ads.btr
            byte[] r12 = r1.f43294h
            r11.<init>(r12)
            com.google.android.gms.internal.ads.bud r11 = com.google.android.gms.internal.ads.bud.m36774a(r11)
            java.util.List<byte[]> r12 = r11.f43907a
            int r11 = r11.f43908b
            r1.f43286P = r11
            goto L_0x04f2
        L_0x04df:
            java.lang.String r10 = "video/avc"
            com.google.android.gms.internal.ads.btr r11 = new com.google.android.gms.internal.ads.btr
            byte[] r12 = r1.f43294h
            r11.<init>(r12)
            com.google.android.gms.internal.ads.bty r11 = com.google.android.gms.internal.ads.bty.m36767a(r11)
            java.util.List<byte[]> r12 = r11.f43888a
            int r11 = r11.f43889b
            r1.f43286P = r11
        L_0x04f2:
            r41 = r12
            goto L_0x0510
        L_0x04f5:
            java.lang.String r10 = "video/mp4v-es"
            byte[] r11 = r1.f43294h
            if (r11 != 0) goto L_0x04fe
            r11 = r7
            goto L_0x045b
        L_0x04fe:
            byte[] r11 = r1.f43294h
            java.util.List r11 = java.util.Collections.singletonList(r11)
            goto L_0x045b
        L_0x0506:
            java.lang.String r10 = "video/mpeg2"
            goto L_0x050e
        L_0x0509:
            java.lang.String r10 = "video/x-vnd.on2.vp9"
            goto L_0x050e
        L_0x050c:
            java.lang.String r10 = "video/x-vnd.on2.vp8"
        L_0x050e:
            r41 = r7
        L_0x0510:
            r20 = -1
        L_0x0512:
            r23 = -1
        L_0x0514:
            boolean r11 = r1.f43283M
            r11 = r11 | r5
            boolean r12 = r1.f43282L
            if (r12 == 0) goto L_0x051d
            r12 = 2
            goto L_0x051e
        L_0x051d:
            r12 = 0
        L_0x051e:
            r11 = r11 | r12
            boolean r12 = com.google.android.gms.internal.ads.btn.m36714a(r10)
            if (r12 == 0) goto L_0x054b
            java.lang.String r16 = java.lang.Integer.toString(r9)
            r18 = 0
            r19 = -1
            int r4 = r1.f43277G
            int r5 = r1.f43279I
            com.google.android.gms.internal.ads.zznd r8 = r1.f43295i
            java.lang.String r9 = r1.f43284N
            r17 = r10
            r21 = r4
            r22 = r5
            r24 = r41
            r25 = r8
            r26 = r11
            r27 = r9
            com.google.android.gms.internal.ads.zzlg r4 = com.google.android.gms.internal.ads.zzlg.m39282a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r5 = r4
            r4 = 1
            goto L_0x0715
        L_0x054b:
            boolean r6 = com.google.android.gms.internal.ads.btn.m36715b(r10)
            if (r6 == 0) goto L_0x0683
            int r6 = r1.f43300n
            if (r6 != 0) goto L_0x056b
            int r6 = r1.f43298l
            if (r6 != r8) goto L_0x055c
            int r6 = r1.f43296j
            goto L_0x055e
        L_0x055c:
            int r6 = r1.f43298l
        L_0x055e:
            r1.f43298l = r6
            int r6 = r1.f43299m
            if (r6 != r8) goto L_0x0567
            int r6 = r1.f43297k
            goto L_0x0569
        L_0x0567:
            int r6 = r1.f43299m
        L_0x0569:
            r1.f43299m = r6
        L_0x056b:
            int r6 = r1.f43298l
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r6 == r8) goto L_0x0587
            int r6 = r1.f43299m
            if (r6 == r8) goto L_0x0587
            int r6 = r1.f43297k
            int r8 = r1.f43298l
            int r6 = r6 * r8
            float r6 = (float) r6
            int r8 = r1.f43296j
            int r12 = r1.f43299m
            int r8 = r8 * r12
            float r8 = (float) r8
            float r6 = r6 / r8
            r26 = r6
            goto L_0x0589
        L_0x0587:
            r26 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0589:
            boolean r6 = r1.f43303q
            if (r6 == 0) goto L_0x0657
            float r6 = r1.f43309w
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x0648
            float r6 = r1.f43310x
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x0648
            float r6 = r1.f43311y
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x0648
            float r6 = r1.f43312z
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x0648
            float r6 = r1.f43271A
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x0648
            float r6 = r1.f43272B
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x0648
            float r6 = r1.f43273C
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x0648
            float r6 = r1.f43274D
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x0648
            float r6 = r1.f43275E
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x0648
            float r6 = r1.f43276F
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x05cb
            goto L_0x0648
        L_0x05cb:
            r6 = 25
            byte[] r6 = new byte[r6]
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r6)
            r8.put(r5)
            float r5 = r1.f43309w
            r11 = 1195593728(0x47435000, float:50000.0)
            float r5 = r5 * r11
            r12 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 + r12
            int r5 = (int) r5
            short r5 = (short) r5
            r8.putShort(r5)
            float r5 = r1.f43310x
            float r5 = r5 * r11
            float r5 = r5 + r12
            int r5 = (int) r5
            short r5 = (short) r5
            r8.putShort(r5)
            float r5 = r1.f43311y
            float r5 = r5 * r11
            float r5 = r5 + r12
            int r5 = (int) r5
            short r5 = (short) r5
            r8.putShort(r5)
            float r5 = r1.f43312z
            float r5 = r5 * r11
            float r5 = r5 + r12
            int r5 = (int) r5
            short r5 = (short) r5
            r8.putShort(r5)
            float r5 = r1.f43271A
            float r5 = r5 * r11
            float r5 = r5 + r12
            int r5 = (int) r5
            short r5 = (short) r5
            r8.putShort(r5)
            float r5 = r1.f43272B
            float r5 = r5 * r11
            float r5 = r5 + r12
            int r5 = (int) r5
            short r5 = (short) r5
            r8.putShort(r5)
            float r5 = r1.f43273C
            float r5 = r5 * r11
            float r5 = r5 + r12
            int r5 = (int) r5
            short r5 = (short) r5
            r8.putShort(r5)
            float r5 = r1.f43274D
            float r5 = r5 * r11
            float r5 = r5 + r12
            int r5 = (int) r5
            short r5 = (short) r5
            r8.putShort(r5)
            float r5 = r1.f43275E
            float r5 = r5 + r12
            int r5 = (int) r5
            short r5 = (short) r5
            r8.putShort(r5)
            float r5 = r1.f43276F
            float r5 = r5 + r12
            int r5 = (int) r5
            short r5 = (short) r5
            r8.putShort(r5)
            int r5 = r1.f43307u
            short r5 = (short) r5
            r8.putShort(r5)
            int r5 = r1.f43308v
            short r5 = (short) r5
            r8.putShort(r5)
            goto L_0x0649
        L_0x0648:
            r6 = r7
        L_0x0649:
            com.google.android.gms.internal.ads.zzta r5 = new com.google.android.gms.internal.ads.zzta
            int r8 = r1.f43304r
            int r11 = r1.f43306t
            int r12 = r1.f43305s
            r5.<init>(r8, r11, r12, r6)
            r29 = r5
            goto L_0x0659
        L_0x0657:
            r29 = r7
        L_0x0659:
            java.lang.String r16 = java.lang.Integer.toString(r9)
            r18 = 0
            r19 = -1
            int r5 = r1.f43296j
            int r6 = r1.f43297k
            r23 = -1082130432(0xffffffffbf800000, float:-1.0)
            r25 = -1
            byte[] r8 = r1.f43301o
            int r9 = r1.f43302p
            com.google.android.gms.internal.ads.zznd r11 = r1.f43295i
            r17 = r10
            r21 = r5
            r22 = r6
            r24 = r41
            r27 = r8
            r28 = r9
            r30 = r11
            com.google.android.gms.internal.ads.zzlg r5 = com.google.android.gms.internal.ads.zzlg.m39281a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x0715
        L_0x0683:
            java.lang.String r4 = "application/x-subrip"
            boolean r4 = r4.equals(r10)
            if (r4 == 0) goto L_0x06b1
            java.lang.String r16 = java.lang.Integer.toString(r9)
            java.lang.String r4 = r1.f43284N
            com.google.android.gms.internal.ads.zznd r5 = r1.f43295i
            r18 = 0
            r19 = -1
            r22 = -1
            r24 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List r26 = java.util.Collections.emptyList()
            r17 = r10
            r20 = r11
            r21 = r4
            r23 = r5
            com.google.android.gms.internal.ads.zzlg r4 = com.google.android.gms.internal.ads.zzlg.m39284a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r26)
        L_0x06ae:
            r5 = r4
            r4 = 3
            goto L_0x0715
        L_0x06b1:
            java.lang.String r4 = "application/vobsub"
            boolean r4 = r4.equals(r10)
            if (r4 != 0) goto L_0x06d2
            java.lang.String r4 = "application/pgs"
            boolean r4 = r4.equals(r10)
            if (r4 != 0) goto L_0x06d2
            java.lang.String r4 = "application/dvbsubs"
            boolean r4 = r4.equals(r10)
            if (r4 == 0) goto L_0x06ca
            goto L_0x06d2
        L_0x06ca:
            com.google.android.gms.internal.ads.bmk r1 = new com.google.android.gms.internal.ads.bmk
            java.lang.String r2 = "Unexpected MIME type."
            r1.<init>(r2)
            throw r1
        L_0x06d2:
            java.lang.String r17 = java.lang.Integer.toString(r9)
            java.lang.String r4 = r1.f43284N
            r37 = r4
            com.google.android.gms.internal.ads.zznd r4 = r1.f43295i
            r42 = r4
            com.google.android.gms.internal.ads.zzlg r4 = new com.google.android.gms.internal.ads.zzlg
            r16 = r4
            r18 = 0
            r20 = 0
            r21 = -1
            r22 = -1
            r23 = -1
            r24 = -1
            r25 = -1082130432(0xffffffffbf800000, float:-1.0)
            r26 = -1
            r27 = -1082130432(0xffffffffbf800000, float:-1.0)
            r28 = 0
            r29 = -1
            r30 = 0
            r31 = -1
            r32 = -1
            r33 = -1
            r34 = -1
            r35 = -1
            r36 = 0
            r38 = -1
            r39 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r43 = 0
            r19 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r42, r43)
            goto L_0x06ae
        L_0x0715:
            int r6 = r1.f43288b
            com.google.android.gms.internal.ads.bot r3 = r3.mo30510a(r6, r4)
            r1.f43285O = r3
            com.google.android.gms.internal.ads.bot r1 = r1.f43285O
            r1.mo30518a(r5)
            android.util.SparseArray<com.google.android.gms.internal.ads.bpe> r1 = r2.f43245b
            com.google.android.gms.internal.ads.bpe r3 = r2.f43254k
            int r3 = r3.f43288b
            com.google.android.gms.internal.ads.bpe r4 = r2.f43254k
            r1.put(r3, r4)
        L_0x072d:
            r2.f43254k = r7
            return
        L_0x0730:
            int r1 = r2.f43264u
            if (r1 != r4) goto L_0x074f
            boolean r1 = r2.f43222D
            if (r1 != 0) goto L_0x073d
            int r1 = r2.f43221C
            r1 = r1 | r6
            r2.f43221C = r1
        L_0x073d:
            android.util.SparseArray<com.google.android.gms.internal.ads.bpe> r1 = r2.f43245b
            int r3 = r2.f43219A
            java.lang.Object r1 = r1.get(r3)
            com.google.android.gms.internal.ads.bpe r1 = (com.google.android.gms.internal.ads.bpe) r1
            long r3 = r2.f43265v
            r2.mo30535a(r1, r3)
            r2.f43264u = r5
            return
        L_0x074f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bpd.mo30531c(int):void");
    }

    /* renamed from: a */
    public final void mo30527a(int i, long j) throws bmk {
        bpb bpb = this.f43270a;
        boolean z = false;
        switch (i) {
            case 131:
                bpb.f43254k.f43289c = (int) j;
                return;
            case 136:
                bpe bpe = bpb.f43254k;
                if (j == 1) {
                    z = true;
                }
                bpe.f43282L = z;
                return;
            case 155:
                bpb.f43266w = bpb.mo30532a(j);
                return;
            case 159:
                bpb.f43254k.f43277G = (int) j;
                return;
            case 176:
                bpb.f43254k.f43296j = (int) j;
                return;
            case 179:
                bpb.f43261r.mo30688a(bpb.mo30532a(j));
                return;
            case 186:
                bpb.f43254k.f43297k = (int) j;
                return;
            case 215:
                bpb.f43254k.f43288b = (int) j;
                return;
            case 231:
                bpb.f43260q = bpb.mo30532a(j);
                return;
            case 241:
                if (!bpb.f43263t) {
                    bpb.f43262s.mo30688a(j);
                    bpb.f43263t = true;
                    return;
                }
                break;
            case 251:
                bpb.f43222D = true;
                return;
            case 16980:
                if (j != 3) {
                    StringBuilder sb = new StringBuilder(50);
                    sb.append("ContentCompAlgo ");
                    sb.append(j);
                    sb.append(" not supported");
                    throw new bmk(sb.toString());
                }
                break;
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb2 = new StringBuilder(53);
                    sb2.append("DocTypeReadVersion ");
                    sb2.append(j);
                    sb2.append(" not supported");
                    throw new bmk(sb2.toString());
                }
            case 17143:
                if (j != 1) {
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("EBMLReadVersion ");
                    sb3.append(j);
                    sb3.append(" not supported");
                    throw new bmk(sb3.toString());
                }
                break;
            case 18401:
                if (j != 5) {
                    StringBuilder sb4 = new StringBuilder(49);
                    sb4.append("ContentEncAlgo ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw new bmk(sb4.toString());
                }
                break;
            case 18408:
                if (j != 1) {
                    StringBuilder sb5 = new StringBuilder(56);
                    sb5.append("AESSettingsCipherMode ");
                    sb5.append(j);
                    sb5.append(" not supported");
                    throw new bmk(sb5.toString());
                }
                break;
            case 20529:
                if (j != 0) {
                    StringBuilder sb6 = new StringBuilder(55);
                    sb6.append("ContentEncodingOrder ");
                    sb6.append(j);
                    sb6.append(" not supported");
                    throw new bmk(sb6.toString());
                }
                break;
            case 20530:
                if (j != 1) {
                    StringBuilder sb7 = new StringBuilder(55);
                    sb7.append("ContentEncodingScope ");
                    sb7.append(j);
                    sb7.append(" not supported");
                    throw new bmk(sb7.toString());
                }
                break;
            case 21420:
                bpb.f43257n = j + bpb.f43250g;
                return;
            case 21432:
                int i2 = (int) j;
                if (i2 == 3) {
                    bpb.f43254k.f43302p = 1;
                    return;
                } else if (i2 != 15) {
                    switch (i2) {
                        case 0:
                            bpb.f43254k.f43302p = 0;
                            return;
                        case 1:
                            bpb.f43254k.f43302p = 2;
                            return;
                        default:
                            return;
                    }
                } else {
                    bpb.f43254k.f43302p = 3;
                    return;
                }
            case 21680:
                bpb.f43254k.f43298l = (int) j;
                return;
            case 21682:
                bpb.f43254k.f43300n = (int) j;
                return;
            case 21690:
                bpb.f43254k.f43299m = (int) j;
                return;
            case 21930:
                bpe bpe2 = bpb.f43254k;
                if (j == 1) {
                    z = true;
                }
                bpe2.f43283M = z;
                return;
            case 21945:
                switch ((int) j) {
                    case 1:
                        bpb.f43254k.f43306t = 2;
                        return;
                    case 2:
                        bpb.f43254k.f43306t = 1;
                        return;
                    default:
                        return;
                }
            case 21946:
                int i3 = (int) j;
                if (i3 != 1) {
                    if (i3 == 16) {
                        bpb.f43254k.f43305s = 6;
                        return;
                    } else if (i3 != 18) {
                        switch (i3) {
                            case 6:
                            case 7:
                                break;
                            default:
                                return;
                        }
                    } else {
                        bpb.f43254k.f43305s = 7;
                        return;
                    }
                }
                bpb.f43254k.f43305s = 3;
                return;
            case 21947:
                bpb.f43254k.f43303q = true;
                int i4 = (int) j;
                if (i4 == 1) {
                    bpb.f43254k.f43304r = 1;
                    return;
                } else if (i4 != 9) {
                    switch (i4) {
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            bpb.f43254k.f43304r = 2;
                            return;
                        default:
                            return;
                    }
                } else {
                    bpb.f43254k.f43304r = 6;
                    return;
                }
            case 21948:
                bpb.f43254k.f43307u = (int) j;
                return;
            case 21949:
                bpb.f43254k.f43308v = (int) j;
                break;
            case 22186:
                bpb.f43254k.f43280J = j;
                return;
            case 22203:
                bpb.f43254k.f43281K = j;
                return;
            case 25188:
                bpb.f43254k.f43278H = (int) j;
                return;
            case 2352003:
                bpb.f43254k.f43290d = (int) j;
                return;
            case 2807729:
                bpb.f43251h = j;
                return;
        }
    }

    /* renamed from: a */
    public final void mo30525a(int i, double d) throws bmk {
        bpb bpb = this.f43270a;
        if (i == 181) {
            bpb.f43254k.f43279I = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    bpb.f43254k.f43309w = (float) d;
                    return;
                case 21970:
                    bpb.f43254k.f43310x = (float) d;
                    return;
                case 21971:
                    bpb.f43254k.f43311y = (float) d;
                    return;
                case 21972:
                    bpb.f43254k.f43312z = (float) d;
                    return;
                case 21973:
                    bpb.f43254k.f43271A = (float) d;
                    return;
                case 21974:
                    bpb.f43254k.f43272B = (float) d;
                    return;
                case 21975:
                    bpb.f43254k.f43273C = (float) d;
                    return;
                case 21976:
                    bpb.f43254k.f43274D = (float) d;
                    return;
                case 21977:
                    bpb.f43254k.f43275E = (float) d;
                    return;
                case 21978:
                    bpb.f43254k.f43276F = (float) d;
                    break;
            }
        } else {
            bpb.f43252i = (long) d;
        }
    }

    /* renamed from: a */
    public final void mo30529a(int i, String str) throws bmk {
        bpb bpb = this.f43270a;
        if (i != 134) {
            if (i != 17026) {
                if (i == 2274716) {
                    bpb.f43254k.f43284N = str;
                }
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
                sb.append("DocType ");
                sb.append(str);
                sb.append(" not supported");
                throw new bmk(sb.toString());
            }
            return;
        }
        bpb.f43254k.f43287a = str;
    }

    /* renamed from: a */
    public final void mo30526a(int i, int i2, bol bol) throws IOException, InterruptedException {
        byte b;
        int i3 = i;
        int i4 = i2;
        bol bol2 = bol;
        bpb bpb = this.f43270a;
        int i5 = 4;
        int i6 = 0;
        int i7 = 1;
        if (i3 == 161 || i3 == 163) {
            if (bpb.f43264u == 0) {
                bpb.f43219A = (int) bpb.f43241a.mo30537a(bol2, false, true, 8);
                bpb.f43220B = bpb.f43241a.f43316a;
                bpb.f43266w = -9223372036854775807L;
                bpb.f43264u = 1;
                bpb.f43247d.mo30690a();
            }
            bpe bpe = (bpe) bpb.f43245b.get(bpb.f43219A);
            if (bpe == null) {
                bol2.mo30501b(i4 - bpb.f43220B);
                bpb.f43264u = 0;
                return;
            }
            if (bpb.f43264u == 1) {
                bpb.mo30533a(bol2, 3);
                int i8 = (bpb.f43247d.f43867a[2] & 6) >> 1;
                if (i8 == 0) {
                    bpb.f43268y = 1;
                    bpb.f43269z = bpb.m36365a(bpb.f43269z, 1);
                    bpb.f43269z[0] = (i4 - bpb.f43220B) - 3;
                } else if (i3 == 163) {
                    bpb.mo30533a(bol2, 4);
                    bpb.f43268y = (bpb.f43247d.f43867a[3] & 255) + 1;
                    bpb.f43269z = bpb.m36365a(bpb.f43269z, bpb.f43268y);
                    if (i8 == 2) {
                        Arrays.fill(bpb.f43269z, 0, bpb.f43268y, ((i4 - bpb.f43220B) - 4) / bpb.f43268y);
                    } else if (i8 == 1) {
                        int i9 = 0;
                        for (int i10 = 0; i10 < bpb.f43268y - 1; i10++) {
                            bpb.f43269z[i10] = 0;
                            do {
                                i5++;
                                bpb.mo30533a(bol2, i5);
                                b = bpb.f43247d.f43867a[i5 - 1] & 255;
                                int[] iArr = bpb.f43269z;
                                iArr[i10] = iArr[i10] + b;
                            } while (b == 255);
                            i9 += bpb.f43269z[i10];
                        }
                        bpb.f43269z[bpb.f43268y - 1] = ((i4 - bpb.f43220B) - i5) - i9;
                    } else if (i8 == 3) {
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < bpb.f43268y - i7) {
                            bpb.f43269z[i11] = i6;
                            int i13 = i5 + 1;
                            bpb.mo30533a(bol2, i13);
                            int i14 = i13 - 1;
                            if (bpb.f43247d.f43867a[i14] != 0) {
                                long j = 0;
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= 8) {
                                        break;
                                    }
                                    int i16 = i7 << (7 - i15);
                                    if ((bpb.f43247d.f43867a[i14] & i16) != 0) {
                                        i13 += i15;
                                        bpb.mo30533a(bol2, i13);
                                        j = (long) (bpb.f43247d.f43867a[i14] & 255 & (i16 ^ -1));
                                        for (int i17 = i14 + 1; i17 < i13; i17++) {
                                            j = (j << 8) | ((long) (bpb.f43247d.f43867a[i17] & 255));
                                        }
                                        if (i11 > 0) {
                                            j -= (1 << ((i15 * 7) + 6)) - 1;
                                        }
                                    } else {
                                        i15++;
                                        i7 = 1;
                                    }
                                }
                                int i18 = i13;
                                long j2 = j;
                                if (j2 < -2147483648L || j2 > 2147483647L) {
                                    throw new bmk("EBML lacing sample size out of range.");
                                }
                                int i19 = (int) j2;
                                int[] iArr2 = bpb.f43269z;
                                if (i11 != 0) {
                                    i19 += bpb.f43269z[i11 - 1];
                                }
                                iArr2[i11] = i19;
                                i12 += bpb.f43269z[i11];
                                i11++;
                                i5 = i18;
                                i6 = 0;
                                i7 = 1;
                            } else {
                                throw new bmk("No valid varint length mask found");
                            }
                        }
                        bpb.f43269z[bpb.f43268y - 1] = ((i4 - bpb.f43220B) - i5) - i12;
                    } else {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append("Unexpected lacing value: ");
                        sb.append(i8);
                        throw new bmk(sb.toString());
                    }
                } else {
                    throw new bmk("Lacing only supported in SimpleBlocks.");
                }
                bpb.f43265v = bpb.f43260q + bpb.mo30532a((long) ((bpb.f43247d.f43867a[0] << 8) | (bpb.f43247d.f43867a[1] & 255)));
                bpb.f43221C = ((bpe.f43289c == 2 || (i3 == 163 && (bpb.f43247d.f43867a[2] & 128) == 128)) ? 1 : 0) | ((bpb.f43247d.f43867a[2] & 8) == 8 ? DynamicTabYellowPointVersion.DEFAULT : 0);
                bpb.f43264u = 2;
                bpb.f43267x = 0;
            }
            if (i3 == 163) {
                while (bpb.f43267x < bpb.f43268y) {
                    bpb.mo30534a(bol2, bpe, bpb.f43269z[bpb.f43267x]);
                    bpb.mo30535a(bpe, bpb.f43265v + ((long) ((bpb.f43267x * bpe.f43290d) / 1000)));
                    bpb.f43267x++;
                }
                bpb.f43264u = 0;
                return;
            }
            bpb.mo30534a(bol2, bpe, bpb.f43269z[0]);
        } else if (i3 == 16981) {
            bpb.f43254k.f43292f = new byte[i4];
            bol2.mo30502b(bpb.f43254k.f43292f, 0, i4);
        } else if (i3 == 18402) {
            byte[] bArr = new byte[i4];
            bol2.mo30502b(bArr, 0, i4);
            bpb.f43254k.f43293g = new bou(1, bArr);
        } else if (i3 == 21419) {
            Arrays.fill(bpb.f43248e.f43867a, 0);
            bol2.mo30502b(bpb.f43248e.f43867a, 4 - i4, i4);
            bpb.f43248e.mo30697c(0);
            bpb.f43256m = (int) bpb.f43248e.mo30702f();
        } else if (i3 == 25506) {
            bpb.f43254k.f43294h = new byte[i4];
            bol2.mo30502b(bpb.f43254k.f43294h, 0, i4);
        } else if (i3 == 30322) {
            bpb.f43254k.f43301o = new byte[i4];
            bol2.mo30502b(bpb.f43254k.f43301o, 0, i4);
        } else {
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("Unexpected id: ");
            sb2.append(i3);
            throw new bmk(sb2.toString());
        }
    }

    /* synthetic */ bpd(bpb bpb, bpc bpc) {
        this(bpb);
    }
}
