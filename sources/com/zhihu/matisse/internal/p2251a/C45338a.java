package com.zhihu.matisse.internal.p2251a;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.provider.MediaStore.Files;
import android.support.p030v4.content.C0727d;
import com.zhihu.matisse.internal.entity.Album;

/* renamed from: com.zhihu.matisse.internal.a.a */
public final class C45338a extends C0727d {

    /* renamed from: v */
    public static final String[] f114623v = {"1", "3"};

    /* renamed from: w */
    private static final Uri f114624w = Files.getContentUri("external");

    /* renamed from: x */
    private static final String[] f114625x = {"_id", "bucket_id", "bucket_display_name", "_data", "count"};

    /* renamed from: y */
    private static final String[] f114626y = {"_id", "bucket_id", "bucket_display_name", "_data", "COUNT(*) AS count"};

    /* renamed from: p */
    public final void mo2398p() {
    }

    /* renamed from: f */
    public final Cursor mo2371d() {
        int i;
        Cursor f = super.mo2371d();
        MatrixCursor matrixCursor = new MatrixCursor(f114625x);
        String str = "";
        if (f != null) {
            i = 0;
            while (f.moveToNext()) {
                i += f.getInt(f.getColumnIndex("count"));
            }
            if (f.moveToFirst()) {
                str = f.getString(f.getColumnIndex("_data"));
            }
        } else {
            i = 0;
        }
        matrixCursor.addRow(new String[]{Album.f114648a, Album.f114648a, "All", str, String.valueOf(i)});
        return new MergeCursor(new Cursor[]{matrixCursor, f});
    }

    /* renamed from: a */
    public static String[] m98835a(int i) {
        return new String[]{String.valueOf(i)};
    }

    public C45338a(Context context, String str, String[] strArr) {
        super(context, f114624w, f114626y, str, strArr, "datetaken DESC");
    }
}
