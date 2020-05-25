package com.bytedance.android.live.broadcast.widget;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ProgressDialog;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Message;
import android.support.constraint.ConstraintLayout;
import android.support.p030v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.live.base.model.p188b.C2964a;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.C3617q;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.effect.C3261l;
import com.bytedance.android.live.broadcast.model.C3453b;
import com.bytedance.android.live.broadcast.model.C3453b.C3454a;
import com.bytedance.android.live.broadcast.model.C3458e;
import com.bytedance.android.live.broadcast.p202d.C3161a;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.broadcast.preview.C3561f;
import com.bytedance.android.live.broadcast.preview.C3561f.C3565d;
import com.bytedance.android.live.broadcast.preview.C3587g;
import com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel.C3471a;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel.C3483m;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel.C3484n;
import com.bytedance.android.live.broadcast.preview.p219a.C3495a;
import com.bytedance.android.live.broadcast.preview.p219a.p220a.C3496a;
import com.bytedance.android.live.broadcast.preview.p219a.p220a.C3498c;
import com.bytedance.android.live.broadcast.preview.p219a.p220a.C3499d;
import com.bytedance.android.live.broadcast.preview.p219a.p220a.C3501e;
import com.bytedance.android.live.broadcast.preview.p219a.p220a.C3502f;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.performance.C3982g;
import com.bytedance.android.live.core.performance.C3982g.C3983a;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.chatroom.model.C5728aq;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p272ad.C4526c;
import com.bytedance.android.livesdk.p279af.C4571ak;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdk.user.C8333e;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.C8747h.C8749b;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C8777a;
import com.bytedance.android.livesdkapi.host.C8803g;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.p456j.C8828a;
import com.bytedance.common.utility.C9425l;
import com.bytedance.common.utility.C9425l.C9426a;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.ttm.player.MediaPlayer;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1710e;
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
import p2628d.p2650m.C52830p;

public final class StartLiveWidget extends LiveWidget {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f10513a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveWidget.class), "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveWidget.class), "startLiveEventViewModel", "getStartLiveEventViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveEventViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveWidget.class), "progressDialog", "getProgressDialog()Landroid/app/ProgressDialog;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveWidget.class), "tipAnimation", "getTipAnimation()Landroid/animation/ValueAnimator;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveWidget.class), "tipBottomMargin", "getTipBottomMargin()I"))};

    /* renamed from: c */
    public static final C3708a f10514c = new C3708a(null);

    /* renamed from: b */
    public final C3561f f10515b;

    /* renamed from: d */
    private boolean f10516d = true;

    /* renamed from: e */
    private boolean f10517e;

    /* renamed from: f */
    private final C52668f f10518f = C52732g.m112285a(new C3720m(this));

    /* renamed from: g */
    private final C52668f f10519g = C52732g.m112285a(new C3719l(this));

    /* renamed from: h */
    private final C52668f f10520h = C52732g.m112285a(new C3718k(this));

    /* renamed from: i */
    private final C52668f f10521i = C52732g.m112285a(new C3721n(this));

    /* renamed from: j */
    private final C52668f f10522j = C52732g.m112285a(C3722o.f10537a);

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$a */
    public static final class C3708a {
        private C3708a() {
        }

        public /* synthetic */ C3708a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$b */
    static final class C3709b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f10523a;

        C3709b(StartLiveWidget startLiveWidget) {
            this.f10523a = startLiveWidget;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f10523a.mo9087b().mo8868b().postValue(Integer.valueOf(1));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$c */
    static final class C3710c implements OnClickListener {

        /* renamed from: a */
        public static final C3710c f10524a = new C3710c();

        C3710c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$d */
    static final class C3711d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f10525a;

        /* renamed from: b */
        final /* synthetic */ String f10526b;

        C3711d(StartLiveWidget startLiveWidget, String str) {
            this.f10525a = startLiveWidget;
            this.f10526b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C4104a a = ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10487a(C4704c.m11226a(this.f10526b).mo10510a(300).mo10514b((int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL));
            Context context = this.f10525a.context;
            if (context != null) {
                C4104a.m10232a((FragmentActivity) context, a);
                dialogInterface.dismiss();
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$e */
    static final class C3712e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f10527a;

        C3712e(StartLiveWidget startLiveWidget) {
            this.f10527a = startLiveWidget;
        }

        public final void onClick(View view) {
            C3561f fVar = this.f10527a.f10515b;
            boolean isInstalled = C8828a.LiveResource.isInstalled();
            if (!isInstalled) {
                if (!C3587g.m9396a(fVar.getContext())) {
                    C4204a.m10421a(fVar.getContext(), (int) R.string.e79);
                } else if (C9425l.m18652c(fVar.getContext()) == C9426a.MOBILE_2G) {
                    C4204a.m10421a(fVar.getContext(), (int) R.string.ex9);
                } else {
                    C8828a.LiveResource.checkInstall(fVar.getContext(), new C3565d(fVar));
                }
                isInstalled = false;
            } else {
                C8828a.LiveResource.load(fVar.getContext(), true);
                C3617q.INST.loadResources();
                fVar.mo8957b();
            }
            if (isInstalled) {
                this.f10527a.mo9087b().mo8869c().postValue(Integer.valueOf(1));
                StartLiveViewModel a = this.f10527a.mo9085a();
                a.mo8884l().postValue(C3471a.m9309a(0, null));
                C3495a aVar = a.f9931f;
                if (aVar != null) {
                    aVar.mo8888a();
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$f */
    static final class C3713f<T> implements C0199s<C8710m> {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f10528a;

        C3713f(StartLiveWidget startLiveWidget) {
            this.f10528a = startLiveWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C8710m mVar = (C8710m) obj;
            StartLiveWidget startLiveWidget = this.f10528a;
            if (mVar != null) {
                switch (C3753ak.f10621a[mVar.ordinal()]) {
                    case 1:
                        View view = startLiveWidget.contentView;
                        C52711k.m112236a((Object) view, "contentView");
                        ((TextView) view.findViewById(R.id.e0b)).setText(R.string.e52);
                        startLiveWidget.mo9089d();
                        return;
                    case 2:
                        View view2 = startLiveWidget.contentView;
                        C52711k.m112236a((Object) view2, "contentView");
                        ((TextView) view2.findViewById(R.id.e0b)).setText(R.string.e55);
                        break;
                }
            }
            startLiveWidget.mo9090e();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$g */
    static final class C3714g<T> implements C0199s<Message> {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f10529a;

        C3714g(StartLiveWidget startLiveWidget) {
            this.f10529a = startLiveWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            String str;
            Message message = (Message) obj;
            StartLiveWidget startLiveWidget = this.f10529a;
            if (message != null) {
                num = Integer.valueOf(message.what);
            } else {
                num = null;
            }
            if (num != null) {
                int i = message.what;
                if (i == 0) {
                    ProgressDialog c = startLiveWidget.mo9088c();
                    C52711k.m112236a((Object) c, "progressDialog");
                    if (!c.isShowing()) {
                        startLiveWidget.mo9088c().show();
                    }
                } else if (i == 10 && (message.obj == null || (message.obj instanceof Exception))) {
                    ProgressDialog c2 = startLiveWidget.mo9088c();
                    C52711k.m112236a((Object) c2, "progressDialog");
                    if (c2.isShowing()) {
                        startLiveWidget.mo9088c().dismiss();
                    }
                    Object obj2 = message.obj;
                    if (obj2 != null) {
                        Exception exc = (Exception) obj2;
                        boolean z = true;
                        if (exc instanceof C2949a) {
                            C2949a aVar = (C2949a) exc;
                            int errorCode = aVar.getErrorCode();
                            if (errorCode == 10018) {
                                StartLiveViewModel a = startLiveWidget.mo9085a();
                                a.f9927b = C3395f.m9156f().mo8742c().mo9017a().getBanUserInfo().mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C3483m<Object>(a), (C1710e<? super Throwable>) C3484n.f9960a);
                            } else if (errorCode == 20054) {
                                Map hashMap = new HashMap();
                                String str2 = "is_obs";
                                if (((C8710m) startLiveWidget.mo9085a().mo8876d().getValue()) == C8710m.THIRD_PARTY) {
                                    str = "1";
                                } else {
                                    str = "0";
                                }
                                hashMap.put(str2, str);
                                hashMap.put("_param_live_platform", CustomActionPushReceiver.f104061f);
                                C8049c.m15979a().mo14202a("enter_verify_page", hashMap, new C8059j().mo14214b(CustomActionPushReceiver.f104061f));
                                C4116c.m10249a(C8803g.class);
                                if (startLiveWidget.context != null) {
                                    aVar.getExtra();
                                } else {
                                    throw new C52857u("null cannot be cast to non-null type android.app.Activity");
                                }
                            } else if (errorCode == 30011) {
                                new C8552a(startLiveWidget.context, 0).mo14996a(true).mo15008c((int) R.string.f21).mo15003b(0, (int) R.string.e4g, (OnClickListener) new C3709b(startLiveWidget)).mo15003b(1, (int) R.string.e41, (OnClickListener) C3710c.f10524a).mo15001b().show();
                            } else if (TextUtils.isEmpty(aVar.getMessage())) {
                                Context context = startLiveWidget.context;
                                if (context != null) {
                                    C4602l.m11047a((Context) (Activity) context, (Throwable) exc, (int) R.string.e8y);
                                } else {
                                    throw new C52857u("null cannot be cast to non-null type android.app.Activity");
                                }
                            } else {
                                Context context2 = startLiveWidget.context;
                                if (context2 != null) {
                                    Context context3 = (Activity) context2;
                                    Throwable th = exc;
                                    String message2 = aVar.getMessage();
                                    if (!(th == null || context3 == null)) {
                                        if (th instanceof C2949a) {
                                            C2949a aVar2 = (C2949a) th;
                                            String prompt = aVar2.getPrompt();
                                            String alert = aVar2.getAlert();
                                            if (!TextUtils.isEmpty(alert)) {
                                                C4602l.m11045a(context3, alert, context3.getResources().getString(R.string.e6a));
                                            } else if (!TextUtils.isEmpty(prompt)) {
                                                C4204a.m10423a(context3, prompt);
                                            } else {
                                                C4204a.m10423a(context3, message2);
                                            }
                                        } else {
                                            C4204a.m10423a(context3, message2);
                                        }
                                    }
                                } else {
                                    throw new C52857u("null cannot be cast to non-null type android.app.Activity");
                                }
                            }
                        } else {
                            Context context4 = startLiveWidget.context;
                            if (context4 != null) {
                                C4602l.m11047a((Context) (Activity) context4, (Throwable) exc, (int) R.string.e8y);
                            } else {
                                throw new C52857u("null cannot be cast to non-null type android.app.Activity");
                            }
                        }
                        C8068g.m16014a(startLiveWidget.context);
                        if (((C8710m) startLiveWidget.mo9085a().mo8876d().getValue()) != C8710m.AUDIO) {
                            z = false;
                        }
                        C3161a.m8755a(exc, z);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.Exception");
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$h */
    static final class C3715h<T> implements C0199s<Room> {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f10530a;

        C3715h(StartLiveWidget startLiveWidget) {
            this.f10530a = startLiveWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f10530a.mo9086a((Room) obj);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$i */
    static final class C3716i<T> implements C0199s<C4177d<C3453b>> {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f10531a;

        C3716i(StartLiveWidget startLiveWidget) {
            this.f10531a = startLiveWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            CharSequence charSequence;
            String str;
            C4177d dVar = (C4177d) obj;
            StartLiveWidget startLiveWidget = this.f10531a;
            if (dVar != null) {
                C3453b bVar = (C3453b) dVar.data;
                if (bVar != null) {
                    C3454a aVar = bVar.f9877a;
                    if (aVar != null) {
                        if (aVar.f9881d) {
                            String a = C3922z.m9903a((int) R.string.eek);
                            if (a != null) {
                                charSequence = a;
                            } else {
                                return;
                            }
                        } else {
                            long j = aVar.f9878a - (dVar.extra.now / 1000);
                            Object obj2 = dVar.data;
                            C52711k.m112236a(obj2, "response.data");
                            C3454a aVar2 = ((C3453b) obj2).f9877a;
                            C52711k.m112236a((Object) aVar2, "response.data.latestBanRecord");
                            int i = (int) ((j + ((long) aVar2.f9879b)) / 60);
                            if (i < 60) {
                                str = C3922z.m9904a(R.plurals.u, i, Integer.valueOf(i));
                            } else if (i < 1440) {
                                i /= 60;
                                str = C3922z.m9904a(R.plurals.t, i, Integer.valueOf(i));
                            } else {
                                i /= 1440;
                                str = C3922z.m9904a(R.plurals.s, i, Integer.valueOf(i));
                            }
                            String valueOf = String.valueOf(i);
                            if (str != null) {
                                CharSequence charSequence2 = str;
                                Collection b = C52830p.m112452b(charSequence2, new String[]{valueOf}, false, 0, 6, (Object) null);
                                if (b != null) {
                                    Object[] array = b.toArray(new String[0]);
                                    if (array != null) {
                                        String[] strArr = (String[]) array;
                                        SpannableString spannableString = new SpannableString(charSequence2);
                                        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ff2200")), strArr[0].length(), strArr[0].length() + valueOf.length(), 33);
                                        charSequence = spannableString;
                                    } else {
                                        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
                                    }
                                } else {
                                    throw new C52857u("null cannot be cast to non-null type java.util.Collection<T>");
                                }
                            }
                        }
                        C4097p<String> pVar = LiveConfigSettingKeys.LIVE_BLOCKED_DETAIL_URL;
                        C52711k.m112236a((Object) pVar, "LiveConfigSettingKeys.LIVE_BLOCKED_DETAIL_URL");
                        String uri = Uri.parse((String) pVar.mo9431a()).buildUpon().appendQueryParameter("id", String.valueOf(aVar.f9882e)).build().toString();
                        C52711k.m112236a((Object) uri, "Uri.parse(LiveConfigSett…              .toString()");
                        new C8552a(startLiveWidget.context).mo15009c(charSequence).mo15003b(0, (int) R.string.eel, (OnClickListener) new C3711d(startLiveWidget, uri)).mo15001b().show();
                        C8049c.m15979a().mo14203a("pm_live_take_banpopup_show", new C8059j().mo14214b("live_take").mo14218f("show").mo14213a("live_take_page"), new C8060k());
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$j */
    static final class C3717j<T> implements C0199s<C3458e> {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f10532a;

        C3717j(StartLiveWidget startLiveWidget) {
            this.f10532a = startLiveWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C3458e eVar = (C3458e) obj;
            StartLiveWidget startLiveWidget = this.f10532a;
            if (eVar != null) {
                if (C9431p.m18664a(eVar.f9895d)) {
                    startLiveWidget.mo9090e();
                    return;
                }
                View view = startLiveWidget.contentView;
                C52711k.m112236a((Object) view, "contentView");
                TextView textView = (TextView) view.findViewById(R.id.f4h);
                C52711k.m112236a((Object) textView, "contentView.tv_start_live_tip");
                textView.setText(eVar.f9895d);
                startLiveWidget.mo9089d();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$k */
    static final class C3718k extends C52712l implements C52670a<ProgressDialog> {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f10533a;

        C3718k(StartLiveWidget startLiveWidget) {
            this.f10533a = startLiveWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f10533a.getContext();
            Context context2 = this.f10533a.context;
            C52711k.m112236a((Object) context2, "context");
            return C4571ak.m10973b(context, context2.getResources().getString(R.string.e8x));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$l */
    static final class C3719l extends C52712l implements C52670a<StartLiveEventViewModel> {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f10534a;

        C3719l(StartLiveWidget startLiveWidget) {
            this.f10534a = startLiveWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f10534a.context;
            if (context != null) {
                return (StartLiveEventViewModel) C0214z.m440a((FragmentActivity) context).mo359a(StartLiveEventViewModel.class);
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$m */
    static final class C3720m extends C52712l implements C52670a<StartLiveViewModel> {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f10535a;

        C3720m(StartLiveWidget startLiveWidget) {
            this.f10535a = startLiveWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f10535a.context;
            if (context != null) {
                return (StartLiveViewModel) C0214z.m440a((FragmentActivity) context).mo359a(StartLiveViewModel.class);
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$n */
    static final class C3721n extends C52712l implements C52670a<ValueAnimator> {

        /* renamed from: a */
        final /* synthetic */ StartLiveWidget f10536a;

        C3721n(StartLiveWidget startLiveWidget) {
            this.f10536a = startLiveWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f10536a.contentView;
            C52711k.m112236a((Object) view, "contentView");
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ConstraintLayout) view.findViewById(R.id.ewu), "translationY", new float[]{0.0f, (float) C3922z.m9899a(4.0f), 0.0f});
            C52711k.m112236a((Object) ofFloat, "animator");
            ofFloat.setDuration(1200);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new AccelerateInterpolator());
            return ofFloat;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.StartLiveWidget$o */
    static final class C3722o extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C3722o f10537a = new C3722o();

        C3722o() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(C3922z.m9899a(4.0f));
        }
    }

    /* renamed from: f */
    private final ValueAnimator m9529f() {
        return (ValueAnimator) this.f10521i.getValue();
    }

    /* renamed from: a */
    public final StartLiveViewModel mo9085a() {
        return (StartLiveViewModel) this.f10518f.getValue();
    }

    /* renamed from: b */
    public final StartLiveEventViewModel mo9087b() {
        return (StartLiveEventViewModel) this.f10519g.getValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final ProgressDialog mo9088c() {
        return (ProgressDialog) this.f10520h.getValue();
    }

    public final int getLayoutId() {
        return R.layout.by9;
    }

    public final void onPause() {
        mo9090e();
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        mo9089d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo9090e() {
        View view = this.contentView;
        C52711k.m112236a((Object) view, "contentView");
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.ewu);
        C52711k.m112236a((Object) constraintLayout, "contentView.start_live_layout");
        constraintLayout.setVisibility(8);
        if (m9529f().isRunning()) {
            m9529f().cancel();
        }
    }

    public final void onDestroy() {
        if (!this.f10517e) {
            C3395f.m9156f().mo8741b().mo8555d();
            C3395f.m9156f().mo8740a().mo8276c();
        } else {
            this.f10517e = false;
        }
        super.onDestroy();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo9089d() {
        String str;
        int i;
        C3458e eVar = (C3458e) mo9085a().mo8873a().getValue();
        if (eVar != null) {
            str = eVar.f9895d;
        } else {
            str = null;
        }
        if (!C9431p.m18664a(str) && ((C8710m) mo9085a().mo8876d().getValue()) == C8710m.VIDEO) {
            if (this.f10516d) {
                C8049c a = C8049c.m15979a();
                String str2 = "livesdk_live_take_guide_show";
                Map hashMap = new HashMap();
                String str3 = "guide_type";
                C3458e eVar2 = (C3458e) mo9085a().mo8873a().getValue();
                if (eVar2 != null) {
                    i = eVar2.f9898g;
                } else {
                    i = 0;
                }
                hashMap.put(str3, String.valueOf(i));
                a.mo14202a(str2, hashMap, new Object[0]);
                this.f10516d = false;
            }
            View view = this.contentView;
            C52711k.m112236a((Object) view, "contentView");
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.ewu);
            C52711k.m112236a((Object) constraintLayout, "contentView.start_live_layout");
            constraintLayout.setVisibility(0);
            m9529f().start();
        }
    }

    public final void onCreate() {
        super.onCreate();
        View view = this.contentView;
        C52711k.m112236a((Object) view, "contentView");
        ((TextView) view.findViewById(R.id.e0b)).setOnClickListener(new C3712e(this));
        StartLiveViewModel a = mo9085a();
        Context context = this.context;
        C52711k.m112236a((Object) context, "context");
        StartLiveViewModel a2 = mo9085a();
        C52711k.m112236a((Object) a2, "startLiveViewModel");
        StartLiveEventViewModel b = mo9087b();
        C52711k.m112236a((Object) b, "startLiveEventViewModel");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(a2, "viewModel");
        C52711k.m112240b(b, "eventViewModel");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C3496a());
        C3502f fVar = new C3502f();
        C52711k.m112240b(a2, "viewModel");
        C52711k.m112240b(b, "eventViewModel");
        fVar.f9990b = a2;
        fVar.f9989a = b;
        arrayList.add(fVar);
        C3501e eVar = new C3501e();
        C52711k.m112240b(a2, "viewModel");
        C52711k.m112240b(b, "eventViewModel");
        eVar.f9986b = a2;
        eVar.f9985a = b;
        arrayList.add(eVar);
        C3499d dVar = new C3499d();
        C52711k.m112240b(a2, "viewModel");
        dVar.f9975a = a2;
        arrayList.add(dVar);
        a.f9931f = new C3495a(0, arrayList, new C8749b(context, null));
        ArrayList arrayList2 = new ArrayList();
        C3498c cVar = new C3498c();
        C52711k.m112240b(a2, "viewModel");
        cVar.f9972a = a2;
        arrayList2.add(cVar);
        a.f9932g = new C3495a(0, arrayList2, new C8749b(context, null));
        C0184k kVar = this;
        mo9085a().mo8876d().observe(kVar, new C3713f(this));
        mo9085a().mo8884l().observe(kVar, new C3714g(this));
        mo9085a().mo8885m().observe(kVar, new C3715h(this));
        mo9085a().mo8886n().observe(kVar, new C3716i(this));
        mo9085a().mo8873a().observe(kVar, new C3717j(this));
    }

    public StartLiveWidget(C3561f fVar) {
        C52711k.m112240b(fVar, "startLiveFragment");
        this.f10515b = fVar;
    }

    /* renamed from: b */
    private final void m9528b(Room room) {
        Class cls;
        boolean z;
        C8049c.m15979a().mo14203a("live_action", new Object[0]);
        try {
            Context context = this.context;
            C8710m mVar = (C8710m) mo9085a().mo8876d().getValue();
            if (mVar == null || !mVar.isStreamingBackground) {
                cls = ((IHostApp) C4116c.m10249a(IHostApp.class)).getHostActivity(5);
            } else {
                cls = ((IHostApp) C4116c.m10249a(IHostApp.class)).getHostActivity(6);
            }
            Intent intent = new Intent(context, cls);
            if (C8710m.THIRD_PARTY == ((C8710m) mo9085a().mo8876d().getValue()) || C8710m.SCREEN_RECORD == ((C8710m) mo9085a().mo8876d().getValue())) {
                C4526c<Boolean> cVar = C4525b.f12361ad;
                C52711k.m112236a((Object) cVar, "LivePluginProperties.LIVE_GAME_QUIT_CLICKED");
                cVar.mo10346a(Boolean.valueOf(false));
            }
            intent.putExtra("data_dou_plus_promote_entry", (Serializable) mo9085a().mo8883k().getValue());
            C4526c<String> cVar2 = C4525b.f12314J;
            C52711k.m112236a((Object) cVar2, "LivePluginProperties.LIVE_START_LIVE_MODE_NAME");
            C8710m mVar2 = (C8710m) mo9085a().mo8876d().getValue();
            if (mVar2 == null) {
                mVar2 = C8710m.VIDEO;
            }
            cVar2.mo10346a(mVar2.name());
            Context context2 = this.context;
            if (context2 != null) {
                ((FragmentActivity) context2).startActivity(intent);
                C2964a aVar = (C2964a) mo9085a().mo8883k().getValue();
                if (aVar != null) {
                    z = aVar.hasDouPlusEntry;
                } else {
                    z = false;
                }
                room.isDouPlusPromotion = z;
                C2952b a = C4116c.m10249a(C4193l.class);
                C52711k.m112236a((Object) a, "ServiceManager.getServic…IRoomService::class.java)");
                ((C4193l) a).setCurrentRoom(room);
                ((C8777a) C4116c.m10249a(C8777a.class)).mo15488a().mo15411a(true);
                Context context3 = this.context;
                if (context3 != null) {
                    ((FragmentActivity) context3).finish();
                    Context context4 = this.context;
                    if (context4 != null) {
                        ((FragmentActivity) context4).overridePendingTransition(0, 0);
                        ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).startLiveManager().mo8930a();
                        ProgressDialog c = mo9088c();
                        C52711k.m112236a((Object) c, "progressDialog");
                        if (c.isShowing()) {
                            mo9088c().dismiss();
                        }
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        } catch (Exception unused) {
            ProgressDialog c2 = mo9088c();
            C52711k.m112236a((Object) c2, "progressDialog");
            if (c2.isShowing()) {
                mo9088c().dismiss();
            }
        } catch (Throwable th) {
            ProgressDialog c3 = mo9088c();
            C52711k.m112236a((Object) c3, "progressDialog");
            if (c3.isShowing()) {
                mo9088c().dismiss();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo9086a(Room room) {
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        boolean z = false;
        if (!Room.isValid(room)) {
            ProgressDialog c = mo9088c();
            C52711k.m112236a((Object) c, "progressDialog");
            if (c.isShowing()) {
                mo9088c().dismiss();
            }
            Exception illegalStateException = new IllegalStateException("invalid room");
            C4602l.m11047a(this.context, (Throwable) illegalStateException, (int) R.string.e8y);
            if (((C8710m) mo9085a().mo8876d().getValue()) == C8710m.AUDIO) {
                z = true;
            }
            C3161a.m8755a(illegalStateException, z);
            C3982g.m10084a(C3983a.CreateLive);
            return;
        }
        this.f10517e = true;
        C3395f.m9156f().mo8741b().mo8555d();
        C3395f.m9156f().mo8740a().mo8276c();
        if (room == null) {
            C52711k.m112234a();
        }
        C8710m mVar = (C8710m) mo9085a().mo8876d().getValue();
        Game game = (Game) mo9085a().mo8878f().getValue();
        Integer num = (Integer) mo9085a().mo8879g().getValue();
        if (num != null && num.intValue() == 0) {
            str = "default";
        } else if (num != null && num.intValue() == 1) {
            str = "writing";
        } else if (num != null && num.intValue() == 2) {
            str = "none";
        } else {
            str = "";
        }
        Boolean bool = (Boolean) mo9085a().mo8874b().getValue();
        HashMap hashMap = new HashMap();
        hashMap.put("event_type", "click");
        hashMap.put("room_id", String.valueOf(room.getId()));
        String str12 = "live_type";
        if (room.isLiveTypeAudio()) {
            str2 = "voice_live";
        } else {
            str2 = "video_live";
        }
        hashMap.put(str12, str2);
        hashMap.put("streaming_type", mVar.logStreamingType);
        hashMap.put("title_type", str);
        if (bool != null) {
            String str13 = "location_status";
            if (bool.booleanValue()) {
                str11 = "on";
            } else {
                str11 = "off";
            }
            hashMap.put(str13, str11);
        }
        if (mVar == C8710m.SCREEN_RECORD && game != null) {
            hashMap.put("game_name", game.name);
        }
        C8059j a = new C8059j().mo14214b("live_take").mo14213a("live_take_page");
        User user = null;
        if (!C9431p.m18664a((String) null)) {
            a.mo14217e(null);
        }
        C8049c.m15979a().mo14202a("live_take", hashMap, a);
        if (mo9085a().mo8880h().getValue() != null && !TextUtils.isEmpty((CharSequence) mo9085a().mo8880h().getValue())) {
            C8710m mVar2 = (C8710m) mo9085a().mo8876d().getValue();
            HashMap hashMap2 = new HashMap();
            String str14 = "live_type";
            if (room.isLiveTypeAudio()) {
                str10 = "voice_live";
            } else {
                str10 = "video_live";
            }
            hashMap2.put(str14, str10);
            hashMap2.put("streaming_type", mVar2.logStreamingType);
            C8049c.m15979a().mo14202a("pm_live_take_title_write", hashMap2, new C8059j().mo14214b("live_take").mo14218f("other").mo14213a("live_take_page"), new C8060k());
        }
        C3261l.m8930a(room.getId());
        ((C8777a) C4116c.m10249a(C8777a.class)).mo15489b();
        C4526c<Float> cVar = C4525b.f12318N;
        C4526c<Float> cVar2 = C4525b.f12319O;
        C8710m mVar3 = (C8710m) mo9085a().mo8876d().getValue();
        C8333e user2 = ((C4282a) C4116c.m10249a(C4282a.class)).user();
        C52711k.m112236a((Object) user2, "ServiceManager.getServic…rvice::class.java).user()");
        C3009i a2 = user2.mo14521a();
        if (a2 instanceof User) {
            user = a2;
        }
        User user3 = user;
        C5728aq aqVar = (C5728aq) mo9085a().mo8882j().getValue();
        if (aqVar != null) {
            i = aqVar.f15081a;
        } else {
            i = -1;
        }
        float floatValue = ((Float) cVar.mo10345a()).floatValue() * 100.0f;
        float floatValue2 = ((Float) cVar2.mo10345a()).floatValue() * 100.0f;
        float floatValue3 = ((Float) C4525b.f12320P.mo10345a()).floatValue() * 100.0f;
        float floatValue4 = ((Float) C4525b.f12321Q.mo10345a()).floatValue() * 100.0f;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("event_page", "live_take_page");
        String str15 = "live_type";
        if (room.isLiveTypeAudio()) {
            str3 = "voice_live";
        } else {
            str3 = "video_live";
        }
        hashMap3.put(str15, str3);
        hashMap3.put("streaming_type", mVar3.logStreamingType);
        hashMap3.put("anchor_id", String.valueOf(user3.getId()));
        String str16 = "is_tag";
        if (i == -1) {
            str4 = "0";
        } else {
            str4 = "1";
        }
        hashMap3.put(str16, str4);
        String str17 = "is_beauty";
        if (mVar3 == C8710m.VIDEO && !(floatValue == 0.0f && floatValue2 == 0.0f && floatValue3 == 0.0f && floatValue4 == 0.0f)) {
            str5 = "1";
        } else {
            str5 = "0";
        }
        hashMap3.put(str17, str5);
        String str18 = "beauty_white";
        if (mVar3 != C8710m.VIDEO) {
            str6 = "0";
        } else {
            str6 = String.valueOf(floatValue);
        }
        hashMap3.put(str18, str6);
        String str19 = "beauty_skin";
        if (mVar3 != C8710m.VIDEO) {
            str7 = "0";
        } else {
            str7 = String.valueOf(floatValue2);
        }
        hashMap3.put(str19, str7);
        String str20 = "beauty_bigeye";
        if (mVar3 != C8710m.VIDEO) {
            str8 = "0";
        } else {
            str8 = String.valueOf(floatValue3);
        }
        hashMap3.put(str20, str8);
        String str21 = "beauty_facethin";
        if (mVar3 != C8710m.VIDEO) {
            str9 = "0";
        } else {
            str9 = String.valueOf(floatValue4);
        }
        hashMap3.put(str21, str9);
        C8049c.m15979a().mo14202a("pm_live_take_edit_features", hashMap3, new C8059j().mo14214b("live_take").mo14218f("click"));
        if (((C8710m) mo9085a().mo8876d().getValue()) == C8710m.AUDIO) {
            z = true;
        }
        C3161a.m8757a(z);
        m9528b(room);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
