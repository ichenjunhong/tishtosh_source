package com.bytedance.android.live.broadcast.effect;

import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.live.broadcast.effect.p204a.C3198a.C3199a;
import com.bytedance.android.live.broadcast.effect.p205b.p206a.C3213b;
import com.bytedance.android.live.broadcast.effect.sticker.p209a.C3279b;
import com.bytedance.android.live.broadcast.p211f.C3388d.C3391b;
import com.bytedance.android.live.broadcast.p211f.C3388d.C3391b.C3392a;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.livesdk.C6736d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.live.broadcast.effect.h */
public final class C3254h implements C3203b {

    /* renamed from: a */
    private C3240d f9401a;

    /* renamed from: b */
    private C3213b f9402b;

    /* renamed from: c */
    private C3279b f9403c;

    /* renamed from: d */
    private C3366v f9404d;

    /* renamed from: e */
    private C3261l f9405e;

    /* renamed from: com.bytedance.android.live.broadcast.effect.h$a */
    public static final class C3255a implements C3391b<C3203b> {
        /* renamed from: a */
        public final C3392a<C3203b> mo8221a(C3392a<C3203b> aVar) {
            return aVar.mo8748a(new C3254h()).mo8747a();
        }
    }

    /* renamed from: a */
    public final C3279b mo8551a() {
        if (this.f9403c == null) {
            this.f9403c = new C3279b();
        }
        return this.f9403c;
    }

    /* renamed from: b */
    public final C3366v mo8553b() {
        if (this.f9404d == null) {
            this.f9404d = new C3366v();
        }
        return this.f9404d;
    }

    /* renamed from: c */
    public final C3261l mo8554c() {
        if (this.f9405e == null) {
            this.f9405e = new C3261l();
        }
        return this.f9405e;
    }

    /* renamed from: d */
    public final void mo8555d() {
        if (this.f9402b != null) {
            if (this.f9402b.mo12851g()) {
                try {
                    this.f9402b.dismissAllowingStateLoss();
                } catch (Exception e) {
                    C3831a.m9714b("LiveEffectService", (Throwable) e);
                }
            }
            this.f9402b = null;
        }
        if (this.f9401a != null) {
            if (this.f9401a.mo12851g()) {
                try {
                    this.f9401a.dismissAllowingStateLoss();
                } catch (Exception e2) {
                    C3831a.m9714b("LiveEffectService", (Throwable) e2);
                }
            }
            this.f9401a = null;
        }
        if (this.f9403c != null) {
            this.f9403c.mo8279a();
        }
        if (this.f9404d != null) {
            C3366v vVar = this.f9404d;
            vVar.f9665a.clear();
            vVar.f9666b.clear();
            this.f9404d = null;
        }
        if (this.f9405e != null) {
            this.f9405e.mo8597e();
            this.f9405e = null;
        }
    }

    /* renamed from: a */
    public final C6736d mo8552a(FragmentActivity fragmentActivity, Boolean bool) {
        Fragment a = fragmentActivity.getSupportFragmentManager().mo2224a("LiveSmallItemBeautyDialogFragment");
        if (a != null && a.isAdded() && (a instanceof C6736d)) {
            return (C6736d) a;
        }
        if (this.f9402b == null) {
            boolean booleanValue = bool.booleanValue();
            C3213b bVar = new C3213b();
            bVar.f9309c = booleanValue;
            this.f9402b = bVar;
        }
        if (!this.f9402b.mo12851g()) {
            this.f9402b.show(fragmentActivity.getSupportFragmentManager(), "LiveSmallItemBeautyDialogFragment");
        }
        return this.f9402b;
    }

    /* renamed from: a */
    public final C3240d mo8550a(FragmentActivity fragmentActivity, C3199a aVar) {
        Fragment a = fragmentActivity.getSupportFragmentManager().mo2224a("LiveBeautyFilterDialogFragment");
        if (a != null && a.isAdded() && (a instanceof C3240d)) {
            return (C3240d) a;
        }
        if (this.f9401a == null) {
            C52711k.m112240b(aVar, "onItemClickListener");
            C3240d dVar = new C3240d();
            dVar.f9369c = aVar;
            this.f9401a = dVar;
        }
        if (!this.f9401a.mo12851g()) {
            this.f9401a.show(fragmentActivity.getSupportFragmentManager(), "LiveBeautyFilterDialogFragment");
        }
        return this.f9401a;
    }
}
