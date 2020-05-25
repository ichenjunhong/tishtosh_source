package com.p683ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnShowListener;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.experiment.ShowPushPrePermissionViewMaxTimesExperiment;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.main.C36633eb;
import com.p683ss.android.ugc.aweme.utils.notification.LaunchNotificationGuide;
import com.p683ss.android.ugc.aweme.utils.notification.NotificationGuideInterval;
import com.p683ss.android.ugc.aweme.utils.notification.PublishNotificationGuide;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.utils.dn */
public final class C47819dn extends C47818dm {

    /* renamed from: a */
    public static boolean f120368a;

    /* renamed from: com.ss.android.ugc.aweme.utils.dn$a */
    public interface C47823a {
        /* renamed from: a */
        void mo75626a();
    }

    /* renamed from: a */
    private static int m103463a() {
        int a = C10181b.m20511a().mo18168a(ShowPushPrePermissionViewMaxTimesExperiment.class, true, "show_push_pre_permission_view_max_times", 31744, 1);
        if (a <= 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: b */
    static void m103468b(int i) {
        if (i == 1) {
            C36633eb.m82523a().storeInt("publish_show_times", C36633eb.m82525b(0) + 1);
        } else {
            C36633eb.m82523a().storeInt("launch_show_times", C36633eb.m82521a(0) + 1);
        }
        C36633eb.m82523a().storeLong("show_last_time", System.currentTimeMillis());
    }

    /* renamed from: a */
    public static boolean m103466a(int i) {
        if (f120368a) {
            return false;
        }
        long a = C36633eb.m82522a(0);
        if (a == 0 || System.currentTimeMillis() - a < TimeUnit.DAYS.toMillis(3)) {
            return false;
        }
        if (System.currentTimeMillis() - C36633eb.m82526b(0) < TimeUnit.DAYS.toMillis((long) C10193n.m20607a().mo18200a(NotificationGuideInterval.class, "push_guide_interval", C10181b.m20511a().mo18175c().getPushGuideInterval(), 7))) {
            return false;
        }
        if (i == 1) {
            if (C36633eb.m82525b(0) >= C10193n.m20607a().mo18200a(PublishNotificationGuide.class, "max_publish_push_guide", C10181b.m20511a().mo18175c().getMaxPublishPushGuide(), 2)) {
                return false;
            }
        } else if (C36633eb.m82521a(0) >= C10193n.m20607a().mo18200a(LaunchNotificationGuide.class, "max_launch_push_guide", C10181b.m20511a().mo18175c().getMaxLaunchPushGuide(), 2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m103467a(Context context, boolean z) {
        SharedPreferences a = C35807d.m80935a(context, "NotificationGuide", 0);
        if (C47818dm.m103457a(context)) {
            return false;
        }
        if (z) {
            return true;
        }
        if (a.getInt("guide_show_times", 0) >= m103463a()) {
            return false;
        }
        if (System.currentTimeMillis() - a.getLong("guide_last_time", 0) < ((long) m103463a()) * 60000) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m103465a(Context context, boolean z, boolean z2) {
        m103464a(context, true, null, null, true);
    }

    /* renamed from: a */
    public static void m103464a(Context context, boolean z, Runnable runnable, C47823a aVar, boolean z2) {
        if (!m103467a(context, z) || VERSION.SDK_INT < 21) {
            if (aVar != null) {
                aVar.mo75626a();
            }
            return;
        }
        try {
            if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                final Context context2 = context;
                final boolean z3 = z;
                final boolean z4 = z2;
                final C47823a aVar2 = aVar;
                C478212 r0 = new Runnable(null) {
                    public final void run() {
                        AlertDialog alertDialog;
                        Dialog dialog;
                        String str;
                        Activity activity = (Activity) context2;
                        C47827dr drVar = new C47827dr(context2, z3, null);
                        C47828ds dsVar = new C47828ds(z3, context2, null);
                        C10641a aVar = null;
                        if (z4) {
                            alertDialog = new Builder(context2).setTitle(R.string.dh5).setMessage(R.string.dh8).setPositiveButton(R.string.dh7, drVar).setNegativeButton(R.string.dh6, dsVar).create();
                        } else {
                            C10643a c = new C10643a(context2).mo18907c(R.drawable.cqe);
                            Context context = context2;
                            String str2 = (String) SharePrefCache.inst().getRequestNotificationTitle().mo47782d();
                            if (TextUtils.isEmpty(str2)) {
                                str2 = context.getString(R.string.e0e);
                            }
                            C10643a a = c.mo18892a(str2);
                            Context context2 = context2;
                            if (z3) {
                                str = context2.getString(R.string.aou);
                            } else {
                                String str3 = (String) SharePrefCache.inst().getRequestNotificationText().mo47782d();
                                if (TextUtils.isEmpty(str3)) {
                                    str = context2.getString(R.string.aot);
                                } else {
                                    str = str3;
                                }
                            }
                            aVar = a.mo18902b(str).mo18887a((int) R.string.v8, (OnClickListener) drVar, true).mo18901b((int) R.string.bvw, (OnClickListener) dsVar, true).mo18897a();
                            alertDialog = 0;
                        }
                        if (!activity.isFinishing()) {
                            if (alertDialog != 0) {
                                try {
                                    alertDialog.setOnShowListener(new OnShowListener() {
                                        public final void onShow(DialogInterface dialogInterface) {
                                            if (dialogInterface instanceof AlertDialog) {
                                                AlertDialog alertDialog = (AlertDialog) dialogInterface;
                                                alertDialog.getButton(-1).setTextColor(-16777216);
                                                alertDialog.getButton(-2).setTextColor(-16777216);
                                            }
                                        }
                                    });
                                    alertDialog.show();
                                    dialog = alertDialog;
                                } catch (Exception unused) {
                                }
                            } else {
                                dialog = aVar.mo18883c();
                            }
                            dialog.setCanceledOnTouchOutside(false);
                            dialog.setOnDismissListener(new C47829dt(aVar2));
                            if (z3) {
                                C26890h.m65011a("notification_setting_alert_show", C23089d.m56640a().mo47829a("enter_from", "notification_setting_page").f61491a);
                            } else {
                                C26890h.m65011a("push_pre_permission_show", C23089d.m56640a().f61491a);
                            }
                        }
                    }
                };
                C18842a.m45934b(r0);
                C36633eb.m82524a(true);
            }
        } catch (Exception unused) {
        }
    }
}
