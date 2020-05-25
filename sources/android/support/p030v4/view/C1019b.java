package android.support.p030v4.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v4.view.b */
public abstract class C1019b {

    /* renamed from: a */
    public final Context f3272a;

    /* renamed from: b */
    public C1020a f3273b;

    /* renamed from: c */
    public C1021b f3274c;

    /* renamed from: android.support.v4.view.b$a */
    public interface C1020a {
        /* renamed from: b */
        void mo3201b(boolean z);
    }

    /* renamed from: android.support.v4.view.b$b */
    public interface C1021b {
        /* renamed from: a */
        void mo3202a(boolean z);
    }

    /* renamed from: a */
    public abstract View mo3192a();

    /* renamed from: a */
    public void mo3195a(SubMenu subMenu) {
    }

    /* renamed from: b */
    public boolean mo3197b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo3198c() {
        return true;
    }

    /* renamed from: d */
    public boolean mo3199d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo3200e() {
        return false;
    }

    public C1019b(Context context) {
        this.f3272a = context;
    }

    /* renamed from: a */
    public View mo3193a(MenuItem menuItem) {
        return mo3192a();
    }

    /* renamed from: a */
    public void mo3194a(C1021b bVar) {
        this.f3274c = bVar;
    }

    /* renamed from: a */
    public final void mo3196a(boolean z) {
        if (this.f3273b != null) {
            this.f3273b.mo3201b(z);
        }
    }
}
