package com.p683ss.android.ugc.aweme.account.login;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.base.SSActivity;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout.C11118a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.BaseActivity */
public class BaseActivity extends SSActivity {

    /* renamed from: b */
    protected int f57158b;

    /* renamed from: c */
    protected int f57159c;

    /* renamed from: d */
    protected View f57160d;

    /* renamed from: e */
    protected View f57161e;

    /* renamed from: f */
    public TextView f57162f;

    /* renamed from: g */
    public TextView f57163g;

    /* renamed from: h */
    public TextView f57164h;

    /* renamed from: i */
    protected ProgressBar f57165i;

    /* renamed from: j */
    protected View f57166j;

    /* renamed from: k */
    protected SwipeOverlayFrameLayout f57167k;

    /* access modifiers changed from: protected */
    public int ag_() {
        return R.layout.ayp;
    }

    /* access modifiers changed from: protected */
    public void ah_() {
        this.f57158b = 0;
        if (!(this.f57158b == 1 || this.f57158b == 2)) {
            this.f57158b = 0;
        }
        this.f57160d = findViewById(R.id.cfl);
        this.f57161e = findViewById(R.id.d10);
        this.f57166j = findViewById(R.id.bqw);
        if (this.f57161e != null) {
            this.f57162f = (TextView) this.f57161e.findViewById(R.id.ij);
            this.f57163g = (TextView) this.f57161e.findViewById(R.id.ccu);
            this.f57164h = (TextView) this.f57161e.findViewById(R.id.title);
            this.f57165i = (ProgressBar) this.f57161e.findViewById(R.id.ccq);
        }
        if (this.f57162f != null) {
            TextView textView = this.f57162f;
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
            this.f57162f.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    BaseActivity.this.onBackPressed();
                }
            });
        }
        View findViewById = findViewById(R.id.cvu);
        if (findViewById != null && (findViewById instanceof SwipeOverlayFrameLayout)) {
            this.f57167k = (SwipeOverlayFrameLayout) findViewById;
        }
        if (this.f57167k != null) {
            this.f57167k.setOnSwipeListener(new C11118a() {
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

    public void setTitle(CharSequence charSequence) {
        if (this.f57164h != null) {
            this.f57164h.setText(charSequence);
        }
    }

    public void onCreate(Bundle bundle) {
        this.f57159c = 0;
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(ag_());
        ah_();
    }
}
