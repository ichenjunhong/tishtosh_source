package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.airbnb.lottie.C2408e;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.rxutils.C4060h;
import com.bytedance.android.live.core.rxutils.C4067n;
import com.bytedance.android.live.core.rxutils.C4076q;
import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.livesdk.browser.p290d.C4742w;
import com.bytedance.android.livesdk.chatroom.p310f.C5220h;
import com.bytedance.android.livesdk.chatroom.p310f.C5221i;
import com.bytedance.android.livesdk.chatroom.p310f.C5221i.C5222a;
import com.bytedance.android.livesdk.chatroom.p310f.C5221i.C5223b;
import com.bytedance.android.livesdk.chatroom.p310f.C5221i.C5224c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.live.model.C7758b;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4574am;
import com.bytedance.android.livesdk.p279af.C4612u.C4614b;
import com.bytedance.android.livesdk.p398n.C8025a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.schema.C8267l;
import com.bytedance.android.livesdk.schema.interfaces.C8263c;
import com.bytedance.android.livesdk.viewmodel.C8422f;
import com.bytedance.android.livesdk.viewmodel.ILotteryState;
import com.bytedance.android.livesdk.viewmodel.LotteryWaiting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1680ad;
import p064c.p065a.C1684ah;
import p064c.p065a.C1685ai;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p069b.C1691d;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p077e.p082e.C2055n;
import p064c.p065a.p090h.C2150a;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52722v.C52725c;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;

public final class LotteryBannerWidget extends LiveRecyclableWidget implements OnClickListener {

    /* renamed from: a */
    public C1689b f17315a = new C1689b();

    /* renamed from: b */
    final C1680ad<String> f17316b;

    /* renamed from: c */
    private C1689b f17317c = new C1689b();

    /* renamed from: d */
    private C8422f f17318d;

    /* renamed from: e */
    private boolean f17319e;

    /* renamed from: f */
    private boolean f17320f = true;

    /* renamed from: g */
    private C6324a f17321g;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryBannerWidget$a */
    public static final class C6324a implements C1690c {

        /* renamed from: a */
        private WeakReference<C4742w> f17322a = C6543dx.m13929a();

        C6324a() {
        }

        public final boolean isDisposed() {
            if (this.f17322a.get() == null) {
                return true;
            }
            return false;
        }

        public final void dispose() {
            C4742w wVar = (C4742w) this.f17322a.get();
            if (wVar != null) {
                wVar.dismissAllowingStateLoss();
            }
            this.f17322a = C6543dx.m13929a();
        }

        /* renamed from: a */
        public final void mo12462a(C4742w wVar) {
            C52711k.m112240b(wVar, "obj");
            if (!isDisposed()) {
                dispose();
            }
            this.f17322a = new WeakReference<>(wVar);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryBannerWidget$b */
    static final class C6325b extends C52712l implements C52670a<Long> {

        /* renamed from: a */
        public static final C6325b f17323a = new C6325b();

        C6325b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C4097p<C7758b> pVar = LiveConfigSettingKeys.LOTTERY_CONFIG;
            C52711k.m112236a((Object) pVar, "LiveConfigSettingKeys.LOTTERY_CONFIG");
            return Long.valueOf(((C7758b) pVar.mo9431a()).f21329f);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryBannerWidget$c */
    static final class C6326c<T> implements C1710e<C52847n<? extends ILotteryState, ? extends ILotteryState>> {

        /* renamed from: a */
        final /* synthetic */ LotteryBannerWidget f17324a;

        C6326c(LotteryBannerWidget lotteryBannerWidget) {
            this.f17324a = lotteryBannerWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            int i;
            C52847n nVar = (C52847n) obj;
            ILotteryState iLotteryState = (ILotteryState) nVar.component1();
            ILotteryState iLotteryState2 = (ILotteryState) nVar.component2();
            if (iLotteryState != null) {
                this.f17324a.f17315a.mo6180a();
            }
            LotteryBannerWidget lotteryBannerWidget = this.f17324a;
            C8064d.m16005b();
            StringBuilder sb = new StringBuilder("banner onStateChanged to=");
            sb.append(iLotteryState2);
            C8064d.m9719a("ttlive_lottery", sb.toString());
            View view = lotteryBannerWidget.contentView;
            C52711k.m112236a((Object) view, "contentView");
            boolean z = iLotteryState2 instanceof LotteryWaiting;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            if (z) {
                TextView textView = (TextView) lotteryBannerWidget.findViewById(R.id.a13);
                C2201v d = C4060h.f11209a.mo9417a(0, 1, TimeUnit.SECONDS).mo6541d((C1711f<? super T, ? extends R>) new C6334h<Object,Object>(iLotteryState2));
                C52711k.m112236a((Object) d, "timer");
                C52711k.m112236a((Object) textView, "countDownView");
                lotteryBannerWidget.mo12460a(C4067n.m10191a(d, C4067n.m10189a(textView), C6328e.f17326a));
                LottieAnimationView lottieAnimationView = (LottieAnimationView) lotteryBannerWidget.findViewById(R.id.ekv);
                Context context = lotteryBannerWidget.context;
                C52711k.m112236a((Object) context, "context");
                C1680ad<String> adVar = lotteryBannerWidget.f17316b;
                C5220h hVar = C5220h.Banner;
                C52711k.m112240b(context, "context");
                C52711k.m112240b(adVar, "lotteryAssetRoot");
                C52711k.m112240b(hVar, "what");
                C8064d.m16005b();
                StringBuilder sb2 = new StringBuilder("loading lottie animation ");
                sb2.append(hVar);
                C8064d.m9720b("ttlive_lottery", sb2.toString());
                C1680ad a = adVar.mo6151a((C1711f<? super T, ? extends C1685ai<? extends R>>) new C5222a<Object,Object>(hVar)).mo6151a((C1711f<? super T, ? extends C1685ai<? extends R>>) new C5223b<Object,Object>(context)).mo6148a(C1667a.m5940a());
                C52711k.m112236a((Object) a, "lotteryAssetRoot.flatMap…dSchedulers.mainThread())");
                C1690c a2 = a.mo6152a((C1710e<? super T>) new C6329f<Object>(lotteryBannerWidget, lottieAnimationView), (C1710e<? super Throwable>) C6333g.f17337a);
                C52711k.m112236a((Object) a2, "loadLottie(context, lott…                       })");
                lotteryBannerWidget.mo12460a(a2);
                C8049c.m15979a().mo14203a("lottery_show", Room.class, C8059j.class);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryBannerWidget$d */
    static final class C6327d<T> implements C1710e<C6592p> {

        /* renamed from: a */
        final /* synthetic */ LotteryBannerWidget f17325a;

        C6327d(LotteryBannerWidget lotteryBannerWidget) {
            this.f17325a = lotteryBannerWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            C6592p pVar = (C6592p) obj;
            this.f17325a.mo12459a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryBannerWidget$e */
    static final /* synthetic */ class C6328e extends C52710j implements C52671b<Long, String> {

        /* renamed from: a */
        public static final C6328e f17326a = new C6328e();

        C6328e() {
            super(1);
        }

        public final String getName() {
            return "second2SimpleString";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C4574am.class);
        }

        public final String getSignature() {
            return "second2SimpleString(J)Ljava/lang/String;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return C4574am.m10978a(((Number) obj).longValue());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryBannerWidget$f */
    static final class C6329f<T> implements C1710e<C52847n<? extends C2408e, ? extends C8025a>> {

        /* renamed from: a */
        final /* synthetic */ LotteryBannerWidget f17327a;

        /* renamed from: b */
        final /* synthetic */ LottieAnimationView f17328b;

        /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryBannerWidget$f$a */
        public static final class C6331a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C6329f f17331a;

            /* renamed from: b */
            final /* synthetic */ C52725c f17332b;

            /* renamed from: c */
            final /* synthetic */ C52670a f17333c;

            public final void onAnimationEnd(Animator animator) {
                if (this.f17332b.element > 0) {
                    this.f17332b.element--;
                    this.f17333c.invoke();
                    return;
                }
                this.f17331a.f17328b.mo6655b((AnimatorListener) this);
            }

            C6331a(C6329f fVar, C52725c cVar, C52670a aVar) {
                this.f17331a = fVar;
                this.f17332b = cVar;
                this.f17333c = aVar;
            }
        }

        /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryBannerWidget$f$b */
        static final class C6332b extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C6329f f17334a;

            /* renamed from: b */
            final /* synthetic */ C8025a f17335b;

            /* renamed from: c */
            final /* synthetic */ C2408e f17336c;

            C6332b(C6329f fVar, C8025a aVar, C2408e eVar) {
                this.f17334a = fVar;
                this.f17335b = aVar;
                this.f17336c = eVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                C8025a aVar = this.f17335b;
                C2408e eVar = this.f17336c;
                LottieAnimationView lottieAnimationView = this.f17334a.f17328b;
                C52711k.m112236a((Object) lottieAnimationView, "lottieView");
                C52711k.m112240b(aVar, "entity");
                C52711k.m112240b(eVar, "composition");
                C52711k.m112240b(lottieAnimationView, "view");
                C8064d.m16005b();
                StringBuilder sb = new StringBuilder("starting lottie animation ");
                sb.append(aVar.f21961b);
                C8064d.m9720b("ttlive_lottery", sb.toString());
                lottieAnimationView.mo6661f();
                lottieAnimationView.setProgress(0.0f);
                lottieAnimationView.setImageAssetDelegate(new C5224c(aVar));
                lottieAnimationView.setComposition(eVar);
                lottieAnimationView.mo6654b();
                return C52860x.f131107a;
            }
        }

        C6329f(LotteryBannerWidget lotteryBannerWidget, LottieAnimationView lottieAnimationView) {
            this.f17327a = lotteryBannerWidget;
            this.f17328b = lottieAnimationView;
        }

        public final /* synthetic */ void accept(Object obj) {
            C52847n nVar = (C52847n) obj;
            C52670a bVar = new C6332b(this, (C8025a) nVar.component2(), (C2408e) nVar.component1());
            C52725c cVar = new C52725c();
            cVar.element = 2;
            final C6331a aVar = new C6331a(this, cVar, bVar);
            this.f17328b.mo6652a((AnimatorListener) aVar);
            LotteryBannerWidget lotteryBannerWidget = this.f17327a;
            C1690c a = C1691d.m6004a((C1706a) new C1706a(this) {

                /* renamed from: a */
                final /* synthetic */ C6329f f17329a;

                {
                    this.f17329a = r1;
                }

                /* renamed from: a */
                public final void mo6199a() {
                    this.f17329a.f17328b.mo6655b((AnimatorListener) aVar);
                }
            });
            C52711k.m112236a((Object) a, "Disposables.fromAction {…matorListener(listener) }");
            lotteryBannerWidget.mo12460a(a);
            bVar.invoke();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryBannerWidget$g */
    static final class C6333g<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C6333g f17337a = new C6333g();

        C6333g() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C8064d.m16005b();
            C52711k.m112236a((Object) th, "t");
            C8064d.m9718a(5, th.getStackTrace());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryBannerWidget$h */
    static final class C6334h<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ ILotteryState f17338a;

        C6334h(ILotteryState iLotteryState) {
            this.f17338a = iLotteryState;
        }

        public final /* synthetic */ Object apply(Object obj) {
            C52711k.m112240b((Long) obj, "it");
            return Long.valueOf(((LotteryWaiting) this.f17338a).getLocalDrawTime() - (System.currentTimeMillis() / 1000));
        }
    }

    public final int getLayoutId() {
        return R.layout.bxk;
    }

    public LotteryBannerWidget() {
        C52670a aVar = C6325b.f17323a;
        C52711k.m112240b(aVar, "getAssetId");
        C52727e eVar = new C52727e();
        eVar.element = null;
        C1680ad<String> a = C1680ad.m5958a((C1684ah<T>) new C4614b<T>(eVar, aVar));
        C52711k.m112236a((Object) a, "Single.create { emitter …curValue)\n        }\n    }");
        this.f17316b = a;
        this.f17321g = new C6324a();
    }

    public final void onUnload() {
        C8064d.m16005b();
        C8064d.m9720b("ttlive_lottery", "onUnload");
        this.f17318d = null;
        this.f17315a.dispose();
        this.f17315a = new C1689b();
        this.f17317c.dispose();
        this.f17317c = new C1689b();
    }

    /* renamed from: a */
    public final void mo12459a() {
        C8422f fVar = this.f17318d;
        if (fVar != null) {
            ILotteryState iLotteryState = fVar.f22869a;
            if (iLotteryState != null) {
                String str = null;
                if (iLotteryState instanceof LotteryWaiting) {
                    C6543dx.m13930b();
                    if (this.f17319e) {
                        C4097p<C7758b> pVar = LiveConfigSettingKeys.LOTTERY_CONFIG;
                        if (pVar != null) {
                            C7758b bVar = (C7758b) pVar.mo9431a();
                            if (bVar != null) {
                                str = bVar.f21326c;
                            }
                        }
                    } else {
                        C4097p<C7758b> pVar2 = LiveConfigSettingKeys.LOTTERY_CONFIG;
                        if (pVar2 != null) {
                            C7758b bVar2 = (C7758b) pVar2.mo9431a();
                            if (bVar2 != null) {
                                str = bVar2.f21327d;
                            }
                        }
                    }
                } else {
                    str = "";
                }
                try {
                    Uri parse = Uri.parse(str);
                    C52711k.m112236a((Object) parse, "Uri.parse(uriString)");
                    Uri a = C5221i.m11840a(parse, iLotteryState);
                    boolean z = false;
                    C8263c handler = C4514j.m10883j().mo10328i().getHandler(a);
                    if (handler instanceof C8267l) {
                        C4104a a2 = ((C8267l) handler).mo14455a(this.context, a);
                        if ((a2 instanceof C4742w) && (iLotteryState instanceof LotteryWaiting)) {
                            this.f17321g.mo12462a((C4742w) a2);
                            mo12460a(this.f17321g);
                        }
                        if (a2 != null) {
                            z = true;
                        }
                    }
                    if (!z) {
                        C4514j.m10883j().mo10328i().handle(this.context, a);
                    }
                } catch (Throwable th) {
                    C8064d.m16005b();
                    C8064d.m9718a(5, th.getStackTrace());
                }
            }
        }
    }

    /* renamed from: b */
    private final boolean m13711b(C1690c cVar) {
        return this.f17317c.mo6181a(cVar);
    }

    /* renamed from: a */
    public final boolean mo12460a(C1690c cVar) {
        return this.f17315a.mo6181a(cVar);
    }

    public final void onClick(View view) {
        C8064d.m16005b();
        C8064d.m9720b("ttlive_lottery", "banner onClick");
        mo12459a();
    }

    public final void onInit(Object[] objArr) {
        C1680ad<String> adVar = this.f17316b;
        C1680ad<Object> adVar2 = C4076q.f11227a;
        if (adVar2 != null) {
            C1680ad a = C2150a.m6480a(adVar2);
            C52711k.m112236a((Object) a, "RxJavaPlugins.onAssembly…ER_INSTANCE as Single<T>)");
            C1745b.m6050a(a, "resumeSingleInCaseOfError is null");
            C1711f b = C1723a.m6039b(a);
            C1745b.m6050a(b, "resumeFunctionInCaseOfError is null");
            C1690c b2 = C2150a.m6480a((C1680ad<T>) new C2055n<T>(adVar, b)).mo6158b();
            C52711k.m112236a((Object) b2, "lotteryAssetRoot.onError…mpat.never()).subscribe()");
            m13711b(b2);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type io.reactivex.Single<T>");
    }

    public final void onLoad(Object[] objArr) {
        C8064d.m16005b();
        C8064d.m9720b("ttlive_lottery", "onLoad");
        Object obj = this.dataCenter.get("data_is_anchor", Boolean.valueOf(false));
        C52711k.m112236a(obj, "dataCenter.get(WidgetCon…nt.DATA_IS_ANCHOR, false)");
        this.f17319e = ((Boolean) obj).booleanValue();
        Object obj2 = this.dataCenter.get("data_is_portrait", Boolean.valueOf(true));
        C52711k.m112236a(obj2, "dataCenter.get(WidgetCon…t.DATA_IS_PORTRAIT, true)");
        this.f17320f = ((Boolean) obj2).booleanValue();
        this.f17318d = (C8422f) this.dataCenter.get("data_lottery_data_model", null);
        C8422f fVar = this.f17318d;
        if (fVar != null) {
            C1690c f = C4067n.m10192a(fVar.mo14654b()).mo6545f((C1710e<? super T>) new C6326c<Object>(this));
            C52711k.m112236a((Object) f, "stateChanged().diff().su…Changed(to)\n            }");
            m13711b(f);
        }
        C1690c f2 = C4495a.m10823a().mo10300a(C6592p.class).mo6545f((C1710e<? super T>) new C6327d<Object>(this));
        C52711k.m112236a((Object) f2, "RxBus.getInstance().regi…doClickBanner()\n        }");
        m13711b(f2);
        this.contentView.setOnClickListener(this);
    }
}
