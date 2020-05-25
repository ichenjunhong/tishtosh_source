package com.p683ss.android.ugc.aweme.money.growth;

import android.text.TextUtils;
import com.bytedance.ies.C10174a;
import com.bytedance.p126ad.symphony.p139i.C2745d;
import com.bytedance.polaris.p821a.C12563i;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.money.growth.f */
public final class C37170f {

    /* renamed from: f */
    public static final C37170f f94866f = C37172b.f94874a;

    /* renamed from: g */
    public static final C37171a f94867g = new C37171a(null);

    /* renamed from: a */
    public final C37168e f94868a;

    /* renamed from: b */
    public boolean f94869b;

    /* renamed from: c */
    public long f94870c;

    /* renamed from: d */
    public boolean f94871d;

    /* renamed from: e */
    public long f94872e;

    /* renamed from: h */
    private List<UgActivityTasks> f94873h;

    /* renamed from: com.ss.android.ugc.aweme.money.growth.f$a */
    public static final class C37171a {
        private C37171a() {
        }

        /* renamed from: a */
        public static C37170f m83416a() {
            return C37170f.f94866f;
        }

        public /* synthetic */ C37171a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.money.growth.f$b */
    static final class C37172b {

        /* renamed from: a */
        static final C37170f f94874a = new C37170f(null);

        /* renamed from: b */
        public static final C37172b f94875b = new C37172b();

        private C37172b() {
        }
    }

    /* renamed from: a */
    public static long m83409a() {
        return System.currentTimeMillis() / 1000;
    }

    private C37170f() {
        this.f94868a = new C37168e();
    }

    /* renamed from: d */
    private final void m83413d() {
        long a = m83409a();
        if (this.f94868a.f94863a <= 0) {
            m83410a("初始化时间记录");
            mo76494b(a);
            return;
        }
        if (a < this.f94868a.f94863a || a > this.f94868a.f94863a + TimeUnit.DAYS.toSeconds(1)) {
            mo76494b(a);
            m83410a("不是同一天，重置时间记录");
        }
    }

    /* renamed from: c */
    private final boolean m83412c() {
        List<UgActivityTasks> list;
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (!g.isLogin()) {
            m83410a("未登录，不累计阅读数");
            return false;
        }
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            UgAwemeActivitySetting awemeActivitySetting = b.getAwemeActivitySetting();
            if (awemeActivitySetting != null) {
                list = awemeActivitySetting.getActivityTasks();
            } else {
                list = null;
            }
            this.f94873h = list;
            if (C2745d.m7836a(this.f94873h)) {
                m83410a("task为空，，不累计阅读数");
                return false;
            }
            List<UgActivityTasks> list2 = this.f94873h;
            if (list2 != null) {
                for (UgActivityTasks taskType : list2) {
                    Integer taskType2 = taskType.getTaskType();
                    if (taskType2 != null) {
                        if (taskType2.intValue() == 1) {
                            return true;
                        }
                    }
                }
            }
            m83410a("未发现阅读任务，不累计阅读数");
            return false;
        } catch (C10174a unused) {
            m83410a("setting数据为空，不累计阅读数");
            return false;
        }
    }

    /* renamed from: b */
    private final void m83411b() {
        List<UgActivityTasks> list;
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            UgAwemeActivitySetting awemeActivitySetting = b.getAwemeActivitySetting();
            if (awemeActivitySetting != null) {
                list = awemeActivitySetting.getActivityTasks();
            } else {
                list = null;
            }
            this.f94873h = list;
            if (!C2745d.m7836a(this.f94873h)) {
                List<UgActivityTasks> list2 = this.f94873h;
                if (list2 != null) {
                    for (UgActivityTasks ugActivityTasks : list2) {
                        Integer taskType = ugActivityTasks.getTaskType();
                        if (taskType != null) {
                            if (taskType.intValue() == 1) {
                                long j = this.f94868a.f94864b;
                                Long time = ugActivityTasks.getTime();
                                C52711k.m112236a((Object) time, "it.time");
                                if (j > time.longValue() && !TextUtils.isEmpty(ugActivityTasks.getTaskId())) {
                                    C23794bh.m58412z().mo47735s();
                                    StringBuilder sb = new StringBuilder("上报阅读任务完成，已阅读时长: ");
                                    sb.append(this.f94868a.f94864b);
                                    sb.append("  任务id:");
                                    sb.append(ugActivityTasks.getTaskId());
                                    sb.append("  taskType :");
                                    sb.append(ugActivityTasks.getTaskType());
                                    sb.append("  time: ");
                                    sb.append(ugActivityTasks.getTime());
                                    m83410a(sb.toString());
                                    C12563i.m25217a(ugActivityTasks.getTaskId(), null, (JSONObject) null);
                                }
                            }
                        }
                    }
                }
            }
        } catch (C10174a unused) {
        }
    }

    public /* synthetic */ C37170f(C52707g gVar) {
        this();
    }

    /* renamed from: a */
    public static void m83410a(String str) {
        C37164d.m83388b(str);
    }

    /* renamed from: a */
    public final void mo76493a(long j) {
        if (m83412c()) {
            m83413d();
            if (j > TimeUnit.MINUTES.toSeconds(15)) {
                C37168e eVar = this.f94868a;
                eVar.mo76492b(eVar.f94864b + TimeUnit.MINUTES.toSeconds(1));
            } else if (j < 0) {
                C37168e eVar2 = this.f94868a;
                eVar2.mo76492b(eVar2.f94864b + TimeUnit.SECONDS.toSeconds(5));
            } else {
                C37168e eVar3 = this.f94868a;
                eVar3.mo76492b(eVar3.f94864b + j);
            }
            StringBuilder sb = new StringBuilder("已播放： ");
            sb.append(this.f94868a.f94864b);
            m83410a(sb.toString());
            m83411b();
        }
    }

    /* renamed from: b */
    public final void mo76494b(long j) {
        StringBuilder sb = new StringBuilder("resetKevaData, now:");
        sb.append(j);
        m83410a(sb.toString());
        Calendar instance = Calendar.getInstance();
        C52711k.m112236a((Object) instance, "c");
        instance.setTimeInMillis(j * 1000);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        this.f94868a.mo76491a(instance.getTimeInMillis() / 1000);
        this.f94868a.mo76492b(0);
    }
}
