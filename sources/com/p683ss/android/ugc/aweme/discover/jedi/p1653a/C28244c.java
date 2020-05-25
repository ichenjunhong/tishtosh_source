package com.p683ss.android.ugc.aweme.discover.jedi.p1653a;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.jedi.arch.ext.list.C11837a;
import com.bytedance.jedi.arch.ext.list.C11837a.C11838a;
import com.bytedance.jedi.arch.ext.list.p744a.C11841b;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.common.p1589a.C26838e;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.discover.abtest.GeneralRelatedSearchCardStyle;
import com.p683ss.android.ugc.aweme.discover.abtest.GeneralSearchLoadMoreRemains;
import com.p683ss.android.ugc.aweme.discover.adapter.C27805al;
import com.p683ss.android.ugc.aweme.discover.adapter.C27814am;
import com.p683ss.android.ugc.aweme.discover.helper.C28207o;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28333l;
import com.p683ss.android.ugc.aweme.discover.mixfeed.p1654a.C28301a;
import com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder.C28350a;
import com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder.C28350a.C28351a;
import com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder.C28352b;
import com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder.C28354c;
import com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder.C28356d;
import com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder.C28361e;
import com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder.C28365g.C28368a;
import com.p683ss.android.ugc.aweme.discover.viewholder.SearchRecommendCellBViewHolder;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31854k;
import com.p683ss.android.ugc.aweme.search.C41431k;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.search.p2122b.C41406a;
import com.p683ss.android.ugc.aweme.search.p2122b.C41407b;
import com.p683ss.android.ugc.aweme.search.performance.C41450g;
import com.p683ss.android.ugc.aweme.search.performance.C41450g.C41452b;
import com.p683ss.android.ugc.aweme.search.performance.C41454h;
import com.p683ss.android.ugc.aweme.search.performance.C41454h.C41456a;
import com.p683ss.android.ugc.aweme.search.performance.C41457i;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.a.c */
public final class C28244c extends C26840g<C28333l> implements C11837a<C28333l>, C41456a {

    /* renamed from: f */
    public static final C28246a f74119f = new C28246a(null);

    /* renamed from: a */
    public final C41454h f74120a = new C41454h(this.f74126h, this);

    /* renamed from: b */
    public final C41407b f74121b;

    /* renamed from: c */
    public C28301a f74122c;

    /* renamed from: d */
    public List<String> f74123d;

    /* renamed from: e */
    public C41440e f74124e;

    /* renamed from: g */
    private final C11841b<C28333l> f74125g;

    /* renamed from: h */
    private final RecyclerView f74126h;

    /* renamed from: i */
    private C24579d f74127i;

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.a.c$a */
    public static final class C28246a {
        private C28246a() {
        }

        public /* synthetic */ C28246a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.a.c$b */
    static final class C28247b implements C28368a {

        /* renamed from: a */
        final /* synthetic */ C28244c f74131a;

        /* renamed from: b */
        final /* synthetic */ SearchRecommendCellBViewHolder f74132b;

        C28247b(C28244c cVar, SearchRecommendCellBViewHolder searchRecommendCellBViewHolder) {
            this.f74131a = cVar;
            this.f74132b = searchRecommendCellBViewHolder;
        }

        /* renamed from: a */
        public final void mo56248a() {
            C28301a aVar = this.f74131a.f74122c;
            if (aVar != null) {
                aVar.mo56698d(this.f74132b.f75732f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.a.c$c */
    public static final class C28248c extends C1352v {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f74133a;

        C28248c(ViewGroup viewGroup, View view) {
            this.f74133a = viewGroup;
            super(view);
        }
    }

    /* renamed from: a */
    public final void mo22590a(List<? extends C28333l> list, C52670a<C52860x> aVar) {
        C52711k.m112240b(list, "list");
    }

    public final C11841b<C28333l> aH_() {
        return this.f74125g;
    }

    /* renamed from: g */
    public final boolean mo56663g() {
        if (this.f74122c != null) {
            return true;
        }
        return false;
    }

    public final int getItemCount() {
        return super.getItemCount();
    }

    /* renamed from: j */
    private final boolean m67158j() {
        boolean z;
        if (this.f70670n == null || this.f70670n.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        int size = this.f70670n.size();
        int i = 0;
        while (i < size) {
            int a = mo48641a(i);
            if (a == 144) {
                i++;
            } else if (a == 16) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C1352v mo56661b(ViewGroup viewGroup) {
        C28361e eVar = new C28361e(C41457i.f105090b.mo84196a(viewGroup, R.layout.bt7), viewGroup.getContext(), false);
        C52711k.m112236a((Object) eVar, "SearchMixUserViewHolder.create(parent)");
        return eVar;
    }

    /* renamed from: a */
    public final void mo50303a(List<? extends C28333l> list) {
        super.mo50303a(list);
        if (list == null) {
            list = new ArrayList<>();
            mo54798c(false);
        }
        this.f74121b.mo84080a();
        this.f70670n = list;
        notifyDataSetChanged();
        C28301a aVar = this.f74122c;
        if (aVar != null) {
            aVar.f74226d = m67158j();
        }
        C28301a aVar2 = this.f74122c;
        if (aVar2 != null) {
            aVar2.mo56693a(true);
        }
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof C26838e) {
            ((C26838e) vVar).mo54775a(true);
        }
        if (vVar instanceof SearchRecommendCellBViewHolder) {
            SearchRecommendCellBViewHolder searchRecommendCellBViewHolder = (SearchRecommendCellBViewHolder) vVar;
            searchRecommendCellBViewHolder.mo58504o();
            C28301a aVar = this.f74122c;
            if (aVar != null) {
                aVar.mo56692a((C31854k) searchRecommendCellBViewHolder.f75732f);
            }
        }
        if (vVar instanceof C28356d) {
            C28356d dVar = (C28356d) vVar;
            dVar.f74448c.setAttached(true);
            dVar.f74448c.setUserVisibleHint(true);
        }
    }

    public final void onViewDetachedFromWindow(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        super.onViewDetachedFromWindow(vVar);
        if (vVar instanceof C26838e) {
            ((C26838e) vVar).mo54775a(false);
        }
        if (vVar instanceof SearchRecommendCellBViewHolder) {
            C28301a aVar = this.f74122c;
            if (aVar != null) {
                aVar.mo56696c(((SearchRecommendCellBViewHolder) vVar).f75732f);
            }
            ((SearchRecommendCellBViewHolder) vVar).f75732f.mo64972m();
        }
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        C28333l lVar = (C28333l) this.f70670n.get(i);
        C52711k.m112236a((Object) lVar, "flowFeed");
        if (lVar.getFeedType() == 65280) {
            return 16;
        }
        if (lVar.getFeedType() == 65456) {
            return 128;
        }
        if (lVar.getFeedType() == 65457) {
            return 112;
        }
        if (lVar.getFeedType() == 65467) {
            return 48;
        }
        if (lVar.getFeedType() == 65465) {
            return 144;
        }
        if (lVar.getFeedType() == 65459) {
            return 80;
        }
        if (lVar.getFeedType() == 65458) {
            return 96;
        }
        return -1;
    }

    /* renamed from: e */
    public final void mo56662e(List<? extends C28333l> list) {
        boolean z;
        C52711k.m112240b(list, "searchMixFeedList");
        List<String> arrayList = new ArrayList<>();
        Iterable iterable = list;
        Collection arrayList2 = new ArrayList();
        for (Object next : iterable) {
            if (((C28333l) next).getFeedType() == 65280) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        for (C28333l aweme : (List) arrayList2) {
            Aweme aweme2 = aweme.getAweme();
            if (aweme2 != null) {
                String aid = aweme2.getAid();
                C52711k.m112236a((Object) aid, "it.aid");
                arrayList.add(aid);
            }
        }
        this.f74123d = arrayList;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo22589a(int i, boolean z) {
        return (C28333l) C11838a.m24186a((C11837a<T>) this, i, z);
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        if (i == 16) {
            SearchRecommendCellBViewHolder searchRecommendCellBViewHolder = new SearchRecommendCellBViewHolder(C41457i.f105090b.mo84196a(viewGroup, C41431k.f105004a.getVideoLayout()), "", this.f74127i, true);
            searchRecommendCellBViewHolder.f75733g = true;
            searchRecommendCellBViewHolder.f75731e = "6frames";
            searchRecommendCellBViewHolder.f75730d = false;
            searchRecommendCellBViewHolder.mo58497a((C28368a) new C28247b(this, searchRecommendCellBViewHolder));
            return searchRecommendCellBViewHolder;
        } else if (i == 48) {
            C52711k.m112240b(viewGroup, "parent");
            return new C28356d(C41457i.f105090b.mo84196a(viewGroup, R.layout.bsl), viewGroup);
        } else if (i != 80) {
            if (i == 96) {
                C1352v vVar = (C1352v) this.f74120a.f105084c.poll();
                if (vVar != null) {
                    return vVar;
                }
                return mo56661b(viewGroup);
            } else if (i == 112) {
                C28354c cVar = new C28354c(C41457i.f105090b.mo84196a(viewGroup, R.layout.bt5), viewGroup.getContext(), false);
                C52711k.m112236a((Object) cVar, "SearchMixMusicViewHolder.create(parent)");
                return cVar;
            } else if (i == 128) {
                C28352b bVar = new C28352b(C41457i.f105090b.mo84196a(viewGroup, R.layout.bt5), viewGroup.getContext(), false);
                C52711k.m112236a((Object) bVar, "SearchMixChallengeViewHolder.create(parent)");
                return bVar;
            } else if (i != 144) {
                return new C28248c(viewGroup, new View(viewGroup.getContext()));
            } else {
                C28351a aVar = C28350a.f74439d;
                C52711k.m112240b(viewGroup, "parent");
                C52711k.m112240b(viewGroup, "parent");
                return new C28350a(C41457i.f105090b.mo84196a(viewGroup, R.layout.bt9));
            }
        } else if (C10181b.m20511a().mo18168a(GeneralRelatedSearchCardStyle.class, true, "general_related_search_style", 31744, 0) == 1) {
            RecyclerView recyclerView = this.f74126h;
            C52711k.m112240b(viewGroup, "parent");
            C52711k.m112240b(recyclerView, "rv");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bs_, viewGroup, false);
            C52711k.m112236a((Object) inflate, "view");
            return new C27814am(inflate, recyclerView);
        } else {
            C52711k.m112240b(viewGroup, "parent");
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bs8, viewGroup, false);
            C52711k.m112236a((Object) inflate2, "itemView");
            return new C27805al(inflate2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:155:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0217 A[Catch:{ all -> 0x049b }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48222a(android.support.p043v7.widget.RecyclerView.C1352v r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            java.lang.String r3 = "holder"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r3)
            java.util.List r3 = r1.f70670n
            java.lang.Object r3 = r3.get(r2)
            com.ss.android.ugc.aweme.discover.mixfeed.l r3 = (com.p683ss.android.ugc.aweme.discover.mixfeed.C28333l) r3
            int r4 = r1.mo48641a(r2)
            r5 = 16
            r7 = 144(0x90, float:2.02E-43)
            r8 = 1
            r9 = 0
            if (r4 == r5) goto L_0x0428
            r5 = 48
            if (r4 == r5) goto L_0x0333
            r5 = 80
            if (r4 == r5) goto L_0x0155
            r5 = 96
            if (r4 == r5) goto L_0x00fd
            r5 = 112(0x70, float:1.57E-43)
            if (r4 == r5) goto L_0x00af
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L_0x0072
            if (r4 == r7) goto L_0x0039
        L_0x0035:
            r5 = 144(0x90, float:2.02E-43)
            goto L_0x040b
        L_0x0039:
            com.ss.android.ugc.aweme.discover.mixfeed.viewholder.a r0 = (com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder.C28350a) r0     // Catch:{ all -> 0x049b }
            java.lang.String r5 = "mixFeed"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)     // Catch:{ all -> 0x049b }
            java.lang.String r5 = r3.f74348a     // Catch:{ all -> 0x049b }
            java.lang.String r8 = "mixFeed.customContent"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r8)     // Catch:{ all -> 0x049b }
            java.lang.String r8 = "title"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r8)     // Catch:{ all -> 0x049b }
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.f74440c     // Catch:{ all -> 0x049b }
            if (r0 == 0) goto L_0x0055
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x049b }
            r0.setText(r5)     // Catch:{ all -> 0x049b }
        L_0x0055:
            if (r4 == r7) goto L_0x0071
            com.ss.android.ugc.aweme.search.model.e r0 = r1.f74124e
            com.ss.android.ugc.aweme.discover.f.c r0 = com.p683ss.android.ugc.aweme.discover.p1644f.C28116e.m66923a(r0)
            r0.mo56521d(r4)
            com.ss.android.ugc.aweme.search.b.b r0 = r1.f74121b
            int r3 = r3.f74344J
            if (r3 > 0) goto L_0x006b
            int r6 = r16.mo48636c()
            goto L_0x006e
        L_0x006b:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x006e:
            r0.mo84081a(r2, r6)
        L_0x0071:
            return
        L_0x0072:
            com.ss.android.ugc.aweme.discover.mixfeed.viewholder.b r0 = (com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder.C28352b) r0     // Catch:{ all -> 0x049b }
            java.lang.String r5 = "mixFeed"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)     // Catch:{ all -> 0x049b }
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchChallenge> r5 = r3.f74354g     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.search.model.e r8 = r1.f74124e     // Catch:{ all -> 0x049b }
            boolean r9 = r3.f74373z     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.discover.ui.bs r10 = r0.f74441c     // Catch:{ all -> 0x049b }
            if (r10 == 0) goto L_0x0090
            com.ss.android.ugc.aweme.discover.ui.bs r10 = r0.f74441c     // Catch:{ all -> 0x049b }
            int r11 = r0.getAdapterPosition()     // Catch:{ all -> 0x049b }
            r10.f75112a = r11     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.discover.ui.bs r10 = r0.f74441c     // Catch:{ all -> 0x049b }
            r10.mo58287a(r5, r8, r9)     // Catch:{ all -> 0x049b }
        L_0x0090:
            r0.f74442d = r5     // Catch:{ all -> 0x049b }
            if (r4 == r7) goto L_0x00ae
            com.ss.android.ugc.aweme.search.model.e r0 = r1.f74124e
            com.ss.android.ugc.aweme.discover.f.c r0 = com.p683ss.android.ugc.aweme.discover.p1644f.C28116e.m66923a(r0)
            r0.mo56521d(r4)
            com.ss.android.ugc.aweme.search.b.b r0 = r1.f74121b
            int r3 = r3.f74344J
            if (r3 > 0) goto L_0x00a8
            int r6 = r16.mo48636c()
            goto L_0x00ab
        L_0x00a8:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x00ab:
            r0.mo84081a(r2, r6)
        L_0x00ae:
            return
        L_0x00af:
            com.ss.android.ugc.aweme.discover.mixfeed.viewholder.c r0 = (com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder.C28354c) r0     // Catch:{ all -> 0x049b }
            java.lang.String r5 = "mixFeed"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)     // Catch:{ all -> 0x049b }
            java.util.List<com.ss.android.ugc.aweme.music.model.Music> r5 = r3.f74353f     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.search.model.e r9 = r1.f74124e     // Catch:{ all -> 0x049b }
            boolean r10 = r3.f74373z     // Catch:{ all -> 0x049b }
            boolean r11 = com.bytedance.common.utility.p522b.C9376b.m18558a(r5)     // Catch:{ all -> 0x049b }
            if (r11 != 0) goto L_0x00cf
            int r11 = r5.size()     // Catch:{ all -> 0x049b }
            int r11 = r11 - r8
            java.lang.Object r8 = r5.get(r11)     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.music.model.Music r8 = (com.p683ss.android.ugc.aweme.music.model.Music) r8     // Catch:{ all -> 0x049b }
            r0.f74445d = r8     // Catch:{ all -> 0x049b }
        L_0x00cf:
            com.ss.android.ugc.aweme.discover.ui.bw r8 = r0.f74444c     // Catch:{ all -> 0x049b }
            if (r8 == 0) goto L_0x00e0
            com.ss.android.ugc.aweme.discover.ui.bw r8 = r0.f74444c     // Catch:{ all -> 0x049b }
            r8.mo58287a(r5, r9, r10)     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.discover.ui.bw r5 = r0.f74444c     // Catch:{ all -> 0x049b }
            int r0 = r0.getAdapterPosition()     // Catch:{ all -> 0x049b }
            r5.f75126a = r0     // Catch:{ all -> 0x049b }
        L_0x00e0:
            if (r4 == r7) goto L_0x00fc
            com.ss.android.ugc.aweme.search.model.e r0 = r1.f74124e
            com.ss.android.ugc.aweme.discover.f.c r0 = com.p683ss.android.ugc.aweme.discover.p1644f.C28116e.m66923a(r0)
            r0.mo56521d(r4)
            com.ss.android.ugc.aweme.search.b.b r0 = r1.f74121b
            int r3 = r3.f74344J
            if (r3 > 0) goto L_0x00f6
            int r6 = r16.mo48636c()
            goto L_0x00f9
        L_0x00f6:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x00f9:
            r0.mo84081a(r2, r6)
        L_0x00fc:
            return
        L_0x00fd:
            com.ss.android.ugc.aweme.discover.model.SearchMixUserData r5 = new com.ss.android.ugc.aweme.discover.model.SearchMixUserData     // Catch:{ all -> 0x049b }
            r5.<init>()     // Catch:{ all -> 0x049b }
            java.lang.String r8 = "mixFeed"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r8)     // Catch:{ all -> 0x049b }
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchUser> r8 = r3.f74349b     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.discover.model.SearchMixUserData r5 = r5.setUsers(r8)     // Catch:{ all -> 0x049b }
            boolean r8 = r3.f74355h     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.discover.model.SearchMixUserData r5 = r5.setHasTopUser(r8)     // Catch:{ all -> 0x049b }
            java.lang.String r8 = "searchMixUserData"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r8)     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.commercialize.model.ae r8 = r3.f74335A     // Catch:{ all -> 0x049b }
            r5.setAd(r8)     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.discover.mixfeed.viewholder.e r0 = (com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder.C28361e) r0     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.search.model.e r8 = r1.f74124e     // Catch:{ all -> 0x049b }
            boolean r9 = r3.f74373z     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.discover.ui.SearchMixUserCell r10 = r0.f74459c     // Catch:{ all -> 0x049b }
            if (r10 == 0) goto L_0x0134
            com.ss.android.ugc.aweme.discover.ui.SearchMixUserCell r10 = r0.f74459c     // Catch:{ all -> 0x049b }
            int r11 = r0.getAdapterPosition()     // Catch:{ all -> 0x049b }
            r10.f74828k = r11     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.discover.ui.SearchMixUserCell r10 = r0.f74459c     // Catch:{ all -> 0x049b }
            r10.mo58112a(r5, r8, r9)     // Catch:{ all -> 0x049b }
        L_0x0134:
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchUser> r5 = r5.users     // Catch:{ all -> 0x049b }
            r0.f74460d = r5     // Catch:{ all -> 0x049b }
            if (r4 == r7) goto L_0x0154
            com.ss.android.ugc.aweme.search.model.e r0 = r1.f74124e
            com.ss.android.ugc.aweme.discover.f.c r0 = com.p683ss.android.ugc.aweme.discover.p1644f.C28116e.m66923a(r0)
            r0.mo56521d(r4)
            com.ss.android.ugc.aweme.search.b.b r0 = r1.f74121b
            int r3 = r3.f74344J
            if (r3 > 0) goto L_0x014e
            int r6 = r16.mo48636c()
            goto L_0x0151
        L_0x014e:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x0151:
            r0.mo84081a(r2, r6)
        L_0x0154:
            return
        L_0x0155:
            com.bytedance.ies.abmock.b r10 = com.bytedance.ies.abmock.C10181b.m20511a()     // Catch:{ all -> 0x049b }
            java.lang.Class<com.ss.android.ugc.aweme.discover.abtest.GeneralRelatedSearchCardStyle> r11 = com.p683ss.android.ugc.aweme.discover.abtest.GeneralRelatedSearchCardStyle.class
            r12 = 1
            java.lang.String r13 = "general_related_search_style"
            r14 = 31744(0x7c00, float:4.4483E-41)
            r15 = 0
            int r5 = r10.mo18168a(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x049b }
            r10 = 8
            if (r5 != r8) goto L_0x02be
            com.ss.android.ugc.aweme.discover.adapter.am r0 = (com.p683ss.android.ugc.aweme.discover.adapter.C27814am) r0     // Catch:{ all -> 0x049b }
            java.lang.String r5 = "mixFeed"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.search.model.e r5 = r1.f74124e     // Catch:{ all -> 0x049b }
            java.lang.String r8 = "mixFeed"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r8)     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob r8 = r3.f74337C     // Catch:{ all -> 0x049b }
            r0.f73072a = r8     // Catch:{ all -> 0x049b }
            r0.f73073b = r5     // Catch:{ all -> 0x049b }
            java.util.List<com.ss.android.ugc.aweme.discover.model.RelatedSearchWordItem> r5 = r3.f74357j     // Catch:{ all -> 0x049b }
            r8 = r5
            java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ all -> 0x049b }
            boolean r8 = com.bytedance.common.utility.p522b.C9376b.m18558a(r8)     // Catch:{ all -> 0x049b }
            if (r8 == 0) goto L_0x018f
            android.view.View r0 = r0.itemView     // Catch:{ all -> 0x049b }
            com.p683ss.android.ugc.aweme.base.utils.C23729p.m58257a(r0, r10)     // Catch:{ all -> 0x049b }
            goto L_0x0035
        L_0x018f:
            java.lang.String r8 = "list"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r8)     // Catch:{ all -> 0x049b }
            android.widget.LinearLayout r8 = r0.f73074c     // Catch:{ all -> 0x049b }
            r8.removeAllViews()     // Catch:{ all -> 0x049b }
            boolean r8 = com.p683ss.android.ugc.aweme.search.p2126f.C41423a.f104992b     // Catch:{ all -> 0x049b }
            r10 = 1099956224(0x41900000, float:18.0)
            if (r8 == 0) goto L_0x01a2
            r8 = 309(0x135, float:4.33E-43)
            goto L_0x01d2
        L_0x01a2:
            android.support.v7.widget.RecyclerView r8 = r0.f73076e     // Catch:{ all -> 0x049b }
            int r11 = r2 + -1
            android.support.v7.widget.RecyclerView$v r8 = r8.mo4844e(r11)     // Catch:{ all -> 0x049b }
            if (r8 != 0) goto L_0x01b7
            int r8 = r5.size()     // Catch:{ all -> 0x049b }
            r11 = 5
            int r8 = java.lang.Math.min(r8, r11)     // Catch:{ all -> 0x049b }
            r13 = r8
            goto L_0x01ef
        L_0x01b7:
            android.view.View r11 = r0.itemView     // Catch:{ all -> 0x049b }
            java.lang.String r12 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)     // Catch:{ all -> 0x049b }
            android.content.Context r11 = r11.getContext()     // Catch:{ all -> 0x049b }
            android.view.View r8 = r8.itemView     // Catch:{ all -> 0x049b }
            java.lang.String r12 = "lastViewHolder.itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r12)     // Catch:{ all -> 0x049b }
            int r8 = r8.getMeasuredHeight()     // Catch:{ all -> 0x049b }
            float r8 = (float) r8     // Catch:{ all -> 0x049b }
            int r8 = com.bytedance.common.utility.C9432q.m18692c(r11, r8)     // Catch:{ all -> 0x049b }
        L_0x01d2:
            float r8 = (float) r8     // Catch:{ all -> 0x049b }
            r11 = 1114112000(0x42680000, float:58.0)
            float r8 = r8 - r11
            r11 = r5
            java.util.Collection r11 = (java.util.Collection) r11     // Catch:{ all -> 0x049b }
            int r11 = r11.size()     // Catch:{ all -> 0x049b }
            r12 = r8
            r8 = 0
            r13 = 0
        L_0x01e0:
            if (r8 >= r11) goto L_0x01ef
            r14 = 1107296256(0x42000000, float:32.0)
            float r12 = r12 - r14
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 < 0) goto L_0x01ef
            int r13 = r13 + 1
            float r12 = r12 - r10
            int r8 = r8 + 1
            goto L_0x01e0
        L_0x01ef:
            java.util.List r5 = r5.subList(r9, r13)     // Catch:{ all -> 0x049b }
            r0.f73075d = r5     // Catch:{ all -> 0x049b }
            android.view.View r5 = r0.itemView     // Catch:{ all -> 0x049b }
            java.lang.String r8 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r8)     // Catch:{ all -> 0x049b }
            android.content.Context r5 = r5.getContext()     // Catch:{ all -> 0x049b }
            float r5 = com.bytedance.common.utility.C9432q.m18687b(r5, r10)     // Catch:{ all -> 0x049b }
            android.view.View r8 = r0.itemView     // Catch:{ all -> 0x049b }
            java.lang.String r11 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r11)     // Catch:{ all -> 0x049b }
            android.content.Context r8 = r8.getContext()     // Catch:{ all -> 0x049b }
            float r8 = com.bytedance.common.utility.C9432q.m18687b(r8, r10)     // Catch:{ all -> 0x049b }
            java.util.List<? extends com.ss.android.ugc.aweme.discover.model.RelatedSearchWordItem> r10 = r0.f73075d     // Catch:{ all -> 0x049b }
            if (r10 == 0) goto L_0x02b0
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch:{ all -> 0x049b }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x049b }
            r11 = 0
        L_0x021e:
            boolean r12 = r10.hasNext()     // Catch:{ all -> 0x049b }
            if (r12 == 0) goto L_0x02b0
            java.lang.Object r12 = r10.next()     // Catch:{ all -> 0x049b }
            int r14 = r11 + 1
            if (r11 >= 0) goto L_0x022f
            p2628d.p2629a.C52575l.m112100b()     // Catch:{ all -> 0x049b }
        L_0x022f:
            com.ss.android.ugc.aweme.discover.model.RelatedSearchWordItem r12 = (com.p683ss.android.ugc.aweme.discover.model.RelatedSearchWordItem) r12     // Catch:{ all -> 0x049b }
            android.widget.LinearLayout r15 = r0.f73074c     // Catch:{ all -> 0x049b }
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15     // Catch:{ all -> 0x049b }
            java.lang.String r6 = "parent"
            p2628d.p2639f.p2641b.C52711k.m112240b(r15, r6)     // Catch:{ all -> 0x049b }
            java.lang.String r6 = "item"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r6)     // Catch:{ all -> 0x049b }
            android.view.View r6 = r0.itemView     // Catch:{ all -> 0x049b }
            java.lang.String r7 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)     // Catch:{ all -> 0x049b }
            android.content.Context r6 = r6.getContext()     // Catch:{ all -> 0x049b }
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)     // Catch:{ all -> 0x049b }
            r7 = 2132215739(0x7f1707bb, float:2.0075357E38)
            android.view.View r6 = r6.inflate(r7, r15, r9)     // Catch:{ all -> 0x049b }
            r7 = 2132023851(0x7f141a2b, float:1.9686162E38)
            android.view.View r7 = r6.findViewById(r7)     // Catch:{ all -> 0x049b }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ all -> 0x049b }
            java.lang.String r15 = "word"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r15)     // Catch:{ all -> 0x049b }
            java.lang.String r15 = r12.getRelatedWord()     // Catch:{ all -> 0x049b }
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15     // Catch:{ all -> 0x049b }
            r7.setText(r15)     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.discover.adapter.am$c r7 = new com.ss.android.ugc.aweme.discover.adapter.am$c     // Catch:{ all -> 0x049b }
            r7.<init>(r0, r12, r11)     // Catch:{ all -> 0x049b }
            android.view.View$OnTouchListener r7 = (android.view.View.OnTouchListener) r7     // Catch:{ all -> 0x049b }
            r6.setOnTouchListener(r7)     // Catch:{ all -> 0x049b }
            java.lang.String r7 = "root"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)     // Catch:{ all -> 0x049b }
            if (r14 != r13) goto L_0x0292
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()     // Catch:{ all -> 0x049b }
            if (r7 == 0) goto L_0x028a
            android.widget.LinearLayout$LayoutParams r7 = (android.widget.LinearLayout.LayoutParams) r7     // Catch:{ all -> 0x049b }
            int r11 = (int) r8     // Catch:{ all -> 0x049b }
            r7.setMargins(r9, r9, r9, r11)     // Catch:{ all -> 0x049b }
            goto L_0x029e
        L_0x028a:
            d.u r0 = new d.u     // Catch:{ all -> 0x049b }
            java.lang.String r5 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            r0.<init>(r5)     // Catch:{ all -> 0x049b }
            throw r0     // Catch:{ all -> 0x049b }
        L_0x0292:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()     // Catch:{ all -> 0x049b }
            if (r7 == 0) goto L_0x02a8
            android.widget.LinearLayout$LayoutParams r7 = (android.widget.LinearLayout.LayoutParams) r7     // Catch:{ all -> 0x049b }
            int r11 = (int) r5     // Catch:{ all -> 0x049b }
            r7.setMargins(r9, r9, r9, r11)     // Catch:{ all -> 0x049b }
        L_0x029e:
            android.widget.LinearLayout r7 = r0.f73074c     // Catch:{ all -> 0x049b }
            r7.addView(r6)     // Catch:{ all -> 0x049b }
            r11 = r14
            r7 = 144(0x90, float:2.02E-43)
            goto L_0x021e
        L_0x02a8:
            d.u r0 = new d.u     // Catch:{ all -> 0x049b }
            java.lang.String r5 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            r0.<init>(r5)     // Catch:{ all -> 0x049b }
            throw r0     // Catch:{ all -> 0x049b }
        L_0x02b0:
            android.widget.LinearLayout r5 = r0.f73074c     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.discover.adapter.am$b r6 = new com.ss.android.ugc.aweme.discover.adapter.am$b     // Catch:{ all -> 0x049b }
            r6.<init>(r0)     // Catch:{ all -> 0x049b }
            java.lang.Runnable r6 = (java.lang.Runnable) r6     // Catch:{ all -> 0x049b }
            r5.post(r6)     // Catch:{ all -> 0x049b }
            goto L_0x0035
        L_0x02be:
            com.ss.android.ugc.aweme.discover.adapter.al r0 = (com.p683ss.android.ugc.aweme.discover.adapter.C27805al) r0     // Catch:{ all -> 0x049b }
            java.lang.String r5 = "mixFeed"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.search.model.e r5 = r1.f74124e     // Catch:{ all -> 0x049b }
            java.lang.String r6 = "mixFeed"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r6)     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob r6 = r3.f74337C     // Catch:{ all -> 0x049b }
            r0.f73053d = r6     // Catch:{ all -> 0x049b }
            r0.f73054e = r5     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.discover.adapter.al$c r6 = r0.f73051b     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob r7 = r3.f74337C     // Catch:{ all -> 0x049b }
            r6.f73057a = r7     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.discover.adapter.al$c r6 = r0.f73051b     // Catch:{ all -> 0x049b }
            r6.f73058b = r5     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.discover.adapter.al$c r5 = r0.f73051b     // Catch:{ all -> 0x049b }
            r5.f73059c = r2     // Catch:{ all -> 0x049b }
            java.util.List<com.ss.android.ugc.aweme.discover.model.RelatedSearchWordItem> r5 = r3.f74357j     // Catch:{ all -> 0x049b }
            java.util.Collection r5 = (java.util.Collection) r5     // Catch:{ all -> 0x049b }
            boolean r5 = com.bytedance.common.utility.p522b.C9376b.m18558a(r5)     // Catch:{ all -> 0x049b }
            if (r5 == 0) goto L_0x02f1
            android.view.View r0 = r0.itemView     // Catch:{ all -> 0x049b }
            com.p683ss.android.ugc.aweme.base.utils.C23729p.m58257a(r0, r10)     // Catch:{ all -> 0x049b }
            goto L_0x0035
        L_0x02f1:
            java.util.List<com.ss.android.ugc.aweme.discover.model.RelatedSearchWordItem> r5 = r0.f73052c     // Catch:{ all -> 0x049b }
            r5.clear()     // Catch:{ all -> 0x049b }
            java.util.List<com.ss.android.ugc.aweme.discover.model.RelatedSearchWordItem> r5 = r0.f73052c     // Catch:{ all -> 0x049b }
            java.util.List<com.ss.android.ugc.aweme.discover.model.RelatedSearchWordItem> r6 = r3.f74357j     // Catch:{ all -> 0x049b }
            java.lang.String r7 = "mixFeed.relatedWordList"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)     // Catch:{ all -> 0x049b }
            java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ all -> 0x049b }
            r5.addAll(r6)     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.discover.adapter.al$c r5 = r0.f73051b     // Catch:{ all -> 0x049b }
            java.util.List<com.ss.android.ugc.aweme.discover.model.RelatedSearchWordItem> r6 = r3.f74357j     // Catch:{ all -> 0x049b }
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ all -> 0x049b }
            boolean r7 = com.bytedance.common.utility.p522b.C9376b.m18558a(r7)     // Catch:{ all -> 0x049b }
            if (r7 != 0) goto L_0x0325
            java.util.List<com.ss.android.ugc.aweme.discover.model.RelatedSearchWordItem> r7 = r5.f73060d     // Catch:{ all -> 0x049b }
            r7.clear()     // Catch:{ all -> 0x049b }
            java.util.List<com.ss.android.ugc.aweme.discover.model.RelatedSearchWordItem> r7 = r5.f73060d     // Catch:{ all -> 0x049b }
            if (r6 != 0) goto L_0x031d
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ all -> 0x049b }
        L_0x031d:
            java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ all -> 0x049b }
            r7.addAll(r6)     // Catch:{ all -> 0x049b }
            r5.notifyDataSetChanged()     // Catch:{ all -> 0x049b }
        L_0x0325:
            android.support.v7.widget.RecyclerView r5 = r0.f73050a     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.discover.adapter.al$e r6 = new com.ss.android.ugc.aweme.discover.adapter.al$e     // Catch:{ all -> 0x049b }
            r6.<init>(r0)     // Catch:{ all -> 0x049b }
            java.lang.Runnable r6 = (java.lang.Runnable) r6     // Catch:{ all -> 0x049b }
            r5.post(r6)     // Catch:{ all -> 0x049b }
            goto L_0x0035
        L_0x0333:
            com.ss.android.ugc.aweme.discover.mixfeed.viewholder.d r0 = (com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder.C28356d) r0     // Catch:{ all -> 0x049b }
            java.lang.String r5 = "mixFeed"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.discover.model.SearchOperationInfo r5 = r3.f74368u     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.discover.model.SearchOperation r5 = r5.getOperation()     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.search.model.e r6 = r1.f74124e     // Catch:{ all -> 0x049b }
            boolean r6 = r3.f74373z     // Catch:{ all -> 0x049b }
            java.lang.String r6 = "operation"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r6)     // Catch:{ all -> 0x049b }
            java.lang.String r6 = r5.getDocId()     // Catch:{ all -> 0x049b }
            if (r6 != 0) goto L_0x0351
            java.lang.String r6 = ""
        L_0x0351:
            r0.f74451f = r6     // Catch:{ all -> 0x049b }
            boolean r6 = r5.getRecorded()     // Catch:{ all -> 0x049b }
            r7 = 2
            if (r6 != 0) goto L_0x0367
            com.ss.android.ugc.aweme.discover.mixfeed.viewholder.d$c r6 = new com.ss.android.ugc.aweme.discover.mixfeed.viewholder.d$c     // Catch:{ all -> 0x049b }
            r6.<init>(r0, r7, r5)     // Catch:{ all -> 0x049b }
            java.util.concurrent.Callable r6 = (java.util.concurrent.Callable) r6     // Catch:{ all -> 0x049b }
            p001a.C0013i.m16a(r6)     // Catch:{ all -> 0x049b }
            r5.setRecorded(r8)     // Catch:{ all -> 0x049b }
        L_0x0367:
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r6 = r0.f74448c     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.base.model.UrlModel r8 = r5.getBanner()     // Catch:{ all -> 0x049b }
            r6.mo48930a(r8)     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r6 = r0.f74448c     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r6     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.base.model.UrlModel r8 = r5.getBanner()     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r9 = r0.f74448c     // Catch:{ all -> 0x049b }
            java.lang.String r10 = "operationPic"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)     // Catch:{ all -> 0x049b }
            com.facebook.drawee.c.d r9 = r9.getControllerListener()     // Catch:{ all -> 0x049b }
            com.p683ss.android.ugc.aweme.base.C23515d.m57672a(r6, r8, r9)     // Catch:{ all -> 0x049b }
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r0.f74449d     // Catch:{ all -> 0x049b }
            java.lang.String r8 = "operationName"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r8)     // Catch:{ all -> 0x049b }
            java.lang.String r8 = r5.getDesc()     // Catch:{ all -> 0x049b }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ all -> 0x049b }
            r6.setText(r8)     // Catch:{ all -> 0x049b }
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r0.f74449d     // Catch:{ all -> 0x049b }
            java.lang.String r8 = com.bytedance.ies.dmt.p664ui.widget.util.C10751d.f28908g     // Catch:{ all -> 0x049b }
            r6.setFontType(r8)     // Catch:{ all -> 0x049b }
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r0.f74449d     // Catch:{ all -> 0x049b }
            java.lang.String r8 = "operationName"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r8)     // Catch:{ all -> 0x049b }
            r6.setMaxLines(r7)     // Catch:{ all -> 0x049b }
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r0.f74449d     // Catch:{ all -> 0x049b }
            java.lang.String r8 = "operationName"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r8)     // Catch:{ all -> 0x049b }
            java.lang.CharSequence r6 = r6.getText()     // Catch:{ all -> 0x049b }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x049b }
            if (r6 == 0) goto L_0x03c3
            android.widget.ImageView r6 = r0.f74450e     // Catch:{ all -> 0x049b }
            java.lang.String r8 = "arrowMore"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r8)     // Catch:{ all -> 0x049b }
            r8 = 4
            r6.setVisibility(r8)     // Catch:{ all -> 0x049b }
        L_0x03c3:
            android.view.View r6 = r0.itemView     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.discover.mixfeed.viewholder.d$b r8 = new com.ss.android.ugc.aweme.discover.mixfeed.viewholder.d$b     // Catch:{ all -> 0x049b }
            r8.<init>(r0, r5, r7)     // Catch:{ all -> 0x049b }
            android.view.View$OnClickListener r8 = (android.view.View.OnClickListener) r8     // Catch:{ all -> 0x049b }
            r6.setOnClickListener(r8)     // Catch:{ all -> 0x049b }
            java.lang.String r0 = r5.getLink()     // Catch:{ all -> 0x049b }
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = r5.getLink()     // Catch:{ all -> 0x049b }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x049b }
            java.lang.String r5 = "fantasy"
            java.lang.String r6 = "parse"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r6)     // Catch:{ all -> 0x049b }
            java.lang.String r0 = r0.getHost()     // Catch:{ all -> 0x049b }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x049b }
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "show_million_pound"
            com.ss.android.ugc.aweme.app.f.d r5 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()     // Catch:{ all -> 0x049b }
            java.lang.String r6 = "enter_from"
            java.lang.String r7 = "click_search"
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r7)     // Catch:{ all -> 0x049b }
            java.lang.String r6 = "is_million_pound"
            java.lang.String r7 = "1"
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r7)     // Catch:{ all -> 0x049b }
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a     // Catch:{ all -> 0x049b }
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r5)     // Catch:{ all -> 0x049b }
            goto L_0x0035
        L_0x040b:
            if (r4 == r5) goto L_0x0427
            com.ss.android.ugc.aweme.search.model.e r0 = r1.f74124e
            com.ss.android.ugc.aweme.discover.f.c r0 = com.p683ss.android.ugc.aweme.discover.p1644f.C28116e.m66923a(r0)
            r0.mo56521d(r4)
            com.ss.android.ugc.aweme.search.b.b r0 = r1.f74121b
            int r3 = r3.f74344J
            if (r3 > 0) goto L_0x0421
            int r6 = r16.mo48636c()
            goto L_0x0424
        L_0x0421:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x0424:
            r0.mo84081a(r2, r6)
        L_0x0427:
            return
        L_0x0428:
            com.ss.android.ugc.aweme.discover.viewholder.SearchRecommendCellBViewHolder r0 = (com.p683ss.android.ugc.aweme.discover.viewholder.SearchRecommendCellBViewHolder) r0     // Catch:{ all -> 0x049b }
            java.lang.String r5 = "mixFeed"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)     // Catch:{ all -> 0x049b }
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r3.getAweme()     // Catch:{ all -> 0x049b }
            java.lang.String r6 = "mixFeed.aweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)     // Catch:{ all -> 0x049b }
            java.lang.String r5 = r5.getAid()     // Catch:{ all -> 0x049b }
            if (r5 == 0) goto L_0x0474
            java.lang.String r6 = "awemeId"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r6)     // Catch:{ all -> 0x049b }
            java.util.List<java.lang.String> r6 = r1.f74123d     // Catch:{ all -> 0x049b }
            if (r6 == 0) goto L_0x046c
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x049b }
        L_0x044b:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x049b }
            if (r7 == 0) goto L_0x0466
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x049b }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x049b }
            r10 = r5
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ all -> 0x049b }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ all -> 0x049b }
            boolean r7 = android.text.TextUtils.equals(r10, r7)     // Catch:{ all -> 0x049b }
            if (r7 == 0) goto L_0x0463
            goto L_0x0467
        L_0x0463:
            int r9 = r9 + 1
            goto L_0x044b
        L_0x0466:
            r9 = -1
        L_0x0467:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x049b }
            goto L_0x046d
        L_0x046c:
            r5 = 0
        L_0x046d:
            if (r5 == 0) goto L_0x0474
            int r5 = r5.intValue()     // Catch:{ all -> 0x049b }
            goto L_0x0475
        L_0x0474:
            r5 = r2
        L_0x0475:
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r3.getAweme()     // Catch:{ all -> 0x049b }
            r0.mo58498a(r6, r2, r5, r8)     // Catch:{ all -> 0x049b }
            r5 = 144(0x90, float:2.02E-43)
            if (r4 == r5) goto L_0x049a
            com.ss.android.ugc.aweme.search.model.e r0 = r1.f74124e
            com.ss.android.ugc.aweme.discover.f.c r0 = com.p683ss.android.ugc.aweme.discover.p1644f.C28116e.m66923a(r0)
            r0.mo56521d(r4)
            com.ss.android.ugc.aweme.search.b.b r0 = r1.f74121b
            int r3 = r3.f74344J
            if (r3 > 0) goto L_0x0494
            int r6 = r16.mo48636c()
            goto L_0x0497
        L_0x0494:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x0497:
            r0.mo84081a(r2, r6)
        L_0x049a:
            return
        L_0x049b:
            r0 = move-exception
            r5 = 144(0x90, float:2.02E-43)
            if (r4 == r5) goto L_0x04ba
            com.ss.android.ugc.aweme.search.model.e r5 = r1.f74124e
            com.ss.android.ugc.aweme.discover.f.c r5 = com.p683ss.android.ugc.aweme.discover.p1644f.C28116e.m66923a(r5)
            r5.mo56521d(r4)
            com.ss.android.ugc.aweme.search.b.b r4 = r1.f74121b
            int r3 = r3.f74344J
            if (r3 > 0) goto L_0x04b4
            int r6 = r16.mo48636c()
            goto L_0x04b7
        L_0x04b4:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x04b7:
            r4.mo84081a(r2, r6)
        L_0x04ba:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.jedi.p1653a.C28244c.mo48222a(android.support.v7.widget.RecyclerView$v, int):void");
    }

    public C28244c(RecyclerView recyclerView, C41440e eVar, C24579d dVar, C41406a aVar) {
        C52711k.m112240b(recyclerView, "mRecyclerView");
        C52711k.m112240b(dVar, "mAwemeClickListener");
        C52711k.m112240b(aVar, "loadMoreFunction");
        this.f74126h = recyclerView;
        this.f74124e = eVar;
        this.f74127i = dVar;
        if (C41450g.f105073c.mo84192a()) {
            C41450g.f105072b.submit(C41452b.f105077a);
        }
        this.f74121b = new C41407b(C10193n.m20607a().mo18200a(GeneralSearchLoadMoreRemains.class, "general_search_load_more_remains", C10181b.m20511a().mo18175c().getGeneralSearchLoadMoreRemains(), 0), aVar);
        this.f74122c = C28207o.m67120a(this.f74126h);
        C11841b bVar = new C11841b(this, new C28242a(), null, 4, null);
        this.f74125g = bVar;
    }
}
