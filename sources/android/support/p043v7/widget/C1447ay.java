package android.support.p043v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.ay */
public final class C1447ay extends ContextWrapper {

    /* renamed from: a */
    private static final Object f5221a = new Object();

    /* renamed from: b */
    private static ArrayList<WeakReference<C1447ay>> f5222b;

    /* renamed from: c */
    private final Resources f5223c;

    /* renamed from: d */
    private final Theme f5224d;

    public final Resources getResources() {
        return this.f5223c;
    }

    public final AssetManager getAssets() {
        return this.f5223c.getAssets();
    }

    public final Theme getTheme() {
        if (this.f5224d == null) {
            return super.getTheme();
        }
        return this.f5224d;
    }

    public final void setTheme(int i) {
        if (this.f5224d == null) {
            super.setTheme(i);
        } else {
            this.f5224d.applyStyle(i, true);
        }
    }

    private C1447ay(Context context) {
        super(context);
        if (C1460bg.m5100a()) {
            this.f5223c = new C1460bg(this, context.getResources());
            this.f5224d = this.f5223c.newTheme();
            this.f5224d.setTo(context.getTheme());
            return;
        }
        this.f5223c = new C1450ba(this, context.getResources());
        this.f5224d = null;
    }

    /* renamed from: a */
    public static Context m5028a(Context context) {
        C1447ay ayVar;
        boolean z = false;
        if (!(context instanceof C1447ay) && !(context.getResources() instanceof C1450ba) && !(context.getResources() instanceof C1460bg) && (VERSION.SDK_INT < 21 || C1460bg.m5100a())) {
            z = true;
        }
        if (!z) {
            return context;
        }
        synchronized (f5221a) {
            if (f5222b == null) {
                f5222b = new ArrayList<>();
            } else {
                for (int size = f5222b.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) f5222b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f5222b.remove(size);
                    }
                }
                for (int size2 = f5222b.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = (WeakReference) f5222b.get(size2);
                    if (weakReference2 != null) {
                        ayVar = (C1447ay) weakReference2.get();
                    } else {
                        ayVar = null;
                    }
                    if (ayVar != null && ayVar.getBaseContext() == context) {
                        return ayVar;
                    }
                }
            }
            C1447ay ayVar2 = new C1447ay(context);
            f5222b.add(new WeakReference(ayVar2));
            return ayVar2;
        }
    }
}
