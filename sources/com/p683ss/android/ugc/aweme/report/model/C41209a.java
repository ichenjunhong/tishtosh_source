package com.p683ss.android.ugc.aweme.report.model;

import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.report.api.ReportApi;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.report.model.a */
public final class C41209a extends C26832a {

    /* renamed from: a */
    public ReportApi f104650a = ((ReportApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(ReportApi.class));

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
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
                C41209a.this.f104650a.voteForCommunityDiscipline((String) objArr[0], ((Integer) objArr[1]).intValue()).get();
                return null;
            }
        }, 0);
        return true;
    }
}
