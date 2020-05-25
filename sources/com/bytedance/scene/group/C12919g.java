package com.bytedance.scene.group;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.os.Bundle;

/* renamed from: com.bytedance.scene.group.g */
public abstract class C12919g extends C12896b {

    /* renamed from: k */
    public final C12920h f33817k = new C12920h();

    /* renamed from: l */
    public boolean f33818l = true;

    /* renamed from: m */
    public boolean f33819m = false;

    /* renamed from: n */
    public boolean f33820n = false;

    /* renamed from: I */
    public final C0176h mo24446I() {
        return this.f33817k.getLifecycle();
    }

    /* renamed from: C */
    public final boolean mo24445C() {
        if (!super.mo24445C() || !this.f33818l) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo24408d(Bundle bundle) {
        super.mo24408d(bundle);
        if (bundle != null) {
            this.f33818l = bundle.getBoolean("bd-scene-nav:scene_user_visible_hint");
        }
    }

    /* renamed from: f */
    public final void mo24414f(Bundle bundle) {
        super.mo24414f(bundle);
        bundle.putBoolean("bd-scene-nav:scene_user_visible_hint", this.f33818l);
    }

    /* renamed from: e */
    public void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        this.f33817k.mo24449a(C0177a.ON_CREATE);
        getLifecycle().mo324a(new UserVisibleHintGroupScene$1(this));
    }

    /* renamed from: a */
    public void mo24447a(boolean z) {
        if (this.f33818l != z) {
            this.f33818l = z;
            mo24459D();
            if (this.f33818l) {
                if (this.f33820n) {
                    this.f33817k.mo24449a(C0177a.ON_START);
                }
                if (this.f33819m) {
                    this.f33817k.mo24449a(C0177a.ON_RESUME);
                }
            } else {
                if (this.f33819m) {
                    this.f33817k.mo24449a(C0177a.ON_PAUSE);
                }
                if (this.f33820n) {
                    this.f33817k.mo24449a(C0177a.ON_STOP);
                }
            }
        }
    }
}
