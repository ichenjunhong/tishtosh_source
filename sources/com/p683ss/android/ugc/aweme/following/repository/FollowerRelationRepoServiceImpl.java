package com.p683ss.android.ugc.aweme.following.repository;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.following.p1768a.C31995c;
import com.p683ss.android.ugc.aweme.p1432be.C23775a;
import p064c.p065a.C2201v;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.following.repository.FollowerRelationRepoServiceImpl */
public final class FollowerRelationRepoServiceImpl implements C23775a {
    public static C23775a createIFollowerRelationRepositorybyMonsterPlugin() {
        Object a = C27991b.m66756a(C23775a.class);
        if (a != null) {
            return (C23775a) a;
        }
        return new FollowerRelationRepoServiceImpl();
    }

    public final C2201v<C31995c> queryFollowerList(String str, String str2, long j, int i, int i2, int i3, int i4, int i5, int i6) {
        String str3 = str;
        C52711k.m112240b(str, "userId");
        String str4 = str2;
        C52711k.m112240b(str2, "secUserId");
        return new C32020d().mo65211a(str3, str4, j, i, i2, i3, i4, i5, i6);
    }
}
