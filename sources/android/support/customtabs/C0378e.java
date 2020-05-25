package android.support.customtabs;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* renamed from: android.support.customtabs.e */
public final class C0378e {

    /* renamed from: a */
    final C0381g f1258a;

    /* renamed from: b */
    public final ComponentName f1259b;

    /* renamed from: c */
    private final Object f1260c = new Object();

    /* renamed from: d */
    private final C0384h f1261d;

    /* renamed from: a */
    public final boolean mo868a(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f1261d.mo842a(this.f1258a, uri, (Bundle) null, list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    C0378e(C0384h hVar, C0381g gVar, ComponentName componentName) {
        this.f1261d = hVar;
        this.f1258a = gVar;
        this.f1259b = componentName;
    }
}
