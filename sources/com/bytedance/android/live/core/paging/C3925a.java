package com.bytedance.android.live.core.paging;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.LiveData;
import android.arch.p010b.C0082h;
import com.bytedance.android.live.core.p226e.C3842b;
import com.bytedance.android.live.core.paging.p237b.C3946a;
import com.bytedance.android.live.core.rxutils.C4064k;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.live.core.paging.a */
public class C3925a<T> implements C3945b<T> {

    /* renamed from: a */
    private LiveData<C0082h<T>> f10937a;

    /* renamed from: b */
    private C0198r<C3842b> f10938b;

    /* renamed from: c */
    private C0198r<C3842b> f10939c;

    /* renamed from: d */
    private C0198r<Boolean> f10940d;

    /* renamed from: e */
    private C2180b<Object> f10941e;

    /* renamed from: f */
    private C2180b<Object> f10942f;

    /* renamed from: g */
    private C2180b<Object> f10943g;

    /* renamed from: h */
    private C0198r<Integer> f10944h;

    /* renamed from: i */
    private C0198r<Boolean> f10945i;

    /* renamed from: a */
    public final LiveData<C0082h<T>> mo9295a() {
        return this.f10937a;
    }

    /* renamed from: b */
    public final LiveData<C3842b> mo9297b() {
        return this.f10938b;
    }

    /* renamed from: c */
    public final LiveData<C3842b> mo9299c() {
        return this.f10939c;
    }

    /* renamed from: d */
    public final LiveData<Boolean> mo9300d() {
        return this.f10945i;
    }

    /* renamed from: e */
    public final LiveData<Boolean> mo9301e() {
        return this.f10940d;
    }

    /* renamed from: i */
    public final LiveData<Integer> mo9305i() {
        return this.f10944h;
    }

    /* renamed from: f */
    public final void mo9302f() {
        this.f10941e.onNext(C4064k.f11214a);
    }

    /* renamed from: g */
    public final void mo9303g() {
        this.f10942f.onNext(C4064k.f11214a);
    }

    /* renamed from: h */
    public final void mo9304h() {
        this.f10943g.onNext(C4064k.f11214a);
    }

    /* renamed from: j */
    public int mo9306j() {
        throw new RuntimeException("unsupported operation");
    }

    /* renamed from: a */
    public int mo9294a(T t) {
        throw new RuntimeException("unsupported operation");
    }

    /* renamed from: b */
    public void mo9298b(int i) {
        throw new RuntimeException("unsupported operation");
    }

    /* renamed from: a */
    public final void mo9296a(int i) {
        this.f10944h.setValue(Integer.valueOf(i));
    }

    public C3925a(C3946a<T> aVar, LiveData<C0082h<T>> liveData) {
        this.f10938b = aVar.mo9330a();
        this.f10939c = aVar.mo9331b();
        this.f10945i = aVar.mo9332c();
        this.f10941e = aVar.mo9334e();
        this.f10942f = aVar.mo9335f();
        this.f10943g = aVar.mo9336g();
        this.f10937a = liveData;
        this.f10940d = aVar.mo9333d();
        this.f10944h = aVar.mo9337h();
    }
}
