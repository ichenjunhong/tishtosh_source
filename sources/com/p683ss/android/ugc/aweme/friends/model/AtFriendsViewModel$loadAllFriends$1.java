package com.p683ss.android.ugc.aweme.friends.model;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.friends.api.SummonFriendApi;
import com.p683ss.android.ugc.aweme.friends.model.AtFriendsViewModel.Companion.AllFriends;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p1807im.service.p1905g.C35450e;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$loadAllFriends$1 */
final class AtFriendsViewModel$loadAllFriends$1<V> implements Callable<TResult> {
    public static final AtFriendsViewModel$loadAllFriends$1 INSTANCE = new AtFriendsViewModel$loadAllFriends$1();

    AtFriendsViewModel$loadAllFriends$1() {
    }

    public final AllFriends call() {
        Object obj;
        IIMService d = C33194e.m76279d();
        C52711k.m112236a((Object) d, "IM.get()");
        List allFollowIMUsers = d.getAllFollowIMUsers();
        if (allFollowIMUsers == null) {
            allFollowIMUsers = C52575l.m112097a();
        }
        Iterable iterable = allFollowIMUsers;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            IMUser iMUser = (IMUser) next;
            C52711k.m112236a((Object) iMUser, "it");
            String uid = iMUser.getUid();
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            if (true ^ C52711k.m112239a((Object) uid, (Object) a.getCurUserId())) {
                arrayList.add(next);
            }
        }
        List<IMUser> e = C52575l.m112139e((Collection<? extends T>) (List) arrayList);
        List arrayList2 = new ArrayList();
        String str = null;
        try {
            List<User> list = SummonFriendApi.m75333a().users;
            if (list != null && (!list.isEmpty())) {
                for (User user : list) {
                    if (arrayList2.size() < 10) {
                        Iterator it = e.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            IMUser iMUser2 = (IMUser) obj;
                            C52711k.m112236a((Object) iMUser2, "it");
                            String uid2 = iMUser2.getUid();
                            C52711k.m112236a((Object) user, "user");
                            if (C52711k.m112239a((Object) uid2, (Object) user.getUid())) {
                                break;
                            }
                        }
                        IMUser iMUser3 = (IMUser) obj;
                        if (iMUser3 == null) {
                            iMUser3 = C33194e.m76261a(user);
                            C52711k.m112236a((Object) iMUser3, "IM.convert(user)");
                        }
                        arrayList2.add(iMUser3);
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (arrayList2.size() < 10) {
            IIMService d2 = C33194e.m76279d();
            C52711k.m112236a((Object) d2, "IM.get()");
            List<IMUser> recentIMUsers = d2.getRecentIMUsers();
            if (recentIMUsers != null) {
                for (IMUser iMUser4 : recentIMUsers) {
                    if (arrayList2.size() < 10 && !arrayList2.contains(iMUser4)) {
                        C52711k.m112236a((Object) iMUser4, "imUser");
                        String uid3 = iMUser4.getUid();
                        IAccountUserService a2 = C20902b.m53242a();
                        C52711k.m112236a((Object) a2, "AccountUserProxyService.get()");
                        if (!C52711k.m112239a((Object) uid3, (Object) a2.getCurUserId())) {
                            arrayList2.add(iMUser4);
                        }
                    }
                }
            }
        }
        List arrayList3 = new ArrayList();
        List arrayList4 = new ArrayList();
        List arrayList5 = new ArrayList();
        for (IMUser iMUser5 : e) {
            C52711k.m112236a((Object) iMUser5, "it");
            if (iMUser5.getFollowStatus() == 2 && e.size() >= 10) {
                arrayList3.add(iMUser5);
            }
            if (arrayList4.isEmpty() || !TextUtils.equals((CharSequence) arrayList4.get(arrayList4.size() - 1), iMUser5.getInitialLetter())) {
                String initialLetter = iMUser5.getInitialLetter();
                C52711k.m112236a((Object) initialLetter, "it.initialLetter");
                arrayList4.add(initialLetter);
                arrayList5.add(Integer.valueOf(1));
            } else {
                int size = arrayList5.size() - 1;
                arrayList5.set(size, Integer.valueOf(((Number) arrayList5.get(size)).intValue() + 1));
            }
        }
        boolean z = false;
        if (!arrayList3.isEmpty()) {
            arrayList4.add(0, "Friend");
            arrayList5.add(0, Integer.valueOf(arrayList3.size()));
        }
        if (!arrayList2.isEmpty()) {
            arrayList4.add(0, "Recent");
            arrayList5.add(0, Integer.valueOf(arrayList2.size()));
        }
        IIMService d3 = C33194e.m76279d();
        C52711k.m112236a((Object) d3, "IM.get()");
        C35450e relationService = d3.getRelationService();
        if (relationService != null) {
            String a3 = relationService.mo72372a();
            if (a3 != null) {
                if (a3.length() > 0) {
                    z = true;
                }
                if (z) {
                    str = a3;
                }
                if (str != null) {
                    e.add(new HotSoonRelationNotice(str));
                }
            }
        }
        AllFriends allFriends = new AllFriends(arrayList2, arrayList3, e, arrayList4, arrayList5);
        return allFriends;
    }
}
