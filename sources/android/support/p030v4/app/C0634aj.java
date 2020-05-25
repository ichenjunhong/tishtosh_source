package android.support.p030v4.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v4.app.aj */
public final class C0634aj implements Iterable<Intent> {

    /* renamed from: a */
    public final ArrayList<Intent> f2300a = new ArrayList<>();

    /* renamed from: b */
    public final Context f2301b;

    /* renamed from: android.support.v4.app.aj$a */
    public interface C0635a {
        Intent getSupportParentActivityIntent();
    }

    public final Iterator<Intent> iterator() {
        return this.f2300a.iterator();
    }

    public C0634aj(Context context) {
        this.f2301b = context;
    }

    /* renamed from: a */
    public final C0634aj mo2158a(ComponentName componentName) {
        int size = this.f2300a.size();
        try {
            Intent a = C0701y.m2030a(this.f2301b, componentName);
            while (a != null) {
                this.f2300a.add(size, a);
                a = C0701y.m2030a(this.f2301b, a.getComponent());
            }
            return this;
        } catch (NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
