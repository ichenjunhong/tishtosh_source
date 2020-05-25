package com.p683ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.p683ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import p064c.p065a.C1680ad;
import p2666g.p2672c.C53070a;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterBoxApi */
public interface FilterBoxApi {
    @C53075f(mo110603a = "/effect/api/filterbox/list")
    C1680ad<C31587g> listFilterBox(@C53089t(mo110619a = "access_key") String str, @C53089t(mo110619a = "sdk_version") String str2, @C53089t(mo110619a = "app_version") String str3, @C53089t(mo110619a = "region") String str4, @C53089t(mo110619a = "panel") String str5);

    @C53084o(mo110612a = "/effect/api/filterbox/update")
    C1680ad<BaseNetResponse> updateFilterBox(@C53070a C31589i iVar);
}
