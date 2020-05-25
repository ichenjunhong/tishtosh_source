package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yb */
public abstract class C16392yb extends bgp implements C16391ya {
    public C16392yb() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3, types: [com.google.android.gms.internal.ads.yf] */
    /* JADX WARNING: type inference failed for: r4v5, types: [com.google.android.gms.internal.ads.yh] */
    /* JADX WARNING: type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.yf] */
    /* JADX WARNING: type inference failed for: r4v8, types: [com.google.android.gms.internal.ads.m] */
    /* JADX WARNING: type inference failed for: r4v10, types: [com.google.android.gms.internal.ads.o] */
    /* JADX WARNING: type inference failed for: r4v12, types: [com.google.android.gms.internal.ads.m] */
    /* JADX WARNING: type inference failed for: r4v13, types: [com.google.android.gms.internal.ads.xy] */
    /* JADX WARNING: type inference failed for: r4v15, types: [com.google.android.gms.internal.ads.xz] */
    /* JADX WARNING: type inference failed for: r4v17, types: [com.google.android.gms.internal.ads.xy] */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v2
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.google.android.gms.internal.ads.o, com.google.android.gms.internal.ads.yh, com.google.android.gms.internal.ads.yf, com.google.android.gms.internal.ads.m, com.google.android.gms.internal.ads.xz, com.google.android.gms.internal.ads.xy]
      uses: [com.google.android.gms.internal.ads.yf, com.google.android.gms.internal.ads.m, com.google.android.gms.internal.ads.xy]
      mth insns count: 95
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            r4 = 34
            if (r1 == r4) goto L_0x0123
            r4 = 0
            switch(r1) {
                case 1: goto L_0x0114;
                case 2: goto L_0x010d;
                case 3: goto L_0x00ec;
                default: goto L_0x0008;
            }
        L_0x0008:
            switch(r1) {
                case 5: goto L_0x00e1;
                case 6: goto L_0x00da;
                case 7: goto L_0x00d3;
                case 8: goto L_0x00cc;
                case 9: goto L_0x00bd;
                case 10: goto L_0x00ad;
                case 11: goto L_0x009d;
                case 12: goto L_0x0091;
                case 13: goto L_0x0085;
                case 14: goto L_0x0063;
                case 15: goto L_0x0057;
                case 16: goto L_0x0035;
                case 17: goto L_0x0029;
                case 18: goto L_0x0019;
                case 19: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            r1 = 0
            return r1
        L_0x000d:
            java.lang.String r1 = r2.readString()
            r0.mo31495c(r1)
            r3.writeNoException()
            goto L_0x012d
        L_0x0019:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.a.b r1 = com.google.android.gms.p1027a.C14882b.C14883a.m30535a(r1)
            r0.mo31484a(r1)
            r3.writeNoException()
            goto L_0x012d
        L_0x0029:
            java.lang.String r1 = r2.readString()
            r0.mo31489a(r1)
            r3.writeNoException()
            goto L_0x012d
        L_0x0035:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x003c
            goto L_0x004f
        L_0x003c:
            java.lang.String r2 = "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C16388xy
            if (r4 == 0) goto L_0x004a
            r4 = r2
            com.google.android.gms.internal.ads.xy r4 = (com.google.android.gms.internal.ads.C16388xy) r4
            goto L_0x004f
        L_0x004a:
            com.google.android.gms.internal.ads.xz r4 = new com.google.android.gms.internal.ads.xz
            r4.<init>(r1)
        L_0x004f:
            r0.mo31486a(r4)
            r3.writeNoException()
            goto L_0x012d
        L_0x0057:
            android.os.Bundle r1 = r0.mo31491b()
            r3.writeNoException()
            com.google.android.gms.internal.ads.bgq.m35600b(r3, r1)
            goto L_0x012d
        L_0x0063:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x006a
            goto L_0x007d
        L_0x006a:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdMetadataListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C16066m
            if (r4 == 0) goto L_0x0078
            r4 = r2
            com.google.android.gms.internal.ads.m r4 = (com.google.android.gms.internal.ads.C16066m) r4
            goto L_0x007d
        L_0x0078:
            com.google.android.gms.internal.ads.o r4 = new com.google.android.gms.internal.ads.o
            r4.<init>(r1)
        L_0x007d:
            r0.mo31485a(r4)
            r3.writeNoException()
            goto L_0x012d
        L_0x0085:
            java.lang.String r1 = r2.readString()
            r0.mo31493b(r1)
            r3.writeNoException()
            goto L_0x012d
        L_0x0091:
            java.lang.String r1 = r0.mo31501g()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x012d
        L_0x009d:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.a.b r1 = com.google.android.gms.p1027a.C14882b.C14883a.m30535a(r1)
            r0.mo31498d(r1)
            r3.writeNoException()
            goto L_0x012d
        L_0x00ad:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.a.b r1 = com.google.android.gms.p1027a.C14882b.C14883a.m30535a(r1)
            r0.mo31494c(r1)
            r3.writeNoException()
            goto L_0x012d
        L_0x00bd:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.a.b r1 = com.google.android.gms.p1027a.C14882b.C14883a.m30535a(r1)
            r0.mo31492b(r1)
            r3.writeNoException()
            goto L_0x012d
        L_0x00cc:
            r0.mo31500f()
            r3.writeNoException()
            goto L_0x012d
        L_0x00d3:
            r0.mo31499e()
            r3.writeNoException()
            goto L_0x012d
        L_0x00da:
            r0.mo31497d()
            r3.writeNoException()
            goto L_0x012d
        L_0x00e1:
            boolean r1 = r0.mo31496c()
            r3.writeNoException()
            com.google.android.gms.internal.ads.bgq.m35597a(r3, r1)
            goto L_0x012d
        L_0x00ec:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x00f3
            goto L_0x0106
        L_0x00f3:
            java.lang.String r2 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C16396yf
            if (r4 == 0) goto L_0x0101
            r4 = r2
            com.google.android.gms.internal.ads.yf r4 = (com.google.android.gms.internal.ads.C16396yf) r4
            goto L_0x0106
        L_0x0101:
            com.google.android.gms.internal.ads.yh r4 = new com.google.android.gms.internal.ads.yh
            r4.<init>(r1)
        L_0x0106:
            r0.mo31487a(r4)
            r3.writeNoException()
            goto L_0x012d
        L_0x010d:
            r0.mo31483a()
            r3.writeNoException()
            goto L_0x012d
        L_0x0114:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbad> r1 = com.google.android.gms.internal.ads.zzbad.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.bgq.m35594a(r2, r1)
            com.google.android.gms.internal.ads.zzbad r1 = (com.google.android.gms.internal.ads.zzbad) r1
            r0.mo31488a(r1)
            r3.writeNoException()
            goto L_0x012d
        L_0x0123:
            boolean r1 = com.google.android.gms.internal.ads.bgq.m35598a(r2)
            r0.mo31490a(r1)
            r3.writeNoException()
        L_0x012d:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16392yb.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
