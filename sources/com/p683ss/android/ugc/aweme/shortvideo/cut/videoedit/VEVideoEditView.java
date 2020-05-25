package com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout.LayoutParams;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42652k;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.C42659b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.C43135a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VEVideoEditView */
public final class VEVideoEditView extends VideoEditView {

    /* renamed from: P */
    private boolean f108825P;

    /* renamed from: Q */
    private final float f108826Q;

    /* renamed from: b */
    public long f108827b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VEVideoEditView$a */
    static final class C43106a<T> implements C0199s<Long> {

        /* renamed from: a */
        final /* synthetic */ VEVideoEditView f108828a;

        C43106a(VEVideoEditView vEVideoEditView) {
            this.f108828a = vEVideoEditView;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Long l = (Long) obj;
            if (l != null) {
                VEVideoEditView vEVideoEditView = this.f108828a;
                C52711k.m112236a((Object) l, "it");
                vEVideoEditView.f108827b = l.longValue();
                this.f108828a.mo87512a(this.f108828a.f108835F, this.f108828a.f108827b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VEVideoEditView$b */
    static final class C43107b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VEVideoEditView f108829a;

        C43107b(VEVideoEditView vEVideoEditView) {
            this.f108829a = vEVideoEditView;
        }

        public final void run() {
            this.f108829a.mo87530i();
            this.f108829a.mo87531j();
        }
    }

    public VEVideoEditView(Context context) {
        this(context, null, 0, 6, null);
    }

    public VEVideoEditView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: d */
    public final boolean mo87519d() {
        return this.f108825P;
    }

    /* renamed from: f */
    public final void mo87521f() {
        this.f108877e.mo87632j();
    }

    public final long getMultiPlayingPosition() {
        return getPlayingPosition();
    }

    public final long getMultiSeekTime() {
        return getSingleSeekTime();
    }

    public final long getSinglePlayingPosition() {
        return getPlayingPosition();
    }

    /* renamed from: k */
    public final void mo87532k() {
        super.mo87532k();
        m94447r();
    }

    /* renamed from: l */
    public final void mo87533l() {
        super.mo87533l();
        m94447r();
    }

    /* renamed from: r */
    private final void m94447r() {
        post(new C43107b(this));
    }

    public final long getLeftSeekingValue() {
        return (long) ((this.f108832C + ((float) C42652k.f107892d)) * this.f108893u.f107931e);
    }

    /* renamed from: h */
    public final void mo87529h() {
        super.mo87529h();
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f108878f;
        C52711k.m112236a((Object) cutMultiVideoViewModel, "cutMultiVideoViewModel");
        cutMultiVideoViewModel.f107669c.observe(this.f108876d, new C43106a(this));
    }

    /* renamed from: e */
    public final void mo87520e() {
        C42659b bVar = this.f108893u;
        VideoEditViewModel videoEditViewModel = this.f108877e;
        C52711k.m112236a((Object) videoEditViewModel, "videoEditViewModel");
        List l = videoEditViewModel.mo87634l();
        VideoEditViewModel videoEditViewModel2 = this.f108877e;
        C52711k.m112236a((Object) videoEditViewModel2, "videoEditViewModel");
        bVar.mo86963a(l, videoEditViewModel2.mo87635m());
        C43113a aVar = this.f108898z;
        C42659b bVar2 = this.f108893u;
        C52711k.m112236a((Object) bVar2, "frameParamState");
        aVar.mo87643a(bVar2.f107928b);
    }

    public final long getPlayingPosition() {
        float f = this.f108832C;
        RTLLinearLayout rTLLinearLayout = this.f108890r;
        C52711k.m112236a((Object) rTLLinearLayout, "mCurPointerContainer");
        float startX = f + rTLLinearLayout.getStartX();
        C43135a aVar = this.f108880h;
        C52711k.m112236a((Object) aVar, "mStartSlide");
        return (long) ((startX - aVar.getStartX()) * this.f108893u.f107931e);
    }

    public final long getRightSeekingValue() {
        float f = this.f108832C;
        C43135a aVar = this.f108879g;
        C52711k.m112236a((Object) aVar, "mEndSlide");
        float startX = f + aVar.getStartX();
        C43135a aVar2 = this.f108880h;
        C52711k.m112236a((Object) aVar2, "mStartSlide");
        return (long) ((startX - aVar2.getStartX()) * this.f108893u.f107931e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo87535n() {
        super.mo87535n();
        if (this.f108880h != null) {
            this.f108880h.setImageDrawable(m94446a(true, 3));
        }
        if (this.f108879g != null) {
            this.f108879g.setImageDrawable(m94446a(false, 3));
        }
    }

    public final C0794k<Long, Long> getMultiVideoPlayBoundary() {
        long j = (long) ((this.f108832C + ((float) C42652k.f107892d)) * this.f108893u.f107931e);
        long j2 = (long) ((this.f108832C + ((float) C42652k.f107892d) + this.f108833D) * this.f108893u.f107931e);
        VideoEditViewModel videoEditViewModel = this.f108877e;
        C52711k.m112236a((Object) videoEditViewModel, "videoEditViewModel");
        long a = m94445a(j, videoEditViewModel.mo87635m());
        VideoEditViewModel videoEditViewModel2 = this.f108877e;
        C52711k.m112236a((Object) videoEditViewModel2, "videoEditViewModel");
        return new C0794k<>(Long.valueOf(a), Long.valueOf(m94445a(j2, videoEditViewModel2.mo87635m())));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo87534m() {
        this.f108877e.mo87611a(this.f108839J, this.f108836G);
        C42659b bVar = this.f108893u;
        VideoEditViewModel videoEditViewModel = this.f108877e;
        C52711k.m112236a((Object) videoEditViewModel, "videoEditViewModel");
        Object obj = videoEditViewModel.mo87634l().get(this.f108836G);
        C52711k.m112236a(obj, "videoEditViewModel.origi…t[currentEditOriginIndex]");
        bVar.mo86962a(((VideoSegment) obj).mo86950e(), this.f108839J.f107943d);
        VideoEditViewModel videoEditViewModel2 = this.f108877e;
        C52711k.m112236a((Object) videoEditViewModel2, "videoEditViewModel");
        VideoSegment videoSegment = (VideoSegment) videoEditViewModel2.mo87634l().get(this.f108836G);
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f108878f;
        C52711k.m112236a((Object) videoSegment, "video");
        cutMultiVideoViewModel.mo86801a(videoSegment.mo86950e());
        if (this.f108825P) {
            this.f108877e.mo87617b(this.f108836G, getOverXScroll());
        } else {
            this.f108877e.mo87607a(this.f108836G, getOverXScroll());
        }
    }

    /* renamed from: i */
    public final void mo87530i() {
        View view;
        float f;
        float f2;
        if (this.f108887o != null) {
            int i = 0;
            C1352v f3 = this.f108896x.mo4847f(0);
            if (this.f108835F == 1) {
                f3 = this.f108895w.mo4847f(0);
            }
            if (f3 != null) {
                view = f3.itemView;
            } else {
                view = null;
            }
            float f4 = 0.0f;
            if (view == null) {
                C43135a aVar = this.f108880h;
                C52711k.m112236a((Object) aVar, "mStartSlide");
                float startX = aVar.getStartX();
                if (this.f108825P) {
                    f4 = this.f108826Q;
                }
                f = startX + f4;
            } else {
                int[] iArr = new int[2];
                f3.itemView.getLocationOnScreen(iArr);
                if (iArr[0] < 0) {
                    C43135a aVar2 = this.f108880h;
                    C52711k.m112236a((Object) aVar2, "mStartSlide");
                    float startX2 = aVar2.getStartX();
                    if (this.f108825P) {
                        f4 = this.f108826Q;
                    }
                    f = startX2 + f4;
                } else {
                    C43135a aVar3 = this.f108880h;
                    C52711k.m112236a((Object) aVar3, "mStartSlide");
                    float startX3 = aVar3.getStartX() - ((float) iArr[0]);
                    if (this.f108825P) {
                        f2 = this.f108826Q;
                    } else {
                        f2 = 0.0f;
                    }
                    f = startX3 + f2;
                    if (f < 0.0f) {
                        f = 0.0f;
                    }
                    i = iArr[0];
                }
            }
            LayoutParams layoutParams = new LayoutParams((int) f, this.f108840K);
            layoutParams.topMargin = this.f108843N;
            layoutParams.leftMargin = i;
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(i);
            }
            View view2 = this.f108887o;
            C52711k.m112236a((Object) view2, "startCover");
            view2.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: j */
    public final void mo87531j() {
        View view;
        float f;
        float f2;
        if (this.f108888p != null) {
            MVRecycleView mVRecycleView = this.f108896x;
            C43113a aVar = this.f108830A;
            C52711k.m112236a((Object) aVar, "singleFramesAdapter");
            C1352v f3 = mVRecycleView.mo4847f(aVar.getItemCount() - 1);
            if (this.f108835F == 1) {
                MVRecycleView mVRecycleView2 = this.f108895w;
                C43113a aVar2 = this.f108898z;
                C52711k.m112236a((Object) aVar2, "framesAdapter");
                f3 = mVRecycleView2.mo4847f(aVar2.getItemCount() - 1);
            }
            if (f3 != null) {
                view = f3.itemView;
            } else {
                view = null;
            }
            float f4 = 0.0f;
            if (view == null) {
                float f5 = (float) this.f108875c;
                C43135a aVar3 = this.f108879g;
                C52711k.m112236a((Object) aVar3, "mEndSlide");
                float startX = (f5 - aVar3.getStartX()) - ((float) C42652k.f107892d);
                if (this.f108825P) {
                    f2 = this.f108826Q;
                } else {
                    f2 = 0.0f;
                }
                f = startX + f2;
            } else {
                int[] iArr = new int[2];
                f3.itemView.getLocationOnScreen(iArr);
                int i = iArr[0];
                View view2 = f3.itemView;
                C52711k.m112236a((Object) view2, "viewHolder.itemView");
                iArr[0] = i + view2.getWidth();
                float f6 = (float) iArr[0];
                C43135a aVar4 = this.f108879g;
                C52711k.m112236a((Object) aVar4, "mEndSlide");
                f = (f6 - aVar4.getStartX()) - ((float) C42652k.f107892d);
                if (f < 0.0f) {
                    f = 0.0f;
                }
                float f7 = (float) this.f108875c;
                C43135a aVar5 = this.f108879g;
                C52711k.m112236a((Object) aVar5, "mEndSlide");
                float startX2 = ((f7 - aVar5.getStartX()) - f) - ((float) C42652k.f107892d);
                if (this.f108825P) {
                    f4 = this.f108826Q;
                }
                f4 += startX2;
            }
            LayoutParams layoutParams = new LayoutParams((int) f, this.f108840K);
            layoutParams.topMargin = this.f108843N;
            layoutParams.gravity = 5;
            int i2 = (int) f4;
            layoutParams.rightMargin = i2;
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginEnd(i2);
                layoutParams.gravity = 8388613;
            }
            View view3 = this.f108888p;
            C52711k.m112236a((Object) view3, "endCover");
            view3.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo87514a(VideoSegment videoSegment) {
        C52711k.m112240b(videoSegment, "videoSegment");
        super.mo87514a(videoSegment);
        m94447r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo87518a(String str) {
        C52711k.m112240b(str, "tag");
        if (this.f108825P) {
            return true;
        }
        return super.mo87518a(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x011d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87513a(android.support.p030v4.p038f.C0794k<java.lang.Integer, java.lang.Integer> r13) {
        /*
            r12 = this;
            java.lang.String r0 = "pair"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
            r0 = 2
            r12.f108835F = r0
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r1 = r12.f108877e
            r1.mo87606a(r0)
            F r0 = r13.f2711a
            if (r0 != 0) goto L_0x0014
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0014:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r12.f108837H = r0
            S r0 = r13.f2712b
            if (r0 != 0) goto L_0x0023
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0023:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r12.f108836G = r0
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r0 = r12.f108877e
            java.lang.String r1 = "videoEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.util.List r0 = r0.mo87634l()
            int r1 = r12.f108836G
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r0 = (com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r0
            com.ss.android.ugc.aweme.shortvideo.cut.model.d r1 = r12.f108839J
            if (r1 != 0) goto L_0x004a
            com.ss.android.ugc.aweme.shortvideo.cut.model.d r1 = new com.ss.android.ugc.aweme.shortvideo.cut.model.d
            r1.<init>(r0)
            r12.f108839J = r1
            goto L_0x004f
        L_0x004a:
            com.ss.android.ugc.aweme.shortvideo.cut.model.d r1 = r12.f108839J
            r1.mo86967a(r0)
        L_0x004f:
            long r1 = r0.f107904c
            boolean r3 = r12.f108825P
            r4 = 1000(0x3e8, double:4.94E-321)
            if (r3 == 0) goto L_0x0096
            java.lang.String r1 = "curEditVideo"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            long r1 = r0.mo86953g()
            long r6 = r0.mo86952f()
            long r1 = r1 - r6
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0096
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r1 = r12.f108880h
            r2 = r12
            android.view.View$OnTouchListener r2 = (android.view.View.OnTouchListener) r2
            r1.setOnTouchListener(r2)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r1 = r12.f108880h
            java.lang.String r3 = "mStartSlide"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            java.lang.String r3 = "block"
            r1.setTag(r3)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r1 = r12.f108879g
            r1.setOnTouchListener(r2)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r1 = r12.f108879g
            java.lang.String r2 = "mEndSlide"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.String r2 = "block"
            r1.setTag(r2)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout r1 = r12.f108890r
            r2 = 0
            r1.setOnTouchListener(r2)
            r7 = r4
            goto L_0x0097
        L_0x0096:
            r7 = r1
        L_0x0097:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r1 = r12.f108877e
            int r2 = r12.f108836G
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r1 = r1.mo87626e(r2)
            com.ss.android.ugc.aweme.shortvideo.cut.model.b r6 = r12.f108893u
            java.lang.String r2 = "curEditVideo"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.lang.String r9 = r0.mo86950e()
            java.lang.String r2 = "curSingleideoSegment"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            float r10 = r1.mo86954h()
            int r11 = r12.f108835F
            r6.mo86961a(r7, r9, r10, r11)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.MVRecycleView r2 = r12.f108895w
            java.lang.String r3 = "frameRecyclerView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r3 = 8
            r2.setVisibility(r3)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a r2 = r12.f108898z
            r2.mo87646b()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.MVRecycleView r2 = r12.f108896x
            java.lang.String r3 = "singleFrameRecyclerView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r3 = 0
            r2.setVisibility(r3)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.MVRecycleView r2 = r12.f108896x
            r2.mo4814b(r3)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a r2 = r12.f108830A
            android.support.v4.app.FragmentActivity r4 = r12.f108876d
            android.arch.lifecycle.k r4 = (android.arch.lifecycle.C0184k) r4
            com.ss.android.ugc.aweme.shortvideo.cut.model.b r5 = r12.f108893u
            java.lang.String r6 = "frameParamState"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.util.HashMap<java.lang.String, java.lang.Float> r5 = r5.f107928b
            r2.mo87641a(r4, r5, r0, r3)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r0 = r12.f108877e
            int r2 = r12.f108836G
            int r0 = r0.mo87614b(r2)
            boolean r2 = r12.f108825P
            if (r2 == 0) goto L_0x0114
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r0 = r12.f108877e
            int r2 = r12.f108836G
            int r0 = r0.mo87620c(r2)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r2 = r12.f108877e
            int r4 = r12.f108836G
            boolean r2 = r2.mo87625d(r4)
            if (r2 != 0) goto L_0x0114
            long r4 = r1.mo86952f()
            float r0 = (float) r4
            com.ss.android.ugc.aweme.shortvideo.cut.model.b r2 = r12.f108893u
            float r2 = r2.f107931e
            float r0 = r0 / r2
            int r0 = (int) r0
        L_0x0114:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.MVRecycleView r2 = r12.f108896x
            r2.mo4795a(r0, r3)
            com.ss.android.ugc.aweme.shortvideo.cut.model.c r2 = r12.f108838I
            if (r2 == 0) goto L_0x012c
            float r4 = r12.getStartSlideX()
            float r5 = r12.getEndSlideX()
            int r6 = r12.getOverXScroll()
            r2.mo86965a(r4, r5, r6)
        L_0x012c:
            com.ss.android.ugc.aweme.shortvideo.cut.model.b r2 = r12.f108893u
            int r4 = r12.f108844O
            float r0 = com.p683ss.android.ugc.aweme.shortvideo.cut.C42652k.m93579a(r2, r1, r0, r4)
            android.support.v4.app.FragmentActivity r2 = r12.f108876d
            android.content.Context r2 = (android.content.Context) r2
            com.ss.android.ugc.aweme.shortvideo.cut.model.b r4 = r12.f108893u
            int r5 = r12.f108844O
            float r1 = com.p683ss.android.ugc.aweme.shortvideo.cut.C42652k.m93578a(r2, r4, r0, r1, r5)
            r12.mo87540a(r0, r1, r3)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r0 = r12.f108877e
            r0.mo87609a(r13)
            r12.m94447r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VEVideoEditView.mo87513a(android.support.v4.f.k):void");
    }

    /* renamed from: a */
    public final void mo87516a(List<? extends VideoSegment> list) {
        C52711k.m112240b(list, "videoSegmentList");
        this.f108835F = 1;
        this.f108877e.mo87606a(1);
        if (this.f108839J != null) {
            this.f108839J.mo86966a();
        }
        if (this.f108838I != null) {
            this.f108838I.mo86964a();
        }
        for (VideoSegment videoSegment : list) {
            this.f108893u.mo86962a(videoSegment.mo86950e(), videoSegment.mo86954h());
        }
        this.f108877e.mo87619b(list);
        C42659b bVar = this.f108893u;
        VideoEditViewModel videoEditViewModel = this.f108877e;
        C52711k.m112236a((Object) videoEditViewModel, "videoEditViewModel");
        List l = videoEditViewModel.mo87634l();
        VideoEditViewModel videoEditViewModel2 = this.f108877e;
        C52711k.m112236a((Object) videoEditViewModel2, "videoEditViewModel");
        bVar.mo86963a(l, videoEditViewModel2.mo87635m());
        mo87540a((float) this.f108844O, (float) ((this.f108875c - this.f108844O) - C42652k.f107892d), 0);
        MVRecycleView mVRecycleView = this.f108896x;
        C52711k.m112236a((Object) mVRecycleView, "singleFrameRecyclerView");
        mVRecycleView.setVisibility(8);
        this.f108830A.mo87646b();
        MVRecycleView mVRecycleView2 = this.f108895w;
        C52711k.m112236a((Object) mVRecycleView2, "frameRecyclerView");
        mVRecycleView2.setVisibility(0);
        this.f108895w.mo4814b(0);
        C43113a aVar = this.f108898z;
        C0184k kVar = this.f108876d;
        C42659b bVar2 = this.f108893u;
        C52711k.m112236a((Object) bVar2, "frameParamState");
        aVar.mo87642a(kVar, list, bVar2.f107928b);
    }

    /* renamed from: a */
    public final void mo87517a(boolean z) {
        this.f108825P = z;
        mo87535n();
        if (z) {
            this.f108880h.setOnTouchListener(null);
            this.f108879g.setOnTouchListener(null);
            this.f108890r.setOnTouchListener(null);
            MVRecycleView mVRecycleView = this.f108895w;
            C52711k.m112236a((Object) mVRecycleView, "frameRecyclerView");
            mVRecycleView.setVisibility(8);
            return;
        }
        OnTouchListener onTouchListener = this;
        this.f108880h.setOnTouchListener(onTouchListener);
        C43135a aVar = this.f108880h;
        C52711k.m112236a((Object) aVar, "mStartSlide");
        aVar.setTag("startSlide");
        this.f108879g.setOnTouchListener(onTouchListener);
        C43135a aVar2 = this.f108879g;
        C52711k.m112236a((Object) aVar2, "mEndSlide");
        aVar2.setTag("endSlide");
        this.f108890r.setOnTouchListener(onTouchListener);
        MVRecycleView mVRecycleView2 = this.f108895w;
        C52711k.m112236a((Object) mVRecycleView2, "frameRecyclerView");
        mVRecycleView2.setVisibility(0);
        m94447r();
    }

    /* renamed from: a */
    public final void mo87512a(int i, long j) {
        C43135a aVar = this.f108880h;
        C52711k.m112236a((Object) aVar, "mStartSlide");
        mo87541a((aVar.getStartX() + (((float) j) / this.f108893u.f107931e)) - this.f108832C, false);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C52711k.m112240b(view, "v");
        C52711k.m112240b(motionEvent, "event");
        if (this.f108825P) {
            setEnabled(true);
        }
        return super.onTouch(view, motionEvent);
    }

    /* renamed from: a */
    private final long m94445a(long j, float f) {
        VideoEditViewModel videoEditViewModel = this.f108877e;
        C52711k.m112236a((Object) videoEditViewModel, "videoEditViewModel");
        if (videoEditViewModel.mo87634l() != null) {
            VideoEditViewModel videoEditViewModel2 = this.f108877e;
            C52711k.m112236a((Object) videoEditViewModel2, "videoEditViewModel");
            if (!videoEditViewModel2.mo87634l().isEmpty()) {
                VideoEditViewModel videoEditViewModel3 = this.f108877e;
                C52711k.m112236a((Object) videoEditViewModel3, "videoEditViewModel");
                List<VideoSegment> l = videoEditViewModel3.mo87634l();
                C52711k.m112236a((Object) l, "videoEditViewModel.originVideoList");
                long j2 = 0;
                for (VideoSegment videoSegment : l) {
                    if (!videoSegment.f107911j) {
                        C52711k.m112236a((Object) videoSegment, "videoSegment");
                        float g = ((float) (videoSegment.mo86953g() - videoSegment.mo86952f())) / (videoSegment.mo86954h() * f);
                        float f2 = (float) j;
                        if (f2 <= g) {
                            return (long) ((((float) j2) + (f2 * videoSegment.mo86954h())) * f);
                        }
                        j2 += videoSegment.mo86953g() - videoSegment.mo86952f();
                        j = (long) (f2 - g);
                    }
                }
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private final Drawable m94446a(boolean z, int i) {
        boolean z2;
        Drawable drawable;
        FragmentActivity fragmentActivity = this.f108876d;
        C52711k.m112236a((Object) fragmentActivity, "context");
        int color = fragmentActivity.getResources().getColor(R.color.a3_);
        int parseColor = Color.parseColor("#FFFFFF");
        float a = C20141b.m49696a((Context) this.f108876d, 2.0f);
        if (C47918gj.m103682a(this.f108876d)) {
            z2 = !z;
        } else {
            z2 = z;
        }
        int i2 = 1;
        Drawable a2 = C42430at.m93198a(color, color, 0, z2 ? new float[]{a, a, 0.0f, 0.0f, 0.0f, 0.0f, a, a} : new float[]{0.0f, 0.0f, a, a, a, a, 0.0f, 0.0f});
        if (this.f108825P) {
            Drawable[] drawableArr = new Drawable[1];
            for (int i3 = 0; i3 <= 0; i3++) {
                drawableArr[i3] = a2;
            }
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            if (z2) {
                layerDrawable.setLayerInset(0, (int) this.f108826Q, 0, 0, 0);
            } else {
                layerDrawable.setLayerInset(0, 0, 0, (int) this.f108826Q, 0);
            }
            return layerDrawable;
        }
        Drawable[] drawableArr2 = new Drawable[4];
        for (int i4 = 0; i4 < 4; i4++) {
            if (i4 == 0) {
                C52711k.m112236a((Object) a2, "slideDrawable");
                drawable = a2;
            } else {
                drawable = C42430at.m93196a(parseColor, parseColor, 0, 0);
                C52711k.m112236a((Object) drawable, "DmtDesignDrawableFactory…Color, handleColor, 0, 0)");
            }
            drawableArr2[i4] = drawable;
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr2);
        int i5 = (int) (((float) this.f108841L) / 3.0f);
        while (true) {
            float f = ((float) i2) * 2.0f;
            layerDrawable2.setLayerInset(i2, (int) ((((float) C42652k.f107892d) / 3.0f) * (((f - 2.0f) / 5.0f) + 1.0f)), i5, (int) ((((float) C42652k.f107892d) / 3.0f) * (((6.0f - f) / 5.0f) + 1.0f)), i5);
            if (i2 == 3) {
                return layerDrawable2;
            }
            i2++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo87515a(VideoSegment videoSegment, int i) {
        if (!this.f108825P) {
            MVRecycleView mVRecycleView = this.f108895w;
            C52711k.m112236a((Object) mVRecycleView, "frameRecyclerView");
            mVRecycleView.setVisibility(0);
        }
        MVRecycleView mVRecycleView2 = this.f108896x;
        C52711k.m112236a((Object) mVRecycleView2, "singleFrameRecyclerView");
        mVRecycleView2.setVisibility(8);
        this.f108830A.mo87646b();
        if (i == 2) {
            this.f108895w.mo4814b(0);
            C43113a aVar = this.f108898z;
            C0184k kVar = this.f108876d;
            C42659b bVar = this.f108893u;
            C52711k.m112236a((Object) bVar, "frameParamState");
            aVar.mo87640a(kVar, bVar.f107928b, this.f108835F, false);
            this.f108877e.mo87631i();
        } else if (i == 3) {
            this.f108895w.mo4814b(0);
            C43113a aVar2 = this.f108898z;
            C0184k kVar2 = this.f108876d;
            C42659b bVar2 = this.f108893u;
            C52711k.m112236a((Object) bVar2, "frameParamState");
            aVar2.mo87639a(kVar2, videoSegment, bVar2.f107928b);
            this.f108877e.mo87610a(videoSegment);
        } else {
            if (i == 1) {
                this.f108877e.mo87630h();
            }
        }
    }

    public VEVideoEditView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f108826Q = C20141b.m49696a(context, 6.0f);
        setLoadThumbnailDirectly(!C39629l.m88232a().mo58583n().mo83103a(C40790a.VEExtractFramesAfterRender));
    }

    public /* synthetic */ VEVideoEditView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
