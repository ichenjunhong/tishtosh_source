package com.p683ss.android.socialbase.downloader.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.text.TextUtils;
import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.p1212b.C19784e;
import com.p683ss.android.socialbase.downloader.p1219h.C19938a;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;
import java.util.ArrayList;

/* renamed from: com.ss.android.socialbase.downloader.notification.DownloadNotificationService */
public class DownloadNotificationService extends Service {

    /* renamed from: a */
    public static volatile long f55091a = 0;

    /* renamed from: b */
    public static boolean f55092b = false;

    /* renamed from: c */
    public static long f55093c = 900;

    /* renamed from: e */
    private static final String f55094e = "DownloadNotificationService";

    /* renamed from: f */
    private static int f55095f = -1;

    /* renamed from: g */
    private static int f55096g = -1;

    /* renamed from: h */
    private static boolean f55097h = true;

    /* renamed from: i */
    private static boolean f55098i;

    /* renamed from: j */
    private static volatile long f55099j;

    /* renamed from: d */
    public Handler f55100d;

    /* renamed from: k */
    private HandlerThread f55101k;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f55101k != null) {
            try {
                this.f55101k.quit();
            } catch (Throwable unused) {
            }
            this.f55101k = null;
            this.f55100d = null;
        }
    }

    public void onCreate() {
        super.onCreate();
        if (this.f55101k == null) {
            this.f55101k = new HandlerThread("DownloaderNotifyThread");
            this.f55101k.start();
            this.f55100d = new Handler(this.f55101k.getLooper());
        }
        C19884b.m48601a((Context) this);
        C19938a b = C19938a.m48933b();
        int a = b.mo41658a("download_service_foreground", 0);
        if ((a == 1 || a == 3) && f55095f == -1) {
            f55095f = 0;
        }
        if ((a == 2 || a == 3) && f55096g == -1) {
            f55096g = 0;
        }
        f55098i = b.mo41661a("non_going_notification_foreground", false);
        f55092b = b.mo41661a("notify_too_fast", false);
        long a2 = b.mo41659a("notification_time_window", 900);
        f55093c = a2;
        if (a2 < 0 || f55093c > 1200) {
            f55093c = 900;
        }
    }

    /* renamed from: a */
    private static boolean m49528a(int i, Notification notification) {
        if (!f55097h || f55095f == i || f55096g == i) {
            return false;
        }
        if (f55095f != 0 && f55096g != 0) {
            return false;
        }
        if (f55098i && (notification.flags & 2) == 0) {
            return false;
        }
        if (VERSION.SDK_INT < 26 || !TextUtils.isEmpty(notification.getChannelId())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:48|49|50|51|52) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0063 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00b8 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42096a(android.app.NotificationManager r10, int r11) {
        /*
            r9 = this;
            int r0 = f55095f
            if (r0 == r11) goto L_0x000d
            int r0 = f55096g
            if (r0 != r11) goto L_0x0009
            goto L_0x000d
        L_0x0009:
            r10.cancel(r11)     // Catch:{ Throwable -> 0x00d2 }
            return
        L_0x000d:
            int r0 = f55095f
            r1 = 1
            r2 = 0
            if (r0 != r11) goto L_0x0017
            f55095f = r2
            r0 = 0
            goto L_0x001a
        L_0x0017:
            f55096g = r2
            r0 = 1
        L_0x001a:
            com.ss.android.socialbase.downloader.downloader.c r3 = com.p683ss.android.socialbase.downloader.downloader.C19886c.m48631a()     // Catch:{ Throwable -> 0x0063 }
            com.ss.android.socialbase.downloader.downloader.n r3 = r3.mo41488c(r11)     // Catch:{ Throwable -> 0x0063 }
            boolean r4 = r3.mo41593b()     // Catch:{ Throwable -> 0x0063 }
            if (r4 != 0) goto L_0x0045
            f55097h = r2     // Catch:{ Throwable -> 0x0063 }
            java.lang.String r4 = f55094e     // Catch:{ Throwable -> 0x0063 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0063 }
            java.lang.String r6 = "try to stopForeground when is not Foreground, id = "
            r5.<init>(r6)     // Catch:{ Throwable -> 0x0063 }
            r5.append(r11)     // Catch:{ Throwable -> 0x0063 }
            java.lang.String r6 = ", isIndependentProcess = "
            r5.append(r6)     // Catch:{ Throwable -> 0x0063 }
            r5.append(r0)     // Catch:{ Throwable -> 0x0063 }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0063 }
            com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48486b(r4, r5)     // Catch:{ Throwable -> 0x0063 }
        L_0x0045:
            java.lang.String r4 = f55094e     // Catch:{ Throwable -> 0x0063 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0063 }
            java.lang.String r6 = "doCancel, ========== stopForeground id = "
            r5.<init>(r6)     // Catch:{ Throwable -> 0x0063 }
            r5.append(r11)     // Catch:{ Throwable -> 0x0063 }
            java.lang.String r6 = ", isIndependentProcess = "
            r5.append(r6)     // Catch:{ Throwable -> 0x0063 }
            r5.append(r0)     // Catch:{ Throwable -> 0x0063 }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0063 }
            com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48484a(r4, r5)     // Catch:{ Throwable -> 0x0063 }
            r3.mo41584a(r2, r1)     // Catch:{ Throwable -> 0x0063 }
        L_0x0063:
            r10.cancel(r11)     // Catch:{ Throwable -> 0x0066 }
        L_0x0066:
            boolean r3 = f55097h
            if (r3 != 0) goto L_0x006b
            return
        L_0x006b:
            r3 = 0
            com.ss.android.socialbase.downloader.notification.b r4 = com.p683ss.android.socialbase.downloader.notification.C20053b.m49532a()     // Catch:{ Throwable -> 0x00d3 }
            android.util.SparseArray r4 = r4.mo42106b()     // Catch:{ Throwable -> 0x00d3 }
            if (r4 == 0) goto L_0x00b1
            int r5 = r4.size()     // Catch:{ Throwable -> 0x00d3 }
            int r5 = r5 - r1
        L_0x007b:
            if (r5 < 0) goto L_0x00b1
            java.lang.Object r6 = r4.valueAt(r5)     // Catch:{ Throwable -> 0x00d3 }
            com.ss.android.socialbase.downloader.notification.a r6 = (com.p683ss.android.socialbase.downloader.notification.C20052a) r6     // Catch:{ Throwable -> 0x00d3 }
            if (r6 == 0) goto L_0x00ae
            int r7 = r6.f55113a     // Catch:{ Throwable -> 0x00d3 }
            if (r7 == r11) goto L_0x00ae
            int r8 = f55095f     // Catch:{ Throwable -> 0x00d3 }
            if (r7 == r8) goto L_0x00ae
            int r8 = f55096g     // Catch:{ Throwable -> 0x00d3 }
            if (r7 == r8) goto L_0x00ae
            boolean r7 = r6.f55114b     // Catch:{ Throwable -> 0x00d3 }
            if (r7 == 0) goto L_0x00ae
            com.ss.android.socialbase.downloader.downloader.c r7 = com.p683ss.android.socialbase.downloader.downloader.C19886c.m48631a()     // Catch:{ Throwable -> 0x00d3 }
            int r8 = r6.f55113a     // Catch:{ Throwable -> 0x00d3 }
            int r7 = r7.mo41480a(r8)     // Catch:{ Throwable -> 0x00d3 }
            if (r7 != r1) goto L_0x00a9
            boolean r7 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49377c()     // Catch:{ Throwable -> 0x00d3 }
            if (r7 != 0) goto L_0x00a9
            r7 = 1
            goto L_0x00aa
        L_0x00a9:
            r7 = 0
        L_0x00aa:
            if (r7 != r0) goto L_0x00ae
            r3 = r6
            goto L_0x00b1
        L_0x00ae:
            int r5 = r5 + -1
            goto L_0x007b
        L_0x00b1:
            if (r3 == 0) goto L_0x00d2
            int r11 = r3.f55113a     // Catch:{ Throwable -> 0x00d3 }
            r10.cancel(r11)     // Catch:{ Throwable -> 0x00b8 }
        L_0x00b8:
            com.ss.android.socialbase.downloader.downloader.Downloader r10 = com.p683ss.android.socialbase.downloader.downloader.Downloader.getInstance(r9)     // Catch:{ Throwable -> 0x00d3 }
            r10.getStatus(r11)     // Catch:{ Throwable -> 0x00d3 }
            java.lang.String r10 = f55094e     // Catch:{ Throwable -> 0x00d3 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00d3 }
            java.lang.String r1 = "doCancel, updateNotification id = "
            r0.<init>(r1)     // Catch:{ Throwable -> 0x00d3 }
            r0.append(r11)     // Catch:{ Throwable -> 0x00d3 }
            java.lang.String r11 = r0.toString()     // Catch:{ Throwable -> 0x00d3 }
            com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48484a(r10, r11)     // Catch:{ Throwable -> 0x00d3 }
        L_0x00d2:
            return
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.notification.DownloadNotificationService.mo42096a(android.app.NotificationManager, int):void");
    }

    public int onStartCommand(final Intent intent, int i, int i2) {
        if (intent != null) {
            final String action = intent.getAction();
            if (!TextUtils.isEmpty(action) && this.f55100d != null) {
                this.f55100d.post(new Runnable() {
                    public final void run() {
                        long j;
                        final NotificationManager notificationManager = (NotificationManager) DownloadNotificationService.this.getSystemService("notification");
                        final int intExtra = intent.getIntExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", 0);
                        if (action.equals("android.ss.intent.action.DOWNLOAD_NOTIFICATION_NOTIFY")) {
                            final Notification notification = (Notification) intent.getParcelableExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA");
                            int intExtra2 = intent.getIntExtra("DOWNLOAD_NOTIFICATION_EXTRA_STATUS", 0);
                            if (!(intExtra == 0 || notification == null || notificationManager == null)) {
                                if (intExtra2 == 4) {
                                    if (Downloader.getInstance(C19884b.m48627x()).isDownloading(intExtra)) {
                                        DownloadInfo downloadInfo = Downloader.getInstance(C19884b.m48627x()).getDownloadInfo(intExtra);
                                        if (DownloadNotificationService.f55092b) {
                                            if (downloadInfo != null && downloadInfo.canNotifyProgress() && System.currentTimeMillis() - DownloadNotificationService.f55091a > DownloadNotificationService.f55093c) {
                                                DownloadNotificationService.this.mo42098b(notificationManager, intExtra, notification);
                                                downloadInfo.setLastNotifyProgressTime();
                                            }
                                        } else if (downloadInfo != null && downloadInfo.canNotifyProgress()) {
                                            DownloadNotificationService.this.mo42098b(notificationManager, intExtra, notification);
                                            downloadInfo.setLastNotifyProgressTime();
                                        }
                                    }
                                } else if (intExtra2 == -2 || intExtra2 == -3) {
                                    if (DownloadNotificationService.f55092b) {
                                        DownloadNotificationService.this.mo42097a(notificationManager, intExtra, notification);
                                    } else if (DownloadNotificationService.this.f55100d != null) {
                                        Handler handler = DownloadNotificationService.this.f55100d;
                                        C200501 r6 = new Runnable() {
                                            public final void run() {
                                                DownloadNotificationService.this.mo42098b(notificationManager, intExtra, notification);
                                            }
                                        };
                                        if (intExtra2 == -2) {
                                            j = 50;
                                        } else {
                                            j = 200;
                                        }
                                        handler.postDelayed(r6, j);
                                    }
                                } else if (DownloadNotificationService.f55092b) {
                                    DownloadNotificationService.this.mo42097a(notificationManager, intExtra, notification);
                                } else {
                                    DownloadNotificationService.this.mo42098b(notificationManager, intExtra, notification);
                                }
                            }
                        } else if (action.equals("android.ss.intent.action.DOWNLOAD_NOTIFICATION_CANCEL")) {
                            if (intExtra != 0) {
                                DownloadNotificationService.this.mo42096a(notificationManager, intExtra);
                            }
                        } else if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                            try {
                                if (C19994e.m49351a((Context) DownloadNotificationService.this, "android.permission.ACCESS_NETWORK_STATE")) {
                                    ConnectivityManager connectivityManager = (ConnectivityManager) DownloadNotificationService.this.getSystemService("connectivity");
                                    if (connectivityManager != null) {
                                        NetworkInfo a = C20054c.m49536a(connectivityManager);
                                        if (a != null) {
                                            if (a.isConnected()) {
                                                ArrayList arrayList = new ArrayList();
                                                if (!TextUtils.isEmpty(C19784e.f54482a)) {
                                                    arrayList.add(C19784e.f54482a);
                                                }
                                                arrayList.add("mime_type_plugin");
                                                Context applicationContext = DownloadNotificationService.this.getApplicationContext();
                                                if (applicationContext != null) {
                                                    Downloader.getInstance(applicationContext).restartAllFailedDownloadTasks(arrayList);
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        } else if (action.equals("android.intent.action.MEDIA_UNMOUNTED") || action.equals("android.intent.action.MEDIA_REMOVED") || action.equals("android.intent.action.MEDIA_BAD_REMOVAL") || action.equals("android.intent.action.MEDIA_EJECT")) {
                            try {
                                Downloader.getInstance(DownloadNotificationService.this).pauseAll();
                            } catch (Exception unused2) {
                            }
                        }
                    }
                });
            }
        }
        return 2;
    }

    /* renamed from: a */
    public final void mo42097a(final NotificationManager notificationManager, final int i, final Notification notification) {
        long currentTimeMillis = f55093c - (System.currentTimeMillis() - f55099j);
        if (currentTimeMillis <= 0) {
            currentTimeMillis = 0;
        }
        if (currentTimeMillis > 20000) {
            currentTimeMillis = 20000;
        }
        long currentTimeMillis2 = System.currentTimeMillis() + currentTimeMillis;
        f55091a = currentTimeMillis2;
        f55099j = currentTimeMillis2;
        if (currentTimeMillis <= 0) {
            mo42098b(notificationManager, i, notification);
            return;
        }
        if (this.f55100d != null) {
            this.f55100d.postDelayed(new Runnable() {
                public final void run() {
                    DownloadNotificationService.this.mo42098b(notificationManager, i, notification);
                }
            }, currentTimeMillis);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x008f */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0099 A[Catch:{ Throwable -> 0x009f }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42098b(android.app.NotificationManager r6, int r7, android.app.Notification r8) {
        /*
            r5 = this;
            boolean r0 = m49528a(r7, r8)
            if (r0 == 0) goto L_0x007a
            com.ss.android.socialbase.downloader.downloader.c r0 = com.p683ss.android.socialbase.downloader.downloader.C19886c.m48631a()     // Catch:{ Throwable -> 0x008f }
            int r0 = r0.mo41480a(r7)     // Catch:{ Throwable -> 0x008f }
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x001a
            boolean r0 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49377c()     // Catch:{ Throwable -> 0x008f }
            if (r0 != 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 != 0) goto L_0x0022
            int r3 = f55095f     // Catch:{ Throwable -> 0x008f }
            if (r3 != 0) goto L_0x0022
            goto L_0x002a
        L_0x0022:
            if (r0 == 0) goto L_0x0029
            int r3 = f55096g     // Catch:{ Throwable -> 0x008f }
            if (r3 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            if (r2 == 0) goto L_0x008f
            com.ss.android.socialbase.downloader.downloader.c r1 = com.p683ss.android.socialbase.downloader.downloader.C19886c.m48631a()     // Catch:{ Throwable -> 0x008f }
            com.ss.android.socialbase.downloader.downloader.n r1 = r1.mo41488c(r7)     // Catch:{ Throwable -> 0x008f }
            boolean r2 = r1.mo41608g()     // Catch:{ Throwable -> 0x008f }
            if (r2 == 0) goto L_0x0066
            boolean r2 = r1.mo41593b()     // Catch:{ Throwable -> 0x008f }
            if (r2 != 0) goto L_0x0066
            java.lang.String r2 = f55094e     // Catch:{ Throwable -> 0x008f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x008f }
            java.lang.String r4 = "doNotify, startForeground, ======== id = "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x008f }
            r3.append(r7)     // Catch:{ Throwable -> 0x008f }
            java.lang.String r4 = ", isIndependentProcess = "
            r3.append(r4)     // Catch:{ Throwable -> 0x008f }
            r3.append(r0)     // Catch:{ Throwable -> 0x008f }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x008f }
            com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48484a(r2, r3)     // Catch:{ Throwable -> 0x008f }
            if (r0 == 0) goto L_0x0060
            f55096g = r7     // Catch:{ Throwable -> 0x008f }
            goto L_0x0062
        L_0x0060:
            f55095f = r7     // Catch:{ Throwable -> 0x008f }
        L_0x0062:
            r1.mo41576a(r7, r8)     // Catch:{ Throwable -> 0x008f }
            goto L_0x008f
        L_0x0066:
            java.lang.String r1 = f55094e     // Catch:{ Throwable -> 0x008f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x008f }
            java.lang.String r3 = "doNotify: canStartForeground = true, but proxy can not startForeground, isIndependentProcess = "
            r2.<init>(r3)     // Catch:{ Throwable -> 0x008f }
            r2.append(r0)     // Catch:{ Throwable -> 0x008f }
            java.lang.String r0 = r2.toString()     // Catch:{ Throwable -> 0x008f }
            com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48484a(r1, r0)     // Catch:{ Throwable -> 0x008f }
            goto L_0x008f
        L_0x007a:
            int r0 = f55095f
            if (r0 == r7) goto L_0x0082
            int r0 = f55096g
            if (r0 != r7) goto L_0x008f
        L_0x0082:
            boolean r0 = f55098i
            if (r0 == 0) goto L_0x008f
            int r0 = r8.flags
            r0 = r0 & 2
            if (r0 != 0) goto L_0x008f
            r5.mo42096a(r6, r7)
        L_0x008f:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x009f }
            long r2 = f55099j     // Catch:{ Throwable -> 0x009f }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x009b
            f55099j = r0     // Catch:{ Throwable -> 0x009f }
        L_0x009b:
            r6.notify(r7, r8)     // Catch:{ Throwable -> 0x009f }
            return
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.notification.DownloadNotificationService.mo42098b(android.app.NotificationManager, int, android.app.Notification):void");
    }
}
