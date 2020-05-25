package com.p683ss.android.ugc.aweme.message.p1949b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.common.utility.p525e.C9402b;
import com.bytedance.common.wschannel.p538f.C9519a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.main.C36616dz;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38034b;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38037d;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38039f;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38041h;
import com.p683ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.p683ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.p683ss.android.ugc.aweme.notice.api.p2004a.C38023a;
import com.p683ss.android.ugc.aweme.notice.api.p2004a.C38024b;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment;
import com.p683ss.android.ugc.aweme.notice.api.p2006b.C38030c;
import com.p683ss.android.ugc.aweme.notice.api.p2006b.C38031d;
import com.p683ss.android.ugc.aweme.notice.api.p2008sp.C38050a;
import com.p683ss.android.ugc.aweme.notice.api.p2008sp.C38053d;
import com.p683ss.android.ugc.aweme.notice.api.p2009ws.C38061e;
import com.p683ss.android.ugc.aweme.notice.api.p2009ws.C38064h;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p683ss.android.ugc.aweme.notice.repo.api.NotificationApi.INotificationApi;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notification.C38112a;
import com.p683ss.android.ugc.aweme.notification.p2018g.C38206a;
import com.p683ss.android.ugc.aweme.p1632di.C27628bo;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.message.b.d */
public class C36782d implements C9382a, C38023a, C38030c, C38031d {

    /* renamed from: a */
    private static long f93998a = System.currentTimeMillis();

    /* renamed from: k */
    private static volatile C36782d f93999k;

    /* renamed from: b */
    private boolean f94000b;

    /* renamed from: c */
    private SparseArray<C36779a> f94001c = new SparseArray<>();

    /* renamed from: d */
    private SparseArray<Integer> f94002d = new SparseArray<>();

    /* renamed from: e */
    private HashMap<Integer, Integer> f94003e;

    /* renamed from: f */
    private HashMap<Integer, Integer> f94004f;

    /* renamed from: g */
    private int[] f94005g = {0, 4, 5, 7, 3, 2, 6, 1, 47, 46, 35, 9, 21, 12, 13, 37, 26, 11, 99, BaseNotice.HASHTAG, 998, 997, 43, 1000, 62, 61};

    /* renamed from: h */
    private SharedPreferences f94006h;

    /* renamed from: i */
    private Handler f94007i = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: j */
    private boolean f94008j = false;

    /* renamed from: c */
    public static C38031d m82777c() {
        if (C27991b.f73443a == null) {
            synchronized (C38031d.class) {
                if (C27991b.f73443a == null) {
                    C27991b.f73443a = C27628bo.m66318m();
                }
            }
        }
        return (C38031d) C27991b.f73443a;
    }

    /* renamed from: d */
    public static C38030c m82778d() {
        if (C27991b.f73439W == null) {
            synchronized (C38030c.class) {
                if (C27991b.f73439W == null) {
                    C27991b.f73439W = C27628bo.m66319n();
                }
            }
        }
        return (C38030c) C27991b.f73439W;
    }

    /* renamed from: a */
    public static C36782d m82775a() {
        if (f93999k == null) {
            synchronized (C36782d.class) {
                if (f93999k == null) {
                    f93999k = new C36782d();
                }
            }
        }
        return f93999k;
    }

    /* renamed from: e */
    private void m82779e() {
        int[] iArr;
        for (int i : this.f94005g) {
            this.f94002d.append(i, Integer.valueOf(this.f94006h.getInt(m82781f(i), 0)));
        }
    }

    /* renamed from: b */
    public final void mo75938b() {
        this.f94002d.clear();
        if (!this.f94000b) {
            Editor edit = this.f94006h.edit();
            edit.clear();
            C9402b.m18594a(edit);
        }
    }

    private C36782d() {
        Context a = C11010c.m22280a();
        C38061e a2 = C38061e.m85129a();
        a2.f96833a.add(new C38024b());
        C38064h d = C38064h.m85136d();
        C38037d dVar = C38037d.NOTICE;
        Set set = (Set) d.f96845d.get(dVar);
        if (set == null) {
            set = new HashSet();
            d.f96845d.put(dVar, set);
        }
        set.add(this);
        if (!this.f94000b) {
            this.f94006h = C35807d.m80935a(a, "red-point-cache", 0);
            m82779e();
        }
        if (C9519a.m18891a(C11010c.m22280a())) {
            this.f94000b = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);
        }
    }

    /* renamed from: a */
    public final void mo75934a(Message message) {
        handleMsg(message);
    }

    /* renamed from: a */
    public final void mo75931a(int i) {
        this.f94001c.remove(2);
    }

    /* renamed from: f */
    private static String m82781f(int i) {
        StringBuilder sb = new StringBuilder("unread_");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: d */
    public final void mo75941d(final int i) {
        C23566n.m57766a().mo48750a(this.f94007i, new Callable() {
            public final Object call() throws Exception {
                return (NoticeList) ((INotificationApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(TutorialVideoApiManager.f96873a).create(INotificationApi.class)).query(i).execute().f33552b;
            }
        }, 0);
    }

    /* renamed from: e */
    private boolean m82780e(int i) {
        if (i == 11) {
            if (mo75940c(i) <= 0 || mo75940c(998) <= 0) {
                return false;
            }
            return true;
        } else if (mo75940c(i) > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public final void mo75939b(int i) {
        this.f94002d.remove(i);
        if (!this.f94000b) {
            Editor edit = this.f94006h.edit();
            edit.putInt(m82781f(i), 0);
            C9402b.m18594a(edit);
        }
    }

    /* renamed from: a */
    public final void mo75936a(boolean z) {
        this.f94008j = z;
    }

    /* renamed from: c */
    public final int mo75940c(int i) {
        if (i == 36) {
            return mo75940c(7) + 0 + mo75940c(3) + mo75940c(2) + mo75940c(43) + mo75940c(6) + mo75940c(14) + mo75940c(13) + mo75940c(37);
        }
        if (this.f94002d.get(i) == null) {
            return 0;
        }
        return ((Integer) this.f94002d.get(i)).intValue();
    }

    /* renamed from: a */
    public final void mo75935a(C38034b bVar) {
        boolean z;
        C38050a aVar;
        if (bVar instanceof C38039f) {
            C38039f fVar = (C38039f) bVar;
            if (!MTNotificationTabMergeExperiment.m85061a() || fVar == null || fVar.f96804a != 5 || C38206a.f97273b.getShowRedDotType() != 3) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                m82776b(fVar.f96804a, fVar.f96805b);
                this.f94002d.put(fVar.f96804a, Integer.valueOf(fVar.f96805b));
                if (!this.f94000b) {
                    Editor edit = this.f94006h.edit();
                    edit.putInt(m82781f(fVar.f96804a), fVar.f96805b);
                    C9402b.m18594a(edit);
                }
                mo75937a(false, 2);
                if (fVar.f96804a == 100) {
                    Object a = C27991b.m66756a(C38050a.class);
                    if (a != null) {
                        aVar = (C38050a) a;
                    } else {
                        aVar = (C38050a) C20302a.m50070a(C38050a.class).mo42947a(new C20310d()).mo42946a().mo42948b();
                    }
                    aVar.mo48539a(true);
                }
                int i = fVar.f96804a;
                C36779a aVar2 = (C36779a) this.f94001c.get(2);
                if (!(aVar2 == null || fVar == null)) {
                    aVar2.mo75928a(fVar);
                }
                if (!C36616dz.m82504a(i) && m82780e(i)) {
                    C47718bf.m103288a(new C38041h(i, mo75940c(i)));
                }
                if (C38206a.f97273b.isEnableMultiAccountLogin() && C20854a.m53167g().allUidList().size() > 1) {
                    C36780b.m82772a().mo75930a(C20854a.m53167g().allUidList());
                }
            }
        }
    }

    public void handleMsg(Message message) {
        if (message.what == 0 && !(message.obj instanceof Exception)) {
            NoticeList noticeList = (NoticeList) message.obj;
            if (!(noticeList == null || noticeList.getItems() == null || noticeList.getItems().isEmpty())) {
                C47718bf.m103288a(new C38041h(-2));
                this.f94003e = new HashMap<>();
                this.f94004f = new HashMap<>();
                boolean c = MTNotificationTabMergeExperiment.m85063c();
                for (NoticeCount noticeCount : noticeList.getItems()) {
                    if (noticeCount != null) {
                        int group = noticeCount.getGroup();
                        int count = noticeCount.getCount();
                        mo75932a(group, count);
                        boolean z = true;
                        if (!(group == 3 || group == 2 || group == 44 || group == 6 || group == 7 || group == 12 || group == 52 || (count > 0 && (group == 46 || group == 57 || group == 47 || group == 16 || group == 29 || group == 32 || group == 21 || group == 33 || group == 103 || group == 45 || group == 31 || group == 19)))) {
                            z = false;
                        }
                        if (z) {
                            if (this.f94000b) {
                                this.f94003e.put(Integer.valueOf(group), Integer.valueOf(count));
                            } else {
                                C47718bf.m103288a(new C38112a(group, count));
                            }
                        }
                        if (C36616dz.m82505a(group, c)) {
                            if (this.f94000b) {
                                this.f94004f.put(Integer.valueOf(group), Integer.valueOf(count));
                            } else {
                                C47718bf.m103288a(new C38041h(group, count));
                            }
                        }
                        if (!C36616dz.m82505a(group, c) && m82780e(group)) {
                            if (this.f94000b) {
                                this.f94004f.put(Integer.valueOf(group), Integer.valueOf(count));
                            } else {
                                C47718bf.m103288a(new C38041h(group, mo75940c(group)));
                            }
                        }
                    }
                }
                if (this.f94003e.size() > 0 && this.f94000b) {
                    C47718bf.m103288a(new C38112a(this.f94003e));
                }
                if (this.f94004f.size() > 0 && this.f94000b) {
                    C47718bf.m103288a(new C38041h(this.f94004f));
                }
                C47718bf.m103288a(new C38041h(-3));
            }
        }
    }

    /* renamed from: a */
    public final void mo75933a(int i, C36779a aVar) {
        this.f94001c.put(2, aVar);
    }

    /* renamed from: a */
    public final void mo75932a(int i, int i2) {
        m82776b(i, i2);
        this.f94002d.put(i, Integer.valueOf(i2));
        if (!this.f94000b) {
            Editor edit = this.f94006h.edit();
            edit.putInt(m82781f(i), i2);
            C9402b.m18594a(edit);
        }
    }

    /* renamed from: b */
    private void m82776b(int i, int i2) {
        if (i == 11) {
            int c = i2 - mo75940c(11);
            if (!this.f94008j && c > 0) {
                this.f94002d.put(998, Integer.valueOf(c));
                this.f94002d.put(997, Integer.valueOf(c));
                if (!this.f94000b) {
                    Editor edit = this.f94006h.edit();
                    edit.putInt(m82781f(998), c);
                    edit.putInt(m82781f(997), c);
                    C9402b.m18594a(edit);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo75937a(boolean z, int i) {
        if (C20854a.m53167g().isLogin() && !TextUtils.isEmpty(C20854a.m53167g().getCurUserId())) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!z || currentTimeMillis >= f93998a + 300000) {
                if (i == 2 || ((C38050a) C38053d.m85113a(C38050a.class)).mo48537a() > 0) {
                    C0013i.m12a((long) ((C38050a) C38053d.m85113a(C38050a.class)).mo48537a()).mo19a((C0011g<TResult, TContinuationResult>) new C36784e<TResult,TContinuationResult>(this, i));
                } else {
                    mo75941d(i);
                }
                f93998a = currentTimeMillis;
            }
        }
    }
}
