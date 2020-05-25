package com.p683ss.android.ugc.aweme.friends.model;

import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.friends.api.SummonFriendApi;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.SummonFriendRecentModel */
public class SummonFriendRecentModel extends C26832a<List<SummonFriendItem>> {
    FollowUserListModel followUserListModel;
    private long maxTime;
    RecentFriendModel recentFriendModel;

    public boolean checkParams(Object... objArr) {
        return true;
    }

    public boolean isHasMore() {
        if (this.followUserListModel != null) {
            return this.followUserListModel.hasMore;
        }
        return false;
    }

    public List<SummonFriendItem> loadMore() {
        int i;
        try {
            if (!C20902b.m53242a().isLogin()) {
                return null;
            }
            if (C20854a.m53167g().isUidContactPermisioned()) {
                i = 1;
            } else {
                i = 2;
            }
            this.followUserListModel = SummonFriendApi.m75332a(10, this.maxTime, 0, C20854a.m53167g().getCurUserId(), C20854a.m53167g().getCurSecUserId(), i, C47945d.m103733b());
            if (this.followUserListModel != null) {
                addItem(this.followUserListModel.users, AwemeApplication.m56199a().getResources().getString(R.string.due), false, 3);
                setCursor(this.followUserListModel);
                return (List) this.mData;
            }
            return null;
        } catch (Exception unused) {
        }
    }

    public List<SummonFriendItem> refreshData() {
        int i;
        try {
            if (this.mData == null) {
                this.mData = new ArrayList();
            }
            ((List) this.mData).clear();
            this.recentFriendModel = SummonFriendApi.m75333a();
            if (!(this.recentFriendModel == null || this.recentFriendModel.users == null)) {
                addItem(this.recentFriendModel.users, AwemeApplication.m56199a().getResources().getString(R.string.duf), true, 4);
            }
            if (C20854a.m53167g().isLogin()) {
                if (C20854a.m53167g().isUidContactPermisioned()) {
                    i = 1;
                } else {
                    i = 2;
                }
                this.followUserListModel = SummonFriendApi.m75332a(10, System.currentTimeMillis() / 1000, 0, C20854a.m53167g().getCurUserId(), C20854a.m53167g().getCurSecUserId(), i, C47945d.m103733b());
                if (this.followUserListModel != null) {
                    setCursor(this.followUserListModel);
                    addItem(this.followUserListModel.users, AwemeApplication.m56199a().getResources().getString(R.string.due), true, 3);
                }
            }
            return (List) this.mData;
        } catch (Exception unused) {
            return null;
        }
    }

    private void setCursor(FollowUserListModel followUserListModel2) {
        this.maxTime = followUserListModel2.maxTime;
    }

    private void addSummonItem(List<User> list, int i) {
        if (this.mData != null) {
            for (User user : list) {
                SummonFriendItem summonFriendItem = new SummonFriendItem();
                summonFriendItem.mUser = user;
                summonFriendItem.type = i;
                ((List) this.mData).add(summonFriendItem);
            }
        }
    }

    private void addItem(List<User> list, String str, boolean z, int i) {
        if (list != null) {
            if (list.size() > 0 && z) {
                SummonFriendItem summonFriendItem = new SummonFriendItem();
                summonFriendItem.type = 2;
                summonFriendItem.label = str;
                ((List) this.mData).add(summonFriendItem);
            }
            addSummonItem(list, i);
        }
    }
}
