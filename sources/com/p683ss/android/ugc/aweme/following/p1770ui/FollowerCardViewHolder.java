package com.p683ss.android.ugc.aweme.following.p1770ui;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40211ae;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerCardViewHolder */
public class FollowerCardViewHolder extends C1352v {

    /* renamed from: a */
    User f83631a;

    /* renamed from: b */
    boolean f83632b;

    /* renamed from: c */
    private boolean f83633c;

    /* renamed from: d */
    private Context f83634d;

    /* renamed from: e */
    private C32199n f83635e;

    /* renamed from: f */
    private int f83636f;
    @BindView(2131493562)
    RecyclerView fansRecyclerView;

    /* renamed from: g */
    private List<FollowerDetail> f83637g;
    @BindView(2131495064)
    DmtTextView tvFansSum;

    /* renamed from: a */
    public final void mo65232a() {
        if (this.f83631a != null) {
            C20902b.m53242a().getCurUserId().equals(this.f83635e.getUid());
        }
    }

    public FollowerCardViewHolder(View view, C32199n nVar) {
        int i;
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f83634d = view.getContext();
        this.f83635e = nVar;
        this.f83631a = nVar.getUser();
        this.f83633c = nVar.isMine();
        if (this.f83631a != null) {
            this.f83637g = C40211ae.m89447a(this.f83631a.getFollowerDetailList());
        }
        if (C9376b.m18558a((Collection<T>) this.f83637g)) {
            i = 0;
        } else {
            i = this.f83637g.size() + 3;
        }
        this.f83636f = i;
    }
}
