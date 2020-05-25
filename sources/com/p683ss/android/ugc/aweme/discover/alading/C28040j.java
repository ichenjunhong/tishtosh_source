package com.p683ss.android.ugc.aweme.discover.alading;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.adapter.C27797ad;
import com.p683ss.android.ugc.aweme.discover.mob.C28372a;
import com.p683ss.android.ugc.aweme.discover.mob.C28386ag.C28387a;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27718c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30179b;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.search.C41428h;
import com.p683ss.android.ugc.aweme.search.performance.C41457i;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.j */
public class C28040j extends C28034f implements C28033e {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f73659d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28040j.class), "awemeListAdapter", "getAwemeListAdapter()Lcom/ss/android/ugc/aweme/discover/alading/AwemeCardListAdapter;"))};

    /* renamed from: c */
    private final C52668f f73660c;

    /* renamed from: e */
    public List<? extends Aweme> f73661e;

    /* renamed from: f */
    protected C27718c f73662f;

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.j$a */
    static final class C28043a extends C52712l implements C52670a<C28028b> {

        /* renamed from: a */
        final /* synthetic */ C28040j f73665a;

        /* renamed from: b */
        final /* synthetic */ C28037g f73666b;

        C28043a(C28040j jVar, C28037g gVar) {
            this.f73665a = jVar;
            this.f73666b = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f73666b.itemView;
            C52711k.m112236a((Object) view, "viewHolder.itemView");
            Context context = view.getContext();
            C52711k.m112236a((Object) context, "viewHolder.itemView.context");
            return new C28028b(context, this.f73665a, this.f73665a);
        }
    }

    /* renamed from: g */
    private C28028b m66809g() {
        return (C28028b) this.f73660c.getValue();
    }

    public void aI_() {
    }

    /* renamed from: e */
    public String mo56417e() {
        return "";
    }

    /* renamed from: f */
    public int mo56418f() {
        return -1;
    }

    /* renamed from: a */
    public final void mo56419a(List<? extends Aweme> list) {
        C52711k.m112240b(list, "data");
        C27718c cVar = this.f73662f;
        if (cVar == null) {
            C52711k.m112237a("mHeaderAndFooterWrapper");
        }
        C1322a aVar = cVar;
        C52711k.m112240b(list, "list");
        C52711k.m112240b(aVar, "adapter");
        this.f73648b.f73653a.mo4814b(0);
        C28037g gVar = this.f73648b;
        C52711k.m112240b(aVar, "adapter");
        gVar.f73656d.mo56406a(aVar);
        this.f73661e = list;
        C28028b g = m66809g();
        C52711k.m112240b(list, "value");
        g.f73637a = list;
        g.notifyDataSetChanged();
    }

    public C28040j(C28037g gVar) {
        C52711k.m112240b(gVar, "viewHolder");
        super(gVar);
        this.f73660c = C52732g.m112285a(new C28043a(this, gVar));
        C28028b g = m66809g();
        if (g != null) {
            this.f73662f = new C27718c(g);
            View a = C41457i.f105090b.mo84196a(gVar.f73653a, R.layout.bs0);
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            View view = gVar.itemView;
            C52711k.m112236a((Object) view, "viewHolder.itemView");
            layoutParams.width = (int) C9432q.m18687b(view.getContext(), 96.0f);
            View view2 = gVar.itemView;
            C52711k.m112236a((Object) view2, "viewHolder.itemView");
            layoutParams.setMargins(0, 0, (int) C9432q.m18687b(view2.getContext(), 8.0f), 0);
            a.setLayoutParams(layoutParams);
            C27718c cVar = this.f73662f;
            if (cVar == null) {
                C52711k.m112237a("mHeaderAndFooterWrapper");
            }
            cVar.mo56145a(a);
            a.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C28040j f73663a;

                {
                    this.f73663a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    this.f73663a.aI_();
                }
            });
            gVar.itemView.addOnAttachStateChangeListener(new OnAttachStateChangeListener(this) {

                /* renamed from: a */
                final /* synthetic */ C28040j f73664a;

                {
                    this.f73664a = r1;
                }

                public final void onViewAttachedToWindow(View view) {
                    C47718bf.m103290c(this.f73664a);
                }

                public final void onViewDetachedFromWindow(View view) {
                    C47718bf.m103291d(this.f73664a);
                }
            });
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.Adapter<android.support.v7.widget.RecyclerView.ViewHolder>");
    }

    @C53771m
    public final void onVideoEvent(C30332aw awVar) {
        C52711k.m112240b(awVar, "event");
        if (C1056u.m3018B(this.f73648b.itemView) && awVar.f79228a == 21) {
            Object obj = awVar.f79229b;
            if (obj != null) {
                Aweme aweme = (Aweme) obj;
                if (aweme != null && !TextUtils.equals(C28028b.f73635e, aweme.getAid())) {
                    List<? extends Aweme> list = this.f73661e;
                    if (list == null) {
                        C52711k.m112234a();
                    }
                    Iterator it = list.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        } else if (TextUtils.equals(((Aweme) it.next()).getAid(), aweme.getAid())) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i != -1) {
                        C1332i layoutManager = this.f73648b.f73653a.getLayoutManager();
                        if (layoutManager != null) {
                            ((LinearLayoutManager) layoutManager).mo4721a(i, 0);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                        }
                    }
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            }
        }
    }

    /* renamed from: a */
    public final void mo56408a(int i, View view, Aweme aweme, List<? extends Aweme> list) {
        C52711k.m112240b(view, "it");
        C52711k.m112240b(aweme, "item");
        C52711k.m112240b(list, "awemeList");
        C27797ad a = C28387a.m67363a(view);
        Bundle bundle = new Bundle();
        bundle.putString("id", aweme.getAid());
        bundle.putString("video_from", "from_no_request");
        bundle.putString("enter_from", "general_search");
        bundle.putString("search_keyword", a.mo56235b());
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", mo56418f());
        bundle.putString("extra_search_result_id", aweme.getAuthorUid());
        C41428h hVar = C41428h.f105000a;
        View view2 = this.f73648b.itemView;
        C52711k.m112236a((Object) view2, "viewHolder.itemView");
        Context context = view2.getContext();
        if (context != null) {
            hVar.launchDetailActivity((FragmentActivity) context, bundle, view, list);
            C30179b.m70792a(aweme);
            C23089d dVar = new C23089d();
            dVar.mo47829a("enter_from", "general_search").mo47829a("group_id", aweme.getAid()).mo47829a("author_id", aweme.getAuthorUid()).mo47829a("search_keyword", a.mo56235b()).mo47829a("enter_method", "aladdin_card").mo47829a("log_pb", a.mo56236c());
            C26890h.m65012a("feed_enter", C23198ae.m56851a(dVar.f61491a));
            C28372a.m67321a(C42311c.f106865i, aweme.getAuthorUid(), view);
            Map d = mo56413d();
            if (d != null) {
                String desc = aweme.getDesc();
                C52711k.m112236a((Object) desc, "item.desc");
                d.put("aladdin_words", desc);
                String aid = aweme.getAid();
                C52711k.m112236a((Object) aid, "item.aid");
                d.put("list_item_id", aid);
                d.put("aladdin_rank", String.valueOf(i));
                d.put("rank", "0");
            } else {
                d = null;
            }
            mo56411b(d);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
