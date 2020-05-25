package com.p683ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.o */
public final class C25572o implements Serializable {
    @C17952c(mo34828a = "is")

    /* renamed from: a */
    private boolean f67676a;
    @C17952c(mo34828a = "already_buy")

    /* renamed from: b */
    private boolean f67677b;

    public final boolean getAlreadyBuy() {
        return this.f67677b;
    }

    public final boolean isVirtualGoods() {
        return this.f67676a;
    }

    public final void setAlreadyBuy(boolean z) {
        this.f67677b = z;
    }

    public final void setVirtualGoods(boolean z) {
        this.f67676a = z;
    }
}
