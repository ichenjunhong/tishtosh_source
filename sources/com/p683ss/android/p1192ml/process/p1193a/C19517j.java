package com.p683ss.android.p1192ml.process.p1193a;

import com.p683ss.android.p1192ml.process.C19520c;
import com.p683ss.android.p1192ml.process.C19521d;
import com.p683ss.android.p1192ml.process.C19522e;
import java.util.HashMap;

/* renamed from: com.ss.android.ml.process.a.j */
public final class C19517j implements C19522e {
    /* renamed from: a */
    public final void mo40682a(C19521d dVar) {
        HashMap<String, Object> hashMap = dVar.f53865a;
        C19520c cVar = dVar.f53868d;
        for (String str : cVar.getArgs()) {
            Number number = (Number) hashMap.get(str);
            if (number != null) {
                hashMap.put(cVar.getFeature(), Double.valueOf(1.0d / (Math.exp((double) (-number.floatValue())) + 1.0d)));
            }
        }
    }
}
