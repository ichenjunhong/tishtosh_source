package android.support.p043v7.view;

import android.content.Context;
import android.support.p043v7.view.C1218b.C1219a;
import android.support.p043v7.view.menu.C1246h;
import android.support.p043v7.view.menu.C1246h.C1247a;
import android.support.p043v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.view.e */
public final class C1222e extends C1218b implements C1247a {

    /* renamed from: a */
    private Context f4025a;

    /* renamed from: d */
    private ActionBarContextView f4026d;

    /* renamed from: e */
    private C1219a f4027e;

    /* renamed from: f */
    private WeakReference<View> f4028f;

    /* renamed from: g */
    private boolean f4029g;

    /* renamed from: h */
    private boolean f4030h;

    /* renamed from: i */
    private C1246h f4031i;

    /* renamed from: b */
    public final Menu mo3801b() {
        return this.f4031i;
    }

    /* renamed from: d */
    public final void mo3805d() {
        this.f4027e.mo3720b(this, this.f4031i);
    }

    /* renamed from: f */
    public final CharSequence mo3807f() {
        return this.f4026d.getTitle();
    }

    /* renamed from: g */
    public final CharSequence mo3808g() {
        return this.f4026d.getSubtitle();
    }

    /* renamed from: h */
    public final boolean mo3809h() {
        return this.f4026d.f4333g;
    }

    /* renamed from: a */
    public final MenuInflater mo3796a() {
        return new C1225g(this.f4026d.getContext());
    }

    /* renamed from: i */
    public final View mo3810i() {
        if (this.f4028f != null) {
            return (View) this.f4028f.get();
        }
        return null;
    }

    /* renamed from: c */
    public final void mo3804c() {
        if (!this.f4029g) {
            this.f4029g = true;
            this.f4026d.sendAccessibilityEvent(32);
            this.f4027e.mo3717a(this);
        }
    }

    /* renamed from: a */
    public final void mo3799a(CharSequence charSequence) {
        this.f4026d.setSubtitle(charSequence);
    }

    /* renamed from: b */
    public final void mo3803b(CharSequence charSequence) {
        this.f4026d.setTitle(charSequence);
    }

    /* renamed from: b */
    public final void mo3802b(int i) {
        mo3799a((CharSequence) this.f4025a.getString(i));
    }

    /* renamed from: a */
    public final void mo3797a(int i) {
        mo3803b((CharSequence) this.f4025a.getString(i));
    }

    /* renamed from: a */
    public final void mo1289a(C1246h hVar) {
        mo3805d();
        this.f4026d.mo4348a();
    }

    /* renamed from: a */
    public final void mo3798a(View view) {
        WeakReference<View> weakReference;
        this.f4026d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.f4028f = weakReference;
    }

    /* renamed from: a */
    public final void mo3800a(boolean z) {
        super.mo3800a(z);
        this.f4026d.setTitleOptional(z);
    }

    /* renamed from: a */
    public final boolean mo1290a(C1246h hVar, MenuItem menuItem) {
        return this.f4027e.mo3719a((C1218b) this, menuItem);
    }

    public C1222e(Context context, ActionBarContextView actionBarContextView, C1219a aVar, boolean z) {
        this.f4025a = context;
        this.f4026d = actionBarContextView;
        this.f4027e = aVar;
        this.f4031i = new C1246h(actionBarContextView.getContext()).mo4104a(1);
        this.f4031i.mo4108a((C1247a) this);
        this.f4030h = z;
    }
}
