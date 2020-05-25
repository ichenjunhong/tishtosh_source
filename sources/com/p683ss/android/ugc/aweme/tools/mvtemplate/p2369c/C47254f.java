package com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c;

import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.p1388at.C23288a;
import com.p683ss.android.ugc.aweme.p1388at.C23290c;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import p2628d.C52847n;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.c.f */
final /* synthetic */ class C47254f implements Callable {

    /* renamed from: a */
    private final C29059c f119324a;

    C47254f(C29059c cVar) {
        this.f119324a = cVar;
    }

    public final Object call() {
        C29059c cVar = this.f119324a;
        ArrayList<String> arrayList = cVar.mo58741R().selectMediaList;
        if (!C23715d.m58202a((Collection<T>) arrayList)) {
            for (String c : arrayList) {
                C48016e.m103947c(c);
            }
        }
        ArrayList<C23290c> arrayList2 = cVar.mo58741R().newMaskFileData;
        if (!C23715d.m58202a((Collection<T>) arrayList2)) {
            for (C23290c filePath : arrayList2) {
                C48016e.m103947c(filePath.getFilePath());
            }
        }
        ArrayList<C23288a> arrayList3 = cVar.mo58741R().maskFileData;
        if (!C23715d.m58202a((Collection<T>) arrayList3)) {
            for (C23288a maskFiles : arrayList3) {
                for (C52847n component2 : maskFiles.getMaskFiles()) {
                    C48016e.m103947c((String) component2.component2());
                }
            }
        }
        C48016e.m103947c(cVar.mo58741R().videoCoverImgPath);
        C48016e.m103947c(cVar.mo58741R().contactVideoPath);
        return null;
    }
}
