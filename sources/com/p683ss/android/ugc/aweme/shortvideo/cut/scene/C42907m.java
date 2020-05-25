package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
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
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42630g;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42648h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43047h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractVideoEditView;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2.C43155d;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEVideoEditViewV2;
import com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.C43168a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2192d.C43457b;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m */
public final class C42907m extends C48925b implements C49548a {

    /* renamed from: y */
    public static final C42908a f108412y = new C42908a(null);

    /* renamed from: A */
    private final boolean f108413A;

    /* renamed from: B */
    private final boolean f108414B;

    /* renamed from: i */
    public C42820ax f108415i;

    /* renamed from: j */
    public VECutVideoPresenter f108416j;

    /* renamed from: k */
    public AbstractVideoEditView f108417k;

    /* renamed from: l */
    public TextView f108418l;

    /* renamed from: m */
    public FrameLayout f108419m;

    /* renamed from: n */
    public View f108420n;

    /* renamed from: o */
    public final C43168a f108421o;

    /* renamed from: p */
    public VideoEditViewModel f108422p;

    /* renamed from: q */
    public VEVideoCutterViewModel f108423q;

    /* renamed from: r */
    public CutVideoBottomBarViewModel f108424r;

    /* renamed from: s */
    public CutVideoViewModel f108425s;

    /* renamed from: t */
    public CutVideoEditViewModel f108426t;

    /* renamed from: u */
    public CutVideoListViewModel f108427u;

    /* renamed from: v */
    public CutVideoSpeedViewModel f108428v;

    /* renamed from: w */
    public String f108429w;

    /* renamed from: x */
    public String f108430x;

    /* renamed from: z */
    private CutMultiVideoViewModel f108431z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$a */
    public static final class C42908a {
        private C42908a() {
        }

        public /* synthetic */ C42908a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$b */
    static final class C42909b<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C42907m f108432a;

        C42909b(C42907m mVar) {
            this.f108432a = mVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Integer num = (Integer) obj;
            CutVideoEditViewModel a = C42907m.m94123a(this.f108432a);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            a.f107992e = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$c */
    static final class C42910c<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C42907m f108433a;

        C42910c(C42907m mVar) {
            this.f108433a = mVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            this.f108433a.f108421o.f109119b = this.f108433a.mo87345G().getPlayingPosition();
            C42907m.m94124b(this.f108433a).mo87731a(this.f108433a.f108421o);
            C42907m.m94125c(this.f108433a).mo87014a(this.f108433a.mo87345G().getSelectedTime());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$d */
    static final class C42911d<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C42907m f108434a;

        C42911d(C42907m mVar) {
            this.f108434a = mVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            long j;
            Void voidR = (Void) obj;
            if (this.f108434a.mo87345G() instanceof VEVideoEditViewV2) {
                C42907m.m94124b(this.f108434a).mo87731a(new C43168a(3, this.f108434a.mo87345G().getSingleSeekTime(), C50743d.EDITOR_SEEK_FLAG_LAST_UpdateInOut));
            } else {
                if (C42907m.m94123a(this.f108434a).f107992e == 1) {
                    j = this.f108434a.mo87345G().getMultiPlayingPosition();
                } else {
                    j = this.f108434a.mo87345G().getSinglePlayingPosition();
                }
                VECutVideoPresenter F = this.f108434a.mo87344F();
                C0794k playBoundary = this.f108434a.mo87345G().getPlayBoundary();
                C52711k.m112236a((Object) playBoundary, "videoEditView.playBoundary");
                F.mo86813a(playBoundary);
                C42907m.m94124b(this.f108434a).mo87731a(new C43168a(3, j, C50743d.EDITOR_SEEK_FLAG_LastSeek));
            }
            C42907m.m94125c(this.f108434a).mo87014a(this.f108434a.mo87345G().getSelectedTime());
            if (C42907m.m94123a(this.f108434a).f107992e == 2) {
                VECutVideoPresenter F2 = this.f108434a.mo87344F();
                VideoSegment videoSegment = (VideoSegment) C42907m.m94126d(this.f108434a).mo87634l().get(C42907m.m94127e(this.f108434a).f108002f);
                F f = this.f108434a.mo87345G().getPlayBoundary().f2711a;
                if (f == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) f, "videoEditView.playBoundary.first!!");
                long longValue = ((Number) f).longValue();
                S s = this.f108434a.mo87345G().getPlayBoundary().f2712b;
                if (s == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) s, "videoEditView.playBoundary.second!!");
                F2.mo86815a(videoSegment, longValue, ((Number) s).longValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$e */
    static final class C42912e<T> implements C0199s<Float> {

        /* renamed from: a */
        final /* synthetic */ C42907m f108435a;

        C42912e(C42907m mVar) {
            this.f108435a = mVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            long j;
            Float f = (Float) obj;
            if (f != null) {
                VECutVideoPresenter F = this.f108435a.mo87344F();
                int i = C42907m.m94127e(this.f108435a).f108002f;
                C52711k.m112236a((Object) f, "it");
                float floatValue = f.floatValue();
                C42648h hVar = F.f107700n.f108712a;
                if (hVar != null) {
                    hVar.mo86917b(i, floatValue);
                }
                C0794k playBoundary = this.f108435a.mo87345G().getPlayBoundary();
                if (!(playBoundary.f2711a == null || playBoundary.f2712b == null)) {
                    if (C42907m.m94123a(this.f108435a).f107992e == 1) {
                        j = this.f108435a.mo87345G().getMultiSeekTime();
                    } else {
                        j = this.f108435a.mo87345G().getSingleSeekTime();
                    }
                    VECutVideoPresenter F2 = this.f108435a.mo87344F();
                    C0794k playBoundary2 = this.f108435a.mo87345G().getPlayBoundary();
                    C52711k.m112236a((Object) playBoundary2, "videoEditView.playBoundary");
                    F2.mo86813a(playBoundary2);
                    C42907m.m94124b(this.f108435a).mo87731a(new C43168a(3, j, C50743d.EDITOR_SEEK_FLAG_LastSeek));
                }
                C42907m.m94125c(this.f108435a).mo87014a(this.f108435a.mo87345G().getSelectedTime());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$f */
    static final class C42913f<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C42907m f108436a;

        C42913f(C42907m mVar) {
            this.f108436a = mVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            C42907m.m94124b(this.f108436a).mo87731a(new C43168a(3, this.f108436a.mo87345G().getLeftSeekingValue(), C50743d.EDITOR_SEEK_FLAG_OnGoing));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$g */
    static final class C42914g<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C42907m f108437a;

        C42914g(C42907m mVar) {
            this.f108437a = mVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            C42907m.m94124b(this.f108437a).mo87731a(new C43168a(3, this.f108437a.mo87345G().getLeftSeekingValue(), C50743d.EDITOR_SEEK_FLAG_LAST_UpdateInOut));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$h */
    static final class C42915h extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42907m f108438a;

        C42915h(C42907m mVar) {
            this.f108438a = mVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            C0794k playBoundary = this.f108438a.mo87345G().getPlayBoundary();
            C42820ax axVar = this.f108438a.f108415i;
            if (axVar != null && axVar.mo87270f()) {
                List<VideoSegment> l = C42907m.m94126d(this.f108438a).mo87634l();
                C52711k.m112236a((Object) l, "videoEditViewModel.originVideoList");
                long j = 0;
                for (VideoSegment videoSegment : l) {
                    if (!videoSegment.f107911j) {
                        C52711k.m112236a((Object) videoSegment, "it");
                        j += videoSegment.mo86953g() - videoSegment.mo86952f();
                    }
                }
                playBoundary = new C0794k(Long.valueOf(0), Long.valueOf(j));
            }
            VECutVideoPresenter F = this.f108438a.mo87344F();
            C52711k.m112236a((Object) playBoundary, "boundary");
            F.mo86813a(playBoundary);
            VEVideoCutterViewModel b = C42907m.m94124b(this.f108438a);
            Long l2 = (Long) playBoundary.f2711a;
            if (l2 == null) {
                l2 = Long.valueOf(0);
            }
            b.mo87731a(new C43168a(3, l2.longValue(), C50743d.EDITOR_SEEK_FLAG_LastSeek));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$i */
    static final class C42916i extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42907m f108439a;

        C42916i(C42907m mVar) {
            this.f108439a = mVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            this.f108439a.mo87345G().setEnabled(booleanValue);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$j */
    static final class C42917j<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C42907m f108440a;

        C42917j(C42907m mVar) {
            this.f108440a = mVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                if (!(!bool.booleanValue())) {
                    bool = null;
                }
                if (bool != null) {
                    C42907m.m94124b(this.f108440a).mo87731a(new C43168a(3, this.f108440a.mo87345G().getPlayingPosition(), C50743d.EDITOR_SEEK_FLAG_LastSeek));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$k */
    static final class C42918k extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42907m f108441a;

        C42918k(C42907m mVar) {
            this.f108441a = mVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            this.f108441a.mo87345G().mo87517a(booleanValue);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$l */
    static final class C42919l extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42907m f108442a;

        C42919l(C42907m mVar) {
            this.f108442a = mVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            this.f108442a.mo87345G().mo87520e();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$m */
    static final class C42920m extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42907m f108443a;

        C42920m(C42907m mVar) {
            this.f108443a = mVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i;
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            View f = C42907m.m94128f(this.f108443a);
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            f.setVisibility(i);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$n */
    static final class C42921n<T> implements C0199s<Float> {

        /* renamed from: a */
        final /* synthetic */ C42907m f108444a;

        C42921n(C42907m mVar) {
            this.f108444a = mVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            if (f != null) {
                View f2 = C42907m.m94128f(this.f108444a);
                C52711k.m112236a((Object) f, "it");
                f2.setAlpha(f.floatValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$o */
    static final class C42922o<T> implements C0199s<Long> {

        /* renamed from: a */
        final /* synthetic */ C42907m f108445a;

        C42922o(C42907m mVar) {
            this.f108445a = mVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Long l = (Long) obj;
            if (l != null) {
                C42907m.m94124b(this.f108445a).mo87731a(new C43168a(3, l.longValue(), C50743d.EDITOR_SEEK_FLAG_OnGoing));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$p */
    static final class C42923p<T> implements C0199s<Float> {

        /* renamed from: a */
        final /* synthetic */ C42907m f108446a;

        C42923p(C42907m mVar) {
            this.f108446a = mVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            C42907m.m94125c(this.f108446a).mo87014a(this.f108446a.mo87345G().getSelectedTime());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$q */
    static final class C42924q<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C42907m f108447a;

        C42924q(C42907m mVar) {
            this.f108447a = mVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            C42907m.m94124b(this.f108447a).mo87731a(new C43168a(3, this.f108447a.mo87345G().getLeftSeekingValue(), C50743d.EDITOR_SEEK_FLAG_OnGoing));
            C42907m.m94125c(this.f108447a).mo87014a(this.f108447a.mo87345G().getSelectedTime());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$r */
    static final class C42925r<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C42907m f108448a;

        C42925r(C42907m mVar) {
            this.f108448a = mVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            C42907m.m94124b(this.f108448a).mo87731a(new C43168a(3, this.f108448a.mo87345G().getRightSeekingValue(), C50743d.EDITOR_SEEK_FLAG_OnGoing));
            C42907m.m94125c(this.f108448a).mo87014a(this.f108448a.mo87345G().getSelectedTime());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$s */
    static final class C42926s<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C42907m f108449a;

        C42926s(C42907m mVar) {
            this.f108449a = mVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            C42907m.m94124b(this.f108449a).mo87731a(new C43168a(3, this.f108449a.mo87345G().getLeftSeekingValue(), C50743d.EDITOR_SEEK_FLAG_LAST_UpdateIn));
            C42907m.m94125c(this.f108449a).mo87014a(this.f108449a.mo87345G().getSelectedTime());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$t */
    static final class C42927t<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C42907m f108450a;

        C42927t(C42907m mVar) {
            this.f108450a = mVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            C42907m.m94124b(this.f108450a).mo87731a(new C43168a(3, this.f108450a.mo87345G().getRightSeekingValue(), C50743d.EDITOR_SEEK_FLAG_LAST_UpdateOut));
            C42907m.m94125c(this.f108450a).mo87014a(this.f108450a.mo87345G().getSelectedTime());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$u */
    static final class C42928u<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C42907m f108451a;

        C42928u(C42907m mVar) {
            this.f108451a = mVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            CutVideoViewModel cutVideoViewModel = this.f108451a.f108425s;
            if (cutVideoViewModel == null) {
                C52711k.m112237a("cutVideoViewModel");
            }
            if (!cutVideoViewModel.mo87177f().f108061d) {
                C26890h.m65011a("upload_duration_adjust", C23089d.m56640a().mo47829a("creation_id", this.f108451a.f108430x).mo47829a("shoot_way", this.f108451a.f108429w).mo47829a("enter_from", "clip_edit_page").mo47829a("content_type", C43047h.m94330a(this.f108451a.mo87345G().mo87519d())).mo47826a("content_duration_ms", (int) (this.f108451a.mo87345G().getSelectedTime() * 1000.0f)).f61491a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$v */
    public static final class C42929v implements C42630g {

        /* renamed from: a */
        final /* synthetic */ C42907m f108452a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$v$a */
        static final class C42930a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C42929v f108453a;

            C42930a(C42929v vVar) {
                this.f108453a = vVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TextView g = C42907m.m94129g(this.f108453a.f108452a);
                C52711k.m112236a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    g.setAlpha(((Float) animatedValue).floatValue());
                    CutVideoBottomBarViewModel c = C42907m.m94125c(this.f108453a.f108452a);
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    if (animatedValue2 != null) {
                        c.mo87016b(1.0f - ((Float) animatedValue2).floatValue());
                        CutVideoSpeedViewModel h = C42907m.m94130h(this.f108453a.f108452a);
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        if (animatedValue3 != null) {
                            h.mo87125a(1.0f - ((Float) animatedValue3).floatValue());
                            return;
                        }
                        throw new C52857u("null cannot be cast to non-null type kotlin.Float");
                    }
                    throw new C52857u("null cannot be cast to non-null type kotlin.Float");
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Float");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.m$v$b */
        static final class C42931b implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C42929v f108454a;

            C42931b(C42929v vVar) {
                this.f108454a = vVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TextView g = C42907m.m94129g(this.f108454a.f108452a);
                C52711k.m112236a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    g.setAlpha(((Float) animatedValue).floatValue());
                    CutVideoBottomBarViewModel c = C42907m.m94125c(this.f108454a.f108452a);
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    if (animatedValue2 != null) {
                        c.mo87016b(1.0f - ((Float) animatedValue2).floatValue());
                        CutVideoSpeedViewModel h = C42907m.m94130h(this.f108454a.f108452a);
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        if (animatedValue3 != null) {
                            h.mo87125a(1.0f - ((Float) animatedValue3).floatValue());
                            return;
                        }
                        throw new C52857u("null cannot be cast to non-null type kotlin.Float");
                    }
                    throw new C52857u("null cannot be cast to non-null type kotlin.Float");
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Float");
            }
        }

        /* renamed from: a */
        public final void mo86895a() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat.setDuration(250);
            ofFloat.addUpdateListener(new C42930a(this));
            C42907m.m94125c(this.f108452a).mo87021e(true);
            C42907m.m94131i(this.f108452a).setVisibility(8);
            ofFloat.start();
        }

        C42929v(C42907m mVar) {
            this.f108452a = mVar;
        }

        /* renamed from: b */
        public final void mo86897b(float f) {
            TextView g = C42907m.m94129g(this.f108452a);
            C43155d dVar = C43155d.f109102e;
            Activity v = this.f108452a.mo24477v();
            C52711k.m112236a((Object) v, "requireActivity()");
            g.setText(dVar.mo87727a(v, f, this.f108452a.mo87345G().mo87519d()));
        }

        /* renamed from: a */
        public final void mo86896a(float f) {
            mo86897b(f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.setDuration(250);
            ofFloat.addUpdateListener(new C42931b(this));
            C42907m.m94125c(this.f108452a).mo87021e(false);
            C42907m.m94131i(this.f108452a).setVisibility(0);
            ofFloat.start();
        }
    }

    public C42907m() {
        this(false, false, 3, null);
    }

    /* renamed from: a */
    public final void mo24463a(View view, Bundle bundle) {
        boolean z;
        C52711k.m112240b(view, "view");
        super.mo24463a(view, bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            C0209x a = C0214z.m440a((FragmentActivity) activity).mo359a(VideoEditViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java]");
            this.f108422p = (VideoEditViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                C0209x a2 = C0214z.m440a((FragmentActivity) activity2).mo359a(VEVideoCutterViewModel.class);
                C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…terViewModel::class.java]");
                this.f108423q = (VEVideoCutterViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(CutVideoBottomBarViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…BarViewModel::class.java)");
                    this.f108424r = (CutVideoBottomBarViewModel) a3;
                    Activity activity4 = this.f33840g_;
                    if (activity4 != null) {
                        JediViewModel a4 = C48927d.m105736a((FragmentActivity) activity4).mo96760a(CutVideoViewModel.class);
                        C52711k.m112236a((Object) a4, "JediViewModelProviders.o…deoViewModel::class.java)");
                        this.f108425s = (CutVideoViewModel) a4;
                        Activity activity5 = this.f33840g_;
                        if (activity5 != null) {
                            C0209x a5 = C0214z.m440a((FragmentActivity) activity5).mo359a(CutMultiVideoViewModel.class);
                            C52711k.m112236a((Object) a5, "ViewModelProviders.of(ac…deoViewModel::class.java]");
                            this.f108431z = (CutMultiVideoViewModel) a5;
                            Activity activity6 = this.f33840g_;
                            if (activity6 != null) {
                                JediViewModel a6 = C48927d.m105736a((FragmentActivity) activity6).mo96760a(CutVideoEditViewModel.class);
                                C52711k.m112236a((Object) a6, "JediViewModelProviders.o…ditViewModel::class.java]");
                                this.f108426t = (CutVideoEditViewModel) a6;
                                Activity activity7 = this.f33840g_;
                                if (activity7 != null) {
                                    JediViewModel a7 = C48927d.m105736a((FragmentActivity) activity7).mo96760a(CutVideoListViewModel.class);
                                    C52711k.m112236a((Object) a7, "JediViewModelProviders.o…istViewModel::class.java)");
                                    this.f108427u = (CutVideoListViewModel) a7;
                                    Activity activity8 = this.f33840g_;
                                    if (activity8 != null) {
                                        JediViewModel a8 = C48927d.m105736a((FragmentActivity) activity8).mo96760a(CutVideoSpeedViewModel.class);
                                        C52711k.m112236a((Object) a8, "JediViewModelProviders.o…eedViewModel::class.java)");
                                        this.f108428v = (CutVideoSpeedViewModel) a8;
                                        View j_ = mo24467j_(R.id.dos);
                                        C52711k.m112236a((Object) j_, "requireViewById(R.id.videoEditView)");
                                        this.f108417k = (AbstractVideoEditView) j_;
                                        AbstractVideoEditView abstractVideoEditView = this.f108417k;
                                        if (abstractVideoEditView == null) {
                                            C52711k.m112237a("videoEditView");
                                        }
                                        if ((abstractVideoEditView instanceof VEVideoEditViewV2) && this.f108414B && VERSION.SDK_INT >= 17) {
                                            AbstractVideoEditView abstractVideoEditView2 = this.f108417k;
                                            if (abstractVideoEditView2 == null) {
                                                C52711k.m112237a("videoEditView");
                                            }
                                            abstractVideoEditView2.setLayoutDirection(0);
                                        }
                                        View j_2 = mo24467j_(R.id.cp9);
                                        C52711k.m112236a((Object) j_2, "requireViewById(R.id.slide_hint_txt)");
                                        this.f108420n = j_2;
                                        CutVideoViewModel cutVideoViewModel = this.f108425s;
                                        if (cutVideoViewModel == null) {
                                            C52711k.m112237a("cutVideoViewModel");
                                        }
                                        C42734ad f = cutVideoViewModel.mo87177f();
                                        String str = f.f108059b;
                                        ArrayList<MediaModel> arrayList = f.f108058a;
                                        CharSequence charSequence = str;
                                        if (!TextUtils.isEmpty(charSequence) || !arrayList.isEmpty()) {
                                            AbstractVideoEditView abstractVideoEditView3 = this.f108417k;
                                            if (abstractVideoEditView3 == null) {
                                                C52711k.m112237a("videoEditView");
                                            }
                                            C52711k.m112240b(abstractVideoEditView3, "videoEditView");
                                            abstractVideoEditView3.setMaxVideoLength(C43155d.m94693a());
                                            AbstractVideoEditView abstractVideoEditView4 = this.f108417k;
                                            if (abstractVideoEditView4 == null) {
                                                C52711k.m112237a("videoEditView");
                                            }
                                            abstractVideoEditView4.f108821a = true;
                                            if (f.f108060c) {
                                                AbstractVideoEditView abstractVideoEditView5 = this.f108417k;
                                                if (abstractVideoEditView5 == null) {
                                                    C52711k.m112237a("videoEditView");
                                                }
                                                abstractVideoEditView5.f108821a = false;
                                                AbstractVideoEditView abstractVideoEditView6 = this.f108417k;
                                                if (abstractVideoEditView6 == null) {
                                                    C52711k.m112237a("videoEditView");
                                                }
                                                abstractVideoEditView6.setMinVideoLength(1000);
                                                AbstractVideoEditView abstractVideoEditView7 = this.f108417k;
                                                if (abstractVideoEditView7 == null) {
                                                    C52711k.m112237a("videoEditView");
                                                }
                                                abstractVideoEditView7.setMaxVideoLength(10000);
                                            }
                                            if (f.f108072o) {
                                                AbstractVideoEditView abstractVideoEditView8 = this.f108417k;
                                                if (abstractVideoEditView8 == null) {
                                                    C52711k.m112237a("videoEditView");
                                                }
                                                abstractVideoEditView8.f108821a = false;
                                                AbstractVideoEditView abstractVideoEditView9 = this.f108417k;
                                                if (abstractVideoEditView9 == null) {
                                                    C52711k.m112237a("videoEditView");
                                                }
                                                abstractVideoEditView9.setMaxVideoLength(f.f108073p);
                                            }
                                            if (f.f108061d) {
                                                AbstractVideoEditView abstractVideoEditView10 = this.f108417k;
                                                if (abstractVideoEditView10 == null) {
                                                    C52711k.m112237a("videoEditView");
                                                }
                                                abstractVideoEditView10.f108821a = false;
                                                AbstractVideoEditView abstractVideoEditView11 = this.f108417k;
                                                if (abstractVideoEditView11 == null) {
                                                    C52711k.m112237a("videoEditView");
                                                }
                                                abstractVideoEditView11.setMinVideoLength(1000);
                                                AbstractVideoEditView abstractVideoEditView12 = this.f108417k;
                                                if (abstractVideoEditView12 == null) {
                                                    C52711k.m112237a("videoEditView");
                                                }
                                                abstractVideoEditView12.setMaxVideoLength(5000);
                                            }
                                            AbstractVideoEditView abstractVideoEditView13 = this.f108417k;
                                            if (abstractVideoEditView13 == null) {
                                                C52711k.m112237a("videoEditView");
                                            }
                                            abstractVideoEditView13.setExtractFramesInRoughMode(true);
                                            if (!TextUtils.isEmpty(charSequence)) {
                                                AbstractVideoEditView abstractVideoEditView14 = this.f108417k;
                                                if (abstractVideoEditView14 == null) {
                                                    C52711k.m112237a("videoEditView");
                                                }
                                                Activity activity9 = this.f33840g_;
                                                if (activity9 != null) {
                                                    FragmentActivity fragmentActivity = (FragmentActivity) activity9;
                                                    CutMultiVideoViewModel cutMultiVideoViewModel = this.f108431z;
                                                    if (cutMultiVideoViewModel == null) {
                                                        C52711k.m112237a("cutMultiVideoViewModel");
                                                    }
                                                    z = abstractVideoEditView14.mo87551a(fragmentActivity, cutMultiVideoViewModel, str);
                                                } else {
                                                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                                }
                                            } else {
                                                AbstractVideoEditView abstractVideoEditView15 = this.f108417k;
                                                if (abstractVideoEditView15 == null) {
                                                    C52711k.m112237a("videoEditView");
                                                }
                                                Activity activity10 = this.f33840g_;
                                                if (activity10 != null) {
                                                    FragmentActivity fragmentActivity2 = (FragmentActivity) activity10;
                                                    CutMultiVideoViewModel cutMultiVideoViewModel2 = this.f108431z;
                                                    if (cutMultiVideoViewModel2 == null) {
                                                        C52711k.m112237a("cutMultiVideoViewModel");
                                                    }
                                                    z = abstractVideoEditView15.mo87552a(fragmentActivity2, cutMultiVideoViewModel2, (List<MediaModel>) arrayList);
                                                } else {
                                                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                                }
                                            }
                                            if (!z) {
                                                CutVideoViewModel cutVideoViewModel2 = this.f108425s;
                                                if (cutVideoViewModel2 == null) {
                                                    C52711k.m112237a("cutVideoViewModel");
                                                }
                                                cutVideoViewModel2.mo87176e();
                                            } else {
                                                CutVideoEditViewModel cutVideoEditViewModel = this.f108426t;
                                                if (cutVideoEditViewModel == null) {
                                                    C52711k.m112237a("cutVideoEditViewModel");
                                                }
                                                AbstractVideoEditView abstractVideoEditView16 = this.f108417k;
                                                if (abstractVideoEditView16 == null) {
                                                    C52711k.m112237a("videoEditView");
                                                }
                                                cutVideoEditViewModel.f107992e = abstractVideoEditView16.getEditState();
                                                CutVideoViewModel cutVideoViewModel3 = this.f108425s;
                                                if (cutVideoViewModel3 == null) {
                                                    C52711k.m112237a("cutVideoViewModel");
                                                }
                                                if (!cutVideoViewModel3.mo87178g()) {
                                                    VideoEditViewModel videoEditViewModel = this.f108422p;
                                                    if (videoEditViewModel == null) {
                                                        C52711k.m112237a("videoEditViewModel");
                                                    }
                                                    if (videoEditViewModel.mo87637o()) {
                                                        CutVideoViewModel cutVideoViewModel4 = this.f108425s;
                                                        if (cutVideoViewModel4 == null) {
                                                            C52711k.m112237a("cutVideoViewModel");
                                                        }
                                                        if (cutVideoViewModel4.mo87177f().f108072o) {
                                                            C43047h.f108663c = "prop_customized_video";
                                                        }
                                                        CutVideoViewModel cutVideoViewModel5 = this.f108425s;
                                                        if (cutVideoViewModel5 == null) {
                                                            C52711k.m112237a("cutVideoViewModel");
                                                        }
                                                        if (!cutVideoViewModel5.mo87177f().f108061d) {
                                                            C43047h hVar = C43047h.f108667g;
                                                            VideoEditViewModel videoEditViewModel2 = this.f108422p;
                                                            if (videoEditViewModel2 == null) {
                                                                C52711k.m112237a("videoEditViewModel");
                                                            }
                                                            hVar.mo87427b(videoEditViewModel2.mo87634l());
                                                        }
                                                    } else {
                                                        CutVideoViewModel cutVideoViewModel6 = this.f108425s;
                                                        if (cutVideoViewModel6 == null) {
                                                            C52711k.m112237a("cutVideoViewModel");
                                                        }
                                                        cutVideoViewModel6.mo87176e();
                                                    }
                                                }
                                                this.f108430x = f.f108074q;
                                                this.f108429w = f.f108071n;
                                            }
                                        } else {
                                            CutVideoViewModel cutVideoViewModel7 = this.f108425s;
                                            if (cutVideoViewModel7 == null) {
                                                C52711k.m112237a("cutVideoViewModel");
                                            }
                                            cutVideoViewModel7.mo87176e();
                                        }
                                        if (this.f108413A && C43457b.m95264b()) {
                                            View j_3 = mo24467j_(R.id.euq);
                                            C52711k.m112236a((Object) j_3, "requireViewById(R.id.self_adaption_toast)");
                                            this.f108418l = (TextView) j_3;
                                            View j_4 = mo24467j_(R.id.dxh);
                                            C52711k.m112236a((Object) j_4, "requireViewById(R.id.adaption_toast_layout)");
                                            this.f108419m = (FrameLayout) j_4;
                                            CutVideoViewModel cutVideoViewModel8 = this.f108425s;
                                            if (cutVideoViewModel8 == null) {
                                                C52711k.m112237a("cutVideoViewModel");
                                            }
                                            if (!cutVideoViewModel8.mo87178g()) {
                                                Drawable a9 = C42430at.m93196a(0, 1459617792, 0, C23728o.m58241a(2.0d));
                                                TextView textView = this.f108418l;
                                                if (textView == null) {
                                                    C52711k.m112237a("selfAdaptionToast");
                                                }
                                                textView.setBackground(a9);
                                            }
                                            AbstractVideoEditView abstractVideoEditView17 = this.f108417k;
                                            if (abstractVideoEditView17 == null) {
                                                C52711k.m112237a("videoEditView");
                                            }
                                            if (abstractVideoEditView17 != null) {
                                                ((VEVideoEditViewV2) abstractVideoEditView17).setSelfAdaptiontoastAnimListener(new C42929v(this));
                                                return;
                                            }
                                            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEVideoEditViewV2");
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
    public final VECutVideoPresenter mo87344F() {
        VECutVideoPresenter vECutVideoPresenter = this.f108416j;
        if (vECutVideoPresenter == null) {
            C52711k.m112237a("presenter");
        }
        return vECutVideoPresenter;
    }

    /* renamed from: G */
    public final AbstractVideoEditView mo87345G() {
        AbstractVideoEditView abstractVideoEditView = this.f108417k;
        if (abstractVideoEditView == null) {
            C52711k.m112237a("videoEditView");
        }
        return abstractVideoEditView;
    }

    /* renamed from: H */
    public final void mo87346H() {
        if (C39629l.m88232a().mo58583n().mo83103a(C40790a.VEExtractFramesAfterRender)) {
            AbstractVideoEditView abstractVideoEditView = this.f108417k;
            if (abstractVideoEditView == null) {
                C52711k.m112237a("videoEditView");
            }
            abstractVideoEditView.setLoadThumbnailDirectly(true);
            AbstractVideoEditView abstractVideoEditView2 = this.f108417k;
            if (abstractVideoEditView2 == null) {
                C52711k.m112237a("videoEditView");
            }
            abstractVideoEditView2.mo87538a();
        }
    }

    /* renamed from: a */
    public final void mo87347a(VECutVideoPresenter vECutVideoPresenter) {
        C52711k.m112240b(vECutVideoPresenter, "<set-?>");
        this.f108416j = vECutVideoPresenter;
    }

    /* renamed from: a */
    public static final /* synthetic */ CutVideoEditViewModel m94123a(C42907m mVar) {
        CutVideoEditViewModel cutVideoEditViewModel = mVar.f108426t;
        if (cutVideoEditViewModel == null) {
            C52711k.m112237a("cutVideoEditViewModel");
        }
        return cutVideoEditViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ VEVideoCutterViewModel m94124b(C42907m mVar) {
        VEVideoCutterViewModel vEVideoCutterViewModel = mVar.f108423q;
        if (vEVideoCutterViewModel == null) {
            C52711k.m112237a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ CutVideoBottomBarViewModel m94125c(C42907m mVar) {
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = mVar.f108424r;
        if (cutVideoBottomBarViewModel == null) {
            C52711k.m112237a("bottomBarViewModel");
        }
        return cutVideoBottomBarViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ VideoEditViewModel m94126d(C42907m mVar) {
        VideoEditViewModel videoEditViewModel = mVar.f108422p;
        if (videoEditViewModel == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ CutVideoListViewModel m94127e(C42907m mVar) {
        CutVideoListViewModel cutVideoListViewModel = mVar.f108427u;
        if (cutVideoListViewModel == null) {
            C52711k.m112237a("cutVideoListViewModel");
        }
        return cutVideoListViewModel;
    }

    /* renamed from: f */
    public static final /* synthetic */ View m94128f(C42907m mVar) {
        View view = mVar.f108420n;
        if (view == null) {
            C52711k.m112237a("slideHintView");
        }
        return view;
    }

    /* renamed from: g */
    public static final /* synthetic */ TextView m94129g(C42907m mVar) {
        TextView textView = mVar.f108418l;
        if (textView == null) {
            C52711k.m112237a("selfAdaptionToast");
        }
        return textView;
    }

    /* renamed from: h */
    public static final /* synthetic */ CutVideoSpeedViewModel m94130h(C42907m mVar) {
        CutVideoSpeedViewModel cutVideoSpeedViewModel = mVar.f108428v;
        if (cutVideoSpeedViewModel == null) {
            C52711k.m112237a("speedViewModel");
        }
        return cutVideoSpeedViewModel;
    }

    /* renamed from: i */
    public static final /* synthetic */ FrameLayout m94131i(C42907m mVar) {
        FrameLayout frameLayout = mVar.f108419m;
        if (frameLayout == null) {
            C52711k.m112237a("selfAdaptionToastLayout");
        }
        return frameLayout;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        VideoEditViewModel videoEditViewModel = this.f108422p;
        if (videoEditViewModel == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        C0184k kVar = this;
        videoEditViewModel.f108907b.observe(kVar, new C42909b(this));
        VideoEditViewModel videoEditViewModel2 = this.f108422p;
        if (videoEditViewModel2 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        videoEditViewModel2.f108908c.observe(kVar, new C42917j(this));
        VideoEditViewModel videoEditViewModel3 = this.f108422p;
        if (videoEditViewModel3 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        videoEditViewModel3.f108910e.observe(kVar, new C42922o(this));
        VideoEditViewModel videoEditViewModel4 = this.f108422p;
        if (videoEditViewModel4 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        videoEditViewModel4.f108909d.observe(kVar, new C42923p(this));
        VideoEditViewModel videoEditViewModel5 = this.f108422p;
        if (videoEditViewModel5 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        videoEditViewModel5.f108912g.observe(kVar, new C42924q(this));
        VideoEditViewModel videoEditViewModel6 = this.f108422p;
        if (videoEditViewModel6 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        videoEditViewModel6.f108911f.observe(kVar, new C42925r(this));
        VideoEditViewModel videoEditViewModel7 = this.f108422p;
        if (videoEditViewModel7 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        videoEditViewModel7.f108913h.observe(kVar, new C42926s(this));
        VideoEditViewModel videoEditViewModel8 = this.f108422p;
        if (videoEditViewModel8 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        videoEditViewModel8.f108916k.observe(kVar, new C42927t(this));
        VideoEditViewModel videoEditViewModel9 = this.f108422p;
        if (videoEditViewModel9 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        videoEditViewModel9.f108925t.observe(kVar, new C42928u(this));
        VideoEditViewModel videoEditViewModel10 = this.f108422p;
        if (videoEditViewModel10 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        videoEditViewModel10.f108917l.observe(kVar, new C42910c(this));
        VideoEditViewModel videoEditViewModel11 = this.f108422p;
        if (videoEditViewModel11 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        videoEditViewModel11.f108918m.observe(kVar, new C42911d(this));
        VideoEditViewModel videoEditViewModel12 = this.f108422p;
        if (videoEditViewModel12 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        videoEditViewModel12.f108919n.observe(kVar, new C42912e(this));
        VideoEditViewModel videoEditViewModel13 = this.f108422p;
        if (videoEditViewModel13 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        videoEditViewModel13.f108914i.observe(kVar, new C42913f(this));
        VideoEditViewModel videoEditViewModel14 = this.f108422p;
        if (videoEditViewModel14 == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        videoEditViewModel14.f108915j.observe(kVar, new C42914g(this));
        CutVideoEditViewModel cutVideoEditViewModel = this.f108426t;
        if (cutVideoEditViewModel == null) {
            C52711k.m112237a("cutVideoEditViewModel");
        }
        mo49444c(cutVideoEditViewModel, C42932n.f108455a, new C11934u(), new C42915h(this));
        CutVideoEditViewModel cutVideoEditViewModel2 = this.f108426t;
        if (cutVideoEditViewModel2 == null) {
            C52711k.m112237a("cutVideoEditViewModel");
        }
        mo49443b(cutVideoEditViewModel2, C42933o.f108456a, new C11934u(), new C42916i(this));
        CutVideoEditViewModel cutVideoEditViewModel3 = this.f108426t;
        if (cutVideoEditViewModel3 == null) {
            C52711k.m112237a("cutVideoEditViewModel");
        }
        mo49444c(cutVideoEditViewModel3, C42934p.f108457a, new C11934u(), new C42918k(this));
        CutVideoEditViewModel cutVideoEditViewModel4 = this.f108426t;
        if (cutVideoEditViewModel4 == null) {
            C52711k.m112237a("cutVideoEditViewModel");
        }
        mo49444c(cutVideoEditViewModel4, C42935q.f108458a, new C11934u(), new C42919l(this));
        CutVideoEditViewModel cutVideoEditViewModel5 = this.f108426t;
        if (cutVideoEditViewModel5 == null) {
            C52711k.m112237a("cutVideoEditViewModel");
        }
        mo49443b(cutVideoEditViewModel5, C42936r.f108459a, new C11934u(), new C42920m(this));
        CutVideoEditViewModel cutVideoEditViewModel6 = this.f108426t;
        if (cutVideoEditViewModel6 == null) {
            C52711k.m112237a("cutVideoEditViewModel");
        }
        cutVideoEditViewModel6.mo87042f().observe(kVar, new C42921n(this));
    }

    public C42907m(boolean z, boolean z2) {
        this.f108413A = z;
        this.f108414B = z2;
        this.f108421o = new C43168a(3, 0, C50743d.EDITOR_SEEK_FLAG_OnGoing);
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        if (!this.f108413A || !C43457b.m95264b()) {
            View inflate = layoutInflater.inflate(R.layout.bqs, viewGroup, false);
            C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…o_edit, container, false)");
            return inflate;
        }
        View inflate2 = layoutInflater.inflate(R.layout.bqt, viewGroup, false);
        C52711k.m112236a((Object) inflate2, "inflater.inflate(R.layou…o_just, container, false)");
        return inflate2;
    }

    public /* synthetic */ C42907m(boolean z, boolean z2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        this(z, z2);
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
