package com.google.android.gms.ads.measurement;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.aad;
import java.util.concurrent.FutureTask;

@C16299uq
public class MeasurementManager extends C15048d {
    public void registerAppMeasurementProxy(C15044a aVar) throws RemoteException {
        aad s = C14963ax.m30849s();
        synchronized (s.f40051b) {
            if (s.f40051b.get() == null) {
                s.f40051b.set(aVar);
                for (FutureTask futureTask : s.f40052c) {
                    if (!futureTask.isCancelled()) {
                        futureTask.run();
                    }
                }
                s.f40052c.clear();
            }
        }
    }
}
