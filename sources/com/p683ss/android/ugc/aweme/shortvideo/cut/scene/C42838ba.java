package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.bytedance.scene.group.C12896b;
import com.bytedance.scene.ktx.C12931a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39538i;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43027d;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43047h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43021e;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43023g;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43024h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.C43095b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.C43096c;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48925b;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p064c.p065a.p069b.C1690c;
import p2628d.C52847n;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba */
public final class C42838ba extends C48925b implements C49548a {

    /* renamed from: t */
    public static final C42839a f108303t = new C42839a(null);

    /* renamed from: i */
    public C42820ax f108304i;

    /* renamed from: j */
    public C43095b f108305j;

    /* renamed from: k */
    public C42876bq f108306k;

    /* renamed from: l */
    public final C43027d f108307l = new C43027d();

    /* renamed from: m */
    public C42482c f108308m;

    /* renamed from: n */
    public CutVideoStickerPointMusicViewModel f108309n;

    /* renamed from: o */
    public CutVideoListViewModel f108310o;

    /* renamed from: p */
    public CutVideoMultiModeViewModel f108311p;

    /* renamed from: q */
    public C42836az f108312q;

    /* renamed from: r */
    public CutVideoTitleBarViewModel f108313r;

    /* renamed from: s */
    public CutVideoViewModel f108314s;

    /* renamed from: u */
    private CutVideoMultiBottomViewModel f108315u;

    /* renamed from: v */
    private final boolean f108316v;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba$a */
    public static final class C42839a {
        private C42839a() {
        }

        public /* synthetic */ C42839a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba$b */
    public static final class C42840b implements C42836az {

        /* renamed from: a */
        final /* synthetic */ C42838ba f108317a;

        /* renamed from: b */
        public final void mo87306b(View view) {
            C52711k.m112240b(view, "retryView");
        }

        /* renamed from: b */
        public final void mo87305b() {
            C42838ba.m93995a(this.f108317a).mo87462a();
        }

        /* renamed from: c */
        public final void mo87308c() {
            C42838ba.m93995a(this.f108317a).mo87466c();
        }

        /* renamed from: d */
        public final void mo87309d() {
            C42838ba.m93995a(this.f108317a).mo87464b();
        }

        /* renamed from: e */
        public final List<VideoSegment> mo87310e() {
            return this.f108317a.mo87312F().mo87267c();
        }

        /* renamed from: a */
        public final void mo87300a() {
            C10691a.m21533a(this.f108317a.mo24473s(), (int) R.string.cey).mo19066a();
        }

        /* renamed from: f */
        public final void mo87311f() {
            this.f108317a.mo87312F().f108277u = true;
            if (this.f108317a.mo87312F().f108259c.mo87434b()) {
                this.f108317a.mo87312F().f108276t = true;
            }
            this.f108317a.mo87312F().f108259c.mo87435c();
        }

        C42840b(C42838ba baVar) {
            this.f108317a = baVar;
        }

        /* renamed from: a */
        public final void mo87301a(int i) {
            C42838ba.m93995a(this.f108317a).mo87463a(i);
        }

        /* renamed from: b */
        public final void mo87307b(C42482c cVar) {
            this.f108317a.f108307l.mo87403a();
        }

        /* renamed from: a */
        public final void mo87303a(C42482c cVar) {
            this.f108317a.mo87312F().f108259c.mo87435c();
        }

        /* renamed from: a */
        public final void mo87302a(View view) {
            C52711k.m112240b(view, "segView");
            C43047h hVar = C43047h.f108667g;
            C26890h.m65011a("click_clip_entrance", C43047h.m94328a().f61491a);
            C42838ba.m93996b(this.f108317a).mo87072e(true);
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f108317a.f108313r;
            if (cutVideoTitleBarViewModel == null) {
                C52711k.m112237a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel.mo87174e(false);
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.f108317a.f108311p;
            if (cutVideoMultiModeViewModel == null) {
                C52711k.m112237a("videoMultiModeViewModel");
            }
            cutVideoMultiModeViewModel.mo87095b(true);
            CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = this.f108317a.f108309n;
            if (cutVideoStickerPointMusicViewModel == null) {
                C52711k.m112237a("musicViewModel");
            }
            cutVideoStickerPointMusicViewModel.mo22530c(new C42718a(true));
            C42838ba.m93996b(this.f108317a).mo87067a(true);
            C12924i iVar = this.f108317a.f33835c;
            if (iVar != null) {
                C12931a.m25973a((C12896b) iVar, "CutVideoListScene");
                C12924i iVar2 = this.f108317a.f33835c;
                if (iVar2 != null) {
                    C12931a.m25973a((C12896b) iVar2, "CutVideoBottomBarScene");
                    C12924i iVar3 = this.f108317a.f33835c;
                    if (iVar3 != null) {
                        C12931a.m25973a((C12896b) iVar3, "CutVideoEditScene");
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
                }
                throw new C52857u("null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
            }
            throw new C52857u("null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        }

        /* renamed from: a */
        public final void mo87304a(C42482c cVar, String str) {
            C52711k.m112240b(str, "musicFrom");
            if (cVar == null) {
                if (this.f108317a.mo87312F().f108276t) {
                    this.f108317a.mo87312F().f108259c.mo87437d();
                    this.f108317a.mo87312F().f108276t = false;
                }
                this.f108317a.f108307l.mo87404b();
                return;
            }
            if (this.f108317a.f108308m != null) {
                C42482c cVar2 = this.f108317a.f108308m;
                if (cVar2 == null) {
                    C52711k.m112234a();
                }
                if (!TextUtils.isEmpty(cVar2.getMusicId())) {
                    C42482c cVar3 = this.f108317a.f108308m;
                    if (cVar3 == null) {
                        C52711k.m112234a();
                    }
                    if (C52711k.m112239a((Object) cVar3.getMusicId(), (Object) cVar.getMusicId())) {
                        if (this.f108317a.mo87312F().f108276t) {
                            this.f108317a.mo87312F().f108259c.mo87437d();
                            this.f108317a.mo87312F().f108276t = false;
                        }
                        this.f108317a.f108307l.mo87404b();
                        return;
                    }
                }
            }
            CutVideoViewModel cutVideoViewModel = this.f108317a.f108314s;
            if (cutVideoViewModel == null) {
                C52711k.m112237a("cutVideoViewModel");
            }
            cutVideoViewModel.mo87177f().f108075r = str;
            C42820ax F = this.f108317a.mo87312F();
            C52711k.m112240b(str, "<set-?>");
            F.f108265i = str;
            this.f108317a.f108308m = cVar;
            this.f108317a.mo87312F().f108260d = cVar;
            this.f108317a.mo87313a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba$c */
    public static final class C42841c implements C43021e {

        /* renamed from: a */
        final /* synthetic */ C42838ba f108318a;

        C42841c(C42838ba baVar) {
            this.f108318a = baVar;
        }

        /* renamed from: a */
        public final void mo87314a(View view) {
            C52711k.m112240b(view, "segView");
            C42838ba.m93997c(this.f108318a).mo87302a(view);
        }

        /* renamed from: b */
        public final void mo87315b(View view) {
            C52711k.m112240b(view, "retryView");
            C42876bq bqVar = this.f108318a.f108306k;
            if (bqVar == null) {
                C52711k.m112237a("musicViewController");
            }
            bqVar.mo87295d();
            C42838ba.m93997c(this.f108318a).mo87306b(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba$d */
    static final class C42842d extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42838ba f108319a;

        C42842d(C42838ba baVar) {
            this.f108319a = baVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i;
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            View d = C42838ba.m93995a(this.f108319a).mo87467d();
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            d.setVisibility(i);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba$e */
    static final class C42843e<T> implements C0199s<C52847n<? extends Boolean, ? extends Float>> {

        /* renamed from: a */
        final /* synthetic */ C42838ba f108320a;

        C42843e(C42838ba baVar) {
            this.f108320a = baVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C52847n nVar = (C52847n) obj;
            if (nVar != null) {
                float dimension = this.f108320a.mo24478w().getDimension(R.dimen.l2) - this.f108320a.mo24478w().getDimension(R.dimen.mi);
                if (((Boolean) nVar.getFirst()).booleanValue()) {
                    C42838ba.m93995a(this.f108320a).mo87467d().setAlpha(1.0f - (1.0f - (((Number) nVar.getSecond()).floatValue() / dimension)));
                } else {
                    C42838ba.m93995a(this.f108320a).mo87467d().setAlpha(((Number) nVar.getSecond()).floatValue() / dimension);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba$f */
    static final class C42844f extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42838ba f108321a;

        C42844f(C42838ba baVar) {
            this.f108321a = baVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            this.f108321a.mo87313a(booleanValue);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba$g */
    static final class C42845g extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42838ba f108322a;

        C42845g(C42838ba baVar) {
            this.f108322a = baVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            if (booleanValue) {
                C42838ba.m93995a(this.f108322a).setButtonClickable(false);
            }
            C42877c.m94095a(C42838ba.m93995a(this.f108322a).mo87467d(), booleanValue, new C52671b<Boolean, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C42845g f108323a;

                {
                    this.f108323a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    C42838ba.m93995a(this.f108323a.f108322a).setButtonClickable(((Boolean) obj).booleanValue());
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba$h */
    static final class C42847h extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42838ba f108324a;

        C42847h(C42838ba baVar) {
            this.f108324a = baVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            if (booleanValue) {
                C42838ba.m93995a(this.f108324a).setButtonClickable(false);
            }
            C42877c.m94096b(C42838ba.m93995a(this.f108324a).mo87467d(), booleanValue, new C52671b<Boolean, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C42847h f108325a;

                {
                    this.f108325a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    C42838ba.m93995a(this.f108325a.f108324a).setButtonClickable(((Boolean) obj).booleanValue());
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba$i */
    static final class C42849i extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42838ba f108326a;

        C42849i(C42838ba baVar) {
            this.f108326a = baVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            if (booleanValue) {
                this.f108326a.f108307l.mo87403a();
            } else {
                this.f108326a.f108307l.mo87404b();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba$j */
    public static final class C42850j implements C43023g {

        /* renamed from: a */
        final /* synthetic */ C42838ba f108327a;

        /* renamed from: b */
        final /* synthetic */ boolean f108328b;

        /* renamed from: a */
        public final void mo87073a() {
            this.f108327a.f108307l.mo87404b();
        }

        /* renamed from: a */
        public final void mo87074a(int i) {
            this.f108327a.f108307l.mo87404b();
            if (this.f108328b) {
                this.f108327a.mo87312F().f108259c.mo87437d();
                C43024h hVar = this.f108327a.mo87312F().f108261e;
                if (hVar != null) {
                    hVar.mo87213a();
                }
            }
        }

        C42850j(C42838ba baVar, boolean z) {
            this.f108327a = baVar;
            this.f108328b = z;
        }
    }

    /* renamed from: a */
    public final void mo24463a(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.mo24463a(view, bundle);
        View j_ = mo24467j_(R.id.boy);
        if (j_ != null) {
            this.f108305j = (C43095b) j_;
            Activity v = mo24477v();
            C52711k.m112236a((Object) v, "requireActivity()");
            this.f108306k = new C42829ay(v);
            C43095b bVar = this.f108305j;
            if (bVar == null) {
                C52711k.m112237a("musicView");
            }
            C42876bq bqVar = this.f108306k;
            if (bqVar == null) {
                C52711k.m112237a("musicViewController");
            }
            C39538i c = bqVar.mo87293c();
            if (c == null) {
                C52711k.m112234a();
            }
            bVar.setRecyclerViewAdapter(c);
            C43095b bVar2 = this.f108305j;
            if (bVar2 == null) {
                C52711k.m112237a("musicView");
            }
            C42876bq bqVar2 = this.f108306k;
            if (bqVar2 == null) {
                C52711k.m112237a("musicViewController");
            }
            bVar2.setCollectMusicCallback(bqVar2.mo87290b());
            this.f108312q = new C42840b(this);
            C42876bq bqVar3 = this.f108306k;
            if (bqVar3 == null) {
                C52711k.m112237a("musicViewController");
            }
            C42836az azVar = this.f108312q;
            if (azVar == null) {
                C52711k.m112237a("listener");
            }
            bqVar3.mo87288a(azVar);
            C43095b bVar3 = this.f108305j;
            if (bVar3 == null) {
                C52711k.m112237a("musicView");
            }
            bVar3.setStickPointMusicListener(new C42841c(this));
            C42820ax axVar = this.f108304i;
            if (axVar == null) {
                C52711k.m112237a("stickPointController");
            }
            C42876bq bqVar4 = this.f108306k;
            if (bqVar4 == null) {
                C52711k.m112237a("musicViewController");
            }
            C52711k.m112240b(bqVar4, "<set-?>");
            axVar.f108257a = bqVar4;
            C43027d dVar = this.f108307l;
            Context context = this.f33840g_;
            if (context != null) {
                dVar.f108616b = (Activity) context;
                if (dVar.f108616b != null) {
                    Activity activity = dVar.f108616b;
                    if (activity == null) {
                        C52711k.m112234a();
                    }
                    dVar.f108615a = new C43096c(activity);
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.app.Activity");
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.IStickPointMusicView");
    }

    /* renamed from: a */
    public final void mo87313a(boolean z) {
        this.f108307l.mo87403a();
        C42820ax axVar = this.f108304i;
        if (axVar == null) {
            C52711k.m112237a("stickPointController");
        }
        axVar.f108259c.mo87430a(this.f108308m, 2, new C42850j(this, z));
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
    public final C42820ax mo87312F() {
        C42820ax axVar = this.f108304i;
        if (axVar == null) {
            C52711k.m112237a("stickPointController");
        }
        return axVar;
    }

    public C42838ba() {
        boolean z;
        if (!C39629l.m88232a().mo58593x().mo74282b() || !C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableStickPointCutFavoriteMusicTab)) {
            z = false;
        } else {
            z = true;
        }
        this.f108316v = z;
    }

    /* renamed from: a */
    public static final /* synthetic */ C43095b m93995a(C42838ba baVar) {
        C43095b bVar = baVar.f108305j;
        if (bVar == null) {
            C52711k.m112237a("musicView");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ CutVideoListViewModel m93996b(C42838ba baVar) {
        CutVideoListViewModel cutVideoListViewModel = baVar.f108310o;
        if (cutVideoListViewModel == null) {
            C52711k.m112237a("videoListViewModel");
        }
        return cutVideoListViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ C42836az m93997c(C42838ba baVar) {
        C42836az azVar = baVar.f108312q;
        if (azVar == null) {
            C52711k.m112237a("listener");
        }
        return azVar;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(CutVideoStickerPointMusicViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…sicViewModel::class.java)");
            this.f108309n = (CutVideoStickerPointMusicViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(CutVideoListViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…istViewModel::class.java)");
                this.f108310o = (CutVideoListViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(CutVideoMultiModeViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…odeViewModel::class.java)");
                    this.f108311p = (CutVideoMultiModeViewModel) a3;
                    Activity activity4 = this.f33840g_;
                    if (activity4 != null) {
                        JediViewModel a4 = C48927d.m105736a((FragmentActivity) activity4).mo96760a(CutVideoMultiBottomViewModel.class);
                        C52711k.m112236a((Object) a4, "JediViewModelProviders.o…tomViewModel::class.java)");
                        this.f108315u = (CutVideoMultiBottomViewModel) a4;
                        Activity activity5 = this.f33840g_;
                        if (activity5 != null) {
                            JediViewModel a5 = C48927d.m105736a((FragmentActivity) activity5).mo96760a(CutVideoTitleBarViewModel.class);
                            C52711k.m112236a((Object) a5, "JediViewModelProviders.o…BarViewModel::class.java)");
                            this.f108313r = (CutVideoTitleBarViewModel) a5;
                            Activity activity6 = this.f33840g_;
                            if (activity6 != null) {
                                JediViewModel a6 = C48927d.m105736a((FragmentActivity) activity6).mo96760a(CutVideoViewModel.class);
                                C52711k.m112236a((Object) a6, "JediViewModelProviders.o…deoViewModel::class.java)");
                                this.f108314s = (CutVideoViewModel) a6;
                                CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = this.f108309n;
                                if (cutVideoStickerPointMusicViewModel == null) {
                                    C52711k.m112237a("musicViewModel");
                                }
                                mo49444c(cutVideoStickerPointMusicViewModel, C42851bb.f108329a, new C11934u(), new C42844f(this));
                                CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel2 = this.f108309n;
                                if (cutVideoStickerPointMusicViewModel2 == null) {
                                    C52711k.m112237a("musicViewModel");
                                }
                                mo49444c(cutVideoStickerPointMusicViewModel2, C42852bc.f108330a, new C11934u(), new C42845g(this));
                                CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel3 = this.f108309n;
                                if (cutVideoStickerPointMusicViewModel3 == null) {
                                    C52711k.m112237a("musicViewModel");
                                }
                                mo49444c(cutVideoStickerPointMusicViewModel3, C42853bd.f108331a, new C11934u(), new C42847h(this));
                                CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel4 = this.f108309n;
                                if (cutVideoStickerPointMusicViewModel4 == null) {
                                    C52711k.m112237a("musicViewModel");
                                }
                                mo49444c(cutVideoStickerPointMusicViewModel4, C42854be.f108332a, new C11934u(), new C42849i(this));
                                CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel5 = this.f108309n;
                                if (cutVideoStickerPointMusicViewModel5 == null) {
                                    C52711k.m112237a("musicViewModel");
                                }
                                mo49443b(cutVideoStickerPointMusicViewModel5, C42855bf.f108333a, new C11934u(), new C42842d(this));
                                CutVideoMultiBottomViewModel cutVideoMultiBottomViewModel = this.f108315u;
                                if (cutVideoMultiBottomViewModel == null) {
                                    C52711k.m112237a("multiBottomViewModel");
                                }
                                cutVideoMultiBottomViewModel.mo87081e().observe(this, new C42843e(this));
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

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        if (this.f108316v) {
            i = R.layout.br3;
        } else {
            i = R.layout.br4;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(resId, container, false)");
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
