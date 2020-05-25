package com.p683ss.android.ugc.aweme.common.p1598j;

import android.animation.TypeEvaluator;
import p2628d.C52847n;

/* renamed from: com.ss.android.ugc.aweme.common.j.b */
public final class C26903b implements TypeEvaluator<C52847n<? extends Float, ? extends Float>> {

    /* renamed from: a */
    public static final C26903b f70760a = new C26903b();

    private C26903b() {
    }

    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        C52847n nVar = (C52847n) obj;
        C52847n nVar2 = (C52847n) obj2;
        if (nVar == null || nVar2 == null) {
            return new C52847n(Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        return new C52847n(Float.valueOf(((((Number) nVar2.getFirst()).floatValue() - ((Number) nVar.getFirst()).floatValue()) * f) + ((Number) nVar.getFirst()).floatValue()), Float.valueOf(((((Number) nVar2.getSecond()).floatValue() - ((Number) nVar.getSecond()).floatValue()) * f) + ((Number) nVar.getSecond()).floatValue()));
    }
}
