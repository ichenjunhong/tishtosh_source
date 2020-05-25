package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.os.Vibrator;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.C1506w;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p667c.C10672b;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C31223w;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30447d;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer.C31039a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer.C31040b;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer.C31040b.C31041a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer.C31042c;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer.C31050i;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer.experiment.CorrelatedVideosSearchExperiment;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.shortvideo.C42422am;
import com.p683ss.android.ugc.aweme.similarvideo.p2268a.C45643a;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout */
public class DisLikeAwemeLayout extends FrameLayout implements C9382a, C30313ae<C30332aw>, C30447d {

    /* renamed from: n */
    public static int f80349n = 0;

    /* renamed from: o */
    private static final float f80350o = ((float) C31040b.f81277b);

    /* renamed from: x */
    private static boolean f80351x = false;

    /* renamed from: A */
    private int f80352A;

    /* renamed from: B */
    private int f80353B;

    /* renamed from: C */
    private int f80354C;

    /* renamed from: D */
    private boolean f80355D;

    /* renamed from: a */
    public Context f80356a;

    /* renamed from: b */
    public C31050i f80357b;

    /* renamed from: c */
    public RecyclerView f80358c;

    /* renamed from: d */
    public View f80359d;

    /* renamed from: e */
    public Aweme f80360e;

    /* renamed from: f */
    public View f80361f;

    /* renamed from: g */
    public View f80362g;

    /* renamed from: h */
    public View f80363h;

    /* renamed from: i */
    public TextView f80364i;

    /* renamed from: j */
    protected C9381g f80365j;

    /* renamed from: k */
    public boolean f80366k;

    /* renamed from: l */
    public String f80367l;

    /* renamed from: m */
    public boolean f80368m;

    /* renamed from: p */
    private View f80369p;

    /* renamed from: q */
    private Activity f80370q;

    /* renamed from: r */
    private C31039a f80371r;

    /* renamed from: s */
    private TextView f80372s;

    /* renamed from: t */
    private RemoteImageView f80373t;

    /* renamed from: u */
    private LinearLayout f80374u;

    /* renamed from: v */
    private ValueAnimator f80375v;

    /* renamed from: w */
    private AnimatorListenerAdapter f80376w;

    /* renamed from: y */
    private C45643a f80377y;

    /* renamed from: z */
    private Exception f80378z;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo60714a(Object obj) {
    }

    public C1322a getAdapter() {
        return this.f80371r;
    }

    /* renamed from: a */
    private void m71990a() {
        if (this.f80371r != null) {
            this.f80371r.mo63830a(this.f80360e, this.f80367l);
        }
    }

    /* renamed from: g */
    public final String mo60874g(boolean z) {
        return this.f80367l;
    }

    public void setInDislikeMode(boolean z) {
        this.f80368m = z;
    }

    public void setListener(C31050i iVar) {
        this.f80357b = iVar;
    }

    public DisLikeAwemeLayout(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f80368m) {
            return false;
        }
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void handleMsg(Message message) {
        if (getVisibility() == 0 || this.f80366k) {
            if (message != null && message.what == 1) {
                f80351x = true;
                if (this.f80377y != null) {
                    m71992a(this.f80377y.f115420a, this.f80377y.f115421b);
                    this.f80377y = null;
                } else if (this.f80378z != null) {
                    m71992a(false, (UrlModel) null);
                }
            }
            if (message.obj instanceof Exception) {
                this.f80378z = (Exception) message.obj;
                if (f80351x) {
                    m71992a(false, (UrlModel) null);
                }
                return;
            }
            if (message.obj instanceof C45643a) {
                this.f80377y = (C45643a) message.obj;
                if (f80351x) {
                    m71992a(this.f80377y.f115420a, this.f80377y.f115421b);
                    this.f80377y = null;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo63291a(boolean z) {
        ObjectAnimator objectAnimator;
        m71991a(0.0f, 0.0f);
        this.f80366k = false;
        f80351x = false;
        if (this.f80365j.hasMessages(1)) {
            this.f80365j.removeMessages(1);
        }
        if (this.f80375v != null) {
            this.f80375v.removeListener(this.f80376w);
            this.f80375v.cancel();
            this.f80375v = null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f80369p, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(150);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f80374u, "alpha", new float[]{1.0f, 0.0f});
        ofFloat2.setDuration(200);
        if (this.f80355D) {
            objectAnimator = ObjectAnimator.ofFloat(this.f80374u, "translationY", new float[]{0.0f, f80350o});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(this.f80374u, "translationY", new float[]{f80350o, 0.0f});
        }
        objectAnimator.setDuration(250);
        if (!C31041a.m72639a()) {
            objectAnimator.setInterpolator(new C10672b());
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2).with(objectAnimator);
        animatorSet.start();
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                DisLikeAwemeLayout.this.f80358c.setVisibility(8);
                DisLikeAwemeLayout.this.f80359d.setVisibility(8);
                DisLikeAwemeLayout.this.f80361f.setVisibility(8);
                DisLikeAwemeLayout.this.f80363h.setVisibility(8);
                DisLikeAwemeLayout.this.f80362g.setVisibility(8);
                DisLikeAwemeLayout.this.setVisibility(8);
                super.onAnimationEnd(animator);
            }
        });
    }

    public DisLikeAwemeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m71992a(final boolean z, UrlModel urlModel) {
        String str;
        f80351x = false;
        if (this.f80375v != null) {
            this.f80375v.removeListener(this.f80376w);
            this.f80375v.cancel();
            this.f80375v = null;
        }
        if (z) {
            String str2 = "similar_videos";
            C23089d a = new C23089d().mo47829a("enter_from", this.f80367l);
            String str3 = "group_id";
            if (this.f80360e == null) {
                str = "";
            } else {
                str = this.f80360e.getAid();
            }
            C26890h.m65011a(str2, a.mo47829a(str3, str).mo47829a("action_type", "show").f61491a);
        }
        if (z) {
            if (urlModel != null) {
                C23515d.m57669a(this.f80373t, urlModel);
            } else {
                this.f80373t.setImageResource(R.drawable.cqj);
            }
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f80361f, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(200);
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                DisLikeAwemeLayout.this.f80361f.setVisibility(8);
                if (z) {
                    DisLikeAwemeLayout.this.f80363h.setAlpha(0.0f);
                    DisLikeAwemeLayout.this.f80363h.setVisibility(0);
                    return;
                }
                DisLikeAwemeLayout.this.f80362g.setAlpha(0.0f);
                DisLikeAwemeLayout.this.f80362g.setVisibility(0);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f80363h, "alpha", new float[]{0.0f, 1.0f});
            ofFloat2.setDuration(200);
            animatorSet.play(ofFloat).before(ofFloat2);
        } else {
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f80362g, "alpha", new float[]{0.0f, 1.0f});
            ofFloat3.setDuration(200);
            animatorSet.play(ofFloat).before(ofFloat3);
        }
        animatorSet.start();
    }

    /* renamed from: a */
    private void m71991a(float f, float f2) {
        if (this.f80369p == null && getChildCount() == 0) {
            View.inflate(this.f80356a, R.layout.b41, this);
            this.f80369p = findViewById(R.id.a69);
            this.f80358c = (RecyclerView) findViewById(R.id.cma);
            this.f80372s = (TextView) findViewById(R.id.cmb);
            this.f80359d = findViewById(R.id.a6f);
            this.f80359d.setVisibility(8);
            this.f80361f = findViewById(R.id.afz);
            this.f80374u = (LinearLayout) findViewById(R.id.bkm);
            if (C31041a.m72639a()) {
                LayoutParams layoutParams = new LayoutParams(this.f80358c.getLayoutParams());
                layoutParams.gravity = 17;
                layoutParams.topMargin = 0;
                this.f80358c.setLayoutParams(layoutParams);
            } else {
                C23729p.m58264b((View) this.f80372s, 0);
                this.f80372s.setTextColor(C0726c.m2098c(this.f80356a, R.color.v6));
            }
            setOnClickListener(new C31105n(this));
            this.f80361f.setOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return true;
                }
            });
            this.f80361f.setVisibility(8);
            this.f80364i = (TextView) findViewById(R.id.ag1);
            this.f80363h = findViewById(R.id.afx);
            this.f80363h.setVisibility(8);
            this.f80363h.setOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(DisLikeAwemeLayout.this.f80363h, "alpha", new float[]{1.0f, 0.75f});
                        ofFloat.setDuration(150);
                        ofFloat.start();
                    }
                    return false;
                }
            });
            this.f80363h.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    String str;
                    ClickInstrumentation.onClick(view);
                    if (DisLikeAwemeLayout.this.f80357b != null) {
                        DisLikeAwemeLayout.this.f80357b.mo55955a(false);
                    }
                    C23794bh.m58407u().mo46886a(DisLikeAwemeLayout.this.f80356a, DisLikeAwemeLayout.this.f80360e);
                    String str2 = "similar_videos";
                    C23089d a = new C23089d().mo47829a("enter_from", DisLikeAwemeLayout.this.f80367l);
                    String str3 = "group_id";
                    if (DisLikeAwemeLayout.this.f80360e == null) {
                        str = "";
                    } else {
                        str = DisLikeAwemeLayout.this.f80360e.getAid();
                    }
                    C26890h.m65011a(str2, a.mo47829a(str3, str).mo47829a("action_type", "click").f61491a);
                }
            });
            this.f80373t = (RemoteImageView) findViewById(R.id.cgk);
            this.f80362g = findViewById(R.id.afy);
            this.f80362g.setVisibility(8);
            if (C31041a.m72639a()) {
                this.f80358c.setLayoutManager(new WrapLinearLayoutManager(this.f80356a, 1, false));
                this.f80358c.mo4798a((C1331h) new C31042c(1, 16));
            } else {
                this.f80358c.setLayoutManager(new WrapLinearLayoutManager(this.f80356a, 0, false));
                this.f80358c.mo4798a((C1331h) new C31042c(0, 12));
            }
            this.f80358c.setItemAnimator(new C1506w());
            this.f80371r = BusinessComponentServiceUtils.getMaskLayerOptionsAdapter(this.f80356a);
            this.f80371r.mo63831a(this.f80357b);
            this.f80358c.setAdapter(this.f80371r);
            this.f80354C = C23728o.m58241a(230.0d);
            this.f80352A = C23728o.m58241a(60.0d);
            this.f80353B = this.f80356a.getResources().getDisplayMetrics().heightPixels - this.f80352A;
        }
    }

    public DisLikeAwemeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f80355D = true;
        this.f80356a = context;
        this.f80370q = (Activity) this.f80356a;
        this.f80365j = new C9381g(Looper.getMainLooper(), this);
    }

    /* renamed from: a */
    public final void mo63290a(float f, float f2, String str, Aweme aweme) {
        boolean z;
        int i;
        ObjectAnimator objectAnimator;
        if (this.f80370q != null) {
            Vibrator vibrator = (Vibrator) this.f80370q.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(15);
            }
        }
        this.f80360e = aweme;
        this.f80367l = str;
        if (TextUtils.equals(str, "homepage_follow")) {
            z = false;
        } else {
            z = C10181b.m20511a().mo18172a(CorrelatedVideosSearchExperiment.class, true, "correlated_videos_search", 31744, false);
        }
        float a = C31223w.m72914a(getContext(), f, z);
        float a2 = C31223w.m72914a(getContext(), f2, z);
        this.f80366k = true;
        m71991a(a, a2);
        m71990a();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f80374u.getLayoutParams());
        if (C31041a.m72639a()) {
            layoutParams.setMargins(0, 0, 0, 0);
            layoutParams.gravity = 17;
        } else {
            int i2 = (int) a2;
            int i3 = i2 - this.f80354C;
            if (i3 < this.f80352A) {
                this.f80355D = false;
            } else {
                if (i3 > this.f80353B - this.f80354C) {
                    i2 = this.f80353B - this.f80354C;
                } else {
                    i2 = i3;
                }
                this.f80355D = true;
            }
            layoutParams.setMargins(0, i2, 0, 0);
        }
        this.f80374u.setLayoutParams(layoutParams);
        this.f80358c.setVisibility(0);
        setVisibility(0);
        if (C31041a.m72639a()) {
            i = 200;
        } else {
            i = 300;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f80369p, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(150);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f80374u, "alpha", new float[]{0.0f, 1.0f});
        long j = (long) i;
        ofFloat2.setDuration(j);
        if (this.f80355D) {
            objectAnimator = ObjectAnimator.ofFloat(this.f80374u, "translationY", new float[]{f80350o, 0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(this.f80374u, "translationY", new float[]{0.0f, f80350o});
        }
        objectAnimator.setDuration(j);
        if (!C31041a.m72639a()) {
            objectAnimator.setInterpolator(new OvershootInterpolator(1.04f));
        } else {
            objectAnimator.setInterpolator(new C42422am(0.25f, 0.1f, 0.25f, 1.0f));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(objectAnimator).with(ofFloat2);
        animatorSet.start();
        if (C31106o.m72690a(this.f80356a) && this.f80360e != null) {
            this.f80360e.isAd();
        }
    }
}
