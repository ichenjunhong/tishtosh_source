package com.p683ss.android.ugc.aweme.shortvideo.p2266z.p2267a;

import com.p683ss.android.ugc.aweme.shortvideo.p2178c.C42484b;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.watermark.C48248j;
import com.p683ss.android.ugc.aweme.watermark.C48249k;
import com.p683ss.android.ugc.aweme.watermark.C48259s;
import com.p683ss.android.vesdk.VEListener.C50547k;
import com.p683ss.android.vesdk.VEWatermarkParam;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.z.a.b */
public final class C45637b implements C45641e {

    /* renamed from: a */
    private volatile boolean f115412a;

    /* renamed from: b */
    private C48249k f115413b;

    /* renamed from: c */
    private C42484b f115414c;

    /* renamed from: d */
    private final String f115415d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.a.b$a */
    public static final class C45638a implements C50547k {

        /* renamed from: a */
        final /* synthetic */ C45637b f115416a;

        /* renamed from: b */
        final /* synthetic */ C48259s f115417b;

        /* renamed from: c */
        final /* synthetic */ C45639c f115418c;

        public final void onCompileDone() {
            C45639c cVar = this.f115418c;
            if (cVar != null) {
                cVar.mo92026a();
            }
            this.f115416a.mo92024a((C48249k) this.f115417b);
        }

        public final void onCompileProgress(float f) {
            C45639c cVar = this.f115418c;
            if (cVar != null) {
                cVar.mo92027a(f);
            }
        }

        C45638a(C45637b bVar, C48259s sVar, C45639c cVar) {
            this.f115416a = bVar;
            this.f115417b = sVar;
            this.f115418c = cVar;
        }

        public final void onCompileError(int i, int i2, float f, String str) {
            C45639c cVar = this.f115418c;
            if (cVar != null) {
                if (str == null) {
                    str = "";
                }
                cVar.mo92028a(i, str, i2);
            }
            this.f115416a.mo92024a((C48249k) this.f115417b);
        }
    }

    /* renamed from: a */
    public final void mo92023a() {
        if (this.f115412a) {
            C48249k kVar = this.f115413b;
            if (kVar != null) {
                m99380b(kVar);
            }
            C42484b bVar = this.f115414c;
            if (bVar != null) {
                bVar.mo43082p();
            }
            this.f115414c = null;
            this.f115412a = false;
        }
    }

    public C45637b(String str) {
        C52711k.m112240b(str, "workSpace");
        this.f115415d = str;
    }

    /* renamed from: a */
    public final void mo92024a(C48249k kVar) {
        this.f115412a = false;
        C42484b bVar = this.f115414c;
        if (bVar != null) {
            bVar.mo43082p();
        }
        this.f115414c = null;
        m99380b(kVar);
    }

    /* renamed from: b */
    private static void m99380b(C48249k kVar) {
        boolean z;
        boolean z2;
        VEWatermarkParam vEWatermarkParam = kVar.f121413e;
        if (vEWatermarkParam != null) {
            String[] strArr = vEWatermarkParam.images;
            if (strArr != null) {
                if (strArr.length == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!(!z2)) {
                    strArr = null;
                }
                if (strArr != null) {
                    for (String c : strArr) {
                        C48016e.m103947c(c);
                    }
                }
            }
        }
        VEWatermarkParam vEWatermarkParam2 = kVar.f121413e;
        if (vEWatermarkParam2 != null) {
            String[] strArr2 = vEWatermarkParam2.secondHalfImages;
            if (strArr2 != null) {
                if (strArr2.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(true ^ z)) {
                    strArr2 = null;
                }
                if (strArr2 != null) {
                    for (String c2 : strArr2) {
                        C48016e.m103947c(c2);
                    }
                }
            }
        }
        C48248j jVar = kVar.f121409a;
        if (jVar != null) {
            String str = jVar.f121404a;
            if (str != null) {
                C48016e.m103947c(str);
            }
        }
        C48248j jVar2 = kVar.f121409a;
        if (jVar2 != null) {
            String str2 = jVar2.f121405b;
            if (str2 != null) {
                C48016e.m103947c(str2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92025a(com.p683ss.android.ugc.aweme.watermark.C48259s r21, com.p683ss.android.ugc.aweme.shortvideo.p2266z.p2267a.C45639c r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.String r3 = "watermarkParam"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)
            boolean r3 = r1 instanceof com.p683ss.android.ugc.aweme.watermark.C48249k
            if (r3 == 0) goto L_0x0258
            r3 = r1
            com.ss.android.ugc.aweme.watermark.k r3 = (com.p683ss.android.ugc.aweme.watermark.C48249k) r3
            com.ss.android.vesdk.VEWatermarkParam r4 = r3.f121413e
            r5 = -1
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x0038
            com.ss.android.vesdk.VEWatermarkParam r4 = r3.f121413e
            if (r4 != 0) goto L_0x0020
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0020:
            java.lang.String[] r4 = r4.images
            if (r4 == 0) goto L_0x002f
            int r4 = r4.length
            if (r4 != 0) goto L_0x0029
            r4 = 1
            goto L_0x002a
        L_0x0029:
            r4 = 0
        L_0x002a:
            if (r4 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r4 = 0
            goto L_0x0030
        L_0x002f:
            r4 = 1
        L_0x0030:
            if (r4 == 0) goto L_0x0038
            java.lang.String r1 = "images in veWatermarkParam is null or empty"
            r2.mo92028a(r5, r1, r7)
            return
        L_0x0038:
            com.p683ss.android.ugc.aweme.port.p2082in.C39618d.m88217f()
            com.ss.android.ugc.aweme.shortvideo.c.b r4 = r0.f115414c
            r8 = 2
            if (r4 != 0) goto L_0x004f
            com.ss.android.ugc.aweme.shortvideo.c.b r4 = new com.ss.android.ugc.aweme.shortvideo.c.b
            java.lang.String r9 = r0.f115415d
            r4.<init>(r9)
            r4.mo43019a(r7)
            r4.mo43046c(r8)
            r0.f115414c = r4
        L_0x004f:
            com.ss.android.ugc.aweme.shortvideo.c.b r4 = r0.f115414c
            if (r4 == 0) goto L_0x0257
            r0.f115413b = r3
            com.ss.android.vesdk.VEWatermarkParam r9 = r3.f121413e
            if (r9 == 0) goto L_0x0060
            com.ss.android.vesdk.VEVideoEncodeSettings r9 = r3.f121414f
            com.ss.android.vesdk.VEWatermarkParam r10 = r3.f121413e
            r9.setWatermark(r10)
        L_0x0060:
            com.ss.android.ugc.aweme.watermark.j r9 = r3.f121409a
            r10 = 3
            if (r9 == 0) goto L_0x00c2
            com.ss.android.ugc.aweme.watermark.j r9 = r3.f121409a
            if (r9 == 0) goto L_0x00dd
            r5 = 10
            int[] r5 = new int[r5]
            int r11 = r9.f121407d
            if (r11 > 0) goto L_0x007a
            java.lang.String r11 = r1.f121455g
            com.p683ss.android.vesdk.VEUtils.getVideoFileInfo(r11, r5)
            r5 = r5[r10]
            r9.f121407d = r5
        L_0x007a:
            com.ss.android.ugc.asve.c.e r5 = new com.ss.android.ugc.asve.c.e
            java.lang.String[] r11 = new java.lang.String[r8]
            java.lang.String r12 = r1.f121455g
            r11[r7] = r12
            java.lang.String r12 = r9.f121404a
            r11[r6] = r12
            r5.<init>(r11)
            com.ss.android.vesdk.o$j r11 = r3.f121411c
            r5.mo43100a(r11)
            int[] r11 = new int[r8]
            r11[r7] = r7
            int r12 = r9.f121407d
            r11[r6] = r12
            r5.f55846a = r11
            int[] r11 = new int[r8]
            int r12 = r9.f121407d
            r11[r7] = r12
            int r12 = r9.f121407d
            int r13 = r9.f121406c
            int r12 = r12 + r13
            r11[r6] = r12
            r5.f55847b = r11
            com.ss.android.ugc.aweme.watermark.j r11 = r3.f121409a
            if (r11 != 0) goto L_0x00ae
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00ae:
            java.lang.String[] r11 = r11.f121408e
            r5.f55848c = r11
            com.ss.android.ugc.asve.c.d r5 = (com.p683ss.android.ugc.asve.p1239c.C20348d) r5
            int r5 = r4.mo42990a(r5)
            com.ss.android.vesdk.VEWatermarkParam r11 = r3.f121413e
            if (r11 == 0) goto L_0x00dd
            int r9 = r9.f121407d
            long r12 = (long) r9
            r11.duration = r12
            goto L_0x00dd
        L_0x00c2:
            com.ss.android.vesdk.VEWatermarkParam r9 = r3.f121413e
            if (r9 != 0) goto L_0x00c7
            goto L_0x00dd
        L_0x00c7:
            com.ss.android.ugc.asve.c.e r5 = new com.ss.android.ugc.asve.c.e
            java.lang.String[] r9 = new java.lang.String[r6]
            java.lang.String r11 = r1.f121455g
            r9[r7] = r11
            r5.<init>(r9)
            com.ss.android.vesdk.o$j r9 = r3.f121411c
            r5.mo43100a(r9)
            com.ss.android.ugc.asve.c.d r5 = (com.p683ss.android.ugc.asve.p1239c.C20348d) r5
            int r5 = r4.mo42990a(r5)
        L_0x00dd:
            if (r5 == 0) goto L_0x00f4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "init editor failed with errorCode:"
            r1.<init>(r4)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r2.mo92028a(r5, r1, r7)
            r0.mo92024a(r3)
            return
        L_0x00f4:
            com.ss.android.ugc.aweme.watermark.b r5 = r3.f121410b
            if (r5 == 0) goto L_0x023b
            r4.mo43046c(r10)
            com.ss.android.vesdk.filterparam.VEImageAddFilterParam r5 = new com.ss.android.vesdk.filterparam.VEImageAddFilterParam
            r5.<init>()
            com.ss.android.ugc.aweme.watermark.b r10 = r3.f121410b
            if (r10 == 0) goto L_0x0107
            java.lang.String r10 = r10.f121376d
            goto L_0x0108
        L_0x0107:
            r10 = 0
        L_0x0108:
            r5.imagePath = r10
            com.ss.android.ugc.aweme.watermark.b r10 = r3.f121410b
            if (r10 == 0) goto L_0x0115
            int r10 = r10.f121374b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x0116
        L_0x0115:
            r10 = 0
        L_0x0116:
            if (r10 != 0) goto L_0x011b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x011b:
            int r10 = r10.intValue()
            com.ss.android.ugc.aweme.watermark.b r11 = r3.f121410b
            if (r11 == 0) goto L_0x012a
            int r11 = r11.f121375c
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x012b
        L_0x012a:
            r11 = 0
        L_0x012b:
            if (r11 != 0) goto L_0x0130
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0130:
            int r11 = r11.intValue()
            com.ss.android.ugc.aweme.watermark.b r12 = r3.f121410b
            if (r12 == 0) goto L_0x013f
            int r12 = r12.f121377e
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0140
        L_0x013f:
            r12 = 0
        L_0x0140:
            if (r12 != 0) goto L_0x0145
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0145:
            int r12 = r12.intValue()
            com.ss.android.ugc.aweme.watermark.b r13 = r3.f121410b
            if (r13 == 0) goto L_0x0154
            int r13 = r13.f121378f
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            goto L_0x0155
        L_0x0154:
            r13 = 0
        L_0x0155:
            if (r13 != 0) goto L_0x015a
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x015a:
            int r13 = r13.intValue()
            com.ss.android.vesdk.o$c r14 = com.p683ss.android.vesdk.C50720o.C50742c.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE
            r4.mo42995a(r14)
            com.ss.android.ugc.aweme.watermark.b r14 = r3.f121410b
            if (r14 == 0) goto L_0x016e
            boolean r14 = r14.f121379g
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            goto L_0x016f
        L_0x016e:
            r14 = 0
        L_0x016f:
            if (r14 != 0) goto L_0x0174
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0174:
            boolean r14 = r14.booleanValue()
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r14 == 0) goto L_0x01af
            int r7 = r11 + r12
            r4.mo43047c(r10, r7)
            r8 = 0
            r5.f127235x = r8
            double r13 = (double) r11
            r17 = r10
            double r9 = (double) r7
            java.lang.Double.isNaN(r9)
            double r9 = r9 * r15
            java.lang.Double.isNaN(r13)
            double r13 = r13 / r9
            float r8 = (float) r13
            r5.f127236y = r8
            r8 = 1065353216(0x3f800000, float:1.0)
            r5.width = r8
            double r11 = (double) r12
            java.lang.Double.isNaN(r11)
            double r11 = r11 / r9
            float r8 = (float) r11
            r5.height = r8
            com.ss.android.vesdk.VEVideoEncodeSettings r8 = r3.f121414f
            r9 = 5
            r8.setResizeMode(r9)
            com.ss.android.vesdk.VEVideoEncodeSettings r8 = r3.f121414f
            r9 = r17
            r8.setVideoRes(r9, r7)
            goto L_0x0219
        L_0x01af:
            r9 = r10
            com.ss.android.ugc.aweme.watermark.j r10 = r3.f121409a
            if (r10 == 0) goto L_0x01d3
            com.ss.android.vesdk.o$c r7 = com.p683ss.android.vesdk.C50720o.C50742c.SCALE_MODE_CENTER_INSIDE
            r4.mo42995a(r7)
            if (r9 <= r11) goto L_0x01c0
            int r10 = r9 - r11
            r7 = r10
            r10 = r9
            goto L_0x01c3
        L_0x01c0:
            int r7 = r11 - r9
            r10 = r11
        L_0x01c3:
            com.ss.android.vesdk.VEWatermarkParam r9 = r3.f121413e
            if (r9 != 0) goto L_0x01ca
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01ca:
            int r11 = r9.xOffset
            int r14 = r7 / 2
            int r11 = r11 + r14
            r9.xOffset = r11
            r9 = r10
            goto L_0x01d4
        L_0x01d3:
            r10 = r11
        L_0x01d4:
            int r11 = r9 - r13
            float r11 = (float) r11
            r14 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r14
            r18 = r7
            double r6 = (double) r11
            double r1 = (double) r9
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r15
            java.lang.Double.isNaN(r6)
            double r6 = r6 / r1
            float r6 = (float) r6
            r5.f127235x = r6
            int r6 = r10 - r12
            float r6 = (float) r6
            int r7 = r18 / 2
            float r7 = (float) r7
            float r11 = r11 - r7
            float r6 = r6 - r11
            double r6 = (double) r6
            r19 = r9
            double r8 = (double) r10
            java.lang.Double.isNaN(r8)
            double r8 = r8 * r15
            java.lang.Double.isNaN(r6)
            double r6 = r6 / r8
            float r6 = (float) r6
            r5.f127236y = r6
            double r6 = (double) r13
            java.lang.Double.isNaN(r6)
            double r6 = r6 / r1
            float r1 = (float) r6
            r5.width = r1
            double r1 = (double) r12
            java.lang.Double.isNaN(r1)
            double r1 = r1 / r8
            float r1 = (float) r1
            r5.height = r1
            com.ss.android.vesdk.VEVideoEncodeSettings r1 = r3.f121414f
            r9 = r19
            r1.setVideoRes(r9, r10)
        L_0x0219:
            com.ss.android.vesdk.VEWatermarkParam r1 = r3.f121413e
            if (r1 != 0) goto L_0x0220
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0220:
            r2 = 0
            r1.secondHalfImages = r2
            r11 = 0
            r12 = 0
            r1 = r5
            com.ss.android.vesdk.filterparam.VEBaseFilterParam r1 = (com.p683ss.android.vesdk.filterparam.VEBaseFilterParam) r1
            r14 = 0
            com.ss.android.ugc.aweme.watermark.b r2 = r3.f121410b
            if (r2 != 0) goto L_0x0230
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0230:
            int r15 = r2.f121373a
            r10 = r4
            r13 = r1
            int r2 = r10.mo42975a(r11, r12, r13, r14, r15)
            r4.mo42982a(r2, r1)
        L_0x023b:
            r1 = 1
            r0.f115412a = r1
            int r1 = r3.f121412d
            r4.mo43038b(r1)
            r1 = r21
            java.lang.String r2 = r1.f121456h
            com.ss.android.vesdk.VEVideoEncodeSettings r3 = r3.f121414f
            com.ss.android.ugc.aweme.shortvideo.z.a.b$a r5 = new com.ss.android.ugc.aweme.shortvideo.z.a.b$a
            r6 = r22
            r5.<init>(r0, r1, r6)
            com.ss.android.vesdk.VEListener$k r5 = (com.p683ss.android.vesdk.VEListener.C50547k) r5
            r1 = 0
            r4.mo43023a(r2, r1, r3, r5)
            return
        L_0x0257:
            return
        L_0x0258:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "VideoWatermarkParam is needed when use VEVideoWatermarkCreator"
            r1.<init>(r2)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2266z.p2267a.C45637b.mo92025a(com.ss.android.ugc.aweme.watermark.s, com.ss.android.ugc.aweme.shortvideo.z.a.c):void");
    }
}
