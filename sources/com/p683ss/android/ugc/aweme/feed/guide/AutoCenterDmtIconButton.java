package com.p683ss.android.ugc.aweme.feed.guide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.bytedance.ies.dmt.p664ui.common.C10682e;
import com.bytedance.ies.dmt.p664ui.titlebar.p671b.C10714a;
import com.bytedance.ies.dmt.p664ui.widget.C10720a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.AutoCenterDmtIconButton */
public class AutoCenterDmtIconButton extends FrameLayout implements C10682e {

    /* renamed from: a */
    private int f79055a;

    /* renamed from: b */
    private ImageView f79056b;

    /* renamed from: c */
    private TextView f79057c;

    /* renamed from: d */
    private C10720a f79058d;

    /* renamed from: e */
    private int f79059e;

    /* renamed from: a */
    private void m71095a() {
        if (this.f79058d == C10720a.SOLID) {
            m71096b();
        } else {
            m71097c();
        }
    }

    /* renamed from: b */
    private void m71096b() {
        if (this.f79055a == 0) {
            setBackgroundResource(R.drawable.c9t);
        } else {
            setBackgroundResource(R.drawable.c9s);
        }
        this.f79057c.setTextColor(getContext().getResources().getColor(R.color.aod));
        if (this.f79059e != -1) {
            this.f79056b.setVisibility(0);
            C10714a.m21625a(getContext(), this.f79056b, this.f79059e, R.color.aod);
            return;
        }
        this.f79056b.setVisibility(8);
    }

    /* renamed from: c */
    private void m71097c() {
        if (this.f79055a == 0) {
            setBackgroundResource(R.drawable.c9r);
            this.f79057c.setTextColor(getContext().getResources().getColor(R.color.ar2));
            if (this.f79059e != -1) {
                this.f79056b.setVisibility(0);
                C10714a.m21625a(getContext(), this.f79056b, this.f79059e, R.color.ar2);
                return;
            }
            this.f79056b.setVisibility(8);
            return;
        }
        setBackgroundResource(R.drawable.c9q);
        this.f79057c.setTextColor(getContext().getResources().getColor(R.color.ar1));
        if (this.f79059e != -1) {
            this.f79056b.setVisibility(0);
            C10714a.m21625a(getContext(), this.f79056b, this.f79059e, R.color.ar1);
            return;
        }
        this.f79056b.setVisibility(8);
    }

    public AutoCenterDmtIconButton(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo19029a(int i) {
        if (this.f79055a != i) {
            this.f79055a = i;
            m71095a();
        }
    }

    public AutoCenterDmtIconButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AutoCenterDmtIconButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f79055a = C10675b.m21494a().f28434a;
        this.f79058d = C10720a.SOLID;
        this.f79059e = -1;
        View inflate = LayoutInflater.from(context).inflate(R.layout.a46, this, true);
        this.f79056b = (ImageView) inflate.findViewById(R.id.b1k);
        this.f79057c = (TextView) inflate.findViewById(R.id.dh5);
        m71095a();
    }

    /* renamed from: a */
    public final void mo60627a(C10720a aVar, int i, int i2) {
        mo60628a(aVar, i, getContext().getString(i2));
    }

    /* renamed from: a */
    public final void mo60628a(C10720a aVar, int i, String str) {
        this.f79059e = i;
        if (aVar == C10720a.BORDER) {
            m71097c();
        } else {
            m71096b();
        }
        this.f79057c.setText(str);
    }
}
