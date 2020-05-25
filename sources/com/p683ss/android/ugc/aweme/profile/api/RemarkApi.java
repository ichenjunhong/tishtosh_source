package com.p683ss.android.ugc.aweme.profile.api;

import com.p683ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse;
import p001a.C0013i;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.profile.api.RemarkApi */
public interface RemarkApi {
    @C53084o(mo110612a = "/aweme/v1/user/remark/name/")
    @C53074e
    C0013i<CommitRemarkNameResponse> commitRemarkName(@C53072c(mo110600a = "remark_name") String str, @C53072c(mo110600a = "user_id") String str2, @C53072c(mo110600a = "sec_user_id") String str3);

    @C53084o(mo110612a = "/aweme/v1/user/contact/book/remark/name/")
    @C53074e
    C0013i<CommitRemarkNameResponse> getContackBookRemarkName(@C53072c(mo110600a = "user_id") String str, @C53072c(mo110600a = "sec_user_id") String str2);
}
