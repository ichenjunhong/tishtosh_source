package com.facebook.p982j.p984b;

import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import com.facebook.p982j.p984b.C14406b.C14409b;
import com.facebook.p982j.p984b.p985a.C14396b;
import com.facebook.p982j.p984b.p985a.C14403f;
import com.facebook.p982j.p984b.p985a.C14404g.C14405a;
import com.facebook.p982j.p986c.C14438b;
import com.facebook.p982j.p986c.C14439c;
import com.facebook.p982j.p986c.C14441e;
import java.util.List;

/* renamed from: com.facebook.j.b.f */
public final class C14418f {

    /* renamed from: a */
    public final String f37428a;

    /* renamed from: b */
    public final int f37429b;

    /* renamed from: c */
    public final int f37430c;

    /* renamed from: d */
    public final float f37431d;

    /* renamed from: e */
    public final float f37432e;

    /* renamed from: f */
    public final List<C14423h> f37433f;

    /* renamed from: g */
    public final float[][][] f37434g;

    /* renamed from: h */
    public final int f37435h;

    /* renamed from: i */
    public final Cap f37436i;

    /* renamed from: j */
    final C14406b f37437j;

    /* renamed from: k */
    final List<C14406b> f37438k;

    /* renamed from: l */
    final C14406b f37439l;

    /* renamed from: m */
    public final C14420g f37440m;

    /* renamed from: n */
    public final String f37441n;

    /* renamed from: o */
    public final C14403f f37442o;

    /* renamed from: p */
    private final float f37443p;

    /* renamed from: com.facebook.j.b.f$a */
    public static class C14419a {

        /* renamed from: a */
        public String f37444a;

        /* renamed from: b */
        public int f37445b;

        /* renamed from: c */
        public int f37446c;

        /* renamed from: d */
        public float f37447d;

        /* renamed from: e */
        public float f37448e;

        /* renamed from: f */
        public float f37449f = Float.MAX_VALUE;

        /* renamed from: g */
        public List<C14423h> f37450g;

        /* renamed from: h */
        public float[][][] f37451h;

        /* renamed from: i */
        public int f37452i;

        /* renamed from: j */
        public Cap f37453j = Cap.ROUND;

        /* renamed from: k */
        public List<C14406b> f37454k;

        /* renamed from: l */
        public float[] f37455l;

        /* renamed from: m */
        public C14420g f37456m;

        /* renamed from: n */
        public String f37457n;
    }

    /* renamed from: a */
    public final void mo26588a(C14405a aVar, float f) {
        if (aVar != null) {
            aVar.f37400a = this.f37443p;
            if (this.f37437j != null) {
                this.f37437j.f37406f.mo26579a(f, aVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo26587a(Matrix matrix, float f) {
        if (matrix != null) {
            matrix.reset();
            if (this.f37438k != null) {
                if (this.f37439l != null) {
                    ((C14396b) this.f37439l.f37406f).mo26580a(matrix);
                }
                int size = this.f37438k.size();
                for (int i = 0; i < size; i++) {
                    ((C14406b) this.f37438k.get(i)).f37406f.mo26579a(f, matrix);
                }
            }
        }
    }

    public C14418f(String str, int i, int i2, float f, float f2, float f3, List<C14423h> list, float[][][] fArr, int i3, Cap cap, List<C14406b> list2, float[] fArr2, C14420g gVar, String str2) {
        C14403f fVar;
        this.f37428a = str;
        this.f37429b = i;
        this.f37430c = i2;
        this.f37443p = f;
        this.f37431d = f2;
        this.f37432e = f3;
        this.f37433f = C14441e.m29546a(list);
        this.f37434g = (float[][][]) C14439c.m29543a(fArr, C14439c.m29545a(fArr, this.f37433f.size()), "timing_curves");
        this.f37435h = i3;
        this.f37436i = cap;
        this.f37437j = C14438b.m29542a(list2, C14409b.STROKE_WIDTH);
        this.f37439l = C14438b.m29542a(list2, C14409b.ANCHOR_POINT);
        C14441e.m29547a(list2, C14406b.f37401a);
        this.f37438k = C14441e.m29546a(list2);
        this.f37440m = gVar;
        this.f37441n = str2;
        if (this.f37433f.isEmpty()) {
            fVar = null;
        } else {
            fVar = new C14403f(this.f37433f, this.f37434g);
        }
        this.f37442o = fVar;
    }
}
