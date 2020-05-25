package com.bytedance.android.live.core.paging.viewmodel;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.p010b.C0082h;
import com.bytedance.android.live.core.p226e.C3842b;
import com.bytedance.android.live.core.paging.C3945b;
import com.bytedance.android.live.core.rxutils.RxViewModel;

public class PagingViewModel<T> extends RxViewModel {

    /* renamed from: b */
    public C0198r<C3842b> f11039b = new C0198r<>();

    /* renamed from: c */
    public C0198r<C3842b> f11040c = new C0198r<>();

    /* renamed from: d */
    public C0198r<Boolean> f11041d = new C0198r<>();

    /* renamed from: e */
    public C0198r<Boolean> f11042e = new C0198r<>();

    /* renamed from: f */
    public C0198r<Integer> f11043f = new C0198r<>();

    /* renamed from: g */
    public C0198r<C0082h<T>> f11044g = new C0198r<>();

    /* renamed from: h */
    public C3945b<T> f11045h;

    /* renamed from: i */
    protected final C0199s<C3842b> f11046i = new C3966a(this);

    /* renamed from: j */
    protected final C0199s<C3842b> f11047j = new C3967b(this);

    /* renamed from: k */
    protected final C0199s<C0082h<T>> f11048k = new C3968c(this);

    /* renamed from: l */
    protected final C0199s<Boolean> f11049l = new C3969d(this);

    /* renamed from: m */
    protected final C0199s<Boolean> f11050m = new C3970e(this);

    /* renamed from: n */
    protected final C0199s<Integer> f11051n = new C3971f(this);

    /* renamed from: a */
    public final void mo9355a() {
        if (this.f11045h != null) {
            this.f11045h.mo9304h();
        }
    }

    /* renamed from: c */
    public final void mo9357c() {
        if (this.f11045h != null) {
            this.f11045h.mo9303g();
        }
    }

    /* renamed from: b */
    public boolean mo9356b() {
        if ((this.f11040c.getValue() != null && ((C3842b) this.f11040c.getValue()).mo9203a()) || this.f11045h == null) {
            return false;
        }
        this.f11045h.mo9302f();
        return true;
    }
}
