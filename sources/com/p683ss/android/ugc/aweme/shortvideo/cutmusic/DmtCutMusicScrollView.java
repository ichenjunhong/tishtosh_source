package com.p683ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.shortvideo.C43203d;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView */
public final class DmtCutMusicScrollView extends RecyclerView {

    /* renamed from: N */
    public AVCutMusicView f109161N;

    /* renamed from: O */
    public C43173a f109162O;

    /* renamed from: P */
    public boolean f109163P;

    /* renamed from: Q */
    public boolean f109164Q;

    /* renamed from: R */
    private C1322a<?> f109165R;

    /* renamed from: S */
    private float f109166S;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView$a */
    public interface C43173a {
        /* renamed from: a */
        void mo87768a(float f);

        /* renamed from: b */
        void mo87769b(float f);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView$b */
    public static final class C43174b extends C1352v {
        public C43174b(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView$c */
    public static final class C43175c extends C1322a<C1352v> {

        /* renamed from: a */
        final /* synthetic */ DmtCutMusicScrollView f109167a;

        public final int getItemCount() {
            return 1;
        }

        public final void onBindViewHolder(C1352v vVar, int i) {
            C52711k.m112240b(vVar, "viewHolder");
        }

        C43175c(DmtCutMusicScrollView dmtCutMusicScrollView) {
            this.f109167a = dmtCutMusicScrollView;
        }

        public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            C52711k.m112240b(viewGroup, "viewGroup");
            return new C43174b(DmtCutMusicScrollView.m94709a(this.f109167a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView$d */
    public static final class C43176d extends C1340m {

        /* renamed from: a */
        final /* synthetic */ DmtCutMusicScrollView f109168a;

        C43176d(DmtCutMusicScrollView dmtCutMusicScrollView) {
            this.f109168a = dmtCutMusicScrollView;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            if (i == 0 && this.f109168a.f109162O != null && this.f109168a.f109163P) {
                C43173a aVar = this.f109168a.f109162O;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                aVar.mo87768a((this.f109168a.getScrollDx() * 1.0f) / ((float) DmtCutMusicScrollView.m94709a(this.f109168a).getMeasuredWidth()));
                this.f109168a.f109163P = false;
                this.f109168a.f109164Q = false;
            }
            super.onScrollStateChanged(recyclerView, i);
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            DmtCutMusicScrollView dmtCutMusicScrollView = this.f109168a;
            dmtCutMusicScrollView.setScrollDx(dmtCutMusicScrollView.getScrollDx() + ((float) i));
            if (this.f109168a.f109162O != null && this.f109168a.f109164Q) {
                float scrollDx = (this.f109168a.getScrollDx() * 1.0f) / ((float) DmtCutMusicScrollView.m94709a(this.f109168a).getMeasuredWidth());
                C43173a aVar = this.f109168a.f109162O;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                aVar.mo87769b(scrollDx);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView$e */
    static final class C43177e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DmtCutMusicScrollView f109169a;

        /* renamed from: b */
        final /* synthetic */ float f109170b;

        C43177e(DmtCutMusicScrollView dmtCutMusicScrollView, float f) {
            this.f109169a = dmtCutMusicScrollView;
            this.f109170b = f;
        }

        public final void run() {
            this.f109169a.scrollBy((int) (((float) DmtCutMusicScrollView.m94709a(this.f109169a).getViewWidth()) * this.f109170b), 0);
        }
    }

    public final float getScrollDx() {
        return this.f109166S;
    }

    public final void setScrollDx(float f) {
        this.f109166S = f;
    }

    public final void setScrollListener(C43173a aVar) {
        C52711k.m112240b(aVar, "listener");
        this.f109162O = aVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ AVCutMusicView m94709a(DmtCutMusicScrollView dmtCutMusicScrollView) {
        AVCutMusicView aVCutMusicView = dmtCutMusicScrollView.f109161N;
        if (aVCutMusicView == null) {
            C52711k.m112237a("cutMusicView");
        }
        return aVCutMusicView;
    }

    public final void setWaveColor(int i) {
        AVCutMusicView aVCutMusicView = this.f109161N;
        if (aVCutMusicView == null) {
            C52711k.m112237a("cutMusicView");
        }
        aVCutMusicView.setColor(i);
    }

    /* renamed from: a */
    public final void mo87761a(float f) {
        post(new C43177e(this, f));
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "e");
        if (motionEvent.getAction() == 1) {
            this.f109163P = true;
        } else if (motionEvent.getAction() == 0) {
            this.f109164Q = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAudioWaveViewData(C43203d dVar) {
        if (dVar != null) {
            AVCutMusicView aVCutMusicView = this.f109161N;
            if (aVCutMusicView == null) {
                C52711k.m112237a("cutMusicView");
            }
            aVCutMusicView.setAudioWaveViewData(dVar);
            C1322a<?> aVar = this.f109165R;
            if (aVar == null) {
                C52711k.m112237a("adatper");
            }
            setAdapter(aVar);
        }
    }

    /* renamed from: a */
    public final void mo87762a(float f, boolean z) {
        int i;
        AVCutMusicView aVCutMusicView = this.f109161N;
        if (aVCutMusicView == null) {
            C52711k.m112237a("cutMusicView");
        }
        if (z) {
            i = (int) this.f109166S;
        } else {
            i = 0;
        }
        aVCutMusicView.mo87732a(i, f);
    }

    public DmtCutMusicScrollView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f109161N = new AVCutMusicView(context);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.mo4731b(0);
        linearLayoutManager.mo4732b(C47918gj.m103682a(context));
        setLayoutManager(linearLayoutManager);
        setOverScrollMode(2);
        this.f109165R = new C43175c(this);
        mo4801a((C1340m) new C43176d(this));
    }

    public /* synthetic */ DmtCutMusicScrollView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
