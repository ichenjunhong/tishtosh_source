package com.p683ss.android.ugc.aweme.feed.adapter;

import com.p683ss.android.ugc.aweme.friends.api.C32559b;
import com.p683ss.android.ugc.aweme.friends.api.RecommendApi;
import com.p683ss.android.ugc.aweme.friends.model.SuperAccountList;
import com.p683ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37716a;
import com.p683ss.android.ugc.aweme.net.C37776h;
import java.util.ArrayList;
import java.util.List;
import p001a.C0011g;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.aw */
public final class C30035aw extends C37716a<SuperAccountList> {

    /* renamed from: a */
    public List<String> f78402a;

    /* renamed from: b */
    private RecommendApi f78403b = C32559b.m75337a();

    /* renamed from: a */
    public final void mo60305a() {
        this.f78403b.recommendSuperAccount().mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
    }

    public final /* synthetic */ void handleData(Object obj) {
        SuperAccountList superAccountList = (SuperAccountList) obj;
        if (this.mQueryType == 1) {
            super.handleData(superAccountList);
        } else if (this.mQueryType == 4) {
            if (this.mData != null) {
                List<UserWithAweme> userList = ((SuperAccountList) this.mData).getUserList();
                userList.addAll(superAccountList.getUserList());
                this.mData = superAccountList;
                ((SuperAccountList) this.mData).userList = userList;
            } else {
                this.mData = superAccountList;
            }
        }
        if (this.f78402a == null) {
            this.f78402a = new ArrayList();
        } else {
            this.f78402a.clear();
        }
        if (superAccountList != null && superAccountList.getUserList() != null) {
            for (UserWithAweme user : superAccountList.getUserList()) {
                this.f78402a.add(user.getUser().getUid());
            }
        }
    }
}
