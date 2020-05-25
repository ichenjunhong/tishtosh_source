package com.facebook.p982j.p984b;

import android.graphics.Matrix;
import android.util.SparseArray;
import com.facebook.p982j.p986c.C14437a;
import com.facebook.p982j.p986c.C14439c;
import com.facebook.p982j.p986c.C14441e;
import java.util.List;

/* renamed from: com.facebook.j.b.k */
public final class C14430k {

    /* renamed from: a */
    public final int f37473a;

    /* renamed from: b */
    public final int f37474b;

    /* renamed from: c */
    public final List<C14418f> f37475c;

    /* renamed from: d */
    public final List<C14413d> f37476d;

    /* renamed from: e */
    public final float[] f37477e;

    /* renamed from: f */
    public final int f37478f;

    /* renamed from: com.facebook.j.b.k$a */
    public static class C14432a {

        /* renamed from: a */
        public int f37479a;

        /* renamed from: b */
        public int f37480b;

        /* renamed from: c */
        public List<C14418f> f37481c;

        /* renamed from: d */
        public List<C14413d> f37482d;

        /* renamed from: e */
        public float[] f37483e;

        /* renamed from: f */
        public int f37484f;
    }

    /* renamed from: a */
    public final void mo26590a(SparseArray<Matrix> sparseArray, float f) {
        int size = this.f37476d.size();
        for (int i = 0; i < size; i++) {
            C14413d dVar = (C14413d) this.f37476d.get(i);
            Matrix matrix = (Matrix) sparseArray.get(dVar.f37417a);
            matrix.reset();
            if (dVar.mo26586a() != null) {
                dVar.mo26586a().mo26580a(matrix);
            }
            int size2 = dVar.f37419c.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C14406b) dVar.f37419c.get(i2)).f37406f.mo26579a(f, matrix);
            }
            if (dVar.f37418b > 0) {
                matrix.postConcat((Matrix) sparseArray.get(dVar.f37418b));
            }
        }
    }

    private C14430k(int i, int i2, List<C14418f> list, List<C14413d> list2, float[] fArr, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        Integer valueOf = Integer.valueOf(i);
        boolean z4 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f37473a = ((Integer) C14439c.m29543a(valueOf, z, "frame_rate")).intValue();
        Integer valueOf2 = Integer.valueOf(i2);
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f37474b = ((Integer) C14439c.m29543a(valueOf2, z2, "animation_frame_count")).intValue();
        List a = C14441e.m29546a(list);
        if (list.size() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f37475c = (List) C14439c.m29543a(a, z3, "features");
        List a2 = C14437a.m29541a(list2);
        this.f37476d = (List) C14439c.m29543a(C14441e.m29546a(a2), C14439c.m29544a(a2), "animation_groups");
        if (fArr.length == 2 && fArr[0] > 0.0f && fArr[1] > 0.0f) {
            z4 = true;
        }
        this.f37477e = (float[]) C14439c.m29543a(fArr, z4, "canvas_size");
        this.f37478f = i3;
    }
}
