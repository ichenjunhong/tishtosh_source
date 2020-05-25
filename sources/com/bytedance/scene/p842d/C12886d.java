package com.bytedance.scene.p842d;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import com.bytedance.scene.p841c.C12880l;

/* renamed from: com.bytedance.scene.d.d */
public class C12886d extends ContextWrapper {

    /* renamed from: a */
    private Theme f33711a;

    /* renamed from: b */
    public int f33712b;

    /* renamed from: c */
    public Configuration f33713c;

    /* renamed from: d */
    private LayoutInflater f33714d;

    /* renamed from: e */
    private Resources f33715e;

    /* renamed from: f */
    private boolean f33716f;

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Theme getTheme() {
        if (this.f33711a != null) {
            return this.f33711a;
        }
        m25809a();
        return this.f33711a;
    }

    /* renamed from: a */
    private void m25809a() {
        boolean z;
        if (this.f33711a == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f33711a = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f33711a.setTo(theme);
            }
        }
        m25810a(this.f33711a, this.f33712b, z);
    }

    public Resources getResources() {
        if (this.f33715e == null) {
            if (this.f33713c == null) {
                this.f33715e = super.getResources();
            } else if (VERSION.SDK_INT >= 17) {
                this.f33715e = createConfigurationContext(this.f33713c).getResources();
            }
        }
        return this.f33715e;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public void setTheme(int i) {
        if (this.f33712b != i) {
            this.f33712b = i;
            if (this.f33716f) {
                this.f33711a = null;
                this.f33715e = null;
            }
            m25809a();
        }
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f33714d == null) {
            this.f33714d = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f33714d;
    }

    public C12886d(Context context, int i) {
        super(context);
        this.f33712b = i;
        if (this.f33712b == 0) {
            throw new IllegalArgumentException("themeResId can't be zero");
        }
    }

    public C12886d(Context context, Theme theme) {
        super(context);
        this.f33711a = (Theme) C12880l.m25801a(theme, "theme can't be null");
        this.f33716f = true;
    }

    /* renamed from: a */
    private static void m25810a(Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }
}
