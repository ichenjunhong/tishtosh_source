package com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b;

import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextContentCallback;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.b.n */
final /* synthetic */ class C45035n implements OnARTextContentCallback {

    /* renamed from: a */
    private final C45017b f114072a;

    C45035n(C45017b bVar) {
        this.f114072a = bVar;
    }

    public final void onResult(String[] strArr) {
        C45017b bVar = this.f114072a;
        if (strArr == null || strArr.length <= 0) {
            bVar.f113998P = null;
            return;
        }
        bVar.f113998P = new ArrayList();
        Collections.addAll(bVar.f113998P, strArr);
    }
}
