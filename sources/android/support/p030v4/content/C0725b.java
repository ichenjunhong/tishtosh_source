package android.support.p030v4.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.support.p030v4.p040os.C0958a;
import android.support.p030v4.p040os.C0964d;

/* renamed from: android.support.v4.content.b */
public final class C0725b {
    /* renamed from: a */
    public static Cursor m2089a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, C0958a aVar) {
        Object obj;
        if (VERSION.SDK_INT >= 16) {
            if (aVar != null) {
                try {
                    obj = aVar.mo2942c();
                } catch (Exception e) {
                    if (e instanceof OperationCanceledException) {
                        throw new C0964d();
                    }
                    throw e;
                }
            } else {
                obj = null;
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        } else if (aVar == null || !aVar.mo2940a()) {
            return contentResolver.query(uri, strArr, str, strArr2, str2);
        } else {
            throw new C0964d();
        }
    }
}
