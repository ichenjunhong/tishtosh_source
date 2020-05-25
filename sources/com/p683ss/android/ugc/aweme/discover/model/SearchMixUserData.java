package com.p683ss.android.ugc.aweme.discover.model;

import com.p683ss.android.ugc.aweme.commercialize.model.C26110ae;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchMixUserData */
public class SearchMixUserData {

    /* renamed from: ad */
    public C26110ae f74687ad;
    public boolean hasTopUser;
    public List<SearchUser> users;

    public SearchMixUserData setAd(C26110ae aeVar) {
        this.f74687ad = aeVar;
        return this;
    }

    public SearchMixUserData setHasTopUser(boolean z) {
        this.hasTopUser = z;
        return this;
    }

    public SearchMixUserData setUsers(List<SearchUser> list) {
        this.users = list;
        return this;
    }
}
