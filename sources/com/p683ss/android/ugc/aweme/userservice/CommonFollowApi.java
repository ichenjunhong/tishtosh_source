package com.p683ss.android.ugc.aweme.userservice;

import android.text.TextUtils;
import com.bytedance.retrofit2.p831b.C12694aa;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.C2201v;

/* renamed from: com.ss.android.ugc.aweme.userservice.CommonFollowApi */
public final class CommonFollowApi {

    /* renamed from: a */
    private static final FollowService f120039a = ((FollowService) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(MainServiceImpl.createIMainServicebyMonsterPlugin().getApiUrlPrefix()).create(FollowService.class));

    /* renamed from: com.ss.android.ugc.aweme.userservice.CommonFollowApi$FollowService */
    public interface FollowService {
        @C12706h(mo23876a = "/aweme/v3/f2f/follow/")
        C17832m<FollowStatus> face2FaceFollow(@C12724z(mo23894a = "user_id") String str, @C12724z(mo23894a = "sec_user_id") String str2);

        @C12706h(mo23876a = "/aweme/v1/commit/follow/user/")
        C17832m<FollowStatus> follow(@C12694aa Map<String, String> map);

        @C12706h(mo23876a = "/aweme/v1/remove/follower/")
        C2201v<BaseResponse> remove(@C12724z(mo23894a = "user_id") String str, @C12724z(mo23894a = "sec_user_id") String str2);
    }

    /* renamed from: a */
    public static C2201v<BaseResponse> m103034a(String str, String str2) {
        return f120039a.remove(str, str2);
    }

    /* renamed from: a */
    public static FollowStatus m103035a(String str, String str2, int i, int i2, int i3, String str3, int i4, String str4) throws Exception {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str2) || C32816h.m75716b().getSecIdSwitch().intValue() == 0) {
            hashMap.put("user_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("sec_user_id", str2);
        }
        hashMap.put("type", String.valueOf(i));
        hashMap.put("channel_id", String.valueOf(i3));
        hashMap.put("city", str4);
        if (i2 != -1) {
            hashMap.put("from", String.valueOf(i2));
            hashMap.put("from_pre", String.valueOf(i4));
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("item_id", str3);
        }
        FollowStatus followStatus = (FollowStatus) f120039a.follow(hashMap).get();
        followStatus.secUserId = str2;
        followStatus.userId = str;
        return followStatus;
    }
}
