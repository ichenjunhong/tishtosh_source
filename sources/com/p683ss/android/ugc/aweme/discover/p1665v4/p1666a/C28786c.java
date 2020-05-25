package com.p683ss.android.ugc.aweme.discover.p1665v4.p1666a;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.p051e.C1208c.C1212c;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.ext.list.p744a.C11848e.C11850b;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p747b.C11959h;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder.DiscoverV4BannerViewHolder;
import com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder.DiscoverV4CoverViewHolder;
import com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder.DiscoverV4PlayListVideoViewHolder;
import com.p683ss.android.ugc.aweme.playlist.p2057a.C38916a;
import com.p683ss.android.ugc.aweme.playlist.p2057a.C38923d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2643g.C52733a;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.a.c */
public final class C28786c extends C38916a {

    /* renamed from: c */
    static final /* synthetic */ C52767h[] f75468c = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28786c.class), "trendingCellHeight", "getTrendingCellHeight()F"))};

    /* renamed from: f */
    public static final C28787a f75469f = new C28787a(null);

    /* renamed from: d */
    public final String f75470d;

    /* renamed from: e */
    public final String f75471e;

    /* renamed from: j */
    private final C52668f f75472j = C52732g.m112285a(new C28792f(this));

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.a.c$a */
    public static final class C28787a {
        private C28787a() {
        }

        public /* synthetic */ C28787a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.a.c$b */
    public static final class C28788b extends C1212c<Object> {
        /* renamed from: b */
        public final boolean mo3933b(Object obj, Object obj2) {
            C52711k.m112240b(obj, "p0");
            C52711k.m112240b(obj2, "p1");
            return C52711k.m112239a(obj, obj2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo3932a(java.lang.Object r2, java.lang.Object r3) {
            /*
                r1 = this;
                java.lang.String r0 = "p0"
                p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
                java.lang.String r0 = "p1"
                p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
                boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4
                if (r0 == 0) goto L_0x003e
                boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4
                if (r0 == 0) goto L_0x003e
                com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r2 = (com.p683ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4) r2
                java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r2.awemes
                r0 = 0
                if (r2 == 0) goto L_0x0026
                java.lang.Object r2 = p2628d.p2629a.C52575l.m112140f(r2)
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r2
                if (r2 == 0) goto L_0x0026
                java.lang.String r2 = r2.getAid()
                goto L_0x0027
            L_0x0026:
                r2 = r0
            L_0x0027:
                com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r3 = (com.p683ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4) r3
                java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = r3.awemes
                if (r3 == 0) goto L_0x0039
                java.lang.Object r3 = p2628d.p2629a.C52575l.m112140f(r3)
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r3
                if (r3 == 0) goto L_0x0039
                java.lang.String r0 = r3.getAid()
            L_0x0039:
                boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r0)
                return r2
            L_0x003e:
                boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r3)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1665v4.p1666a.C28786c.C28788b.mo3932a(java.lang.Object, java.lang.Object):boolean");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.a.c$c */
    static final class C28789c extends C52712l implements C52671b<ViewGroup, DiscoverV4BannerViewHolder> {

        /* renamed from: a */
        public static final C28789c f75473a = new C28789c();

        C28789c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "it");
            return new DiscoverV4BannerViewHolder(viewGroup, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.a.c$d */
    static final class C28790d extends C52712l implements C52671b<ViewGroup, DiscoverV4PlayListVideoViewHolder<DiscoverPlayListStructV4>> {

        /* renamed from: a */
        final /* synthetic */ C28786c f75474a;

        C28790d(C28786c cVar) {
            this.f75474a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "it");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bhy, viewGroup, false);
            C52711k.m112236a((Object) inflate, "LayoutInflater.from(it.c…over_v4_video, it, false)");
            return new DiscoverV4PlayListVideoViewHolder(inflate, C52733a.m112277a(this.f75474a.mo78989l()), this.f75474a.f75470d, this.f75474a.f75471e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.a.c$e */
    static final class C28791e extends C52712l implements C52671b<ViewGroup, DiscoverV4CoverViewHolder<DiscoverPlayListStructV4>> {

        /* renamed from: a */
        final /* synthetic */ C28786c f75475a;

        C28791e(C28786c cVar) {
            this.f75475a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "it");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bhu, viewGroup, false);
            C52711k.m112236a((Object) inflate, "LayoutInflater.from(it.c…over_v4_cover, it, false)");
            return new DiscoverV4CoverViewHolder(inflate, C52733a.m112277a(this.f75475a.mo78989l()), this.f75475a.f75470d, this.f75475a.f75471e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.a.c$f */
    static final class C28792f extends C52712l implements C52670a<Float> {

        /* renamed from: a */
        final /* synthetic */ C28786c f75476a;

        C28792f(C28786c cVar) {
            this.f75476a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf((((float) this.f75476a.mo78988k()) * 11.0f) / 10.0f);
        }
    }

    /* renamed from: f */
    public final float mo58394f() {
        return ((Number) this.f75472j.getValue()).floatValue() + ((float) C23728o.m58241a(1.0d));
    }

    /* renamed from: d */
    public final List<DiscoverPlayListStructV4> mo48637d() {
        Iterable d = super.mo48637d();
        Collection arrayList = new ArrayList();
        for (Object next : d) {
            if (next instanceof DiscoverPlayListStructV4) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    /* renamed from: j */
    public final float mo58396j() {
        C1332i iVar;
        float f;
        try {
            RecyclerView recyclerView = this.f99162h;
            C1332i iVar2 = null;
            if (recyclerView != null) {
                iVar = recyclerView.getLayoutManager();
            } else {
                iVar = null;
            }
            if (iVar != null) {
                int j = ((GridLayoutManager) iVar).mo4749j();
                RecyclerView recyclerView2 = this.f99162h;
                if (recyclerView2 != null) {
                    iVar2 = recyclerView2.getLayoutManager();
                }
                if (iVar2 != null) {
                    View c = ((GridLayoutManager) iVar2).mo4736c(j);
                    if (j >= 0) {
                        if (c != null) {
                            if (!TextUtils.equals(this.f75470d, DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
                                f = (((float) (j / 2)) * mo78990m()) + 0.0f;
                            } else if (j > 0) {
                                f = (((float) ((j - 1) / 2)) * mo78990m()) + 0.0f + mo58394f();
                            } else {
                                f = 0.0f;
                            }
                            return f - c.getY();
                        }
                    }
                    return 0.0f;
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    /* renamed from: g */
    public final void mo58395g() {
        C1332i iVar;
        float f;
        C1352v vVar;
        RecyclerView recyclerView = this.f99162h;
        C1352v vVar2 = null;
        if (recyclerView != null) {
            iVar = recyclerView.getLayoutManager();
        } else {
            iVar = null;
        }
        if (iVar != null) {
            int j = ((GridLayoutManager) iVar).mo4749j();
            if (C52711k.m112239a((Object) this.f75470d, (Object) DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
                f = (mo58396j() - mo58394f()) % mo78990m();
                if (j == 0) {
                    return;
                }
            } else {
                f = mo58396j() % mo78990m();
            }
            RecyclerView recyclerView2 = this.f99162h;
            if (recyclerView2 != null) {
                vVar = recyclerView2.mo4844e(j);
            } else {
                vVar = null;
            }
            RecyclerView recyclerView3 = this.f99162h;
            if (recyclerView3 != null) {
                vVar2 = recyclerView3.mo4844e(j + 1);
            }
            if (f >= mo78990m() / 2.0f) {
                if (vVar instanceof C38923d) {
                    ((C38923d) vVar).mo58452q();
                }
                if (vVar2 instanceof C38923d) {
                    ((C38923d) vVar2).mo58452q();
                    return;
                }
            } else {
                if (vVar instanceof C38923d) {
                    ((C38923d) vVar).mo58453r();
                }
                if (vVar2 instanceof C38923d) {
                    ((C38923d) vVar2).mo58453r();
                }
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        int i2 = 0;
        if (!TextUtils.equals(this.f75470d, DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
            int i3 = i % 4;
            if (i3 == 1 || i3 == 2) {
                return 1;
            }
        } else if (i == 0) {
            return 3;
        } else {
            int i4 = (i - 1) % 4;
            if (i4 != 1 && i4 != 2) {
                return 0;
            }
            i2 = 1;
        }
        return i2;
    }

    /* renamed from: a */
    public final void mo48639a(C11959h<JediViewHolder<? extends C11796d, ?>> hVar) {
        C52711k.m112240b(hVar, "registry");
        C11959h<JediViewHolder<? extends C11796d, ?>> hVar2 = hVar;
        hVar2.mo22697a(3, null, (C52671b<? super ViewGroup, ? extends VH>) C28789c.f75473a);
        hVar2.mo22697a(1, null, (C52671b<? super ViewGroup, ? extends VH>) new C28790d<Object,Object>(this));
        hVar2.mo22697a(0, null, (C52671b<? super ViewGroup, ? extends VH>) new C28791e<Object,Object>(this));
    }

    public C28786c(C0184k kVar, C11850b bVar, String str, String str2) {
        C52711k.m112240b(kVar, "parent");
        C52711k.m112240b(bVar, "fetcher");
        C52711k.m112240b(str, "tabName");
        C52711k.m112240b(str2, "tabText");
        super(kVar, new C28788b());
        this.f75470d = str;
        this.f75471e = str2;
    }
}
