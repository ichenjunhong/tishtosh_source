package com.p683ss.android.ugc.aweme.friends.model;

import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.repo.C31907e;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.RecommendList */
public class RecommendList extends BaseResponse implements Serializable {
    @C17952c(mo34828a = "cursor")
    int cursor;
    @C17952c(mo34828a = "has_more")
    boolean hasMore;
    @C17952c(mo34828a = "log_pb")
    LogPbBean logPb;
    @C17952c(mo34828a = "new_user_count")
    int newUserCount;
    @C17952c(mo34828a = "user_extra_list")
    List<C31907e> recommendFollowList;
    @C17952c(mo34828a = "rid")
    private String rid;
    @C17952c(mo34828a = "user_list")
    List<User> userList;

    public int getCursor() {
        return this.cursor;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public int getNewUserCount() {
        return this.newUserCount;
    }

    public List<C31907e> getRecommendFollowList() {
        return this.recommendFollowList;
    }

    public String getRid() {
        return this.rid;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public List<User> getUserList() {
        if (this.userList == null) {
            this.userList = new ArrayList(0);
        }
        return this.userList;
    }

    public RecommendList clone() {
        RecommendList recommendList = new RecommendList();
        ArrayList arrayList = new ArrayList();
        if (!C9376b.m18558a((Collection<T>) this.userList)) {
            for (User user : this.userList) {
                if (user != null) {
                    arrayList.add(user.clone());
                }
            }
        }
        recommendList.userList = arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (!C9376b.m18558a((Collection<T>) this.recommendFollowList)) {
            for (C31907e eVar : this.recommendFollowList) {
                if (eVar != null) {
                    arrayList2.add(eVar.clone());
                }
            }
        }
        recommendList.recommendFollowList = arrayList2;
        recommendList.rid = this.rid;
        recommendList.cursor = this.cursor;
        recommendList.hasMore = this.hasMore;
        recommendList.newUserCount = this.newUserCount;
        recommendList.extra = this.extra;
        recommendList.status_code = this.status_code;
        recommendList.status_msg = this.status_msg;
        recommendList.error_code = this.error_code;
        recommendList.logPb = this.logPb;
        return recommendList;
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setRecommendFollowList(List<C31907e> list) {
        this.recommendFollowList = list;
    }

    public void setRid(String str) {
        this.rid = str;
    }

    public void setUserList(List<User> list) {
        this.userList = list;
    }
}
