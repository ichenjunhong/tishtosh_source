package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.p030v4.view.C1002a;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.p041a.C1008c;
import android.support.p043v7.app.C1164e;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior.C44608a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.c */
public final class C44614c extends C1164e {

    /* renamed from: a */
    boolean f112872a;

    /* renamed from: b */
    boolean f112873b;

    /* renamed from: c */
    boolean f112874c;

    /* renamed from: d */
    private ViewPagerBottomSheetBehavior<FrameLayout> f112875d;

    /* renamed from: e */
    private C44608a f112876e;

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        if (this.f112875d != null) {
            ViewPagerBottomSheetBehavior<FrameLayout> viewPagerBottomSheetBehavior = this.f112875d;
            if (4 != viewPagerBottomSheetBehavior.f112844f) {
                if (viewPagerBottomSheetBehavior.f112847i == null) {
                    viewPagerBottomSheetBehavior.f112844f = 4;
                    return;
                }
                View view = (View) viewPagerBottomSheetBehavior.f112847i.get();
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !C1056u.m3018B(view)) {
                        viewPagerBottomSheetBehavior.mo90554a(view, 4);
                    } else {
                        view.post(new Runnable(view, 4) {

                            /* renamed from: a */
                            final /* synthetic */ View f112861a;

                            /* renamed from: b */
                            final /* synthetic */ int f112862b;

                            public final void run() {
                                ViewPagerBottomSheetBehavior.this.mo90554a(this.f112861a, this.f112862b);
                            }

                            {
                                this.f112861a = r2;
                                this.f112862b = r3;
                            }
                        });
                    }
                }
            }
        }
    }

    public final void setContentView(int i) {
        super.setContentView(m97587a(i, null, null));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(DynamicTabYellowPointVersion.DEFAULT);
            }
            window.setLayout(-1, -1);
        }
    }

    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f112872a != z) {
            this.f112872a = z;
            if (this.f112875d != null) {
                this.f112875d.f112842d = z;
            }
        }
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f112872a) {
            this.f112872a = true;
        }
        this.f112873b = z;
        this.f112874c = true;
    }

    public final void setContentView(View view) {
        super.setContentView(m97587a(0, view, null));
    }

    public C44614c(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(R.attr.ct, typedValue, true)) {
                i = typedValue.resourceId;
            } else {
                i = R.style.n4;
            }
        }
        super(context, i);
        this.f112872a = true;
        this.f112873b = true;
        this.f112876e = new C44608a() {
            /* renamed from: a */
            public final void mo90561a(View view, int i) {
                if (i == 5) {
                    C44614c.this.cancel();
                }
            }
        };
        mo3778b(1);
    }

    public final void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(m97587a(0, view, layoutParams));
    }

    /* renamed from: a */
    private View m97587a(int i, View view, LayoutParams layoutParams) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.jd, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(R.id.a0g);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(R.id.a4q);
        this.f112875d = ViewPagerBottomSheetBehavior.m97563b(frameLayout2);
        this.f112875d.f112849k = this.f112876e;
        this.f112875d.f112842d = this.f112872a;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.d3x).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C44614c.this.f112872a && C44614c.this.isShowing()) {
                    C44614c cVar = C44614c.this;
                    if (!cVar.f112874c) {
                        if (VERSION.SDK_INT < 11) {
                            cVar.f112873b = true;
                        } else {
                            TypedArray obtainStyledAttributes = cVar.getContext().obtainStyledAttributes(new int[]{16843611});
                            cVar.f112873b = obtainStyledAttributes.getBoolean(0, true);
                            obtainStyledAttributes.recycle();
                        }
                        cVar.f112874c = true;
                    }
                    if (cVar.f112873b) {
                        C44614c.this.cancel();
                    }
                }
            }
        });
        C1056u.m3031a((View) frameLayout2, (C1002a) new C1002a() {
            /* renamed from: a */
            public final void mo1119a(View view, C1008c cVar) {
                super.mo1119a(view, cVar);
                if (C44614c.this.f112872a) {
                    cVar.mo3130a(1048576);
                    cVar.mo3166k(true);
                    return;
                }
                cVar.mo3166k(false);
            }

            /* renamed from: a */
            public final boolean mo1246a(View view, int i, Bundle bundle) {
                if (i != 1048576 || !C44614c.this.f112872a) {
                    return super.mo1246a(view, i, bundle);
                }
                C44614c.this.cancel();
                return true;
            }
        });
        frameLayout2.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        return frameLayout;
    }
}
