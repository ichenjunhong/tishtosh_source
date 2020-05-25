package com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d;

import android.arch.lifecycle.C0199s;
import android.os.Handler;
import android.support.p030v4.p038f.C0794k;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.C42663f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel.C43112a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.C43168a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2199c.C43691c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C43744a;
import com.p683ss.android.vesdk.C50720o.C50743d;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e */
public final class C43701e {

    /* renamed from: a */
    public VEVideoCutterViewModel f110649a;

    /* renamed from: b */
    public C43699d f110650b;

    /* renamed from: c */
    public CutMultiVideoViewModel f110651c;

    /* renamed from: d */
    public VideoEditViewModel f110652d;

    /* renamed from: e */
    public C43691c f110653e;

    /* renamed from: f */
    public C43744a f110654f;

    /* renamed from: g */
    public int f110655g;

    /* renamed from: h */
    public boolean f110656h = true;

    /* renamed from: i */
    public boolean f110657i;

    /* renamed from: j */
    public final Handler f110658j = new Handler();

    /* renamed from: k */
    public final C43168a f110659k = new C43168a(3, 0, C50743d.EDITOR_SEEK_FLAG_OnGoing);

    /* renamed from: l */
    public final C43718q f110660l = new C43718q(this);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$a */
    public static final class C43702a<T> implements C0199s<C43168a> {

        /* renamed from: a */
        final /* synthetic */ C43701e f110661a;

        public C43702a(C43701e eVar) {
            this.f110661a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            C43168a aVar = (C43168a) obj;
            if (aVar != null) {
                num = Integer.valueOf(aVar.f109120c);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 1) {
                this.f110661a.f110658j.post(this.f110661a.f110660l);
                C43701e.m96008a(this.f110661a).mo89138a();
            } else if (num != null && num.intValue() == 2) {
                this.f110661a.f110658j.removeCallbacks(this.f110661a.f110660l);
                C43701e.m96008a(this.f110661a).mo89145b();
            } else {
                if (num != null && num.intValue() == 3) {
                    this.f110661a.f110658j.removeCallbacks(this.f110661a.f110660l);
                    C43701e.m96008a(this.f110661a).mo89139a(aVar.f109119b, aVar.f109118a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$b */
    public static final class C43703b<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C43701e f110662a;

        public C43703b(C43701e eVar) {
            this.f110662a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (this.f110662a.f110657i && bool != null) {
                if (!(!bool.booleanValue())) {
                    bool = null;
                }
                if (bool != null) {
                    C43701e.m96010c(this.f110662a).mo87731a(new C43168a(3, C43701e.m96011d(this.f110662a).mo89206a().getPlayingPosition(), C50743d.EDITOR_SEEK_FLAG_LastSeek));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$c */
    public static final class C43704c<T> implements C0199s<Long> {

        /* renamed from: a */
        final /* synthetic */ C43701e f110663a;

        public C43704c(C43701e eVar) {
            this.f110663a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Long l = (Long) obj;
            if (this.f110663a.f110657i && l != null) {
                C43701e.m96010c(this.f110663a).mo87731a(new C43168a(3, l.longValue(), C50743d.EDITOR_SEEK_FLAG_OnGoing));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$d */
    public static final class C43705d<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C43701e f110664a;

        public C43705d(C43701e eVar) {
            this.f110664a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            if (this.f110664a.f110657i) {
                C43701e.m96010c(this.f110664a).mo87731a(new C43168a(3, this.f110664a.mo89151b(), C50743d.EDITOR_SEEK_FLAG_OnGoing));
                C43701e.m96011d(this.f110664a).mo89224c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$e */
    public static final class C43706e<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C43701e f110665a;

        public C43706e(C43701e eVar) {
            this.f110665a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            if (this.f110665a.f110657i) {
                C43701e.m96010c(this.f110665a).mo87731a(new C43168a(3, this.f110665a.mo89152c(), C50743d.EDITOR_SEEK_FLAG_OnGoing));
                C43701e.m96011d(this.f110665a).mo89224c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$f */
    public static final class C43707f<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C43701e f110666a;

        public C43707f(C43701e eVar) {
            this.f110666a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            if (this.f110666a.f110657i) {
                C43701e.m96010c(this.f110666a).mo87731a(new C43168a(3, this.f110666a.mo89151b(), C50743d.EDITOR_SEEK_FLAG_LAST_UpdateIn));
                C43701e.m96011d(this.f110666a).mo89224c();
                C43701e.m96009b(this.f110666a).mo89122a(this.f110666a.mo89151b(), this.f110666a.mo89152c());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$g */
    public static final class C43708g<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C43701e f110667a;

        public C43708g(C43701e eVar) {
            this.f110667a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            if (this.f110667a.f110657i) {
                C43701e.m96010c(this.f110667a).mo87731a(new C43168a(3, this.f110667a.mo89152c(), C50743d.EDITOR_SEEK_FLAG_LAST_UpdateOut));
                C43701e.m96011d(this.f110667a).mo89224c();
                C43701e.m96009b(this.f110667a).mo89122a(this.f110667a.mo89151b(), this.f110667a.mo89152c());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$h */
    public static final class C43709h<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C43701e f110668a;

        public C43709h(C43701e eVar) {
            this.f110668a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            if (this.f110668a.f110657i) {
                this.f110668a.f110659k.f109119b = C43701e.m96011d(this.f110668a).mo89206a().getPlayingPosition();
                C43701e.m96010c(this.f110668a).mo87731a(this.f110668a.f110659k);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$i */
    public static final class C43710i<T> implements C0199s<C0794k<Integer, Integer>> {

        /* renamed from: a */
        final /* synthetic */ C43701e f110669a;

        public C43710i(C43701e eVar) {
            this.f110669a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C43701e.m96009b(this.f110669a).mo89123a((C0794k) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$j */
    public static final class C43711j<T> implements C0199s<C42663f> {

        /* renamed from: a */
        final /* synthetic */ C43701e f110670a;

        public C43711j(C43701e eVar) {
            this.f110670a = eVar;
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
                if (this.f110670a.f110656h) {
                    this.f110670a.f110655g = fVar.f107952c;
                    C43701e.m96010c(this.f110670a).mo87731a(new C43168a(2, false));
                }
                this.f110670a.f110656h = false;
                C43701e.m96011d(this.f110670a).mo89219a(false, 0);
                return;
            }
            if ((num == null || num.intValue() != 1) && num != null && num.intValue() == 2) {
                this.f110670a.f110656h = true;
                C43701e.m96011d(this.f110670a).mo89219a(true, fVar.f107953d);
                C43701e.m96009b(this.f110670a).mo89121a(this.f110670a.f110655g, fVar.f107953d);
                if (!C43701e.m96011d(this.f110670a).mo89223b()) {
                    C43701e.m96010c(this.f110670a).mo87731a(new C43168a(1, false));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$k */
    public static final class C43712k implements C43112a {

        /* renamed from: a */
        final /* synthetic */ C43701e f110671a;

        public C43712k(C43701e eVar) {
            this.f110671a = eVar;
        }

        /* renamed from: a */
        public final void mo87368a(VideoSegment videoSegment) {
            if (this.f110671a.f110657i) {
                C43701e.m96011d(this.f110671a).mo89215a(videoSegment);
            }
        }

        /* renamed from: b */
        public final void mo87369b(VideoSegment videoSegment) {
            if (this.f110671a.f110657i) {
                C43701e.m96011d(this.f110671a).mo89221b(videoSegment);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$l */
    public static final class C43713l<T> implements C0199s<C0794k<Integer, Integer>> {

        /* renamed from: a */
        final /* synthetic */ C43701e f110672a;

        public C43713l(C43701e eVar) {
            this.f110672a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C0794k kVar = (C0794k) obj;
            if (this.f110672a.f110657i) {
                C43701e.m96009b(this.f110672a).mo89127d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$m */
    public static final class C43714m<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C43701e f110673a;

        public C43714m(C43701e eVar) {
            this.f110673a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            if (this.f110673a.f110657i) {
                C43701e.m96009b(this.f110673a).mo89125b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$n */
    public static final class C43715n<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C43701e f110674a;

        public C43715n(C43701e eVar) {
            this.f110674a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            if (this.f110674a.f110657i) {
                C43701e.m96009b(this.f110674a).mo89126c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$o */
    public static final class C43716o<T> implements C0199s<VideoSegment> {

        /* renamed from: a */
        final /* synthetic */ C43701e f110675a;

        public C43716o(C43701e eVar) {
            this.f110675a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            VideoSegment videoSegment = (VideoSegment) obj;
            if (this.f110675a.f110657i) {
                C43701e.m96009b(this.f110675a).mo89120a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$p */
    public static final class C43717p<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C43701e f110676a;

        public C43717p(C43701e eVar) {
            this.f110676a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (this.f110676a.f110657i) {
                C43701e.m96009b(this.f110676a).mo89124a(num);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$q */
    public static final class C43718q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43701e f110677a;

        public final void run() {
            this.f110677a.mo89150a(false);
            this.f110677a.f110658j.postDelayed(this, 30);
        }

        C43718q(C43701e eVar) {
            this.f110677a = eVar;
        }
    }

    /* renamed from: a */
    public final void mo89149a() {
        this.f110658j.removeCallbacks(this.f110660l);
    }

    /* renamed from: b */
    public final long mo89151b() {
        C43744a aVar = this.f110654f;
        if (aVar == null) {
            C52711k.m112237a("viewManager");
        }
        return aVar.mo89206a().getLeftSeekingValue();
    }

    /* renamed from: c */
    public final long mo89152c() {
        C43744a aVar = this.f110654f;
        if (aVar == null) {
            C52711k.m112237a("viewManager");
        }
        return aVar.mo89206a().getRightSeekingValue();
    }

    /* renamed from: a */
    public static final /* synthetic */ C43699d m96008a(C43701e eVar) {
        C43699d dVar = eVar.f110650b;
        if (dVar == null) {
            C52711k.m112237a("editorPresenter");
        }
        return dVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ C43691c m96009b(C43701e eVar) {
        C43691c cVar = eVar.f110653e;
        if (cVar == null) {
            C52711k.m112237a("multiEditVideoObserversListener");
        }
        return cVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ VEVideoCutterViewModel m96010c(C43701e eVar) {
        VEVideoCutterViewModel vEVideoCutterViewModel = eVar.f110649a;
        if (vEVideoCutterViewModel == null) {
            C52711k.m112237a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ C43744a m96011d(C43701e eVar) {
        C43744a aVar = eVar.f110654f;
        if (aVar == null) {
            C52711k.m112237a("viewManager");
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo89150a(boolean z) {
        long j;
        C43699d dVar = this.f110650b;
        if (dVar == null) {
            C52711k.m112237a("editorPresenter");
        }
        if (dVar.f110646a == null) {
            j = 0;
        } else {
            C20347c cVar = dVar.f110646a;
            if (cVar == null) {
                C52711k.m112234a();
            }
            j = (long) cVar.mo43073l();
        }
        if (z) {
            j = 0;
        }
        if (j >= 0) {
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f110651c;
            if (cutMultiVideoViewModel == null) {
                C52711k.m112237a("cutMultiVideoViewModel");
            }
            VideoEditViewModel videoEditViewModel = this.f110652d;
            if (videoEditViewModel == null) {
                C52711k.m112237a("videoEditViewModel");
            }
            List k = videoEditViewModel.mo87633k();
            VideoEditViewModel videoEditViewModel2 = this.f110652d;
            if (videoEditViewModel2 == null) {
                C52711k.m112237a("videoEditViewModel");
            }
            cutMultiVideoViewModel.mo86798a(j, k, videoEditViewModel2.mo87635m());
        }
    }
}
