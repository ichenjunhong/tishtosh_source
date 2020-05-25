package com.bytedance.android.livesdk.chatroom.p310f;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;

/* renamed from: com.bytedance.android.livesdk.chatroom.f.s */
public final class C5234s {
    /* renamed from: a */
    public static boolean m11849a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        if (bundle.getBoolean("live.intent.extra.FROM_NEW_STYLE", false)) {
            return true;
        }
        Bundle bundle2 = bundle.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
        if (bundle2 == null || !bundle2.getBoolean("live.intent.extra.FROM_NEW_STYLE", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static String m11851b(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("live.intent.extra.FROM_NEW_STYLE_SOURCE", "");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        Bundle bundle2 = bundle.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
        if (bundle2 != null) {
            string = bundle2.getString("live.intent.extra.FROM_NEW_STYLE_SOURCE", "");
        }
        return string;
    }

    /* renamed from: a */
    public static boolean m11850a(DataCenter dataCenter) {
        if (dataCenter == null || !((Boolean) dataCenter.get("data_live_new_feed_style", Boolean.valueOf(false))).booleanValue() || !((Boolean) dataCenter.get("data_is_portrait", Boolean.valueOf(true))).booleanValue() || !TextUtils.equals("message", (CharSequence) dataCenter.get("data_live_new_feed_style_from", ""))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m11852b(DataCenter dataCenter) {
        if (dataCenter == null || !((Boolean) dataCenter.get("data_live_new_feed_style", Boolean.valueOf(false))).booleanValue() || !((Boolean) dataCenter.get("data_is_portrait", Boolean.valueOf(true))).booleanValue() || !TextUtils.equals("homepage_hot", (CharSequence) dataCenter.get("data_live_new_feed_style_from", ""))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m11848a(boolean z, Bundle bundle) {
        C8038g a = C8049c.m15979a().mo14201a(Room.class);
        if (m11849a(bundle) && a != null) {
            String str = "full_screen";
            if (z && bundle.containsKey("live.intent.extra.WINDOW_MODE")) {
                str = bundle.getString("live.intent.extra.WINDOW_MODE", "full_screen");
            }
            a.mo14194a("live_window_mode", str);
        }
    }
}
