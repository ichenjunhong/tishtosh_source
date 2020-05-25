package com.p683ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.abmock.ABModel;
import com.bytedance.ies.abmock.C10177a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10182c;
import com.bytedance.ies.abmock.C10184e;
import com.bytedance.ies.abmock.C10186g;
import com.bytedance.ies.abmock.C10188i;
import com.bytedance.ies.abmock.C10190k;
import com.bytedance.ies.abmock.C10195p;
import com.bytedance.ies.abmock.C10197r;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.google.gson.C18082l;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p1466bt.p1467a.C24051a;
import com.p683ss.android.ugc.aweme.setting.C41515a;
import com.p683ss.android.ugc.aweme.setting.C41561az;
import com.p683ss.android.ugc.aweme.setting.C41562b;
import java.io.File;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.ABTask */
public class ABTask implements LegoTask {

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.ABTask$a */
    static class C35925a extends C10184e {

        /* renamed from: a */
        private Boolean f92153a;

        /* renamed from: b */
        private Boolean f92154b;

        C35925a() {
        }

        /* renamed from: b */
        private boolean m81081b() {
            if (this.f92153a == null) {
                this.f92153a = Boolean.valueOf(mo18185a("abmock_saved2", false));
            }
            return this.f92153a.booleanValue();
        }

        /* renamed from: c */
        private static boolean m81082c() {
            try {
                String absolutePath = C11010c.m22280a().getFilesDir().getParentFile().getAbsolutePath();
                StringBuilder sb = new StringBuilder();
                sb.append(absolutePath);
                sb.append("/shared_prefs/ab_test_config.xml");
                if (new File(sb.toString()).exists()) {
                    return true;
                }
            } catch (Exception unused) {
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo18184a() {
            boolean z;
            boolean z2;
            if (C41515a.f105192a.f105193b) {
                if (!m81081b()) {
                    if (this.f92154b == null) {
                        if (m81082c() || m81081b()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        this.f92154b = Boolean.valueOf(z);
                        if (!this.f92154b.booleanValue()) {
                            C41562b bVar = C41562b.f105272a;
                            if (!bVar.f105275d || !ApmDelegate.m17947a().mo16431a("aweme_monitor_ab_report") || bVar.f105274c.nextInt(100) != 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                C41562b.m91399a(Boolean.valueOf(true), Boolean.valueOf(true), true, "keva_store_enable_record");
                            }
                        }
                    }
                    if (this.f92154b.booleanValue()) {
                        return true;
                    }
                }
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final C18082l mo18180a(String str) {
            C52711k.m112240b(str, "key");
            return null;
        }

        /* renamed from: b */
        public final String[] mo18191b(String str) {
            return C41562b.f105272a.f105273b.getStringArray(str, null);
        }

        /* renamed from: b */
        public final void mo18186b(String str, double d) {
            C41562b.f105272a.f105273b.storeDouble(str, d);
        }

        /* renamed from: c */
        public final void mo18192c(String str, String str2) {
            C41562b.f105272a.mo85348a(str, str2);
        }

        /* renamed from: a */
        public final double mo18177a(String str, double d) {
            return C41562b.f105272a.f105273b.getDouble(str, d);
        }

        /* renamed from: b */
        public final void mo18187b(String str, int i) {
            C41562b.f105272a.f105273b.storeInt(str, i);
        }

        /* renamed from: a */
        public final int mo18178a(String str, int i) {
            return C41562b.f105272a.f105273b.getInt(str, i);
        }

        /* renamed from: a */
        public final long mo18179a(String str, long j) {
            return C41562b.f105272a.f105273b.getLong(str, j);
        }

        /* renamed from: b */
        public final void mo18188b(String str, long j) {
            C41562b.f105272a.f105273b.storeLong(str, j);
        }

        /* renamed from: a */
        public final Object mo18181a(String str, Class cls) {
            C41562b bVar = C41562b.f105272a;
            return bVar.mo85347a().mo34884a(bVar.f105273b.getString(str, null), cls);
        }

        /* renamed from: b */
        public final void mo18189b(String str, String str2) {
            C41562b.f105272a.mo85348a(str, str2);
        }

        /* renamed from: a */
        public final String mo18182a(String str, String str2) {
            return C41562b.f105272a.f105273b.getString(str, str2);
        }

        /* renamed from: b */
        public final void mo18190b(String str, boolean z) {
            C41562b.f105272a.f105273b.storeBoolean(str, z);
        }

        /* renamed from: a */
        public final void mo18183a(String str, C18082l lVar) {
            C41562b.f105272a.f105273b.storeStringArray(str, (String[]) C41562b.f105272a.mo85347a().mo34881a(lVar, String[].class));
        }

        /* renamed from: a */
        public final boolean mo18185a(String str, boolean z) {
            return C41562b.f105272a.mo85349a(str, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.ABTask$b */
    static class C35926b extends C10190k {
        C35926b() {
        }

        /* renamed from: a */
        public final IESSettingsProxy mo18197a() {
            return C32816h.m75716b();
        }

        /* renamed from: b */
        public final ABModel mo18198b() {
            return C23794bh.m58401o().mo85306m();
        }

        /* renamed from: c */
        public final boolean mo18199c() {
            if (C9431p.m18665a(C11010c.m22295p(), "local_test")) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.ABTask$c */
    static class C35927c extends C10197r {

        /* renamed from: a */
        private Boolean f92155a;

        /* renamed from: b */
        private Boolean f92156b;

        C35927c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
            if (r2.f92155a.booleanValue() != false) goto L_0x003d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo18216a() {
            /*
                r2 = this;
                java.lang.Boolean r0 = r2.f92156b
                if (r0 != 0) goto L_0x0014
                java.lang.String r0 = "local_test"
                java.lang.String r1 = com.bytedance.ies.ugc.p694a.C11010c.m22295p()
                boolean r0 = r0.equals(r1)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r2.f92156b = r0
            L_0x0014:
                java.lang.Boolean r0 = r2.f92156b
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L_0x003d
                com.ss.android.ugc.aweme.setting.a r0 = com.p683ss.android.ugc.aweme.setting.C41515a.f105192a
                boolean r0 = r0.f105194c
                r1 = 0
                if (r0 == 0) goto L_0x003c
                java.lang.Boolean r0 = r2.f92155a
                if (r0 != 0) goto L_0x0033
                java.lang.String r0 = "abmock_saved3"
                boolean r0 = r2.mo18222b(r0, r1)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r2.f92155a = r0
            L_0x0033:
                java.lang.Boolean r0 = r2.f92155a
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x003c
                goto L_0x003d
            L_0x003c:
                return r1
            L_0x003d:
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.legoImp.task.ABTask.C35927c.mo18216a():boolean");
        }

        /* renamed from: a */
        public final void mo18208a(String str) {
            C41561az.f105268a.f105269b.erase(str);
        }

        /* renamed from: b */
        public final String[] mo18223b(String str) {
            return C41561az.f105268a.f105269b.getStringArray(str, null);
        }

        /* renamed from: b */
        public final void mo18221b(String str, String str2) {
            C41561az.f105268a.mo85344a(str, str2);
        }

        /* renamed from: c */
        public final String mo18224c(String str, String str2) {
            return C41561az.f105268a.mo85346b(str, str2);
        }

        /* renamed from: a */
        public final void mo18209a(String str, double d) {
            C41561az.f105268a.f105269b.storeDouble(str, d);
        }

        /* renamed from: b */
        public final double mo18217b(String str, double d) {
            return C41561az.f105268a.f105269b.getDouble(str, d);
        }

        /* renamed from: a */
        public final Object mo18207a(String str, Class cls) {
            String b = C41561az.f105268a.mo85346b(str, null);
            if (b != null) {
                try {
                    return SettingsManagerProxy.inst().getGson().mo34884a(b, cls);
                } catch (Throwable th) {
                    C9220a.m18311a(th);
                }
            }
            return null;
        }

        /* renamed from: b */
        public final float mo18218b(String str, float f) {
            return C41561az.f105268a.f105269b.getFloat(str, f);
        }

        /* renamed from: a */
        public final void mo18210a(String str, float f) {
            C41561az.f105268a.f105269b.storeFloat(str, f);
        }

        /* renamed from: b */
        public final int mo18219b(String str, int i) {
            return C41561az.f105268a.f105269b.getInt(str, i);
        }

        /* renamed from: a */
        public final void mo18211a(String str, int i) {
            C41561az.f105268a.f105269b.storeInt(str, i);
        }

        /* renamed from: b */
        public final long mo18220b(String str, long j) {
            return C41561az.f105268a.f105269b.getLong(str, j);
        }

        /* renamed from: a */
        public final void mo18212a(String str, long j) {
            C41561az.f105268a.f105269b.storeLong(str, j);
        }

        /* renamed from: b */
        public final boolean mo18222b(String str, boolean z) {
            return C41561az.f105268a.mo85345a(str, z);
        }

        /* renamed from: a */
        public final void mo18213a(String str, C18082l lVar) {
            C41561az.f105268a.f105269b.storeStringArray(str, (String[]) SettingsManagerProxy.inst().getGson().mo34881a(lVar, String[].class));
        }

        /* renamed from: a */
        public final void mo18214a(String str, String str2) {
            C41561az.f105268a.mo85344a(str, str2);
        }

        /* renamed from: a */
        public final void mo18215a(String str, boolean z) {
            C41561az.f105268a.f105269b.storeBoolean(str, z);
        }
    }

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    public void run(Context context) {
        C24051a aVar = new C24051a();
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "registry");
        C10186g.m20576a();
        Application application = (Application) C11010c.m22280a();
        C35926b bVar = new C35926b();
        C35925a aVar2 = new C35925a();
        C35927c cVar = new C35927c();
        C10181b a = C10181b.m20511a();
        a.f27512a = application;
        a.f27513b = bVar;
        a.f27514c = aVar2;
        a.f27515d = cVar;
        C10177a.m20507a("正在初始化 ABMock");
        StringBuilder sb = new StringBuilder("isSupportMock : ");
        sb.append(a.f27513b.mo18199c());
        C10177a.m20507a(sb.toString());
        if (a.f27513b.mo18199c()) {
            C10188i.m20580a().mo34884a("{}", a.f27513b.mo18198b().getClass());
            C10182c.f27517a.mo18194a(application);
            C10195p.f27525a.mo18194a(application);
        }
    }
}
