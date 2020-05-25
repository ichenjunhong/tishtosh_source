package com.p683ss.android.ugc.aweme.discover.adapter.p1636a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.discover.adapter.music.SearchMusicDepentServiceImpl;
import com.p683ss.android.ugc.aweme.discover.mob.p1658a.C28376d;
import com.p683ss.android.ugc.aweme.discover.mob.p1658a.C28378f;
import com.p683ss.android.ugc.aweme.discover.mob.p1658a.C28379g;
import com.p683ss.android.ugc.aweme.discover.model.SearchSugEntity;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28106n;
import com.p683ss.android.ugc.aweme.discover.p1651i.p1652a.C28238a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28515aw;
import com.p683ss.android.ugc.aweme.discover.widget.SugCompletionView;
import com.p683ss.android.ugc.aweme.discover.widget.SugCompletionView.C28975a;
import com.p683ss.android.ugc.aweme.music.service.ISearchMusicDepentService;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.a.a */
public final class C27782a extends C1352v {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f73013a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27782a.class), "mSearchMusicDepentService", "getMSearchMusicDepentService()Lcom/ss/android/ugc/aweme/music/service/ISearchMusicDepentService;"))};

    /* renamed from: h */
    public static final C27785a f73014h = new C27785a(null);

    /* renamed from: b */
    public SearchSugEntity f73015b;

    /* renamed from: c */
    public int f73016c;

    /* renamed from: d */
    public String f73017d = "";

    /* renamed from: e */
    public boolean f73018e;

    /* renamed from: f */
    public final C52668f f73019f = C52732g.m112285a(C27787c.f73025a);

    /* renamed from: g */
    public C28238a f73020g;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.a.a$a */
    public static final class C27785a {
        private C27785a() {
        }

        public /* synthetic */ C27785a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.a.a$b */
    public static final class C27786b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f73023a;

        /* renamed from: b */
        final /* synthetic */ SearchSugEntity f73024b;

        public C27786b(int i, SearchSugEntity searchSugEntity) {
            this.f73023a = i;
            this.f73024b = searchSugEntity;
        }

        public final void run() {
            int i = this.f73023a;
            SearchSugEntity searchSugEntity = this.f73024b;
            String str = "enrich_sug";
            if (searchSugEntity != null && !searchSugEntity.isMobShow) {
                searchSugEntity.isMobShow = true;
                ((C28379g) new C28379g(null, 1, null).mo56802a(searchSugEntity.mWord).mo56804a("sug").mo56805b(searchSugEntity.content).mo56803a(Integer.valueOf(i)).mo56809f(str).mo48070a(searchSugEntity.extraParam)).mo48076e();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.a.a$c */
    static final class C27787c extends C52712l implements C52670a<ISearchMusicDepentService> {

        /* renamed from: a */
        public static final C27787c f73025a = new C27787c();

        C27787c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return SearchMusicDepentServiceImpl.createISearchMusicDepentServicebyMonsterPlugin();
        }
    }

    public C27782a(View view, C28238a aVar, C28975a aVar2) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f73020g = aVar;
        ((SugCompletionView) view.findViewById(R.id.eg1)).setKeyboardDismissHandler(aVar2);
        ((SugCompletionView) view.findViewById(R.id.eg1)).setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C27782a f73021a;

            {
                this.f73021a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                SearchSugEntity searchSugEntity = this.f73021a.f73015b;
                if (searchSugEntity != null) {
                    C47718bf.m103288a(new C28106n(searchSugEntity.content));
                    int i = this.f73021a.f73016c;
                    if (searchSugEntity != null) {
                        ((C28379g) new C28376d().mo56802a(searchSugEntity.mWord).mo56804a("sug").mo56803a(Integer.valueOf(i)).mo56805b(searchSugEntity.content).mo56809f("enrich_sug").mo48070a(searchSugEntity.extraParam)).mo48076e();
                    }
                }
            }
        });
        view.setOnTouchListener(new C28515aw(this) {

            /* renamed from: a */
            final /* synthetic */ C27782a f73022a;

            {
                this.f73022a = r1;
            }

            /* renamed from: b */
            public final void mo55272b(View view, MotionEvent motionEvent) {
                if (!C32800a.m75679a(view) && this.f73022a.f73018e) {
                    SearchSugEntity searchSugEntity = this.f73022a.f73015b;
                    if (searchSugEntity != null) {
                        C28238a aVar = this.f73022a.f73020g;
                        if (aVar != null) {
                            aVar.mo56659a(searchSugEntity, this.f73022a.f73017d, this.f73022a.f73016c);
                        }
                        int i = this.f73022a.f73016c;
                        String str = "enrich_sug";
                        if (searchSugEntity != null) {
                            ((C28379g) new C28378f().mo56802a(searchSugEntity.mWord).mo56804a("sug").mo56805b(searchSugEntity.content).mo56803a(Integer.valueOf(i)).mo56809f(str).mo48070a(searchSugEntity.extraParam)).mo48076e();
                        }
                    }
                }
            }
        });
    }
}
