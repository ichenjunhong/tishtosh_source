package com.p683ss.android.ugc.aweme.shortvideo.record;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.p683ss.android.ugc.aweme.shortvideo.widget.TabItemView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.b */
public final class C44450b {

    /* renamed from: a */
    public final ShortVideoContext f112450a;

    /* renamed from: b */
    private final LinearLayout f112451b;

    /* renamed from: a */
    private final TabItemView m97273a() {
        LinearLayout linearLayout = this.f112451b;
        C52711k.m112236a((Object) linearLayout, "tabContainer");
        return new TabItemView(linearLayout.getContext());
    }

    public C44450b(TabHost tabHost, ShortVideoContext shortVideoContext) {
        C52711k.m112240b(tabHost, "tabHost");
        C52711k.m112240b(shortVideoContext, "shortVideoContext");
        this.f112450a = shortVideoContext;
        this.f112451b = (LinearLayout) tabHost.findViewById(R.id.yw);
    }

    /* renamed from: a */
    public final void mo90337a(int i, String str, String str2) {
        C52711k.m112240b(str, "text");
        C52711k.m112240b(str2, "tag");
        mo90336a(i, str, 0, str2);
    }

    /* renamed from: a */
    public final void mo90336a(int i, String str, int i2, String str2) {
        C52711k.m112240b(str, "text");
        C52711k.m112240b(str2, "tag");
        TabItemView a = m97273a();
        a.setText(str);
        if (i2 != 0) {
            Context context = a.getContext();
            C52711k.m112236a((Object) context, "item.context");
            Drawable drawable = context.getResources().getDrawable(i2);
            C52711k.m112236a((Object) drawable, "leftDrawable");
            drawable.setBounds(0, 1, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight() + 1);
            a.getTextView().setCompoundDrawables(drawable, null, null, null);
            TextView textView = a.getTextView();
            C52711k.m112236a((Object) textView, "item.textView");
            textView.setCompoundDrawablePadding((int) C9432q.m18687b(a.getContext(), 3.0f));
        }
        a.setTag(str2);
        this.f112451b.addView(a, i);
    }
}
