package com.p683ss.android.ugc.aweme.livewallpaper;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.livewallpaper.p1928c.C36205c;
import com.p683ss.android.ugc.aweme.livewallpaper.p1928c.C36205c.C36209a;
import com.p683ss.android.ugc.aweme.livewallpaper.p1928c.C36212f;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.WallPaperDataProvider */
public class WallPaperDataProvider extends ContentProvider {

    /* renamed from: a */
    public static final String f92626a = "com.ss.android.ugc.trill.wallpapercaller";

    /* renamed from: b */
    public static final Uri f92627b;

    /* renamed from: c */
    public static final Uri f92628c;

    /* renamed from: d */
    public static final Uri f92629d;

    /* renamed from: e */
    public static final Uri f92630e;

    /* renamed from: f */
    public static final Uri f92631f;

    /* renamed from: g */
    public static final Uri f92632g;

    /* renamed from: h */
    private UriMatcher f92633h;

    /* renamed from: i */
    private Handler f92634i;

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean onCreate() {
        this.f92633h = new UriMatcher(-1);
        if (!TextUtils.isEmpty(f92626a)) {
            this.f92633h.addURI(f92626a, "video_path", 16);
            this.f92633h.addURI(f92626a, "fall_back_video_path", 32);
            this.f92633h.addURI(f92626a, "set_wp_result", 48);
            this.f92633h.addURI(f92626a, "video_width", 64);
            this.f92633h.addURI(f92626a, "video_height", 80);
            this.f92633h.addURI(f92626a, "source", 96);
        }
        this.f92634i = new Handler(Looper.getMainLooper());
        return false;
    }

    static {
        StringBuilder sb = new StringBuilder("content://");
        sb.append(f92626a);
        sb.append("/video_path");
        f92627b = Uri.parse(sb.toString());
        StringBuilder sb2 = new StringBuilder("content://");
        sb2.append(f92626a);
        sb2.append("/video_width");
        f92628c = Uri.parse(sb2.toString());
        StringBuilder sb3 = new StringBuilder("content://");
        sb3.append(f92626a);
        sb3.append("/video_height");
        f92629d = Uri.parse(sb3.toString());
        StringBuilder sb4 = new StringBuilder("content://");
        sb4.append(f92626a);
        sb4.append("/fall_back_video_path");
        f92630e = Uri.parse(sb4.toString());
        StringBuilder sb5 = new StringBuilder("content://");
        sb5.append(f92626a);
        sb5.append("/set_wp_result");
        f92631f = Uri.parse(sb5.toString());
        StringBuilder sb6 = new StringBuilder("content://");
        sb6.append(f92626a);
        sb6.append("/source");
        f92632g = Uri.parse(sb6.toString());
    }

    public String getType(Uri uri) {
        int match = this.f92633h.match(uri);
        if (match == 16) {
            return C36205c.m81710a().f92687d.getVideoPath();
        }
        if (match == 32) {
            return C36212f.m81743b();
        }
        if (match == 64) {
            return String.valueOf(C36205c.m81710a().f92687d.getWidth());
        }
        if (match == 80) {
            return String.valueOf(C36205c.m81710a().f92687d.getHeight());
        }
        if (match != 96) {
            return "";
        }
        return C36205c.m81710a().f92687d.getSource();
    }

    public Uri insert(Uri uri, final ContentValues contentValues) {
        if (!(contentValues == null || contentValues.size() == 0 || this.f92633h.match(uri) != 48)) {
            this.f92634i.post(new Runnable() {
                public final void run() {
                    boolean z;
                    if (contentValues.getAsBoolean("result") != null) {
                        z = contentValues.getAsBoolean("result").booleanValue();
                    } else {
                        z = false;
                    }
                    String asString = contentValues.getAsString("source");
                    String asString2 = contentValues.getAsString("message");
                    C36205c a = C36205c.m81710a();
                    if (a.f92688e.size() != 0) {
                        C36209a aVar = (C36209a) a.f92688e.get(asString);
                        if (aVar != null) {
                            aVar.mo74955a(z, asString2);
                        }
                    }
                }
            });
        }
        return null;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        String str2 = "";
        int match = this.f92633h.match(uri);
        if (match == 16) {
            str2 = C36205c.m81710a().f92687d.getVideoPath();
        } else if (match == 32) {
            str2 = C36212f.m81743b();
        }
        try {
            return ParcelFileDescriptor.open(new File(str2), 268435456);
        } catch (Exception unused) {
            return null;
        }
    }
}
