package com.p683ss.android.ugc.aweme.photomovie.edit.change;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.p1484bx.C24447b;
import com.p683ss.android.ugc.aweme.p1484bx.C24456f;
import com.p683ss.android.ugc.aweme.p1484bx.C24457g;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h.C24459a;
import com.p683ss.android.ugc.aweme.photomovie.edit.C38752b;
import com.p683ss.android.ugc.aweme.photomovie.edit.imageframe.C38771a;
import com.p683ss.android.ugc.aweme.photomovie.edit.imageframe.C38771a.C38773a;
import com.p683ss.android.ugc.aweme.photomovie.edit.imageframe.ImageFrameView;
import com.p683ss.android.ugc.aweme.photomovie.edit.imageframe.ImageFrameView.C38770a;
import com.p683ss.android.ugc.aweme.photomovie.edit.player.C38794a;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.p683ss.android.ugc.aweme.themechange.base.C46788b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.change.PhotoMovieChangeModule */
public class PhotoMovieChangeModule implements C0183j, OnClickListener, C24457g {

    /* renamed from: a */
    public Handler f98587a = new Handler();

    /* renamed from: b */
    public C38794a f98588b;

    /* renamed from: c */
    public ImageFrameView f98589c;

    /* renamed from: d */
    public ImageFrameView f98590d;

    /* renamed from: e */
    public int f98591e;

    /* renamed from: f */
    public Drawable f98592f;

    /* renamed from: g */
    public Drawable f98593g;

    /* renamed from: h */
    public C38760a f98594h;

    /* renamed from: i */
    private Context f98595i;

    /* renamed from: j */
    private C24456f f98596j;

    /* renamed from: k */
    private C38752b f98597k;

    /* renamed from: l */
    private TextView f98598l;

    /* renamed from: m */
    private TextView f98599m;

    /* renamed from: n */
    private ImageView f98600n;

    /* renamed from: o */
    private ImageView f98601o;

    /* renamed from: p */
    private ImageView f98602p;

    /* renamed from: q */
    private ImageView f98603q;

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.change.PhotoMovieChangeModule$a */
    public interface C38760a {
        /* renamed from: a */
        void mo78680a(int i, int i2);
    }

    /* renamed from: a */
    public final C24456f mo50232a() {
        return this.f98596j;
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        this.f98587a.removeCallbacksAndMessages(null);
    }

    /* renamed from: b */
    public final void mo78710b() {
        this.f98599m.setAlpha(0.6f);
        this.f98600n.setAlpha(0.0f);
        this.f98589c.setAlpha(0.6f);
        this.f98590d.setAlpha(1.0f);
        this.f98601o.setAlpha(1.0f);
        this.f98598l.setAlpha(1.0f);
        this.f98602p.setImageDrawable(this.f98592f);
        this.f98603q.setImageDrawable(this.f98593g);
        this.f98588b.mo78754a(0);
    }

    /* renamed from: c */
    public final void mo78711c() {
        this.f98601o.setAlpha(0.0f);
        this.f98590d.setAlpha(0.6f);
        this.f98598l.setAlpha(0.6f);
        this.f98589c.setAlpha(1.0f);
        this.f98600n.setAlpha(1.0f);
        this.f98599m.setAlpha(1.0f);
        this.f98603q.setImageDrawable(this.f98592f);
        this.f98602p.setImageDrawable(this.f98593g);
        this.f98588b.mo78754a(1);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.ash) {
            if (this.f98591e != this.f98588b.mo78753a().mPlayType) {
                this.f98588b.mo78754a(this.f98591e);
            }
            this.f98597k.mo78708b(this);
            return;
        }
        if (id == R.id.asm) {
            this.f98597k.mo78708b(this);
            if (!(this.f98591e == this.f98588b.mo78753a().mPlayType || this.f98594h == null)) {
                this.f98594h.mo78680a(this.f98588b.mo78753a().mPlayType, this.f98591e);
            }
        } else if (id == R.id.asl) {
            if (this.f98588b.mo78753a().mPlayType != 1) {
                m86124a(1, this.f98601o, this.f98600n, this.f98590d, this.f98589c, this.f98598l, this.f98599m, this.f98603q, this.f98602p);
                this.f98588b.mo78754a(1);
            }
        } else if (id == R.id.ask && this.f98588b.mo78753a().mPlayType != 0) {
            m86124a(0, this.f98600n, this.f98601o, this.f98589c, this.f98590d, this.f98599m, this.f98598l, this.f98602p, this.f98603q);
            this.f98588b.mo78754a(0);
        }
    }

    /* renamed from: a */
    public final void mo78709a(final ImageFrameView imageFrameView, final int[] iArr) {
        C38773a aVar = new C38773a(this.f98595i, iArr);
        aVar.f98659c = 80;
        aVar.f98662f = 1.0f;
        aVar.f98658b = false;
        aVar.f98665i = imageFrameView;
        C38771a aVar2 = new C38771a(aVar);
        if (imageFrameView.f98638a != null) {
            imageFrameView.f98638a.mo78736a();
        }
        imageFrameView.f98638a = aVar2;
        C38771a aVar3 = imageFrameView.f98638a;
        if (!aVar3.f98645f) {
            aVar3.f98645f = true;
            if (aVar3.f98642c != null) {
                aVar3.f98641b.f98668c.sendEmptyMessage(0);
            } else if (aVar3.f98643d != null) {
                aVar3.f98641b.f98668c.sendEmptyMessage(1);
            }
        }
        imageFrameView.setOnLoadFinishListener(new C38770a() {
            /* renamed from: a */
            public final void mo78717a() {
                PhotoMovieChangeModule.this.f98587a.postDelayed(new Runnable() {
                    public final void run() {
                        PhotoMovieChangeModule.this.mo78709a(imageFrameView, iArr);
                    }
                }, 1000);
            }
        });
    }

    public PhotoMovieChangeModule(C0184k kVar, Context context, FrameLayout frameLayout, C38794a aVar, C38752b bVar) {
        kVar.getLifecycle().mo324a(this);
        this.f98595i = context;
        this.f98588b = aVar;
        this.f98597k = bVar;
        int b = (int) C9432q.m18687b(context, 9.0f);
        int b2 = C46788b.m101634b();
        int a = C46788b.m101628a();
        this.f98592f = C42430at.m93196a(a, a, 0, b);
        this.f98593g = C42430at.m93196a(b2, b2, 0, b);
        View inflate = LayoutInflater.from(context).inflate(R.layout.aga, frameLayout, false);
        this.f98596j = new C24447b(frameLayout, inflate);
        inflate.findViewById(R.id.ash).setOnClickListener(this);
        inflate.findViewById(R.id.asm).setOnClickListener(this);
        ((TextView) inflate.findViewById(R.id.ddn)).setText(R.string.e1l);
        this.f98600n = (ImageView) inflate.findViewById(R.id.asl);
        this.f98600n.setOnClickListener(this);
        this.f98601o = (ImageView) inflate.findViewById(R.id.ask);
        this.f98601o.setOnClickListener(this);
        this.f98589c = (ImageFrameView) inflate.findViewById(R.id.aso);
        this.f98590d = (ImageFrameView) inflate.findViewById(R.id.asn);
        this.f98599m = (TextView) inflate.findViewById(R.id.cyz);
        this.f98598l = (TextView) inflate.findViewById(R.id.cyy);
        this.f98602p = (ImageView) inflate.findViewById(R.id.asj);
        this.f98603q = (ImageView) inflate.findViewById(R.id.asi);
        if (this.f98588b.mo78753a().mPlayType == 0) {
            mo78710b();
        } else {
            mo78711c();
        }
        this.f98596j.mo50220a((C24458h) new C24459a() {
            /* renamed from: d */
            public final void mo50225d() {
                super.mo50225d();
                PhotoMovieChangeModule.this.f98589c.mo78730a();
                PhotoMovieChangeModule.this.f98590d.mo78730a();
            }

            /* renamed from: a */
            public final void mo50217a() {
                super.mo50217a();
                PhotoMovieChangeModule.this.f98591e = PhotoMovieChangeModule.this.f98588b.mo78753a().mPlayType;
                if (PhotoMovieChangeModule.this.f98591e == 0) {
                    PhotoMovieChangeModule.this.mo78710b();
                } else {
                    PhotoMovieChangeModule.this.mo78711c();
                }
                PhotoMovieChangeModule.this.mo78709a(PhotoMovieChangeModule.this.f98589c, C38761a.f98615a);
                PhotoMovieChangeModule.this.mo78709a(PhotoMovieChangeModule.this.f98590d, C38761a.f98616b);
            }
        });
    }

    /* renamed from: a */
    private void m86124a(final int i, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView, TextView textView2, ImageView imageView5, ImageView imageView6) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(100);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, "alpha", new float[]{1.0f, 0.6f});
        ofFloat2.setDuration(100);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView3, "alpha", new float[]{1.0f, 0.6f});
        ofFloat3.setDuration(100);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        final ImageView imageView7 = imageView5;
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                imageView7.setImageDrawable(PhotoMovieChangeModule.this.f98592f);
            }
        });
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView2, "alpha", new float[]{0.0f, 1.0f});
        ofFloat4.setDuration(200);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView2, "alpha", new float[]{0.6f, 1.0f});
        ofFloat5.setDuration(200);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView4, "alpha", new float[]{0.6f, 1.0f});
        ofFloat6.setDuration(200);
        animatorSet2.playTogether(new Animator[]{ofFloat4, ofFloat5, ofFloat6});
        final ImageView imageView8 = imageView6;
        animatorSet2.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                imageView8.setImageDrawable(PhotoMovieChangeModule.this.f98593g);
            }
        });
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.play(animatorSet2).after(animatorSet);
        int i2 = i;
        animatorSet3.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (i == 1) {
                    PhotoMovieChangeModule.this.mo78711c();
                } else {
                    PhotoMovieChangeModule.this.mo78710b();
                }
            }
        });
        animatorSet3.start();
    }
}
