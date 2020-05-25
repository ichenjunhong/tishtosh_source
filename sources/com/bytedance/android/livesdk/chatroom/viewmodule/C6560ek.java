package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0199s;
import android.text.TextUtils;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.event.C5203v;
import com.bytedance.ies.sdk.widgets.KVData;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ek */
final /* synthetic */ class C6560ek implements C0199s {

    /* renamed from: a */
    private final RadioWidget f17893a;

    C6560ek(RadioWidget radioWidget) {
        this.f17893a = radioWidget;
    }

    public final void onChanged(Object obj) {
        RadioWidget radioWidget = this.f17893a;
        KVData kVData = (KVData) obj;
        if (radioWidget.isViewValid() && kVData != null) {
            C5203v vVar = (C5203v) kVData.getData();
            if (radioWidget.f17537l == null) {
                radioWidget.f17537l = (LayoutParams) radioWidget.f17532g.getLayoutParams();
                radioWidget.f17538m = (LayoutParams) radioWidget.f17531f.getLayoutParams();
            }
            if (vVar.f13923a) {
                radioWidget.f17527b = true;
                LayoutParams layoutParams = new LayoutParams(radioWidget.f17537l.width, radioWidget.f17537l.height, radioWidget.f17537l.gravity);
                layoutParams.topMargin = C3922z.m9913d(R.dimen.rd);
                layoutParams.height = (int) radioWidget.context.getResources().getDimension(R.dimen.re);
                layoutParams.width = (int) radioWidget.context.getResources().getDimension(R.dimen.re);
                radioWidget.f17532g.setLayoutParams(layoutParams);
                LayoutParams layoutParams2 = new LayoutParams(radioWidget.f17538m.width, radioWidget.f17538m.height, radioWidget.f17538m.gravity);
                layoutParams2.topMargin = C3922z.m9913d(R.dimen.rb);
                layoutParams2.height = (int) radioWidget.context.getResources().getDimension(R.dimen.rc);
                layoutParams2.width = (int) radioWidget.context.getResources().getDimension(R.dimen.rc);
                radioWidget.f17531f.setLayoutParams(layoutParams2);
                radioWidget.f17531f.setVisibility(4);
                radioWidget.f17531f.mo6661f();
                radioWidget.f17535j.setVisibility(0);
                radioWidget.f17536k.setVisibility(8);
                return;
            }
            radioWidget.f17527b = false;
            radioWidget.f17532g.setLayoutParams(radioWidget.f17537l);
            radioWidget.f17531f.setLayoutParams(radioWidget.f17538m);
            radioWidget.f17531f.setVisibility(0);
            radioWidget.f17531f.mo6654b();
            radioWidget.f17535j.setVisibility(8);
            if (radioWidget.f17533h.getVisibility() == 0) {
                radioWidget.f17533h.setVisibility(8);
                radioWidget.f17534i.setVisibility(8);
            }
            if (TextUtils.isEmpty(radioWidget.f17526a.getOwner().getBackgroundImgUrl())) {
                radioWidget.f17536k.setVisibility(4);
            } else {
                radioWidget.f17536k.setVisibility(0);
            }
        }
    }
}
