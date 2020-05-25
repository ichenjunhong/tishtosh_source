package android.support.customtabs;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: android.support.customtabs.d */
public abstract class C0376d implements ServiceConnection {
    /* renamed from: a */
    public abstract void mo866a(ComponentName componentName, C0367b bVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0384h hVar;
        if (iBinder == null) {
            hVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0384h)) {
                hVar = new C0386a(iBinder);
            } else {
                hVar = (C0384h) queryLocalInterface;
            }
        }
        mo866a(componentName, new C0367b(hVar, componentName) {
        });
    }
}
