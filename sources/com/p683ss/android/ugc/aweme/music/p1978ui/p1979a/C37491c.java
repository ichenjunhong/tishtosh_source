package com.p683ss.android.ugc.aweme.music.p1978ui.p1979a;

import android.arch.lifecycle.C0184k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p683ss.android.ugc.aweme.base.arch.C23466e;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.p1978ui.viewholder.SimilarMusicListViewHolder;
import com.p683ss.android.ugc.aweme.music.p1978ui.viewmodel.C37682d;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2643g.C52733a;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.music.ui.a.c */
public final class C37491c extends C23466e<C37682d> {

    /* renamed from: c */
    static final /* synthetic */ C52767h[] f95674c = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C37491c.class), "screenWidth", "getScreenWidth()F")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C37491c.class), "cellHeight", "getCellHeight()F"))};

    /* renamed from: d */
    final C52668f f95675d = C52732g.m112285a(C37494c.f95681a);

    /* renamed from: e */
    public C37492a f95676e;

    /* renamed from: f */
    public final C0184k f95677f;

    /* renamed from: g */
    private HashMap<Integer, Integer> f95678g = new HashMap<>();

    /* renamed from: h */
    private final C52668f f95679h = C52732g.m112285a(new C37493b(this));

    /* renamed from: com.ss.android.ugc.aweme.music.ui.a.c$a */
    public interface C37492a {
        /* renamed from: a */
        void mo77034a(Aweme aweme, int i, int i2);

        /* renamed from: a */
        void mo77035a(Music music, int i);

        /* renamed from: a */
        void mo77036a(boolean z);

        /* renamed from: b */
        void mo77037b(Music music, int i);

        /* renamed from: c */
        void mo77038c(Music music, int i);

        /* renamed from: d */
        void mo77039d(Music music, int i);

        /* renamed from: e */
        void mo77040e(Music music, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.a.c$b */
    static final class C37493b extends C52712l implements C52670a<Float> {

        /* renamed from: a */
        final /* synthetic */ C37491c f95680a;

        C37493b(C37491c cVar) {
            this.f95680a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(((((Number) this.f95680a.f95675d.getValue()).floatValue() / 2.0f) * 4.0f) / 3.0f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.a.c$c */
    static final class C37494c extends C52712l implements C52670a<Float> {

        /* renamed from: a */
        public static final C37494c f95681a = new C37494c();

        C37494c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(((float) C9432q.m18670a(C11010c.m22280a())) - C9432q.m18687b(C11010c.m22280a(), 33.0f));
        }
    }

    /* renamed from: g */
    private final float m83897g() {
        return ((Number) this.f95679h.getValue()).floatValue();
    }

    /* renamed from: f */
    public final float mo77033f() {
        return m83897g();
    }

    public C37491c(C0184k kVar) {
        C52711k.m112240b(kVar, "parent");
        super(kVar, new C37490b(), null, 4, null);
        this.f95677f = kVar;
    }

    /* renamed from: a */
    public final JediViewHolder<? extends C11796d, C37682d> mo48638a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bll, viewGroup, false);
        C52711k.m112236a((Object) inflate, "itemView");
        SimilarMusicListViewHolder similarMusicListViewHolder = new SimilarMusicListViewHolder(inflate, C52733a.m112277a(m83897g()), getItemCount(), this.f95676e, this.f95678g);
        return similarMusicListViewHolder;
    }
}
