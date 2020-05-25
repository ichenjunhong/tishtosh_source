package android.arch.lifecycle;

import android.app.Service;
import android.arch.lifecycle.C0176h.C0177a;
import android.content.Intent;
import android.os.IBinder;

public class LifecycleService extends Service implements C0184k {

    /* renamed from: a */
    private final C0207w f391a = new C0207w(this);

    public C0176h getLifecycle() {
        return this.f391a.f481a;
    }

    public void onCreate() {
        this.f391a.mo356a(C0177a.ON_CREATE);
        super.onCreate();
    }

    public void onDestroy() {
        C0207w wVar = this.f391a;
        wVar.mo356a(C0177a.ON_STOP);
        wVar.mo356a(C0177a.ON_DESTROY);
        super.onDestroy();
    }

    public IBinder onBind(Intent intent) {
        this.f391a.mo356a(C0177a.ON_START);
        return null;
    }

    public void onStart(Intent intent, int i) {
        this.f391a.mo356a(C0177a.ON_START);
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
