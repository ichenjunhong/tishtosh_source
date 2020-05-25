package com.facebook.p982j.p984b;

import com.facebook.p982j.p986c.C14439c;
import com.facebook.p982j.p986c.C14441e;
import java.util.List;

/* renamed from: com.facebook.j.b.j */
public final class C14428j {

    /* renamed from: a */
    public final List<C14415e> f37469a;

    /* renamed from: b */
    public final float[][][] f37470b;

    /* renamed from: com.facebook.j.b.j$a */
    public static class C14429a {

        /* renamed from: a */
        public List<C14415e> f37471a;

        /* renamed from: b */
        public float[][][] f37472b;
    }

    public C14428j(List<C14415e> list, float[][][] fArr) {
        this.f37469a = C14441e.m29546a(list);
        this.f37470b = (float[][][]) C14439c.m29543a(fArr, C14439c.m29545a(fArr, this.f37469a.size()), "timing_curves");
    }
}
