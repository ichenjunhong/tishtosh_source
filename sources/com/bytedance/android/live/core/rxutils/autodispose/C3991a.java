package com.bytedance.android.live.core.rxutils.autodispose;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import com.bytedance.android.live.core.rxutils.autodispose.p243b.C4007a;
import com.bytedance.android.live.core.rxutils.autodispose.p243b.C4010d;
import com.bytedance.android.live.core.rxutils.autodispose.p243b.C4011e;
import p064c.p065a.C2142f;
import p064c.p065a.C2201v;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.a */
public final class C3991a implements C4010d<C0177a> {

    /* renamed from: a */
    private static final C4007a<C0177a> f11130a = C4006b.f11142a;

    /* renamed from: b */
    private final C4007a<C0177a> f11131b;

    /* renamed from: c */
    private final LifecycleEventsObservable f11132c;

    /* renamed from: com.bytedance.android.live.core.rxutils.autodispose.a$a */
    static class C3993a implements C4007a<C0177a> {

        /* renamed from: a */
        private final C0177a f11134a;

        C3993a(C0177a aVar) {
            this.f11134a = aVar;
        }

        public final /* bridge */ /* synthetic */ Object apply(Object obj) throws C4003ad {
            C0177a aVar = (C0177a) obj;
            return this.f11134a;
        }
    }

    /* renamed from: a */
    public final C2201v<C0177a> mo9396a() {
        return this.f11132c;
    }

    /* renamed from: b */
    public final C4007a<C0177a> mo9397b() {
        return this.f11131b;
    }

    /* renamed from: c */
    public final C2142f mo9398c() {
        return C4011e.m10130a(this, true);
    }

    /* renamed from: d */
    public final /* synthetic */ Object mo9399d() {
        C0177a aVar;
        LifecycleEventsObservable lifecycleEventsObservable = this.f11132c;
        switch (C39901.f11126a[lifecycleEventsObservable.f11124a.mo323a().ordinal()]) {
            case 1:
                aVar = C0177a.ON_CREATE;
                break;
            case 2:
                aVar = C0177a.ON_START;
                break;
            case 3:
            case 4:
                aVar = C0177a.ON_RESUME;
                break;
            default:
                aVar = C0177a.ON_DESTROY;
                break;
        }
        lifecycleEventsObservable.f11125b.onNext(aVar);
        return (C0177a) this.f11132c.f11125b.mo6469m();
    }

    /* renamed from: a */
    private static C3991a m10106a(C0176h hVar, C4007a<C0177a> aVar) {
        return new C3991a(hVar, aVar);
    }

    private C3991a(C0176h hVar, C4007a<C0177a> aVar) {
        this.f11132c = new LifecycleEventsObservable(hVar);
        this.f11131b = aVar;
    }

    /* renamed from: a */
    public static C3991a m10105a(C0176h hVar, C0177a aVar) {
        return m10106a(hVar, (C4007a<C0177a>) new C3993a<C0177a>(aVar));
    }

    /* renamed from: a */
    public static C3991a m10107a(C0184k kVar, C0177a aVar) {
        return m10105a(kVar.getLifecycle(), aVar);
    }
}
