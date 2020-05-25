package com.p683ss.android.ugc.aweme.account.login.forgetpsw.p1285a;

import com.google.gson.C17971f;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import com.p683ss.android.ugc.aweme.account.login.forgetpsw.model.FindPswByEmailResponse;
import com.p683ss.android.ugc.aweme.account.util.C22266h;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.account.login.forgetpsw.a.b */
public final class C21142b extends C26832a<FindPswByEmailResponse> {
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        boolean sendRequest = super.sendRequest(objArr);
        if (sendRequest) {
            final String valueOf = String.valueOf(objArr[0]);
            C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
                public final Object call() throws Exception {
                    String str;
                    String str2 = valueOf;
                    ArrayList arrayList = new ArrayList();
                    if (C22282t.m55142a()) {
                        arrayList.add(new C19180e("mix_mode", "1"));
                        arrayList.add(new C19180e("email", C22266h.m55115a(str2)));
                        arrayList.add(new C19180e("type", C22266h.m55115a("4")));
                        arrayList.add(new C19180e("next", C21141a.f57443c));
                        str = NetworkUtils.executePost(Integer.MAX_VALUE, C21141a.f57442b, (List<C19180e>) arrayList);
                    } else {
                        arrayList.add(new C19180e("email", str2));
                        str = NetworkUtils.executePost(Integer.MAX_VALUE, C21141a.f57441a, (List<C19180e>) arrayList);
                    }
                    return (FindPswByEmailResponse) new C17971f().mo34884a(str, FindPswByEmailResponse.class);
                }
            }, 0);
        }
        return sendRequest;
    }
}
