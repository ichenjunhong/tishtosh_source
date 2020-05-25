package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.C0497a;
import android.support.design.widget.C0535b;
import android.support.design.widget.CoordinatorLayout;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.k */
public final class C31013k extends C0535b {

    /* renamed from: d */
    Activity f81207d;

    /* renamed from: e */
    C30313ae<C30332aw> f81208e;

    /* renamed from: f */
    public Aweme f81209f;

    /* renamed from: g */
    CoordinatorLayout f81210g;

    /* renamed from: h */
    private String f81211h;

    /* renamed from: i */
    private int f81212i;

    public final void cancel() {
        dismiss();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView((int) R.layout.bkt);
        this.f81210g = (CoordinatorLayout) findViewById(R.id.cfg);
        findViewById(R.id.a47).setOnClickListener(new C31016l(this));
        findViewById(R.id.q7).setOnClickListener(new C31038m(this));
        Activity ownerActivity = getOwnerActivity();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ownerActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.heightPixels;
        Resources resources = getContext().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = resources.getDimensionPixelSize(identifier);
        } else {
            i = 0;
        }
        int i3 = i2 - i;
        Window window = getWindow();
        if (window != null) {
            if (i3 == 0) {
                i3 = -1;
            }
            window.setLayout(-1, i3);
            final BottomSheetBehavior a = BottomSheetBehavior.m1227a((View) this.f81210g.getParent());
            if (a != null) {
                a.f1646q = new C0497a() {
                    /* renamed from: a */
                    public final void mo1315a(View view, float f) {
                    }

                    /* renamed from: a */
                    public final void mo1316a(View view, int i) {
                        if (i == 5) {
                            C31013k.this.dismiss();
                            a.mo1301b(4);
                        }
                    }
                };
            }
            window.setGravity(80);
            LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
            setCanceledOnTouchOutside(true);
        }
    }

    public C31013k(Activity activity, C30313ae<C30332aw> aeVar, String str, int i) {
        super(activity, R.style.a6r);
        this.f81207d = activity;
        setOwnerActivity(activity);
        this.f81208e = aeVar;
        this.f81211h = str;
        this.f81212i = i;
    }
}
