package com.bytedance.android.livesdk.feed.p341i;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import com.bytedance.android.live.base.model.banner.C2967c;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.live.C2983c;
import com.bytedance.android.live.base.model.live.C2984d;
import com.bytedance.android.live.core.p230g.C3909r;
import com.bytedance.android.live.core.p235h.C3923a;
import com.bytedance.android.livesdk.feed.banner.C6838a;
import com.bytedance.android.livesdk.feed.feed.C6947h;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.common.utility.C9414h;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.feed.i.aj */
public final class C6969aj extends C3923a<FeedItem> {

    /* renamed from: b */
    ViewFlipper f19056b;

    /* renamed from: c */
    private boolean f19057c = false;

    public C6969aj(View view, boolean z) {
        super(view);
        this.f19056b = (ViewFlipper) view.findViewById(R.id.aoe);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo9280a(Object obj, int i) {
        int i2;
        C6838a aVar;
        int i3;
        C2967c cVar = ((C6947h) ((FeedItem) obj).item).f19022a;
        if (cVar == null || C9414h.m18630a(cVar.f8694b)) {
            this.f19056b.stopFlipping();
            this.f19056b.setVisibility(8);
            return;
        }
        int i4 = 0;
        while (i4 < cVar.f8694b.size()) {
            if (i4 >= this.f19056b.getChildCount()) {
                View inflate = LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.alc, this.f19056b, false);
                this.f19056b.addView(inflate);
                aVar = new C6838a(inflate, this.f19057c);
                inflate.setTag(R.id.d5p, aVar);
            } else {
                aVar = (C6838a) this.f19056b.getChildAt(i4).getTag(R.id.d5p);
            }
            C2984d dVar = (C2984d) cVar.f8694b.get(i4);
            if (aVar.f18746e) {
                C3909r.m9883b(aVar.f18743b, dVar.f8745e);
            }
            C3909r.m9883b(aVar.f18742a, dVar.f8741a);
            aVar.f18744c.setText(dVar.f8742b);
            aVar.f18747f.setOnClickListener(new OnClickListener(dVar) {

                /* renamed from: a */
                final /* synthetic */ C2984d f18749a;

                public final void onClick(View view) {
                    try {
                        Uri parse = Uri.parse(this.f18749a.f8744d);
                        if (C8830k.m17330d() != null) {
                            C8830k.m17330d().mo15045a(view.getContext(), parse);
                        }
                    } catch (Exception unused) {
                    }
                }

                {
                    this.f18749a = r2;
                }
            });
            int size = aVar.f18745d.size();
            if (dVar.f8743c == null) {
                i3 = 0;
            } else {
                i3 = dVar.f8743c.size();
            }
            int max = Math.max(0, size - i3);
            for (int i5 = 0; i5 < aVar.f18745d.size(); i5++) {
                ImageView imageView = (ImageView) aVar.f18745d.get(i5);
                if (i5 < max) {
                    imageView.setVisibility(4);
                } else {
                    imageView.setVisibility(0);
                    if (i5 < aVar.f18748g.length) {
                        imageView.setBackgroundResource(aVar.f18748g[i5]);
                    }
                    C3909r.m9875a(imageView, ((C2983c) dVar.f8743c.get(i5 - max)).f8738b);
                }
            }
            i4++;
        }
        for (int childCount = this.f19056b.getChildCount() - 1; childCount >= i4; childCount--) {
            this.f19056b.removeViewAt(childCount);
        }
        this.f19056b.setVisibility(0);
        if (this.f19056b.getChildCount() <= 1) {
            this.f19056b.stopFlipping();
            return;
        }
        ViewFlipper viewFlipper = this.f19056b;
        if (cVar.f8693a <= 0) {
            i2 = 5000;
        } else {
            i2 = cVar.f8693a * 1000;
        }
        viewFlipper.setFlipInterval(i2);
        this.f19056b.startFlipping();
    }
}
