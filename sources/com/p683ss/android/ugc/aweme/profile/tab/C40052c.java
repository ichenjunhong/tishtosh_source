package com.p683ss.android.ugc.aweme.profile.tab;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.tab.c */
public final class C40052c extends MusProfileTabView {

    /* renamed from: a */
    public TextView f102037a;

    /* renamed from: b */
    private TextView f102038b;

    /* renamed from: c */
    private ValueAnimator f102039c;

    /* renamed from: d */
    private ValueAnimator f102040d;

    /* renamed from: e */
    private boolean f102041e;

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f102038b = (TextView) findViewById(R.id.title);
        this.f102037a = (TextView) findViewById(R.id.a4m);
    }

    public final void setAnimationEnabled(boolean z) {
        this.f102041e = z;
    }

    public final void setDescription(String str) {
        this.f102037a.setText(str);
    }

    public final void setText(String str) {
        this.f102038b.setText(str);
    }

    public final void setSelected(boolean z) {
        super.setSelected(z);
        this.f102039c.cancel();
        this.f102040d.cancel();
        if (z) {
            if (this.f102041e) {
                this.f102037a.setVisibility(0);
                this.f102039c.start();
            }
        } else if (this.f102041e) {
            this.f102040d.start();
        }
    }
}
