package com.p683ss.android.ugc.aweme.friends.model;

import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$searchKeyWord$1 */
final class AtFriendsViewModel$searchKeyWord$1<V> implements Callable<TResult> {
    final /* synthetic */ List $data;
    final /* synthetic */ String $keyWord;
    final /* synthetic */ AtFriendsViewModel this$0;

    AtFriendsViewModel$searchKeyWord$1(AtFriendsViewModel atFriendsViewModel, List list, String str) {
        this.this$0 = atFriendsViewModel;
        this.$data = list;
        this.$keyWord = str;
    }

    public final List<IMUser> call() {
        List searchFollowIMUser = this.this$0.searchFollowIMUser(this.$data, this.$keyWord);
        C52711k.m112236a((Object) searchFollowIMUser, "searchFollowIMUser(data, keyWord)");
        Iterable iterable = searchFollowIMUser;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            IMUser iMUser = (IMUser) next;
            C52711k.m112236a((Object) iMUser, "it");
            if (hashSet.add(iMUser.getUid())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
