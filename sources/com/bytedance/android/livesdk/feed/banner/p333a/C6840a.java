package com.bytedance.android.livesdk.feed.banner.p333a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.banner.C2965a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.feed.C7066p;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.feed.banner.a.a */
public final class C6840a {

    /* renamed from: a */
    HSImageView f18751a;

    /* renamed from: b */
    TextView f18752b;

    /* renamed from: c */
    TextView f18753c;

    /* renamed from: d */
    Context f18754d;

    /* renamed from: e */
    C2965a f18755e;

    /* renamed from: f */
    String f18756f;

    /* renamed from: g */
    private C7066p f18757g;

    public C6840a(View view, Context context, String str, C7066p pVar) {
        this.f18751a = (HSImageView) view.findViewById(R.id.ar5);
        this.f18752b = (TextView) view.findViewById(R.id.text);
        this.f18753c = (TextView) view.findViewById(R.id.b6_);
        this.f18751a.setOnClickListener(new C6841b(this));
        this.f18754d = context;
        this.f18756f = str;
        this.f18757g = pVar;
    }
}
