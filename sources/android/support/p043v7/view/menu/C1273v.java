package android.support.p043v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p030v4.p031a.p032a.C0577c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.v */
final class C1273v extends C1267r implements SubMenu {
    /* renamed from: a */
    private C0577c m3976a() {
        return (C0577c) this.f4157d;
    }

    public final void clearHeader() {
        m3976a().clearHeader();
    }

    public final MenuItem getItem() {
        return mo4065a(m3976a().getItem());
    }

    public final SubMenu setHeaderIcon(int i) {
        m3976a().setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        m3976a().setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        m3976a().setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i) {
        m3976a().setIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        m3976a().setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m3976a().setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        m3976a().setIcon(drawable);
        return this;
    }

    C1273v(Context context, C0577c cVar) {
        super(context, cVar);
    }
}
