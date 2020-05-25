package com.bytedance.android.livesdk.chatroom.p325ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.LuckyBoxApi;
import com.bytedance.android.livesdk.chatroom.event.C5180az;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.model.C5772z;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.presenter.C5821bf;
import com.bytedance.android.livesdk.chatroom.presenter.C5821bf.C5823a;
import com.bytedance.android.livesdk.chatroom.presenter.C5821bf.C5825c;
import com.bytedance.android.livesdk.chatroom.presenter.C5836bq;
import com.bytedance.android.livesdk.chatroom.presenter.C5837br;
import com.bytedance.android.livesdk.gift.panel.widget.C7595ao;
import com.bytedance.android.livesdk.message.model.C7833bh;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import com.bytedance.android.livesdk.p279af.p281b.C4586c;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8052c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdk.widget.RedEnvelopeProgressBar;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C1673aa;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ds */
public final class C6118ds extends Dialog implements OnClickListener, C5823a {

    /* renamed from: A */
    private ObjectAnimator f16392A;

    /* renamed from: B */
    private TextView f16393B;

    /* renamed from: C */
    private TextView f16394C;

    /* renamed from: D */
    private HSImageView f16395D;

    /* renamed from: E */
    private View f16396E;

    /* renamed from: F */
    private ImageView f16397F;

    /* renamed from: G */
    private TextView f16398G;

    /* renamed from: a */
    public final C1689b f16399a = new C1689b();

    /* renamed from: b */
    public boolean f16400b;

    /* renamed from: c */
    boolean f16401c = true;

    /* renamed from: d */
    ViewGroup f16402d;

    /* renamed from: e */
    View f16403e;

    /* renamed from: f */
    View f16404f;

    /* renamed from: g */
    RecyclerView f16405g;

    /* renamed from: h */
    View f16406h;

    /* renamed from: i */
    View f16407i;

    /* renamed from: j */
    private C5825c f16408j;

    /* renamed from: k */
    private C5821bf f16409k;

    /* renamed from: l */
    private Activity f16410l;

    /* renamed from: m */
    private int f16411m = 0;

    /* renamed from: n */
    private boolean f16412n;

    /* renamed from: o */
    private ViewGroup f16413o;

    /* renamed from: p */
    private ViewGroup f16414p;

    /* renamed from: q */
    private ViewGroup f16415q;

    /* renamed from: r */
    private RecyclerView f16416r;

    /* renamed from: s */
    private HSImageView f16417s;

    /* renamed from: t */
    private TextView f16418t;

    /* renamed from: u */
    private TextView f16419u;

    /* renamed from: v */
    private TextView f16420v;

    /* renamed from: w */
    private RedEnvelopeProgressBar f16421w;

    /* renamed from: x */
    private TextView f16422x;

    /* renamed from: y */
    private View f16423y;

    /* renamed from: z */
    private ObjectAnimator f16424z;

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16400b = true;
    }

    /* renamed from: e */
    private void m13288e() {
        this.f16399a.mo6181a(this.f16409k.mo11699a(this.f16408j).mo6505a((C1710e<? super T>) new C6130eb<Object>(this), (C1710e<? super Throwable>) new C6131ec<Object>(this)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo12156c() {
        if (this.f16392A != null && this.f16392A.isRunning()) {
            this.f16392A.cancel();
        }
    }

    /* renamed from: d */
    private void m13287d() {
        int b = this.f16409k.mo11704b(this.f16408j.f15284a.f21607b);
        if (b > 0) {
            this.f16419u.setText(C3922z.m9905a((int) R.string.f0a, Integer.valueOf(b)));
            return;
        }
        this.f16419u.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo12152a() {
        this.f16411m = 0;
        if (this.f16424z != null && this.f16424z.isRunning()) {
            this.f16424z.cancel();
        }
        this.f16422x.setVisibility(8);
        this.f16421w.setVisibility(8);
        this.f16404f.setVisibility(0);
        m13287d();
    }

    public final void onDetachedFromWindow() {
        this.f16400b = false;
        mo12156c();
        if (this.f16424z != null && this.f16424z.isRunning()) {
            this.f16424z.cancel();
        }
        C5821bf bfVar = this.f16409k;
        bfVar.f15278e = null;
        bfVar.f15277d = false;
        this.f16399a.mo6180a();
        super.onDetachedFromWindow();
    }

    /* renamed from: f */
    private void m13289f() {
        ((C4002ac) TTLiveSDKContext.getHostService().mo10315h().mo14516a(this.f16410l, C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.evb)).mo14539a(5).mo14544d("live_detail").mo14545e("red_envelope").mo14543c(CustomActionPushReceiver.f104061f).mo14541a()).mo6525a((C2203w<T, ? extends R>) C4021e.m10139a((View) this.f16402d))).mo9407a((C1674ab<? super T>) new C8335g<C3009i>() {
            public final void onSubscribe(C1690c cVar) {
                super.onSubscribe(cVar);
                C6118ds.this.f16399a.mo6181a(cVar);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo12155b() {
        boolean z;
        C5772z zVar = this.f16408j.f15284a.f21629x;
        if (zVar != null) {
            this.f16411m = 1;
            int i = 8;
            this.f16419u.setVisibility(8);
            this.f16420v.setVisibility(8);
            this.f16418t.setVisibility(8);
            this.f16415q.setVisibility(0);
            this.f16407i.setVisibility(8);
            this.f16416r.setVisibility(8);
            if (this.f16408j.f15284a.f21610e != 1 || !zVar.f15212a) {
                z = false;
            } else {
                z = true;
            }
            View view = this.f16396E;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
            LayoutParams layoutParams = (LayoutParams) this.f16413o.getLayoutParams();
            layoutParams.topMargin = C3922z.m9899a(20.0f);
            this.f16413o.setLayoutParams(layoutParams);
            if (z) {
                LayoutParams layoutParams2 = (LayoutParams) this.f16415q.getLayoutParams();
                layoutParams2.bottomMargin = C3922z.m9899a(64.0f);
                this.f16415q.setLayoutParams(layoutParams2);
            } else {
                LayoutParams layoutParams3 = (LayoutParams) this.f16415q.getLayoutParams();
                layoutParams3.bottomMargin = C3922z.m9899a(10.0f);
                this.f16415q.setLayoutParams(layoutParams3);
            }
            if (!zVar.f15212a) {
                this.f16393B.setText(this.f16393B.getContext().getString(R.string.ezz));
            } else if (zVar.f15214c == null) {
                String valueOf = String.valueOf(zVar.f15216e);
                String string = getContext().getString(R.string.f2p);
                SpannableString spannableString = new SpannableString(getContext().getString(R.string.f00, new Object[]{valueOf}));
                StyleSpan styleSpan = new StyleSpan(1);
                AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan((int) C9432q.m18669a(getContext(), 24.0f));
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(valueOf)) {
                    int length = string.length();
                    int length2 = valueOf.length() + length;
                    spannableString.setSpan(styleSpan, length, length2, 33);
                    spannableString.setSpan(absoluteSizeSpan, length, length2, 33);
                }
                this.f16393B.setText(spannableString);
            } else {
                this.f16393B.setText(R.string.f01);
                this.f16395D.setVisibility(0);
                C5213c.m11820a(this.f16395D, zVar.f15214c);
            }
            this.f16405g.setLayoutManager(new SSLinearLayoutManager(getContext(), 1, false));
            this.f16406h.setVisibility(0);
            this.f16405g.setVisibility(4);
            this.f16409k.mo11699a(this.f16408j);
            m13288e();
            m13287d();
        }
    }

    /* renamed from: a */
    public final void mo11710a(C8686a aVar) {
        this.f16401c = true;
        this.f16403e.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo11711a(Throwable th) {
        C3831a.m9714b("RushRedEnvelopeDialog", th);
        C4602l.m11046a(getContext(), th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12153a(int i) {
        if (i <= 60) {
            this.f16422x.setTextSize(32.0f);
            this.f16422x.setText(String.valueOf(i));
            return;
        }
        this.f16422x.setText(this.f16422x.getContext().getString(R.string.ezx, new Object[]{String.valueOf(i / 60)}));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12154a(boolean z) {
        this.f16419u.setVisibility(8);
        this.f16411m = 2;
        this.f16414p.setVisibility(8);
        this.f16420v.setVisibility(0);
        this.f16416r.setVisibility(8);
        LayoutParams layoutParams = (LayoutParams) this.f16413o.getLayoutParams();
        layoutParams.topMargin = C3922z.m9899a(48.0f);
        this.f16413o.setLayoutParams(layoutParams);
        if (z) {
            this.f16420v.setText(R.string.ezv);
        } else {
            this.f16423y.setVisibility(0);
        }
        m13287d();
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (this.f16403e.getId() == id) {
            if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                m13289f();
            } else {
                User user = this.f16408j.f15284a.f21606a;
                if (user != null) {
                    this.f16409k.mo11700a(user.getId());
                    C8049c.m15979a().mo14203a("follow", new C8052c("live_audience_c_audience", user.getId(), "red_packetage"), new C8059j().mo14214b("live_interact").mo14213a("live_detail"), Room.class);
                }
            }
        } else if (this.f16404f.getId() == id) {
            if (!(this.f16411m == 2 || this.f16411m == 1)) {
                if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                    m13289f();
                } else {
                    this.f16392A = ObjectAnimator.ofFloat(this.f16404f, "rotationY", new float[]{0.0f, 360.0f, 0.0f});
                    this.f16392A.setDuration(2000);
                    this.f16392A.setRepeatMode(1);
                    this.f16392A.setRepeatCount(2);
                    this.f16392A.start();
                    this.f16404f.setOnClickListener(null);
                    C1689b bVar = this.f16399a;
                    C5821bf bfVar = this.f16409k;
                    C5825c cVar = this.f16408j;
                    C2201v a = ((C4585b) ((LuckyBoxApi) C4514j.m10883j().mo10321b().mo9550a(LuckyBoxApi.class)).rush(cVar.f15284a.f21607b, bfVar.f15274a.getId(), cVar.f15284a.f21610e, cVar.f15284a.f21608c, cVar.f15284a.f21609d, bfVar.f15274a.getLabels()).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6525a((C2203w<T, ? extends R>) C4586c.m11025a())).mo10389a();
                    ((C4002ac) a.mo6525a((C2203w<T, ? extends R>) bfVar.mo11752q())).mo9406a(new C5836bq(bfVar, cVar), new C5837br(bfVar));
                    bVar.mo6181a(a.mo6505a((C1710e<? super T>) new C6132ed<Object>(this), (C1710e<? super Throwable>) new C6123dv<Object>(this)));
                }
            }
        } else if (this.f16423y.getId() == id) {
            mo12155b();
        } else if (this.f16407i.getId() == id) {
            this.f16409k.mo11699a(this.f16408j);
            m13288e();
        } else if (this.f16397F.getId() == id) {
            if (this.f16408j.f15284a.f21606a != null) {
                C4495a.m10823a().mo10301a((Object) new UserProfileEvent(this.f16408j.f15284a.f21606a));
            }
        } else if (this.f16396E.getId() == id) {
            C4495a.m10823a().mo10301a((Object) new C5180az(C7595ao.PROP));
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window == null) {
            dismiss();
            return;
        }
        window.requestFeature(1);
        setContentView(R.layout.aiz);
        this.f16402d = (ViewGroup) findViewById(R.id.cfg);
        if (!this.f16412n) {
            this.f16402d.post(new C6121dt(this));
        }
        window.getAttributes().gravity = 17;
        window.setLayout(-2, -2);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        this.f16417s = (HSImageView) findViewById(R.id.azs);
        this.f16413o = (ViewGroup) findViewById(R.id.ahn);
        this.f16397F = (ImageView) this.f16413o.findViewById(R.id.art);
        this.f16398G = (TextView) this.f16413o.findViewById(R.id.dcn);
        this.f16403e = this.f16413o.findViewById(R.id.d_l);
        this.f16416r = (RecyclerView) findViewById(R.id.bbt);
        this.f16414p = (ViewGroup) findViewById(R.id.ahf);
        this.f16421w = (RedEnvelopeProgressBar) this.f16414p.findViewById(R.id.c66);
        this.f16422x = (TextView) this.f16414p.findViewById(R.id.d8x);
        this.f16404f = this.f16414p.findViewById(R.id.cft);
        this.f16415q = (ViewGroup) findViewById(R.id.bbs);
        this.f16393B = (TextView) this.f16415q.findViewById(R.id.df6);
        this.f16394C = (TextView) this.f16415q.findViewById(R.id.df5);
        this.f16395D = (HSImageView) this.f16415q.findViewById(R.id.b3v);
        this.f16405g = (RecyclerView) this.f16415q.findViewById(R.id.cfu);
        this.f16406h = this.f16415q.findViewById(R.id.bbv);
        this.f16407i = this.f16415q.findViewById(R.id.bbu);
        this.f16418t = (TextView) findViewById(R.id.d9_);
        this.f16420v = (TextView) findViewById(R.id.df4);
        this.f16419u = (TextView) findViewById(R.id.d78);
        this.f16396E = findViewById(R.id.dfp);
        this.f16423y = findViewById(R.id.dfn);
        this.f16409k.f15278e = this;
        this.f16423y.setOnClickListener(this);
        this.f16403e.setOnClickListener(this);
        this.f16404f.setOnClickListener(this);
        this.f16396E.setOnClickListener(this);
        C7833bh bhVar = this.f16408j.f15284a;
        C2201v<Integer> vVar = this.f16408j.f15285b;
        C5772z zVar = bhVar.f21629x;
        if (bhVar.f21616k != null) {
            C5213c.m11820a(this.f16417s, bhVar.f21616k);
        }
        if (bhVar.f21606a != null) {
            User user = bhVar.f21606a;
            C5213c.m11826b(this.f16397F, user.getAvatarThumb(), this.f16397F.getWidth(), this.f16397F.getHeight(), 0);
            if (user.getId() != TTLiveSDKContext.getHostService().mo10315h().mo14529b()) {
                this.f16399a.mo6181a(TTLiveSDKContext.getHostService().mo10315h().mo14530b(user.getId()).mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6152a((C1710e<? super T>) new C6122du<Object>(this), C6124dw.f16430a));
            }
            this.f16398G.setText(user.getNickName());
            this.f16397F.setOnClickListener(this);
        }
        int i = bhVar.f21612g;
        SpannableString spannableString = new SpannableString(C3922z.m9905a((int) R.string.ezt, Integer.valueOf(i), bhVar.f21611f));
        int length = String.valueOf(i).length() + 4;
        spannableString.setSpan(new AbsoluteSizeSpan(C3922z.m9899a(18.0f)), 4, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ffffff")), 4, length, 33);
        this.f16418t.setText(spannableString);
        m13287d();
        if (!C9414h.m18630a(bhVar.f21615j)) {
            C6116dr drVar = new C6116dr(LayoutInflater.from(getContext()), R.layout.aqp);
            this.f16416r.setAdapter(drVar);
            this.f16416r.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            drVar.f16387a = bhVar.f21615j;
            drVar.notifyDataSetChanged();
            this.f16416r.setVisibility(0);
        }
        if (zVar != null) {
            mo12155b();
            return;
        }
        if (vVar == null) {
            mo12152a();
        } else {
            this.f16421w.setVisibility(0);
            this.f16422x.setVisibility(0);
            int a = (int) (C5821bf.m12695a(bhVar) / 1000);
            if (a < 0) {
                a = 0;
            }
            int i2 = ((bhVar.f21609d - a) * 100) / bhVar.f21609d;
            this.f16421w.setProgress(i2);
            this.f16424z = ObjectAnimator.ofInt(this.f16421w, "progress", new int[]{i2, 100});
            this.f16424z.setInterpolator(new LinearInterpolator());
            this.f16424z.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    if (C6118ds.this.f16400b) {
                        C6118ds.this.mo12152a();
                    }
                }
            });
            this.f16424z.setDuration((long) (a * 1000));
            this.f16424z.start();
            mo12153a(a);
            this.f16399a.mo6181a(vVar.mo6505a((C1710e<? super T>) new C6125dx<Object>(this), C6126dy.f16432a));
        }
        if (bhVar.f21606a != null) {
            this.f16399a.mo6181a(TTLiveSDKContext.getHostService().mo10315h().mo14534d(bhVar.f21606a.getId()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C6127dz<Object>(this, bhVar), C6129ea.f16436a));
        }
    }

    public C6118ds(Context context, C5825c cVar, C5821bf bfVar, DataCenter dataCenter) {
        super(context, R.style.y8);
        this.f16410l = (Activity) context;
        this.f16408j = cVar;
        this.f16409k = bfVar;
        this.f16412n = ((Boolean) dataCenter.get("data_is_portrait")).booleanValue();
    }
}
