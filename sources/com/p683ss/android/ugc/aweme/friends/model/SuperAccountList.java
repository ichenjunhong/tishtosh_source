package com.p683ss.android.ugc.aweme.friends.model;

import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.SuperAccountList */
public class SuperAccountList extends BaseResponse {
    @C17952c(mo34828a = "log_pb")
    public LogPbBean logPb;
    @C17952c(mo34828a = "user_list")
    public List<UserWithAweme> userList;

    public List<UserWithAweme> getUserList() {
        if (this.userList == null) {
            this.userList = new ArrayList(0);
        }
        return this.userList;
    }

    public SuperAccountList clone() {
        SuperAccountList superAccountList = new SuperAccountList();
        ArrayList arrayList = new ArrayList();
        if (!C9376b.m18558a((Collection<T>) this.userList)) {
            for (UserWithAweme userWithAweme : this.userList) {
                if (userWithAweme != null) {
                    arrayList.add(userWithAweme.clone());
                }
            }
        }
        superAccountList.userList = arrayList;
        superAccountList.extra = this.extra;
        superAccountList.status_code = this.status_code;
        superAccountList.status_msg = this.status_msg;
        superAccountList.error_code = this.error_code;
        superAccountList.logPb = this.logPb;
        return superAccountList;
    }
}
