package com.p683ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.DouPlusLinkContent */
public final class DouPlusLinkContent extends LinearLayout implements OnClickListener {

    /* renamed from: a */
    public RemoteImageView f68584a;

    /* renamed from: b */
    public DmtTextView f68585b;

    /* renamed from: c */
    public ImageView f68586c;

    /* renamed from: d */
    public C25982a f68587d;

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C52711k.m112240b(view, "v");
        if (this.f68587d != null) {
            C25982a aVar = this.f68587d;
            if (aVar == null) {
                C52711k.m112234a();
            }
            aVar.mo53093b();
        }
    }

    public DouPlusLinkContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.b6d, this, true);
        setPadding(C23728o.m58241a(5.0d), getTopPaddingOffset(), C23728o.m58241a(5.0d), getBottomPaddingOffset());
        setBackgroundResource(R.drawable.de5);
        setGravity(16);
        View findViewById = findViewById(R.id.bbe);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.link_icon)");
        this.f68584a = (RemoteImageView) findViewById;
        View findViewById2 = findViewById(R.id.bbb);
        C52711k.m112236a((Object) findViewById2, "findViewById(R.id.link_desc)");
        this.f68585b = (DmtTextView) findViewById2;
        View findViewById3 = findViewById(R.id.bbj);
        C52711k.m112236a((Object) findViewById3, "findViewById(R.id.link_naming_close)");
        this.f68586c = (ImageView) findViewById3;
        setOnClickListener(this);
    }

    public /* synthetic */ DouPlusLinkContent(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
