package com.p683ss.android.ugc.aweme.music.p1977e;

import com.p683ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.e.e */
final /* synthetic */ class C37380e implements IGetInfoCallback {

    /* renamed from: a */
    private final IGetInfoCallback f95371a;

    /* renamed from: b */
    private final List f95372b;

    C37380e(IGetInfoCallback iGetInfoCallback, List list) {
        this.f95371a = iGetInfoCallback;
        this.f95372b = list;
    }

    public final void finish(Object obj) {
        IGetInfoCallback iGetInfoCallback = this.f95371a;
        List list = this.f95372b;
        iGetInfoCallback.finish((List) obj);
    }
}
