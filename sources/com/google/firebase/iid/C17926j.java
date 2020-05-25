package com.google.firebase.iid;

/* renamed from: com.google.firebase.iid.j */
final /* synthetic */ class C17926j implements Runnable {

    /* renamed from: a */
    private final C17923g f49790a;

    C17926j(C17923g gVar) {
        this.f49790a = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        r3 = r0.f49787f.f49778b;
        r4 = r0.f49783b;
        r5 = android.os.Message.obtain();
        r5.what = r1.f49797c;
        r5.arg1 = r1.f49795a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.mo34777a());
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle("data", r1.f49798d);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1 = r0.f49784c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0074, code lost:
        if (r1.f49793a == null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0076, code lost:
        r1.f49793a.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        if (r1.f49794b == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0080, code lost:
        r1.f49794b.mo34802a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        r0.mo34766a(2, r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.firebase.iid.g r0 = r8.f49790a
        L_0x0002:
            monitor-enter(r0)
            int r1 = r0.f49782a     // Catch:{ all -> 0x0099 }
            r2 = 2
            if (r1 == r2) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0099 }
            return
        L_0x000a:
            java.util.Queue<com.google.firebase.iid.n<?>> r1 = r0.f49785d     // Catch:{ all -> 0x0099 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0099 }
            if (r1 == 0) goto L_0x0017
            r0.mo34764a()     // Catch:{ all -> 0x0099 }
            monitor-exit(r0)     // Catch:{ all -> 0x0099 }
            return
        L_0x0017:
            java.util.Queue<com.google.firebase.iid.n<?>> r1 = r0.f49785d     // Catch:{ all -> 0x0099 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0099 }
            com.google.firebase.iid.n r1 = (com.google.firebase.iid.C17930n) r1     // Catch:{ all -> 0x0099 }
            android.util.SparseArray<com.google.firebase.iid.n<?>> r3 = r0.f49786e     // Catch:{ all -> 0x0099 }
            int r4 = r1.f49795a     // Catch:{ all -> 0x0099 }
            r3.put(r4, r1)     // Catch:{ all -> 0x0099 }
            com.google.firebase.iid.e r3 = r0.f49787f     // Catch:{ all -> 0x0099 }
            java.util.concurrent.ScheduledExecutorService r3 = r3.f49779c     // Catch:{ all -> 0x0099 }
            com.google.firebase.iid.k r4 = new com.google.firebase.iid.k     // Catch:{ all -> 0x0099 }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x0099 }
            r5 = 30
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0099 }
            r3.schedule(r4, r5, r7)     // Catch:{ all -> 0x0099 }
            monitor-exit(r0)     // Catch:{ all -> 0x0099 }
            com.google.firebase.iid.e r3 = r0.f49787f
            android.content.Context r3 = r3.f49778b
            android.os.Messenger r4 = r0.f49783b
            android.os.Message r5 = android.os.Message.obtain()
            int r6 = r1.f49797c
            r5.what = r6
            int r6 = r1.f49795a
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "oneWay"
            boolean r7 = r1.mo34777a()
            r4.putBoolean(r6, r7)
            java.lang.String r6 = "pkg"
            java.lang.String r3 = r3.getPackageName()
            r4.putString(r6, r3)
            java.lang.String r3 = "data"
            android.os.Bundle r1 = r1.f49798d
            r4.putBundle(r3, r1)
            r5.setData(r4)
            com.google.firebase.iid.l r1 = r0.f49784c     // Catch:{ RemoteException -> 0x008f }
            android.os.Messenger r3 = r1.f49793a     // Catch:{ RemoteException -> 0x008f }
            if (r3 == 0) goto L_0x007c
            android.os.Messenger r1 = r1.f49793a     // Catch:{ RemoteException -> 0x008f }
            r1.send(r5)     // Catch:{ RemoteException -> 0x008f }
            goto L_0x0002
        L_0x007c:
            com.google.firebase.iid.zzl r3 = r1.f49794b     // Catch:{ RemoteException -> 0x008f }
            if (r3 == 0) goto L_0x0087
            com.google.firebase.iid.zzl r1 = r1.f49794b     // Catch:{ RemoteException -> 0x008f }
            r1.mo34802a(r5)     // Catch:{ RemoteException -> 0x008f }
            goto L_0x0002
        L_0x0087:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x008f }
            java.lang.String r3 = "Both messengers are null"
            r1.<init>(r3)     // Catch:{ RemoteException -> 0x008f }
            throw r1     // Catch:{ RemoteException -> 0x008f }
        L_0x008f:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.mo34766a(r2, r1)
            goto L_0x0002
        L_0x0099:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0099 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C17926j.run():void");
    }
}
