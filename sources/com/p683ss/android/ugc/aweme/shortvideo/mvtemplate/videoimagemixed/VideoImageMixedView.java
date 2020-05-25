package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import android.content.Context;
import android.graphics.Outline;
import android.os.Build.VERSION;
import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.C1506w;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1346r;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ttve.utils.C20141b;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedView */
public final class VideoImageMixedView extends FrameLayout {

    /* renamed from: a */
    public RecyclerView f112092a;

    /* renamed from: b */
    DmtTextView f112093b;

    /* renamed from: c */
    private View f112094c;

    /* renamed from: d */
    private DmtTextView f112095d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedView$a */
    final class C44278a extends LinearLayoutManager {

        /* renamed from: a */
        final /* synthetic */ VideoImageMixedView f112096a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedView$a$a */
        final class C44279a extends C1415af {

            /* renamed from: f */
            final /* synthetic */ C44278a f112097f;

            /* renamed from: a */
            public final float mo5490a(DisplayMetrics displayMetrics) {
                C52711k.m112240b(displayMetrics, "displayMetrics");
                return 200.0f / ((float) displayMetrics.densityDpi);
            }

            public C44279a(C44278a aVar, Context context) {
                C52711k.m112240b(context, "context");
                this.f112097f = aVar;
                super(context);
            }

            /* renamed from: a */
            public final int mo5492a(int i, int i2, int i3, int i4, int i5) {
                return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
            }
        }

        public C44278a(VideoImageMixedView videoImageMixedView, Context context) {
            C52711k.m112240b(context, "context");
            this.f112096a = videoImageMixedView;
            super(context);
            mo4731b(0);
        }

        /* renamed from: a */
        public final void mo4726a(RecyclerView recyclerView, C1349s sVar, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            Context context = recyclerView.getContext();
            C52711k.m112236a((Object) context, "recyclerView.context");
            C44279a aVar = new C44279a(this, context);
            aVar.f4778g = i;
            mo5022a((C1346r) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedView$b */
    final class C44280b extends ViewOutlineProvider {
        public C44280b() {
        }

        public final void getOutline(View view, Outline outline) {
            C52711k.m112240b(view, "view");
            C52711k.m112240b(outline, "outline");
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedView$c */
    static final class C44281c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoImageMixedView f112099a;

        C44281c(VideoImageMixedView videoImageMixedView) {
            this.f112099a = videoImageMixedView;
        }

        public final void run() {
            VideoImageMixedView.m96974a(this.f112099a).setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedView$d */
    static final class C44282d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoImageMixedView f112100a;

        C44282d(VideoImageMixedView videoImageMixedView) {
            this.f112100a = videoImageMixedView;
        }

        public final void run() {
            VideoImageMixedView.m96974a(this.f112100a).setVisibility(8);
        }
    }

    public VideoImageMixedView(Context context) {
        this(context, null, 2, null);
    }

    public final RecyclerView getMediaSelectRecyleView() {
        RecyclerView recyclerView = this.f112092a;
        if (recyclerView == null) {
            C52711k.m112237a("mediaSelectRecyleView");
        }
        return recyclerView;
    }

    public final DmtTextView getSureTextView() {
        DmtTextView dmtTextView = this.f112095d;
        if (dmtTextView == null) {
            C52711k.m112237a("sureTextView");
        }
        return dmtTextView;
    }

    /* renamed from: a */
    public static final /* synthetic */ RecyclerView m96974a(VideoImageMixedView videoImageMixedView) {
        RecyclerView recyclerView = videoImageMixedView.f112092a;
        if (recyclerView == null) {
            C52711k.m112237a("mediaSelectRecyleView");
        }
        return recyclerView;
    }

    /* renamed from: a */
    public final void mo90168a(int i) {
        View view;
        if (i >= 0) {
            RecyclerView recyclerView = this.f112092a;
            if (recyclerView == null) {
                C52711k.m112237a("mediaSelectRecyleView");
            }
            C1352v f = recyclerView.mo4847f(i);
            if (f != null) {
                view = f.itemView;
            } else {
                view = null;
            }
            if (view == null) {
                RecyclerView recyclerView2 = this.f112092a;
                if (recyclerView2 == null) {
                    C52711k.m112237a("mediaSelectRecyleView");
                }
                recyclerView2.mo4814b(i);
                return;
            }
            RecyclerView recyclerView3 = this.f112092a;
            if (recyclerView3 == null) {
                C52711k.m112237a("mediaSelectRecyleView");
            }
            recyclerView3.mo4833d(i);
        }
    }

    /* renamed from: a */
    public final void mo90169a(boolean z) {
        if (z) {
            RecyclerView recyclerView = this.f112092a;
            if (recyclerView == null) {
                C52711k.m112237a("mediaSelectRecyleView");
            }
            recyclerView.postDelayed(new C44281c(this), 250);
            return;
        }
        RecyclerView recyclerView2 = this.f112092a;
        if (recyclerView2 == null) {
            C52711k.m112237a("mediaSelectRecyleView");
        }
        recyclerView2.post(new C44282d(this));
    }

    public VideoImageMixedView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet);
        View inflate = LayoutInflater.from(context).inflate(R.layout.a9c, this);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…_mixed_bottom_view, this)");
        this.f112094c = inflate;
        View view = this.f112094c;
        if (view == null) {
            C52711k.m112237a("contentRootView");
        }
        View findViewById = view.findViewById(R.id.bkv);
        C52711k.m112236a((Object) findViewById, "contentRootView.findView…Id(R.id.media_recyleview)");
        this.f112092a = (RecyclerView) findViewById;
        View view2 = this.f112094c;
        if (view2 == null) {
            C52711k.m112237a("contentRootView");
        }
        View findViewById2 = view2.findViewById(R.id.cv9);
        C52711k.m112236a((Object) findViewById2, "contentRootView.findViewById(R.id.sure_view)");
        this.f112095d = (DmtTextView) findViewById2;
        View view3 = this.f112094c;
        if (view3 == null) {
            C52711k.m112237a("contentRootView");
        }
        View findViewById3 = view3.findViewById(R.id.dpc);
        C52711k.m112236a((Object) findViewById3, "contentRootView.findView…d.video_image_mixed_text)");
        this.f112093b = (DmtTextView) findViewById3;
        RecyclerView recyclerView = this.f112092a;
        if (recyclerView == null) {
            C52711k.m112237a("mediaSelectRecyleView");
        }
        recyclerView.setLayoutManager(new C44278a(this, context));
        C1506w wVar = new C1506w();
        wVar.f4728i = 250;
        wVar.f4730k = 250;
        wVar.f4729j = 250;
        wVar.f4731l = 250;
        RecyclerView recyclerView2 = this.f112092a;
        if (recyclerView2 == null) {
            C52711k.m112237a("mediaSelectRecyleView");
        }
        recyclerView2.setItemAnimator(wVar);
        if (VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C44280b());
            setClipToOutline(true);
            setElevation(C20141b.m49696a(context, 16.0f));
        }
    }

    public /* synthetic */ VideoImageMixedView(Context context, AttributeSet attributeSet, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }
}
