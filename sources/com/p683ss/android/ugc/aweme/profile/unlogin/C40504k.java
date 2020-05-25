package com.p683ss.android.ugc.aweme.profile.unlogin;

import com.bytedance.jedi.p725a.p740j.C11698b;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import java.util.List;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.unlogin.k */
public final class C40504k extends C11698b {

    /* renamed from: a */
    public static UnloginProfileApi f103376a;

    /* renamed from: b */
    public static final C40504k f103377b = new C40504k();

    private C40504k() {
    }

    static {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(UnloginProfileApi.class);
        C52711k.m112236a(create, "ServiceManager.get().get…inProfileApi::class.java)");
        f103376a = (UnloginProfileApi) create;
    }

    /* renamed from: a */
    public static C0013i<C40484b> m89918a(List<C40514n> list, int i) {
        C52711k.m112240b(list, "likeList");
        UnloginProfileApi unloginProfileApi = f103376a;
        String a = C47760cd.m103385a(list);
        C52711k.m112236a((Object) a, "GsonUtil.toJson(likeList)");
        return unloginProfileApi.syncUnloginDigg(a, i, 2);
    }

    /* renamed from: a */
    public static C0013i<BaseResponse> m89917a(String str, int i, boolean z) {
        C52711k.m112240b(str, "awemeId");
        return f103376a.unloginDigg(str, z ? 1 : 0, i);
    }
}
