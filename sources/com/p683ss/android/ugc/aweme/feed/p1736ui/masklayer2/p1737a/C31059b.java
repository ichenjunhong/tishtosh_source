package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30338g;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31051a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31080f;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.b */
public final class C31059b extends C31068i implements C31066g {

    /* renamed from: a */
    public final C31051a f81315a;

    /* renamed from: a */
    public final void mo63838a(View view) {
        C52711k.m112240b(view, "v");
    }

    /* renamed from: a */
    public final void mo63845a(Exception exc) {
        C52711k.m112240b(exc, "e");
    }

    public C31059b(C31051a aVar) {
        C52711k.m112240b(aVar, "actionsManager");
        super(aVar);
        this.f81315a = aVar;
    }

    /* renamed from: a */
    public final void mo63846a(String str) {
        Context context;
        C52711k.m112240b(str, "reasonId");
        C31080f fVar = this.f81315a.f81297a;
        if (fVar != null) {
            context = fVar.getContext();
        } else {
            context = null;
        }
        C10691a.m21548c((Context) C23729p.m58248a(context), (int) R.string.gdh).mo19066a();
        C47718bf.m103288a(new C30338g(this.f81315a.f81298b));
    }
}
