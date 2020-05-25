package com.bytedance.android.livesdk.chatroom.widget;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.net.Uri;
import android.support.p030v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import com.C2240a;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.livesdk.C4642b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4700b;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.fans.FansService;
import com.bytedance.android.livesdk.fansclub.C6780c;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4577ap;
import com.bytedance.android.livesdk.p279af.C4600j;
import com.bytedance.android.livesdk.p282ag.p283a.C4627a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.common.utility.C9432q;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.af */
final /* synthetic */ class C6648af implements OnClickListener {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f18154a;

    C6648af(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f18154a = liveRoomUserInfoWidget;
    }

    public final void onClick(View view) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f18154a;
        String str = "fans_club_button";
        String str2 = LiveRoomUserInfoWidget.f18056b;
        if (C6780c.m14218a(liveRoomUserInfoWidget.f18081e)) {
            str2 = LiveRoomUserInfoWidget.f18057c;
        }
        Locale locale = Locale.US;
        int i = 8;
        Object[] objArr = new Object[8];
        objArr[0] = Long.valueOf(liveRoomUserInfoWidget.f18080d.getId());
        boolean z = true;
        objArr[1] = Long.valueOf(liveRoomUserInfoWidget.f18080d.getOwner().getId());
        objArr[2] = Long.valueOf(TTLiveSDKContext.getHostService().mo10315h().mo14529b());
        objArr[3] = liveRoomUserInfoWidget.f18082f;
        objArr[4] = "";
        objArr[5] = "top";
        objArr[6] = liveRoomUserInfoWidget.f18093q ? "1" : "0";
        objArr[7] = Integer.valueOf(C4627a.m11090a(TTLiveSDKContext.getHostService().mo10315h().mo14521a()));
        String a = C2240a.m6773a(locale, str2, objArr);
        if (C6780c.m14218a(liveRoomUserInfoWidget.f18081e)) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("&web_bg_color=%2300000000");
            a = sb.toString();
        }
        Uri build = Uri.parse(a).buildUpon().appendQueryParameter("request_page", str).build();
        if (C4600j.m11043d(liveRoomUserInfoWidget.dataCenter) || C4600j.m11040b(liveRoomUserInfoWidget.dataCenter)) {
            build = build.buildUpon().appendQueryParameter("live_ad", new JSONObject(C4600j.m11040b(liveRoomUserInfoWidget.dataCenter) ? C4600j.m11041c(liveRoomUserInfoWidget.dataCenter) : C4600j.m11044e(liveRoomUserInfoWidget.dataCenter)).toString()).build();
        }
        String uri = build.toString();
        boolean booleanValue = liveRoomUserInfoWidget.dataCenter != null ? ((Boolean) liveRoomUserInfoWidget.dataCenter.get("data_is_portrait")).booleanValue() : true;
        DisplayMetrics displayMetrics = liveRoomUserInfoWidget.context.getResources().getDisplayMetrics();
        int i2 = (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
        int i3 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (booleanValue) {
            i3 = C6780c.m14218a(liveRoomUserInfoWidget.f18081e) ? (int) (((float) i3) * 0.85f) : FansService.FANS_GROUP_DIALOG_HEIGHT;
        } else {
            i2 = C9432q.m18692c(liveRoomUserInfoWidget.getContext(), (float) C4577ap.m10991a(liveRoomUserInfoWidget.getContext()));
        }
        if (liveRoomUserInfoWidget.f18094r != null) {
            liveRoomUserInfoWidget.f18094r.dismissAllowingStateLoss();
            liveRoomUserInfoWidget.f18094r = null;
        }
        C4700b a2 = C4704c.m11226a(uri).mo10510a(i2).mo10514b(i3).mo10511a(8, 8, booleanValue ? 0 : 8, booleanValue ? 0 : 8);
        if (booleanValue) {
            z = false;
        }
        C4700b b = a2.mo10515b(z);
        if (booleanValue) {
            i = 0;
        }
        C4700b e = b.mo10516c(i).mo10520e(booleanValue ? 80 : 8388613);
        if (C6780c.m14218a(liveRoomUserInfoWidget.f18081e)) {
            e.mo10521f(0);
            e.mo10517c(false);
        }
        liveRoomUserInfoWidget.f18094r = C4514j.m10883j().mo10322c().mo10487a(e);
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", liveRoomUserInfoWidget.f18080d != null ? String.valueOf(liveRoomUserInfoWidget.f18080d.getOwnerUserId()) : "0");
        hashMap.put("room_id", liveRoomUserInfoWidget.f18080d != null ? String.valueOf(liveRoomUserInfoWidget.f18080d.getId()) : "0");
        C8049c.m15979a().mo14202a("livesdk_fans_club_entrance_click", hashMap, new Object[0]);
        if (liveRoomUserInfoWidget.f18094r != null) {
            C4642b.m11130a().mo10428b();
            C4104a.m10232a((FragmentActivity) liveRoomUserInfoWidget.context, liveRoomUserInfoWidget.f18094r);
            liveRoomUserInfoWidget.f18094r.f11296d = new OnDismissListener() {
                public final void onDismiss(DialogInterface dialogInterface) {
                    C4642b.m11130a().mo10429c();
                }
            };
        }
        if (liveRoomUserInfoWidget.f18094r != null) {
            C8049c.m15979a().mo14203a("livesdk_fans_club_audience_open", new Object[0]);
        }
    }
}
