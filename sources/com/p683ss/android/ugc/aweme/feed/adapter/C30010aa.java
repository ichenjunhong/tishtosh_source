package com.p683ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.feed.api.C30148f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.main.C36512b;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import com.p683ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.aa */
public class C30010aa extends VideoViewHolder {

    /* renamed from: a */
    private long f78370a;

    /* renamed from: l */
    private boolean mo60375l() {
        return TextUtils.equals(mo60210aa(), "homepage_hot");
    }

    /* renamed from: i */
    public void mo54003i() {
        super.mo54003i();
        if (mo60375l()) {
            C30148f.m70756a().maybeMonitorTimeSpend(this.f78325p, Long.valueOf(this.f78370a));
        }
    }

    public C30010aa(C30069bh bhVar) {
        super(bhVar);
    }

    /* renamed from: a */
    public final void mo53526a(C50118g gVar) {
        super.mo53526a(gVar);
        if (mo60375l()) {
            this.f78370a = System.currentTimeMillis();
        }
    }

    /* renamed from: d */
    public final void mo60231d(boolean z) {
        if (TextUtils.equals(mo60210aa(), "homepage_follow") && C23794bh.m58388b().mo75671b()) {
            z = C36512b.m82421a().f93585b;
        }
        super.mo60231d(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo60230d(Aweme aweme) {
        boolean z = false;
        if (!(this.f78328s == 0 || C20854a.m53167g() == null || (C20854a.m53167g().isLogin() && TextUtils.equals(this.f78325p.getAuthorUid(), C20854a.m53167g().getCurUserId())))) {
            z = true;
        }
        if (z) {
            ISuperEntranceService superEntranceService = AVExternalServiceImpl.getAVServiceImpl_Monster().superEntranceService();
            if (superEntranceService != null && superEntranceService.shouldShowSuperEntranceRecord(mo60197Z())) {
                List superEntranceEffectList = superEntranceService.getSuperEntranceEffectList();
                C46069d stickerEntranceInfo = aweme.getStickerEntranceInfo();
                if (stickerEntranceInfo != null && !C9376b.m18558a((Collection<T>) superEntranceEffectList) && superEntranceEffectList.contains(stickerEntranceInfo.f116246id)) {
                    C47718bf.m103288a(new SuperEntranceEvent(1, true));
                    superEntranceService.setShowedSuperEntranceTab();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60200a(View view, boolean z) {
        if (TextUtils.equals(mo60210aa(), "homepage_follow") && C23794bh.m58388b().mo75671b()) {
            z = C36512b.m82421a().f93585b;
        }
        super.mo60200a(view, z);
    }
}
