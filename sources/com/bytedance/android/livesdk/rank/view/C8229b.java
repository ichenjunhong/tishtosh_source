package com.bytedance.android.livesdk.rank.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.user.C8337i;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;

/* renamed from: com.bytedance.android.livesdk.rank.view.b */
final /* synthetic */ class C8229b implements OnClickListener {

    /* renamed from: a */
    private final NobleRankListBottomView f22529a;

    C8229b(NobleRankListBottomView nobleRankListBottomView) {
        this.f22529a = nobleRankListBottomView;
    }

    public final void onClick(View view) {
        NobleRankListBottomView nobleRankListBottomView = this.f22529a;
        TTLiveSDKContext.getHostService().mo10315h().mo14516a(nobleRankListBottomView.getContext(), C8337i.m16520a().mo14540a(nobleRankListBottomView.getContext().getString(R.string.e6t)).mo14539a(0).mo14544d("live_detail").mo14545e("audience_list").mo14543c(CustomActionPushReceiver.f104061f).mo14541a()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) nobleRankListBottomView.f22487i);
    }
}
