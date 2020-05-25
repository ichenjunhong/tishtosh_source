package com.p683ss.android.ugc.aweme.account.login;

import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.main.service.C36699t;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.login.af */
public final class C21060af {
    /* renamed from: a */
    public static C21053aa[] m53525a() {
        List<String> a = ((C36699t) C23826bi.m58450a(C36699t.class)).mo47864a();
        C21053aa[] aaVarArr = new C21053aa[a.size()];
        int i = 0;
        for (String valueOf : a) {
            int i2 = i + 1;
            aaVarArr[i] = C21053aa.valueOf(valueOf);
            i = i2;
        }
        return aaVarArr;
    }
}
