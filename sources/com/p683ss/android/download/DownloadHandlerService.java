package com.p683ss.android.download;

import android.app.Service;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.text.TextUtils;
import android.widget.Toast;
import com.p683ss.android.download.p1161b.C19096c.C19097a;

/* renamed from: com.ss.android.download.DownloadHandlerService */
public class DownloadHandlerService extends Service {

    /* renamed from: a */
    C19138v f52514a;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
    }

    /* renamed from: a */
    private static void m46453a(Context context, long j) {
        if (!C19132q.m46638a(context, j, 268435456, true)) {
            C19093b.m46510a(Toast.makeText(context, "Open Fail!", 0));
        }
    }

    /* renamed from: a */
    private void m46454a(Context context, Intent intent) {
        String action = intent.getAction();
        try {
            if ("android.ss.intent.action.DOWNLOAD_DELETE".equals(action)) {
                Uri data = intent.getData();
                Intent intent2 = new Intent(context, DownloadDeleteActivity.class);
                intent2.setData(data);
                intent2.addFlags(268435456);
                context.startActivity(intent2);
                C19109e.m46560a(context).mo39043a(context, ContentUris.parseId(intent.getData()));
            } else if ("android.ss.intent.action.DOWNLOAD_OPEN".equals(action)) {
                long parseId = ContentUris.parseId(intent.getData());
                m46453a(context, parseId);
                C19109e.m46560a(context).mo39043a(context, parseId);
            } else {
                if ("android.ss.intent.action.DOWNLOAD_HIDE".equals(action)) {
                    C19109e.m46560a(context).mo39043a(context, ContentUris.parseId(intent.getData()));
                }
            }
        } catch (Exception unused) {
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f52514a == null) {
            this.f52514a = C19133r.m46640a((Context) this);
        }
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            if (action.equals("android.ss.intent.action.DOWNLOAD_WAKEUP")) {
                DownloadService.m46455a((Context) this);
            } else if (action.equals("android.ss.intent.action.DOWNLOAD_OPEN") || action.equals("android.ss.intent.action.DOWNLOAD_DELETE") || action.equals("android.ss.intent.action.DOWNLOAD_HIDE")) {
                m46454a((Context) this, intent);
            } else if (action.equals("android.ss.intent.action.DOWNLOAD_CLICK")) {
                long parseId = ContentUris.parseId(intent.getData());
                String stringExtra = intent.getStringExtra("extra_notification_tag");
                int a = C19105d.m46543a((Context) this).mo39032a(parseId);
                if (a >= 0) {
                    C19105d.m46546a(this, C19105d.m46542a(a), parseId);
                    if (C19097a.m46515c(a)) {
                        C19109e.m46560a((Context) this).mo39043a((Context) this, parseId);
                        C19109e.m46560a((Context) this).mo39045a(stringExtra);
                    }
                }
            } else if (action.equals("android.ss.intent.action.DOWNLOAD_COMPLETE")) {
                long longExtra = intent.getLongExtra("extra_download_id", -1);
                if (!C19109e.m46560a((Context) this).mo39047a(longExtra)) {
                    int intExtra = intent.getIntExtra("extra_download_visibility", 1);
                    if (longExtra > -1 && intExtra != 2) {
                        C19132q.m46638a(this, longExtra, 268435456, false);
                    }
                }
            }
        }
        stopSelf();
        return 2;
    }
}
