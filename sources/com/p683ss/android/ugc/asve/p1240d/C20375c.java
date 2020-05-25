package com.p683ss.android.ugc.asve.p1240d;

import android.os.Handler;
import android.os.Looper;
import com.bef.effectsdk.message.MessageCenter;
import com.bef.effectsdk.message.MessageCenter.C2593a;
import com.p683ss.android.medialib.model.EnigmaResult;
import com.p683ss.android.medialib.p1185qr.PicScanner;
import com.p683ss.android.medialib.p1185qr.ScanSettings;
import com.p683ss.android.ugc.asve.p1240d.C20372b.C20373a;
import com.p683ss.android.ugc.asve.p1240d.C20372b.C20374b;
import com.p683ss.android.vesdk.C50601ah;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.d.c */
public final class C20375c implements C2593a, C20372b {

    /* renamed from: a */
    public C20374b f55878a;

    /* renamed from: b */
    public PicScanner f55879b;

    /* renamed from: c */
    private final Handler f55880c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private Runnable f55881d;

    /* renamed from: e */
    private final String f55882e = "VEScanController";

    /* renamed from: f */
    private final C50601ah f55883f;

    /* renamed from: com.ss.android.ugc.asve.d.c$a */
    public static final class C20376a implements Runnable {

        /* renamed from: a */
        public final PicScanner f55884a;

        /* renamed from: b */
        final /* synthetic */ C20375c f55885b;

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
                com.ss.android.ugc.asve.d.c r0 = r3.f55885b
                monitor-enter(r0)
                com.ss.android.medialib.qr.PicScanner r1 = r3.f55884a     // Catch:{ all -> 0x0035 }
                if (r1 == 0) goto L_0x0033
                com.ss.android.medialib.qr.PicScanner r1 = r3.f55884a     // Catch:{ all -> 0x0035 }
                com.ss.android.ugc.asve.d.c r2 = r3.f55885b     // Catch:{ all -> 0x0035 }
                com.ss.android.medialib.qr.PicScanner r2 = r2.f55879b     // Catch:{ all -> 0x0035 }
                boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r2)     // Catch:{ all -> 0x0035 }
                r1 = r1 ^ 1
                if (r1 != 0) goto L_0x0033
                com.ss.android.medialib.qr.PicScanner r1 = r3.f55884a     // Catch:{ all -> 0x0035 }
                boolean r1 = r1.isValid()     // Catch:{ all -> 0x0035 }
                if (r1 != 0) goto L_0x001e
                goto L_0x0033
            L_0x001e:
                com.ss.android.medialib.qr.PicScanner r1 = r3.f55884a     // Catch:{ all -> 0x0035 }
                boolean r1 = r1.isSuccess()     // Catch:{ all -> 0x0035 }
                if (r1 != 0) goto L_0x0031
                com.ss.android.ugc.asve.d.c r1 = r3.f55885b     // Catch:{ all -> 0x0035 }
                com.ss.android.ugc.asve.d.b$b r1 = r1.f55878a     // Catch:{ all -> 0x0035 }
                if (r1 == 0) goto L_0x0031
                int r2 = com.p683ss.android.ugc.asve.p1240d.C20372b.C20373a.f55874b     // Catch:{ all -> 0x0035 }
                r1.mo43203a(r2)     // Catch:{ all -> 0x0035 }
            L_0x0031:
                monitor-exit(r0)
                return
            L_0x0033:
                monitor-exit(r0)
                return
            L_0x0035:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.asve.p1240d.C20375c.C20376a.run():void");
        }

        C20376a(C20375c cVar) {
            this.f55885b = cVar;
            this.f55884a = cVar.f55879b;
        }
    }

    /* renamed from: d */
    private final void m50544d() {
        C2593a aVar = this;
        MessageCenter.removeListener(aVar);
        MessageCenter.addListener(aVar);
    }

    /* renamed from: b */
    public final void mo43201b() {
        mo43193a();
        mo43200a(false, 65536);
    }

    /* renamed from: c */
    public final void mo43202c() {
        PicScanner picScanner = this.f55879b;
        if (picScanner != null) {
            picScanner.release();
        }
        MessageCenter.removeListener(this);
    }

    /* renamed from: a */
    public final void mo43193a() {
        PicScanner picScanner = this.f55879b;
        if (picScanner != null) {
            picScanner.stop();
        }
        Runnable runnable = this.f55881d;
        if (runnable != null) {
            this.f55880c.removeCallbacks(runnable);
        }
        this.f55879b = null;
    }

    /* renamed from: a */
    public final void mo43196a(C20374b bVar) {
        this.f55878a = bVar;
    }

    public C20375c(C50601ah ahVar) {
        C52711k.m112240b(ahVar, "veRecorder");
        this.f55883f = ahVar;
    }

    /* renamed from: a */
    public final void mo43199a(boolean z) {
        this.f55883f.mo98888s(z);
    }

    /* renamed from: a */
    public final void mo43194a(float f, float f2) {
        this.f55883f.mo98825b(f, f2);
    }

    /* renamed from: a */
    public final void mo43200a(boolean z, long j) {
        m50544d();
        this.f55883f.mo98816a(z, j);
    }

    /* renamed from: a */
    public final void mo43198a(String str, ScanSettings scanSettings, long j) {
        int i;
        C52711k.m112240b(str, "picPath");
        C52711k.m112240b(scanSettings, "scanSettings");
        mo43193a();
        if (this.f55879b == null) {
            this.f55879b = new PicScanner();
        }
        m50544d();
        PicScanner picScanner = this.f55879b;
        if (picScanner != null) {
            i = picScanner.start(str, scanSettings);
        } else {
            i = -1;
        }
        if (i < 0) {
            C20374b bVar = this.f55878a;
            if (bVar != null) {
                bVar.mo43203a(C20373a.f55873a);
            }
        }
        this.f55881d = new C20376a(this);
        this.f55880c.postDelayed(this.f55881d, j);
    }

    /* renamed from: a */
    public final void mo43195a(float f, float f2, float f3, float f4) {
        this.f55883f.mo98781a(f, f2, f3, f4);
    }

    /* renamed from: a */
    public final void mo43197a(String str, int i, int i2, String str2) {
        C52711k.m112240b(str, "strResPath");
        C52711k.m112240b(str2, "stickerTag");
        this.f55883f.mo98767a(str, i, i2, str2);
    }

    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 24) {
            if (this.f55879b != null) {
                C20374b bVar = this.f55878a;
                if (bVar != null) {
                    PicScanner picScanner = this.f55879b;
                    if (picScanner == null) {
                        C52711k.m112234a();
                    }
                    bVar.mo43204a(picScanner.getEnigmaResult());
                }
            } else {
                EnigmaResult q = this.f55883f.mo98884q();
                C20374b bVar2 = this.f55878a;
                if (bVar2 != null) {
                    bVar2.mo43204a(q);
                }
            }
        }
    }
}
