package com.bytedance.p702im.core.p703a;

import android.app.Application;
import android.content.SharedPreferences.Editor;
import android.os.SystemClock;
import com.bytedance.p702im.core.internal.p710a.C11305f;
import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p710a.C11319r;
import com.bytedance.p702im.core.internal.p710a.p711a.C11266d;
import com.bytedance.p702im.core.internal.p710a.p712b.C11270b;
import com.bytedance.p702im.core.internal.p718b.C11324a;
import com.bytedance.p702im.core.internal.p718b.p719a.C11349ah;
import com.bytedance.p702im.core.internal.p718b.p719a.C11350ai;
import com.bytedance.p702im.core.internal.p718b.p719a.C11409r;
import com.bytedance.p702im.core.internal.p718b.p719a.C11410s;
import com.bytedance.p702im.core.internal.p720c.C11442b;
import com.bytedance.p702im.core.internal.p720c.p721a.C11435a;
import com.bytedance.p702im.core.internal.p720c.p721a.C11436b;
import com.bytedance.p702im.core.internal.p722d.C11452a;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.internal.utils.C11498k;
import com.bytedance.p702im.core.internal.utils.C11499l;
import com.bytedance.p702im.core.internal.utils.C11500m;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p705b.C11173a;
import com.bytedance.p702im.core.p705b.C11175c;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11242v;
import com.bytedance.p702im.core.p708d.C11248a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.a.c */
public final class C11165c {

    /* renamed from: f */
    private static C11165c f30105f;

    /* renamed from: a */
    public Application f30106a;

    /* renamed from: b */
    public C11172e f30107b;

    /* renamed from: c */
    public C11160a f30108c;

    /* renamed from: d */
    public C11173a f30109d;

    /* renamed from: e */
    public volatile boolean f30110e;

    /* renamed from: com.bytedance.im.core.a.c$a */
    static class C11168a implements C11160a {
        private C11168a() {
        }

        /* renamed from: a */
        public final long mo20490a() {
            return -1;
        }

        /* renamed from: a */
        public final void mo20491a(int i) {
        }

        /* renamed from: a */
        public final void mo20492a(int i, int i2) {
        }

        /* renamed from: a */
        public final void mo20493a(int i, long j, long j2) {
        }

        /* renamed from: a */
        public final void mo20494a(int i, long j, String str, byte[] bArr) {
        }

        /* renamed from: a */
        public final void mo20495a(C11436b bVar, C11435a aVar) {
        }

        /* renamed from: a */
        public final void mo20496a(List<C11207p> list) {
        }

        /* renamed from: b */
        public final String mo20497b() {
            return "";
        }

        /* renamed from: b */
        public final void mo20498b(int i, int i2) {
        }

        /* renamed from: c */
        public final String mo20499c() {
            return "";
        }

        /* renamed from: c */
        public final void mo20500c(int i, int i2) {
        }

        /* renamed from: d */
        public final boolean mo20501d() {
            return false;
        }

        /* renamed from: e */
        public final C11164b mo20502e() {
            return null;
        }

        /* renamed from: f */
        public final Map<String, String> mo20503f() {
            return null;
        }

        /* renamed from: g */
        public final void mo20504g() {
        }

        /* renamed from: h */
        public final String mo20505h() {
            return "";
        }
    }

    private C11165c() {
    }

    /* renamed from: b */
    public final C11172e mo20513b() {
        if (this.f30107b != null) {
            return this.f30107b;
        }
        return C11172e.m22617a();
    }

    /* renamed from: e */
    public final synchronized void mo20517e() {
        mo20514b(6);
    }

    /* renamed from: a */
    public static C11165c m22588a() {
        if (f30105f == null) {
            synchronized (C11165c.class) {
                if (f30105f == null) {
                    f30105f = new C11165c();
                }
            }
        }
        return f30105f;
    }

    /* renamed from: d */
    public final synchronized void mo20516d() {
        this.f30110e = false;
        C11409r.m23292a();
        new C11349ah();
        C11409r a = C11409r.m23292a();
        a.f30660b = false;
        a.f30659a.removeCallbacksAndMessages(null);
        m22591g();
    }

    /* renamed from: f */
    public final void mo20518f() {
        C11175c.m22624a().mo20526a("core").mo20528b("db_crash").mo20527a("last_reset_time", Long.valueOf(C11498k.m23543a().mo21122b())).mo20527a("reset_count", Integer.valueOf(C11498k.m23543a().mo21124c())).mo20530b();
        C11409r.m23292a().mo21062a((Runnable) new Runnable() {
            public final void run() {
                C11165c.this.mo20516d();
                C11498k a = C11498k.m23543a();
                Editor edit = a.f30838a.edit();
                if (SystemClock.uptimeMillis() - a.mo21122b() > 3600000) {
                    int[] iArr = C11165c.m22588a().mo20513b().f30153q;
                    if (iArr == null) {
                        iArr = C11165c.m22588a().mo20513b().f30152p;
                    }
                    for (int i : iArr) {
                        edit.putLong(C11498k.m23544a(i, "msg_by_user_cursor"), -1).putLong(C11498k.m23544a(i, "msg_by_user_report_cursor"), -1).putBoolean(C11498k.m23544a(i, "im_init"), false).putLong(C11498k.m23544a(i, "im_init_page_cursor"), 0);
                    }
                    edit.putString("im_snapshot", "");
                    edit.putLong(C11498k.m23545a("im_reset_time"), SystemClock.uptimeMillis());
                }
                edit.putInt(C11498k.m23545a("im_reset_count"), a.mo21124c() + 1).commit();
                C11165c.this.mo20515c();
            }
        });
    }

    /* renamed from: g */
    private synchronized void m22591g() {
        C11500m.m23559a();
        if (C11452a.f30749a != null) {
            C11452a.f30749a.shutdown();
            C11452a.f30749a = null;
        }
        if (C11452a.f30750b != null) {
            C11452a.f30750b.shutdown();
            C11452a.f30750b = null;
        }
        if (C11452a.f30751c != null) {
            C11452a.f30751c.shutdown();
            C11452a.f30751c = null;
        }
        if (C11452a.f30752d != null) {
            C11452a.f30752d.shutdown();
            C11452a.f30752d = null;
        }
        C11324a.f30471a.clear();
        C11324a.f30472b.clear();
        C11324a.f30473c.clear();
        C11324a.f30474d.clear();
        C11324a.f30476f.clear();
        C11324a.f30475e.clear();
        C11324a.f30477g.clear();
        C11182d a = C11182d.m22641a();
        a.f30178a.clear();
        a.f30179b = false;
        C11270b a2 = C11270b.m22889a();
        a2.f30356a.removeMessages(BaseNotice.HASHTAG);
        a2.f30356a.removeMessages(102);
        a2.f30356a.removeMessages(103);
        a2.f30356a.removeMessages(104);
        a2.f30356a.removeMessages(105);
        C11242v a3 = C11242v.m22830a();
        a3.f30279a = 0;
        a3.f30280b = 0;
        a3.f30281c = true;
        a3.f30283e = null;
        C11442b a4 = C11442b.m23355a();
        a4.f30715a.mo21075a();
        a4.f30716b.mo21075a();
        C11324a.f30479i.clear();
        C11324a.f30480j.clear();
        if (C11248a.f30299a) {
            C11248a a5 = C11248a.m22842a();
            if (a5.f30302c != null) {
                a5.f30301b.removeCallbacks(a5.f30302c);
                a5.f30302c = null;
            }
            a5.f30301b.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: c */
    public final synchronized void mo20515c() {
        this.f30110e = true;
        m22591g();
        C11182d a = C11182d.m22641a();
        if (m22588a().mo20513b().f30130E) {
            C11457e.m23434a(new C11456d<Boolean>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo20683a() {
                    C11499l.m23554a();
                    List b = C11499l.m23555b();
                    if (b == null || b.size() <= 0) {
                        return Boolean.valueOf(false);
                    }
                    C11182d.this.mo20671b((C11180b[]) b.toArray(new C11180b[0]));
                    return Boolean.valueOf(true);
                }
            }, new C11455c<Boolean>() {
                /* renamed from: a */
                public final /* synthetic */ void mo20684a(Object obj) {
                    Boolean bool = (Boolean) obj;
                    if (!C11182d.this.f30181d.isEmpty() && bool.booleanValue()) {
                        C11467e.m23470c("snapshot onCallback");
                        for (C11198g a : C11182d.this.f30181d) {
                            a.mo20718a(C11182d.this.f30178a);
                        }
                    }
                }
            });
        } else if (m22588a().mo20513b().f30128C) {
            C11457e.m23434a(new C11456d<Boolean>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public Boolean mo20683a() {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C11312m.m23038a();
                    List b = C11312m.m23043b(C11165c.m22588a().mo20513b().f30129D);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                        C11176d.m22637a("im_init_conversation_msg_duration", jSONObject, (JSONObject) null);
                    } catch (Exception unused) {
                    }
                    if (b.size() <= 0) {
                        return Boolean.valueOf(false);
                    }
                    C11182d.this.mo20671b((C11180b[]) b.toArray(new C11180b[0]));
                    return Boolean.valueOf(true);
                }
            }, new C11455c<Boolean>() {
                /* renamed from: a */
                public final /* synthetic */ void mo20684a(Object obj) {
                    Boolean bool = (Boolean) obj;
                    if (!C11182d.this.f30181d.isEmpty() && bool.booleanValue()) {
                        C11467e.m23470c("fastLoad onCallback");
                        for (C11198g a : C11182d.this.f30181d) {
                            a.mo20718a(C11182d.this.f30178a);
                        }
                    }
                }
            });
        }
        C11409r.m23292a();
        new C11350ai();
        int[] iArr = m22588a().mo20513b().f30153q;
        if (iArr == null) {
            iArr = m22588a().mo20513b().f30152p;
        }
        for (int i : iArr) {
            C11409r.m23292a();
            C11410s sVar = new C11410s(i);
            sVar.f30662c = false;
            if (!C11324a.m23138d(sVar.f30661a)) {
                if (C11498k.m23543a().mo21125c(sVar.f30661a)) {
                    C11457e.m23434a(new C11456d<Object>() {
                        /* renamed from: a */
                        public final Object mo20683a() {
                            C11319r.m23086a();
                            long a = C11165c.m22588a().f30108c.mo20490a();
                            StringBuilder sb = new StringBuilder("update msg set ");
                            sb.append(C11305f.COLUMN_STATUS.key);
                            sb.append("=3");
                            sb.append(" where ");
                            sb.append(C11305f.COLUMN_SENDER.key);
                            sb.append("='");
                            sb.append(a);
                            sb.append("' AND ");
                            sb.append(C11305f.COLUMN_STATUS.key);
                            sb.append("<'2");
                            sb.append("'");
                            String sb2 = sb.toString();
                            C11266d.m22878a();
                            return Boolean.valueOf(C11266d.m22883c(sb2));
                        }
                    }, new C11455c<Object>() {
                        /* renamed from: a */
                        public final void mo20684a(Object obj) {
                            C11165c.m22588a().f30108c.mo20492a(C11410s.this.f30661a, 3);
                            C11410s.this.mo21064a(C11165c.m22588a().mo20513b().f30136K);
                        }
                    });
                } else {
                    int i2 = sVar.f30661a;
                    if (m22588a().mo20513b().f30157u == 2) {
                        C11324a.f30471a.add(Integer.valueOf(i2));
                        m22588a().f30108c.mo20500c(i2, 0);
                    }
                    C11324a.f30474d.add(Integer.valueOf(sVar.f30661a));
                    m22588a().f30108c.mo20492a(sVar.f30661a, 0);
                    sVar.mo21063a(C11498k.m23543a().f30838a.getLong(C11498k.m23544a(sVar.f30661a, "im_init_page_cursor"), 0));
                    C11176d.m22633a("im_total_pull", "get_session", 1.0f);
                }
            }
        }
        C11409r.m23292a().f30660b = true;
    }

    /* renamed from: a */
    public static boolean m22590a(int i) {
        return C11498k.m23543a().mo21125c(i);
    }

    /* renamed from: a */
    public final void mo20512a(C11160a aVar) {
        if (aVar == null) {
            aVar = new C11168a();
        }
        this.f30108c = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b4, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042 A[SYNTHETIC, Splitter:B:25:0x0042] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo20514b(final int r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.f30110e     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x00b3
            com.bytedance.im.core.a.c r0 = m22588a()     // Catch:{ all -> 0x00b5 }
            com.bytedance.im.core.a.e r0 = r0.mo20513b()     // Catch:{ all -> 0x00b5 }
            int[] r0 = r0.f30153q     // Catch:{ all -> 0x00b5 }
            if (r0 != 0) goto L_0x001b
            com.bytedance.im.core.a.c r0 = m22588a()     // Catch:{ all -> 0x00b5 }
            com.bytedance.im.core.a.e r0 = r0.mo20513b()     // Catch:{ all -> 0x00b5 }
            int[] r0 = r0.f30152p     // Catch:{ all -> 0x00b5 }
        L_0x001b:
            if (r0 != 0) goto L_0x001f
            monitor-exit(r10)
            return
        L_0x001f:
            com.bytedance.im.core.a.c r1 = m22588a()     // Catch:{ all -> 0x00b5 }
            com.bytedance.im.core.a.e r1 = r1.mo20513b()     // Catch:{ all -> 0x00b5 }
            boolean r2 = r1.f30154r     // Catch:{ all -> 0x00b5 }
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003a
            int[] r2 = r1.f30153q     // Catch:{ all -> 0x00b5 }
            if (r2 != 0) goto L_0x0033
            int[] r2 = r1.f30152p     // Catch:{ all -> 0x00b5 }
        L_0x0033:
            if (r2 == 0) goto L_0x003a
            int r1 = r2.length     // Catch:{ all -> 0x00b5 }
            if (r1 <= r3) goto L_0x003a
            r1 = 1
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            if (r1 != 0) goto L_0x0042
            m22589a(r0, r11)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r10)
            return
        L_0x0042:
            com.bytedance.p702im.core.internal.p718b.p719a.C11409r.m23292a()     // Catch:{ all -> 0x00b5 }
            com.bytedance.im.core.a.c$1 r1 = new com.bytedance.im.core.a.c$1     // Catch:{ all -> 0x00b5 }
            r1.<init>(r0, r11)     // Catch:{ all -> 0x00b5 }
            com.bytedance.im.core.internal.b.a.c r11 = new com.bytedance.im.core.internal.b.a.c     // Catch:{ all -> 0x00b5 }
            r11.<init>(r1)     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x00b1
            int r1 = r0.length     // Catch:{ all -> 0x00b5 }
            if (r1 != 0) goto L_0x0055
            goto L_0x00b1
        L_0x0055:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00b5 }
            r1.<init>()     // Catch:{ all -> 0x00b5 }
            int r2 = r0.length     // Catch:{ all -> 0x00b5 }
            r5 = 0
        L_0x005c:
            if (r5 >= r2) goto L_0x0087
            r6 = r0[r5]     // Catch:{ all -> 0x00b5 }
            com.bytedance.im.core.proto.InboxMessagesPerUser$Builder r7 = new com.bytedance.im.core.proto.InboxMessagesPerUser$Builder     // Catch:{ all -> 0x00b5 }
            r7.<init>()     // Catch:{ all -> 0x00b5 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00b5 }
            com.bytedance.im.core.proto.InboxMessagesPerUser$Builder r7 = r7.inbox_type(r8)     // Catch:{ all -> 0x00b5 }
            com.bytedance.im.core.internal.utils.k r8 = com.bytedance.p702im.core.internal.utils.C11498k.m23543a()     // Catch:{ all -> 0x00b5 }
            long r8 = r8.mo21119a(r6)     // Catch:{ all -> 0x00b5 }
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x00b5 }
            com.bytedance.im.core.proto.InboxMessagesPerUser$Builder r6 = r7.cursor(r6)     // Catch:{ all -> 0x00b5 }
            com.bytedance.im.core.proto.InboxMessagesPerUser r6 = r6.build()     // Catch:{ all -> 0x00b5 }
            r1.add(r6)     // Catch:{ all -> 0x00b5 }
            int r5 = r5 + 1
            goto L_0x005c
        L_0x0087:
            com.bytedance.im.core.proto.CheckMessagePerUserRequestBody$Builder r2 = new com.bytedance.im.core.proto.CheckMessagePerUserRequestBody$Builder     // Catch:{ all -> 0x00b5 }
            r2.<init>()     // Catch:{ all -> 0x00b5 }
            com.bytedance.im.core.proto.CheckMessagePerUserRequestBody$Builder r1 = r2.checks(r1)     // Catch:{ all -> 0x00b5 }
            com.bytedance.im.core.proto.CheckMessagePerUserRequestBody r1 = r1.build()     // Catch:{ all -> 0x00b5 }
            com.bytedance.im.core.proto.RequestBody$Builder r2 = new com.bytedance.im.core.proto.RequestBody$Builder     // Catch:{ all -> 0x00b5 }
            r2.<init>()     // Catch:{ all -> 0x00b5 }
            com.bytedance.im.core.proto.RequestBody$Builder r1 = r2.check_messages_per_user_body(r1)     // Catch:{ all -> 0x00b5 }
            com.bytedance.im.core.proto.RequestBody r1 = r1.build()     // Catch:{ all -> 0x00b5 }
            int r2 = r0.length     // Catch:{ all -> 0x00b5 }
            int[] r2 = new int[r2]     // Catch:{ all -> 0x00b5 }
            int r5 = r0.length     // Catch:{ all -> 0x00b5 }
            java.lang.System.arraycopy(r0, r4, r2, r4, r5)     // Catch:{ all -> 0x00b5 }
            r0 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00b5 }
            r3[r4] = r2     // Catch:{ all -> 0x00b5 }
            r11.mo21053a(r4, r1, r0, r3)     // Catch:{ all -> 0x00b5 }
            goto L_0x00b3
        L_0x00b1:
            monitor-exit(r10)
            return
        L_0x00b3:
            monitor-exit(r10)
            return
        L_0x00b5:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p702im.core.p703a.C11165c.mo20514b(int):void");
    }

    /* renamed from: a */
    public static void m22589a(int[] iArr, int i) {
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 != -1) {
                    C11409r.m23292a();
                    C11409r.m23295a(i2, i);
                }
            }
        }
    }
}
