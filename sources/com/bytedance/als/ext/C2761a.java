package com.bytedance.als.ext;

import android.app.Activity;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import com.bytedance.als.AlsVMContainer;
import com.bytedance.als.C2756a;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.C12968s;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.als.ext.a */
public final class C2761a {
    /* renamed from: a */
    public static final OCAdapterViewModel m7859a(AppCompatActivity appCompatActivity) {
        C52711k.m112240b(appCompatActivity, "activity");
        C0209x a = C0214z.m440a((FragmentActivity) appCompatActivity).mo359a(AlsVMContainer.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…sVMContainer::class.java]");
        AlsVMContainer alsVMContainer = (AlsVMContainer) a;
        if (alsVMContainer.f8314b == null) {
            alsVMContainer.f8314b = new OCAdapterViewModel(null);
        }
        OCAdapterViewModel oCAdapterViewModel = alsVMContainer.f8314b;
        if (oCAdapterViewModel == null) {
            C52711k.m112234a();
        }
        return oCAdapterViewModel;
    }

    /* renamed from: a */
    public static final OCAdapterViewModel m7860a(C12924i iVar) {
        C52711k.m112240b(iVar, "scene");
        C0209x a = C12968s.m26080a(iVar).mo359a(AlsVMContainer.class);
        C52711k.m112236a((Object) a, "SceneViewModelProviders.…sVMContainer::class.java]");
        AlsVMContainer alsVMContainer = (AlsVMContainer) a;
        if (alsVMContainer.f8314b == null) {
            Activity v = iVar.mo24477v();
            if (v != null) {
                alsVMContainer.f8314b = new OCAdapterViewModel(C2756a.m7854b((AppCompatActivity) v));
            } else {
                throw new C52857u("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
            }
        }
        OCAdapterViewModel oCAdapterViewModel = alsVMContainer.f8314b;
        if (oCAdapterViewModel == null) {
            C52711k.m112234a();
        }
        return oCAdapterViewModel;
    }
}
