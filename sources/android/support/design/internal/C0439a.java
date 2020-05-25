package android.support.design.internal;

import android.content.Context;
import android.support.p043v7.view.menu.C1246h;
import android.support.p043v7.view.menu.C1250j;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: android.support.design.internal.a */
public final class C0439a extends C1246h {
    public C0439a(Context context) {
        super(context);
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }

    /* renamed from: a */
    public final MenuItem mo1131a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= 5) {
            mo4137e();
            MenuItem a = super.mo1131a(i, i2, i3, charSequence);
            if (a instanceof C1250j) {
                ((C1250j) a).mo4163a(true);
            }
            mo4138f();
            return a;
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }
}
