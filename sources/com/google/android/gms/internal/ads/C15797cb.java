package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cb */
final class C15797cb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15796ca f44772a;

    C15797cb(C15796ca caVar) {
        this.f44772a = caVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a1 A[SYNTHETIC, Splitter:B:32:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b0 A[SYNTHETIC, Splitter:B:37:0x00b0] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0002 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.ca r0 = r6.f44772a
        L_0x0002:
            java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.ck> r1 = r0.f44734a     // Catch:{ InterruptedException -> 0x00cb }
            java.lang.Object r1 = r1.take()     // Catch:{ InterruptedException -> 0x00cb }
            com.google.android.gms.internal.ads.ck r1 = (com.google.android.gms.internal.ads.C15806ck) r1     // Catch:{ InterruptedException -> 0x00cb }
            java.lang.String r2 = r1.mo30903b()     // Catch:{ InterruptedException -> 0x00cb }
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0002
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r3 = r0.f44735b
            java.util.Map r1 = r1.mo30904c()
            java.util.Map r1 = r0.mo30888a(r3, r1)
            java.lang.String r3 = r0.f44736c
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.net.Uri$Builder r3 = r3.buildUpon()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0030:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x004c
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r3.appendQueryParameter(r5, r4)
            goto L_0x0030
        L_0x004c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            android.net.Uri r3 = r3.build()
            java.lang.String r3 = r3.toString()
            r1.<init>(r3)
            java.lang.String r3 = "&it="
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.f44739f
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x00c2
            java.io.File r2 = r0.f44740g
            if (r2 == 0) goto L_0x00bb
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0099 }
            r5 = 1
            r4.<init>(r2, r5)     // Catch:{ IOException -> 0x0099 }
            byte[] r1 = r1.getBytes()     // Catch:{ IOException -> 0x0094, all -> 0x0091 }
            r4.write(r1)     // Catch:{ IOException -> 0x0094, all -> 0x0091 }
            r1 = 10
            r4.write(r1)     // Catch:{ IOException -> 0x0094, all -> 0x0091 }
            r4.close()     // Catch:{ IOException -> 0x0089 }
            goto L_0x0002
        L_0x0089:
            r1 = move-exception
            java.lang.String r2 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.abv.m32795c(r2, r1)
            goto L_0x0002
        L_0x0091:
            r0 = move-exception
            r3 = r4
            goto L_0x00ae
        L_0x0094:
            r1 = move-exception
            r3 = r4
            goto L_0x009a
        L_0x0097:
            r0 = move-exception
            goto L_0x00ae
        L_0x0099:
            r1 = move-exception
        L_0x009a:
            java.lang.String r2 = "CsiReporter: Cannot write to file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.abv.m32795c(r2, r1)     // Catch:{ all -> 0x0097 }
            if (r3 == 0) goto L_0x0002
            r3.close()     // Catch:{ IOException -> 0x00a6 }
            goto L_0x0002
        L_0x00a6:
            r1 = move-exception
            java.lang.String r2 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.abv.m32795c(r2, r1)
            goto L_0x0002
        L_0x00ae:
            if (r3 == 0) goto L_0x00ba
            r3.close()     // Catch:{ IOException -> 0x00b4 }
            goto L_0x00ba
        L_0x00b4:
            r1 = move-exception
            java.lang.String r2 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.abv.m32795c(r2, r1)
        L_0x00ba:
            throw r0
        L_0x00bb:
            java.lang.String r1 = "CsiReporter: File doesn't exists. Cannot write CSI data to file."
            com.google.android.gms.internal.ads.abv.m32798e(r1)
            goto L_0x0002
        L_0x00c2:
            android.content.Context r2 = r0.f44737d
            java.lang.String r3 = r0.f44738e
            com.google.android.gms.internal.ads.acd.m32583a(r2, r3, r1)
            goto L_0x0002
        L_0x00cb:
            r0 = move-exception
            java.lang.String r1 = "CsiReporter:reporter interrupted"
            com.google.android.gms.internal.ads.abv.m32795c(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15797cb.run():void");
    }
}
