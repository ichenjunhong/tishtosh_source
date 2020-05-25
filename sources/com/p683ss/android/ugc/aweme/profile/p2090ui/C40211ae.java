package com.p683ss.android.ugc.aweme.profile.p2090ui;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ae */
public final class C40211ae {
    /* renamed from: a */
    public static boolean m89448a(User user) {
        return m89450c(user);
    }

    /* renamed from: b */
    public static int m89449b(User user) {
        if (user == null) {
            return 0;
        }
        if (m89448a(user)) {
            return user.getFansCount();
        }
        return user.getFollowerCount();
    }

    /* renamed from: a */
    public static List<FollowerDetail> m89447a(List<FollowerDetail> list) {
        ArrayList arrayList = new ArrayList();
        if (C9376b.m18558a((Collection<T>) list)) {
            return arrayList;
        }
        arrayList.clear();
        arrayList.addAll(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FollowerDetail followerDetail = (FollowerDetail) it.next();
            if (followerDetail != null && followerDetail.getFansCount() <= 0) {
                it.remove();
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private static boolean m89450c(User user) {
        if (user == null || C9376b.m18558a((Collection<T>) user.getFollowerDetailList())) {
            return false;
        }
        List a = m89447a(user.getFollowerDetailList());
        if (!C9376b.m18558a((Collection<T>) a) && a.size() > 1) {
            return true;
        }
        return false;
    }
}
