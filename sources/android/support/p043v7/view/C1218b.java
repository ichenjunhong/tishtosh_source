package android.support.p043v7.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.b */
public abstract class C1218b {

    /* renamed from: b */
    public Object f4018b;

    /* renamed from: c */
    public boolean f4019c;

    /* renamed from: android.support.v7.view.b$a */
    public interface C1219a {
        /* renamed from: a */
        void mo3717a(C1218b bVar);

        /* renamed from: a */
        boolean mo3718a(C1218b bVar, Menu menu);

        /* renamed from: a */
        boolean mo3719a(C1218b bVar, MenuItem menuItem);

        /* renamed from: b */
        boolean mo3720b(C1218b bVar, Menu menu);
    }

    /* renamed from: a */
    public abstract MenuInflater mo3796a();

    /* renamed from: a */
    public abstract void mo3797a(int i);

    /* renamed from: a */
    public abstract void mo3798a(View view);

    /* renamed from: a */
    public abstract void mo3799a(CharSequence charSequence);

    /* renamed from: b */
    public abstract Menu mo3801b();

    /* renamed from: b */
    public abstract void mo3802b(int i);

    /* renamed from: b */
    public abstract void mo3803b(CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo3804c();

    /* renamed from: d */
    public abstract void mo3805d();

    /* renamed from: f */
    public abstract CharSequence mo3807f();

    /* renamed from: g */
    public abstract CharSequence mo3808g();

    /* renamed from: h */
    public boolean mo3809h() {
        return false;
    }

    /* renamed from: i */
    public abstract View mo3810i();

    /* renamed from: a */
    public void mo3800a(boolean z) {
        this.f4019c = z;
    }
}
