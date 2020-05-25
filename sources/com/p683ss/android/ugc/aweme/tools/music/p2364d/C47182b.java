package com.p683ss.android.ugc.aweme.tools.music.p2364d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24441j;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24442k;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39538i;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.tools.music.p2364d.C47186c.C47188a;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.music.d.b */
public class C47182b extends C39538i implements C24441j {

    /* renamed from: n */
    public static final C47183a f119122n = new C47183a(null);

    /* renamed from: a */
    public int f119123a = -1;

    /* renamed from: b */
    public RecyclerView f119124b;

    /* renamed from: c */
    public C24442k f119125c;

    /* renamed from: d */
    public AnimatorSet f119126d = new AnimatorSet();

    /* renamed from: e */
    final List<Animator> f119127e = new ArrayList();

    /* renamed from: f */
    public int f119128f = 1;

    /* renamed from: g */
    public boolean f119129g;

    /* renamed from: h */
    public int f119130h;

    /* renamed from: i */
    public Map<String, Boolean> f119131i = new LinkedHashMap();

    /* renamed from: j */
    public Set<String> f119132j = new LinkedHashSet();

    /* renamed from: k */
    public final int f119133k;

    /* renamed from: l */
    public List<? extends MusicModel> f119134l;

    /* renamed from: m */
    public C24441j f119135m;

    /* renamed from: o */
    private int f119136o = -1;

    /* renamed from: p */
    private boolean f119137p = true;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b$a */
    public static final class C47183a {
        private C47183a() {
        }

        public /* synthetic */ C47183a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b$b */
    public static final class C47184b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C47182b f119138a;

        C47184b(C47182b bVar) {
            this.f119138a = bVar;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f119138a.f119128f = 3;
            this.f119138a.f119126d.end();
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f119138a.f119128f < 3) {
                this.f119138a.f119126d.start();
            }
        }

        public final void onAnimationStart(Animator animator) {
            this.f119138a.f119128f++;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b$c */
    public static final class C47185c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C47182b f119139a;

        public final void run() {
            C1332i iVar;
            C1352v vVar;
            C47182b bVar = this.f119139a;
            RecyclerView recyclerView = this.f119139a.f119124b;
            if (recyclerView != null) {
                iVar = recyclerView.getLayoutManager();
            } else {
                iVar = null;
            }
            if (iVar != null) {
                bVar.f119130h = ((LinearLayoutManager) iVar).mo4751l();
                int i = this.f119139a.f119130h;
                for (int i2 = 1; i2 < i; i2++) {
                    C47182b bVar2 = this.f119139a;
                    RecyclerView recyclerView2 = this.f119139a.f119124b;
                    if (recyclerView2 != null) {
                        vVar = recyclerView2.mo4847f(i2);
                    } else {
                        vVar = null;
                    }
                    int i3 = (i2 - 1) * 175;
                    if (vVar instanceof C47186c) {
                        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scaleX", new float[]{1.0f, 0.5f, 1.0f});
                        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("scaleY", new float[]{1.0f, 0.5f, 1.0f});
                        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(((C47186c) vVar).f119141a, new PropertyValuesHolder[]{ofFloat, ofFloat2});
                        C52711k.m112236a((Object) ofPropertyValuesHolder, "scale");
                        ofPropertyValuesHolder.setDuration(700);
                        ofPropertyValuesHolder.setStartDelay((long) i3);
                        bVar2.f119127e.add(ofPropertyValuesHolder);
                    }
                }
                C47182b bVar3 = this.f119139a;
                bVar3.f119126d.playTogether(bVar3.f119127e);
                bVar3.f119126d.start();
                bVar3.f119126d.addListener(new C47184b(bVar3));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }

        C47185c(C47182b bVar) {
            this.f119139a = bVar;
        }
    }

    public int getItemViewType(int i) {
        return i == 0 ? 0 : 2;
    }

    /* renamed from: a */
    public final int mo80635a() {
        return this.f119123a - 1;
    }

    /* renamed from: b */
    public final int mo80640b() {
        return this.f119136o - 1;
    }

    /* renamed from: d */
    public final void mo80644d() {
        if (this.f119126d.isRunning()) {
            this.f119126d.cancel();
        }
    }

    /* renamed from: g */
    public final void mo94425g() {
        RecyclerView recyclerView = this.f119124b;
        if (recyclerView != null) {
            recyclerView.mo4847f(this.f119123a);
        }
    }

    /* renamed from: i */
    private void m102429i() {
        C1352v vVar;
        if (this.f119136o > 0) {
            RecyclerView recyclerView = this.f119124b;
            if (recyclerView != null) {
                vVar = recyclerView.mo4847f(this.f119136o);
            } else {
                vVar = null;
            }
            if (vVar instanceof C47186c) {
                ((C47186c) vVar).mo94431a();
            }
        }
    }

    /* renamed from: e */
    public final MusicModel mo94423e() {
        List<? extends MusicModel> list = this.f119134l;
        if (list != null) {
            return (MusicModel) C52575l.m112118a(list, this.f119136o - 1);
        }
        return null;
    }

    public int getItemCount() {
        int i;
        List<? extends MusicModel> list = this.f119134l;
        if (list != null && list.size() == 0) {
            return 9;
        }
        List<? extends MusicModel> list2 = this.f119134l;
        if (list2 != null) {
            i = list2.size();
        } else {
            i = 0;
        }
        return i + 1;
    }

    /* renamed from: h */
    public final MusicModel mo94426h() {
        List<? extends MusicModel> list = this.f119134l;
        if (list != null) {
            return (MusicModel) C52575l.m112118a(list, this.f119123a - 1);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo80643c() {
        C1352v vVar;
        if (this.f119136o > 0) {
            RecyclerView recyclerView = this.f119124b;
            if (recyclerView != null) {
                vVar = recyclerView.mo4847f(this.f119136o);
            } else {
                vVar = null;
            }
            if (vVar instanceof C47186c) {
                ((C47186c) vVar).mo94434b();
            } else {
                notifyItemChanged(this.f119136o);
            }
        }
    }

    /* renamed from: f */
    public final void mo94424f() {
        this.f119129g = true;
        this.f119128f = 1;
        this.f119127e.clear();
        this.f119126d.cancel();
        this.f119126d.removeAllListeners();
        RecyclerView recyclerView = this.f119124b;
        if (recyclerView != null) {
            recyclerView.post(new C47185c(this));
        }
    }

    /* renamed from: a */
    public final void mo80636a(int i) {
        this.f119123a = i + 1;
    }

    /* renamed from: b */
    public final void mo80641b(int i) {
        this.f119136o = i + 1;
    }

    /* renamed from: c */
    public final MusicModel mo94422c(int i) {
        List<? extends MusicModel> list = this.f119134l;
        if (list != null) {
            return (MusicModel) C52575l.m112118a(list, i);
        }
        return null;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f119124b = recyclerView;
    }

    public void onViewAttachedToWindow(C1352v vVar) {
        boolean z;
        MusicModel musicModel;
        C52711k.m112240b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof C47186c) {
            C47186c cVar = (C47186c) vVar;
            cVar.getLayoutPosition();
            int adapterPosition = cVar.getAdapterPosition() - 1;
            List<? extends MusicModel> list = this.f119134l;
            if (list != null) {
                Collection collection = list;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    List<? extends MusicModel> list2 = this.f119134l;
                    if (list2 != null) {
                        MusicModel musicModel2 = (MusicModel) list2.get(adapterPosition);
                        if (musicModel2 != null) {
                            String musicId = musicModel2.getMusicId();
                            if (musicId != null) {
                                if (this.f119131i.get(musicId) == null || C52711k.m112239a((Object) (Boolean) this.f119131i.get(musicId), (Object) Boolean.valueOf(false))) {
                                    this.f119131i.put(musicId, Boolean.valueOf(true));
                                    C24442k kVar = this.f119125c;
                                    if (kVar != null) {
                                        kVar.mo50208a(adapterPosition);
                                    }
                                }
                                if (!this.f119132j.contains(musicId)) {
                                    List<? extends MusicModel> list3 = this.f119134l;
                                    String str = null;
                                    if (list3 != null) {
                                        musicModel = (MusicModel) C52575l.m112118a(list3, adapterPosition);
                                    } else {
                                        musicModel = null;
                                    }
                                    if (musicModel != null && musicModel.getComeFromForMod() == 1) {
                                        C47702b bVar = C47702b.f120193a;
                                        String str2 = "jarvis_item_show";
                                        C23089d a = C23089d.m56640a().mo47829a("item_id", musicModel.getMusicId()).mo47829a("channel_id", "94349537828");
                                        String str3 = "req_id";
                                        LogPbBean logPb = musicModel.getLogPb();
                                        if (logPb != null) {
                                            str = logPb.getImprId();
                                        }
                                        bVar.mo94984a(str2, a.mo47829a(str3, str).f61491a);
                                    }
                                    this.f119132j.add(musicId);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo80637a(int i, boolean z) {
        mo80643c();
        this.f119136o = i + 1;
        if (z) {
            m102429i();
        }
    }

    /* renamed from: a */
    public final void mo50207a(View view, int i) {
        C52711k.m112240b(view, "view");
        C24441j jVar = this.f119135m;
        if (jVar != null) {
            jVar.mo50207a(view, i - 1);
        }
    }

    /* renamed from: b */
    public final void mo80642b(int i, boolean z) {
        C1352v vVar;
        C1352v vVar2 = null;
        if (this.f119123a > 0 && this.f119123a < getItemCount()) {
            RecyclerView recyclerView = this.f119124b;
            if (recyclerView != null) {
                vVar = recyclerView.mo4847f(this.f119123a);
            } else {
                vVar = null;
            }
            if (vVar instanceof C47186c) {
                ((C47186c) vVar).mo94433a(false);
            } else {
                notifyItemChanged(this.f119123a);
            }
        }
        this.f119123a = i + 1;
        if (this.f119123a < getItemCount()) {
            RecyclerView recyclerView2 = this.f119124b;
            if (recyclerView2 != null) {
                vVar2 = recyclerView2.mo4847f(this.f119123a);
            }
            if (vVar2 instanceof C47186c) {
                ((C47186c) vVar2).mo94433a(true);
            }
        }
    }

    public void onBindViewHolder(C1352v vVar, int i) {
        MusicModel musicModel;
        boolean z;
        boolean z2;
        C52711k.m112240b(vVar, "viewHolder");
        if (vVar instanceof C47186c) {
            boolean z3 = false;
            if (i >= this.f119130h) {
                this.f119137p = false;
            }
            C47186c cVar = (C47186c) vVar;
            List<? extends MusicModel> list = this.f119134l;
            if (list != null) {
                musicModel = (MusicModel) C52575l.m112118a(list, i - 1);
            } else {
                musicModel = null;
            }
            if (this.f119123a == i) {
                z = true;
            } else {
                z = false;
            }
            if (this.f119123a == this.f119136o || this.f119136o != i) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.f119129g && this.f119137p) {
                z3 = true;
            }
            cVar.mo94432a(musicModel, z, z2, z3);
        }
    }

    public C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        C52711k.m112240b(viewGroup, "viewGroup");
        if (getItemViewType(i) != 0) {
            int i3 = this.f119133k;
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            C52711k.m112236a((Object) from, "LayoutInflater.from(viewGroup.context)");
            return new C47186c(C47188a.m102448a(i3, from, viewGroup), this);
        }
        int i4 = this.f119133k;
        LayoutInflater from2 = LayoutInflater.from(viewGroup.getContext());
        C52711k.m112236a((Object) from2, "LayoutInflater.from(viewGroup.context)");
        C52711k.m112240b(from2, "inflater");
        C52711k.m112240b(viewGroup, "parent");
        if (i4 == 0) {
            i2 = R.layout.fq;
        } else {
            i2 = R.layout.fr;
        }
        View inflate = from2.inflate(i2, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(if (mus…th_search, parent, false)");
        return new C47189d(inflate, this.f119133k, this);
    }

    public C47182b(int i, List<? extends MusicModel> list, C24441j jVar) {
        C52711k.m112240b(jVar, "onItemClickListener");
        this.f119133k = i;
        this.f119134l = list;
        this.f119135m = jVar;
    }
}
