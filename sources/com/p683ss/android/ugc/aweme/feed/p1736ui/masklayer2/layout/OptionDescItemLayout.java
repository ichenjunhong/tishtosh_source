package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.OptionDescItemLayout */
public final class OptionDescItemLayout extends LinearLayout {

    /* renamed from: a */
    private TextView f81367a = ((TextView) findViewById(R.id.a4e));

    /* renamed from: b */
    private ImageView f81368b;

    /* renamed from: a */
    public final void mo63869a(C31101f fVar) {
        C52711k.m112240b(fVar, "vo");
        ImageView imageView = this.f81368b;
        if (imageView != null) {
            imageView.setImageResource(fVar.f81387a);
        }
        TextView textView = this.f81367a;
        if (textView != null) {
            Context context = getContext();
            C52711k.m112236a((Object) context, "context");
            textView.setText(context.getResources().getText(fVar.f81388b));
        }
    }

    public OptionDescItemLayout(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.b61, this);
        int b = (int) C9432q.m18687b(getContext(), 12.0f);
        setPadding(b, b, b, b);
        setGravity(16);
        TextView textView = this.f81367a;
        if (textView != null) {
            TextPaint paint = textView.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
        }
        this.f81368b = (ImageView) findViewById(R.id.aqa);
    }

    public OptionDescItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), R.layout.b61, this);
        int b = (int) C9432q.m18687b(getContext(), 12.0f);
        setPadding(b, b, b, b);
        setGravity(16);
        TextView textView = this.f81367a;
        if (textView != null) {
            TextPaint paint = textView.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
        }
        this.f81368b = (ImageView) findViewById(R.id.aqa);
    }

    public OptionDescItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), R.layout.b61, this);
        int b = (int) C9432q.m18687b(getContext(), 12.0f);
        setPadding(b, b, b, b);
        setGravity(16);
        TextView textView = this.f81367a;
        if (textView != null) {
            TextPaint paint = textView.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
        }
        this.f81368b = (ImageView) findViewById(R.id.aqa);
    }
}
