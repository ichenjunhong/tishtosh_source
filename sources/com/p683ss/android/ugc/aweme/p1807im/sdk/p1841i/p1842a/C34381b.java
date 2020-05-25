package com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1842a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p705b.C11176d;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35208au;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.i.a.b */
public final class C34381b {

    /* renamed from: a */
    private static C35208au<C34381b> f88742a = new C35208au<C34381b>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo70757a() {
            return new C34381b();
        }
    };

    /* renamed from: b */
    private C34380a f88743b;

    /* renamed from: c */
    private SQLiteDatabase f88744c = m78278e();

    /* renamed from: d */
    private String f88745d;

    /* renamed from: a */
    public static C34381b m78276a() {
        return (C34381b) f88742a.mo73326b();
    }

    /* renamed from: d */
    private boolean m78277d() {
        if (this.f88744c == null || !this.f88744c.isOpen()) {
            this.f88744c = m78278e();
        }
        if (this.f88744c == null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo72385b() {
        if (!m78277d() && !this.f88744c.inTransaction()) {
            try {
                this.f88744c.beginTransaction();
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
            }
        }
    }

    /* renamed from: c */
    public final void mo72386c() {
        if (!m78277d() && this.f88744c.inTransaction()) {
            try {
                this.f88744c.setTransactionSuccessful();
                this.f88744c.endTransaction();
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
            }
        }
    }

    /* renamed from: e */
    private SQLiteDatabase m78278e() {
        String str = "db_im_xx";
        try {
            if (this.f88744c != null && TextUtils.equals(str, this.f88745d) && this.f88744c.isOpen()) {
                return this.f88744c;
            }
            if (this.f88744c != null) {
                SQLiteDatabase sQLiteDatabase = this.f88744c;
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.close();
                    } catch (Exception e) {
                        C32458a.m75148a((Throwable) e);
                    }
                }
            }
            if (this.f88743b == null) {
                this.f88743b = new C34380a(C11010c.m22280a(), "db_im_xx");
            }
            this.f88745d = str;
            this.f88744c = this.f88743b.getWritableDatabase();
            return this.f88744c;
        } catch (Exception e2) {
            if (C48016e.m103958h() < 20971520) {
                C9432q.m18672a(C11010c.m22280a(), (int) R.string.bmu);
            }
            C32458a.m75148a((Throwable) e2);
        }
    }

    /* renamed from: a */
    public final boolean mo72383a(String str) {
        boolean z = false;
        if (m78277d()) {
            return false;
        }
        try {
            this.f88744c.execSQL(str);
            z = true;
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            HashMap hashMap = new HashMap();
            hashMap.put("error", e.toString());
            hashMap.put("error_stack", C11176d.m22638b(e));
            C35265e.m79726a("db_exec_failed", hashMap);
        }
        return z;
    }

    /* renamed from: a */
    public final Cursor mo72382a(String str, String[] strArr) {
        Cursor cursor;
        if (m78277d()) {
            return null;
        }
        try {
            cursor = this.f88744c.rawQuery(str, null);
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            HashMap hashMap = new HashMap();
            hashMap.put("error", e.toString());
            hashMap.put("error_stack", C11176d.m22638b(e));
            C35265e.m79726a("db_query_failed", hashMap);
            cursor = null;
        }
        return cursor;
    }

    /* renamed from: a */
    public final long mo72381a(String str, String str2, ContentValues contentValues) {
        if (m78277d() || TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return this.f88744c.replace(str, null, contentValues);
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            HashMap hashMap = new HashMap();
            hashMap.put("error", e.toString());
            hashMap.put("error_stack", C11176d.m22638b(e));
            C35265e.m79726a("db_replace_failed", hashMap);
            return -1;
        }
    }

    /* renamed from: a */
    public final boolean mo72384a(String str, String str2, String[] strArr) {
        if (m78277d() || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (this.f88744c.delete(str, null, null) > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            HashMap hashMap = new HashMap();
            hashMap.put("error", e.toString());
            hashMap.put("error_stack", C11176d.m22638b(e));
            C35265e.m79726a("db_delete_failed", hashMap);
            return false;
        }
    }

    /* renamed from: a */
    public final int mo72380a(String str, ContentValues contentValues, String str2, String[] strArr) {
        if (m78277d() || TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return this.f88744c.update(str, contentValues, str2, strArr);
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            HashMap hashMap = new HashMap();
            hashMap.put("error", e.toString());
            hashMap.put("error_stack", C11176d.m22638b(e));
            C35265e.m79726a("db_update_failed", hashMap);
            return -1;
        }
    }
}
