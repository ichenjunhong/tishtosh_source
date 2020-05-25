package android.support.p043v7.view.menu;

import android.content.Context;
import android.support.p030v4.p031a.p032a.C0576b;
import android.support.p030v4.p031a.p032a.C0577c;
import android.support.p030v4.p038f.C0777a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

/* renamed from: android.support.v7.view.menu.c */
abstract class C1235c<T> extends C1236d<T> {

    /* renamed from: a */
    final Context f4154a;

    /* renamed from: b */
    Map<C0576b, MenuItem> f4155b;

    /* renamed from: c */
    Map<C0577c, SubMenu> f4156c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final MenuItem mo4065a(MenuItem menuItem) {
        if (!(menuItem instanceof C0576b)) {
            return menuItem;
        }
        C0576b bVar = (C0576b) menuItem;
        if (this.f4155b == null) {
            this.f4155b = new C0777a();
        }
        MenuItem menuItem2 = (MenuItem) this.f4155b.get(menuItem);
        if (menuItem2 == null) {
            menuItem2 = C1266q.m3945a(this.f4154a, bVar);
            this.f4155b.put(bVar, menuItem2);
        }
        return menuItem2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final SubMenu mo4066a(SubMenu subMenu) {
        if (!(subMenu instanceof C0577c)) {
            return subMenu;
        }
        C0577c cVar = (C0577c) subMenu;
        if (this.f4156c == null) {
            this.f4156c = new C0777a();
        }
        SubMenu subMenu2 = (SubMenu) this.f4156c.get(cVar);
        if (subMenu2 == null) {
            SubMenu vVar = new C1273v(this.f4154a, cVar);
            this.f4156c.put(cVar, vVar);
            subMenu2 = vVar;
        }
        return subMenu2;
    }

    C1235c(Context context, T t) {
        super(t);
        this.f4154a = context;
    }
}
