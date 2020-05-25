package com.bytedance.android.live.broadcast.preview;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.constraint.ConstraintLayout;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.android.live.broadcast.C3617q;
import com.bytedance.android.live.broadcast.model.C3458e;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.broadcast.utils.C3637e.C3638a;
import com.bytedance.android.live.broadcast.widget.PreviewBeautyWidget;
import com.bytedance.android.live.broadcast.widget.PreviewBroadcastHelpWidget;
import com.bytedance.android.live.broadcast.widget.PreviewCloseWidget;
import com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget;
import com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget;
import com.bytedance.android.live.broadcast.widget.PreviewDouPlusWidget;
import com.bytedance.android.live.broadcast.widget.PreviewLocationWidget;
import com.bytedance.android.live.broadcast.widget.PreviewReverseCameraWidget;
import com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget;
import com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget.C3701f;
import com.bytedance.android.live.broadcast.widget.SelectLiveTypeWidget;
import com.bytedance.android.live.broadcast.widget.StartLiveWidget;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p272ad.C4526c;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.widget.C8548h;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8681d;
import com.bytedance.android.livesdkapi.host.IHostPlugin.C8768a;
import com.bytedance.android.livesdkapi.p456j.C8828a;
import com.bytedance.common.utility.C9425l;
import com.bytedance.common.utility.C9425l.C9426a;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.android.live.broadcast.preview.f */
public final class C3561f extends C3846a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f10136a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3561f.class), "mCommodityMarginTopVideo", "getMCommodityMarginTopVideo()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3561f.class), "mCommodityMarginTopGame", "getMCommodityMarginTopGame()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3561f.class), "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3561f.class), "eventViewModel", "getEventViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveEventViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3561f.class), "broadcastHelpWidget", "getBroadcastHelpWidget()Lcom/bytedance/android/live/broadcast/widget/PreviewBroadcastHelpWidget;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3561f.class), "previewBeautyWidget", "getPreviewBeautyWidget()Lcom/bytedance/android/live/broadcast/widget/PreviewBeautyWidget;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3561f.class), "previewCoverPickerWidget", "getPreviewCoverPickerWidget()Lcom/bytedance/android/live/broadcast/widget/PreviewCoverPickerWidget;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3561f.class), "previewSelectTitleWidget", "getPreviewSelectTitleWidget()Lcom/bytedance/android/live/broadcast/widget/PreviewSelectTitleWidget;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3561f.class), "previewLocationWidget", "getPreviewLocationWidget()Lcom/bytedance/android/live/broadcast/widget/PreviewLocationWidget;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3561f.class), "previewDouPlusWidget", "getPreviewDouPlusWidget()Lcom/bytedance/android/live/broadcast/widget/PreviewDouPlusWidget;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3561f.class), "previewCloseWidget", "getPreviewCloseWidget()Lcom/bytedance/android/live/broadcast/widget/PreviewCloseWidget;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3561f.class), "previewReverseCameraWidget", "getPreviewReverseCameraWidget()Lcom/bytedance/android/live/broadcast/widget/PreviewReverseCameraWidget;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3561f.class), "selectLiveTypeWidget", "getSelectLiveTypeWidget()Lcom/bytedance/android/live/broadcast/widget/SelectLiveTypeWidget;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3561f.class), "startLiveWidget", "getStartLiveWidget()Lcom/bytedance/android/live/broadcast/widget/StartLiveWidget;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3561f.class), "previewCommodityWidget", "getPreviewCommodityWidget()Lcom/bytedance/android/live/broadcast/widget/PreviewCommodityWidget;"))};

    /* renamed from: i */
    public static final C3562a f10137i = new C3562a(null);

    /* renamed from: b */
    public C8681d f10138b;

    /* renamed from: c */
    View f10139c;

    /* renamed from: d */
    public final Handler f10140d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public int f10141e;

    /* renamed from: f */
    public C8548h f10142f;

    /* renamed from: g */
    final C52668f f10143g = C52732g.m112285a(C3569f.f10167a);

    /* renamed from: h */
    final C52668f f10144h = C52732g.m112285a(C3568e.f10166a);

    /* renamed from: j */
    private WidgetManager f10145j;

    /* renamed from: k */
    private C1690c f10146k;

    /* renamed from: l */
    private final C52668f f10147l = C52732g.m112285a(new C3585v(this));

    /* renamed from: m */
    private final C52668f f10148m = C52732g.m112285a(new C3564c(this));

    /* renamed from: n */
    private final C52668f f10149n = C52732g.m112285a(C3563b.f10161a);

    /* renamed from: o */
    private final C52668f f10150o = C52732g.m112285a(C3576m.f10174a);

    /* renamed from: p */
    private final C52668f f10151p = C52732g.m112285a(C3579p.f10177a);

    /* renamed from: q */
    private final C52668f f10152q = C52732g.m112285a(C3583t.f10181a);

    /* renamed from: r */
    private final C52668f f10153r = C52732g.m112285a(C3581r.f10179a);

    /* renamed from: s */
    private final C52668f f10154s = C52732g.m112285a(C3580q.f10178a);

    /* renamed from: t */
    private final C52668f f10155t = C52732g.m112285a(C3577n.f10175a);

    /* renamed from: u */
    private final C52668f f10156u = C52732g.m112285a(C3582s.f10180a);

    /* renamed from: v */
    private final C52668f f10157v = C52732g.m112285a(C3584u.f10182a);

    /* renamed from: w */
    private final C52668f f10158w = C52732g.m112285a(new C3586w(this));

    /* renamed from: x */
    private final C52668f f10159x = C52732g.m112285a(C3578o.f10176a);

    /* renamed from: y */
    private HashMap f10160y;

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$a */
    public static final class C3562a {
        private C3562a() {
        }

        public /* synthetic */ C3562a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$b */
    static final class C3563b extends C52712l implements C52670a<PreviewBroadcastHelpWidget> {

        /* renamed from: a */
        public static final C3563b f10161a = new C3563b();

        C3563b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new PreviewBroadcastHelpWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$c */
    static final class C3564c extends C52712l implements C52670a<StartLiveEventViewModel> {

        /* renamed from: a */
        final /* synthetic */ C3561f f10162a;

        C3564c(C3561f fVar) {
            this.f10162a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f10162a.getContext();
            if (context != null) {
                return (StartLiveEventViewModel) C0214z.m440a((FragmentActivity) context).mo359a(StartLiveEventViewModel.class);
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$d */
    public static final class C3565d implements C8768a {

        /* renamed from: a */
        final /* synthetic */ C3561f f10163a;

        /* renamed from: com.bytedance.android.live.broadcast.preview.f$d$a */
        static final class C3566a implements OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ C3565d f10164a;

            C3566a(C3565d dVar) {
                this.f10164a = dVar;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                if (!C3617q.INST.isLoadedRes()) {
                    if (this.f10164a.f10163a.f10138b != null) {
                        C8681d dVar = this.f10164a.f10163a.f10138b;
                        if (dVar != null) {
                            dVar.mo8942a();
                        }
                    } else if (this.f10164a.f10163a.getActivity() != null) {
                        FragmentActivity activity = this.f10164a.f10163a.getActivity();
                        if (activity == null) {
                            C52711k.m112234a();
                        }
                        activity.finish();
                    }
                }
            }
        }

        /* renamed from: com.bytedance.android.live.broadcast.preview.f$d$b */
        static final class C3567b<T> implements C0199s<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C3565d f10165a;

            C3567b(C3565d dVar) {
                this.f10165a = dVar;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                Boolean bool = (Boolean) obj;
                if (bool == null || !bool.booleanValue()) {
                    if (this.f10165a.f10163a.f10141e > 3) {
                        if (this.f10165a.f10163a.mo8452l()) {
                            C4575an.m10981a((int) R.string.esy);
                        }
                        C8548h hVar = this.f10165a.f10163a.f10142f;
                        if (hVar != null && hVar.isShowing()) {
                            C8548h hVar2 = this.f10165a.f10163a.f10142f;
                            if (hVar2 != null) {
                                hVar2.dismiss();
                            } else {
                                return;
                            }
                        }
                    } else {
                        C3617q.INST.loadResources();
                        this.f10165a.f10163a.f10141e++;
                    }
                    return;
                }
                C8548h hVar3 = this.f10165a.f10163a.f10142f;
                if (hVar3 != null && hVar3.isShowing()) {
                    C8548h hVar4 = this.f10165a.f10163a.f10142f;
                    if (hVar4 != null) {
                        hVar4.dismiss();
                    }
                }
                this.f10165a.f10163a.mo8957b();
            }
        }

        public C3565d(C3561f fVar) {
            this.f10163a = fVar;
        }

        /* renamed from: a */
        public final void mo8214a(String str) {
            C52711k.m112240b(str, "packageName");
            if (!C3588h.m9397a(this.f10163a.getContext())) {
                C4204a.m10421a(this.f10163a.getContext(), (int) R.string.e79);
            } else if (C9425l.m18652c(this.f10163a.getContext()) == C9426a.MOBILE_2G) {
                C4204a.m10421a(this.f10163a.getContext(), (int) R.string.ex9);
            } else {
                C8828a.LiveResource.preload();
                C8828a.LiveResource.load(this.f10163a.getContext(), true);
                if (this.f10163a.getContext() != null && !C3617q.INST.isLoadedRes()) {
                    C8828a.LiveResource.preload();
                    if (this.f10163a.f10142f == null) {
                        this.f10163a.f10142f = new C8552a(this.f10163a.getContext(), 2).mo15005b((OnDismissListener) new C3566a(this)).mo15011d();
                    }
                    C3617q.INST.isLoadedRes.observe(this.f10163a, new C3567b(this));
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$e */
    static final class C3568e extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C3568e f10166a = new C3568e();

        C3568e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(C3922z.m9899a(104.0f));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$f */
    static final class C3569f extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C3569f f10167a = new C3569f();

        C3569f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(C3922z.m9899a(181.0f));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$g */
    static final class C3570g<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C3561f f10168a;

        C3570g(C3561f fVar) {
            this.f10168a = fVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            C3561f fVar = this.f10168a;
            if (num == null) {
                num = Integer.valueOf(0);
            }
            switch (num.intValue()) {
                case 0:
                    FrameLayout frameLayout = (FrameLayout) fVar.mo8955a(R.id.eqr);
                    C52711k.m112236a((Object) frameLayout, "preview_room_info_container");
                    frameLayout.setVisibility(0);
                    FrameLayout frameLayout2 = (FrameLayout) fVar.mo8955a(R.id.ewt);
                    C52711k.m112236a((Object) frameLayout2, "start_live_container");
                    frameLayout2.setVisibility(0);
                    FrameLayout frameLayout3 = (FrameLayout) fVar.mo8955a(R.id.euo);
                    C52711k.m112236a((Object) frameLayout3, "select_live_type_container");
                    frameLayout3.setVisibility(0);
                    return;
                case 1:
                    return;
                case 2:
                    FrameLayout frameLayout4 = (FrameLayout) fVar.mo8955a(R.id.eqr);
                    C52711k.m112236a((Object) frameLayout4, "preview_room_info_container");
                    frameLayout4.setVisibility(4);
                    FrameLayout frameLayout5 = (FrameLayout) fVar.mo8955a(R.id.ewt);
                    C52711k.m112236a((Object) frameLayout5, "start_live_container");
                    frameLayout5.setVisibility(4);
                    FrameLayout frameLayout6 = (FrameLayout) fVar.mo8955a(R.id.euo);
                    C52711k.m112236a((Object) frameLayout6, "select_live_type_container");
                    frameLayout6.setVisibility(4);
                    break;
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$h */
    static final class C3571h<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C3561f f10169a;

        C3571h(C3561f fVar) {
            this.f10169a = fVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            C8681d dVar = this.f10169a.f10138b;
            if (dVar != null) {
                dVar.mo8942a();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$i */
    static final class C3572i<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C3561f f10170a;

        C3572i(C3561f fVar) {
            this.f10170a = fVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                C8681d dVar = this.f10170a.f10138b;
                if (dVar != null) {
                    C52711k.m112236a((Object) num, "it");
                    dVar.mo8944a(num.intValue());
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$j */
    static final class C3573j<T> implements C0199s<C8710m> {

        /* renamed from: a */
        final /* synthetic */ C3561f f10171a;

        C3573j(C3561f fVar) {
            this.f10171a = fVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            C8710m mVar = (C8710m) obj;
            C3561f fVar = this.f10171a;
            View view = fVar.f10139c;
            boolean z2 = true;
            if (view != null) {
                if (mVar != C8710m.VIDEO) {
                    z = true;
                } else {
                    z = false;
                }
                view.setClickable(z);
            }
            C8681d dVar = fVar.f10138b;
            if (dVar != null) {
                if (mVar == C8710m.VIDEO) {
                    z2 = false;
                }
                dVar.mo8945a(z2);
            }
            FrameLayout frameLayout = (FrameLayout) fVar.mo8955a(R.id.e3d);
            C52711k.m112236a((Object) frameLayout, "commodity_container");
            LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                if (mVar == C8710m.VIDEO) {
                    FrameLayout frameLayout2 = (FrameLayout) fVar.mo8955a(R.id.es_);
                    C52711k.m112236a((Object) frameLayout2, "reverse_camera_container");
                    frameLayout2.setVisibility(0);
                    FrameLayout frameLayout3 = (FrameLayout) fVar.mo8955a(R.id.dz0);
                    C52711k.m112236a((Object) frameLayout3, "beauty_container");
                    frameLayout3.setVisibility(0);
                    FrameLayout frameLayout4 = (FrameLayout) fVar.mo8955a(R.id.e04);
                    C52711k.m112236a((Object) frameLayout4, "broadcast_help_container");
                    frameLayout4.setVisibility(4);
                    layoutParams2.topMargin = ((Number) fVar.f10143g.getValue()).intValue();
                } else if (mVar == C8710m.THIRD_PARTY) {
                    FrameLayout frameLayout5 = (FrameLayout) fVar.mo8955a(R.id.es_);
                    C52711k.m112236a((Object) frameLayout5, "reverse_camera_container");
                    frameLayout5.setVisibility(4);
                    FrameLayout frameLayout6 = (FrameLayout) fVar.mo8955a(R.id.dz0);
                    C52711k.m112236a((Object) frameLayout6, "beauty_container");
                    frameLayout6.setVisibility(4);
                    FrameLayout frameLayout7 = (FrameLayout) fVar.mo8955a(R.id.e04);
                    C52711k.m112236a((Object) frameLayout7, "broadcast_help_container");
                    frameLayout7.setVisibility(0);
                    layoutParams2.topMargin = ((Number) fVar.f10144h.getValue()).intValue();
                }
                FrameLayout frameLayout8 = (FrameLayout) fVar.mo8955a(R.id.e3d);
                C52711k.m112236a((Object) frameLayout8, "commodity_container");
                frameLayout8.setLayoutParams(layoutParams2);
                Map hashMap = new HashMap();
                String str = "live_type";
                if (mVar == null) {
                    C52711k.m112234a();
                }
                hashMap.put(str, C3638a.m9476a(mVar));
                C8049c.m15979a().mo14202a("livesdk_pm_live_takepage_show", hashMap, new Object[0]);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$k */
    static final class C3574k<T> implements C1710e<C4177d<C3458e>> {

        /* renamed from: a */
        final /* synthetic */ C3561f f10172a;

        C3574k(C3561f fVar) {
            this.f10172a = fVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C4177d dVar = (C4177d) obj;
            C3561f fVar = this.f10172a;
            if (dVar != null) {
                fVar.mo8956a().mo8873a().postValue(dVar.data);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$l */
    static final class C3575l<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C3575l f10173a = new C3575l();

        C3575l() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C52711k.m112236a((Object) th, "throwable");
            C3831a.m9706a(6, "StartLiveFragment", th.getStackTrace());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$m */
    static final class C3576m extends C52712l implements C52670a<PreviewBeautyWidget> {

        /* renamed from: a */
        public static final C3576m f10174a = new C3576m();

        C3576m() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new PreviewBeautyWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$n */
    static final class C3577n extends C52712l implements C52670a<PreviewCloseWidget> {

        /* renamed from: a */
        public static final C3577n f10175a = new C3577n();

        C3577n() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new PreviewCloseWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$o */
    static final class C3578o extends C52712l implements C52670a<PreviewCommodityWidget> {

        /* renamed from: a */
        public static final C3578o f10176a = new C3578o();

        C3578o() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new PreviewCommodityWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$p */
    static final class C3579p extends C52712l implements C52670a<PreviewCoverPickerWidget> {

        /* renamed from: a */
        public static final C3579p f10177a = new C3579p();

        C3579p() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new PreviewCoverPickerWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$q */
    static final class C3580q extends C52712l implements C52670a<PreviewDouPlusWidget> {

        /* renamed from: a */
        public static final C3580q f10178a = new C3580q();

        C3580q() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new PreviewDouPlusWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$r */
    static final class C3581r extends C52712l implements C52670a<PreviewLocationWidget> {

        /* renamed from: a */
        public static final C3581r f10179a = new C3581r();

        C3581r() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new PreviewLocationWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$s */
    static final class C3582s extends C52712l implements C52670a<PreviewReverseCameraWidget> {

        /* renamed from: a */
        public static final C3582s f10180a = new C3582s();

        C3582s() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new PreviewReverseCameraWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$t */
    static final class C3583t extends C52712l implements C52670a<PreviewSelectTitleWidget> {

        /* renamed from: a */
        public static final C3583t f10181a = new C3583t();

        C3583t() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new PreviewSelectTitleWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$u */
    static final class C3584u extends C52712l implements C52670a<SelectLiveTypeWidget> {

        /* renamed from: a */
        public static final C3584u f10182a = new C3584u();

        C3584u() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new SelectLiveTypeWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$v */
    static final class C3585v extends C52712l implements C52670a<StartLiveViewModel> {

        /* renamed from: a */
        final /* synthetic */ C3561f f10183a;

        C3585v(C3561f fVar) {
            this.f10183a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f10183a.getContext();
            if (context != null) {
                return (StartLiveViewModel) C0214z.m440a((FragmentActivity) context).mo359a(StartLiveViewModel.class);
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.f$w */
    static final class C3586w extends C52712l implements C52670a<StartLiveWidget> {

        /* renamed from: a */
        final /* synthetic */ C3561f f10184a;

        C3586w(C3561f fVar) {
            this.f10184a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new StartLiveWidget(this.f10184a);
        }
    }

    /* renamed from: c */
    private final StartLiveEventViewModel m9388c() {
        return (StartLiveEventViewModel) this.f10148m.getValue();
    }

    /* renamed from: d */
    private final PreviewBeautyWidget m9389d() {
        return (PreviewBeautyWidget) this.f10150o.getValue();
    }

    /* renamed from: e */
    private final PreviewCoverPickerWidget m9390e() {
        return (PreviewCoverPickerWidget) this.f10151p.getValue();
    }

    /* renamed from: f */
    private final PreviewSelectTitleWidget m9391f() {
        return (PreviewSelectTitleWidget) this.f10152q.getValue();
    }

    /* renamed from: a */
    public final View mo8955a(int i) {
        if (this.f10160y == null) {
            this.f10160y = new HashMap();
        }
        View view = (View) this.f10160y.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f10160y.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final StartLiveViewModel mo8956a() {
        return (StartLiveViewModel) this.f10147l.getValue();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C8548h hVar = this.f10142f;
        if (hVar != null && hVar.isShowing()) {
            C8548h hVar2 = this.f10142f;
            if (hVar2 != null) {
                hVar2.dismiss();
            }
        }
        if (this.f10160y != null) {
            this.f10160y.clear();
        }
    }

    public final void onResume() {
        super.onResume();
        C4526c<Long> cVar = C4525b.f12450x;
        C52711k.m112236a((Object) cVar, "LivePluginProperties.CURRENT_PREVIEW_START_TIME");
        cVar.mo10348b(Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* renamed from: b */
    public final void mo8957b() {
        PreviewBeautyWidget d = m9389d();
        C3395f.m9156f().mo8740a().mo8270b();
        C8681d dVar = d.f10415c;
        if (dVar != null) {
            C4526c<Integer> cVar = C4525b.f12317M;
            C52711k.m112236a((Object) cVar, "LivePluginProperties.LIVE_FILTER_ID");
            Object a = cVar.mo10345a();
            C52711k.m112236a(a, "LivePluginProperties.LIVE_FILTER_ID.value");
            dVar.mo8948b(((Number) a).intValue());
        }
    }

    public final void onStop() {
        super.onStop();
        C4526c<Long> cVar = C4525b.f12450x;
        C52711k.m112236a((Object) cVar, "LivePluginProperties.CURRENT_PREVIEW_START_TIME");
        if (((Number) cVar.mo10347b()).longValue() > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C4526c<Long> cVar2 = C4525b.f12450x;
            C52711k.m112236a((Object) cVar2, "LivePluginProperties.CURRENT_PREVIEW_START_TIME");
            Object b = cVar2.mo10347b();
            C52711k.m112236a(b, "LivePluginProperties.CUR…EW_START_TIME.commonValue");
            long longValue = (elapsedRealtime - ((Number) b).longValue()) / 1000;
            if (longValue > 0) {
                Map hashMap = new HashMap();
                hashMap.put("duration", String.valueOf(longValue));
                C8049c.m15979a().mo14202a("livesdk_live_takepage_stay_duration", hashMap, new Object[0]);
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        C8681d dVar = this.f10138b;
        if (dVar != null) {
            dVar.mo8946b();
        }
        C8049c.m15979a();
        WidgetManager of = WidgetManager.m22273of((Fragment) this, view);
        C52711k.m112236a((Object) of, "WidgetManager.of(this, view)");
        this.f10145j = of;
        WidgetManager widgetManager = this.f10145j;
        if (widgetManager == null) {
            C52711k.m112237a("widgetManager");
        }
        widgetManager.load(R.id.e04, (PreviewBroadcastHelpWidget) this.f10149n.getValue());
        FrameLayout frameLayout = (FrameLayout) mo8955a(R.id.e04);
        C52711k.m112236a((Object) frameLayout, "broadcast_help_container");
        frameLayout.setVisibility(8);
        WidgetManager widgetManager2 = this.f10145j;
        if (widgetManager2 == null) {
            C52711k.m112237a("widgetManager");
        }
        widgetManager2.load(R.id.f14, m9391f());
        WidgetManager widgetManager3 = this.f10145j;
        if (widgetManager3 == null) {
            C52711k.m112237a("widgetManager");
        }
        widgetManager3.load(R.id.f10, m9390e());
        WidgetManager widgetManager4 = this.f10145j;
        if (widgetManager4 == null) {
            C52711k.m112237a("widgetManager");
        }
        widgetManager4.load(R.id.f12, (PreviewLocationWidget) this.f10153r.getValue());
        WidgetManager widgetManager5 = this.f10145j;
        if (widgetManager5 == null) {
            C52711k.m112237a("widgetManager");
        }
        widgetManager5.load(R.id.f11, (PreviewDouPlusWidget) this.f10154s.getValue());
        WidgetManager widgetManager6 = this.f10145j;
        if (widgetManager6 == null) {
            C52711k.m112237a("widgetManager");
        }
        widgetManager6.load(R.id.e2d, (PreviewCloseWidget) this.f10155t.getValue());
        WidgetManager widgetManager7 = this.f10145j;
        if (widgetManager7 == null) {
            C52711k.m112237a("widgetManager");
        }
        widgetManager7.load(R.id.es_, (PreviewReverseCameraWidget) this.f10156u.getValue());
        WidgetManager widgetManager8 = this.f10145j;
        if (widgetManager8 == null) {
            C52711k.m112237a("widgetManager");
        }
        widgetManager8.load(R.id.euo, (SelectLiveTypeWidget) this.f10157v.getValue());
        WidgetManager widgetManager9 = this.f10145j;
        if (widgetManager9 == null) {
            C52711k.m112237a("widgetManager");
        }
        widgetManager9.load(R.id.ewt, (StartLiveWidget) this.f10158w.getValue());
        WidgetManager widgetManager10 = this.f10145j;
        if (widgetManager10 == null) {
            C52711k.m112237a("widgetManager");
        }
        widgetManager10.load(R.id.dz0, m9389d());
        WidgetManager widgetManager11 = this.f10145j;
        if (widgetManager11 == null) {
            C52711k.m112237a("widgetManager");
        }
        widgetManager11.load(R.id.e3d, (PreviewCommodityWidget) this.f10159x.getValue());
        PreviewSelectTitleWidget f = m9391f();
        View view2 = this.f10139c;
        if (view2 != null) {
            view2.setOnTouchListener(new C3701f(f, view2));
        }
        PreviewCoverPickerWidget e = m9390e();
        C3846a aVar = this;
        C52711k.m112240b(aVar, "fragment");
        e.f10454b = aVar;
        if (e.isViewValid) {
            e.mo9059b();
        }
        C0184k kVar = this;
        m9388c().mo8870d().observe(kVar, new C3570g(this));
        m9388c().mo8867a().observe(kVar, new C3571h(this));
        mo8956a().mo8877e().observe(kVar, new C3572i(this));
        mo8956a().mo8876d().observe(kVar, new C3573j(this));
        this.f10146k = C3395f.m9156f().mo8742c().mo9020c().getPreviewRoomCreateInfo().mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C3574k<Object>(this), (C1710e<? super Throwable>) C3575l.f10173a);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m9390e().onActivityResult(i, i2, intent);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        this.f10139c = layoutInflater.inflate(R.layout.bwj, viewGroup, false);
        return this.f10139c;
    }
}
