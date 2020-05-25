package com.p683ss.android.message;

import android.app.IntentService;
import android.app.Notification.Builder;
import android.content.Intent;
import android.os.Build.VERSION;
import com.p683ss.android.message.p1191b.C19464g;
import com.p683ss.android.pushmanager.setting.C19710b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.message.NotifyIntentService */
public class NotifyIntentService extends IntentService {
    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
    }

    public NotifyIntentService() {
        super("NotifyIntentService");
    }

    public void onDestroy() {
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        super.onDestroy();
    }

    public void onCreate() {
        boolean z;
        super.onCreate();
        try {
            if (VERSION.SDK_INT >= 18 && C19710b.m48173a().mo41108r()) {
                if (!C19464g.m47642c() || !C19464g.m47640b()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    startForeground(1, new Builder(getApplicationContext()).setSmallIcon(R.drawable.status_icon).build());
                }
            }
        } catch (Throwable unused) {
        }
    }
}
