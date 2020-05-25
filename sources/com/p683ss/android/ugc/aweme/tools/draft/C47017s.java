package com.p683ss.android.ugc.aweme.tools.draft;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.google.gson.C17971f;
import com.google.gson.C18086p;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.draft.C29050a;
import com.p683ss.android.ugc.aweme.draft.C29052c;
import com.p683ss.android.ugc.aweme.draft.model.C29057a;
import com.p683ss.android.ugc.aweme.draft.model.C29058b;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.draft.model.C29061d;
import com.p683ss.android.ugc.aweme.effect.EffectListModel;
import com.p683ss.android.ugc.aweme.filter.C31460h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContextOld;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.services.IFoundationAVServiceProxy;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.DraftUpdateServiceImpl;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.s */
public class C47017s {

    /* renamed from: a */
    private static C47017s f118752a;

    /* renamed from: b */
    private SQLiteDatabase f118753b = C29052c.m68397a().getWritableDatabase();

    /* renamed from: c */
    private SQLiteDatabase f118754c = C29052c.m68397a().getReadableDatabase();

    /* renamed from: b */
    public final List<C29059c> mo94307b() {
        return mo94303a((C29050a) null);
    }

    private C47017s() {
    }

    /* renamed from: a */
    public static C47017s m102091a() {
        if (f118752a == null) {
            synchronized (C47017s.class) {
                if (f118752a == null) {
                    f118752a = new C47017s();
                }
            }
        }
        return f118752a;
    }

    /* renamed from: f */
    private static String m102097f() {
        return C39629l.m88232a().mo58593x().mo74283c();
    }

    /* renamed from: e */
    private static String m102095e() {
        StringBuilder sb = new StringBuilder("local_draft' where user_id = '");
        sb.append(m102097f());
        sb.append("' or user_id");
        sb.append(" is null order by 'time");
        sb.append("' desc");
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo94308c() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r6.f118754c     // Catch:{ Exception -> 0x0032 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0032 }
            java.lang.String r4 = "select * from '"
            r3.<init>(r4)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r4 = m102095e()     // Catch:{ Exception -> 0x0032 }
            r3.append(r4)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0032 }
            android.database.Cursor r2 = r2.rawQuery(r3, r1)     // Catch:{ Exception -> 0x0032 }
            if (r2 != 0) goto L_0x001d
            goto L_0x0022
        L_0x001d:
            int r1 = r2.getCount()     // Catch:{ Exception -> 0x002b, all -> 0x0028 }
            r0 = r1
        L_0x0022:
            if (r2 == 0) goto L_0x003b
            r2.close()
            goto L_0x003b
        L_0x0028:
            r0 = move-exception
            r1 = r2
            goto L_0x003c
        L_0x002b:
            r1 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x0033
        L_0x0030:
            r0 = move-exception
            goto L_0x003c
        L_0x0032:
            r2 = move-exception
        L_0x0033:
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75143a(r2)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x003b
            r1.close()
        L_0x003b:
            return r0
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r1.close()
        L_0x0041:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.draft.C47017s.mo94308c():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r2 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r2 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p683ss.android.ugc.aweme.draft.model.C29059c> mo94311d() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r5.f118754c     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            java.lang.String r3 = "select * from 'local_draft' order by 'time' desc"
            android.database.Cursor r2 = r2.rawQuery(r3, r1)     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            if (r2 == 0) goto L_0x0026
            int r1 = r2.getCount()     // Catch:{ Exception -> 0x0024 }
            if (r1 <= 0) goto L_0x0026
        L_0x0016:
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x0024 }
            if (r1 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.draft.model.c r1 = r5.m102090a(r2)     // Catch:{ Exception -> 0x0024 }
            r0.add(r1)     // Catch:{ Exception -> 0x0024 }
            goto L_0x0016
        L_0x0024:
            r1 = move-exception
            goto L_0x0030
        L_0x0026:
            if (r2 == 0) goto L_0x0038
            goto L_0x0035
        L_0x0029:
            r0 = move-exception
            r2 = r1
            goto L_0x003a
        L_0x002c:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
        L_0x0030:
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75143a(r1)     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x0038
        L_0x0035:
            r2.close()
        L_0x0038:
            return r0
        L_0x0039:
            r0 = move-exception
        L_0x003a:
            if (r2 == 0) goto L_0x003f
            r2.close()
        L_0x003f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.draft.C47017s.mo94311d():java.util.List");
    }

    /* renamed from: a */
    public static String m102092a(C29059c cVar) {
        return cVar.mo58774ak();
    }

    /* renamed from: f */
    private static EffectListModel m102096f(String str) {
        try {
            return (EffectListModel) JSON.parseObject(str, EffectListModel.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static C29057a m102093d(String str) {
        try {
            return (C29057a) C39629l.m88232a().mo58566D().mo34884a(str, C29057a.class);
        } catch (C18086p e) {
            C32458a.m75144a(str);
            C32458a.m75148a((Throwable) e);
            return new C29057a();
        } catch (Exception e2) {
            C32458a.m75144a(str);
            C32458a.m75148a((Throwable) e2);
            return new C29057a();
        }
    }

    /* renamed from: e */
    private static C42482c m102094e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return DraftUpdateServiceImpl.createDraftUpdateServicebyMonsterPlugin().transformNewAVMusic(str);
        } catch (C18086p e) {
            C32458a.m75144a(str);
            C32458a.m75148a((Throwable) e);
            return new C42482c();
        } catch (Exception e2) {
            C32458a.m75144a(str);
            C32458a.m75148a((Throwable) e2);
            return new C42482c();
        }
    }

    /* renamed from: b */
    public final synchronized int mo94305b(C29059c cVar) {
        String ak = cVar.mo58774ak();
        if (TextUtils.isEmpty(ak)) {
            return 0;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("draft_extras", C39629l.m88232a().mo58566D().mo34889b(cVar.f76142T));
        return this.f118753b.update("local_draft", contentValues, "video_path = ?", new String[]{ak});
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p683ss.android.ugc.aweme.draft.model.C29059c> mo94303a(com.p683ss.android.ugc.aweme.draft.C29050a r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r5.f118754c     // Catch:{ Exception -> 0x004e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004e }
            java.lang.String r4 = "select * from '"
            r3.<init>(r4)     // Catch:{ Exception -> 0x004e }
            java.lang.String r4 = m102095e()     // Catch:{ Exception -> 0x004e }
            r3.append(r4)     // Catch:{ Exception -> 0x004e }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x004e }
            android.database.Cursor r2 = r2.rawQuery(r3, r1)     // Catch:{ Exception -> 0x004e }
            if (r2 == 0) goto L_0x0046
            int r1 = r2.getCount()     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            if (r1 <= 0) goto L_0x0046
        L_0x0026:
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            if (r1 == 0) goto L_0x0046
            com.ss.android.ugc.aweme.draft.model.c r1 = r5.m102090a(r2)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            if (r6 == 0) goto L_0x003c
            boolean r3 = r6.mo49521a(r1)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            if (r3 == 0) goto L_0x0026
            r0.add(r1)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            goto L_0x0026
        L_0x003c:
            r0.add(r1)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            goto L_0x0026
        L_0x0040:
            r6 = move-exception
            r1 = r2
            goto L_0x0058
        L_0x0043:
            r6 = move-exception
            r1 = r2
            goto L_0x004f
        L_0x0046:
            if (r2 == 0) goto L_0x0057
            r2.close()
            goto L_0x0057
        L_0x004c:
            r6 = move-exception
            goto L_0x0058
        L_0x004e:
            r6 = move-exception
        L_0x004f:
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75143a(r6)     // Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x0057
            r1.close()
        L_0x0057:
            return r0
        L_0x0058:
            if (r1 == 0) goto L_0x005d
            r1.close()
        L_0x005d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.draft.C47017s.mo94303a(com.ss.android.ugc.aweme.draft.a):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.draft.model.C29059c mo94306b(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0038, all -> 0x0031 }
            java.lang.String r2 = "select * from local_draft where video_path = '"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0038, all -> 0x0031 }
            r1.append(r5)     // Catch:{ Exception -> 0x0038, all -> 0x0031 }
            java.lang.String r5 = "'"
            r1.append(r5)     // Catch:{ Exception -> 0x0038, all -> 0x0031 }
            java.lang.String r5 = r1.toString()     // Catch:{ Exception -> 0x0038, all -> 0x0031 }
            java.io.PrintStream r1 = java.lang.System.out     // Catch:{ Exception -> 0x0038, all -> 0x0031 }
            r1.println(r5)     // Catch:{ Exception -> 0x0038, all -> 0x0031 }
            android.database.sqlite.SQLiteDatabase r1 = r4.f118754c     // Catch:{ Exception -> 0x0038, all -> 0x0031 }
            android.database.Cursor r5 = r1.rawQuery(r5, r0)     // Catch:{ Exception -> 0x0038, all -> 0x0031 }
            r5.moveToNext()     // Catch:{ Exception -> 0x0039, all -> 0x002c }
            com.ss.android.ugc.aweme.draft.model.c r1 = r4.m102090a(r5)     // Catch:{ Exception -> 0x0039, all -> 0x002c }
            if (r5 == 0) goto L_0x002b
            r5.close()
        L_0x002b:
            return r1
        L_0x002c:
            r0 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
            goto L_0x0032
        L_0x0031:
            r5 = move-exception
        L_0x0032:
            if (r0 == 0) goto L_0x0037
            r0.close()
        L_0x0037:
            throw r5
        L_0x0038:
            r5 = r0
        L_0x0039:
            if (r5 == 0) goto L_0x003e
            r5.close()
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.draft.C47017s.mo94306b(java.lang.String):com.ss.android.ugc.aweme.draft.model.c");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p683ss.android.ugc.aweme.tools.draft.p2358d.C46987a> mo94304a(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "select * from local_draft where user_id = '"
            r0.<init>(r1)
            java.lang.String r1 = m102097f()
            r0.append(r1)
            java.lang.String r1 = "' order by cast(music_id"
            r0.append(r1)
            java.lang.String r1 = " as integer) desc"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.ss.android.ugc.aweme.tools.draft.d.d r2 = new com.ss.android.ugc.aweme.tools.draft.d.d
            r2.<init>()
            r1.add(r2)
            com.ss.android.ugc.aweme.tools.draft.d.e r2 = new com.ss.android.ugc.aweme.tools.draft.d.e
            r2.<init>()
            r1.add(r2)
            com.ss.android.ugc.aweme.tools.draft.d.c r2 = new com.ss.android.ugc.aweme.tools.draft.d.c
            r2.<init>()
            r1.add(r2)
            com.ss.android.ugc.aweme.tools.draft.d.b r2 = new com.ss.android.ugc.aweme.tools.draft.d.b
            r2.<init>()
            r1.add(r2)
            r2 = 0
            java.lang.String r3 = "DraftDBHelper before mReadableDataBase.rawQuery v2"
            com.p683ss.android.ugc.tools.utils.C50203g.m108358a(r3)     // Catch:{ Exception -> 0x00b5 }
            android.database.sqlite.SQLiteDatabase r3 = r6.f118754c     // Catch:{ Exception -> 0x00b5 }
            android.database.Cursor r0 = r3.rawQuery(r0, r2)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r2 = "DraftDBHelper after mReadableDataBase.rawQuery v2"
            com.p683ss.android.ugc.tools.utils.C50203g.m108358a(r2)     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            if (r0 == 0) goto L_0x00a7
            int r2 = r0.getCount()     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            if (r2 <= 0) goto L_0x00a7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            java.lang.String r3 = "DraftDBHelper cursor.getCount:"
            r2.<init>(r3)     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            int r3 = r0.getCount()     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            r2.append(r3)     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            java.lang.String r3 = " v2"
            r2.append(r3)     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            com.p683ss.android.ugc.tools.utils.C50203g.m108358a(r2)     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
        L_0x0074:
            boolean r2 = r0.moveToNext()     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            if (r2 == 0) goto L_0x00a7
            java.lang.String r2 = "DraftDBHelper cursor.moveToNext() v2"
            com.p683ss.android.ugc.tools.utils.C50203g.m108358a(r2)     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            com.ss.android.ugc.aweme.draft.model.c r2 = r6.m102090a(r0)     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
        L_0x0087:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            if (r4 == 0) goto L_0x0074
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            com.ss.android.ugc.aweme.tools.draft.d.a r4 = (com.p683ss.android.ugc.aweme.tools.draft.p2358d.C46987a) r4     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            boolean r5 = r4.mo94280b(r2)     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            if (r5 == 0) goto L_0x0087
            java.lang.String r5 = r2.mo58774ak()     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            boolean r5 = android.text.TextUtils.equals(r5, r7)     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            if (r5 != 0) goto L_0x0087
            r4.mo94278a(r2)     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            goto L_0x0074
        L_0x00a7:
            if (r0 == 0) goto L_0x00be
            r0.close()
            goto L_0x00be
        L_0x00ad:
            r7 = move-exception
            goto L_0x00bf
        L_0x00af:
            r7 = move-exception
            r2 = r0
            goto L_0x00b6
        L_0x00b2:
            r7 = move-exception
            r0 = r2
            goto L_0x00bf
        L_0x00b5:
            r7 = move-exception
        L_0x00b6:
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75143a(r7)     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x00be
            r2.close()
        L_0x00be:
            return r1
        L_0x00bf:
            if (r0 == 0) goto L_0x00c4
            r0.close()
        L_0x00c4:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.draft.C47017s.mo94304a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r5 != null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r5 != null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.draft.model.C29059c mo94310c(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            java.lang.String r2 = "select * from local_draft where user_id = '"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            java.lang.String r2 = m102097f()     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            r1.append(r2)     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            java.lang.String r2 = "' and video_path"
            r1.append(r2)     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            java.lang.String r2 = " = '"
            r1.append(r2)     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            r1.append(r5)     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            java.lang.String r5 = "'"
            r1.append(r5)     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            java.lang.String r5 = r1.toString()     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            java.io.PrintStream r1 = java.lang.System.out     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            r1.println(r5)     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            android.database.sqlite.SQLiteDatabase r1 = r4.f118754c     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            android.database.Cursor r5 = r1.rawQuery(r5, r0)     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            if (r5 == 0) goto L_0x004a
            int r1 = r5.getCount()     // Catch:{ Exception -> 0x0055, all -> 0x0045 }
            if (r1 <= 0) goto L_0x004a
            r5.moveToNext()     // Catch:{ Exception -> 0x0055, all -> 0x0045 }
            com.ss.android.ugc.aweme.draft.model.c r1 = r4.m102090a(r5)     // Catch:{ Exception -> 0x0055, all -> 0x0045 }
            if (r5 == 0) goto L_0x0044
            r5.close()
        L_0x0044:
            return r1
        L_0x0045:
            r0 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
            goto L_0x004e
        L_0x004a:
            if (r5 == 0) goto L_0x005a
            goto L_0x0057
        L_0x004d:
            r5 = move-exception
        L_0x004e:
            if (r0 == 0) goto L_0x0053
            r0.close()
        L_0x0053:
            throw r5
        L_0x0054:
            r5 = r0
        L_0x0055:
            if (r5 == 0) goto L_0x005a
        L_0x0057:
            r5.close()
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.draft.C47017s.mo94310c(java.lang.String):com.ss.android.ugc.aweme.draft.model.c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo94312d(com.p683ss.android.ugc.aweme.draft.model.C29059c r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r6 == 0) goto L_0x0035
            java.lang.String r0 = m102092a(r6)     // Catch:{ all -> 0x0032 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000e
            goto L_0x0035
        L_0x000e:
            android.database.sqlite.SQLiteDatabase r0 = r5.f118753b     // Catch:{ all -> 0x0032 }
            r0.beginTransaction()     // Catch:{ all -> 0x0032 }
            android.database.sqlite.SQLiteDatabase r0 = r5.f118753b     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = "local_draft"
            java.lang.String r2 = "video_path = ?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x0032 }
            r4 = 0
            java.lang.String r6 = m102092a(r6)     // Catch:{ all -> 0x0032 }
            r3[r4] = r6     // Catch:{ all -> 0x0032 }
            r0.delete(r1, r2, r3)     // Catch:{ all -> 0x0032 }
            android.database.sqlite.SQLiteDatabase r6 = r5.f118753b     // Catch:{ all -> 0x0032 }
            r6.setTransactionSuccessful()     // Catch:{ all -> 0x0032 }
            android.database.sqlite.SQLiteDatabase r6 = r5.f118753b     // Catch:{ all -> 0x0032 }
            r6.endTransaction()     // Catch:{ all -> 0x0032 }
            monitor-exit(r5)
            return
        L_0x0032:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x0035:
            monitor-exit(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.draft.C47017s.mo94312d(com.ss.android.ugc.aweme.draft.model.c):void");
    }

    /* renamed from: c */
    public final long mo94309c(C29059c cVar) {
        String str;
        String str2;
        String str3;
        String jSONString;
        if (cVar.f76142T != null && TextUtils.isEmpty(cVar.f76142T.f76059Z)) {
            cVar.f76142T.f76059Z = C31460h.m73281a(C39629l.m88232a().mo58584o().mo64333c().mo64346b(cVar.f76153k));
        }
        ContentValues contentValues = new ContentValues();
        String str4 = "aweme";
        if (cVar.f76144b == null) {
            str = "";
        } else {
            str = JSON.toJSONString(cVar.f76144b);
        }
        contentValues.put(str4, str);
        contentValues.put("video_path", m102092a(cVar));
        contentValues.put("music_path", cVar.f76149g);
        contentValues.put("video_volume", Integer.valueOf(cVar.f76151i));
        contentValues.put("music_volume", Integer.valueOf(cVar.f76152j));
        String str5 = "music";
        if (cVar.f76147e == null) {
            str2 = "";
        } else {
            str2 = JSON.toJSONString(cVar.f76147e);
        }
        contentValues.put(str5, str2);
        contentValues.put("filter", Integer.valueOf(cVar.f76153k));
        contentValues.put("music_start", Integer.valueOf(cVar.f76154l));
        contentValues.put("time", Long.valueOf(cVar.f76129G));
        contentValues.put("effect", Integer.valueOf(cVar.f76155m));
        contentValues.put("origin", Integer.valueOf(cVar.f76156n));
        contentValues.put("face_beauty", Integer.valueOf(cVar.f76127E));
        contentValues.put("user_id", cVar.f76128F);
        contentValues.put("segment_video", cVar.f76130H);
        contentValues.put("hard_encode", Integer.valueOf(cVar.f76131I));
        contentValues.put("special_points", Integer.valueOf(cVar.f76132J));
        contentValues.put("sticker_path", cVar.f76133K);
        contentValues.put("sticker_id", cVar.f76134L);
        contentValues.put("camera_poi", Integer.valueOf(cVar.f76162t));
        contentValues.put("filter_label", cVar.f76161s);
        contentValues.put("beauty_label", Integer.valueOf(cVar.f76163u));
        contentValues.put("video_speed", cVar.f76158p);
        contentValues.put("music_effect_segments", cVar.f76136N);
        contentValues.put("is_private", Integer.valueOf(cVar.f76124B));
        contentValues.put("max_duration", Long.valueOf(cVar.f76126D));
        contentValues.put("audio_track", C39629l.m88232a().mo58566D().mo34889b(cVar.f76159q));
        String str6 = "photo_movie";
        if (cVar.f76145c == null) {
            str3 = "";
        } else {
            str3 = C39629l.m88232a().mo58566D().mo34889b(cVar.f76145c);
        }
        contentValues.put(str6, str3);
        String str7 = "";
        try {
            if (cVar.f76125C == null) {
                jSONString = "";
            } else {
                jSONString = JSON.toJSONString(cVar.f76125C);
            }
            str7 = jSONString;
        } catch (Exception unused) {
        }
        contentValues.put("effect_list", str7);
        String str8 = "";
        if (!(cVar.f76147e == null || cVar.f76147e.getMusicId() == null)) {
            str8 = cVar.f76147e.getMusicId();
        }
        contentValues.put("music_id", str8);
        contentValues.put("new_version", Integer.valueOf(cVar.f76137O));
        contentValues.put("custom_cover_start", Float.valueOf(cVar.f76138P));
        contentValues.put("duet_from", cVar.f76139Q);
        contentValues.put("sync_platforms", cVar.f76140R);
        contentValues.put("draft_extras", C39629l.m88232a().mo58566D().mo34889b(cVar.f76142T));
        long replace = this.f118753b.replace("local_draft", null, contentValues);
        if (replace > 0) {
            C23569o.m57776a("aweme_draft_create_fail_rate", 0, (JSONObject) null);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(replace);
            C23569o.m57776a("aweme_draft_create_fail_rate", 1, C23088c.m56631a().mo47824a("rowId", sb.toString()).mo47825b());
        }
        return replace;
    }

    /* renamed from: a */
    private C29059c m102090a(Cursor cursor) {
        IFoundationAVServiceProxy iFoundationAVServiceProxy;
        C29059c cVar = new C29059c();
        String string = cursor.getString(cursor.getColumnIndex("user_id"));
        if (TextUtils.isEmpty(string)) {
            string = m102097f();
        }
        cVar.f76146d = cursor.getString(cursor.getColumnIndex("video_path"));
        cVar.f76128F = string;
        cVar.f76144b = m102093d(cursor.getString(cursor.getColumnIndex("aweme")));
        cVar.f76147e = m102094e(cursor.getString(cursor.getColumnIndex("music")));
        cVar.f76149g = cursor.getString(cursor.getColumnIndex("music_path"));
        cVar.f76151i = cursor.getInt(cursor.getColumnIndex("video_volume"));
        cVar.f76152j = cursor.getInt(cursor.getColumnIndex("music_volume"));
        C29061d.m68495a(cVar, cursor.getInt(cursor.getColumnIndex("filter")));
        cVar.f76154l = cursor.getInt(cursor.getColumnIndex("music_start"));
        cVar.f76150h = cursor.getString(cursor.getColumnIndex("voice_path"));
        cVar.f76129G = cursor.getLong(cursor.getColumnIndex("time"));
        cVar.f76155m = cursor.getInt(cursor.getColumnIndex("effect"));
        cVar.f76156n = cursor.getInt(cursor.getColumnIndex("origin"));
        cVar.f76127E = cursor.getInt(cursor.getColumnIndex("face_beauty"));
        cVar.f76130H = cursor.getString(cursor.getColumnIndex("segment_video"));
        cVar.f76131I = cursor.getInt(cursor.getColumnIndex("hard_encode"));
        cVar.f76132J = cursor.getInt(cursor.getColumnIndex("special_points"));
        cVar.f76133K = cursor.getString(cursor.getColumnIndex("sticker_path"));
        cVar.f76134L = cursor.getString(cursor.getColumnIndex("sticker_id"));
        cVar.f76162t = cursor.getInt(cursor.getColumnIndex("camera_poi"));
        cVar.f76161s = cursor.getString(cursor.getColumnIndex("filter_label"));
        cVar.f76125C = m102096f(cursor.getString(cursor.getColumnIndex("effect_list")));
        cVar.f76163u = cursor.getInt(cursor.getColumnIndex("beauty_label"));
        cVar.f76157o = cursor.getString(cursor.getColumnIndex("reverse_path"));
        cVar.f76158p = cursor.getString(cursor.getColumnIndex("video_speed"));
        cVar.f76124B = cursor.getInt(cursor.getColumnIndex("is_private"));
        cVar.f76126D = (long) cursor.getInt(cursor.getColumnIndex("max_duration"));
        cVar.f76159q = (UrlModel) C39629l.m88232a().mo58566D().mo34884a(cursor.getString(cursor.getColumnIndex("audio_track")), UrlModel.class);
        String string2 = cursor.getString(cursor.getColumnIndex("photo_movie"));
        Object a = C27991b.m66756a(IFoundationAVServiceProxy.class);
        if (a != null) {
            iFoundationAVServiceProxy = (IFoundationAVServiceProxy) a;
        } else {
            iFoundationAVServiceProxy = (IFoundationAVServiceProxy) C20302a.m50070a(IFoundationAVServiceProxy.class).mo42947a(new C20310d()).mo42946a().mo42948b();
        }
        C17971f retrofitFactoryGson = iFoundationAVServiceProxy.getNetworkService().getRetrofitFactoryGson();
        PhotoMovieContext photoMovieContext = (PhotoMovieContext) retrofitFactoryGson.mo34884a(string2, PhotoMovieContext.class);
        if (photoMovieContext != null) {
            if (photoMovieContext.mImageList == null) {
                photoMovieContext = PhotoMovieContext.convertFromOld((PhotoMovieContextOld) retrofitFactoryGson.mo34884a(string2, PhotoMovieContextOld.class));
            }
            cVar.f76145c = photoMovieContext;
        }
        cVar.f76136N = cursor.getString(cursor.getColumnIndex("music_effect_segments"));
        cVar.mo58752a(cursor.getInt(cursor.getColumnIndex("new_version")));
        cVar.mo58751a(cursor.getFloat(cursor.getColumnIndex("custom_cover_start")));
        cVar.f76139Q = cursor.getString(cursor.getColumnIndex("duet_from"));
        cVar.f76140R = cursor.getString(cursor.getColumnIndex("sync_platforms"));
        try {
            cVar.f76142T = (C29058b) C39629l.m88232a().mo58566D().mo34884a(cursor.getString(cursor.getColumnIndex("draft_extras")), C29058b.class);
            if (cVar.f76142T != null && !TextUtils.isEmpty(cVar.f76142T.f76048O)) {
                cVar.f76148f = cVar.f76142T.f76048O;
            }
        } catch (Exception unused) {
        }
        if (cVar.f76142T == null || TextUtils.isEmpty(cVar.f76142T.f76048O)) {
            String string3 = cursor.getString(cursor.getColumnIndex("video_path"));
            cVar.f76148f = string3;
            if (cVar.f76142T != null) {
                cVar.f76142T.f76048O = string3;
            }
        }
        return cVar;
    }
}
