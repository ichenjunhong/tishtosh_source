package android.support.p043v7.view;

import android.content.Context;
import android.support.p030v4.p031a.p032a.C0575a;
import android.support.p030v4.p031a.p032a.C0576b;
import android.support.p030v4.p038f.C0800n;
import android.support.p043v7.view.C1218b.C1219a;
import android.support.p043v7.view.menu.C1266q;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.f */
public final class C1223f extends ActionMode {

    /* renamed from: a */
    final Context f4032a;

    /* renamed from: b */
    final C1218b f4033b;

    /* renamed from: android.support.v7.view.f$a */
    public static class C1224a implements C1219a {

        /* renamed from: a */
        final Callback f4034a;

        /* renamed from: b */
        final Context f4035b;

        /* renamed from: c */
        final ArrayList<C1223f> f4036c = new ArrayList<>();

        /* renamed from: d */
        final C0800n<Menu, Menu> f4037d = new C0800n<>();

        /* renamed from: a */
        public final void mo3717a(C1218b bVar) {
            this.f4034a.onDestroyActionMode(mo3963b(bVar));
        }

        /* renamed from: a */
        private Menu m3718a(Menu menu) {
            Menu menu2 = (Menu) this.f4037d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu a = C1266q.m3944a(this.f4035b, (C0575a) menu);
            this.f4037d.put(menu, a);
            return a;
        }

        /* renamed from: b */
        public final ActionMode mo3963b(C1218b bVar) {
            int size = this.f4036c.size();
            for (int i = 0; i < size; i++) {
                C1223f fVar = (C1223f) this.f4036c.get(i);
                if (fVar != null && fVar.f4033b == bVar) {
                    return fVar;
                }
            }
            C1223f fVar2 = new C1223f(this.f4035b, bVar);
            this.f4036c.add(fVar2);
            return fVar2;
        }

        /* renamed from: b */
        public final boolean mo3720b(C1218b bVar, Menu menu) {
            return this.f4034a.onPrepareActionMode(mo3963b(bVar), m3718a(menu));
        }

        public C1224a(Context context, Callback callback) {
            this.f4035b = context;
            this.f4034a = callback;
        }

        /* renamed from: a */
        public final boolean mo3718a(C1218b bVar, Menu menu) {
            return this.f4034a.onCreateActionMode(mo3963b(bVar), m3718a(menu));
        }

        /* renamed from: a */
        public final boolean mo3719a(C1218b bVar, MenuItem menuItem) {
            return this.f4034a.onActionItemClicked(mo3963b(bVar), C1266q.m3945a(this.f4035b, (C0576b) menuItem));
        }
    }

    public final void finish() {
        this.f4033b.mo3804c();
    }

    public final View getCustomView() {
        return this.f4033b.mo3810i();
    }

    public final MenuInflater getMenuInflater() {
        return this.f4033b.mo3796a();
    }

    public final CharSequence getSubtitle() {
        return this.f4033b.mo3808g();
    }

    public final Object getTag() {
        return this.f4033b.f4018b;
    }

    public final CharSequence getTitle() {
        return this.f4033b.mo3807f();
    }

    public final boolean getTitleOptionalHint() {
        return this.f4033b.f4019c;
    }

    public final void invalidate() {
        this.f4033b.mo3805d();
    }

    public final boolean isTitleOptional() {
        return this.f4033b.mo3809h();
    }

    public final Menu getMenu() {
        return C1266q.m3944a(this.f4032a, (C0575a) this.f4033b.mo3801b());
    }

    public final void setCustomView(View view) {
        this.f4033b.mo3798a(view);
    }

    public final void setSubtitle(int i) {
        this.f4033b.mo3802b(i);
    }

    public final void setTag(Object obj) {
        this.f4033b.f4018b = obj;
    }

    public final void setTitle(int i) {
        this.f4033b.mo3797a(i);
    }

    public final void setTitleOptionalHint(boolean z) {
        this.f4033b.mo3800a(z);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f4033b.mo3799a(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f4033b.mo3803b(charSequence);
    }

    public C1223f(Context context, C1218b bVar) {
        this.f4032a = context;
        this.f4033b = bVar;
    }
}
