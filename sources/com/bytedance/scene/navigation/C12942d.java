package com.bytedance.scene.navigation;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0184k;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.p038f.C0786h;
import android.support.p030v4.view.C1056u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.C12930k;
import com.bytedance.scene.C12966q;
import com.bytedance.scene.C12967r;
import com.bytedance.scene.C12984w;
import com.bytedance.scene.group.C12918f;
import com.bytedance.scene.p837a.C12837c;
import com.bytedance.scene.p837a.p838a.C12829a;
import com.bytedance.scene.p837a.p839b.C12835a.C12836a;
import com.bytedance.scene.p840b.C12856c;
import com.bytedance.scene.p840b.C12858e;
import com.bytedance.scene.p840b.C12861f;
import com.bytedance.scene.p840b.C12861f.C12863a;
import com.bytedance.scene.p841c.C12871d;
import com.bytedance.scene.p841c.C12873f;
import com.bytedance.scene.p841c.C12875h;
import com.bytedance.scene.p841c.C12877i;
import com.bytedance.scene.p841c.C12878j;
import com.bytedance.scene.p841c.C12879k;
import com.bytedance.scene.p841c.C12880l;
import com.bytedance.scene.p842d.C12883a;
import com.bytedance.scene.p842d.C12884b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.scene.navigation.d */
public final class C12942d extends C12924i implements C12941c, C12966q {

    /* renamed from: i */
    public C12930k f33887i;

    /* renamed from: j */
    C12960f f33888j;

    /* renamed from: k */
    public C12945e f33889k;

    /* renamed from: l */
    public FrameLayout f33890l;

    /* renamed from: m */
    public FrameLayout f33891m;

    /* renamed from: n */
    public C12837c f33892n = new C12829a();

    /* renamed from: o */
    public final List<C12836a> f33893o = new ArrayList();

    /* renamed from: p */
    public final List<C12941c> f33894p = new ArrayList();

    /* renamed from: q */
    private boolean f33895q = true;

    /* renamed from: r */
    private final C0786h<Class, C12918f> f33896r = new C0786h<>(3);

    /* renamed from: s */
    private final List<C12873f<C12856c, Boolean>> f33897s = new ArrayList();

    /* renamed from: t */
    private C12836a f33898t = new C12836a() {
    };

    public final void bY_() {
        this.f33895q = false;
    }

    /* renamed from: o */
    public final void mo24468o() {
        super.mo24468o();
    }

    /* renamed from: r */
    public final boolean mo24422r() {
        return this.f33895q;
    }

    /* renamed from: a */
    public final void mo24523a(C12961g gVar) {
        C12879k.m25799a();
        this.f33889k.mo24538a(gVar);
    }

    /* renamed from: a */
    public final void mo24524a(Class<? extends C12924i> cls, Bundle bundle) {
        mo24525a(cls, bundle, new C12863a().mo24325a());
    }

    /* renamed from: a */
    public final void mo24525a(Class<? extends C12924i> cls, Bundle bundle, C12861f fVar) {
        if (C12880l.m25806a(this.f33840g_)) {
            C12924i iVar = null;
            if (C12918f.class.isAssignableFrom(cls)) {
                iVar = (C12924i) this.f33896r.mo2501a(cls);
            }
            if (iVar == null) {
                iVar = C12875h.m25796a(cls, bundle);
            } else if (bundle != null) {
                iVar.f33839g = bundle;
            }
            mo24522a(iVar, fVar);
        }
    }

    /* renamed from: a */
    public final void mo24522a(C12924i iVar, C12861f fVar) {
        C12879k.m25799a();
        if (C12880l.m25806a(this.f33840g_)) {
            if (iVar.f33835c != null) {
                if (iVar.f33835c == this) {
                    throw new IllegalArgumentException("Scene is already pushed");
                }
                StringBuilder sb = new StringBuilder("Scene already has a parent, parent ");
                sb.append(iVar.f33835c);
                throw new IllegalArgumentException(sb.toString());
            } else if (!mo24422r() || C12875h.m25797a(iVar)) {
                m25994f();
                m25995h();
                this.f33889k.mo24536a(iVar, fVar);
            } else {
                StringBuilder sb2 = new StringBuilder("Scene ");
                sb2.append(iVar.getClass().getName());
                sb2.append(" must be a public class or public static class, and have only one parameterless constructor to be properly recreated from instance state.");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo24526a(boolean z) {
        ((C12884b) this.f33834b).setTouchEnabled(!z);
    }

    /* renamed from: a */
    public final void mo24516a(C12924i iVar, C12924i iVar2, boolean z) {
        for (C12941c a : new ArrayList(this.f33894p)) {
            a.mo24516a(iVar, iVar2, z);
        }
    }

    /* renamed from: a */
    public final void mo24394a(C12924i iVar, Bundle bundle, boolean z) {
        if (iVar != this) {
            for (C12873f fVar : new ArrayList(this.f33897s)) {
                if (!z) {
                    ((Boolean) fVar.f33706b).booleanValue();
                }
            }
        }
        super.mo24394a(iVar, bundle, z);
    }

    /* renamed from: a */
    public final void mo24395a(C12924i iVar, boolean z) {
        if (iVar != this) {
            for (C12873f fVar : new ArrayList(this.f33897s)) {
                if (z || ((Boolean) fVar.f33706b).booleanValue()) {
                    ((C12856c) fVar.f33705a).mo24318a(iVar);
                }
            }
        }
        super.mo24395a(iVar, z);
    }

    /* renamed from: f */
    private void m25994f() {
        C12924i c = this.f33889k.mo24542c();
        if (c != null) {
            C12878j.m25798a(c.f33834b);
        }
    }

    /* renamed from: B */
    public final void mo24458B() {
        super.mo24458B();
        this.f33889k.mo24545f();
    }

    /* renamed from: b */
    public final void mo24397b() {
        super.mo24397b();
        m25993a(C12984w.STARTED);
    }

    /* renamed from: e */
    public final void mo24411e() {
        super.mo24411e();
        m25993a(C12984w.RESUMED);
    }

    /* renamed from: g */
    public final void mo24416g() {
        m25993a(C12984w.STARTED);
        super.mo24416g();
    }

    /* renamed from: j */
    public final void mo24417j() {
        m25993a(C12984w.ACTIVITY_CREATED);
        super.mo24417j();
    }

    /* renamed from: h */
    private void m25995h() {
        C12924i c = this.f33889k.mo24542c();
        if (c != null) {
            View view = c.f33834b;
            if (view != null && VERSION.SDK_INT >= 19) {
                view.cancelPendingInputEvents();
            }
        }
    }

    /* renamed from: i */
    private void m25996i() {
        C12879k.m25799a();
        if (C12880l.m25806a(this.f33840g_)) {
            m25994f();
            m25995h();
            this.f33889k.mo24534a();
        }
    }

    /* renamed from: p */
    public final void mo24469p() {
        C12984w wVar = C12984w.NONE;
        C12945e eVar = this.f33889k;
        String a = eVar.mo24533a("NavigationManager dispatchChildrenState");
        new C12958h(wVar, true).mo24552a(C12945e.f33901j);
        eVar.mo24540b(a);
        super.mo24469p();
    }

    /* renamed from: c */
    public final List<C12924i> mo24528c() {
        List<Record> c = this.f33889k.f33903b.mo24559c();
        ArrayList arrayList = new ArrayList();
        for (Record record : c) {
            arrayList.add(record.f33879a);
        }
        return arrayList;
    }

    /* renamed from: d */
    public final boolean mo24531d() {
        C12879k.m25799a();
        if (!C12880l.m25806a(this.f33840g_)) {
            return false;
        }
        if (this.f33889k.mo24544e()) {
            return true;
        }
        if (!this.f33889k.mo24541b()) {
            return false;
        }
        m25996i();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24521a(C12918f fVar) {
        this.f33896r.mo2502a(fVar.getClass(), fVar);
    }

    /* renamed from: a */
    private void m25993a(C12984w wVar) {
        if (this.f33838f.value >= C12984w.VIEW_CREATED.value) {
            this.f33889k.mo24539a(wVar);
            return;
        }
        throw new IllegalArgumentException("dispatchCurrentChildState can only call when state is VIEW_CREATED, ACTIVITY_CREATED, STARTED, RESUMED");
    }

    /* renamed from: b */
    public final void mo24527b(C12924i iVar) {
        mo24522a(iVar, new C12863a().mo24325a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Record mo24530d(C12924i iVar) {
        for (Record record : this.f33889k.f33903b.f33947a) {
            if (record.f33879a == iVar) {
                return record;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void mo24414f(Bundle bundle) {
        super.mo24414f(bundle);
        if (!bundle.containsKey("bd-scene-navigation:support_restore")) {
            bundle.putBoolean("bd-scene-navigation:support_restore", mo24422r());
            if (mo24422r()) {
                this.f33889k.mo24535a(bundle);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("outState already contains key bd-scene-navigation:support_restore");
    }

    /* renamed from: b */
    public final void mo24398b(Bundle bundle) {
        boolean z;
        boolean z2;
        super.mo24398b(bundle);
        C12945e eVar = this.f33889k;
        if (eVar.f33905d.size() != 0 && eVar.mo24546g()) {
            C12967r.m26079a("NavigationSceneManager#executePendingOperation");
            if (System.currentTimeMillis() - eVar.f33906e > 800) {
                z = true;
            } else {
                z = false;
            }
            ArrayList arrayList = new ArrayList(eVar.f33905d);
            for (int i = 0; i < arrayList.size(); i++) {
                C12950b bVar = (C12950b) arrayList.get(i);
                if (i < arrayList.size() - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                eVar.f33911k = z2 | z;
                String a = eVar.mo24533a("NavigationManager executePendingOperation");
                bVar.mo24552a(C12945e.f33901j);
                eVar.mo24540b(a);
                eVar.f33911k = false;
            }
            eVar.f33905d.removeAll(arrayList);
            if (eVar.f33905d.size() <= 0) {
                eVar.f33906e = -1;
                C12967r.m26078a();
                return;
            }
            throw new IllegalStateException("why mPendingActionList still have item?");
        }
    }

    /* renamed from: c */
    public final void mo24529c(C12924i iVar) {
        C12879k.m25799a();
        if (C12880l.m25806a(this.f33840g_)) {
            if (this.f33889k.mo24542c() == iVar) {
                m25994f();
                m25995h();
            }
            C12945e eVar = this.f33889k;
            eVar.mo24537a((C12950b) new C12957g(iVar));
        }
    }

    /* renamed from: d */
    public final void mo24408d(Bundle bundle) {
        super.mo24408d(bundle);
        this.f33889k = new C12945e(this);
        if (this.f33839g != null) {
            Bundle bundle2 = this.f33839g;
            String string = bundle2.getString("extra_rootScene");
            if (string != null) {
                C12960f fVar = new C12960f(string, bundle2.getBundle("extra_rootScene_arguments"));
                fVar.f33944c = bundle2.getBoolean("extra_drawWindowBackground");
                fVar.f33945d = bundle2.getBoolean("extra_fixSceneBackground_enabled");
                fVar.f33946e = bundle2.getInt("extra_sceneBackground");
                this.f33888j = fVar;
                if (bundle != null && !bundle.getBoolean("bd-scene-navigation:support_restore", mo24422r())) {
                    bY_();
                    return;
                }
                return;
            }
            throw new IllegalStateException("root scene class name cant be null");
        }
        throw new IllegalArgumentException("NavigationScene need NavigationSceneOptions bundle");
    }

    /* renamed from: a */
    public final void mo24518a(C12856c cVar) {
        C12873f fVar;
        C12879k.m25799a();
        int size = this.f33897s.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                fVar = null;
                break;
            } else if (((C12873f) this.f33897s.get(i)).f33705a == cVar) {
                fVar = (C12873f) this.f33897s.get(i);
                break;
            } else {
                i++;
            }
        }
        if (fVar != null) {
            this.f33897s.remove(fVar);
        }
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        C12924i iVar;
        super.mo24448e(bundle);
        C12924i iVar2 = null;
        if (bundle == null || !mo24422r()) {
            String str = this.f33888j.f33942a;
            Bundle bundle2 = this.f33888j.f33943b;
            if (this.f33887i != null) {
                iVar2 = this.f33887i.mo24488a(mo24477v().getClassLoader(), str, bundle2);
                if (!(iVar2 == null || iVar2.f33835c == null)) {
                    throw new IllegalArgumentException("SceneComponentFactory instantiateScene return Scene already has a parent");
                }
            }
            if (iVar2 == null) {
                iVar2 = C12875h.m25795a(mo24477v(), str, bundle2);
            }
            this.f33889k.mo24536a(iVar2, new C12863a().mo24325a());
        } else {
            C12945e eVar = this.f33889k;
            Activity v = mo24477v();
            C12930k kVar = this.f33887i;
            C12962h hVar = eVar.f33903b;
            hVar.f33947a = new ArrayList(bundle.getParcelableArrayList("bd-scene-nav:record_stack"));
            for (int i = 0; i < hVar.f33947a.size(); i++) {
                Record record = (Record) hVar.f33947a.get(i);
                if (i != 0 || kVar == null) {
                    iVar = null;
                } else {
                    iVar = kVar.mo24488a(v.getClassLoader(), record.f33885g, null);
                    if (!(iVar == null || iVar.f33835c == null)) {
                        throw new IllegalArgumentException("SceneComponentFactory instantiateScene return Scene already has a parent");
                    }
                }
                if (iVar == null) {
                    iVar = C12875h.m25795a(v, record.f33885g, null);
                }
                record.f33879a = iVar;
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("bd-scene-nav:navigation_scene_manager");
            List c = eVar.f33903b.mo24559c();
            for (int i2 = 0; i2 <= c.size() - 1; i2++) {
                Bundle bundle3 = (Bundle) parcelableArrayList.get(i2);
                C12945e.m26038a(eVar.f33902a, ((Record) c.get(i2)).f33879a, C12984w.ACTIVITY_CREATED, bundle3, false, null);
            }
        }
        C12942d dVar = this.f33837e;
        if (dVar != null) {
            dVar.mo24517a((C0184k) this, (C12961g) new C12961g() {
                /* renamed from: a */
                public final boolean mo24532a() {
                    return C12942d.this.mo24531d();
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo24520a(C12858e eVar) {
        C12879k.m25799a();
        if (C12880l.m25806a(this.f33840g_)) {
            m25994f();
            m25995h();
            C12945e eVar2 = this.f33889k;
            eVar2.mo24537a((C12950b) new C12954e(eVar));
        }
    }

    /* renamed from: a */
    public final void mo24393a(C12924i iVar) {
        super.mo24393a(iVar);
        if (iVar == null) {
            return;
        }
        if (iVar instanceof C12966q) {
            if (!((C12966q) iVar).mo24422r()) {
                bY_();
            }
            return;
        }
        StringBuilder sb = new StringBuilder("unknown parent Scene type ");
        sb.append(iVar.getClass());
        throw new C12877i(sb.toString());
    }

    /* renamed from: a */
    public final void mo24517a(C0184k kVar, C12961g gVar) {
        C12879k.m25799a();
        if (kVar.getLifecycle().mo323a() != C0178b.DESTROYED) {
            this.f33889k.f33908g.add(C12873f.m25792a(kVar, gVar));
            kVar.getLifecycle().mo324a(new NavigationScene$2(this, kVar, gVar));
        }
    }

    /* renamed from: d */
    public final void mo24410d(C12924i iVar, boolean z) {
        if (iVar != this) {
            for (C12873f fVar : new ArrayList(this.f33897s)) {
                if (!z) {
                    ((Boolean) fVar.f33706b).booleanValue();
                }
            }
        }
        super.mo24410d(iVar, z);
    }

    /* renamed from: e */
    public final void mo24412e(C12924i iVar, boolean z) {
        if (iVar != this) {
            for (C12873f fVar : new ArrayList(this.f33897s)) {
                if (!z) {
                    ((Boolean) fVar.f33706b).booleanValue();
                }
            }
        }
        super.mo24412e(iVar, z);
    }

    /* renamed from: f */
    public final void mo24415f(C12924i iVar, boolean z) {
        if (iVar != this) {
            for (C12873f fVar : new ArrayList(this.f33897s)) {
                if (z || ((Boolean) fVar.f33706b).booleanValue()) {
                    ((C12856c) fVar.f33705a).mo24320b(iVar);
                }
            }
        }
        super.mo24415f(iVar, z);
    }

    /* renamed from: b */
    public final void mo24401b(C12924i iVar, boolean z) {
        if (iVar != this) {
            for (C12873f fVar : new ArrayList(this.f33897s)) {
                if (!z) {
                    ((Boolean) fVar.f33706b).booleanValue();
                }
            }
        }
        super.mo24401b(iVar, z);
    }

    /* renamed from: a */
    public final void mo24519a(C12856c cVar, boolean z) {
        C12879k.m25799a();
        this.f33897s.add(C12873f.m25792a(cVar, Boolean.valueOf(false)));
    }

    /* renamed from: c */
    public final void mo24406c(C12924i iVar, boolean z) {
        if (iVar != this) {
            for (C12873f fVar : new ArrayList(this.f33897s)) {
                if (!z) {
                    ((Boolean) fVar.f33706b).booleanValue();
                }
            }
        }
        super.mo24406c(iVar, z);
    }

    /* renamed from: b */
    public final void mo24400b(C12924i iVar, Bundle bundle, boolean z) {
        if (iVar != this) {
            for (C12873f fVar : new ArrayList(this.f33897s)) {
                if (z || ((Boolean) fVar.f33706b).booleanValue()) {
                    ((C12856c) fVar.f33705a).mo24319a(iVar, bundle);
                }
            }
        }
        super.mo24400b(iVar, bundle, z);
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12884b bVar = new C12884b(mo24476u());
        if (VERSION.SDK_INT >= 21) {
            bVar.setOnApplyWindowInsetsListener(new C12871d());
        }
        bVar.setId(R.id.bq4);
        this.f33890l = new FrameLayout(mo24476u());
        if (VERSION.SDK_INT >= 21) {
            this.f33890l.setOnApplyWindowInsetsListener(new C12871d());
        }
        bVar.addView(this.f33890l, new LayoutParams(-1, -1));
        C12883a aVar = new C12883a(mo24476u());
        if (VERSION.SDK_INT >= 21) {
            aVar.setOnApplyWindowInsetsListener(new C12871d());
        }
        this.f33891m = aVar;
        bVar.addView(this.f33891m, new LayoutParams(-1, -1));
        if (this.f33888j.f33944c) {
            C1056u.m3030a((View) bVar, C12880l.m25800a(mo24476u()));
        }
        return bVar;
    }

    /* renamed from: c */
    public final void mo24405c(C12924i iVar, Bundle bundle, boolean z) {
        if (iVar != this) {
            for (C12873f fVar : new ArrayList(this.f33897s)) {
                if (!z) {
                    ((Boolean) fVar.f33706b).booleanValue();
                }
            }
        }
        super.mo24405c(iVar, bundle, z);
    }
}
