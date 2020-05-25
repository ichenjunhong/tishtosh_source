package com.p683ss.android.ugc.aweme.sdk.iap.model.response;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.sdk.bean.C41336a;
import com.p683ss.android.ugc.aweme.sdk.bean.DiamondStruct;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.model.response.a */
public final class C41374a extends BaseResponse {
    @C17952c(mo34828a = "my_wallet")

    /* renamed from: a */
    public C41336a f104899a;
    @C17952c(mo34828a = "diamonds")

    /* renamed from: b */
    public List<DiamondStruct> f104900b = new ArrayList();

    public final String toString() {
        StringBuilder sb = new StringBuilder("MyWalletResponse{myWallet=");
        sb.append(this.f104899a);
        sb.append(", diamonds=");
        sb.append(this.f104900b);
        sb.append('}');
        return sb.toString();
    }
}
