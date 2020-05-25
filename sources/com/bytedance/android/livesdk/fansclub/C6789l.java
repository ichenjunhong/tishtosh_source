package com.bytedance.android.livesdk.fansclub;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
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
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4577ap;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdk.p399o.p401b.C8042k;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.bytedance.android.livesdk.fansclub.l */
final /* synthetic */ class C6789l implements OnClickListener {

    /* renamed from: a */
    private final LiveFansClubEntryWidget f18592a;

    /* renamed from: b */
    private final String f18593b;

    C6789l(LiveFansClubEntryWidget liveFansClubEntryWidget, String str) {
        this.f18592a = liveFansClubEntryWidget;
        this.f18593b = str;
    }

    public final void onClick(View view) {
        LiveFansClubEntryWidget liveFansClubEntryWidget = this.f18592a;
        String str = this.f18593b;
        if (TTLiveSDKContext.getHostService().mo10308a().isNeedProtectUnderage()) {
            C4575an.m10981a((int) R.string.epj);
            return;
        }
        String str2 = (liveFansClubEntryWidget.f18571d == null || liveFansClubEntryWidget.f18571d.getFansClub() == null) ? "0" : "1";
        C8038g a = C8049c.m15979a().mo14201a(C8059j.class);
        if (a instanceof C8042k) {
            C8042k kVar = (C8042k) a;
            if (kVar.mo14192a().containsKey("enter_from")) {
                kVar.mo14192a().get("enter_from");
            }
            if (kVar.mo14192a().containsKey("source")) {
                kVar.mo14192a().get("source");
            }
            HashMap hashMap = new HashMap();
            String str3 = (String) hashMap.get("enter_from_merge");
            String str4 = (String) hashMap.get("enter_method");
            if (TextUtils.isEmpty(str3) && kVar.mo14192a().containsKey("enter_from_merge")) {
                str3 = (String) kVar.mo14192a().get("enter_from_merge");
                if (str3 == null) {
                    str3 = "";
                }
            }
            if (TextUtils.isEmpty(str4) && kVar.mo14192a().containsKey("enter_method")) {
                str4 = (String) kVar.mo14192a().get("enter_method");
                if (str4 == null) {
                    str4 = "";
                }
            }
            liveFansClubEntryWidget.f18576i = ((Boolean) liveFansClubEntryWidget.dataCenter.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
            String str5 = C6781d.f18584a;
            if (C6780c.m14218a(liveFansClubEntryWidget.f18576i)) {
                str5 = C6781d.f18585b;
            }
            int i = 8;
            String a2 = C2240a.m6773a(Locale.US, str5, new Object[]{Long.valueOf(liveFansClubEntryWidget.f18570c.getId()), Long.valueOf(liveFansClubEntryWidget.f18570c.getOwner().getId()), Long.valueOf(TTLiveSDKContext.getHostService().mo10315h().mo14529b()), str, str3, str4, "top", str2});
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append("&request_page=fans_club_entrance");
            String sb2 = sb.toString();
            if (C6780c.m14218a(liveFansClubEntryWidget.f18576i)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append("&web_bg_color=%2300000000");
                sb2 = sb3.toString();
            }
            boolean booleanValue = ((Boolean) liveFansClubEntryWidget.dataCenter.get("data_is_portrait", Boolean.valueOf(true))).booleanValue();
            DisplayMetrics displayMetrics = liveFansClubEntryWidget.context.getResources().getDisplayMetrics();
            int i2 = (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
            int i3 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
            if (booleanValue) {
                i3 = C6780c.m14218a(liveFansClubEntryWidget.f18576i) ? (int) (((float) i3) * 0.85f) : FansService.FANS_GROUP_DIALOG_HEIGHT;
            } else {
                i2 = C9432q.m18692c(liveFansClubEntryWidget.getContext(), (float) C4577ap.m10991a(liveFansClubEntryWidget.getContext()));
            }
            if (liveFansClubEntryWidget.f18569b != null) {
                liveFansClubEntryWidget.f18569b.dismissAllowingStateLoss();
                liveFansClubEntryWidget.f18569b = null;
            }
            C4700b b = C4704c.m11226a(sb2).mo10510a(i2).mo10514b(i3).mo10512a("live_fans_club").mo10511a(8, 8, booleanValue ? 0 : 8, booleanValue ? 0 : 8).mo10515b(!booleanValue);
            if (booleanValue) {
                i = 0;
            }
            C4700b c = b.mo10516c(i).mo10520e(booleanValue ? 80 : 8388613).mo10517c(false);
            if (C6780c.m14218a(liveFansClubEntryWidget.f18576i)) {
                c.mo10521f(0);
            }
            liveFansClubEntryWidget.f18569b = C4514j.m10883j().mo10322c().mo10487a(c);
            if (liveFansClubEntryWidget.f18569b != null) {
                C4642b.m11130a().mo10428b();
                C4104a.m10232a((FragmentActivity) liveFansClubEntryWidget.context, liveFansClubEntryWidget.f18569b);
                liveFansClubEntryWidget.f18569b.f11296d = new OnDismissListener() {
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C4642b.m11130a().mo10429c();
                    }
                };
            }
        }
    }
}
