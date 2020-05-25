package com.p683ss.android.p1192ml.process.p1193a;

import com.p683ss.android.p1192ml.process.C19521d;
import com.p683ss.android.p1192ml.process.C19522e;
import java.util.List;

/* renamed from: com.ss.android.ml.process.a.i */
public final class C19516i implements C19522e {
    /* renamed from: a */
    public final void mo40682a(C19521d dVar) {
        float[] fArr = dVar.f53866b;
        List oPTs = dVar.f53869e.getOPTs();
        float floatValue = ((Float) oPTs.get(0)).floatValue();
        fArr[0] = (fArr[0] * floatValue) + ((Float) oPTs.get(1)).floatValue();
    }
}
