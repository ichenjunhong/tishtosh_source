package android.support.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.C0387i.C0388a;

public class PostMessageService extends Service {

    /* renamed from: a */
    private C0388a f1227a = new C0388a() {
        /* renamed from: a */
        public final void mo846a(C0381g gVar, Bundle bundle) throws RemoteException {
            gVar.mo857a(bundle);
        }

        /* renamed from: a */
        public final void mo847a(C0381g gVar, String str, Bundle bundle) throws RemoteException {
            gVar.mo859b(str, bundle);
        }
    };

    public IBinder onBind(Intent intent) {
        return this.f1227a;
    }
}
