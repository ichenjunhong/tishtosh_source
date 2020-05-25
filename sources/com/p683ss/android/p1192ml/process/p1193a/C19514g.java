package com.p683ss.android.p1192ml.process.p1193a;

import com.p683ss.android.p1192ml.process.C19520c;
import com.p683ss.android.p1192ml.process.C19521d;
import com.p683ss.android.p1192ml.process.C19522e;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ml.process.a.g */
public final class C19514g implements C19522e {
    /* renamed from: a */
    public final void mo40682a(C19521d dVar) {
        float f;
        HashMap<String, Object> hashMap = dVar.f53865a;
        C19520c cVar = dVar.f53868d;
        List labels = cVar.getLabels();
        List args = cVar.getArgs();
        List oPTs = cVar.getOPTs();
        String str = (String) args.get(0);
        int indexOf = labels.indexOf(hashMap.get(str));
        if (indexOf < 0) {
            indexOf = (int) ((Float) oPTs.get(0)).floatValue();
        }
        for (int i = 0; i < labels.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("#");
            sb.append(i);
            String sb2 = sb.toString();
            if (indexOf == i) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            hashMap.put(sb2, Float.valueOf(f));
        }
    }
}
