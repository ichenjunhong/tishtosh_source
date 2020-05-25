package com.p683ss.android.ugc.aweme.i18n.musically.cut;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.medialib.FFMpegManager;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.profile.C39718ad;
import com.p683ss.android.ugc.aweme.profile.edit.C39835a;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40265bp;
import com.p683ss.android.ugc.aweme.profile.presenter.C39954ad;
import com.p683ss.android.ugc.aweme.profile.presenter.C39985s;
import com.p683ss.android.ugc.aweme.qrcode.view.C41047a;
import com.p683ss.android.ugc.aweme.shortvideo.p2175a.C42388a;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity */
public class AvatarCutActivity extends AmeActivity implements OnClickListener, OnTouchListener, C39985s, C40265bp {

    /* renamed from: w */
    private static final String f85970w = AvatarCutActivity.class.getCanonicalName();

    /* renamed from: A */
    private int f85971A;

    /* renamed from: B */
    private int f85972B;

    /* renamed from: C */
    private int f85973C;

    /* renamed from: D */
    private C39835a f85974D;

    /* renamed from: E */
    private ImmersionBar f85975E;

    /* renamed from: F */
    private RecyclerView f85976F;

    /* renamed from: G */
    private FrameLayout f85977G;

    /* renamed from: H */
    private int f85978H;

    /* renamed from: I */
    private TextView f85979I;

    /* renamed from: J */
    private int f85980J;

    /* renamed from: K */
    private TextView f85981K;

    /* renamed from: L */
    private TextView f85982L;

    /* renamed from: M */
    private int f85983M;

    /* renamed from: N */
    private float f85984N;

    /* renamed from: O */
    private int f85985O;

    /* renamed from: P */
    private C39954ad f85986P;

    /* renamed from: Q */
    private C41047a f85987Q;

    /* renamed from: R */
    private C39718ad f85988R;

    /* renamed from: S */
    private float f85989S;

    /* renamed from: T */
    private float f85990T;

    /* renamed from: a */
    public MediaPlayer f85991a;

    /* renamed from: b */
    public TextureView f85992b;

    /* renamed from: c */
    public RelativeLayout f85993c;

    /* renamed from: d */
    public String f85994d;

    /* renamed from: e */
    public int f85995e;

    /* renamed from: f */
    public ImageView f85996f;

    /* renamed from: g */
    public ImageView f85997g;

    /* renamed from: h */
    public int f85998h;

    /* renamed from: i */
    public int f85999i;

    /* renamed from: j */
    public int f86000j;

    /* renamed from: k */
    protected C45547d f86001k;

    /* renamed from: l */
    public View f86002l;

    /* renamed from: m */
    public View f86003m;
    @BindView(2131494819)
    View mStatusBarView;
    @BindView(2131494852)
    FrameLayout mSurfaceViewWrapper;

    /* renamed from: n */
    public Runnable f86004n;

    /* renamed from: o */
    protected String f86005o;

    /* renamed from: p */
    public boolean f86006p;

    /* renamed from: q */
    public volatile boolean f86007q;

    /* renamed from: r */
    public Thread f86008r;

    /* renamed from: s */
    public long f86009s = -1;

    /* renamed from: t */
    public int f86010t;

    /* renamed from: u */
    public Runnable f86011u = new Runnable() {
        public final void run() {
            if (AvatarCutActivity.this.f86008r != null) {
                try {
                    AvatarCutActivity.this.f86008r.join();
                } catch (InterruptedException unused) {
                }
            }
            if (AvatarCutActivity.this.isActive()) {
                if (AvatarCutActivity.this.f86009s > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - AvatarCutActivity.this.f86009s;
                    C23131p.m57778a("aweme_movie_publish", "crop_time", (float) currentTimeMillis);
                    if (!TextUtils.isEmpty(AvatarCutActivity.this.f86005o)) {
                        new File(AvatarCutActivity.this.f86005o);
                        if (currentTimeMillis <= 0) {
                            return;
                        }
                    }
                    AvatarCutActivity.this.f86009s = -1;
                }
                AvatarCutActivity.this.mo70159c();
            }
        }
    };

    /* renamed from: v */
    public int f86012v = 0;

    /* renamed from: x */
    private int f86013x;

    /* renamed from: y */
    private int f86014y;

    /* renamed from: z */
    private int f86015z;

    /* renamed from: h */
    private float m76132h() {
        return 1.2f;
    }

    /* renamed from: a */
    public final void mo50430a(AvatarUri avatarUri) {
    }

    /* renamed from: a */
    public final void mo54359a(User user, int i) {
    }

    /* renamed from: a */
    public final void mo50431a(Exception exc) {
    }

    /* renamed from: a */
    public final void mo54360a(Exception exc, int i) {
    }

    /* renamed from: a */
    public final void mo50432a(String str) {
    }

    /* renamed from: a */
    public final void mo54361a(String str, boolean z) {
    }

    /* renamed from: b */
    public final void mo70158b(String str) {
    }

    /* renamed from: e */
    public final void mo70161e() {
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: d */
    public final void mo70160d() {
        m76131g();
        mo70153a();
    }

    public void onBackPressed() {
        this.f85981K.performClick();
    }

    public void onStop() {
        super.onStop();
        mo70155b();
    }

    /* renamed from: i */
    private float m76133i() {
        return (3.0f / m76132h()) * ((float) this.f85983M);
    }

    /* renamed from: j */
    private float m76134j() {
        return (6.0f / m76132h()) * ((float) this.f85983M);
    }

    /* renamed from: k */
    private void m76135k() {
        if (this.f85987Q != null && this.f85987Q.isShowing()) {
            this.f85987Q.dismiss();
        }
    }

    /* renamed from: b */
    public final void mo70155b() {
        if (this.f85991a != null) {
            if (this.f85991a.isPlaying()) {
                this.f85991a.stop();
            }
            this.f85991a.release();
            this.f85991a = null;
        }
    }

    public void onDestroy() {
        if (this.f85975E != null) {
            this.f85975E.destroy();
        }
        try {
            this.f86008r.join();
        } catch (Exception unused) {
        }
        super.onDestroy();
        this.f85993c.removeCallbacks(this.f86004n);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onResume", true);
        super.onResume();
        if (this.f86006p) {
            C18842a.m45934b(this.f86011u);
            this.f86006p = false;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onResume", false);
    }

    public void setStatusBarColor() {
        this.f85975E = ImmersionBar.with((Activity) this);
        if (getContentResolver() != null) {
            this.f85975E.init();
        }
        C23729p.m58269c((Activity) this);
    }

    /* renamed from: a */
    public final void mo70153a() {
        if (this.f85991a != null) {
            if (this.f85991a.isPlaying()) {
                this.f85991a.pause();
            }
            if (this.f86004n != null) {
                this.f85993c.removeCallbacks(this.f86004n);
            }
            this.f86004n = new Runnable() {
                public final void run() {
                    if (AvatarCutActivity.this.f85991a != null) {
                        if (AvatarCutActivity.this.f85991a.isPlaying()) {
                            AvatarCutActivity.this.f85991a.pause();
                        }
                        AvatarCutActivity.this.f86004n = null;
                        AvatarCutActivity.this.mo70153a();
                    }
                }
            };
            this.f85991a.seekTo(this.f85998h);
            this.f85993c.postDelayed(this.f86004n, (long) this.f85999i);
            this.f85991a.start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo70162f() {
        m76135k();
        Intent intent = new Intent();
        intent.putExtra("mp4", this.f86005o);
        intent.putExtra("dir", AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig().rootDir());
        setResult(-1, intent);
        finish();
    }

    /* renamed from: c */
    public final void mo70159c() {
        this.f86001k.dismiss();
        if (this.f85987Q == null) {
            this.f85987Q = C41047a.m90709a(this, getString(R.string.fcg));
            this.f85987Q.setIndeterminate(false);
            this.f85987Q.mo83563a(getResources().getDrawable(R.drawable.dms));
        } else if (!this.f85987Q.isShowing()) {
            this.f85987Q.show();
            this.f85987Q.mo83562a();
        }
        this.f85974D.mo80926b(this.f86005o);
        this.f85974D.mo80927c();
    }

    /* renamed from: g */
    private void m76131g() {
        int i;
        if (((int) this.f85997g.getX()) == this.f85980J && ((int) this.f85996f.getX()) == this.f86000j - this.f85995e && this.f86015z <= 6000) {
            i = this.f86015z;
        } else {
            i = (int) ((((this.f85997g.getX() - this.f85996f.getX()) - ((float) this.f85995e)) / ((float) this.f85983M)) * m76132h() * 1000.0f);
        }
        if (i >= 2500) {
            int x = (int) (((((float) this.f86012v) + this.f85996f.getX()) + ((float) this.f85995e)) - ((float) this.f86000j));
            if (x < 0) {
                x = 0;
            }
            double d = (double) this.f85984N;
            Double.isNaN(d);
            double d2 = d * 1000.0d;
            double d3 = (double) x;
            Double.isNaN(d3);
            double d4 = d2 * d3;
            double d5 = (double) this.f85978H;
            Double.isNaN(d5);
            int i2 = (int) (d4 / d5);
            if (i < 3000) {
                i = 3000;
            }
            if (i > this.f86015z) {
                i = this.f86015z;
            }
            if (i + i2 > this.f86015z) {
                i2 = this.f86015z - i;
            }
            this.f85999i = i;
            m76129a(this.f85999i);
            this.f85998h = i2;
        }
    }

    /* renamed from: b */
    private float m76130b(int i) {
        return C9432q.m18687b((Context) this, (float) i);
    }

    /* renamed from: b */
    public final void mo70157b(Exception exc) {
        m76135k();
        C32458a.m75143a(exc);
    }

    /* renamed from: b */
    public final void mo70156b(AvatarUri avatarUri) {
        this.f85988R.mo80823a(avatarUri.uri);
        this.f85986P.mo81853a(this.f85988R.mo80822a());
    }

    /* renamed from: a */
    private void m76129a(int i) {
        int i2;
        if (((float) i) <= this.f85984N * 5.0f * 1000.0f) {
            double d = (double) i;
            Double.isNaN(d);
            i2 = (int) Math.round(d / 1000.0d);
        } else {
            i2 = (int) (this.f85984N * 5.0f);
        }
        if (i2 < 3) {
            i2 = 3;
        }
        if (((float) i2) > this.f85984N * 5.0f) {
            i2 = Math.round(this.f85984N * 5.0f);
        }
        this.f85979I.setText(getResources().getString(R.string.a30, new Object[]{Integer.valueOf(i2)}));
    }

    public void onClick(View view) {
        float f;
        ClickInstrumentation.onClick(view);
        if (view.getId() == this.f85981K.getId()) {
            finish();
        } else if (view.getId() == this.f85982L.getId()) {
            this.f85993c.removeCallbacks(this.f86004n);
            this.f86004n = null;
            try {
                if (this.f85991a.isPlaying()) {
                    this.f85991a.pause();
                }
            } catch (Exception unused) {
            }
            this.f86009s = System.currentTimeMillis();
            this.f86001k = C45547d.m99208b(this, getResources().getString(R.string.dj9));
            this.f86001k.setIndeterminate(false);
            m76131g();
            C18842a.m45932a(new Runnable() {
                public final void run() {
                    AvatarCutActivity avatarCutActivity = AvatarCutActivity.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append(AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig().cacheDir());
                    sb.append(UUID.randomUUID());
                    sb.append(".webp");
                    avatarCutActivity.f86005o = sb.toString();
                    AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().transformService().video2webp(AvatarCutActivity.this.f85994d, AvatarCutActivity.this.f86005o, AvatarCutActivity.this.f85998h, AvatarCutActivity.this.f85999i, new C33138c(this), new C33139d(this));
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo70166a(int i) {
                    if (AvatarCutActivity.this.isViewValid() && AvatarCutActivity.this.f86001k != null && AvatarCutActivity.this.f86001k.isShowing()) {
                        AvatarCutActivity.this.f86001k.setProgress(i);
                    }
                }
            });
        } else {
            if (view.getId() == R.id.etd) {
                final float f2 = 1.0f;
                if (this.f86010t % NormalGiftView.ALPHA_180 == 0) {
                    f = (((float) this.f86013x) * 1.0f) / ((float) this.f86014y);
                } else {
                    f2 = (((float) this.f86013x) * 1.0f) / ((float) this.f86014y);
                    f = 1.0f;
                }
                final float f3 = f - f2;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        AvatarCutActivity.this.f85992b.setRotation(((float) AvatarCutActivity.this.f86010t) + (90.0f * animatedFraction));
                        AvatarCutActivity.this.f85992b.setScaleX(f2 + (f3 * animatedFraction));
                        AvatarCutActivity.this.f85992b.setScaleY(f2 + (f3 * animatedFraction));
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        AvatarCutActivity.this.f86010t += 90;
                        if (AvatarCutActivity.this.f86010t >= 360) {
                            AvatarCutActivity.this.f86010t = 0;
                        }
                    }
                });
                ofFloat.setDuration(300);
                ofFloat.start();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bo9);
        if (VERSION.SDK_INT >= 19) {
            this.mStatusBarView.getLayoutParams().height = C11065a.m22390a((Context) this);
        }
        this.f85983M = C9432q.m18670a((Context) this) / 6;
        this.f85985O = (int) C9432q.m18687b((Context) this, 2.0f);
        this.f85994d = getIntent().getStringExtra("file_path");
        this.f85993c = (RelativeLayout) findViewById(R.id.ll);
        this.f85976F = (RecyclerView) findViewById(R.id.ca3);
        this.f85979I = (TextView) findViewById(R.id.dh7);
        this.f85977G = (FrameLayout) findViewById(R.id.etd);
        this.f85992b = (TextureView) findViewById(R.id.cva);
        this.f85992b.setSurfaceTextureListener(new SurfaceTextureListener() {
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                AvatarCutActivity.this.mo70155b();
                return true;
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                Uri parse = Uri.parse(AvatarCutActivity.this.f85994d);
                AvatarCutActivity.this.f85991a = MediaPlayer.create(AvatarCutActivity.this, parse);
                if (AvatarCutActivity.this.f85991a == null) {
                    C10691a.m21542b((Context) AvatarCutActivity.this, (int) R.string.cph).mo19066a();
                    AvatarCutActivity.this.finish();
                    return;
                }
                AvatarCutActivity.this.f85991a.setAudioStreamType(3);
                AvatarCutActivity.this.f85991a.setSurface(new Surface(surfaceTexture));
                AvatarCutActivity.this.f85991a.start();
                AvatarCutActivity.this.f85991a.setOnCompletionListener(new OnCompletionListener() {
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        AvatarCutActivity.this.mo70153a();
                    }
                });
                AvatarCutActivity.this.f85991a.setOnErrorListener(new OnErrorListener() {
                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        if (AvatarCutActivity.this.f85991a != null) {
                            AvatarCutActivity.this.f85991a.release();
                            AvatarCutActivity.this.f85991a = null;
                        }
                        return false;
                    }
                });
            }
        });
        int[] a = FFMpegManager.m46826a().mo39233a(this.f85994d);
        if (a[0] == 0) {
            this.f86015z = a[1];
            this.f85999i = this.f86015z;
            this.f86013x = a[2];
            this.f86014y = a[3];
            this.f85984N = m76132h();
            int i = this.f86015z;
            int round = Math.round(this.f85984N * 1000.0f);
            this.f85973C = ((i + round) - 1) / round;
            this.f85971A = a[4];
            int i2 = 5;
            this.f85972B = a[5];
            String str = this.f85994d;
            int i3 = this.f85973C;
            int i4 = this.f85971A;
            int i5 = this.f85972B;
            LayoutParams layoutParams = (LayoutParams) this.f85976F.getLayoutParams();
            layoutParams.width = C9432q.m18670a((Context) this);
            this.f86000j = this.f85983M >> 1;
            layoutParams.leftMargin = 0;
            this.f85978H = this.f85983M;
            layoutParams.height = this.f85978H;
            this.f85976F.setLayoutParams(layoutParams);
            WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this, 0, false);
            this.f85976F.mo4801a((C1340m) new C1340m() {
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    super.onScrollStateChanged(recyclerView, i);
                    if (i == 0) {
                        AvatarCutActivity.this.mo70160d();
                    }
                }

                public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    AvatarCutActivity.this.f86012v += i;
                }
            });
            this.f85976F.setLayoutManager(wrapLinearLayoutManager);
            C42388a aVar = new C42388a(this, this.f85978H, this.f85999i, m76132h(), this.f85995e, str, i4, i5, this.f85973C);
            this.f85976F.setAdapter(aVar);
            this.f85976F.mo4801a((C1340m) new C1340m() {
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                }

                public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    AvatarCutActivity.this.f86012v += i;
                    AvatarCutActivity.this.mo70160d();
                }
            });
            C9432q.m18688b(this);
            int a2 = C9432q.m18670a((Context) this);
            ViewGroup.LayoutParams layoutParams2 = this.mSurfaceViewWrapper.getLayoutParams();
            layoutParams2.height = a2;
            layoutParams2.width = a2;
            this.mSurfaceViewWrapper.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f85992b.getLayoutParams();
            double d = (double) a2;
            Double.isNaN(d);
            double d2 = d * 1.0d;
            double d3 = (double) this.f86014y;
            Double.isNaN(d3);
            double d4 = d2 * d3;
            double d5 = (double) this.f86013x;
            Double.isNaN(d5);
            layoutParams3.height = (int) (d4 / d5);
            this.f85992b.setLayoutParams(layoutParams3);
            this.f85981K = (TextView) findViewById(R.id.ij);
            this.f85981K.setOnClickListener(this);
            this.f85982L = (TextView) findViewById(R.id.bqm);
            this.f85982L.setOnClickListener(this);
            this.f85997g = new ImageView(this);
            this.f85997g.setPadding(0, 0, this.f85985O, 0);
            this.f85997g.setScaleType(ScaleType.FIT_XY);
            this.f85993c.addView(this.f85997g);
            this.f85997g.setImageResource(R.drawable.drk);
            int b = (int) (((float) this.f85983M) + C9432q.m18687b((Context) this, 4.0f));
            double d6 = (double) b;
            Double.isNaN(d6);
            this.f85995e = (int) ((d6 * 3.0d) / 26.0d);
            LayoutParams layoutParams4 = new LayoutParams(this.f85995e + this.f85985O, b);
            layoutParams4.topMargin = (int) C9432q.m18687b((Context) this, 5.0f);
            layoutParams4.addRule(10);
            layoutParams4.addRule(9);
            if (this.f85973C < 5) {
                i2 = this.f85973C;
            }
            double d7 = (double) i2;
            Double.isNaN(d7);
            double d8 = d7 * 1.0d;
            double d9 = (double) this.f85983M;
            Double.isNaN(d9);
            double d10 = d8 * d9;
            double d11 = (double) this.f86000j;
            Double.isNaN(d11);
            layoutParams4.leftMargin = (int) (d10 + d11);
            if (((float) this.f85999i) < this.f85984N * 5.0f * 1000.0f) {
                layoutParams4.leftMargin -= (int) Math.ceil((double) ((((this.f85984N * 1000.0f) - ((float) Math.round(((float) this.f85999i) % (this.f85984N * 1000.0f)))) / (this.f85984N * 1000.0f)) * ((float) layoutParams4.height)));
            }
            this.f85980J = layoutParams4.leftMargin;
            if (((Boolean) SharePrefCache.inst().getLongVideoPermitted().mo47782d()).booleanValue() && this.f85999i >= 6000) {
                layoutParams4.leftMargin = Math.round(((((float) this.f85983M) * 1.0f) / m76132h()) * 6.0f) + this.f86000j;
            }
            this.f85997g.setLayoutParams(layoutParams4);
            this.f85997g.setTag("right");
            this.f85996f = new ImageView(this);
            this.f85996f.setPadding(this.f85985O, 0, 0, 0);
            this.f85996f.setScaleType(ScaleType.FIT_XY);
            this.f85993c.addView(this.f85996f);
            this.f85996f.setImageResource(R.drawable.drk);
            LayoutParams layoutParams5 = new LayoutParams(this.f85995e + this.f85985O, b);
            layoutParams5.addRule(10);
            layoutParams5.addRule(9);
            layoutParams5.topMargin = (int) C9432q.m18687b((Context) this, 5.0f);
            layoutParams5.leftMargin = this.f86000j - this.f85995e;
            this.f85996f.setLayoutParams(layoutParams5);
            this.f85996f.setOnTouchListener(this);
            this.f85997g.setOnTouchListener(this);
            this.f85996f.setTag("left");
            this.f85976F.post(new Runnable() {
                public final void run() {
                    AvatarCutActivity.this.f86002l = new View(AvatarCutActivity.this);
                    AvatarCutActivity.this.f86003m = new View(AvatarCutActivity.this);
                    AvatarCutActivity.this.f85993c.addView(AvatarCutActivity.this.f86002l);
                    AvatarCutActivity.this.f85993c.addView(AvatarCutActivity.this.f86003m);
                    AvatarCutActivity.this.f86002l.setBackgroundColor(AvatarCutActivity.this.getResources().getColor(R.color.a3c));
                    AvatarCutActivity.this.f86003m.setBackgroundColor(AvatarCutActivity.this.getResources().getColor(R.color.a3c));
                    AvatarCutActivity.this.mo70154a(AvatarCutActivity.this.f86000j - AvatarCutActivity.this.f85995e, (int) ((AvatarCutActivity.this.f85997g.getX() - AvatarCutActivity.this.f85996f.getX()) + ((float) AvatarCutActivity.this.f85997g.getWidth())));
                }
            });
            this.f85974D = new C39835a();
            this.f85974D.f101827c = this;
            this.f85974D.mo80921a((Activity) this, (Fragment) null);
            this.f85986P = new C39954ad();
            this.f85988R = new C39718ad();
            this.f85986P.mo81850a((C39985s) this);
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onCreate", false);
            return;
        }
        C10691a.m21542b((Context) this, (int) R.string.cn4).mo19066a();
        FFMpegManager.m46826a().mo39234b();
        finish();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo54362a(boolean z) {
        if (z && this.f85987Q != null && this.f85987Q.isShowing()) {
            this.f85987Q.setMessage(getString(R.string.fbt));
            this.f85987Q.mo83564b();
            new Handler().postDelayed(new C33137b(this), 500);
        }
    }

    /* renamed from: a */
    public final void mo70154a(int i, int i2) {
        int i3 = i + this.f85985O;
        int i4 = i2 - (this.f85985O * 2);
        LayoutParams layoutParams = new LayoutParams(i4, (int) m76130b(2));
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = (int) m76130b(5);
        this.f86002l.setLayoutParams(layoutParams);
        LayoutParams layoutParams2 = new LayoutParams(i4, (int) m76130b(2));
        layoutParams2.addRule(10);
        layoutParams2.addRule(9);
        layoutParams2.leftMargin = i3;
        layoutParams2.topMargin = ((int) m76130b(7)) + this.f85978H;
        this.f86003m.setLayoutParams(layoutParams2);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        String str = (String) view.getTag();
        if (str == null) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.f85989S = motionEvent.getRawX();
                if (!str.equals("left")) {
                    this.f85990T = this.f85997g.getX();
                    break;
                } else {
                    this.f85990T = this.f85996f.getX();
                    break;
                }
            case 1:
                mo70160d();
                break;
            case 2:
                if (str.equals("left")) {
                    float rawX = this.f85990T + (motionEvent.getRawX() - this.f85989S);
                    if ((this.f85997g.getX() - rawX) - ((float) this.f85995e) < m76133i()) {
                        rawX = (this.f85997g.getX() - ((float) this.f85995e)) - m76133i();
                    } else if ((this.f85997g.getX() - rawX) - ((float) this.f85995e) > m76134j()) {
                        rawX = (this.f85997g.getX() - ((float) this.f85995e)) - m76134j();
                    }
                    if (rawX < ((float) (this.f86000j - this.f85995e))) {
                        rawX = (float) (this.f86000j - this.f85995e);
                    }
                    this.f85996f.animate().x(rawX).y(this.f85996f.getY()).setDuration(0).start();
                    mo70154a((int) rawX, (int) ((this.f85997g.getX() - rawX) + ((float) this.f85996f.getWidth())));
                } else {
                    float rawX2 = this.f85990T + (motionEvent.getRawX() - this.f85989S);
                    if (rawX2 > ((float) this.f85980J)) {
                        rawX2 = (float) this.f85980J;
                    }
                    if ((rawX2 - this.f85996f.getX()) - ((float) this.f85995e) < m76133i()) {
                        rawX2 = ((float) this.f85995e) + this.f85996f.getX() + m76133i();
                    } else if ((rawX2 - this.f85996f.getX()) - ((float) this.f85995e) > m76134j()) {
                        rawX2 = ((float) this.f85995e) + this.f85996f.getX() + m76134j();
                    }
                    this.f85997g.animate().x(rawX2).y(this.f85997g.getY()).setDuration(0).start();
                    mo70154a((int) this.f85996f.getX(), (int) ((rawX2 - this.f85996f.getX()) + ((float) this.f85996f.getWidth())));
                }
                m76131g();
                break;
        }
        return true;
    }
}
