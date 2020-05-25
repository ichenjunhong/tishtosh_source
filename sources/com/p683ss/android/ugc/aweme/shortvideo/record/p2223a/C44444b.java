package com.p683ss.android.ugc.aweme.shortvideo.record.p2223a;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.a.b */
final /* synthetic */ class C44444b implements C0199s {

    /* renamed from: a */
    private final C44442a f112439a;

    C44444b(C44442a aVar) {
        this.f112439a = aVar;
    }

    public final void onChanged(Object obj) {
        C44442a aVar = this.f112439a;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            if (!C39618d.f101151O.mo83117a(C40796a.ReactionTipShow)) {
                if (aVar.f112431d == null) {
                    if (aVar.f112430c.getReactionPosMarginInViewPixel() == null) {
                        C47625i.m103103a("getReactionPosMarginInViewPixel return null");
                    } else {
                        aVar.f112431d = new C44448f(aVar.f112430c);
                        LayoutParams layoutParams = (LayoutParams) aVar.f112429b.mo91308N().getLayoutParams();
                        int[] reactionCameraPosInViewPixel = aVar.f112430c.getReactionCameraPosInViewPixel();
                        if (reactionCameraPosInViewPixel != null) {
                            if (C47918gj.m103682a(aVar.f112428a)) {
                                aVar.f112431d.mo90331a((C43303dy.m94971b(aVar.f112428a) - (reactionCameraPosInViewPixel[0] + (VERSION.SDK_INT >= 17 ? Math.min(layoutParams.getMarginStart(), layoutParams.rightMargin) : layoutParams.rightMargin))) - reactionCameraPosInViewPixel[2], reactionCameraPosInViewPixel[1] + reactionCameraPosInViewPixel[3], reactionCameraPosInViewPixel[2]);
                            } else {
                                aVar.f112431d.mo90331a(reactionCameraPosInViewPixel[0] + (VERSION.SDK_INT >= 17 ? Math.min(layoutParams.getMarginStart(), layoutParams.leftMargin) : layoutParams.leftMargin), reactionCameraPosInViewPixel[1] + reactionCameraPosInViewPixel[3], reactionCameraPosInViewPixel[2]);
                            }
                        }
                    }
                }
                if (aVar.f112431d != null) {
                    C44448f fVar = aVar.f112431d;
                    if (fVar.f112445c == null) {
                        fVar.f112445c = new TextView(fVar.f112443a);
                        fVar.f112445c.setTextSize(14.0f);
                        fVar.f112445c.setGravity(17);
                        fVar.f112445c.setTextColor(fVar.f112443a.getResources().getColor(R.color.jf));
                        fVar.f112445c.setTextColor(-16777216);
                        fVar.f112444b.addView(fVar.f112445c, new MarginLayoutParams(-2, -2));
                    }
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) fVar.f112445c.getLayoutParams();
                    marginLayoutParams.width = fVar.f112448f;
                    if (C47918gj.m103682a(fVar.f112443a)) {
                        marginLayoutParams.setMargins(0, fVar.f112447e, fVar.f112446d, 0);
                    } else {
                        marginLayoutParams.setMargins(fVar.f112446d, fVar.f112447e, 0, 0);
                    }
                    if (VERSION.SDK_INT >= 17) {
                        marginLayoutParams.setMarginStart(fVar.f112446d);
                    }
                    fVar.f112445c.requestLayout();
                    fVar.f112445c.setText(R.string.d41);
                    fVar.f112445c.setVisibility(0);
                    C39618d.f101151O.mo83116a(C40796a.ReactionTipShow, true);
                    new SafeHandler(aVar.f112428a).postDelayed(new C44447e(aVar), 5000);
                }
            }
            if (!aVar.f112433f) {
                if (C39618d.f101151O.mo83118b(C40796a.DefaultMicrophoneState) == 1) {
                    C10691a.m21548c((Context) aVar.f112428a, (int) R.string.d42).mo19066a();
                }
                aVar.f112433f = true;
            }
        }
    }
}
