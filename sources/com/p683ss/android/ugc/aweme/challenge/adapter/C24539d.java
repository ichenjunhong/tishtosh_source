package com.p683ss.android.ugc.aweme.challenge.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment.C24622b;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment.C24624d;
import com.p683ss.android.ugc.aweme.common.p1589a.C26837d;
import com.p683ss.android.ugc.aweme.common.p1589a.C26838e;
import com.p683ss.android.ugc.aweme.common.p1593e.C26872d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.adapter.d */
public final class C24539d extends C26837d {

    /* renamed from: e */
    public boolean f64965e;

    /* renamed from: f */
    private String f64966f;

    /* renamed from: g */
    private C24579d f64967g;

    /* renamed from: h */
    private C26872d<C26838e> f64968h;

    /* renamed from: i */
    private C24622b f64969i;

    public final int getItemCount() {
        if (this.f70699x) {
            return mo48636c() + 1;
        }
        return mo48636c();
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        int a = super.mo48641a(i);
        if (a != 0 || !(this.f64969i instanceof C24624d)) {
            return a;
        }
        return ((C24624d) this.f64969i).getDetailAwemeViewType(i, (Aweme) this.f70670n.get(i));
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (this.f64965e && vVar.mItemViewType == 0 && this.f64968h != null) {
            this.f64968h.mo50455a((C24534a) vVar);
        }
    }

    /* renamed from: e */
    private List<Integer> m59949e(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        for (int max = Math.max(0, this.f70671o - 1); max < size; max++) {
            Aweme aweme = (Aweme) list.get(max);
            aweme.setOriginalPos(max);
            if (aweme.getIsTop() == 1) {
                list.remove(aweme);
                list.add(i, aweme);
                i++;
                arrayList.add(Integer.valueOf(max));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo50304b(List<Aweme> list) {
        if (TextUtils.equals(this.f64966f, "challenge")) {
            this.f70670n = list;
            List e = m59949e(this.f70670n);
            super.mo50304b(list);
            if (e.size() > 0) {
                notifyItemRangeInserted(0, e.size());
            }
            return;
        }
        super.mo50304b(list);
    }

    /* renamed from: a */
    public final void mo50303a(List<Aweme> list) {
        this.f70671o = 0;
        if (TextUtils.equals(this.f64966f, "challenge")) {
            this.f70670n = list;
            m59949e(this.f70670n);
            super.mo50303a(this.f70670n);
            return;
        }
        super.mo50303a(list);
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        ((C24534a) vVar).mo50302a((Aweme) this.f70670n.get(i), i, this.f64965e);
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        if (this.f64969i instanceof C24624d) {
            return ((C24624d) this.f64969i).onCreateDetailAwemeViewHolder(viewGroup, i, this.f64966f, this.f64967g);
        }
        return this.f64969i.onCreateDetailAwemeViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b8g, viewGroup, false), this.f64966f, this.f64967g);
    }

    public C24539d(String str, C24579d dVar, C26872d<C26838e> dVar2, C24622b bVar) {
        this.f64966f = str;
        this.f64967g = dVar;
        this.f64968h = dVar2;
        this.f64969i = bVar;
    }
}
