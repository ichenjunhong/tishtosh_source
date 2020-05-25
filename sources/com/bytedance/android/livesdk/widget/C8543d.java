package com.bytedance.android.livesdk.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.widget.d */
public abstract class C8543d extends Dialog {

    /* renamed from: g */
    protected boolean f23427g;

    /* renamed from: a */
    public abstract int mo8344a();

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23427g = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23427g = false;
    }

    public C8543d(Context context) {
        super(context, R.style.yl);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(mo8344a(), null));
        if (getWindow() != null) {
            getWindow().setLayout(-1, -2);
            getWindow().setGravity(80);
        }
    }
}
