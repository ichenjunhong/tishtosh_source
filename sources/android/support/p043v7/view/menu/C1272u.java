package android.support.p043v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p043v7.view.menu.C1246h.C1247a;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.u */
public class C1272u extends C1246h implements SubMenu {

    /* renamed from: m */
    public C1246h f4321m;

    /* renamed from: n */
    private C1250j f4322n;

    public MenuItem getItem() {
        return this.f4322n;
    }

    /* renamed from: b */
    public final boolean mo4127b() {
        return this.f4321m.mo4127b();
    }

    /* renamed from: c */
    public final boolean mo4129c() {
        return this.f4321m.mo4129c();
    }

    /* renamed from: d */
    public final boolean mo4135d() {
        return this.f4321m.mo4135d();
    }

    /* renamed from: j */
    public final C1246h mo4146j() {
        return this.f4321m.mo4146j();
    }

    /* renamed from: a */
    public final String mo4105a() {
        int i;
        if (this.f4322n != null) {
            i = this.f4322n.getItemId();
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.mo4105a());
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo4108a(C1247a aVar) {
        this.f4321m.mo4108a(aVar);
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f4321m.setGroupDividerEnabled(z);
    }

    public SubMenu setIcon(int i) {
        this.f4322n.setIcon(i);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f4321m.setQwertyMode(z);
    }

    /* renamed from: c */
    public final boolean mo4130c(C1250j jVar) {
        return this.f4321m.mo4130c(jVar);
    }

    /* renamed from: d */
    public final boolean mo4136d(C1250j jVar) {
        return this.f4321m.mo4136d(jVar);
    }

    public SubMenu setHeaderIcon(int i) {
        super.mo4106a(0, null, i, null, null);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        super.mo4106a(i, null, 0, null, null);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.mo4106a(0, null, 0, null, view);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f4322n.setIcon(drawable);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        super.mo4106a(0, null, 0, drawable, null);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.mo4106a(0, charSequence, 0, null, null);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo4112a(C1246h hVar, MenuItem menuItem) {
        if (super.mo4112a(hVar, menuItem) || this.f4321m.mo4112a(hVar, menuItem)) {
            return true;
        }
        return false;
    }

    public C1272u(Context context, C1246h hVar, C1250j jVar) {
        super(context);
        this.f4321m = hVar;
        this.f4322n = jVar;
    }
}
