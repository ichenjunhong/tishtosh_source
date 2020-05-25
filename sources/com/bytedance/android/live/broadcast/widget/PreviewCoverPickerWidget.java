package com.bytedance.android.live.broadcast.widget;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.support.p030v4.app.FragmentActivity;
import android.widget.ImageView.ScaleType;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.C3455c;
import com.bytedance.android.live.broadcast.model.C3458e;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.p230g.C3899m;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p388k.C7714f;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C1673aa;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

public final class PreviewCoverPickerWidget extends LiveWidget {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f10453a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PreviewCoverPickerWidget.class), "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PreviewCoverPickerWidget.class), "startLiveEventViewModel", "getStartLiveEventViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveEventViewModel;"))};

    /* renamed from: b */
    public C3846a f10454b;

    /* renamed from: c */
    public C3792s f10455c;

    /* renamed from: d */
    C1690c f10456d;

    /* renamed from: e */
    public C4104a f10457e;

    /* renamed from: f */
    private final C52668f f10458f = C52732g.m112285a(new C3682g(this));

    /* renamed from: g */
    private final C52668f f10459g = C52732g.m112285a(new C3681f(this));

    /* renamed from: h */
    private C1690c f10460h;

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget$a */
    static final class C3676a<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ PreviewCoverPickerWidget f10461a;

        C3676a(PreviewCoverPickerWidget previewCoverPickerWidget) {
            this.f10461a = previewCoverPickerWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (!(num == null || num == null || num.intValue() != 1)) {
                C3792s sVar = this.f10461a.f10455c;
                if (sVar != null) {
                    sVar.mo9165b();
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget$b */
    static final class C3677b<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ PreviewCoverPickerWidget f10462a;

        C3677b(PreviewCoverPickerWidget previewCoverPickerWidget) {
            this.f10462a = previewCoverPickerWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 1) {
                C0198r i = this.f10462a.mo9058a().mo8881i();
                C3792s sVar = this.f10462a.f10455c;
                if (sVar != null) {
                    str = sVar.mo9163a();
                } else {
                    str = null;
                }
                i.postValue(str);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget$c */
    static final class C3678c<T> implements C1710e<C7714f> {

        /* renamed from: a */
        final /* synthetic */ PreviewCoverPickerWidget f10463a;

        C3678c(PreviewCoverPickerWidget previewCoverPickerWidget) {
            this.f10463a = previewCoverPickerWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            C7714f fVar = (C7714f) obj;
            if (fVar == null) {
                C52711k.m112234a();
            }
            switch (fVar.f21220a) {
                case 1:
                    if (this.f10463a.f10455c != null) {
                        C3792s sVar = this.f10463a.f10455c;
                        if (sVar != null) {
                            sVar.mo9165b();
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case 2:
                    PreviewCoverPickerWidget previewCoverPickerWidget = this.f10463a;
                    previewCoverPickerWidget.f10456d = C3395f.m9156f().mo8742c().mo9019b().getBroadcastConfig().mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C3683h<Object>(previewCoverPickerWidget, fVar.f21221b), (C1710e<? super Throwable>) C3684i.f10470a);
                    break;
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget$d */
    static final class C3679d<T> implements C0199s<C8710m> {

        /* renamed from: a */
        final /* synthetic */ PreviewCoverPickerWidget f10464a;

        C3679d(PreviewCoverPickerWidget previewCoverPickerWidget) {
            this.f10464a = previewCoverPickerWidget;
        }

        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            C8710m mVar = (C8710m) obj;
            C3792s sVar = this.f10464a.f10455c;
            if (!(sVar == null || mVar == sVar.f10722g)) {
                sVar.f10722g = mVar;
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget$e */
    static final class C3680e<T> implements C0199s<C3458e> {

        /* renamed from: a */
        final /* synthetic */ PreviewCoverPickerWidget f10465a;

        C3680e(PreviewCoverPickerWidget previewCoverPickerWidget) {
            this.f10465a = previewCoverPickerWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            C3458e eVar = (C3458e) obj;
            if (eVar != null) {
                C3792s sVar = this.f10465a.f10455c;
                if (sVar != null) {
                    int i = (int) eVar.f9893b;
                    ImageModel imageModel = eVar.f9892a;
                    boolean z2 = false;
                    if (eVar.f9897f == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    switch (i) {
                        case 0:
                            sVar.f10717b.setText(sVar.f10718c.getString(R.string.efc));
                            sVar.f10717b.setAlpha(1.0f);
                            C3899m.m9868b(sVar.f10716a, imageModel);
                            break;
                        case 1:
                            sVar.f10717b.setText(sVar.f10718c.getString(R.string.efb));
                            sVar.f10717b.setAlpha(1.0f);
                            C3899m.m9868b(sVar.f10716a, imageModel);
                            break;
                        default:
                            sVar.f10717b.setText(sVar.f10718c.getString(R.string.efa));
                            sVar.f10717b.setAlpha(0.64f);
                            break;
                    }
                    z2 = true;
                    if (imageModel != null) {
                        sVar.f10723h = C3792s.m9645a(imageModel);
                    }
                    if (z) {
                        C3009i a = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a();
                        if (a instanceof User) {
                            sVar.f10717b.setText(sVar.f10718c.getString(R.string.efb));
                            C3899m.m9868b(sVar.f10716a, a.getAvatarThumb());
                            sVar.f10723h = C3792s.m9645a(a.getAvatarThumb());
                        }
                    } else if (imageModel == null) {
                        sVar.f10717b.setText(sVar.f10718c.getString(R.string.efa));
                        sVar.f10716a.setScaleType(ScaleType.FIT_XY);
                        C13833a aVar = (C13833a) sVar.f10716a.getHierarchy();
                        if (aVar != null) {
                            aVar.mo25898a(C13818b.f36061a);
                            sVar.f10716a.setHierarchy(aVar);
                        }
                        sVar.f10716a.setBackgroundResource(R.drawable.e1a);
                    }
                    if (!(sVar.f10724i == null || i == 1)) {
                        sVar.f10724i.mo8881i().postValue(sVar.mo9163a());
                    }
                    C7714f fVar = new C7714f();
                    fVar.f21220a = 2;
                    fVar.f21221b = z2;
                    C4495a.m10823a().mo10301a((Object) fVar);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget$f */
    static final class C3681f extends C52712l implements C52670a<StartLiveEventViewModel> {

        /* renamed from: a */
        final /* synthetic */ PreviewCoverPickerWidget f10466a;

        C3681f(PreviewCoverPickerWidget previewCoverPickerWidget) {
            this.f10466a = previewCoverPickerWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f10466a.context;
            if (context != null) {
                return (StartLiveEventViewModel) C0214z.m440a((FragmentActivity) context).mo359a(StartLiveEventViewModel.class);
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget$g */
    static final class C3682g extends C52712l implements C52670a<StartLiveViewModel> {

        /* renamed from: a */
        final /* synthetic */ PreviewCoverPickerWidget f10467a;

        C3682g(PreviewCoverPickerWidget previewCoverPickerWidget) {
            this.f10467a = previewCoverPickerWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f10467a.context;
            if (context != null) {
                return (StartLiveViewModel) C0214z.m440a((FragmentActivity) context).mo359a(StartLiveViewModel.class);
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget$h */
    static final class C3683h<T> implements C1710e<C4177d<C3455c>> {

        /* renamed from: a */
        final /* synthetic */ PreviewCoverPickerWidget f10468a;

        /* renamed from: b */
        final /* synthetic */ boolean f10469b;

        C3683h(PreviewCoverPickerWidget previewCoverPickerWidget, boolean z) {
            this.f10468a = previewCoverPickerWidget;
            this.f10469b = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            String str;
            C4177d dVar = (C4177d) obj;
            if (dVar.data != null) {
                C3455c cVar = (C3455c) dVar.data;
                if (cVar.f9887d != null && cVar.f9887d.f9888a) {
                    C4097p<String> pVar = LiveConfigSettingKeys.LIVE_NOTICE_URL;
                    C52711k.m112236a((Object) pVar, "LiveConfigSettingKeys.LIVE_NOTICE_URL");
                    String str2 = (String) pVar.mo9431a();
                    if (str2 != null) {
                        if (str2.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            Uri parse = Uri.parse(str2);
                            if (parse != null) {
                                String queryParameter = parse.getQueryParameter("width");
                                String queryParameter2 = parse.getQueryParameter("height");
                                if (queryParameter != null && queryParameter2 != null) {
                                    try {
                                        int parseInt = Integer.parseInt(queryParameter);
                                        int parseInt2 = Integer.parseInt(queryParameter2);
                                        Builder builder = new Builder();
                                        Builder path = builder.scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath());
                                        String str3 = "type";
                                        if (this.f10469b) {
                                            str = CustomActionPushReceiver.f104061f;
                                        } else {
                                            str = "upload";
                                        }
                                        path.appendQueryParameter(str3, str).build();
                                        String builder2 = builder.toString();
                                        C52711k.m112236a((Object) builder2, "builder.toString()");
                                        C4104a aVar = this.f10468a.f10457e;
                                        if (aVar != null) {
                                            aVar.dismissAllowingStateLoss();
                                        }
                                        PreviewCoverPickerWidget previewCoverPickerWidget = this.f10468a;
                                        C2952b a = C4116c.m10249a(C3805a.class);
                                        if (a == null) {
                                            C52711k.m112234a();
                                        }
                                        previewCoverPickerWidget.f10457e = ((C3805a) a).webViewManager().mo10487a(C4704c.m11226a(builder2).mo10510a(parseInt).mo10514b(parseInt2).mo10520e(17));
                                        if (this.f10468a.f10457e != null) {
                                            Context context = this.f10468a.getContext();
                                            if (context != null) {
                                                C4104a.m10232a((FragmentActivity) context, this.f10468a.f10457e);
                                            } else {
                                                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                            }
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget$i */
    static final class C3684i<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C3684i f10470a = new C3684i();

        C3684i() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: c */
    private final StartLiveEventViewModel m9514c() {
        return (StartLiveEventViewModel) this.f10459g.getValue();
    }

    /* renamed from: a */
    public final StartLiveViewModel mo9058a() {
        return (StartLiveViewModel) this.f10458f.getValue();
    }

    public final int getLayoutId() {
        return R.layout.bvr;
    }

    public final void onDestroy() {
        super.onDestroy();
        C3792s sVar = this.f10455c;
        if (sVar != null) {
            if (sVar.f10719d != null) {
                sVar.f10719d.mo9579b();
                sVar.f10719d = null;
            }
            sVar.f10720e = null;
        }
        C1690c cVar = this.f10460h;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f10454b = null;
    }

    public final void onCreate() {
        super.onCreate();
        if (this.f10455c == null) {
            mo9059b();
        }
        C0184k kVar = this;
        m9514c().mo8868b().observe(kVar, new C3676a(this));
        m9514c().mo8869c().observe(kVar, new C3677b(this));
    }

    /* renamed from: b */
    public final void mo9059b() {
        this.f10455c = new C3792s(this.contentView, this.f10454b, mo9058a());
        this.f10460h = C4495a.m10823a().mo10300a(C7714f.class).mo6545f((C1710e<? super T>) new C3678c<Object>(this));
        C0184k kVar = this;
        mo9058a().mo8876d().observe(kVar, new C3679d(this));
        mo9058a().mo8873a().observe(kVar, new C3680e(this));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C3792s sVar = this.f10455c;
        if (sVar != null) {
            sVar.f10719d.mo9578a(i, i2, intent);
        }
    }
}
