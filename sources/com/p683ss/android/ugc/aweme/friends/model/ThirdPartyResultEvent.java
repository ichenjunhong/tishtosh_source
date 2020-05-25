package com.p683ss.android.ugc.aweme.friends.model;

import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.model.ThirdPartyResultEvent */
public final class ThirdPartyResultEvent {
    public final int cursor;
    public final boolean hasMore;
    public final List<User> userList;

    public ThirdPartyResultEvent(List<? extends User> list, boolean z, int i) {
        C52711k.m112240b(list, "userList");
        this.userList = list;
        this.hasMore = z;
        this.cursor = i;
    }
}
