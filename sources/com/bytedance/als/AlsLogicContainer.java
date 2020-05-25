package com.bytedance.als;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import com.bytedance.p780m.C12361b;
import com.bytedance.p780m.C12366c;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p2628d.p2639f.p2641b.C52711k;

public final class AlsLogicContainer implements C0183j {

    /* renamed from: a */
    final C0176h f8306a;

    /* renamed from: b */
    final Set<C2764h<?>> f8307b = new LinkedHashSet();

    /* renamed from: c */
    public final C12366c f8308c = new C12366c(this.f8312g);

    /* renamed from: d */
    C12361b f8309d;

    /* renamed from: e */
    public final List<Class<C2764h<?>>> f8310e = new ArrayList();

    /* renamed from: f */
    public final ApiCenter f8311f;

    /* renamed from: g */
    private final C12361b f8312g;

    /* renamed from: a */
    public final C12361b mo7332a() {
        C12361b bVar = this.f8309d;
        if (bVar == null) {
            C52711k.m112234a();
        }
        return bVar;
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public final void onActivityCreated() {
        for (C2764h a : this.f8307b) {
            m7842a(a, C0178b.CREATED);
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroyView() {
        for (C2764h a : this.f8307b) {
            m7842a(a, C0178b.DESTROYED);
        }
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void onPause() {
        for (C2764h a : this.f8307b) {
            m7842a(a, C0178b.STARTED);
        }
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onResume() {
        for (C2764h a : this.f8307b) {
            m7842a(a, C0178b.RESUMED);
        }
    }

    @C0200t(mo345a = C0177a.ON_START)
    public final void onStart() {
        for (C2764h a : this.f8307b) {
            m7842a(a, C0178b.STARTED);
        }
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public final void onStop() {
        for (C2764h a : this.f8307b) {
            m7842a(a, C0178b.CREATED);
        }
    }

    /* renamed from: a */
    private final void m7842a(C2764h<?> hVar, C0178b bVar) {
        switch (C2758c.f8322a[bVar.ordinal()]) {
            case 1:
                if (hVar.getLifecycle().mo323a().compareTo(C0178b.CREATED) < 0) {
                    hVar.bO_();
                    return;
                }
                if (hVar.getLifecycle().mo323a().compareTo(C0178b.STARTED) > 0) {
                    hVar.bM_();
                }
                if (hVar.getLifecycle().mo323a().compareTo(C0178b.CREATED) > 0) {
                    hVar.mo7359u_();
                }
                return;
            case 2:
                if (hVar.getLifecycle().mo323a().compareTo(C0178b.STARTED) < 0) {
                    if (hVar.getLifecycle().mo323a().compareTo(C0178b.CREATED) < 0) {
                        hVar.bO_();
                    }
                    hVar.mo7357s_();
                    return;
                }
                if (hVar.getLifecycle().mo323a().compareTo(C0178b.STARTED) > 0) {
                    hVar.bM_();
                }
                return;
            case 3:
                if (hVar.getLifecycle().mo323a().compareTo(C0178b.RESUMED) < 0) {
                    if (hVar.getLifecycle().mo323a().compareTo(C0178b.CREATED) < 0) {
                        hVar.bO_();
                    }
                    if (hVar.getLifecycle().mo323a().compareTo(C0178b.STARTED) < 0) {
                        hVar.mo7357s_();
                    }
                    hVar.mo7358t_();
                    return;
                }
                break;
            case 4:
                if (hVar.getLifecycle().mo323a().compareTo(C0178b.RESUMED) >= 0) {
                    hVar.bM_();
                }
                if (hVar.getLifecycle().mo323a().compareTo(C0178b.STARTED) >= 0) {
                    hVar.mo7359u_();
                }
                if (hVar.getLifecycle().mo323a().compareTo(C0178b.CREATED) >= 0) {
                    C2759d a = hVar.mo7353a();
                    hVar.bN_();
                    this.f8311f.mo7342b(a);
                    break;
                }
                break;
        }
    }

    public AlsLogicContainer(C0176h hVar, ApiCenter apiCenter, C12361b bVar) {
        C52711k.m112240b(hVar, "containerLifecycle");
        C52711k.m112240b(apiCenter, "apiCenter");
        C52711k.m112240b(bVar, "parentObjectContainer");
        this.f8311f = apiCenter;
        this.f8312g = bVar;
        this.f8306a = hVar;
        this.f8306a.mo324a(this);
    }
}
