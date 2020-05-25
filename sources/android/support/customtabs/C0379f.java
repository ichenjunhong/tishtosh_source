package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* renamed from: android.support.customtabs.f */
public final class C0379f {

    /* renamed from: a */
    final C0381g f1262a;

    /* renamed from: b */
    public final C0366a f1263b = new C0366a() {
        /* renamed from: a */
        public final void mo850a(Bundle bundle) {
            try {
                C0379f.this.f1262a.mo857a(bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: b */
        public final void mo852b(String str, Bundle bundle) {
            try {
                C0379f.this.f1262a.mo859b(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: a */
        public final void mo849a(int i, Bundle bundle) {
            try {
                C0379f.this.f1262a.mo856a(i, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: a */
        public final void mo851a(String str, Bundle bundle) {
            try {
                C0379f.this.f1262a.mo858a(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: a */
        public final void mo848a(int i, Uri uri, boolean z, Bundle bundle) {
            try {
                C0379f.this.f1262a.mo855a(i, uri, z, bundle);
            } catch (RemoteException unused) {
            }
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final IBinder mo869a() {
        return this.f1262a.asBinder();
    }

    public final int hashCode() {
        return mo869a().hashCode();
    }

    C0379f(C0381g gVar) {
        this.f1262a = gVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0379f)) {
            return false;
        }
        return ((C0379f) obj).mo869a().equals(this.f1262a.asBinder());
    }
}
