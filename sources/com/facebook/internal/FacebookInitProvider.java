package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.keva.Keva;
import com.facebook.C14533n;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;

public final class FacebookInitProvider extends ContentProvider {

    /* renamed from: a */
    private static final String f37171a = "FacebookInitProvider";

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: a */
    public final boolean mo26465a() {
        try {
            C14533n.m29760a(getContext());
        } catch (Exception unused) {
        }
        return false;
    }

    public final boolean onCreate() {
        Keva repo = Keva.getRepo("ab_repo_cold_boot");
        if (repo == null || !repo.getBoolean("is_close_facebook_init_coldBoot", false)) {
            C26890h.m65011a("FacebookInitProviderLan", C23089d.m56640a().mo47828a("is_close_facebook_init_coldBoot", (Object) Boolean.valueOf(repo.getBoolean("is_close_facebook_init_coldBoot", false))).f61491a);
            return mo26465a();
        }
        C26890h.m65011a("FacebookInitProviderLan", C23089d.m56640a().mo47828a("is_close_facebook_init_coldBoot", (Object) Boolean.valueOf(repo.getBoolean("is_close_facebook_init_coldBoot", false))).f61491a);
        return false;
    }
}
