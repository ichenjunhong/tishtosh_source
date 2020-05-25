package android.support.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.C0381g.C0382a;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;

/* renamed from: android.support.customtabs.b */
public class C0367b {

    /* renamed from: a */
    private final C0384h f1229a;

    /* renamed from: b */
    private final ComponentName f1230b;

    /* renamed from: a */
    public final boolean mo854a(long j) {
        try {
            return this.f1229a.mo838a(0);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final C0378e mo853a(final C0366a aVar) {
        C03681 r0 = new C0382a() {

            /* renamed from: c */
            private Handler f1233c = new Handler(Looper.getMainLooper());

            /* renamed from: a */
            public final void mo857a(final Bundle bundle) throws RemoteException {
                if (aVar != null) {
                    this.f1233c.post(new Runnable() {
                        public final void run() {
                            aVar.mo850a(bundle);
                        }
                    });
                }
            }

            /* renamed from: a */
            public final void mo856a(final int i, final Bundle bundle) {
                if (aVar != null) {
                    this.f1233c.post(new Runnable() {
                        public final void run() {
                            aVar.mo849a(i, bundle);
                        }
                    });
                }
            }

            /* renamed from: b */
            public final void mo859b(final String str, final Bundle bundle) throws RemoteException {
                if (aVar != null) {
                    this.f1233c.post(new Runnable() {
                        public final void run() {
                            aVar.mo852b(str, bundle);
                        }
                    });
                }
            }

            /* renamed from: a */
            public final void mo858a(final String str, final Bundle bundle) throws RemoteException {
                if (aVar != null) {
                    this.f1233c.post(new Runnable() {
                        public final void run() {
                            aVar.mo851a(str, bundle);
                        }
                    });
                }
            }

            /* renamed from: a */
            public final void mo855a(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
                if (aVar != null) {
                    Handler handler = this.f1233c;
                    final int i2 = i;
                    final Uri uri2 = uri;
                    final boolean z2 = z;
                    final Bundle bundle2 = bundle;
                    C03735 r1 = new Runnable() {
                        public final void run() {
                            aVar.mo848a(i2, uri2, z2, bundle2);
                        }
                    };
                    handler.post(r1);
                }
            }
        };
        try {
            if (!this.f1229a.mo839a((C0381g) r0)) {
                return null;
            }
            return new C0378e(this.f1229a, r0, this.f1230b);
        } catch (RemoteException unused) {
            return null;
        }
    }

    C0367b(C0384h hVar, ComponentName componentName) {
        this.f1229a = hVar;
        this.f1230b = componentName;
    }

    /* renamed from: a */
    public static boolean m917a(Context context, String str, C0376d dVar) {
        boolean z;
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        if (context == null || !(context instanceof Context)) {
            z = context.bindService(intent, dVar, 33);
        } else if (!C40895d.m90464a(context, intent)) {
            return context.bindService(intent, dVar, 33);
        } else {
            z = true;
        }
        return z;
    }
}
