package com.p683ss.android.ugc.aweme.update;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p030v4.app.C0610aa.C0614d;
import android.text.TextUtils;
import android.util.Log;
import com.C2240a;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.common.utility.p525e.C9402b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12706h;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feedback.C31345v;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.task.CancelNotificationForUpdateTask;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.main.dialogmanager.HomeDialogManager.C36587a;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.p1911j.C35708a;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.update.UpdateHelper */
public final class UpdateHelper {

    /* renamed from: c */
    public static UpdateHelper f119820c;

    /* renamed from: A */
    String f119821A = "";

    /* renamed from: B */
    String f119822B = "";

    /* renamed from: C */
    String f119823C = "";

    /* renamed from: D */
    String f119824D = "";

    /* renamed from: E */
    int f119825E = 2;

    /* renamed from: F */
    long f119826F = -1;

    /* renamed from: G */
    int f119827G;

    /* renamed from: H */
    String f119828H = "";

    /* renamed from: I */
    int f119829I;

    /* renamed from: J */
    int f119830J;

    /* renamed from: K */
    volatile boolean f119831K;

    /* renamed from: L */
    final C47513b f119832L;

    /* renamed from: M */
    C47509c f119833M;

    /* renamed from: N */
    C47511e f119834N;

    /* renamed from: O */
    int f119835O;

    /* renamed from: P */
    volatile boolean f119836P;

    /* renamed from: Q */
    final C47513b f119837Q;

    /* renamed from: R */
    C47507a f119838R;

    /* renamed from: S */
    final IDownloadListener f119839S = new C47508b();

    /* renamed from: T */
    private C0614d f119840T;

    /* renamed from: a */
    public int f119841a = 1;

    /* renamed from: b */
    volatile boolean f119842b;

    /* renamed from: d */
    NotificationManager f119843d = ((NotificationManager) this.f119844e.getSystemService("notification"));

    /* renamed from: e */
    final Context f119844e = C11010c.m22280a();

    /* renamed from: f */
    final String f119845f = C11010c.m22283d();

    /* renamed from: g */
    final Handler f119846g;

    /* renamed from: h */
    String f119847h;

    /* renamed from: i */
    String f119848i;

    /* renamed from: j */
    String f119849j;

    /* renamed from: k */
    String f119850k;

    /* renamed from: l */
    String f119851l;

    /* renamed from: m */
    boolean f119852m;

    /* renamed from: n */
    String f119853n = "";

    /* renamed from: o */
    int f119854o;

    /* renamed from: p */
    int f119855p;

    /* renamed from: q */
    int f119856q;

    /* renamed from: r */
    String f119857r = "";

    /* renamed from: s */
    String f119858s = "";

    /* renamed from: t */
    String f119859t = "";

    /* renamed from: u */
    long f119860u;

    /* renamed from: v */
    String f119861v = "";

    /* renamed from: w */
    String f119862w = "";

    /* renamed from: x */
    boolean f119863x;

    /* renamed from: y */
    boolean f119864y;

    /* renamed from: z */
    boolean f119865z;

    /* renamed from: com.ss.android.ugc.aweme.update.UpdateHelper$UpdateApi */
    interface UpdateApi {
        @C12706h
        C17832m<String> doGet(@C12699af String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.update.UpdateHelper$a */
    class C47507a implements Runnable {

        /* renamed from: b */
        private CountDownLatch f119876b;

        /* renamed from: c */
        private AtomicBoolean f119877c;

        /* renamed from: a */
        public final void mo94822a() {
            if (this.f119876b != null) {
                this.f119876b.countDown();
            }
        }

        /* renamed from: b */
        public final void mo94823b() {
            long j;
            this.f119877c.getAndSet(true);
            if (this.f119876b == null) {
                j = 0;
            } else {
                j = this.f119876b.getCount();
            }
            for (int i = 0; ((long) i) < j; i++) {
                this.f119876b.countDown();
            }
        }

        public final void run() {
            Thread.currentThread().setName("DownloadCountDownLatchThread");
            try {
                this.f119876b.await();
                if (!this.f119877c.get()) {
                    UpdateHelper.this.f119843d.cancel(R.id.crk);
                    UpdateHelper.this.f119843d.cancel(R.id.crl);
                    UpdateHelper.this.f119843d.cancel(R.id.cri);
                    UpdateHelper.this.mo94816x();
                }
            } catch (InterruptedException unused) {
            }
        }

        private C47507a(CountDownLatch countDownLatch) {
            this.f119877c = new AtomicBoolean(false);
            this.f119876b = countDownLatch;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.update.UpdateHelper$b */
    class C47508b extends AbsDownloadListener {

        /* renamed from: b */
        private boolean f119879b;

        /* renamed from: a */
        private void m102940a() {
            try {
                if (!this.f119879b) {
                    this.f119879b = true;
                    UpdateHelper.this.mo94814v();
                }
            } catch (Exception unused) {
            }
        }

        public final void onFirstSuccess(DownloadInfo downloadInfo) {
            m102940a();
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            m102940a();
        }

        C47508b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.update.UpdateHelper$c */
    class C47509c extends Thread {

        /* renamed from: a */
        volatile boolean f119880a;

        /* renamed from: b */
        C47514c f119881b = new C47514c(UpdateHelper.this, UpdateHelper.this.f119844e);

        /* renamed from: d */
        private volatile boolean f119883d = false;

        /* renamed from: e */
        private volatile boolean f119884e;

        /* JADX WARNING: Removed duplicated region for block: B:44:0x011f A[Catch:{ Exception -> 0x0152 }] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x012a A[Catch:{ Exception -> 0x0152 }] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0133 A[Catch:{ Exception -> 0x0152 }] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0171 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01b9  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01bc  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r9 = this;
                boolean r0 = r9.f119883d
                if (r0 != 0) goto L_0x000c
                com.ss.android.ugc.aweme.update.UpdateHelper r0 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this
                android.os.Handler r0 = r0.f119846g
                r1 = 3
                r0.sendEmptyMessage(r1)
            L_0x000c:
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                r1 = 0
                r2 = 1
                r3 = 0
                boolean r4 = r9.f119884e     // Catch:{ Exception -> 0x0154 }
                if (r4 == 0) goto L_0x0025
                com.ss.android.ugc.aweme.update.UpdateHelper r4 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                boolean r4 = r4.mo94812t()     // Catch:{ Exception -> 0x0154 }
                if (r4 != 0) goto L_0x0025
                java.lang.String r1 = "fetchUpdateData = false"
            L_0x0022:
                r5 = 0
                goto L_0x015a
            L_0x0025:
                com.ss.android.ugc.aweme.update.UpdateHelper r4 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                boolean r4 = r4.mo94802i()     // Catch:{ Exception -> 0x0154 }
                if (r4 != 0) goto L_0x0030
                java.lang.String r1 = "isRealCurrentVersionOut = false"
                goto L_0x0022
            L_0x0030:
                java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r5 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r5 = r5.f119847h     // Catch:{ Exception -> 0x0154 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x0154 }
                boolean r5 = r4.isDirectory()     // Catch:{ Exception -> 0x0154 }
                if (r5 != 0) goto L_0x0058
                boolean r4 = r4.mkdirs()     // Catch:{ Exception -> 0x0154 }
                if (r4 != 0) goto L_0x0058
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0154 }
                java.lang.String r4 = "can not mkdir files dir: "
                r1.<init>(r4)     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r4 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r4 = r4.f119847h     // Catch:{ Exception -> 0x0154 }
                r1.append(r4)     // Catch:{ Exception -> 0x0154 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0154 }
                goto L_0x0022
            L_0x0058:
                java.lang.Exception[] r4 = new java.lang.Exception[r2]     // Catch:{ Exception -> 0x0154 }
                boolean r5 = r9.f119883d     // Catch:{ Exception -> 0x0154 }
                if (r5 == 0) goto L_0x00b8
                com.ss.android.ugc.aweme.update.c r5 = r9.f119881b     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r6 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r6 = r6.f119853n     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r7 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r7 = r7.f119851l     // Catch:{ Exception -> 0x0154 }
                boolean r8 = r9.f119883d     // Catch:{ Exception -> 0x0154 }
                boolean r5 = r5.mo94830a(r6, r7, r8, r4)     // Catch:{ Exception -> 0x0154 }
                java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r7 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r7 = r7.f119850k     // Catch:{ Exception -> 0x0154 }
                r6.<init>(r7)     // Catch:{ Exception -> 0x0154 }
                r6.delete()     // Catch:{ Exception -> 0x0154 }
                if (r5 == 0) goto L_0x0116
                java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r7 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r7 = r7.f119851l     // Catch:{ Exception -> 0x0154 }
                r5.<init>(r7)     // Catch:{ Exception -> 0x0154 }
                boolean r7 = r5.isFile()     // Catch:{ Exception -> 0x0154 }
                if (r7 != 0) goto L_0x00a1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0154 }
                r1.<init>()     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r4 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r4 = r4.f119851l     // Catch:{ Exception -> 0x0154 }
                r1.append(r4)     // Catch:{ Exception -> 0x0154 }
                java.lang.String r4 = " is not a file."
                r1.append(r4)     // Catch:{ Exception -> 0x0154 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0154 }
                goto L_0x0022
            L_0x00a1:
                boolean r5 = r5.renameTo(r6)     // Catch:{ Exception -> 0x0154 }
                if (r5 == 0) goto L_0x0113
                java.lang.String r6 = com.bytedance.common.utility.C9395d.m18570a(r6)     // Catch:{ Exception -> 0x0152 }
                com.ss.android.ugc.aweme.update.UpdateHelper r7 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0152 }
                java.lang.String r7 = r7.f119850k     // Catch:{ Exception -> 0x0152 }
                byte[] r7 = com.bytedance.common.utility.C9429n.m18657a(r7)     // Catch:{ Exception -> 0x0152 }
                java.lang.String r7 = com.bytedance.common.utility.C9395d.m18574b(r7)     // Catch:{ Exception -> 0x0152 }
                goto L_0x0119
            L_0x00b8:
                com.ss.android.ugc.aweme.update.c r5 = r9.f119881b     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r6 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r6 = r6.f119853n     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r7 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r7 = r7.f119849j     // Catch:{ Exception -> 0x0154 }
                boolean r8 = r9.f119883d     // Catch:{ Exception -> 0x0154 }
                boolean r5 = r5.mo94830a(r6, r7, r8, r4)     // Catch:{ Exception -> 0x0154 }
                java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r7 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r7 = r7.f119848i     // Catch:{ Exception -> 0x0154 }
                r6.<init>(r7)     // Catch:{ Exception -> 0x0154 }
                r6.delete()     // Catch:{ Exception -> 0x0154 }
                if (r5 == 0) goto L_0x0116
                java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r7 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r7 = r7.f119849j     // Catch:{ Exception -> 0x0154 }
                r5.<init>(r7)     // Catch:{ Exception -> 0x0154 }
                boolean r7 = r5.isFile()     // Catch:{ Exception -> 0x0154 }
                if (r7 != 0) goto L_0x00fc
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0154 }
                r1.<init>()     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r4 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r4 = r4.f119849j     // Catch:{ Exception -> 0x0154 }
                r1.append(r4)     // Catch:{ Exception -> 0x0154 }
                java.lang.String r4 = " is not a file."
                r1.append(r4)     // Catch:{ Exception -> 0x0154 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0154 }
                goto L_0x0022
            L_0x00fc:
                boolean r5 = r5.renameTo(r6)     // Catch:{ Exception -> 0x0154 }
                if (r5 == 0) goto L_0x0113
                java.lang.String r6 = com.bytedance.common.utility.C9395d.m18570a(r6)     // Catch:{ Exception -> 0x0152 }
                com.ss.android.ugc.aweme.update.UpdateHelper r7 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0152 }
                java.lang.String r7 = r7.f119848i     // Catch:{ Exception -> 0x0152 }
                byte[] r7 = com.bytedance.common.utility.C9429n.m18657a(r7)     // Catch:{ Exception -> 0x0152 }
                java.lang.String r7 = com.bytedance.common.utility.C9395d.m18574b(r7)     // Catch:{ Exception -> 0x0152 }
                goto L_0x0119
            L_0x0113:
                r6 = r1
                r7 = r6
                goto L_0x0119
            L_0x0116:
                r6 = r1
                r7 = r6
                r5 = 0
            L_0x0119:
                boolean r8 = com.bytedance.common.utility.C9431p.m18664a(r6)     // Catch:{ Exception -> 0x0152 }
                if (r8 != 0) goto L_0x0124
                java.lang.String r8 = "md5"
                com.p683ss.android.ugc.aweme.update.UpdateHelper.m102905a(r0, r8, r6)     // Catch:{ Exception -> 0x0152 }
            L_0x0124:
                boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r7)     // Catch:{ Exception -> 0x0152 }
                if (r6 != 0) goto L_0x012f
                java.lang.String r6 = "sig_hash"
                com.p683ss.android.ugc.aweme.update.UpdateHelper.m102905a(r0, r6, r7)     // Catch:{ Exception -> 0x0152 }
            L_0x012f:
                r6 = r4[r3]     // Catch:{ Exception -> 0x0152 }
                if (r6 == 0) goto L_0x015a
                com.ss.android.ugc.aweme.update.UpdateHelper r6 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0152 }
                android.content.Context r6 = r6.f119844e     // Catch:{ Exception -> 0x0152 }
                r7 = r4[r3]     // Catch:{ Exception -> 0x0152 }
                int r6 = com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a.m56495b(r6, r7)     // Catch:{ Exception -> 0x0152 }
                r7 = 18
                if (r7 == r6) goto L_0x014b
                java.lang.String r4 = "errorCode"
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0152 }
                com.p683ss.android.ugc.aweme.update.UpdateHelper.m102905a(r0, r4, r6)     // Catch:{ Exception -> 0x0152 }
                goto L_0x015a
            L_0x014b:
                r1 = r4[r3]     // Catch:{ Exception -> 0x0152 }
                java.lang.String r1 = r1.getMessage()     // Catch:{ Exception -> 0x0152 }
                goto L_0x015a
            L_0x0152:
                r1 = move-exception
                goto L_0x0156
            L_0x0154:
                r1 = move-exception
                r5 = 0
            L_0x0156:
                java.lang.String r1 = r1.getMessage()
            L_0x015a:
                if (r5 == 0) goto L_0x016c
                java.io.File r4 = new java.io.File
                com.ss.android.ugc.aweme.update.UpdateHelper r6 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this
                java.lang.String r6 = r6.f119848i
                r4.<init>(r6)
                boolean r4 = r4.isFile()
                if (r4 != 0) goto L_0x016c
                r5 = 0
            L_0x016c:
                com.ss.android.ugc.aweme.update.UpdateHelper r4 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this
                com.ss.android.ugc.aweme.update.b r4 = r4.f119832L
                monitor-enter(r4)
                boolean r6 = r9.f119883d     // Catch:{ all -> 0x0283 }
                if (r6 == 0) goto L_0x017a
                com.ss.android.ugc.aweme.update.UpdateHelper r6 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ all -> 0x0283 }
                r6.f119836P = r3     // Catch:{ all -> 0x0283 }
                goto L_0x019e
            L_0x017a:
                com.ss.android.ugc.aweme.update.UpdateHelper r6 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ all -> 0x0283 }
                r6.f119831K = r3     // Catch:{ all -> 0x0283 }
                if (r5 == 0) goto L_0x0188
                com.ss.android.ugc.aweme.update.UpdateHelper r6 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ all -> 0x0283 }
                android.os.Handler r6 = r6.f119846g     // Catch:{ all -> 0x0283 }
                r6.sendEmptyMessage(r2)     // Catch:{ all -> 0x0283 }
                goto L_0x019e
            L_0x0188:
                boolean r6 = r9.f119880a     // Catch:{ all -> 0x0283 }
                if (r6 == 0) goto L_0x0196
                com.ss.android.ugc.aweme.update.UpdateHelper r6 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ all -> 0x0283 }
                android.os.Handler r6 = r6.f119846g     // Catch:{ all -> 0x0283 }
                r7 = 13
                r6.sendEmptyMessage(r7)     // Catch:{ all -> 0x0283 }
                goto L_0x019e
            L_0x0196:
                com.ss.android.ugc.aweme.update.UpdateHelper r6 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ all -> 0x0283 }
                android.os.Handler r6 = r6.f119846g     // Catch:{ all -> 0x0283 }
                r7 = 4
                r6.sendEmptyMessage(r7)     // Catch:{ all -> 0x0283 }
            L_0x019e:
                monitor-exit(r4)     // Catch:{ all -> 0x0283 }
                java.lang.String r4 = "errorMsg"
                com.p683ss.android.ugc.aweme.update.UpdateHelper.m102905a(r0, r4, r1)
                java.lang.String r1 = "remote_ip"
                com.ss.android.ugc.aweme.update.UpdateHelper r4 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this
                java.lang.String r4 = r4.f119853n
                java.lang.String r4 = com.p683ss.android.ugc.aweme.update.C47516e.m102945a(r4)
                com.p683ss.android.ugc.aweme.update.UpdateHelper.m102905a(r0, r1, r4)
                java.lang.String r1 = "client_ip"
                com.ss.android.ugc.aweme.update.UpdateHelper r4 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this
                android.content.Context r4 = r4.f119844e
                if (r4 != 0) goto L_0x01bc
                java.lang.String r4 = ""
                goto L_0x0215
            L_0x01bc:
                android.content.Context r4 = r4.getApplicationContext()
                java.lang.String r6 = "wifi"
                java.lang.Object r4 = r4.getSystemService(r6)
                android.net.wifi.WifiManager r4 = (android.net.wifi.WifiManager) r4
                if (r4 == 0) goto L_0x0211
                boolean r6 = r4.isWifiEnabled()
                if (r6 == 0) goto L_0x0211
                java.lang.String r6 = ""
                android.net.wifi.WifiInfo r4 = r4.getConnectionInfo()
                if (r4 == 0) goto L_0x020f
                int r4 = r4.getIpAddress()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r7 = r4 & 255(0xff, float:3.57E-43)
                r6.append(r7)
                java.lang.String r7 = "."
                r6.append(r7)
                int r7 = r4 >> 8
                r7 = r7 & 255(0xff, float:3.57E-43)
                r6.append(r7)
                java.lang.String r7 = "."
                r6.append(r7)
                int r7 = r4 >> 16
                r7 = r7 & 255(0xff, float:3.57E-43)
                r6.append(r7)
                java.lang.String r7 = "."
                r6.append(r7)
                int r4 = r4 >> 24
                r4 = r4 & 255(0xff, float:3.57E-43)
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                goto L_0x0215
            L_0x020f:
                r4 = r6
                goto L_0x0215
            L_0x0211:
                java.lang.String r4 = com.p683ss.android.ugc.aweme.update.C47516e.m102944a()
            L_0x0215:
                com.p683ss.android.ugc.aweme.update.UpdateHelper.m102905a(r0, r1, r4)
                java.lang.String r1 = "url"
                com.ss.android.ugc.aweme.update.UpdateHelper r4 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this
                java.lang.String r4 = r4.f119853n
                com.p683ss.android.ugc.aweme.update.UpdateHelper.m102905a(r0, r1, r4)
                java.lang.String r1 = "pre"
                boolean r4 = r9.f119883d
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                com.p683ss.android.ugc.aweme.update.UpdateHelper.m102905a(r0, r1, r4)
                java.lang.String r1 = "cancled"
                boolean r4 = r9.f119880a
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                com.p683ss.android.ugc.aweme.update.UpdateHelper.m102905a(r0, r1, r4)
                java.lang.String r1 = "success"
                java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
                com.p683ss.android.ugc.aweme.update.UpdateHelper.m102905a(r0, r1, r4)
                java.lang.String r1 = "force"
                com.ss.android.ugc.aweme.update.UpdateHelper r4 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this
                boolean r4 = r4.mo94803j()
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                com.p683ss.android.ugc.aweme.update.UpdateHelper.m102905a(r0, r1, r4)
                java.lang.String r1 = "current_update_version_code"
                long r6 = com.bytedance.ies.ugc.p694a.C11010c.m22286g()
                java.lang.Long r4 = java.lang.Long.valueOf(r6)
                com.p683ss.android.ugc.aweme.update.UpdateHelper.m102905a(r0, r1, r4)
                java.lang.String r1 = "download_real_version_code"
                com.ss.android.ugc.aweme.update.UpdateHelper r4 = com.p683ss.android.ugc.aweme.update.UpdateHelper.this
                int r4 = r4.f119856q
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                com.p683ss.android.ugc.aweme.update.UpdateHelper.m102905a(r0, r1, r4)
                java.lang.String r1 = "enter_method"
                java.lang.String r4 = "download"
                com.p683ss.android.ugc.aweme.update.UpdateHelper.m102905a(r0, r1, r4)
                java.lang.String r1 = "update"
                com.p683ss.android.ugc.aweme.common.C26890h.m65012a(r1, r0)
                if (r5 != 0) goto L_0x027c
                boolean r1 = r9.f119880a
                if (r1 != 0) goto L_0x027c
                r3 = 1
            L_0x027c:
                java.lang.String r1 = "service_apk_download_info"
                r2 = r2 ^ r3
                com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r1, r2, r0)
                return
            L_0x0283:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0283 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.update.UpdateHelper.C47509c.run():void");
        }

        C47509c(boolean z, boolean z2) {
            this.f119884e = z2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.update.UpdateHelper$d */
    static class C47510d extends Handler {

        /* renamed from: a */
        private WeakReference<UpdateHelper> f119885a;

        public final void handleMessage(Message message) {
            UpdateHelper updateHelper = (UpdateHelper) this.f119885a.get();
            if (updateHelper != null) {
                switch (message.what) {
                    case 1:
                        if (updateHelper.f119838R == null) {
                            updateHelper.f119843d.cancel(R.id.crk);
                            updateHelper.f119843d.cancel(R.id.crl);
                            updateHelper.f119843d.cancel(R.id.cri);
                            updateHelper.mo94816x();
                            return;
                        }
                        updateHelper.mo94814v();
                        return;
                    case 2:
                        updateHelper.f119843d.cancel(R.id.crj);
                        updateHelper.f119843d.cancel(R.id.cri);
                        if (updateHelper.mo94802i()) {
                            String c = C11010c.f29572u.mo19896c();
                            String a = C2240a.m6772a(updateHelper.f119844e.getString(R.string.dp7), new Object[]{c, updateHelper.mo94798e()});
                            String a2 = C2240a.m6772a(updateHelper.f119844e.getString(R.string.dp6), new Object[]{updateHelper.mo94798e()});
                            Intent intent = new Intent(updateHelper.f119844e, UpdateActivity.class);
                            intent.putExtra("from_update_avail", true);
                            intent.addFlags(536870912);
                            PendingIntent activity = PendingIntent.getActivity(updateHelper.f119844e, 0, intent, 0);
                            C0614d dVar = new C0614d(updateHelper.f119844e, "update_notification");
                            dVar.mo2111a((int) R.drawable.status_icon).mo2131d((CharSequence) a).mo2113a(System.currentTimeMillis()).mo2118a((CharSequence) c).mo2125b((CharSequence) a2).mo2114a(activity).mo2126b(true);
                            updateHelper.f119843d.notify(R.id.crl, dVar.mo2122b());
                        }
                        return;
                    case 3:
                        updateHelper.f119843d.cancel(R.id.crk);
                        updateHelper.f119843d.cancel(R.id.cri);
                        updateHelper.f119843d.cancel(R.id.crj);
                        updateHelper.f119843d.cancel(R.id.crl);
                        updateHelper.f119843d.notify(R.id.crk, updateHelper.mo94790a(0));
                        return;
                    case 4:
                        updateHelper.f119843d.cancel(R.id.crk);
                        updateHelper.f119843d.cancel(R.id.crj);
                        updateHelper.f119843d.cancel(R.id.crl);
                        if (updateHelper.mo94802i()) {
                            String c2 = C11010c.f29572u.mo19896c();
                            String string = updateHelper.f119844e.getString(R.string.dp2);
                            PendingIntent activity2 = PendingIntent.getActivity(updateHelper.f119844e, 0, new Intent(), 0);
                            C0614d dVar2 = new C0614d(updateHelper.f119844e, "update_notification");
                            dVar2.mo2111a(17301624).mo2131d((CharSequence) string).mo2113a(System.currentTimeMillis());
                            dVar2.mo2118a((CharSequence) c2).mo2125b((CharSequence) string).mo2114a(activity2).mo2126b(true);
                            updateHelper.f119843d.notify(R.id.cri, dVar2.mo2122b());
                        }
                        return;
                    case 5:
                        int i = message.arg1;
                        if (i < 0) {
                            i = 0;
                        }
                        if (i > 99) {
                            i = 99;
                        }
                        updateHelper.f119843d.notify(R.id.crk, updateHelper.mo94790a(i));
                        return;
                    case 6:
                        C23859b.m58575b().mo49463a(updateHelper.f119844e, "last_check_update_time", System.currentTimeMillis());
                        updateHelper.f119846g.postDelayed(new Runnable() {
                            public final void run() {
                                Activity g = C11016e.m22312g();
                                if (g != null && (g instanceof AbsActivity) && ((AbsActivity) g).isActive() && !UpdateHelper.m102902a().f119842b) {
                                    UpdateHelper a = UpdateHelper.m102902a();
                                    if (a.mo94801h()) {
                                        System.currentTimeMillis();
                                        a.mo94797d();
                                        if (a.mo94802i() && C11016e.m22312g() != null && (C11016e.m22312g() instanceof MainActivity) && !C36587a.m82463a()) {
                                            C47532n nVar = new C47532n(C11016e.m22312g(), true);
                                            if (!C11016e.m22312g().isFinishing()) {
                                                C47512a aVar = C47512a.f119889b;
                                                int i = C47512a.f119888a + 1;
                                                C47512a.f119888a = i;
                                                if (i >= 3) {
                                                    try {
                                                        JSONObject jSONObject = new JSONObject();
                                                        String stackTraceString = Log.getStackTraceString(new IllegalStateException("dialog show more than 3 times,maybe is bug"));
                                                        if (stackTraceString.length() > 4096) {
                                                            C52711k.m112236a((Object) stackTraceString, "stackTraceString");
                                                            if (stackTraceString != null) {
                                                                stackTraceString = stackTraceString.substring(0, 4096);
                                                                C52711k.m112236a((Object) stackTraceString, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                                            } else {
                                                                throw new C52857u("null cannot be cast to non-null type java.lang.String");
                                                            }
                                                        }
                                                        jSONObject.put("error_stack", stackTraceString);
                                                        jSONObject.put("errorType", "update_dialog_show_error");
                                                        C35708a.m80693a(jSONObject);
                                                    } catch (Throwable th) {
                                                        StringBuilder sb = new StringBuilder("report error:");
                                                        sb.append(th);
                                                        C32458a.m75141a(6, "CheckUpdateManager", sb.toString());
                                                    }
                                                }
                                                C26890h.m65011a("test_invitation_popup", C23089d.m56640a().mo47829a("event_belong", "video").mo47829a("event_type", "show").mo47829a("event_page", "video").mo47829a("event_module", "popup").f61491a);
                                                C32458a.m75141a(4, "UpdateHelper", "try show dialog");
                                                nVar.show();
                                                a.mo94793a("update", "show");
                                            }
                                        }
                                    }
                                }
                            }
                        }, (long) (UpdateHelper.m102902a().mo94806m() * 1000));
                        return;
                    case 7:
                        updateHelper.mo94814v();
                        return;
                    case 10:
                        updateHelper.f119843d.cancel(R.id.crj);
                        break;
                    case 11:
                        updateHelper.f119843d.cancel(R.id.crl);
                        return;
                    case 12:
                        updateHelper.f119843d.cancel(R.id.cri);
                        return;
                    case 13:
                        updateHelper.f119843d.cancel(R.id.crk);
                        updateHelper.mo94814v();
                        return;
                }
            }
        }

        C47510d(Looper looper, UpdateHelper updateHelper) {
            super(looper);
            this.f119885a = new WeakReference<>(updateHelper);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.update.UpdateHelper$e */
    class C47511e extends Thread {

        /* renamed from: a */
        volatile boolean f119886a;

        public final void run() {
            while (true) {
                try {
                    Thread.sleep(1500);
                } catch (Exception unused) {
                }
                synchronized (UpdateHelper.this.f119832L) {
                    if (!this.f119886a) {
                        if (UpdateHelper.this.f119831K) {
                            long j = UpdateHelper.this.f119832L.f119891a;
                            long j2 = UpdateHelper.this.f119832L.f119892b;
                            int i = 1;
                            if (j2 > 0) {
                                i = (int) ((j * 100) / j2);
                                if (i > 99) {
                                    i = 99;
                                }
                            }
                            Message obtainMessage = UpdateHelper.this.f119846g.obtainMessage(5);
                            obtainMessage.arg1 = i;
                            UpdateHelper.this.f119846g.sendMessage(obtainMessage);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        C47511e() {
        }
    }

    /* renamed from: a */
    public static UpdateHelper m102902a() {
        return f119820c;
    }

    /* renamed from: b */
    public final void mo94795b() {
        this.f119846g.sendEmptyMessage(11);
    }

    /* renamed from: c */
    public final void mo94796c() {
        this.f119846g.sendEmptyMessage(10);
    }

    /* renamed from: g */
    public final synchronized boolean mo94800g() {
        return this.f119831K;
    }

    /* renamed from: w */
    public final void mo94815w() {
        m102906a(true);
    }

    /* renamed from: v */
    public final void mo94814v() {
        if (this.f119838R != null) {
            this.f119838R.mo94822a();
        }
    }

    /* renamed from: d */
    public final synchronized int mo94797d() {
        if (!this.f119852m) {
            m102901A();
            this.f119852m = true;
        }
        return this.f119855p;
    }

    /* renamed from: e */
    public final synchronized String mo94798e() {
        if (!this.f119852m) {
            m102901A();
            this.f119852m = true;
        }
        if (!TextUtils.isEmpty(this.f119858s)) {
            return this.f119858s;
        }
        return this.f119857r;
    }

    /* renamed from: f */
    public final synchronized String mo94799f() {
        if (!this.f119852m) {
            m102901A();
            this.f119852m = true;
        }
        return this.f119859t;
    }

    /* renamed from: h */
    public final synchronized boolean mo94801h() {
        if (!this.f119852m) {
            m102901A();
            this.f119852m = true;
        }
        if (this.f119855p > this.f119856q || this.f119854o >= this.f119855p) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final synchronized boolean mo94802i() {
        if (!this.f119852m) {
            m102901A();
            this.f119852m = true;
        }
        if (this.f119854o < this.f119856q) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final synchronized boolean mo94803j() {
        if (!this.f119852m) {
            m102901A();
            this.f119852m = true;
        }
        return this.f119863x;
    }

    /* renamed from: k */
    public final synchronized String mo94804k() {
        if (!this.f119852m) {
            m102901A();
            this.f119852m = true;
        }
        return this.f119861v;
    }

    /* renamed from: l */
    public final synchronized String mo94805l() {
        if (!this.f119852m) {
            m102901A();
            this.f119852m = true;
        }
        return this.f119862w;
    }

    /* renamed from: m */
    public final synchronized int mo94806m() {
        if (!this.f119852m) {
            m102901A();
            this.f119852m = true;
        }
        return Math.min(Math.max(this.f119827G, 0), 60);
    }

    /* renamed from: o */
    public final synchronized boolean mo94808o() {
        if (!this.f119852m) {
            m102901A();
            this.f119852m = true;
        }
        return this.f119865z;
    }

    /* renamed from: p */
    public final synchronized String mo94809p() {
        if (!this.f119852m) {
            m102901A();
            this.f119852m = true;
        }
        return this.f119821A;
    }

    /* renamed from: u */
    public final void mo94813u() {
        if (this.f119838R == null) {
            this.f119838R = new C47507a(new CountDownLatch(2));
            new C9393e(this.f119838R, "DownloadCountDownLatchThread", true).start();
        }
    }

    /* renamed from: z */
    private synchronized void m102909z() {
        try {
            File file = new File(this.f119849j);
            if (file.exists()) {
                file.delete();
            }
            File file2 = new File(this.f119848i);
            if (file2.exists()) {
                file2.delete();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: n */
    public final synchronized boolean mo94807n() {
        if (!this.f119852m) {
            m102901A();
            this.f119852m = true;
        }
        if (!C9431p.m18664a(this.f119823C)) {
            C18920g.m46052b(this.f119844e, this.f119823C);
        }
        return this.f119864y;
    }

    /* renamed from: y */
    public final C47530m mo94817y() {
        if (this.f119841a == -1 || this.f119841a == 0) {
            return C47530m.f119916a;
        }
        if (this.f119841a == 2) {
            try {
                return (C47530m) Class.forName("MMUpdateChecker").newInstance();
            } catch (Throwable unused) {
            }
        }
        return new C47521h();
    }

    /* renamed from: s */
    public static String m102908s() {
        try {
            StringBuilder sb = new StringBuilder();
            if (VERSION.SDK_INT < 21 || Build.SUPPORTED_ABIS.length <= 0) {
                sb = new StringBuilder(Build.CPU_ABI);
            } else {
                for (int i = 0; i < Build.SUPPORTED_ABIS.length; i++) {
                    sb.append(Build.SUPPORTED_ABIS[i]);
                    if (i != Build.SUPPORTED_ABIS.length - 1) {
                        sb.append(", ");
                    }
                }
            }
            TextUtils.isEmpty(sb.toString());
            return sb.toString();
        } catch (Exception unused) {
            return "unknown";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        return false;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo94810q() {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.f119852m     // Catch:{ all -> 0x005f }
            r1 = 1
            if (r0 != 0) goto L_0x000b
            r10.m102901A()     // Catch:{ all -> 0x005f }
            r10.f119852m = r1     // Catch:{ all -> 0x005f }
        L_0x000b:
            int r0 = r10.f119829I     // Catch:{ all -> 0x005f }
            int r2 = r10.f119856q     // Catch:{ all -> 0x005f }
            r3 = 0
            if (r0 == r2) goto L_0x0014
            monitor-exit(r10)
            return r3
        L_0x0014:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005f }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x005f }
            java.lang.String r2 = r10.f119848i     // Catch:{ all -> 0x005f }
            r0.<init>(r2)     // Catch:{ all -> 0x005f }
            boolean r2 = r0.exists()     // Catch:{ all -> 0x005f }
            if (r2 == 0) goto L_0x003b
            boolean r2 = r0.isFile()     // Catch:{ all -> 0x005f }
            if (r2 == 0) goto L_0x003b
            long r6 = r0.lastModified()     // Catch:{ all -> 0x005f }
            r0 = 0
            long r6 = r4 - r6
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x003b
            monitor-exit(r10)
            return r3
        L_0x003b:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x005f }
            java.lang.String r2 = r10.f119850k     // Catch:{ all -> 0x005f }
            r0.<init>(r2)     // Catch:{ all -> 0x005f }
            boolean r2 = r0.exists()     // Catch:{ all -> 0x005f }
            if (r2 == 0) goto L_0x005d
            boolean r2 = r0.isFile()     // Catch:{ all -> 0x005f }
            if (r2 == 0) goto L_0x005d
            long r6 = r0.lastModified()     // Catch:{ all -> 0x005f }
            r0 = 0
            long r4 = r4 - r6
            r6 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x005d
            monitor-exit(r10)
            return r1
        L_0x005d:
            monitor-exit(r10)
            return r3
        L_0x005f:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.update.UpdateHelper.mo94810q():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043 A[Catch:{ Throwable -> 0x005f }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.io.File mo94811r() {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.f119852m     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x000b
            r9.m102901A()     // Catch:{ all -> 0x0061 }
            r0 = 1
            r9.f119852m = r0     // Catch:{ all -> 0x0061 }
        L_0x000b:
            r0 = 0
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x005f }
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x005f }
            java.lang.String r4 = r9.f119848i     // Catch:{ Throwable -> 0x005f }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x005f }
            boolean r4 = r3.exists()     // Catch:{ Throwable -> 0x005f }
            if (r4 == 0) goto L_0x0035
            int r4 = r9.f119829I     // Catch:{ Throwable -> 0x005f }
            int r5 = r9.f119856q     // Catch:{ Throwable -> 0x005f }
            if (r4 != r5) goto L_0x0032
            long r4 = r3.lastModified()     // Catch:{ Throwable -> 0x005f }
            r6 = 0
            long r4 = r1 - r4
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0032
            goto L_0x0036
        L_0x0032:
            r3.delete()     // Catch:{ Throwable -> 0x005f }
        L_0x0035:
            r3 = r0
        L_0x0036:
            java.io.File r4 = new java.io.File     // Catch:{ Throwable -> 0x005f }
            java.lang.String r5 = r9.f119850k     // Catch:{ Throwable -> 0x005f }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x005f }
            boolean r5 = r4.exists()     // Catch:{ Throwable -> 0x005f }
            if (r5 == 0) goto L_0x005d
            int r5 = r9.f119829I     // Catch:{ Throwable -> 0x005f }
            int r6 = r9.f119856q     // Catch:{ Throwable -> 0x005f }
            if (r5 != r6) goto L_0x005a
            long r5 = r4.lastModified()     // Catch:{ Throwable -> 0x005f }
            r7 = 0
            long r1 = r1 - r5
            r5 = 604800000(0x240c8400, double:2.988109026E-315)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x005a
            if (r3 != 0) goto L_0x005d
            r3 = r4
            goto L_0x005d
        L_0x005a:
            r4.delete()     // Catch:{ Throwable -> 0x005f }
        L_0x005d:
            monitor-exit(r9)
            return r3
        L_0x005f:
            monitor-exit(r9)
            return r0
        L_0x0061:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.update.UpdateHelper.mo94811r():java.io.File");
    }

    /* renamed from: A */
    private void m102901A() {
        this.f119854o = (int) C11010c.m22286g();
        if (this.f119854o <= 0) {
            this.f119854o = 1;
        }
        SharedPreferences a = C35807d.m80935a(this.f119844e, "update_info", 0);
        this.f119855p = a.getInt("tip_version_code", 0);
        this.f119856q = a.getInt("real_version_code", 0);
        this.f119857r = a.getString("tip_version_name", "");
        this.f119858s = a.getString("real_version_name", "");
        this.f119859t = a.getString("whats_new", "");
        this.f119860u = a.getLong("last_check_time", 0);
        this.f119862w = a.getString("title", "");
        this.f119853n = a.getString("download_url", "");
        this.f119863x = a.getBoolean("force_update", false);
        this.f119861v = a.getString("already_download_tips", "");
        this.f119825E = a.getInt("interval_since_notify_update", 2);
        this.f119826F = a.getLong("pre_download_max_wait_seconds", -1);
        this.f119827G = a.getInt("latency", 0);
        this.f119828H = a.getString("download_etag", "");
        this.f119829I = a.getInt("download_version", 0);
        this.f119830J = a.getInt("download_size", -1);
        this.f119835O = a.getInt("pre_download_size", -1);
        this.f119864y = a.getBoolean("bind_download_data", false);
        this.f119865z = a.getBoolean("hint_checked", false);
        this.f119821A = a.getString("hint_text", "");
        this.f119822B = a.getString(LeakCanaryFileProvider.f132049i, "");
        this.f119823C = a.getString("package", "");
        this.f119824D = a.getString("download_url", "");
    }

    /* renamed from: x */
    public final void mo94816x() {
        File file = new File(this.f119848i);
        if (file.exists() && file.isFile()) {
            String c = C11010c.f29572u.mo19896c();
            String a = C2240a.m6772a(this.f119844e.getString(R.string.dp_), new Object[]{c, mo94798e()});
            String a2 = C2240a.m6772a(this.f119844e.getString(R.string.dp9), new Object[]{mo94798e()});
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(1);
            intent.setDataAndType(C19547d.m47838a(this.f119844e, file), "application/vnd.android.package-archive");
            PendingIntent activity = PendingIntent.getActivity(this.f119844e, 0, intent, 0);
            C0614d dVar = new C0614d(this.f119844e, "update_notification");
            dVar.mo2111a((int) R.drawable.status_icon);
            dVar.mo2131d((CharSequence) a);
            dVar.mo2113a(System.currentTimeMillis());
            dVar.mo2118a((CharSequence) c).mo2125b((CharSequence) a2);
            dVar.mo2114a(activity);
            dVar.mo2126b(true);
            this.f119843d.notify(R.id.crj, dVar.mo2122b());
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.addFlags(1);
                intent2.setDataAndType(C19547d.m47838a(this.f119844e, file), "application/vnd.android.package-archive");
                intent2.addFlags(268435456);
                this.f119844e.startActivity(intent2);
            } catch (Exception unused) {
            }
        }
    }

    public UpdateHelper() {
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("update_notification", C11010c.f29572u.mo19896c(), 2);
            notificationChannel.setSound(null, null);
            notificationChannel.enableLights(false);
            notificationChannel.enableVibration(false);
            this.f119843d.createNotificationChannel(notificationChannel);
        }
        this.f119846g = new C47510d(Looper.getMainLooper(), this);
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getPath());
        sb.append("/Android/data/");
        sb.append(this.f119844e.getPackageName());
        sb.append("/files");
        this.f119847h = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f119847h);
        sb2.append("/install_dmt.apk");
        this.f119848i = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f119847h);
        sb3.append("/install_dmt.apk.part");
        this.f119849j = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f119847h);
        sb4.append("/predownload.apk");
        this.f119850k = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f119847h);
        sb5.append("/predownload.apk.part");
        this.f119851l = sb5.toString();
        this.f119832L = new C47513b();
        this.f119832L.f119891a = 0;
        this.f119832L.f119892b = 0;
        this.f119837Q = new C47513b();
        this.f119837Q.f119891a = 0;
        this.f119837Q.f119892b = 0;
        C2201v.m6601a((C2205y<T>) new C47537o<T>(this)).mo6514a(C1667a.m5940a()).mo6529b(C2168a.m6521b()).mo6314a((C1674ab<? super T>) new C1674ab<C31345v>() {
            public final void onComplete() {
            }

            public final void onError(Throwable th) {
            }

            public final void onSubscribe(C1690c cVar) {
            }

            public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                C31345v vVar = (C31345v) obj;
                if (vVar != null) {
                    UpdateHelper.this.f119841a = vVar.f82104a;
                }
            }
        });
        C35857a.m81001b().mo74526a(new CancelNotificationForUpdateTask(this.f119843d)).mo74527a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0335, code lost:
        r0 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0348 A[Catch:{ all -> 0x039a }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0356 A[Catch:{ all -> 0x039a }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0360 A[Catch:{ all -> 0x039a }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0217 A[SYNTHETIC, Splitter:B:89:0x0217] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo94812t() {
        /*
            r30 = this;
            r1 = r30
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r3 = 0
            com.ss.android.ugc.aweme.update.f r0 = com.p683ss.android.ugc.aweme.update.C47517f.C47518a.m102946a()     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            boolean r0 = r0.f119898a     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            r4 = 3
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = "EvilsoulM"
            java.lang.String r5 = "inHouse update check version"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r4, r0, r5)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            java.lang.String r0 = ""
            java.lang.String r0 = m102907b(r0)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            goto L_0x0039
        L_0x001f:
            java.lang.String r0 = "EvilsoulM"
            java.lang.String r5 = "origin update check version"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r4, r0, r5)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            r0.<init>()     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            java.lang.String r5 = com.p683ss.android.ugc.aweme.app.api.Api.f61282b     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            r0.append(r5)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            java.lang.String r5 = "/appbeta/check_version/check_beta"
            r0.append(r5)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
        L_0x0039:
            java.lang.String r5 = "request"
            m102905a(r2, r5, r0)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            r5 = 8192(0x2000, float:1.14794E-41)
            java.lang.String r0 = com.p683ss.android.common.util.NetworkUtils.executeGet(r5, r0)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            boolean r5 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            if (r5 == 0) goto L_0x007a
            java.lang.String r0 = "enter_method"
            java.lang.String r4 = "check"
            m102905a(r2, r0, r4)
            java.lang.String r0 = "current_update_version_code"
            int r4 = r1.f119854o
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            m102905a(r2, r0, r4)
            java.lang.String r0 = "download_real_version_code"
            int r4 = r1.f119856q
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            m102905a(r2, r0, r4)
            java.lang.String r0 = "force"
            boolean r4 = r30.mo94803j()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            m102905a(r2, r0, r4)
            java.lang.String r0 = "update"
            com.p683ss.android.ugc.aweme.common.C26890h.m65012a(r0, r2)
            return r3
        L_0x007a:
            java.lang.String r5 = "EvilsoulM"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            java.lang.String r7 = "responseStr is "
            r6.<init>(r7)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            r6.append(r0)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r4, r5, r6)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            java.lang.String r5 = "response"
            m102905a(r2, r5, r0)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            r5.<init>(r0)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            java.lang.String r0 = "success"
            java.lang.String r6 = "message"
            java.lang.String r6 = r5.getString(r6)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            boolean r0 = android.text.TextUtils.equals(r0, r6)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            if (r0 != 0) goto L_0x00d5
            java.lang.String r0 = "enter_method"
            java.lang.String r4 = "check"
            m102905a(r2, r0, r4)
            java.lang.String r0 = "current_update_version_code"
            int r4 = r1.f119854o
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            m102905a(r2, r0, r4)
            java.lang.String r0 = "download_real_version_code"
            int r4 = r1.f119856q
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            m102905a(r2, r0, r4)
            java.lang.String r0 = "force"
            boolean r4 = r30.mo94803j()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            m102905a(r2, r0, r4)
            java.lang.String r0 = "update"
            com.p683ss.android.ugc.aweme.common.C26890h.m65012a(r0, r2)
            return r3
        L_0x00d5:
            java.lang.String r0 = "data"
            org.json.JSONObject r0 = r5.getJSONObject(r0)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            java.lang.String r5 = "tip_version_code"
            r6 = -1
            int r5 = r0.optInt(r5, r6)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            r6 = 1
            if (r5 > 0) goto L_0x012a
            monitor-enter(r30)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            boolean r0 = r1.f119852m     // Catch:{ all -> 0x0127 }
            if (r0 != 0) goto L_0x00ef
            r30.m102901A()     // Catch:{ all -> 0x0127 }
            r1.f119852m = r6     // Catch:{ all -> 0x0127 }
        L_0x00ef:
            monitor-exit(r30)     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = r1.f119853n     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            r0 = r0 ^ r6
            java.lang.String r3 = "enter_method"
            java.lang.String r4 = "check"
            m102905a(r2, r3, r4)
            java.lang.String r3 = "current_update_version_code"
            int r4 = r1.f119854o
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            m102905a(r2, r3, r4)
            java.lang.String r3 = "download_real_version_code"
            int r4 = r1.f119856q
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            m102905a(r2, r3, r4)
            java.lang.String r3 = "force"
            boolean r4 = r30.mo94803j()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            m102905a(r2, r3, r4)
            java.lang.String r3 = "update"
            com.p683ss.android.ugc.aweme.common.C26890h.m65012a(r3, r2)
            return r0
        L_0x0127:
            r0 = move-exception
            monitor-exit(r30)     // Catch:{ all -> 0x0127 }
            throw r0     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
        L_0x012a:
            java.lang.String r7 = "tip_version_name"
            java.lang.String r7 = r0.optString(r7)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            java.lang.String r8 = "real_version_name"
            java.lang.String r8 = r0.optString(r8)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            java.lang.String r9 = "real_version_code"
            int r9 = r0.optInt(r9)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            java.lang.String r10 = "download_url"
            java.lang.String r10 = r0.getString(r10)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            java.lang.String r11 = "whats_new"
            java.lang.String r12 = ""
            java.lang.String r11 = r0.optString(r11, r12)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            java.lang.String r12 = "title"
            java.lang.String r13 = ""
            java.lang.String r12 = r0.optString(r12, r13)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            java.lang.String r13 = "force_update"
            int r13 = r0.optInt(r13, r3)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            if (r13 != r6) goto L_0x015c
            r13 = 1
            goto L_0x015d
        L_0x015c:
            r13 = 0
        L_0x015d:
            java.lang.String r14 = "already_download_tips"
            java.lang.String r15 = ""
            java.lang.String r14 = r0.optString(r14, r15)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            java.lang.String r15 = "interval_since_notify_update"
            r4 = 2
            int r4 = r0.optInt(r15, r4)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            java.lang.String r15 = "pre_download_max_wait_seconds"
            r16 = r7
            r6 = -1
            long r6 = r0.optLong(r15, r6)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            java.lang.String r15 = "latency"
            int r15 = r0.optInt(r15, r3)     // Catch:{ Throwable -> 0x0342, all -> 0x033f }
            java.lang.String r17 = ""
            java.lang.String r18 = ""
            java.lang.String r19 = ""
            java.lang.String r20 = ""
            java.lang.String r3 = "bind_download_data"
            boolean r3 = r0.has(r3)     // Catch:{ Exception -> 0x0200 }
            r21 = r3
            java.lang.String r3 = "bind_download_data"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch:{ Exception -> 0x01f9 }
            if (r0 == 0) goto L_0x01e8
            java.lang.String r3 = "hint_checked"
            r22 = r2
            r2 = 1
            int r3 = r0.optInt(r3, r2)     // Catch:{ Exception -> 0x01fb }
            if (r3 != r2) goto L_0x01a1
            r2 = 1
            goto L_0x01a2
        L_0x01a1:
            r2 = 0
        L_0x01a2:
            java.lang.String r3 = "hint_text"
            r23 = r2
            java.lang.String r2 = ""
            java.lang.String r2 = r0.optString(r3, r2)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r3 = "name"
            r24 = r2
            java.lang.String r2 = ""
            java.lang.String r2 = r0.optString(r3, r2)     // Catch:{ Exception -> 0x01da }
            java.lang.String r3 = "package"
            r25 = r2
            java.lang.String r2 = ""
            java.lang.String r2 = r0.optString(r3, r2)     // Catch:{ Exception -> 0x01cf }
            java.lang.String r3 = "download_url"
            java.lang.String r0 = r0.optString(r3)     // Catch:{ Exception -> 0x01d1 }
            r20 = r0
            r17 = r24
            r18 = r25
            goto L_0x01ee
        L_0x01cd:
            r25 = r2
        L_0x01cf:
            r2 = r19
        L_0x01d1:
            r3 = r21
            r17 = r24
            r18 = r25
            goto L_0x0207
        L_0x01d8:
            r24 = r2
        L_0x01da:
            r2 = r19
            r3 = r21
            r17 = r24
            goto L_0x0207
        L_0x01e1:
            r23 = r2
        L_0x01e3:
            r2 = r19
            r3 = r21
            goto L_0x0207
        L_0x01e8:
            r22 = r2
            r2 = r19
            r23 = 1
        L_0x01ee:
            r27 = r2
            r29 = r17
            r26 = r18
            r28 = r20
            r3 = r21
            goto L_0x020f
        L_0x01f9:
            r22 = r2
        L_0x01fb:
            r2 = r19
            r3 = r21
            goto L_0x0205
        L_0x0200:
            r22 = r2
            r2 = r19
            r3 = 0
        L_0x0205:
            r23 = 1
        L_0x0207:
            r27 = r2
            r29 = r17
            r26 = r18
            r28 = r20
        L_0x020f:
            r0 = r23
            java.net.URL r2 = new java.net.URL     // Catch:{ Throwable -> 0x033b, all -> 0x0337 }
            r2.<init>(r10)     // Catch:{ Throwable -> 0x033b, all -> 0x0337 }
            monitor-enter(r30)     // Catch:{ Throwable -> 0x033b, all -> 0x0337 }
            boolean r2 = r1.f119852m     // Catch:{ all -> 0x032e }
            if (r2 != 0) goto L_0x0221
            r30.m102901A()     // Catch:{ all -> 0x032e }
            r2 = 1
            r1.f119852m = r2     // Catch:{ all -> 0x032e }
        L_0x0221:
            r1.f119855p = r5     // Catch:{ all -> 0x032e }
            r1.f119856q = r9     // Catch:{ all -> 0x032e }
            r2 = r16
            r1.f119857r = r2     // Catch:{ all -> 0x032e }
            r1.f119858s = r8     // Catch:{ all -> 0x032e }
            r1.f119853n = r10     // Catch:{ all -> 0x032e }
            r1.f119859t = r11     // Catch:{ all -> 0x032e }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x032e }
            r1.f119860u = r8     // Catch:{ all -> 0x032e }
            r1.f119862w = r12     // Catch:{ all -> 0x032e }
            r1.f119863x = r13     // Catch:{ all -> 0x032e }
            r1.f119861v = r14     // Catch:{ all -> 0x032e }
            r1.f119825E = r4     // Catch:{ all -> 0x032e }
            r1.f119826F = r6     // Catch:{ all -> 0x032e }
            r1.f119827G = r15     // Catch:{ all -> 0x032e }
            r1.f119864y = r3     // Catch:{ all -> 0x032e }
            r1.f119865z = r0     // Catch:{ all -> 0x032e }
            r0 = r29
            r1.f119821A = r0     // Catch:{ all -> 0x032e }
            r0 = r26
            r1.f119822B = r0     // Catch:{ all -> 0x032e }
            r2 = r27
            r1.f119823C = r2     // Catch:{ all -> 0x032e }
            r0 = r28
            r1.f119824D = r0     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "EvilsoulM"
            java.lang.String r2 = "before saveData"
            r3 = 3
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r3, r0, r2)     // Catch:{ all -> 0x032e }
            android.content.Context r0 = r1.f119844e     // Catch:{ all -> 0x032e }
            java.lang.String r2 = "update_info"
            r3 = 0
            android.content.SharedPreferences r0 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r0, r2, r3)     // Catch:{ all -> 0x032e }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x032e }
            java.lang.String r2 = "tip_version_code"
            int r3 = r1.f119855p     // Catch:{ all -> 0x032e }
            r0.putInt(r2, r3)     // Catch:{ all -> 0x032e }
            java.lang.String r2 = "real_version_code"
            int r3 = r1.f119856q     // Catch:{ all -> 0x032e }
            r0.putInt(r2, r3)     // Catch:{ all -> 0x032e }
            java.lang.String r2 = "tip_version_name"
            java.lang.String r3 = r1.f119857r     // Catch:{ all -> 0x032e }
            r0.putString(r2, r3)     // Catch:{ all -> 0x032e }
            java.lang.String r2 = "real_version_name"
            java.lang.String r3 = r1.f119858s     // Catch:{ all -> 0x032e }
            r0.putString(r2, r3)     // Catch:{ all -> 0x032e }
            java.lang.String r2 = "title"
            java.lang.String r3 = r1.f119862w     // Catch:{ all -> 0x032e }
            r0.putString(r2, r3)     // Catch:{ all -> 0x032e }
            java.lang.String r2 = "download_url"
            java.lang.String r3 = r1.f119853n     // Catch:{ all -> 0x032e }
            r0.putString(r2, r3)     // Catch:{ all -> 0x032e }
            java.lang.String r2 = "whats_new"
            java.lang.String r3 = r1.f119859t     // Catch:{ all -> 0x032e }
            r0.putString(r2, r3)     // Catch:{ all -> 0x032e }
            java.lang.String r2 = "last_check_time"
            long r3 = r1.f119860u     // Catch:{ all -> 0x032e }
            r0.putLong(r2, r3)     // Catch:{ all -> 0x032e }
            java.lang.String r2 = "force_update"
            boolean r3 = r1.f119863x     // Catch:{ all -> 0x032e }
            r0.putBoolean(r2, r3)     // Catch:{ all -> 0x032e }
            java.lang.String r2 = "already_download_tips"
            java.lang.String r3 = r1.f119861v     // Catch:{ all -> 0x032e }
            r0.putString(r2, r3)     // Catch:{ all -> 0x032e }
            java.lang.String r2 = "interval_since_notify_update"
            int r3 = r1.f119825E     // Catch:{ all -> 0x032e }
            r0.putInt(r2, r3)     // Catch:{ all -> 0x032e }
            java.lang.String r2 = "pre_download_max_wait_seconds"
            long r3 = r1.f119826F     // Catch:{ all -> 0x032e }
            r0.putLong(r2, r3)     // Catch:{ all -> 0x032e }
            java.lang.String r2 = "latency"
            int r3 = r1.f119827G     // Catch:{ all -> 0x032e }
            r0.putInt(r2, r3)     // Catch:{ all -> 0x032e }
            java.lang.String r2 = "bind_download_data"
            boolean r3 = r1.f119864y     // Catch:{ all -> 0x032e }
            r0.putBoolean(r2, r3)     // Catch:{ all -> 0x032e }
            java.lang.String r2 = "hint_checked"
            boolean r3 = r1.f119865z     // Catch:{ all -> 0x032e }
            r0.putBoolean(r2, r3)     // Catch:{ all -> 0x032e }
            java.lang.String r2 = "hint_text"
            java.lang.String r3 = r1.f119821A     // Catch:{ all -> 0x032e }
            r0.putString(r2, r3)     // Catch:{ all -> 0x032e }
            java.lang.String r2 = "name"
            java.lang.String r3 = r1.f119822B     // Catch:{ all -> 0x032e }
            r0.putString(r2, r3)     // Catch:{ all -> 0x032e }
            java.lang.String r2 = "package"
            java.lang.String r3 = r1.f119823C     // Catch:{ all -> 0x032e }
            r0.putString(r2, r3)     // Catch:{ all -> 0x032e }
            java.lang.String r2 = "download_url"
            java.lang.String r3 = r1.f119824D     // Catch:{ all -> 0x032e }
            r0.putString(r2, r3)     // Catch:{ all -> 0x032e }
            com.bytedance.common.utility.p525e.C9402b.m18594a(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "EvilsoulM"
            java.lang.String r2 = "after saveData"
            r3 = 3
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r3, r0, r2)     // Catch:{ all -> 0x032e }
            monitor-exit(r30)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "enter_method"
            java.lang.String r2 = "check"
            r3 = r22
            m102905a(r3, r0, r2)
            java.lang.String r0 = "current_update_version_code"
            int r2 = r1.f119854o
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            m102905a(r3, r0, r2)
            java.lang.String r0 = "download_real_version_code"
            int r2 = r1.f119856q
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            m102905a(r3, r0, r2)
            java.lang.String r0 = "force"
            boolean r2 = r30.mo94803j()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            m102905a(r3, r0, r2)
            java.lang.String r0 = "update"
            com.p683ss.android.ugc.aweme.common.C26890h.m65012a(r0, r3)
            r0 = 1
            return r0
        L_0x032e:
            r0 = move-exception
            r3 = r22
        L_0x0331:
            monitor-exit(r30)     // Catch:{ all -> 0x0335 }
            throw r0     // Catch:{ Throwable -> 0x0333 }
        L_0x0333:
            r0 = move-exception
            goto L_0x0344
        L_0x0335:
            r0 = move-exception
            goto L_0x0331
        L_0x0337:
            r0 = move-exception
            r3 = r22
            goto L_0x039b
        L_0x033b:
            r0 = move-exception
            r3 = r22
            goto L_0x0344
        L_0x033f:
            r0 = move-exception
            r3 = r2
            goto L_0x039b
        L_0x0342:
            r0 = move-exception
            r3 = r2
        L_0x0344:
            boolean r2 = r0 instanceof java.util.concurrent.ExecutionException     // Catch:{ all -> 0x039a }
            if (r2 == 0) goto L_0x034c
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x039a }
        L_0x034c:
            android.content.Context r2 = r1.f119844e     // Catch:{ all -> 0x039a }
            int r2 = com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a.m56495b(r2, r0)     // Catch:{ all -> 0x039a }
            r4 = 18
            if (r4 == r2) goto L_0x0360
            java.lang.String r0 = "errorCode"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x039a }
            m102905a(r3, r0, r2)     // Catch:{ all -> 0x039a }
            goto L_0x0369
        L_0x0360:
            java.lang.String r2 = "errorMsg"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x039a }
            m102905a(r3, r2, r0)     // Catch:{ all -> 0x039a }
        L_0x0369:
            java.lang.String r0 = "enter_method"
            java.lang.String r2 = "check"
            m102905a(r3, r0, r2)
            java.lang.String r0 = "current_update_version_code"
            int r2 = r1.f119854o
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            m102905a(r3, r0, r2)
            java.lang.String r0 = "download_real_version_code"
            int r2 = r1.f119856q
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            m102905a(r3, r0, r2)
            java.lang.String r0 = "force"
            boolean r2 = r30.mo94803j()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            m102905a(r3, r0, r2)
            java.lang.String r0 = "update"
            com.p683ss.android.ugc.aweme.common.C26890h.m65012a(r0, r3)
            r2 = 0
            return r2
        L_0x039a:
            r0 = move-exception
        L_0x039b:
            java.lang.String r2 = "enter_method"
            java.lang.String r4 = "check"
            m102905a(r3, r2, r4)
            int r2 = r1.f119854o
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "current_update_version_code"
            m102905a(r3, r4, r2)
            int r2 = r1.f119856q
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "download_real_version_code"
            m102905a(r3, r4, r2)
            boolean r2 = r30.mo94803j()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r4 = "force"
            m102905a(r3, r4, r2)
            java.lang.String r2 = "update"
            com.p683ss.android.ugc.aweme.common.C26890h.m65012a(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.update.UpdateHelper.mo94812t():boolean");
    }

    /* renamed from: a */
    public final void mo94792a(C47513b bVar) {
        synchronized (this.f119832L) {
            bVar.f119891a = this.f119832L.f119891a;
            bVar.f119892b = this.f119832L.f119892b;
        }
    }

    /* renamed from: a */
    public static String m102903a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        String[] split = str.split("\\\\n");
        StringBuilder sb = new StringBuilder();
        for (String trim : split) {
            sb.append(trim.trim());
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static String m102907b(String str) {
        C18922i iVar = new C18922i(str);
        if (C11010c.m22286g() > 0) {
            iVar.mo38778a("update_version_code", String.valueOf(C11010c.m22286g()));
        }
        if (C11010c.m22293n() > 0) {
            iVar.mo38778a("manifest_version_code", String.valueOf(C11010c.m22293n()));
        }
        iVar.mo38778a("cpu_abi", m102908s());
        return iVar.mo38774a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        r4.f119833M = new com.p683ss.android.ugc.aweme.update.UpdateHelper.C47509c(r4, false, true);
        r4.f119833M.start();
        r4.f119834N = new com.p683ss.android.ugc.aweme.update.UpdateHelper.C47511e(r4);
        r4.f119834N.start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m102906a(boolean r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r5 = r4.f119852m     // Catch:{ all -> 0x004d }
            r0 = 1
            if (r5 != 0) goto L_0x000b
            r4.m102901A()     // Catch:{ all -> 0x004d }
            r4.f119852m = r0     // Catch:{ all -> 0x004d }
        L_0x000b:
            boolean r5 = r4.f119831K     // Catch:{ all -> 0x004d }
            if (r5 == 0) goto L_0x0011
            monitor-exit(r4)     // Catch:{ all -> 0x004d }
            return
        L_0x0011:
            com.ss.android.ugc.aweme.update.b r5 = r4.f119832L     // Catch:{ all -> 0x004d }
            r1 = 0
            r5.f119891a = r1     // Catch:{ all -> 0x004d }
            com.ss.android.ugc.aweme.update.b r5 = r4.f119832L     // Catch:{ all -> 0x004d }
            r5.f119892b = r1     // Catch:{ all -> 0x004d }
            r4.f119831K = r0     // Catch:{ all -> 0x004d }
            r4.m102909z()     // Catch:{ all -> 0x004d }
            int r5 = r4.f119829I     // Catch:{ all -> 0x004d }
            int r1 = r4.f119856q     // Catch:{ all -> 0x004d }
            r2 = 0
            if (r5 == r1) goto L_0x0033
            int r5 = r4.f119856q     // Catch:{ all -> 0x004d }
            r4.f119829I = r5     // Catch:{ all -> 0x004d }
            int r5 = r4.f119829I     // Catch:{ all -> 0x004d }
            r1 = -1
            java.lang.String r3 = ""
            r4.m102904a(r5, r1, r3, r2)     // Catch:{ all -> 0x004d }
        L_0x0033:
            monitor-exit(r4)     // Catch:{ all -> 0x004d }
            com.ss.android.ugc.aweme.update.UpdateHelper$c r5 = new com.ss.android.ugc.aweme.update.UpdateHelper$c
            r5.<init>(r2, r0)
            r4.f119833M = r5
            com.ss.android.ugc.aweme.update.UpdateHelper$c r5 = r4.f119833M
            r5.start()
            com.ss.android.ugc.aweme.update.UpdateHelper$e r5 = new com.ss.android.ugc.aweme.update.UpdateHelper$e
            r5.<init>()
            r4.f119834N = r5
            com.ss.android.ugc.aweme.update.UpdateHelper$e r5 = r4.f119834N
            r5.start()
            return
        L_0x004d:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.update.UpdateHelper.m102906a(boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Notification mo94790a(int i) {
        String c = C11010c.f29572u.mo19896c();
        String a = C2240a.m6772a(this.f119844e.getString(R.string.dp8), new Object[]{c, mo94798e()});
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("%");
        String sb2 = sb.toString();
        Intent intent = new Intent(this.f119844e, UpdateActivity.class);
        intent.addFlags(536870912);
        PendingIntent activity = PendingIntent.getActivity(this.f119844e, 0, intent, 0);
        if (i != 0 && this.f119840T != null) {
            return C47520g.m102948a(this.f119844e, this.f119840T, a, sb2, i);
        }
        this.f119840T = new C0614d(this.f119844e, "update_notification");
        return C47520g.m102947a(this.f119844e, this.f119840T, 17301633, null, c, a, sb2, i, activity);
    }

    /* renamed from: a */
    public final void mo94794a(JSONObject jSONObject) {
        if (jSONObject != null) {
            C31345v vVar = new C31345v();
            vVar.f82104a = jSONObject.optInt("update_sdk", 1);
            vVar.f82105b = jSONObject.optInt("pre_download_version", 0);
            vVar.f82106c = jSONObject.optInt("pre_download_start_time", 0);
            vVar.f82107d = jSONObject.optInt("pre_download_delay_days", 0);
            vVar.f82108e = jSONObject.optLong("pre_download_delay_second", -1);
            C23859b.m58575b().mo49464a(this.f119844e, "update_params", (Object) vVar);
        }
    }

    /* renamed from: a */
    public final void mo94793a(String str, String str2) {
        C26890h.m65011a(str, C23089d.m56640a().mo47829a("enter_method", str2).mo47826a("current_update_version_code", this.f119854o).mo47826a("download_real_version_code", this.f119856q).mo47828a("force", (Object) Boolean.valueOf(mo94803j())).f61491a);
    }

    /* renamed from: a */
    public static void m102905a(JSONObject jSONObject, String str, Object obj) {
        if (!C9431p.m18664a(str) && obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo94791a(int i, String str, boolean z) {
        if (z) {
            try {
                this.f119835O = i;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            this.f119830J = i;
        }
        this.f119828H = str;
        Editor edit = C35807d.m80935a(this.f119844e, "update_info", 0).edit();
        if (z) {
            edit.putInt("pre_download_size", this.f119835O);
        } else {
            edit.putInt("download_size", this.f119830J);
        }
        edit.putString("download_etag", this.f119828H);
        C9402b.m18594a(edit);
    }

    /* renamed from: a */
    private synchronized void m102904a(int i, int i2, String str, boolean z) {
        this.f119829I = i;
        this.f119830J = -1;
        this.f119828H = str;
        Editor edit = C35807d.m80935a(this.f119844e, "update_info", 0).edit();
        edit.putInt("download_version", this.f119829I);
        edit.putInt("download_size", this.f119830J);
        edit.putString("download_etag", this.f119828H);
        C9402b.m18594a(edit);
    }
}
