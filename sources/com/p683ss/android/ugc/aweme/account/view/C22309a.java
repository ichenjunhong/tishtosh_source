package com.p683ss.android.ugc.aweme.account.view;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.view.a */
public class C22309a extends Dialog {

    /* renamed from: a */
    private LinearLayout f60100a;

    /* renamed from: b */
    private String f60101b;

    public void dismiss() {
        super.dismiss();
    }

    public void show() {
        super.show();
        ObjectAnimator.ofFloat(this.f60100a, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
    }

    public C22309a(Context context) {
        super(context, R.style.a25);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ayh);
        this.f60100a = (LinearLayout) findViewById(R.id.e53);
        DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.e52);
        ((ProgressBar) findViewById(R.id.e54)).getIndeterminateDrawable().setColorFilter(C0726c.m2098c(getContext(), R.color.w2), Mode.MULTIPLY);
        setCanceledOnTouchOutside(false);
        boolean z = !TextUtils.isEmpty(this.f60101b);
        if (dmtTextView != null) {
            if (z) {
                dmtTextView.setVisibility(0);
                dmtTextView.setText(this.f60101b);
                return;
            }
            dmtTextView.setVisibility(8);
        }
    }

    public C22309a(Context context, String str) {
        this(context);
        this.f60101b = str;
    }
}
