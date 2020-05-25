package com.p683ss.android.p1192ml.process.p1193a;

import com.p683ss.android.p1192ml.process.C19520c;
import com.p683ss.android.p1192ml.process.C19521d;
import com.p683ss.android.p1192ml.process.C19522e;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ml.process.a.a */
public final class C19508a implements C19522e {
    /* renamed from: a */
    public final void mo40682a(C19521d dVar) {
        float f;
        HashMap<String, Object> hashMap = dVar.f53865a;
        C19520c cVar = dVar.f53868d;
        List args = cVar.getArgs();
        Number number = (Number) hashMap.get(args.get(0));
        Number number2 = (Number) hashMap.get(args.get(1));
        float f2 = 0.0f;
        if (number != null) {
            f = number.floatValue();
        } else {
            f = 0.0f;
        }
        if (number2 != null) {
            f2 = number2.floatValue();
        }
        hashMap.put(cVar.getFeature(), Float.valueOf(f / f2));
    }
}
