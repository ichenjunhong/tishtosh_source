package com.p683ss.android.ugc.aweme.friends.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.model.UserWithAweme */
public final class UserWithAweme implements Serializable, Cloneable {
    @C17952c(mo34828a = "aweme")
    private final Aweme aweme;
    @C17952c(mo34828a = "user")
    private final User user;

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final User getUser() {
        return this.user;
    }

    public final UserWithAweme clone() {
        try {
            Object clone = super.clone();
            if (clone != null) {
                return (UserWithAweme) clone;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.friends.model.UserWithAweme");
        } catch (CloneNotSupportedException unused) {
            return new UserWithAweme(new User(), new Aweme());
        }
    }

    public UserWithAweme(User user2, Aweme aweme2) {
        C52711k.m112240b(user2, "user");
        C52711k.m112240b(aweme2, "aweme");
        this.user = user2;
        this.aweme = aweme2;
    }
}
