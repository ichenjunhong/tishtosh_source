package com.bytedance.scene;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.C12966q;
import com.bytedance.scene.C12969t.C12971a;
import com.bytedance.scene.p841c.C12880l;

/* renamed from: com.bytedance.scene.o */
public final class C12963o<T extends C12924i & C12966q> implements C12934l {

    /* renamed from: a */
    private final int f33948a;

    /* renamed from: b */
    private final C12986y f33949b;

    /* renamed from: c */
    private final T f33950c;

    /* renamed from: d */
    private final C12971a f33951d;

    /* renamed from: e */
    private final boolean f33952e;

    /* renamed from: f */
    private final C12964p<T> f33953f = new C12964p<>();

    /* renamed from: a */
    public final void mo24491a() {
        C12967r.m26079a("SceneLifecycleDispatcher#OnStart");
        C12964p<T> pVar = this.f33953f;
        if (pVar.f33955b == C12965a.ACTIVITY_CREATED || pVar.f33955b == C12965a.STOP) {
            pVar.f33955b = C12965a.START;
            pVar.f33954a.mo24397b();
            C12967r.m26078a();
            return;
        }
        StringBuilder sb = new StringBuilder("invoke onActivityCreated() or onStop() first, current state ");
        sb.append(pVar.f33955b.toString());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public final void mo24494b() {
        C12967r.m26079a("SceneLifecycleDispatcher#OnResume");
        C12964p<T> pVar = this.f33953f;
        if (pVar.f33955b == C12965a.START || pVar.f33955b == C12965a.PAUSE) {
            pVar.f33955b = C12965a.RESUME;
            pVar.f33954a.mo24411e();
            C12967r.m26078a();
            return;
        }
        StringBuilder sb = new StringBuilder("invoke onStart() or onPause() first, current state ");
        sb.append(pVar.f33955b.toString());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public final void mo24495c() {
        C12967r.m26079a("SceneLifecycleDispatcher#OnPause");
        C12964p<T> pVar = this.f33953f;
        if (pVar.f33955b == C12965a.RESUME) {
            pVar.f33955b = C12965a.PAUSE;
            pVar.f33954a.mo24416g();
            C12967r.m26078a();
            return;
        }
        StringBuilder sb = new StringBuilder("invoke onResume() first, current state ");
        sb.append(pVar.f33955b.toString());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: d */
    public final void mo24496d() {
        C12967r.m26079a("SceneLifecycleDispatcher#OnStop");
        C12964p<T> pVar = this.f33953f;
        if (pVar.f33955b == C12965a.PAUSE || pVar.f33955b == C12965a.START) {
            pVar.f33955b = C12965a.STOP;
            pVar.f33954a.mo24417j();
            C12967r.m26078a();
            return;
        }
        StringBuilder sb = new StringBuilder("invoke onPause() or onStart() first, current state ");
        sb.append(pVar.f33955b.toString());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    public final void mo24497e() {
        C12967r.m26079a("SceneLifecycleDispatcher#OnDestroyView");
        C12964p<T> pVar = this.f33953f;
        if (pVar.f33955b == C12965a.STOP || pVar.f33955b == C12965a.ACTIVITY_CREATED) {
            pVar.f33955b = C12965a.NONE;
            pVar.f33954a.mo24418k();
            pVar.f33954a.mo24419l();
            pVar.f33954a.mo24420m();
            pVar.f33954a.mo24421n();
            pVar.f33954a.f33836d = null;
            pVar.f33954a = null;
            C12967r.m26078a();
            return;
        }
        StringBuilder sb = new StringBuilder("invoke onStop() or onActivityCreated() first, current state ");
        sb.append(pVar.f33955b.toString());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final void mo24493a(Bundle bundle) {
        if (this.f33952e) {
            bundle.putString("SCENE", this.f33950c.getClass().getName());
            C12967r.m26079a("SceneLifecycleDispatcher#OnSaveInstance");
            C12964p<T> pVar = this.f33953f;
            C12880l.m25801a(bundle, "outState can't be null");
            if (pVar.f33955b == C12965a.NONE) {
                StringBuilder sb = new StringBuilder("invoke onActivityCreated() first, current state ");
                sb.append(pVar.f33955b.toString());
                throw new IllegalStateException(sb.toString());
            } else if (pVar.f33956c) {
                pVar.f33954a.mo24403c(bundle);
                C12967r.m26078a();
            } else {
                throw new IllegalArgumentException("cant invoke onSaveInstanceState when not support restore");
            }
        }
    }

    /* renamed from: a */
    public final void mo24492a(Activity activity, Bundle bundle) {
        C12967r.m26079a("SceneLifecycleDispatcher#OnActivityCreated");
        ViewGroup viewGroup = (ViewGroup) this.f33949b.mo24298a(this.f33948a);
        C12964p<T> pVar = this.f33953f;
        T t = this.f33950c;
        C12971a aVar = this.f33951d;
        boolean z = this.f33952e;
        if (!this.f33952e) {
            bundle = null;
        }
        if (pVar.f33955b == C12965a.NONE) {
            C12880l.m25801a(activity, "activity can't be null");
            C12880l.m25801a(viewGroup, "viewGroup can't be null");
            C12880l.m25801a(t, "scene can't be null");
            C12880l.m25801a(aVar, "rootScopeFactory can't be null");
            if (t.f33838f == C12984w.NONE) {
                pVar.f33956c = z;
                if (pVar.f33956c || bundle == null) {
                    pVar.f33955b = C12965a.ACTIVITY_CREATED;
                    pVar.f33954a = t;
                    if (!pVar.f33956c) {
                        ((C12966q) pVar.f33954a).bY_();
                    }
                    pVar.f33954a.f33836d = aVar;
                    pVar.f33954a.mo24390a(activity);
                    pVar.f33954a.mo24393a((C12924i) null);
                    pVar.f33954a.mo24391a(bundle);
                    pVar.f33954a.mo24392a(bundle, viewGroup);
                    viewGroup.addView(pVar.f33954a.mo24472r_(), new LayoutParams(-1, -1));
                    pVar.f33954a.mo24398b(bundle);
                    C12967r.m26078a();
                    return;
                }
                throw new IllegalArgumentException("savedInstanceState should be null when not support restore");
            }
            StringBuilder sb = new StringBuilder("Scene state must be ");
            sb.append(C12984w.NONE.name);
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("invoke onDestroyView() first, current state ");
        sb2.append(pVar.f33955b.toString());
        throw new IllegalStateException(sb2.toString());
    }

    public C12963o(int i, C12986y yVar, T t, C12971a aVar, boolean z) {
        this.f33948a = i;
        this.f33949b = yVar;
        this.f33950c = t;
        this.f33951d = aVar;
        this.f33952e = z;
    }
}
