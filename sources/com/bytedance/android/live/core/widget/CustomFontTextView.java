package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.live.core.p224c.C3831a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

public class CustomFontTextView extends LiveTextView {

    /* renamed from: d */
    private C1690c f11285d;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f11285d != null) {
            this.f11285d.dispose();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (f11291b != null) {
                this.f11285d = f11291b.mo9254b().mo6152a((C1710e<? super T>) new C4106c<Object>(this), C4107d.f11300a);
            }
        } catch (Throwable th) {
            C3831a.m9714b("font_text_view", th);
        }
    }

    public CustomFontTextView(Context context) {
        super(context);
    }

    public CustomFontTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomFontTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
