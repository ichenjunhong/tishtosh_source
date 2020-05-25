package com.facebook.p982j.p984b.p985a;

import com.facebook.p982j.C14369a;
import com.facebook.p982j.p984b.C14394a;
import com.facebook.p982j.p984b.C14423h;
import com.facebook.p982j.p984b.C14423h.C14425b;
import com.facebook.p982j.p986c.C14442f;
import java.util.List;

/* renamed from: com.facebook.j.b.a.f */
public final class C14403f extends C14402e<C14423h, C14369a> {
    public C14403f(List<C14423h> list, float[][][] fArr) {
        super(list, fArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo26581a(C14394a aVar, C14394a aVar2, float f, Object obj) {
        C14423h hVar = (C14423h) aVar;
        C14423h hVar2 = (C14423h) aVar2;
        C14369a aVar3 = (C14369a) obj;
        int i = 0;
        if (hVar2 == null || f == 0.0f) {
            C14425b bVar = hVar.f37460a;
            int size = bVar.f37464a.size();
            while (i < size) {
                ((C14442f) bVar.f37464a.get(i)).mo26608a(aVar3);
                i++;
            }
            return;
        }
        C14425b bVar2 = hVar.f37460a;
        C14425b bVar3 = hVar2.f37460a;
        int size2 = bVar2.f37464a.size();
        while (i < size2) {
            ((C14442f) bVar2.f37464a.get(i)).mo26610a((C14442f) bVar3.f37464a.get(i), f, aVar3);
            i++;
        }
    }
}
