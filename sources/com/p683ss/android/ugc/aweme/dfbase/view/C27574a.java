package com.p683ss.android.ugc.aweme.dfbase.view;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.dfbase.view.a */
public final class C27574a extends ProgressDialog {

    /* renamed from: a */
    public boolean f72490a = true;

    /* renamed from: b */
    public Activity f72491b;

    /* renamed from: c */
    private boolean f72492c;

    /* renamed from: d */
    private CharSequence f72493d;

    /* renamed from: e */
    private Drawable f72494e;

    /* renamed from: f */
    private int f72495f;

    public final void setMessage(CharSequence charSequence) {
        super.setMessage(charSequence);
        if (this.f72492c) {
            TextView textView = (TextView) findViewById(R.id.bld);
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
        this.f72493d = charSequence;
    }

    public final void setIndeterminate(boolean z) {
        int i;
        super.setIndeterminate(z);
        if (this.f72492c) {
            DFCircularProgressView dFCircularProgressView = (DFCircularProgressView) findViewById(R.id.b25);
            if (dFCircularProgressView != null) {
                dFCircularProgressView.setIndeterminate(z);
            }
            TextView textView = (TextView) findViewById(R.id.c62);
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
    }

    public final void setProgress(int i) {
        super.setProgress(i);
        if (this.f72492c) {
            TextView textView = (TextView) findViewById(R.id.c62);
            if (textView != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("%");
                textView.setText(sb.toString());
            }
            DFCircularProgressView dFCircularProgressView = (DFCircularProgressView) findViewById(R.id.b25);
            if (dFCircularProgressView != null) {
                dFCircularProgressView.setProgress((float) i);
            }
        }
        this.f72495f = i;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.a6e);
        this.f72492c = true;
        setMessage(this.f72493d);
        setIndeterminate(false);
        setProgress(this.f72495f);
        if (this.f72494e != null) {
            Drawable drawable = this.f72494e;
            if (this.f72492c) {
                View findViewById = findViewById(R.id.cfc);
                if (findViewById != null) {
                    findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, C0726c.m2091a(getContext(), (int) R.drawable.ns)}));
                }
            }
            this.f72494e = drawable;
        }
    }

    public C27574a(Context context, int i) {
        super(context, 3);
        if (context instanceof Activity) {
            this.f72491b = (Activity) context;
        }
    }
}
