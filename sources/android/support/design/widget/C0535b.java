package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior.C0497a;
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
import android.view.Window;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.design.widget.b */
public class C0535b extends C1164e {

    /* renamed from: a */
    boolean f1876a;

    /* renamed from: b */
    boolean f1877b;

    /* renamed from: c */
    boolean f1878c;

    /* renamed from: d */
    private BottomSheetBehavior<FrameLayout> f1879d;

    /* renamed from: e */
    private C0497a f1880e;

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (this.f1879d != null && this.f1879d.f1640k == 5) {
            this.f1879d.mo1301b(4);
        }
    }

    public void setContentView(int i) {
        super.setContentView(m1450a(i, null, null));
    }

    public void onCreate(Bundle bundle) {
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

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f1876a != z) {
            this.f1876a = z;
            if (this.f1879d != null) {
                this.f1879d.f1638i = z;
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f1876a) {
            this.f1876a = true;
        }
        this.f1877b = z;
        this.f1878c = true;
    }

    public void setContentView(View view) {
        super.setContentView(m1450a(0, view, null));
    }

    public C0535b(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(R.attr.ct, typedValue, true)) {
                i = typedValue.resourceId;
            } else {
                i = R.style.n4;
            }
        }
        super(context, i);
        this.f1876a = true;
        this.f1877b = true;
        this.f1880e = new C0497a() {
            /* renamed from: a */
            public final void mo1315a(View view, float f) {
            }

            /* renamed from: a */
            public final void mo1316a(View view, int i) {
                if (i == 5) {
                    C0535b.this.cancel();
                }
            }
        };
        mo3778b(1);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(m1450a(0, view, layoutParams));
    }

    /* renamed from: a */
    private View m1450a(int i, View view, LayoutParams layoutParams) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.j1, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(R.id.a0g);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(R.id.a4q);
        this.f1879d = BottomSheetBehavior.m1227a(frameLayout2);
        this.f1879d.f1646q = this.f1880e;
        this.f1879d.f1638i = this.f1876a;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.d3x).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (C0535b.this.f1876a && C0535b.this.isShowing()) {
                    C0535b bVar = C0535b.this;
                    if (!bVar.f1878c) {
                        TypedArray obtainStyledAttributes = bVar.getContext().obtainStyledAttributes(new int[]{16843611});
                        bVar.f1877b = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        bVar.f1878c = true;
                    }
                    if (bVar.f1877b) {
                        C0535b.this.cancel();
                    }
                }
            }
        });
        C1056u.m3031a((View) frameLayout2, (C1002a) new C1002a() {
            /* renamed from: a */
            public final void mo1119a(View view, C1008c cVar) {
                super.mo1119a(view, cVar);
                if (C0535b.this.f1876a) {
                    cVar.mo3130a(1048576);
                    cVar.mo3166k(true);
                    return;
                }
                cVar.mo3166k(false);
            }

            /* renamed from: a */
            public final boolean mo1246a(View view, int i, Bundle bundle) {
                if (i != 1048576 || !C0535b.this.f1876a) {
                    return super.mo1246a(view, i, bundle);
                }
                C0535b.this.cancel();
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
