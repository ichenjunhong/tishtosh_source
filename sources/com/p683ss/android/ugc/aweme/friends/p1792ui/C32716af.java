package com.p683ss.android.ugc.aweme.friends.p1792ui;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import java.util.Collection;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.af */
final /* synthetic */ class C32716af implements C0011g {

    /* renamed from: a */
    private final RecommendFriendActivity f85220a;

    C32716af(RecommendFriendActivity recommendFriendActivity) {
        this.f85220a = recommendFriendActivity;
    }

    public final Object then(C0013i iVar) {
        RecommendFriendActivity recommendFriendActivity = this.f85220a;
        if (iVar.mo33d()) {
            recommendFriendActivity.mo66226a();
        } else {
            RecommendList recommendList = (RecommendList) iVar.mo34e();
            recommendFriendActivity.f85065b = RecommendFriendActivity.m75517a(recommendList.getUserList());
            if (C9376b.m18558a((Collection<T>) recommendList.getUserList())) {
                recommendFriendActivity.mo66226a();
            } else {
                C18842a.m45934b(new Runnable(recommendList) {

                    /* renamed from: a */
                    final /* synthetic */ RecommendList f85072a;

                    public final void run() {
                        RecommendFriendActivity.this.f85064a.mo50303a(this.f85072a.getUserList());
                        RecommendFriendActivity.this.dismissProgressDialog();
                    }

                    {
                        this.f85072a = r2;
                    }
                });
            }
        }
        return null;
    }
}
