package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.C1506w;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1346r;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.p052a.C1385a;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.ktx.C12932b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.imported.C35524e;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42648h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42652k;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42654l;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C43099t;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C43099t.C43101b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.C42663f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel.C42702k;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43015c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43028e;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43028e.C43030b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43047h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43051l;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43051l.C43055c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43051l.C43056d;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43066n;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2181a.C42992e;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2181a.C42997f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43023g;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43024h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43025i;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointSingleVideoEditView;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointVideoSegView;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.C43120d;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel.C43112a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.C43168a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44300e;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.tools.C47339t;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48925b;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.vesdk.C50720o.C50743d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p064c.p065a.p069b.C1690c;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s */
public final class C42937s extends C48925b implements C49548a {

    /* renamed from: aa */
    public static final C42938a f108460aa = new C42938a(null);

    /* renamed from: A */
    public CutVideoSpeedViewModel f108461A;

    /* renamed from: B */
    public CutVideoBottomBarViewModel f108462B;

    /* renamed from: C */
    public CutVideoTitleBarViewModel f108463C;

    /* renamed from: D */
    public CutVideoEditViewModel f108464D;

    /* renamed from: E */
    public CutVideoListViewModel f108465E;

    /* renamed from: F */
    public CutVideoStickerPointMusicViewModel f108466F;

    /* renamed from: G */
    public CutVideoMultiModeViewModel f108467G;

    /* renamed from: H */
    public ValueAnimator f108468H;

    /* renamed from: I */
    public int f108469I;

    /* renamed from: J */
    public int f108470J;

    /* renamed from: K */
    public long f108471K;

    /* renamed from: L */
    public final C42875bp f108472L = new C42856bg();

    /* renamed from: M */
    public boolean f108473M;

    /* renamed from: N */
    public boolean f108474N;

    /* renamed from: O */
    public float f108475O = 1.0f;

    /* renamed from: P */
    public float f108476P;

    /* renamed from: Q */
    public float f108477Q;

    /* renamed from: R */
    public View f108478R;

    /* renamed from: S */
    public C0794k<Integer, Integer> f108479S;

    /* renamed from: T */
    public AnimatorSet f108480T;

    /* renamed from: U */
    public boolean f108481U;

    /* renamed from: V */
    public int f108482V;

    /* renamed from: W */
    public boolean f108483W = true;

    /* renamed from: X */
    public boolean f108484X;

    /* renamed from: Y */
    public boolean f108485Y = true;

    /* renamed from: Z */
    public C42809as f108486Z;

    /* renamed from: ab */
    private CutVideoViewModel f108487ab;

    /* renamed from: ac */
    private CutVideoPreviewViewModel f108488ac;

    /* renamed from: i */
    public C43099t f108489i;

    /* renamed from: j */
    public C42820ax f108490j;

    /* renamed from: k */
    public VECutVideoPresenter f108491k;

    /* renamed from: l */
    public RecyclerView f108492l;

    /* renamed from: m */
    public C42873bn f108493m;

    /* renamed from: n */
    public TextView f108494n;

    /* renamed from: o */
    public View f108495o;

    /* renamed from: p */
    public StickPointVideoSegView f108496p;

    /* renamed from: q */
    SimpleDraweeView f108497q;

    /* renamed from: r */
    FrameLayout f108498r;

    /* renamed from: s */
    public ImageView f108499s;

    /* renamed from: t */
    public ImageView f108500t;

    /* renamed from: u */
    public FrameLayout f108501u;

    /* renamed from: v */
    public FrameLayout f108502v;

    /* renamed from: w */
    public StickPointSingleVideoEditView f108503w;

    /* renamed from: x */
    public CutMultiVideoViewModel f108504x;

    /* renamed from: y */
    public VideoEditViewModel f108505y;

    /* renamed from: z */
    public VEVideoCutterViewModel f108506z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$a */
    public static final class C42938a {
        private C42938a() {
        }

        public /* synthetic */ C42938a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$aa */
    static final class C42939aa implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42937s f108507a;

        C42939aa(C42937s sVar) {
            this.f108507a = sVar;
        }

        public final void run() {
            int i;
            Context context = this.f108507a.f33840g_;
            Resources w = this.f108507a.mo24478w();
            if (C44300e.m97041c()) {
                i = R.string.ami;
            } else {
                i = R.string.ds_;
            }
            C10691a.m21537a(context, w.getString(i)).mo19066a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$ab */
    public static final class C42940ab implements C43025i {

        /* renamed from: a */
        final /* synthetic */ C42937s f108508a;

        C42940ab(C42937s sVar) {
            this.f108508a = sVar;
        }

        /* renamed from: a */
        public final void mo87325a(View view) {
            C42937s.m94157a(this.f108508a).mo87072e(false);
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f108508a.f108463C;
            if (cutVideoTitleBarViewModel == null) {
                C52711k.m112237a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel.mo87174e(true);
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.f108508a.f108467G;
            if (cutVideoMultiModeViewModel == null) {
                C52711k.m112237a("videoMultiModeViewModel");
            }
            cutVideoMultiModeViewModel.mo87093a(true);
            CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = this.f108508a.f108466F;
            if (cutVideoStickerPointMusicViewModel == null) {
                C52711k.m112237a("stickPointMusicViewModel");
            }
            cutVideoStickerPointMusicViewModel.mo22530c(new C42721d(true));
            C42937s.m94157a(this.f108508a).mo87068b(true);
        }

        /* renamed from: b */
        public final void mo87327b(View view) {
            C42820ax axVar = this.f108508a.f108490j;
            if (axVar == null) {
                C52711k.m112234a();
            }
            C43028e eVar = axVar.f108262f;
            C42820ax axVar2 = this.f108508a.f108490j;
            if (axVar2 == null) {
                C52711k.m112234a();
            }
            List<? extends VideoSegment> b = axVar2.mo87264b();
            eVar.f108628k = false;
            C43030b bVar = eVar.f108623f;
            if (bVar != null) {
                bVar.mo87275a();
            }
            if (C9190h.m18253a(b)) {
                eVar.mo87407a(true, false, false);
            } else if (eVar.f108618a == null) {
                eVar.mo87407a(false, false, false);
            } else {
                eVar.mo87409b();
                eVar.f108628k = false;
                eVar.f108627j = 0.0f;
                if (b == null) {
                    C52711k.m112234a();
                }
                eVar.f108626i = 1.0f / ((float) b.size());
                eVar.f108619b = 0;
                eVar.f108622e = b;
                eVar.f108620c = (VideoSegment) b.get(0);
                VideoSegment videoSegment = eVar.f108620c;
                if (videoSegment == null) {
                    C52711k.m112234a();
                }
                eVar.f108621d = videoSegment.f107902a;
                eVar.mo87410c();
                eVar.mo87405a();
            }
            C43047h hVar = C43047h.f108667g;
            C26890h.m65011a("apply_smart_sync", C43047h.m94328a().mo47829a("to_status", "on").f61491a);
        }

        /* renamed from: a */
        public final void mo87326a(List<? extends MediaModel> list) {
            if (C9190h.m18253a(list)) {
                C42820ax axVar = this.f108508a.f108490j;
                if (axVar == null) {
                    C52711k.m112234a();
                }
                if (axVar.f108276t) {
                    C42820ax axVar2 = this.f108508a.f108490j;
                    if (axVar2 == null) {
                        C52711k.m112234a();
                    }
                    axVar2.f108259c.mo87437d();
                    C42820ax axVar3 = this.f108508a.f108490j;
                    if (axVar3 == null) {
                        C52711k.m112234a();
                    }
                    axVar3.f108276t = false;
                }
                return;
            }
            C42937s sVar = this.f108508a;
            ArrayList arrayList = new ArrayList();
            C42820ax axVar4 = sVar.f108490j;
            if (axVar4 == null) {
                C52711k.m112234a();
            }
            C43024h hVar = axVar4.f108261e;
            if (hVar == null) {
                C52711k.m112234a();
            }
            int size = hVar.mo87217c().size();
            if (list == null) {
                C52711k.m112234a();
            }
            int size2 = list.size();
            for (int i = 0; i < size2; i++) {
                VideoSegment videoSegment = new VideoSegment((MediaModel) list.get(i));
                videoSegment.f107902a = size;
                arrayList.add(videoSegment);
                size++;
            }
            List list2 = arrayList;
            sVar.f108472L.mo87320a(list2);
            sVar.f108472L.mo87324c();
            C42820ax axVar5 = sVar.f108490j;
            if (axVar5 == null) {
                C52711k.m112234a();
            }
            axVar5.mo87258a().mo87516a(list2);
            C42820ax axVar6 = sVar.f108490j;
            if (axVar6 == null) {
                C52711k.m112234a();
            }
            if (axVar6.f108261e != null) {
                C42820ax axVar7 = sVar.f108490j;
                if (axVar7 == null) {
                    C52711k.m112234a();
                }
                C43024h hVar2 = axVar7.f108261e;
                if (hVar2 == null) {
                    C52711k.m112234a();
                }
                hVar2.mo87214a(list2);
            }
            if (sVar.mo87352H()) {
                C42820ax axVar8 = sVar.f108490j;
                if (axVar8 == null) {
                    C52711k.m112234a();
                }
                C43051l lVar = axVar8.f108259c;
                C43023g cVar = new C42950c();
                if (lVar.f108673a == null) {
                    cVar.mo87073a();
                } else if (C9190h.m18253a(list2)) {
                    cVar.mo87073a();
                } else {
                    C0013i.m16a((Callable<TResult>) new C43055c<TResult>(lVar, size, list2)).mo20a((C0011g<TResult, TContinuationResult>) new C43056d<TResult,TContinuationResult>(lVar, cVar, size, list2), C0013i.f25b);
                }
            }
        }

        /* renamed from: c */
        public final void mo87328c(View view) {
            String str;
            String str2;
            if (C43036f.f108637b.mo87417a(this.f108508a.f33840g_, this.f108508a.f108472L.mo87316a(), this.f108508a.f108472L.mo87322b())) {
                C42820ax axVar = this.f108508a.f108490j;
                if (axVar == null) {
                    C52711k.m112234a();
                }
                axVar.f108277u = true;
                C42820ax axVar2 = this.f108508a.f108490j;
                if (axVar2 == null) {
                    C52711k.m112234a();
                }
                if (axVar2.f108259c.mo87434b()) {
                    C42820ax axVar3 = this.f108508a.f108490j;
                    if (axVar3 == null) {
                        C52711k.m112234a();
                    }
                    axVar3.f108276t = true;
                }
                C42820ax axVar4 = this.f108508a.f108490j;
                if (axVar4 == null) {
                    C52711k.m112234a();
                }
                axVar4.f108259c.mo87435c();
            }
            C43047h hVar = C43047h.f108667g;
            String str3 = "click_upload_entrance";
            C23089d a = C43047h.m94328a().mo47829a("enter_from", "clip_edit_page");
            String str4 = "reply_comment_id";
            if (C52711k.m112239a((Object) C43047h.f108661a, (Object) "comment_reply")) {
                str = C43047h.f108664d;
            } else {
                str = "";
            }
            C23089d a2 = a.mo47829a(str4, str);
            String str5 = "reply_user_id";
            if (C52711k.m112239a((Object) C43047h.f108661a, (Object) "comment_reply")) {
                str2 = C43047h.f108665e;
            } else {
                str2 = "";
            }
            C26890h.m65011a(str3, a2.mo47829a(str5, str2).f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$ac */
    static final class C42941ac implements C43101b {

        /* renamed from: a */
        final /* synthetic */ C42937s f108509a;

        C42941ac(C42937s sVar) {
            this.f108509a = sVar;
        }

        /* renamed from: a */
        public final void mo87356a(View view, int i, String str) {
            ArrayList arrayList;
            if (C42937s.m94160d(this.f108509a).f107992e != 2 && !this.f108509a.f108484X) {
                if (i == 10003) {
                    C43036f fVar = C43036f.f108637b;
                    Activity activity = this.f108509a.f33840g_;
                    C43099t tVar = this.f108509a.f108489i;
                    Long l = null;
                    if (tVar != null) {
                        arrayList = tVar.mo87498b();
                    } else {
                        arrayList = null;
                    }
                    C43099t tVar2 = this.f108509a.f108489i;
                    if (tVar2 != null) {
                        l = Long.valueOf(tVar2.mo87501c());
                    }
                    if (l == null) {
                        C52711k.m112234a();
                    }
                    fVar.mo87417a(activity, arrayList, l.longValue());
                    return;
                }
                C42937s.m94157a(this.f108509a).f108001e = i;
                C42937s.m94157a(this.f108509a).f108002f = C42937s.m94158b(this.f108509a).mo87603a(str);
                if (C42937s.m94157a(this.f108509a).f108002f < 0) {
                    StringBuilder sb = new StringBuilder("edit index:");
                    sb.append(C42937s.m94157a(this.f108509a).f108001e);
                    sb.append(", origin_index:");
                    sb.append(C42937s.m94157a(this.f108509a).f108002f);
                    sb.append(", path:");
                    sb.append(str);
                    C45407ay.m98972c(sb.toString());
                    return;
                }
                C42937s.m94159c(this.f108509a).mo86797a(C42937s.m94157a(this.f108509a).f108001e, C42937s.m94157a(this.f108509a).f108002f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$ad */
    static final class C42942ad implements OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ C42937s f108510a;

        C42942ad(C42937s sVar) {
            this.f108510a = sVar;
        }

        public final boolean onPreDraw() {
            int i;
            int i2;
            ValueAnimator valueAnimator = this.f108510a.f108468H;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                C43099t tVar = this.f108510a.f108489i;
                if (tVar != null) {
                    RecyclerView F = this.f108510a.mo87350F();
                    C43099t tVar2 = this.f108510a.f108489i;
                    if (tVar2 != null) {
                        i2 = tVar2.f108807b;
                    } else {
                        i2 = 0;
                    }
                    i = tVar.mo87380a(F, i2);
                } else {
                    i = -1;
                }
                if (i == -1) {
                    C42937s.m94167k(this.f108510a).setVisibility(4);
                } else {
                    C42937s.m94167k(this.f108510a).setVisibility(0);
                    C42937s.m94167k(this.f108510a).setX((float) i);
                }
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$ae */
    static final class C42943ae implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C42937s f108511a;

        C42943ae(C42937s sVar) {
            this.f108511a = sVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Integer num;
            if (motionEvent != null) {
                num = Integer.valueOf(motionEvent.getAction());
            } else {
                num = null;
            }
            if ((num != null && num.intValue() == 0) || ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 1))) {
                this.f108511a.f108471K = System.currentTimeMillis();
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$af */
    public static final class C42944af implements OnPreDrawListener {

        /* renamed from: a */
        public final int f108512a;

        /* renamed from: b */
        final /* synthetic */ C42937s f108513b;

        /* renamed from: c */
        final /* synthetic */ int f108514c;

        /* renamed from: d */
        final /* synthetic */ Rect f108515d;

        /* renamed from: e */
        final /* synthetic */ boolean f108516e;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$af$a */
        public static final class C42945a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C42944af f108517a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f108518b;

            public final void onAnimationEnd(Animator animator) {
                C52711k.m112240b(animator, "animation");
                super.onAnimationEnd(animator);
                Activity activity = this.f108517a.f108513b.f33840g_;
                if (activity == null || !activity.isFinishing()) {
                    C42937s.m94161e(this.f108517a.f108513b).mo87127a(true);
                    if (this.f108517a.f108513b.mo87352H()) {
                        C42937s.m94157a(this.f108517a.f108513b).mo87070d(false);
                    } else {
                        this.f108517a.f108513b.mo87350F().setVisibility(8);
                    }
                    C42937s.m94162f(this.f108517a.f108513b).setVisibility(0);
                    C42937s.m94163g(this.f108517a.f108513b).setVisibility(0);
                    C42937s.m94168l(this.f108517a.f108513b).setVisibility(0);
                    C42937s.m94169m(this.f108517a.f108513b).setVisibility(4);
                    C43099t tVar = this.f108517a.f108513b.f108489i;
                    if (tVar == null) {
                        C52711k.m112234a();
                    }
                    tVar.f108809d = false;
                    C42937s.m94170n(this.f108517a.f108513b).mo87014a(this.f108517a.f108513b.mo87351G().mo87245R().getSelectedTime());
                }
            }

            C42945a(C42944af afVar, ArrayList arrayList) {
                this.f108517a = afVar;
                this.f108518b = arrayList;
            }
        }

        public final boolean onPreDraw() {
            View view;
            float f;
            float f2;
            View rootView = C42937s.m94168l(this.f108513b).getRootView();
            C52711k.m112236a((Object) rootView, "flEditVideo.rootView");
            rootView.getViewTreeObserver().removeOnPreDrawListener(this);
            C42937s sVar = this.f108513b;
            C1352v f3 = this.f108513b.mo87350F().mo4847f(this.f108514c);
            if (f3 != null) {
                view = f3.itemView;
            } else {
                view = null;
            }
            sVar.f108478R = view;
            this.f108513b.f108479S = C35524e.m80267a(this.f108513b.mo87350F());
            if (this.f108515d == null || this.f108513b.f108478R == null) {
                return false;
            }
            View view2 = this.f108513b.f108478R;
            if (view2 != null) {
                ArrayList arrayList = new ArrayList();
                C0794k<Integer, Integer> kVar = this.f108513b.f108479S;
                if (kVar != null) {
                    F f4 = kVar.f2711a;
                    if (f4 == null) {
                        C52711k.m112234a();
                    }
                    C52711k.m112236a((Object) f4, "range.first!!");
                    int i = this.f108514c;
                    for (int intValue = ((Number) f4).intValue(); intValue < i; intValue++) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        RecyclerView F = this.f108513b.mo87350F();
                        if (F == null) {
                            C52711k.m112234a();
                        }
                        C1352v f5 = F.mo4847f(intValue);
                        if (f5 != null) {
                            C52711k.m112236a((Object) f5, "videoRecyclerView!!.find…              ?: continue");
                            if (this.f108516e) {
                                View view3 = f5.itemView;
                                C52711k.m112236a((Object) view3, "viewHolder.itemView");
                                f2 = view3.getTranslationX() + ((float) (this.f108512a - this.f108515d.right));
                            } else {
                                View view4 = f5.itemView;
                                C52711k.m112236a((Object) view4, "viewHolder.itemView");
                                f2 = view4.getTranslationX() - ((float) this.f108515d.left);
                            }
                            View view5 = f5.itemView;
                            C52711k.m112236a((Object) view5, "viewHolder.itemView");
                            animatorSet.play(ObjectAnimator.ofFloat(f5.itemView, "translationX", new float[]{view5.getTranslationX(), f2}));
                            animatorSet.setDuration(300);
                            arrayList.add(animatorSet);
                        }
                    }
                    int i2 = this.f108514c + 1;
                    S s = kVar.f2712b;
                    if (s == null) {
                        C52711k.m112234a();
                    }
                    C52711k.m112236a((Object) s, "range.second!!");
                    int intValue2 = ((Number) s).intValue();
                    if (i2 <= intValue2) {
                        while (true) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            C1352v f6 = this.f108513b.mo87350F().mo4847f(i2);
                            if (f6 != null) {
                                C52711k.m112236a((Object) f6, "videoRecyclerView.findVi…              ?: continue");
                                if (this.f108516e) {
                                    View view6 = f6.itemView;
                                    C52711k.m112236a((Object) view6, "viewHolder.itemView");
                                    f = view6.getTranslationX() - ((float) this.f108515d.left);
                                } else {
                                    View view7 = f6.itemView;
                                    C52711k.m112236a((Object) view7, "viewHolder.itemView");
                                    f = view7.getTranslationX() + ((float) (this.f108512a - this.f108515d.right));
                                }
                                View view8 = f6.itemView;
                                C52711k.m112236a((Object) view8, "viewHolder.itemView");
                                animatorSet2.play(ObjectAnimator.ofFloat(f6.itemView, "translationX", new float[]{view8.getTranslationX(), f}));
                                animatorSet2.setDuration(300);
                                arrayList.add(animatorSet2);
                            }
                            if (i2 == intValue2) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
                int width = C42937s.m94168l(this.f108513b).getWidth();
                int width2 = this.f108515d.width();
                int[] iArr = new int[2];
                C42937s.m94168l(this.f108513b).getLocationInWindow(iArr);
                this.f108513b.f108475O = (((float) width) * 1.0f) / ((float) width2);
                float width3 = (float) (iArr[0] + (C42937s.m94168l(this.f108513b).getWidth() / 2));
                float height = (float) (iArr[1] + (C42937s.m94168l(this.f108513b).getHeight() / 2));
                this.f108513b.f108476P = width3 - ((float) this.f108515d.centerX());
                this.f108513b.f108477Q = height - ((float) this.f108515d.centerY());
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.setDuration(300);
                animatorSet3.play(ObjectAnimator.ofFloat(view2, "translationX", new float[]{0.0f, this.f108513b.f108476P})).with(ObjectAnimator.ofFloat(view2, "translationY", new float[]{0.0f, this.f108513b.f108477Q})).with(ObjectAnimator.ofFloat(view2, "scaleX", new float[]{1.0f, this.f108513b.f108475O})).with(ObjectAnimator.ofFloat(view2, "scaleY", new float[]{1.0f, this.f108513b.f108475O}));
                arrayList.add(animatorSet3);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.setDuration(300);
                animatorSet4.play(ObjectAnimator.ofFloat(C42937s.m94169m(this.f108513b), "alpha", new float[]{1.0f, 0.0f}));
                arrayList.add(animatorSet4);
                C42937s sVar2 = this.f108513b;
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playTogether(arrayList);
                animatorSet5.addListener(new C42945a(this, arrayList));
                sVar2.f108480T = animatorSet5;
                AnimatorSet animatorSet6 = this.f108513b.f108480T;
                if (animatorSet6 != null) {
                    animatorSet6.start();
                }
                return false;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.View");
        }

        C42944af(C42937s sVar, int i, Rect rect, boolean z) {
            this.f108513b = sVar;
            this.f108514c = i;
            this.f108515d = rect;
            this.f108516e = z;
            this.f108512a = C43303dy.m94971b(sVar.f33840g_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$ag */
    public static final class C42946ag implements OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ C42937s f108519a;

        /* renamed from: b */
        final /* synthetic */ int f108520b;

        /* renamed from: c */
        final /* synthetic */ boolean f108521c;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$ag$a */
        public static final class C42947a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C42946ag f108522a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f108523b;

            public final void onAnimationEnd(Animator animator) {
                C52711k.m112240b(animator, "animation");
                super.onAnimationEnd(animator);
                Activity activity = this.f108522a.f108519a.f33840g_;
                if (activity == null || !activity.isFinishing()) {
                    C42937s.m94161e(this.f108522a.f108519a).mo87127a(true);
                    C42937s.m94168l(this.f108522a.f108519a).setVisibility(8);
                    if (this.f108522a.f108521c) {
                        C42937s.m94158b(this.f108522a.f108519a).mo87623c(((VideoSegment) C42937s.m94158b(this.f108522a.f108519a).mo87634l().get(C42937s.m94157a(this.f108522a.f108519a).f108002f)).mo86950e());
                    }
                    C43099t tVar = this.f108522a.f108519a.f108489i;
                    if (tVar == null) {
                        C52711k.m112234a();
                    }
                    tVar.f108809d = true;
                    C42937s.m94170n(this.f108522a.f108519a).mo87014a(this.f108522a.f108519a.mo87351G().mo87245R().getSelectedTime());
                    this.f108522a.f108519a.f108481U = false;
                }
            }

            C42947a(C42946ag agVar, ArrayList arrayList) {
                this.f108522a = agVar;
                this.f108523b = arrayList;
            }
        }

        public final boolean onPreDraw() {
            int i;
            int i2;
            View rootView = this.f108519a.mo87350F().getRootView();
            C52711k.m112236a((Object) rootView, "videoRecyclerView.rootView");
            rootView.getViewTreeObserver().removeOnPreDrawListener(this);
            if (this.f108519a.f108478R == null || this.f108519a.f108479S == null) {
                return false;
            }
            View view = this.f108519a.f108478R;
            if (view != null) {
                ArrayList arrayList = new ArrayList();
                C0794k<Integer, Integer> kVar = this.f108519a.f108479S;
                if (kVar == null) {
                    C52711k.m112234a();
                }
                F f = kVar.f2711a;
                if (f == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) f, "visibleRage!!.first!!");
                int intValue = ((Number) f).intValue();
                int i3 = this.f108520b;
                while (true) {
                    i = 2;
                    if (intValue >= i3) {
                        break;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    C1352v f2 = this.f108519a.mo87350F().mo4847f(intValue);
                    if (f2 != null) {
                        C52711k.m112236a((Object) f2, "videoRecyclerView.findVi…              ?: continue");
                        View view2 = f2.itemView;
                        C52711k.m112236a((Object) view2, "viewHolder.itemView");
                        animatorSet.play(ObjectAnimator.ofFloat(f2.itemView, "translationX", new float[]{view2.getTranslationX(), 0.0f}));
                        animatorSet.setDuration(300);
                        arrayList.add(animatorSet);
                    }
                    intValue++;
                }
                int i4 = this.f108520b + 1;
                C0794k<Integer, Integer> kVar2 = this.f108519a.f108479S;
                if (kVar2 == null) {
                    C52711k.m112234a();
                }
                S s = kVar2.f2712b;
                if (s == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) s, "visibleRage!!.second!!");
                int intValue2 = ((Number) s).intValue();
                if (i4 <= intValue2) {
                    while (true) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        C1352v f3 = this.f108519a.mo87350F().mo4847f(i4);
                        if (f3 != null) {
                            C52711k.m112236a((Object) f3, "videoRecyclerView.findVi…              ?: continue");
                            float[] fArr = new float[i];
                            View view3 = f3.itemView;
                            C52711k.m112236a((Object) view3, "viewHolder.itemView");
                            fArr[0] = view3.getTranslationX();
                            fArr[1] = 0.0f;
                            animatorSet2.play(ObjectAnimator.ofFloat(f3.itemView, "translationX", fArr));
                            animatorSet2.setDuration(300);
                            arrayList.add(animatorSet2);
                        }
                        if (i4 == intValue2) {
                            break;
                        }
                        i4++;
                        i = 2;
                    }
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.setDuration(300);
                animatorSet3.play(ObjectAnimator.ofFloat(view, "translationX", new float[]{view.getTranslationX(), 0.0f})).with(ObjectAnimator.ofFloat(view, "translationY", new float[]{view.getTranslationY(), 0.0f})).with(ObjectAnimator.ofFloat(view, "scaleX", new float[]{view.getScaleX(), 1.0f})).with(ObjectAnimator.ofFloat(view, "scaleY", new float[]{view.getScaleY(), 1.0f}));
                arrayList.add(animatorSet3);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.setDuration(300);
                animatorSet4.play(ObjectAnimator.ofFloat(C42937s.m94169m(this.f108519a), "alpha", new float[]{0.0f, 1.0f}));
                arrayList.add(animatorSet4);
                C42937s sVar = this.f108519a;
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playTogether(arrayList);
                animatorSet5.addListener(new C42947a(this, arrayList));
                sVar.f108480T = animatorSet5;
                AnimatorSet animatorSet6 = this.f108519a.f108480T;
                if (animatorSet6 != null) {
                    animatorSet6.start();
                }
                C43099t tVar = this.f108519a.f108489i;
                if (tVar == null) {
                    C52711k.m112234a();
                }
                if (this.f108519a.mo87352H()) {
                    i2 = C42937s.m94157a(this.f108519a).f108001e;
                } else {
                    i2 = 0;
                }
                tVar.f108807b = i2;
                return false;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.View");
        }

        C42946ag(C42937s sVar, int i, boolean z) {
            this.f108519a = sVar;
            this.f108520b = i;
            this.f108521c = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$b */
    final class C42948b extends LinearLayoutManager {

        /* renamed from: a */
        public final C42949a f108524a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$b$a */
        public final class C42949a extends C1415af {
            /* renamed from: a */
            public final float mo5490a(DisplayMetrics displayMetrics) {
                C52711k.m112240b(displayMetrics, "displayMetrics");
                return 200.0f / ((float) displayMetrics.densityDpi);
            }

            /* renamed from: b */
            public final int mo5495b(int i) {
                if (i > 2000) {
                    i = 2000;
                }
                return super.mo5495b(i);
            }

            public C42949a(Context context) {
                super(context);
            }
        }

        public C42948b(Context context) {
            super(context, 0, false);
            this.f108524a = new C42949a(context);
        }

        /* renamed from: a */
        public final void mo4726a(RecyclerView recyclerView, C1349s sVar, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            C42949a aVar = this.f108524a;
            aVar.f4778g = i;
            mo5022a((C1346r) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$c */
    public static final class C42950c implements C43023g {
        C42950c() {
        }

        /* renamed from: a */
        public final void mo87073a() {
        }

        /* renamed from: a */
        public final void mo87074a(int i) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$d */
    static final class C42951d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C42937s f108527a;

        /* renamed from: b */
        final /* synthetic */ boolean f108528b;

        /* renamed from: c */
        final /* synthetic */ float f108529c;

        C42951d(C42937s sVar, boolean z, float f) {
            this.f108527a = sVar;
            this.f108528b = z;
            this.f108529c = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                if (this.f108528b) {
                    C42937s.m94166j(this.f108527a).setAlpha(floatValue);
                    C42937s.m94166j(this.f108527a).setTranslationY(this.f108529c * (1.0f - floatValue));
                    return;
                }
                C42937s.m94166j(this.f108527a).setAlpha(1.0f - floatValue);
                C42937s.m94166j(this.f108527a).setTranslationY(this.f108529c * floatValue);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$e */
    public static final class C42952e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C42937s f108530a;

        C42952e(C42937s sVar) {
            this.f108530a = sVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            super.onAnimationEnd(animator);
            C42937s.m94166j(this.f108530a).setVisibility(8);
            C42937s.m94166j(this.f108530a).setTranslationY(0.0f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$f */
    static final class C42953f implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C42937s f108531a;

        C42953f(C42937s sVar) {
            this.f108531a = sVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view;
            float f;
            C43099t tVar = this.f108531a.f108489i;
            if (tVar == null) {
                C52711k.m112234a();
            }
            int a = tVar.mo87380a(this.f108531a.mo87350F(), this.f108531a.f108469I);
            C43099t tVar2 = this.f108531a.f108489i;
            if (tVar2 == null) {
                C52711k.m112234a();
            }
            int a2 = tVar2.mo87380a(this.f108531a.mo87350F(), this.f108531a.f108470J);
            if (a == -1 && a2 == -1) {
                C42937s.m94167k(this.f108531a).setTranslationX(0.0f);
                C42937s.m94167k(this.f108531a).setVisibility(4);
                return;
            }
            if (a < 0 || a2 < 0) {
                C42937s.m94167k(this.f108531a).setVisibility(0);
                view = C42937s.m94167k(this.f108531a);
                if (a2 == -1) {
                    f = (float) a;
                } else {
                    f = (float) a2;
                }
            } else {
                C42937s.m94167k(this.f108531a).setVisibility(0);
                C52711k.m112236a((Object) valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    float floatValue = (((Float) animatedValue).floatValue() * ((float) (a2 - a))) + ((float) a);
                    f = floatValue;
                    view = C42937s.m94167k(this.f108531a);
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.Float");
                }
            }
            view.setX(f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$g */
    static final class C42954g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42937s f108532a;

        C42954g(C42937s sVar) {
            this.f108532a = sVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f108532a.f108481U) {
                this.f108532a.f108481U = true;
                C42652k.m93587c();
                C42937s.m94159c(this.f108532a).mo86804d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$h */
    static final class C42955h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42937s f108533a;

        C42955h(C42937s sVar) {
            this.f108533a = sVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f108533a.f108481U) {
                this.f108533a.f108481U = true;
                C42652k.m93586b();
                C42937s.m94159c(this.f108533a).mo86803c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$i */
    static final class C42956i<T> implements C0199s<C0794k<Integer, Integer>> {

        /* renamed from: a */
        final /* synthetic */ C42937s f108534a;

        C42956i(C42937s sVar) {
            this.f108534a = sVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            C0794k kVar = (C0794k) obj;
            if (kVar != null) {
                C42937s sVar = this.f108534a;
                F f = kVar.f2711a;
                if (f == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) f, "pair.first!!");
                int intValue = ((Number) f).intValue();
                S s = kVar.f2712b;
                if (s == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) s, "pair.second!!");
                int intValue2 = ((Number) s).intValue();
                CutVideoEditViewModel cutVideoEditViewModel = sVar.f108464D;
                if (cutVideoEditViewModel == null) {
                    C52711k.m112237a("cutVideoEditViewModel");
                }
                if (cutVideoEditViewModel.f107992e != 2) {
                    if (intValue != intValue2) {
                        if (System.currentTimeMillis() - sVar.f108471K >= 3000) {
                            if (intValue2 == 0) {
                                i = 0;
                            } else if (!sVar.mo87352H() || !C43036f.m94309c()) {
                                i = intValue2;
                            } else {
                                i = intValue2 + 1;
                            }
                            RecyclerView recyclerView = sVar.f108492l;
                            if (recyclerView == null) {
                                C52711k.m112237a("videoRecyclerView");
                            }
                            recyclerView.mo4833d(i);
                        }
                        C43099t tVar = sVar.f108489i;
                        if (tVar == null) {
                            C52711k.m112234a();
                        }
                        if (intValue == tVar.f108807b) {
                            sVar.f108469I = intValue;
                            sVar.f108470J = intValue2;
                            ValueAnimator valueAnimator = sVar.f108468H;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                            ofFloat.setDuration(500);
                            ofFloat.addUpdateListener(new C42953f(sVar));
                            sVar.f108468H = ofFloat;
                            ValueAnimator valueAnimator2 = sVar.f108468H;
                            if (valueAnimator2 != null) {
                                valueAnimator2.start();
                            }
                        } else {
                            return;
                        }
                    }
                    C43099t tVar2 = sVar.f108489i;
                    if (tVar2 == null) {
                        C52711k.m112234a();
                    }
                    tVar2.f108807b = intValue2;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$j */
    static final class C42957j extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42937s f108535a;

        C42957j(C42937s sVar) {
            this.f108535a = sVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            if (C42937s.m94160d(this.f108535a).f107992e == 2) {
                this.f108535a.f108474N = booleanValue;
            } else {
                this.f108535a.f108473M = booleanValue;
            }
            if (booleanValue) {
                C42820ax axVar = this.f108535a.f108490j;
                if (axVar == null || !axVar.mo87270f()) {
                    CutVideoSpeedViewModel e = C42937s.m94161e(this.f108535a);
                    C47339t a = C42652k.m93581a(this.f108535a.mo87351G().mo87245R().getCurrentSpeed());
                    C52711k.m112236a((Object) a, "MVConfig.fromValue(previ…oEditView().currentSpeed)");
                    e.mo87126a(a);
                    C42937s.m94161e(this.f108535a).mo87128b(true);
                    return C52860x.f131107a;
                }
            }
            C42937s.m94161e(this.f108535a).mo87128b(false);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$k */
    static final class C42958k extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42937s f108536a;

        C42958k(C42937s sVar) {
            this.f108536a = sVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            C42937s.m94162f(this.f108536a).setEnabled(booleanValue);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$l */
    static final class C42959l extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42937s f108537a;

        C42959l(C42937s sVar) {
            this.f108537a = sVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            C42937s.m94163g(this.f108537a).setEnabled(booleanValue);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$m */
    static final class C42960m extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42937s f108538a;

        C42960m(C42937s sVar) {
            this.f108538a = sVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            if (booleanValue) {
                C42937s.m94164h(this.f108538a).setButtonClickable(false);
            }
            C42877c.m94095a(C42937s.m94164h(this.f108538a), booleanValue, new C52671b<Boolean, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C42960m f108539a;

                {
                    this.f108539a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    C42937s.m94164h(this.f108539a.f108538a).setButtonClickable(((Boolean) obj).booleanValue());
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$n */
    static final class C42962n extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42937s f108540a;

        C42962n(C42937s sVar) {
            this.f108540a = sVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            if (booleanValue) {
                C42937s.m94164h(this.f108540a).setButtonClickable(false);
            }
            C42877c.m94096b(C42937s.m94164h(this.f108540a), booleanValue, new C52671b<Boolean, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C42962n f108541a;

                {
                    this.f108541a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    C42937s.m94164h(this.f108541a.f108540a).setButtonClickable(((Boolean) obj).booleanValue());
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$o */
    public static final class C42964o implements C43112a {

        /* renamed from: a */
        final /* synthetic */ C42937s f108542a;

        C42964o(C42937s sVar) {
            this.f108542a = sVar;
        }

        /* renamed from: a */
        public final void mo87368a(VideoSegment videoSegment) {
            C43099t tVar = this.f108542a.f108489i;
            if (tVar != null) {
                tVar.mo87495a(videoSegment);
            }
        }

        /* renamed from: b */
        public final void mo87369b(VideoSegment videoSegment) {
            this.f108542a.f108471K = System.currentTimeMillis();
            C43099t tVar = this.f108542a.f108489i;
            if (tVar != null) {
                tVar.mo87499b(videoSegment);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$p */
    static final class C42965p extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42937s f108543a;

        C42965p(C42937s sVar) {
            this.f108543a = sVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            if (booleanValue) {
                C42877c.m94095a(C42937s.m94165i(this.f108543a), true, C429661.f108544a);
            } else {
                C43015c.m94256a(C42937s.m94165i(this.f108543a));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$q */
    static final class C42967q extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42937s f108545a;

        C42967q(C42937s sVar) {
            this.f108545a = sVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            if (booleanValue) {
                C42877c.m94096b(C42937s.m94165i(this.f108545a), true, C429681.f108546a);
            } else {
                C43015c.m94257a(C42937s.m94165i(this.f108545a), true);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$r */
    static final class C42969r extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42937s f108547a;

        C42969r(C42937s sVar) {
            this.f108547a = sVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i;
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            StickPointSingleVideoEditView i2 = C42937s.m94165i(this.f108547a);
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            i2.setVisibility(i);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$s */
    static final class C42970s<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C42937s f108548a;

        C42970s(C42937s sVar) {
            this.f108548a = sVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C42937s.m94166j(this.f108548a).setAlpha(1.0f);
                FrameLayout j = C42937s.m94166j(this.f108548a);
                C52711k.m112236a((Object) bool, "it");
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                j.setVisibility(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$t */
    static final class C42971t extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42937s f108549a;

        C42971t(C42937s sVar) {
            this.f108549a = sVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            C42937s sVar = this.f108549a;
            FrameLayout frameLayout = sVar.f108502v;
            if (frameLayout == null) {
                C52711k.m112237a("recyclerViewLayout");
            }
            frameLayout.setVisibility(0);
            float b = C9432q.m18687b((Context) sVar.f33840g_, 16.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.addUpdateListener(new C42951d(sVar, booleanValue, b));
            if (!booleanValue) {
                ofFloat.addListener(new C42952e(sVar));
            }
            C52711k.m112236a((Object) ofFloat, "animator");
            ofFloat.setDuration(200);
            ofFloat.start();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$u */
    static final class C42972u<T> implements C0199s<C0794k<Integer, Integer>> {

        /* renamed from: a */
        final /* synthetic */ C42937s f108550a;

        C42972u(C42937s sVar) {
            this.f108550a = sVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:102:0x01f2  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x01fd  */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x0204  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x0211  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x021f  */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x0224  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x0230  */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x023e  */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x024a  */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x0256  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00bf  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0111  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x012e  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x013c  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0145  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0153  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x01ad  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x01b0  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x01b8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r13) {
            /*
                r12 = this;
                android.support.v4.f.k r13 = (android.support.p030v4.p038f.C0794k) r13
                com.ss.android.ugc.aweme.shortvideo.cut.scene.s r13 = r12.f108550a
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r0 = r13.f108505y
                if (r0 != 0) goto L_0x000d
                java.lang.String r1 = "videoEditViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r1)
            L_0x000d:
                java.util.List r0 = r0.mo87634l()
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel r1 = r13.f108465E
                if (r1 != 0) goto L_0x001a
                java.lang.String r2 = "cutVideoListViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x001a:
                int r1 = r1.f108002f
                java.lang.Object r0 = r0.get(r1)
                com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r0 = (com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r0
                java.lang.String r1 = "curEditVideo"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                android.view.View r1 = r13.f108495o
                if (r1 != 0) goto L_0x0030
                java.lang.String r2 = "animTabDot"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x0030:
                r2 = 4
                r1.setVisibility(r2)
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel r1 = r13.f108463C
                if (r1 != 0) goto L_0x003d
                java.lang.String r3 = "titleBarViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r3)
            L_0x003d:
                r3 = 0
                r1.mo87170a(r3)
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel r1 = r13.f108463C
                if (r1 != 0) goto L_0x004a
                java.lang.String r4 = "titleBarViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r4)
            L_0x004a:
                r1.mo87171b(r3)
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel r1 = r13.f108462B
                if (r1 != 0) goto L_0x0056
                java.lang.String r4 = "bottomBarViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r4)
            L_0x0056:
                r4 = 1
                r1.mo87018c(r4)
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel r1 = r13.f108462B
                if (r1 != 0) goto L_0x0063
                java.lang.String r5 = "bottomBarViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x0063:
                r1.mo87019d(r4)
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel r1 = r13.f108462B
                if (r1 != 0) goto L_0x006f
                java.lang.String r5 = "bottomBarViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x006f:
                boolean r5 = r13.f108485Y
                if (r5 == 0) goto L_0x0084
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r5 = r13.f108491k
                if (r5 != 0) goto L_0x007c
                java.lang.String r6 = "presenter"
                p2628d.p2639f.p2641b.C52711k.m112237a(r6)
            L_0x007c:
                boolean r5 = r5.mo86818a(r0)
                if (r5 == 0) goto L_0x0084
                r5 = 1
                goto L_0x0085
            L_0x0084:
                r5 = 0
            L_0x0085:
                r1.mo87015a(r5)
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel r1 = r13.f108462B
                if (r1 != 0) goto L_0x0091
                java.lang.String r5 = "bottomBarViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x0091:
                boolean r5 = r13.f108474N
                r1.mo87017b(r5)
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel r1 = r13.f108461A
                if (r1 != 0) goto L_0x009f
                java.lang.String r5 = "speedViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x009f:
                r1.mo87127a(r3)
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel r1 = r13.f108461A
                if (r1 != 0) goto L_0x00ab
                java.lang.String r5 = "speedViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x00ab:
                boolean r5 = r13.f108474N
                if (r5 == 0) goto L_0x00b7
                boolean r5 = r13.mo87352H()
                if (r5 != 0) goto L_0x00b7
                r5 = 1
                goto L_0x00b8
            L_0x00b7:
                r5 = 0
            L_0x00b8:
                r1.mo87128b(r5)
                boolean r1 = r13.f108474N
                if (r1 == 0) goto L_0x00d8
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel r1 = r13.f108461A
                if (r1 != 0) goto L_0x00c8
                java.lang.String r5 = "speedViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x00c8:
                float r5 = r0.mo86954h()
                com.ss.android.ugc.aweme.tools.t r5 = com.p683ss.android.ugc.aweme.shortvideo.cut.C42652k.m93581a(r5)
                java.lang.String r6 = "MVConfig.fromValue(video.speed)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
                r1.mo87126a(r5)
            L_0x00d8:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r5 = "file://"
                r1.<init>(r5)
                java.lang.String r5 = r0.mo86941a(r3)
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                android.net.Uri r1 = android.net.Uri.parse(r1)
                com.facebook.imagepipeline.o.c r1 = com.facebook.imagepipeline.p975o.C14232c.m29169a(r1)
                com.facebook.imagepipeline.common.d r5 = new com.facebook.imagepipeline.common.d
                r6 = 4632233691727265792(0x4049000000000000, double:50.0)
                int r8 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r6)
                int r6 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r6)
                r5.<init>(r8, r6)
                com.facebook.imagepipeline.o.c r1 = r1.mo26453a(r5)
                com.facebook.imagepipeline.o.b r1 = r1.mo26449a()
                com.facebook.drawee.a.a.e r5 = com.facebook.drawee.p930a.p931a.C13771c.m27870a()
                com.facebook.drawee.view.SimpleDraweeView r6 = r13.f108497q
                if (r6 != 0) goto L_0x0116
                java.lang.String r7 = "ivEditVideo"
                p2628d.p2639f.p2641b.C52711k.m112237a(r7)
            L_0x0116:
                com.facebook.drawee.h.a r6 = r6.getController()
                com.facebook.drawee.c.b r5 = r5.mo25759b(r6)
                com.facebook.drawee.a.a.e r5 = (com.facebook.drawee.p930a.p931a.C13773e) r5
                com.facebook.drawee.c.b r1 = r5.mo25757b(r1)
                com.facebook.drawee.a.a.e r1 = (com.facebook.drawee.p930a.p931a.C13773e) r1
                com.facebook.drawee.c.a r1 = r1.mo25763d()
                com.facebook.drawee.view.SimpleDraweeView r5 = r13.f108497q
                if (r5 != 0) goto L_0x0133
                java.lang.String r6 = "ivEditVideo"
                p2628d.p2639f.p2641b.C52711k.m112237a(r6)
            L_0x0133:
                com.facebook.drawee.h.a r1 = (com.facebook.drawee.p942h.C13842a) r1
                r5.setController(r1)
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r1 = r13.f108491k
                if (r1 != 0) goto L_0x0141
                java.lang.String r5 = "presenter"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x0141:
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel r5 = r13.f108465E
                if (r5 != 0) goto L_0x014a
                java.lang.String r6 = "cutVideoListViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r6)
            L_0x014a:
                int r5 = r5.f108002f
                r1.mo86810a(r5)
                com.ss.android.ugc.aweme.shortvideo.cut.scene.ax r1 = r13.f108490j
                if (r1 == 0) goto L_0x01a2
                com.ss.android.ugc.aweme.shortvideo.cut.scene.as r1 = r13.f108486Z
                if (r1 == 0) goto L_0x015a
                r1.mo87219b()
            L_0x015a:
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel r1 = r13.f108465E
                if (r1 != 0) goto L_0x0163
                java.lang.String r5 = "cutVideoListViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x0163:
                android.app.Activity r5 = r13.f33840g_
                if (r5 == 0) goto L_0x019a
                android.support.v4.app.FragmentActivity r5 = (android.support.p030v4.app.FragmentActivity) r5
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel r6 = r13.f108465E
                if (r6 != 0) goto L_0x0172
                java.lang.String r7 = "cutVideoListViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r7)
            L_0x0172:
                int r6 = r6.f108002f
                java.lang.String r7 = "activity"
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r7)
                com.ss.android.ugc.gamora.b.c r5 = com.p683ss.android.ugc.gamora.p2458b.C48927d.m105736a(r5)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel> r7 = com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel.class
                com.bytedance.jedi.arch.JediViewModel r5 = r5.mo96760a(r7)
                java.lang.String r7 = "JediViewModelProviders.o…iewViewModel::class.java)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel r5 = (com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel) r5
                r5.mo87114e()
                com.ss.android.ugc.aweme.shortvideo.cut.scene.bo r1 = r1.f108003g
                if (r1 != 0) goto L_0x0196
                java.lang.String r5 = "stickerPointController"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x0196:
                r1.mo87261a(r6, r0)
                goto L_0x01a2
            L_0x019a:
                d.u r13 = new d.u
                java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
                r13.<init>(r0)
                throw r13
            L_0x01a2:
                float r1 = r0.mo86954h()
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 0
                int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r1 != 0) goto L_0x01b0
                r1 = 1065353216(0x3f800000, float:1.0)
                goto L_0x01b4
            L_0x01b0:
                float r1 = r0.mo86954h()
            L_0x01b4:
                com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel r7 = r13.f108506z
                if (r7 != 0) goto L_0x01bd
                java.lang.String r8 = "veVideoCutterViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r8)
            L_0x01bd:
                com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a r8 = new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a
                r9 = 3
                long r10 = r0.mo86952f()
                float r0 = (float) r10
                float r0 = r0 / r1
                long r0 = (long) r0
                com.ss.android.vesdk.o$d r10 = com.p683ss.android.vesdk.C50720o.C50743d.EDITOR_SEEK_FLAG_LastSeek
                r8.<init>(r9, r0, r10)
                r7.mo87731a(r8)
                r13.f108475O = r5
                r13.f108476P = r6
                r13.f108477Q = r6
                boolean r0 = r13.mo87352H()
                if (r0 == 0) goto L_0x01ee
                boolean r0 = com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f.m94309c()
                if (r0 == 0) goto L_0x01ee
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel r0 = r13.f108465E
                if (r0 != 0) goto L_0x01ea
                java.lang.String r1 = "cutVideoListViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r1)
            L_0x01ea:
                int r0 = r0.f108001e
                int r0 = r0 + r4
                goto L_0x01f9
            L_0x01ee:
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel r0 = r13.f108465E
                if (r0 != 0) goto L_0x01f7
                java.lang.String r1 = "cutVideoListViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r1)
            L_0x01f7:
                int r0 = r0.f108001e
            L_0x01f9:
                com.ss.android.ugc.aweme.shortvideo.cut.t r1 = r13.f108489i
                if (r1 != 0) goto L_0x0200
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0200:
                android.support.v7.widget.RecyclerView r5 = r13.f108492l
                if (r5 != 0) goto L_0x0209
                java.lang.String r6 = "videoRecyclerView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r6)
            L_0x0209:
                android.graphics.Rect r1 = r1.mo87497b(r5, r0)
                android.support.v7.widget.RecyclerView r5 = r13.f108492l
                if (r5 != 0) goto L_0x0216
                java.lang.String r6 = "videoRecyclerView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r6)
            L_0x0216:
                android.view.View r5 = (android.view.View) r5
                int r5 = android.support.p030v4.view.C1056u.m3055f(r5)
                if (r5 != r4) goto L_0x021f
                goto L_0x0220
            L_0x021f:
                r4 = 0
            L_0x0220:
                android.widget.FrameLayout r5 = r13.f108498r
                if (r5 != 0) goto L_0x0229
                java.lang.String r6 = "singleEditLayout"
                p2628d.p2639f.p2641b.C52711k.m112237a(r6)
            L_0x0229:
                r5.setVisibility(r3)
                android.widget.ImageView r3 = r13.f108499s
                if (r3 != 0) goto L_0x0235
                java.lang.String r5 = "ivSave"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x0235:
                r5 = 8
                r3.setVisibility(r5)
                android.widget.ImageView r3 = r13.f108500t
                if (r3 != 0) goto L_0x0243
                java.lang.String r6 = "ivCancel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r6)
            L_0x0243:
                r3.setVisibility(r5)
                android.widget.FrameLayout r3 = r13.f108501u
                if (r3 != 0) goto L_0x024f
                java.lang.String r5 = "flEditVideo"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x024f:
                r3.setVisibility(r2)
                android.widget.FrameLayout r2 = r13.f108501u
                if (r2 != 0) goto L_0x025b
                java.lang.String r3 = "flEditVideo"
                p2628d.p2639f.p2641b.C52711k.m112237a(r3)
            L_0x025b:
                android.view.View r2 = r2.getRootView()
                java.lang.String r3 = "flEditVideo.rootView"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
                com.ss.android.ugc.aweme.shortvideo.cut.scene.s$af r3 = new com.ss.android.ugc.aweme.shortvideo.cut.scene.s$af
                r3.<init>(r13, r0, r1, r4)
                android.view.ViewTreeObserver$OnPreDrawListener r3 = (android.view.ViewTreeObserver.OnPreDrawListener) r3
                r2.addOnPreDrawListener(r3)
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h r4 = com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43047h.f108667g
                boolean r5 = r13.mo87352H()
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r4.mo87426a(r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42937s.C42972u.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$v */
    static final class C42973v<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C42937s f108551a;

        C42973v(C42937s sVar) {
            this.f108551a = sVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            this.f108551a.mo87354a(false, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$w */
    static final class C42974w<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C42937s f108552a;

        C42974w(C42937s sVar) {
            this.f108552a = sVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            this.f108552a.mo87354a(true, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$x */
    static final class C42975x<T> implements C0199s<VideoSegment> {

        /* renamed from: a */
        final /* synthetic */ C42937s f108553a;

        C42975x(C42937s sVar) {
            this.f108553a = sVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            VideoSegment videoSegment = (VideoSegment) obj;
            this.f108553a.mo87354a(false, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$y */
    static final class C42976y<T> implements C0199s<C42663f> {

        /* renamed from: a */
        final /* synthetic */ C42937s f108554a;

        C42976y(C42937s sVar) {
            this.f108554a = sVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            C42663f fVar = (C42663f) obj;
            if (fVar != null) {
                num = Integer.valueOf(fVar.f107951b);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                if (this.f108554a.f108483W) {
                    this.f108554a.f108482V = fVar.f107952c;
                    this.f108554a.mo87353a(true);
                    VEVideoCutterViewModel vEVideoCutterViewModel = this.f108554a.f108506z;
                    if (vEVideoCutterViewModel == null) {
                        C52711k.m112237a("veVideoCutterViewModel");
                    }
                    vEVideoCutterViewModel.mo87731a(new C43168a(2, false));
                }
                this.f108554a.f108483W = false;
                return;
            }
            if ((num == null || num.intValue() != 1) && num != null && num.intValue() == 2) {
                this.f108554a.mo87353a(false);
                C42937s sVar = this.f108554a;
                int i = fVar.f107953d;
                int i2 = this.f108554a.f108482V;
                if (fVar.f107950a) {
                    C42873bn bnVar = sVar.f108493m;
                    if (bnVar == null) {
                        C52711k.m112237a("previewEditCallback");
                    }
                    C43120d R = bnVar.mo87245R();
                    R.mo87556c();
                    VECutVideoPresenter vECutVideoPresenter = sVar.f108491k;
                    if (vECutVideoPresenter == null) {
                        C52711k.m112237a("presenter");
                    }
                    C43066n nVar = vECutVideoPresenter.f107700n;
                    VideoEditViewModel videoEditViewModel = vECutVideoPresenter.f107699m;
                    if (videoEditViewModel == null) {
                        C52711k.m112237a("videoEditViewModel");
                    }
                    List l = videoEditViewModel.mo87634l();
                    if (i2 != i && !C9190h.m18253a(l)) {
                        C42648h hVar = nVar.f108713b;
                        if (hVar != null) {
                            if (l == null) {
                                C52711k.m112234a();
                            }
                            hVar.mo86908a(i2, i, l);
                        }
                        C42648h hVar2 = nVar.f108712a;
                        if (hVar2 != null) {
                            if (l == null) {
                                C52711k.m112234a();
                            }
                            hVar2.mo86908a(i2, i, l);
                        }
                        if (nVar.f108714c) {
                            C42648h hVar3 = nVar.f108713b;
                            if (hVar3 != null) {
                                hVar3.mo86907a(i2, i);
                            }
                        } else {
                            C42648h hVar4 = nVar.f108712a;
                            if (hVar4 != null) {
                                hVar4.mo86907a(i2, i);
                            }
                        }
                    }
                    long j = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        VideoEditViewModel videoEditViewModel2 = sVar.f108505y;
                        if (videoEditViewModel2 == null) {
                            C52711k.m112237a("videoEditViewModel");
                        }
                        VideoSegment videoSegment = (VideoSegment) videoEditViewModel2.mo87634l().get(i3);
                        if (!videoSegment.f107911j) {
                            C52711k.m112236a((Object) videoSegment, "videoSegment");
                            float g = (float) (videoSegment.mo86953g() - videoSegment.mo86952f());
                            VideoEditViewModel videoEditViewModel3 = sVar.f108505y;
                            if (videoEditViewModel3 == null) {
                                C52711k.m112237a("videoEditViewModel");
                            }
                            j += (long) (g / (videoEditViewModel3.mo87635m() * videoSegment.mo86954h()));
                        }
                    }
                    if (j >= R.getMaxCutDuration()) {
                        j = 0;
                    }
                    if (j != 0) {
                        j += 30;
                    }
                    VECutVideoPresenter vECutVideoPresenter2 = sVar.f108491k;
                    if (vECutVideoPresenter2 == null) {
                        C52711k.m112237a("presenter");
                    }
                    C0794k playBoundary = R.getPlayBoundary();
                    C52711k.m112236a((Object) playBoundary, "videoEditView.playBoundary");
                    vECutVideoPresenter2.mo86813a(playBoundary);
                    VEVideoCutterViewModel vEVideoCutterViewModel2 = sVar.f108506z;
                    if (vEVideoCutterViewModel2 == null) {
                        C52711k.m112237a("veVideoCutterViewModel");
                    }
                    vEVideoCutterViewModel2.mo87731a(new C43168a(3, j, C50743d.EDITOR_SEEK_FLAG_LastSeek));
                    VECutVideoPresenter vECutVideoPresenter3 = sVar.f108491k;
                    if (vECutVideoPresenter3 == null) {
                        C52711k.m112237a("presenter");
                    }
                    if (!vECutVideoPresenter3.mo86820c()) {
                        CutMultiVideoViewModel cutMultiVideoViewModel = sVar.f108504x;
                        if (cutMultiVideoViewModel == null) {
                            C52711k.m112237a("cutMultiVideoViewModel");
                        }
                        VideoEditViewModel videoEditViewModel4 = sVar.f108505y;
                        if (videoEditViewModel4 == null) {
                            C52711k.m112237a("videoEditViewModel");
                        }
                        List k = videoEditViewModel4.mo87633k();
                        VideoEditViewModel videoEditViewModel5 = sVar.f108505y;
                        if (videoEditViewModel5 == null) {
                            C52711k.m112237a("videoEditViewModel");
                        }
                        cutMultiVideoViewModel.mo86798a(j, k, videoEditViewModel5.mo87635m());
                    }
                    C43047h.f108667g.mo87426a(sVar.mo87352H(), false, false, false, false, true);
                } else {
                    VEVideoCutterViewModel vEVideoCutterViewModel3 = sVar.f108506z;
                    if (vEVideoCutterViewModel3 == null) {
                        C52711k.m112237a("veVideoCutterViewModel");
                    }
                    vEVideoCutterViewModel3.mo87731a(new C43168a(1, false));
                }
                if (this.f108554a.f108490j != null) {
                    CutVideoListViewModel a = C42937s.m94157a(this.f108554a);
                    Activity activity = this.f108554a.f33840g_;
                    if (activity != null) {
                        FragmentActivity fragmentActivity = (FragmentActivity) activity;
                        int i4 = this.f108554a.f108482V;
                        int i5 = fVar.f107953d;
                        C52711k.m112240b(fragmentActivity, "activity");
                        JediViewModel a2 = C48927d.m105736a(fragmentActivity).mo96760a(CutVideoStickerPointMusicViewModel.class);
                        C52711k.m112236a((Object) a2, "JediViewModelProviders.o…sicViewModel::class.java)");
                        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = (CutVideoStickerPointMusicViewModel) a2;
                        C42874bo boVar = a.f108003g;
                        if (boVar == null) {
                            C52711k.m112237a("stickerPointController");
                        }
                        boVar.mo87260a(i4, i5, new C42702k(cutVideoStickerPointMusicViewModel));
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                }
                this.f108554a.f108483W = true;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$z */
    static final class C42977z extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42937s f108555a;

        C42977z(C42937s sVar) {
            this.f108555a = sVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            C42937s.m94159c(this.f108555a).mo86799a((VideoSegment) C42937s.m94158b(this.f108555a).mo87634l().get(C42937s.m94157a(this.f108555a).f108002f));
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo24463a(View view, Bundle bundle) {
        C43099t tVar;
        C42654l lVar;
        C52711k.m112240b(view, "view");
        super.mo24463a(view, bundle);
        View j_ = mo24467j_(R.id.d6i);
        C52711k.m112236a((Object) j_, "requireViewById(R.id.tvVideoSegmentDes)");
        this.f108494n = (TextView) j_;
        View j_2 = mo24467j_(R.id.dou);
        C52711k.m112236a((Object) j_2, "requireViewById(R.id.videoRecyclerView)");
        this.f108492l = (RecyclerView) j_2;
        View j_3 = mo24467j_(R.id.ff);
        C52711k.m112236a((Object) j_3, "requireViewById(R.id.animTabDot)");
        this.f108495o = j_3;
        View j_4 = mo24467j_(R.id.dq4);
        C52711k.m112236a((Object) j_4, "requireViewById(R.id.video_seg_view)");
        this.f108496p = (StickPointVideoSegView) j_4;
        View j_5 = mo24467j_(R.id.axm);
        C52711k.m112236a((Object) j_5, "requireViewById(R.id.ivEditVideo)");
        this.f108497q = (SimpleDraweeView) j_5;
        View j_6 = mo24467j_(R.id.f133596com);
        C52711k.m112236a((Object) j_6, "requireViewById(R.id.singleEditLayout)");
        this.f108498r = (FrameLayout) j_6;
        View j_7 = mo24467j_(R.id.axp);
        C52711k.m112236a((Object) j_7, "requireViewById(R.id.ivSave)");
        this.f108499s = (ImageView) j_7;
        View j_8 = mo24467j_(R.id.axk);
        C52711k.m112236a((Object) j_8, "requireViewById(R.id.ivCancel)");
        this.f108500t = (ImageView) j_8;
        View j_9 = mo24467j_(R.id.agl);
        C52711k.m112236a((Object) j_9, "requireViewById(R.id.flEditVideo)");
        this.f108501u = (FrameLayout) j_9;
        View j_10 = mo24467j_(R.id.m5);
        C52711k.m112236a((Object) j_10, "requireViewById(R.id.bottom_recyle_view)");
        this.f108502v = (FrameLayout) j_10;
        TextView textView = this.f108494n;
        if (textView == null) {
            C52711k.m112237a("tvVideoSegmentDes");
        }
        textView.setShadowLayer(2.0f, 0.0f, 0.0f, mo24478w().getColor(R.color.a3v));
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 80;
            view.setLayoutParams(layoutParams2);
            Activity activity = this.f33840g_;
            if (activity != null) {
                C0209x a = C0214z.m440a((FragmentActivity) activity).mo359a(CutMultiVideoViewModel.class);
                C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…deoViewModel::class.java]");
                this.f108504x = (CutMultiVideoViewModel) a;
                Activity activity2 = this.f33840g_;
                if (activity2 != null) {
                    C0209x a2 = C0214z.m440a((FragmentActivity) activity2).mo359a(VideoEditViewModel.class);
                    C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…ditViewModel::class.java]");
                    this.f108505y = (VideoEditViewModel) a2;
                    Activity activity3 = this.f33840g_;
                    if (activity3 != null) {
                        JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(CutVideoViewModel.class);
                        C52711k.m112236a((Object) a3, "JediViewModelProviders.o…deoViewModel::class.java]");
                        this.f108487ab = (CutVideoViewModel) a3;
                        Activity activity4 = this.f33840g_;
                        if (activity4 != null) {
                            C0209x a4 = C0214z.m440a((FragmentActivity) activity4).mo359a(VEVideoCutterViewModel.class);
                            C52711k.m112236a((Object) a4, "ViewModelProviders.of(ac…terViewModel::class.java]");
                            this.f108506z = (VEVideoCutterViewModel) a4;
                            Activity activity5 = this.f33840g_;
                            if (activity5 != null) {
                                JediViewModel a5 = C48927d.m105736a((FragmentActivity) activity5).mo96760a(CutVideoSpeedViewModel.class);
                                C52711k.m112236a((Object) a5, "JediViewModelProviders.o…eedViewModel::class.java)");
                                this.f108461A = (CutVideoSpeedViewModel) a5;
                                Activity activity6 = this.f33840g_;
                                if (activity6 != null) {
                                    JediViewModel a6 = C48927d.m105736a((FragmentActivity) activity6).mo96760a(CutVideoBottomBarViewModel.class);
                                    C52711k.m112236a((Object) a6, "JediViewModelProviders.o…BarViewModel::class.java)");
                                    this.f108462B = (CutVideoBottomBarViewModel) a6;
                                    Activity activity7 = this.f33840g_;
                                    if (activity7 != null) {
                                        JediViewModel a7 = C48927d.m105736a((FragmentActivity) activity7).mo96760a(CutVideoTitleBarViewModel.class);
                                        C52711k.m112236a((Object) a7, "JediViewModelProviders.o…BarViewModel::class.java)");
                                        this.f108463C = (CutVideoTitleBarViewModel) a7;
                                        Activity activity8 = this.f33840g_;
                                        if (activity8 != null) {
                                            JediViewModel a8 = C48927d.m105736a((FragmentActivity) activity8).mo96760a(CutVideoEditViewModel.class);
                                            C52711k.m112236a((Object) a8, "JediViewModelProviders.o…ditViewModel::class.java)");
                                            this.f108464D = (CutVideoEditViewModel) a8;
                                            Activity activity9 = this.f33840g_;
                                            if (activity9 != null) {
                                                JediViewModel a9 = C48927d.m105736a((FragmentActivity) activity9).mo96760a(CutVideoPreviewViewModel.class);
                                                C52711k.m112236a((Object) a9, "JediViewModelProviders.o…iewViewModel::class.java)");
                                                this.f108488ac = (CutVideoPreviewViewModel) a9;
                                                Activity activity10 = this.f33840g_;
                                                if (activity10 != null) {
                                                    JediViewModel a10 = C48927d.m105736a((FragmentActivity) activity10).mo96760a(CutVideoListViewModel.class);
                                                    C52711k.m112236a((Object) a10, "JediViewModelProviders.o…istViewModel::class.java)");
                                                    this.f108465E = (CutVideoListViewModel) a10;
                                                    Activity activity11 = this.f33840g_;
                                                    if (activity11 != null) {
                                                        JediViewModel a11 = C48927d.m105736a((FragmentActivity) activity11).mo96760a(CutVideoStickerPointMusicViewModel.class);
                                                        C52711k.m112236a((Object) a11, "JediViewModelProviders.o…sicViewModel::class.java)");
                                                        this.f108466F = (CutVideoStickerPointMusicViewModel) a11;
                                                        Activity activity12 = this.f33840g_;
                                                        if (activity12 != null) {
                                                            JediViewModel a12 = C48927d.m105736a((FragmentActivity) activity12).mo96760a(CutVideoMultiModeViewModel.class);
                                                            C52711k.m112236a((Object) a12, "JediViewModelProviders.o…odeViewModel::class.java)");
                                                            this.f108467G = (CutVideoMultiModeViewModel) a12;
                                                            CutVideoViewModel cutVideoViewModel = this.f108487ab;
                                                            if (cutVideoViewModel == null) {
                                                                C52711k.m112237a("cutVideoViewModel");
                                                            }
                                                            if (cutVideoViewModel.mo87182k()) {
                                                                C12924i iVar = this.f33835c;
                                                                if (iVar == null) {
                                                                    C52711k.m112234a();
                                                                }
                                                                View j_11 = iVar.mo24467j_(R.id.cop);
                                                                C52711k.m112236a((Object) j_11, "parentScene!!.requireVie…(R.id.single_edit_layout)");
                                                                this.f108503w = (StickPointSingleVideoEditView) j_11;
                                                                C42820ax axVar = this.f108490j;
                                                                if (axVar != null) {
                                                                    C42875bp bpVar = this.f108472L;
                                                                    C52711k.m112240b(bpVar, "<set-?>");
                                                                    axVar.f108258b = bpVar;
                                                                }
                                                            } else {
                                                                FrameLayout frameLayout = this.f108502v;
                                                                if (frameLayout == null) {
                                                                    C52711k.m112237a("recyclerViewLayout");
                                                                }
                                                                frameLayout.setVisibility(0);
                                                            }
                                                            CutVideoViewModel cutVideoViewModel2 = this.f108487ab;
                                                            if (cutVideoViewModel2 == null) {
                                                                C52711k.m112237a("cutVideoViewModel");
                                                            }
                                                            if (cutVideoViewModel2.mo87182k()) {
                                                                VideoEditViewModel videoEditViewModel = this.f108505y;
                                                                if (videoEditViewModel == null) {
                                                                    C52711k.m112237a("videoEditViewModel");
                                                                }
                                                                CutMultiVideoViewModel cutMultiVideoViewModel = this.f108504x;
                                                                if (cutMultiVideoViewModel == null) {
                                                                    C52711k.m112237a("cutMultiVideoViewModel");
                                                                }
                                                                VideoEditViewModel videoEditViewModel2 = this.f108505y;
                                                                if (videoEditViewModel2 == null) {
                                                                    C52711k.m112237a("videoEditViewModel");
                                                                }
                                                                List k = videoEditViewModel2.mo87633k();
                                                                C52711k.m112236a((Object) k, "videoEditViewModel.videoEditedList");
                                                                tVar = new C42992e(videoEditViewModel, cutMultiVideoViewModel, k);
                                                            } else {
                                                                VideoEditViewModel videoEditViewModel3 = this.f108505y;
                                                                if (videoEditViewModel3 == null) {
                                                                    C52711k.m112237a("videoEditViewModel");
                                                                }
                                                                CutMultiVideoViewModel cutMultiVideoViewModel2 = this.f108504x;
                                                                if (cutMultiVideoViewModel2 == null) {
                                                                    C52711k.m112237a("cutMultiVideoViewModel");
                                                                }
                                                                VideoEditViewModel videoEditViewModel4 = this.f108505y;
                                                                if (videoEditViewModel4 == null) {
                                                                    C52711k.m112237a("videoEditViewModel");
                                                                }
                                                                tVar = new C43099t(videoEditViewModel3, cutMultiVideoViewModel2, videoEditViewModel4.mo87633k());
                                                            }
                                                            this.f108489i = tVar;
                                                            C43099t tVar2 = this.f108489i;
                                                            if (tVar2 == null) {
                                                                C52711k.m112234a();
                                                            }
                                                            tVar2.f108808c = new C42941ac(this);
                                                            if (this.f108489i instanceof C42992e) {
                                                                C43099t tVar3 = this.f108489i;
                                                                if (tVar3 != null) {
                                                                    ((C42992e) tVar3).mo87383a(C43036f.m94313g());
                                                                } else {
                                                                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.StickPointVideoSegmentAdapter");
                                                                }
                                                            }
                                                            CutVideoViewModel cutVideoViewModel3 = this.f108487ab;
                                                            if (cutVideoViewModel3 == null) {
                                                                C52711k.m112237a("cutVideoViewModel");
                                                            }
                                                            if (cutVideoViewModel3.mo87182k()) {
                                                                C43099t tVar4 = this.f108489i;
                                                                if (tVar4 == null) {
                                                                    C52711k.m112234a();
                                                                }
                                                                lVar = new C42997f(tVar4);
                                                            } else {
                                                                C43099t tVar5 = this.f108489i;
                                                                if (tVar5 == null) {
                                                                    C52711k.m112234a();
                                                                }
                                                                lVar = new C42654l(tVar5);
                                                            }
                                                            C1385a aVar = new C1385a(lVar);
                                                            RecyclerView recyclerView = this.f108492l;
                                                            if (recyclerView == null) {
                                                                C52711k.m112237a("videoRecyclerView");
                                                            }
                                                            aVar.mo5444a(recyclerView);
                                                            RecyclerView recyclerView2 = this.f108492l;
                                                            if (recyclerView2 == null) {
                                                                C52711k.m112237a("videoRecyclerView");
                                                            }
                                                            recyclerView2.setLayoutManager(new C42948b(mo24477v()));
                                                            RecyclerView recyclerView3 = this.f108492l;
                                                            if (recyclerView3 == null) {
                                                                C52711k.m112237a("videoRecyclerView");
                                                            }
                                                            recyclerView3.setAdapter(this.f108489i);
                                                            RecyclerView recyclerView4 = this.f108492l;
                                                            if (recyclerView4 == null) {
                                                                C52711k.m112237a("videoRecyclerView");
                                                            }
                                                            C1506w wVar = new C1506w();
                                                            wVar.f4729j = 300;
                                                            wVar.f4731l = 300;
                                                            wVar.f4730k = 300;
                                                            wVar.f4728i = 300;
                                                            recyclerView4.setItemAnimator(wVar);
                                                            RecyclerView recyclerView5 = this.f108492l;
                                                            if (recyclerView5 == null) {
                                                                C52711k.m112237a("videoRecyclerView");
                                                            }
                                                            recyclerView5.getViewTreeObserver().addOnPreDrawListener(new C42942ad(this));
                                                            RecyclerView recyclerView6 = this.f108492l;
                                                            if (recyclerView6 == null) {
                                                                C52711k.m112237a("videoRecyclerView");
                                                            }
                                                            recyclerView6.setOnTouchListener(new C42943ae(this));
                                                            C43099t tVar6 = this.f108489i;
                                                            if (tVar6 != null) {
                                                                tVar6.notifyDataSetChanged();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                                    }
                                                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                                }
                                                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                            }
                                            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                        }
                                        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                    }
                                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                }
                                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                            }
                            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo87354a(boolean z, boolean z2) {
        int i;
        if (z2) {
            C43099t tVar = this.f108489i;
            if (tVar != null && tVar.mo87493a() == 0) {
                CutVideoViewModel cutVideoViewModel = this.f108487ab;
                if (cutVideoViewModel == null) {
                    C52711k.m112237a("cutVideoViewModel");
                }
                cutVideoViewModel.mo87176e();
                return;
            }
        }
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f108463C;
        if (cutVideoTitleBarViewModel == null) {
            C52711k.m112237a("titleBarViewModel");
        }
        cutVideoTitleBarViewModel.mo87170a(true);
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = this.f108463C;
        if (cutVideoTitleBarViewModel2 == null) {
            C52711k.m112237a("titleBarViewModel");
        }
        cutVideoTitleBarViewModel2.mo87171b(true);
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.f108462B;
        if (cutVideoBottomBarViewModel == null) {
            C52711k.m112237a("bottomBarViewModel");
        }
        cutVideoBottomBarViewModel.mo87018c(false);
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel2 = this.f108462B;
        if (cutVideoBottomBarViewModel2 == null) {
            C52711k.m112237a("bottomBarViewModel");
        }
        cutVideoBottomBarViewModel2.mo87019d(false);
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel3 = this.f108462B;
        if (cutVideoBottomBarViewModel3 == null) {
            C52711k.m112237a("bottomBarViewModel");
        }
        cutVideoBottomBarViewModel3.mo87015a(false);
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel4 = this.f108462B;
        if (cutVideoBottomBarViewModel4 == null) {
            C52711k.m112237a("bottomBarViewModel");
        }
        cutVideoBottomBarViewModel4.mo87017b(this.f108473M);
        CutVideoSpeedViewModel cutVideoSpeedViewModel = this.f108461A;
        if (cutVideoSpeedViewModel == null) {
            C52711k.m112237a("speedViewModel");
        }
        cutVideoSpeedViewModel.mo87127a(false);
        CutVideoSpeedViewModel cutVideoSpeedViewModel2 = this.f108461A;
        if (cutVideoSpeedViewModel2 == null) {
            C52711k.m112237a("speedViewModel");
        }
        cutVideoSpeedViewModel2.mo87128b(this.f108473M);
        if (this.f108473M) {
            CutVideoSpeedViewModel cutVideoSpeedViewModel3 = this.f108461A;
            if (cutVideoSpeedViewModel3 == null) {
                C52711k.m112237a("speedViewModel");
            }
            VideoEditViewModel videoEditViewModel = this.f108505y;
            if (videoEditViewModel == null) {
                C52711k.m112237a("videoEditViewModel");
            }
            C47339t a = C42652k.m93581a(videoEditViewModel.mo87635m());
            C52711k.m112236a((Object) a, "MVConfig.fromValue(videoEditViewModel.totalSpeed)");
            cutVideoSpeedViewModel3.mo87126a(a);
        }
        if (this.f108490j != null) {
            CutVideoPreviewViewModel cutVideoPreviewViewModel = this.f108488ac;
            if (cutVideoPreviewViewModel == null) {
                C52711k.m112237a("previewViewModel");
            }
            cutVideoPreviewViewModel.mo87114e();
            C42809as asVar = this.f108486Z;
            if (asVar != null) {
                asVar.mo87218a();
            }
            CutVideoListViewModel cutVideoListViewModel = this.f108465E;
            if (cutVideoListViewModel == null) {
                C52711k.m112237a("cutVideoListViewModel");
            }
            Activity activity = this.f33840g_;
            if (activity != null) {
                FragmentActivity fragmentActivity = (FragmentActivity) activity;
                C52711k.m112240b(fragmentActivity, "activity");
                JediViewModel a2 = C48927d.m105736a(fragmentActivity).mo96760a(CutVideoPreviewViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…iewViewModel::class.java)");
                ((CutVideoPreviewViewModel) a2).mo87114e();
                C42874bo boVar = cutVideoListViewModel.f108003g;
                if (boVar == null) {
                    C52711k.m112237a("stickerPointController");
                }
                boVar.mo87266b(z, z2);
            } else {
                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
        }
        VECutVideoPresenter vECutVideoPresenter = this.f108491k;
        if (vECutVideoPresenter == null) {
            C52711k.m112237a("presenter");
        }
        C43066n nVar = vECutVideoPresenter.f107700n;
        VideoEditViewModel videoEditViewModel2 = vECutVideoPresenter.f107699m;
        if (videoEditViewModel2 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        List l = videoEditViewModel2.mo87634l();
        if (nVar.f108714c) {
            C42648h hVar = nVar.f108713b;
            if (hVar != null) {
                hVar.mo86914a(z, z2, l);
            }
        } else {
            C42648h hVar2 = nVar.f108712a;
            if (hVar2 != null) {
                hVar2.mo86914a(z, z2, l);
            }
        }
        if (!mo87352H()) {
            CutVideoEditViewModel cutVideoEditViewModel = this.f108464D;
            if (cutVideoEditViewModel == null) {
                C52711k.m112237a("cutVideoEditViewModel");
            }
            cutVideoEditViewModel.mo22530c(C42691f.f107999a);
        }
        if (z2) {
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f108504x;
            if (cutMultiVideoViewModel == null) {
                C52711k.m112237a("cutMultiVideoViewModel");
            }
            cutMultiVideoViewModel.mo86795a();
        }
        ImageView imageView = this.f108499s;
        if (imageView == null) {
            C52711k.m112237a("ivSave");
        }
        imageView.setVisibility(8);
        ImageView imageView2 = this.f108500t;
        if (imageView2 == null) {
            C52711k.m112237a("ivCancel");
        }
        imageView2.setVisibility(8);
        FrameLayout frameLayout = this.f108498r;
        if (frameLayout == null) {
            C52711k.m112237a("singleEditLayout");
        }
        frameLayout.setVisibility(8);
        TextView textView = this.f108494n;
        if (textView == null) {
            C52711k.m112237a("tvVideoSegmentDes");
        }
        textView.setVisibility(0);
        if (mo87352H()) {
            CutVideoListViewModel cutVideoListViewModel2 = this.f108465E;
            if (cutVideoListViewModel2 == null) {
                C52711k.m112237a("cutVideoListViewModel");
            }
            cutVideoListViewModel2.mo87070d(true);
        } else {
            RecyclerView recyclerView = this.f108492l;
            if (recyclerView == null) {
                C52711k.m112237a("videoRecyclerView");
            }
            recyclerView.setVisibility(0);
        }
        FrameLayout frameLayout2 = this.f108501u;
        if (frameLayout2 == null) {
            C52711k.m112237a("flEditVideo");
        }
        frameLayout2.setVisibility(4);
        if (!(this.f108478R == null || this.f108479S == null)) {
            if (!mo87352H() || !C43036f.m94309c()) {
                CutVideoListViewModel cutVideoListViewModel3 = this.f108465E;
                if (cutVideoListViewModel3 == null) {
                    C52711k.m112237a("cutVideoListViewModel");
                }
                i = cutVideoListViewModel3.f108001e;
            } else {
                CutVideoListViewModel cutVideoListViewModel4 = this.f108465E;
                if (cutVideoListViewModel4 == null) {
                    C52711k.m112237a("cutVideoListViewModel");
                }
                i = cutVideoListViewModel4.f108001e + 1;
            }
            RecyclerView recyclerView2 = this.f108492l;
            if (recyclerView2 == null) {
                C52711k.m112237a("videoRecyclerView");
            }
            View rootView = recyclerView2.getRootView();
            C52711k.m112236a((Object) rootView, "videoRecyclerView.rootView");
            rootView.getViewTreeObserver().addOnPreDrawListener(new C42946ag(this, i, z2));
        }
        CutVideoPreviewViewModel cutVideoPreviewViewModel2 = this.f108488ac;
        if (cutVideoPreviewViewModel2 == null) {
            C52711k.m112237a("previewViewModel");
        }
        cutVideoPreviewViewModel2.mo22530c(C42710d.f108031a);
        C43047h.f108667g.mo87426a(mo87352H(), false, z, !z, z2, false);
    }

    /* renamed from: a */
    public final void mo87353a(boolean z) {
        if (!this.f108484X) {
            CutVideoEditViewModel cutVideoEditViewModel = this.f108464D;
            if (cutVideoEditViewModel == null) {
                C52711k.m112237a("cutVideoEditViewModel");
            }
            cutVideoEditViewModel.mo87038a(!z);
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f108463C;
            if (cutVideoTitleBarViewModel == null) {
                C52711k.m112237a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel.mo87173d(!z);
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = this.f108463C;
            if (cutVideoTitleBarViewModel2 == null) {
                C52711k.m112237a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel2.mo87172c(!z);
            CutVideoPreviewViewModel cutVideoPreviewViewModel = this.f108488ac;
            if (cutVideoPreviewViewModel == null) {
                C52711k.m112237a("previewViewModel");
            }
            cutVideoPreviewViewModel.mo87113a(!z);
        }
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return C49549a.m106927b(this);
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C49549a.m106934d(this);
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return C49549a.m106935e(this);
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return C49549a.m106918a(this);
    }

    /* renamed from: i */
    public final /* synthetic */ C11796d mo22645i() {
        return C49549a.m106930c(this);
    }

    /* renamed from: F */
    public final RecyclerView mo87350F() {
        RecyclerView recyclerView = this.f108492l;
        if (recyclerView == null) {
            C52711k.m112237a("videoRecyclerView");
        }
        return recyclerView;
    }

    /* renamed from: G */
    public final C42873bn mo87351G() {
        C42873bn bnVar = this.f108493m;
        if (bnVar == null) {
            C52711k.m112237a("previewEditCallback");
        }
        return bnVar;
    }

    /* renamed from: H */
    public final boolean mo87352H() {
        if (this.f108490j == null) {
            return false;
        }
        C42820ax axVar = this.f108490j;
        if (axVar == null) {
            C52711k.m112234a();
        }
        return axVar.mo87270f();
    }

    /* renamed from: p */
    public final void mo24469p() {
        super.mo24469p();
        ValueAnimator valueAnimator = this.f108468H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        AnimatorSet animatorSet = this.f108480T;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ CutVideoListViewModel m94157a(C42937s sVar) {
        CutVideoListViewModel cutVideoListViewModel = sVar.f108465E;
        if (cutVideoListViewModel == null) {
            C52711k.m112237a("cutVideoListViewModel");
        }
        return cutVideoListViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ VideoEditViewModel m94158b(C42937s sVar) {
        VideoEditViewModel videoEditViewModel = sVar.f108505y;
        if (videoEditViewModel == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ CutMultiVideoViewModel m94159c(C42937s sVar) {
        CutMultiVideoViewModel cutMultiVideoViewModel = sVar.f108504x;
        if (cutMultiVideoViewModel == null) {
            C52711k.m112237a("cutMultiVideoViewModel");
        }
        return cutMultiVideoViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ CutVideoEditViewModel m94160d(C42937s sVar) {
        CutVideoEditViewModel cutVideoEditViewModel = sVar.f108464D;
        if (cutVideoEditViewModel == null) {
            C52711k.m112237a("cutVideoEditViewModel");
        }
        return cutVideoEditViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ CutVideoSpeedViewModel m94161e(C42937s sVar) {
        CutVideoSpeedViewModel cutVideoSpeedViewModel = sVar.f108461A;
        if (cutVideoSpeedViewModel == null) {
            C52711k.m112237a("speedViewModel");
        }
        return cutVideoSpeedViewModel;
    }

    /* renamed from: f */
    public static final /* synthetic */ ImageView m94162f(C42937s sVar) {
        ImageView imageView = sVar.f108499s;
        if (imageView == null) {
            C52711k.m112237a("ivSave");
        }
        return imageView;
    }

    /* renamed from: g */
    public static final /* synthetic */ ImageView m94163g(C42937s sVar) {
        ImageView imageView = sVar.f108500t;
        if (imageView == null) {
            C52711k.m112237a("ivCancel");
        }
        return imageView;
    }

    /* renamed from: h */
    public static final /* synthetic */ StickPointVideoSegView m94164h(C42937s sVar) {
        StickPointVideoSegView stickPointVideoSegView = sVar.f108496p;
        if (stickPointVideoSegView == null) {
            C52711k.m112237a("stickPointVideoTitleView");
        }
        return stickPointVideoSegView;
    }

    /* renamed from: i */
    public static final /* synthetic */ StickPointSingleVideoEditView m94165i(C42937s sVar) {
        StickPointSingleVideoEditView stickPointSingleVideoEditView = sVar.f108503w;
        if (stickPointSingleVideoEditView == null) {
            C52711k.m112237a("singleVideoEditView");
        }
        return stickPointSingleVideoEditView;
    }

    /* renamed from: j */
    public static final /* synthetic */ FrameLayout m94166j(C42937s sVar) {
        FrameLayout frameLayout = sVar.f108502v;
        if (frameLayout == null) {
            C52711k.m112237a("recyclerViewLayout");
        }
        return frameLayout;
    }

    /* renamed from: k */
    public static final /* synthetic */ View m94167k(C42937s sVar) {
        View view = sVar.f108495o;
        if (view == null) {
            C52711k.m112237a("animTabDot");
        }
        return view;
    }

    /* renamed from: l */
    public static final /* synthetic */ FrameLayout m94168l(C42937s sVar) {
        FrameLayout frameLayout = sVar.f108501u;
        if (frameLayout == null) {
            C52711k.m112237a("flEditVideo");
        }
        return frameLayout;
    }

    /* renamed from: m */
    public static final /* synthetic */ TextView m94169m(C42937s sVar) {
        TextView textView = sVar.f108494n;
        if (textView == null) {
            C52711k.m112237a("tvVideoSegmentDes");
        }
        return textView;
    }

    /* renamed from: n */
    public static final /* synthetic */ CutVideoBottomBarViewModel m94170n(C42937s sVar) {
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = sVar.f108462B;
        if (cutVideoBottomBarViewModel == null) {
            C52711k.m112237a("bottomBarViewModel");
        }
        return cutVideoBottomBarViewModel;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        CutVideoViewModel cutVideoViewModel = this.f108487ab;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo87182k()) {
            C42940ab abVar = new C42940ab(this);
            StickPointVideoSegView stickPointVideoSegView = this.f108496p;
            if (stickPointVideoSegView == null) {
                C52711k.m112237a("stickPointVideoTitleView");
            }
            C43025i iVar = abVar;
            stickPointVideoSegView.setStickPointVideoSegListener(iVar);
            this.f108472L.mo87319a(iVar);
            C42875bp bpVar = this.f108472L;
            RecyclerView recyclerView = this.f108492l;
            if (recyclerView == null) {
                C52711k.m112237a("videoRecyclerView");
            }
            bpVar.mo87318a((C42992e) recyclerView.getAdapter());
            ArrayList a = this.f108472L.mo87316a();
            if (a == null) {
                C52711k.m112234a();
            }
            if (a.size() < 8) {
                C12932b.m25978a(this, new C42939aa(this), 200);
            }
        }
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f108504x;
        if (cutMultiVideoViewModel == null) {
            C52711k.m112237a("cutMultiVideoViewModel");
        }
        C0184k kVar = this;
        cutMultiVideoViewModel.f107667a.observe(kVar, new C42956i(this));
        VideoEditViewModel videoEditViewModel = this.f108505y;
        if (videoEditViewModel == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        videoEditViewModel.f108927v = new C42964o(this);
        VideoEditViewModel videoEditViewModel2 = this.f108505y;
        if (videoEditViewModel2 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        videoEditViewModel2.f108920o.observe(kVar, new C42972u(this));
        VideoEditViewModel videoEditViewModel3 = this.f108505y;
        if (videoEditViewModel3 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        videoEditViewModel3.f108921p.observe(kVar, new C42973v(this));
        VideoEditViewModel videoEditViewModel4 = this.f108505y;
        if (videoEditViewModel4 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        videoEditViewModel4.f108922q.observe(kVar, new C42974w(this));
        VideoEditViewModel videoEditViewModel5 = this.f108505y;
        if (videoEditViewModel5 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        videoEditViewModel5.f108923r.observe(kVar, new C42975x(this));
        CutMultiVideoViewModel cutMultiVideoViewModel2 = this.f108504x;
        if (cutMultiVideoViewModel2 == null) {
            C52711k.m112237a("cutMultiVideoViewModel");
        }
        cutMultiVideoViewModel2.f107676j.observe(kVar, new C42976y(this));
        CutVideoListViewModel cutVideoListViewModel = this.f108465E;
        if (cutVideoListViewModel == null) {
            C52711k.m112237a("cutVideoListViewModel");
        }
        mo49444c(cutVideoListViewModel, C42733ac.f108057a, new C11934u(), new C42977z(this));
        CutVideoListViewModel cutVideoListViewModel2 = this.f108465E;
        if (cutVideoListViewModel2 == null) {
            C52711k.m112237a("cutVideoListViewModel");
        }
        mo49444c(cutVideoListViewModel2, C42978t.f108556a, new C11934u(), new C42957j(this));
        CutVideoListViewModel cutVideoListViewModel3 = this.f108465E;
        if (cutVideoListViewModel3 == null) {
            C52711k.m112237a("cutVideoListViewModel");
        }
        mo49443b(cutVideoListViewModel3, C42979u.f108557a, new C11934u(), new C42958k(this));
        CutVideoListViewModel cutVideoListViewModel4 = this.f108465E;
        if (cutVideoListViewModel4 == null) {
            C52711k.m112237a("cutVideoListViewModel");
        }
        mo49443b(cutVideoListViewModel4, C42980v.f108558a, new C11934u(), new C42959l(this));
        CutVideoListViewModel cutVideoListViewModel5 = this.f108465E;
        if (cutVideoListViewModel5 == null) {
            C52711k.m112237a("cutVideoListViewModel");
        }
        mo49444c(cutVideoListViewModel5, C42981w.f108559a, new C11934u(), new C42960m(this));
        CutVideoListViewModel cutVideoListViewModel6 = this.f108465E;
        if (cutVideoListViewModel6 == null) {
            C52711k.m112237a("cutVideoListViewModel");
        }
        mo49444c(cutVideoListViewModel6, C42982x.f108560a, new C11934u(), new C42962n(this));
        CutVideoListViewModel cutVideoListViewModel7 = this.f108465E;
        if (cutVideoListViewModel7 == null) {
            C52711k.m112237a("cutVideoListViewModel");
        }
        mo49444c(cutVideoListViewModel7, C42983y.f108561a, new C11934u(), new C42965p(this));
        CutVideoListViewModel cutVideoListViewModel8 = this.f108465E;
        if (cutVideoListViewModel8 == null) {
            C52711k.m112237a("cutVideoListViewModel");
        }
        mo49444c(cutVideoListViewModel8, C42984z.f108562a, new C11934u(), new C42967q(this));
        CutVideoListViewModel cutVideoListViewModel9 = this.f108465E;
        if (cutVideoListViewModel9 == null) {
            C52711k.m112237a("cutVideoListViewModel");
        }
        mo49443b(cutVideoListViewModel9, C42731aa.f108055a, new C11934u(), new C42969r(this));
        CutVideoListViewModel cutVideoListViewModel10 = this.f108465E;
        if (cutVideoListViewModel10 == null) {
            C52711k.m112237a("cutVideoListViewModel");
        }
        cutVideoListViewModel10.mo87071e().observe(kVar, new C42970s(this));
        CutVideoListViewModel cutVideoListViewModel11 = this.f108465E;
        if (cutVideoListViewModel11 == null) {
            C52711k.m112237a("cutVideoListViewModel");
        }
        mo49444c(cutVideoListViewModel11, C42732ab.f108056a, new C11934u(), new C42971t(this));
        ImageView imageView = this.f108499s;
        if (imageView == null) {
            C52711k.m112237a("ivSave");
        }
        imageView.setOnClickListener(new C42954g(this));
        ImageView imageView2 = this.f108500t;
        if (imageView2 == null) {
            C52711k.m112237a("ivCancel");
        }
        imageView2.setOnClickListener(new C42955h(this));
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.bqu, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…o_list, container, false)");
        return inflate;
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: b */
    public final <S extends C11932s, A> void mo49443b(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectNonNullSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106925a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11932s, A> void mo49444c(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49555b<? extends A>> jVar, C11934u<C11937x<C49555b<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106928b(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11932s, A> void mo49445d(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49562i<? extends A>> jVar, C11934u<C11937x<C49562i<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeMultiEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106931c(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106933d(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C49549a.m106921a(this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C49549a.m106920a((C49548a) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C49549a.m106922a((C49548a) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C, D> C1690c mo22551a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super C11866f, ? super A, ? super B, ? super C, ? super D, C52860x> sVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(jVar4, "prop4");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(sVar, "subscriber");
        return C49549a.m106923a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
    }
}
