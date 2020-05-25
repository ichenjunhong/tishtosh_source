package com.p683ss.android.ugc.aweme.friends.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32506c;
import com.p683ss.android.ugc.aweme.profile.model.RecommendAwemeItem;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.q */
public final class C32542q extends C32541p {

    /* renamed from: a */
    private int f84724a;

    /* renamed from: b */
    private C32506c f84725b;

    /* renamed from: a */
    public final void mo65844a(C32506c cVar) {
        this.f84725b = cVar;
    }

    /* renamed from: b */
    public final void mo65845b(int i) {
        this.f84724a = i;
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof C32543r) {
            ((C32543r) vVar).mo54775a(true);
        }
    }

    public final void onViewDetachedFromWindow(C1352v vVar) {
        super.onViewDetachedFromWindow(vVar);
        if (vVar instanceof C32543r) {
            ((C32543r) vVar).mo54775a(false);
        }
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        if (vVar instanceof C32543r) {
            ((C32543r) vVar).mo54774a((RecommendAwemeItem) mo50673a().get(i), this.f84724a);
        }
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        C32543r rVar = new C32543r(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bb9, viewGroup, false));
        rVar.f84727b = this.f84725b;
        rVar.f84726a = (viewGroup.getMeasuredWidth() - C23728o.m58241a(8.0d)) / 3;
        if (rVar.f84726a > 0) {
            LayoutParams layoutParams = rVar.itemView.getLayoutParams();
            layoutParams.width = rVar.f84726a;
            layoutParams.height = rVar.f84726a;
            rVar.itemView.setLayoutParams(layoutParams);
        }
        return rVar;
    }
}
