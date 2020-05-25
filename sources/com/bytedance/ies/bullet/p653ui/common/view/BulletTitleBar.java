package com.bytedance.ies.bullet.p653ui.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.ui.common.view.BulletTitleBar */
public final class BulletTitleBar extends FrameLayout {

    /* renamed from: a */
    private HashMap f28134a;

    /* renamed from: a */
    public final View mo18786a(int i) {
        if (this.f28134a == null) {
            this.f28134a = new HashMap();
        }
        View view = (View) this.f28134a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f28134a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setBackListener(OnClickListener onClickListener) {
        C52711k.m112240b(onClickListener, "click");
        ((AutoRTLImageView) mo18786a(R.id.ay9)).setOnClickListener(onClickListener);
    }

    public final void setCloseAllListener(OnClickListener onClickListener) {
        C52711k.m112240b(onClickListener, "click");
        ((AutoRTLImageView) mo18786a(R.id.eea)).setOnClickListener(onClickListener);
    }

    public final void setEnableReFresh(boolean z) {
        int i;
        Button button = (Button) mo18786a(R.id.e0r);
        C52711k.m112236a((Object) button, "btn_refresh");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        button.setVisibility(i);
    }

    public final void setRefreshListener(OnClickListener onClickListener) {
        C52711k.m112240b(onClickListener, "click");
        ((Button) mo18786a(R.id.e0r)).setOnClickListener(onClickListener);
    }

    public final void setTitle(CharSequence charSequence) {
        C52711k.m112240b(charSequence, "title");
        TextView textView = (TextView) mo18786a(R.id.dhb);
        C52711k.m112236a((Object) textView, "tv_title");
        textView.setText(charSequence);
    }

    public BulletTitleBar(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.b3n, this, true);
    }

    public /* synthetic */ BulletTitleBar(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
