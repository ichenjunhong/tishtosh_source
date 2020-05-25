package com.p683ss.android.ugc.aweme.base.activity;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout.C11118a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.activity.AmeBaseActivity */
public abstract class AmeBaseActivity extends AmeSSActivity {

    /* renamed from: g */
    protected int f62455g;

    /* renamed from: h */
    protected int f62456h;

    /* renamed from: i */
    protected boolean f62457i;

    /* renamed from: j */
    protected View f62458j;

    /* renamed from: k */
    protected View f62459k;

    /* renamed from: l */
    protected TextView f62460l;

    /* renamed from: m */
    public TextView f62461m;

    /* renamed from: n */
    protected TextView f62462n;

    /* renamed from: o */
    protected ProgressBar f62463o;

    /* renamed from: p */
    protected View f62464p;

    /* renamed from: q */
    protected SwipeOverlayFrameLayout f62465q;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo46324a() {
        return R.layout.bku;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo48540h() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo48541i() {
        return R.color.kp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo48542j() {
        onBackPressed();
    }

    public void onResume() {
        super.onResume();
        if (this.f62457i) {
            this.f62457i = false;
            mo48543k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo46325b() {
        this.f62455g = mo48540h();
        if (!(this.f62455g == 1 || this.f62455g == 2)) {
            this.f62455g = 0;
        }
        this.f62458j = findViewById(R.id.cfl);
        this.f62459k = findViewById(R.id.d10);
        this.f62464p = findViewById(R.id.bqw);
        if (this.f62459k != null) {
            this.f62460l = (TextView) this.f62459k.findViewById(R.id.ij);
            this.f62461m = (TextView) this.f62459k.findViewById(R.id.ccu);
            this.f62462n = (TextView) this.f62459k.findViewById(R.id.title);
            this.f62463o = (ProgressBar) this.f62459k.findViewById(R.id.ccq);
        }
        if (this.f62460l != null) {
            this.f62460l.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    AmeBaseActivity.this.mo48542j();
                }
            });
        }
        View findViewById = findViewById(R.id.cvu);
        if (findViewById != null && (findViewById instanceof SwipeOverlayFrameLayout)) {
            this.f62465q = (SwipeOverlayFrameLayout) findViewById;
        }
        if (this.f62465q != null) {
            this.f62465q.setOnSwipeListener(new C11118a() {
                /* renamed from: a */
                public final boolean mo20219a() {
                    return false;
                }

                /* renamed from: b */
                public final boolean mo20220b() {
                    AmeBaseActivity.this.onBackPressed();
                    return true;
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo48543k() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f62455g != 1) {
            if (this.f62455g == 2) {
                if (this.f62464p != null) {
                    if (this.f62457i) {
                        this.f62464p.setVisibility(0);
                        return;
                    }
                    this.f62464p.setVisibility(8);
                }
                return;
            }
            Resources resources = getResources();
            boolean z = this.f62457i;
            if (z) {
                i = R.color.kq;
            } else {
                i = mo48541i();
            }
            if (z) {
                i2 = R.drawable.dea;
            } else {
                i2 = R.drawable.de_;
            }
            if (z) {
                i3 = R.color.a8o;
            } else {
                i3 = R.color.a8n;
            }
            if (z) {
                i4 = R.drawable.dej;
            } else {
                i4 = R.drawable.dei;
            }
            if (z) {
                i5 = R.drawable.ded;
            } else {
                i5 = R.drawable.dec;
            }
            if (z) {
                i6 = R.color.azt;
            } else {
                i6 = R.color.azs;
            }
            ColorStateList colorStateList = resources.getColorStateList(i6);
            if (this.f62458j != null) {
                this.f62458j.setBackgroundResource(i);
            }
            if (this.f62462n != null) {
                this.f62462n.setTextColor(resources.getColor(i3));
            }
            if (this.f62459k != null) {
                this.f62459k.setBackgroundResource(i2);
            }
            if (this.f62460l != null) {
                C9432q.m18678a((View) this.f62460l, i4);
                this.f62460l.setTextColor(colorStateList);
                this.f62460l.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                this.f62460l.setCompoundDrawablesWithIntrinsicBounds(i5, 0, 0, 0);
            }
            if (this.f62461m != null) {
                C9432q.m18678a((View) this.f62461m, i4);
                this.f62461m.setTextColor(colorStateList);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (this.f62462n != null) {
            this.f62462n.setText(charSequence);
        }
    }

    public void onCreate(Bundle bundle) {
        this.f62456h = 0;
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(mo46324a());
        mo46325b();
    }
}
