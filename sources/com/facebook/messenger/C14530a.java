package com.facebook.messenger;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.C14533n;
import com.facebook.internal.C14324k;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.messenger.a */
public final class C14530a {
    /* renamed from: a */
    public static boolean m29755a(Context context) {
        return C14324k.m29377a(context, "com.facebook.orca");
    }

    /* renamed from: b */
    public static void m29756b(Context context) {
        try {
            m29754a(context, "market://details?id=com.facebook.orca");
        } catch (ActivityNotFoundException unused) {
            m29754a(context, "http://play.google.com/store/apps/details?id=com.facebook.orca");
        }
    }

    /* renamed from: c */
    private static Set<Integer> m29757c(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        HashSet hashSet = new HashSet();
        Cursor query = contentResolver.query(Uri.parse("content://com.facebook.orca.provider.MessengerPlatformProvider/versions"), new String[]{C42311c.f106863g}, null, null, null);
        if (query != null) {
            try {
                int columnIndex = query.getColumnIndex(C42311c.f106863g);
                while (query.moveToNext()) {
                    hashSet.add(Integer.valueOf(query.getInt(columnIndex)));
                }
            } finally {
                query.close();
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    private static void m29754a(Context context, String str) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* renamed from: a */
    public static void m29753a(Activity activity, int i, C14531b bVar) {
        if (!m29755a(activity)) {
            m29756b(activity);
            return;
        }
        if (m29757c(activity).contains(Integer.valueOf(20150314))) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setFlags(1);
                intent.setPackage("com.facebook.orca");
                intent.putExtra("android.intent.extra.STREAM", bVar.f37745d);
                intent.setType(bVar.f37746e);
                String k = C14533n.m29777k();
                if (k != null) {
                    intent.putExtra("com.facebook.orca.extra.PROTOCOL_VERSION", 20150314);
                    intent.putExtra("com.facebook.orca.extra.APPLICATION_ID", k);
                    intent.putExtra("com.facebook.orca.extra.METADATA", bVar.f37747f);
                    intent.putExtra("com.facebook.orca.extra.EXTERNAL_URI", bVar.f37748g);
                }
                activity.startActivityForResult(intent, 12306);
            } catch (ActivityNotFoundException unused) {
                activity.startActivity(activity.getPackageManager().getLaunchIntentForPackage("com.facebook.orca"));
            }
        } else {
            m29756b(activity);
        }
    }
}
