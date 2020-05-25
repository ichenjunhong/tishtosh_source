package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.content.Context;
import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1346r;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24441j;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39533d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39538i;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39540k;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42730a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43047h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43021e;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2219p.C44351b;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44704c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44709f;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C46784a;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMultiMusicView */
public final class StickPointMultiMusicView extends FrameLayout implements C43095b {

    /* renamed from: a */
    public RecyclerView f108741a;

    /* renamed from: b */
    public TextView f108742b;

    /* renamed from: c */
    public C39533d f108743c;

    /* renamed from: d */
    public C42730a f108744d;

    /* renamed from: e */
    public C43021e f108745e;

    /* renamed from: f */
    public final C39529ab f108746f;

    /* renamed from: g */
    private View f108747g;

    /* renamed from: h */
    private AVDmtTabLayout f108748h;

    /* renamed from: i */
    private RecyclerView f108749i;

    /* renamed from: j */
    private View f108750j;

    /* renamed from: k */
    private View f108751k;

    /* renamed from: l */
    private View f108752l;

    /* renamed from: m */
    private DmtStatusView f108753m;

    /* renamed from: n */
    private int f108754n;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMultiMusicView$a */
    static final class C43072a extends LinearLayoutManager {

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMultiMusicView$a$a */
        static final class C43073a extends C1415af {
            public C43073a(Context context) {
                C52711k.m112240b(context, "context");
                super(context);
            }

            /* renamed from: a */
            public final float mo5490a(DisplayMetrics displayMetrics) {
                C52711k.m112240b(displayMetrics, "displayMetrics");
                return 150.0f / ((float) displayMetrics.densityDpi);
            }

            /* renamed from: a */
            public final int mo5492a(int i, int i2, int i3, int i4, int i5) {
                return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
            }
        }

        public C43072a(Context context) {
            C52711k.m112240b(context, "context");
            super(context);
        }

        /* renamed from: a */
        public final void mo4726a(RecyclerView recyclerView, C1349s sVar, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            Context context = recyclerView.getContext();
            C52711k.m112236a((Object) context, "recyclerView.context");
            C43073a aVar = new C43073a(context);
            aVar.f4778g = i;
            mo5022a((C1346r) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMultiMusicView$b */
    public static final class C43074b implements C24441j {

        /* renamed from: a */
        final /* synthetic */ StickPointMultiMusicView f108755a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMultiMusicView$b$a */
        static final class C43075a extends C52712l implements C52671b<C42482c, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C43074b f108756a;

            /* renamed from: b */
            final /* synthetic */ int f108757b;

            C43075a(C43074b bVar, int i) {
                this.f108756a = bVar;
                this.f108757b = i;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                C42482c cVar = (C42482c) obj;
                C42730a aVar = this.f108756a.f108755a.f108744d;
                if (aVar != null) {
                    aVar.mo87189a(cVar, this.f108757b);
                }
                return C52860x.f131107a;
            }
        }

        C43074b(StickPointMultiMusicView stickPointMultiMusicView) {
            this.f108755a = stickPointMultiMusicView;
        }

        /* renamed from: a */
        public final void mo50207a(View view, int i) {
            C52711k.m112240b(view, "view");
            if (StickPointMultiMusicView.m94379a(this.f108755a).mo80620b(i) != null) {
                StickPointMultiMusicView.m94379a(this.f108755a).mo80614a(i, false);
                StickPointMultiMusicView.m94379a(this.f108755a).mo80613a(i, (C52671b<? super C42482c, C52860x>) new C43075a<Object,C52860x>(this, i));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMultiMusicView$c */
    static final class C43076c implements C26846a {

        /* renamed from: a */
        final /* synthetic */ StickPointMultiMusicView f108758a;

        C43076c(StickPointMultiMusicView stickPointMultiMusicView) {
            this.f108758a = stickPointMultiMusicView;
        }

        public final void ar_() {
            StickPointMultiMusicView.m94379a(this.f108758a).am_();
            this.f108758a.f108746f.mo80582d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMultiMusicView$d */
    public static final class C43077d implements C39540k {

        /* renamed from: a */
        final /* synthetic */ StickPointMultiMusicView f108759a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMultiMusicView$d$a */
        static final class C43078a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C43077d f108760a;

            C43078a(C43077d dVar) {
                this.f108760a = dVar;
            }

            public final void run() {
                StickPointMultiMusicView.m94379a(this.f108760a.f108759a).mo80625g();
                StickPointMultiMusicView.m94380b(this.f108760a.f108759a).setVisibility(4);
                StickPointMultiMusicView.m94381c(this.f108760a.f108759a).setVisibility(0);
                StickPointMultiMusicView.m94381c(this.f108760a.f108759a).setText(this.f108760a.f108759a.getContext().getString(R.string.azb));
                StickPointMultiMusicView.m94381c(this.f108760a.f108759a).setOnClickListener(new OnClickListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C43078a f108761a;

                    {
                        this.f108761a = r1;
                    }

                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        this.f108761a.f108760a.f108759a.f108746f.mo80580c();
                    }
                });
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMultiMusicView$d$b */
        static final class C43080b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C43077d f108762a;

            C43080b(C43077d dVar) {
                this.f108762a = dVar;
            }

            public final void run() {
                StickPointMultiMusicView.m94380b(this.f108762a.f108759a).setVisibility(0);
                StickPointMultiMusicView.m94379a(this.f108762a.f108759a).cn_();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMultiMusicView$d$c */
        static final class C43081c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C43077d f108763a;

            C43081c(C43077d dVar) {
                this.f108763a = dVar;
            }

            public final void run() {
                StickPointMultiMusicView.m94379a(this.f108763a.f108759a).mo80625g();
                StickPointMultiMusicView.m94380b(this.f108763a.f108759a).setVisibility(4);
                StickPointMultiMusicView.m94381c(this.f108763a.f108759a).setVisibility(0);
                StickPointMultiMusicView.m94381c(this.f108763a.f108759a).setText(this.f108763a.f108759a.getContext().getString(R.string.a4b));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMultiMusicView$d$d */
        static final class C43082d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C43077d f108764a;

            /* renamed from: b */
            final /* synthetic */ List f108765b;

            /* renamed from: c */
            final /* synthetic */ boolean f108766c;

            C43082d(C43077d dVar, List list, boolean z) {
                this.f108764a = dVar;
                this.f108765b = list;
                this.f108766c = z;
            }

            public final void run() {
                StickPointMultiMusicView.m94380b(this.f108764a.f108759a).setVisibility(0);
                StickPointMultiMusicView.m94381c(this.f108764a.f108759a).setVisibility(8);
                StickPointMultiMusicView.m94379a(this.f108764a.f108759a).mo80625g();
                StickPointMultiMusicView.m94379a(this.f108764a.f108759a).mo80616a(this.f108765b);
                StickPointMultiMusicView.m94379a(this.f108764a.f108759a).mo80622c(true);
                if (!this.f108766c) {
                    StickPointMultiMusicView.m94379a(this.f108764a.f108759a).an_();
                    StickPointMultiMusicView.m94379a(this.f108764a.f108759a).mo80622c(false);
                    return;
                }
                StickPointMultiMusicView.m94379a(this.f108764a.f108759a).ao_();
            }
        }

        /* renamed from: a */
        public final void mo80646a() {
            this.f108759a.post(new C43081c(this));
        }

        /* renamed from: b */
        public final void mo80648b() {
            this.f108759a.post(new C43080b(this));
        }

        /* renamed from: c */
        public final void mo80649c() {
            this.f108759a.post(new C43078a(this));
        }

        C43077d(StickPointMultiMusicView stickPointMultiMusicView) {
            this.f108759a = stickPointMultiMusicView;
        }

        /* renamed from: a */
        public final void mo80647a(List<? extends MusicModel> list, boolean z) {
            C52711k.m112240b(list, "musicList");
            this.f108759a.post(new C43082d(this, list, z));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMultiMusicView$e */
    static final class C43083e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AVDmtTabLayout f108767a;

        /* renamed from: b */
        final /* synthetic */ StickPointMultiMusicView f108768b;

        /* renamed from: c */
        final /* synthetic */ boolean f108769c;

        C43083e(AVDmtTabLayout aVDmtTabLayout, StickPointMultiMusicView stickPointMultiMusicView, boolean z) {
            this.f108767a = aVDmtTabLayout;
            this.f108768b = stickPointMultiMusicView;
            this.f108769c = z;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f108768b.mo87465b(0);
            this.f108767a.mo90693b(this.f108767a.mo90679a(0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMultiMusicView$f */
    static final class C43084f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AVDmtTabLayout f108770a;

        /* renamed from: b */
        final /* synthetic */ StickPointMultiMusicView f108771b;

        /* renamed from: c */
        final /* synthetic */ boolean f108772c;

        C43084f(AVDmtTabLayout aVDmtTabLayout, StickPointMultiMusicView stickPointMultiMusicView, boolean z) {
            this.f108770a = aVDmtTabLayout;
            this.f108771b = stickPointMultiMusicView;
            this.f108772c = z;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f108771b.mo87465b(1);
            this.f108770a.mo90693b(this.f108770a.mo90679a(1));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMultiMusicView$g */
    public static final class C43085g implements C44704c {
        C43085g() {
        }

        /* renamed from: b */
        public final void mo64264b(C44709f fVar) {
        }

        /* renamed from: c */
        public final void mo64265c(C44709f fVar) {
        }

        /* renamed from: a */
        public final void mo64263a(C44709f fVar) {
            Integer num;
            if (fVar != null) {
                num = Integer.valueOf(fVar.f113161e);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                C43047h.m94331a("recommend");
                return;
            }
            if (num != null && num.intValue() == 1) {
                C43047h.m94331a("favorite");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMultiMusicView$h */
    static final class C43086h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StickPointMultiMusicView f108773a;

        C43086h(StickPointMultiMusicView stickPointMultiMusicView) {
            this.f108773a = stickPointMultiMusicView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C43021e eVar = this.f108773a.f108745e;
            if (eVar != null) {
                C52711k.m112236a((Object) view, "v");
                eVar.mo87314a(view);
            }
        }
    }

    public StickPointMultiMusicView(Context context) {
        this(context, null, 0, 6, null);
    }

    public StickPointMultiMusicView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo87462a() {
    }

    /* renamed from: b */
    public final void mo87464b() {
    }

    /* renamed from: c */
    public final void mo87466c() {
    }

    /* renamed from: d */
    public final View mo87467d() {
        return this;
    }

    public final void setCollectMusicCallback(C42730a aVar) {
        C52711k.m112240b(aVar, "callback");
        this.f108744d = aVar;
    }

    public final void setStickPointMusicListener(C43021e eVar) {
        C52711k.m112240b(eVar, "listener");
        this.f108745e = eVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ C39533d m94379a(StickPointMultiMusicView stickPointMultiMusicView) {
        C39533d dVar = stickPointMultiMusicView.f108743c;
        if (dVar == null) {
            C52711k.m112237a("mCollectMusicAdapter");
        }
        return dVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ RecyclerView m94380b(StickPointMultiMusicView stickPointMultiMusicView) {
        RecyclerView recyclerView = stickPointMultiMusicView.f108741a;
        if (recyclerView == null) {
            C52711k.m112237a("mFavoriteRecyclerView");
        }
        return recyclerView;
    }

    /* renamed from: c */
    public static final /* synthetic */ TextView m94381c(StickPointMultiMusicView stickPointMultiMusicView) {
        TextView textView = stickPointMultiMusicView.f108742b;
        if (textView == null) {
            C52711k.m112237a("mFavoriteEmptyView");
        }
        return textView;
    }

    public final void setButtonClickable(boolean z) {
        View view = this.f108752l;
        if (view == null) {
            C52711k.m112237a("mChangeVideoSegment");
        }
        view.setClickable(z);
    }

    public final void setRecyclerViewAdapter(C39538i iVar) {
        C52711k.m112240b(iVar, "musicItemAdapter");
        RecyclerView recyclerView = this.f108749i;
        if (recyclerView == null) {
            C52711k.m112237a("mRecommendRecyclerView");
        }
        recyclerView.setAdapter(iVar);
    }

    /* renamed from: a */
    public final void mo87463a(int i) {
        switch (this.f108754n) {
            case 0:
                if (this.f108743c != null) {
                    C39533d dVar = this.f108743c;
                    if (dVar == null) {
                        C52711k.m112237a("mCollectMusicAdapter");
                    }
                    dVar.mo80626g_(-1);
                    C39533d dVar2 = this.f108743c;
                    if (dVar2 == null) {
                        C52711k.m112237a("mCollectMusicAdapter");
                    }
                    dVar2.mo80621b(-1, false);
                }
                RecyclerView recyclerView = this.f108749i;
                if (recyclerView == null) {
                    C52711k.m112237a("mRecommendRecyclerView");
                }
                recyclerView.mo4833d(i);
                return;
            case 1:
                C39533d dVar3 = this.f108743c;
                if (dVar3 == null) {
                    C52711k.m112237a("mCollectMusicAdapter");
                }
                C39533d dVar4 = this.f108743c;
                if (dVar4 == null) {
                    C52711k.m112237a("mCollectMusicAdapter");
                }
                dVar3.mo80621b(dVar4.cm_(), true);
                RecyclerView recyclerView2 = this.f108741a;
                if (recyclerView2 == null) {
                    C52711k.m112237a("mFavoriteRecyclerView");
                }
                recyclerView2.mo4833d(i - 1);
                break;
        }
    }

    /* renamed from: b */
    public final void mo87465b(int i) {
        if (this.f108754n != i) {
            C42730a aVar = this.f108744d;
            if (aVar != null) {
                aVar.mo87188a(i);
            }
            switch (i) {
                case 0:
                    View view = this.f108750j;
                    if (view == null) {
                        C52711k.m112237a("mRecommendContainer");
                    }
                    view.setVisibility(0);
                    View view2 = this.f108751k;
                    if (view2 == null) {
                        C52711k.m112237a("mFavoriteContainer");
                    }
                    view2.setVisibility(8);
                    break;
                case 1:
                    View view3 = this.f108750j;
                    if (view3 == null) {
                        C52711k.m112237a("mRecommendContainer");
                    }
                    view3.setVisibility(8);
                    View view4 = this.f108751k;
                    if (view4 == null) {
                        C52711k.m112237a("mFavoriteContainer");
                    }
                    view4.setVisibility(0);
                    if (this.f108743c == null) {
                        this.f108743c = this.f108746f.mo80561a((C24441j) new C43074b(this));
                        C39533d dVar = this.f108743c;
                        if (dVar == null) {
                            C52711k.m112237a("mCollectMusicAdapter");
                        }
                        dVar.mo80615a((C26846a) new C43076c(this));
                        RecyclerView recyclerView = this.f108741a;
                        if (recyclerView == null) {
                            C52711k.m112237a("mFavoriteRecyclerView");
                        }
                        C39533d dVar2 = this.f108743c;
                        if (dVar2 == null) {
                            C52711k.m112237a("mCollectMusicAdapter");
                        }
                        recyclerView.setAdapter(dVar2.mo80627h());
                        this.f108746f.mo80574a((C39540k) new C43077d(this));
                    }
                    this.f108746f.mo80580c();
                    break;
            }
            this.f108754n = i;
        }
    }

    public StickPointMultiMusicView(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f108746f = C39630m.m88234a().mo58604b();
        View inflate = LayoutInflater.from(context).inflate(R.layout.bkl, this);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…t_multi_music_view, this)");
        this.f108747g = inflate;
        View view = this.f108747g;
        if (view == null) {
            C52711k.m112237a("mRootContentView");
        }
        View findViewById = view.findViewById(R.id.cwz);
        C52711k.m112236a((Object) findViewById, "mRootContentView.findViewById(R.id.tab_layout)");
        this.f108748h = (AVDmtTabLayout) findViewById;
        View view2 = this.f108747g;
        if (view2 == null) {
            C52711k.m112237a("mRootContentView");
        }
        View findViewById2 = view2.findViewById(R.id.c9w);
        C52711k.m112236a((Object) findViewById2, "mRootContentView.findVie…R.id.recommend_container)");
        this.f108750j = findViewById2;
        View view3 = this.f108747g;
        if (view3 == null) {
            C52711k.m112237a("mRootContentView");
        }
        View findViewById3 = view3.findViewById(R.id.e8_);
        C52711k.m112236a((Object) findViewById3, "mRootContentView.findVie…(R.id.favorite_container)");
        this.f108751k = findViewById3;
        View view4 = this.f108747g;
        if (view4 == null) {
            C52711k.m112237a("mRootContentView");
        }
        View findViewById4 = view4.findViewById(R.id.erg);
        C52711k.m112236a((Object) findViewById4, "mRootContentView.findVie…d.recommend_recyclerView)");
        this.f108749i = (RecyclerView) findViewById4;
        View view5 = this.f108747g;
        if (view5 == null) {
            C52711k.m112237a("mRootContentView");
        }
        View findViewById5 = view5.findViewById(R.id.e8a);
        C52711k.m112236a((Object) findViewById5, "mRootContentView.findVie…id.favorite_recyclerView)");
        this.f108741a = (RecyclerView) findViewById5;
        View view6 = this.f108747g;
        if (view6 == null) {
            C52711k.m112237a("mRootContentView");
        }
        View findViewById6 = view6.findViewById(R.id.a8w);
        C52711k.m112236a((Object) findViewById6, "mRootContentView.findVie…d(R.id.dtv_collect_empty)");
        this.f108742b = (TextView) findViewById6;
        View view7 = this.f108747g;
        if (view7 == null) {
            C52711k.m112237a("mRootContentView");
        }
        View findViewById7 = view7.findViewById(R.id.sg);
        C52711k.m112236a((Object) findViewById7, "mRootContentView.findVie…Id(R.id.change_video_seg)");
        this.f108752l = findViewById7;
        View view8 = this.f108747g;
        if (view8 == null) {
            C52711k.m112237a("mRootContentView");
        }
        View findViewById8 = view8.findViewById(R.id.csv);
        C52711k.m112236a((Object) findViewById8, "mRootContentView.findViewById(R.id.status_view)");
        this.f108753m = (DmtStatusView) findViewById8;
        RecyclerView recyclerView = this.f108749i;
        if (recyclerView == null) {
            C52711k.m112237a("mRecommendRecyclerView");
        }
        C43072a aVar = new C43072a(context);
        aVar.mo4731b(0);
        recyclerView.setLayoutManager(aVar);
        RecyclerView recyclerView2 = this.f108741a;
        if (recyclerView2 == null) {
            C52711k.m112237a("mFavoriteRecyclerView");
        }
        C43072a aVar2 = new C43072a(context);
        aVar2.mo4731b(0);
        recyclerView2.setLayoutManager(aVar2);
        View view9 = this.f108747g;
        if (view9 == null) {
            C52711k.m112237a("mRootContentView");
        }
        view9.findViewById(R.id.sg).setOnClickListener(new C43086h(this));
        DmtStatusView dmtStatusView = this.f108753m;
        if (dmtStatusView == null) {
            C52711k.m112237a("mStatusView");
        }
        dmtStatusView.setBuilder(C10719a.m21676a(getContext()));
        AVDmtTabLayout aVDmtTabLayout = this.f108748h;
        if (aVDmtTabLayout == null) {
            C52711k.m112237a("mTabLayout");
        }
        aVDmtTabLayout.setVisibility(0);
        if (C44351b.m97144a() == 0) {
            z = true;
        } else {
            z = false;
        }
        AVDmtTabLayout aVDmtTabLayout2 = this.f108748h;
        if (aVDmtTabLayout2 == null) {
            C52711k.m112237a("mTabLayout");
        }
        aVDmtTabLayout2.setMaxTabModeForCount(2);
        C44709f a = aVDmtTabLayout2.mo90678a();
        AVDmtTabItemView a2 = C46784a.m101615a(aVDmtTabLayout2.getContext(), z);
        Context context2 = a2.getContext();
        C52711k.m112236a((Object) context2, "context");
        a2.setText(context2.getResources().getString(R.string.hjg));
        a2.setOnClickListener(new C43083e(aVDmtTabLayout2, this, z));
        aVDmtTabLayout2.mo90684a(a.mo90742a((View) a2));
        C44709f a3 = aVDmtTabLayout2.mo90678a();
        AVDmtTabItemView a4 = C46784a.m101615a(aVDmtTabLayout2.getContext(), z);
        Context context3 = a4.getContext();
        C52711k.m112236a((Object) context3, "context");
        a4.setText(context3.getResources().getString(R.string.hjf));
        a4.setOnClickListener(new C43084f(aVDmtTabLayout2, this, z));
        aVDmtTabLayout2.mo90684a(a3.mo90742a((View) a4));
        aVDmtTabLayout2.mo90683a(new C43085g());
        aVDmtTabLayout2.mo90693b(aVDmtTabLayout2.mo90679a(0));
    }

    public /* synthetic */ StickPointMultiMusicView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
