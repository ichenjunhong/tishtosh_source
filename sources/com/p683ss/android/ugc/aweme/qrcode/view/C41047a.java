package com.p683ss.android.ugc.aweme.qrcode.view;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.view.a */
public final class C41047a extends ProgressDialog {

    /* renamed from: a */
    CharSequence f104370a;

    /* renamed from: b */
    Drawable f104371b;

    /* renamed from: c */
    private boolean f104372c;

    /* renamed from: d */
    private ImageView f104373d;

    /* renamed from: e */
    private ImageView f104374e;

    /* renamed from: b */
    public final void mo83564b() {
        this.f104373d.setVisibility(4);
        this.f104374e.setVisibility(0);
    }

    public final void dismiss() {
        if (this.f104373d != null) {
            this.f104373d.clearAnimation();
        }
        super.dismiss();
    }

    public final void onBackPressed() {
        super.onBackPressed();
        if (isShowing()) {
            dismiss();
        }
    }

    /* renamed from: a */
    public final void mo83562a() {
        if (this.f104373d != null) {
            this.f104373d.clearAnimation();
            ((AnimationDrawable) this.f104373d.getDrawable()).start();
        }
    }

    public final void setMessage(CharSequence charSequence) {
        super.setMessage(charSequence);
        if (this.f104372c) {
            TextView textView = (TextView) findViewById(R.id.bld);
            if (textView != null) {
                if (TextUtils.isEmpty(charSequence)) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    textView.setText(charSequence);
                }
            }
        }
        this.f104370a = charSequence;
    }

    /* renamed from: a */
    public final void mo83563a(Drawable drawable) {
        if (this.f104372c) {
            View findViewById = findViewById(R.id.cfc);
            if (findViewById != null) {
                findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, C0726c.m2091a(getContext(), (int) R.drawable.dhm)}));
            }
        }
        this.f104371b = drawable;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bl0);
        this.f104372c = true;
        this.f104373d = (ImageView) findViewById(R.id.fk);
        this.f104374e = (ImageView) findViewById(R.id.a6w);
        LayoutParams attributes = getWindow().getAttributes();
        attributes.dimAmount = 0.0f;
        getWindow().setAttributes(attributes);
        setMessage(this.f104370a);
        setIndeterminate(false);
        if (this.f104371b != null) {
            mo83563a(this.f104371b);
        }
    }

    private C41047a(Context context, int i) {
        super(context, 3);
    }

    /* renamed from: a */
    public static C41047a m90709a(Context context, String str) {
        C41047a aVar = new C41047a(context, 3);
        aVar.setCancelable(false);
        aVar.setIndeterminate(false);
        aVar.setMax(100);
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            try {
                aVar.show();
            } catch (Exception unused) {
            }
        }
        aVar.setMessage(str);
        aVar.mo83562a();
        return aVar;
    }
}
