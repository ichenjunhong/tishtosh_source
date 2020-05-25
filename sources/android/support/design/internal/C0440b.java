package android.support.design.internal;

import android.content.Context;
import android.support.p043v7.view.menu.C1246h;
import android.support.p043v7.view.menu.C1250j;
import android.support.p043v7.view.menu.C1272u;
import android.view.SubMenu;

/* renamed from: android.support.design.internal.b */
public final class C0440b extends C1246h {
    public C0440b(Context context) {
        super(context);
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1250j jVar = (C1250j) mo1131a(i, i2, i3, charSequence);
        C0453d dVar = new C0453d(this.f4215a, this, jVar);
        jVar.mo4162a((C1272u) dVar);
        return dVar;
    }
}
