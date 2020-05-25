package com.p683ss.android.ugc.aweme.detail.api;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43237b;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.detail.api.CheckDuetReactPermissionApi */
public final class CheckDuetReactPermissionApi {

    /* renamed from: a */
    public static final C27316a f72064a = new C27316a(null);

    /* renamed from: com.ss.android.ugc.aweme.detail.api.CheckDuetReactPermissionApi$CheckDuetReactPermissionRequest */
    public interface CheckDuetReactPermissionRequest {
        @C12706h(mo23876a = "/aweme/v1/permission/check/")
        C12690b<C43237b> checkDuetReactPermission(@C12724z(mo23894a = "aweme_id") String str, @C12724z(mo23894a = "check_type") int i) throws Exception;
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.api.CheckDuetReactPermissionApi$a */
    public static final class C27316a {
        private C27316a() {
        }

        public /* synthetic */ C27316a(C52707g gVar) {
            this();
        }
    }
}
