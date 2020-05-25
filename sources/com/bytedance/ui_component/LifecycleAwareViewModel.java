package com.bytedance.ui_component;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0184k;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import p2628d.p2639f.p2641b.C52711k;

public abstract class LifecycleAwareViewModel<T extends C11932s> extends JediViewModel<T> implements C0184k {

    /* renamed from: d */
    public C0176h f34842d;

    public C0176h getLifecycle() {
        C0176h hVar = this.f34842d;
        if (hVar == null) {
            C52711k.m112237a("_lifecycle");
        }
        return hVar;
    }
}
