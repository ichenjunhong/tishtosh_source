package com.bytedance.ies.dmt.p664ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.widget.C1115o;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.bytedance.ies.dmt.p664ui.common.C10682e;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.MtEmptyView */
public class MtEmptyView extends LinearLayout implements C10682e, C10725e {

    /* renamed from: a */
    private LinearLayout f28682a;

    /* renamed from: b */
    private FrameLayout f28683b;

    /* renamed from: c */
    private ImageView f28684c;

    /* renamed from: d */
    private DmtTextView f28685d;

    /* renamed from: e */
    private DmtTextView f28686e;

    /* renamed from: f */
    private int f28687f = C10675b.m21494a().f28434a;

    /* renamed from: g */
    private C10722c f28688g;

    /* renamed from: a */
    private void m21698a() {
        int i;
        int i2;
        int i3;
        if (this.f28682a != null && this.f28688g != null) {
            Resources resources = getResources();
            if (this.f28685d != null) {
                if (this.f28688g.f28706n) {
                    DmtTextView dmtTextView = this.f28685d;
                    if (this.f28687f == 0) {
                        i3 = resources.getColor(R.color.arn);
                    } else {
                        i3 = resources.getColor(R.color.arm);
                    }
                    dmtTextView.setTextColor(i3);
                } else {
                    DmtTextView dmtTextView2 = this.f28685d;
                    if (this.f28687f == 0) {
                        i2 = R.color.arj;
                    } else {
                        i2 = R.color.ari;
                    }
                    dmtTextView2.setTextColor(resources.getColor(i2));
                }
            }
            if (this.f28686e != null) {
                DmtTextView dmtTextView3 = this.f28686e;
                if (this.f28687f == 0) {
                    i = resources.getColor(R.color.arn);
                } else {
                    i = resources.getColor(R.color.arm);
                }
                dmtTextView3.setTextColor(i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f28682a = (LinearLayout) findViewById(R.id.b8q);
        this.f28683b = (FrameLayout) findViewById(R.id.b88);
        this.f28684c = (ImageView) findViewById(R.id.b0d);
        this.f28685d = (DmtTextView) findViewById(R.id.dhb);
        this.f28686e = (DmtTextView) findViewById(R.id.d98);
        if (C1056u.m3055f(this) == 1 && VERSION.SDK_INT >= 17) {
            setLayoutDirection(0);
            this.f28682a.setLayoutDirection(1);
        }
    }

    public MtEmptyView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static MtEmptyView m21697a(Context context) {
        return (MtEmptyView) LayoutInflater.from(context).inflate(R.layout.a5q, null);
    }

    /* renamed from: a */
    public final void mo19029a(int i) {
        if (this.f28687f != i) {
            this.f28687f = i;
            m21698a();
        }
    }

    public void setStatus(C10722c cVar) {
        if (cVar != null) {
            this.f28688g = cVar;
            if (this.f28688g.f28702j) {
                this.f28683b.setVisibility(0);
                this.f28684c.setImageDrawable(this.f28688g.f28693a);
            } else {
                this.f28683b.setVisibility(8);
            }
            if (this.f28688g.f28703k) {
                this.f28685d.setText(this.f28688g.f28694b);
            }
            if (this.f28688g.f28706n) {
                C1115o.m3256a((TextView) this.f28685d, (int) R.style.tf);
            }
            if (this.f28688g.f28704l) {
                this.f28686e.setText(this.f28688g.f28695c);
                if (this.f28688g.f28705m) {
                    this.f28686e.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
            m21698a();
        }
    }

    public MtEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MtEmptyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
