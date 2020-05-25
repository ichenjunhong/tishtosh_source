package com.p683ss.android.ugc.aweme.tools.beauty.service.p2352a;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.a.b */
final /* synthetic */ class C46885b implements C0199s {

    /* renamed from: a */
    private final C46881a f118444a;

    C46885b(C46881a aVar) {
        this.f118444a = aVar;
    }

    public final void onChanged(Object obj) {
        C46881a aVar = this.f118444a;
        List list = (List) obj;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    if (aVar.f118436b.mo94156b().equals("record")) {
                        aVar.f118435a.mo86574c(list, 10000);
                    }
                }
            } catch (Exception e) {
                C50203g.m108359a((Throwable) e);
            }
        }
    }
}
