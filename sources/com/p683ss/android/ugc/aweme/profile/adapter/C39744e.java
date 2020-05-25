package com.p683ss.android.ugc.aweme.profile.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26838e;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.e */
public final class C39744e extends C26838e<C29059c> {

    /* renamed from: a */
    Context f101469a;

    /* renamed from: b */
    SmartImageView f101470b;

    /* renamed from: c */
    TextView f101471c;

    /* renamed from: d */
    TextView f101472d;

    /* renamed from: c */
    public final void mo50308c() {
    }

    public C39744e(View view) {
        super(view);
        this.f101469a = view.getContext();
        this.f101470b = (SmartImageView) view.findViewById(R.id.a22);
        this.f101470b.setOnClickListener(new C39745f(this));
        this.f101471c = (TextView) view.findViewById(R.id.f25);
        this.f101472d = (TextView) view.findViewById(R.id.f24);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54774a(C29059c cVar, int i) {
        if (cVar != null) {
            C18842a.m45934b(new C39746g(this, cVar, i));
        }
    }
}
