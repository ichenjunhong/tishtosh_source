package com.p683ss.android.download;

import android.app.AlarmManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p683ss.android.download.p1161b.C19096c.C19097a;
import com.p683ss.android.download.p1161b.C19098d;
import java.io.File;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.download.DownloadService */
public class DownloadService extends Service {

    /* renamed from: a */
    C19138v f52516a;

    /* renamed from: b */
    public C19078a f52517b;

    /* renamed from: c */
    public C19109e f52518c;

    /* renamed from: d */
    public final Map<Long, C19101c> f52519d = new HashMap();

    /* renamed from: e */
    public final ExecutorService f52520e;

    /* renamed from: f */
    public C19123j f52521f;

    /* renamed from: g */
    public HandlerThread f52522g;

    /* renamed from: h */
    Handler f52523h;

    /* renamed from: i */
    volatile int f52524i;

    /* renamed from: j */
    private AlarmManager f52525j;

    /* renamed from: k */
    private C19136u f52526k;

    /* renamed from: l */
    private Callback f52527l;

    /* renamed from: com.ss.android.download.DownloadService$a */
    class C19078a extends ContentObserver {
        public final void onChange(boolean z) {
            DownloadService.this.mo38990a();
        }

        public C19078a() {
            super(new Handler());
        }
    }

    public DownloadService() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());
        if (VERSION.SDK_INT >= 9) {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        this.f52520e = threadPoolExecutor;
        this.f52527l = new Callback() {
            public final boolean handleMessage(Message message) {
                boolean b;
                Process.setThreadPriority(10);
                int i = message.arg1;
                synchronized (DownloadService.this.f52519d) {
                    b = DownloadService.this.mo38991b();
                }
                if (message.what == 2) {
                    for (Entry key : Thread.getAllStackTraces().entrySet()) {
                        ((Thread) key.getKey()).getName().startsWith("pool");
                    }
                    C19109e eVar = DownloadService.this.f52518c;
                    synchronized (eVar.f52659c) {
                        for (int i2 = 0; i2 < eVar.f52659c.f52593c; i2++) {
                            SystemClock.elapsedRealtime();
                        }
                    }
                }
                if (b) {
                    DownloadService downloadService = DownloadService.this;
                    downloadService.f52523h.removeMessages(2);
                    downloadService.f52523h.sendMessageDelayed(downloadService.f52523h.obtainMessage(2, downloadService.f52524i, -1), 300000);
                } else if (DownloadService.this.stopSelfResult(i)) {
                    if (DownloadService.this.f52517b != null) {
                        DownloadService.this.getContentResolver().unregisterContentObserver(DownloadService.this.f52517b);
                    }
                    if (DownloadService.this.f52521f != null) {
                        DownloadService.this.f52521f.mo39060a();
                    }
                    if (DownloadService.this.f52522g != null) {
                        DownloadService.this.f52522g.quit();
                    }
                    if (DownloadService.this.f52520e != null) {
                        DownloadService.this.f52520e.shutdown();
                    }
                }
                return true;
            }
        };
    }

    /* renamed from: a */
    public final void mo38990a() {
        this.f52523h.removeMessages(1);
        this.f52523h.obtainMessage(1, this.f52524i, -1).sendToTarget();
    }

    public void onDestroy() {
        try {
            if (this.f52517b != null) {
                getContentResolver().unregisterContentObserver(this.f52517b);
            }
            if (this.f52521f != null) {
                this.f52521f.mo39060a();
            }
            if (this.f52522g != null) {
                this.f52522g.quit();
            }
            if (this.f52520e != null) {
                this.f52520e.shutdown();
            }
        } catch (Exception unused) {
        }
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        if (!C19129n.m46627a(getApplicationContext())) {
            stopSelf();
        } else if (!C19129n.m46626a()) {
            stopSelf();
        } else {
            if (this.f52516a == null) {
                this.f52516a = C19133r.m46640a((Context) this);
            }
            this.f52525j = (AlarmManager) getSystemService("alarm");
            this.f52526k = new C19136u(this);
            this.f52522g = new HandlerThread("SsDownloadManager-UpdateThread");
            this.f52522g.start();
            this.f52523h = new Handler(this.f52522g.getLooper(), this.f52527l);
            this.f52521f = new C19123j(this);
            this.f52518c = C19109e.m46560a((Context) this);
            this.f52518c.mo39041a();
            this.f52517b = new C19078a();
            getContentResolver().registerContentObserver(C19097a.f52584a, true, this.f52517b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0118, code lost:
        if (r5 != null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011f, code lost:
        if (r5 != null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0125, code lost:
        r13 = Long.MAX_VALUE;
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012b, code lost:
        if (r5 != null) goto L_0x011a;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011e A[ExcHandler: all (r0v7 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0026] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo38991b() {
        /*
            r24 = this;
            r1 = r24
            com.ss.android.download.v r0 = r1.f52516a
            long r2 = r0.mo39070a()
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Map<java.lang.Long, com.ss.android.download.c> r4 = r1.f52519d
            java.util.Set r4 = r4.keySet()
            r0.<init>(r4)
            android.content.Context r4 = r24.getApplicationContext()
            com.ss.android.download.g r4 = com.p683ss.android.download.C19117g.m46591a(r4)
            android.net.Uri r6 = com.p683ss.android.download.p1161b.C19096c.C19097a.f52584a
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r4
            android.database.Cursor r5 = r5.mo39054a(r6, r7, r8, r9, r10)
            com.ss.android.download.c$b r11 = new com.ss.android.download.c$b     // Catch:{ Exception -> 0x0125, all -> 0x011e }
            r11.<init>(r4, r5)     // Catch:{ Exception -> 0x0125, all -> 0x011e }
            java.lang.String r12 = "_id"
            int r12 = r5.getColumnIndexOrThrow(r12)     // Catch:{ Exception -> 0x0125, all -> 0x011e }
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r15 = 0
        L_0x0037:
            boolean r16 = r5.moveToNext()     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            if (r16 == 0) goto L_0x0118
            long r16 = r5.getLong(r12)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.Long r10 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r0.remove(r10)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.util.Map<java.lang.Long, com.ss.android.download.c> r10 = r1.f52519d     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.Long r8 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.Object r8 = r10.get(r8)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.download.c r8 = (com.p683ss.android.download.C19101c) r8     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            if (r8 == 0) goto L_0x005a
            r11.mo39031a(r8)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            goto L_0x006f
        L_0x005a:
            com.ss.android.download.v r8 = r1.f52516a     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.download.u r9 = r1.f52526k     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.download.e r10 = r1.f52518c     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.download.c r8 = r11.mo39030a(r1, r8, r9, r10)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.util.Map<java.lang.Long, com.ss.android.download.c> r9 = r1.f52519d     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            long r6 = r8.f52606a     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r9.put(r6, r8)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
        L_0x006f:
            boolean r6 = r8.f52628w     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r7 = 0
            if (r6 == 0) goto L_0x00af
            java.lang.String r6 = r8.f52629x     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            if (r6 != 0) goto L_0x0089
            android.content.ContentResolver r6 = r24.getContentResolver()     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.String r9 = r8.f52629x     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r6.delete(r9, r7, r7)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
        L_0x0089:
            java.util.Map<java.lang.Long, com.ss.android.download.c> r6 = r1.f52519d     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            long r9 = r8.f52606a     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r6.remove(r9)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.String r6 = r8.f52610e     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            m46456a(r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            android.net.Uri r6 = r8.mo39029c()     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r4.mo39053a(r6, r7, r7)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.download.e r6 = r1.f52518c     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r6.mo39044a(r8)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.download.e r6 = r1.f52518c     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.String r7 = com.p683ss.android.download.C19109e.m46567b(r8)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r6.mo39045a(r7)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            goto L_0x00ef
        L_0x00af:
            java.lang.String r6 = r8.f52610e     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.String r9 = r8.f52610e     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            if (r9 == 0) goto L_0x00e0
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r9.<init>(r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            int r6 = r8.f52615j     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r10 = 200(0xc8, float:2.8E-43)
            if (r6 != r10) goto L_0x00e0
            boolean r6 = r9.exists()     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            if (r6 != 0) goto L_0x00e0
            java.lang.String r6 = com.p683ss.android.download.C19109e.m46567b(r8)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            android.content.Context r9 = r8.f52599F     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.download.e r9 = com.p683ss.android.download.C19109e.m46560a(r9)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r9.mo39045a(r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            android.content.Context r6 = r8.f52599F     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.download.g r6 = com.p683ss.android.download.C19117g.m46591a(r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            android.net.Uri r9 = r8.mo39029c()     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r6.mo39053a(r9, r7, r7)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
        L_0x00e0:
            java.util.concurrent.ExecutorService r6 = r1.f52520e     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            boolean r6 = r8.mo39027a(r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.download.j r7 = r1.f52521f     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            boolean r7 = r8.mo39026a(r7)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r6 = r6 | r15
            r6 = r6 | r7
            r15 = r6
        L_0x00ef:
            int r6 = r8.f52615j     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            boolean r6 = com.p683ss.android.download.p1161b.C19096c.C19097a.m46515c(r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            if (r6 == 0) goto L_0x00fd
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0111
        L_0x00fd:
            int r6 = r8.f52615j     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r7 = 194(0xc2, float:2.72E-43)
            if (r6 == r7) goto L_0x0106
        L_0x0103:
            r6 = 0
            goto L_0x0111
        L_0x0106:
            long r6 = r8.mo39023a(r2)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 > 0) goto L_0x010f
            goto L_0x0103
        L_0x010f:
            r8 = 0
            long r6 = r6 - r2
        L_0x0111:
            long r6 = java.lang.Math.min(r6, r13)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r13 = r6
            goto L_0x0037
        L_0x0118:
            if (r5 == 0) goto L_0x012e
        L_0x011a:
            r5.close()     // Catch:{ Exception -> 0x012e }
            goto L_0x012e
        L_0x011e:
            r0 = move-exception
            if (r5 == 0) goto L_0x0124
            r5.close()     // Catch:{ Exception -> 0x0124 }
        L_0x0124:
            throw r0
        L_0x0125:
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r15 = 0
        L_0x012b:
            if (r5 == 0) goto L_0x012e
            goto L_0x011a
        L_0x012e:
            java.util.Iterator r0 = r0.iterator()
        L_0x0132:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x017a
            java.lang.Object r4 = r0.next()
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            java.util.Map<java.lang.Long, com.ss.android.download.c> r6 = r1.f52519d
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r4 = r6.get(r4)
            com.ss.android.download.c r4 = (com.p683ss.android.download.C19101c) r4
            int r5 = r4.f52615j
            r6 = 192(0xc0, float:2.69E-43)
            if (r5 != r6) goto L_0x0158
            r5 = 490(0x1ea, float:6.87E-43)
            r4.f52615j = r5
        L_0x0158:
            int r5 = r4.f52612g
            if (r5 == 0) goto L_0x0165
            java.lang.String r5 = r4.f52610e
            if (r5 == 0) goto L_0x0165
            java.lang.String r5 = r4.f52610e
            m46456a(r5)
        L_0x0165:
            com.ss.android.download.e r5 = r1.f52518c
            java.lang.String r6 = com.p683ss.android.download.C19109e.m46567b(r4)
            r5.mo39045a(r6)
            java.util.Map<java.lang.Long, com.ss.android.download.c> r5 = r1.f52519d
            long r6 = r4.f52606a
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r5.remove(r4)
            goto L_0x0132
        L_0x017a:
            com.ss.android.download.e r0 = r1.f52518c
            java.util.Map<java.lang.Long, com.ss.android.download.c> r4 = r1.f52519d
            java.util.Collection r4 = r4.values()
            r0.mo39046a(r4)
            r4 = 0
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c7
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x01c7
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r4 = "android.ss.intent.action.DOWNLOAD_WAKEUP"
            r0.<init>(r4)
            java.lang.Class<com.ss.android.download.DownloadHandlerService> r4 = com.p683ss.android.download.DownloadHandlerService.class
            r0.setClass(r1, r4)
            r10 = 1
            com.ss.android.download.p r4 = com.p683ss.android.download.C19129n.f52724b
            if (r4 == 0) goto L_0x01ac
            com.ss.android.download.p r4 = com.p683ss.android.download.C19129n.f52724b
            boolean r4 = r4.mo39069b()
            goto L_0x01ad
        L_0x01ac:
            r4 = 0
        L_0x01ad:
            if (r4 == 0) goto L_0x01b2
            r20 = 0
            goto L_0x01b4
        L_0x01b2:
            r20 = 1
        L_0x01b4:
            android.app.AlarmManager r4 = r1.f52525j     // Catch:{ Exception -> 0x01c7 }
            r5 = 0
            long r21 = r2 + r13
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 0
            android.app.PendingIntent r23 = android.app.PendingIntent.getService(r1, r3, r0, r2)     // Catch:{ Exception -> 0x01c7 }
            com.bytedance.common.c.d$a r18 = com.bytedance.common.p520c.C9359d.f25597a     // Catch:{ Exception -> 0x01c7 }
            r19 = r4
            r18.mo16982a(r19, r20, r21, r23)     // Catch:{ Exception -> 0x01c7 }
        L_0x01c7:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.download.DownloadService.mo38991b():boolean");
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Cannot bind to Download Manager Service");
    }

    /* renamed from: a */
    public static void m46455a(Context context) {
        try {
            C19125k.m46607a(context, new Intent(context, DownloadService.class));
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m46456a(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int onStartCommand = super.onStartCommand(intent, i, i2);
        if (!C19129n.m46627a(getApplicationContext())) {
            stopSelf();
            return onStartCommand;
        } else if (!C19129n.m46626a()) {
            stopSelf();
            return onStartCommand;
        } else {
            this.f52524i = i2;
            mo38990a();
            return onStartCommand;
        }
    }

    /* access modifiers changed from: protected */
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str;
        String str2;
        String str3;
        C19098d dVar = new C19098d(printWriter, "  ");
        synchronized (this.f52519d) {
            ArrayList<Long> arrayList = new ArrayList<>(this.f52519d.keySet());
            Collections.sort(arrayList);
            for (Long l : arrayList) {
                C19101c cVar = (C19101c) this.f52519d.get(l);
                dVar.println("DownloadInfo:");
                dVar.f52586b.append(dVar.f52585a);
                dVar.f52587c = null;
                dVar.mo39017a("mId", Long.valueOf(cVar.f52606a));
                dVar.mo39017a("mLastMod", Long.valueOf(cVar.f52618m));
                dVar.mo39017a("mPackage", cVar.f52619n);
                dVar.println();
                dVar.mo39017a("mUri", cVar.f52607b);
                dVar.println();
                dVar.mo39017a("mMimeType", cVar.f52611f);
                String str4 = "mCookies";
                if (cVar.f52621p != null) {
                    str = "yes";
                } else {
                    str = "no";
                }
                dVar.mo39017a(str4, str);
                String str5 = "mReferer";
                if (cVar.f52623r != null) {
                    str2 = "yes";
                } else {
                    str2 = "no";
                }
                dVar.mo39017a(str5, str2);
                dVar.mo39017a("mUserAgent", cVar.f52622q);
                dVar.println();
                dVar.mo39017a("mFileName", cVar.f52610e);
                dVar.mo39017a("mDestination", Integer.valueOf(cVar.f52612g));
                dVar.println();
                String str6 = "mStatus";
                int i = cVar.f52615j;
                if (i == 190) {
                    str3 = "PENDING";
                } else if (i == 400) {
                    str3 = "BAD_REQUEST";
                } else if (i != 406) {
                    switch (i) {
                        case 192:
                            str3 = "RUNNING";
                            break;
                        case 193:
                            str3 = "PAUSED_BY_APP";
                            break;
                        case 194:
                            str3 = "WAITING_TO_RETRY";
                            break;
                        case 195:
                            str3 = "WAITING_FOR_NETWORK";
                            break;
                        case 196:
                            str3 = "QUEUED_FOR_WIFI";
                            break;
                        default:
                            switch (i) {
                                case 198:
                                    str3 = "INSUFFICIENT_SPACE_ERROR";
                                    break;
                                case 199:
                                    str3 = "DEVICE_NOT_FOUND_ERROR";
                                    break;
                                case 200:
                                    str3 = "SUCCESS";
                                    break;
                                default:
                                    switch (i) {
                                        case 411:
                                            str3 = "LENGTH_REQUIRED";
                                            break;
                                        case 412:
                                            str3 = "PRECONDITION_FAILED";
                                            break;
                                        default:
                                            switch (i) {
                                                case 488:
                                                    str3 = "FILE_ALREADY_EXISTS_ERROR";
                                                    break;
                                                case 489:
                                                    str3 = "CANNOT_RESUME";
                                                    break;
                                                case 490:
                                                    str3 = "CANCELED";
                                                    break;
                                                case 491:
                                                    str3 = "UNKNOWN_ERROR";
                                                    break;
                                                case 492:
                                                    str3 = "FILE_ERROR";
                                                    break;
                                                case 493:
                                                    str3 = "UNHANDLED_REDIRECT";
                                                    break;
                                                case 494:
                                                    str3 = "UNHANDLED_HTTP_CODE";
                                                    break;
                                                case 495:
                                                    str3 = "HTTP_DATA_ERROR";
                                                    break;
                                                case 496:
                                                    str3 = "HTTP_EXCEPTION";
                                                    break;
                                                case 497:
                                                    str3 = "TOO_MANY_REDIRECTS";
                                                    break;
                                                case 498:
                                                    str3 = "BLOCKED";
                                                    break;
                                                default:
                                                    str3 = Integer.toString(i);
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    str3 = "NOT_ACCEPTABLE";
                }
                dVar.mo39017a(str6, str3);
                dVar.mo39017a("mCurrentBytes", Long.valueOf(cVar.f52625t));
                dVar.mo39017a("mTotalBytes", Long.valueOf(cVar.f52624s));
                dVar.println();
                dVar.mo39017a("mNumFailed", Integer.valueOf(cVar.f52616k));
                dVar.mo39017a("mRetryAfter", Integer.valueOf(cVar.f52617l));
                dVar.mo39017a("mETag", cVar.f52626u);
                dVar.println();
                dVar.mo39017a("mAllowedNetworkTypes", Integer.valueOf(cVar.f52630y));
                dVar.mo39017a("mAllowRoaming", Boolean.valueOf(cVar.f52631z));
                dVar.println();
                dVar.f52586b.delete(0, dVar.f52585a.length());
                dVar.f52587c = null;
            }
        }
    }
}
