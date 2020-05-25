package com.p683ss.android.ugc.aweme.comment.p1522g;

import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.comment.p1524i.C25209c;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;

/* renamed from: com.ss.android.ugc.aweme.comment.g.a */
public abstract class C25173a<Item, Response> extends C26875a<Item, Response> {

    /* renamed from: a */
    public final C25209c f66724a = new C25209c();

    /* renamed from: a */
    public abstract void mo51423a(Response response);

    public boolean sendRequest(Object... objArr) {
        this.f66724a.mo51461a();
        return super.sendRequest(objArr);
    }

    public void handleData(Response response) {
        super.handleData(response);
        if (response instanceof BaseResponse) {
            this.f66724a.mo51464a((BaseResponse) response);
        }
        mo51423a(response);
    }
}
