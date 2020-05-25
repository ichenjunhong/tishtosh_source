package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.os.CountDownTimer;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import android.widget.ImageButton;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3890e;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.presenter.C5779ad;
import com.bytedance.android.livesdk.chatroom.presenter.C5779ad.C5780a;
import com.bytedance.android.livesdk.chatroom.presenter.C5781ae;
import com.bytedance.android.livesdk.chatroom.presenter.C5782af;
import com.bytedance.android.livesdk.chatroom.presenter.C5783ag;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.relay.p381a.C7629a;
import com.bytedance.android.livesdk.gift.relay.p381a.C7631c;
import com.bytedance.android.livesdk.gift.relay.view.CountDownAnimationView;
import com.bytedance.android.livesdk.gift.relay.view.GiftRelayProgressBar;
import com.bytedance.android.livesdk.gift.relay.view.GiftRelayProgressBar.C7646a;
import com.bytedance.android.livesdk.message.model.C7804aj;
import com.bytedance.android.livesdk.message.model.C7870ck;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a.C8619a;
import com.bytedance.android.livesdkapi.p455i.C8819i;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1710e;

public class GiftRelayAnimWidget extends LiveRecyclableWidget implements OnClickListener, C5780a, C7646a, C8619a {

    /* renamed from: A */
    private C8819i f16992A;

    /* renamed from: B */
    private List<Integer> f16993B;

    /* renamed from: C */
    private int[] f16994C = {1000, 3000, 6000};

    /* renamed from: a */
    public View f16995a;

    /* renamed from: b */
    public CountDownAnimationView f16996b;

    /* renamed from: c */
    public GiftRelayProgressBar f16997c;

    /* renamed from: d */
    public TextView f16998d;

    /* renamed from: e */
    boolean f16999e;

    /* renamed from: f */
    User f17000f;

    /* renamed from: g */
    int f17001g;

    /* renamed from: h */
    public int f17002h;

    /* renamed from: i */
    ArrayDeque<Long> f17003i = new ArrayDeque<>();

    /* renamed from: j */
    boolean f17004j;

    /* renamed from: k */
    long f17005k;

    /* renamed from: l */
    private SimpleDraweeView f17006l;

    /* renamed from: m */
    private SimpleDraweeView f17007m;

    /* renamed from: n */
    private ObjectAnimator f17008n;

    /* renamed from: o */
    private CountDownTimer f17009o;

    /* renamed from: p */
    private SimpleDraweeView f17010p;

    /* renamed from: q */
    private HSImageView f17011q;

    /* renamed from: r */
    private ImageButton f17012r;

    /* renamed from: s */
    private TextView f17013s;

    /* renamed from: t */
    private C8618a f17014t;

    /* renamed from: u */
    private boolean f17015u;

    /* renamed from: v */
    private boolean f17016v;

    /* renamed from: w */
    private C5779ad f17017w;

    /* renamed from: x */
    private long f17018x;

    /* renamed from: y */
    private long f17019y;

    /* renamed from: z */
    private long f17020z;

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    /* renamed from: d */
    public final void mo12382d() {
        m13518e();
    }

    public int getLayoutId() {
        return R.layout.aky;
    }

    /* renamed from: a */
    public final void mo12380a() {
        m13514b(500);
    }

    /* renamed from: e */
    private void m13518e() {
        int i = 0;
        if (this.f17003i.isEmpty()) {
            this.f17004j = false;
            return;
        }
        long longValue = ((Long) this.f17003i.poll()).longValue();
        if (this.f17002h != 0) {
            if (longValue >= ((long) this.f17001g)) {
                int i2 = (int) longValue;
                this.f17001g = ((i2 / this.f17002h) + 1) * this.f17002h;
                Boolean valueOf = Boolean.valueOf(false);
                while (true) {
                    if (i < this.f16994C.length) {
                        if (longValue >= ((long) this.f16994C[i]) && longValue < ((long) (this.f16994C[i] + this.f17002h))) {
                            valueOf = Boolean.valueOf(true);
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
                if (valueOf.booleanValue()) {
                    this.f16997c.mo14004a(i2 % this.f17002h, 1);
                } else {
                    this.f16997c.mo14004a(i2 % this.f17002h, 2);
                }
            } else {
                this.f16997c.mo14004a(((int) longValue) % this.f17002h, 0);
            }
        }
    }

    public void onUnload() {
        if (this.f17009o != null) {
            this.f17009o.cancel();
            this.f17009o = null;
        }
        if (this.f17008n != null && this.f17008n.isRunning()) {
            this.f17008n.cancel();
        }
        if (this.f16995a != null) {
            this.f16995a.animate().cancel();
            this.f16995a.setVisibility(8);
        }
        if (this.f17006l != null) {
            this.f17016v = false;
            this.f17006l.setVisibility(8);
        }
        if (this.f17010p != null) {
            this.f17015u = false;
            this.f17010p.setVisibility(8);
        }
        if (this.f17014t != null) {
            this.f17014t.removeMessages(0);
            this.f17014t.removeMessages(1);
        }
        if (this.f17017w != null) {
            this.f17017w.mo8247a();
        }
        this.f17000f = null;
        this.f16999e = false;
    }

    /* renamed from: c */
    public final void mo12381c() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f);
        scaleAnimation.setDuration(166);
        scaleAnimation.setRepeatCount(0);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setAnimationListener(new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f);
                animation.setDuration(166);
                animation.setRepeatCount(0);
                animation.setFillAfter(true);
                GiftRelayAnimWidget.this.f16998d.startAnimation(scaleAnimation);
            }
        });
        this.f16998d.startAnimation(scaleAnimation);
        long j = this.f17020z;
        if (this.f16994C.length >= 3) {
            if (j >= ((long) this.f16994C[0]) && j < ((long) this.f16994C[1])) {
                this.f16997c.setProgressBarDrawable(C3922z.m9901a().getDrawable(R.drawable.bhr));
            } else if (j >= ((long) this.f16994C[1]) && this.f17019y < ((long) this.f16994C[2])) {
                this.f16997c.setProgressBarDrawable(C3922z.m9901a().getDrawable(R.drawable.bhs));
            } else if (j >= ((long) this.f16994C[2])) {
                this.f16997c.setProgressBarDrawable(C3922z.m9901a().getDrawable(R.drawable.bht));
            }
        }
        this.f16997c.setmProgressBarRank(String.valueOf(this.f17001g));
    }

    /* renamed from: a */
    public final void mo11669a(C7629a aVar) {
        m13513a(aVar, 0, false);
    }

    /* renamed from: a */
    public final void mo11670a(C7804aj ajVar) {
        if (ajVar != null) {
            this.f17018x = ajVar.f21464a;
            m13513a(ajVar.f21471h, ajVar.f21466c, true);
        }
    }

    /* renamed from: a */
    private void m13512a(int i) {
        if (this.f17016v) {
            this.f17014t.removeMessages(0);
            this.f17014t.sendEmptyMessageDelayed(0, (long) i);
            return;
        }
        this.f17016v = true;
        this.f17006l.setVisibility(0);
        this.f17006l.setController(((C13773e) C13771c.m27870a().mo25723a("asset://com.ss.android.ies.live.sdk/gift/giftrelay_double_prize.webp").mo25762c(true)).mo25763d());
        this.f17014t.sendEmptyMessageDelayed(0, (long) i);
    }

    /* renamed from: b */
    private void m13514b(int i) {
        this.f17007m.setVisibility(0);
        this.f17007m.setController(((C13773e) C13771c.m27870a().mo25723a("asset://com.ss.android.ies.live.sdk/gift/giftrelay_star.webp").mo25762c(true)).mo25763d());
        this.f17014t.sendEmptyMessageDelayed(4, (long) i);
    }

    /* renamed from: c */
    private void m13516c(int i) {
        if (this.f17015u) {
            this.f17014t.removeMessages(1);
        }
        this.f17015u = true;
        this.f16996b.setVisibility(4);
        this.f17009o.cancel();
        this.f17010p.setVisibility(0);
        this.f17010p.setController(((C13773e) C13771c.m27870a().mo25723a("asset://com.ss.android.ies.live.sdk/gift/giftrelay_freeze.webp").mo25762c(true)).mo25763d());
        this.f17014t.sendEmptyMessageDelayed(1, (long) i);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.ala || id == R.id.p7) {
            C7870ck ckVar = new C7870ck();
            ckVar.f21793a = "endless_pallet";
            ckVar.f21794b = this.f17018x;
            this.dataCenter.lambda$put$1$DataCenter("cmd_show_gift_relay_dialog", ckVar);
        }
    }

    /* renamed from: d */
    private void m13517d(int i) {
        this.f16999e = true;
        this.dataCenter.lambda$put$1$DataCenter("data_is_gift_relay_showing", Boolean.valueOf(true));
        this.f16995a.setX(-C9432q.m18687b(this.context, 160.0f));
        this.f16995a.setVisibility(0);
        m13519e(i);
        this.f16995a.animate().translationX(0.0f).setDuration(333).start();
        HashMap hashMap = new HashMap();
        Room room = (Room) this.dataCenter.get("data_room", null);
        if (room != null) {
            long id = room.getOwner().getId();
            long id2 = room.getId();
            hashMap.put("anchor_id", String.valueOf(id));
            hashMap.put("room_id", String.valueOf(id2));
        }
        C8049c.m15979a().mo14202a("livesdk_endless_gift_pallet_show", hashMap, new Object[0]);
    }

    /* renamed from: a */
    public final void mo11060a(Message message) {
        if (message != null) {
            int i = message.what;
            if (i != 4) {
                if (i != 6) {
                    switch (i) {
                        case 0:
                            this.f17016v = false;
                            this.f17006l.setVisibility(8);
                            return;
                        case 1:
                            this.f17015u = false;
                            this.f17010p.setVisibility(8);
                            m13519e(15);
                            return;
                    }
                } else {
                    m13514b(1000);
                }
                return;
            }
            this.f17007m.setVisibility(8);
        }
    }

    /* renamed from: e */
    private void m13519e(int i) {
        if (!this.f17015u) {
            if (this.f17008n != null && this.f17008n.isRunning()) {
                this.f17008n.cancel();
            }
            if (this.f17009o != null) {
                this.f17009o.cancel();
            }
            this.f16996b.setTime(i);
            long j = ((long) i) * 1000;
            C62842 r1 = new CountDownTimer(j, 1000) {
                public final void onFinish() {
                    GiftRelayAnimWidget giftRelayAnimWidget = GiftRelayAnimWidget.this;
                    giftRelayAnimWidget.f17005k = 0;
                    giftRelayAnimWidget.f17004j = false;
                    giftRelayAnimWidget.f17003i.clear();
                    giftRelayAnimWidget.f16999e = false;
                    giftRelayAnimWidget.dataCenter.lambda$put$1$DataCenter("data_is_gift_relay_showing", Boolean.valueOf(false));
                    giftRelayAnimWidget.f17000f = null;
                    giftRelayAnimWidget.f17001g = giftRelayAnimWidget.f17002h;
                    giftRelayAnimWidget.f16995a.animate().translationX(-C9432q.m18687b(giftRelayAnimWidget.context, 160.0f)).setListener(new AnimatorListener() {
                        public final void onAnimationCancel(Animator animator) {
                        }

                        public final void onAnimationRepeat(Animator animator) {
                        }

                        public final void onAnimationStart(Animator animator) {
                        }

                        public final void onAnimationEnd(Animator animator) {
                            GiftRelayAnimWidget.this.f16995a.animate().setListener(null);
                            GiftRelayAnimWidget.this.f16997c.setProgress(0);
                            GiftRelayAnimWidget.this.f16995a.setVisibility(8);
                            GiftRelayAnimWidget.this.f16997c.setmProgressBarRank(String.valueOf(GiftRelayAnimWidget.this.f17002h));
                            GiftRelayAnimWidget.this.f16997c.setProgressBarDrawable(C3922z.m9901a().getDrawable(R.drawable.bhq));
                        }
                    }).setDuration(333).start();
                }

                public final void onTick(long j) {
                    double d = (double) j;
                    Double.isNaN(d);
                    int ceil = (int) Math.ceil(d / 1000.0d);
                    if (ceil > 15) {
                        ceil = 15;
                    }
                    GiftRelayAnimWidget.this.f16996b.setTime(ceil);
                }
            };
            this.f17009o = r1;
            this.f17009o.start();
            this.f16996b.setVisibility(0);
            this.f16996b.setCountDownTime(i);
            this.f17008n = ObjectAnimator.ofFloat(this.f16996b, "progress", new float[]{360.0f, 0.0f}).setDuration(j);
            this.f17008n.start();
        }
    }

    public void onInit(Object[] objArr) {
        this.f16995a = this.contentView.findViewById(R.id.ala);
        this.f17006l = (SimpleDraweeView) this.contentView.findViewById(R.id.a7j);
        this.f16996b = (CountDownAnimationView) this.contentView.findViewById(R.id.a19);
        this.f17010p = (SimpleDraweeView) this.contentView.findViewById(R.id.ajv);
        this.f17007m = (SimpleDraweeView) this.contentView.findViewById(R.id.c6i);
        this.f17011q = (HSImageView) this.contentView.findViewById(R.id.all);
        this.f16998d = (TextView) this.contentView.findViewById(R.id.alm);
        this.f17012r = (ImageButton) this.contentView.findViewById(R.id.p7);
        this.f16997c = (GiftRelayProgressBar) this.contentView.findViewById(R.id.alq);
        this.f17013s = (TextView) this.contentView.findViewById(R.id.aty);
        this.f17014t = new C8618a(this);
        this.f17017w = new C5779ad();
        this.f16997c.setmProgressBarListener(this);
        this.f16993B = new LinkedList();
    }

    public void onLoad(Object[] objArr) {
        this.f16995a.setOnClickListener(this);
        this.f17012r.setOnClickListener(this);
        this.f17017w.mo8520a((C5780a) this);
        Room room = (Room) this.dataCenter.get("data_room", null);
        if (room != null) {
            long j = 0;
            C7631c giftRelayInfo = GiftManager.inst().getGiftRelayInfo(0);
            C5779ad adVar = this.f17017w;
            long longValue = ((Long) this.dataCenter.get("data_room_id", Long.valueOf(0))).longValue();
            long ownerUserId = room.getOwnerUserId();
            if (giftRelayInfo != null) {
                j = giftRelayInfo.f20985c;
            }
            adVar.f15227a = ((GiftRetrofitApi) C4157e.m10322a().mo9550a(GiftRetrofitApi.class)).checkFreeCellStatus(longValue, ownerUserId, j).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6506a((C1710e<? super T>) new C5781ae<Object>(adVar), C5782af.f15229a, C5783ag.f15230a);
            this.f17002h = 1000;
            this.f16993B = Arrays.asList(new Integer[]{Integer.valueOf(0), Integer.valueOf(1000), Integer.valueOf(2000), Integer.valueOf(3000), Integer.valueOf(5000), Integer.valueOf(6000)});
            this.f16999e = false;
            if (LiveSettingKeys.LIVE_GIFT_CHAIN_LENTH.mo9431a() != null) {
                this.f16992A = (C8819i) LiveSettingKeys.LIVE_GIFT_CHAIN_LENTH.mo9431a();
                this.f17002h = this.f16992A.f24079a;
                this.f16993B = this.f16992A.f24080b;
            }
            this.f17001g = this.f17002h;
        }
    }

    /* renamed from: b */
    private void m13515b(C7629a aVar) {
        long j = aVar.f20975g;
        int i = 1;
        while (true) {
            if (i < this.f16993B.size()) {
                if (j < ((long) ((Integer) this.f16993B.get(i)).intValue()) && j >= ((long) ((Integer) this.f16993B.get(i - 1)).intValue())) {
                    break;
                }
                i++;
            } else {
                i = 0;
                break;
            }
        }
        if (i == 0) {
            i = this.f16993B.size() - 1;
        }
        User user = aVar.f20978j;
        this.f17000f = user;
        String str = "";
        if (user != null) {
            str = user.getNickName();
        }
        if (str == null) {
            str = "";
        }
        if (str.length() > 6) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, 5));
            sb.append("...");
            str = sb.toString();
        }
        long j2 = aVar.f20979k;
        switch (i) {
            case 1:
                this.f17013s.setText(this.context.getResources().getString(R.string.ec7, new Object[]{String.valueOf(((long) ((Integer) this.f16993B.get(i)).intValue()) - j)}));
                return;
            case 2:
                this.f17013s.setText(this.context.getResources().getString(R.string.ec8, new Object[]{str, String.valueOf(j2)}));
                return;
            case 3:
                this.f17013s.setText(this.context.getResources().getString(R.string.ec7, new Object[]{String.valueOf(((long) ((Integer) this.f16993B.get(i)).intValue()) - j)}));
                return;
            case 4:
                this.f17013s.setText(this.context.getResources().getString(R.string.ec8, new Object[]{str, String.valueOf(j2)}));
                return;
            case 5:
                this.f17013s.setText(this.context.getResources().getString(R.string.ec9, new Object[]{String.valueOf(6000 - (j % 6000))}));
                break;
        }
    }

    /* renamed from: a */
    private void m13513a(C7629a aVar, long j, boolean z) {
        long j2;
        boolean z2;
        if (aVar != null) {
            this.f17020z = aVar.f20975g;
            if (this.f17020z > 0) {
                if (this.f17020z < ((long) this.f17002h)) {
                    this.f17001g = this.f17002h;
                }
                if (z) {
                    j2 = this.f17018x;
                } else {
                    j2 = aVar.f20969a;
                }
                C7505d findGiftById = GiftManager.inst().findGiftById(j2);
                if (findGiftById != null) {
                    C5213c.m11820a(this.f17011q, findGiftById.f20541b);
                    this.f17019y = this.f17020z;
                    int i = (int) ((aVar.f20974f - aVar.f20970b) / 1000);
                    if (this.f16999e) {
                        m13519e(i);
                    } else {
                        m13517d(i);
                    }
                    m13515b(aVar);
                    boolean z3 = false;
                    if (this.f17020z > this.f17005k) {
                        if (this.f17020z < 10000) {
                            TextView textView = this.f16998d;
                            Resources resources = this.context.getResources();
                            StringBuilder sb = new StringBuilder();
                            sb.append(String.valueOf(this.f17020z));
                            sb.append(" ");
                            textView.setText(resources.getString(R.string.ec_, new Object[]{sb.toString()}));
                        } else {
                            TextView textView2 = this.f16998d;
                            Resources resources2 = this.context.getResources();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(C3890e.m9835c(this.f17020z));
                            sb2.append(" ");
                            textView2.setText(resources2.getString(R.string.ec_, new Object[]{sb2.toString()}));
                        }
                        this.f17005k = this.f17020z;
                    }
                    this.f17003i.offer(Long.valueOf(this.f17020z));
                    if (!this.f17004j) {
                        this.f17004j = true;
                        m13518e();
                    }
                    if (z) {
                        if (!aVar.f20976h || j != 100) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (aVar.f20977i && j == 500) {
                            z3 = true;
                        }
                    } else {
                        z2 = aVar.f20976h;
                        z3 = aVar.f20977i;
                    }
                    if (z2) {
                        int i2 = (int) (aVar.f20972d - aVar.f20970b);
                        if (i2 > 4500) {
                            i2 = 4500;
                        }
                        m13516c(i2);
                    }
                    if (z3) {
                        m13512a((int) (aVar.f20973e - aVar.f20970b));
                    }
                }
            }
        }
    }
}
