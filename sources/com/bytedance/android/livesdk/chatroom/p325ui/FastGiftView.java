package com.bytedance.android.livesdk.chatroom.p325ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.support.p030v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3889d;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.linkpk.C4133a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.uikit.rtl.AutoRTLImageView;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.presenter.C5891t;
import com.bytedance.android.livesdk.chatroom.presenter.C5891t.C5893a;
import com.bytedance.android.livesdk.config.C6718b;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C7519o;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.p378h.C7459a;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p272ad.C4528e;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4600j;
import com.bytedance.android.livesdk.p388k.C7713e;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8065e.C8066a;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p421v.C8374c;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8336h;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdk.widget.C8555i;
import com.bytedance.android.livesdk.widget.C8555i.C8556a;
import com.bytedance.android.livesdk.widget.CircleProgressView;
import com.bytedance.android.livesdkapi.C8737f;
import com.bytedance.android.livesdkapi.C8737f.C8738a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p432d.C8612a;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.facebook.drawee.p940f.C13834b;
import com.facebook.drawee.p940f.C13837e;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.C1674ab;
import p064c.p065a.C2203w;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.FastGiftView */
public class FastGiftView extends FrameLayout implements C5893a, C9382a {

    /* renamed from: A */
    private int f15461A;

    /* renamed from: B */
    private int f15462B;

    /* renamed from: C */
    private C9381g f15463C;

    /* renamed from: D */
    private boolean f15464D;

    /* renamed from: E */
    private boolean f15465E;

    /* renamed from: F */
    private boolean f15466F;

    /* renamed from: G */
    private TextView f15467G;

    /* renamed from: H */
    private C5910a f15468H;

    /* renamed from: a */
    public AnimatorSet f15469a;

    /* renamed from: b */
    public Dialog f15470b;

    /* renamed from: c */
    public C8374c f15471c;

    /* renamed from: d */
    public boolean f15472d;

    /* renamed from: e */
    public C5891t f15473e;

    /* renamed from: f */
    public DataCenter f15474f;

    /* renamed from: g */
    public Room f15475g;

    /* renamed from: h */
    public boolean f15476h;

    /* renamed from: i */
    public boolean f15477i;

    /* renamed from: j */
    public Activity f15478j;

    /* renamed from: k */
    public boolean f15479k;

    /* renamed from: l */
    public String f15480l;

    /* renamed from: m */
    public Runnable f15481m;

    /* renamed from: n */
    public Runnable f15482n;

    /* renamed from: o */
    private int f15483o;

    /* renamed from: p */
    private AutoRTLImageView f15484p;

    /* renamed from: q */
    private CircleProgressView f15485q;

    /* renamed from: r */
    private ObjectAnimator f15486r;

    /* renamed from: s */
    private View f15487s;

    /* renamed from: t */
    private TextView f15488t;

    /* renamed from: u */
    private ObjectAnimator f15489u;

    /* renamed from: v */
    private Dialog f15490v;

    /* renamed from: w */
    private Dialog f15491w;

    /* renamed from: x */
    private boolean f15492x;

    /* renamed from: y */
    private int f15493y;

    /* renamed from: z */
    private int f15494z;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.FastGiftView$a */
    public interface C5910a {
    }

    /* renamed from: j */
    private void m12868j() {
        m12862a(this.f15473e.f15415e);
        this.f15473e.mo11784h();
    }

    /* renamed from: c */
    public final void mo11792c() {
        if (this.f15472d) {
            C4575an.m10981a((int) R.string.eh4);
        }
    }

    /* renamed from: i */
    private void m12867i() {
        if (this.f15467G != null) {
            ViewParent parent = this.f15467G.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f15467G);
            }
        }
    }

    /* renamed from: g */
    private boolean m12865g() {
        if (((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10093b((long) this.f15473e.mo11782f())) {
            return false;
        }
        String channel = ((IHostContext) C4116c.m10249a(IHostContext.class)).getChannel();
        if ("test".equals(channel) || "local_test".equals(channel)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m12866h() {
        if (this.f15478j instanceof FragmentActivity) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(IWalletService.KEY_BUNDLE_IS_ANCHOR, this.f15476h);
            bundle.putString(IWalletService.KEY_BUNDLE_CHARGE_REASON, "shortcut_gift");
            ((IWalletService) C4116c.m10249a(IWalletService.class)).showRechargeDialog((FragmentActivity) this.f15478j, bundle, this.f15474f, null);
        }
    }

    /* renamed from: k */
    private static void m12869k() {
        C8049c.m15979a().mo14203a("shortcut_gift_show", Room.class, new C8059j().mo14213a("live_detail").mo14215c("bottom_tab").mo14214b(CustomActionPushReceiver.f104061f).mo14218f("other"));
    }

    /* renamed from: a */
    public final void mo11787a() {
        if (this.f15472d && this.f15473e.mo11780b()) {
            C4575an.m10981a((int) R.string.f0x);
            if (((Integer) LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE.mo9431a()).intValue() == 1) {
                m12866h();
                return;
            }
            Activity a = C3889d.m9831a(getContext());
            if (a != null) {
                ((IHostApp) C4116c.m10249a(IHostApp.class)).openWallet(a);
            }
        }
    }

    /* renamed from: l */
    private static void m12870l() {
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", String.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b()));
        C8049c.m15979a().mo14202a("convenient_gift_show", hashMap, Room.class, new C8059j().mo14213a("live_detail").mo14215c("bottom_tab").mo14214b(CustomActionPushReceiver.f104061f).mo14218f("other"));
    }

    /* renamed from: b */
    public final void mo11791b() {
        if (this.f15472d && this.f15477i) {
            if (this.f15476h) {
                this.f15474f.lambda$put$1$DataCenter("data_has_fast_gift", Boolean.valueOf(false));
                this.f15492x = true;
            } else if (!this.f15492x && this.f15473e.mo11780b()) {
                this.f15492x = true;
                C5213c.m11826b(this.f15484p, C5891t.m12825d().f20541b, this.f15494z, this.f15494z, 0);
                this.f15474f.lambda$put$1$DataCenter("data_has_fast_gift", Boolean.valueOf(true));
                postDelayed(new Runnable() {
                    public final void run() {
                        if (FastGiftView.this.f15472d && ((C8737f) C4116c.m10249a(C8737f.class)).mo15409a(C4528e.NEED_FAST_GIFT_HINT) && FastGiftView.this.isShown()) {
                            FastGiftView.this.f15471c = (C8374c) ((C8374c) ((C8374c) C8374c.m16598b(FastGiftView.this.getContext()).mo14562a((int) R.layout.aqu)).mo14572c(true)).mo14561a();
                            FastGiftView.this.f15471c.mo14566a(FastGiftView.this, 1, 4, C3922z.m9899a(20.0f), C3922z.m9899a(-4.0f));
                            FastGiftView.this.postDelayed(FastGiftView.this.f15482n, 3000);
                            ((C8737f) C4116c.m10249a(C8737f.class)).mo15408a((C8738a) C4528e.NEED_FAST_GIFT_HINT, false);
                        }
                    }
                }, 500);
                m12869k();
                if (isShown()) {
                    m12870l();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo11809e() {
        boolean z;
        if (!m12865g()) {
            if (this.f15475g == null || this.f15475g.mRoomAuthStatus == null || !this.f15475g.mRoomAuthStatus.isEnableGift()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                C4575an.m10981a((int) R.string.e5c);
            }
            if (this.f15473e.f15412b) {
                m12864f();
            } else if (this.f15472d && this.f15473e.mo11780b() && !this.f15473e.f15413c) {
                this.f15473e.mo11778a(getContext());
            }
        } else if (((Boolean) LiveSettingKeys.LIVE_MT_USER_CAN_RECHARGE.mo9431a()).booleanValue()) {
            mo11787a();
        } else {
            C4575an.m10981a((int) R.string.f0x);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f15472d = false;
        this.f15473e.mo8247a();
        removeCallbacks(this.f15482n);
        if (this.f15491w != null && this.f15491w.isShowing()) {
            C5928ag.m12924a(this.f15491w);
        }
        if (this.f15490v != null && this.f15490v.isShowing()) {
            C5928ag.m12924a(this.f15490v);
        }
        if (this.f15470b != null && this.f15470b.isShowing()) {
            C5928ag.m12924a(this.f15470b);
        }
        if (this.f15471c != null && this.f15471c.mo14577e()) {
            this.f15471c.dismiss();
        }
        this.f15478j = null;
        this.f15474f = null;
        this.f15492x = false;
        this.f15464D = false;
        this.f15477i = false;
        this.f15465E = false;
        this.f15466F = false;
        this.f15462B = this.f15483o;
        this.f15463C.removeCallbacksAndMessages(null);
        super.onDetachedFromWindow();
    }

    /* renamed from: f */
    private void m12864f() {
        if (this.f15472d && this.f15473e.mo11780b()) {
            C7505d d = C5891t.m12825d();
            C8049c.m15979a().mo14203a("shortcut_popup_show", Room.class, C8059j.class);
            if (this.f15491w != null) {
                if (!this.f15491w.isShowing()) {
                    this.f15491w.show();
                }
                return;
            }
            C8555i.m16887a();
            C8556a a = C8555i.m16886a(getContext());
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aj1, null);
            ((TextView) inflate.findViewById(R.id.bd1)).setText(R.string.egv);
            ((TextView) inflate.findViewById(R.id.bcw)).setText(R.string.egs);
            ((TextView) inflate.findViewById(R.id.bd0)).setText(getContext().getString(R.string.egu, new Object[]{Integer.valueOf(d.f20545f)}));
            a.mo14998a(inflate);
            this.f15491w = a.mo15003b(0, (int) R.string.eh3, (OnClickListener) new C5925ad(this)).mo15003b(1, (int) R.string.egr, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    HashMap hashMap = new HashMap();
                    hashMap.put("button_type", "cancel");
                    C8049c.m15979a().mo14202a("shortcut_popup_click", hashMap, Room.class, C8059j.class);
                }
            }).mo15006b(C5926ae.f15595a).mo15005b(C5927af.f15596a).mo15011d();
        }
    }

    /* renamed from: d */
    public final void mo11808d() {
        C3009i a = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a();
        if (a != null && a.childrenManagerForbidWalletFunctions()) {
            C4204a.m10421a(getContext(), (int) R.string.e4z);
        } else if (this.f15472d && this.f15473e.mo11780b() && !this.f15473e.f15413c) {
            C8049c.m15979a().mo14203a("shortcut_gift_click", Room.class, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click").mo14213a("live_detail").mo14215c("bottom_tab"));
            if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
                ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14516a(getContext(), C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.ev8)).mo14539a(-1).mo14544d("live_detail").mo14545e("enableGift").mo14543c("bottom_tab").mo14541a()).mo6314a((C1674ab<? super T>) new C8335g<Object>());
            } else if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14528a(C8336h.GIFT)) {
                this.f15474f.get("data_user_in_room");
                LiveSettingKeys.LIVE_FIRST_CHARGE_TIP_INFO.mo9431a();
                mo11809e();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15472d = true;
        m12863b(true);
        this.f15485q = new CircleProgressView(getContext());
        this.f15485q.setLayoutParams(new LayoutParams(this.f15493y, this.f15493y));
        this.f15485q.setVisibility(8);
        addView(this.f15485q);
        this.f15487s = new View(getContext());
        this.f15487s.setLayoutParams(new LayoutParams(this.f15493y, this.f15493y));
        this.f15487s.setBackgroundResource(R.drawable.bu6);
        this.f15487s.setVisibility(8);
        addView(this.f15487s);
        this.f15488t = new TextView(getContext());
        int b = (int) C9432q.m18687b(getContext(), 32.0f);
        int b2 = (int) C9432q.m18687b(getContext(), 2.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b, b);
        layoutParams.topMargin = b2;
        layoutParams.leftMargin = b2;
        this.f15488t.setLayoutParams(layoutParams);
        this.f15488t.setBackgroundResource(R.drawable.c32);
        this.f15488t.setTextSize(16.0f);
        this.f15488t.setGravity(17);
        this.f15488t.setTextColor(-1);
        this.f15488t.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (FastGiftView.this.f15472d && !FastGiftView.this.f15473e.f15413c) {
                    FastGiftView.this.mo11808d();
                }
            }
        });
        this.f15488t.setVisibility(8);
        addView(this.f15488t);
        this.f15484p = new AutoRTLImageView(getContext());
        int b3 = (int) C9432q.m18687b(getContext(), 5.0f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f15494z, this.f15494z);
        layoutParams2.topMargin = b3;
        layoutParams2.leftMargin = b3;
        if (VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart(b3);
        }
        this.f15484p.setLayoutParams(layoutParams2);
        C13837e eVar = new C13834b(getResources()).mo25912a().f36079a;
        if (eVar != null) {
            eVar.mo25932a((float) this.f15461A);
        }
        this.f15484p.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (FastGiftView.this.f15472d && !FastGiftView.this.f15473e.f15413c && (FastGiftView.this.f15469a == null || !FastGiftView.this.f15469a.isRunning())) {
                    if (!FastGiftView.this.f15473e.mo11783g()) {
                        if (FastGiftView.this.f15469a == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(FastGiftView.this, "scaleX", new float[]{1.0f, 1.3f, 1.0f});
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(FastGiftView.this, "scaleY", new float[]{1.0f, 1.3f, 1.0f});
                            FastGiftView.this.f15469a = new AnimatorSet();
                            FastGiftView.this.f15469a.setInterpolator(new LinearInterpolator());
                            FastGiftView.this.f15469a.setDuration(300);
                            FastGiftView.this.f15469a.playTogether(new Animator[]{ofFloat, ofFloat2});
                        }
                        FastGiftView.this.f15469a.start();
                        FastGiftView.this.postDelayed(FastGiftView.this.f15481m, 300);
                        return;
                    }
                    FastGiftView.this.mo11808d();
                }
            }
        });
        addView(this.f15484p);
        this.f15473e.mo8520a((C5893a) this);
        mo11791b();
        ((C4002ac) C4495a.m10823a().mo10300a(C7713e.class).mo6525a((C2203w<T, ? extends R>) C4021e.m10139a((View) this))).mo9405a((C1710e<? super T>) new C1710e<C7713e>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                FastGiftView.this.onEvent((C7713e) obj);
            }
        });
    }

    public void setOnGiftClickListener(C5910a aVar) {
        this.f15468H = aVar;
    }

    public FastGiftView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo11789a(String str) {
        if (this.f15472d) {
            C4575an.m10987a(str);
        }
    }

    /* renamed from: b */
    private void m12863b(boolean z) {
        int i;
        if (z) {
            i = R.drawable.c3b;
        } else {
            i = 0;
        }
        setBackgroundResource(i);
    }

    public void setNeverPay(boolean z) {
        if (!z || ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b() > 0) {
            this.f15465E = z;
        }
    }

    public void onEvent(C7713e eVar) {
        if (this.f15465E && this.f15466F) {
            C8049c.m15979a().mo14203a("first_recharge_success", Room.class, new C8059j().mo14213a("live_detail").mo14215c(CustomActionPushReceiver.f104061f).mo14214b(CustomActionPushReceiver.f104061f).mo14218f("other"));
        }
        this.f15465E = false;
    }

    public void handleMsg(Message message) {
        if (message != null) {
            switch (message.what) {
                case 1:
                    this.f15462B--;
                    if (this.f15462B <= 0) {
                        this.f15464D = false;
                        this.f15484p.setVisibility(0);
                        this.f15487s.setVisibility(8);
                        this.f15488t.setVisibility(8);
                        m12863b(true);
                        this.f15463C.removeMessages(1);
                        if (this.f15489u != null && this.f15489u.isRunning()) {
                            this.f15489u.end();
                        }
                        m12868j();
                        return;
                    }
                    this.f15464D = true;
                    this.f15488t.setText(String.valueOf(this.f15462B));
                    this.f15463C.sendEmptyMessageDelayed(1, 1000);
                    return;
                case 2:
                    this.f15485q.setVisibility(8);
                    m12868j();
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m12862a(int i) {
        if (i > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("gift_type", "convenient_gift");
            hashMap.put("gift_cnt", String.valueOf(i));
            hashMap.put("gift_id", String.valueOf(this.f15473e.mo11781e()));
            hashMap.put("money", String.valueOf(this.f15473e.mo11782f() * i));
            hashMap.put("request_page", "shortcut");
            HashMap hashMap2 = new HashMap();
            hashMap2.put(Long.valueOf(this.f15473e.mo11781e()), Integer.valueOf(i));
            hashMap.put("gift_info", C7459a.m15414a(hashMap2));
            hashMap.put("is_first_consume", String.valueOf(((IWalletService) C4116c.m10249a(IWalletService.class)).isFirstConsume(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a())));
            hashMap.put("growth_deepevent", "1");
            C8049c.m15979a().mo14202a("send_gift", hashMap, new C8059j().mo14213a("live_detail").mo14215c("bottom_tab").mo14214b("live_interact").mo14218f("other"), Room.class, ((C4133a) C4116c.m10249a(C4133a.class)).getLinkCrossRoomLog());
        }
    }

    /* renamed from: a */
    public final void mo11790a(boolean z) {
        if (this.f15472d && this.f15477i) {
            C5213c.m11826b(this.f15484p, C5891t.m12825d().f20541b, this.f15494z, this.f15494z, 0);
            if (z) {
                if (this.f15467G == null) {
                    TextView textView = new TextView(getContext());
                    int b = (int) C9432q.m18687b(getContext(), 24.0f);
                    int b2 = (int) C9432q.m18687b(getContext(), 4.0f);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C9432q.m18687b(getContext(), 28.0f), (int) C9432q.m18687b(getContext(), 12.0f));
                    layoutParams.topMargin = b;
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = b2;
                    textView.setLayoutParams(layoutParams);
                    textView.setBackgroundResource(R.drawable.c33);
                    textView.setTextSize(8.0f);
                    textView.setGravity(17);
                    textView.setTextColor(-1);
                    textView.setText(R.string.egy);
                    this.f15467G = textView;
                } else {
                    m12867i();
                }
                addView(this.f15467G);
                return;
            }
            m12867i();
        }
    }

    /* renamed from: a */
    public final void mo11788a(C7514m mVar) {
        int i;
        if (this.f15472d && mVar != null) {
            ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14527a(true);
            if (this.f15474f != null) {
                User user = (User) this.f15474f.get("data_user_in_room");
                IMessageManager iMessageManager = (IMessageManager) this.f15474f.get("data_message_manager");
                if (iMessageManager != null) {
                    iMessageManager.insertMessage(C7519o.m15511a(this.f15475g.getId(), mVar, user));
                }
            }
            this.f15473e.f15415e++;
            int i2 = 0;
            if (((Integer) LiveSettingKeys.LIVE_FAST_GIFT_COMBO_STYLE.mo9431a()).intValue() == 1) {
                if (this.f15473e.mo11783g()) {
                    if (this.f15486r == null) {
                        this.f15486r = ObjectAnimator.ofFloat(this.f15485q, "progress", new float[]{360.0f, 0.0f});
                        this.f15486r.setDuration(((long) this.f15483o) * 1000);
                    } else if (this.f15486r.isRunning()) {
                        this.f15486r.cancel();
                    }
                    this.f15485q.setVisibility(0);
                    this.f15486r.start();
                    if (this.f15463C.hasMessages(2)) {
                        this.f15463C.removeMessages(2);
                    }
                    this.f15463C.sendEmptyMessageDelayed(2, ((long) this.f15483o) * 1000);
                } else {
                    this.f15464D = false;
                    this.f15484p.setVisibility(0);
                    this.f15485q.setVisibility(8);
                    m12868j();
                }
            } else if (this.f15473e.mo11783g()) {
                if (!this.f15464D) {
                    this.f15484p.setVisibility(8);
                    this.f15487s.setVisibility(0);
                    this.f15488t.setVisibility(0);
                    m12863b(false);
                }
                if (this.f15489u == null) {
                    this.f15489u = ObjectAnimator.ofFloat(this.f15487s, "rotation", new float[]{0.0f, 360.0f});
                    this.f15489u.setDuration(500);
                    this.f15489u.setInterpolator(new LinearInterpolator());
                    this.f15489u.setRepeatCount(-1);
                    this.f15489u.setRepeatMode(1);
                } else if (this.f15489u.isRunning()) {
                    this.f15489u.cancel();
                }
                this.f15464D = true;
                this.f15462B = this.f15483o;
                this.f15488t.setText(String.valueOf(this.f15462B));
                this.f15489u.start();
                this.f15463C.removeMessages(1);
                this.f15463C.sendEmptyMessageDelayed(1, 1000);
            } else {
                this.f15464D = false;
                this.f15484p.setVisibility(0);
                this.f15487s.setVisibility(8);
                this.f15488t.setVisibility(8);
                m12863b(true);
                m12868j();
            }
            if (C4600j.m11040b(this.f15474f) && this.f15475g.author() != null) {
                C7505d findGiftById = GiftManager.inst().findGiftById(mVar.f20613e);
                JSONObject jSONObject = new JSONObject();
                String str = "amount";
                if (findGiftById == null) {
                    i = 0;
                } else {
                    try {
                        i = findGiftById.f20545f;
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put(str, String.valueOf(i));
                jSONObject.put("anchor_id", String.valueOf(this.f15475g.author().getId()));
                jSONObject.put("room_id", String.valueOf(this.f15475g.getId()));
                C4116c.m10249a(C8612a.class);
                C8066a.m16007a().mo14223a(jSONObject).mo14222a(C4600j.m11041c(this.f15474f));
            }
            if (C4600j.m11043d(this.f15474f) && this.f15475g.author() != null) {
                C7505d findGiftById2 = GiftManager.inst().findGiftById(mVar.f20613e);
                JSONObject jSONObject2 = new JSONObject();
                String str2 = "amount";
                if (findGiftById2 != null) {
                    try {
                        i2 = findGiftById2.f20545f;
                    } catch (JSONException unused2) {
                    }
                }
                jSONObject2.put(str2, String.valueOf(i2));
                jSONObject2.put("anchor_id", String.valueOf(this.f15475g.author().getId()));
                jSONObject2.put("room_id", String.valueOf(this.f15475g.getId()));
                C4116c.m10249a(C8612a.class);
                C8066a.m16007a().mo14223a(jSONObject2).mo14222a(C4600j.m11044e(this.f15474f));
            }
        }
    }

    public FastGiftView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FastGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15462B = this.f15483o;
        this.f15480l = "";
        this.f15481m = new Runnable() {
            public final void run() {
                FastGiftView.this.mo11808d();
            }
        };
        this.f15482n = new Runnable() {
            public final void run() {
                if (FastGiftView.this.f15472d && FastGiftView.this.f15470b != null && FastGiftView.this.f15470b.isShowing()) {
                    FastGiftView.this.f15470b.dismiss();
                }
                if (FastGiftView.this.f15472d && FastGiftView.this.f15471c != null && FastGiftView.this.f15471c.mo14577e()) {
                    FastGiftView.this.f15471c.dismiss();
                }
            }
        };
        this.f15468H = null;
        this.f15493y = (int) C9432q.m18687b(getContext(), 36.0f);
        this.f15494z = (int) C9432q.m18687b(getContext(), 26.0f);
        this.f15461A = (int) C9432q.m18687b(getContext(), 20.0f);
        this.f15483o = ((Integer) C6718b.f18310G.mo9431a()).intValue();
        this.f15473e = new C5891t();
        this.f15463C = new C9381g(this);
    }
}
