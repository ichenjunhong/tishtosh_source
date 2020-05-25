package com.bytedance.android.livesdk.rank.view;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.core.p230g.C3865ac;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.schema.interfaces.C8260a;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.rank.view.a */
final /* synthetic */ class C8228a implements OnClickListener {

    /* renamed from: a */
    private final Context f22528a;

    C8228a(Context context) {
        this.f22528a = context;
    }

    public final void onClick(View view) {
        Context context = this.f22528a;
        HashMap hashMap = new HashMap();
        hashMap.put("type", "nobility");
        C8049c.m15979a().mo14202a("livesdk_nobility_page_click", hashMap, new Object[0]);
        ((C8260a) C4116c.m10249a(C8260a.class)).handle(context, Uri.parse((String) LiveConfigSettingKeys.LIVE_NOBLE_INTRODUCE_SCHEMA.mo9431a()).buildUpon().appendQueryParameter("status_bar_height", String.valueOf((int) C3922z.m9914e(C3865ac.m9795a(context)))).build());
    }
}
