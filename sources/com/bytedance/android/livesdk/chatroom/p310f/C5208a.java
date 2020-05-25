package com.bytedance.android.livesdk.chatroom.p310f;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C8805i;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.f.a */
public final class C5208a {
    /* renamed from: a */
    public static void m11808a(final Activity activity, final String str, final C8805i iVar) {
        Builder builder = new Builder(activity);
        SpannableString spannableString = new SpannableString(activity.getString(R.string.eeo));
        spannableString.setSpan(new ForegroundColorSpan(activity.getResources().getColor(R.color.ahc)), 1, 16, 33);
        TextView textView = new TextView(activity);
        textView.setTextSize(18.0f);
        textView.setText(spannableString);
        textView.setPadding(C3922z.m9899a(30.0f), C3922z.m9899a(20.0f), C3922z.m9899a(30.0f), C3922z.m9899a(10.0f));
        textView.setTextColor(-16777216);
        textView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
            }
        });
        builder.setCustomTitle(textView).setNegativeButton(R.string.eem, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).setPositiveButton(R.string.een, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                Activity activity = activity;
                String str = str;
                TTLiveSDKContext.getHostService().mo10310c().startBindMobileFullFragment(activity, "live_detail", "live_detail", iVar);
                HashMap hashMap = new HashMap();
                hashMap.put("bind_page_source", str);
                C8049c.m15979a().mo14202a("livesdk_phone_bind_page_show", hashMap, new C8059j(), Room.class);
            }
        }).setCancelable(false);
        AlertDialog create = builder.create();
        create.show();
        create.getButton(-1).setTextColor(activity.getResources().getColor(R.color.ahc));
        create.getButton(-2).setTextColor(activity.getResources().getColor(R.color.agn));
    }
}
