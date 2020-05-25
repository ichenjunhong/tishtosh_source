package com.p683ss.android.ugc.aweme.favorites.adapter;

import android.app.Activity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.favorites.viewholder.C29765a;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.a */
public final class C29667a extends C26840g<Challenge> {

    /* renamed from: a */
    private Activity f77555a;

    public C29667a(Activity activity) {
        this.f77555a = activity;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        return new C29765a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bu_, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        int i2;
        Challenge challenge = (Challenge) mo50673a().get(i);
        C29765a aVar = (C29765a) vVar;
        Activity activity = this.f77555a;
        if (challenge != null) {
            aVar.f77758h = activity;
            aVar.f77757g = challenge;
            if (challenge.getCoverItem() != null) {
                C23515d.m57669a(aVar.f77752b, challenge.getCoverItem());
            } else {
                C23515d.m57668a(aVar.f77752b, (int) R.drawable.dwy);
            }
            aVar.f77751a.setText(aVar.f77757g.getChallengeName());
            if (challenge.getViewCount() >= 0) {
                i2 = R.string.zk;
            } else {
                i2 = R.string.bu1;
            }
            aVar.f77756f.setText(aVar.itemView.getResources().getString(i2, new Object[]{C33095b.m76068a(challenge.getDisplayCount())}));
            aVar.mo59961a();
        }
    }
}
