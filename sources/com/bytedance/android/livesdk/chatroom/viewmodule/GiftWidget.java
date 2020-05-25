package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.gift.C4117a;
import com.bytedance.android.live.gift.C4121b;
import com.bytedance.android.live.gift.C4125c;
import com.bytedance.android.live.gift.C4127e;
import com.bytedance.android.live.linkpk.C4133a;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.live.room.p254a.C4180a;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.api.TaskGiftApi;
import com.bytedance.android.livesdk.chatroom.event.C5180az;
import com.bytedance.android.livesdk.chatroom.event.C5192l;
import com.bytedance.android.livesdk.chatroom.model.C5730as;
import com.bytedance.android.livesdk.chatroom.model.TaskGiftEvent;
import com.bytedance.android.livesdk.chatroom.p325ui.C6205fg;
import com.bytedance.android.livesdk.chatroom.p325ui.FastGiftView;
import com.bytedance.android.livesdk.chatroom.presenter.C5777ab;
import com.bytedance.android.livesdk.chatroom.presenter.C5778ac;
import com.bytedance.android.livesdk.chatroom.presenter.C5899y;
import com.bytedance.android.livesdk.chatroom.presenter.C5899y.C5901a;
import com.bytedance.android.livesdk.chatroom.viewmodule.p326a.p327a.C6432b;
import com.bytedance.android.livesdk.chatroom.viewmodule.p326a.p327a.C6434d;
import com.bytedance.android.livesdk.chatroom.viewmodule.p326a.p327a.C6435e;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C7519o;
import com.bytedance.android.livesdk.gift.C7624q;
import com.bytedance.android.livesdk.gift.C7625r.C7626a;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.dialog.C7244a;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.p354b.C7218c;
import com.bytedance.android.livesdk.gift.p355c.C7221a;
import com.bytedance.android.livesdk.gift.p357e.C7315f;
import com.bytedance.android.livesdk.gift.panel.C7521a;
import com.bytedance.android.livesdk.gift.panel.widget.C7595ao;
import com.bytedance.android.livesdk.gift.panel.widget.FakeMtGiftPanelBottomWidget;
import com.bytedance.android.livesdk.gift.panel.widget.MtGiftPanelBottomWidget;
import com.bytedance.android.livesdk.message.C7776b;
import com.bytedance.android.livesdk.message.C7791e;
import com.bytedance.android.livesdk.message.model.C7793a;
import com.bytedance.android.livesdk.message.model.C7810ao;
import com.bytedance.android.livesdk.message.model.C8017z;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4501b;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4600j;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.p399o.C8065e.C8066a;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdk.p421v.C8368a;
import com.bytedance.android.livesdk.p421v.C8374c;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.message.C8845b;
import com.bytedance.android.livesdkapi.p432d.C8612a;
import com.bytedance.android.livesdkapi.p449g.C8745a;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.C1673aa;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

public class GiftWidget extends LiveRecyclableWidget implements C0199s<KVData>, C5901a {

    /* renamed from: g */
    private static final String f17029g = "com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget";

    /* renamed from: a */
    public boolean f17030a;

    /* renamed from: b */
    public Room f17031b;

    /* renamed from: c */
    User f17032c;

    /* renamed from: d */
    VideoGiftWidget f17033d;

    /* renamed from: e */
    C7315f f17034e;

    /* renamed from: f */
    long f17035f;

    /* renamed from: h */
    private C5899y f17036h;

    /* renamed from: i */
    private boolean f17037i;

    /* renamed from: j */
    private JSONObject f17038j;

    /* renamed from: k */
    private C7221a f17039k;

    /* renamed from: l */
    private DoodleWidget f17040l;

    /* renamed from: m */
    private NormalGiftAnimWidget f17041m;

    /* renamed from: n */
    private C7521a f17042n;

    /* renamed from: o */
    private C7244a f17043o;

    /* renamed from: p */
    private boolean f17044p;

    /* renamed from: q */
    private C6293c f17045q;

    /* renamed from: r */
    private C6291a f17046r;

    /* renamed from: s */
    private C6292b f17047s;

    /* renamed from: t */
    private C6600d f17048t;

    /* renamed from: u */
    private boolean f17049u;

    /* renamed from: v */
    private int f17050v;

    /* renamed from: w */
    private C1690c f17051w;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget$a */
    class C6291a implements C6601a {

        /* renamed from: b */
        private View f17059b;

        /* renamed from: c */
        private C8374c f17060c;

        public final void onClick(View view) {
        }

        private C6291a() {
        }

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
            if (aVar instanceof C6435e) {
                if (this.f17059b != null) {
                    this.f17059b.setVisibility(((C6435e) aVar).f17717a);
                }
                if (((C6435e) aVar).f17717a == 8 && this.f17060c != null) {
                    this.f17060c.dismiss();
                }
            } else if (aVar instanceof C6434d) {
                if (this.f17059b != null && this.f17059b.getVisibility() == 0 && this.f17059b.getParent() != null) {
                    C6434d dVar = (C6434d) aVar;
                    if (this.f17060c == null) {
                        this.f17060c = (C8374c) ((C8374c) C8374c.m16598b(GiftWidget.this.context).mo14562a((int) R.layout.bx8)).mo14561a();
                        PopupWindow popupWindow = this.f17060c.f22761a;
                        if (popupWindow != null) {
                            popupWindow.setFocusable(false);
                            popupWindow.setOutsideTouchable(false);
                        }
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C3922z.m9905a((int) R.string.hs2, Integer.valueOf(dVar.f17715a), Integer.valueOf(dVar.f17716b)));
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#ffc95c")), 0, String.valueOf(dVar.f17715a).length(), 33);
                    ((TextView) this.f17060c.mo14574d().findViewById(R.id.d8j)).setText(spannableStringBuilder);
                    if (!this.f17060c.mo14577e()) {
                        this.f17060c.mo14566a(this.f17059b, 1, 0, 0, C3922z.m9899a(-2.0f));
                    }
                }
            } else if ((aVar instanceof C6432b) && this.f17060c != null) {
                this.f17060c.dismiss();
            }
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
            if (this.f17060c != null) {
                this.f17060c.dismiss();
                this.f17060c = null;
            }
        }

        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
            this.f17059b = view;
            FastGiftView fastGiftView = new FastGiftView(GiftWidget.this.getContext());
            ((FrameLayout) view).addView(fastGiftView);
            Activity activity = (Activity) GiftWidget.this.context;
            String str = (String) dataCenter.get("log_enter_live_source");
            fastGiftView.f15474f = dataCenter;
            fastGiftView.f15475g = (Room) dataCenter.get("data_room");
            fastGiftView.f15473e.f15414d = fastGiftView.f15475g;
            fastGiftView.f15476h = ((Boolean) dataCenter.get("data_is_anchor")).booleanValue();
            fastGiftView.f15478j = activity;
            fastGiftView.f15480l = str;
            boolean z = true;
            fastGiftView.f15477i = true;
            fastGiftView.f15479k = ((Boolean) dataCenter.get("data_is_portrait")).booleanValue();
            fastGiftView.f15473e.f15411a = fastGiftView.f15480l;
            fastGiftView.mo11791b();
            Room room = (Room) dataCenter.get("data_room", null);
            if (room == null || room.mRoomAuthStatus == null || room.mRoomAuthStatus.enableGift) {
                z = false;
            }
            if (GiftManager.inst().getFastGift() == null || z) {
                this.f17059b.setVisibility(8);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget$b */
    class C6292b implements C6601a {

        /* renamed from: b */
        private boolean f17062b;

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
        }

        private C6292b() {
            this.f17062b = true;
        }

        public final void onClick(View view) {
            int i;
            int i2;
            int i3;
            String str;
            if (this.f17062b) {
                i = R.drawable.c4k;
            } else {
                i = R.drawable.c4l;
            }
            view.setBackgroundResource(i);
            C4495a a = C4495a.m10823a();
            if (this.f17062b) {
                i2 = 3;
            } else {
                i2 = 4;
            }
            a.mo10301a((Object) new C8745a(i2));
            if (this.f17062b) {
                i3 = R.string.ehv;
            } else {
                i3 = R.string.ehw;
            }
            C4575an.m10981a(i3);
            this.f17062b = !this.f17062b;
            GiftWidget giftWidget = GiftWidget.this;
            StringBuilder sb = new StringBuilder("更新礼物特效开启状态，是否开启: ");
            sb.append(this.f17062b);
            giftWidget.mo12395a(sb.toString());
            C4525b.f12311G.mo10346a(Boolean.valueOf(this.f17062b));
            C8049c a2 = C8049c.m15979a();
            String str2 = "gift_hide";
            Object[] objArr = new Object[2];
            objArr[0] = Room.class;
            C8059j f = new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click");
            if (GiftWidget.this.f17030a) {
                str = "live_take_detail";
            } else {
                str = "live_detail";
            }
            objArr[1] = f.mo14213a(str);
            a2.mo14203a(str2, objArr);
        }

        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
            int i;
            int i2;
            this.f17062b = ((Boolean) C4525b.f12311G.mo10345a()).booleanValue();
            if (this.f17062b) {
                i = R.drawable.c4l;
            } else {
                i = R.drawable.c4k;
            }
            view.setBackgroundResource(i);
            C4495a a = C4495a.m10823a();
            if (this.f17062b) {
                i2 = 4;
            } else {
                i2 = 3;
            }
            a.mo10301a((Object) new C8745a(i2));
            GiftWidget giftWidget = GiftWidget.this;
            StringBuilder sb = new StringBuilder("是否开启礼物特效: ");
            sb.append(this.f17062b);
            giftWidget.mo12395a(sb.toString());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget$c */
    class C6293c implements C6601a {

        /* renamed from: b */
        private C8368a f17064b;

        /* renamed from: c */
        private View f17065c;

        /* renamed from: d */
        private C1690c f17066d;

        private C6293c() {
        }

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
            String str;
            if (aVar instanceof C6435e) {
                if (this.f17065c != null) {
                    this.f17065c.setVisibility(((C6435e) aVar).f17717a);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("event_name", "TOOLBAR_GIFT_ON_COMMAND");
                String str2 = "view_status";
                if (this.f17065c.getVisibility() == 0) {
                    str = "VISIBLE";
                } else {
                    str = "GONE";
                }
                hashMap.put(str2, str);
                C8064d.m16005b().mo9199b("ttlive_gift", (Map<String, ?>) hashMap);
            }
        }

        public final void onClick(View view) {
            if (!(GiftWidget.this.f17031b == null || !GiftWidget.this.f17031b.isOfficial() || GiftWidget.this.dataCenter == null)) {
                GiftWidget.this.dataCenter.lambda$put$1$DataCenter("cmd_official_hide", Boolean.valueOf(true));
            }
            if (GiftWidget.this.dataCenter != null) {
                Bundle bundle = new Bundle();
                bundle.putString("type", "bottom_tab");
                GiftWidget.this.dataCenter.lambda$put$1$DataCenter("data_gift_log_extra", bundle);
                GiftWidget.this.dataCenter.lambda$put$1$DataCenter("data_gift_panel_type", C7595ao.GIFT);
                GiftWidget.this.mo12393a((User) null);
            }
            if (this.f17064b != null && this.f17064b.mo14577e()) {
                this.f17064b.dismiss();
            }
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
            if (this.f17066d != null && !this.f17066d.isDisposed()) {
                this.f17066d.dispose();
            }
        }

        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
            this.f17065c = view;
            Room room = (Room) dataCenter.get("data_enter_room");
            if (room == null) {
                room = (Room) dataCenter.get("data_room");
            }
            if (room != null && room.isOfficial()) {
                view.setBackgroundResource(R.drawable.e2m);
            }
        }
    }

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    public int getLayoutId() {
        return R.layout.asd;
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x0230  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12396a(java.lang.Throwable r11, java.lang.Runnable r12) {
        /*
            r10 = this;
            boolean r0 = r10.isViewValid()
            if (r0 == 0) goto L_0x0234
            android.content.Context r0 = r10.context
            if (r0 != 0) goto L_0x000c
            goto L_0x0234
        L_0x000c:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r10.dataCenter
            java.lang.String r1 = "data_is_portrait"
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            boolean r0 = r11 instanceof com.bytedance.android.livesdk.gift.p376f.C7449a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x01b1
            boolean r0 = r11 instanceof com.bytedance.android.live.p180b.p181a.p183b.C2949a
            if (r0 == 0) goto L_0x0031
            r3 = r11
            com.bytedance.android.live.b.a.b.a r3 = (com.bytedance.android.live.p180b.p181a.p183b.C2949a) r3
            int r3 = r3.getErrorCode()
            r4 = 40001(0x9c41, float:5.6053E-41)
            if (r3 != r4) goto L_0x0031
            goto L_0x01b1
        L_0x0031:
            if (r0 == 0) goto L_0x006f
            r3 = r11
            com.bytedance.android.live.b.a.b.a r3 = (com.bytedance.android.live.p180b.p181a.p183b.C2949a) r3
            int r3 = r3.getErrorCode()
            r4 = 90501(0x16185, float:1.26819E-40)
            if (r3 != r4) goto L_0x006f
            com.bytedance.android.livesdk.gift.u r11 = com.bytedance.android.livesdk.gift.C7649u.m15656a()
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r10.f17031b
            long r3 = r0.getId()
            r11.mo14013b(r3)
            com.bytedance.android.livesdk.widget.h$a r11 = new com.bytedance.android.livesdk.widget.h$a
            android.content.Context r0 = r10.context
            r11.<init>(r0)
            com.bytedance.android.livesdk.widget.h$a r11 = r11.mo14996a(r1)
            r0 = 2132550910(0x7f1c24fe, float:2.0755164E38)
            com.bytedance.android.livesdk.widget.h$a r11 = r11.mo15012d(r0)
            r0 = 2132550471(0x7f1c2347, float:2.0754274E38)
            com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget$4 r1 = new com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget$4
            r1.<init>()
            com.bytedance.android.livesdk.widget.h$a r11 = r11.mo15003b(r2, r0, r1)
            r11.mo15011d()
            goto L_0x022e
        L_0x006f:
            if (r0 == 0) goto L_0x0172
            com.bytedance.android.live.b.a.b.a r11 = (com.bytedance.android.live.p180b.p181a.p183b.C2949a) r11
            int r0 = r11.getErrorCode()
            r1 = 43011(0xa803, float:6.0271E-41)
            if (r0 != r1) goto L_0x0153
            com.bytedance.android.live.core.setting.p<java.lang.Boolean> r1 = com.bytedance.android.livesdk.config.LiveSettingKeys.SEND_GIFT_NOTFANS_DIALOG_ISOPEN
            java.lang.Object r1 = r1.mo9431a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0153
            boolean r1 = r10.f17030a
            if (r1 != 0) goto L_0x0153
            com.bytedance.android.live.core.setting.p<java.lang.String> r1 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.SEND_GIFT_FAIL_DIALOG_URL
            java.lang.Object r1 = r1.mo9431a()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0153
            java.lang.Class<com.bytedance.android.live.c.a> r11 = com.bytedance.android.live.p221c.C3807a.class
            com.bytedance.android.live.base.b r11 = com.bytedance.android.live.p245d.C4116c.m10249a(r11)
            if (r11 == 0) goto L_0x0116
            com.bytedance.ies.sdk.widgets.DataCenter r11 = r10.dataCenter
            java.lang.String r1 = "log_action_type"
            java.lang.Object r11 = r11.get(r1)
            r6 = r11
            java.lang.String r6 = (java.lang.String) r6
            com.bytedance.ies.sdk.widgets.DataCenter r11 = r10.dataCenter
            boolean r11 = com.bytedance.android.livesdk.p279af.C4600j.m11040b(r11)
            if (r11 != 0) goto L_0x00d8
            com.bytedance.ies.sdk.widgets.DataCenter r11 = r10.dataCenter
            boolean r11 = com.bytedance.android.livesdk.p279af.C4600j.m11043d(r11)
            if (r11 == 0) goto L_0x00c0
            goto L_0x00d8
        L_0x00c0:
            java.lang.Class<com.bytedance.android.live.c.a> r11 = com.bytedance.android.live.p221c.C3807a.class
            com.bytedance.android.live.base.b r11 = com.bytedance.android.live.p245d.C4116c.m10249a(r11)
            r3 = r11
            com.bytedance.android.live.c.a r3 = (com.bytedance.android.live.p221c.C3807a) r3
            android.content.Context r4 = r10.getContext()
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r10.f17031b
            java.lang.String r7 = "fans_gift"
            boolean r8 = r10.f17037i
            r9 = 0
            r3.showJoinFansDialog(r4, r5, r6, r7, r8, r9)
            goto L_0x0116
        L_0x00d8:
            com.bytedance.ies.sdk.widgets.DataCenter r11 = r10.dataCenter
            boolean r11 = com.bytedance.android.livesdk.p279af.C4600j.m11040b(r11)
            if (r11 == 0) goto L_0x00e7
            com.bytedance.ies.sdk.widgets.DataCenter r11 = r10.dataCenter
            java.util.Map r11 = com.bytedance.android.livesdk.p279af.C4600j.m11041c(r11)
            goto L_0x00ed
        L_0x00e7:
            com.bytedance.ies.sdk.widgets.DataCenter r11 = r10.dataCenter
            java.util.Map r11 = com.bytedance.android.livesdk.p279af.C4600j.m11044e(r11)
        L_0x00ed:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r11)
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.lang.String r11 = "live_ad"
            java.lang.String r1 = r1.toString()
            r9.put(r11, r1)
            java.lang.Class<com.bytedance.android.live.c.a> r11 = com.bytedance.android.live.p221c.C3807a.class
            com.bytedance.android.live.base.b r11 = com.bytedance.android.live.p245d.C4116c.m10249a(r11)
            r3 = r11
            com.bytedance.android.live.c.a r3 = (com.bytedance.android.live.p221c.C3807a) r3
            android.content.Context r4 = r10.getContext()
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r10.f17031b
            java.lang.String r7 = "fans_gift"
            boolean r8 = r10.f17037i
            r3.showJoinFansDialog(r4, r5, r6, r7, r8, r9)
        L_0x0116:
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.lang.String r1 = "anchor_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r10.f17031b
            if (r3 == 0) goto L_0x012c
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r10.f17031b
            long r3 = r3.getOwnerUserId()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            goto L_0x012e
        L_0x012c:
            java.lang.String r3 = "0"
        L_0x012e:
            r11.put(r1, r3)
            java.lang.String r1 = "room_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r10.f17031b
            if (r3 == 0) goto L_0x0142
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r10.f17031b
            long r3 = r3.getId()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            goto L_0x0144
        L_0x0142:
            java.lang.String r3 = "0"
        L_0x0144:
            r11.put(r1, r3)
            com.bytedance.android.livesdk.o.c r1 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
            java.lang.String r3 = "livesdk_fans_club_gift_notfan_click"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.mo14202a(r3, r11, r2)
            goto L_0x0163
        L_0x0153:
            r1 = 40032(0x9c60, float:5.6097E-41)
            if (r0 != r1) goto L_0x015c
            r10.m13531a()
            goto L_0x0163
        L_0x015c:
            java.lang.String r11 = r11.getPrompt()
            com.bytedance.android.livesdk.p279af.C4575an.m10987a(r11)
        L_0x0163:
            android.content.Context r11 = r10.context
            com.bytedance.android.livesdk.p399o.C8068g.m16014a(r11)
            java.lang.String.valueOf(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r11 = r10.f17031b
            r11.getId()
            goto L_0x022e
        L_0x0172:
            boolean r0 = r11 instanceof com.bytedance.android.live.p180b.p181a.p182a.C2946b
            if (r0 == 0) goto L_0x0181
            android.content.Context r11 = r10.context
            com.bytedance.android.livesdk.p399o.C8068g.m16014a(r11)
            com.bytedance.android.livesdkapi.depend.model.live.Room r11 = r10.f17031b
            r11.getId()
            goto L_0x01a9
        L_0x0181:
            boolean r0 = r11 instanceof com.bytedance.android.live.p180b.p181a.p182a.C2947c
            if (r0 == 0) goto L_0x0190
            android.content.Context r11 = r10.context
            com.bytedance.android.livesdk.p399o.C8068g.m16014a(r11)
            com.bytedance.android.livesdkapi.depend.model.live.Room r11 = r10.f17031b
            r11.getId()
            goto L_0x01a9
        L_0x0190:
            boolean r11 = r11 instanceof com.bytedance.android.live.p180b.p181a.p182a.C2948d
            if (r11 == 0) goto L_0x019f
            android.content.Context r11 = r10.context
            com.bytedance.android.livesdk.p399o.C8068g.m16014a(r11)
            com.bytedance.android.livesdkapi.depend.model.live.Room r11 = r10.f17031b
            r11.getId()
            goto L_0x01a9
        L_0x019f:
            android.content.Context r11 = r10.context
            com.bytedance.android.livesdk.p399o.C8068g.m16014a(r11)
            com.bytedance.android.livesdkapi.depend.model.live.Room r11 = r10.f17031b
            r11.getId()
        L_0x01a9:
            r11 = 2132551369(0x7f1c26c9, float:2.0756095E38)
            com.bytedance.android.livesdk.p279af.C4575an.m10981a(r11)
            goto L_0x022e
        L_0x01b1:
            com.bytedance.android.live.core.setting.p<java.lang.Integer> r11 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE
            java.lang.Object r11 = r11.mo9431a()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            boolean r0 = com.bytedance.android.livesdkapi.p430b.C8607a.f23572a
            if (r0 == 0) goto L_0x01fd
            if (r11 == r1) goto L_0x01fd
            boolean r11 = r10.f17030a
            if (r11 == 0) goto L_0x01c8
            goto L_0x01fd
        L_0x01c8:
            com.bytedance.android.livesdk.widget.h$a r11 = new com.bytedance.android.livesdk.widget.h$a
            android.content.Context r0 = r10.context
            r11.<init>(r0, r2)
            android.content.Context r0 = r10.context
            r3 = 2132551189(0x7f1c2615, float:2.075573E38)
            java.lang.String r0 = r0.getString(r3)
            com.bytedance.android.livesdk.widget.h$a r11 = r11.mo15009c(r0)
            r0 = 2132551220(0x7f1c2634, float:2.0755793E38)
            com.bytedance.android.livesdk.chatroom.viewmodule.at r3 = new com.bytedance.android.livesdk.chatroom.viewmodule.at
            r3.<init>(r10)
            com.bytedance.android.livesdk.widget.h$a r11 = r11.mo15003b(r2, r0, r3)
            r0 = 2132550023(0x7f1c2187, float:2.0753365E38)
            com.bytedance.android.livesdk.chatroom.viewmodule.au r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.au
            r2.<init>(r10)
            com.bytedance.android.livesdk.widget.h$a r11 = r11.mo15003b(r1, r0, r2)
            r11.mo15011d()
            android.content.Context r11 = r10.context
            com.bytedance.android.livesdk.p399o.C8068g.m16014a(r11)
            goto L_0x022e
        L_0x01fd:
            r11 = 2132551364(0x7f1c26c4, float:2.0756085E38)
            com.bytedance.android.livesdk.p279af.C4575an.m10981a(r11)
            android.content.Context r11 = r10.context
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r10.f17031b
            boolean r0 = r11 instanceof android.support.p030v4.app.FragmentActivity
            if (r0 == 0) goto L_0x022e
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "key_bundle_is_anchor"
            boolean r2 = r10.f17030a
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "KEY_CHARGE_REASON"
            java.lang.String r2 = "gift"
            r0.putString(r1, r2)
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r1 = com.bytedance.android.live.wallet.IWalletService.class
            com.bytedance.android.live.base.b r1 = com.bytedance.android.live.p245d.C4116c.m10249a(r1)
            com.bytedance.android.live.wallet.IWalletService r1 = (com.bytedance.android.live.wallet.IWalletService) r1
            android.support.v4.app.FragmentActivity r11 = (android.support.p030v4.app.FragmentActivity) r11
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r10.dataCenter
            r3 = 0
            r1.showRechargeDialog(r11, r0, r2, r3)
        L_0x022e:
            if (r12 == 0) goto L_0x0233
            r12.run()
        L_0x0233:
            return
        L_0x0234:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget.mo12396a(java.lang.Throwable, java.lang.Runnable):void");
    }

    /* renamed from: a */
    public final void mo11797a(C7810ao aoVar, boolean z) {
        if (isViewValid()) {
            long j = (long) aoVar.f21496e;
            if (!(this.f17031b == null || this.f17031b.getOwner() == null || ((aoVar.f21493b != null && 0 != aoVar.f21493b.getId() && aoVar.f21493b.getId() != this.f17031b.getOwner().getId()) || (aoVar.f21505n && j == 0)))) {
                this.dataCenter.lambda$put$1$DataCenter("data_anchor_ticket_count", Long.valueOf(j));
                this.dataCenter.lambda$put$1$DataCenter("data_current_room_ticket_count", Long.valueOf(aoVar.f21497f));
            }
            if (!z || aoVar.f21505n || aoVar.f21498g == 1) {
                C7505d findGiftById = GiftManager.inst().findGiftById(aoVar.f21494c);
                if (findGiftById == null) {
                    String str = f17029g;
                    StringBuilder sb = new StringBuilder("用户本地没有该礼物， giftMessageId = ");
                    sb.append(aoVar.getMessageId());
                    sb.append(",  giftId = ");
                    sb.append(aoVar.f21494c);
                    C3831a.m9716d(str, sb.toString());
                    return;
                }
                C4121b giftType = GiftManager.inst().getGiftType(findGiftById);
                C4125c cVar = (C4125c) C4117a.m10252a().f11314a.get(giftType);
                if (cVar != null) {
                    cVar.mo8666a(aoVar);
                }
                switch (giftType) {
                    case GOLDEN_BEAN_CELL:
                        this.f17041m.mo12491a(aoVar);
                        return;
                    case FREE_CELL:
                        this.f17041m.mo12491a(aoVar);
                        return;
                    case NORMAL_GIFT:
                        this.f17041m.mo12491a(aoVar);
                        return;
                    case TASK_GIFT:
                        this.f17041m.mo12491a(aoVar);
                        return;
                    case STICKER_GIFT:
                        this.f17041m.mo12491a(aoVar);
                        return;
                    case GAME:
                        this.f17041m.mo12491a(aoVar);
                        return;
                    case MIDDLE_GIFT:
                        this.f17033d.mo12550a(aoVar);
                        return;
                    case SPECIAL_GIFT:
                        this.f17033d.mo12550a(aoVar);
                        break;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11798a(C8017z zVar, boolean z) {
        if (isViewValid() && zVar != null) {
            if (zVar.f21945b == null || 0 == zVar.f21945b.getId() || zVar.f21945b.getId() == this.f17031b.getOwner().getId()) {
                this.dataCenter.lambda$put$1$DataCenter("data_anchor_ticket_count", Long.valueOf(zVar.f21948e));
            }
            if (this.f17037i || !z) {
                this.f17040l.mo12366a(zVar);
                return;
            }
            if (zVar.f21944a != null && zVar.f21944a.getId() == ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b()) {
                this.f17040l.mo12366a(zVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo11799a(List<TaskGiftEvent> list) {
        if (isViewValid()) {
            new C6205fg(this.context, this.f17031b, list, null).show();
        }
    }

    /* renamed from: d */
    private static void m13536d() {
        C4495a.m10823a().mo10301a((Object) new C5192l(1, 2));
        C4525b.f12426bx.mo10346a(Boolean.valueOf(true));
    }

    /* renamed from: c */
    private void m13535c() {
        if (!this.f17044p || this.f17043o == null || !this.f17043o.f18412j) {
            if (this.f17042n != null && this.f17042n.f18412j) {
                this.f17042n.dismissAllowingStateLoss();
                this.f17042n = null;
            }
            return;
        }
        this.f17043o.dismissAllowingStateLoss();
        this.f17043o = null;
    }

    /* renamed from: e */
    private void m13537e() {
        C4117a.m10252a().mo9489b();
        this.f17041m.mo12488a();
        if (((Boolean) LiveSettingKeys.LIVE_SDK_NEW_EFFECT_PLAYER.mo9431a()).booleanValue()) {
            C7791e.m15852a().mo14136c();
            return;
        }
        this.f17040l.mo12365a();
        this.f17033d.mo12553b();
    }

    /* renamed from: a */
    private void m13531a() {
        new C8552a(getContext(), 0).mo14996a(true).mo15009c((CharSequence) C2240a.m6772a(getContext().getResources().getString(R.string.e5b), new Object[]{LiveSettingKeys.LIVE_MT_LOW_AGE_ANCHOR_LIMIT.mo9431a()})).mo15003b(0, (int) R.string.e9e, (OnClickListener) new C6455aq(this)).mo15003b(1, (int) R.string.e9f, C6456ar.f17761a).mo15001b().show();
    }

    public void onUnload() {
        C4501b.m10832a().f12274a.clear();
        this.f17048t.mo12670b(C6605h.GIFT, this.f17045q);
        this.f17048t.mo12670b(C6605h.FAST_GIFT, this.f17046r);
        this.f17048t.mo12670b(C6605h.GIFT_ANIMATION, this.f17047s);
        m13537e();
        m13535c();
        if (this.f17034e != null && this.f17034e.isShowing()) {
            this.f17034e.dismiss();
            this.f17034e = null;
        }
        if (this.f17051w != null && !this.f17051w.isDisposed()) {
            this.f17051w.dispose();
        }
        this.dataCenter.removeObserver(this);
        ((C4133a) C4116c.m10249a(C4133a.class)).removeObserve();
        this.f17036h.mo8247a();
        mo12395a("GiftWidget unLoad");
        if (this.f17039k != null) {
            C7221a aVar = this.f17039k;
            C4127e.m10264a();
            if (aVar.f19603a != null && !aVar.f19603a.isDisposed()) {
                aVar.f19603a.dispose();
            }
        }
        this.f17042n = null;
        this.f17043o = null;
        this.f17034e = null;
    }

    /* renamed from: a */
    public final void mo12395a(String str) {
        m13534a(str, null, null);
    }

    public void onInit(Object... objArr) {
        this.f17036h = new C5899y();
    }

    /* renamed from: a */
    public final void mo12394a(C7810ao aoVar) {
        if (aoVar != null) {
            aoVar.f21504m = true;
            mo11797a(aoVar, false);
        }
    }

    /* renamed from: b */
    public final void mo11800b(Throwable th) {
        mo12396a(th, (Runnable) null);
    }

    public void onEvent(C7218c cVar) {
        if (this.isViewValid && cVar.f19596a == 1) {
            m13532a((User) null, true);
        }
    }

    /* renamed from: a */
    private <T> void m13533a(Class<T> cls) {
        C4495a.m10823a().mo10300a(cls).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6545f((C1710e<? super T>) new C1710e<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C5180az) {
                    GiftWidget.this.onEvent((C5180az) t);
                } else if (t instanceof C5730as) {
                    GiftWidget.this.onEvent((C5730as) t);
                } else if (t instanceof C7218c) {
                    GiftWidget.this.onEvent((C7218c) t);
                } else {
                    if (t instanceof C5192l) {
                        GiftWidget.this.onEvent((C5192l) t);
                    }
                }
            }
        });
    }

    public void onEvent(C5180az azVar) {
        if (isViewValid()) {
            this.dataCenter.lambda$put$1$DataCenter("data_gift_panel_type", azVar.f13875c);
            this.dataCenter.lambda$put$1$DataCenter("data_gift_log_extra", azVar.f13874b);
            this.f17035f = azVar.f13876d;
            mo12393a(azVar.f13873a);
        }
    }

    public void onEvent(C5192l lVar) {
        if (lVar != null && lVar.f13903a == 2 && lVar.f13904b == 1) {
            C4525b.f12427by.mo10346a(Boolean.valueOf(true));
            return;
        }
        if (lVar != null && lVar.f13903a == 2 && lVar.f13904b == 2) {
            C4525b.f12427by.mo10346a(Boolean.valueOf(false));
        }
    }

    /* renamed from: a */
    public final void mo12393a(User user) {
        m13532a(user, false);
        if (this.dataCenter != null) {
            this.dataCenter.lambda$put$1$DataCenter("hide_share_lead", Boolean.valueOf(true));
        }
    }

    public void onEvent(C5730as asVar) {
        if (isViewValid()) {
            C5899y yVar = this.f17036h;
            if (!yVar.f15431a) {
                yVar.f15431a = true;
                ((TaskGiftApi) C4157e.m10322a().mo9550a(TaskGiftApi.class)).getHotsoonTaskGiftEvent().mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C5777ab<Object>(yVar), (C1710e<? super Throwable>) new C5778ac<Object>(yVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo11795a(C7514m mVar) {
        String str;
        if (mVar != null) {
            ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10091a(mVar.f20611c);
            if (((C4193l) C4116c.m10249a(C4193l.class)).messageManagerHelper().mo9628a() != null && isViewValid()) {
                ((C4193l) C4116c.m10249a(C4193l.class)).messageManagerHelper().mo9628a().insertMessage(C7519o.m15511a(this.f17031b.getId(), mVar, (User) this.dataCenter.get("data_user_in_room")));
            }
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(mVar.f20632x)) {
                hashMap.put("request_page", mVar.f20632x);
            }
            hashMap.put("is_first_consume", String.valueOf(((IWalletService) C4116c.m10249a(IWalletService.class)).isFirstConsume(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a())));
            hashMap.put("growth_deepevent", "1");
            C8049c a = C8049c.m15979a();
            String str2 = "send_gift";
            Object[] objArr = new Object[3];
            C8059j jVar = new C8059j();
            if (this.f17030a) {
                str = "live_take_detail";
            } else {
                str = "live_detail";
            }
            objArr[0] = jVar.mo14213a(str).mo14215c("bottom_tab").mo14214b("live_interact").mo14218f("other");
            objArr[1] = Room.class;
            objArr[2] = C7519o.m15513a(mVar);
            a.mo14202a(str2, hashMap, objArr);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010d, code lost:
        if (r1.bottomMargin < r2) goto L_0x0127;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(java.lang.Object r15) {
        /*
            r14 = this;
            com.bytedance.ies.sdk.widgets.KVData r15 = (com.bytedance.ies.sdk.widgets.KVData) r15
            if (r15 == 0) goto L_0x0289
            java.lang.String r0 = r15.getKey()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0010
            goto L_0x0289
        L_0x0010:
            java.lang.String r0 = r15.getKey()
            r1 = -1
            int r2 = r0.hashCode()
            r3 = 0
            r4 = 1
            switch(r2) {
                case -2034855137: goto L_0x009f;
                case -1357019912: goto L_0x0095;
                case -1328547149: goto L_0x008b;
                case -763908145: goto L_0x0081;
                case -708170936: goto L_0x0076;
                case -171438776: goto L_0x006b;
                case 279172201: goto L_0x0060;
                case 333436001: goto L_0x0055;
                case 908414801: goto L_0x004b;
                case 948744782: goto L_0x0041;
                case 1055337807: goto L_0x0036;
                case 1433895618: goto L_0x002b;
                case 1954026424: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x00a9
        L_0x0020:
            java.lang.String r2 = "cmd_do_send_gift"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a9
            r1 = 5
            goto L_0x00a9
        L_0x002b:
            java.lang.String r2 = "cmd_send_gift"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a9
            r1 = 2
            goto L_0x00a9
        L_0x0036:
            java.lang.String r2 = "cmd_show_notify_special_gift"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a9
            r1 = 4
            goto L_0x00a9
        L_0x0041:
            java.lang.String r2 = "cmd_stop_special_gift"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a9
            r1 = 1
            goto L_0x00a9
        L_0x004b:
            java.lang.String r2 = "cmd_gift_entry_click"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a9
            r1 = 7
            goto L_0x00a9
        L_0x0055:
            java.lang.String r2 = "cmd_gift_dialog_switch"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a9
            r1 = 10
            goto L_0x00a9
        L_0x0060:
            java.lang.String r2 = "cmd_show_screen"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a9
            r1 = 12
            goto L_0x00a9
        L_0x006b:
            java.lang.String r2 = "cmd_show_gift_relay_dialog"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a9
            r1 = 11
            goto L_0x00a9
        L_0x0076:
            java.lang.String r2 = "cmd_normal_gift_layout_height_update"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a9
            r1 = 9
            goto L_0x00a9
        L_0x0081:
            java.lang.String r2 = "cmd_clear_gift_message"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a9
            r1 = 0
            goto L_0x00a9
        L_0x008b:
            java.lang.String r2 = "cmd_show_special_group_gift"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a9
            r1 = 3
            goto L_0x00a9
        L_0x0095:
            java.lang.String r2 = "data_pre_show_keyboard"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a9
            r1 = 6
            goto L_0x00a9
        L_0x009f:
            java.lang.String r2 = "cmd_normal_gift_layout_bottom_margin_update"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a9
            r1 = 8
        L_0x00a9:
            r0 = 0
            r2 = 2132021308(0x7f14103c, float:1.9681004E38)
            switch(r1) {
                case 0: goto L_0x0284;
                case 1: goto L_0x0283;
                case 2: goto L_0x0273;
                case 3: goto L_0x0258;
                case 4: goto L_0x024d;
                case 5: goto L_0x01cf;
                case 6: goto L_0x01c9;
                case 7: goto L_0x01bf;
                case 8: goto L_0x018d;
                case 9: goto L_0x0161;
                case 10: goto L_0x00df;
                case 11: goto L_0x00db;
                case 12: goto L_0x00b2;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            goto L_0x0288
        L_0x00b2:
            com.bytedance.android.livesdk.chatroom.viewmodule.VideoGiftWidget r0 = r14.f17033d
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r15 = r15.getData(r1)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            com.bytedance.android.livesdk.gift.effect.video.VideoGiftView r0 = r0.f17637c
            com.bytedance.android.livesdkapi.depend.live.a.a r1 = r0.f20392h
            if (r1 == 0) goto L_0x0288
            if (r15 == 0) goto L_0x00d2
            com.bytedance.android.livesdkapi.depend.live.a.a r15 = r0.f20392h
            android.widget.FrameLayout r0 = r0.f20386b
            r15.mo13780a(r0)
            return
        L_0x00d2:
            com.bytedance.android.livesdkapi.depend.live.a.a r15 = r0.f20392h
            android.widget.FrameLayout r0 = r0.f20386b
            r15.mo13785b(r0)
            goto L_0x0288
        L_0x00db:
            r14.m13535c()
            return
        L_0x00df:
            java.lang.Object r15 = r15.getData()
            com.bytedance.android.livesdk.chatroom.event.k r15 = (com.bytedance.android.livesdk.chatroom.event.C5191k) r15
            boolean r0 = r14.isViewValid()
            if (r0 == 0) goto L_0x0288
            android.content.Context r0 = r14.getContext()
            if (r0 != 0) goto L_0x00f3
            goto L_0x0288
        L_0x00f3:
            boolean r0 = r15.f13901a
            r14.f17049u = r0
            android.view.View r0 = r14.contentView
            android.view.View r0 = r0.findViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            int r2 = r15.f13902b
            boolean r15 = r15.f13901a
            if (r15 == 0) goto L_0x0110
            int r15 = r1.bottomMargin
            if (r15 >= r2) goto L_0x0288
            goto L_0x0127
        L_0x0110:
            int r15 = r14.f17050v
            if (r15 == 0) goto L_0x0117
            int r2 = r14.f17050v
            goto L_0x0127
        L_0x0117:
            android.content.Context r15 = r14.getContext()
            android.content.res.Resources r15 = r15.getResources()
            r2 = 2131886794(0x7f1202ca, float:1.9408177E38)
            float r15 = r15.getDimension(r2)
            int r2 = (int) r15
        L_0x0127:
            java.lang.String r15 = "translationY"
            float[] r5 = new float[r4]
            int r6 = r1.bottomMargin
            int r6 = r6 - r2
            float r6 = (float) r6
            r5[r3] = r6
            android.animation.ObjectAnimator r15 = android.animation.ObjectAnimator.ofFloat(r0, r15, r5)
            r5 = 300(0x12c, double:1.48E-321)
            android.animation.ObjectAnimator r15 = r15.setDuration(r5)
            android.view.View r0 = r14.contentView
            r7 = 2132019332(0x7f140884, float:1.9676996E38)
            android.view.View r0 = r0.findViewById(r7)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x015d
            java.lang.String r7 = "translationY"
            float[] r4 = new float[r4]
            int r1 = r1.bottomMargin
            int r1 = r1 - r2
            float r1 = (float) r1
            r4[r3] = r1
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r7, r4)
            android.animation.ObjectAnimator r0 = r0.setDuration(r5)
            r0.start()
        L_0x015d:
            r15.start()
            return
        L_0x0161:
            java.lang.Object r15 = r15.getData()
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            boolean r0 = r14.isViewValid()
            if (r0 == 0) goto L_0x0288
            android.content.Context r0 = r14.getContext()
            if (r0 != 0) goto L_0x0179
            goto L_0x0288
        L_0x0179:
            android.view.View r0 = r14.contentView
            android.view.View r0 = r0.findViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            r1.height = r15
            r0.setLayoutParams(r1)
            return
        L_0x018d:
            java.lang.Object r15 = r15.getData()
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            boolean r0 = r14.isViewValid()
            if (r0 == 0) goto L_0x0288
            android.content.Context r0 = r14.getContext()
            if (r0 != 0) goto L_0x01a5
            goto L_0x0288
        L_0x01a5:
            r14.f17050v = r15
            boolean r0 = r14.f17049u
            if (r0 != 0) goto L_0x01be
            android.view.View r0 = r14.contentView
            android.view.View r0 = r0.findViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            r1.bottomMargin = r15
            r0.setLayoutParams(r1)
        L_0x01be:
            return
        L_0x01bf:
            com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget$c r15 = r14.f17045q
            if (r15 == 0) goto L_0x0288
            com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget$c r15 = r14.f17045q
            r15.onClick(r0)
            return
        L_0x01c9:
            android.view.ViewGroup r15 = r14.containerView
            r15.requestFocus()
            return
        L_0x01cf:
            java.lang.Object r15 = r15.getData()
            com.bytedance.android.livesdk.chatroom.event.g r15 = (com.bytedance.android.livesdk.chatroom.event.C5187g) r15
            long r8 = r15.f13891b
            int r7 = r15.f13892c
            java.lang.String r15 = r15.f13890a
            boolean r0 = r14.isViewValid()
            if (r0 == 0) goto L_0x024c
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostContext> r0 = com.bytedance.android.livesdkapi.host.IHostContext.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.p245d.C4116c.m10249a(r0)
            com.bytedance.android.livesdkapi.host.IHostContext r0 = (com.bytedance.android.livesdkapi.host.IHostContext) r0
            boolean r0 = r0.isNeedProtectUnderage()
            if (r0 == 0) goto L_0x01f7
            r15 = 2132550913(0x7f1c2501, float:2.075517E38)
            com.bytedance.android.livesdk.p279af.C4575an.m10981a(r15)
            goto L_0x0288
        L_0x01f7:
            com.bytedance.android.livesdk.chatroom.presenter.y r10 = r14.f17036h
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r14.dataCenter
            java.lang.String r1 = "log_enter_live_source"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            com.bytedance.android.livesdk.gift.GiftManager r0 = com.bytedance.android.livesdk.gift.GiftManager.inst()
            com.bytedance.android.livesdk.gift.model.d r0 = r0.findGiftById(r8)
            if (r0 == 0) goto L_0x024c
            long r11 = android.os.SystemClock.uptimeMillis()
            com.bytedance.android.live.network.e r0 = com.bytedance.android.live.network.C4157e.m10322a()
            java.lang.Class<com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi> r1 = com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi.class
            java.lang.Object r0 = r0.mo9550a(r1)
            com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi r0 = (com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi) r0
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r10.f15432b
            long r3 = r1.getId()
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r10.f15432b
            com.bytedance.android.live.base.model.user.User r1 = r1.getOwner()
            long r5 = r1.getId()
            r1 = r8
            c.a.v r0 = r0.send(r1, r3, r5, r7)
            com.bytedance.android.live.core.rxutils.g r1 = com.bytedance.android.live.core.rxutils.C4064k.m10182a()
            c.a.v r7 = r0.mo6513a(r1)
            com.bytedance.android.livesdk.chatroom.presenter.z r13 = new com.bytedance.android.livesdk.chatroom.presenter.z
            r0 = r13
            r1 = r10
            r2 = r8
            r4 = r11
            r6 = r15
            r0.<init>(r1, r2, r4, r6)
            com.bytedance.android.livesdk.chatroom.presenter.aa r15 = new com.bytedance.android.livesdk.chatroom.presenter.aa
            r15.<init>(r10, r8)
            r7.mo6505a(r13, r15)
        L_0x024c:
            return
        L_0x024d:
            android.view.ViewGroup r0 = r14.containerView
            com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget$1 r1 = new com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget$1
            r1.<init>(r15)
            r0.post(r1)
            return
        L_0x0258:
            java.lang.Object r15 = r15.getData()
            com.bytedance.android.livesdk.message.model.ao r15 = (com.bytedance.android.livesdk.message.model.C7810ao) r15
            boolean r1 = r14.isViewValid()
            if (r1 == 0) goto L_0x0288
            java.lang.String r1 = "处理小礼物的连发特效"
            long r2 = r15.f21494c
            java.lang.String r2 = java.lang.String.valueOf(r2)
            m13534a(r1, r2, r0)
            r14.mo12394a(r15)
            return
        L_0x0273:
            java.lang.Object r15 = r15.getData()
            com.bytedance.android.live.base.model.user.User r15 = (com.bytedance.android.live.base.model.user.User) r15
            boolean r0 = r14.isViewValid()
            if (r0 == 0) goto L_0x0288
            r14.mo12393a(r15)
            return
        L_0x0283:
            return
        L_0x0284:
            r14.m13537e()
            return
        L_0x0288:
            return
        L_0x0289:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget.onChanged(java.lang.Object):void");
    }

    public void onLoad(Object... objArr) {
        boolean z;
        long j;
        long j2;
        C4501b.m10832a().f12274a.put(FakeMtGiftPanelBottomWidget.class, new MtGiftPanelBottomWidget());
        boolean z2 = true;
        if ((((Integer) LiveConfigSettingKeys.LIVE_GIFT_PANEL_FUNCTION.mo9431a()).intValue() & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f17044p = z;
        this.f17037i = ((Boolean) this.dataCenter.get("data_is_portrait", Boolean.valueOf(true))).booleanValue();
        this.f17036h.mo8520a((C5901a) this);
        ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
        enableSubWidgetManager();
        this.f17041m = new NormalGiftAnimWidget();
        this.f17040l = new DoodleWidget();
        this.f17033d = new VideoGiftWidget();
        this.subWidgetManager.load(R.id.brf, this.f17041m);
        this.subWidgetManager.load(R.id.dow, this.f17033d, false);
        this.f17048t = ((C4193l) C4116c.m10249a(C4193l.class)).toolbarManagerHelper().mo9645a();
        this.f17045q = new C6293c();
        this.f17046r = new C6291a();
        this.f17047s = new C6292b();
        this.f17048t.mo12668a(C6605h.GIFT, (C6601a) this.f17045q);
        this.f17048t.mo12668a(C6605h.FAST_GIFT, (C6601a) this.f17046r);
        this.f17048t.mo12668a(C6605h.GIFT_ANIMATION, (C6601a) this.f17047s);
        mo12395a("Load GiftWidget,ToolbarManager load Gift and FastGift behavior");
        m13533a(C5180az.class);
        m13533a(C5730as.class);
        m13533a(C7218c.class);
        m13533a(C5192l.class);
        this.f17030a = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f17031b = (Room) this.dataCenter.get("data_room");
        if (this.f17031b != null) {
            j = this.f17031b.getId();
        } else {
            j = 0;
        }
        if (this.f17031b == null || this.f17031b.getOwner() == null) {
            j2 = 0;
        } else {
            j2 = this.f17031b.getOwner().getId();
        }
        C7221a aVar = new C7221a(j, j2, this.context);
        this.f17039k = aVar;
        this.dataCenter.observeForever("cmd_clear_gift_message", this).observe("cmd_stop_special_gift", this).observe("cmd_send_gift", this).observe("cmd_show_special_group_gift", this).observe("cmd_show_notify_special_gift", this).observe("cmd_do_send_gift", this).observe("cmd_show_gift_relay_dialog", this).observe("cmd_gift_entry_click", this).observe("data_pre_show_keyboard", this).observe("cmd_normal_gift_layout_bottom_margin_update", this, true).observe("cmd_normal_gift_layout_height_update", this, true).observe("cmd_gift_dialog_switch", this).observe("cmd_show_screen", this);
        ((C4133a) C4116c.m10249a(C4133a.class)).registerObserve();
        this.f17051w = ((C4133a) C4116c.m10249a(C4133a.class)).observePkState().mo6505a((C1710e<? super T>) new C6454ap<Object>(this), C4064k.m10187b());
        this.f17038j = new JSONObject();
        try {
            this.f17038j.put("source", this.f17031b.getUserFrom());
            this.f17038j.put("live_source", this.dataCenter.get("log_live_feed_layout"));
            this.f17038j.put("request_id", this.f17031b.getRequestId());
            this.f17038j.put("log_pb", this.f17031b.getLog_pb());
            this.f17038j.put("enter_from", this.dataCenter.get("log_enter_live_source"));
        } catch (Exception unused) {
        }
        C4180a crossRoomGift = ((C4193l) C4116c.m10249a(C4193l.class)).getCrossRoomGift();
        if (crossRoomGift != null) {
            Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
            if (currentRoom != null) {
                if (System.currentTimeMillis() - crossRoomGift.f11382d <= 15000) {
                    z2 = false;
                }
                if (!z2 && !TextUtils.isEmpty(crossRoomGift.f11379a) && crossRoomGift.f11380b != null && crossRoomGift.f11381c > 0) {
                    try {
                        String queryParameter = Uri.parse(crossRoomGift.f11379a).getQueryParameter("room_id");
                        if (!C9431p.m18664a(queryParameter)) {
                            if (currentRoom.getId() == Long.parseLong(queryParameter)) {
                                try {
                                    String queryParameter2 = Uri.parse(crossRoomGift.f11379a).getQueryParameter("gift_id");
                                    if (!C9431p.m18664a(queryParameter2)) {
                                        long parseLong = Long.parseLong(queryParameter2);
                                        User user = crossRoomGift.f11380b;
                                        if (GiftManager.inst().findGiftById(parseLong) != null) {
                                            C7810ao aoVar = new C7810ao();
                                            C8845b bVar = new C8845b();
                                            bVar.f24133d = crossRoomGift.f11381c;
                                            aoVar.baseMessage = bVar;
                                            aoVar.f21494c = parseLong;
                                            aoVar.f21492a = user;
                                            this.dataCenter.lambda$put$1$DataCenter("cmd_show_notify_special_gift", aoVar);
                                        }
                                    } else {
                                        throw new IllegalStateException("schema not contain enableGift id");
                                    }
                                } catch (Exception e) {
                                    C3831a.m9706a(6, f17029g, e.getStackTrace());
                                }
                            }
                        } else {
                            throw new IllegalStateException("schema not contain room id");
                        }
                    } catch (Exception e2) {
                        C3831a.m9706a(6, f17029g, e2.getStackTrace());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11796a(C7793a aVar) {
        VideoGiftWidget videoGiftWidget = this.f17033d;
        if (videoGiftWidget.isViewValid() && videoGiftWidget.f17635a.mo13434c(aVar.f21426a) != null) {
            if (videoGiftWidget.f17642h) {
                C7791e.m15852a().mo14132a((C7776b) aVar);
                return;
            }
            videoGiftWidget.mo12551a(C7519o.m15509a(aVar));
        }
    }

    /* renamed from: a */
    private void m13532a(User user, boolean z) {
        if (isViewValid() && this.f17031b != null) {
            if ((!this.f17044p || this.f17043o == null || !this.f17043o.mo12851g()) && (this.f17042n == null || !this.f17042n.mo12851g())) {
                C3009i a = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a();
                if (a != null && a.childrenManagerForbidWalletFunctions()) {
                    C4204a.m10421a(this.context, (int) R.string.e4z);
                } else if (((IHostContext) C4116c.m10249a(IHostContext.class)).isNeedProtectUnderage()) {
                    C4575an.m10981a((int) R.string.epj);
                } else if ((user == null || this.f17031b.getOwner().getId() == user.getId()) && C7624q.m15618a(this.f17031b, this.f17030a) == 2) {
                    m13531a();
                } else {
                    this.f17032c = user;
                    boolean booleanValue = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
                    C7595ao aoVar = C7595ao.GIFT;
                    if (this.dataCenter.has("data_gift_panel_type")) {
                        aoVar = (C7595ao) this.dataCenter.get("data_gift_panel_type");
                    }
                    C7595ao aoVar2 = aoVar;
                    Bundle bundle = (Bundle) this.dataCenter.get("data_gift_log_extra");
                    String str = (String) this.dataCenter.get("log_enter_live_source");
                    C62883 r11 = new C7626a() {
                        /* renamed from: a */
                        public final boolean mo12403a(Exception exc, Runnable runnable) {
                            GiftWidget.this.mo12396a((Throwable) exc, runnable);
                            return GiftWidget.this.isViewValid();
                        }

                        /* renamed from: a */
                        public final boolean mo12402a(C7514m mVar, int i, boolean z) {
                            int i2;
                            if (z) {
                                GiftWidget giftWidget = GiftWidget.this;
                                if (giftWidget.isViewValid() && (giftWidget.f17034e == null || !giftWidget.f17034e.isShowing())) {
                                    C7505d findGiftById = GiftManager.inst().findGiftById(mVar.f20613e);
                                    if (findGiftById != null && (findGiftById.f20544e == 2 || findGiftById.f20544e == 8 || findGiftById.f20544e == 4)) {
                                        String str = (String) giftWidget.dataCenter.get("log_enter_live_source");
                                        C7315f fVar = new C7315f((Activity) giftWidget.context, giftWidget.f17031b, giftWidget.f17032c, giftWidget.f17030a, ((Boolean) giftWidget.dataCenter.get("data_is_portrait")).booleanValue(), mVar, str, i);
                                        giftWidget.f17034e = fVar;
                                        giftWidget.f17034e.f19916e = giftWidget.f17035f;
                                        giftWidget.f17034e.f19913b = giftWidget.dataCenter;
                                        giftWidget.f17034e.f19914c = new C6457as(giftWidget);
                                        giftWidget.f17034e.setCanceledOnTouchOutside(true);
                                        giftWidget.f17034e.show();
                                    }
                                }
                            }
                            int i3 = 0;
                            if (C4600j.m11040b(GiftWidget.this.dataCenter) && GiftWidget.this.f17031b.author() != null) {
                                C7505d findGiftById2 = GiftManager.inst().findGiftById(mVar.f20613e);
                                JSONObject jSONObject = new JSONObject();
                                String str2 = "amount";
                                if (findGiftById2 == null) {
                                    i2 = 0;
                                } else {
                                    try {
                                        i2 = findGiftById2.f20545f;
                                    } catch (JSONException unused) {
                                    }
                                }
                                jSONObject.put(str2, String.valueOf(i2));
                                jSONObject.put("anchor_id", String.valueOf(GiftWidget.this.f17031b.author().getId()));
                                jSONObject.put("room_id", String.valueOf(GiftWidget.this.f17031b.getId()));
                                C4116c.m10249a(C8612a.class);
                                C8066a.m16007a().mo14223a(jSONObject).mo14222a(C4600j.m11041c(GiftWidget.this.dataCenter));
                            }
                            if (C4600j.m11043d(GiftWidget.this.dataCenter) && GiftWidget.this.f17031b.author() != null) {
                                C7505d findGiftById3 = GiftManager.inst().findGiftById(mVar.f20613e);
                                JSONObject jSONObject2 = new JSONObject();
                                String str3 = "amount";
                                if (findGiftById3 != null) {
                                    try {
                                        i3 = findGiftById3.f20545f;
                                    } catch (JSONException unused2) {
                                    }
                                }
                                jSONObject2.put(str3, String.valueOf(i3));
                                jSONObject2.put("anchor_id", String.valueOf(GiftWidget.this.f17031b.author().getId()));
                                jSONObject2.put("room_id", String.valueOf(GiftWidget.this.f17031b.getId()));
                                C4116c.m10249a(C8612a.class);
                                C8066a.m16007a().mo14223a(jSONObject2).mo14222a(C4600j.m11044e(GiftWidget.this.dataCenter));
                            }
                            return GiftWidget.this.isViewValid();
                        }
                    };
                    this.dataCenter.lambda$put$1$DataCenter("data_gift_group_id", Long.valueOf(this.f17035f));
                    if (!this.f17044p || !(this.context instanceof FragmentActivity)) {
                        Activity activity = (Activity) this.context;
                        Room room = this.f17031b;
                        if (user == null) {
                            user = this.f17031b.getOwner();
                        }
                        this.f17042n = C7521a.m15516a(activity, room, user, aoVar2, this.f17030a, booleanValue, str, z, this.f17039k);
                        this.f17042n.f20646f = this.dataCenter;
                        this.f17042n.f20649i = r11;
                    } else {
                        GiftViewModel giftViewModel = (GiftViewModel) C0214z.m440a((FragmentActivity) this.context).mo359a(GiftViewModel.class);
                        giftViewModel.mo13531a(this.context);
                        Context context = this.context;
                        boolean z2 = this.f17030a;
                        if (user == null) {
                            user = this.f17031b.getOwner();
                        }
                        this.f17043o = C7244a.m15026a(context, booleanValue, aoVar2, z2, user, str, this.dataCenter, r11, giftViewModel);
                    }
                    if (this.context instanceof FragmentActivity) {
                        if (this.f17044p) {
                            this.f17043o.show(((FragmentActivity) this.context).getSupportFragmentManager(), "GiftDialogFragmentV2");
                        } else {
                            this.f17042n.show(((FragmentActivity) this.context).getSupportFragmentManager(), "GiftDialogFragment");
                        }
                        m13536d();
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("live_source", this.f17038j.opt("live_source"));
                            jSONObject.put("request_id", this.f17031b.getRequestId());
                            jSONObject.put("log_pb", this.f17031b.getLog_pb());
                        } catch (Exception unused) {
                        }
                        C8068g.m16014a(this.context);
                        this.f17031b.getId();
                        HashMap hashMap = new HashMap();
                        if (bundle != null) {
                            for (String str2 : bundle.keySet()) {
                                Object obj = bundle.get(str2);
                                if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                                    hashMap.put(str2, String.valueOf(obj));
                                }
                            }
                        }
                        C8049c.m15979a().mo14202a("gift_show", hashMap, Room.class, new C8059j().mo14214b("live_interact").mo14213a("live_detail"), new C8060k());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m13534a(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("desc", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("gift_id", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("msg_id", str3);
        }
        C8064d.m16005b().mo9197a("ttlive_gift", (Map<String, ?>) hashMap);
    }
}
