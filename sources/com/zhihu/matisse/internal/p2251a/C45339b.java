package com.zhihu.matisse.internal.p2251a;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.provider.MediaStore.Files;
import android.support.p030v4.content.C0727d;

/* renamed from: com.zhihu.matisse.internal.a.b */
public final class C45339b extends C0727d {

    /* renamed from: v */
    public static final String[] f114627v = {"1", "3"};

    /* renamed from: w */
    private static final Uri f114628w = Files.getContentUri("external");

    /* renamed from: x */
    private static final String[] f114629x = {"_id", "_display_name", "mime_type", "_size", "duration"};

    /* renamed from: y */
    private final boolean f114630y;

    /* renamed from: p */
    public final void mo2398p() {
    }

    /* renamed from: f */
    public final Cursor mo2371d() {
        Cursor f = super.mo2371d();
        if (!this.f114630y || !this.f2532p.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.camera")) {
            return f;
        }
        MatrixCursor matrixCursor = new MatrixCursor(f114629x);
        matrixCursor.addRow(new Object[]{Long.valueOf(-1), "Capture", "", Integer.valueOf(0), Integer.valueOf(0)});
        return new MergeCursor(new Cursor[]{matrixCursor, f});
    }

    /* renamed from: a */
    public static String[] m98839a(int i) {
        return new String[]{String.valueOf(i)};
    }

    /* renamed from: a */
    public static String[] m98840a(int i, String str) {
        return new String[]{String.valueOf(i), str};
    }

    public C45339b(Context context, String str, String[] strArr, boolean z) {
        super(context, f114628w, f114629x, str, strArr, "datetaken DESC");
        this.f114630y = z;
    }
}
