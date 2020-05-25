package com.p683ss.android.ugc.aweme.login.smartisan;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.login.smartisan.SmartisanContentProvider */
public final class SmartisanContentProvider extends ContentProvider {

    /* renamed from: a */
    public static final C36307a f92916a = new C36307a(null);

    /* renamed from: com.ss.android.ugc.aweme.login.smartisan.SmartisanContentProvider$a */
    public static final class C36307a {
        private C36307a() {
        }

        public /* synthetic */ C36307a(C52707g gVar) {
            this();
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return "";
    }

    public final boolean onCreate() {
        return false;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return Uri.EMPTY;
    }

    public final Bundle call(String str, String str2, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (str != null && str.hashCode() == -42774193 && str.equals("sync_douyin_session")) {
            C36308a.m81948a("sync_session_from_smatisan");
        }
        return bundle2;
    }
}
