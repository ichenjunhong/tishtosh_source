package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.gift.effect.entry.p367e.C7395b;
import com.bytedance.android.livesdk.p279af.C4622w;
import com.ss.android.ugc.trill.R;

public class EcomEnterTrayView extends LinearLayout {

    /* renamed from: a */
    private TextView f20225a;

    /* renamed from: b */
    private HSImageView f20226b;

    public EcomEnterTrayView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo13666a(C7395b bVar) {
        if (bVar != null) {
            setTextContent(bVar);
            setEcomIcon(bVar);
            setBackgroundResource(R.drawable.bgo);
        }
    }

    private void setEcomIcon(C7395b bVar) {
        if (TextUtils.isEmpty(bVar.f20202t)) {
            this.f20226b.setImageResource(R.drawable.c1q);
        } else {
            C5213c.m11822a(this.f20226b, bVar.f20202t);
        }
    }

    private void setTextContent(C7395b bVar) {
        String str;
        String str2;
        if (TextUtils.isEmpty(bVar.f20189g)) {
            str = getContext().getString(R.string.e_9);
        } else {
            str = bVar.f20189g;
        }
        if (bVar.f20201s == 1) {
            str2 = getContext().getString(R.string.e_a, new Object[]{bVar.f20184b, str});
        } else {
            String a = C4622w.m11084a(bVar.f20201s);
            str2 = getContext().getString(R.string.e__, new Object[]{bVar.f20184b, a, str});
        }
        this.f20225a.setText(str2);
    }

    public EcomEnterTrayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EcomEnterTrayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.ajn, this);
        this.f20225a = (TextView) findViewById(R.id.d9n);
        this.f20226b = (HSImageView) findViewById(R.id.b09);
        setGravity(16);
    }
}
