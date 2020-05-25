package com.bytedance.scene;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import com.bytedance.scene.C12890f.C12891a;
import com.bytedance.scene.navigation.C12942d;
import com.bytedance.scene.p841c.C12880l;

/* renamed from: com.bytedance.scene.g */
final class C12892g implements C12935m {

    /* renamed from: a */
    public final Activity f33733a;

    /* renamed from: b */
    public final C12890f f33734b;

    /* renamed from: c */
    private final C12942d f33735c;

    /* renamed from: d */
    private final C12973u f33736d;

    /* renamed from: e */
    private final Boolean f33737e;

    /* renamed from: f */
    private boolean f33738f;

    /* renamed from: a */
    public final boolean mo24327a() {
        if (this.f33738f || !this.f33735c.mo24531d()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final C12942d mo24328b() {
        if (this.f33738f) {
            return null;
        }
        return this.f33735c;
    }

    /* renamed from: c */
    public final void mo24329c() {
        if (!this.f33738f) {
            this.f33738f = true;
            final View view = this.f33735c.f33834b;
            FragmentManager fragmentManager = this.f33733a.getFragmentManager();
            FragmentTransaction remove = fragmentManager.beginTransaction().remove(this.f33734b).remove(this.f33736d);
            if (this.f33737e.booleanValue()) {
                this.f33734b.f33731a = new C12891a() {
                    /* renamed from: a */
                    public final void mo24361a() {
                        C12921h.m25907b(C12892g.this.f33733a, C12892g.this.f33734b.getTag());
                        if (view != null) {
                            C12880l.m25805a(view);
                        }
                    }
                };
                C12880l.m25804a(fragmentManager, remove, true);
                return;
            }
            C12880l.m25804a(fragmentManager, remove, false);
            C12921h.m25907b(this.f33733a, this.f33734b.getTag());
            if (view != null) {
                C12880l.m25805a(view);
            }
        }
    }

    C12892g(Activity activity, C12942d dVar, C12890f fVar, C12973u uVar, boolean z) {
        this.f33733a = activity;
        this.f33735c = dVar;
        this.f33734b = fVar;
        this.f33736d = uVar;
        this.f33737e = Boolean.valueOf(z);
    }
}
