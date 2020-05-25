package androidx.work;

import android.content.Context;
import androidx.work.impl.C1626f;
import androidx.work.impl.utils.p059b.C1649b;

/* renamed from: androidx.work.j */
public abstract class C1658j {
    protected C1658j() {
    }

    /* renamed from: a */
    public static void m5774a(Context context, C1532b bVar) {
        synchronized (C1626f.f5701l) {
            if (C1626f.f5699j != null) {
                if (C1626f.f5700k != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class levelJavadoc for more information.");
                }
            }
            if (C1626f.f5699j == null) {
                Context applicationContext = context.getApplicationContext();
                if (C1626f.f5700k == null) {
                    C1626f.f5700k = new C1626f(applicationContext, bVar, new C1649b());
                }
                C1626f.f5699j = C1626f.f5700k;
            }
        }
    }
}
