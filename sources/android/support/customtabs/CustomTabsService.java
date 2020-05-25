package android.support.customtabs;

import android.app.Service;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import android.support.customtabs.C0384h.C0385a;
import android.support.p030v4.p038f.C0777a;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public abstract class CustomTabsService extends Service {

    /* renamed from: a */
    final Map<IBinder, DeathRecipient> f1222a = new C0777a();

    /* renamed from: b */
    private C0385a f1223b = new C0385a() {
        /* renamed from: a */
        public final boolean mo838a(long j) {
            return CustomTabsService.this.mo829a(j);
        }

        /* renamed from: a */
        public final boolean mo839a(C0381g gVar) {
            final C0379f fVar = new C0379f(gVar);
            try {
                C03641 r2 = new DeathRecipient() {
                    public final void binderDied() {
                        CustomTabsService.this.mo830a(fVar);
                    }
                };
                synchronized (CustomTabsService.this.f1222a) {
                    gVar.asBinder().linkToDeath(r2, 0);
                    CustomTabsService.this.f1222a.put(gVar.asBinder(), r2);
                }
                return CustomTabsService.this.mo835b(fVar);
            } catch (RemoteException unused) {
                return false;
            }
        }

        /* renamed from: a */
        public final Bundle mo837a(String str, Bundle bundle) {
            return CustomTabsService.this.mo828a(str, bundle);
        }

        /* renamed from: a */
        public final boolean mo841a(C0381g gVar, Uri uri) {
            return CustomTabsService.this.mo832a(new C0379f(gVar), uri);
        }

        /* renamed from: a */
        public final boolean mo843a(C0381g gVar, Bundle bundle) {
            return CustomTabsService.this.mo834a(new C0379f(gVar), bundle);
        }

        /* renamed from: a */
        public final int mo836a(C0381g gVar, String str, Bundle bundle) {
            return CustomTabsService.this.mo827a(new C0379f(gVar), str, bundle);
        }

        /* renamed from: a */
        public final boolean mo840a(C0381g gVar, int i, Uri uri, Bundle bundle) {
            return CustomTabsService.this.mo831a(new C0379f(gVar), i, uri, bundle);
        }

        /* renamed from: a */
        public final boolean mo842a(C0381g gVar, Uri uri, Bundle bundle, List<Bundle> list) {
            return CustomTabsService.this.mo833a(new C0379f(gVar), uri, bundle, list);
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo827a(C0379f fVar, String str, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Bundle mo828a(String str, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo829a(long j);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo831a(C0379f fVar, int i, Uri uri, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo832a(C0379f fVar, Uri uri);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo833a(C0379f fVar, Uri uri, Bundle bundle, List<Bundle> list);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo834a(C0379f fVar, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo835b(C0379f fVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo830a(C0379f fVar) {
        try {
            synchronized (this.f1222a) {
                IBinder a = fVar.mo869a();
                a.unlinkToDeath((DeathRecipient) this.f1222a.get(a), 0);
                this.f1222a.remove(a);
            }
            return true;
        } catch (NoSuchElementException unused) {
            return false;
        }
    }
}
