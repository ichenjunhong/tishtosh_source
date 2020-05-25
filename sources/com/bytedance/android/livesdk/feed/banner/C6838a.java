package com.bytedance.android.livesdk.feed.banner;

import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.livesdk.p279af.C4577ap;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.banner.a */
public final class C6838a {

    /* renamed from: a */
    public ImageView f18742a;

    /* renamed from: b */
    public ImageView f18743b;

    /* renamed from: c */
    public TextView f18744c;

    /* renamed from: d */
    public List<ImageView> f18745d = new ArrayList(3);

    /* renamed from: e */
    public boolean f18746e;

    /* renamed from: f */
    public final View f18747f;

    /* renamed from: g */
    public final int[] f18748g;

    public C6838a(View view, boolean z) {
        this.f18746e = z;
        this.f18747f = view;
        this.f18744c = (TextView) view.findViewById(R.id.c8h);
        this.f18742a = (ImageView) view.findViewById(R.id.c8b);
        this.f18743b = (ImageView) view.findViewById(R.id.c86);
        this.f18745d.add(view.findViewById(R.id.hk));
        this.f18745d.add(view.findViewById(R.id.hl));
        this.f18745d.add(view.findViewById(R.id.hm));
        if (z) {
            this.f18743b.setVisibility(0);
            ImageView imageView = (ImageView) view.findViewById(R.id.g_);
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = (ImageView) view.findViewById(R.id.c8_);
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            this.f18744c.setTextColor(view.getContext().getResources().getColor(R.color.aco));
            this.f18744c.setTextSize(TypedValue.applyDimension(2, 24.0f, view.getContext().getResources().getDisplayMetrics()));
            for (ImageView imageView3 : this.f18745d) {
                int a = (int) C4577ap.m10990a(view.getContext(), 54.0f);
                int a2 = (int) C4577ap.m10990a(imageView3.getContext(), 10.0f);
                int a3 = (int) C4577ap.m10990a(imageView3.getContext(), 3.0f);
                imageView3.getLayoutParams().height = a;
                imageView3.getLayoutParams().width = a;
                if (imageView3.getLayoutParams() instanceof LayoutParams) {
                    LayoutParams layoutParams = (LayoutParams) imageView3.getLayoutParams();
                    layoutParams.topMargin = a3;
                    layoutParams.leftMargin = -((int) C4577ap.m10990a(view.getContext(), 8.0f));
                    imageView3.setLayoutParams(layoutParams);
                }
                imageView3.setPadding(imageView3.getPaddingLeft(), a2, imageView3.getRight(), a2);
            }
            this.f18748g = new int[]{R.drawable.bev, R.drawable.bew, R.drawable.beu};
            return;
        }
        this.f18748g = new int[]{R.drawable.bet, R.drawable.bey, R.drawable.bes};
    }
}
