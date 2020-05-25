package com.p683ss.android.ugc.aweme.poi.preview.p2071c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Color;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.support.p030v4.view.ViewPager.C1000h;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.poi.preview.p2068b.C39160a;
import com.p683ss.android.ugc.aweme.poi.preview.p2068b.C39168b;
import com.p683ss.android.ugc.aweme.poi.preview.p2071c.p2072a.C39174c;
import com.p683ss.android.ugc.aweme.poi.preview.p2071c.p2072a.C39174c.C39175a;
import com.p683ss.android.ugc.aweme.poi.preview.view.image.TransferImage;
import com.p683ss.android.ugc.aweme.poi.preview.view.image.TransferImage.C39212b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.c.f */
public final class C39184f extends FrameLayout implements C39160a {

    /* renamed from: a */
    public TransferImage f99990a;

    /* renamed from: b */
    public ViewPager f99991b;

    /* renamed from: c */
    C39174c f99992c;

    /* renamed from: d */
    public C39181e f99993d;

    /* renamed from: e */
    Context f99994e;

    /* renamed from: f */
    float f99995f;

    /* renamed from: g */
    public C0997e f99996g = new C1000h() {
        public final void onPageSelected(int i) {
            C39184f.this.f99993d.f99935a = i % C39184f.this.f99993d.f99934F;
            if (C39184f.this.f99993d.f99941g) {
                C39184f.this.mo79850a(i, 0);
                return;
            }
            for (int i2 = 1; i2 <= C39184f.this.f99993d.f99936b; i2++) {
                C39184f.this.mo79850a(i, i2);
            }
        }

        public final void onPageScrollStateChanged(int i) {
            String str;
            String str2;
            String str3;
            int i2;
            if (i == 0) {
                int currentItem = C39184f.this.f99991b.getCurrentItem();
                String str4 = C39184f.this.f99993d.f99957w;
                String str5 = C39184f.this.f99993d.f99958x;
                HashMap<String, String> hashMap = C39184f.this.f99993d.f99959y;
                if (!TextUtils.isEmpty(str5)) {
                    C23089d a = C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("enter_method", "slide_pic").mo47829a("poi_channel", C23198ae.m56852b()).mo47829a("poi_id", str4);
                    String str6 = "poi_type";
                    if (hashMap != null) {
                        str = (String) hashMap.get("poi_type");
                    } else {
                        str = "";
                    }
                    C23089d a2 = a.mo47829a(str6, str);
                    String str7 = "group_id";
                    if (hashMap != null) {
                        str2 = (String) hashMap.get("group_id");
                    } else {
                        str2 = "";
                    }
                    C23089d a3 = a2.mo47829a(str7, str2);
                    String str8 = "previous_page";
                    if (hashMap != null) {
                        str3 = (String) hashMap.get("previous_page");
                    } else {
                        str3 = "";
                    }
                    C23089d a4 = a3.mo47829a(str8, str3).mo47829a("content_type", str5);
                    if (hashMap != null) {
                        if (!TextUtils.isEmpty((CharSequence) hashMap.get("poi_backend_type"))) {
                            a4.mo47829a("poi_backend_type", (String) hashMap.get("poi_backend_type"));
                        }
                        if (!TextUtils.isEmpty((CharSequence) hashMap.get("poi_city"))) {
                            a4.mo47829a("poi_city", (String) hashMap.get("poi_city"));
                            a4.mo47829a("poi_device_samecity", (String) hashMap.get("poi_device_samecity"));
                        }
                    }
                    if (hashMap != null && hashMap.containsKey("pic_tag")) {
                        String str9 = (String) hashMap.get("pic_tag");
                        if (!TextUtils.isEmpty(str9)) {
                            String[] split = str9.split("-");
                            if (split != null && currentItem < split.length) {
                                try {
                                    i2 = Integer.parseInt(split[currentItem]);
                                } catch (Exception unused) {
                                    i2 = 0;
                                }
                                if (i2 > 0) {
                                    a4.mo47826a("pic_tag", i2);
                                }
                            }
                        }
                    }
                    C26890h.m65011a("poi_pic_operation", a4.f61491a);
                }
            }
        }
    };

    /* renamed from: h */
    C39175a f99997h = new C39175a() {
        /* renamed from: a */
        public final void mo79820a() {
            C39184f.this.f99991b.addOnPageChangeListener(C39184f.this.f99996g);
            int i = C39184f.this.f99993d.f99935a;
            if (C39184f.this.f99993d.f99941g) {
                C39184f.this.mo79850a(i, 0);
            } else {
                C39184f.this.mo79850a(i, 1);
            }
        }
    };

    /* renamed from: i */
    C39212b f99998i = new C39212b() {
        /* renamed from: a */
        public final void mo79865a(int i, int i2, int i3) {
            if (i2 == 100) {
                switch (i) {
                    case 1:
                        C39184f.this.mo79853b();
                        C39184f.this.f99991b.setVisibility(0);
                        C39184f.m87082a((View) C39184f.this.f99990a);
                        return;
                    case 2:
                        C39184f.this.mo79849a();
                        return;
                    default:
                        return;
                }
            } else {
                switch (i) {
                    case 1:
                        if (i3 == 201) {
                            C39184f.this.mo79853b();
                            C39184f.this.f99991b.setVisibility(0);
                            C39184f.m87082a((View) C39184f.this.f99990a);
                            return;
                        }
                        break;
                    case 2:
                        if (i3 == 201) {
                            C39184f.this.mo79849a();
                            break;
                        }
                        break;
                }
            }
        }
    };

    /* renamed from: j */
    private C39192a f99999j;

    /* renamed from: k */
    private Set<Integer> f100000k;

    /* renamed from: l */
    private C39171a f100001l;

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.c.f$a */
    interface C39192a {
        /* renamed from: a */
        void mo79870a();
    }

    public final Context getActivityContext() {
        return this.f99994e;
    }

    public final C39174c getTransAdapter() {
        return this.f99992c;
    }

    public final C39181e getTransConfig() {
        return this.f99993d;
    }

    public final C39212b getTransListener() {
        return this.f99998i;
    }

    public final C39181e getTransferConfig() {
        return this.f99993d;
    }

    /* access modifiers changed from: 0000 */
    public final ViewPager getViewPager() {
        return this.f99991b;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f99991b.removeOnPageChangeListener(this.f99996g);
    }

    /* renamed from: b */
    public final void mo79853b() {
        C39168b bVar = this.f99993d.f99950p;
        if (bVar == null) {
            return;
        }
        if (this.f99993d.f99934F > 0 || this.f99993d.f99930B) {
            bVar.mo79807a(this, this);
            bVar.mo79806a(this.f99991b);
        }
    }

    /* access modifiers changed from: 0000 */
    public final TransferImage getCurrentImage() {
        return this.f99992c.mo79816a(this.f99991b.getCurrentItem() % this.f99993d.f99934F);
    }

    /* renamed from: a */
    public final void mo79849a() {
        this.f100000k.clear();
        C39168b bVar = this.f99993d.f99950p;
        if (bVar != null && this.f99993d.f99934F >= 2) {
            bVar.mo79808b();
        }
        removeAllViews();
        this.f99999j.mo79870a();
    }

    public final void setOnLayoutResetListener(C39192a aVar) {
        this.f99999j = aVar;
    }

    /* renamed from: a */
    public static void m87082a(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    /* renamed from: c */
    private void m87083c(int i) {
        int size = i % this.f99993d.f99946l.size();
        mo79848a(size).mo79823b(size);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo79847a(float f) {
        int i = this.f99993d.f99939e;
        return Color.argb(Math.round(f), Color.red(i), Color.green(i), Color.blue(i));
    }

    C39184f(Context context) {
        super(context);
        this.f99994e = context;
        this.f100000k = new HashSet();
    }

    /* renamed from: a */
    public final C39193g mo79848a(int i) {
        if (!this.f99993d.mo79828c()) {
            return new C39179d(this);
        }
        this.f99993d.f99946l.get(i);
        return new C39176b(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo79854b(int i) {
        this.f99990a = this.f99992c.mo79816a(i);
        if (this.f99990a == null) {
            mo79849a();
            return;
        }
        this.f99990a.setState(2);
        this.f99990a.mo79885b();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(this.f99993d.f99940f);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f, 0.0f})});
        valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C39184f.this.f99990a.setAlpha(((Float) valueAnimator.getAnimatedValue("alpha")).floatValue());
            }
        });
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C39184f.this.mo79849a();
            }
        });
        valueAnimator.start();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dismiss(int r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.poi.preview.c.a.c r0 = r3.f99992c
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r0 = r3.f99990a
            r1 = 2
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r0 = r3.f99990a
            int r0 = r0.getState()
            if (r0 != r1) goto L_0x0013
            return
        L_0x0013:
            com.ss.android.ugc.aweme.poi.preview.c.e r0 = r3.f99993d
            int r0 = r0.mo79830e()
            r2 = 0
            if (r0 <= 0) goto L_0x0027
            com.ss.android.ugc.aweme.poi.preview.c.e r0 = r3.f99993d
            int r0 = r0.mo79830e()
            if (r4 == r0) goto L_0x0036
            r3.f99990a = r2
            goto L_0x0040
        L_0x0027:
            com.ss.android.ugc.aweme.poi.preview.c.e r0 = r3.f99993d
            int r0 = r0.f99942h
            if (r0 <= 0) goto L_0x0036
            com.ss.android.ugc.aweme.poi.preview.c.e r0 = r3.f99993d
            int r0 = r0.f99942h
            if (r4 < r0) goto L_0x0036
            r3.f99990a = r2
            goto L_0x0040
        L_0x0036:
            com.ss.android.ugc.aweme.poi.preview.c.g r0 = r3.mo79848a(r4)
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r0 = r0.mo79824c(r4)
            r3.f99990a = r0
        L_0x0040:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r0 = r3.f99990a
            if (r0 != 0) goto L_0x0048
            r3.mo79854b(r4)
            goto L_0x004e
        L_0x0048:
            android.support.v4.view.ViewPager r4 = r3.f99991b
            r0 = 4
            r4.setVisibility(r0)
        L_0x004e:
            com.ss.android.ugc.aweme.poi.preview.c.e r4 = r3.f99993d
            com.ss.android.ugc.aweme.poi.preview.b.b r4 = r4.f99950p
            if (r4 == 0) goto L_0x0063
            com.ss.android.ugc.aweme.poi.preview.c.e r0 = r3.f99993d
            int r0 = r0.f99934F
            if (r0 >= r1) goto L_0x0060
            com.ss.android.ugc.aweme.poi.preview.c.e r0 = r3.f99993d
            boolean r0 = r0.f99930B
            if (r0 == 0) goto L_0x0063
        L_0x0060:
            r4.mo79805a()
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.preview.p2071c.C39184f.dismiss(int):void");
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getPointerCount() == 1 && this.f100001l != null) {
            C39171a aVar = this.f100001l;
            boolean z2 = false;
            if (motionEvent.getPointerCount() == 1) {
                switch (motionEvent.getAction()) {
                    case 0:
                        aVar.f99911b = motionEvent.getRawY();
                        break;
                    case 1:
                        aVar.f99911b = 0.0f;
                        break;
                    case 2:
                        float rawY = motionEvent.getRawY() - aVar.f99911b;
                        TransferImage currentImage = aVar.f99910a.getCurrentImage();
                        if (rawY > ((float) aVar.f99912c) && currentImage != null) {
                            if (currentImage.f100055m == 0.0f && currentImage.f100056n == 1.0f && currentImage.getTranslationX() == 0.0f && currentImage.getTranslationY() == 0.0f) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (!z) {
                                z2 = true;
                                break;
                            }
                        }
                        break;
                }
            }
            if (z2) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        if (this.f100001l != null) {
            C39171a aVar = this.f100001l;
            float y = motionEvent.getY();
            float f2 = y - aVar.f99911b;
            switch (motionEvent.getAction()) {
                case 0:
                    aVar.f99911b = y;
                    break;
                case 1:
                    if (f2 > C9432q.m18687b(aVar.f99910a.getContext(), 160.0f)) {
                        C39184f fVar = aVar.f99910a;
                        fVar.mo79854b(fVar.f99993d.mo79830e());
                    } else {
                        ViewPager viewPager = aVar.f99910a.getViewPager();
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(aVar.f99910a, "backgroundColor", new int[]{aVar.f99910a.mo79847a(aVar.f99910a.f99995f), aVar.f99910a.mo79847a(255.0f)});
                        ofInt.setEvaluator(new ArgbEvaluator());
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewPager, "translationY", new float[]{viewPager.getTranslationY(), 0.0f});
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{ofInt, ofFloat});
                        animatorSet.start();
                    }
                    aVar.f99911b = 0.0f;
                    break;
                case 2:
                    float abs = Math.abs(f2);
                    if (abs < 350.0f) {
                        aVar.f99910a.f99995f = 255.0f - ((abs / 350.0f) * 25.0f);
                    } else {
                        aVar.f99910a.f99995f = 230.0f - ((((abs - 350.0f) * 1.35f) / ((float) aVar.f99910a.getHeight())) * 255.0f);
                    }
                    C39184f fVar2 = aVar.f99910a;
                    if (aVar.f99910a.f99995f < 0.0f) {
                        f = 0.0f;
                    } else {
                        f = aVar.f99910a.f99995f;
                    }
                    fVar2.f99995f = f;
                    ViewPager viewPager2 = aVar.f99910a.getViewPager();
                    if (viewPager2.getTranslationY() < 0.0f) {
                        aVar.f99910a.setBackgroundColor(aVar.f99910a.getTransConfig().f99939e);
                        viewPager2.setTranslationY(f2);
                        break;
                    } else {
                        aVar.f99910a.setBackgroundColor(aVar.f99910a.mo79847a(aVar.f99910a.f99995f));
                        viewPager2.setTranslationY(f2);
                        break;
                    }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void mo79852a(C39181e eVar) {
        this.f99993d = eVar;
        if (this.f99993d.f99933E) {
            this.f100001l = new C39171a(this);
        }
    }

    /* renamed from: a */
    public final void mo79850a(int i, int i2) {
        int i3 = i - i2;
        int i4 = i2 + i;
        m87083c(i);
        this.f100000k.add(Integer.valueOf(i));
        if (i3 >= 0 && !this.f100000k.contains(Integer.valueOf(i3))) {
            m87083c(i3);
            this.f100000k.add(Integer.valueOf(i3));
        }
        if (i4 < this.f99993d.f99946l.size() && !this.f100000k.contains(Integer.valueOf(i4))) {
            m87083c(i4);
            this.f100000k.add(Integer.valueOf(i4));
        }
    }

    /* renamed from: a */
    public final void mo79851a(final ImageView imageView, final int i) {
        imageView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C39184f.this.f99993d.f99931C != null) {
                    C39184f.this.f99991b.getCurrentItem();
                }
                C39184f.this.dismiss(i);
            }
        });
        if (this.f99993d.f99929A != null) {
            imageView.setOnLongClickListener(new OnLongClickListener() {
                public final boolean onLongClick(View view) {
                    return false;
                }
            });
        }
    }
}
