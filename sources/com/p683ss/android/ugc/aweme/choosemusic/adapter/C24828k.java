package com.p683ss.android.ugc.aweme.choosemusic.adapter;

import android.support.p043v7.widget.RecyclerView;
import com.p683ss.android.ugc.aweme.choosemusic.p1504c.C24837a.C24838a;
import com.p683ss.android.ugc.aweme.choosemusic.p1504c.C24840c;
import com.p683ss.android.ugc.aweme.choosemusic.p1504c.C24841d;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.p1515a.C25020a;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.p1515a.C25021b;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27728f;
import com.p683ss.android.ugc.aweme.music.model.MusicSearchHistory;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.k */
public final class C24828k extends C27728f<MusicSearchHistory> implements C24838a {

    /* renamed from: a */
    public static final C24829a f65726a = new C24829a(null);

    /* renamed from: b */
    private boolean f65727b;

    /* renamed from: c */
    private RecyclerView f65728c;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.k$a */
    public static final class C24829a {
        private C24829a() {
        }

        public /* synthetic */ C24829a(C52707g gVar) {
            this();
        }
    }

    public C24828k(boolean z) {
        mo56159a(new C25021b(z));
        mo56159a(new C25020a(z));
        this.f65727b = z;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f65728c = recyclerView;
        if (this.f65727b) {
            C24840c.m60407c().mo50739a((C24838a) this);
        } else {
            C24841d.m60410c().mo50739a((C24838a) this);
        }
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f65728c = null;
        if (this.f65727b) {
            C24840c.m60407c().mo50742b((C24838a) this);
        } else {
            C24841d.m60410c().mo50742b((C24838a) this);
        }
    }

    /* renamed from: a */
    public final void mo50711a(List<MusicSearchHistory> list) {
        C52711k.m112240b(list, "searchHistory");
        this.f72772k.clear();
        for (MusicSearchHistory add : list) {
            this.f72772k.add(add);
            if (this.f72772k.size() >= 10) {
                break;
            }
        }
        if (this.f72772k.size() == 0) {
            RecyclerView recyclerView = this.f65728c;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
        } else if (this.f72772k.size() >= 3) {
            this.f72772k.add(new MusicSearchHistory("", Integer.MAX_VALUE));
        }
        notifyDataSetChanged();
    }
}
