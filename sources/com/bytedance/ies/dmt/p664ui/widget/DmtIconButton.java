package com.bytedance.ies.dmt.p664ui.widget;

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
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtIconButton */
public class DmtIconButton extends FrameLayout implements C10682e {

    /* renamed from: a */
    private int f28634a;

    /* renamed from: b */
    private ImageView f28635b;

    /* renamed from: c */
    private TextView f28636c;

    /* renamed from: d */
    private C10720a f28637d;

    /* renamed from: e */
    private int f28638e;

    /* renamed from: a */
    private void m21650a() {
        if (this.f28637d == C10720a.SOLID) {
            m21651b();
        } else {
            m21652c();
        }
    }

    /* renamed from: b */
    private void m21651b() {
        if (this.f28634a == 0) {
            setBackgroundResource(R.drawable.c9t);
        } else {
            setBackgroundResource(R.drawable.c9s);
        }
        this.f28636c.setTextColor(getContext().getResources().getColor(R.color.aod));
        if (this.f28638e != -1) {
            C10714a.m21625a(getContext(), this.f28635b, this.f28638e, R.color.aod);
        }
    }

    /* renamed from: c */
    private void m21652c() {
        if (this.f28634a == 0) {
            setBackgroundResource(R.drawable.c9r);
            this.f28636c.setTextColor(getContext().getResources().getColor(R.color.ar2));
            if (this.f28638e != -1) {
                C10714a.m21625a(getContext(), this.f28635b, this.f28638e, R.color.ar2);
            }
        } else {
            setBackgroundResource(R.drawable.c9q);
            this.f28636c.setTextColor(getContext().getResources().getColor(R.color.ar1));
            if (this.f28638e != -1) {
                C10714a.m21625a(getContext(), this.f28635b, this.f28638e, R.color.ar1);
            }
        }
    }

    public DmtIconButton(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo19029a(int i) {
        if (this.f28634a != i) {
            this.f28634a = i;
            m21650a();
        }
    }

    public DmtIconButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DmtIconButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28634a = C10675b.m21494a().f28434a;
        this.f28637d = C10720a.SOLID;
        this.f28638e = -1;
        View inflate = LayoutInflater.from(context).inflate(R.layout.a45, this, true);
        this.f28635b = (ImageView) inflate.findViewById(R.id.b1k);
        this.f28636c = (TextView) inflate.findViewById(R.id.dh5);
        m21650a();
    }

    /* renamed from: a */
    public final void mo19199a(C10720a aVar, int i, String str) {
        this.f28638e = i;
        if (aVar == C10720a.BORDER) {
            m21652c();
        } else {
            m21651b();
        }
        this.f28636c.setText(str);
    }
}
