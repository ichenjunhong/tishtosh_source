package com.p683ss.android.ugc.aweme.comment.p1522g;

import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.comment.p1524i.C25209c;
import com.p683ss.android.ugc.aweme.common.C26832a;
import java.util.Arrays;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.g.b */
public abstract class C25174b<T> extends C26832a<T> {

    /* renamed from: a */
    public final C25209c f66725a = new C25209c();

    public void handleData(T t) {
        super.handleData(t);
        if (t instanceof BaseResponse) {
            this.f66725a.mo51464a((BaseResponse) t);
        }
    }

    public boolean sendRequest(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        this.f66725a.mo51461a();
        if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        return true;
    }
}
