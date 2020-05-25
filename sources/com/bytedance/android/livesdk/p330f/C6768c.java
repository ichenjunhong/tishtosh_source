package com.bytedance.android.livesdk.p330f;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.f.c */
public class C6768c extends Dialog {

    /* renamed from: a */
    private OnShowListener f18539a;

    /* renamed from: b */
    private OnDismissListener f18540b;

    /* renamed from: g */
    protected boolean f18541g;

    /* renamed from: h */
    OnShowListener f18542h;

    /* renamed from: i */
    OnDismissListener f18543i;

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            if (this.f18541g) {
                window.setLayout(-1, -2);
                return;
            }
            window.setLayout(-2, -1);
        }
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        if (onDismissListener == this.f18540b) {
            super.setOnDismissListener(onDismissListener);
        } else {
            this.f18543i = onDismissListener;
        }
    }

    public void setOnShowListener(OnShowListener onShowListener) {
        if (onShowListener == this.f18539a) {
            super.setOnShowListener(onShowListener);
        } else {
            this.f18542h = onShowListener;
        }
    }

    public C6768c(Context context, boolean z) {
        int i;
        if (z) {
            i = R.style.xy;
        } else {
            i = R.style.xz;
        }
        super(context, i);
        this.f18539a = new C6769d(this);
        this.f18540b = new C6770e(this);
        Window window = getWindow();
        if (window != null) {
            getWindow().requestFeature(1);
            if (z) {
                window.setGravity(80);
            } else {
                window.setGravity(8388613);
            }
        }
        this.f18541g = z;
        setOnShowListener(this.f18539a);
        setOnDismissListener(this.f18540b);
    }
}
