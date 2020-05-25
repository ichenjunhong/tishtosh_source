package com.p683ss.android.p1192ml.process.p1193a;

import com.p683ss.android.p1192ml.process.C19507a;
import com.p683ss.android.p1192ml.process.C19521d;
import com.p683ss.android.p1192ml.process.C19522e;
import java.util.List;

/* renamed from: com.ss.android.ml.process.a.h */
public final class C19515h implements C19522e {
    /* renamed from: a */
    public final void mo40682a(C19521d dVar) {
        float[] fArr = dVar.f53866b;
        C19507a aVar = dVar.f53869e;
        List<String> list = dVar.f53867c;
        List oPTs = aVar.getOPTs();
        List labels = aVar.getLabels();
        if (fArr[0] > ((Float) oPTs.get(0)).floatValue()) {
            list.add(labels.get(1));
        } else {
            list.add(labels.get(0));
        }
    }
}
