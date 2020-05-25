package com.p683ss.android.ugc.aweme.location;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12685b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.location.q */
public final class C36280q {

    /* renamed from: a */
    public static final C36280q f92856a = new C36280q();

    /* renamed from: com.ss.android.ugc.aweme.location.q$a */
    public static final class C36281a implements C36261f {
        C36281a() {
        }

        /* renamed from: a */
        public final String mo75082a(String str, String str2, Map<String, String> map, Map<String, String> map2, List<C12685b> list, boolean z) {
            C12799u uVar;
            String str3 = null;
            if (str == null || str2 == null) {
                return null;
            }
            try {
                C12690b doPost = ((LocationLocateAPI) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(str).create(LocationLocateAPI.class)).doPost(-1, str2, map, map2, list, null, true);
                if (doPost != null) {
                    uVar = doPost.execute();
                } else {
                    uVar = null;
                }
                if (uVar != null) {
                    str3 = (String) uVar.f33552b;
                }
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
            }
            return str3;
        }
    }

    private C36280q() {
    }
}
