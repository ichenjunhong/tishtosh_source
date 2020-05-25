package p2699pl.droidsonroids.gif;

import android.content.Context;

/* renamed from: pl.droidsonroids.gif.e */
public final class C53883e {

    /* renamed from: a */
    private static Context f133518a;

    /* renamed from: a */
    static Context m114549a() {
        if (f133518a == null) {
            try {
                f133518a = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e);
            }
        }
        return f133518a;
    }
}
