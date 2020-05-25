package com.p683ss.android.ugc.aweme.effect.p1673c.p1674a;

import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.p2184a.C43115a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.p2184a.C43115a.C43116a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.p2184a.C43117b;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import p2628d.C52847n;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effect.c.a.c */
public final class C29167c implements C43117b {

    /* renamed from: a */
    private boolean f76431a = true;

    /* renamed from: b */
    private final FragmentActivity f76432b;

    /* renamed from: c */
    private final C52670a<Boolean> f76433c;

    /* renamed from: d */
    private final C52671b<Float, Long> f76434d;

    /* renamed from: e */
    private final C52688s<Boolean, Float, Float, Integer, Float, Float> f76435e;

    /* renamed from: a */
    public final String mo59043a() {
        String simpleName = getClass().getSimpleName();
        C52711k.m112236a((Object) simpleName, "this.javaClass.simpleName");
        return simpleName;
    }

    /* renamed from: a */
    public final C43115a<C52847n<Float, Float>> mo59042a(float f, boolean z, float f2, float f3) {
        return C43116a.m94588b(new C52847n(Float.valueOf(0.0f), Float.valueOf(0.0f)));
    }

    public C29167c(FragmentActivity fragmentActivity, C52670a<Boolean> aVar, C52671b<? super Float, Long> bVar, C52688s<? super Boolean, ? super Float, ? super Float, ? super Integer, ? super Float, Float> sVar) {
        C52711k.m112240b(fragmentActivity, "mActivity");
        C52711k.m112240b(aVar, "isInTimeEffectTab");
        C52711k.m112240b(bVar, "getTimeEffectDuration");
        C52711k.m112240b(sVar, "calculateDefaultSlidePosition");
        this.f76432b = fragmentActivity;
        this.f76433c = aVar;
        this.f76434d = bVar;
        this.f76435e = sVar;
    }

    /* renamed from: a */
    public final C43115a<Float> mo59041a(float f, int i, int i2, float f2, float f3) {
        return m68679a(false, f2, f, i, f3);
    }

    /* renamed from: b */
    public final C43115a<Float> mo59044b(float f, int i, int i2, float f2, float f3) {
        return m68679a(true, f, f2, i, f3);
    }

    /* renamed from: a */
    private final C43115a<Float> m68679a(boolean z, float f, float f2, int i, float f3) {
        C52847n b = m68680b(z, f, f2, i, f3);
        if (!((Boolean) b.getFirst()).booleanValue()) {
            this.f76431a = true;
        } else if (this.f76431a) {
            C50275d.m108541c(this.f76432b, R.string.awh).mo98174a();
            this.f76431a = false;
        }
        if (((Boolean) b.getFirst()).booleanValue()) {
            return C43116a.m94587a(b.getSecond());
        }
        return C43116a.m94588b(Float.valueOf(0.0f));
    }

    /* renamed from: b */
    private final C52847n<Boolean, Float> m68680b(boolean z, float f, float f2, int i, float f3) {
        if (!((Boolean) this.f76433c.invoke()).booleanValue()) {
            return new C52847n<>(Boolean.valueOf(false), Float.valueOf(0.0f));
        }
        if (!C29164a.m68670a(((Number) this.f76434d.invoke(Float.valueOf(Math.abs((f2 - f) - ((float) i)) * f3))).longValue())) {
            return new C52847n<>(Boolean.valueOf(false), Float.valueOf(0.0f));
        }
        return new C52847n<>(Boolean.valueOf(true), Float.valueOf(((Number) this.f76435e.mo58987a(Boolean.valueOf(z), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), Float.valueOf(f3))).floatValue()));
    }
}
