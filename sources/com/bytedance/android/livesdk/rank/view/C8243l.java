package com.bytedance.android.livesdk.rank.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.user.C8337i;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;

/* renamed from: com.bytedance.android.livesdk.rank.view.l */
final /* synthetic */ class C8243l implements OnClickListener {

    /* renamed from: a */
    private final UserRankListAnchorView f22559a;

    C8243l(UserRankListAnchorView userRankListAnchorView) {
        this.f22559a = userRankListAnchorView;
    }

    public final void onClick(View view) {
        UserRankListAnchorView userRankListAnchorView = this.f22559a;
        TTLiveSDKContext.getHostService().mo10315h().mo14516a(userRankListAnchorView.getContext(), C8337i.m16520a().mo14540a(userRankListAnchorView.getContext().getString(R.string.e6t)).mo14539a(0).mo14544d("live_detail").mo14545e("audience_list").mo14543c(CustomActionPushReceiver.f104061f).mo14541a()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) userRankListAnchorView.f22510n);
    }
}
