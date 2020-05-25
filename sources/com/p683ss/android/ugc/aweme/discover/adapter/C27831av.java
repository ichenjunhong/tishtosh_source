package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.av */
public final class C27831av extends C1352v {

    /* renamed from: d */
    public static final C27833a f73112d = new C27833a(null);

    /* renamed from: a */
    final DmtTextView f73113a;

    /* renamed from: b */
    public C27907k f73114b;

    /* renamed from: c */
    String f73115c;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.av$a */
    public static final class C27833a {
        private C27833a() {
        }

        public /* synthetic */ C27833a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.av$b */
    public interface C27834b {
        /* renamed from: a */
        void mo56251a(C27907k kVar);
    }

    public C27831av(View view, final C27834b bVar) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(bVar, "listener");
        super(view);
        View findViewById = view.findViewById(R.id.dbr);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.tv_matched_count)");
        this.f73113a = (DmtTextView) findViewById;
        view.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C27831av f73116a;

            {
                this.f73116a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!C32800a.m75679a(view) && this.f73116a.f73114b != null) {
                    C27831av avVar = this.f73116a;
                    String str = "matched_sounds_click";
                    C27907k kVar = this.f73116a.f73114b;
                    if (kVar == null) {
                        C52711k.m112234a();
                    }
                    avVar.mo56256a(str, kVar);
                    C27834b bVar = bVar;
                    C27907k kVar2 = this.f73116a.f73114b;
                    if (kVar2 == null) {
                        C52711k.m112234a();
                    }
                    bVar.mo56251a(kVar2);
                }
            }
        });
    }

    /* renamed from: a */
    private static C23089d m66581a(C23089d dVar, C27907k kVar) {
        C23089d a = dVar.mo47829a("log_pb", C29981aa.m70153a().mo60161a(((Music) kVar.getClusterList().get(0)).getRequestId()));
        C52711k.m112236a((Object) a, "appendParam(Mob.Key.LOG_PB, logPb)");
        return a;
    }

    /* renamed from: a */
    private static C23089d m66582a(C23089d dVar, List<Music> list) {
        StringBuilder sb = new StringBuilder();
        for (Music mid : list) {
            sb.append(mid.getMid());
            sb.append(",");
        }
        C23089d a = dVar.mo47829a("music_list", C52830p.m112428a((CharSequence) sb, (CharSequence) ",").toString());
        C52711k.m112236a((Object) a, "appendParam(Mob.Key.MUSI…veSuffix(\",\").toString())");
        return a;
    }

    /* renamed from: a */
    public final void mo56256a(String str, C27907k kVar) {
        C23089d a = C23089d.m56640a().mo47829a("enter_from", "search_result").mo47829a("search_keyword", this.f73115c);
        C52711k.m112236a((Object) a, "EventMapBuilder.newBuild…SEARCH_KEYWORD, mKeyword)");
        C26890h.m65011a(str, m66581a(m66582a(a, kVar.getClusterList()), kVar).f61491a);
    }
}
