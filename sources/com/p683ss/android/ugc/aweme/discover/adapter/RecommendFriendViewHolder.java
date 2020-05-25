package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.router.C41302w;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.RecommendFriendViewHolder */
public class RecommendFriendViewHolder extends C1352v {
    RecyclerView recyclerView;
    TextView txtFindMore;
    TextView txtInterested;

    public void goAddFriends() {
        C26890h.onEvent(MobClick.obtain().setEventName("check_more").setLabelName("discovery_recommend"));
        C41302w.m91042a().mo83861a("aweme://user/invite");
    }
}
