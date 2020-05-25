package com.p683ss.android.ugc.aweme.p1797h;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.h.d */
public final class C32948d {
    /* renamed from: a */
    private static float m75851a(Resources resources, float f) {
        return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    /* renamed from: a */
    public static void m75854a(Context context, String str) {
        if (context != null) {
            C26890h.m65011a("phone_bundling_click", C23089d.m56640a().mo47829a("enter_from", str).f61491a);
            C20854a.m53165e().bindMobile((Activity) context, str, null, null);
        }
    }

    /* renamed from: a */
    public static TextView m75852a(Context context, int i) {
        SpannableString spannableString = new SpannableString(context.getString(i));
        spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.ss)), 1, 16, 33);
        DmtTextView dmtTextView = new DmtTextView(context);
        dmtTextView.setTextSize(18.0f);
        dmtTextView.setText(spannableString);
        dmtTextView.setPadding((int) m75851a(context.getResources(), 30.0f), (int) m75851a(context.getResources(), 20.0f), (int) m75851a(context.getResources(), 30.0f), (int) m75851a(context.getResources(), 10.0f));
        dmtTextView.setTextColor(-16777216);
        dmtTextView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                Context context = view.getContext();
                String str = "";
                if (!TextUtils.isEmpty(str)) {
                    SmartRouter.buildRoute(context, "//webview/").withParam("url", (Parcelable) Uri.parse(str)).withParam("bundle_webview_background", context.getResources().getColor(R.color.as0)).withParam("hide_status_bar", true).open();
                }
            }
        });
        return dmtTextView;
    }

    /* renamed from: a */
    public static void m75853a(final Context context, int i, final Runnable runnable, final String str) {
        Builder builder = new Builder(context);
        builder.setCustomTitle(m75852a(context, i)).setNegativeButton(R.string.rj, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                runnable.run();
            }
        }).setPositiveButton(R.string.rm, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C32948d.m75854a(context, str);
            }
        }).setCancelable(false);
        AlertDialog create = builder.create();
        create.show();
        C26890h.m65011a("phone_bundling_show", C23089d.m56640a().mo47829a("enter_from", str).f61491a);
        create.getButton(-1).setTextColor(context.getResources().getColor(R.color.ss));
        create.getButton(-2).setTextColor(context.getResources().getColor(R.color.a8d));
    }
}
