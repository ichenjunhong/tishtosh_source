package com.p683ss.android.message;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p523c.C9393e;
import com.p683ss.android.message.log.C19492c;
import com.p683ss.android.message.p1191b.C19456b;
import com.p683ss.android.push.daemon.C19633c;
import com.p683ss.android.pushmanager.setting.C19710b;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import java.text.DateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/* renamed from: com.ss.android.message.MessageReceiver */
public class MessageReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private Handler f53594a = new Handler();

    public void onReceive(final Context context, Intent intent) {
        int i;
        if (context != null && intent != null) {
            final String action = intent.getAction();
            final Uri data = intent.getData();
            if (!"android.intent.action.DATE_CHANGED".equals(action)) {
                mo40463a(context.getApplicationContext(), action, data);
                return;
            }
            Context applicationContext = context.getApplicationContext();
            String str = "push_multi_process_config";
            if (VERSION.SDK_INT >= 11) {
                i = 4;
            } else {
                i = 0;
            }
            long j = C35807d.m80935a(applicationContext, str, i).getLong("date_change_delay_interval", 0);
            if (j > 0) {
                long nextFloat = (long) (new Random((long) UUID.randomUUID().hashCode()).nextFloat() * ((float) j));
                this.f53594a.postDelayed(new Runnable() {
                    public final void run() {
                        MessageReceiver.this.mo40463a(context.getApplicationContext(), action, data);
                    }
                }, nextFloat);
                m47481a(action, j, nextFloat);
            } else if (j == 0) {
                mo40463a(context.getApplicationContext(), action, data);
                m47481a(action, 0, 0);
            } else {
                m47481a(action, -1, -1);
            }
        }
    }

    /* renamed from: a */
    public final void mo40463a(final Context context, final String str, final Uri uri) {
        C9393e.submitRunnable(new Runnable() {
            public final void run() {
                String str;
                Context context = context;
                String str2 = str;
                Uri uri = uri;
                C19633c.m47982a(context).mo40945a();
                if (!TextUtils.isEmpty(str2) && (!"android.intent.action.BOOT_COMPLETED".equals(str2) || !C19710b.m48173a().mo41100i())) {
                    if (C19710b.m48173a().mo41093b()) {
                        try {
                            C19456b.m47610a(context);
                        } catch (Throwable unused) {
                        }
                    } else if ("android.intent.action.BOOT_COMPLETED".equals(str2)) {
                        try {
                            if (!C19710b.m48173a().mo41100i()) {
                                C19481h.m47695d(context);
                            }
                        } catch (Exception unused2) {
                        }
                    } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(str2)) {
                        try {
                            C19481h.m47695d(context);
                        } catch (Exception unused3) {
                        }
                    } else if ("android.intent.action.DATE_CHANGED".equals(str2)) {
                        try {
                            C19481h.m47695d(context);
                        } catch (Exception unused4) {
                        }
                    } else if ("android.intent.action.MEDIA_MOUNTED".equals(str2)) {
                        try {
                            C19481h.m47695d(context);
                        } catch (Exception unused5) {
                        }
                    } else if ("android.intent.action.MEDIA_UNMOUNTED".equals(str2)) {
                        try {
                            C19481h.m47695d(context);
                        } catch (Exception unused6) {
                        }
                    } else if ("android.intent.action.USER_PRESENT".equals(str2)) {
                        try {
                            C19481h.m47695d(context);
                        } catch (Exception unused7) {
                        }
                    } else if ("android.intent.action.SCREEN_OFF".equals(str2)) {
                        try {
                            C19481h.m47695d(context);
                        } catch (Exception unused8) {
                        }
                    } else if ("android.intent.action.SCREEN_ON".equals(str2)) {
                        try {
                            C19481h.m47695d(context);
                        } catch (Exception unused9) {
                        }
                    } else if ("android.intent.action.PACKAGE_ADDED".equals(str2)) {
                        try {
                            C19481h.m47695d(context);
                        } catch (Exception unused10) {
                        }
                    } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(str2)) {
                        try {
                            C19481h.m47695d(context);
                        } catch (Exception unused11) {
                        }
                    } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(str2)) {
                        try {
                            C19481h.m47695d(context);
                        } catch (Exception unused12) {
                        }
                    } else if ("android.intent.action.PACKAGE_REMOVED".equals(str2)) {
                        if (uri != null) {
                            try {
                                str = uri.getSchemeSpecificPart();
                            } catch (Exception unused13) {
                            }
                        } else {
                            str = null;
                        }
                        if (!C9431p.m18664a(str)) {
                            Intent b = C19481h.m47693b(context);
                            b.putExtra("remove_app", true);
                            b.putExtra("remove_app_package", str);
                            if (context == null || !(context instanceof Context) || !C40895d.m90464a(context, b)) {
                                context.startService(b);
                            }
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private static void m47481a(String str, long j, long j2) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("time", DateFormat.getDateTimeInstance().format(new Date()));
            bundle.putString("way", str);
            bundle.putLong("max_delay", j);
            bundle.putLong("real_delay", j2);
            C19492c.m47726a("push_alive", bundle);
        } catch (Throwable unused) {
        }
    }
}
