package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2327e;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.e.a */
public final class C46504a extends C1352v {

    /* renamed from: a */
    public final ImageView f117340a;

    /* renamed from: b */
    public final SimpleDraweeView f117341b;

    /* renamed from: c */
    public final TextView f117342c;

    public C46504a(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.b0i);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.iv_face_matting_choose)");
        this.f117340a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.b0h);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.iv_face_matting)");
        this.f117341b = (SimpleDraweeView) findViewById2;
        View findViewById3 = view.findViewById(R.id.d9m);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.tv_duration)");
        this.f117342c = (TextView) findViewById3;
    }
}
