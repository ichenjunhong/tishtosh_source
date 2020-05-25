package com.p683ss.android.ugc.aweme.profile.api;

import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgResponse;
import p064c.p065a.C1680ad;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.profile.api.UsedPhoneApi */
public interface UsedPhoneApi {
    @C53084o(mo110612a = "/safe_info/user/confirm/notice/")
    @C53074e
    C1680ad<BaseResponse> confirmSafeInfoNotice(@C53072c(mo110600a = "notice_id") long j, @C53072c(mo110600a = "notice_type") String str, @C53072c(mo110600a = "notice_tag") String str2, @C53072c(mo110600a = "behavior") String str3);

    @C53075f(mo110603a = "/safe_info/user/message/notice/")
    C1680ad<SafeInfoNoticeMsgResponse> safeInfoNoticeMsg();

    @C53084o(mo110612a = "/safe_info/user/confirm/mno_mobile/")
    @C53074e
    C1680ad<BaseResponse> usedPhoneConfirm(@C53072c(mo110600a = "is_mine") boolean z);
}
