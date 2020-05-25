package com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel;

import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.BaseMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p2628d.p2629a.C52575l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupFollowMemberViewModel */
public final class GroupFollowMemberViewModel extends BaseMemberListViewModel<IMUser> {

    /* renamed from: a */
    public String f88677a;

    /* renamed from: b */
    public final Set<String> f88678b = new LinkedHashSet();

    /* renamed from: a */
    public final void mo72358a(String str) {
    }

    /* renamed from: e */
    public final List<String> mo72359e() {
        return new ArrayList<>(this.f88678b);
    }

    /* renamed from: a */
    public final void mo72357a() {
        this.f90194k.setValue(C52575l.m112097a());
        this.f90199p.setValue(C52575l.m112097a());
    }
}
