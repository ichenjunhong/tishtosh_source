package com.p683ss.android.ugc.tools.view.p2513f;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.tools.view.f.d */
public final class C50238d {
    /* renamed from: a */
    public static final void m108426a(TextView textView, AttributeSet attributeSet) {
        int i;
        C52711k.m112240b(textView, "$this$initFontByAttributeSet");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ab9, R.attr.ab_, R.attr.aba});
            i = obtainStyledAttributes.getInt(0, DynamicTabYellowPointVersion.DEFAULT);
            obtainStyledAttributes.recycle();
        } else {
            i = DynamicTabYellowPointVersion.DEFAULT;
        }
        Typeface typeface = null;
        if (i != Integer.MIN_VALUE) {
            C50236b bVar = C50237c.f125848a;
            if (bVar != null) {
                typeface = bVar.mo58561a(i);
            }
        } else {
            C52670a<? extends Typeface> aVar = C50237c.f125849b;
            if (aVar != null) {
                typeface = (Typeface) aVar.invoke();
            }
        }
        if (attributeSet != null) {
            if (typeface != null) {
                TypedArray obtainStyledAttributes2 = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ab9, R.attr.ab_, R.attr.aba});
                boolean z = obtainStyledAttributes2.getBoolean(2, false);
                obtainStyledAttributes2.recycle();
                if (z) {
                    textView.setIncludeFontPadding(true);
                }
            }
            if (typeface == null) {
                TypedArray obtainStyledAttributes3 = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ab9, R.attr.ab_, R.attr.aba});
                boolean z2 = obtainStyledAttributes3.getBoolean(1, false);
                obtainStyledAttributes3.recycle();
                if (!z2) {
                    textView.setIncludeFontPadding(true);
                }
            }
        }
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
    }
}
