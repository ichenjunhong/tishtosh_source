package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.e */
public final class C23690e extends FrameLayout {

    /* renamed from: a */
    public static final float f63181a = ((float) C23728o.m58241a(90.0d));

    /* renamed from: b */
    public static final float f63182b = ((float) C23728o.m58241a(50.0d));

    /* renamed from: c */
    public static float f63183c;

    /* renamed from: d */
    public static float f63184d;

    /* renamed from: e */
    public static float f63185e;

    /* renamed from: f */
    public static float f63186f;

    /* renamed from: g */
    public static final int f63187g = C23728o.m58241a(2.0d);

    /* renamed from: h */
    public static final C23691a f63188h = new C23691a(null);

    /* renamed from: i */
    private View f63189i;

    /* renamed from: j */
    private FrameLayout f63190j;

    /* renamed from: k */
    private DmtTextView f63191k;

    /* renamed from: l */
    private boolean f63192l;

    /* renamed from: m */
    private Intent f63193m;

    /* renamed from: n */
    private float f63194n;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.e$a */
    public static final class C23691a {
        private C23691a() {
        }

        public /* synthetic */ C23691a(C52707g gVar) {
            this();
        }
    }

    public final Intent getCurrentIntent() {
        return this.f63193m;
    }

    public final boolean getMove() {
        return this.f63192l;
    }

    public final float getVirtualBarHeight() {
        return this.f63194n;
    }

    public final void setCurrentIntent(Intent intent) {
        this.f63193m = intent;
    }

    public final void setMove(boolean z) {
        this.f63192l = z;
    }

    public final void setVirtualBarHeight(float f) {
        this.f63194n = f;
    }

    /* renamed from: a */
    private final void m58143a(float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "y", new float[]{getY(), f});
        C52711k.m112236a((Object) ofFloat, "animator");
        ofFloat.setDuration(200);
        ofFloat.start();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        C52711k.m112240b(motionEvent, "event");
        switch (motionEvent.getAction()) {
            case 0:
                f63183c = motionEvent.getRawX();
                f63184d = motionEvent.getRawY();
                f63185e = motionEvent.getRawX();
                f63186f = motionEvent.getRawY();
                View view = this;
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                int measuredWidth = view.getMeasuredWidth() + i;
                int measuredHeight = view.getMeasuredHeight() + i2;
                if (rawY < ((float) i2) || rawY > ((float) measuredHeight) || rawX < ((float) i) || rawX > ((float) measuredWidth)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.5f});
                    C52711k.m112236a((Object) ofFloat, "objectAlphaAnimator");
                    ofFloat.setDuration(200);
                    break;
                } else {
                    return false;
                }
            case 1:
                float abs = Math.abs(Math.abs(motionEvent.getRawX()) - Math.abs(f63183c));
                float abs2 = Math.abs(Math.abs(motionEvent.getRawY()) - Math.abs(f63184d));
                if (((float) Math.sqrt((double) ((abs * abs) + (abs2 * abs2)))) < ((float) f63187g)) {
                    callOnClick();
                }
                View view2 = this;
                ViewParent parent = getParent();
                if (parent != null) {
                    float height = ((float) ((ViewGroup) parent).getHeight()) - this.f63194n;
                    view2.getLocationOnScreen(new int[2]);
                    float y = view2.getY();
                    float height2 = ((float) view2.getHeight()) + y;
                    if (f63181a > view2.getY()) {
                        m58143a(f63181a);
                    } else if (height - f63182b < view2.getY() + ((float) view2.getHeight())) {
                        m58143a((height - f63182b) - ((float) view2.getHeight()));
                    }
                    if (f63181a >= y) {
                        int i3 = (f63182b > height2 ? 1 : (f63182b == height2 ? 0 : -1));
                        break;
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                }
                break;
            case 2:
                float rawY2 = motionEvent.getRawY() - f63186f;
                if (getY() + rawY2 < 0.0f) {
                    rawY2 = -getY();
                } else {
                    float y2 = getY() + rawY2 + ((float) getHeight()) + this.f63194n;
                    ViewParent parent2 = getParent();
                    if (parent2 == null) {
                        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                    } else if (y2 > ((float) ((ViewGroup) parent2).getHeight())) {
                        ViewParent parent3 = getParent();
                        if (parent3 != null) {
                            rawY2 = ((((float) ((ViewGroup) parent3).getHeight()) - ((float) getHeight())) - getY()) - this.f63194n;
                        } else {
                            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                        }
                    }
                }
                setTranslationY(getTranslationY() + ((float) ((int) rawY2)));
                f63186f = motionEvent.getRawY();
                break;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e7, code lost:
        if (r7 == false) goto L_0x00ea;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23690e(android.content.Intent r7, android.content.Context r8) {
        /*
            r6 = this;
            java.lang.String r0 = "intent"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            r6.<init>(r8)
            r6.f63193m = r7
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r8)
            r0 = r6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 1
            r2 = 2132214399(0x7f17027f, float:2.0072639E38)
            android.view.View r7 = r7.inflate(r2, r0, r1)
            java.lang.String r0 = "LayoutInflater.from(cont…_back_layout, this, true)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            r6.f63189i = r7
            android.view.View r7 = r6.f63189i
            if (r7 != 0) goto L_0x002e
            java.lang.String r0 = "currentRootView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x002e:
            r0 = 2132018470(0x7f140526, float:1.9675248E38)
            android.view.View r7 = r7.findViewById(r0)
            java.lang.String r0 = "currentRootView.findView…id.deeplink_back_content)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r6.f63190j = r7
            android.widget.FrameLayout r7 = r6.f63190j
            if (r7 != 0) goto L_0x0047
            java.lang.String r0 = "currentContentView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0047:
            r0 = 2132018471(0x7f140527, float:1.967525E38)
            android.view.View r7 = r7.findViewById(r0)
            java.lang.String r0 = "currentContentView.findV…(R.id.deeplink_back_name)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r7
            r6.f63191k = r7
            android.content.Intent r7 = r6.f63193m
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r6.f63191k
            if (r0 != 0) goto L_0x0062
            java.lang.String r2 = "deeplinkBackNameView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0062:
            android.view.View r2 = r6.f63189i
            if (r2 != 0) goto L_0x006b
            java.lang.String r3 = "currentRootView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x006b:
            java.lang.String r3 = "backBtnView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r3)
            java.lang.String r3 = "contentView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r3)
            java.lang.String r3 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r3)
            r3 = 0
            if (r7 != 0) goto L_0x007e
            goto L_0x00b5
        L_0x007e:
            java.lang.String r4 = "VENDOR_BTN_NAME_FOR_INTENT_KEY"
            java.lang.String r4 = r7.getStringExtra(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x0091
            int r5 = r4.length()
            if (r5 != 0) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r5 = 0
            goto L_0x0092
        L_0x0091:
            r5 = 1
        L_0x0092:
            if (r5 != 0) goto L_0x0097
            r0.setText(r4)
        L_0x0097:
            java.lang.String r0 = "VENDOR_BACK_INTENT_FOR_INTENT_KEY"
            android.os.Parcelable r0 = r7.getParcelableExtra(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            if (r0 == 0) goto L_0x00b5
            android.content.pm.PackageManager r4 = r8.getPackageManager()
            android.content.ComponentName r4 = r0.resolveActivity(r4)
            if (r4 == 0) goto L_0x00b5
            com.ss.android.ugc.aweme.base.c$a r4 = new com.ss.android.ugc.aweme.base.c$a
            r4.<init>(r0, r8, r2, r7)
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            r2.setOnClickListener(r4)
        L_0x00b5:
            com.ss.android.ugc.aweme.base.utils.s r7 = com.p683ss.android.ugc.aweme.base.utils.C23734s.f63266a
            if (r8 == 0) goto L_0x00f9
            android.app.Activity r8 = (android.app.Activity) r8
            java.lang.String r7 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r7)
            boolean r7 = com.p683ss.android.common.util.C18920g.m46054c()
            if (r7 == 0) goto L_0x00ea
            r7 = r8
            android.content.Context r7 = (android.content.Context) r7
            if (r7 == 0) goto L_0x00e1
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r0 < r2) goto L_0x00d3
            r0 = 1
            goto L_0x00d4
        L_0x00d3:
            r0 = 0
        L_0x00d4:
            if (r0 == 0) goto L_0x00e1
            android.content.ContentResolver r7 = r7.getContentResolver()
            java.lang.String r0 = "force_fsg_nav_bar"
            int r7 = android.provider.Settings.Global.getInt(r7, r0, r3)
            goto L_0x00e2
        L_0x00e1:
            r7 = 0
        L_0x00e2:
            if (r7 != r1) goto L_0x00e6
            r7 = 1
            goto L_0x00e7
        L_0x00e6:
            r7 = 0
        L_0x00e7:
            if (r7 == 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00ea:
            r1 = 0
        L_0x00eb:
            com.p683ss.android.ugc.aweme.base.utils.C23724k.m58225c()
            if (r1 == 0) goto L_0x00f2
            r7 = 0
            goto L_0x00f6
        L_0x00f2:
            float r7 = com.p683ss.android.ugc.aweme.base.utils.C23734s.m58272a(r8)
        L_0x00f6:
            r6.f63194n = r7
            return
        L_0x00f9:
            d.u r7 = new d.u
            java.lang.String r8 = "null cannot be cast to non-null type android.app.Activity"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.C23690e.<init>(android.content.Intent, android.content.Context):void");
    }
}
