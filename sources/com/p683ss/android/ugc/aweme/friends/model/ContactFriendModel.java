package com.p683ss.android.ugc.aweme.friends.model;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.friends.api.C32558a;
import com.p683ss.android.ugc.aweme.friends.api.FriendApi;
import com.p683ss.android.ugc.aweme.friends.p1789c.C32568a;
import com.p683ss.android.ugc.aweme.net.C37776h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.friends.model.ContactFriendModel */
public class ContactFriendModel extends C32568a<User> {
    protected boolean mCountOnly;
    protected FriendApi mFriendApi;

    public void buildFriendItems(FriendList<User> friendList) {
    }

    public ContactFriendModel() {
        this.mFriendApi = C32558a.m75336a();
    }

    public ContactFriendModel(boolean z) {
        this();
        this.mCountOnly = z;
    }

    static final /* synthetic */ FriendList lambda$fetchList$0$ContactFriendModel(C0013i iVar) throws Exception {
        return (FriendList) iVar.mo34e();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ FriendList lambda$fetchList$1$ContactFriendModel(C0013i iVar) throws Exception {
        FriendList friendList = (FriendList) iVar.mo34e();
        if (friendList != null && !C9376b.m18558a((Collection<T>) friendList.friends) && !this.mHasFollowedFriends) {
            partitionByIsFollowedStatus(friendList.friends);
        }
        return (FriendList) iVar.mo34e();
    }

    /* access modifiers changed from: protected */
    public void partitionByIsFollowedStatus(List<User> list) {
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((User) list.get(i)).getFollowStatus() != 0) {
                while (i < size && ((User) list.get(size - 1)).getFollowStatus() != 0) {
                    size--;
                }
                User user = (User) list.get(i);
                list.set(i, list.get(size));
                list.set(size, user);
                z = true;
            }
        }
        this.mHasFollowedFriends = z;
    }

    public void fetchList(int i, int i2, int i3) {
        if (this.mCountOnly) {
            this.mFriendApi.queryContactsFriendsCountOnly(i, i2, i3, 1).mo29c(ContactFriendModel$$Lambda$0.$instance).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
        } else {
            this.mFriendApi.queryContactsFriends(i, i2, i3).mo29c(new ContactFriendModel$$Lambda$1(this)).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
        }
    }
}
