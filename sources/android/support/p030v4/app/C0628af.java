package android.support.p030v4.app;

import android.app.Person;
import android.app.Person.Builder;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.p030v4.graphics.drawable.IconCompat;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: android.support.v4.app.af */
public final class C0628af {

    /* renamed from: a */
    public CharSequence f2281a;

    /* renamed from: b */
    public IconCompat f2282b;

    /* renamed from: c */
    public String f2283c;

    /* renamed from: d */
    public String f2284d;

    /* renamed from: e */
    public boolean f2285e;

    /* renamed from: f */
    public boolean f2286f;

    /* renamed from: android.support.v4.app.af$a */
    public static class C0629a {

        /* renamed from: a */
        CharSequence f2287a;

        /* renamed from: b */
        IconCompat f2288b;

        /* renamed from: c */
        String f2289c;

        /* renamed from: d */
        String f2290d;

        /* renamed from: e */
        boolean f2291e;

        /* renamed from: f */
        boolean f2292f;

        /* renamed from: a */
        public final C0628af mo2156a() {
            return new C0628af(this);
        }

        /* renamed from: a */
        public final C0629a mo2155a(CharSequence charSequence) {
            this.f2287a = charSequence;
            return this;
        }
    }

    /* renamed from: a */
    public final Bundle mo2153a() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence(LeakCanaryFileProvider.f132049i, this.f2281a);
        String str = "icon";
        if (this.f2282b != null) {
            bundle = this.f2282b.mo2606b();
        } else {
            bundle = null;
        }
        bundle2.putBundle(str, bundle);
        bundle2.putString("uri", this.f2283c);
        bundle2.putString("key", this.f2284d);
        bundle2.putBoolean("isBot", this.f2285e);
        bundle2.putBoolean("isImportant", this.f2286f);
        return bundle2;
    }

    /* renamed from: b */
    public final Person mo2154b() {
        Icon icon;
        Builder name = new Builder().setName(this.f2281a);
        if (this.f2282b != null) {
            icon = this.f2282b.mo2605a();
        } else {
            icon = null;
        }
        return name.setIcon(icon).setUri(this.f2283c).setKey(this.f2284d).setBot(this.f2285e).setImportant(this.f2286f).build();
    }

    C0628af(C0629a aVar) {
        this.f2281a = aVar.f2287a;
        this.f2282b = aVar.f2288b;
        this.f2283c = aVar.f2289c;
        this.f2284d = aVar.f2290d;
        this.f2285e = aVar.f2291e;
        this.f2286f = aVar.f2292f;
    }
}
