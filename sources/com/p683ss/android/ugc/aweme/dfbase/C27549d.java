package com.p683ss.android.ugc.aweme.dfbase;

import com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.dfbase.d */
final /* synthetic */ class C27549d implements Callable {

    /* renamed from: a */
    private final C27536b f72434a;

    C27549d(C27536b bVar) {
        this.f72434a = bVar;
    }

    public final Object call() {
        C27536b bVar = this.f72434a;
        C27538a aVar = (C27538a) bVar.f72391e.poll();
        if (aVar != null) {
            bVar.mo55979d(aVar);
        }
        return null;
    }
}
