package android.support.p043v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.view.d */
public final class C1221d extends ContextWrapper {

    /* renamed from: a */
    public int f4020a;

    /* renamed from: b */
    private Theme f4021b;

    /* renamed from: c */
    private LayoutInflater f4022c;

    /* renamed from: d */
    private Configuration f4023d;

    /* renamed from: e */
    private Resources f4024e;

    public C1221d() {
        super(null);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Theme getTheme() {
        if (this.f4021b != null) {
            return this.f4021b;
        }
        if (this.f4020a == 0) {
            this.f4020a = R.style.mm;
        }
        m3700a();
        return this.f4021b;
    }

    /* renamed from: a */
    private void m3700a() {
        boolean z;
        if (this.f4021b == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f4021b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f4021b.setTo(theme);
            }
        }
        m3701a(this.f4021b, this.f4020a, z);
    }

    public final Resources getResources() {
        if (this.f4024e == null) {
            if (this.f4023d == null) {
                this.f4024e = super.getResources();
            } else if (VERSION.SDK_INT >= 17) {
                this.f4024e = createConfigurationContext(this.f4023d).getResources();
            }
        }
        return this.f4024e;
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void setTheme(int i) {
        if (this.f4020a != i) {
            this.f4020a = i;
            m3700a();
        }
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f4022c == null) {
            this.f4022c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f4022c;
    }

    public C1221d(Context context, int i) {
        super(context);
        this.f4020a = i;
    }

    /* renamed from: a */
    private static void m3701a(Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }
}
