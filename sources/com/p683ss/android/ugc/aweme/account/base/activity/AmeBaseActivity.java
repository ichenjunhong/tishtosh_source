package com.p683ss.android.ugc.aweme.account.base.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout.C11118a;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.base.activity.AmeBaseActivity */
public abstract class AmeBaseActivity extends AmeSSActivity {

    /* renamed from: a */
    protected int f56908a;

    /* renamed from: b */
    protected int f56909b;

    /* renamed from: c */
    protected View f56910c;

    /* renamed from: d */
    protected View f56911d;

    /* renamed from: e */
    public TextView f56912e;

    /* renamed from: f */
    public TextView f56913f;

    /* renamed from: g */
    public TextView f56914g;

    /* renamed from: h */
    protected ProgressBar f56915h;

    /* renamed from: i */
    protected View f56916i;

    /* renamed from: j */
    protected SwipeOverlayFrameLayout f56917j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo44778a() {
        return R.layout.ayp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo44878c() {
        this.f56908a = 0;
        if (!(this.f56908a == 1 || this.f56908a == 2)) {
            this.f56908a = 0;
        }
        this.f56910c = findViewById(R.id.cfl);
        this.f56911d = findViewById(R.id.d10);
        this.f56916i = findViewById(R.id.bqw);
        if (this.f56911d != null) {
            this.f56912e = (TextView) this.f56911d.findViewById(R.id.ij);
            this.f56913f = (TextView) this.f56911d.findViewById(R.id.ccu);
            this.f56914g = (TextView) this.f56911d.findViewById(R.id.title);
            this.f56915h = (ProgressBar) this.f56911d.findViewById(R.id.ccq);
        }
        if (this.f56912e != null) {
            this.f56912e.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    AmeBaseActivity.this.onBackPressed();
                }
            });
        }
        View findViewById = findViewById(R.id.cvu);
        if (findViewById != null && (findViewById instanceof SwipeOverlayFrameLayout)) {
            this.f56917j = (SwipeOverlayFrameLayout) findViewById;
        }
        if (this.f56917j != null) {
            this.f56917j.setOnSwipeListener(new C11118a() {
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

    public void setTitle(CharSequence charSequence) {
        if (this.f56914g != null) {
            this.f56914g.setText(charSequence);
        }
    }

    public void onCreate(Bundle bundle) {
        this.f56909b = 0;
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(mo44778a());
        mo44878c();
    }
}
