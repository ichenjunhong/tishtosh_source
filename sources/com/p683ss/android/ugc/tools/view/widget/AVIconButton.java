package com.p683ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C43300dv;
import com.p683ss.android.ugc.tools.view.p2511d.C50223a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.tools.view.widget.AVIconButton */
public class AVIconButton extends FrameLayout implements C50223a {

    /* renamed from: a */
    private int f125935a;

    /* renamed from: b */
    private ImageView f125936b;

    /* renamed from: c */
    private TextView f125937c;

    /* renamed from: d */
    private C50285i f125938d;

    /* renamed from: e */
    private int f125939e;

    /* renamed from: a */
    private void m108451a() {
        if (this.f125938d == C50285i.SOLID) {
            m108452b();
        } else {
            m108453c();
        }
    }

    /* renamed from: b */
    private void m108452b() {
        if (this.f125935a == 0) {
            setBackgroundResource(R.drawable.dyd);
        } else {
            setBackgroundResource(R.drawable.dyc);
        }
        this.f125937c.setTextColor(getContext().getResources().getColor(R.color.b1b));
        if (this.f125939e != -1) {
            C43300dv.m94960a(getContext(), this.f125936b, this.f125939e, R.color.b1b);
        }
    }

    /* renamed from: c */
    private void m108453c() {
        if (this.f125935a == 0) {
            setBackgroundResource(R.drawable.dyb);
            this.f125937c.setTextColor(getContext().getResources().getColor(R.color.b21));
            if (this.f125939e != -1) {
                C43300dv.m94960a(getContext(), this.f125936b, this.f125939e, R.color.b21);
            }
        } else {
            setBackgroundResource(R.drawable.dya);
            this.f125937c.setTextColor(getContext().getResources().getColor(R.color.b20));
            if (this.f125939e != -1) {
                C43300dv.m94960a(getContext(), this.f125936b, this.f125939e, R.color.b20);
            }
        }
    }

    public AVIconButton(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo97996a(int i) {
        if (this.f125935a != i) {
            this.f125935a = i;
            m108451a();
        }
    }

    public AVIconButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AVIconButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f125935a = C39629l.m88232a().mo58564B().mo74262a();
        this.f125938d = C50285i.SOLID;
        this.f125939e = -1;
        View inflate = LayoutInflater.from(context).inflate(R.layout.bv9, this, true);
        this.f125936b = (ImageView) inflate.findViewById(R.id.b1k);
        this.f125937c = (TextView) inflate.findViewById(R.id.dh5);
        m108451a();
    }

    /* renamed from: a */
    public final void mo98089a(C50285i iVar, int i, String str) {
        this.f125939e = i;
        if (iVar == C50285i.BORDER) {
            m108453c();
        } else {
            m108452b();
        }
        this.f125937c.setText(str);
    }
}
