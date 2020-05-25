package com.p683ss.android.ugc.aweme.nationaltask.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.discover.model.CommerceShoppingCartDetail;
import p2666g.p2672c.C53075f;

/* renamed from: com.ss.android.ugc.aweme.nationaltask.api.CommerceShoppingCartDetailApi */
public final class CommerceShoppingCartDetailApi {

    /* renamed from: a */
    public static final CommerceShoppingCartDetailApi f96157a = new CommerceShoppingCartDetailApi();

    /* renamed from: com.ss.android.ugc.aweme.nationaltask.api.CommerceShoppingCartDetailApi$ICommerceShoppingCartDetailApi */
    public interface ICommerceShoppingCartDetailApi {
        @C53075f(mo110603a = "/aweme/v1/commerce/shopping_cart/detail/")
        C17832m<CommerceShoppingCartDetail> getCommerceShoppingCartDetail();
    }

    private CommerceShoppingCartDetailApi() {
    }
}
