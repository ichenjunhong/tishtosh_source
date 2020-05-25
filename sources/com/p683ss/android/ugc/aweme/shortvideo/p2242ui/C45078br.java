package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a.C10661a;
import com.p683ss.android.ugc.aweme.base.p1417h.C23543g;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.br */
final /* synthetic */ class C45078br implements Runnable {

    /* renamed from: a */
    private final PermissionSettingItem f114172a;

    /* renamed from: b */
    private final Activity f114173b;

    /* renamed from: c */
    private final C23543g f114174c;

    /* renamed from: d */
    private final String f114175d;

    C45078br(PermissionSettingItem permissionSettingItem, Activity activity, C23543g gVar, String str) {
        this.f114172a = permissionSettingItem;
        this.f114173b = activity;
        this.f114174c = gVar;
        this.f114175d = str;
    }

    public final void run() {
        PermissionSettingItem permissionSettingItem = this.f114172a;
        Activity activity = this.f114173b;
        C23543g gVar = this.f114174c;
        String str = this.f114175d;
        if (permissionSettingItem.getVisibility() == 0 && !activity.isFinishing()) {
            View findViewById = permissionSettingItem.findViewById(R.id.c58);
            if (findViewById != null) {
                C10661a b = new C10661a(activity).mo19015b((int) R.string.b71);
                b.f28399d = activity.getResources().getColor(R.color.amr);
                C10660a a = b.mo19010a(3000).mo19013a(true).mo19014a();
                a.mo18997a(findViewById, 48, ((float) (a.mo19003d() - findViewById.getMeasuredWidth())) - C9432q.m18687b((Context) activity, 28.0f), (findViewById.getMeasuredWidth() - a.mo19003d()) + ((int) C9432q.m18687b((Context) activity, 20.0f)));
                gVar.mo48710b(str, true);
            }
        }
    }
}
