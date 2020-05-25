package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gk */
public abstract class C15915gk extends bgp implements C15914gj {
    public C15915gk() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.gh] */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.google.android.gms.internal.ads.gi] */
    /* JADX WARNING: type inference failed for: r4v6, types: [com.google.android.gms.internal.ads.gh] */
    /* JADX WARNING: type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.ae] */
    /* JADX WARNING: type inference failed for: r4v9, types: [com.google.android.gms.internal.ads.af] */
    /* JADX WARNING: type inference failed for: r4v11, types: [com.google.android.gms.internal.ads.ae] */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v1
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.google.android.gms.internal.ads.af, com.google.android.gms.internal.ads.gi, com.google.android.gms.internal.ads.gh, com.google.android.gms.internal.ads.ae]
      uses: [com.google.android.gms.internal.ads.gh, com.google.android.gms.internal.ads.ae]
      mth insns count: 109
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
                case 2: goto L_0x0165;
                case 3: goto L_0x015a;
                case 4: goto L_0x014f;
                case 5: goto L_0x0144;
                case 6: goto L_0x0139;
                case 7: goto L_0x012e;
                case 8: goto L_0x0123;
                case 9: goto L_0x0118;
                case 10: goto L_0x010d;
                case 11: goto L_0x0102;
                case 12: goto L_0x00f6;
                case 13: goto L_0x00ee;
                case 14: goto L_0x00e2;
                case 15: goto L_0x00d2;
                case 16: goto L_0x00be;
                case 17: goto L_0x00ae;
                case 18: goto L_0x00a2;
                case 19: goto L_0x0096;
                case 20: goto L_0x008a;
                case 21: goto L_0x0068;
                case 22: goto L_0x0060;
                case 23: goto L_0x0054;
                case 24: goto L_0x0048;
                case 25: goto L_0x0038;
                case 26: goto L_0x0016;
                case 27: goto L_0x000e;
                case 28: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r1 = 0
            return r1
        L_0x0006:
            r0.mo31006x()
            r3.writeNoException()
            goto L_0x016f
        L_0x000e:
            r0.mo31005w()
            r3.writeNoException()
            goto L_0x016f
        L_0x0016:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x001d
            goto L_0x0030
        L_0x001d:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IMuteThisAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C15569ae
            if (r4 == 0) goto L_0x002b
            r4 = r2
            com.google.android.gms.internal.ads.ae r4 = (com.google.android.gms.internal.ads.C15569ae) r4
            goto L_0x0030
        L_0x002b:
            com.google.android.gms.internal.ads.af r4 = new com.google.android.gms.internal.ads.af
            r4.<init>(r1)
        L_0x0030:
            r0.mo30984a(r4)
            r3.writeNoException()
            goto L_0x016f
        L_0x0038:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.ag r1 = com.google.android.gms.internal.ads.C15574ah.m32886a(r1)
            r0.mo30985a(r1)
            r3.writeNoException()
            goto L_0x016f
        L_0x0048:
            boolean r1 = r0.mo30990h()
            r3.writeNoException()
            com.google.android.gms.internal.ads.bgq.m35597a(r3, r1)
            goto L_0x016f
        L_0x0054:
            java.util.List r1 = r0.mo30989g()
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x016f
        L_0x0060:
            r0.mo31007y()
            r3.writeNoException()
            goto L_0x016f
        L_0x0068:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x006f
            goto L_0x0082
        L_0x006f:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C15912gh
            if (r4 == 0) goto L_0x007d
            r4 = r2
            com.google.android.gms.internal.ads.gh r4 = (com.google.android.gms.internal.ads.C15912gh) r4
            goto L_0x0082
        L_0x007d:
            com.google.android.gms.internal.ads.gi r4 = new com.google.android.gms.internal.ads.gi
            r4.<init>(r1)
        L_0x0082:
            r0.mo30986a(r4)
            r3.writeNoException()
            goto L_0x016f
        L_0x008a:
            android.os.Bundle r1 = r0.mo31002t()
            r3.writeNoException()
            com.google.android.gms.internal.ads.bgq.m35600b(r3, r1)
            goto L_0x016f
        L_0x0096:
            com.google.android.gms.a.b r1 = r0.mo31000r()
            r3.writeNoException()
            com.google.android.gms.internal.ads.bgq.m35595a(r3, r1)
            goto L_0x016f
        L_0x00a2:
            com.google.android.gms.a.b r1 = r0.mo30999q()
            r3.writeNoException()
            com.google.android.gms.internal.ads.bgq.m35595a(r3, r1)
            goto L_0x016f
        L_0x00ae:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.bgq.m35594a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.mo30988c(r1)
            r3.writeNoException()
            goto L_0x016f
        L_0x00be:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.bgq.m35594a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            boolean r1 = r0.mo30987b(r1)
            r3.writeNoException()
            com.google.android.gms.internal.ads.bgq.m35597a(r3, r1)
            goto L_0x016f
        L_0x00d2:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.bgq.m35594a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.mo30983a(r1)
            r3.writeNoException()
            goto L_0x016f
        L_0x00e2:
            com.google.android.gms.internal.ads.ek r1 = r0.mo31003u()
            r3.writeNoException()
            com.google.android.gms.internal.ads.bgq.m35595a(r3, r1)
            goto L_0x016f
        L_0x00ee:
            r0.mo31004v()
            r3.writeNoException()
            goto L_0x016f
        L_0x00f6:
            java.lang.String r1 = r0.mo31001s()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x016f
        L_0x0102:
            com.google.android.gms.internal.ads.ak r1 = r0.mo30998p()
            r3.writeNoException()
            com.google.android.gms.internal.ads.bgq.m35595a(r3, r1)
            goto L_0x016f
        L_0x010d:
            java.lang.String r1 = r0.mo30997o()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x016f
        L_0x0118:
            java.lang.String r1 = r0.mo30996n()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x016f
        L_0x0123:
            double r1 = r0.mo30995m()
            r3.writeNoException()
            r3.writeDouble(r1)
            goto L_0x016f
        L_0x012e:
            java.lang.String r1 = r0.mo30994l()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x016f
        L_0x0139:
            java.lang.String r1 = r0.mo30993k()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x016f
        L_0x0144:
            com.google.android.gms.internal.ads.eo r1 = r0.mo30992j()
            r3.writeNoException()
            com.google.android.gms.internal.ads.bgq.m35595a(r3, r1)
            goto L_0x016f
        L_0x014f:
            java.lang.String r1 = r0.mo30991i()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x016f
        L_0x015a:
            java.util.List r1 = r0.mo30938f()
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x016f
        L_0x0165:
            java.lang.String r1 = r0.mo30982a()
            r3.writeNoException()
            r3.writeString(r1)
        L_0x016f:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15915gk.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
