package com.p683ss.android.ugc.rhea.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Environment;
import android.text.TextUtils;
import com.p683ss.android.ugc.rhea.C50173b;
import com.p683ss.android.ugc.rhea.p2500b.C50175b;
import com.p683ss.android.ugc.rhea.p2502d.C50177a;
import com.p683ss.android.ugc.rhea.p2503e.C50178a;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import p2628d.p2638e.C52659i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.rhea.receiver.ControllerReceiver */
public final class ControllerReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        Object obj;
        String str;
        C52711k.m112240b(context, "context");
        if (intent != null) {
            obj = intent.getAction();
        } else {
            obj = null;
        }
        if (C52711k.m112239a(obj, (Object) "rhea_action_trace")) {
            C52711k.m112240b(context, "context");
            if (TextUtils.equals(C50173b.m108279a(), "manuallyMTrace")) {
                if (C50175b.m108281a()) {
                    C50175b.m108280a(context, false);
                } else {
                    C52711k.m112240b(context, "context");
                    C50175b.f125706a = true;
                    C50178a aVar = C50178a.f125718c;
                    SimpleDateFormat simpleDateFormat = C50178a.f125717b;
                    Calendar instance = Calendar.getInstance();
                    C52711k.m112236a((Object) instance, "Calendar.getInstance()");
                    String format = simpleDateFormat.format(instance.getTime());
                    C52711k.m112236a((Object) format, "DATE_FORMATTER.format(Calendar.getInstance().time)");
                    C52711k.m112240b(format, "fileName");
                    if (context != null) {
                        C52711k.m112240b(context, "context");
                        if (C50173b.f125703a) {
                            StringBuilder sb = new StringBuilder();
                            File filesDir = context.getFilesDir();
                            C52711k.m112236a((Object) filesDir, "context.filesDir");
                            sb.append(filesDir.getAbsolutePath());
                            sb.append("/rhea");
                            str = sb.toString();
                        } else if (VERSION.SDK_INT >= 19) {
                            StringBuilder sb2 = new StringBuilder();
                            File externalFilesDir = context.getExternalFilesDir("");
                            C52711k.m112236a((Object) externalFilesDir, "context.getExternalFilesDir(\"\")");
                            sb2.append(externalFilesDir.getAbsolutePath());
                            sb2.append("/rhea");
                            str = sb2.toString();
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            File externalStorageDirectory = Environment.getExternalStorageDirectory();
                            C52711k.m112236a((Object) externalStorageDirectory, "Environment.getExternalStorageDirectory()");
                            sb3.append(externalStorageDirectory.getPath());
                            sb3.append("/rhea");
                            str = sb3.toString();
                        }
                        File file = new File(str);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        StringBuilder sb4 = new StringBuilder("rhea_");
                        sb4.append(format);
                        sb4.append(".fake");
                        File file2 = new File(file, sb4.toString());
                        C50178a.f125716a = file2;
                        C52659i.m112202a(file2, "Version-1.0.0", null, 2, null);
                    }
                    C50177a.m108282a();
                }
            }
        } else if (C52711k.m112239a(obj, (Object) "rhea_action_stop_app")) {
            C52711k.m112240b(context, "context");
            if (TextUtils.equals(C50173b.m108279a(), "manuallyMTrace")) {
                C50175b.m108280a(context, true);
            }
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }
}
