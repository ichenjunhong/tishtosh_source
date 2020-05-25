package com.p683ss.android.ugc.aweme.forward.api;

import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.p683ss.android.ugc.aweme.forward.model.UserDynamicList;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.forward.api.ForwardApi */
public final class ForwardApi {

    /* renamed from: a */
    public static final RetrofitApi f84275a = ((RetrofitApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(RetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.forward.api.ForwardApi$RetrofitApi */
    public interface RetrofitApi {
        @C53084o(mo110612a = "/aweme/v1/create/forward/")
        @C53074e
        C0013i<ForwardDetail> createForward(@C53072c(mo110600a = "forward_content") String str, @C53072c(mo110600a = "item_id") String str2, @C53072c(mo110600a = "forward_type") int i, @C53072c(mo110600a = "forward_id") String str3, @C53072c(mo110600a = "reply_id") String str4, @C53072c(mo110600a = "text_extra") String str5, @C53072c(mo110600a = "is_self_see") int i2, @C53072c(mo110600a = "reply_to_reply_id") String str6, @C53072c(mo110600a = "sticker_id") String str7, @C53072c(mo110600a = "sticker_uri") String str8, @C53072c(mo110600a = "sticker_source") int i3, @C53072c(mo110600a = "sticker_width") int i4, @C53072c(mo110600a = "sticker_height") int i5, @C53072c(mo110600a = "channel_id") int i6, @C53072c(mo110600a = "city") String str9);

        @C53084o(mo110612a = "/aweme/v1/forward/delete/")
        @C53074e
        C0013i<BaseResponse> deleteForward(@C53072c(mo110600a = "forward_id") String str);

        @C53075f(mo110603a = "/aweme/v1/forward/detail/")
        C0013i<ForwardDetail> getForwardDetail(@C53089t(mo110619a = "forward_id") String str);

        @C53075f(mo110603a = "/aweme/v1/forward/list/")
        C0013i<UserDynamicList> getUserForwardList(@C53089t(mo110619a = "user_id") String str, @C53089t(mo110619a = "sec_user_id") String str2, @C53089t(mo110619a = "max_cursor") long j, @C53089t(mo110619a = "min_cursor") long j2, @C53089t(mo110619a = "count") int i);
    }

    /* renamed from: a */
    public static C0013i<UserDynamicList> m74733a(String str, String str2, long j, long j2, int i) {
        return f84275a.getUserForwardList(str, str2, j, j2, i);
    }
}
