package com.p683ss.android.ugc.aweme.friends.model;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.friends.api.C32558a;
import com.p683ss.android.ugc.aweme.friends.api.FriendApi;
import com.p683ss.android.ugc.aweme.net.C37776h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.friends.model.InviteMoreUnregisteredFriendsModel */
public class InviteMoreUnregisteredFriendsModel extends C26875a<UnRegisteredUser, FriendList<User>> {
    private final FriendApi mFriendApi = C32558a.m75336a();

    public List<UnRegisteredUser> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FriendList) this.mData).unregisteredUser;
    }

    public boolean isHasMore() {
        if (this.mData == null || !((FriendList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    static final /* synthetic */ FriendList lambda$fetchList$0$InviteMoreUnregisteredFriendsModel(C0013i iVar) throws Exception {
        return (FriendList) iVar.mo34e();
    }

    public void refreshList(Object... objArr) {
        fetchList(0, 200);
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public void loadMoreList(Object... objArr) {
        fetchList(((FriendList) this.mData).cursor, 200);
    }

    /* access modifiers changed from: protected */
    public void handleData(FriendList<User> friendList) {
        boolean z;
        FriendList friendList2;
        boolean z2 = false;
        if (friendList == null || C9376b.m18558a((Collection<T>) friendList.unregisteredUser)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (this.mIsNewDataEmpty) {
            if (this.mData != null) {
                friendList2 = (FriendList) this.mData;
            }
        }
        int i = this.mListQueryType;
        if (i != 1) {
            if (i == 4) {
                List<UnRegisteredUser> list = ((FriendList) this.mData).unregisteredUser;
                List<UnRegisteredUser> list2 = friendList.unregisteredUser;
                if (!C9376b.m18558a((Collection<T>) list2)) {
                    for (Object next : list2) {
                        if (!list.contains(next)) {
                            list.add(next);
                        }
                    }
                }
                ((FriendList) this.mData).cursor = friendList.cursor;
                ((FriendList) this.mData).type = friendList.type;
                friendList2 = (FriendList) this.mData;
                if (((FriendList) this.mData).hasMore && friendList.hasMore) {
                    z2 = true;
                }
            }
        }
        this.mData = friendList;
        return;
        friendList2.hasMore = z2;
    }

    private void fetchList(int i, int i2) {
        this.mFriendApi.queryMoreUnregisteredFriends(i, i2).mo29c(InviteMoreUnregisteredFriendsModel$$Lambda$0.$instance).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
    }
}
