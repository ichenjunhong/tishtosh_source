package com.p683ss.android.ugc.aweme.user.repository;

import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.user.repository.a */
public final class C47587a {

    /* renamed from: a */
    public User f120036a;

    /* renamed from: b */
    public String f120037b;

    /* renamed from: c */
    public int f120038c;

    private C47587a(User user, String str, int i) {
        C52711k.m112240b(user, "user");
        C52711k.m112240b(str, "requestId");
        this.f120036a = user;
        this.f120037b = str;
        this.f120038c = i;
    }

    public /* synthetic */ C47587a(User user, String str, int i, int i2, C52707g gVar) {
        this(user, str, 0);
    }
}
