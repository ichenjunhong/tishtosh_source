package com.p683ss.android.ugc.aweme.tools.music.p2364d.p2365a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24441j;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24442k;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39533d;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.tools.music.p2364d.C47186c;
import com.p683ss.android.ugc.aweme.tools.music.p2364d.C47186c.C47188a;
import com.p683ss.android.ugc.aweme.tools.music.p2366e.C47197b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.a */
public final class C47166a extends C26840g<MusicModel> implements C24441j, C39533d {

    /* renamed from: a */
    public boolean f119074a;

    /* renamed from: b */
    public int f119075b;

    /* renamed from: c */
    public boolean f119076c;

    /* renamed from: d */
    public RecyclerView f119077d;

    /* renamed from: e */
    public ImageView f119078e;

    /* renamed from: f */
    public AnimatorSet f119079f = new AnimatorSet();

    /* renamed from: g */
    final List<Animator> f119080g = new ArrayList();

    /* renamed from: h */
    public int f119081h = 1;

    /* renamed from: i */
    public Map<String, Boolean> f119082i = new LinkedHashMap();

    /* renamed from: j */
    public C24442k f119083j;

    /* renamed from: k */
    public C24441j f119084k;

    /* renamed from: l */
    private boolean f119085l = true;

    /* renamed from: m */
    private int f119086m = -1;

    /* renamed from: y */
    private int f119087y = -1;

    /* renamed from: z */
    private final int f119088z;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.a$a */
    public static final class C47167a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C47166a f119089a;

        C47167a(C47166a aVar) {
            this.f119089a = aVar;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f119089a.f119081h = 3;
            this.f119089a.f119079f.end();
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f119089a.f119081h < 3) {
                this.f119089a.f119079f.start();
            }
        }

        public final void onAnimationStart(Animator animator) {
            this.f119089a.f119081h++;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.a$b */
    static final class C47168b<T> implements C2205y<T> {

        /* renamed from: a */
        final /* synthetic */ C47166a f119090a;

        /* renamed from: b */
        final /* synthetic */ int f119091b;

        C47168b(C47166a aVar, int i) {
            this.f119090a = aVar;
            this.f119091b = i;
        }

        public final void subscribe(C2204x<C42482c> xVar) {
            C52711k.m112240b(xVar, "it");
            new C47197b();
            C42482c a = C47197b.m102454a(this.f119090a.mo80620b(this.f119091b));
            if (a == null) {
                xVar.mo6274a(new Throwable());
                return;
            }
            C43036f.f108637b.mo87416a(a);
            xVar.mo6282a(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.a$c */
    static final class C47169c<T> implements C1710e<C42482c> {

        /* renamed from: a */
        final /* synthetic */ C52671b f119092a;

        C47169c(C52671b bVar) {
            this.f119092a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.f119092a.invoke((C42482c) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.a$d */
    static final class C47170d<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C52671b f119093a;

        C47170d(C52671b bVar) {
            this.f119093a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f119093a.invoke(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.a$e */
    public static final class C47171e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C47166a f119094a;

        public final void run() {
            C1332i iVar;
            C1352v vVar;
            C47166a aVar = this.f119094a;
            RecyclerView recyclerView = this.f119094a.f119077d;
            if (recyclerView != null) {
                iVar = recyclerView.getLayoutManager();
            } else {
                iVar = null;
            }
            if (iVar != null) {
                aVar.f119075b = ((LinearLayoutManager) iVar).mo4751l();
                int i = this.f119094a.f119075b;
                for (int i2 = this.f119094a.f119074a; i2 < i; i2++) {
                    C47166a aVar2 = this.f119094a;
                    RecyclerView recyclerView2 = this.f119094a.f119077d;
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
                        aVar2.f119080g.add(ofPropertyValuesHolder);
                    }
                }
                C47166a aVar3 = this.f119094a;
                aVar3.f119079f.playTogether(aVar3.f119080g);
                aVar3.f119079f.start();
                aVar3.f119079f.addListener(new C47167a(aVar3));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }

        C47171e(C47166a aVar) {
            this.f119094a = aVar;
        }
    }

    public final int cm_() {
        return this.f119087y;
    }

    /* renamed from: h */
    public final C1322a<?> mo80627h() {
        return this;
    }

    /* renamed from: j */
    public final int mo94410j() {
        return this.f119086m;
    }

    /* renamed from: g */
    public final void mo80625g() {
        if (this.f119079f.isRunning()) {
            this.f119079f.cancel();
        }
    }

    /* renamed from: k */
    public final MusicModel mo94411k() {
        List list = this.f70670n;
        if (list != null) {
            return (MusicModel) C52575l.m112118a(list, this.f119087y);
        }
        return null;
    }

    /* renamed from: m */
    public final void mo94413m() {
        mo80621b(-1, false);
        mo94409c(-1);
        mo80626g_(-1);
    }

    /* renamed from: n */
    private void m102400n() {
        C1352v vVar;
        if (this.f119087y >= 0) {
            RecyclerView recyclerView = this.f119077d;
            if (recyclerView != null) {
                vVar = recyclerView.mo4847f(this.f119087y);
            } else {
                vVar = null;
            }
            if (vVar instanceof C47186c) {
                ((C47186c) vVar).mo94431a();
            }
        }
    }

    /* renamed from: c */
    public final int mo48636c() {
        if (C9376b.m18558a((Collection<T>) this.f70670n)) {
            return 9;
        }
        return super.mo48636c();
    }

    public final void cn_() {
        this.f119076c = true;
        this.f119081h = 1;
        this.f119080g.clear();
        this.f119079f.cancel();
        this.f119079f.removeAllListeners();
        RecyclerView recyclerView = this.f119077d;
        if (recyclerView != null) {
            recyclerView.post(new C47171e(this));
        }
    }

    /* renamed from: l */
    public final void mo94412l() {
        C1352v vVar;
        if (this.f119087y >= 0) {
            RecyclerView recyclerView = this.f119077d;
            if (recyclerView != null) {
                vVar = recyclerView.mo4847f(this.f119087y);
            } else {
                vVar = null;
            }
            if (vVar instanceof C47186c) {
                ((C47186c) vVar).mo94434b();
            } else {
                notifyItemChanged(this.f119087y);
            }
        }
    }

    /* renamed from: c */
    public final void mo94409c(int i) {
        this.f119086m = -1;
    }

    /* renamed from: g_ */
    public final void mo80626g_(int i) {
        this.f119087y = i;
    }

    /* renamed from: e */
    private final int m102399e(int i) {
        if (this.f119074a) {
            return i - 1;
        }
        return i;
    }

    /* renamed from: a */
    public final int mo51179a(View view) {
        Context context;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        return (int) C9432q.m18687b(context, 72.0f);
    }

    /* renamed from: c */
    public final void mo54798c(boolean z) {
        super.mo54798c(z);
        if (!z) {
            ImageView imageView = this.f119078e;
            if (imageView != null) {
                imageView.clearAnimation();
            }
        }
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f119077d = recyclerView;
    }

    /* renamed from: b */
    public final MusicModel mo80620b(int i) {
        List list = this.f70670n;
        if (list != null) {
            return (MusicModel) C52575l.m112118a(list, m102399e(i));
        }
        return null;
    }

    /* renamed from: a_ */
    public final C1352v mo49730a_(ViewGroup viewGroup) {
        Context context;
        Integer num = null;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.a4v, viewGroup, false);
        this.f119078e = (ImageView) inflate.findViewById(R.id.b25);
        C1352v a_ = super.mo49730a_(viewGroup);
        View view = a_.itemView;
        if (view != null) {
            DmtStatusView dmtStatusView = (DmtStatusView) view;
            dmtStatusView.setBuilder(dmtStatusView.mo19207c().mo19228a(inflate));
            View view2 = viewGroup;
            LayoutParams layoutParams = new LayoutParams(mo51179a(view2), mo51179a(view2));
            if (viewGroup != null) {
                num = Integer.valueOf(viewGroup.getHeight());
            }
            if (num == null) {
                C52711k.m112234a();
            }
            layoutParams.bottomMargin = num.intValue() - mo51179a(view2);
            dmtStatusView.setLayoutParams(layoutParams);
            C52711k.m112236a((Object) a_, "superFooterHolder");
            return a_;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        boolean z;
        C52711k.m112240b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof C47186c) {
            C47186c cVar = (C47186c) vVar;
            cVar.getLayoutPosition();
            int adapterPosition = cVar.getAdapterPosition();
            List list = this.f70670n;
            if (list != null) {
                Collection collection = list;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    List list2 = this.f70670n;
                    if (list2 != null) {
                        MusicModel musicModel = (MusicModel) list2.get(adapterPosition);
                        if (musicModel != null) {
                            String musicId = musicModel.getMusicId();
                            if (musicId != null) {
                                if (this.f119082i.get(musicId) == null || C52711k.m112239a((Object) (Boolean) this.f119082i.get(musicId), (Object) Boolean.valueOf(false))) {
                                    this.f119082i.put(musicId, Boolean.valueOf(true));
                                    C24442k kVar = this.f119083j;
                                    if (kVar != null) {
                                        kVar.mo50208a(adapterPosition);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51182a(C1352v vVar) {
        Context context;
        super.mo51182a(vVar);
        ImageView imageView = this.f119078e;
        if (imageView != null) {
            ImageView imageView2 = this.f119078e;
            if (imageView2 != null) {
                context = imageView2.getContext();
            } else {
                context = null;
            }
            imageView.startAnimation(AnimationUtils.loadAnimation(context, R.anim.fu));
        }
    }

    /* renamed from: a */
    public final void mo80614a(int i, boolean z) {
        mo94412l();
        this.f119087y = i;
        if (z) {
            m102400n();
        }
    }

    public C47166a(int i, C24441j jVar) {
        C52711k.m112240b(jVar, "onItemClickListener");
        this.f119088z = i;
        this.f119084k = jVar;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "viewGroup");
        int i2 = this.f119088z;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C52711k.m112236a((Object) from, "LayoutInflater.from(viewGroup.context)");
        return new C47186c(C47188a.m102448a(i2, from, viewGroup), this);
    }

    /* renamed from: a */
    public final void mo80613a(int i, C52671b<? super C42482c, C52860x> bVar) {
        C52711k.m112240b(bVar, "afterTransform");
        C2201v.m6601a((C2205y<T>) new C47168b<T>(this, i)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C47169c<Object>(bVar), (C1710e<? super Throwable>) new C47170d<Object>(bVar));
    }

    /* renamed from: b */
    public final void mo80621b(int i, boolean z) {
        C1352v vVar;
        int itemCount = getItemCount() - 1;
        int i2 = this.f119086m;
        C1352v vVar2 = null;
        if (i2 >= 0 && itemCount >= i2) {
            RecyclerView recyclerView = this.f119077d;
            if (recyclerView != null) {
                vVar = recyclerView.mo4847f(this.f119086m);
            } else {
                vVar = null;
            }
            if (vVar instanceof C47186c) {
                ((C47186c) vVar).mo94433a(false);
            } else {
                notifyItemChanged(this.f119086m);
            }
        }
        this.f119086m = i;
        if (this.f119086m < getItemCount()) {
            RecyclerView recyclerView2 = this.f119077d;
            if (recyclerView2 != null) {
                vVar2 = recyclerView2.mo4847f(this.f119086m);
            }
            if (vVar2 instanceof C47186c) {
                ((C47186c) vVar2).mo94433a(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        MusicModel musicModel;
        boolean z;
        boolean z2;
        C52711k.m112240b(vVar, "viewHolder");
        if (vVar instanceof C47186c) {
            boolean z3 = false;
            if (i >= this.f119075b) {
                this.f119085l = false;
            }
            C47186c cVar = (C47186c) vVar;
            List list = this.f70670n;
            if (list != null) {
                musicModel = (MusicModel) C52575l.m112118a(list, m102399e(i));
            } else {
                musicModel = null;
            }
            if (this.f119086m == i) {
                z = true;
            } else {
                z = false;
            }
            if (this.f119086m == this.f119087y || this.f119087y != i) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.f119076c && this.f119085l) {
                z3 = true;
            }
            cVar.mo94432a(musicModel, z, z2, z3);
        }
    }

    /* renamed from: a */
    public final void mo50207a(View view, int i) {
        C52711k.m112240b(view, "view");
        C24441j jVar = this.f119084k;
        if (jVar != null) {
            jVar.mo50207a(view, m102399e(i));
        }
    }
}
