package com.p683ss.android.ugc.aweme.choosemusic.p1507f.p1508a;

import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24870z;
import com.p683ss.android.ugc.aweme.choosemusic.p1507f.p1512e.C24886a;
import com.p683ss.android.ugc.aweme.choosemusic.view.C25000q.C25001a;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.SearchSugViewHolder;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.f.a.a */
public final class C24874a extends C1322a<C1352v> {

    /* renamed from: a */
    public List<C24870z> f65820a = new ArrayList();

    /* renamed from: b */
    public MusicSearchStateViewModel f65821b;

    /* renamed from: c */
    private C25001a f65822c;

    public final int getItemCount() {
        return this.f65820a.size();
    }

    public C24874a(FragmentActivity fragmentActivity) {
        if (fragmentActivity != null) {
            this.f65821b = (MusicSearchStateViewModel) C0214z.m440a(fragmentActivity).mo359a(MusicSearchStateViewModel.class);
            this.f65822c = new C25001a() {
                /* renamed from: a */
                public final void mo50795a() {
                    if (C24874a.this.f65821b != null) {
                        C24874a.this.f65821b.mo50680d().setValue(Boolean.valueOf(true));
                    }
                }

                /* renamed from: a */
                public final void mo50796a(boolean z) {
                    if (C24874a.this.f65821b != null) {
                        C24874a.this.f65821b.mo50681e().setValue(Boolean.valueOf(z));
                    }
                }
            };
        }
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        if (vVar instanceof C24886a) {
            ((C24886a) vVar).mo50808a((C24870z) this.f65820a.get(i), i);
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C25001a aVar = this.f65822c;
        C52711k.m112240b(viewGroup, "itemView");
        C52711k.m112240b(aVar, "keyboardDismissHandler");
        SearchSugViewHolder searchSugViewHolder = new SearchSugViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bir, viewGroup, false), aVar);
        C52711k.m112236a((Object) searchSugViewHolder, "SearchSugViewHolder.crea…, keyboardDismissHandler)");
        return searchSugViewHolder;
    }
}
