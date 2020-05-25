package com.bytedance.android.livesdk.gift.panel;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3894h;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.gift.C4127e;
import com.bytedance.android.live.gift.C4128f;
import com.bytedance.android.live.linkpk.C4133a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.C6736d;
import com.bytedance.android.livesdk.chatroom.event.C5171aq;
import com.bytedance.android.livesdk.chatroom.event.C5191k;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C7519o;
import com.bytedance.android.livesdk.gift.C7625r.C7626a;
import com.bytedance.android.livesdk.gift.C7648t;
import com.bytedance.android.livesdk.gift.C7649u;
import com.bytedance.android.livesdk.gift.C7654y;
import com.bytedance.android.livesdk.gift.GiftEndWidget;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.honor.LiveGiftHonorLevelWidget;
import com.bytedance.android.livesdk.gift.model.C7501b;
import com.bytedance.android.livesdk.gift.model.C7501b.C7502a;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.model.C7515n;
import com.bytedance.android.livesdk.gift.model.C7517p;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.p355c.C7221a;
import com.bytedance.android.livesdk.gift.p377g.C7454d;
import com.bytedance.android.livesdk.gift.p378h.C7459a;
import com.bytedance.android.livesdk.gift.panel.C7547n.C7549a;
import com.bytedance.android.livesdk.gift.panel.p380a.C7525b;
import com.bytedance.android.livesdk.gift.panel.p380a.C7526c;
import com.bytedance.android.livesdk.gift.panel.widget.C7595ao;
import com.bytedance.android.livesdk.gift.panel.widget.FakeMtGiftPanelBottomWidget;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.C7564c;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.C7565d;
import com.bytedance.android.livesdk.gift.panel.widget.GiftPanelDoodleWidget;
import com.bytedance.android.livesdk.gift.panel.widget.GiftPanelGuestInfoWidget;
import com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget;
import com.bytedance.android.livesdk.message.model.C7810ao;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4501b;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8058i;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8062m;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C8845b;
import com.bytedance.android.livesdkapi.p460m.C8843a;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.gift.panel.a */
public final class C7521a extends C6736d implements C7549a {

    /* renamed from: a */
    Activity f20641a;

    /* renamed from: b */
    boolean f20642b;

    /* renamed from: c */
    public C7565d f20643c;

    /* renamed from: d */
    public GiftDialogViewModel f20644d;

    /* renamed from: e */
    public WidgetManager f20645e;

    /* renamed from: f */
    public DataCenter f20646f;

    /* renamed from: g */
    C7547n f20647g;

    /* renamed from: h */
    C8335g<C3009i> f20648h = new C8335g<C3009i>() {
        public final /* synthetic */ void onNext(Object obj) {
            C3009i iVar = (C3009i) obj;
            super.onNext(iVar);
            ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
            C7521a.this.f20644d.f20779l.postValue(User.from(iVar));
        }
    };

    /* renamed from: i */
    public C7626a f20649i;

    /* renamed from: k */
    private Room f20650k;

    /* renamed from: l */
    private User f20651l;

    /* renamed from: m */
    private boolean f20652m;

    /* renamed from: n */
    private String f20653n;

    /* renamed from: o */
    private boolean f20654o;

    /* renamed from: p */
    private C7595ao f20655p;

    /* renamed from: q */
    private boolean f20656q;

    /* renamed from: r */
    private View f20657r;

    /* renamed from: s */
    private View f20658s;

    /* renamed from: t */
    private boolean f20659t;

    /* renamed from: u */
    private boolean f20660u;

    /* renamed from: v */
    private C7221a f20661v;

    /* renamed from: w */
    private View f20662w;

    /* renamed from: x */
    private boolean f20663x;

    public final void dismiss() {
        dismissAllowingStateLoss();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        if (this.f20644d != null) {
            this.f20644d.mo13948a(this);
        }
    }

    /* renamed from: a */
    public final void mo13927a() {
        if (this.f18412j) {
            this.f20644d.f20785r.postValue(null);
            this.f20644d.f20780m.postValue(Boolean.valueOf(false));
        }
    }

    /* renamed from: h */
    public final boolean mo11100h() {
        if (this.f20646f != null) {
            this.f20646f.lambda$put$1$DataCenter("cmd_gift_dialog_switch", new C5191k(this.f20657r.getMeasuredHeight(), false));
        }
        C4495a.m10823a().mo10301a((Object) new C5171aq(this.f20663x));
        return super.mo11100h();
    }

    public final void dismissAllowingStateLoss() {
        if (this.f20646f != null) {
            this.f20646f.lambda$put$1$DataCenter("hide_share_lead", Boolean.valueOf(false));
            this.f20646f.lambda$put$1$DataCenter("cmd_gift_dialog_switch", new C5191k(this.f20657r.getMeasuredHeight(), false));
        }
        C4495a.m10823a().mo10301a((Object) new C5171aq(this.f20663x));
        if (this.f20644d != null) {
            this.f20644d.mo13949b();
            this.f20644d.mo13950c();
        }
        super.dismissAllowingStateLoss();
    }

    /* renamed from: b */
    public final void mo13933b(Exception exc) {
        mo13931a(exc);
    }

    /* renamed from: d */
    public final void mo13935d(Exception exc) {
        mo13931a(exc);
    }

    /* renamed from: a */
    public final void mo13931a(Exception exc) {
        if (this.f20649i != null) {
            this.f20649i.mo12403a(exc, new C7537d(this));
        }
    }

    /* renamed from: b */
    public final void mo13932b(C7514m mVar) {
        C4575an.m10981a((int) R.string.f0z);
        mo13929a(mVar);
    }

    /* renamed from: c */
    public final void mo13934c(Exception exc) {
        C4602l.m11047a(getContext(), (Throwable) exc, (int) R.string.f12);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this.f20660u) {
            i = R.style.yw;
        } else {
            i = R.style.yv;
        }
        setStyle(1, i);
    }

    public final void onActivityCreated(Bundle bundle) {
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = getDialog().getWindow();
        if (window != null) {
            if (!this.f20652m || (!this.f20642b && !C3894h.m9842a(getContext()))) {
                window.addFlags(PreloadTask.BYTE_UNIT_NUMBER);
            } else {
                window.clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
            if (this.f20652m) {
                window.setGravity(80);
            } else {
                window.setGravity(8388613);
            }
            window.setSoftInputMode(48);
            if (this.f20660u) {
                window.setLayout(-1, -2);
                LayoutParams attributes = window.getAttributes();
                attributes.width = C3922z.m9910c();
                attributes.height = C3922z.m9908b() - C3922z.m9912d();
                window.setAttributes(attributes);
                return;
            }
            window.setLayout(-1, -1);
        }
    }

    /* renamed from: a */
    public final void mo13930a(C7515n nVar) {
        if (this.f18412j && nVar != null) {
            User user = (User) this.f20646f.get("data_user_in_room");
            IMessageManager iMessageManager = (IMessageManager) this.f20646f.get("data_message_manager");
            if (iMessageManager != null) {
                long id = this.f20650k.getId();
                C7810ao aoVar = new C7810ao();
                C8845b bVar = new C8845b();
                bVar.f24132c = id;
                bVar.f24133d = nVar.f20633a;
                bVar.f24136g = true;
                aoVar.baseMessage = bVar;
                aoVar.f21500i = 1;
                if (user != null) {
                    aoVar.f21492a = user;
                } else {
                    aoVar.f21492a = User.from(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a());
                }
                aoVar.f21499h = nVar.f20635c;
                aoVar.f21496e = 0;
                aoVar.f21494c = nVar.f20637e;
                aoVar.f21505n = true;
                iMessageManager.insertMessage(aoVar, true);
            }
            C8843a aVar = nVar.f20634b;
            if (aVar != null) {
                C7654y.m15668a().f21084a = aVar;
                this.f20644d.f20788u.postValue(C7595ao.PROP);
            } else {
                C3831a.m9716d("GiftDialogFragment", "TaskGiftSendSuccess return wallet null!");
            }
            this.f20644d.f20763J++;
            this.f20644d.f20780m.postValue(Boolean.valueOf(true));
            this.f20644d.f20791x.postValue(Boolean.valueOf(true));
            if (this.f20659t) {
                dismiss();
                C7517p pVar = new C7517p();
                pVar.f20639a = true;
                C4495a.m10823a().mo10301a((Object) pVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo13929a(C7514m mVar) {
        if (mVar != null) {
            GiftDialogViewModel giftDialogViewModel = this.f20644d;
            int a = giftDialogViewModel.f20765L.mo13951a(mVar.f20613e);
            if (this.f20649i == null || this.f20649i.mo12402a(mVar, a, !this.f20654o)) {
                if (mVar.f20623o != null && !mVar.f20623o.isEmpty()) {
                    C7649u.m15656a().mo14012a(mVar.f20623o);
                }
                ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14527a(true);
                this.f20644d.f20755B.postValue(mVar);
                GiftDialogViewModel giftDialogViewModel2 = this.f20644d;
                if (!(giftDialogViewModel2.f20762I == null || (giftDialogViewModel2.f20762I.f20613e == mVar.f20613e && giftDialogViewModel2.f20762I.f20614f == mVar.f20614f && giftDialogViewModel2.f20762I.f20620l == mVar.f20620l))) {
                    giftDialogViewModel2.mo13949b();
                }
                giftDialogViewModel2.f20762I = mVar;
                C7505d findGiftById = GiftManager.inst().findGiftById(mVar.f20613e);
                if (findGiftById != null) {
                    if (findGiftById.mo13922a() || findGiftById.f20544e == 11) {
                        this.f20644d.mo13949b();
                    }
                    if (this.f20654o || this.f20656q) {
                        this.f20644d.f20781n.postValue(Boolean.valueOf(true));
                        boolean z = this.f20656q;
                    } else if (!findGiftById.mo13922a()) {
                        this.f20644d.f20780m.postValue(Boolean.valueOf(true));
                    }
                    IMessageManager iMessageManager = (IMessageManager) this.f20646f.get("data_message_manager");
                    User user = (User) this.f20646f.get("data_user_in_room");
                    List<C7810ao> b = C7519o.m15515b(this.f20650k.getId(), mVar, this.f20651l, user);
                    if (iMessageManager != null) {
                        if (C9414h.m18630a(b)) {
                            iMessageManager.insertMessage(C7519o.m15512a(this.f20650k.getId(), mVar, this.f20651l, user));
                        } else {
                            for (C7810ao insertMessage : b) {
                                iMessageManager.insertMessage(insertMessage);
                            }
                        }
                    }
                    if (findGiftById.f20544e == 11) {
                        C7221a aVar = this.f20661v;
                        C7501b bVar = mVar.f20625q;
                        long j = mVar.f20613e;
                        User user2 = this.f20651l;
                        DataCenter dataCenter = this.f20646f;
                        if (!(bVar == null || bVar.f20518a == null)) {
                            aVar.f19606d = j;
                            aVar.f19607e = user2;
                            aVar.f19608f = dataCenter;
                            C7502a aVar2 = bVar.f20518a;
                            if (!(aVar2 == null || C4127e.m10264a().f11317a == null)) {
                                C7501b.m15503a(aVar2);
                            }
                        }
                        dismissAllowingStateLoss();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13928a(int i, C7525b bVar) {
        String str;
        boolean z;
        int i2;
        String str2;
        int i3;
        String str3;
        String str4;
        C7525b bVar2 = bVar;
        long j = 0;
        long longValue = ((Long) this.f20646f.get("data_gift_group_id", Long.valueOf(0))).longValue();
        GiftDialogViewModel giftDialogViewModel = this.f20644d;
        String str5 = this.f20653n;
        if (C7565d.GUEST == giftDialogViewModel.f20770c) {
            str = "guest_tuya_gift";
        } else {
            str = "tuya_gift";
        }
        String str6 = str;
        HashSet hashSet = new HashSet();
        try {
            C7526c cVar = (C7526c) giftDialogViewModel.f20782o.getValue();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("UID", ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b());
            jSONObject.put("room_id", giftDialogViewModel.f20772e.getId());
            jSONObject.put("source", giftDialogViewModel.f20772e.getUserFrom());
            jSONObject.put("request_id", giftDialogViewModel.f20772e.getRequestId());
            jSONObject.put("log_pb", giftDialogViewModel.f20772e.getLog_pb());
            if (!TextUtils.isEmpty(giftDialogViewModel.f20772e.getSourceType())) {
                jSONObject.put("moment_room_source", giftDialogViewModel.f20772e.getSourceType());
            }
            if (cVar.f20674a == C7564c.DOODLE_GIFT) {
                i2 = 0;
                for (C7648t tVar : cVar.f20678e.f20670a) {
                    hashSet.add(Long.valueOf(tVar.f21073c));
                    i2 += tVar.f21074d;
                }
                jSONObject.put("gift_id", hashSet);
            } else {
                i2 = 0;
            }
            if (giftDialogViewModel.f20770c == C7565d.GUEST) {
                jSONObject.put("UID", giftDialogViewModel.f20773f.getId());
            }
            jSONObject.put("enter_from", str5);
            String str7 = "event_page";
            if (giftDialogViewModel.f20768a) {
                str2 = "live_take_detail";
            } else {
                str2 = "live_detail";
            }
            jSONObject.put(str7, str2);
            HashMap hashMap = new HashMap();
            if (longValue != 0) {
                hashMap.put("team_id", String.valueOf(longValue));
                String str8 = "top_anchor_id";
                if (giftDialogViewModel.f20773f == null) {
                    str4 = "";
                } else {
                    str4 = giftDialogViewModel.f20773f.getIdStr();
                }
                hashMap.put(str8, str4);
            }
            hashMap.put("request_id", giftDialogViewModel.f20772e.getRequestId());
            hashMap.put("log_pb", giftDialogViewModel.f20772e.getLog_pb());
            hashMap.put("gift_cnt", String.valueOf(i));
            HashMap hashMap2 = new HashMap();
            if (bVar2 == null || C9414h.m18630a(bVar2.f20670a)) {
                hashMap2.put(Long.valueOf(998), Integer.valueOf(1));
            } else {
                for (C7648t tVar2 : bVar2.f20670a) {
                    if (!hashMap2.containsKey(Long.valueOf(tVar2.f21073c))) {
                        hashMap2.put(Long.valueOf(tVar2.f21073c), Integer.valueOf(1));
                    } else {
                        hashMap2.put(Long.valueOf(tVar2.f21073c), Integer.valueOf(((Integer) hashMap2.get(Long.valueOf(tVar2.f21073c))).intValue() + 1));
                    }
                }
            }
            hashMap.put("gift_info", C7459a.m15414a(hashMap2));
            hashMap.put("is_first_consume", String.valueOf(((IWalletService) C4116c.m10249a(IWalletService.class)).isFirstConsume(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a())));
            hashMap.put("growth_deepevent", "1");
            C8049c a = C8049c.m15979a();
            String str9 = "send_gift";
            Object[] objArr = new Object[4];
            String obj = hashSet.toString();
            if (giftDialogViewModel.f20770c == C7565d.GUEST) {
                i3 = C8058i.f22019b;
            } else {
                i3 = C8058i.f22018a;
            }
            int i4 = i3;
            if (giftDialogViewModel.f20773f != null) {
                j = giftDialogViewModel.f20773f.getId();
            }
            r9 = r9;
            Object[] objArr2 = objArr;
            z = true;
            try {
                C8062m mVar = new C8062m(str6, obj, i2, i4, j);
                objArr2[0] = mVar;
                C8059j jVar = new C8059j();
                if (giftDialogViewModel.f20768a) {
                    str3 = "live_take_detail";
                } else {
                    str3 = "live_detail";
                }
                objArr2[1] = jVar.mo14213a(str3).mo14215c("bottom_tab").mo14214b("live_interact").mo14218f("other");
                objArr2[2] = Room.class;
                objArr2[3] = ((C4133a) C4116c.m10249a(C4133a.class)).getLinkCrossRoomLog();
                a.mo14202a(str9, hashMap, objArr2);
            } catch (Exception e) {
                e = e;
                C3831a.m9716d("GiftDialogViewModel", e.toString());
                ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14527a(z);
                dismiss();
            }
        } catch (Exception e2) {
            e = e2;
            z = true;
            C3831a.m9716d("GiftDialogViewModel", e.toString());
            ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14527a(z);
            dismiss();
        }
        ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14527a(z);
        dismiss();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        Widget widget;
        super.onViewCreated(view, bundle);
        if (this.f20650k == null) {
            dismissAllowingStateLoss();
            return;
        }
        long j2 = 0;
        if (this.f20650k != null) {
            j = this.f20650k.getOwnerUserId();
        } else {
            j = 0;
        }
        if (this.f20643c == C7565d.GUEST) {
            j = this.f20651l.getId();
        }
        this.f20647g = new C7547n(this.f20650k, j, this.f20653n);
        this.f20647g.mo8520a(this);
        this.f20644d = (GiftDialogViewModel) C0214z.m438a((Fragment) this).mo359a(GiftDialogViewModel.class);
        this.f20644d.f20772e = this.f20650k;
        this.f20644d.f20768a = this.f20642b;
        this.f20644d.f20769b = this.f20652m;
        this.f20644d.f20773f = this.f20651l;
        this.f20644d.f20770c = this.f20643c;
        this.f20644d.f20774g = this.f20655p;
        this.f20644d.f20775h = this.f20659t;
        if (this.f20646f != null) {
            this.f20646f.lambda$put$1$DataCenter("data_gift_dialog_view_model", this.f20644d);
        }
        this.f20644d.f20782o.observe(this, new C7535b(this));
        this.f20644d.f20783p.observe(this, new C7536c(this));
        this.f20644d.f20784q.observe(this, new C7538e(this));
        this.f20644d.f20785r.observe(this, new C7539f(this));
        this.f20644d.f20761H.observe(this, new C7540g(this));
        this.f20644d.f20780m.observe(this, new C7541h(this));
        View view2 = getView();
        if (view2 != null) {
            this.f20658s = view2.findViewById(R.id.a6c);
            this.f20658s.setOnClickListener(new C7542i(this));
            this.f20657r = view2.findViewById(R.id.e56);
            this.f20662w = view2.findViewById(R.id.e_h);
            this.f20662w.setOnClickListener(new C7543j(this));
            this.f20645e = WidgetManager.m22273of((Fragment) this, view2);
            this.f20645e.setDataCenter(this.f20646f);
            WidgetManager widgetManager = this.f20645e;
            boolean z = this.f20652m;
            C7565d dVar = this.f20643c;
            if (!z || dVar != C7565d.GUEST) {
                widget = null;
            } else {
                widget = new GiftPanelGuestInfoWidget();
            }
            widgetManager.load(R.id.akz, widget);
            final GiftPanelListWidget giftPanelListWidget = new GiftPanelListWidget();
            this.f20645e.load(R.id.al6, giftPanelListWidget);
            final boolean isGiftListLoaded = GiftManager.inst().isGiftListLoaded();
            final Widget a = C7534ah.m15538a(this.f20643c, 0, getActivity());
            if (isGiftListLoaded) {
                this.f20645e.load(R.id.al9, C7534ah.m15538a(this.f20643c, GiftManager.inst().getCurrentStrategyByLiveType(), getActivity()));
            } else {
                this.f20645e.load(R.id.al9, a);
            }
            C75232 r13 = new C4128f() {
                /* renamed from: a */
                public final void mo8456a(List<C7505d> list) {
                    if (giftPanelListWidget instanceof GiftPanelListWidget) {
                        ((GiftPanelListWidget) giftPanelListWidget).mo13967b(list);
                    }
                }

                /* renamed from: b */
                public final void mo8457b(List<GiftPage> list) {
                    if (giftPanelListWidget instanceof GiftPanelListWidget) {
                        ((GiftPanelListWidget) giftPanelListWidget).mo13968c(list);
                    }
                    if (!isGiftListLoaded) {
                        C7521a.this.f20645e.unload(a);
                        C7521a.this.f20645e.load(R.id.al9, C7534ah.m15538a(C7521a.this.f20643c, 1, C7521a.this.getActivity()));
                    }
                }
            };
            GiftManager inst = GiftManager.inst();
            if (this.f20650k != null) {
                j2 = this.f20650k.getId();
            }
            inst.syncGiftList(r13, j2, 3, this.f20642b);
            WidgetManager widgetManager2 = this.f20645e;
            ((Boolean) LiveSettingKeys.XT_DOODLE_GIFT_ENABLE.mo9431a()).booleanValue();
            widgetManager2.load(R.id.akt, new GiftPanelDoodleWidget());
            if (!GiftManager.inst().hideBottomBar()) {
                this.f20645e.load(R.id.al8, (Widget) C4501b.m10832a().f12274a.get(FakeMtGiftPanelBottomWidget.class));
            }
            GiftManager.inst().mHideBottomBar.observe(this, new C7544k(view2));
            this.f20645e.load(R.id.al_, null);
            this.f20645e.load(R.id.al0, null);
            this.f20645e.load(R.id.al7, new LiveGiftHonorLevelWidget());
            this.f20645e.load(R.id.e56, new GiftEndWidget(this.f20646f));
            view2.findViewById(R.id.aks).setBackgroundResource(C7454d.m15401a().mo13861b());
            if (this.f20659t) {
                Dialog dialog = getDialog();
                if (!(dialog == null || dialog.getWindow() == null)) {
                    Window window = dialog.getWindow();
                    window.addFlags(2);
                    window.setDimAmount(0.7f);
                }
            }
        }
        if (this.f20661v != null) {
            this.f20661v.f19609g = this.f20644d;
        }
        this.f20663x = false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.ai6, viewGroup, false);
    }

    /* renamed from: a */
    public static C7521a m15516a(Activity activity, Room room, User user, C7595ao aoVar, boolean z, boolean z2, String str, boolean z3, C7221a aVar) {
        boolean z4;
        C7521a aVar2 = new C7521a();
        aVar2.f20641a = activity;
        aVar2.f20650k = room;
        aVar2.f20651l = user;
        aVar2.f20642b = z;
        aVar2.f20652m = z2;
        aVar2.f20653n = str;
        aVar2.f20659t = z3;
        if (user == null || user.getId() == room.getOwnerUserId()) {
            aVar2.f20643c = C7565d.ANCHOR;
        } else {
            aVar2.f20643c = C7565d.GUEST;
        }
        boolean z5 = false;
        if (((Integer) LiveSettingKeys.LIVE_GIFT_DIALOG_STYLE.mo9431a()).intValue() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        aVar2.f20654o = z4;
        aVar2.f20655p = aoVar;
        aVar2.f20656q = false;
        if (z2 && (z || C3894h.m9842a(activity))) {
            z5 = true;
        }
        aVar2.f20660u = z5;
        aVar2.f20661v = aVar;
        return aVar2;
    }
}
