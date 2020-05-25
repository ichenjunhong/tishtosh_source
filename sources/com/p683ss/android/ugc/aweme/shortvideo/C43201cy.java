package com.p683ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a.C10661a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.gamora.recorder.p2468e.C49664c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cy */
final /* synthetic */ class C43201cy implements Runnable {

    /* renamed from: a */
    private final C42562ct f109230a;

    C43201cy(C42562ct ctVar) {
        this.f109230a = ctVar;
    }

    public final void run() {
        C49664c cVar = (C49664c) this.f109230a.mo24388a("RecordDockBarScene");
        Activity activity = cVar.f33840g_;
        if (activity == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) activity, "activity!!");
        C10660a a = new C10661a(activity).mo19015b((int) R.string.dre).mo19010a(3000).mo19014a();
        View view = cVar.f124580q;
        if (view == null) {
            C52711k.m112237a("ivTool");
        }
        View view2 = cVar.f124580q;
        if (view2 == null) {
            C52711k.m112237a("ivTool");
        }
        float measuredWidth = (float) (view2.getMeasuredWidth() / 2);
        Activity activity2 = cVar.f33840g_;
        if (activity2 == null) {
            C52711k.m112234a();
        }
        float b = measuredWidth - C9432q.m18687b((Context) activity2, 6.0f);
        View view3 = cVar.f124580q;
        if (view3 == null) {
            C52711k.m112237a("ivTool");
        }
        a.mo18997a(view, 48, b, (-view3.getMeasuredWidth()) / 2);
        C39618d.f101151O.mo83116a(C40796a.EnableCommerceUnlockStickerCollectTips, false);
    }
}
