package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.ov */
public abstract class C16142ov extends bgp implements C16141ou {
    public C16142ov() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: a */
    public static C16141ou m38291a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if (queryLocalInterface instanceof C16141ou) {
            return (C16141ou) queryLocalInterface;
        }
        return new C16143ow(iBinder);
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.ox] */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.google.android.gms.internal.ads.oz] */
    /* JADX WARNING: type inference failed for: r4v6, types: [com.google.android.gms.internal.ads.ox] */
    /* JADX WARNING: type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.zj] */
    /* JADX WARNING: type inference failed for: r4v9, types: [com.google.android.gms.internal.ads.zk] */
    /* JADX WARNING: type inference failed for: r4v11, types: [com.google.android.gms.internal.ads.zj] */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v1
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.google.android.gms.internal.ads.zk, com.google.android.gms.internal.ads.oz, com.google.android.gms.internal.ads.ox, com.google.android.gms.internal.ads.zj]
      uses: [com.google.android.gms.internal.ads.ox, com.google.android.gms.internal.ads.zj]
      mth insns count: 61
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
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            r4 = 0
            switch(r1) {
                case 1: goto L_0x00be;
                case 2: goto L_0x00ba;
                case 3: goto L_0x00b2;
                case 4: goto L_0x00ae;
                case 5: goto L_0x00aa;
                case 6: goto L_0x00a6;
                case 7: goto L_0x0088;
                case 8: goto L_0x0084;
                case 9: goto L_0x0078;
                case 10: goto L_0x0068;
                case 11: goto L_0x0064;
                case 12: goto L_0x005c;
                case 13: goto L_0x0057;
                case 14: goto L_0x004a;
                case 15: goto L_0x0045;
                case 16: goto L_0x0026;
                case 17: goto L_0x001d;
                case 18: goto L_0x0018;
                case 19: goto L_0x000b;
                case 20: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r1 = 0
            return r1
        L_0x0006:
            r0.mo31221k()
            goto L_0x00c1
        L_0x000b:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.bgq.m35594a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.mo31203a(r1)
            goto L_0x00c1
        L_0x0018:
            r0.mo31220j()
            goto L_0x00c1
        L_0x001d:
            int r1 = r2.readInt()
            r0.mo31212b(r1)
            goto L_0x00c1
        L_0x0026:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x002d
            goto L_0x0040
        L_0x002d:
            java.lang.String r2 = "com.google.android.gms.ads.internal.rewarded.client.IRewardItem"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C16427zj
            if (r4 == 0) goto L_0x003b
            r4 = r2
            com.google.android.gms.internal.ads.zj r4 = (com.google.android.gms.internal.ads.C16427zj) r4
            goto L_0x0040
        L_0x003b:
            com.google.android.gms.internal.ads.zk r4 = new com.google.android.gms.internal.ads.zk
            r4.<init>(r1)
        L_0x0040:
            r0.mo31207a(r4)
            goto L_0x00c1
        L_0x0045:
            r0.mo31219i()
            goto L_0x00c1
        L_0x004a:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbaz> r1 = com.google.android.gms.internal.ads.zzbaz.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.bgq.m35594a(r2, r1)
            com.google.android.gms.internal.ads.zzbaz r1 = (com.google.android.gms.internal.ads.zzbaz) r1
            r0.mo31208a(r1)
            goto L_0x00c1
        L_0x0057:
            r0.mo31218h()
            goto L_0x00c1
        L_0x005c:
            java.lang.String r1 = r2.readString()
            r0.mo31209a(r1)
            goto L_0x00c1
        L_0x0064:
            r0.mo31217g()
            goto L_0x00c1
        L_0x0068:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.fl r1 = com.google.android.gms.internal.ads.C15890fm.m37599a(r1)
            java.lang.String r2 = r2.readString()
            r0.mo31204a(r1, r2)
            goto L_0x00c1
        L_0x0078:
            java.lang.String r1 = r2.readString()
            java.lang.String r2 = r2.readString()
            r0.mo31210a(r1, r2)
            goto L_0x00c1
        L_0x0084:
            r0.mo31216f()
            goto L_0x00c1
        L_0x0088:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x008f
            goto L_0x00a2
        L_0x008f:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C16144ox
            if (r4 == 0) goto L_0x009d
            r4 = r2
            com.google.android.gms.internal.ads.ox r4 = (com.google.android.gms.internal.ads.C16144ox) r4
            goto L_0x00a2
        L_0x009d:
            com.google.android.gms.internal.ads.oz r4 = new com.google.android.gms.internal.ads.oz
            r4.<init>(r1)
        L_0x00a2:
            r0.mo31206a(r4)
            goto L_0x00c1
        L_0x00a6:
            r0.mo31215e()
            goto L_0x00c1
        L_0x00aa:
            r0.mo31214d()
            goto L_0x00c1
        L_0x00ae:
            r0.mo31213c()
            goto L_0x00c1
        L_0x00b2:
            int r1 = r2.readInt()
            r0.mo31202a(r1)
            goto L_0x00c1
        L_0x00ba:
            r0.mo31211b()
            goto L_0x00c1
        L_0x00be:
            r0.mo31201a()
        L_0x00c1:
            r3.writeNoException()
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16142ov.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
