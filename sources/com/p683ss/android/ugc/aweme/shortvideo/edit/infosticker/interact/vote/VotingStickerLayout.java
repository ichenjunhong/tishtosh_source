package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.scene.C18998a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout */
public final class VotingStickerLayout extends FrameLayout implements OnClickListener, C43629d {

    /* renamed from: a */
    FrameLayout f110453a;

    /* renamed from: b */
    public FrameLayout f110454b;

    /* renamed from: c */
    public final C52670a<C52860x> f110455c = new C43612c(this);

    /* renamed from: d */
    C52671b<? super VotingStickerView, C52860x> f110456d;

    /* renamed from: e */
    C52671b<? super VotingStickerView, C52860x> f110457e;

    /* renamed from: f */
    C43618a f110458f;

    /* renamed from: g */
    C43618a f110459g;

    /* renamed from: h */
    volatile int f110460h;

    /* renamed from: i */
    int f110461i;

    /* renamed from: j */
    boolean f110462j;

    /* renamed from: k */
    boolean f110463k;

    /* renamed from: l */
    boolean f110464l;

    /* renamed from: m */
    PointF f110465m;

    /* renamed from: n */
    public VotingStickerView f110466n;

    /* renamed from: o */
    int f110467o;

    /* renamed from: p */
    public boolean f110468p;

    /* renamed from: q */
    public Animator f110469q;

    /* renamed from: r */
    private int f110470r;

    /* renamed from: s */
    private HashMap f110471s;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout$a */
    public static final class C43610a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ VotingStickerLayout f110472a;

        C43610a(VotingStickerLayout votingStickerLayout) {
            this.f110472a = votingStickerLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f110472a.f110469q = null;
            VotingStickerView votingStickerView = this.f110472a.f110466n;
            if (votingStickerView != null) {
                votingStickerView.mo88956b();
            }
            VotingStickerLayout votingStickerLayout = this.f110472a;
            VotingStickerView votingStickerView2 = votingStickerLayout.f110466n;
            if (votingStickerView2 != null) {
                FrameLayout frameLayout = votingStickerLayout.f110453a;
                if (frameLayout == null) {
                    C52711k.m112237a("container");
                }
                frameLayout.removeView(votingStickerView2);
                votingStickerView2.setEditEnable(false);
                VotingStickerView votingStickerView3 = votingStickerLayout.f110466n;
                if (votingStickerView3 != null) {
                    votingStickerView3.setScaleX(1.0f);
                    votingStickerView3.setScaleY(1.0f);
                    votingStickerView3.setRotation(0.0f);
                    votingStickerView3.setTranslationX(0.0f);
                    votingStickerView3.setTranslationY(0.0f);
                    votingStickerLayout.f110462j = false;
                    votingStickerLayout.f110461i = 0;
                    C43618a aVar = new C43618a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63, null);
                    votingStickerLayout.f110459g = aVar;
                }
                C52671b<? super VotingStickerView, C52860x> bVar = votingStickerLayout.f110456d;
                if (bVar != null) {
                    bVar.invoke(votingStickerLayout.f110466n);
                }
                votingStickerLayout.f110466n = null;
            }
            this.f110472a.setVisibility(4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout$b */
    public static final class C43611b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ VotingStickerLayout f110473a;

        C43611b(VotingStickerLayout votingStickerLayout) {
            this.f110473a = votingStickerLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            VotingStickerView votingStickerView = this.f110473a.f110466n;
            if (votingStickerView != null) {
                votingStickerView.mo88957c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout$c */
    static final class C43612c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ VotingStickerLayout f110474a;

        C43612c(VotingStickerLayout votingStickerLayout) {
            this.f110474a = votingStickerLayout;
            super(0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
            if (r2 != false) goto L_0x004e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
                r14 = this;
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout r0 = r14.f110474a
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView r1 = r0.f110466n
                if (r1 == 0) goto L_0x022d
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                android.widget.FrameLayout r2 = r0.f110454b
                if (r2 != 0) goto L_0x0014
                java.lang.String r3 = "root"
                p2628d.p2639f.p2641b.C52711k.m112237a(r3)
            L_0x0014:
                r2.getWindowVisibleDisplayFrame(r1)
                int r2 = r0.f110461i
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0057
                int r2 = r0.getHeight()
                int r5 = r0.f110461i
                if (r2 <= r5) goto L_0x0057
                int r2 = r0.getHeight()
                int r5 = r1.height()
                if (r2 <= r5) goto L_0x004e
                int r2 = r0.getHeight()
                int r5 = r1.height()
                int r2 = r2 - r5
                int r2 = java.lang.Math.abs(r2)
                int r5 = com.p683ss.android.ugc.aweme.base.utils.C23724k.m58225c()
                if (r2 <= r5) goto L_0x004b
                int r5 = com.p683ss.android.ugc.aweme.base.utils.C23724k.m58227d()
                if (r2 > r5) goto L_0x0049
                goto L_0x004b
            L_0x0049:
                r2 = 0
                goto L_0x004c
            L_0x004b:
                r2 = 1
            L_0x004c:
                if (r2 == 0) goto L_0x0057
            L_0x004e:
                d.f.a.b<? super com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView, d.x> r2 = r0.f110457e
                if (r2 == 0) goto L_0x0057
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView r5 = r0.f110466n
                r2.invoke(r5)
            L_0x0057:
                int r2 = r0.getHeight()
                int r5 = r1.height()
                int r2 = r2 - r5
                int r5 = com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.C43630e.f110523a
                if (r2 <= r5) goto L_0x022d
                int r2 = r0.getHeight()
                int r5 = r1.height()
                int r2 = r2 - r5
                r0.f110460h = r2
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView r2 = r0.f110466n
                r5 = 2
                if (r2 == 0) goto L_0x0095
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r6 = r0.f110458f
                int r7 = r0.getWidth()
                int r8 = r2.getWidth()
                int r7 = r7 - r8
                int r7 = r7 / r5
                float r7 = (float) r7
                r6.f110488d = r7
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r6 = r0.f110458f
                int r7 = r0.getHeight()
                int r8 = r0.f110460h
                int r7 = r7 - r8
                int r2 = r2.getHeight()
                int r7 = r7 - r2
                int r7 = r7 / r5
                float r2 = (float) r7
                r6.f110489e = r2
            L_0x0095:
                int r2 = r0.f110467o
                int r6 = com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.C43630e.f110526d
                r7 = 300(0x12c, double:1.48E-321)
                if (r2 != r6) goto L_0x0157
                int r2 = com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.C43630e.f110524b
                r0.f110467o = r2
                r0.f110464l = r4
                boolean r2 = r0.f110463k
                if (r2 != 0) goto L_0x0227
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView r2 = r0.f110466n
                if (r2 == 0) goto L_0x0153
                r2.setVisibility(r4)
                android.view.View r2 = (android.view.View) r2
                java.lang.String r6 = "scaleX"
                float[] r9 = new float[r5]
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r10 = r0.f110459g
                float r10 = r10.f110485a
                r9[r4] = r10
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r10 = r0.f110458f
                float r10 = r10.f110485a
                r9[r3] = r10
                android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r6, r9)
                java.lang.String r9 = "scaleY"
                float[] r10 = new float[r5]
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r11 = r0.f110459g
                float r11 = r11.f110486b
                r10[r4] = r11
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r11 = r0.f110458f
                float r11 = r11.f110486b
                r10[r3] = r11
                android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r2, r9, r10)
                java.lang.String r10 = "rotation"
                float[] r11 = new float[r5]
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r12 = r0.f110459g
                float r12 = r12.f110487c
                r11[r4] = r12
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r12 = r0.f110459g
                float r12 = r12.f110487c
                r13 = 1127481344(0x43340000, float:180.0)
                int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
                if (r12 <= 0) goto L_0x00ef
                r12 = 1135869952(0x43b40000, float:360.0)
                goto L_0x00f3
            L_0x00ef:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r12 = r0.f110458f
                float r12 = r12.f110487c
            L_0x00f3:
                r11[r3] = r12
                android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r2, r10, r11)
                java.lang.String r11 = "x"
                float[] r12 = new float[r5]
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r13 = r0.f110459g
                float r13 = r13.f110488d
                r12[r4] = r13
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r13 = r0.f110458f
                float r13 = r13.f110488d
                r12[r3] = r13
                android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r2, r11, r12)
                java.lang.String r12 = "y"
                float[] r5 = new float[r5]
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r13 = r0.f110459g
                float r13 = r13.f110489e
                r5[r4] = r13
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r4 = r0.f110458f
                float r4 = r4.f110489e
                r5[r3] = r4
                android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r12, r5)
                android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
                r4.<init>()
                r4.setDuration(r7)
                android.animation.Animator r6 = (android.animation.Animator) r6
                android.animation.AnimatorSet$Builder r5 = r4.play(r6)
                android.animation.Animator r9 = (android.animation.Animator) r9
                android.animation.AnimatorSet$Builder r5 = r5.with(r9)
                android.animation.Animator r10 = (android.animation.Animator) r10
                android.animation.AnimatorSet$Builder r5 = r5.with(r10)
                android.animation.Animator r11 = (android.animation.Animator) r11
                android.animation.AnimatorSet$Builder r5 = r5.with(r11)
                android.animation.Animator r2 = (android.animation.Animator) r2
                r5.with(r2)
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout$b r2 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout$b
                r2.<init>(r0)
                android.animation.Animator$AnimatorListener r2 = (android.animation.Animator.AnimatorListener) r2
                r4.addListener(r2)
                r4.start()
            L_0x0153:
                r0.f110463k = r3
                goto L_0x0227
            L_0x0157:
                int r6 = com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.C43630e.f110525c
                if (r2 != r6) goto L_0x0227
                int r2 = com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.C43630e.f110524b
                r0.f110467o = r2
                r0.f110464l = r4
                boolean r2 = r0.f110463k
                if (r2 != 0) goto L_0x0227
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView r2 = r0.f110466n
                if (r2 == 0) goto L_0x0225
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r6 = r0.f110459g
                int r9 = r0.getWidth()
                int r10 = r2.getWidth()
                int r9 = r9 - r10
                int r9 = r9 / r5
                float r9 = (float) r9
                r6.f110488d = r9
                r6 = 2132018913(0x7f1406e1, float:1.9676146E38)
                android.view.View r6 = r2.mo88955b(r6)
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText r6 = (com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText) r6
                java.lang.String r9 = "it.et_voting_sticker_title"
                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r9)
                android.text.Editable r6 = r6.getText()
                java.lang.String r6 = java.lang.String.valueOf(r6)
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                int r6 = r6.length()
                if (r6 != 0) goto L_0x0198
                r6 = 1
                goto L_0x0199
            L_0x0198:
                r6 = 0
            L_0x0199:
                r9 = 1073741824(0x40000000, float:2.0)
                if (r6 == 0) goto L_0x01c3
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r6 = r0.f110459g
                android.graphics.PointF r10 = r0.f110465m
                float r10 = r10.x
                int r11 = r2.getHeight()
                float r11 = (float) r11
                float r10 = r10 - r11
                float r10 = r10 / r9
                android.graphics.PointF r9 = r0.f110465m
                float r9 = r9.y
                float r10 = r10 + r9
                int r9 = r2.getHeight()
                float r9 = (float) r9
                android.content.Context r11 = r0.getContext()
                r12 = 1119879168(0x42c00000, float:96.0)
                float r11 = com.bytedance.common.utility.C9432q.m18687b(r11, r12)
                float r9 = r9 - r11
                float r10 = r10 - r9
                r6.f110489e = r10
                goto L_0x01d7
            L_0x01c3:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r6 = r0.f110459g
                android.graphics.PointF r10 = r0.f110465m
                float r10 = r10.x
                int r11 = r2.getHeight()
                float r11 = (float) r11
                float r10 = r10 - r11
                float r10 = r10 / r9
                android.graphics.PointF r9 = r0.f110465m
                float r9 = r9.y
                float r10 = r10 + r9
                r6.f110489e = r10
            L_0x01d7:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r6 = r0.f110458f
                float r6 = r6.f110488d
                r2.setX(r6)
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r6 = r0.f110458f
                float r6 = r6.f110489e
                r2.setY(r6)
                r2.setVisibility(r4)
                r0.requestLayout()
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView r2 = r0.f110466n
                if (r2 == 0) goto L_0x0225
                java.lang.String r4 = "scaleX"
                float[] r6 = new float[r5]
                r6 = {0, 1065353216} // fill-array
                android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r2, r4, r6)
                java.lang.String r6 = "scaleY"
                float[] r5 = new float[r5]
                r5 = {0, 1065353216} // fill-array
                android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r6, r5)
                android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
                r5.<init>()
                r5.setDuration(r7)
                android.animation.Animator r4 = (android.animation.Animator) r4
                android.animation.AnimatorSet$Builder r4 = r5.play(r4)
                android.animation.Animator r2 = (android.animation.Animator) r2
                r4.with(r2)
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout$d r2 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout$d
                r2.<init>(r0)
                android.animation.Animator$AnimatorListener r2 = (android.animation.Animator.AnimatorListener) r2
                r5.addListener(r2)
                r5.start()
            L_0x0225:
                r0.f110463k = r3
            L_0x0227:
                int r1 = r1.height()
                r0.f110461i = r1
            L_0x022d:
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.C43612c.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout$d */
    public static final class C43613d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ VotingStickerLayout f110475a;

        C43613d(VotingStickerLayout votingStickerLayout) {
            this.f110475a = votingStickerLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            VotingStickerView votingStickerView = this.f110475a.f110466n;
            if (votingStickerView != null) {
                votingStickerView.mo88957c();
            }
        }
    }

    /* renamed from: a */
    private View m95860a(int i) {
        if (this.f110471s == null) {
            this.f110471s = new HashMap();
        }
        View view = (View) this.f110471s.get(Integer.valueOf(R.id.daw));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.daw);
        this.f110471s.put(Integer.valueOf(R.id.daw), findViewById);
        return findViewById;
    }

    public final C52671b<VotingStickerView, C52860x> getBeforeChangeListener() {
        return this.f110457e;
    }

    public final C52671b<VotingStickerView, C52860x> getOnCompleteListener() {
        return this.f110456d;
    }

    /* renamed from: a */
    public final void mo88939a() {
        this.f110467o = C43630e.f110524b;
        dismiss();
    }

    /* renamed from: c */
    private final void m95863c() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        Activity a = C18998a.m46169a(context);
        if (a != null && inputMethodManager != null) {
            Window window = a.getWindow();
            C52711k.m112236a((Object) window, "it.window");
            View decorView = window.getDecorView();
            C52711k.m112236a((Object) decorView, "it.window.decorView");
            inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
        }
    }

    /* renamed from: b */
    private final void m95862b() {
        setBackgroundColor(getResources().getColor(R.color.dg));
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.a9o, this, false);
        if (inflate != null) {
            this.f110453a = (FrameLayout) inflate;
            FrameLayout frameLayout = this.f110453a;
            if (frameLayout == null) {
                C52711k.m112237a("container");
            }
            addView(frameLayout);
            OnClickListener onClickListener = this;
            ((TextView) m95860a((int) R.id.daw)).setOnClickListener(onClickListener);
            setOnClickListener(onClickListener);
            setVisibility(4);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    public final void dismiss() {
        float f;
        this.f110463k = false;
        VotingStickerView votingStickerView = this.f110466n;
        if (votingStickerView != null) {
            votingStickerView.setTouchEnable(true);
        }
        if (!this.f110464l) {
            VotingStickerView votingStickerView2 = this.f110466n;
            if (votingStickerView2 != null) {
                View view = votingStickerView2;
                AnimatorListener aVar = new C43610a(this);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{this.f110458f.f110485a, this.f110459g.f110485a});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{this.f110458f.f110486b, this.f110459g.f110486b});
                String str = "rotation";
                float[] fArr = new float[2];
                if (this.f110459g.f110487c > 180.0f) {
                    f = 360.0f;
                } else {
                    f = this.f110458f.f110487c;
                }
                fArr[0] = f;
                fArr[1] = this.f110459g.f110487c;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, str, fArr);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "x", new float[]{this.f110458f.f110488d, this.f110459g.f110488d});
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "y", new float[]{this.f110458f.f110489e, this.f110459g.f110489e});
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(300);
                animatorSet.addListener(aVar);
                animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
                animatorSet.start();
                this.f110469q = animatorSet;
                m95863c();
            }
            this.f110464l = true;
        }
    }

    public final void setBeforeChangeListener(C52671b<? super VotingStickerView, C52860x> bVar) {
        this.f110457e = bVar;
    }

    public final void setMaxLine(int i) {
        this.f110470r = i;
    }

    public final void setOnCompleteListener(C52671b<? super VotingStickerView, C52860x> bVar) {
        this.f110456d = bVar;
    }

    /* renamed from: a */
    private static void m95861a(C43618a aVar) {
        float f = aVar.f110487c % 360.0f;
        if (f < 0.0f) {
            f += 360.0f;
        }
        aVar.f110487c = f;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (C52711k.m112239a((Object) view, (Object) this) || C52711k.m112239a((Object) view, (Object) (TextView) m95860a((int) R.id.daw))) {
            m95863c();
        }
    }

    public VotingStickerLayout(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
        C43618a aVar = new C43618a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63, null);
        this.f110458f = aVar;
        C43618a aVar2 = new C43618a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63, null);
        this.f110459g = aVar2;
        this.f110462j = true;
        this.f110465m = new PointF(0.0f, 0.0f);
        this.f110467o = C43630e.f110524b;
        this.f110470r = 3;
        m95862b();
    }

    /* renamed from: a */
    public final void mo88940a(float f, float f2) {
        this.f110465m.x = f;
        this.f110465m.y = f2;
    }

    public VotingStickerLayout(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attr");
        super(context, attributeSet);
        C43618a aVar = new C43618a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63, null);
        this.f110458f = aVar;
        C43618a aVar2 = new C43618a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63, null);
        this.f110459g = aVar2;
        this.f110462j = true;
        this.f110465m = new PointF(0.0f, 0.0f);
        this.f110467o = C43630e.f110524b;
        this.f110470r = 3;
        m95862b();
    }

    /* renamed from: a */
    public final void mo88941a(VotingStickerView votingStickerView, C43618a aVar) {
        C52860x xVar;
        C52711k.m112240b(aVar, "animatorInfo");
        setVisibility(0);
        if (votingStickerView != null) {
            this.f110467o = C43630e.f110526d;
            this.f110459g = aVar;
            m95861a(this.f110459g);
            this.f110466n = votingStickerView;
            VotingStickerView votingStickerView2 = this.f110466n;
            if (votingStickerView2 != null) {
                votingStickerView2.setTouchEnable(false);
            }
            ViewParent parent = votingStickerView.getParent();
            if (parent != null) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.f110466n);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            FrameLayout frameLayout = this.f110453a;
            if (frameLayout == null) {
                C52711k.m112237a("container");
            }
            frameLayout.addView(votingStickerView);
            votingStickerView.setEditEnable(true);
            setVisibility(0);
            VotingStickerView votingStickerView3 = this.f110466n;
            if (votingStickerView3 != null) {
                votingStickerView3.setVisibility(4);
            }
            VotingStickerView votingStickerView4 = this.f110466n;
            if (votingStickerView4 != null) {
                votingStickerView4.mo88953a(this.f110470r);
            }
            VotingStickerView votingStickerView5 = this.f110466n;
            if (votingStickerView5 != null) {
                votingStickerView5.setEditTextFocusable(aVar.f110490f);
                xVar = C52860x.f131107a;
            } else {
                xVar = null;
            }
            if (xVar != null) {
                return;
            }
        }
        this.f110467o = C43630e.f110525c;
        this.f110462j = true;
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        VotingStickerView votingStickerView6 = new VotingStickerView(context);
        votingStickerView6.mo88953a(this.f110470r);
        votingStickerView6.setTouchEnable(false);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        votingStickerView6.setVisibility(4);
        FrameLayout frameLayout2 = this.f110453a;
        if (frameLayout2 == null) {
            C52711k.m112237a("container");
        }
        frameLayout2.addView(votingStickerView6, layoutParams);
        this.f110466n = votingStickerView6;
        votingStickerView6.mo88952a();
    }

    public VotingStickerLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attr");
        super(context, attributeSet, i);
        C43618a aVar = new C43618a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63, null);
        this.f110458f = aVar;
        C43618a aVar2 = new C43618a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63, null);
        this.f110459g = aVar2;
        this.f110462j = true;
        this.f110465m = new PointF(0.0f, 0.0f);
        this.f110467o = C43630e.f110524b;
        this.f110470r = 3;
        m95862b();
    }
}
