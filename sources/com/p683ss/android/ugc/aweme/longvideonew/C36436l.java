package com.p683ss.android.ugc.aweme.longvideonew;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31121a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31124c;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31125d;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31134e;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31136f;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31137g;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31138h;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.VideoSeekBar;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.VideoSeekBar.C31118b;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.VideoSeekBar.C31119c;
import com.p683ss.android.ugc.aweme.feed.panel.C30597ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.l */
public class C36436l implements C31118b, C31119c {

    /* renamed from: u */
    public static final C36437a f93331u = new C36437a(null);

    /* renamed from: a */
    public Aweme f93332a;

    /* renamed from: b */
    public TextView f93333b = ((TextView) this.f93351t.findViewById(R.id.a2s));

    /* renamed from: c */
    public TextView f93334c = ((TextView) this.f93351t.findViewById(R.id.d3w));

    /* renamed from: d */
    public int f93335d;

    /* renamed from: e */
    public boolean f93336e;

    /* renamed from: f */
    public boolean f93337f;

    /* renamed from: g */
    public int f93338g;

    /* renamed from: h */
    public long f93339h;

    /* renamed from: i */
    public C30597ae f93340i;

    /* renamed from: j */
    public String f93341j = "";

    /* renamed from: k */
    public int f93342k = -1;

    /* renamed from: l */
    public int f93343l;

    /* renamed from: m */
    public boolean f93344m;

    /* renamed from: n */
    public Aweme f93345n;

    /* renamed from: o */
    public boolean f93346o = true;

    /* renamed from: p */
    public boolean f93347p = true;

    /* renamed from: q */
    public Float f93348q;

    /* renamed from: r */
    public final Runnable f93349r;

    /* renamed from: s */
    public final VideoSeekBar f93350s;

    /* renamed from: t */
    public final LinearLayout f93351t;

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.l$a */
    public static final class C36437a {
        private C36437a() {
        }

        public /* synthetic */ C36437a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.l$b */
    static final class C36438b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C36436l f93352a;

        C36438b(C36436l lVar) {
            this.f93352a = lVar;
        }

        public final void run() {
            if (this.f93352a.f93350s.getAlpha() != 0.0f && this.f93352a.f93350s.getVisibility() != 8) {
                C47718bf.m103288a(new C31138h(this.f93352a.f93332a));
                this.f93352a.mo75374b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.l$c */
    public static final class C36439c implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C36436l f93353a;

        /* renamed from: b */
        final /* synthetic */ ImageView f93354b;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
            ImageView imageView = this.f93354b;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            this.f93353a.f93350s.setThumb(null);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f93353a.f93350s.setAlpha(0.0f);
            this.f93353a.f93350s.setScaleY(1.0f);
            ImageView imageView = this.f93354b;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f93354b;
            if (imageView2 != null) {
                imageView2.setScaleX(1.0f);
            }
            ImageView imageView3 = this.f93354b;
            if (imageView3 != null) {
                imageView3.setScaleY(1.0f);
            }
        }

        C36439c(C36436l lVar, ImageView imageView) {
            this.f93353a = lVar;
            this.f93354b = imageView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.l$d */
    public static final class C36440d implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C36436l f93355a;

        /* renamed from: b */
        final /* synthetic */ ImageView f93356b;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
            ImageView imageView = this.f93356b;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            VideoSeekBar videoSeekBar = this.f93355a.f93350s;
            Context context = this.f93355a.f93350s.getContext();
            C52711k.m112236a((Object) context, "mVideoSeekBar.context");
            videoSeekBar.setThumb(context.getResources().getDrawable(R.drawable.ct1));
            VideoSeekBar videoSeekBar2 = this.f93355a.f93350s;
            Context context2 = this.f93355a.f93350s.getContext();
            C52711k.m112236a((Object) context2, "mVideoSeekBar.context");
            videoSeekBar2.setThumb(context2.getResources().getDrawable(R.drawable.ct1));
            ImageView imageView = this.f93356b;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f93356b;
            if (imageView2 != null) {
                imageView2.setScaleX(1.0f);
            }
            ImageView imageView3 = this.f93356b;
            if (imageView3 != null) {
                imageView3.setScaleY(1.0f);
            }
        }

        C36440d(C36436l lVar, ImageView imageView) {
            this.f93355a = lVar;
            this.f93356b = imageView;
        }
    }

    /* renamed from: f */
    private final void m82216f() {
        this.f93350s.postDelayed(this.f93349r, 2000);
    }

    /* renamed from: d */
    private boolean m82214d() {
        String str;
        String str2;
        if (this.f93332a == null || this.f93345n == null) {
            return false;
        }
        Aweme aweme = this.f93332a;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        Aweme aweme2 = this.f93345n;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        if (C52830p.m112407a(str, str2, false, 2, null)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m82217g() {
        if (this.f93350s.getAlpha() != 0.0f && this.f93350s.getVisibility() != 8) {
            this.f93350s.removeCallbacks(this.f93349r);
            C47718bf.m103288a(new C31138h(this.f93332a));
            mo75374b();
        }
    }

    /* renamed from: c */
    public final void mo75375c() {
        if (this.f93350s.getAlpha() != 0.0f && this.f93350s.getVisibility() != 8) {
            this.f93350s.setAlpha(0.0f);
            C47718bf.m103288a(new C31138h(this.f93332a));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75373a() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f93332a
            r1 = 0
            if (r0 == 0) goto L_0x000e
            com.ss.android.ugc.aweme.feed.model.VideoControl r0 = r0.getVideoControl()
            if (r0 == 0) goto L_0x000e
            int r0 = r0.draftProgressBar
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            r2 = 1
            r3 = 8
            if (r0 != r2) goto L_0x0068
            boolean r0 = r6.m82214d()
            if (r0 == 0) goto L_0x0068
            com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar r0 = r6.f93350s
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r6.f93351t
            r0.setVisibility(r3)
            com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar r0 = r6.f93350s
            r2 = 0
            r0.setAlpha(r2)
            com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar r0 = r6.f93350s
            r0.setProgress(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f93332a
            if (r0 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L_0x003e
            int r0 = r0.getDuration()
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            int r0 = com.p683ss.android.ugc.aweme.longvideonew.C36403c.m82156a(r0)
            r6.f93335d = r0
            android.widget.TextView r0 = r6.f93334c
            r2 = 0
            r3 = 2
            if (r0 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.longvideonew.c r4 = com.p683ss.android.ugc.aweme.longvideonew.C36403c.f93225a
            int r5 = r6.f93335d
            java.lang.String r4 = r4.m82157a(r5, false)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r0.setText(r4)
        L_0x0058:
            android.widget.TextView r0 = r6.f93333b
            if (r0 == 0) goto L_0x0067
            com.ss.android.ugc.aweme.longvideonew.c r4 = com.p683ss.android.ugc.aweme.longvideonew.C36403c.f93225a
            java.lang.String r1 = r4.m82157a(r1, false)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x0067:
            return
        L_0x0068:
            com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar r0 = r6.f93350s
            r0.setVisibility(r3)
            android.widget.LinearLayout r0 = r6.f93351t
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.longvideonew.C36436l.mo75373a():void");
    }

    /* renamed from: e */
    private final void m82215e() {
        if (this.f93350s.getAlpha() == 1.0f) {
            this.f93350s.removeCallbacks(this.f93349r);
            return;
        }
        this.f93350s.setAlpha(0.15f);
        this.f93350s.setPivotY((float) C23728o.m58241a(7.0d));
        ImageView coverThumbImg = this.f93350s.getCoverThumbImg();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f93350s, "scaleY", new float[]{0.1f, 1.0f});
        C52711k.m112236a((Object) ofFloat, "ObjectAnimator.ofFloat(m… SEEK_BAR_SCALE_HIDE, 1f)");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(coverThumbImg, "scaleX", new float[]{0.1f, 1.0f});
        C52711k.m112236a((Object) ofFloat2, "ObjectAnimator.ofFloat(c… SEEK_BAR_SCALE_HIDE, 1f)");
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(coverThumbImg, "scaleY", new float[]{0.1f, 1.0f});
        C52711k.m112236a((Object) ofFloat3, "ObjectAnimator.ofFloat(c… SEEK_BAR_SCALE_HIDE, 1f)");
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f93350s, "alpha", new float[]{0.15f, 1.0f});
        C52711k.m112236a((Object) ofFloat4, "ObjectAnimator.ofFloat(m… SEEK_BAR_ALPHA_HIDE, 1f)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat4, ofFloat2, ofFloat3});
        animatorSet.setDuration(200);
        animatorSet.addListener(new C36440d(this, coverThumbImg));
        animatorSet.start();
    }

    /* renamed from: b */
    public final void mo75374b() {
        this.f93350s.setAlpha(1.0f);
        this.f93350s.setPivotY((float) C23728o.m58241a(7.0d));
        ImageView coverThumbImg = this.f93350s.getCoverThumbImg();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f93350s, "scaleY", new float[]{1.0f, 0.1f});
        C52711k.m112236a((Object) ofFloat, "ObjectAnimator.ofFloat(m… 1f, SEEK_BAR_SCALE_HIDE)");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(coverThumbImg, "scaleX", new float[]{1.0f, 0.1f});
        C52711k.m112236a((Object) ofFloat2, "ObjectAnimator.ofFloat(c… 1f, SEEK_BAR_SCALE_HIDE)");
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(coverThumbImg, "scaleY", new float[]{1.0f, 0.1f});
        C52711k.m112236a((Object) ofFloat3, "ObjectAnimator.ofFloat(c… 1f, SEEK_BAR_SCALE_HIDE)");
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f93350s, "alpha", new float[]{1.0f, 0.15f});
        C52711k.m112236a((Object) ofFloat4, "ObjectAnimator.ofFloat(m… 1f, SEEK_BAR_ALPHA_HIDE)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat4, ofFloat2, ofFloat3});
        animatorSet.setDuration(200);
        animatorSet.addListener(new C36439c(this, coverThumbImg));
        animatorSet.start();
    }

    public void onPlayerControllerRenderFirstFrameEvent(C31124c cVar) {
        C52711k.m112240b(cVar, "event");
        this.f93345n = cVar.f81471a;
        mo75373a();
    }

    /* renamed from: a */
    public final void mo63941a(SeekBar seekBar) {
        this.f93336e = true;
        if (this.f93338g == 1) {
            C30597ae aeVar = this.f93340i;
            if (aeVar != null) {
                aeVar.mo60507Z();
            }
        }
        if (seekBar != null) {
            this.f93343l = seekBar.getProgress();
        }
    }

    public void onFullFeedVideoChangeEvent(C31121a aVar) {
        C52711k.m112240b(aVar, "event");
        this.f93332a = aVar.f81461a;
        String str = aVar.f81462b;
        if (str == null) {
            str = "";
        }
        this.f93341j = str;
        this.f93342k = aVar.f81463c;
        this.f93340i = aVar.f81464d;
        this.f93338g = 0;
        if (!this.f93346o) {
            this.f93347p = false;
        }
    }

    public void onVideoProgressVolumeKeyEvent(C31137g gVar) {
        String str;
        String str2;
        C52711k.m112240b(gVar, "event");
        if (this.f93332a != null && gVar.f81508a != null) {
            Aweme aweme = this.f93332a;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            Aweme aweme2 = gVar.f81508a;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            } else {
                str2 = null;
            }
            if (C52830p.m112407a(str, str2, false, 2, null) && this.f93346o) {
                m82217g();
            }
        }
    }

    public void onPlayerControllerVideoPlayProgressChange(C31125d dVar) {
        String str;
        String str2;
        C52711k.m112240b(dVar, "event");
        if (this.f93332a != null && dVar.f81476a != null) {
            Aweme aweme = this.f93332a;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            Aweme aweme2 = dVar.f81476a;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            } else {
                str2 = null;
            }
            if (C52830p.m112407a(str, str2, false, 2, null) && !this.f93336e) {
                if (this.f93339h == 0 || SystemClock.elapsedRealtime() > this.f93339h + 600) {
                    this.f93350s.setProgress(dVar.f81479d);
                    TextView textView = this.f93333b;
                    if (textView != null) {
                        textView.setText(C36403c.f93225a.mo75344a(dVar.f81479d, this.f93335d));
                    }
                }
            }
        }
    }

    public void onPlayerControllerVideoStatusEvent(C31134e eVar) {
        String str;
        String str2;
        C52711k.m112240b(eVar, "event");
        if (this.f93332a != null && eVar.f81501a != null) {
            Aweme aweme = this.f93332a;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            Aweme aweme2 = eVar.f81501a;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            } else {
                str2 = null;
            }
            if (C52830p.m112407a(str, str2, false, 2, null)) {
                switch (eVar.f81504d) {
                    case 1:
                        this.f93344m = false;
                        this.f93338g = 1;
                        m82215e();
                        this.f93350s.removeCallbacks(this.f93349r);
                        this.f93350s.setPauseStatus(true);
                        return;
                    case 2:
                        this.f93338g = 2;
                        this.f93350s.setPauseStatus(false);
                        if (this.f93346o) {
                            if (!this.f93344m) {
                                m82217g();
                                break;
                            } else {
                                m82216f();
                                return;
                            }
                        }
                        break;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo63940a(MotionEvent motionEvent) {
        Integer num;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            this.f93350s.removeCallbacks(this.f93349r);
            m82215e();
            this.f93351t.setVisibility(0);
            this.f93351t.setAlpha(0.0f);
            ViewPropertyAnimator animate = this.f93351t.animate();
            if (animate != null) {
                ViewPropertyAnimator alpha = animate.alpha(1.0f);
                if (alpha != null) {
                    ViewPropertyAnimator duration = alpha.setDuration(200);
                    if (duration != null) {
                        duration.start();
                    }
                }
            }
            this.f93337f = false;
            this.f93346o = false;
            this.f93348q = Float.valueOf(motionEvent.getRawX());
            return;
        }
        if (num != null && num.intValue() == 2) {
            ImageView coverThumbImg = this.f93350s.getCoverThumbImg();
            if (coverThumbImg != null && coverThumbImg.getVisibility() == 0) {
                ImageView coverThumbImg2 = this.f93350s.getCoverThumbImg();
                if (coverThumbImg2 != null) {
                    coverThumbImg2.setVisibility(8);
                }
                VideoSeekBar videoSeekBar = this.f93350s;
                Context context = this.f93350s.getContext();
                C52711k.m112236a((Object) context, "mVideoSeekBar.context");
                videoSeekBar.setThumb(context.getResources().getDrawable(R.drawable.ct1));
            }
            Float f = this.f93348q;
            if (f != null && Math.abs(f.floatValue() - motionEvent.getRawX()) > 10.0f) {
                this.f93337f = true;
            }
        } else if (num != null && num.intValue() == 1) {
            this.f93346o = true;
        } else if (num != null && num.intValue() == 3) {
            this.f93346o = true;
        }
    }

    /* renamed from: b */
    public void mo63943b(SeekBar seekBar) {
        String str;
        String str2;
        this.f93339h = SystemClock.elapsedRealtime();
        int i = 0;
        this.f93336e = false;
        this.f93344m = true;
        Aweme aweme = null;
        if (this.f93337f || this.f93338g == 1) {
            m82216f();
            this.f93337f = false;
            if (seekBar != null) {
                int progress = seekBar.getProgress();
                if (!this.f93347p) {
                    this.f93347p = true;
                } else {
                    if (!C48121w.m104087I()) {
                        C48121w.m104249M().mo95279a(((float) progress) / 100.0f);
                        double d = (double) progress;
                        Double.isNaN(d);
                        C47718bf.m103288a(new C31136f(d / 100.0d, this.f93332a));
                    }
                    if (this.f93343l < progress) {
                        str = "front";
                    } else {
                        str = "back";
                    }
                    if (this.f93338g == 1) {
                        i = 1;
                    }
                    String str3 = "click_progress_bar";
                    C23089d a = C23089d.m56640a().mo47829a("enter_from", this.f93341j).mo47829a("impr_type", C23198ae.m56883s(this.f93332a)).mo47829a("action_type", str).mo47826a("is_pause", i).mo47829a("author_id", C23198ae.m56846a(this.f93332a)).mo47826a("page_type", this.f93342k);
                    String str4 = "group_id";
                    Aweme aweme2 = this.f93332a;
                    if (aweme2 != null) {
                        str2 = aweme2.getAid();
                    } else {
                        str2 = null;
                    }
                    C26890h.m65011a(str3, a.mo47829a(str4, str2).f61491a);
                }
            }
        } else {
            m82217g();
        }
        if (this.f93338g == 1) {
            C30597ae aeVar = this.f93340i;
            if (aeVar != null) {
                C30597ae aeVar2 = this.f93340i;
                if (aeVar2 != null) {
                    aweme = aeVar2.mo60519ak();
                }
                aeVar.mo62795g(aweme);
            }
        }
        this.f93351t.setAlpha(1.0f);
        ViewPropertyAnimator animate = this.f93351t.animate();
        if (animate != null) {
            ViewPropertyAnimator alpha = animate.alpha(0.0f);
            if (alpha != null) {
                ViewPropertyAnimator duration = alpha.setDuration(200);
                if (duration != null) {
                    duration.start();
                }
            }
        }
        this.f93351t.setVisibility(8);
    }

    public C36436l(VideoSeekBar videoSeekBar, LinearLayout linearLayout) {
        C52711k.m112240b(videoSeekBar, "mVideoSeekBar");
        C52711k.m112240b(linearLayout, "mVideoSeekDuration");
        this.f93350s = videoSeekBar;
        this.f93351t = linearLayout;
        this.f93350s.setVisibility(8);
        this.f93351t.setVisibility(8);
        this.f93350s.setOnSeekBarChangeListener(this);
        this.f93350s.setOnDispatchTouchEventListener(this);
        this.f93349r = new C36438b(this);
    }

    /* renamed from: a */
    public final void mo63942a(SeekBar seekBar, int i, boolean z) {
        TextView textView = this.f93333b;
        if (textView != null) {
            textView.setText(C36403c.f93225a.mo75344a(((float) i) / 100.0f, this.f93335d));
        }
    }
}
