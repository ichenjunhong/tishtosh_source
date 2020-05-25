package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C5161ag;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.C7841bo;
import com.bytedance.android.livesdk.message.model.C7841bo.C7842a;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4574am;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.user.C8333e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.android.livesdkapi.p458l.p459a.C8839e;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52726d;

public final class PopularCardWidget extends LiveRecyclableWidget implements OnMessageListener {

    /* renamed from: d */
    public static final C6361a f17429d = new C6361a(null);

    /* renamed from: a */
    public final String f17430a;

    /* renamed from: b */
    public TextView f17431b;

    /* renamed from: c */
    public Room f17432c;

    /* renamed from: e */
    private IMessageManager f17433e;

    /* renamed from: f */
    private C1690c f17434f;

    /* renamed from: g */
    private ValueAnimator f17435g;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PopularCardWidget$a */
    public static final class C6361a {
        private C6361a() {
        }

        public /* synthetic */ C6361a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PopularCardWidget$b */
    static final class C6362b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PopularCardWidget f17436a;

        C6362b(PopularCardWidget popularCardWidget) {
            this.f17436a = popularCardWidget;
        }

        public final void onClick(View view) {
            if (!TextUtils.isEmpty(this.f17436a.f17430a)) {
                C8839e eVar = new C8839e(this.f17436a.f17430a);
                User owner = PopularCardWidget.m13756a(this.f17436a).getOwner();
                C52711k.m112236a((Object) owner, "room.owner");
                eVar.mo15826a("anchor_id", owner.getId());
                eVar.mo15826a("room_id", PopularCardWidget.m13756a(this.f17436a).getId());
                C8333e h = TTLiveSDKContext.getHostService().mo10315h();
                C52711k.m112236a((Object) h, "TTLiveSDKContext.getHostService().user()");
                C3009i a = h.mo14521a();
                C52711k.m112236a((Object) a, "TTLiveSDKContext.getHost…vice().user().currentUser");
                if (a != null) {
                    eVar.mo15826a("user_id", a.getId());
                }
                C5161ag agVar = new C5161ag(eVar.mo15824a(), "", 17, 280, 208, 2);
                agVar.f13838h = false;
                C4495a.m10823a().mo10301a((Object) agVar);
                this.f17436a.mo12504a("popular_card_icon_click");
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PopularCardWidget$c */
    static final class C6363c<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ C52726d f17437a;

        C6363c(C52726d dVar) {
            this.f17437a = dVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            C52711k.m112240b(l, "increase");
            return Long.valueOf(this.f17437a.element - l.longValue());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PopularCardWidget$d */
    static final class C6364d<T> implements C1710e<Long> {

        /* renamed from: a */
        final /* synthetic */ PopularCardWidget f17438a;

        C6364d(PopularCardWidget popularCardWidget) {
            this.f17438a = popularCardWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            Long l = (Long) obj;
            TextView textView = this.f17438a.f17431b;
            if (textView == null) {
                C52711k.m112237a("timeCountTv");
            }
            C52711k.m112236a((Object) l, "left");
            textView.setText(C4574am.m10978a(l.longValue()));
            if (l.longValue() <= 0) {
                ViewGroup viewGroup = this.f17438a.containerView;
                C52711k.m112236a((Object) viewGroup, "containerView");
                viewGroup.setVisibility(8);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PopularCardWidget$e */
    static final class C6365e implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ PopularCardWidget f17439a;

        C6365e(PopularCardWidget popularCardWidget) {
            this.f17439a = popularCardWidget;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                View view = this.f17439a.contentView;
                C52711k.m112236a((Object) view, "contentView");
                LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ((FrameLayout.LayoutParams) layoutParams).topMargin = (int) (((float) C3922z.m9899a(80.0f)) * (1.0f - floatValue));
                    View view2 = this.f17439a.contentView;
                    C52711k.m112236a((Object) view2, "contentView");
                    view2.setAlpha(floatValue);
                    this.f17439a.contentView.requestLayout();
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public final int getLayoutId() {
        return R.layout.bxn;
    }

    public PopularCardWidget() {
        C4097p<String> pVar = LiveConfigSettingKeys.LIVE_POPULARITY_CARD_URL;
        C52711k.m112236a((Object) pVar, "LiveConfigSettingKeys.LIVE_POPULARITY_CARD_URL");
        this.f17430a = (String) pVar.mo9431a();
    }

    public final void onUnload() {
        IMessageManager iMessageManager = this.f17433e;
        if (iMessageManager == null) {
            C52711k.m112237a("messageManager");
        }
        if (iMessageManager != null) {
            IMessageManager iMessageManager2 = this.f17433e;
            if (iMessageManager2 == null) {
                C52711k.m112237a("messageManager");
            }
            iMessageManager2.removeMessageListener(this);
        }
        ViewGroup viewGroup = this.containerView;
        C52711k.m112236a((Object) viewGroup, "containerView");
        if (viewGroup.getVisibility() == 0) {
            ViewGroup viewGroup2 = this.containerView;
            C52711k.m112236a((Object) viewGroup2, "containerView");
            viewGroup2.setVisibility(8);
        }
        if (this.f17434f != null) {
            C1690c cVar = this.f17434f;
            if (cVar == null) {
                C52711k.m112234a();
            }
            if (!cVar.isDisposed()) {
                C1690c cVar2 = this.f17434f;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
            }
        }
        ValueAnimator valueAnimator = this.f17435g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Room m13756a(PopularCardWidget popularCardWidget) {
        Room room = popularCardWidget.f17432c;
        if (room == null) {
            C52711k.m112237a("room");
        }
        return room;
    }

    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.f00);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.time_count_tv)");
        this.f17431b = (TextView) findViewById;
        this.containerView.setOnClickListener(new C6362b(this));
    }

    /* renamed from: a */
    public final void mo12504a(String str) {
        Map linkedHashMap = new LinkedHashMap();
        String str2 = "room_id";
        Room room = this.f17432c;
        if (room == null) {
            C52711k.m112237a("room");
        }
        String idStr = room.getIdStr();
        C52711k.m112236a((Object) idStr, "room.idStr");
        linkedHashMap.put(str2, idStr);
        C8049c.m15979a().mo14202a(str, linkedHashMap, new Object[0]);
    }

    public final void onLoad(Object[] objArr) {
        Object obj = this.dataCenter.get("data_message_manager");
        C52711k.m112236a(obj, "dataCenter.get(WidgetCon…ant.DATA_MESSAGE_MANAGER)");
        this.f17433e = (IMessageManager) obj;
        IMessageManager iMessageManager = this.f17433e;
        if (iMessageManager == null) {
            C52711k.m112237a("messageManager");
        }
        if (iMessageManager != null) {
            IMessageManager iMessageManager2 = this.f17433e;
            if (iMessageManager2 == null) {
                C52711k.m112237a("messageManager");
            }
            iMessageManager2.addMessageListener(C8629a.POPULAR_CARD_MESSAGE.getIntType(), this);
        }
        Object obj2 = this.dataCenter.get("data_room");
        C52711k.m112236a(obj2, "dataCenter.get(WidgetConstant.DATA_ROOM)");
        this.f17432c = (Room) obj2;
        ViewGroup viewGroup = this.containerView;
        C52711k.m112236a((Object) viewGroup, "containerView");
        viewGroup.setVisibility(8);
    }

    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof C7841bo) {
            C7841bo boVar = (C7841bo) iMessage;
            if (boVar.f21665a != null) {
                C7842a aVar = boVar.f21665a;
                C52711k.m112236a((Object) aVar, "message.popularCardInfo");
                if (aVar.f21666a == 0) {
                    C7842a aVar2 = boVar.f21665a;
                    C52711k.m112236a((Object) aVar2, "message.popularCardInfo");
                    if ((aVar2.f21668c * 1000) - System.currentTimeMillis() > 0) {
                        ViewGroup viewGroup = this.containerView;
                        C52711k.m112236a((Object) viewGroup, "containerView");
                        viewGroup.setVisibility(0);
                        C52726d dVar = new C52726d();
                        dVar.element = ((aVar2.f21668c * 1000) - System.currentTimeMillis()) / 1000;
                        if (this.f17434f != null) {
                            C1690c cVar = this.f17434f;
                            if (cVar == null) {
                                C52711k.m112234a();
                            }
                            if (!cVar.isDisposed()) {
                                C1690c cVar2 = this.f17434f;
                                if (cVar2 != null) {
                                    cVar2.dispose();
                                }
                            }
                        }
                        TextView textView = this.f17431b;
                        if (textView == null) {
                            C52711k.m112237a("timeCountTv");
                        }
                        textView.setText(C4574am.m10978a(dVar.element));
                        this.f17434f = C4585b.m11020a(1, TimeUnit.SECONDS).mo6527b(dVar.element + 1).mo6541d((C1711f<? super T, ? extends R>) new C6363c<Object,Object>(dVar)).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C6364d<Object>(this));
                        ValueAnimator valueAnimator = this.f17435g;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        this.f17435g = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(500);
                        ValueAnimator valueAnimator2 = this.f17435g;
                        if (valueAnimator2 != null) {
                            valueAnimator2.setInterpolator(new AccelerateDecelerateInterpolator());
                        }
                        View view = this.contentView;
                        C52711k.m112236a((Object) view, "contentView");
                        view.setAlpha(0.0f);
                        ValueAnimator valueAnimator3 = this.f17435g;
                        if (valueAnimator3 != null) {
                            valueAnimator3.addUpdateListener(new C6365e(this));
                        }
                        ValueAnimator valueAnimator4 = this.f17435g;
                        if (valueAnimator4 != null) {
                            valueAnimator4.start();
                        }
                        mo12504a("popular_card_icon_show");
                        return;
                    }
                    ViewGroup viewGroup2 = this.containerView;
                    C52711k.m112236a((Object) viewGroup2, "containerView");
                    if (viewGroup2.getVisibility() == 0) {
                        ViewGroup viewGroup3 = this.containerView;
                        C52711k.m112236a((Object) viewGroup3, "containerView");
                        viewGroup3.setVisibility(8);
                    }
                }
            }
        }
    }
}
