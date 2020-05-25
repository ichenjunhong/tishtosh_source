package com.igexin.download;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.p683ss.android.message.C19481h;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;

public class DownloadProvider extends ContentProvider {

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_push_downgrade_StartServiceLancet_startService */
        static ComponentName m44337x297a088e(Context context, Intent intent) {
            if (context == null || !(context instanceof Context)) {
                return context.startService(intent);
            }
            if (C40895d.m90464a(context, intent)) {
                return null;
            }
            return context.startService(intent);
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return false;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            Intent intent = new Intent(getContext(), C19481h.m47691a());
            intent.setAction("com.ss.android.message.action.PUSH_SERVICE");
            intent.setPackage(getContext().getPackageName());
            _lancet.m44337x297a088e(getContext(), intent);
        } catch (Throwable unused) {
        }
        return null;
    }
}
