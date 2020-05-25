package com.p683ss.android.ugc.aweme.account.login.view;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.account.views.AutoRTLTextView;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.account.login.view.AutoLinefeedTextView */
public final class AutoLinefeedTextView extends AutoRTLTextView {

    /* renamed from: com.ss.android.ugc.aweme.account.login.view.AutoLinefeedTextView$a */
    static final class C22022a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AutoLinefeedTextView f59500a;

        /* renamed from: b */
        final /* synthetic */ String f59501b;

        C22022a(AutoLinefeedTextView autoLinefeedTextView, String str) {
            this.f59500a = autoLinefeedTextView;
            this.f59501b = str;
        }

        public final void run() {
            boolean z;
            CharSequence charSequence = this.f59501b;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && this.f59500a.getMeasuredWidth() != 0 && this.f59500a.getMeasuredHeight() != 0) {
                CharSequence text = this.f59500a.getText();
                C52711k.m112236a((Object) text, "text");
                int a = C52830p.m112419a(text, this.f59501b, 0, false, 6, (Object) null);
                if (a != -1) {
                    int length = (this.f59501b.length() + a) - 1;
                    TextPaint paint = this.f59500a.getPaint();
                    CharSequence text2 = this.f59500a.getText();
                    C52711k.m112236a((Object) text2, "text");
                    int measureText = (int) paint.measureText(text2.subSequence(0, a + 2).toString());
                    TextPaint paint2 = this.f59500a.getPaint();
                    CharSequence text3 = this.f59500a.getText();
                    C52711k.m112236a((Object) text3, "text");
                    if (measureText / this.f59500a.getMeasuredWidth() != ((int) paint2.measureText(text3.subSequence(0, length + 1).toString())) / this.f59500a.getMeasuredWidth()) {
                        this.f59500a.setText(new StringBuffer(this.f59500a.getText().toString()).insert(a, "\n").toString());
                    }
                }
            }
        }
    }

    public AutoLinefeedTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AutoLinefeedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo46080a(String str, String str2) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            setText(charSequence);
            post(new C22022a(this, str2));
        }
    }

    public AutoLinefeedTextView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ AutoLinefeedTextView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 16842884;
        }
        this(context, attributeSet, i);
    }
}
