package com.p683ss.android.ugc.aweme.poi.utils;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.e */
public final class C39444e {
    /* renamed from: a */
    public static boolean m87713a() {
        Keva repo = Keva.getRepo("poi_repo");
        if (repo != null) {
            return repo.getBoolean("has_show_location_permission_tip_dialog", false);
        }
        return true;
    }

    /* renamed from: a */
    public static void m87712a(boolean z) {
        Keva repo = Keva.getRepo("poi_repo");
        if (repo != null) {
            repo.storeBoolean("has_show_location_permission_tip_dialog", z);
        }
    }

    /* renamed from: a */
    public static void m87711a(Context context, OnClickListener onClickListener, OnClickListener onClickListener2) {
        Builder builder = new Builder(context, R.style.s8);
        builder.setTitle(R.string.c14);
        builder.setMessage(R.string.c12);
        builder.setPositiveButton(R.string.c0w, onClickListener);
        builder.setNegativeButton(R.string.c13, onClickListener2);
        builder.show();
    }
}
