package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.message.model.C8012v;
import com.bytedance.android.livesdk.p399o.C8068g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.x */
final /* synthetic */ class C6618x implements OnClickListener {

    /* renamed from: a */
    private final DailyRankWidget f17976a;

    /* renamed from: b */
    private final C8012v f17977b;

    C6618x(DailyRankWidget dailyRankWidget, C8012v vVar) {
        this.f17976a = dailyRankWidget;
        this.f17977b = vVar;
    }

    public final void onClick(View view) {
        DailyRankWidget dailyRankWidget = this.f17976a;
        C8012v vVar = this.f17977b;
        dailyRankWidget.f16880k.mo11758b();
        dailyRankWidget.mo12328a(0);
        try {
            new JSONObject().put("trace_id", vVar.f21930h);
            C8068g.m16014a(dailyRankWidget.context);
        } catch (JSONException unused) {
        }
    }
}
