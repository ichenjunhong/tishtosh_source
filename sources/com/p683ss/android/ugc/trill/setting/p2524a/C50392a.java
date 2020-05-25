package com.p683ss.android.ugc.trill.setting.p2524a;

import com.p683ss.android.http.p1169a.p1172b.C19180e;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.net.C37745b;
import com.p683ss.android.ugc.aweme.net.C37790j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.trill.setting.a.a */
public final class C50392a {

    /* renamed from: a */
    private static final String f126356a;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f61282b);
        sb.append("/aweme/v1/notice/shield/");
        f126356a = sb.toString();
    }

    /* renamed from: a */
    public static C37745b<String> m108684a(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C19180e("shield_type", String.valueOf(i)));
        arrayList.add(new C19180e("is_shield", String.valueOf(i2)));
        return new C37745b<>(f126356a, C37790j.POST, (List<C19180e>) arrayList, String.class);
    }
}
