package com.p683ss.android.ugc.aweme.notification.p2014d;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.bytedance.p582g.p583a.p593e.C10022a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.message.p1949b.C36779a;
import com.p683ss.android.ugc.aweme.message.p1949b.C36782d;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38039f;
import com.p683ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.p683ss.android.ugc.aweme.notice.api.bean.StrangerNoticeMessage;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38097k;
import com.p683ss.android.ugc.aweme.notification.C38112a;
import com.p683ss.android.ugc.aweme.notification.C38208h.C38209a;
import com.p683ss.android.ugc.aweme.notification.C38208h.C38209a.C38210a;
import com.p683ss.android.ugc.aweme.notification.C38208h.C38209a.C38211b;
import com.p683ss.android.ugc.aweme.notification.p2013c.C38160a;
import com.p683ss.android.ugc.aweme.notification.p2016f.C38188d;
import com.p683ss.android.ugc.aweme.notification.util.C38433e;
import com.p683ss.android.ugc.aweme.notification.util.C38433e.C38436b;
import com.p683ss.android.ugc.aweme.notification.view.C38462b;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.experiment.NoticeStructureSimplify;
import com.p683ss.android.ugc.aweme.p2108r.p2109a.C41049a;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.d.a */
public final class C38163a implements C36779a {

    /* renamed from: a */
    public C38462b f97201a;

    /* renamed from: b */
    private boolean f97202b = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);

    /* renamed from: a */
    public final void mo78162a() {
        C38433e.m85749a().mo78333a(46, (C38436b) new C38165c(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo78165c() {
        C38433e.m85749a().mo78333a(21, (C38436b) new C38167e(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo78164b() {
        C38433e.m85749a().mo78333a(47, (C38436b) new C38166d(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo78166d() {
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        if (baseUserService_Monster != null && baseUserService_Monster.getCurrentUser() != null) {
            C38433e.m85749a().mo78333a(62, (C38436b) new C38168f(this, 62));
        }
    }

    /* renamed from: b */
    private List<C38097k> m85306b(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m85302a(i));
        return arrayList;
    }

    @C53771m
    public final void onNoticeDeleteEvent(C38160a aVar) {
        NoticeStructureSimplify.m80101b();
        NoticeStructureSimplify.m80102c();
        NoticeStructureSimplify.m80103d();
    }

    /* renamed from: a */
    private static C38097k m85302a(int i) {
        C38097k kVar = new C38097k();
        kVar.f96924d = i;
        kVar.f96925e = 0;
        kVar.f96921a = 0;
        kVar.f96922b = 0;
        kVar.f96923c = 1;
        return kVar;
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onEvent(String str) {
        if (TextUtils.equals("sessionListFragment-onMain", str)) {
            C0013i.m18a((Callable<TResult>) new C38169g<TResult>(this), C0013i.f25b);
        }
    }

    /* renamed from: a */
    private void m85303a(String str) {
        m85304a("notice_log", "notice_fetch_failed", C23088c.m56631a().mo47824a("notice_type", str).mo47825b());
    }

    /* renamed from: a */
    private void m85305a(List<C38097k> list) {
        C52711k.m112240b(list, "list");
        StringBuilder sb = new StringBuilder("Try to fetch notice/multi with ");
        sb.append(C52575l.m112120a(C52575l.m112122a((Iterable<? extends T>) list, (Comparator<? super T>) new C38210a<Object>()), ", ", "[", "]", 0, null, C38211b.INSTANCE, 24, null));
        C38209a.m85379a(sb.toString());
        new C38164b(this);
    }

    /* renamed from: a */
    public final void mo75928a(C38039f fVar) {
        if (fVar.f96804a == 11) {
            int i = fVar.f96808e;
            if (i == 0) {
                IIMService a = C41049a.m90715a(false);
                if (a != null) {
                    Bundle bundle = new Bundle();
                    StrangerNoticeMessage strangerNoticeMessage = fVar.f96807d;
                    if (strangerNoticeMessage != null) {
                        bundle.putLong("last_create_time", strangerNoticeMessage.getCreateTime());
                        bundle.putString("from_user_id", strangerNoticeMessage.getFromUser().getUid());
                        bundle.putString("from_user_name", strangerNoticeMessage.getFromUser().getNickName());
                        bundle.putString("from_user_content", strangerNoticeMessage.getContent());
                        bundle.putInt("from_user_msg_type", strangerNoticeMessage.getMsgType());
                        bundle.putBoolean("is_recalled", strangerNoticeMessage.isRecalled());
                    }
                    bundle.putInt("unread_count", C36782d.m82775a().mo75940c(11));
                    a.onNewNoticeArrived(3, bundle);
                }
                if (this.f97201a != null) {
                }
            } else if (i == 1) {
                C41049a.m90714a().onNewNoticeArrived(4, new Bundle());
            }
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onAggregatedEvent(C38112a aVar) {
        if (!C10022a.m20170a(aVar.f96989c)) {
            ArrayList arrayList = new ArrayList();
            for (NoticeCount noticeCount : aVar.f96989c) {
                if (noticeCount != null && noticeCount.getCount() > 0) {
                    switch (noticeCount.getGroup()) {
                        case 21:
                            arrayList.add(m85302a(21));
                            break;
                        case 33:
                            arrayList.add(m85302a(33));
                            break;
                        case BaseNotice.f96882AT /*45*/:
                            arrayList.add(m85302a(45));
                            break;
                        case 46:
                            arrayList.add(m85302a(46));
                            break;
                        case 47:
                            arrayList.add(m85302a(47));
                            break;
                        case BaseNotice.CREATOR /*62*/:
                            IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
                            if (!(baseUserService_Monster == null || baseUserService_Monster.getCurrentUser() == null)) {
                                arrayList.add(m85302a(62));
                                break;
                            }
                        case 68:
                            arrayList.add(m85302a(68));
                            break;
                    }
                }
            }
            int size = arrayList.size();
            if (size > 0) {
                if (size > 1) {
                    m85305a((List<C38097k>) arrayList);
                    return;
                }
                C38097k kVar = (C38097k) arrayList.get(0);
                aVar.f96987a = kVar.f96924d;
                aVar.f96988b = kVar.f96923c;
            } else {
                return;
            }
        }
        if (aVar.f96990d == null || !this.f97202b) {
            switch (aVar.f96987a) {
                case 2:
                case 44:
                    NoticeStructureSimplify.m80100a();
                    if (this.f97201a != null) {
                        this.f97201a.mo78173a(3, aVar.f96988b);
                    }
                    return;
                case 3:
                    NoticeStructureSimplify.m80100a();
                    if (this.f97201a != null) {
                        this.f97201a.mo78173a(1, aVar.f96988b);
                    }
                    return;
                case 6:
                    NoticeStructureSimplify.m80100a();
                    if (this.f97201a != null) {
                        this.f97201a.mo78173a(2, aVar.f96988b);
                    }
                    return;
                case 7:
                    NoticeStructureSimplify.m80100a();
                    if (this.f97201a != null) {
                        this.f97201a.mo78173a(0, aVar.f96988b);
                        return;
                    }
                    break;
                case 12:
                    if (this.f97201a != null) {
                        this.f97201a.mo78178g();
                        return;
                    }
                    break;
                case 16:
                    if (aVar.f96988b > 0) {
                        return;
                    }
                    break;
                case 19:
                    if (aVar.f96988b > 0) {
                        return;
                    }
                    break;
                case 21:
                    if (aVar.f96988b > 0) {
                        mo78165c();
                        return;
                    }
                    break;
                case 29:
                    if (aVar.f96988b > 0) {
                        return;
                    }
                    break;
                case 31:
                    if (aVar.f96988b > 0) {
                        return;
                    }
                    break;
                case 32:
                    if (aVar.f96988b > 0) {
                        return;
                    }
                    break;
                case 33:
                    if (aVar.f96988b > 0) {
                        return;
                    }
                    break;
                case BaseNotice.f96882AT /*45*/:
                    if (aVar.f96988b > 0) {
                        return;
                    }
                    break;
                case 46:
                    if (aVar.f96988b > 0) {
                        mo78162a();
                        return;
                    }
                    break;
                case 47:
                    if (aVar.f96988b > 0) {
                        mo78164b();
                        return;
                    }
                    break;
                case 52:
                    if (aVar.f96988b > 0) {
                        return;
                    }
                    break;
                case 60:
                case BaseNotice.CREATOR /*62*/:
                    if (aVar.f96988b > 0) {
                        mo78166d();
                        break;
                    }
                    break;
                case UnReadVideoExperiment.RELATION_LIST /*64*/:
                    m85305a(m85306b(64));
                    return;
                case 68:
                    if (aVar.f96988b > 0) {
                        return;
                    }
                    break;
                case 103:
                    if (aVar.f96988b > 0) {
                        return;
                    }
                    break;
            }
            return;
        }
        for (Integer intValue : aVar.f96990d.keySet()) {
            int intValue2 = intValue.intValue();
            int a = aVar.mo78080a(intValue2);
            switch (intValue2) {
                case 2:
                case 44:
                    NoticeStructureSimplify.m80100a();
                    if (this.f97201a == null) {
                        break;
                    } else {
                        this.f97201a.mo78173a(3, a);
                        break;
                    }
                case 3:
                    NoticeStructureSimplify.m80100a();
                    if (this.f97201a == null) {
                        break;
                    } else {
                        this.f97201a.mo78173a(1, a);
                        break;
                    }
                case 6:
                    NoticeStructureSimplify.m80100a();
                    if (this.f97201a == null) {
                        break;
                    } else {
                        this.f97201a.mo78173a(2, a);
                        break;
                    }
                case 7:
                    NoticeStructureSimplify.m80100a();
                    if (this.f97201a == null) {
                        break;
                    } else {
                        this.f97201a.mo78173a(0, a);
                        break;
                    }
                case 12:
                    if (this.f97201a == null) {
                        break;
                    } else {
                        this.f97201a.mo78178g();
                        break;
                    }
                case 21:
                    if (a <= 0) {
                        break;
                    } else {
                        mo78165c();
                        break;
                    }
                case 46:
                    if (a <= 0) {
                        break;
                    } else {
                        mo78162a();
                        break;
                    }
                case 47:
                    if (a <= 0) {
                        break;
                    } else {
                        mo78164b();
                        break;
                    }
                case 60:
                case BaseNotice.CREATOR /*62*/:
                    if (a <= 0) {
                        break;
                    } else {
                        mo78166d();
                        break;
                    }
                case UnReadVideoExperiment.RELATION_LIST /*64*/:
                    m85305a(m85306b(64));
                    break;
            }
        }
    }

    /* renamed from: a */
    private static void m85304a(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException unused) {
        }
        C9951d.m19997a(str, jSONObject);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo78163a(BaseNotice baseNotice, C38188d dVar, int i) {
        if (baseNotice != null) {
            return false;
        }
        if (i > 0) {
            if (C41049a.m90714a().getNoticeSession(dVar.bm_()) == null) {
                dVar.mo78183f();
            }
            m85303a(dVar.bm_());
        }
        return true;
    }
}
