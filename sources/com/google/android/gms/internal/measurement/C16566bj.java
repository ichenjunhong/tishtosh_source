package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.bj */
public final class C16566bj extends C16655ej implements C16565bi {
    C16566bj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.analytics.internal.IAnalyticsService");
    }

    /* renamed from: a */
    public final void mo31825a(Map map, long j, String str, List<zzbr> list) throws RemoteException {
        Parcel a = mo31965a();
        a.writeMap(map);
        a.writeLong(j);
        a.writeString(str);
        a.writeTypedList(list);
        mo31968b(1, a);
    }
}
