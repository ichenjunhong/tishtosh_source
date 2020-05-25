package com.p683ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.SearchCorrectTextView */
public class SearchCorrectTextView extends DmtTextView {

    /* renamed from: b */
    private String f75857b;

    /* renamed from: c */
    private String f75858c;

    /* renamed from: d */
    private int f75859d;

    /* renamed from: e */
    private boolean f75860e;

    /* renamed from: a */
    private void m68285a() {
        if (getLayout().getEllipsisCount(getLineCount() - 1) > 0) {
            CharSequence ellipsize = TextUtils.ellipsize(this.f75858c, getPaint(), (float) ((int) (((float) getMeasuredWidth()) - getPaint().measureText(this.f75857b))), TruncateAt.END);
            String str = this.f75857b;
            StringBuilder sb = new StringBuilder();
            sb.append(ellipsize);
            String a = C2240a.m6772a(str, new Object[]{sb.toString()});
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ellipsize);
            m68286a(a, sb2.toString());
        }
    }

    public SearchCorrectTextView(Context context) {
        this(context, null);
    }

    public SearchCorrectTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f75859d = -1;
        setMaxLines(1);
        setEllipsize(TruncateAt.END);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f75860e = true;
        m68285a();
    }

    /* renamed from: a */
    private void m68286a(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (this.f75859d != -1) {
            int indexOf = str.indexOf(str2);
            int length = str2.length() + indexOf;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f75859d), indexOf, length, 33);
            spannableStringBuilder.setSpan(new StyleSpan(1), indexOf, length, 33);
        }
        setText(spannableStringBuilder);
    }

    /* renamed from: a */
    public final void mo58549a(int i, String str, int i2) {
        this.f75857b = getResources().getString(i);
        this.f75858c = str;
        this.f75859d = i2;
        Resources resources = getResources();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        m68286a(resources.getString(i, new Object[]{sb.toString()}), str);
        if (this.f75860e) {
            m68285a();
        }
    }
}
