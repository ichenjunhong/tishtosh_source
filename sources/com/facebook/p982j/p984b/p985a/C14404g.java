package com.facebook.p982j.p984b.p985a;

import com.facebook.p982j.p984b.C14394a;
import com.facebook.p982j.p984b.C14410c;
import java.util.List;

/* renamed from: com.facebook.j.b.a.g */
public final class C14404g extends C14402e<C14410c, C14405a> {

    /* renamed from: com.facebook.j.b.a.g$a */
    public static class C14405a {

        /* renamed from: a */
        public float f37400a;

        /* renamed from: a */
        public final float mo26582a() {
            return Math.abs(this.f37400a);
        }

        /* renamed from: a */
        public final void mo26583a(float f) {
            this.f37400a *= f;
        }
    }

    private C14404g() {
    }

    public C14404g(List<C14410c> list, float[][][] fArr) {
        super(list, fArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo26581a(C14394a aVar, C14394a aVar2, float f, Object obj) {
        C14410c cVar = (C14410c) aVar;
        C14410c cVar2 = (C14410c) aVar2;
        C14405a aVar3 = (C14405a) obj;
        if (cVar2 == null) {
            aVar3.f37400a = cVar.f37413a[0];
        } else {
            aVar3.f37400a = m29510a(cVar.f37413a[0], cVar2.f37413a[0], f);
        }
    }
}
