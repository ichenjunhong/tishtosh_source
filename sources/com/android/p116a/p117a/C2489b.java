package com.android.p116a.p117a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.p1025a.p1026a.C14877a;
import com.google.android.p1025a.p1026a.C14877a.C14878a.C14879a;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import java.util.List;

/* renamed from: com.android.a.a.b */
public final class C2489b extends C2486a {

    /* renamed from: a */
    public int f7680a;

    /* renamed from: b */
    public C14877a f7681b;

    /* renamed from: c */
    private final Context f7682c;

    /* renamed from: d */
    private ServiceConnection f7683d;

    /* renamed from: com.android.a.a.b$a */
    final class C2491a implements ServiceConnection {

        /* renamed from: b */
        private final C2492c f7685b;

        public final void onServiceDisconnected(ComponentName componentName) {
            C2489b.this.f7681b = null;
            C2489b.this.f7680a = 0;
            this.f7685b.onInstallReferrerServiceDisconnected();
        }

        private C2491a(C2492c cVar) {
            if (cVar != null) {
                this.f7685b = cVar;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C14877a aVar;
            C2489b bVar = C2489b.this;
            if (iBinder == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof C14877a)) {
                    aVar = new C14879a(iBinder);
                } else {
                    aVar = (C14877a) queryLocalInterface;
                }
            }
            bVar.f7681b = aVar;
            C2489b.this.f7680a = 2;
            this.f7685b.onInstallReferrerSetupFinished(0);
        }
    }

    /* renamed from: d */
    private boolean m7239d() {
        try {
            if (this.f7682c.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo6893a() {
        if (this.f7680a != 2 || this.f7681b == null || this.f7683d == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo6894b() {
        this.f7680a = 3;
        if (this.f7683d != null) {
            this.f7682c.unbindService(this.f7683d);
            this.f7683d = null;
        }
        this.f7681b = null;
    }

    /* renamed from: c */
    public final C2493d mo6895c() throws RemoteException {
        if (mo6893a()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f7682c.getPackageName());
            try {
                return new C2493d(this.f7681b.mo27234a(bundle));
            } catch (RemoteException e) {
                this.f7680a = 0;
                throw e;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }

    public C2489b(Context context) {
        this.f7682c = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void mo6892a(C2492c cVar) {
        boolean z;
        if (mo6893a()) {
            cVar.onInstallReferrerSetupFinished(0);
        } else if (this.f7680a == 1) {
            cVar.onInstallReferrerSetupFinished(3);
        } else if (this.f7680a == 3) {
            cVar.onInstallReferrerSetupFinished(3);
        } else {
            this.f7683d = new C2491a(cVar);
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List queryIntentServices = this.f7682c.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null || !m7239d()) {
                        this.f7680a = 0;
                        cVar.onInstallReferrerSetupFinished(2);
                        return;
                    }
                    Intent intent2 = new Intent(intent);
                    Context context = this.f7682c;
                    ServiceConnection serviceConnection = this.f7683d;
                    if (context == null || !(context instanceof Context) || !C40895d.m90464a(context, intent2)) {
                        z = context.bindService(intent2, serviceConnection, 1);
                    } else {
                        z = true;
                    }
                    if (!z) {
                        this.f7680a = 0;
                        cVar.onInstallReferrerSetupFinished(1);
                        return;
                    }
                    return;
                }
            }
            this.f7680a = 0;
            cVar.onInstallReferrerSetupFinished(2);
        }
    }
}
