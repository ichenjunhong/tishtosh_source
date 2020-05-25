package com.p683ss.android.ugc.aweme.friends;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.c */
public final class C32567c {
    /* renamed from: a */
    private static boolean m75342a(User user, User user2) {
        if (user == null || user2 == null) {
            return false;
        }
        return TextUtils.equals(user.getUid(), user2.getUid());
    }

    /* renamed from: a */
    public static int m75341a(List<User> list, User user) {
        if (list == null || list.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (m75342a((User) list.get(i), user)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static boolean m75344b(List<User> list, User user) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (User user2 : list) {
            if (m75342a(user2, user)) {
                return list.remove(user2);
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m75343a(Collection<User> collection, User user) {
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        for (User a : collection) {
            if (m75342a(a, user)) {
                return true;
            }
        }
        return false;
    }
}
