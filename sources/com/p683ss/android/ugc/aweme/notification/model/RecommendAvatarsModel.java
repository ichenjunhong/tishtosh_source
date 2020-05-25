package com.p683ss.android.ugc.aweme.notification.model;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38101n;
import com.p683ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.notification.model.RecommendAvatarsModel */
public class RecommendAvatarsModel extends C0209x {
    public final C0198r<C38101n> liveData = new C0198r<>();

    public void startFetch() {
        MusNotificationApiManager.f97152a.fetchRecommendAvatars().mo29c(new RecommendAvatarsModel$$Lambda$0(this));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object lambda$startFetch$0$RecommendAvatarsModel(C0013i iVar) throws Exception {
        if (iVar.mo26b()) {
            this.liveData.postValue((C38101n) iVar.mo34e());
        }
        return null;
    }
}
