package com.facebook.p982j.p984b;

import com.facebook.p982j.p984b.p985a.C14396b;
import com.facebook.p982j.p984b.p985a.C14400d;
import com.facebook.p982j.p984b.p985a.C14402e;
import com.facebook.p982j.p984b.p985a.C14404g;
import com.facebook.p982j.p986c.C14439c;
import com.facebook.p982j.p986c.C14441e;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.facebook.j.b.b */
public final class C14406b {

    /* renamed from: a */
    public static final Comparator<C14406b> f37401a = new Comparator<C14406b>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C14406b) obj).f37402b.compareTo(((C14406b) obj2).f37402b);
        }
    };

    /* renamed from: b */
    public final C14409b f37402b;

    /* renamed from: c */
    public final List<C14410c> f37403c;

    /* renamed from: d */
    public final float[][][] f37404d;

    /* renamed from: e */
    public final float[] f37405e;

    /* renamed from: f */
    public final C14402e f37406f;

    /* renamed from: com.facebook.j.b.b$a */
    public static class C14408a {

        /* renamed from: a */
        public C14409b f37407a;

        /* renamed from: b */
        public List<C14410c> f37408b;

        /* renamed from: c */
        public float[][][] f37409c;

        /* renamed from: d */
        public float[] f37410d;
    }

    /* renamed from: com.facebook.j.b.b$b */
    public enum C14409b {
        SCALE(true),
        ROTATION(true),
        POSITION(true),
        X_POSITION(true),
        Y_POSITION(true),
        ANCHOR_POINT(false),
        STROKE_WIDTH(false);
        

        /* renamed from: a */
        final boolean f37412a;

        public final boolean isMatrixBased() {
            return this.f37412a;
        }

        private C14409b(boolean z) {
            this.f37412a = z;
        }
    }

    public C14406b(C14409b bVar, List<C14410c> list, float[][][] fArr, float[] fArr2) {
        boolean z;
        boolean z2;
        boolean z3;
        if (bVar != null) {
            z = true;
        } else {
            z = false;
        }
        this.f37402b = (C14409b) C14439c.m29543a(bVar, z, "property");
        List a = C14441e.m29546a(list);
        if (list == null || list.size() <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f37403c = (List) C14439c.m29543a(a, z2, "key_values");
        this.f37404d = (float[][][]) C14439c.m29543a(fArr, C14439c.m29545a(fArr, this.f37403c.size()), "timing_curves");
        if (fArr2 == null || fArr2.length == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f37405e = (float[]) C14439c.m29543a(fArr2, z3, "anchor");
        if (this.f37402b.isMatrixBased()) {
            if (this.f37402b.isMatrixBased()) {
                this.f37406f = new C14400d(this.f37403c, this.f37404d, this.f37402b, this.f37405e);
                return;
            }
            throw new IllegalArgumentException("Cannot create a KeyFramedMatrixAnimation from a non matrix based KFAnimation.");
        } else if (this.f37402b == C14409b.STROKE_WIDTH) {
            if (this.f37402b == C14409b.STROKE_WIDTH) {
                this.f37406f = new C14404g(this.f37403c, this.f37404d);
                return;
            }
            throw new IllegalArgumentException("Cannot create a KeyFramedStrokeWidth object from a non STROKE_WIDTH animation.");
        } else if (this.f37402b == C14409b.ANCHOR_POINT) {
            float[] fArr3 = ((C14410c) this.f37403c.get(0)).f37413a;
            this.f37406f = new C14396b(fArr3[0], fArr3[1]);
        } else {
            StringBuilder sb = new StringBuilder("Unknown property type for animation post processing: ");
            sb.append(this.f37402b);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
