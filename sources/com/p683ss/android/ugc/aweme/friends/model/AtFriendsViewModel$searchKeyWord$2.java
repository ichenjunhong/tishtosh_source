package com.p683ss.android.ugc.aweme.friends.model;

import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$searchKeyWord$2 */
final class AtFriendsViewModel$searchKeyWord$2<TTaskResult, TContinuationResult> implements C0011g<List<? extends IMUser>, C0013i<List<? extends IMUser>>> {
    final /* synthetic */ AtFriendsViewModel this$0;

    AtFriendsViewModel$searchKeyWord$2(AtFriendsViewModel atFriendsViewModel) {
        this.this$0 = atFriendsViewModel;
    }

    public final C0013i<List<IMUser>> then(C0013i<List<IMUser>> iVar) {
        C52711k.m112236a((Object) iVar, "task");
        if (!iVar.mo33d() && !iVar.mo31c()) {
            List list = (List) iVar.mo34e();
            if (list != null) {
                this.this$0.latestSearchUsers.clear();
                this.this$0.latestSearchUsers.addAll(list);
            }
        }
        return iVar;
    }
}
