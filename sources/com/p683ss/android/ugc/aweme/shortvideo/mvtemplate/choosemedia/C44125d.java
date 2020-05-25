package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.view.View;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.d */
public final class C44125d extends ProgressDialog {

    /* renamed from: a */
    CharSequence f111784a;

    /* renamed from: b */
    Drawable f111785b;

    /* renamed from: c */
    private boolean f111786c;

    /* renamed from: d */
    private AnimationImageView f111787d;

    public final void dismiss() {
        if (this.f111787d.mo6660e()) {
            this.f111787d.mo6661f();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public final void setMessage(CharSequence charSequence) {
        super.setMessage(charSequence);
        if (this.f111786c) {
            TextView textView = (TextView) findViewById(R.id.bld);
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
        this.f111784a = charSequence;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.a25);
        this.f111786c = true;
        this.f111787d = (AnimationImageView) findViewById(R.id.fk);
        setMessage(this.f111784a);
        setIndeterminate(false);
        if (this.f111785b != null) {
            Drawable drawable = this.f111785b;
            if (this.f111786c) {
                View findViewById = findViewById(R.id.cfc);
                if (findViewById != null) {
                    findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, C0726c.m2091a(getContext(), (int) R.drawable.h1)}));
                }
            }
            this.f111785b = drawable;
        }
    }

    private C44125d(Context context, int i) {
        super(context, 3);
    }

    /* renamed from: a */
    public static C44125d m96772a(Context context, String str, String str2) {
        C44125d dVar = new C44125d(context, 3);
        dVar.setCancelable(false);
        dVar.setIndeterminate(false);
        dVar.setMax(100);
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            dVar.show();
        }
        dVar.setMessage(str);
        dVar.f111787d.setAnimation(str2);
        dVar.f111787d.mo6654b();
        dVar.f111787d.mo6658c(true);
        return dVar;
    }
}
