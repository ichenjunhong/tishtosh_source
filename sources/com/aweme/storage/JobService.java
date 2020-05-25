package com.aweme.storage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;

public class JobService extends Service {
    public void onCreate() {
        C0013i.m18a((Callable<TResult>) new Callable<String>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public String call() throws Exception {
                C2553c.m7474d(JobService.this);
                return null;
            }
        }, (Executor) C24076h.m58902c()).mo30c(new C0011g<String, String>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                C2553c.m7475e(JobService.this);
                return null;
            }
        }, C0013i.f25b).mo23b((C0011g<TResult, C0013i<TContinuationResult>>) new C0011g<String, C0013i<String>>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                JobService.this.stopSelf();
                return null;
            }
        });
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
