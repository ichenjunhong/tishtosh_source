package com.bytedance.als;

import android.app.Activity;
import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import com.bytedance.als.ApiCenter.C2755a;
import com.bytedance.als.ext.C2761a;
import com.bytedance.p780m.C12361b;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.C12968s;
import com.bytedance.scene.group.C12896b;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.als.a */
public final class C2756a {
    /* renamed from: b */
    public static final C12361b m7854b(AppCompatActivity appCompatActivity) {
        C52711k.m112240b(appCompatActivity, "$this$getObjectContainer");
        return m7852a(appCompatActivity).mo7332a();
    }

    /* renamed from: a */
    public static final AlsLogicContainer m7852a(AppCompatActivity appCompatActivity) {
        C52711k.m112240b(appCompatActivity, "activity");
        FragmentActivity fragmentActivity = appCompatActivity;
        C0209x a = C0214z.m440a(fragmentActivity).mo359a(AlsVMContainer.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…sVMContainer::class.java]");
        AlsVMContainer alsVMContainer = (AlsVMContainer) a;
        if (alsVMContainer.f8313a == null) {
            ApiCenter a2 = C2755a.m7851a(fragmentActivity);
            C12361b b = C2761a.m7859a(appCompatActivity).mo7347b();
            C0176h lifecycle = appCompatActivity.getLifecycle();
            C52711k.m112236a((Object) lifecycle, "activity.lifecycle");
            alsVMContainer.f8313a = new AlsLogicContainer(lifecycle, a2, b);
        }
        AlsLogicContainer alsLogicContainer = alsVMContainer.f8313a;
        if (alsLogicContainer == null) {
            C52711k.m112234a();
        }
        return alsLogicContainer;
    }

    /* renamed from: a */
    public static final AlsLogicContainer m7853a(C12896b bVar) {
        C52711k.m112240b(bVar, "scene");
        C12924i iVar = bVar;
        C0209x a = C12968s.m26080a(iVar).mo359a(AlsVMContainer.class);
        C52711k.m112236a((Object) a, "SceneViewModelProviders.…sVMContainer::class.java]");
        AlsVMContainer alsVMContainer = (AlsVMContainer) a;
        if (alsVMContainer.f8313a == null) {
            Activity v = bVar.mo24477v();
            if (v != null) {
                ApiCenter a2 = C2755a.m7851a((AppCompatActivity) v);
                C12361b b = C2761a.m7860a(iVar).mo7347b();
                C0176h lifecycle = bVar.getLifecycle();
                C52711k.m112236a((Object) lifecycle, "scene.lifecycle");
                alsVMContainer.f8313a = new AlsLogicContainer(lifecycle, a2, b);
            } else {
                throw new C52857u("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
            }
        }
        AlsLogicContainer alsLogicContainer = alsVMContainer.f8313a;
        if (alsLogicContainer == null) {
            C52711k.m112234a();
        }
        return alsLogicContainer;
    }
}
