package com.bytedance.scene;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.C0210y;
import android.arch.lifecycle.C0210y.C0211a;
import android.arch.lifecycle.C0210y.C0212b;

/* renamed from: com.bytedance.scene.s */
public final class C12968s {
    /* renamed from: a */
    public static C0210y m26080a(C12924i iVar) {
        Activity activity = iVar.f33840g_;
        if (activity != null) {
            Application application = activity.getApplication();
            if (application != null) {
                return new C0210y(iVar.getViewModelStore(), C0211a.m433a(application));
            }
            throw new IllegalStateException("Your activity is not yet attached to Application. You can't request ViewModel before onCreate call.");
        }
        throw new IllegalStateException("Can't create ViewModelProvider for removed scene");
    }

    /* renamed from: a */
    public static C0210y m26081a(C12924i iVar, C0212b bVar) {
        return new C0210y(iVar.getViewModelStore(), bVar);
    }
}
