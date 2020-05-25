package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.Animator;
import android.arch.lifecycle.C0199s;
import android.os.Bundle;
import android.os.Message;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.model.C3056b;
import com.bytedance.android.live.core.p230g.C3890e;
import com.bytedance.android.live.core.p230g.C3899m;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.setting.C4085g;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C5206y;
import com.bytedance.android.livesdk.chatroom.p306bl.C5006c;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.floatwindow.C7182h;
import com.bytedance.android.livesdk.message.model.C7835bj;
import com.bytedance.android.livesdk.message.model.C7866cg;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4600j;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p279af.C4622w;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8065e.C8066a;
import com.bytedance.android.livesdk.p399o.p402c.C8052c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p421v.C8374c;
import com.bytedance.android.livesdk.user.C8325b.C8326a;
import com.bytedance.android.livesdk.user.C8329d.C8332b;
import com.bytedance.android.livesdk.user.C8333e;
import com.bytedance.android.livesdk.user.C8334f;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.android.livesdkapi.p432d.C8612a;
import com.bytedance.common.utility.C9415i;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.p672e.C10753b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.C1673aa;
import p064c.p065a.C1674ab;
import p064c.p065a.C1686aj;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

public class LiveRoomUserInfoWidget extends LiveRecyclableWidget implements C0199s<KVData>, C9382a {

    /* renamed from: a */
    static final String f18055a = "com.bytedance.android.livesdk.chatroom.widget.LiveRoomUserInfoWidget";

    /* renamed from: b */
    public static final String f18056b = "https://webcast.huoshan.com/falcon/webcast_huoshan/page/fansclub/index.html?room_id=%s&anchor_id=%s&user_id=%s&enter_from=%s&source=%s&event_module=%s&isFans=%s&is_first_consume=%s";

    /* renamed from: c */
    public static final String f18057c;

    /* renamed from: u */
    private static final int f18058u = C3922z.m9899a(34.0f);

    /* renamed from: A */
    private ImageView f18059A;

    /* renamed from: B */
    private VHeadView f18060B;

    /* renamed from: C */
    private HSImageView f18061C;

    /* renamed from: D */
    private ImageView f18062D;

    /* renamed from: E */
    private TextView f18063E;

    /* renamed from: F */
    private TextView f18064F;

    /* renamed from: G */
    private int f18065G;

    /* renamed from: H */
    private C9381g f18066H;

    /* renamed from: I */
    private String f18067I;

    /* renamed from: J */
    private View f18068J;

    /* renamed from: K */
    private TextView f18069K;

    /* renamed from: L */
    private TextView f18070L;

    /* renamed from: M */
    private long f18071M;

    /* renamed from: N */
    private long f18072N;

    /* renamed from: O */
    private long f18073O;

    /* renamed from: P */
    private boolean f18074P = true;

    /* renamed from: Q */
    private C10753b f18075Q;

    /* renamed from: R */
    private User f18076R;

    /* renamed from: S */
    private RecyclableWidgetManager f18077S;

    /* renamed from: T */
    private ViewStub f18078T;

    /* renamed from: U */
    private List<Animator> f18079U;

    /* renamed from: d */
    public Room f18080d;

    /* renamed from: e */
    boolean f18081e;

    /* renamed from: f */
    String f18082f;

    /* renamed from: g */
    public View f18083g;

    /* renamed from: h */
    View f18084h;

    /* renamed from: i */
    public View f18085i;

    /* renamed from: j */
    public ProgressBar f18086j;

    /* renamed from: k */
    TextView f18087k;

    /* renamed from: l */
    public FragmentActivity f18088l;

    /* renamed from: m */
    View f18089m;

    /* renamed from: n */
    boolean f18090n = false;

    /* renamed from: o */
    boolean f18091o;

    /* renamed from: p */
    boolean f18092p;

    /* renamed from: q */
    boolean f18093q;

    /* renamed from: r */
    C4104a f18094r;

    /* renamed from: s */
    public C8374c f18095s;

    /* renamed from: t */
    boolean f18096t;

    /* renamed from: v */
    private final C1689b f18097v = new C1689b();

    /* renamed from: w */
    private C8333e f18098w;

    /* renamed from: x */
    private View f18099x;

    /* renamed from: y */
    private View f18100y;

    /* renamed from: z */
    private View f18101z;

    public int getLayoutId() {
        return R.layout.ao4;
    }

    public void handleMsg(Message message) {
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
        if (C7182h.m14893a(IBroadcastService.TAG_MSG_VIEW) == null) {
        }
    }

    /* renamed from: b */
    private boolean m14020b() {
        if (!this.f18081e) {
            ((Integer) LiveSettingKeys.LIVE_ANCHOR_INFO_ABTEST.mo9431a()).intValue();
        }
        return false;
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append((String) LiveSettingKeys.LIVE_FANS_GROUP_URL.mo9431a());
        sb.append("?room_id=%s&anchor_id=%s&user_id=%s&enter_from=%s&source=%s&event_module=%s&isFans=%s");
        f18057c = sb.toString();
    }

    public void onUnload() {
        if (this.f18089m != null) {
            this.f18089m.setVisibility(8);
        }
        this.f18097v.mo6180a();
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
        this.f18077S = null;
        this.f18071M = 0;
        this.f18072N = 0;
        this.f18073O = 0;
        this.f18090n = false;
        this.f18076R = null;
        if (this.f18079U != null) {
            for (Animator cancel : this.f18079U) {
                cancel.cancel();
            }
        }
        if (this.f18066H != null) {
            this.f18066H.removeCallbacksAndMessages(null);
        }
        if (this.f18094r != null && this.f18094r.mo9441a()) {
            this.f18094r.dismissAllowingStateLoss();
        }
        this.f18094r = null;
    }

    /* renamed from: a */
    public final void mo12737a() {
        if (isViewValid()) {
            if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                Bundle bundle = new Bundle();
                bundle.putString("enter_from", "live_detail");
                bundle.putString("action_type", "follow");
                bundle.putString("source", CustomActionPushReceiver.f104061f);
                bundle.putString("v1_source", "follow");
                this.f18090n = true;
                TTLiveSDKContext.getHostService().mo10315h().mo14516a(this.context, C8337i.m16520a().mo14540a(C4085g.m10200a()).mo14542b(C4085g.m10201b()).mo14544d("live_detail").mo14545e("follow").mo14543c(CustomActionPushReceiver.f104061f).mo14539a(1).mo14541a()).mo6314a((C1674ab<? super T>) new C8335g<Object>());
                return;
            }
            if (this.f18088l != null) {
                TTLiveSDKContext.getHostService().mo10310c().checkAndShowGuide(this.f18088l, CustomActionPushReceiver.f104061f, this.context.getResources().getString(R.string.ez6));
            }
            User owner = this.f18080d.getOwner();
            if (C4600j.m11040b(this.dataCenter) && this.f18080d.author() != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("anchor_id", String.valueOf(this.f18080d.author().getId()));
                    jSONObject.put("room_id", String.valueOf(this.f18080d.getId()));
                } catch (JSONException unused) {
                }
                C4116c.m10249a(C8612a.class);
                C8066a.m16007a().mo14223a(jSONObject).mo14222a(C4600j.m11041c(this.dataCenter));
            }
            if (C4600j.m11043d(this.dataCenter) && this.f18080d.author() != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("anchor_id", String.valueOf(this.f18080d.author().getId()));
                    jSONObject2.put("room_id", String.valueOf(this.f18080d.getId()));
                } catch (JSONException unused2) {
                }
                C4116c.m10249a(C8612a.class);
                C8066a.m16007a().mo14223a(jSONObject2).mo14222a(C4600j.m11044e(this.dataCenter));
            }
            TTLiveSDKContext.getHostService().mo10315h().mo14518a(((C8332b) ((C8332b) ((C8332b) ((C8332b) ((C8332b) ((C8332b) ((C8332b) ((C8332b) ((C8326a) C8334f.m16518b().mo14503a(owner.getId())).mo14504a(this.f18080d.getRequestId())).mo14507b(this.f18082f)).mo14508c(CustomActionPushReceiver.f104061f)).mo14506b(this.f18080d.getId())).mo14509d(this.f18080d.getLabels())).mo14511a(this.f18088l)).mo14512e("live_detail")).mo14513f("follow")).mo14514c()).mo6514a(C1667a.m5940a()).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6314a((C1674ab<? super T>) new C1674ab<C8686a>() {
                public final void onComplete() {
                }

                public final void onSubscribe(C1690c cVar) {
                }

                public final /* synthetic */ void onNext(Object obj) {
                    LiveRoomUserInfoWidget.this.mo12739a((C8686a) obj);
                }

                public final void onError(Throwable th) {
                    if (LiveRoomUserInfoWidget.this.isViewValid()) {
                        LiveRoomUserInfoWidget.this.mo12741b(0);
                        LiveRoomUserInfoWidget.this.f18086j.setVisibility(8);
                        C4602l.m11046a(LiveRoomUserInfoWidget.this.context, th);
                    }
                }
            });
            mo12741b(8);
            this.f18086j.setVisibility(0);
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("growth_deepevent", "1");
                C8049c.m15979a().mo14202a("follow", hashMap, new C8052c(CustomActionPushReceiver.f104061f, owner.getId()), new C8059j().mo14214b("live_interact").mo14213a("live_detail"), Room.class);
            } catch (Exception unused3) {
            }
        }
    }

    /* renamed from: b */
    public final void mo12741b(int i) {
        C9432q.m18691b((View) this.f18059A, i);
    }

    /* renamed from: a */
    private void m14019a(long j) {
        if (this.f18071M <= j) {
            m14020b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12738a(int i) {
        LayoutParams layoutParams = this.f18083g.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = i;
            this.f18083g.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: d */
    private void m14021d(int i) {
        if (isViewValid()) {
            this.f18063E.setText(this.context.getString(R.string.ewn, new Object[]{C4622w.m11084a((long) i)}));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12740a(String str) {
        C7866cg a = C5006c.m11495a(this.f18080d.getId(), null, "", 5, str, "#FF8533", "7", "");
        a.f21778l = R.drawable.bvf;
        IMessageManager iMessageManager = (IMessageManager) this.dataCenter.get("data_message_manager");
        if (iMessageManager != null) {
            iMessageManager.insertMessage(a, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo12742c(int i) {
        if (isViewValid()) {
            C8374c cVar = this.f18095s;
            View view = this.f18085i;
            int i2 = (-i) * 2;
            cVar.mo14575d(false);
            cVar.mo14573c();
            cVar.f22764d = view;
            cVar.f22767g = i2;
            cVar.f22768h = i;
            if (cVar.f22769i) {
                cVar.mo14570b();
            }
            cVar.f22761a.showAsDropDown(view, cVar.f22767g, cVar.f22768h);
            this.f18066H.postDelayed(new C6644ab(this), 5000);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12739a(com.bytedance.android.livesdkapi.depend.model.p443b.C8686a r6) {
        /*
            r5 = this;
            boolean r0 = r5.isViewValid()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r5.dataCenter
            java.lang.String r1 = "data_room"
            java.lang.Object r0 = r0.get(r1)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            int r1 = r6.mo15140a()
            r0.setFollowStatus(r1)
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r5.dataCenter
            java.lang.String r1 = "data_is_followed"
            int r2 = r6.mo15140a()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x002a
            r2 = 1
            goto L_0x002b
        L_0x002a:
            r2 = 0
        L_0x002b:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.lambda$put$1$DataCenter(r1, r2)
            int r6 = r6.mo15140a()
            r0 = 1086324736(0x40c00000, float:6.0)
            r1 = 8
            if (r6 != 0) goto L_0x0057
            android.view.View r6 = r5.f18085i
            r6.setVisibility(r1)
            android.view.View r6 = r5.f18084h
            r6.setVisibility(r4)
            boolean r6 = r5.f18091o
            if (r6 == 0) goto L_0x0056
            android.content.Context r6 = r5.getContext()
            float r6 = com.bytedance.common.utility.C9432q.m18687b(r6, r0)
            int r6 = (int) r6
            r5.mo12738a(r6)
        L_0x0056:
            return
        L_0x0057:
            r5.mo12741b(r4)
            android.widget.ProgressBar r6 = r5.f18086j
            r6.setVisibility(r1)
            android.view.View r6 = r5.f18084h
            r6.setVisibility(r1)
            boolean r6 = r5.f18091o
            if (r6 == 0) goto L_0x015a
            android.content.Context r6 = r5.getContext()
            float r6 = com.bytedance.common.utility.C9432q.m18687b(r6, r0)
            int r6 = (int) r6
            r5.mo12738a(r6)
            android.view.View r6 = r5.f18085i
            r6.setVisibility(r4)
            com.bytedance.ies.sdk.widgets.DataCenter r6 = r5.dataCenter
            java.lang.String r0 = "data_user_in_room"
            java.lang.Object r6 = r6.get(r0)
            com.bytedance.android.live.base.model.user.User r6 = (com.bytedance.android.live.base.model.user.User) r6
            if (r6 == 0) goto L_0x00cc
            com.bytedance.android.live.base.model.FansClubMember r0 = r6.getFansClub()
            if (r0 == 0) goto L_0x00cc
            com.bytedance.android.live.base.model.FansClubMember r0 = r6.getFansClub()
            com.bytedance.android.live.base.model.user.FansClubData r0 = r0.getData()
            boolean r0 = com.bytedance.android.live.base.model.user.FansClubData.isValid(r0)
            if (r0 == 0) goto L_0x00a2
            com.bytedance.android.live.base.model.FansClubMember r6 = r6.getFansClub()
            com.bytedance.android.live.base.model.user.FansClubData r6 = r6.getData()
            goto L_0x00c0
        L_0x00a2:
            com.bytedance.android.live.base.model.FansClubMember r0 = r6.getFansClub()
            java.util.Map r0 = r0.getPreferData()
            if (r0 == 0) goto L_0x00bf
            com.bytedance.android.live.base.model.FansClubMember r6 = r6.getFansClub()
            java.util.Map r6 = r6.getPreferData()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object r6 = r6.get(r0)
            com.bytedance.android.live.base.model.user.FansClubData r6 = (com.bytedance.android.live.base.model.user.FansClubData) r6
            goto L_0x00c0
        L_0x00bf:
            r6 = 0
        L_0x00c0:
            boolean r0 = com.bytedance.android.live.base.model.user.FansClubData.isValid(r6)
            if (r0 == 0) goto L_0x00cc
            int r6 = r6.level
            if (r6 <= 0) goto L_0x00cc
            r6 = 0
            goto L_0x00cd
        L_0x00cc:
            r6 = 1
        L_0x00cd:
            if (r6 == 0) goto L_0x0159
            boolean r6 = r5.f18096t
            if (r6 == 0) goto L_0x0159
            com.bytedance.android.livesdkapi.depend.model.live.Room r6 = r5.f18080d
            com.bytedance.android.live.base.model.user.User r6 = r6.getOwner()
            long r0 = r6.getId()
            java.lang.String r6 = java.lang.String.valueOf(r0)
            com.bytedance.ies.e.b r0 = r5.f18075Q
            int r0 = r0.mo19439a(r6, r4)
            if (r0 == r3) goto L_0x00f8
            android.view.View r0 = r5.f18085i
            if (r0 != 0) goto L_0x00ee
            goto L_0x00f8
        L_0x00ee:
            com.bytedance.ies.e.b r0 = r5.f18075Q
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.mo19445b(r6, r1)
            goto L_0x00f9
        L_0x00f8:
            r3 = 0
        L_0x00f9:
            if (r3 == 0) goto L_0x0159
            r6 = 1073741824(0x40000000, float:2.0)
            int r6 = com.bytedance.android.live.core.p230g.C3922z.m9899a(r6)
            com.bytedance.android.livesdk.v.c r0 = r5.f18095s
            if (r0 == 0) goto L_0x0113
            com.bytedance.android.livesdk.v.c r0 = r5.f18095s
            boolean r0 = r0.mo14577e()
            if (r0 == 0) goto L_0x0113
            com.bytedance.android.livesdk.v.c r0 = r5.f18095s
            r0.dismiss()
            goto L_0x014f
        L_0x0113:
            android.content.Context r0 = r5.context
            com.bytedance.android.livesdk.v.c r0 = com.bytedance.android.livesdk.p421v.C8374c.m16598b(r0)
            r1 = 2132216303(0x7f1709ef, float:2.00765E38)
            com.bytedance.android.livesdk.v.a r0 = r0.mo14562a(r1)
            com.bytedance.android.livesdk.v.c r0 = (com.bytedance.android.livesdk.p421v.C8374c) r0
            r1 = 1108869120(0x42180000, float:38.0)
            int r1 = com.bytedance.android.live.core.p230g.C3922z.m9899a(r1)
            com.bytedance.android.livesdk.v.a r0 = r0.mo14571c(r1)
            com.bytedance.android.livesdk.v.c r0 = (com.bytedance.android.livesdk.p421v.C8374c) r0
            com.bytedance.android.livesdk.v.a r0 = r0.mo14565a(r4)
            com.bytedance.android.livesdk.v.c r0 = (com.bytedance.android.livesdk.p421v.C8374c) r0
            com.bytedance.android.livesdk.v.a r0 = r0.mo14569b(r4)
            com.bytedance.android.livesdk.v.c r0 = (com.bytedance.android.livesdk.p421v.C8374c) r0
            com.bytedance.android.livesdk.v.c$a r1 = com.bytedance.android.livesdk.chatroom.widget.C6700z.f18271a
            com.bytedance.android.livesdk.v.c r0 = r0.mo14582a(r1)
            com.bytedance.android.livesdk.v.a r0 = r0.mo14561a()
            com.bytedance.android.livesdk.v.c r0 = (com.bytedance.android.livesdk.p421v.C8374c) r0
            r5.f18095s = r0
            com.bytedance.android.livesdk.v.c r0 = r5.f18095s
            r0.mo14574d()
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r5.dataCenter
        L_0x014f:
            android.view.View r0 = r5.f18085i
            com.bytedance.android.livesdk.chatroom.widget.aa r1 = new com.bytedance.android.livesdk.chatroom.widget.aa
            r1.<init>(r5, r6)
            r0.post(r1)
        L_0x0159:
            return
        L_0x015a:
            android.content.Context r6 = r5.getContext()
            r0 = 1094713344(0x41400000, float:12.0)
            float r6 = com.bytedance.common.utility.C9432q.m18687b(r6, r0)
            int r6 = (int) r6
            r5.mo12738a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.widget.LiveRoomUserInfoWidget.mo12739a(com.bytedance.android.livesdkapi.depend.model.b.a):void");
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (isViewValid() && kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c = 65535;
            boolean z = true;
            int i = 0;
            switch (key.hashCode()) {
                case -1741164106:
                    if (key.equals("data_user_in_room")) {
                        c = 5;
                        break;
                    }
                    break;
                case -407049065:
                    if (key.equals("data_member_message")) {
                        c = 3;
                        break;
                    }
                    break;
                case 506917167:
                    if (key.equals("data_login_event")) {
                        c = 2;
                        break;
                    }
                    break;
                case 519380817:
                    if (key.equals("data_anchor_ticket_count")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1060055221:
                    if (key.equals("data_keyboard_status")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1102839345:
                    if (key.equals("data_xt_followed_change")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1247726949:
                    if (key.equals("data_current_room_ticket_count")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2143307222:
                    if (key.equals("cmd_wanna_follow_anchor")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m14019a(((Long) kVData.getData()).longValue());
                    return;
                case 1:
                    if (this.f18072N <= ((Long) kVData.getData()).longValue()) {
                        m14020b();
                    }
                    return;
                case 2:
                    if (((C5206y) kVData.getData()).f13929a) {
                        TTLiveSDKContext.getHostService().mo10315h().mo14530b(this.f18080d.getOwner().getId()).mo6148a(C1667a.m5940a()).mo6149a((C1686aj<? super T, ? extends R>) getAutoUnbindTransformer()).mo6152a((C1710e<? super T>) new C6691q<Object>(this), C6692r.f18263a);
                        return;
                    }
                    break;
                case 3:
                    C7835bj bjVar = (C7835bj) kVData.getData();
                    if (bjVar != null) {
                        int i2 = bjVar.f21633a;
                        if (i2 > 0) {
                            m14021d(i2);
                        }
                        return;
                    }
                    break;
                case 4:
                    boolean booleanValue = ((Boolean) kVData.getData()).booleanValue();
                    View view = this.f18099x;
                    if (booleanValue) {
                        i = 8;
                    }
                    view.setVisibility(i);
                    return;
                case 5:
                    Object data = kVData.getData();
                    boolean z2 = data instanceof User;
                    if (z2) {
                        this.f18076R = (User) data;
                    }
                    if (z2 && !this.f18081e) {
                        if (this.f18076R.getFansClub() == null || this.f18076R.getFansClub().getData() == null || this.f18076R.getFansClub().getData().anchorId != this.f18080d.getOwnerUserId()) {
                            z = false;
                        }
                        this.f18093q = z;
                        if (this.f18093q && this.f18092p && !((Boolean) C4525b.f12369al.mo10345a()).booleanValue()) {
                            this.contentView.postDelayed(new C6645ac(this), 1000);
                            return;
                        }
                    }
                case 6:
                    long longValue = ((Long) kVData.getData()).longValue();
                    this.f18073O = longValue;
                    this.f18064F.setText(this.context.getString(R.string.ea7, new Object[]{C3890e.m9835c(longValue)}));
                    break;
                case 7:
                    break;
            }
            if (this.f18101z.getVisibility() == 0 || (this.f18059A != null && this.f18059A.getVisibility() == 0)) {
                mo12737a();
            }
        }
    }

    public void onInit(Object... objArr) {
        String str;
        this.f18091o = !C8607a.f23572a;
        this.f18092p = ((Boolean) LiveSettingKeys.LIVE_SHOW_FANS_CLUB_RENEWAL.mo9431a()).booleanValue();
        this.f18099x = this.contentView.findViewById(R.id.f4);
        this.f18100y = this.contentView.findViewById(R.id.f4);
        this.f18078T = (ViewStub) this.contentView.findViewById(R.id.adt);
        this.f18083g = this.contentView.findViewById(R.id.bps);
        this.f18084h = this.contentView.findViewById(R.id.ai8);
        this.f18101z = this.contentView.findViewById(R.id.ai0);
        this.f18086j = (ProgressBar) this.contentView.findViewById(R.id.aic);
        this.f18085i = this.contentView.findViewById(R.id.adc);
        this.f18060B = (VHeadView) this.contentView.findViewById(R.id.anl);
        this.f18061C = (HSImageView) this.contentView.findViewById(R.id.ayu);
        this.f18062D = (ImageView) this.containerView.findViewById(R.id.dnv);
        this.f18087k = (TextView) this.contentView.findViewById(R.id.dn1);
        this.f18063E = (TextView) this.contentView.findViewById(R.id.d05);
        this.f18064F = (TextView) this.containerView.findViewById(R.id.ae0);
        this.f18068J = this.contentView.findViewById(R.id.d07);
        this.f18069K = (TextView) this.contentView.findViewById(R.id.d06);
        this.f18070L = (TextView) this.contentView.findViewById(R.id.d08);
        this.f18089m = this.containerView.findViewById(R.id.f61);
        if (C9432q.m18670a(this.context) < 500) {
            this.f18087k.setMaxWidth(100);
        }
        this.f18085i.setOnClickListener(new C6648af(this));
        this.f18065G = this.context.getResources().getDimensionPixelOffset(R.dimen.qj);
        this.f18101z.setOnClickListener(new C6649ag(this));
        try {
            this.f18101z.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.bjg));
        } catch (Exception unused) {
        }
        this.f18100y.setOnClickListener(new C6650ah(this));
        if (C35807d.m80935a(this.context, "feed_live_span", 0).getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        this.f18067I = str;
        View view = this.f18101z;
        this.context.getString(R.string.ebf);
        DataCenter dataCenter = this.dataCenter;
        boolean z = view instanceof TextView;
    }

    public void onLoad(Object... objArr) {
        this.f18080d = (Room) this.dataCenter.get("data_room");
        this.f18081e = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f18074P = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.f18082f = (String) this.dataCenter.get("log_enter_live_source");
        this.f18098w = (C8333e) this.dataCenter.get("data_user_center");
        this.f18088l = (FragmentActivity) this.context;
        this.f18085i.setVisibility(8);
        this.f18084h.setVisibility(0);
        if (this.f18089m != null) {
            if (this.f18080d.isUnusedEffect()) {
                this.f18089m.setVisibility(0);
                C8049c.m15979a().mo14203a("no_beauty_icon_show", Room.class);
            } else {
                this.f18089m.setVisibility(8);
            }
        }
        this.f18086j.setVisibility(8);
        if (!this.f18081e) {
            try {
                String[] strArr = {"money", "fans", "nothing", "room_money"};
                HashMap hashMap = new HashMap();
                StringBuilder sb = new StringBuilder();
                sb.append(this.f18080d.getOwnerUserId());
                hashMap.put("anchor_id", sb.toString());
                hashMap.put("room_id", this.f18080d.getIdStr());
                hashMap.put("rank_type", strArr[((Integer) LiveSettingKeys.LIVE_ANCHOR_INFO_ABTEST.mo9431a()).intValue()]);
                TTLiveSDKContext.getHostService().mo10311d().mo15567a("livesdk_live_room_info", hashMap);
            } catch (Exception e) {
                C9415i.m18634a((Throwable) e);
            }
        }
        this.f18059A = new ImageView(getContext());
        this.f18059A.setImageResource(R.drawable.btr);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C9432q.m18687b(getContext(), 28.0f), (int) C9432q.m18687b(getContext(), 28.0f));
        layoutParams.gravity = 17;
        ((FrameLayout) this.f18084h).addView(this.f18059A, layoutParams);
        C9432q.m18691b(this.f18101z, 8);
        this.f18059A.setOnClickListener(new C6699y(this));
        if (this.f18081e) {
            mo12738a((int) C9432q.m18687b(getContext(), 6.0f));
            this.f18084h.setVisibility(8);
            if (this.f18091o) {
                this.f18085i.setVisibility(0);
                if (!((Boolean) C4525b.f12367aj.mo10345a()).booleanValue()) {
                    C2201v.m6592a(1, TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6505a((C1710e<? super T>) new C6651ai<Object>(this), C6652aj.f18158a);
                }
                if (this.f18092p && !((Boolean) C4525b.f12368ak.mo10345a()).booleanValue()) {
                    C2201v.m6592a(1, TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6505a((C1710e<? super T>) new C6653ak<Object>(this), C6654al.f18160a);
                }
            } else {
                mo12738a((int) C9432q.m18687b(getContext(), 12.0f));
            }
        }
        if (isViewValid() && this.f18063E != null) {
            m14020b();
            m14019a(this.f18080d.getOwner().getFanTicketCount());
        }
        if (this.f18064F != null) {
            this.f18073O = this.f18080d.getOwner().getFollowInfo().getFollowerCount();
            this.f18064F.setText(this.context.getString(R.string.ea7, new Object[]{C3890e.m9835c(this.f18073O)}));
        }
        if (this.f18081e) {
            this.f18097v.mo6181a(((C4002ac) C4495a.m10823a().mo10300a(C3056b.class).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) autoDispose())).mo9406a(new C6693s(this), C6694t.f18265a));
        } else {
            this.f18097v.mo6181a(this.f18098w.mo14534d(this.f18080d.getOwner().getId()).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C6695u<Object>(this), C6696v.f18267a));
        }
        m14020b();
        this.f18097v.mo6181a(this.f18098w.mo14531c(this.f18080d.getOwnerUserId()).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C6697w<Object>(this), C6698x.f18269a));
        if (isViewValid()) {
            User owner = this.f18080d.getOwner();
            if (owner != null) {
                this.f18060B.setVAble(false);
                C5213c.m11815a((ImageView) this.f18060B, owner.getAvatarThumb(), (int) R.drawable.bt6);
                C9432q.m18691b((View) this.f18062D, 8);
                if (owner.getBorder() != null) {
                    C3899m.m9868b(this.f18061C, owner.getBorder().f8838a);
                } else {
                    this.f18061C.setImageDrawable(null);
                }
                if ((((IHostApp) C4116c.m10249a(IHostApp.class)).isInMusicallyRegion() || ((Boolean) LiveSettingKeys.LIVE_USERNAME_DISPLAY.mo9431a()).booleanValue()) && owner.displayId != null) {
                    this.f18087k.setText(owner.displayId);
                } else {
                    this.f18087k.setText(owner.getNickName());
                }
                if (owner.isFollowing()) {
                    this.f18084h.setVisibility(8);
                    if (this.f18091o) {
                        this.f18085i.setVisibility(0);
                    } else {
                        mo12738a((int) C9432q.m18687b(getContext(), 12.0f));
                    }
                }
                if (TTLiveSDKContext.getHostService().mo10315h().mo14529b() == owner.getId()) {
                    this.f18084h.setVisibility(8);
                }
            }
            m14021d(this.f18080d.getUserCount());
        }
        this.f18066H = new C9381g(this.context.getMainLooper(), this);
        this.f18075Q = C10753b.m21794a(this.context, "live_fans_club_tips");
        this.dataCenter.observeForever("data_anchor_ticket_count", this).observeForever("data_current_room_ticket_count", this).observeForever("data_login_event", this).observe("data_member_message", this).observe("cmd_send_gift", this).observeForever("data_keyboard_status", this).observe("data_user_in_room", this).observe("cmd_dismiss_dialog_end", this).observe("data_xt_followed_change", this).observe("cmd_wanna_follow_anchor", this);
    }
}
