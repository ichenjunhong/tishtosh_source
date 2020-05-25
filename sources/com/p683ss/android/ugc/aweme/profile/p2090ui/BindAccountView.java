package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45427bj;
import com.p683ss.android.ugc.aweme.views.AutoRTLImageView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.BindAccountView */
public class BindAccountView extends LinearLayout {

    /* renamed from: a */
    protected Context f102043a;

    /* renamed from: b */
    protected LinearLayout f102044b;

    /* renamed from: c */
    protected TextView f102045c;

    /* renamed from: d */
    protected AutoRTLImageView f102046d;

    /* renamed from: e */
    protected AutoRTLImageView f102047e;

    /* renamed from: f */
    protected AutoRTLImageView f102048f;

    /* renamed from: g */
    protected C40054a f102049g;

    /* renamed from: h */
    private ArrayList<Integer> f102050h;

    /* renamed from: i */
    private boolean f102051i;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.BindAccountView$a */
    public interface C40054a {
    }

    public void setEventListener(C40054a aVar) {
        this.f102049g = aVar;
    }

    public void setIsMyProfile(boolean z) {
        this.f102051i = z;
    }

    public BindAccountView(Context context) {
        this(context, null);
    }

    public BindAccountView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo82104a(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                C45427bj.m98999a(this.f102044b, 1.0f, 0.5f, 150);
                break;
            case 1:
                break;
        }
        C45427bj.m98999a(this.f102044b, 0.5f, 1.0f, 150);
        return false;
    }

    public BindAccountView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f102050h = new ArrayList<>();
        this.f102043a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.bqe, this, true);
        this.f102044b = (LinearLayout) inflate.findViewById(R.id.b_b);
        this.f102045c = (TextView) inflate.findViewById(R.id.c5w);
        this.f102046d = (AutoRTLImageView) inflate.findViewById(R.id.aql);
        this.f102047e = (AutoRTLImageView) inflate.findViewById(R.id.aqs);
        this.f102048f = (AutoRTLImageView) inflate.findViewById(R.id.aqw);
        this.f102044b.setOnTouchListener(new C40393u(this));
    }
}
