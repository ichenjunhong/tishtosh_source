package com.bytedance.jedi.ext.widget;

import android.arch.lifecycle.C0159aa;
import android.arch.lifecycle.C0161ac;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.support.p030v4.app.Fragment;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.widget.Widget;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public final class WidgetLifecycleAwareLazy<T extends C0209x> extends lifecycleAwareLazy<T> {
    public WidgetLifecycleAwareLazy(C0184k kVar, C52670a<String> aVar, C52670a<? extends T> aVar2) {
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(aVar2, "initializer");
        super(kVar, aVar, aVar2);
    }

    public final void ensureViewModel(C0184k kVar, T t, C52670a<String> aVar) {
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(t, "value");
        C52711k.m112240b(aVar, "keyFactory");
        Object n = ((Widget) kVar).mo25062n();
        if (!(n instanceof Fragment)) {
            n = null;
        }
        Fragment fragment = (Fragment) n;
        if (fragment != null) {
            C52711k.m112240b(fragment, "$this$ensureViewModel");
            C52711k.m112240b(t, "value");
            C52711k.m112240b(aVar, "keyFactory");
            C0159aa a = C0161ac.m372a(fragment);
            C52711k.m112236a((Object) a, "ViewModelStores.of(this)");
            String str = (String) aVar.invoke();
            if (a.mo300a(str) == null) {
                a.mo302a(str, t);
            }
        }
    }

    public /* synthetic */ WidgetLifecycleAwareLazy(C0184k kVar, C52670a aVar, C52670a aVar2, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            aVar = null;
        }
        this(kVar, aVar, aVar2);
    }
}
