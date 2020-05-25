package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0199s;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.livesdk.banner.InRoomBannerManager;
import com.bytedance.android.livesdk.banner.InRoomBannerManager.C4649b;
import com.bytedance.android.livesdk.chatroom.event.C5191k;
import com.bytedance.android.livesdk.chatroom.model.C5743c;
import com.bytedance.android.livesdk.chatroom.model.C5743c.C5744a;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6422a.C6428f;
import com.bytedance.android.livesdk.message.model.C7824b;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

public final class BottomRightBannerContainerWidget extends LiveRecyclableWidget implements C0199s<KVData>, C6428f, OnMessageListener {

    /* renamed from: a */
    public C6576f f16792a;

    /* renamed from: b */
    public C6553eg f16793b;

    /* renamed from: c */
    private InRoomBannerManager f16794c;

    /* renamed from: d */
    private IMessageManager f16795d;

    /* renamed from: e */
    private boolean f16796e;

    /* renamed from: f */
    private int f16797f;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget$a */
    static final class C6245a<T> implements C1710e<C4649b> {

        /* renamed from: a */
        final /* synthetic */ InRoomBannerManager f16798a;

        /* renamed from: b */
        final /* synthetic */ BottomRightBannerContainerWidget f16799b;

        C6245a(InRoomBannerManager inRoomBannerManager, BottomRightBannerContainerWidget bottomRightBannerContainerWidget) {
            this.f16798a = inRoomBannerManager;
            this.f16799b = bottomRightBannerContainerWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            C5744a aVar = ((C4649b) obj).f12702b.f15097a;
            if (aVar != null) {
                BottomRightBannerContainerWidget.m13416a(this.f16799b).mo12570a(aVar);
            } else {
                BottomRightBannerContainerWidget.m13416a(this.f16799b).mo12578h();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget$b */
    static final class C6246b<T> implements C1710e<C6542dw> {

        /* renamed from: a */
        final /* synthetic */ BottomRightBannerContainerWidget f16800a;

        C6246b(BottomRightBannerContainerWidget bottomRightBannerContainerWidget) {
            this.f16800a = bottomRightBannerContainerWidget;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
            if (r5 == null) goto L_0x0024;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r5) {
            /*
                r4 = this;
                com.bytedance.android.livesdk.chatroom.viewmodule.dw r5 = (com.bytedance.android.livesdk.chatroom.viewmodule.C6542dw) r5
                com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget r0 = r4.f16800a
                com.bytedance.ies.sdk.widgets.WidgetManager r0 = r0.subWidgetManager
                if (r0 != 0) goto L_0x0009
                return
            L_0x0009:
                com.bytedance.android.livesdk.chatroom.viewmodule.LinkPkTaskWidget r5 = r5.f17870a
                if (r5 == 0) goto L_0x0024
                com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget r0 = r4.f16800a
                com.bytedance.android.livesdk.chatroom.viewmodule.eg r0 = com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget.m13417b(r0)
                r1 = r5
                com.bytedance.ies.sdk.widgets.Widget r1 = (com.bytedance.ies.sdk.widgets.Widget) r1
                com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget r2 = r4.f16800a
                com.bytedance.ies.sdk.widgets.WidgetManager r2 = r2.subWidgetManager
                java.lang.String r3 = "this@BottomRightBannerCo…erWidget.subWidgetManager"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                r0.mo12571a(r1, r2)
                if (r5 != 0) goto L_0x002d
            L_0x0024:
                com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget r5 = r4.f16800a
                com.bytedance.android.livesdk.chatroom.viewmodule.eg r5 = com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget.m13417b(r5)
                r5.mo12576f()
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget.C6246b.accept(java.lang.Object):void");
        }
    }

    public final int getLayoutId() {
        return R.layout.by4;
    }

    public final void onUnload() {
        C6576f fVar = this.f16792a;
        if (fVar == null) {
            C52711k.m112237a("bottomRightBannerHolder");
        }
        fVar.mo12576f();
        C6553eg egVar = this.f16793b;
        if (egVar == null) {
            C52711k.m112237a("pkTaskBannerHolder");
        }
        egVar.mo12576f();
        IMessageManager iMessageManager = this.f16795d;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.dataCenter.removeObserver(this);
        this.f16794c = null;
    }

    /* renamed from: a */
    public static final /* synthetic */ C6576f m13416a(BottomRightBannerContainerWidget bottomRightBannerContainerWidget) {
        C6576f fVar = bottomRightBannerContainerWidget.f16792a;
        if (fVar == null) {
            C52711k.m112237a("bottomRightBannerHolder");
        }
        return fVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ C6553eg m13417b(BottomRightBannerContainerWidget bottomRightBannerContainerWidget) {
        C6553eg egVar = bottomRightBannerContainerWidget.f16793b;
        if (egVar == null) {
            C52711k.m112237a("pkTaskBannerHolder");
        }
        return egVar;
    }

    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof C7824b) {
            C5743c cVar = ((C7824b) iMessage).f21538a;
            if (cVar != null) {
                C5744a aVar = cVar.f15097a;
                if (aVar != null) {
                    C6576f fVar = this.f16792a;
                    if (fVar == null) {
                        C52711k.m112237a("bottomRightBannerHolder");
                    }
                    fVar.mo12570a(aVar);
                }
            }
        }
    }

    public final void onInit(Object[] objArr) {
        View findViewById = this.contentView.findViewById(R.id.erq);
        C52711k.m112236a((Object) findViewById, "contentView.findViewById…regular_banner_container)");
        C6428f fVar = this;
        this.f16792a = new C6576f((ViewGroup) findViewById, fVar);
        View findViewById2 = this.contentView.findViewById(R.id.eou);
        C52711k.m112236a((Object) findViewById2, "contentView.findViewById(R.id.pk_banner_container)");
        this.f16793b = new C6553eg((ViewGroup) findViewById2, fVar);
    }

    public final /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (kVData != null && kVData.getData() != null) {
            String key = kVData.getKey();
            if (key.hashCode() == 333436001 && key.equals("cmd_gift_dialog_switch")) {
                C5191k kVar = (C5191k) kVData.getData();
                if (kVar != null) {
                    if (kVar.f13901a) {
                        ViewGroup viewGroup = this.containerView;
                        C52711k.m112236a((Object) viewGroup, "containerView");
                        LayoutParams layoutParams = viewGroup.getLayoutParams();
                        if (layoutParams != null) {
                            ((RelativeLayout.LayoutParams) layoutParams).bottomMargin = (this.f16797f + kVar.f13902b) - C3922z.m9899a(42.0f);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        }
                    } else {
                        ViewGroup viewGroup2 = this.containerView;
                        C52711k.m112236a((Object) viewGroup2, "containerView");
                        LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                        if (layoutParams2 != null) {
                            ((RelativeLayout.LayoutParams) layoutParams2).bottomMargin = this.f16797f;
                        } else {
                            throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        }
                    }
                    this.containerView.requestLayout();
                }
            }
        }
    }

    public final void onLoad(Object[] objArr) {
        long j;
        InRoomBannerManager inRoomBannerManager = (InRoomBannerManager) this.dataCenter.get("data_in_room_banner_manager", null);
        if (inRoomBannerManager != null) {
            Room room = (Room) this.dataCenter.get("data_room", null);
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            ((C4002ac) inRoomBannerManager.mo10435a(Long.valueOf(j)).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) autoDispose())).mo9405a((C1710e<? super T>) new C6245a<Object>(inRoomBannerManager, this));
        } else {
            inRoomBannerManager = null;
        }
        if (inRoomBannerManager != null) {
            this.f16794c = inRoomBannerManager;
            Object obj = this.dataCenter.get("data_is_portrait", Boolean.valueOf(true));
            C52711k.m112236a(obj, "dataCenter.get(WidgetCon…t.DATA_IS_PORTRAIT, true)");
            this.f16796e = ((Boolean) obj).booleanValue();
            ViewGroup viewGroup = this.containerView;
            C52711k.m112236a((Object) viewGroup, "containerView");
            LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                this.f16797f = ((RelativeLayout.LayoutParams) layoutParams).bottomMargin;
                if (this.f16796e) {
                    C0199s sVar = this;
                    this.dataCenter.observeForever("cmd_gift_dialog_switch", sVar).observe("data_pre_show_keyboard", sVar).observe("data_keyboard_status", sVar);
                }
                enableSubWidgetManager();
                C6576f fVar = this.f16792a;
                if (fVar == null) {
                    C52711k.m112237a("bottomRightBannerHolder");
                }
                BottomRightBannerWidget bottomRightBannerWidget = new BottomRightBannerWidget();
                bottomRightBannerWidget.f16808h = true;
                Widget widget = bottomRightBannerWidget;
                WidgetManager widgetManager = this.subWidgetManager;
                C52711k.m112236a((Object) widgetManager, "subWidgetManager");
                fVar.mo12571a(widget, widgetManager);
                ((C4002ac) C4495a.m10823a().mo10300a(C6542dw.class).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) autoDispose())).mo9405a((C1710e<? super T>) new C6246b<Object>(this));
                IMessageManager iMessageManager = (IMessageManager) this.dataCenter.get("data_message_manager", null);
                if (iMessageManager != null) {
                    iMessageManager.addMessageListener(C8629a.BANNER_UPDATE.getIntType(), this);
                } else {
                    iMessageManager = null;
                }
                this.f16795d = iMessageManager;
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: a */
    public final void mo12310a(C6422a<? extends Widget> aVar, boolean z) {
        C52711k.m112240b(aVar, "holder");
        if (!(aVar instanceof C6576f) && (aVar instanceof C6553eg) && !z) {
            C6576f fVar = this.f16792a;
            if (fVar == null) {
                C52711k.m112237a("bottomRightBannerHolder");
            }
            fVar.mo12581k();
        }
    }
}
