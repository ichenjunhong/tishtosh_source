package com.facebook.p982j.p984b.p985a;

import android.view.animation.Interpolator;
import com.facebook.p982j.p986c.C14440d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.j.b.a.a */
public final class C14395a {
    /* renamed from: a */
    public static List<Interpolator> m29502a(float[][][] fArr) {
        if (fArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (float[][] fArr2 : fArr) {
            arrayList.add(new C14440d(fArr2[0][0], fArr2[0][1], fArr2[1][0], fArr2[1][1]));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
