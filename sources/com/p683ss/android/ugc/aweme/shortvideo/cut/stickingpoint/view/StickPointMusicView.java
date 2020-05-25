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
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39538i;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42730a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43021e;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMusicView */
public final class StickPointMusicView extends FrameLayout implements C43095b {

    /* renamed from: a */
    public C43021e f108774a;

    /* renamed from: b */
    private View f108775b;

    /* renamed from: c */
    private RecyclerView f108776c;

    /* renamed from: d */
    private View f108777d;

    /* renamed from: e */
    private View f108778e;

    /* renamed from: f */
    private View f108779f;

    /* renamed from: g */
    private View f108780g;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMusicView$a */
    final class C43087a extends LinearLayoutManager {

        /* renamed from: a */
        final /* synthetic */ StickPointMusicView f108781a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMusicView$a$a */
        final class C43088a extends C1415af {

            /* renamed from: f */
            final /* synthetic */ C43087a f108782f;

            /* renamed from: a */
            public final float mo5490a(DisplayMetrics displayMetrics) {
                C52711k.m112240b(displayMetrics, "displayMetrics");
                return 150.0f / ((float) displayMetrics.densityDpi);
            }

            public C43088a(C43087a aVar, Context context) {
                C52711k.m112240b(context, "context");
                this.f108782f = aVar;
                super(context);
            }

            /* renamed from: a */
            public final int mo5492a(int i, int i2, int i3, int i4, int i5) {
                return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
            }
        }

        public C43087a(StickPointMusicView stickPointMusicView, Context context) {
            C52711k.m112240b(context, "context");
            this.f108781a = stickPointMusicView;
            super(context);
        }

        /* renamed from: a */
        public final void mo4726a(RecyclerView recyclerView, C1349s sVar, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            Context context = recyclerView.getContext();
            C52711k.m112236a((Object) context, "recyclerView.context");
            C43088a aVar = new C43088a(this, context);
            aVar.f4778g = i;
            mo5022a((C1346r) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMusicView$b */
    static final class C43089b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StickPointMusicView f108783a;

        C43089b(StickPointMusicView stickPointMusicView) {
            this.f108783a = stickPointMusicView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C43021e eVar = this.f108783a.f108774a;
            if (eVar != null) {
                C52711k.m112236a((Object) view, "v");
                eVar.mo87314a(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMusicView$c */
    static final class C43090c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StickPointMusicView f108784a;

        C43090c(StickPointMusicView stickPointMusicView) {
            this.f108784a = stickPointMusicView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C43021e eVar = this.f108784a.f108774a;
            if (eVar != null) {
                C52711k.m112236a((Object) view, "v");
                eVar.mo87315b(view);
            }
        }
    }

    public StickPointMusicView(Context context) {
        this(context, null, 0, 6, null);
    }

    public StickPointMusicView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: d */
    public final View mo87467d() {
        return this;
    }

    /* renamed from: a */
    public final void mo87462a() {
        View view = this.f108779f;
        if (view == null) {
            C52711k.m112237a("loadingView");
        }
        view.setVisibility(0);
        View view2 = this.f108780g;
        if (view2 == null) {
            C52711k.m112237a("contentView");
        }
        view2.setVisibility(8);
        View view3 = this.f108777d;
        if (view3 == null) {
            C52711k.m112237a("noDataView");
        }
        view3.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo87464b() {
        View view = this.f108780g;
        if (view == null) {
            C52711k.m112237a("contentView");
        }
        view.setVisibility(0);
        View view2 = this.f108779f;
        if (view2 == null) {
            C52711k.m112237a("loadingView");
        }
        view2.setVisibility(8);
        View view3 = this.f108777d;
        if (view3 == null) {
            C52711k.m112237a("noDataView");
        }
        view3.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo87466c() {
        View view = this.f108777d;
        if (view == null) {
            C52711k.m112237a("noDataView");
        }
        view.setVisibility(0);
        View view2 = this.f108780g;
        if (view2 == null) {
            C52711k.m112237a("contentView");
        }
        view2.setVisibility(8);
        View view3 = this.f108779f;
        if (view3 == null) {
            C52711k.m112237a("loadingView");
        }
        view3.setVisibility(8);
    }

    public final void setStickPointMusicListener(C43021e eVar) {
        C52711k.m112240b(eVar, "listener");
        this.f108774a = eVar;
    }

    /* renamed from: a */
    public final void mo87463a(int i) {
        RecyclerView recyclerView = this.f108776c;
        if (recyclerView == null) {
            C52711k.m112237a("musicRecyleView");
        }
        recyclerView.mo4833d(i);
    }

    public final void setCollectMusicCallback(C42730a aVar) {
        C52711k.m112240b(aVar, "callback");
        C52711k.m112240b(aVar, "callback");
    }

    public final void setRecyclerViewAdapter(C39538i iVar) {
        C52711k.m112240b(iVar, "musicItemAdapter");
        RecyclerView recyclerView = this.f108776c;
        if (recyclerView == null) {
            C52711k.m112237a("musicRecyleView");
        }
        recyclerView.setAdapter(iVar);
    }

    public final void setButtonClickable(boolean z) {
        View view = this.f108775b;
        if (view == null) {
            C52711k.m112237a("rootContentView");
        }
        if (view != null) {
            View view2 = this.f108775b;
            if (view2 == null) {
                C52711k.m112237a("rootContentView");
            }
            View findViewById = view2.findViewById(R.id.sg);
            C52711k.m112236a((Object) findViewById, "rootContentView.findView…w>(R.id.change_video_seg)");
            findViewById.setClickable(z);
        }
    }

    public StickPointMusicView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(R.layout.a87, this);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…ngpoint_music_view, this)");
        this.f108775b = inflate;
        View view = this.f108775b;
        if (view == null) {
            C52711k.m112237a("rootContentView");
        }
        View findViewById = view.findViewById(R.id.zr);
        C52711k.m112236a((Object) findViewById, "rootContentView.findViewById(R.id.content_layout)");
        this.f108780g = findViewById;
        View view2 = this.f108775b;
        if (view2 == null) {
            C52711k.m112237a("rootContentView");
        }
        View findViewById2 = view2.findViewById(R.id.br1);
        C52711k.m112236a((Object) findViewById2, "rootContentView.findViewById(R.id.no_data_view)");
        this.f108777d = findViewById2;
        View view3 = this.f108775b;
        if (view3 == null) {
            C52711k.m112237a("rootContentView");
        }
        View findViewById3 = view3.findViewById(R.id.cbw);
        C52711k.m112236a((Object) findViewById3, "rootContentView.findViewById(R.id.retry_view)");
        this.f108778e = findViewById3;
        View view4 = this.f108775b;
        if (view4 == null) {
            C52711k.m112237a("rootContentView");
        }
        View findViewById4 = view4.findViewById(R.id.bhy);
        C52711k.m112236a((Object) findViewById4, "rootContentView.findViewById(R.id.loading_view)");
        this.f108779f = findViewById4;
        View view5 = this.f108775b;
        if (view5 == null) {
            C52711k.m112237a("rootContentView");
        }
        View findViewById5 = view5.findViewById(R.id.bol);
        C52711k.m112236a((Object) findViewById5, "rootContentView.findView…Id(R.id.music_recyleview)");
        this.f108776c = (RecyclerView) findViewById5;
        C43087a aVar = new C43087a(this, context);
        aVar.mo4731b(0);
        RecyclerView recyclerView = this.f108776c;
        if (recyclerView == null) {
            C52711k.m112237a("musicRecyleView");
        }
        recyclerView.setLayoutManager(aVar);
        View view6 = this.f108775b;
        if (view6 == null) {
            C52711k.m112237a("rootContentView");
        }
        view6.findViewById(R.id.sg).setOnClickListener(new C43089b(this));
        View view7 = this.f108778e;
        if (view7 == null) {
            C52711k.m112237a("retryView");
        }
        view7.setOnClickListener(new C43090c(this));
    }

    public /* synthetic */ StickPointMusicView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
