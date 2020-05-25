package com.bytedance.android.live.broadcast.widget;

import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.broadcast.api.p195b.C3039b;
import com.bytedance.android.live.broadcast.api.p195b.C3040c;
import com.bytedance.android.live.broadcast.api.p195b.C3046e.C3047a;
import com.bytedance.android.live.broadcast.effect.C3203b;
import com.bytedance.android.live.broadcast.effect.C3240d;
import com.bytedance.android.live.broadcast.effect.C3261l;
import com.bytedance.android.live.broadcast.effect.C3266p;
import com.bytedance.android.live.broadcast.effect.C3366v;
import com.bytedance.android.live.broadcast.effect.C3366v.C3367a;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.effect.p204a.C3198a.C3199a;
import com.bytedance.android.live.broadcast.effect.sticker.C3287f;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p272ad.C4526c;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8681d;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

public final class PreviewBeautyWidget extends LiveWidget {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f10413a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PreviewBeautyWidget.class), "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PreviewBeautyWidget.class), "eventViewModel", "getEventViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveEventViewModel;"))};

    /* renamed from: b */
    C3240d f10414b;

    /* renamed from: c */
    public C8681d f10415c;

    /* renamed from: d */
    final C3656e f10416d;

    /* renamed from: e */
    private final C52668f f10417e = C52732g.m112285a(new C3657f(this));

    /* renamed from: f */
    private final C52668f f10418f = C52732g.m112285a(new C3652a(this));

    /* renamed from: g */
    private final C3653b f10419g;

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewBeautyWidget$a */
    static final class C3652a extends C52712l implements C52670a<StartLiveEventViewModel> {

        /* renamed from: a */
        final /* synthetic */ PreviewBeautyWidget f10420a;

        C3652a(PreviewBeautyWidget previewBeautyWidget) {
            this.f10420a = previewBeautyWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f10420a.context;
            if (context != null) {
                return (StartLiveEventViewModel) C0214z.m440a((FragmentActivity) context).mo359a(StartLiveEventViewModel.class);
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewBeautyWidget$b */
    public static final class C3653b implements C3039b {

        /* renamed from: a */
        final /* synthetic */ PreviewBeautyWidget f10421a;

        /* renamed from: a */
        public final int mo8256a(boolean z) {
            return -1;
        }

        /* renamed from: a */
        public final int mo8253a() {
            C8681d dVar = this.f10421a.f10415c;
            if (dVar != null) {
                return dVar.mo8938a("");
            }
            return 0;
        }

        C3653b(PreviewBeautyWidget previewBeautyWidget) {
            this.f10421a = previewBeautyWidget;
        }

        /* renamed from: a */
        public final int mo8257a(String[] strArr) {
            C52711k.m112240b(strArr, "nodePaths");
            C8681d dVar = this.f10421a.f10415c;
            if (dVar != null) {
                return dVar.mo8940a(strArr);
            }
            return 0;
        }

        /* renamed from: a */
        public final int mo8255a(String str, boolean z) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            C8681d dVar = this.f10421a.f10415c;
            if (dVar != null) {
                return dVar.mo8938a(str);
            }
            return 0;
        }

        /* renamed from: a */
        public final int mo8258a(String[] strArr, String[] strArr2) {
            C8681d dVar = this.f10421a.f10415c;
            if (dVar != null) {
                return dVar.mo8941a(strArr, strArr2);
            }
            return 0;
        }

        /* renamed from: a */
        public final int mo8254a(String str, String str2, float f) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str2, "nodeTag");
            C8681d dVar = this.f10421a.f10415c;
            if (dVar != null) {
                return dVar.mo8939a(str, str2, f);
            }
            return 0;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewBeautyWidget$c */
    public static final class C3654c implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ PreviewBeautyWidget f10422a;

        C3654c(PreviewBeautyWidget previewBeautyWidget) {
            this.f10422a = previewBeautyWidget;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f10422a.mo9045a().mo8870d().postValue(Integer.valueOf(0));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewBeautyWidget$d */
    static final class C3655d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewBeautyWidget f10423a;

        C3655d(PreviewBeautyWidget previewBeautyWidget) {
            this.f10423a = previewBeautyWidget;
        }

        public final void onClick(View view) {
            PreviewBeautyWidget previewBeautyWidget = this.f10423a;
            C8049c.m15979a().mo14203a("takepage_beauty_icon_click", new Object[0]);
            if (!C3795u.m9651a(C3922z.m9915e())) {
                C4575an.m10981a((int) R.string.f1k);
                return;
            }
            previewBeautyWidget.mo9045a().mo8870d().postValue(Integer.valueOf(2));
            C3203b b = C3395f.m9156f().mo8741b();
            Context context = previewBeautyWidget.context;
            if (context != null) {
                previewBeautyWidget.f10414b = b.mo8550a((FragmentActivity) context, (C3199a) previewBeautyWidget.f10416d);
                C3240d dVar = previewBeautyWidget.f10414b;
                if (dVar != null) {
                    OnDismissListener cVar = new C3654c(previewBeautyWidget);
                    C52711k.m112240b(cVar, "onDismissListener");
                    dVar.f9368b = cVar;
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewBeautyWidget$e */
    public static final class C3656e implements C3199a {

        /* renamed from: a */
        final /* synthetic */ PreviewBeautyWidget f10424a;

        C3656e(PreviewBeautyWidget previewBeautyWidget) {
            this.f10424a = previewBeautyWidget;
        }

        /* renamed from: a */
        public final void mo8488a(int i) {
            C8681d dVar = this.f10424a.f10415c;
            if (dVar != null) {
                dVar.mo8948b(i);
            }
            C4526c<Integer> cVar = C4525b.f12317M;
            C52711k.m112236a((Object) cVar, "LivePluginProperties.LIVE_FILTER_ID");
            cVar.mo10346a(Integer.valueOf(i));
            if (this.f10424a.f10415c != null) {
                C3266p a = C3266p.m8943a();
                C52711k.m112236a((Object) a, "LiveFilterManager.inst()");
                float a2 = C3261l.m8929a(a.f9434b, i);
                C3266p a3 = C3266p.m8943a();
                C52711k.m112236a((Object) a3, "LiveFilterManager.inst()");
                if (!C9414h.m18630a(a3.f9434b) && i >= 0) {
                    C3266p a4 = C3266p.m8943a();
                    C52711k.m112236a((Object) a4, "LiveFilterManager.inst()");
                    if (i < a4.f9434b.size()) {
                        C3266p a5 = C3266p.m8943a();
                        C52711k.m112236a((Object) a5, "LiveFilterManager.inst()");
                        String a6 = C3287f.m9014a("beautyTag", (FilterModel) a5.f9434b.get(i));
                        C3203b b = C3395f.m9156f().mo8741b();
                        C52711k.m112236a((Object) b, "LiveInternalService.inst().liveEffectService()");
                        C8688c b2 = b.mo8551a().mo8649b(a6);
                        if (!(b2 == null || b2.f23749j == null)) {
                            C3040c a7 = C3395f.m9156f().mo8740a();
                            a7.mo8268a(C3037b.f8916d, b2);
                            Float c = a7.mo8275c(b2.f23749j.f23764b);
                            if (c == null) {
                                c = Float.valueOf(C3367a.m9122a(b2, b2.f23749j.f23763a));
                            }
                            int i2 = (int) a2;
                            if (c.floatValue() > C3367a.m9122a(b2, i2)) {
                                a7.mo8267a(b2.f23749j.f23764b, C3367a.m9122a(b2, i2));
                            }
                        }
                    }
                }
            }
            String str = "click";
            String str2 = "";
            List<FilterModel> list = C3266p.m8943a().f9434b;
            if (i < list.size()) {
                str2 = ((FilterModel) list.get(i)).getFilterId();
            }
            if (!C9431p.m18664a(str2) && !str2.equals("0")) {
                HashMap hashMap = new HashMap();
                hashMap.put("action_type", str);
                hashMap.put("filter_id", str2);
                C8049c.m15979a().mo14202a("live_take_filter_select", hashMap, new C8059j().mo14214b("live_take").mo14218f("click").mo14213a("live_take_page"));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewBeautyWidget$f */
    static final class C3657f extends C52712l implements C52670a<StartLiveViewModel> {

        /* renamed from: a */
        final /* synthetic */ PreviewBeautyWidget f10425a;

        C3657f(PreviewBeautyWidget previewBeautyWidget) {
            this.f10425a = previewBeautyWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f10425a.context;
            if (context != null) {
                return (StartLiveViewModel) C0214z.m440a((FragmentActivity) context).mo359a(StartLiveViewModel.class);
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: a */
    public final StartLiveEventViewModel mo9045a() {
        return (StartLiveEventViewModel) this.f10418f.getValue();
    }

    public final int getLayoutId() {
        return R.layout.by2;
    }

    public PreviewBeautyWidget() {
        C3266p.m8943a().mo8634c();
        this.f10416d = new C3656e(this);
        this.f10419g = new C3653b(this);
    }

    public final void onCreate() {
        super.onCreate();
        this.contentView.setOnClickListener(new C3655d(this));
        C3395f.m9156f().mo8740a().mo8264a(new C3047a().mo8289a(C52575l.m112099b((Object[]) new String[]{C3037b.f8913a, C3037b.f8916d, "beauty"})).mo8291b(C52575l.m112092a("effect_gift")).mo8288a((C3039b) this.f10419g).mo8290a());
        C3203b b = C3395f.m9156f().mo8741b();
        C52711k.m112236a((Object) b, "LiveInternalService.inst().liveEffectService()");
        C3366v b2 = b.mo8553b();
        Context context = this.context;
        if (context != null) {
            C3366v.m9115a(b2, (FragmentActivity) context, null, 2, null);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
