package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.widget.C1115o;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.bytedance.ies.dmt.p664ui.common.C10682e;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.MtHatebaseView */
public class MtHatebaseView extends LinearLayout implements C10682e {

    /* renamed from: a */
    private LinearLayout f74787a;

    /* renamed from: b */
    private FrameLayout f74788b;

    /* renamed from: c */
    private ImageView f74789c;

    /* renamed from: d */
    private DmtTextView f74790d;

    /* renamed from: e */
    private TextView f74791e;

    /* renamed from: f */
    private int f74792f = C10675b.m21494a().f28434a;

    /* renamed from: g */
    private C28487ap f74793g;

    /* renamed from: a */
    private void m67543a() {
        int i;
        int i2;
        int i3;
        if (this.f74787a != null && this.f74793g != null) {
            Resources resources = getResources();
            if (this.f74790d != null) {
                if (this.f74793g.f74895g) {
                    DmtTextView dmtTextView = this.f74790d;
                    if (this.f74792f == 0) {
                        i3 = resources.getColor(R.color.arn);
                    } else {
                        i3 = resources.getColor(R.color.arm);
                    }
                    dmtTextView.setTextColor(i3);
                } else {
                    DmtTextView dmtTextView2 = this.f74790d;
                    if (this.f74792f == 0) {
                        i2 = R.color.arj;
                    } else {
                        i2 = R.color.ari;
                    }
                    dmtTextView2.setTextColor(resources.getColor(i2));
                }
            }
            if (this.f74791e != null) {
                TextView textView = this.f74791e;
                if (this.f74792f == 0) {
                    i = resources.getColor(R.color.arn);
                } else {
                    i = resources.getColor(R.color.arm);
                }
                textView.setTextColor(i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f74787a = (LinearLayout) findViewById(R.id.b8q);
        this.f74788b = (FrameLayout) findViewById(R.id.b88);
        this.f74789c = (ImageView) findViewById(R.id.b0d);
        this.f74790d = (DmtTextView) findViewById(R.id.dhb);
        this.f74791e = (TextView) findViewById(R.id.d98);
        if (C1056u.m3055f(this) == 1 && VERSION.SDK_INT >= 17) {
            setLayoutDirection(0);
            this.f74787a.setLayoutDirection(1);
        }
    }

    public MtHatebaseView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo19029a(int i) {
        if (this.f74792f != i) {
            this.f74792f = i;
            m67543a();
        }
    }

    public void setStatus(C28487ap apVar) {
        if (apVar != null) {
            this.f74793g = apVar;
            if (this.f74793g.f74892d) {
                this.f74788b.setVisibility(0);
                this.f74789c.setImageDrawable(this.f74793g.f74889a);
            } else {
                this.f74788b.setVisibility(8);
            }
            if (this.f74793g.f74893e) {
                this.f74790d.setText(this.f74793g.f74890b);
            }
            if (this.f74793g.f74895g) {
                C1115o.m3256a((TextView) this.f74790d, (int) R.style.tf);
            }
            if (this.f74793g.f74894f) {
                this.f74791e.setHighlightColor(getResources().getColor(R.color.a8w));
                this.f74791e.setMovementMethod(LinkMovementMethod.getInstance());
                this.f74791e.setText(this.f74793g.f74891c);
            }
            m67543a();
        }
    }

    public MtHatebaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MtHatebaseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
