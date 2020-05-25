package com.p683ss.android.ugc.aweme.newfollow.p1999f;

import android.graphics.Bitmap;
import com.p683ss.android.ugc.aweme.newfollow.p1994a.C37837a;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37997r;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.f.f */
final /* synthetic */ class C37872f implements C0011g {

    /* renamed from: a */
    private final C37867d f96414a;

    C37872f(C37867d dVar) {
        this.f96414a = dVar;
    }

    public final Object then(C0013i iVar) {
        C37867d dVar = this.f96414a;
        if (iVar.mo26b()) {
            dVar.f96403f = (Bitmap) iVar.mo34e();
            if (!(dVar.f96402e == null || dVar.f96403f == null)) {
                C37997r rVar = dVar.f96402e;
                Bitmap bitmap = dVar.f96403f;
                if (bitmap != null && !bitmap.isRecycled() && rVar.f83135b != null && rVar.f83135b.getScrollState() == 0 && !rVar.f83135b.mo4875i()) {
                    C37837a aVar = (C37837a) rVar.f83139f;
                    if (!(aVar.f70670n == null || aVar.f96342O == null || !aVar.f70670n.contains(aVar.f96342O))) {
                        int indexOf = aVar.f70670n.indexOf(aVar.f96342O);
                        aVar.f96342O.mo77303a(bitmap);
                        aVar.notifyItemChanged(indexOf);
                    }
                }
            }
            dVar.f96404g = false;
        }
        return null;
    }
}
