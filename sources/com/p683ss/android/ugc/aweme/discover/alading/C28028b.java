package com.p683ss.android.ugc.aweme.discover.alading;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.discover.mixfeed.p1656c.C28314c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.search.performance.C41457i;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.b */
public final class C28028b extends C1322a<C28032d> {

    /* renamed from: e */
    public static String f73635e;

    /* renamed from: f */
    public static final C28029a f73636f = new C28029a(null);

    /* renamed from: a */
    public List<? extends Aweme> f73637a = new ArrayList();

    /* renamed from: b */
    public final Context f73638b;

    /* renamed from: c */
    public final C28314c f73639c;

    /* renamed from: d */
    public final C28033e f73640d;

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.b$a */
    public static final class C28029a {
        private C28029a() {
        }

        public /* synthetic */ C28029a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.b$b */
    static final class C28030b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28028b f73641a;

        /* renamed from: b */
        final /* synthetic */ Aweme f73642b;

        /* renamed from: c */
        final /* synthetic */ int f73643c;

        C28030b(C28028b bVar, Aweme aweme, int i) {
            this.f73641a = bVar;
            this.f73642b = aweme;
            this.f73643c = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f73641a.f73638b == null) {
                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            } else if (!C28031c.m66786a(this.f73641a.f73638b)) {
                C10691a.m21542b(this.f73641a.f73638b, (int) R.string.cg1).mo19066a();
            } else {
                C28028b.f73635e = this.f73642b.getAid();
                C28033e eVar = this.f73641a.f73640d;
                int i = this.f73643c;
                C52711k.m112236a((Object) view, "it");
                eVar.mo56408a(i, view, this.f73642b, this.f73641a.f73637a);
            }
        }
    }

    public final int getItemViewType(int i) {
        return R.layout.brz;
    }

    public final int getItemCount() {
        return this.f73637a.size();
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "p0");
        return new C28032d(C41457i.f105090b.mo84196a(viewGroup, R.layout.brz));
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        UrlModel urlModel;
        Map map;
        C28032d dVar = (C28032d) vVar;
        C52711k.m112240b(dVar, "p0");
        Aweme aweme = (Aweme) this.f73637a.get(i);
        dVar.f73646c.setText(C33095b.m76068a(aweme.getStatistics().getDiggCount()));
        Drawable drawable = this.f73638b.getResources().getDrawable(R.drawable.dff);
        drawable.setBounds(0, (int) C9432q.m18687b(this.f73638b, 0.5f), (int) C9432q.m18687b(this.f73638b, 15.0f), (int) C9432q.m18687b(this.f73638b, 15.5f));
        dVar.f73646c.setCompoundDrawables(drawable, null, null, null);
        Video video = aweme.getVideo();
        if (video != null) {
            urlModel = video.getCover();
        } else {
            urlModel = null;
        }
        C12203q.m24645a((Object) C23608p.m57874a(urlModel)).mo23118a("AwemeCardListAdapter").mo23116a((C12197k) dVar.f73645b).mo23126b();
        dVar.f73644a.setOnClickListener(new C28030b(this, aweme, i));
        C28314c cVar = this.f73639c;
        if (cVar != null) {
            C28314c cVar2 = this.f73639c;
            if (cVar2 != null) {
                map = cVar2.mo56412c();
                if (map != null) {
                    String desc = aweme.getDesc();
                    C52711k.m112236a((Object) desc, "item.desc");
                    map.put("aladdin_words", desc);
                    String aid = aweme.getAid();
                    C52711k.m112236a((Object) aid, "item.aid");
                    map.put("list_item_id", aid);
                    map.put("aladdin_rank", String.valueOf(i));
                    map.put("rank", "0");
                    cVar.mo56409a(map);
                }
            }
            map = null;
            cVar.mo56409a(map);
        }
    }

    public C28028b(Context context, C28314c cVar, C28033e eVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(cVar, "searchMobOperator");
        C52711k.m112240b(eVar, "listener");
        this.f73638b = context;
        this.f73639c = cVar;
        this.f73640d = eVar;
    }
}
