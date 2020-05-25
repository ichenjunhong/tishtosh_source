package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qm */
public abstract class C16187qm extends bgp implements C16186ql {
    public C16187qm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.qp] */
    /* JADX WARNING: type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.qo] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r6v3, types: [com.google.android.gms.internal.ads.qo] */
    /* JADX WARNING: type inference failed for: r1v10, types: [com.google.android.gms.internal.ads.qc] */
    /* JADX WARNING: type inference failed for: r1v11, types: [com.google.android.gms.internal.ads.qb] */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.qb] */
    /* JADX WARNING: type inference failed for: r1v18, types: [com.google.android.gms.internal.ads.qe] */
    /* JADX WARNING: type inference failed for: r1v19, types: [com.google.android.gms.internal.ads.qd] */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r5v9, types: [com.google.android.gms.internal.ads.qd] */
    /* JADX WARNING: type inference failed for: r1v24, types: [com.google.android.gms.internal.ads.qk] */
    /* JADX WARNING: type inference failed for: r1v25, types: [com.google.android.gms.internal.ads.qj] */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r5v12, types: [com.google.android.gms.internal.ads.qj] */
    /* JADX WARNING: type inference failed for: r1v30, types: [com.google.android.gms.internal.ads.qg] */
    /* JADX WARNING: type inference failed for: r1v31, types: [com.google.android.gms.internal.ads.qf] */
    /* JADX WARNING: type inference failed for: r1v32 */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r5v15, types: [com.google.android.gms.internal.ads.qf] */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* JADX WARNING: type inference failed for: r1v35 */
    /* JADX WARNING: type inference failed for: r1v36 */
    /* JADX WARNING: type inference failed for: r1v37 */
    /* JADX WARNING: type inference failed for: r1v38 */
    /* JADX WARNING: type inference failed for: r1v39 */
    /* JADX WARNING: type inference failed for: r1v40 */
    /* JADX WARNING: type inference failed for: r1v41 */
    /* JADX WARNING: type inference failed for: r1v42 */
    /* JADX WARNING: type inference failed for: r1v43 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 21 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) throws android.os.RemoteException {
        /*
            r9 = this;
            r1 = 0
            switch(r10) {
                case 1: goto L_0x01a6;
                case 2: goto L_0x019b;
                case 3: goto L_0x0190;
                case 4: goto L_0x0004;
                case 5: goto L_0x0184;
                case 6: goto L_0x0004;
                case 7: goto L_0x0004;
                case 8: goto L_0x0004;
                case 9: goto L_0x0004;
                case 10: goto L_0x0174;
                case 11: goto L_0x0160;
                case 12: goto L_0x0004;
                case 13: goto L_0x010c;
                case 14: goto L_0x00c2;
                case 15: goto L_0x00ae;
                case 16: goto L_0x0064;
                case 17: goto L_0x0050;
                case 18: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r0 = 0
            return r0
        L_0x0006:
            java.lang.String r2 = r11.readString()
            java.lang.String r3 = r11.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzyv> r4 = com.google.android.gms.internal.ads.zzyv.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.bgq.m35594a(r11, r4)
            com.google.android.gms.internal.ads.zzyv r4 = (com.google.android.gms.internal.ads.zzyv) r4
            android.os.IBinder r5 = r11.readStrongBinder()
            com.google.android.gms.a.b r5 = com.google.android.gms.p1027a.C14882b.C14883a.m30535a(r5)
            android.os.IBinder r6 = r11.readStrongBinder()
            if (r6 != 0) goto L_0x0026
        L_0x0024:
            r6 = r1
            goto L_0x0039
        L_0x0026:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.ads.C16180qf
            if (r7 == 0) goto L_0x0033
            com.google.android.gms.internal.ads.qf r1 = (com.google.android.gms.internal.ads.C16180qf) r1
            goto L_0x0024
        L_0x0033:
            com.google.android.gms.internal.ads.qg r1 = new com.google.android.gms.internal.ads.qg
            r1.<init>(r6)
            goto L_0x0024
        L_0x0039:
            android.os.IBinder r0 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.ou r7 = com.google.android.gms.internal.ads.C16142ov.m38291a(r0)
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r0.mo31340a(r1, r2, r3, r4, r5, r6)
            r12.writeNoException()
            goto L_0x01f2
        L_0x0050:
            android.os.IBinder r0 = r11.readStrongBinder()
            com.google.android.gms.a.b r0 = com.google.android.gms.p1027a.C14882b.C14883a.m30535a(r0)
            boolean r0 = r9.mo31346c(r0)
            r12.writeNoException()
            com.google.android.gms.internal.ads.bgq.m35597a(r12, r0)
            goto L_0x01f2
        L_0x0064:
            java.lang.String r2 = r11.readString()
            java.lang.String r3 = r11.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzyv> r4 = com.google.android.gms.internal.ads.zzyv.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.bgq.m35594a(r11, r4)
            com.google.android.gms.internal.ads.zzyv r4 = (com.google.android.gms.internal.ads.zzyv) r4
            android.os.IBinder r5 = r11.readStrongBinder()
            com.google.android.gms.a.b r5 = com.google.android.gms.p1027a.C14882b.C14883a.m30535a(r5)
            android.os.IBinder r6 = r11.readStrongBinder()
            if (r6 != 0) goto L_0x0084
        L_0x0082:
            r6 = r1
            goto L_0x0097
        L_0x0084:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.ads.C16184qj
            if (r7 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.qj r1 = (com.google.android.gms.internal.ads.C16184qj) r1
            goto L_0x0082
        L_0x0091:
            com.google.android.gms.internal.ads.qk r1 = new com.google.android.gms.internal.ads.qk
            r1.<init>(r6)
            goto L_0x0082
        L_0x0097:
            android.os.IBinder r0 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.ou r7 = com.google.android.gms.internal.ads.C16142ov.m38291a(r0)
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r0.mo31341a(r1, r2, r3, r4, r5, r6)
            r12.writeNoException()
            goto L_0x01f2
        L_0x00ae:
            android.os.IBinder r0 = r11.readStrongBinder()
            com.google.android.gms.a.b r0 = com.google.android.gms.p1027a.C14882b.C14883a.m30535a(r0)
            boolean r0 = r9.mo31344b(r0)
            r12.writeNoException()
            com.google.android.gms.internal.ads.bgq.m35597a(r12, r0)
            goto L_0x01f2
        L_0x00c2:
            java.lang.String r2 = r11.readString()
            java.lang.String r3 = r11.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzyv> r4 = com.google.android.gms.internal.ads.zzyv.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.bgq.m35594a(r11, r4)
            com.google.android.gms.internal.ads.zzyv r4 = (com.google.android.gms.internal.ads.zzyv) r4
            android.os.IBinder r5 = r11.readStrongBinder()
            com.google.android.gms.a.b r5 = com.google.android.gms.p1027a.C14882b.C14883a.m30535a(r5)
            android.os.IBinder r6 = r11.readStrongBinder()
            if (r6 != 0) goto L_0x00e2
        L_0x00e0:
            r6 = r1
            goto L_0x00f5
        L_0x00e2:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.ads.C16178qd
            if (r7 == 0) goto L_0x00ef
            com.google.android.gms.internal.ads.qd r1 = (com.google.android.gms.internal.ads.C16178qd) r1
            goto L_0x00e0
        L_0x00ef:
            com.google.android.gms.internal.ads.qe r1 = new com.google.android.gms.internal.ads.qe
            r1.<init>(r6)
            goto L_0x00e0
        L_0x00f5:
            android.os.IBinder r0 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.ou r7 = com.google.android.gms.internal.ads.C16142ov.m38291a(r0)
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r0.mo31339a(r1, r2, r3, r4, r5, r6)
            r12.writeNoException()
            goto L_0x01f2
        L_0x010c:
            java.lang.String r2 = r11.readString()
            java.lang.String r3 = r11.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzyv> r4 = com.google.android.gms.internal.ads.zzyv.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.bgq.m35594a(r11, r4)
            com.google.android.gms.internal.ads.zzyv r4 = (com.google.android.gms.internal.ads.zzyv) r4
            android.os.IBinder r5 = r11.readStrongBinder()
            com.google.android.gms.a.b r5 = com.google.android.gms.p1027a.C14882b.C14883a.m30535a(r5)
            android.os.IBinder r6 = r11.readStrongBinder()
            if (r6 != 0) goto L_0x012c
        L_0x012a:
            r6 = r1
            goto L_0x013f
        L_0x012c:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.ads.C16176qb
            if (r7 == 0) goto L_0x0139
            com.google.android.gms.internal.ads.qb r1 = (com.google.android.gms.internal.ads.C16176qb) r1
            goto L_0x012a
        L_0x0139:
            com.google.android.gms.internal.ads.qc r1 = new com.google.android.gms.internal.ads.qc
            r1.<init>(r6)
            goto L_0x012a
        L_0x013f:
            android.os.IBinder r1 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.ou r7 = com.google.android.gms.internal.ads.C16142ov.m38291a(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzyz> r1 = com.google.android.gms.internal.ads.zzyz.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.bgq.m35594a(r11, r1)
            r8 = r0
            com.google.android.gms.internal.ads.zzyz r8 = (com.google.android.gms.internal.ads.zzyz) r8
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r0.mo31338a(r1, r2, r3, r4, r5, r6, r7)
            r12.writeNoException()
            goto L_0x01f2
        L_0x0160:
            java.lang.String[] r1 = r11.createStringArray()
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            java.lang.Object[] r0 = r11.createTypedArray(r2)
            android.os.Bundle[] r0 = (android.os.Bundle[]) r0
            r9.mo31342a(r1, r0)
            r12.writeNoException()
            goto L_0x01f2
        L_0x0174:
            android.os.IBinder r0 = r11.readStrongBinder()
            com.google.android.gms.a.b r0 = com.google.android.gms.p1027a.C14882b.C14883a.m30535a(r0)
            r9.mo31336a(r0)
            r12.writeNoException()
            goto L_0x01f2
        L_0x0184:
            com.google.android.gms.internal.ads.ak r0 = r9.mo31345c()
            r12.writeNoException()
            com.google.android.gms.internal.ads.bgq.m35595a(r12, r0)
            goto L_0x01f2
        L_0x0190:
            com.google.android.gms.internal.ads.zzaso r0 = r9.mo31343b()
            r12.writeNoException()
            com.google.android.gms.internal.ads.bgq.m35600b(r12, r0)
            goto L_0x01f2
        L_0x019b:
            com.google.android.gms.internal.ads.zzaso r0 = r9.mo31335a()
            r12.writeNoException()
            com.google.android.gms.internal.ads.bgq.m35600b(r12, r0)
            goto L_0x01f2
        L_0x01a6:
            android.os.IBinder r2 = r11.readStrongBinder()
            com.google.android.gms.a.b r2 = com.google.android.gms.p1027a.C14882b.C14883a.m30535a(r2)
            java.lang.String r3 = r11.readString()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.bgq.m35594a(r11, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = com.google.android.gms.internal.ads.bgq.m35594a(r11, r5)
            android.os.Bundle r5 = (android.os.Bundle) r5
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzyz> r6 = com.google.android.gms.internal.ads.zzyz.CREATOR
            android.os.Parcelable r6 = com.google.android.gms.internal.ads.bgq.m35594a(r11, r6)
            com.google.android.gms.internal.ads.zzyz r6 = (com.google.android.gms.internal.ads.zzyz) r6
            android.os.IBinder r0 = r11.readStrongBinder()
            if (r0 != 0) goto L_0x01d2
        L_0x01d0:
            r7 = r1
            goto L_0x01e5
        L_0x01d2:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.ads.C16189qo
            if (r7 == 0) goto L_0x01df
            com.google.android.gms.internal.ads.qo r1 = (com.google.android.gms.internal.ads.C16189qo) r1
            goto L_0x01d0
        L_0x01df:
            com.google.android.gms.internal.ads.qp r1 = new com.google.android.gms.internal.ads.qp
            r1.<init>(r0)
            goto L_0x01d0
        L_0x01e5:
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r0.mo31337a(r1, r2, r3, r4, r5, r6)
            r12.writeNoException()
        L_0x01f2:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16187qm.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
