package com.bytedance.scene.ktx;

import android.app.Activity;
import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0178b;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.scene.C12924i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52718r;
import p2628d.p2639f.p2641b.C52719s;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.scene.ktx.b */
public final class C12932b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f33862a = {C52728w.m112248a((C52718r) new C52719s(C52728w.m112246a(C12932b.class, "scene_ktx_release"), "HANDLER", "getHANDLER()Landroid/os/Handler;"))};

    /* renamed from: b */
    private static final C52668f f33863b = C52732g.m112285a(C12933a.f33864a);

    /* renamed from: com.bytedance.scene.ktx.b$a */
    static final class C12933a extends C52712l implements C52670a<Handler> {

        /* renamed from: a */
        public static final C12933a f33864a = new C12933a();

        C12933a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: a */
    public static final Handler m25975a() {
        return (Handler) f33863b.getValue();
    }

    /* renamed from: a */
    public static final FragmentActivity m25976a(C12924i iVar) {
        C52711k.m112240b(iVar, "$this$fragmentActivity");
        return (FragmentActivity) iVar.f33840g_;
    }

    /* renamed from: b */
    public static final FragmentActivity m25979b(C12924i iVar) {
        C52711k.m112240b(iVar, "$this$requireFragmentActivity");
        Activity v = iVar.mo24477v();
        if (v != null) {
            return (FragmentActivity) v;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public static final void m25977a(C12924i iVar, Runnable runnable) {
        C52711k.m112240b(iVar, "$this$post");
        C52711k.m112240b(runnable, "runnable");
        C0176h lifecycle = iVar.getLifecycle();
        C52711k.m112236a((Object) lifecycle, "this.lifecycle");
        if (lifecycle.mo323a() != C0178b.DESTROYED) {
            m25975a().post(runnable);
            iVar.getLifecycle().mo324a(new SceneExtensionsKt$post$1(runnable));
        }
    }

    /* renamed from: a */
    public static final void m25978a(C12924i iVar, Runnable runnable, long j) {
        C52711k.m112240b(iVar, "$this$postDelayed");
        C52711k.m112240b(runnable, "runnable");
        C0176h lifecycle = iVar.getLifecycle();
        C52711k.m112236a((Object) lifecycle, "this.lifecycle");
        if (lifecycle.mo323a() != C0178b.DESTROYED) {
            m25975a().postDelayed(runnable, j);
            iVar.getLifecycle().mo324a(new SceneExtensionsKt$postDelayed$1(runnable));
        }
    }
}
