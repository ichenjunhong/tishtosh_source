package com.p683ss.android.socialbase.downloader.notification;

import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.socialbase.downloader.notification.b */
public class C20053b {

    /* renamed from: a */
    private static volatile C20053b f55115a;

    /* renamed from: c */
    private static final Object f55116c = new Object();

    /* renamed from: b */
    private final Set<String> f55117b = new HashSet();

    /* renamed from: d */
    private final SparseArray<C20052a> f55118d = new SparseArray<>();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final SparseArray<C20052a> mo42106b() {
        SparseArray<C20052a> sparseArray;
        synchronized (this.f55118d) {
            sparseArray = this.f55118d;
        }
        return sparseArray;
    }

    private C20053b() {
    }

    /* renamed from: a */
    public static C20053b m49532a() {
        if (f55115a == null) {
            synchronized (C20053b.class) {
                if (f55115a == null) {
                    f55115a = new C20053b();
                }
            }
        }
        return f55115a;
    }

    /* renamed from: a */
    public static void m49533a(int i) {
        Context x = C19884b.m48627x();
        if (x != null && i != 0) {
            try {
                Intent intent = new Intent(x, DownloadNotificationService.class);
                intent.setAction("android.ss.intent.action.DOWNLOAD_NOTIFICATION_CANCEL");
                intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", i);
                if (x == null || !(x instanceof Context) || !C40895d.m90464a(x, intent)) {
                    x.startService(intent);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final C20052a mo42107b(int i) {
        C20052a aVar;
        if (i == 0) {
            return null;
        }
        synchronized (this.f55118d) {
            aVar = (C20052a) this.f55118d.get(i);
            if (aVar != null) {
                this.f55118d.remove(i);
                new StringBuilder("removeNotificationId ").append(i);
            }
        }
        return aVar;
    }
}
