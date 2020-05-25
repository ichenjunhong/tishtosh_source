package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.p197d.C3051b;
import com.bytedance.android.live.core.p230g.C3890e;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.livesdk.chatroom.event.C5202u;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5324m.C5325a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5324m.C5326b;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.p279af.C4563ad;
import com.bytedance.android.livesdk.p279af.C4620v;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.imagepipeline.p975o.C14232c;
import com.facebook.imagepipeline.p975o.C14234d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.m */
public final class C6682m extends FrameLayout implements OnClickListener, C5326b, C9382a {

    /* renamed from: a */
    public TextView f18229a;

    /* renamed from: b */
    public DataCenter f18230b;

    /* renamed from: c */
    public C5325a f18231c;

    /* renamed from: d */
    public boolean f18232d;

    /* renamed from: e */
    public int f18233e = 5;

    /* renamed from: f */
    private HSImageView f18234f;

    /* renamed from: g */
    private ImageView f18235g;

    /* renamed from: h */
    private SurfaceView f18236h;

    /* renamed from: i */
    private TextView f18237i;

    /* renamed from: j */
    private TextView f18238j;

    /* renamed from: k */
    private TextView f18239k;

    /* renamed from: l */
    private View f18240l;

    /* renamed from: m */
    private View f18241m;

    /* renamed from: n */
    private View f18242n;

    /* renamed from: o */
    private View f18243o;

    /* renamed from: p */
    private TextView f18244p;

    /* renamed from: q */
    private TextView f18245q;

    /* renamed from: r */
    private View f18246r;

    /* renamed from: s */
    private ProgressBar f18247s;

    /* renamed from: t */
    private View f18248t;

    /* renamed from: u */
    private Animator f18249u;

    /* renamed from: v */
    private boolean f18250v;

    /* renamed from: w */
    private Handler f18251w;

    /* renamed from: x */
    private C6687a f18252x;

    /* renamed from: y */
    private int f18253y = 5;

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.m$a */
    public interface C6687a {
        /* renamed from: a */
        void mo11539a(C6682m mVar);
    }

    /* renamed from: a */
    public final void mo12811a() {
        this.f18250v = true;
    }

    public final C5325a getPresenter() {
        return this.f18231c;
    }

    /* renamed from: b */
    public final void mo12814b() {
        mo12812a(2);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        if (this.f18249u != null && this.f18249u.isRunning()) {
            this.f18249u.cancel();
        }
        this.f18251w.removeCallbacksAndMessages(null);
        this.f18231c.mo11492f();
        this.f18252x = null;
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        inflate(getContext(), R.layout.aq1, this);
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (C6682m.this.f18231c.mo11207a() != null) {
                    C6682m.this.f18230b.lambda$put$1$DataCenter("cmd_send_gift", C6682m.this.f18231c.mo11207a());
                }
            }
        });
        this.f18234f = (HSImageView) findViewById(R.id.c41);
        this.f18235g = (ImageView) findViewById(R.id.c40);
        this.f18237i = (TextView) findViewById(R.id.c45);
        this.f18238j = (TextView) findViewById(R.id.c43);
        this.f18239k = (TextView) findViewById(R.id.c44);
        this.f18240l = findViewById(R.id.c42);
        this.f18241m = findViewById(R.id.buq);
        this.f18241m.setOnClickListener(this);
        this.f18242n = findViewById(R.id.buk);
        this.f18242n.setOnClickListener(this);
        this.f18243o = findViewById(R.id.buc);
        this.f18244p = (TextView) findViewById(R.id.buo);
        this.f18245q = (TextView) findViewById(R.id.bur);
        this.f18246r = findViewById(R.id.bus);
        this.f18247s = (ProgressBar) findViewById(R.id.bup);
        this.f18229a = (TextView) findViewById(R.id.bum);
        this.f18248t = findViewById(R.id.bul);
        this.f18231c.mo11490a(this);
        mo12812a(this.f18250v ^ true ? 1 : 0);
        if (C8607a.f23572a && C4206c.m10426a(getContext()) && VERSION.SDK_INT >= 17) {
            this.f18244p.setLayoutDirection(1);
            this.f18244p.setTextDirection(4);
        }
    }

    /* renamed from: a */
    public final void mo11220a(boolean z) {
        int i;
        View view = this.f18243o;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    public final void setVisibility(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        setVisibility(i);
    }

    /* renamed from: a */
    public final void mo11218a(long j) {
        if (!String.valueOf(j).equals(this.f18245q.getText().toString())) {
            this.f18245q.setText(C3890e.m9833a(j));
        }
    }

    /* renamed from: a */
    public final void mo12813a(SurfaceView surfaceView) {
        if (surfaceView != null) {
            removeView(this.f18236h);
            this.f18236h = surfaceView;
            this.f18236h.setLayoutParams(new LayoutParams(-1, -1));
            ViewParent parent = this.f18236h.getParent();
            if (parent instanceof ViewGroup) {
                if (parent != this) {
                    ((ViewGroup) parent).removeView(this.f18236h);
                } else {
                    return;
                }
            }
            addView(this.f18236h, 0);
        }
    }

    /* renamed from: b */
    public final void mo11221b(boolean z) {
        int i;
        if (!z || this.f18232d) {
            this.f18241m.setVisibility(8);
            this.f18242n.setVisibility(8);
            return;
        }
        View view = this.f18241m;
        if (this.f18231c.mo11214d_()) {
            i = 4;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        this.f18242n.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo12812a(int i) {
        switch (i) {
            case 0:
                this.f18240l.setVisibility(0);
                this.f18248t.setVisibility(8);
                this.f18238j.setVisibility(0);
                this.f18239k.setText(R.string.gy_);
                this.f18238j.setText(String.valueOf(this.f18253y));
                this.f18251w.sendEmptyMessageDelayed(0, 1000);
                return;
            case 1:
                this.f18240l.setVisibility(8);
                this.f18248t.setVisibility(0);
                return;
            case 2:
                this.f18240l.setVisibility(0);
                this.f18248t.setVisibility(8);
                this.f18238j.setVisibility(4);
                this.f18239k.setText(R.string.gym);
                this.f18251w.sendEmptyMessageDelayed(1, 1500);
                break;
        }
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.buq) {
            if (this.f18236h != null && (this.f18236h instanceof C3051b)) {
                ((C3051b) this.f18236h).mo8318a_();
            }
        } else if (id == R.id.buk) {
            C8552a aVar = new C8552a(getContext(), 0);
            aVar.mo15012d((int) R.string.gyj).mo15008c((int) R.string.h0i);
            aVar.mo15003b(0, (int) R.string.gyi, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C6682m.this.mo12812a(2);
                    dialogInterface.dismiss();
                }
            }).mo15003b(1, (int) R.string.e45, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).mo15011d();
        }
    }

    public final void handleMsg(Message message) {
        switch (message.what) {
            case 0:
                this.f18253y--;
                if (this.f18253y < 0) {
                    mo12812a(1);
                    return;
                }
                this.f18238j.setText(String.valueOf(this.f18253y));
                this.f18251w.sendEmptyMessageDelayed(0, 1000);
                return;
            case 1:
                if (this.f18231c.mo11215e()) {
                    if (this.f18230b != null) {
                        this.f18230b.lambda$put$1$DataCenter("cmd_interact_state_change", new C5202u(5));
                    }
                    C4563ad.m10956a(this.f18231c.mo11211b(), "shutdown_connection", "guest_connection", false);
                    return;
                }
                this.f18252x.mo11539a(this);
                return;
            case 2:
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18229a, "scaleX", new float[]{1.0f, 2.0f, 1.0f});
                ofFloat.setRepeatCount(5);
                ofFloat.setDuration(1000);
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        if (C6682m.this.f18231c.mo11215e()) {
                            C6682m.this.mo12812a(2);
                        }
                    }

                    public final void onAnimationRepeat(Animator animator) {
                        C6682m.this.f18233e--;
                        C6682m.this.f18229a.setText(String.valueOf(C6682m.this.f18233e));
                    }

                    public final void onAnimationStart(Animator animator) {
                        C6682m.this.f18229a.setText(String.valueOf(C6682m.this.f18233e));
                        C6682m.this.f18229a.setVisibility(0);
                    }
                });
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f18229a, "scaleY", new float[]{1.0f, 2.0f, 1.0f});
                ofFloat2.setRepeatCount(5);
                ofFloat2.setDuration(1000);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                animatorSet.start();
                break;
        }
    }

    /* renamed from: a */
    public final void mo11219a(User user) {
        ImageModel avatarThumb = user.getAvatarThumb();
        C5213c.m11826b(this.f18235g, avatarThumb, this.f18235g.getWidth(), this.f18235g.getHeight(), R.drawable.bt6);
        if (avatarThumb == null || avatarThumb.getUrls() == null || avatarThumb.getUrls().size() == 0) {
            this.f18234f.setController(((C13773e) ((C13773e) C13771c.m27870a().mo25757b(C14232c.m29168a((int) R.drawable.bt6).mo26458a((C14234d) new C4620v(5, 0.0f, null)).mo26449a())).mo25759b(this.f18234f.getController())).mo25763d());
        } else {
            C5213c.m11821a(this.f18234f, avatarThumb, (C14234d) new C4620v(5, 0.0f, null));
        }
        this.f18237i.setText(user.getNickName());
        this.f18244p.setText(user.getNickName());
    }

    /* renamed from: a */
    public final void mo11217a(int i, boolean z) {
        if (!this.f18232d && this.f18250v && (this.f18249u == null || !this.f18249u.isRunning())) {
            this.f18249u = ObjectAnimator.ofInt(this.f18247s, "progress", new int[]{100, 0});
            this.f18249u.setDuration((long) (i * 1000));
            this.f18249u.setInterpolator(new LinearInterpolator());
            this.f18247s.setVisibility(0);
            this.f18249u.start();
            if (z) {
                this.f18251w.sendEmptyMessageDelayed(2, (long) ((i - 5) * 1000));
            }
        }
    }

    public C6682m(Context context, C5325a aVar, C6687a aVar2, DataCenter dataCenter) {
        super(context);
        this.f18231c = aVar;
        this.f18252x = aVar2;
        this.f18251w = new C9381g(this);
        this.f18230b = dataCenter;
    }
}
