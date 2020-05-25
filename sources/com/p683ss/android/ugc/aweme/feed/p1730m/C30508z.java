package com.p683ss.android.ugc.aweme.feed.p1730m;

import android.support.p030v4.p038f.C0794k;
import com.p683ss.android.ugc.aweme.app.p1373d.C23064c;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.feed.api.FeedActionApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.m.z */
public final class C30508z extends C26832a<C0794k<String, Integer>> {

    /* renamed from: a */
    public int f79722a;

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || (objArr.length != 3 && objArr.length != 4)) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                if (objArr.length > 3) {
                    C30508z.this.f79722a = ((Integer) objArr[2]).intValue();
                    String str = (String) objArr[0];
                    String str2 = (String) objArr[1];
                    int intValue = ((Integer) objArr[2]).intValue();
                    FeedActionApi.f78670a.diggItem(str, str2, intValue, C23064c.m56602a((String) objArr[3])).get();
                    return C0794k.m2265a(str, Integer.valueOf(intValue));
                }
                C30508z.this.f79722a = ((Integer) objArr[1]).intValue();
                String str3 = (String) objArr[0];
                int intValue2 = ((Integer) objArr[1]).intValue();
                FeedActionApi.f78670a.diggItem(str3, intValue2, C23064c.m56602a((String) objArr[2])).get();
                return C0794k.m2265a(str3, Integer.valueOf(intValue2));
            }
        }, 0);
        return true;
    }
}
