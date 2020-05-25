package com.p683ss.android.ugc.aweme.music.adapter.p1972a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.music.adapter.ChallengeTitleViewHolder;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37274a;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37283j;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.a.b */
public final class C37262b extends C26835b<List<C37283j>> {

    /* renamed from: a */
    private Challenge f95155a;

    public C37262b(Challenge challenge) {
        this.f95155a = challenge;
    }

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        return new ChallengeTitleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.hf, viewGroup, false));
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        return ((List) obj).get(i) instanceof C37274a;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        List list2 = (List) obj;
        ChallengeTitleViewHolder challengeTitleViewHolder = (ChallengeTitleViewHolder) vVar;
        Challenge challenge = this.f95155a;
        if (challenge == null || challenge.getConnectMusics() == null || challenge.getConnectMusics().isEmpty()) {
            challengeTitleViewHolder.mo76580a(false);
            challengeTitleViewHolder.rootLayout.setVisibility(8);
            challengeTitleViewHolder.itemView.setVisibility(8);
            return;
        }
        challengeTitleViewHolder.mo76580a(true);
        challengeTitleViewHolder.rootLayout.setVisibility(0);
        challengeTitleViewHolder.title.setText(challenge.getChallengeName());
    }
}
