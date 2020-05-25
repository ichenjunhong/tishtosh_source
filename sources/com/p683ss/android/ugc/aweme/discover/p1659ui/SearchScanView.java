package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.qrcode.C41000d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchScanView */
public class SearchScanView extends FrameLayout implements OnClickListener {

    /* renamed from: a */
    public boolean f74843a;

    /* renamed from: b */
    private TextView f74844b;

    /* renamed from: c */
    private ImageView f74845c;

    /* renamed from: d */
    private C28457a f74846d;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchScanView$a */
    public interface C28457a {
        /* renamed from: a */
        void mo58069a(View view);

        /* renamed from: b */
        void mo58070b(View view);
    }

    /* renamed from: a */
    public final void mo58121a() {
        if (!C41000d.m90627a().mo83501b().booleanValue()) {
            this.f74845c.setVisibility(0);
            this.f74844b.setVisibility(8);
            this.f74843a = true;
        }
    }

    public void setOnInternalClickListener(C28457a aVar) {
        this.f74846d = aVar;
    }

    public SearchScanView(Context context) {
        this(context, null);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f74846d != null) {
            int id = view.getId();
            if (id == R.id.dfb) {
                this.f74846d.mo58069a(view);
                return;
            }
            if (id == R.id.ch4) {
                this.f74846d.mo58070b(view);
            }
        }
    }

    public SearchScanView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SearchScanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(R.layout.b9s, this, true);
        this.f74844b = (TextView) inflate.findViewById(R.id.dfb);
        this.f74845c = (ImageView) inflate.findViewById(R.id.ch4);
        C38446k.m85764a(this.f74845c);
        this.f74845c.setOnClickListener(this);
        this.f74844b.setOnClickListener(this);
    }
}
