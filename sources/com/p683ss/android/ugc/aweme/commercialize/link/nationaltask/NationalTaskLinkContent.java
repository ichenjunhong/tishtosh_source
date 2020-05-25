package com.p683ss.android.ugc.aweme.commercialize.link.nationaltask;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.link.video.C25982a;
import com.p683ss.android.ugc.aweme.feed.model.NationalTaskLink;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.nationaltask.NationalTaskLinkContent */
public final class NationalTaskLinkContent extends LinearLayout implements OnClickListener {

    /* renamed from: a */
    public C25982a f68575a;

    /* renamed from: b */
    private final RemoteImageView f68576b;

    /* renamed from: c */
    private final DmtTextView f68577c;

    /* renamed from: a */
    public final View mo53343a() {
        return this;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C52711k.m112240b(view, "v");
        C25982a aVar = this.f68575a;
        if (aVar != null) {
            aVar.mo53093b();
        }
    }

    /* renamed from: a */
    public final void mo53344a(NationalTaskLink nationalTaskLink, C25982a aVar) {
        C52711k.m112240b(aVar, "commerceTagCallBack");
        this.f68575a = aVar;
        if (nationalTaskLink == null) {
            this.f68576b.setImageResource(R.drawable.ct2);
            this.f68577c.setText("");
            return;
        }
        ((C13833a) this.f68576b.getHierarchy()).mo25907c((int) R.color.a2q);
        C23515d.m57669a(this.f68576b, nationalTaskLink.getAvatarIcon());
        ((C13833a) this.f68576b.getHierarchy()).mo25902b((int) R.drawable.ct2);
        this.f68577c.setText(nationalTaskLink.getTitle());
    }

    public NationalTaskLinkContent(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(R.layout.b6d, this, true);
        setPadding(C23728o.m58241a(5.0d), getTopPaddingOffset(), C23728o.m58241a(4.0d), getBottomPaddingOffset());
        setBackgroundResource(R.drawable.de5);
        setGravity(16);
        View findViewById = findViewById(R.id.bbe);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.link_icon)");
        this.f68576b = (RemoteImageView) findViewById;
        View findViewById2 = findViewById(R.id.bbb);
        C52711k.m112236a((Object) findViewById2, "findViewById(R.id.link_desc)");
        this.f68577c = (DmtTextView) findViewById2;
        setOnClickListener(this);
    }

    public /* synthetic */ NationalTaskLinkContent(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
