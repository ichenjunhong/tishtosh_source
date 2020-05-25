package com.p683ss.android.ugc.aweme.effect;

import com.p683ss.android.ugc.aweme.effect.p1673c.p1674a.C29164a;
import p2628d.p2639f.p2640a.C52688s;

/* renamed from: com.ss.android.ugc.aweme.effect.as */
final /* synthetic */ class C29117as implements C52688s {

    /* renamed from: a */
    private final C29094ad f76345a;

    C29117as(C29094ad adVar) {
        this.f76345a = adVar;
    }

    /* renamed from: a */
    public final Object mo58987a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C29094ad adVar = this.f76345a;
        Boolean bool = (Boolean) obj;
        Float f = (Float) obj2;
        Float f2 = (Float) obj3;
        Integer num = (Integer) obj4;
        Float f3 = (Float) obj5;
        EffectPointModel effectPointModel = adVar.f76270F;
        int A = adVar.f76313t.mo42966A();
        boolean booleanValue = bool.booleanValue();
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        int intValue = num.intValue();
        float floatValue3 = f3.floatValue();
        if (C29164a.m68673b(effectPointModel)) {
            float f4 = ((float) ((60000 - A) / 2)) / floatValue3;
            floatValue = booleanValue ? (floatValue2 - ((float) intValue)) - f4 : floatValue + ((float) intValue) + f4;
        } else if (C29164a.m68674c(effectPointModel)) {
            float f5 = ((((float) (60000 - A)) * 0.5f) / 0.5f) / floatValue3;
            floatValue = booleanValue ? (floatValue2 - ((float) intValue)) - f5 : floatValue + ((float) intValue) + f5;
        } else if (!booleanValue) {
            floatValue = floatValue2;
        }
        return Float.valueOf(floatValue);
    }
}
