package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnClickListener;

final /* synthetic */ class adc implements OnClickListener {

    /* renamed from: a */
    private final ada f40282a;

    /* renamed from: b */
    private final int f40283b;

    /* renamed from: c */
    private final int f40284c;

    /* renamed from: d */
    private final int f40285d;

    adc(ada ada, int i, int i2, int i3) {
        this.f40282a = ada;
        this.f40283b = i;
        this.f40284c = i2;
        this.f40285d = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0073, code lost:
        if (android.text.TextUtils.isEmpty(r6) == false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r5, int r6) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.ada r5 = r4.f40282a
            int r0 = r4.f40283b
            int r1 = r4.f40284c
            int r2 = r4.f40285d
            if (r6 != r0) goto L_0x00a0
            android.content.Context r6 = r5.f40270a
            boolean r6 = r6 instanceof android.app.Activity
            if (r6 != 0) goto L_0x0016
            java.lang.String r5 = "Can not create dialog without Activity Context"
            com.google.android.gms.internal.ads.abv.m32796d(r5)
            return
        L_0x0016:
            java.lang.String r6 = r5.f40271b
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0076
            java.lang.String r0 = "\\+"
            java.lang.String r1 = "%20"
            java.lang.String r6 = r6.replaceAll(r0, r1)
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            android.net.Uri$Builder r6 = r0.encodedQuery(r6)
            android.net.Uri r6 = r6.build()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Map r6 = com.google.android.gms.internal.ads.acd.m32578a(r6)
            java.util.Set r1 = r6.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0044:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0067
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r3 = " = "
            r0.append(r3)
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "\n\n"
            r0.append(r2)
            goto L_0x0044
        L_0x0067:
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            java.lang.String r6 = "No debug information"
        L_0x0078:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.content.Context r1 = r5.f40270a
            r0.<init>(r1)
            r0.setMessage(r6)
            java.lang.String r1 = "Ad Information"
            r0.setTitle(r1)
            java.lang.String r1 = "Share"
            com.google.android.gms.internal.ads.add r2 = new com.google.android.gms.internal.ads.add
            r2.<init>(r5, r6)
            r0.setPositiveButton(r1, r2)
            java.lang.String r5 = "Close"
            android.content.DialogInterface$OnClickListener r6 = com.google.android.gms.internal.ads.ade.f40288a
            r0.setNegativeButton(r5, r6)
            android.app.AlertDialog r5 = r0.create()
            r5.show()
            return
        L_0x00a0:
            if (r6 != r1) goto L_0x00b0
            java.lang.String r6 = "Debug mode [Creative Preview] selected."
            com.google.android.gms.internal.ads.abv.m32792b(r6)
            com.google.android.gms.internal.ads.adf r6 = new com.google.android.gms.internal.ads.adf
            r6.<init>(r5)
            com.google.android.gms.internal.ads.acb.m32566a(r6)
            return
        L_0x00b0:
            if (r6 != r2) goto L_0x00bf
            java.lang.String r6 = "Debug mode [Troubleshooting] selected."
            com.google.android.gms.internal.ads.abv.m32792b(r6)
            com.google.android.gms.internal.ads.adg r6 = new com.google.android.gms.internal.ads.adg
            r6.<init>(r5)
            com.google.android.gms.internal.ads.acb.m32566a(r6)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.adc.onClick(android.content.DialogInterface, int):void");
    }
}
