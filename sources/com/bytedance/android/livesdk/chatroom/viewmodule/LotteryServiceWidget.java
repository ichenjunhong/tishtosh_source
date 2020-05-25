package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y.C0212b;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.C4057f;
import com.bytedance.android.live.core.rxutils.C4061i;
import com.bytedance.android.live.core.rxutils.C4067n;
import com.bytedance.android.live.core.rxutils.C4067n.C4068a;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.chatroom.api.LotteryApi;
import com.bytedance.android.livesdk.chatroom.event.C5157ac;
import com.bytedance.android.livesdk.chatroom.p310f.C5219g;
import com.bytedance.android.livesdk.chatroom.p325ui.C6115dq;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6610k;
import com.bytedance.android.livesdk.message.model.LotteryEventMessage;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.user.C8333e;
import com.bytedance.android.livesdk.viewmodel.C8422f;
import com.bytedance.android.livesdk.viewmodel.C8423g;
import com.bytedance.android.livesdk.viewmodel.FinishLottery;
import com.bytedance.android.livesdk.viewmodel.ILotteryAction;
import com.bytedance.android.livesdk.viewmodel.ILotteryState;
import com.bytedance.android.livesdk.viewmodel.LotteryReviewPending;
import com.bytedance.android.livesdk.viewmodel.LotteryViewModel;
import com.bytedance.android.livesdk.viewmodel.LotteryViewModel.C8402a;
import com.bytedance.android.livesdk.viewmodel.LotteryViewModel.C8403b;
import com.bytedance.android.livesdk.viewmodel.LotteryWaiting;
import com.bytedance.android.livesdk.viewmodel.ResetLottery;
import com.bytedance.android.livesdk.viewmodel.StartLottery;
import com.bytedance.android.livesdk.viewmodel.SubmitLottery;
import com.bytedance.android.livesdk.widget.C8548h;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C1674ab;
import p064c.p065a.C1680ad;
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
import p064c.p065a.p072e.p077e.p081d.C1908af.C1909a;
import p064c.p065a.p072e.p077e.p081d.C1908af.C1910b;
import p064c.p065a.p072e.p077e.p081d.C1908af.C1911c;
import p064c.p065a.p072e.p077e.p081d.C1934aq;
import p064c.p065a.p072e.p077e.p081d.C1946au;
import p064c.p065a.p072e.p077e.p082e.C2053m;
import p064c.p065a.p090h.C2150a;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52722v.C52727e;

public final class LotteryServiceWidget extends LiveWidget implements C0212b, OnMessageListener {

    /* renamed from: a */
    public C1689b f17339a;

    /* renamed from: b */
    public LotteryViewModel f17340b;

    /* renamed from: c */
    public User f17341c;

    /* renamed from: d */
    public boolean f17342d;

    /* renamed from: e */
    private C1689b f17343e;

    /* renamed from: f */
    private Room f17344f;

    /* renamed from: g */
    private boolean f17345g;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$a */
    static final class C6335a<T> implements C1710e<C3009i> {

        /* renamed from: a */
        final /* synthetic */ LotteryServiceWidget f17346a;

        C6335a(LotteryServiceWidget lotteryServiceWidget) {
            this.f17346a = lotteryServiceWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.f17346a.mo12467a(User.from((C3009i) obj));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$b */
    static final class C6336b implements C1706a {

        /* renamed from: a */
        final /* synthetic */ IMessageManager f17347a;

        /* renamed from: b */
        final /* synthetic */ LotteryServiceWidget f17348b;

        C6336b(IMessageManager iMessageManager, LotteryServiceWidget lotteryServiceWidget) {
            this.f17347a = iMessageManager;
            this.f17348b = lotteryServiceWidget;
        }

        /* renamed from: a */
        public final void mo6199a() {
            this.f17347a.removeMessageListener(this.f17348b);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$c */
    static final class C6337c<T> implements C1710e<C52847n<? extends ILotteryState, ? extends ILotteryState>> {

        /* renamed from: a */
        final /* synthetic */ LotteryServiceWidget f17349a;

        C6337c(LotteryServiceWidget lotteryServiceWidget) {
            this.f17349a = lotteryServiceWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            C52847n nVar = (C52847n) obj;
            ILotteryState iLotteryState = (ILotteryState) nVar.component1();
            nVar.component2();
            if (iLotteryState != null) {
                this.f17349a.f17339a.mo6180a();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$d */
    static final class C6338d implements C1706a {

        /* renamed from: a */
        final /* synthetic */ LotteryServiceWidget f17350a;

        C6338d(LotteryServiceWidget lotteryServiceWidget) {
            this.f17350a = lotteryServiceWidget;
        }

        /* renamed from: a */
        public final void mo6199a() {
            this.f17350a.dataCenter.lambda$put$1$DataCenter("data_lottery_data_model", null);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$e */
    static final class C6339e<T> implements C1710e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ LotteryServiceWidget f17351a;

        C6339e(LotteryServiceWidget lotteryServiceWidget) {
            this.f17351a = lotteryServiceWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            C8064d.m16005b();
            StringBuilder sb = new StringBuilder("lotteryPermission=");
            sb.append(bool);
            C8064d.m9720b("ttlive_lottery", sb.toString());
            C52711k.m112236a((Object) bool, "hasPermission");
            if (bool.booleanValue()) {
                Context context = this.f17351a.context;
                C52711k.m112236a((Object) context, "context");
                DataCenter dataCenter = this.f17351a.dataCenter;
                C52711k.m112236a((Object) dataCenter, "dataCenter");
                final C6115dq dqVar = new C6115dq(context, dataCenter);
                C6610k.m13985a().mo12668a(C6605h.LOTTERY, (C6601a) dqVar);
                LotteryServiceWidget lotteryServiceWidget = this.f17351a;
                C1690c a = C1691d.m6004a((C1706a) new C1706a() {
                    /* renamed from: a */
                    public final void mo6199a() {
                        C8064d.m16005b();
                        C8064d.m9720b("ttlive_lottery", "unloading toolbar button");
                        C6610k.m13985a().mo12670b(C6605h.LOTTERY, dqVar);
                    }
                });
                C52711k.m112236a((Object) a, "Disposables.fromAction {…                        }");
                lotteryServiceWidget.mo12468a(a);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$f */
    static final class C6341f extends C52712l implements C52671b<C5219g, C52860x> {

        /* renamed from: a */
        public static final C6341f f17353a = new C6341f();

        C6341f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C5219g gVar = (C5219g) obj;
            C52711k.m112240b(gVar, "$receiver");
            gVar.mo11058a();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$g */
    static final class C6342g<T> implements C1710e<C5157ac> {

        /* renamed from: a */
        final /* synthetic */ LotteryServiceWidget f17354a;

        C6342g(LotteryServiceWidget lotteryServiceWidget) {
            this.f17354a = lotteryServiceWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            C5157ac acVar = (C5157ac) obj;
            LotteryViewModel lotteryViewModel = this.f17354a.f17340b;
            if (lotteryViewModel != null) {
                C8422f fVar = lotteryViewModel.f22841a;
                if (fVar != null) {
                    fVar.mo14653a((ILotteryAction) new SubmitLottery());
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$h */
    static final class C6343h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8552a f17355a;

        /* renamed from: b */
        final /* synthetic */ C52727e f17356b;

        /* renamed from: c */
        final /* synthetic */ String f17357c;

        C6343h(C8552a aVar, C52727e eVar, String str) {
            this.f17355a = aVar;
            this.f17356b = eVar;
            this.f17357c = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ((C52670a) this.f17356b.element).invoke();
            C4514j.m10883j().mo10328i().handle(this.f17355a.mo14989a(), Uri.parse(this.f17357c));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$i */
    static final class C6344i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52727e f17358a;

        /* renamed from: b */
        final /* synthetic */ String f17359b;

        C6344i(C52727e eVar, String str) {
            this.f17358a = eVar;
            this.f17359b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ((C52670a) this.f17358a.element).invoke();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$j */
    static final class C6345j extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C8548h f17360a;

        C6345j(C8548h hVar) {
            this.f17360a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C8548h hVar = this.f17360a;
            if (hVar != null) {
                hVar.dismiss();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryServiceWidget$k */
    static final class C6346k extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        public static final C6346k f17361a = new C6346k();

        C6346k() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C52860x.f131107a;
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C8064d.m16005b();
        C8064d.m9720b("ttlive_lottery", "service onDestroy");
        this.f17344f = null;
        mo12467a((User) null);
        this.f17340b = null;
        this.f17339a.dispose();
        this.f17339a = new C1689b();
        this.f17343e.dispose();
        this.f17343e = new C1689b();
    }

    public final void onCreate() {
        long j;
        super.onCreate();
        C8064d.m16005b();
        C8064d.m9720b("ttlive_lottery", "service onCreate");
        this.f17344f = (Room) this.dataCenter.get("data_room", null);
        Object obj = this.dataCenter.get("data_is_anchor", Boolean.valueOf(false));
        C52711k.m112236a(obj, "dataCenter.get(WidgetCon…nt.DATA_IS_ANCHOR, false)");
        this.f17342d = ((Boolean) obj).booleanValue();
        Object obj2 = this.dataCenter.get("data_is_portrait", Boolean.valueOf(true));
        C52711k.m112236a(obj2, "dataCenter.get(WidgetCon…t.DATA_IS_PORTRAIT, true)");
        this.f17345g = ((Boolean) obj2).booleanValue();
        C8333e user = ((C4282a) C4116c.m10249a(C4282a.class)).user();
        C52711k.m112236a((Object) user, "userService");
        mo12467a(User.from(user.mo14521a()));
        C1690c f = user.mo14536f().mo6545f((C1710e<? super T>) new C6335a<Object>(this));
        C52711k.m112236a((Object) f, "userService.observeCurre…er.from(it)\n            }");
        mo12468a(f);
        this.f17340b = (LotteryViewModel) getViewModel(LotteryViewModel.class, this);
        LotteryViewModel lotteryViewModel = this.f17340b;
        if (lotteryViewModel != null) {
            C1674ab gVar = new C5219g();
            C52671b bVar = C6341f.f17353a;
            C52711k.m112240b(gVar, "$this$asDisposable");
            C52711k.m112240b(bVar, "doOnDispose");
            C4057f fVar = new C4057f(gVar, new C4068a(gVar, bVar));
            mo12468a((C1690c) fVar);
            C2201v b = lotteryViewModel.f22841a.mo14654b();
            C1674ab abVar = fVar;
            C1745b.m6050a(abVar, "observer is null");
            C2201v a = b.mo6519a((C1710e<? super T>) new C1911c<Object>(abVar), (C1710e<? super Throwable>) new C1910b<Object>(abVar), (C1706a) new C1909a(abVar), C1723a.f5844c);
            C52711k.m112236a((Object) a, "dataModel.stateChanged().doOnEach(logInjector)");
            C1690c f2 = C4067n.m10192a(a).mo6545f((C1710e<? super T>) new C6337c<Object>(this));
            C52711k.m112236a((Object) f2, "dataModel.stateChanged()…d(from, to)\n            }");
            mo12468a(f2);
            this.dataCenter.lambda$put$1$DataCenter("data_lottery_data_model", lotteryViewModel.f22841a);
            C1690c a2 = C1691d.m6004a((C1706a) new C6338d(this));
            C52711k.m112236a((Object) a2, "Disposables.fromAction {…TTERY_DATA_MODEL, null) }");
            mo12468a(a2);
            if (this.f17342d) {
                C8064d.m16005b();
                C8064d.m9720b("ttlive_lottery", "checking lottery permission");
                Room room = this.f17344f;
                long j2 = 0;
                if (room != null) {
                    j = room.getId();
                } else {
                    j = 0;
                }
                User user2 = this.f17341c;
                if (user2 != null) {
                    j2 = user2.getId();
                }
                C8064d.m16005b();
                StringBuilder sb = new StringBuilder("checkLotteryPermission roomId=");
                sb.append(j);
                sb.append(" anchorId=");
                sb.append(j2);
                C8064d.m9720b("ttlive_lottery", sb.toString());
                C2201v a3 = ((LotteryApi) C4157e.m10322a().mo9550a(LotteryApi.class)).getConfig(j, j2).mo6514a(C1667a.m5940a());
                C52711k.m112236a((Object) a3, "LiveClient.get().getServ…dSchedulers.mainThread())");
                C1711f iVar = new C4061i(5, 3000);
                C52711k.m112240b(a3, "$this$retryWhenCompat");
                C52711k.m112240b(iVar, "handler");
                C1745b.m6050a(iVar, "handler is null");
                C2201v a4 = C2150a.m6486a((C2201v<T>) new C1934aq<T>(a3, iVar));
                C52711k.m112236a((Object) a4, "RxJavaPlugins.onAssembly…ryWhen<T>(this, handler))");
                C2201v d = a4.mo6541d((C1711f<? super T, ? extends R>) C8402a.f22845a);
                Boolean valueOf = Boolean.valueOf(false);
                C1745b.m6050a(valueOf, "defaultItem is null");
                C1680ad a5 = C2150a.m6480a((C1680ad<T>) new C1946au<T>(d, valueOf));
                C1711f fVar2 = C8403b.f22846a;
                C1745b.m6050a(fVar2, "resumeFunction is null");
                C1680ad a6 = C2150a.m6480a((C1680ad<T>) new C2053m<T>(a5, fVar2, null));
                C52711k.m112236a((Object) a6, "LiveClient.get().getServ…n false\n                }");
                C1690c d2 = a6.mo6162d(new C6339e(this));
                C52711k.m112236a((Object) d2, "checkLotteryPermission(r…      }\n                }");
                mo12468a(d2);
            }
        }
        IMessageManager iMessageManager = (IMessageManager) this.dataCenter.get("data_message_manager", null);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C8629a.LOTTERY_EVENT.getIntType(), this);
            C1690c a7 = C1691d.m6004a((C1706a) new C6336b(iMessageManager, this));
            C52711k.m112236a((Object) a7, "Disposables.fromAction {…veMessageListener(this) }");
            mo12468a(a7);
        }
        C1690c f3 = C4495a.m10823a().mo10300a(C5157ac.class).mo6545f((C1710e<? super T>) new C6342g<Object>(this));
        C52711k.m112236a((Object) f3, "RxBus.getInstance().regi…ubmitLottery())\n        }");
        mo12468a(f3);
    }

    /* renamed from: a */
    public final boolean mo12468a(C1690c cVar) {
        return this.f17343e.mo6181a(cVar);
    }

    /* renamed from: a */
    public final <T extends C0209x> T mo361a(Class<T> cls) {
        long j;
        C52711k.m112240b(cls, "modelClass");
        C8064d.m16005b();
        C8064d.m9720b("ttlive_lottery", "creating viewModel");
        Room room = this.f17344f;
        long j2 = 0;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        User user = this.f17341c;
        if (user != null) {
            j2 = user.getId();
        }
        return (C0209x) new LotteryViewModel(j, j2);
    }

    /* renamed from: a */
    public final void mo12467a(User user) {
        Object obj;
        C8064d.m16005b();
        String str = "ttlive_lottery";
        StringBuilder sb = new StringBuilder("service user updated, userId=");
        if (user != null) {
            obj = Long.valueOf(user.getId());
        } else {
            obj = "(user is null)";
        }
        sb.append(obj);
        C8064d.m9720b(str, sb.toString());
        this.f17341c = user;
    }

    public final void onMessage(IMessage iMessage) {
        long j;
        long j2;
        C8064d.m16005b();
        StringBuilder sb = new StringBuilder("service onMessage ");
        sb.append(iMessage);
        C8064d.m9720b("ttlive_lottery", sb.toString());
        if (iMessage instanceof LotteryEventMessage) {
            LotteryEventMessage lotteryEventMessage = (LotteryEventMessage) iMessage;
            int i = lotteryEventMessage.lotteryStatus;
            if (i != 5) {
                switch (i) {
                    case 1:
                        LotteryViewModel lotteryViewModel = this.f17340b;
                        if (lotteryViewModel != null) {
                            long a = C8423g.m16626a(lotteryEventMessage.lotteryDrawTime);
                            C8422f fVar = lotteryViewModel.f22841a;
                            long j3 = lotteryEventMessage.lotteryId;
                            Room room = this.f17344f;
                            long j4 = 0;
                            if (room != null) {
                                j = room.getId();
                            } else {
                                j = 0;
                            }
                            Room room2 = this.f17344f;
                            if (room2 != null) {
                                j2 = room2.getOwnerUserId();
                            } else {
                                j2 = 0;
                            }
                            User user = this.f17341c;
                            if (user != null) {
                                j4 = user.getId();
                            }
                            StartLottery startLottery = new StartLottery(j3, j, j2, j4, a);
                            fVar.mo14653a((ILotteryAction) startLottery);
                            break;
                        } else {
                            return;
                        }
                    case 2:
                    case 3:
                        break;
                }
            }
            LotteryViewModel lotteryViewModel2 = this.f17340b;
            if (lotteryViewModel2 != null) {
                int i2 = lotteryEventMessage.lotteryStatus;
                if (i2 != 5) {
                    switch (i2) {
                        case 2:
                            if (lotteryViewModel2.f22841a.f22869a instanceof LotteryWaiting) {
                                lotteryViewModel2.f22841a.mo14653a((ILotteryAction) new FinishLottery());
                                break;
                            }
                            break;
                        case 3:
                            lotteryViewModel2.f22841a.mo14653a((ILotteryAction) new ResetLottery());
                            break;
                    }
                } else {
                    if (lotteryViewModel2.f22841a.f22869a instanceof LotteryReviewPending) {
                        lotteryViewModel2.f22841a.mo14653a((ILotteryAction) new ResetLottery());
                    }
                    if (this.f17342d) {
                        String str = lotteryEventMessage.lotteryRulePageScheme;
                        if (str == null) {
                            str = "";
                        }
                        C8064d.m16005b();
                        C8064d.m9720b("ttlive_lottery", "showRejectedDialog");
                        try {
                            C52727e eVar = new C52727e();
                            eVar.element = (C52670a) C6346k.f17361a;
                            C8552a aVar = new C8552a(this.context, 4);
                            aVar.mo15012d((int) R.string.hr7);
                            aVar.mo15008c((int) R.string.hr4);
                            aVar.mo14996a(false);
                            SpannableString spannableString = new SpannableString(aVar.mo14989a().getString(R.string.hr6));
                            spannableString.setSpan(new ForegroundColorSpan(-16777216), 0, spannableString.length(), 33);
                            aVar.mo15004b(0, (CharSequence) spannableString, (OnClickListener) new C6343h(aVar, eVar, str));
                            aVar.mo15003b(1, (int) R.string.hr5, (OnClickListener) new C6344i(eVar, str));
                            aVar.mo14997a(16.0f);
                            eVar.element = (C52670a) new C6345j(aVar.mo15011d());
                        } catch (Throwable th) {
                            C8064d.m16005b();
                            C8064d.m9718a(5, th.getStackTrace());
                        }
                    }
                }
            }
        }
    }
}
