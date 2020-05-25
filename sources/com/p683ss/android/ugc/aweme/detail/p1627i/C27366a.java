package com.p683ss.android.ugc.aweme.detail.p1627i;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.detail.api.DetailApi;
import com.p683ss.android.ugc.aweme.detail.p1625g.C27337a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.detail.i.a */
public final class C27366a extends C26832a<C27337a> {

    /* renamed from: a */
    public int f72146a;

    public C27366a(int i) {
        this.f72146a = i;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
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
                String str = "";
                if (objArr.length > 1 && objArr[1] != null) {
                    str = (String) objArr[1];
                }
                String str2 = "";
                if (objArr.length > 2 && objArr[2] != null) {
                    str2 = (String) objArr[2];
                }
                return (C27337a) DetailApi.f72065a.queryBatchAweme((String) objArr[0], str2, str).execute().f33552b;
            }
        }, 0);
        return true;
    }

    public final /* synthetic */ void handleData(Object obj) {
        C27337a aVar = (C27337a) obj;
        if (aVar == null || aVar.f72085a == null) {
            C32458a.m75141a(6, "BatchDetailModel", "data is null or items null!");
            return;
        }
        super.handleData(aVar);
        int size = aVar.f72085a.size();
        for (int i = 0; i < size; i++) {
            Aweme updateAweme = C23324d.m57378a().updateAweme((Aweme) aVar.f72085a.get(i));
            String str = aVar.f72086b;
            if (TextUtils.isEmpty(str) && aVar.f72087c != null) {
                str = aVar.f72087c.getImprId();
            }
            IRequestIdService a = C23325e.m57379a();
            StringBuilder sb = new StringBuilder();
            sb.append(updateAweme.getAid());
            sb.append(this.f72146a);
            a.setRequestIdAndIndex(sb.toString(), str, i);
            aVar.f72085a.set(i, updateAweme);
        }
    }
}
