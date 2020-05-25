package com.p683ss.android.ugc.aweme.p1793g;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.friends.C32567c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.g.b */
public final class C32801b {
    /* renamed from: a */
    public static <T extends User> void m75681a(List<User> list, List<T> list2) {
        if (!C9376b.m18558a((Collection<T>) list2)) {
            for (T t : list2) {
                if (!C32567c.m75343a((Collection<User>) list, (User) t)) {
                    list.add(t);
                }
            }
        }
    }
}
