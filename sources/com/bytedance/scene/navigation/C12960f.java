package com.bytedance.scene.navigation;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.scene.C12924i;

/* renamed from: com.bytedance.scene.navigation.f */
public final class C12960f {

    /* renamed from: a */
    public final String f33942a;

    /* renamed from: b */
    public final Bundle f33943b;

    /* renamed from: c */
    public boolean f33944c = true;

    /* renamed from: d */
    public boolean f33945d = true;

    /* renamed from: e */
    public int f33946e;

    /* renamed from: a */
    public final Bundle mo24555a() {
        if (!TextUtils.isEmpty(this.f33942a)) {
            Bundle bundle = new Bundle();
            bundle.putString("extra_rootScene", this.f33942a);
            bundle.putBundle("extra_rootScene_arguments", this.f33943b);
            bundle.putBoolean("extra_drawWindowBackground", this.f33944c);
            bundle.putBoolean("extra_fixSceneBackground_enabled", this.f33945d);
            bundle.putInt("extra_sceneBackground", this.f33946e);
            return bundle;
        }
        throw new IllegalArgumentException("call setRootScene first");
    }

    C12960f(String str, Bundle bundle) {
        this.f33942a = str;
        this.f33943b = bundle;
    }

    public C12960f(Class<? extends C12924i> cls, Bundle bundle) {
        if (!cls.isAssignableFrom(C12942d.class)) {
            this.f33942a = cls.getName();
            this.f33943b = bundle;
            return;
        }
        throw new IllegalArgumentException("cant use NavigationScene as root scene");
    }
}
