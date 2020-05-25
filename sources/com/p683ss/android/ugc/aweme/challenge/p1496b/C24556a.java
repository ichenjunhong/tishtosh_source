package com.p683ss.android.ugc.aweme.challenge.p1496b;

import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.b.a */
public final class C24556a {

    /* renamed from: a */
    public static final C24556a f65013a = new C24556a();

    private C24556a() {
    }

    /* renamed from: a */
    public static C24557b m59970a(TextView textView, CharSequence charSequence) {
        C52711k.m112240b(textView, "protoView");
        C52711k.m112240b(charSequence, "text");
        if (textView.getWidth() <= 0) {
            C24557b bVar = new C24557b(null, null, null, 7, null);
            return bVar;
        }
        DmtTextView dmtTextView = new DmtTextView(textView.getContext());
        dmtTextView.setTextSize(0, textView.getTextSize());
        dmtTextView.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
        dmtTextView.setTypeface(textView.getTypeface());
        dmtTextView.setIncludeFontPadding(textView.getIncludeFontPadding());
        dmtTextView.setText(charSequence);
        dmtTextView.measure(MeasureSpec.makeMeasureSpec(textView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
        return new C24557b(Integer.valueOf(dmtTextView.getMeasuredWidth()), Integer.valueOf(dmtTextView.getMeasuredHeight()), Integer.valueOf(dmtTextView.getLineCount()));
    }
}
