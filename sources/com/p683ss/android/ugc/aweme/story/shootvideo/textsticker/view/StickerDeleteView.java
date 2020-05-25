package com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.gamora.editor.C49391cu;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.StickerDeleteView */
public class StickerDeleteView extends FrameLayout implements C49391cu {

    /* renamed from: b */
    private ImageView f117890b;

    /* renamed from: c */
    private View f117891c;

    /* renamed from: d */
    private View f117892d;

    /* renamed from: e */
    private View f117893e;

    /* renamed from: f */
    private boolean f117894f;

    /* renamed from: g */
    private boolean f117895g;

    /* renamed from: h */
    private boolean f117896h;

    /* renamed from: i */
    private boolean f117897i;

    /* renamed from: j */
    private Vibrator f117898j;

    /* renamed from: k */
    private int f117899k;

    /* renamed from: l */
    private boolean f117900l;

    /* renamed from: e */
    private void m101463e() {
        this.f117894f = false;
        this.f117895g = false;
        this.f117897i = false;
        this.f117896h = false;
    }

    /* renamed from: f */
    private void m101464f() {
        if (this.f117893e.getVisibility() == 0) {
            m101460a(this.f117893e, false, true);
        }
    }

    /* renamed from: g */
    private void m101465g() {
        if (this.f117897i) {
            this.f117897i = false;
            m101460a(this.f117891c, false, true);
        }
    }

    /* renamed from: h */
    private void m101466h() {
        if (this.f117898j != null) {
            try {
                this.f117898j.vibrate(10);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo93815a() {
        LayoutParams layoutParams = (LayoutParams) getLayoutParams();
        layoutParams.topMargin = C23724k.m58225c();
        setLayoutParams(layoutParams);
    }

    public final void cp_() {
        m101464f();
        m101462d();
        this.f117894f = false;
    }

    /* renamed from: c */
    private void m101461c() {
        if (!this.f117896h) {
            this.f117892d.setVisibility(0);
            this.f117896h = true;
            m101460a(this.f117892d, true, false);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -20.0f, 10.0f, 30.0f);
            rotateAnimation.setDuration(300);
            rotateAnimation.setFillAfter(true);
            this.f117890b.startAnimation(rotateAnimation);
        }
    }

    /* renamed from: d */
    private void m101462d() {
        if (this.f117896h) {
            this.f117896h = false;
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 0.0f, 10.0f, 30.0f);
            rotateAnimation.setFillAfter(true);
            rotateAnimation.setDuration(300);
            this.f117890b.startAnimation(rotateAnimation);
            m101460a(this.f117892d, false, false);
        }
    }

    private StickerDeleteView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static StickerDeleteView m101459a(Context context) {
        if (context == null) {
            return null;
        }
        StickerDeleteView stickerDeleteView = new StickerDeleteView(context);
        int b = (int) C9432q.m18687b(context, 72.0f);
        LayoutParams layoutParams = new LayoutParams(b, b);
        layoutParams.topMargin = C23724k.m58225c();
        stickerDeleteView.setLayoutParams(layoutParams);
        layoutParams.gravity = 49;
        stickerDeleteView.setLayoutParams(layoutParams);
        return stickerDeleteView;
    }

    public StickerDeleteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(context).inflate(R.layout.a8k, null);
        this.f117890b = (ImageView) inflate.findViewById(R.id.d31);
        this.f117891c = inflate.findViewById(R.id.a4a);
        this.f117893e = inflate.findViewById(R.id.bw_);
        this.f117892d = inflate.findViewById(R.id.kn);
        addView(inflate);
        this.f117892d.setVisibility(8);
        this.f117893e.setVisibility(8);
        this.f117898j = (Vibrator) context.getSystemService("vibrator");
    }

    /* renamed from: a */
    private void m101460a(final View view, boolean z, final boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        AnimatorSet animatorSet = new AnimatorSet();
        String str = "alpha";
        float[] fArr = new float[2];
        float f6 = 1.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
        String str2 = "scaleX";
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        fArr2[0] = f3;
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        fArr2[1] = f4;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, str2, fArr2);
        String str3 = "scaleY";
        float[] fArr3 = new float[2];
        if (z) {
            f5 = 0.0f;
        } else {
            f5 = 1.0f;
        }
        fArr3[0] = f5;
        if (!z) {
            f6 = 0.0f;
        }
        fArr3[1] = f6;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, str3, fArr3);
        animatorSet.setDuration(300);
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                if (z2) {
                    view.setVisibility(8);
                }
                super.onAnimationEnd(animator);
            }
        });
        animatorSet.start();
    }

    /* renamed from: b */
    public final int mo93816b(int i, int i2, boolean z, boolean z2) {
        if (!this.f117900l && z2) {
            m101466h();
        }
        this.f117900l = z2;
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r9.f117899k == 1) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        if (r9.f117899k == 1) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo93814a(int r10, int r11, boolean r12, boolean r13) {
        /*
            r9 = this;
            r0 = -1
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 1
            if (r13 == 0) goto L_0x0026
            if (r12 == 0) goto L_0x001b
            r9.m101464f()
            r9.m101462d()
            r9.f117894f = r3
            r9.m101463e()
            int r10 = r9.f117899k
            if (r10 != r4) goto L_0x0095
        L_0x0018:
            r0 = 2
            goto L_0x0095
        L_0x001b:
            r9.m101465g()
            r9.m101461c()
            r9.f117894f = r4
        L_0x0023:
            r0 = 1
            goto L_0x0095
        L_0x0026:
            android.graphics.Rect r13 = new android.graphics.Rect
            int r5 = r9.getLeft()
            int r6 = r9.getTop()
            int r7 = r9.getRight()
            int r8 = r9.getBottom()
            r13.<init>(r5, r6, r7, r8)
            if (r12 == 0) goto L_0x0055
            boolean r10 = r13.contains(r10, r11)
            if (r10 == 0) goto L_0x004e
            r9.m101464f()
            r9.m101462d()
            int r10 = r9.f117899k
            if (r10 != r4) goto L_0x0095
            goto L_0x0018
        L_0x004e:
            r9.m101464f()
            r9.m101462d()
            goto L_0x0093
        L_0x0055:
            boolean r10 = r13.contains(r10, r11)
            if (r10 == 0) goto L_0x0064
            r9.m101465g()
            r9.m101461c()
            r9.f117894f = r4
            goto L_0x0023
        L_0x0064:
            r9.m101462d()
            android.view.View r10 = r9.f117893e
            int r10 = r10.getVisibility()
            r11 = 8
            if (r10 != r11) goto L_0x007b
            android.view.View r10 = r9.f117893e
            r10.setVisibility(r3)
            android.view.View r10 = r9.f117893e
            r9.m101460a(r10, r4, r3)
        L_0x007b:
            boolean r10 = r9.f117897i
            if (r10 != 0) goto L_0x008b
            r9.f117897i = r4
            android.view.View r10 = r9.f117891c
            r10.setVisibility(r3)
            android.view.View r10 = r9.f117891c
            r9.m101460a(r10, r4, r3)
        L_0x008b:
            boolean r10 = r9.f117894f
            if (r10 == 0) goto L_0x0093
            r9.f117894f = r3
            r0 = 3
            goto L_0x0095
        L_0x0093:
            r9.f117894f = r3
        L_0x0095:
            r9.f117899k = r0
            if (r0 != r4) goto L_0x00a6
            boolean r10 = r9.f117895g
            if (r10 != 0) goto L_0x00a4
            r9.m101466h()
            r9.f117895g = r4
            r1 = 1
            goto L_0x00b8
        L_0x00a4:
            r1 = 0
            goto L_0x00b8
        L_0x00a6:
            if (r0 != r2) goto L_0x00ae
            r9.m101463e()
            r9.f117895g = r3
            goto L_0x00b8
        L_0x00ae:
            if (r0 != r1) goto L_0x00b5
            r9.m101466h()
            r1 = 2
            goto L_0x00b8
        L_0x00b5:
            r9.f117895g = r3
            r1 = 4
        L_0x00b8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.StickerDeleteView.mo93814a(int, int, boolean, boolean):int");
    }
}
