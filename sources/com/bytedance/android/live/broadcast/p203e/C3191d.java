package com.bytedance.android.live.broadcast.p203e;

import android.text.TextUtils;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.android.live.broadcast.model.C3460g;
import com.bytedance.android.live.broadcast.model.WaitingReviewInfo;
import com.bytedance.android.live.broadcast.p198b.C3072h;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.facebook.drawee.p940f.C13834b;
import com.facebook.drawee.p940f.C13837e;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.e.d */
public final /* synthetic */ class C3191d implements C1710e {

    /* renamed from: a */
    private final C3187a f9252a;

    public C3191d(C3187a aVar) {
        this.f9252a = aVar;
    }

    public final void accept(Object obj) {
        int i;
        int i2;
        C3187a aVar = this.f9252a;
        WaitingReviewInfo waitingReviewInfo = (WaitingReviewInfo) ((C4177d) obj).data;
        aVar.f9244f = Math.abs(waitingReviewInfo.getWaitingCount());
        aVar.f9245g = Math.abs(waitingReviewInfo.getWaitingTime()) / 60;
        if (aVar.f9245g <= 0) {
            aVar.f9245g++;
        }
        if (aVar.f9243e) {
            aVar.mo8533d();
        }
        if (!aVar.f9243e && aVar.f9246h.f18412j) {
            aVar.f9246h.f8990f.setVisibility(8);
            aVar.f9246h.f8986b.setVisibility(0);
            aVar.f9246h.f8987c.setText(C3922z.m9903a((int) R.string.euy));
            aVar.f9246h.f8988d.setText(C3922z.m9903a((int) R.string.eu9));
            if (aVar.f9244f <= 5) {
                aVar.f9242d = 5;
                aVar.f9246h.mo8355a(false, aVar.f9244f, aVar.f9245g);
                aVar.f9246h.mo8356a(true, (CharSequence) C3922z.m9903a((int) R.string.eeu));
            } else {
                aVar.f9242d = 4;
                aVar.f9246h.mo8355a(true, aVar.f9244f, aVar.f9245g);
                aVar.f9246h.mo8356a(false, (CharSequence) null);
            }
            List<C3460g> waitingReviewRules = waitingReviewInfo.getWaitingReviewRules();
            if (waitingReviewRules != null && !waitingReviewRules.isEmpty()) {
                C3072h hVar = aVar.f9246h;
                if (waitingReviewRules != null && !waitingReviewRules.isEmpty()) {
                    hVar.f8989e.setVisibility(0);
                    hVar.f8991g = waitingReviewRules;
                    boolean z = hVar.f8989e.getChildCount() == hVar.f8991g.size();
                    if (!z) {
                        hVar.f8989e.removeAllViews();
                    }
                    int i3 = 0;
                    while (i3 < waitingReviewRules.size()) {
                        C3460g gVar = (C3460g) waitingReviewRules.get(i3);
                        if (gVar != null && !TextUtils.isEmpty(gVar.f9902c)) {
                            String str = gVar.f9902c;
                            if (!z) {
                                HSImageView hSImageView = new HSImageView(hVar.f8985a);
                                hSImageView.setScaleType(ScaleType.CENTER_INSIDE);
                                hSImageView.setHierarchy(new C13834b(C3922z.m9901a()).mo25918a(C13837e.m28113b((float) C3922z.m9899a(4.0f))).mo25912a());
                                LayoutParams layoutParams = new LayoutParams(-1, -1);
                                layoutParams.weight = 1.0f;
                                boolean z2 = i3 == 0;
                                boolean z3 = i3 == hVar.f8991g.size() - 1;
                                if (z2) {
                                    i = 0;
                                } else {
                                    i = C3922z.m9899a(4.25f);
                                }
                                if (z3) {
                                    i2 = 0;
                                } else {
                                    i2 = C3922z.m9899a(4.25f);
                                }
                                layoutParams.setMargins(i, 0, i2, 0);
                                hSImageView.setLayoutParams(layoutParams);
                                hSImageView.setOnClickListener(hVar);
                                hSImageView.setTag(Integer.valueOf(i3));
                                C5213c.m11822a(hSImageView, str);
                                hVar.f8989e.addView(hSImageView);
                            } else {
                                HSImageView hSImageView2 = (HSImageView) hVar.f8989e.getChildAt(i3);
                                if (hSImageView2 != null) {
                                    C5213c.m11822a(hSImageView2, str);
                                }
                            }
                        }
                        i3++;
                    }
                }
            }
        }
    }
}
