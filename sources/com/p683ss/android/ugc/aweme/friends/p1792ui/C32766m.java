package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.friends.experiment.SuggestionFriendsEntranceTypeExperiment;
import com.p683ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p683ss.android.ugc.aweme.profile.presenter.C39993z;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.m */
final /* synthetic */ class C32766m implements OnClickListener {

    /* renamed from: a */
    private final IAddFriendsActivity f85349a;

    C32766m(IAddFriendsActivity iAddFriendsActivity) {
        this.f85349a = iAddFriendsActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        IAddFriendsActivity iAddFriendsActivity = this.f85349a;
        iAddFriendsActivity.mStatusView.mo19212f();
        iAddFriendsActivity.mStatusView.mo19212f();
        if (SuggestionFriendsEntranceTypeExperiment.m75374a()) {
            iAddFriendsActivity.f84929g = new C39993z(new RecommendCommonUserModel(), iAddFriendsActivity);
            iAddFriendsActivity.f84929g.mo81918a(15, null, 3, iAddFriendsActivity.f84931i, C47945d.m103731a(), iAddFriendsActivity.f84932j, C47945d.m103733b(), null, iAddFriendsActivity.f84933k);
        }
    }
}
