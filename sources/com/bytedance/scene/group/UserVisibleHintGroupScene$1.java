package com.bytedance.scene.group;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;

class UserVisibleHintGroupScene$1 implements C0183j {

    /* renamed from: a */
    final /* synthetic */ C12919g f33752a;

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_START)
    public void onDestroy() {
        this.f33752a.f33817k.mo24449a(C0177a.ON_DESTROY);
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void onPause() {
        this.f33752a.f33819m = false;
        if (this.f33752a.f33818l) {
            this.f33752a.f33817k.mo24449a(C0177a.ON_PAUSE);
        }
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
        this.f33752a.f33819m = true;
        if (this.f33752a.f33818l) {
            this.f33752a.f33817k.mo24449a(C0177a.ON_RESUME);
        }
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_START)
    public void onStart() {
        this.f33752a.f33820n = true;
        if (this.f33752a.f33818l) {
            this.f33752a.f33817k.mo24449a(C0177a.ON_START);
        }
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_STOP)
    public void onStop() {
        this.f33752a.f33820n = false;
        if (this.f33752a.f33818l) {
            this.f33752a.f33817k.mo24449a(C0177a.ON_STOP);
        }
    }

    UserVisibleHintGroupScene$1(C12919g gVar) {
        this.f33752a = gVar;
    }
}
