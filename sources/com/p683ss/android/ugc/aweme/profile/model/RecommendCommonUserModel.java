package com.p683ss.android.ugc.aweme.profile.model;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.friends.api.C32559b;
import com.p683ss.android.ugc.aweme.friends.api.RecommendApi;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37716a;
import com.p683ss.android.ugc.aweme.net.C37776h;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p001a.C0011g;

/* renamed from: com.ss.android.ugc.aweme.profile.model.RecommendCommonUserModel */
public class RecommendCommonUserModel extends C37716a<RecommendList> {
    private RecommendApi mRecommendApi = C32559b.m75337a();
    private HashSet<String> mShownUserIds = new HashSet<>();
    public int newUserCount;
    private List<String> userIdList;

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.ss.android.ugc.aweme.profile.model.RecommendCommonUserModel$Scenario */
    public @interface Scenario {
    }

    private int getScenarioFromRecommendType(int i) {
        if (i == 4) {
            return 1;
        }
        if (i != 13) {
            return i != 21 ? 0 : 3;
        }
        return 2;
    }

    public void resetShownUserIds() {
        this.mShownUserIds.clear();
        this.newUserCount = 0;
    }

    public void removeFollowedUser() {
        if (this.mData != null && !((RecommendList) this.mData).getUserList().isEmpty()) {
            List userList = ((RecommendList) this.mData).getUserList();
            int size = userList.size();
            int i = 0;
            while (i < size) {
                if (((User) userList.get(i)).getFollowStatus() != 0) {
                    userList.remove(i);
                    size--;
                    i--;
                }
                i++;
            }
            ((RecommendList) this.mData).setUserList(userList);
        }
    }

    public void setRecommendList(RecommendList recommendList) {
        this.mQueryType = 1;
        handleData(recommendList);
    }

    public int getUserImprOrder(String str) {
        if (this.userIdList != null) {
            return this.userIdList.indexOf(str);
        }
        return 0;
    }

    public void setData(List<User> list) {
        if (this.mData != null) {
            ((RecommendList) this.mData).setUserList(list);
        }
    }

    public void recommendUserDialogLoadMore(int i) {
        int i2;
        if (!this.mIsLoading) {
            this.mIsLoading = true;
            this.mQueryType = 4;
            RecommendApi recommendApi = this.mRecommendApi;
            Integer valueOf = Integer.valueOf(i);
            if (this.mData == null) {
                i2 = 0;
            } else {
                i2 = ((RecommendList) this.mData).getCursor();
            }
            recommendApi.fetchRecommendUserDialoList(valueOf, Integer.valueOf(i2), C37940g.m84832a().mo77416b()).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
        }
    }

    public void removeData(User user) {
        if (this.mData != null && !((RecommendList) this.mData).getUserList().isEmpty()) {
            List userList = ((RecommendList) this.mData).getUserList();
            userList.remove(user);
            ((RecommendList) this.mData).setUserList(userList);
        }
    }

    /* access modifiers changed from: protected */
    public void handleData(RecommendList recommendList) {
        if (recommendList != null) {
            if (recommendList.getUserList() != null) {
                for (User requestId : recommendList.getUserList()) {
                    requestId.setRequestId(recommendList.getRid());
                }
            }
            if (this.mQueryType == 1) {
                this.newUserCount = 0;
                super.handleData(recommendList);
                Iterator it = recommendList.getUserList().iterator();
                while (it.hasNext()) {
                    User user = (User) it.next();
                    if (this.mShownUserIds.contains(user.getUid())) {
                        it.remove();
                    } else {
                        this.mShownUserIds.add(user.getUid());
                    }
                }
            } else if (this.mQueryType == 4) {
                if (this.mData != null) {
                    List userList = ((RecommendList) this.mData).getUserList();
                    int size = userList.size();
                    for (User user2 : recommendList.getUserList()) {
                        if (!this.mShownUserIds.contains(user2.getUid())) {
                            userList.add(user2);
                            this.mShownUserIds.add(user2.getUid());
                        }
                    }
                    this.newUserCount = userList.size() - size;
                    this.mData = recommendList;
                    ((RecommendList) this.mData).setUserList(userList);
                } else {
                    this.mData = recommendList;
                }
            }
            if (this.userIdList == null) {
                this.userIdList = new ArrayList();
            } else {
                this.userIdList.clear();
            }
            if (recommendList.getUserList() != null) {
                for (User uid : recommendList.getUserList()) {
                    this.userIdList.add(uid.getUid());
                }
            }
            C29981aa.m70153a().mo60162a(recommendList.getRid(), recommendList.getLogPb());
        }
    }

    public void loadMore(int i, String str, int i2, int i3, int i4, int i5, String str2, String str3) {
        int i6;
        if (!this.mIsLoading) {
            this.mIsLoading = true;
            this.mQueryType = 4;
            if (this.mData == null) {
                i6 = 0;
            } else {
                i6 = ((RecommendList) this.mData).getCursor();
            }
            fetchData(i, str, i6, i2, i3, i4, null, i5, str2, str3);
        }
    }

    public void fetchData(int i, String str, int i2, int i3, int i4, int i5, String str2, int i6) {
        int i7;
        if (!this.mIsLoading) {
            if (C20854a.m53167g().isUidContactPermisioned()) {
                i7 = 1;
            } else {
                i7 = 2;
            }
            this.mIsLoading = true;
            this.mQueryType = 1;
            this.mRecommendApi.recommendList(Integer.valueOf(i), Integer.valueOf(0), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i7), C37940g.m84832a().mo77416b(), Integer.valueOf(i5), str2, i6).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
        }
    }

    public void refreshRecommendUser(int i, String str, int i2, int i3, int i4, String str2, int i5, String str3, String str4, String str5) {
        if (!this.mIsLoading) {
            this.mIsLoading = true;
            this.mQueryType = 1;
            fetchData(i, str, 0, i2, i3, i4, str2, i5, str3, str4);
        }
    }

    private void fetchData(int i, String str, int i2, int i3, int i4, int i5, String str2, int i6, String str3, String str4) {
        int i7;
        int i8 = i3;
        if (C20854a.m53167g().isUidContactPermisioned()) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.mRecommendApi.recommendList(Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(1), Integer.valueOf(i7), C37940g.m84832a().mo77416b(), str2, Integer.valueOf(i6), str3, str4).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
        } else if (i8 != 1 && i8 != 4 && i8 != 13 && i8 != 21) {
            this.mRecommendApi.recommendList(Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i7), C37940g.m84832a().mo77416b(), Integer.valueOf(i6), str3).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
        } else if (i8 == 1) {
            this.mRecommendApi.recommendListMT(Integer.valueOf(i), Integer.valueOf(i2), C37940g.m84832a().mo77416b(), str, Integer.valueOf(getScenarioFromRecommendType(i8))).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
        } else {
            this.mRecommendApi.recommendListMT(Integer.valueOf(i), Integer.valueOf(i2), C37940g.m84832a().mo77416b(), str3, Integer.valueOf(getScenarioFromRecommendType(i8))).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
        }
    }
}
