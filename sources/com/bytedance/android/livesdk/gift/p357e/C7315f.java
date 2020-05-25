package com.bytedance.android.livesdk.gift.p357e;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.RelativeLayout;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3894h;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.linkpk.C4133a;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.config.C6718b;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.gift.C7519o;
import com.bytedance.android.livesdk.gift.C7649u;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.dialog.view.LiveGiftComboView;
import com.bytedance.android.livesdk.gift.domain.api.PropApi;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.p378h.C7459a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.p399o.p402c.C8058i;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8336h;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdk.widget.SpecialCombView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a.C8619a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import org.json.JSONObject;
import p064c.p065a.C1673aa;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.e.f */
public final class C7315f extends Dialog implements OnClickListener, C8619a {

    /* renamed from: a */
    Room f19912a;

    /* renamed from: b */
    public DataCenter f19913b;

    /* renamed from: c */
    public C7321c f19914c;

    /* renamed from: d */
    public final C1689b f19915d;

    /* renamed from: e */
    public long f19916e;

    /* renamed from: f */
    public boolean f19917f;

    /* renamed from: g */
    private Activity f19918g;

    /* renamed from: h */
    private RelativeLayout f19919h;

    /* renamed from: i */
    private SpecialCombView f19920i;

    /* renamed from: j */
    private LiveGiftComboView f19921j;

    /* renamed from: k */
    private User f19922k;

    /* renamed from: l */
    private boolean f19923l;

    /* renamed from: m */
    private boolean f19924m;

    /* renamed from: n */
    private C7514m f19925n;

    /* renamed from: o */
    private int f19926o;

    /* renamed from: p */
    private String f19927p;

    /* renamed from: q */
    private String f19928q;

    /* renamed from: r */
    private Handler f19929r;

    /* renamed from: s */
    private ObjectAnimator f19930s;

    /* renamed from: t */
    private AnimatorSet f19931t;

    /* renamed from: u */
    private AnimatorSet f19932u;

    /* renamed from: v */
    private int f19933v;

    /* renamed from: w */
    private boolean f19934w;

    /* renamed from: x */
    private int f19935x;

    /* renamed from: com.bytedance.android.livesdk.gift.e.f$a */
    enum C7319a {
        enter,
        exit
    }

    /* renamed from: com.bytedance.android.livesdk.gift.e.f$b */
    class C7320b implements AnimatorListener {

        /* renamed from: b */
        private C7319a f19943b;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            switch (this.f19943b) {
                case enter:
                    C7315f.this.f19917f = true;
                    C7315f.this.mo13565a(true);
                    return;
                case exit:
                    C7315f.this.dismiss();
                    break;
            }
        }

        C7320b(C7319a aVar) {
            this.f19943b = aVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gift.e.f$c */
    public interface C7321c {
        /* renamed from: a */
        void mo12602a(Exception exc, Runnable runnable);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19915d.mo6180a();
    }

    public final void dismiss() {
        this.f19929r.removeCallbacksAndMessages(null);
        if (this.f19931t != null && this.f19931t.isStarted()) {
            this.f19931t.removeAllListeners();
            this.f19931t.cancel();
        }
        if (this.f19930s != null && this.f19930s.isStarted()) {
            this.f19930s.removeAllListeners();
            this.f19930s.cancel();
        }
        if (this.f19932u != null && this.f19932u.isStarted()) {
            this.f19932u.removeAllListeners();
            this.f19932u.cancel();
        }
        super.dismiss();
    }

    public final void show() {
        View view;
        String str;
        String str2;
        String str3;
        String str4;
        super.show();
        if (this.f19934w) {
            this.f19920i.setVisibility(8);
            view = this.f19921j;
        } else {
            this.f19921j.setVisibility(8);
            view = this.f19920i;
        }
        view.setVisibility(0);
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "scaleX", new float[]{0.0f, 1.0f}).setDuration(200);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{0.0f, 1.0f}).setDuration(200);
        this.f19931t = new AnimatorSet();
        this.f19931t.playTogether(new Animator[]{duration, duration2});
        this.f19931t.addListener(new C7320b(C7319a.enter));
        this.f19931t.start();
        C7514m mVar = this.f19925n;
        if (mVar != null && mVar.f20613e != -1 && mVar.f20616h > 0) {
            if (mVar.f20620l <= 0) {
                this.f19912a.getId();
                long userFrom = this.f19912a.getUserFrom();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("live_source", this.f19927p);
                    jSONObject.put("source", userFrom);
                    jSONObject.put("gift_id", mVar.f20613e);
                    jSONObject.put("request_id", this.f19912a.getRequestId());
                    jSONObject.put("log_pb", this.f19912a.getLog_pb());
                    jSONObject.put("gift_cnt", mVar.f20616h);
                    jSONObject.put("group_cnt", mVar.f20614f);
                    jSONObject.put("combo_cnt", mVar.f20618j);
                    jSONObject.put("enter_from", this.f19928q);
                    String str5 = "event_page";
                    if (this.f19923l) {
                        str4 = "live_take_detail";
                    } else {
                        str4 = "live_detail";
                    }
                    jSONObject.put(str5, str4);
                    if (!TextUtils.isEmpty(this.f19912a.getSourceType())) {
                        jSONObject.put("moment_room_source", this.f19912a.getSourceType());
                    }
                } catch (Exception unused) {
                }
                if (mVar.f20616h > 1) {
                    C8068g.m16014a((Context) this.f19918g);
                    new StringBuilder("running_gift_").append(userFrom);
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("is_combo", "first_combo");
            if (this.f19916e != 0) {
                hashMap.put("team_id", String.valueOf(this.f19916e));
                String str6 = "top_anchor_id";
                if (this.f19922k == null) {
                    str3 = "";
                } else {
                    str3 = this.f19922k.getIdStr();
                }
                hashMap.put(str6, str3);
            }
            HashMap hashMap2 = new HashMap();
            if (mVar.f20620l <= 0) {
                hashMap.put("growth_deepevent", "1");
                hashMap.put("gift_position", String.valueOf(this.f19933v));
                hashMap2.put(Long.valueOf(mVar.f20613e), Integer.valueOf(1));
                hashMap.put("gift_info", C7459a.m15414a(hashMap2));
            } else {
                hashMap2.put(Long.valueOf(mVar.f20620l), Integer.valueOf(1));
                hashMap.put("prop_info", C7459a.m15414a(hashMap2));
            }
            hashMap.put("is_first_consume", String.valueOf(((IWalletService) C4116c.m10249a(IWalletService.class)).isFirstConsume(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a())));
            if (!(this.f19922k == null || this.f19922k.getId() == this.f19912a.getOwnerUserId())) {
                hashMap.put("to_user_id", String.valueOf(this.f19922k.getId()));
            }
            C8049c a = C8049c.m15979a();
            if (mVar.f20620l > 0) {
                str = "send_prop";
            } else {
                str = "send_gift";
            }
            Object[] objArr = new Object[4];
            C8059j jVar = new C8059j();
            if (this.f19923l) {
                str2 = "live_take_detail";
            } else {
                str2 = "live_detail";
            }
            objArr[0] = jVar.mo14213a(str2).mo14215c("bottom_tab").mo14214b("live_interact").mo14218f("other");
            objArr[1] = Room.class;
            objArr[2] = C7519o.m15513a(mVar);
            objArr[3] = ((C4133a) C4116c.m10249a(C4133a.class)).getLinkCrossRoomLog();
            a.mo14202a(str, hashMap, objArr);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13564a(Exception exc) {
        if (this.f19914c != null) {
            this.f19914c.mo12602a(exc, new Runnable() {
                public final void run() {
                    if (C7315f.this.isShowing()) {
                        C7315f.this.dismiss();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo11060a(Message message) {
        Object obj;
        if (message.what == 110) {
            if (this.f19934w) {
                obj = this.f19921j;
            } else {
                obj = this.f19920i;
            }
            this.f19917f = false;
            ObjectAnimator duration = ObjectAnimator.ofFloat(obj, "scaleX", new float[]{1.0f, 0.0f}).setDuration(200);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(obj, "scaleY", new float[]{1.0f, 0.0f}).setDuration(200);
            this.f19932u = new AnimatorSet();
            this.f19932u.playTogether(new Animator[]{duration, duration2});
            this.f19932u.addListener(new C7320b(C7319a.exit));
            this.f19932u.start();
        }
    }

    /* renamed from: a */
    public final void mo13565a(boolean z) {
        if (!this.f19934w) {
            if (this.f19930s != null && this.f19930s.isStarted()) {
                this.f19930s.cancel();
            }
            this.f19930s = ObjectAnimator.ofFloat(this.f19920i, "progress", new float[]{360.0f, 0.0f}).setDuration(((long) this.f19935x) * 1000);
            this.f19930s.start();
            this.f19920i.startScaleAnim(((long) this.f19935x) * 1000, null);
        } else if (z) {
            this.f19921j.mo13486a(null);
        } else {
            this.f19921j.mo13487b(null);
        }
        if (this.f19929r.hasMessages(OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED)) {
            this.f19929r.removeMessages(OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED);
        }
        this.f19929r.sendEmptyMessageDelayed(OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, ((long) this.f19935x) * 1000);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setLayout(-1, -1);
            window.setGravity(80);
            window.setDimAmount(0.0f);
        }
        setContentView(LayoutInflater.from(this.f19918g).inflate(R.layout.ajf, null));
        if (window != null) {
            if (!this.f19924m || (!this.f19923l && !C3894h.m9842a(getContext()))) {
                window.addFlags(PreloadTask.BYTE_UNIT_NUMBER);
            } else {
                window.clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
            window.setLayout(-1, -1);
        }
        this.f19919h = (RelativeLayout) findViewById(R.id.cqg);
        this.f19919h.setOnClickListener(this);
        this.f19920i = (SpecialCombView) findViewById(R.id.cqh);
        this.f19920i.setOnClickListener(this);
        this.f19920i.setVisibility(4);
        this.f19920i.setCountDownTime(this.f19935x);
        this.f19921j = (LiveGiftComboView) findViewById(R.id.ewg);
        this.f19921j.setOnClickListener(this);
        this.f19921j.setVisibility(8);
        this.f19921j.setCountDownTime(((long) this.f19935x) * 1000);
        if (C35807d.m80935a(this.f19918g, "feed_live_span", 0).getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        this.f19927p = str;
    }

    public final void onClick(View view) {
        long ownerUserId;
        long id;
        if (view.getId() == R.id.cqg) {
            dismiss();
            return;
        }
        if ((view.getId() != R.id.cqh && view.getId() != R.id.ewg) || !this.f19917f) {
            return;
        }
        if (this.f19925n.f20620l > 0) {
            long id2 = this.f19912a.getId();
            long j = this.f19925n.f20620l;
            long uptimeMillis = SystemClock.uptimeMillis();
            Prop a = C7649u.m15656a().mo14010a(j);
            if (a != null) {
                PropApi propApi = (PropApi) C4157e.m10322a().mo9550a(PropApi.class);
                long j2 = a.f20511id;
                if (this.f19922k == null) {
                    id = this.f19912a.getOwnerUserId();
                } else {
                    id = this.f19922k.getId();
                }
                C2201v a2 = propApi.sendProp(j2, id2, 1, id, a.isAwemeFreeGift).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
                long j3 = id2;
                long j4 = j;
                C7322g gVar = new C7322g(this, j, j3, uptimeMillis);
                C7323h hVar = new C7323h(this, j4, j3);
                a2.mo6505a((C1710e<? super T>) gVar, (C1710e<? super Throwable>) hVar);
            }
            return;
        }
        long id3 = this.f19912a.getId();
        long j5 = this.f19925n.f20613e;
        this.f19912a.getLabels();
        if (GiftManager.inst().findGiftById(j5) != null) {
            if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
                ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14516a(this.f19918g, C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.ev8)).mo14539a(1001).mo14544d("live_detail").mo14545e("gift_send").mo14543c("gift").mo14541a()).mo6314a((C1674ab<? super T>) new C8335g<C3009i>() {
                    public final void onSubscribe(C1690c cVar) {
                        super.onSubscribe(cVar);
                        C7315f.this.f19915d.mo6181a(cVar);
                    }
                });
            } else if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14528a(C8336h.GIFT)) {
                if (!C7326k.m15138a(getContext())) {
                    C4204a.m10421a(getContext(), (int) R.string.e77);
                    return;
                }
                long uptimeMillis2 = SystemClock.uptimeMillis();
                GiftRetrofitApi giftRetrofitApi = (GiftRetrofitApi) C4157e.m10322a().mo9550a(GiftRetrofitApi.class);
                if (this.f19922k != null) {
                    ownerUserId = this.f19922k.getId();
                } else {
                    ownerUserId = this.f19912a.getOwnerUserId();
                }
                C2201v a3 = giftRetrofitApi.send(j5, id3, ownerUserId, 1).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
                C7324i iVar = new C7324i(this, j5, uptimeMillis2);
                a3.mo6505a((C1710e<? super T>) iVar, (C1710e<? super Throwable>) new C7325j<Object>(this, j5));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13563a(C7514m mVar) {
        long j;
        long j2;
        String str;
        String str2;
        String str3;
        IMessageManager iMessageManager = (IMessageManager) this.f19913b.get("data_message_manager");
        User user = (User) this.f19913b.get("data_user_in_room");
        if (iMessageManager != null) {
            iMessageManager.insertMessage(C7519o.m15512a(this.f19912a.getId(), mVar, this.f19922k, user));
        }
        if (!(mVar == null || mVar.f20613e == -1 || mVar.f20616h <= 0)) {
            if (mVar.f20620l <= 0) {
                this.f19912a.getId();
                long userFrom = this.f19912a.getUserFrom();
                if (mVar.f20616h > 1) {
                    C8068g.m16014a((Context) this.f19918g);
                    new StringBuilder("running_gift_").append(userFrom);
                }
            }
            mVar.f20630v = this.f19926o;
            if (this.f19922k == null) {
                j = 0;
            } else {
                j = this.f19922k.getId();
            }
            mVar.f20631w = j;
            HashMap hashMap = new HashMap();
            hashMap.put("is_combo", "click_combo");
            if (this.f19916e != 0) {
                hashMap.put("team_id", String.valueOf(this.f19916e));
                String str4 = "top_anchor_id";
                if (this.f19922k == null) {
                    str3 = "";
                } else {
                    str3 = this.f19922k.getIdStr();
                }
                hashMap.put(str4, str3);
            }
            HashMap hashMap2 = new HashMap();
            if (mVar.f20620l <= 0) {
                hashMap.put("gift_position", String.valueOf(this.f19933v));
                hashMap2.put(Long.valueOf(mVar.f20613e), Integer.valueOf(1));
                hashMap.put("gift_info", C7459a.m15414a(hashMap2));
            } else {
                hashMap2.put(Long.valueOf(mVar.f20620l), Integer.valueOf(1));
                hashMap.put("prop_info", C7459a.m15414a(hashMap2));
            }
            hashMap.put("gift_cnt", "1");
            hashMap.put("money", String.valueOf(GiftManager.inst().findGiftById(mVar.f20613e).f20545f));
            if (!(this.f19922k == null || this.f19922k.getId() == this.f19912a.getOwnerUserId())) {
                hashMap.put("to_user_id", String.valueOf(this.f19922k.getId()));
            }
            if (mVar.f20620l > 0) {
                hashMap2.put(Long.valueOf(mVar.f20620l), Integer.valueOf(1));
                hashMap.put("prop_info", C7459a.m15414a(hashMap2));
                C8049c a = C8049c.m15979a();
                String str5 = "send_prop";
                Object[] objArr = new Object[5];
                C8059j jVar = new C8059j();
                if (this.f19923l) {
                    str2 = "live_take_detail";
                } else {
                    str2 = "live_detail";
                }
                objArr[0] = jVar.mo14213a(str2).mo14215c("bottom_tab").mo14214b("live_interact").mo14218f("other");
                objArr[1] = Room.class;
                objArr[2] = C7519o.m15513a(mVar);
                objArr[3] = ((C4133a) C4116c.m10249a(C4133a.class)).getLinkCrossRoomLog();
                objArr[4] = new C8060k();
                a.mo14202a(str5, hashMap, objArr);
            } else {
                hashMap.put("gift_position", String.valueOf(this.f19933v));
                hashMap2.put(Long.valueOf(mVar.f20613e), Integer.valueOf(1));
                hashMap.put("gift_info", C7459a.m15414a(hashMap2));
                hashMap.put("is_first_consume", String.valueOf(((IWalletService) C4116c.m10249a(IWalletService.class)).isFirstConsume(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a())));
                hashMap.put("growth_deepevent", "1");
                String str6 = "to_user_id";
                if (this.f19922k != null) {
                    j2 = this.f19922k.getId();
                } else {
                    j2 = this.f19912a.getOwnerUserId();
                }
                hashMap.put(str6, String.valueOf(j2));
                C8049c a2 = C8049c.m15979a();
                String str7 = "send_gift";
                Object[] objArr2 = new Object[4];
                C8059j jVar2 = new C8059j();
                if (this.f19923l) {
                    str = "live_take_detail";
                } else {
                    str = "live_detail";
                }
                objArr2[0] = jVar2.mo14213a(str).mo14215c("bottom_tab").mo14214b("live_interact").mo14218f("other");
                objArr2[1] = Room.class;
                objArr2[2] = C7519o.m15513a(mVar);
                objArr2[3] = ((C4133a) C4116c.m10249a(C4133a.class)).getLinkCrossRoomLog();
                a2.mo14202a(str7, hashMap, objArr2);
            }
        }
        mo13565a(false);
    }

    public C7315f(Activity activity, Room room, User user, boolean z, boolean z2, C7514m mVar, String str, int i) {
        int i2;
        int i3;
        if (!z2 || (!z && !C3894h.m9842a(activity))) {
            i2 = R.style.zm;
        } else {
            i2 = R.style.zn;
        }
        super(activity, i2);
        this.f19915d = new C1689b();
        this.f19929r = new C8618a(this);
        this.f19917f = false;
        this.f19935x = ((Integer) C6718b.f18311H.mo9431a()).intValue();
        this.f19918g = activity;
        this.f19912a = room;
        this.f19922k = user;
        this.f19923l = z;
        this.f19924m = z2;
        this.f19925n = mVar;
        if (user == null) {
            i3 = C8058i.f22018a;
        } else {
            i3 = C8058i.f22019b;
        }
        this.f19926o = i3;
        this.f19928q = str;
        this.f19933v = i;
        boolean z3 = true;
        if ((((Integer) LiveConfigSettingKeys.LIVE_GIFT_PANEL_FUNCTION.mo9431a()).intValue() & 1) != 1) {
            z3 = false;
        }
        this.f19934w = z3;
    }
}
