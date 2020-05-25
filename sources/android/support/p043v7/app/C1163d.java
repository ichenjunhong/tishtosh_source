package android.support.p043v7.app;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p043v7.app.C1158a.C1159a;
import android.support.p043v7.view.C1218b;
import android.support.p043v7.view.C1218b.C1219a;
import android.support.p043v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* renamed from: android.support.v7.app.d */
public abstract class C1163d {

    /* renamed from: a */
    public static int f3810a = -1;

    C1163d() {
    }

    /* renamed from: k */
    public static int m3464k() {
        return f3810a;
    }

    /* renamed from: a */
    public abstract ActionBar mo3659a();

    /* renamed from: a */
    public abstract C1218b mo3662a(C1219a aVar);

    /* renamed from: a */
    public abstract <T extends View> T mo3663a(int i);

    /* renamed from: a */
    public abstract void mo3665a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo3666a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo3668a(Toolbar toolbar);

    /* renamed from: a */
    public abstract void mo3669a(View view);

    /* renamed from: a */
    public abstract void mo3670a(View view, LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo3671a(CharSequence charSequence);

    /* renamed from: b */
    public abstract MenuInflater mo3674b();

    /* renamed from: b */
    public abstract void mo3675b(int i);

    /* renamed from: b */
    public abstract void mo3676b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo3678b(View view, LayoutParams layoutParams);

    /* renamed from: c */
    public abstract void mo3679c();

    /* renamed from: c */
    public abstract void mo3680c(Bundle bundle);

    /* renamed from: c */
    public abstract boolean mo3681c(int i);

    /* renamed from: d */
    public abstract void mo3682d();

    /* renamed from: e */
    public abstract void mo3684e();

    /* renamed from: f */
    public abstract void mo3686f();

    /* renamed from: g */
    public abstract void mo3689g();

    /* renamed from: h */
    public abstract C1159a mo3690h();

    /* renamed from: i */
    public abstract void mo3691i();

    /* renamed from: j */
    public abstract boolean mo3692j();

    /* renamed from: a */
    public static C1163d m3463a(Dialog dialog, C1162c cVar) {
        return new AppCompatDelegateImpl(dialog.getContext(), dialog.getWindow(), cVar);
    }
}
