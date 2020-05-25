package com.p683ss.android.ugc.aweme.p1807im.sdk.model;

import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.h */
public class C34551h extends BaseResponse {
    @C17952c(mo34828a = "data")

    /* renamed from: a */
    public List<C34552i> f89076a;

    /* renamed from: a */
    public final C34546c mo72619a() {
        if (!C9376b.m18558a((Collection<T>) this.f89076a)) {
            for (C34552i iVar : this.f89076a) {
                if (iVar.f89077a == C34545b.f89054a) {
                    return iVar.f89078b;
                }
            }
        }
        return null;
    }
}
