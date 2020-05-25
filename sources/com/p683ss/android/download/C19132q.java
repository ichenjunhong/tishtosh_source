package com.p683ss.android.download;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.download.C19105d.C19108c;
import com.p683ss.android.download.p1161b.C19100f;
import java.io.File;

/* renamed from: com.ss.android.download.q */
public final class C19132q {
    /* renamed from: a */
    private static String m46637a(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: b */
    private static Uri m46639b(Cursor cursor, String str) {
        try {
            return Uri.parse(m46637a(cursor, str));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Intent m46636a(Context context, long j, boolean z) {
        Intent intent;
        boolean z2 = false;
        Cursor a = C19105d.m46543a(context).mo39034a(new C19108c().mo39040a(j));
        try {
            if (!a.moveToFirst()) {
                if (a != null) {
                    try {
                        a.close();
                    } catch (Exception unused) {
                    }
                }
                return null;
            }
            String string = a.getString(a.getColumnIndexOrThrow("local_filename"));
            if (C9431p.m18664a(string)) {
                if (a != null) {
                    try {
                        a.close();
                    } catch (Exception unused2) {
                    }
                }
                return null;
            }
            if (C19100f.m46523a(context, string)) {
                PackageManager packageManager = context.getPackageManager();
                intent = packageManager.getLaunchIntentForPackage(packageManager.getPackageArchiveInfo(new File(string).getAbsolutePath(), 1).packageName);
            } else {
                Uri b = m46639b(a, "local_uri");
                String a2 = m46637a(a, "media_type");
                if (!(b == null || a2 == null)) {
                    if (new File(string).exists()) {
                        intent = new Intent("android.intent.action.VIEW");
                        if ("application/vnd.android.package-archive".equals(a2)) {
                            intent.setDataAndType(b, a2);
                        } else if ("file".equals(b.getScheme())) {
                            intent.setDataAndType(b, a2);
                        } else {
                            intent.setDataAndType(b, a2);
                        }
                        C19130o oVar = C19129n.f52725c;
                        if (oVar != null) {
                            z2 = oVar.mo39065a(j, z);
                        }
                    }
                }
                if (a != null) {
                    try {
                        a.close();
                    } catch (Exception unused3) {
                    }
                }
                return null;
            }
            if (z2) {
                if (a != null) {
                    try {
                        a.close();
                    } catch (Exception unused4) {
                    }
                }
                return null;
            }
            if (a != null) {
                try {
                    a.close();
                } catch (Exception unused5) {
                }
            }
            return intent;
        } finally {
            if (a != null) {
                try {
                    a.close();
                } catch (Exception unused6) {
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m46638a(Context context, long j, int i, boolean z) {
        Intent a = m46636a(context, j, z);
        if (a == null) {
            return false;
        }
        a.addFlags(268435456);
        try {
            context.startActivity(a);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
