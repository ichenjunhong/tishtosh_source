package com.facebook.p982j.p984b;

import com.facebook.p982j.p986c.C14439c;

/* renamed from: com.facebook.j.b.c */
public final class C14410c implements C14394a {

    /* renamed from: a */
    public final float[] f37413a;

    /* renamed from: b */
    private final int f37414b;

    /* renamed from: com.facebook.j.b.c$a */
    public static class C14412a {

        /* renamed from: a */
        public int f37415a;

        /* renamed from: b */
        public float[] f37416b;
    }

    /* renamed from: a */
    public final int mo26578a() {
        return this.f37414b;
    }

    private C14410c(int i, float[] fArr) {
        boolean z;
        this.f37414b = i;
        if (fArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f37413a = (float[]) C14439c.m29543a(fArr, z, "data");
    }
}
