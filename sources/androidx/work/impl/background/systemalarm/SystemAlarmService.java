package androidx.work.impl.background.systemalarm;

import android.arch.lifecycle.LifecycleService;
import android.content.Intent;
import androidx.work.impl.C1547a;

public class SystemAlarmService extends LifecycleService implements C1610b {

    /* renamed from: a */
    private C1607e f5650a;

    /* renamed from: a */
    public final void mo6007a() {
        stopSelf();
    }

    public void onDestroy() {
        super.onDestroy();
        C1607e eVar = this.f5650a;
        eVar.f5669c.mo5971b((C1547a) eVar);
        eVar.f5674h = null;
    }

    public void onCreate() {
        super.onCreate();
        this.f5650a = new C1607e(this);
        C1607e eVar = this.f5650a;
        if (eVar.f5674h == null) {
            eVar.f5674h = this;
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (intent != null) {
            this.f5650a.mo6014a(intent, i2);
        }
        return 1;
    }
}
