package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo.CodecProfileLevel;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public final class bqh {

    /* renamed from: a */
    static final bqc f43582a;

    /* renamed from: b */
    static final Pattern f43583b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c */
    static final Map<String, Integer> f43584c;

    /* renamed from: d */
    private static final HashMap<C15733a, List<bqc>> f43585d = new HashMap<>();

    /* renamed from: e */
    private static final SparseIntArray f43586e;

    /* renamed from: f */
    private static final SparseIntArray f43587f;

    /* renamed from: g */
    private static int f43588g = -1;

    /* renamed from: com.google.android.gms.internal.ads.bqh$a */
    static final class C15733a {

        /* renamed from: a */
        public final String f43589a;

        /* renamed from: b */
        public final boolean f43590b;

        public C15733a(String str, boolean z) {
            this.f43589a = str;
            this.f43590b = z;
        }

        public final int hashCode() {
            return (((this.f43589a == null ? 0 : this.f43589a.hashCode()) + 31) * 31) + (this.f43590b ? 1231 : 1237);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C15733a.class) {
                return false;
            }
            C15733a aVar = (C15733a) obj;
            return TextUtils.equals(this.f43589a, aVar.f43589a) && this.f43590b == aVar.f43590b;
        }
    }

    /* renamed from: a */
    public static bqc m36471a(String str, boolean z) throws bqj {
        List b = m36473b(str, z);
        if (b.isEmpty()) {
            return null;
        }
        return (bqc) b.get(0);
    }

    /* renamed from: b */
    private static synchronized List<bqc> m36473b(String str, boolean z) throws bqj {
        synchronized (bqh.class) {
            C15733a aVar = new C15733a(str, z);
            List<bqc> list = (List) f43585d.get(aVar);
            if (list != null) {
                return list;
            }
            List a = m36472a(aVar, btw.f43878a >= 21 ? new bqm(z) : new bql());
            if (z && a.isEmpty() && 21 <= btw.f43878a && btw.f43878a <= 23) {
                a = m36472a(aVar, (bqk) new bql());
                a.isEmpty();
            }
            List<bqc> unmodifiableList = Collections.unmodifiableList(a);
            f43585d.put(aVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* renamed from: a */
    public static int m36469a() throws bqj {
        int i;
        if (f43588g == -1) {
            int i2 = 0;
            bqc a = m36471a("video/avc", false);
            if (a != null) {
                CodecProfileLevel[] a2 = a.mo30549a();
                int length = a2.length;
                int i3 = 0;
                while (i2 < length) {
                    switch (a2[i2].level) {
                        case 1:
                        case 2:
                            i = 25344;
                            break;
                        case 8:
                        case 16:
                        case 32:
                            i = 101376;
                            break;
                        case UnReadVideoExperiment.RELATION_LIST /*64*/:
                            i = 202752;
                            break;
                        case 128:
                        case UnReadVideoExperiment.BROWSE_RECORD_LIST /*256*/:
                            i = 414720;
                            break;
                        case UnReadVideoExperiment.LIKE_USER_LIST /*512*/:
                            i = 921600;
                            break;
                        case PreloadTask.BYTE_UNIT_NUMBER /*1024*/:
                            i = 1310720;
                            break;
                        case 2048:
                        case 4096:
                            i = 2097152;
                            break;
                        case VideoCacheReadBuffersizeExperiment.DEFAULT /*8192*/:
                            i = 2228224;
                            break;
                        case 16384:
                            i = 5652480;
                            break;
                        case 32768:
                        case 65536:
                            i = 9437184;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                    i3 = Math.max(i, i3);
                    i2++;
                }
                i2 = Math.max(i3, btw.f43878a >= 21 ? 345600 : 172800);
            }
            f43588g = i2;
        }
        return f43588g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01b4 A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0240 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.google.android.gms.internal.ads.bqc> m36472a(com.google.android.gms.internal.ads.bqh.C15733a r16, com.google.android.gms.internal.ads.bqk r17) throws com.google.android.gms.internal.ads.bqj {
        /*
            r1 = r16
            r2 = r17
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0245 }
            r3.<init>()     // Catch:{ Exception -> 0x0245 }
            java.lang.String r4 = r1.f43589a     // Catch:{ Exception -> 0x0245 }
            int r5 = r17.mo30559a()     // Catch:{ Exception -> 0x0245 }
            boolean r6 = r17.mo30562b()     // Catch:{ Exception -> 0x0245 }
            r8 = 0
        L_0x0014:
            if (r8 >= r5) goto L_0x0244
            android.media.MediaCodecInfo r9 = r2.mo30560a(r8)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r10 = r9.getName()     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r9.isEncoder()     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            if (r6 != 0) goto L_0x0030
            java.lang.String r0 = ".secure"
            boolean r0 = r10.endsWith(r0)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x0030
            goto L_0x01b1
        L_0x0030:
            int r0 = com.google.android.gms.internal.ads.btw.f43878a     // Catch:{ Exception -> 0x0245 }
            r12 = 21
            if (r0 >= r12) goto L_0x0068
            java.lang.String r0 = "CIPAACDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "CIPMP3Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "CIPVorbisDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "CIPAMRNBDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "AACDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "MP3Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x0068
            goto L_0x01b1
        L_0x0068:
            int r0 = com.google.android.gms.internal.ads.btw.f43878a     // Catch:{ Exception -> 0x0245 }
            r12 = 18
            if (r0 >= r12) goto L_0x0078
            java.lang.String r0 = "OMX.SEC.MP3.Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x0078
            goto L_0x01b1
        L_0x0078:
            int r0 = com.google.android.gms.internal.ads.btw.f43878a     // Catch:{ Exception -> 0x0245 }
            if (r0 >= r12) goto L_0x0090
            java.lang.String r0 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = "a70"
            java.lang.String r12 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x0090
            goto L_0x01b1
        L_0x0090:
            int r0 = com.google.android.gms.internal.ads.btw.f43878a     // Catch:{ Exception -> 0x0245 }
            r12 = 16
            if (r0 != r12) goto L_0x0118
            java.lang.String r0 = "OMX.qcom.audio.decoder.mp3"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = "dlxu"
            java.lang.String r13 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "protou"
            java.lang.String r13 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "ville"
            java.lang.String r13 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "villeplus"
            java.lang.String r13 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "villec2"
            java.lang.String r13 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            java.lang.String r13 = "gee"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C6602"
            java.lang.String r13 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C6603"
            java.lang.String r13 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C6606"
            java.lang.String r13 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C6616"
            java.lang.String r13 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "L36h"
            java.lang.String r13 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "SO-02E"
            java.lang.String r13 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x0118
            goto L_0x01b1
        L_0x0118:
            int r0 = com.google.android.gms.internal.ads.btw.f43878a     // Catch:{ Exception -> 0x0245 }
            if (r0 != r12) goto L_0x014d
            java.lang.String r0 = "OMX.qcom.audio.decoder.aac"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x014d
            java.lang.String r0 = "C1504"
            java.lang.String r12 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C1505"
            java.lang.String r12 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C1604"
            java.lang.String r12 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C1605"
            java.lang.String r12 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x014d
            goto L_0x01b1
        L_0x014d:
            int r0 = com.google.android.gms.internal.ads.btw.f43878a     // Catch:{ Exception -> 0x0245 }
            r12 = 19
            if (r0 > r12) goto L_0x0198
            java.lang.String r0 = "OMX.SEC.vp8.dec"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = "samsung"
            java.lang.String r13 = com.google.android.gms.internal.ads.btw.f43880c     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            java.lang.String r13 = "d2"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            java.lang.String r13 = "serrano"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            java.lang.String r13 = "jflte"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            java.lang.String r13 = "santos"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            java.lang.String r13 = "t0"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x0198
            goto L_0x01b1
        L_0x0198:
            int r0 = com.google.android.gms.internal.ads.btw.f43878a     // Catch:{ Exception -> 0x0245 }
            if (r0 > r12) goto L_0x01af
            java.lang.String r0 = com.google.android.gms.internal.ads.btw.f43879b     // Catch:{ Exception -> 0x0245 }
            java.lang.String r12 = "jflte"
            boolean r0 = r0.startsWith(r12)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x01af
            java.lang.String r0 = "OMX.qcom.video.decoder.vp8"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x01af
            goto L_0x01b1
        L_0x01af:
            r0 = 1
            goto L_0x01b2
        L_0x01b1:
            r0 = 0
        L_0x01b2:
            if (r0 == 0) goto L_0x0240
            java.lang.String[] r12 = r9.getSupportedTypes()     // Catch:{ Exception -> 0x0245 }
            int r13 = r12.length     // Catch:{ Exception -> 0x0245 }
            r14 = 0
        L_0x01ba:
            if (r14 >= r13) goto L_0x0240
            r0 = r12[r14]     // Catch:{ Exception -> 0x0245 }
            boolean r15 = r0.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0245 }
            if (r15 == 0) goto L_0x023b
            android.media.MediaCodecInfo$CodecCapabilities r0 = r9.getCapabilitiesForType(r0)     // Catch:{ Exception -> 0x022b }
            boolean r15 = r2.mo30561a(r4, r0)     // Catch:{ Exception -> 0x022b }
            int r11 = com.google.android.gms.internal.ads.btw.f43878a     // Catch:{ Exception -> 0x022b }
            r7 = 22
            if (r11 > r7) goto L_0x01f8
            java.lang.String r7 = com.google.android.gms.internal.ads.btw.f43881d     // Catch:{ Exception -> 0x022b }
            java.lang.String r11 = "ODROID-XU3"
            boolean r7 = r7.equals(r11)     // Catch:{ Exception -> 0x022b }
            if (r7 != 0) goto L_0x01e6
            java.lang.String r7 = com.google.android.gms.internal.ads.btw.f43881d     // Catch:{ Exception -> 0x022b }
            java.lang.String r11 = "Nexus 10"
            boolean r7 = r7.equals(r11)     // Catch:{ Exception -> 0x022b }
            if (r7 == 0) goto L_0x01f8
        L_0x01e6:
            java.lang.String r7 = "OMX.Exynos.AVC.Decoder"
            boolean r7 = r7.equals(r10)     // Catch:{ Exception -> 0x022b }
            if (r7 != 0) goto L_0x01f6
            java.lang.String r7 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r7 = r7.equals(r10)     // Catch:{ Exception -> 0x022b }
            if (r7 == 0) goto L_0x01f8
        L_0x01f6:
            r7 = 1
            goto L_0x01f9
        L_0x01f8:
            r7 = 0
        L_0x01f9:
            if (r6 == 0) goto L_0x0202
            boolean r11 = r1.f43590b     // Catch:{ Exception -> 0x022b }
            if (r11 == r15) goto L_0x0200
            goto L_0x0202
        L_0x0200:
            r11 = 0
            goto L_0x0209
        L_0x0202:
            if (r6 != 0) goto L_0x0211
            boolean r11 = r1.f43590b     // Catch:{ Exception -> 0x022b }
            if (r11 != 0) goto L_0x0211
            goto L_0x0200
        L_0x0209:
            com.google.android.gms.internal.ads.bqc r0 = com.google.android.gms.internal.ads.bqc.m36434a(r10, r4, r0, r7, r11)     // Catch:{ Exception -> 0x022b }
            r3.add(r0)     // Catch:{ Exception -> 0x022b }
            goto L_0x023b
        L_0x0211:
            r11 = 0
            if (r6 != 0) goto L_0x023b
            if (r15 == 0) goto L_0x023b
            java.lang.String r15 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x022b }
            java.lang.String r11 = ".secure"
            java.lang.String r11 = r15.concat(r11)     // Catch:{ Exception -> 0x022b }
            r15 = 1
            com.google.android.gms.internal.ads.bqc r0 = com.google.android.gms.internal.ads.bqc.m36434a(r11, r4, r0, r7, r15)     // Catch:{ Exception -> 0x0229 }
            r3.add(r0)     // Catch:{ Exception -> 0x0229 }
            return r3
        L_0x0229:
            r0 = move-exception
            goto L_0x022d
        L_0x022b:
            r0 = move-exception
            r15 = 1
        L_0x022d:
            int r7 = com.google.android.gms.internal.ads.btw.f43878a     // Catch:{ Exception -> 0x0245 }
            r11 = 23
            if (r7 > r11) goto L_0x023a
            boolean r7 = r3.isEmpty()     // Catch:{ Exception -> 0x0245 }
            if (r7 != 0) goto L_0x023a
            goto L_0x023c
        L_0x023a:
            throw r0     // Catch:{ Exception -> 0x0245 }
        L_0x023b:
            r15 = 1
        L_0x023c:
            int r14 = r14 + 1
            goto L_0x01ba
        L_0x0240:
            int r8 = r8 + 1
            goto L_0x0014
        L_0x0244:
            return r3
        L_0x0245:
            r0 = move-exception
            com.google.android.gms.internal.ads.bqj r1 = new com.google.android.gms.internal.ads.bqj
            r2 = 0
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bqh.m36472a(com.google.android.gms.internal.ads.bqh$a, com.google.android.gms.internal.ads.bqk):java.util.List");
    }

    /* renamed from: a */
    static Pair<Integer, Integer> m36470a(String str, String[] strArr) {
        Integer num;
        Integer num2;
        if (strArr.length < 2) {
            String str2 = "Ignoring malformed AVC codec string: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                Integer valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                num = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
                num2 = valueOf2;
            } else if (strArr.length >= 3) {
                num2 = Integer.valueOf(Integer.parseInt(strArr[1]));
                num = Integer.valueOf(Integer.parseInt(strArr[2]));
            } else {
                String str3 = "Ignoring malformed AVC codec string: ";
                String valueOf3 = String.valueOf(str);
                if (valueOf3.length() != 0) {
                    str3.concat(valueOf3);
                } else {
                    new String(str3);
                }
                return null;
            }
            Integer valueOf4 = Integer.valueOf(f43586e.get(num2.intValue()));
            if (valueOf4 == null) {
                return null;
            }
            Integer valueOf5 = Integer.valueOf(f43587f.get(num.intValue()));
            if (valueOf5 == null) {
                return null;
            }
            return new Pair<>(valueOf4, valueOf5);
        } catch (NumberFormatException unused) {
            String str4 = "Ignoring malformed AVC codec string: ";
            String valueOf6 = String.valueOf(str);
            if (valueOf6.length() != 0) {
                str4.concat(valueOf6);
            } else {
                new String(str4);
            }
            return null;
        }
    }

    static {
        bqc bqc = new bqc("OMX.google.raw.decoder", null, null, false, false);
        f43582a = bqc;
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43586e = sparseIntArray;
        sparseIntArray.put(66, 1);
        f43586e.put(77, 2);
        f43586e.put(88, 4);
        f43586e.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f43587f = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        f43587f.put(11, 4);
        f43587f.put(12, 8);
        f43587f.put(13, 16);
        f43587f.put(20, 32);
        f43587f.put(21, 64);
        f43587f.put(22, 128);
        f43587f.put(30, UnReadVideoExperiment.BROWSE_RECORD_LIST);
        f43587f.put(31, UnReadVideoExperiment.LIKE_USER_LIST);
        f43587f.put(32, PreloadTask.BYTE_UNIT_NUMBER);
        f43587f.put(40, 2048);
        f43587f.put(41, 4096);
        f43587f.put(42, VideoCacheReadBuffersizeExperiment.DEFAULT);
        f43587f.put(50, 16384);
        f43587f.put(51, 32768);
        f43587f.put(52, 65536);
        HashMap hashMap = new HashMap();
        f43584c = hashMap;
        hashMap.put("L30", Integer.valueOf(1));
        f43584c.put("L60", Integer.valueOf(4));
        f43584c.put("L63", Integer.valueOf(16));
        f43584c.put("L90", Integer.valueOf(64));
        f43584c.put("L93", Integer.valueOf(UnReadVideoExperiment.BROWSE_RECORD_LIST));
        f43584c.put("L120", Integer.valueOf(PreloadTask.BYTE_UNIT_NUMBER));
        f43584c.put("L123", Integer.valueOf(4096));
        f43584c.put("L150", Integer.valueOf(16384));
        f43584c.put("L153", Integer.valueOf(65536));
        f43584c.put("L156", Integer.valueOf(262144));
        f43584c.put("L180", Integer.valueOf(1048576));
        f43584c.put("L183", Integer.valueOf(4194304));
        f43584c.put("L186", Integer.valueOf(16777216));
        f43584c.put("H30", Integer.valueOf(2));
        f43584c.put("H60", Integer.valueOf(8));
        f43584c.put("H63", Integer.valueOf(32));
        f43584c.put("H90", Integer.valueOf(128));
        f43584c.put("H93", Integer.valueOf(UnReadVideoExperiment.LIKE_USER_LIST));
        f43584c.put("H120", Integer.valueOf(2048));
        f43584c.put("H123", Integer.valueOf(VideoCacheReadBuffersizeExperiment.DEFAULT));
        f43584c.put("H150", Integer.valueOf(32768));
        f43584c.put("H153", Integer.valueOf(131072));
        f43584c.put("H156", Integer.valueOf(524288));
        f43584c.put("H180", Integer.valueOf(2097152));
        f43584c.put("H183", Integer.valueOf(8388608));
        f43584c.put("H186", Integer.valueOf(33554432));
    }
}
