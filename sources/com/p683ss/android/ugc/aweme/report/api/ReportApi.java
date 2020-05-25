package com.p683ss.android.ugc.aweme.report.api;

import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.report.model.Report;

/* renamed from: com.ss.android.ugc.aweme.report.api.ReportApi */
public interface ReportApi {
    @C12706h(mo23876a = "/aweme/v2/community/discipline/vote/")
    C17832m<Report> voteForCommunityDiscipline(@C12724z(mo23894a = "item_id") String str, @C12724z(mo23894a = "vote_type") int i);
}
