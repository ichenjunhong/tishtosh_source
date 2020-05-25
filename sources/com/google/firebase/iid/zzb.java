package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.p030v4.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.util.p1039a.C15508b;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public abstract class zzb extends Service {
    private final Object lock;
    final ExecutorService zzi;
    private Binder zzj;
    private int zzk;
    private int zzl;

    public zzb() {
        String str = "Firebase-";
        String valueOf = String.valueOf(getClass().getSimpleName());
        this.zzi = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49846a((ThreadFactory) new C15508b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str))).mo49847a());
        this.lock = new Object();
        this.zzl = 0;
    }

    /* access modifiers changed from: protected */
    public Intent zzb(Intent intent) {
        return intent;
    }

    public boolean zzc(Intent intent) {
        return false;
    }

    public abstract void zzd(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (this.zzj == null) {
            this.zzj = new C17898ai(this);
        }
        return this.zzj;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.zzk = i2;
            this.zzl++;
        }
        Intent zzb = zzb(intent);
        if (zzb == null) {
            zza(intent);
            return 2;
        } else if (zzc(zzb)) {
            zza(intent);
            return 2;
        } else {
            this.zzi.execute(new C17895af(this, zzb, intent));
            return 3;
        }
    }

    /* access modifiers changed from: private */
    public final void zza(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.m2041a(intent);
        }
        synchronized (this.lock) {
            this.zzl--;
            if (this.zzl == 0) {
                stopSelfResult(this.zzk);
            }
        }
    }
}
