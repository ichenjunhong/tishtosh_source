package com.google.android.gms.internal.ads;

import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.nio.ByteBuffer;
import java.util.ArrayList;

final class bkf implements bkb {

    /* renamed from: a */
    private final /* synthetic */ bkd f42762a;

    private bkf(bkd bkd) {
        this.f42762a = bkd;
    }

    /* renamed from: a */
    public final int mo30297a(int i) {
        switch (i) {
            case 131:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 20531:
            case 21420:
            case 22186:
            case 22203:
            case 2807729:
                return 2;
            case 134:
            case 17026:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20533:
            case 25152:
            case 28032:
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
            case 18402:
            case 21419:
            case 25506:
                return 4;
            case 181:
            case 17545:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public final void mo30301a(int i, long j, long j2) throws big {
        bkd bkd = this.f42762a;
        if (i != 160) {
            if (i == 174) {
                bkd.f42744i = new bkg();
            } else if (i == 187) {
                bkd.f42756u = false;
                return;
            } else if (i == 19899) {
                bkd.f42748m = -1;
                bkd.f42749n = -1;
                return;
            } else if (i == 20533) {
                bkd.f42744i.f42766d = true;
                return;
            } else if (i == 25152) {
                return;
            } else {
                if (i != 408125543) {
                    if (i != 475249515) {
                        if (i == 524531317 && bkd.f42752q == 0 && bkd.f42751p != -1) {
                            bkd.f42750o = true;
                        }
                        return;
                    }
                    bkd.f42754s = new blj();
                    bkd.f42755t = new blj();
                    return;
                } else if (bkd.f42740e == -1) {
                    bkd.f42740e = j;
                    bkd.f42741f = j2;
                    return;
                } else {
                    throw new big("Multiple Segment elements not supported");
                }
            }
            return;
        }
        bkd.f42731B = false;
    }

    /* renamed from: b */
    public final void mo30303b(int i) throws big {
        bie bie;
        bie bie2;
        int i2;
        int i3 = i;
        bkd bkd = this.f42762a;
        if (i3 != 160) {
            if (i3 != 174) {
                if (i3 != 19899) {
                    if (i3 != 25152) {
                        if (i3 != 374648427) {
                            if (i3 == 475249515 && bkd.f42752q != 2) {
                                bjb bjb = bkd.f42732C;
                                if (bkd.f42740e == -1) {
                                    throw new big("Segment start/end offsets unknown");
                                } else if (bkd.f42743h == -1) {
                                    throw new big("Duration unknown");
                                } else if (bkd.f42754s == null || bkd.f42755t == null || bkd.f42754s.f42848a == 0 || bkd.f42754s.f42848a != bkd.f42755t.f42848a) {
                                    throw new big("Invalid/missing cue points");
                                } else {
                                    int i4 = bkd.f42754s.f42848a;
                                    int[] iArr = new int[i4];
                                    long[] jArr = new long[i4];
                                    long[] jArr2 = new long[i4];
                                    long[] jArr3 = new long[i4];
                                    int i5 = 0;
                                    for (int i6 = 0; i6 < i4; i6++) {
                                        jArr3[i6] = bkd.f42754s.mo30325a(i6);
                                        jArr[i6] = bkd.f42740e + bkd.f42755t.mo30325a(i6);
                                    }
                                    while (true) {
                                        i2 = i4 - 1;
                                        if (i5 >= i2) {
                                            break;
                                        }
                                        int i7 = i5 + 1;
                                        iArr[i5] = (int) (jArr[i7] - jArr[i5]);
                                        jArr2[i5] = jArr3[i7] - jArr3[i5];
                                        i5 = i7;
                                    }
                                    iArr[i2] = (int) ((bkd.f42740e + bkd.f42741f) - jArr[i2]);
                                    jArr2[i2] = bkd.f42743h - jArr3[i2];
                                    bkd.f42754s = null;
                                    bkd.f42755t = null;
                                    bjb.mo30272a((bjk) new biv(iArr, jArr, jArr2, jArr3));
                                    bkd.f42752q = 2;
                                }
                            }
                        } else if (bkd.f42746k == null && bkd.f42745j == null) {
                            throw new big("No valid tracks were found");
                        } else {
                            bkd.f42732C.mo30274d();
                        }
                    } else if (!bkd.f42744i.f42766d) {
                        throw new big("Found an unsupported ContentEncoding");
                    } else if (bkd.f42744i.f42767e != null) {
                        if (!bkd.f42747l) {
                            bkd.f42732C.mo30271a((bir) new bit("video/webm", bkd.f42744i.f42767e));
                            bkd.f42747l = true;
                        }
                    } else {
                        throw new big("Encrypted Track found but ContentEncKeyID was not found");
                    }
                } else if (bkd.f42748m == -1 || bkd.f42749n == -1) {
                    throw new big("Mandatory element SeekID or SeekPosition not found");
                } else {
                    if (bkd.f42748m == 475249515) {
                        bkd.f42751p = bkd.f42749n;
                    }
                }
            } else if (bkd.f42744i.f42764b == -1 || bkd.f42744i.f42765c == -1) {
                throw new big("Mandatory element TrackNumber or TrackType not found");
            } else if ((bkd.f42744i.f42765c != 2 || bkd.f42745j == null) && (bkd.f42744i.f42765c != 1 || bkd.f42746k == null)) {
                if (bkd.f42744i.f42765c == 2 && bkd.m35932a(bkd.f42744i.f42763a)) {
                    bkd.f42745j = bkd.f42744i;
                    bkd.f42745j.f42775m = bkd.f42732C.mo30273c(bkd.f42745j.f42764b);
                    bjl bjl = bkd.f42745j.f42775m;
                    if (bkd.f42745j != null && "A_VORBIS".equals(bkd.f42745j.f42763a)) {
                        bie2 = bie.m35771b("audio/vorbis", VideoCacheReadBuffersizeExperiment.DEFAULT, bkd.f42743h, bkd.f42745j.f42770h, bkd.f42745j.f42771i, bkd.mo30308b());
                    } else if (bkd.f42745j == null || !"A_OPUS".equals(bkd.f42745j.f42763a)) {
                        throw new big("Unable to build format");
                    } else {
                        ArrayList arrayList = new ArrayList(3);
                        arrayList.add(bkd.f42745j.f42772j);
                        arrayList.add(ByteBuffer.allocate(64).putLong(bkd.f42745j.f42773k).array());
                        arrayList.add(ByteBuffer.allocate(64).putLong(bkd.f42745j.f42774l).array());
                        bie2 = bie.m35771b("audio/opus", 5760, bkd.f42743h, bkd.f42745j.f42770h, bkd.f42745j.f42771i, arrayList);
                    }
                    bjl.mo30262a(bie2);
                } else if (bkd.f42744i.f42765c == 1 && bkd.m35932a(bkd.f42744i.f42763a)) {
                    bkd.f42746k = bkd.f42744i;
                    bkd.f42746k.f42775m = bkd.f42732C.mo30273c(bkd.f42746k.f42764b);
                    bjl bjl2 = bkd.f42746k.f42775m;
                    if (bkd.f42746k != null && "V_VP8".equals(bkd.f42746k.f42763a)) {
                        bie = bie.m35769a("video/x-vnd.on2.vp8", -1, bkd.f42743h, bkd.f42746k.f42768f, bkd.f42746k.f42769g, null);
                    } else if (bkd.f42746k == null || !"V_VP9".equals(bkd.f42746k.f42763a)) {
                        throw new big("Unable to build format");
                    } else {
                        bie = bie.m35769a("video/x-vnd.on2.vp9", -1, bkd.f42743h, bkd.f42746k.f42768f, bkd.f42746k.f42769g, null);
                    }
                    bjl2.mo30262a(bie);
                }
                bkd.f42744i = null;
            } else {
                bkd.f42744i = null;
            }
        } else if (bkd.f42758w == 2) {
            if (!bkd.f42731B) {
                bkd.f42761z |= 1;
            }
            bkd.mo30307a(((bkd.f42745j == null || bkd.f42760y != bkd.f42745j.f42764b) ? bkd.f42746k : bkd.f42745j).f42775m);
        }
    }

    /* renamed from: a */
    public final void mo30300a(int i, long j) throws big {
        bkd bkd = this.f42762a;
        switch (i) {
            case 131:
                bkd.f42744i.f42765c = (int) j;
                return;
            case 159:
                bkd.f42744i.f42770h = (int) j;
                return;
            case 176:
                bkd.f42744i.f42768f = (int) j;
                return;
            case 179:
                bkd.f42754s.mo30326a(bkd.mo30306a(j));
                return;
            case 186:
                bkd.f42744i.f42769g = (int) j;
                return;
            case 215:
                bkd.f42744i.f42764b = (int) j;
                return;
            case 231:
                bkd.f42753r = bkd.mo30306a(j);
                break;
            case 241:
                if (!bkd.f42756u) {
                    bkd.f42755t.mo30326a(j);
                    bkd.f42756u = true;
                }
                return;
            case 251:
                bkd.f42731B = true;
                return;
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb = new StringBuilder(53);
                    sb.append("DocTypeReadVersion ");
                    sb.append(j);
                    sb.append(" not supported");
                    throw new big(sb.toString());
                }
                return;
            case 17143:
                if (j != 1) {
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("EBMLReadVersion ");
                    sb2.append(j);
                    sb2.append(" not supported");
                    throw new big(sb2.toString());
                }
                return;
            case 18401:
                if (j != 5) {
                    StringBuilder sb3 = new StringBuilder(49);
                    sb3.append("ContentEncAlgo ");
                    sb3.append(j);
                    sb3.append(" not supported");
                    throw new big(sb3.toString());
                }
                return;
            case 18408:
                if (j != 1) {
                    StringBuilder sb4 = new StringBuilder(56);
                    sb4.append("AESSettingsCipherMode ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw new big(sb4.toString());
                }
                return;
            case 20529:
                if (j != 0) {
                    StringBuilder sb5 = new StringBuilder(55);
                    sb5.append("ContentEncodingOrder ");
                    sb5.append(j);
                    sb5.append(" not supported");
                    throw new big(sb5.toString());
                }
                return;
            case 20530:
                if (j != 1) {
                    StringBuilder sb6 = new StringBuilder(55);
                    sb6.append("ContentEncodingScope ");
                    sb6.append(j);
                    sb6.append(" not supported");
                    throw new big(sb6.toString());
                }
                return;
            case 20531:
                if (j != 1) {
                    StringBuilder sb7 = new StringBuilder(54);
                    sb7.append("ContentEncodingType ");
                    sb7.append(j);
                    sb7.append(" not supported");
                    throw new big(sb7.toString());
                }
                return;
            case 21420:
                bkd.f42749n = j + bkd.f42740e;
                return;
            case 22186:
                bkd.f42744i.f42773k = j;
                return;
            case 22203:
                bkd.f42744i.f42774l = j;
                return;
            case 2807729:
                bkd.f42742g = j;
                return;
        }
    }

    /* renamed from: a */
    public final void mo30298a(int i, double d) {
        bkd bkd = this.f42762a;
        if (i == 181) {
            bkd.f42744i.f42771i = (int) d;
        } else if (i == 17545) {
            bkd.f42743h = bkd.mo30306a((long) d);
        }
    }

    /* renamed from: a */
    public final void mo30302a(int i, String str) throws big {
        bkd bkd = this.f42762a;
        if (i == 134) {
            bkd.f42744i.f42763a = str;
        } else if (i == 17026 && !"webm".equals(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new big(sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0159  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30299a(int r17, int r18, com.google.android.gms.internal.ads.bja r19) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r16
            r3 = r19
            com.google.android.gms.internal.ads.bkd r4 = r2.f42762a
            r5 = 161(0xa1, float:2.26E-43)
            r6 = 163(0xa3, float:2.28E-43)
            r7 = 4
            r8 = 0
            if (r0 == r5) goto L_0x0073
            if (r0 == r6) goto L_0x0073
            r5 = 18402(0x47e2, float:2.5787E-41)
            if (r0 == r5) goto L_0x0065
            r5 = 21419(0x53ab, float:3.0014E-41)
            if (r0 == r5) goto L_0x0047
            r5 = 25506(0x63a2, float:3.5742E-41)
            if (r0 != r5) goto L_0x002e
            com.google.android.gms.internal.ads.bkg r0 = r4.f42744i
            byte[] r5 = new byte[r1]
            r0.f42772j = r5
            com.google.android.gms.internal.ads.bkg r0 = r4.f42744i
            byte[] r0 = r0.f42772j
            r3.mo30257a(r0, r8, r1)
            return
        L_0x002e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 26
            r3.<init>(r4)
            java.lang.String r4 = "Unexpected id: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        L_0x0047:
            com.google.android.gms.internal.ads.bll r0 = r4.f42739d
            byte[] r0 = r0.f42850a
            java.util.Arrays.fill(r0, r8)
            com.google.android.gms.internal.ads.bll r0 = r4.f42739d
            byte[] r0 = r0.f42850a
            int r7 = r7 - r1
            r3.mo30257a(r0, r7, r1)
            com.google.android.gms.internal.ads.bll r0 = r4.f42739d
            r0.mo30328a(r8)
            com.google.android.gms.internal.ads.bll r0 = r4.f42739d
            long r0 = r0.mo30332c()
            int r0 = (int) r0
            r4.f42748m = r0
            return
        L_0x0065:
            com.google.android.gms.internal.ads.bkg r0 = r4.f42744i
            byte[] r5 = new byte[r1]
            r0.f42767e = r5
            com.google.android.gms.internal.ads.bkg r0 = r4.f42744i
            byte[] r0 = r0.f42767e
            r3.mo30257a(r0, r8, r1)
            return
        L_0x0073:
            int r5 = r4.f42758w
            r9 = 1
            if (r5 != 0) goto L_0x0089
            com.google.android.gms.internal.ads.bkc r5 = r4.f42736a
            long r10 = r5.mo30304a(r3, r8, r9)
            int r5 = (int) r10
            r4.f42760y = r5
            com.google.android.gms.internal.ads.bkc r5 = r4.f42736a
            int r5 = r5.f42727a
            r4.f42757v = r5
            r4.f42758w = r9
        L_0x0089:
            com.google.android.gms.internal.ads.bkg r5 = r4.f42745j
            if (r5 == 0) goto L_0x00a1
            com.google.android.gms.internal.ads.bkg r5 = r4.f42746k
            if (r5 == 0) goto L_0x00a1
            com.google.android.gms.internal.ads.bkg r5 = r4.f42745j
            int r5 = r5.f42764b
            int r10 = r4.f42760y
            if (r5 == r10) goto L_0x00a1
            com.google.android.gms.internal.ads.bkg r5 = r4.f42746k
            int r5 = r5.f42764b
            int r10 = r4.f42760y
            if (r5 != r10) goto L_0x00c1
        L_0x00a1:
            com.google.android.gms.internal.ads.bkg r5 = r4.f42745j
            if (r5 == 0) goto L_0x00b1
            com.google.android.gms.internal.ads.bkg r5 = r4.f42746k
            if (r5 != 0) goto L_0x00b1
            com.google.android.gms.internal.ads.bkg r5 = r4.f42745j
            int r5 = r5.f42764b
            int r10 = r4.f42760y
            if (r5 != r10) goto L_0x00c1
        L_0x00b1:
            com.google.android.gms.internal.ads.bkg r5 = r4.f42745j
            if (r5 != 0) goto L_0x00cb
            com.google.android.gms.internal.ads.bkg r5 = r4.f42746k
            if (r5 == 0) goto L_0x00cb
            com.google.android.gms.internal.ads.bkg r5 = r4.f42746k
            int r5 = r5.f42764b
            int r10 = r4.f42760y
            if (r5 == r10) goto L_0x00cb
        L_0x00c1:
            int r0 = r4.f42757v
            int r0 = r1 - r0
            r3.mo30256a(r0)
            r4.f42758w = r8
            return
        L_0x00cb:
            com.google.android.gms.internal.ads.bkg r5 = r4.f42745j
            if (r5 == 0) goto L_0x00da
            int r5 = r4.f42760y
            com.google.android.gms.internal.ads.bkg r10 = r4.f42745j
            int r10 = r10.f42764b
            if (r5 != r10) goto L_0x00da
            com.google.android.gms.internal.ads.bkg r5 = r4.f42745j
            goto L_0x00dc
        L_0x00da:
            com.google.android.gms.internal.ads.bkg r5 = r4.f42746k
        L_0x00dc:
            com.google.android.gms.internal.ads.bjl r10 = r5.f42775m
            int r11 = r4.f42758w
            if (r11 != r9) goto L_0x018d
            com.google.android.gms.internal.ads.bll r11 = r4.f42737b
            byte[] r11 = r11.f42850a
            boolean r12 = r5.f42766d
            if (r12 == 0) goto L_0x00ec
            r12 = 4
            goto L_0x00ed
        L_0x00ec:
            r12 = 3
        L_0x00ed:
            r3.mo30257a(r11, r8, r12)
            int r14 = r4.f42757v
            int r14 = r14 + r12
            r4.f42757v = r14
            byte r12 = r11[r8]
            r14 = 8
            int r12 = r12 << r14
            byte r15 = r11[r9]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r12 = r12 | r15
            long r7 = r4.f42753r
            long r13 = (long) r12
            long r12 = r4.mo30306a(r13)
            long r7 = r7 + r12
            r4.f42730A = r7
            r8 = 2
            byte r7 = r11[r8]
            r7 = r7 & 6
            int r7 = r7 >> r9
            if (r7 != 0) goto L_0x0174
            byte r7 = r11[r8]
            r12 = 8
            r7 = r7 & r12
            if (r7 != r12) goto L_0x011a
            r7 = 1
            goto L_0x011b
        L_0x011a:
            r7 = 0
        L_0x011b:
            r12 = 128(0x80, float:1.794E-43)
            if (r0 != r6) goto L_0x0126
            byte r13 = r11[r8]
            r13 = r13 & r12
            if (r13 != r12) goto L_0x0126
            r13 = 1
            goto L_0x0127
        L_0x0126:
            r13 = 0
        L_0x0127:
            boolean r14 = r5.f42766d
            if (r14 == 0) goto L_0x0138
            r14 = 3
            byte r15 = r11[r14]
            r15 = r15 & r12
            if (r15 == r12) goto L_0x013a
            byte r11 = r11[r14]
            r11 = r11 & r9
            if (r11 != r9) goto L_0x0138
            r11 = 1
            goto L_0x0142
        L_0x0138:
            r11 = 0
            goto L_0x0142
        L_0x013a:
            com.google.android.gms.internal.ads.big r0 = new com.google.android.gms.internal.ads.big
            java.lang.String r1 = "Extension bit is set in signal byte"
            r0.<init>(r1)
            throw r0
        L_0x0142:
            if (r7 == 0) goto L_0x0147
            r7 = 134217728(0x8000000, float:3.85186E-34)
            goto L_0x0148
        L_0x0147:
            r7 = 0
        L_0x0148:
            r7 = r7 | r13
            if (r11 == 0) goto L_0x014d
            r12 = 2
            goto L_0x014e
        L_0x014d:
            r12 = 0
        L_0x014e:
            r7 = r7 | r12
            r4.f42761z = r7
            int r7 = r4.f42757v
            int r7 = r1 - r7
            r4.f42759x = r7
            if (r11 == 0) goto L_0x0171
            com.google.android.gms.internal.ads.bll r7 = r4.f42737b
            byte[] r7 = r7.f42850a
            r11 = 0
            r12 = 8
            r7[r11] = r12
            com.google.android.gms.internal.ads.bll r7 = r4.f42737b
            r7.mo30328a(r11)
            com.google.android.gms.internal.ads.bll r7 = r4.f42737b
            r10.mo30263a(r7, r9)
            int r7 = r4.f42759x
            int r7 = r7 + r9
            r4.f42759x = r7
        L_0x0171:
            r4.f42758w = r8
            goto L_0x018d
        L_0x0174:
            com.google.android.gms.internal.ads.big r0 = new com.google.android.gms.internal.ads.big
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 38
            r1.<init>(r3)
            java.lang.String r3 = "Lacing mode not supported: "
            r1.append(r3)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x018d:
            int r7 = r4.f42757v
            if (r7 >= r1) goto L_0x019f
            int r7 = r4.f42757v
            int r8 = r4.f42757v
            int r8 = r1 - r8
            int r8 = r10.mo30259a(r3, r8)
            int r7 = r7 + r8
            r4.f42757v = r7
            goto L_0x018d
        L_0x019f:
            java.lang.String r1 = "A_VORBIS"
            java.lang.String r3 = r5.f42763a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01ba
            com.google.android.gms.internal.ads.bll r1 = r4.f42738c
            r3 = 0
            r1.mo30328a(r3)
            com.google.android.gms.internal.ads.bll r1 = r4.f42738c
            r3 = 4
            r10.mo30263a(r1, r3)
            int r1 = r4.f42759x
            int r1 = r1 + r3
            r4.f42759x = r1
        L_0x01ba:
            if (r0 != r6) goto L_0x01bf
            r4.mo30307a(r10)
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bkf.mo30299a(int, int, com.google.android.gms.internal.ads.bja):void");
    }
}
