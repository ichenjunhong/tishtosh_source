package com.google.android.gms.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzaby;
import com.p683ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager;

public class MobileAdsInitProvider extends ContentProvider {

    /* renamed from: a */
    private final zzaby f38427a = new zzaby();

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.f38427a.query(uri, strArr, str, strArr2, str2);
    }

    public String getType(Uri uri) {
        return this.f38427a.getType(uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return this.f38427a.insert(uri, contentValues);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.f38427a.delete(uri, str, strArr);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.f38427a.update(uri, contentValues, str, strArr);
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SymphonyAdManager.m63648a().f69378b) {
            this.f38427a.attachInfo(context, providerInfo);
        }
    }

    public boolean onCreate() {
        if (!SymphonyAdManager.m63648a().f69378b) {
            return false;
        }
        return this.f38427a.onCreate();
    }
}
