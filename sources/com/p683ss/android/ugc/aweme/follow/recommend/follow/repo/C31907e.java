package com.p683ss.android.ugc.aweme.follow.recommend.follow.repo;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.repo.e */
public final class C31907e implements Cloneable {
    @C17952c(mo34828a = "user_id")

    /* renamed from: a */
    public final String f83352a;
    @C17952c(mo34828a = "recommend_item_list")

    /* renamed from: b */
    public final List<Aweme> f83353b;

    /* renamed from: c */
    public User f83354c;

    /* renamed from: d */
    public int f83355d;

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendFollowStruct(uid=");
        sb.append(this.f83352a);
        sb.append(", awemeList=");
        sb.append(this.f83353b);
        sb.append(", user=");
        sb.append(this.f83354c);
        sb.append(", index=");
        sb.append(this.f83355d);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.f83352a.hashCode();
    }

    /* renamed from: a */
    public final C31907e clone() {
        String str = this.f83352a;
        List a = m74327a(this.f83353b);
        User clone = this.f83354c.clone();
        C52711k.m112236a((Object) clone, "user.clone()");
        return new C31907e(str, a, clone, this.f83355d);
    }

    /* renamed from: a */
    public final void mo65112a(User user) {
        C52711k.m112240b(user, "<set-?>");
        this.f83354c = user;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C31907e)) {
            return false;
        }
        return TextUtils.equals(((C31907e) obj).f83352a, this.f83352a);
    }

    /* renamed from: a */
    private static List<Aweme> m74327a(List<Aweme> list) {
        if (list == null) {
            return new ArrayList<>();
        }
        Iterable<Aweme> iterable = list;
        Collection arrayList = new ArrayList();
        for (Aweme clone : iterable) {
            Aweme updateAweme = C23324d.m57378a().updateAweme(clone.clone());
            C52711k.m112236a((Object) updateAweme, "ServiceManager.get().get…).updateAweme(it.clone())");
            arrayList.add(updateAweme);
        }
        return (List) arrayList;
    }

    private C31907e(String str, List<Aweme> list, User user, int i) {
        C52711k.m112240b(str, "uid");
        C52711k.m112240b(list, "awemeList");
        C52711k.m112240b(user, "user");
        this.f83352a = str;
        this.f83353b = list;
        this.f83354c = user;
        this.f83355d = i;
    }
}
