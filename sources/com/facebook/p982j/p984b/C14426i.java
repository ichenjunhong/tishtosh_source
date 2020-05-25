package com.facebook.p982j.p984b;

import com.facebook.p982j.p984b.p985a.C14397c;
import com.facebook.p982j.p984b.p985a.C14397c.C14399b;
import com.facebook.p982j.p986c.C14439c;

/* renamed from: com.facebook.j.b.i */
public final class C14426i {

    /* renamed from: a */
    public final C14397c f37465a;

    /* renamed from: b */
    public final C14397c f37466b;

    /* renamed from: com.facebook.j.b.i$a */
    public static class C14427a {

        /* renamed from: a */
        public C14428j f37467a;

        /* renamed from: b */
        public C14428j f37468b;

        /* renamed from: a */
        public final C14426i mo26589a() {
            return new C14426i(this.f37467a, this.f37468b);
        }
    }

    public C14426i(C14428j jVar, C14428j jVar2) {
        boolean z;
        boolean z2 = false;
        if (jVar != null) {
            z = true;
        } else {
            z = false;
        }
        this.f37465a = C14397c.m29507a((C14428j) C14439c.m29543a(jVar, z, "color_start"), C14399b.START);
        if (jVar2 != null) {
            z2 = true;
        }
        this.f37466b = C14397c.m29507a((C14428j) C14439c.m29543a(jVar2, z2, "color_end"), C14399b.END);
    }
}
