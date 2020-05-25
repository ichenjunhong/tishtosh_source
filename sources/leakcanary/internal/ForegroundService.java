package leakcanary.internal;

import android.app.IntentService;
import android.app.Notification.Builder;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import p2628d.p2639f.p2641b.C52711k;

public abstract class ForegroundService extends IntentService {

    /* renamed from: a */
    private final String f132032a;

    /* renamed from: b */
    private final int f132033b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo110987a(Intent intent);

    public IBinder onBind(Intent intent) {
        C52711k.m112240b(intent, "intent");
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        stopForeground(true);
    }

    public void onCreate() {
        super.onCreate();
        String str = "LeakCanary is working.";
        C52711k.m112240b(str, "contentText");
        Context context = this;
        Builder progress = new Builder(context).setContentTitle(this.f132032a).setContentText(str).setProgress(100, 0, true);
        C52711k.m112236a((Object) progress, "builder");
        startForeground(this.f132033b, C53433n.m113488a(context, progress, C53432m.LEAKCANARY_LOW));
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        mo110987a(intent);
    }

    public ForegroundService(String str, String str2, int i) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(str2, "notificationContentTitle");
        super(str);
        this.f132032a = str2;
        this.f132033b = i;
    }
}
