package com.p683ss.android.ttve.audio;

import android.media.AudioRecord;

/* renamed from: com.ss.android.ttve.audio.b */
public final class C20069b {

    /* renamed from: a */
    protected static int f55157a = -1;

    /* renamed from: b */
    protected static int[] f55158b = {44100, 8000, 11025, 16000, 22050};

    /* renamed from: c */
    protected static int f55159c = -1;

    /* renamed from: d */
    protected static int[] f55160d = {12, 16, 1};

    /* renamed from: e */
    AudioRecord f55161e;

    /* renamed from: f */
    public int f55162f = -1;

    /* renamed from: g */
    int f55163g;

    /* renamed from: h */
    int f55164h = -1;

    /* renamed from: i */
    int f55165i = 2;

    /* renamed from: j */
    boolean f55166j;

    /* renamed from: k */
    public C20068a f55167k;

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        if (this.f55161e != null) {
            try {
                if (this.f55161e.getState() != 0) {
                    this.f55161e.stop();
                }
                this.f55161e.release();
            } catch (Exception unused) {
            }
            this.f55161e = null;
        }
        super.finalize();
    }

    /* renamed from: a */
    public final void mo42154a() {
        if (this.f55161e != null) {
            try {
                if (this.f55161e.getState() != 0) {
                    this.f55161e.stop();
                }
                this.f55161e.release();
            } catch (Exception unused) {
            }
            this.f55161e = null;
        }
        if (this.f55167k != null) {
            this.f55167k.mo42142b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        if (r2.f55161e.getState() == 0) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r2.f55161e.stop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r2.f55167k.mo42139a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo42157b() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f55166j     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 == 0) goto L_0x0022
            android.media.AudioRecord r0 = r2.f55161e     // Catch:{ all -> 0x002d }
            if (r0 != 0) goto L_0x000b
            goto L_0x0022
        L_0x000b:
            r2.f55166j = r1     // Catch:{ all -> 0x002d }
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            android.media.AudioRecord r0 = r2.f55161e
            int r0 = r0.getState()
            if (r0 == 0) goto L_0x001b
            android.media.AudioRecord r0 = r2.f55161e
            r0.stop()
        L_0x001b:
            com.ss.android.ttve.audio.a r0 = r2.f55167k
            r0.mo42139a()
            r0 = 1
            return r0
        L_0x0022:
            android.media.AudioRecord r0 = r2.f55161e     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x002b
            android.media.AudioRecord r0 = r2.f55161e     // Catch:{ all -> 0x002d }
            r0.release()     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            return r1
        L_0x002d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttve.audio.C20069b.mo42157b():boolean");
    }

    public C20069b(C20068a aVar) {
        this.f55167k = aVar;
    }

    /* renamed from: a */
    public final void mo42155a(int i) {
        if (this.f55161e == null) {
            try {
                if (!(f55159c == -1 || f55157a == -1)) {
                    this.f55164h = f55160d[f55159c];
                    this.f55162f = f55158b[f55157a];
                    this.f55163g = AudioRecord.getMinBufferSize(this.f55162f, this.f55164h, this.f55165i);
                    AudioRecord audioRecord = new AudioRecord(i, this.f55162f, this.f55164h, this.f55165i, this.f55163g);
                    this.f55161e = audioRecord;
                }
            } catch (Exception unused) {
            }
            if (this.f55161e == null) {
                f55159c = -1;
                boolean z = false;
                for (int i2 : f55160d) {
                    this.f55164h = i2;
                    f55159c++;
                    f55157a = -1;
                    int[] iArr = f55158b;
                    int length = iArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        int i4 = iArr[i3];
                        f55157a++;
                        try {
                            this.f55163g = AudioRecord.getMinBufferSize(i4, this.f55164h, this.f55165i);
                            if (this.f55163g > 0) {
                                this.f55162f = i4;
                                AudioRecord audioRecord2 = new AudioRecord(i, this.f55162f, this.f55164h, this.f55165i, this.f55163g);
                                this.f55161e = audioRecord2;
                                z = true;
                                break;
                            }
                            f55157a++;
                            i3++;
                        } catch (Exception unused2) {
                            this.f55162f = 0;
                            this.f55161e = null;
                            f55157a++;
                        }
                    }
                    if (z) {
                        break;
                    }
                }
            }
            if (this.f55162f > 0) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r9.f55167k.mo42140a(r10, r9.f55162f, 2, r11, r13, r14) == 0) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        new java.lang.Thread(new com.p683ss.android.ttve.audio.C20069b.C200701(r9)).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42156a(java.lang.String r10, double r11, int r13, int r14) {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.f55166j     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x002c
            android.media.AudioRecord r0 = r9.f55161e     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x000a
            goto L_0x002c
        L_0x000a:
            r0 = 1
            r9.f55166j = r0     // Catch:{ all -> 0x002e }
            monitor-exit(r9)     // Catch:{ all -> 0x002e }
            com.ss.android.ttve.audio.a r1 = r9.f55167k
            int r3 = r9.f55162f
            r4 = 2
            r2 = r10
            r5 = r11
            r7 = r13
            r8 = r14
            int r10 = r1.mo42140a(r2, r3, r4, r5, r7, r8)
            if (r10 == 0) goto L_0x001e
            return
        L_0x001e:
            java.lang.Thread r10 = new java.lang.Thread
            com.ss.android.ttve.audio.b$1 r11 = new com.ss.android.ttve.audio.b$1
            r11.<init>()
            r10.<init>(r11)
            r10.start()
            return
        L_0x002c:
            monitor-exit(r9)     // Catch:{ all -> 0x002e }
            return
        L_0x002e:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x002e }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttve.audio.C20069b.mo42156a(java.lang.String, double, int, int):void");
    }
}
