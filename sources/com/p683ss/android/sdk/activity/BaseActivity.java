package com.p683ss.android.sdk.activity;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout.C11118a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.sdk.activity.BaseActivity */
public class BaseActivity extends SSActivity {

    /* renamed from: a */
    protected int f54314a;

    /* renamed from: b */
    protected int f54315b;

    /* renamed from: c */
    protected View f54316c;

    /* renamed from: d */
    protected View f54317d;

    /* renamed from: e */
    protected TextView f54318e;

    /* renamed from: f */
    protected TextView f54319f;

    /* renamed from: g */
    protected TextView f54320g;

    /* renamed from: h */
    protected ProgressBar f54321h;

    /* renamed from: i */
    protected View f54322i;

    /* renamed from: j */
    protected SwipeOverlayFrameLayout f54323j;

    public void onResume() {
        super.onResume();
    }

    public void setTitle(CharSequence charSequence) {
        if (this.f54320g != null) {
            this.f54320g.setText(charSequence);
        }
    }

    public void onCreate(Bundle bundle) {
        this.f54315b = 0;
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView((int) R.layout.bku);
        this.f54314a = 0;
        if (!(this.f54314a == 1 || this.f54314a == 2)) {
            this.f54314a = 0;
        }
        this.f54316c = findViewById(R.id.cfl);
        this.f54317d = findViewById(R.id.d10);
        this.f54322i = findViewById(R.id.bqw);
        if (this.f54317d != null) {
            this.f54318e = (TextView) this.f54317d.findViewById(R.id.ij);
            this.f54319f = (TextView) this.f54317d.findViewById(R.id.ccu);
            this.f54320g = (TextView) this.f54317d.findViewById(R.id.title);
            this.f54321h = (ProgressBar) this.f54317d.findViewById(R.id.ccq);
        }
        if (this.f54318e != null) {
            TextView textView = this.f54318e;
            if (VERSION.SDK_INT >= 19) {
                Drawable background = textView.getBackground();
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
                if (background != null) {
                    background.setAutoMirrored(true);
                }
                for (Drawable drawable : compoundDrawables) {
                    if (drawable != null) {
                        drawable.setAutoMirrored(true);
                    }
                }
                for (Drawable drawable2 : compoundDrawablesRelative) {
                    if (drawable2 != null) {
                        drawable2.setAutoMirrored(true);
                    }
                }
            }
            this.f54318e.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    BaseActivity.this.onBackPressed();
                }
            });
        }
        View findViewById = findViewById(R.id.cvu);
        if (findViewById != null && (findViewById instanceof SwipeOverlayFrameLayout)) {
            this.f54323j = (SwipeOverlayFrameLayout) findViewById;
        }
        if (this.f54323j != null) {
            this.f54323j.setOnSwipeListener(new C11118a() {
                /* renamed from: a */
                public final boolean mo20219a() {
                    return false;
                }

                /* renamed from: b */
                public final boolean mo20220b() {
                    BaseActivity.this.onBackPressed();
                    return true;
                }
            });
        }
    }
}
