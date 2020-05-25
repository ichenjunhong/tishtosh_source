package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0199s;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p230g.C3889d;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.browser.p290d.C4742w;
import com.bytedance.android.livesdk.chatroom.model.C5733av;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.presenter.C5860cf;
import com.bytedance.android.livesdk.chatroom.presenter.C5860cf.C5861a;
import com.bytedance.android.livesdk.chatroom.widget.AnimationLayer;
import com.bytedance.android.livesdk.chatroom.widget.C6665as;
import com.bytedance.android.livesdk.config.C6719c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.C7813ar;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4573al;
import com.bytedance.android.livesdk.p279af.C4574am;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p458l.C8841c;
import com.bytedance.android.livesdkapi.p458l.p459a.C8839e;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;

public class VoteWidget extends LiveRecyclableWidget implements C0199s<KVData>, OnClickListener, C5861a {

    /* renamed from: A */
    private View f17662A;

    /* renamed from: B */
    private AnimatorListener f17663B;

    /* renamed from: C */
    private boolean f17664C = false;

    /* renamed from: D */
    private boolean f17665D;

    /* renamed from: E */
    private int f17666E = 0;

    /* renamed from: a */
    C4742w f17667a;

    /* renamed from: b */
    public C5860cf f17668b;

    /* renamed from: c */
    private final int f17669c = 386;

    /* renamed from: d */
    private final int f17670d = 280;

    /* renamed from: e */
    private final int f17671e = 4;

    /* renamed from: f */
    private final int f17672f = ((int) C9432q.m18687b(C8830k.m17329c(), 32.0f));

    /* renamed from: g */
    private final float f17673g = 0.1f;

    /* renamed from: h */
    private final int f17674h = ((int) C9432q.m18687b(C8830k.m17329c(), 110.0f));

    /* renamed from: i */
    private final String f17675i = "asset://com.ss.android.ies.live.sdk/vote_time.webp";

    /* renamed from: j */
    private final String f17676j = "asset://com.ss.android.ies.live.sdk/vote_shine.webp";

    /* renamed from: k */
    private View f17677k;

    /* renamed from: l */
    private View f17678l;

    /* renamed from: m */
    private HSImageView f17679m;

    /* renamed from: n */
    private HSImageView f17680n;

    /* renamed from: o */
    private TextView f17681o;

    /* renamed from: p */
    private TextView f17682p;

    /* renamed from: q */
    private HSImageView f17683q;

    /* renamed from: r */
    private ViewGroup f17684r;

    /* renamed from: s */
    private ImageModel f17685s;

    /* renamed from: t */
    private ImageModel f17686t;

    /* renamed from: u */
    private HSImageView f17687u;

    /* renamed from: v */
    private HSImageView f17688v;

    /* renamed from: w */
    private View f17689w;

    /* renamed from: x */
    private View f17690x;

    /* renamed from: y */
    private AnimationLayer f17691y;

    /* renamed from: z */
    private C6665as f17692z;

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    public int getLayoutId() {
        return R.layout.by_;
    }

    /* renamed from: a */
    public final void mo11745a(IMessage iMessage) {
        if (this.f17667a != null && this.f17667a.mo9441a()) {
            ((C4002ac) C2201v.m6614b(iMessage).mo6529b(C2168a.m6519a()).mo6541d((C1711f<? super T, ? extends R>) new C6579fa<Object,Object>(iMessage)).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) autoDispose())).mo9406a(new C6580fb(this), C6581fc.f17919a);
        }
    }

    /* renamed from: a */
    public final void mo11741a() {
        this.f17684r.setVisibility(4);
        if (this.f17667a != null && this.f17667a.mo9441a()) {
            this.f17667a.dismiss();
            this.f17667a = null;
        }
    }

    public void onUnload() {
        this.f17668b.mo8247a();
        this.f17684r.setVisibility(4);
        if (this.f17692z != null) {
            C6665as asVar = this.f17692z;
            if (asVar.f18200q != null) {
                asVar.f18200q.removeAllListeners();
                asVar.f18200q.cancel();
            }
        }
        this.f17664C = false;
        this.f17666E = 0;
    }

    /* renamed from: b */
    public final void mo11746b(long j) {
        if (this.f17684r != null && this.f17684r.getVisibility() == 0) {
            this.f17682p.setText(C4574am.m10978a(j));
        }
        if (this.f17692z != null && this.f17692z.getVisibility() == 0) {
            this.f17692z.f18185b.setText(C4574am.m10978a(j));
        }
    }

    /* renamed from: c */
    public final void mo11748c(long j) {
        C9432q.m18691b((View) this.f17684r, 0);
        this.f17662A.setAlpha(0.0f);
        C9432q.m18691b((View) this.f17683q, 0);
        C9432q.m18691b((View) this.f17682p, 4);
        this.f17683q.setController(((C13773e) C13771c.m27870a().mo25725b(Uri.parse("asset://com.ss.android.ies.live.sdk/vote_time.webp")).mo25762c(true)).mo25763d());
    }

    public void onLoad(Object[] objArr) {
        if (this.dataCenter != null) {
            this.dataCenter.observe("cmd_vote_start_animation", this);
        }
        this.f17668b = new C5860cf();
        this.f17684r.setOnClickListener(this);
        this.f17663B = new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                if (VoteWidget.this.f17668b != null) {
                    VoteWidget.this.f17668b.mo11735a(2);
                }
            }
        };
        this.f17668b.mo8520a((C5861a) this);
    }

    /* renamed from: a */
    private static void m13857a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.05f});
        ofFloat.setDuration(133);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.05f, 1.0f});
        ofFloat2.setDuration(67);
        ofFloat2.setStartDelay(133);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.start();
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (kVData != null && kVData.getKey().equals("cmd_vote_start_animation")) {
            this.f17666E = (int) (((float) ((Integer) kVData.getData(Integer.valueOf(0))).intValue()) + C9432q.m18687b(getContext(), 4.0f));
            if (this.f17692z != null && !this.f17664C && this.f17668b.f15345a == 1) {
                this.f17664C = true;
                int x = (int) (this.containerView.getX() + ((float) this.f17674h));
                C9432q.m18680a((View) this.f17692z, -this.f17674h, this.f17666E, -3, -3);
                this.f17692z.setVisibility(0);
                this.f17692z.mo12795a(x, (AnimatorListener) C8841c.m17358a(this.f17663B));
            }
        }
    }

    public void onClick(View view) {
        long j;
        if (this.f17667a == null || !this.f17667a.mo9441a()) {
            if (this.f17665D) {
                C8049c.m15979a().mo14203a("livesdk_anchorcheck_click", Room.class, C8059j.class);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("user_id", String.valueOf(TTLiveSDKContext.getHostService().mo10315h().mo14529b()));
                C8049c.m15979a().mo14202a("livesdk_audiencecheck_click", hashMap, Room.class, C8059j.class);
            }
            C8839e eVar = new C8839e(((C6719c) LiveConfigSettingKeys.LIVE_VOTE_CONFIG.mo9431a()).f18367c);
            String str = "vote_id";
            C5860cf cfVar = this.f17668b;
            if (cfVar.f15346b != null) {
                j = cfVar.f15346b.f15089a;
            } else {
                j = 0;
            }
            eVar.mo15826a(str, j);
            C4104a a = C4514j.m10883j().mo10322c().mo10487a(C4704c.m11226a(eVar.mo15824a()).mo10510a(280).mo10514b(386).mo10518d(4).mo10520e(17));
            C4104a.m10232a(C3889d.m9832b(getContext()), a);
            if (a instanceof C4742w) {
                this.f17667a = (C4742w) a;
            }
        }
    }

    public void onInit(Object[] objArr) {
        this.f17665D = ((Boolean) this.dataCenter.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
        this.f17677k = this.contentView.findViewById(R.id.f7o);
        this.f17678l = this.contentView.findViewById(R.id.f7r);
        this.f17679m = (HSImageView) this.contentView.findViewById(R.id.b1s);
        this.f17680n = (HSImageView) this.contentView.findViewById(R.id.b3o);
        this.f17682p = (TextView) this.containerView.findViewById(R.id.dh7);
        this.f17681o = (TextView) this.containerView.findViewById(R.id.f27);
        try {
            this.f17682p.setTypeface(C4573al.m10974a(getContext()));
        } catch (Throwable unused) {
        }
        this.f17683q = (HSImageView) this.contentView.findViewById(R.id.f01);
        this.f17684r = (ViewGroup) this.contentView.findViewById(R.id.f7u);
        this.f17687u = (HSImageView) this.contentView.findViewById(R.id.f7p);
        this.f17688v = (HSImageView) this.contentView.findViewById(R.id.f7s);
        this.f17689w = this.contentView.findViewById(R.id.f7q);
        this.f17690x = this.contentView.findViewById(R.id.f7t);
    }

    /* renamed from: a */
    public final void mo11742a(long j) {
        C9432q.m18691b((View) this.f17692z, 4);
        if (this.f17691y != null) {
            this.f17691y.removeView(this.f17692z);
        }
        this.f17684r.setVisibility(0);
        this.f17682p.setText(C4574am.m10978a(j));
    }

    /* renamed from: a */
    private void m13858a(View view, float f) {
        if (f < 0.1f) {
            f = 0.1f;
        }
        C9432q.m18679a(view, -3, (int) (f * ((float) this.f17672f)));
    }

    /* renamed from: b */
    public final void mo11747b(long j, long j2) {
        mo11743a(j, j2);
        C9432q.m18691b((View) this.f17684r, 0);
        C9432q.m18691b((View) this.f17682p, 0);
        this.f17683q.setController(null);
        C9432q.m18691b((View) this.f17683q, 4);
        this.f17682p.setText(getContext().getResources().getString(R.string.ht3));
        if (j > j2) {
            this.f17687u.setVisibility(0);
            this.f17688v.setVisibility(4);
            this.f17681o.setVisibility(4);
            this.f17689w.setVisibility(0);
            m13859a(this.f17677k, this.f17687u, (View) this.f17679m);
        } else if (j < j2) {
            this.f17687u.setVisibility(4);
            this.f17688v.setVisibility(0);
            this.f17681o.setVisibility(4);
            this.f17690x.setVisibility(0);
            m13859a(this.f17678l, this.f17688v, (View) this.f17680n);
        } else {
            this.f17687u.setVisibility(4);
            this.f17688v.setVisibility(4);
            this.f17681o.setTextSize(1, 15.0f);
            this.f17681o.setVisibility(0);
            this.f17682p.setVisibility(4);
            C9432q.m18682a(this.f17681o, (CharSequence) getContext().getResources().getString(R.string.ht1));
            m13857a((View) this.f17681o);
        }
        this.f17662A = null;
    }

    /* renamed from: a */
    public final void mo11743a(long j, long j2) {
        View view;
        C9432q.m18691b((View) this.f17684r, 0);
        if (j < j2) {
            m13858a(this.f17678l, 1.0f);
            m13858a(this.f17677k, (((float) j) * 1.0f) / ((float) j2));
            view = this.f17680n;
        } else if (j > j2) {
            m13858a(this.f17677k, 1.0f);
            m13858a(this.f17678l, (((float) j2) * 1.0f) / ((float) j));
            view = this.f17679m;
        } else {
            m13858a(this.f17677k, 1.0f);
            m13858a(this.f17678l, 1.0f);
            this.f17681o.setTextSize(1, 20.0f);
            C9432q.m18682a(this.f17681o, (CharSequence) getContext().getResources().getString(R.string.ht0));
            view = this.f17681o;
        }
        if (this.f17668b.f15345a != 3) {
            if (this.f17662A == view) {
                this.f17662A.setAlpha(1.0f);
                return;
            }
            if (this.f17668b.f15345a != 4) {
                if (this.f17662A != null) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17662A, "alpha", new float[]{1.0f, 0.0f});
                    ofFloat.setDuration(67);
                    ofFloat.start();
                }
                if (view != null) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
                    ofFloat2.setDuration(67);
                    ofFloat2.setStartDelay(33);
                    ofFloat2.start();
                }
            }
            this.f17662A = view;
        }
    }

    /* renamed from: a */
    private void m13859a(View view, HSImageView hSImageView, View view2) {
        hSImageView.setController(((C13773e) C13771c.m27870a().mo25725b(Uri.parse("asset://com.ss.android.ies.live.sdk/vote_shine.webp")).mo25762c(true)).mo25763d());
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0f, 1.5f});
        if (view == this.f17677k) {
            view.setPivotX(0.0f);
        } else {
            view.setPivotX((float) view.getWidth());
        }
        ofFloat.setDuration(67);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hSImageView, "alpha", new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(66);
        ofFloat2.setStartDelay(67);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{20, 28});
        ofInt.addUpdateListener(new C6582fd(this, hSImageView));
        ofInt.setStartDelay(67);
        ofInt.setDuration(166);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofInt});
        animatorSet.start();
        m13857a(view2);
    }

    /* renamed from: a */
    public final void mo11744a(C5733av avVar, long j, boolean z) {
        int i;
        C5733av avVar2 = avVar;
        this.f17691y = (AnimationLayer) this.contentView.getRootView().findViewById(R.id.dxv);
        this.f17687u.setVisibility(4);
        this.f17688v.setVisibility(4);
        this.f17682p.setVisibility(0);
        this.f17679m.setAlpha(0.0f);
        this.f17680n.setAlpha(0.0f);
        this.f17681o.setAlpha(0.0f);
        this.f17681o.setTextSize(1, 20.0f);
        this.f17689w.setVisibility(4);
        this.f17690x.setVisibility(4);
        this.f17692z = new C6665as(getContext());
        LayoutParams layoutParams = new LayoutParams((int) C9432q.m18687b(getContext(), 110.0f), (int) C9432q.m18687b(getContext(), 96.0f));
        this.f17692z.setVisibility(4);
        this.f17691y.addView(this.f17692z, layoutParams);
        this.f17677k.setScaleX(1.0f);
        this.f17678l.setScaleX(1.0f);
        if (avVar2 != null && avVar2.f15090b != null && avVar2.f15090b.size() >= 2) {
            C7813ar arVar = (C7813ar) avVar2.f15090b.get(0);
            C7813ar arVar2 = (C7813ar) avVar2.f15090b.get(1);
            if (arVar != null && arVar2 != null) {
                if (arVar.f21513b > arVar2.f21513b) {
                    this.f17662A = this.f17679m;
                    m13858a(this.f17677k, 1.0f);
                    m13858a(this.f17678l, (((float) arVar2.f21513b) * 1.0f) / ((float) arVar.f21513b));
                } else if (arVar.f21513b < arVar2.f21513b) {
                    this.f17662A = this.f17680n;
                    m13858a(this.f17678l, 1.0f);
                    m13858a(this.f17677k, (((float) arVar.f21513b) * 1.0f) / ((float) arVar2.f21513b));
                } else {
                    this.f17662A = this.f17681o;
                    this.f17681o.setText(getContext().getResources().getString(R.string.ht0));
                    m13858a(this.f17678l, 1.0f);
                    m13858a(this.f17677k, 1.0f);
                }
                C9432q.m18691b(this.f17662A, 0);
                this.f17662A.setAlpha(1.0f);
                int x = (int) (this.containerView.getX() + ((float) this.f17674h));
                if (this.f17691y != null) {
                    C6665as asVar = this.f17692z;
                    int i2 = -this.f17674h;
                    if (this.f17666E == 0) {
                        i = (int) this.containerView.getY();
                    } else {
                        i = this.f17666E;
                    }
                    C9432q.m18680a((View) asVar, i2, i, -3, -3);
                }
                this.f17692z.setVisibility(0);
                this.f17692z.mo12795a(x, (AnimatorListener) C8841c.m17358a(this.f17663B));
                C6665as asVar2 = this.f17692z;
                if (!(avVar2 == null || avVar2.f15090b == null || avVar2.f15090b.size() < 2)) {
                    C7813ar arVar3 = (C7813ar) avVar2.f15090b.get(0);
                    C7813ar arVar4 = (C7813ar) avVar2.f15090b.get(1);
                    asVar2.f18186c.setText(arVar3.f21515d);
                    asVar2.f18188e.setText(arVar4.f21515d);
                    C5213c.m11814a((ImageView) asVar2.f18187d, arVar3.f21514c);
                    C5213c.m11814a((ImageView) asVar2.f18189f, arVar4.f21514c);
                    asVar2.f18185b.setText(C4574am.m10978a(j));
                    if (arVar3.f21513b == arVar4.f21513b) {
                        asVar2.f18194k.setVisibility(0);
                        asVar2.f18193j.setVisibility(8);
                        asVar2.f18194k.setAlpha(0.0f);
                        asVar2.f18197n = asVar2.f18194k;
                        asVar2.f18198o = 1.0f;
                        asVar2.f18199p = 1.0f;
                    } else {
                        if (arVar3.f21513b > arVar4.f21513b) {
                            asVar2.f18198o = 1.0f;
                            asVar2.f18199p = (((float) arVar4.f21513b) * 1.0f) / ((float) arVar3.f21513b);
                            C5213c.m11814a(asVar2.f18193j, arVar3.f21514c);
                        } else if (arVar3.f21513b < arVar4.f21513b) {
                            asVar2.f18199p = 1.0f;
                            asVar2.f18198o = (((float) arVar3.f21513b) * 1.0f) / ((float) arVar4.f21513b);
                            C5213c.m11814a(asVar2.f18193j, arVar4.f21514c);
                        }
                        asVar2.f18193j.setVisibility(0);
                        asVar2.f18194k.setVisibility(8);
                        asVar2.f18193j.setAlpha(0.0f);
                        asVar2.f18197n = asVar2.f18193j;
                    }
                    asVar2.f18195l.setText(C4574am.m10978a(j));
                }
                this.f17685s = arVar.f21514c;
                this.f17686t = arVar2.f21514c;
                C5213c.m11814a((ImageView) this.f17679m, this.f17685s);
                C5213c.m11814a((ImageView) this.f17680n, this.f17686t);
            }
        }
    }
}
