package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vu */
public abstract class C16330vu extends bgp implements C16329vt {
    public C16330vu() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2, types: [com.google.android.gms.internal.ads.vw] */
    /* JADX WARNING: type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.vy] */
    /* JADX WARNING: type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.vw] */
    /* JADX WARNING: type inference failed for: r5v7, types: [com.google.android.gms.internal.ads.vz] */
    /* JADX WARNING: type inference failed for: r5v10, types: [com.google.android.gms.internal.ads.wa] */
    /* JADX WARNING: type inference failed for: r5v11, types: [com.google.android.gms.internal.ads.vz] */
    /* JADX WARNING: type inference failed for: r5v12, types: [com.google.android.gms.internal.ads.vz] */
    /* JADX WARNING: type inference failed for: r5v15, types: [com.google.android.gms.internal.ads.wa] */
    /* JADX WARNING: type inference failed for: r5v16, types: [com.google.android.gms.internal.ads.vz] */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v1
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.google.android.gms.internal.ads.wa, com.google.android.gms.internal.ads.vy, com.google.android.gms.internal.ads.vw, com.google.android.gms.internal.ads.vz]
      uses: [com.google.android.gms.internal.ads.vw, com.google.android.gms.internal.ads.vz]
      mth insns count: 55
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            r5 = 0
            switch(r2) {
                case 1: goto L_0x007e;
                case 2: goto L_0x0056;
                case 3: goto L_0x0004;
                case 4: goto L_0x002e;
                case 5: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r2 = 0
            return r2
        L_0x0006:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzaxx> r2 = com.google.android.gms.internal.ads.zzaxx.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.bgq.m35594a(r3, r2)
            com.google.android.gms.internal.ads.zzaxx r2 = (com.google.android.gms.internal.ads.zzaxx) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x0015
            goto L_0x0027
        L_0x0015:
            java.lang.String r5 = "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener"
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.C16335vz
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.internal.ads.vz r5 = (com.google.android.gms.internal.ads.C16335vz) r5
            goto L_0x0027
        L_0x0022:
            com.google.android.gms.internal.ads.wa r5 = new com.google.android.gms.internal.ads.wa
            r5.<init>(r3)
        L_0x0027:
            r1.mo31447b(r2, r5)
            r4.writeNoException()
            goto L_0x0090
        L_0x002e:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzaxx> r2 = com.google.android.gms.internal.ads.zzaxx.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.bgq.m35594a(r3, r2)
            com.google.android.gms.internal.ads.zzaxx r2 = (com.google.android.gms.internal.ads.zzaxx) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x003d
            goto L_0x004f
        L_0x003d:
            java.lang.String r5 = "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener"
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.C16335vz
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.vz r5 = (com.google.android.gms.internal.ads.C16335vz) r5
            goto L_0x004f
        L_0x004a:
            com.google.android.gms.internal.ads.wa r5 = new com.google.android.gms.internal.ads.wa
            r5.<init>(r3)
        L_0x004f:
            r1.mo31446a(r2, r5)
            r4.writeNoException()
            goto L_0x0090
        L_0x0056:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzaxe> r2 = com.google.android.gms.internal.ads.zzaxe.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.bgq.m35594a(r3, r2)
            com.google.android.gms.internal.ads.zzaxe r2 = (com.google.android.gms.internal.ads.zzaxe) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x0065
            goto L_0x0077
        L_0x0065:
            java.lang.String r5 = "com.google.android.gms.ads.internal.request.IAdResponseListener"
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.C16332vw
            if (r0 == 0) goto L_0x0072
            com.google.android.gms.internal.ads.vw r5 = (com.google.android.gms.internal.ads.C16332vw) r5
            goto L_0x0077
        L_0x0072:
            com.google.android.gms.internal.ads.vy r5 = new com.google.android.gms.internal.ads.vy
            r5.<init>(r3)
        L_0x0077:
            r1.mo31445a(r2, r5)
            r4.writeNoException()
            goto L_0x0090
        L_0x007e:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzaxe> r2 = com.google.android.gms.internal.ads.zzaxe.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.bgq.m35594a(r3, r2)
            com.google.android.gms.internal.ads.zzaxe r2 = (com.google.android.gms.internal.ads.zzaxe) r2
            com.google.android.gms.internal.ads.zzaxi r2 = r1.mo31444a(r2)
            r4.writeNoException()
            com.google.android.gms.internal.ads.bgq.m35600b(r4, r2)
        L_0x0090:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16330vu.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
