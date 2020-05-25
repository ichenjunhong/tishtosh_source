package com.p683ss.android.ugc.aweme.friends.p1789c;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.friends.model.FriendList;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.c.a */
public abstract class C32568a<T extends User> extends C26875a<T, FriendList<T>> {
    protected boolean mHasFollowedFriends;

    /* access modifiers changed from: protected */
    public abstract void buildFriendItems(FriendList<T> friendList);

    /* access modifiers changed from: protected */
    public abstract void fetchList(int i, int i2, int i3);

    public int getRegisteredCount() {
        return ((FriendList) this.mData).registerCount;
    }

    public List<T> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FriendList) this.mData).friends;
    }

    public boolean isHasMore() {
        if (this.mData == null || !((FriendList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public void refreshList(Object... objArr) {
        this.mHasFollowedFriends = false;
        fetchList(0, 20, 0);
    }

    public void loadMoreList(Object... objArr) {
        fetchList(((FriendList) this.mData).cursor, 20, ((FriendList) this.mData).type);
    }

    /* access modifiers changed from: protected */
    public void handleData(FriendList<T> friendList) {
        boolean z;
        FriendList friendList2;
        buildFriendItems(friendList);
        boolean z2 = false;
        if (friendList == null || C9376b.m18558a((Collection<T>) friendList.friends)) {
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
                ((FriendList) this.mData).friends.addAll(friendList.friends);
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
}
