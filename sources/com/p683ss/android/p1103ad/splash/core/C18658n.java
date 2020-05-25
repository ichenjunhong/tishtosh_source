package com.p683ss.android.p1103ad.splash.core;

import android.text.TextUtils;
import com.p683ss.android.p1103ad.splash.core.p1113b.C18584a.C18585a;
import com.p683ss.android.p1103ad.splash.core.p1113b.C18586b;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18602b;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18610h;
import com.p683ss.android.p1103ad.splash.p1110b.C18550a;
import com.p683ss.android.p1103ad.splash.p1110b.C18557b;
import com.p683ss.android.p1103ad.splash.p1111c.C18561c;
import com.p683ss.android.p1103ad.splash.p1121e.C18728a;
import com.p683ss.android.p1103ad.splash.p1123g.C18735a;
import com.p683ss.android.p1103ad.splash.p1123g.C18740f;
import com.p683ss.android.p1103ad.splash.p1123g.C18744j;
import com.p683ss.android.p1103ad.splash.p1123g.C18749n;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.n */
final class C18658n {

    /* renamed from: d */
    private static volatile C18658n f51567d;

    /* renamed from: a */
    public long f51568a;

    /* renamed from: b */
    public String f51569b = "";

    /* renamed from: c */
    public long f51570c;

    /* renamed from: e */
    private C18602b f51571e;

    /* renamed from: a */
    private boolean m45280a(C18602b bVar) {
        C18561c J = C18642g.m45182J();
        boolean z = false;
        if (J == null || TextUtils.isEmpty(bVar.mo37857C())) {
            return false;
        }
        String str = "";
        if (bVar.mo37990l()) {
            z = J.mo37869a(bVar, false);
            str = z ? "topview_show_confirmed" : "topview_show_rejected";
        } else if (bVar.mo37991m()) {
            str = "topview_search_show_rejected";
        }
        if (z) {
            this.f51568a = System.currentTimeMillis();
        } else if (this.f51571e == null) {
            this.f51571e = bVar;
        }
        C18586b.m44982a();
        C18586b.m44990b(bVar, str);
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C18602b mo38077a(boolean z) {
        List<C18602b> list;
        if (C18674v.m45443a().f51621h) {
            C18735a.m45670c("开屏 SDK 未启用");
            return null;
        } else if (C18642g.m45195W()) {
            return m45282b();
        } else {
            C18602b b = C18628f.m45128a().mo38031b();
            if (b != null) {
                C18628f.m45128a().mo38032c();
                return b;
            }
            int c = m45285c();
            int i = 4;
            if (c != 4) {
                if (c == 0) {
                    C18735a.m45667b("符合频控，但广告展示超过今日最大次数，无法展示广告，刷次增加");
                    m45287c(true);
                    C18585a aVar = new C18585a();
                    aVar.mo37934a(84378473382L).mo37935a(C18654k.m45259a().f51563j).mo37933a(6);
                    C18586b.m44982a();
                    C18586b.m44995d(aVar.mo37937a());
                } else {
                    C18735a.m45667b("不符合广告频控，无法展示广告，刷次不增加");
                    C18585a aVar2 = new C18585a();
                    aVar2.mo37934a(84378473382L).mo37933a(2).mo37935a(C18654k.m45259a().f51563j);
                    C18586b.m44982a();
                    C18586b.m44988b(aVar2.mo37937a());
                }
                return null;
            }
            C18735a.m45667b("符合频控，刷次增加，开始检查停投状态");
            m45287c(false);
            StringBuilder sb = new StringBuilder("UDPClient. getCurrentSplashAd ");
            sb.append(System.currentTimeMillis());
            sb.append("result :");
            sb.append(C18674v.m45443a().f51615b);
            if (C18674v.m45443a().f51615b != -1) {
                long j = C18674v.m45443a().f51620g;
                if (C18674v.m45443a().f51615b == 1) {
                    m45275a(j, true);
                    C18735a.m45667b("成功接收到停投指令，且结果是停止展示广告");
                    return null;
                } else if (C18674v.m45443a().f51615b == 2) {
                    C18735a.m45667b("成功接收到停投指令，且结果是继续展示广告");
                    m45275a(j, false);
                }
            } else {
                C18735a.m45667b("没有接收到停投指令，开始检查预加载停投时间段");
                if (!C18674v.m45443a().mo38183d()) {
                    long j2 = C18654k.m45259a().f51559f;
                    long j3 = C18654k.m45259a().f51560g;
                    if (C18744j.m45717a(j2, j3)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis >= j2 && currentTimeMillis <= j3) {
                            if (C18642g.m45193U()) {
                                m45284b(true);
                            }
                            C18735a.m45667b("命中预加载停投时间段，停止展示广告");
                            return null;
                        }
                    }
                }
                if (C18642g.m45193U()) {
                    m45284b(false);
                }
                C18735a.m45667b("没有命中预加载停投时间段，继续展示广告");
            }
            C18610h hVar = C18654k.m45259a().f51556c;
            if (hVar == null) {
                return null;
            }
            if (!hVar.f51384e || !C18674v.m45443a().mo38183d()) {
                if (C18642g.m45186N()) {
                    C18735a.m45667b("实时请求失败，使用预加载的广告顺序");
                    C18550a.m44899a().mo37843a("service_real_time_ad_monitor", 3, (JSONObject) null);
                }
                list = hVar.f51381b;
                if (C18740f.m45691a(list)) {
                    C18735a.m45667b("广告队列为空，此次开屏不展示广告");
                    C18585a aVar3 = new C18585a();
                    aVar3.mo37934a(84378473382L).mo37933a(3).mo37935a(C18654k.m45259a().f51563j);
                    C18586b.m44982a();
                    C18586b.m44988b(aVar3.mo37937a());
                    C18557b.m44917a();
                    C18557b.m44918a(1);
                    return null;
                }
            } else {
                C18735a.m45667b("接收到实时广告数据");
                List b2 = C18674v.m45443a().mo38181b();
                list = C18744j.m45711a(hVar.f51382c, b2);
                if (C18740f.m45691a(list)) {
                    if (C18740f.m45691a(b2)) {
                        C18735a.m45667b("接收到的实时广告数据队列为空");
                        C18550a.m44899a().mo37843a("service_real_time_ad_monitor", 2, (JSONObject) null);
                    } else {
                        C18735a.m45667b("接收到的实时广告和上一次预加载广告没有匹配的数据");
                        i = 5;
                        C18550a.m44899a().mo37843a("service_real_time_ad_monitor", 1, (JSONObject) null);
                    }
                    C18585a aVar4 = new C18585a();
                    aVar4.mo37934a(84378473382L).mo37933a(i).mo37935a(C18654k.m45259a().f51563j);
                    C18586b.m44982a();
                    C18586b.m44988b(aVar4.mo37937a());
                    C18557b.m44917a();
                    C18557b.m44918a(1);
                    return null;
                }
                C18550a.m44899a().mo37843a("service_real_time_ad_monitor", 0, (JSONObject) null);
            }
            if (C18642g.m45174B()) {
                boolean z2 = !C18673u.m45399a().mo38156d();
                StringBuilder sb2 = new StringBuilder("支持首刷逻辑，当前是否为首刷次：");
                sb2.append(z2);
                C18735a.m45667b(sb2.toString());
                if (z2) {
                    C18673u.m45399a().mo38150b(true).mo38164h();
                    C18735a.m45667b("当前是首刷次，标记消耗首刷，开始挑选首刷广告");
                    list = m45293g(list);
                } else {
                    C18735a.m45667b("当前非首刷次，挑选非首刷广告");
                    list = m45294h(list);
                }
            } else {
                C18735a.m45667b("不支持首刷逻辑");
            }
            List f = m45292f(list);
            if (C18740f.m45691a(f)) {
                C18735a.m45667b("没有挑选出合适的广告，本次开屏不展示");
                return null;
            }
            C18602b i2 = m45295i(f);
            if (!(this.f51571e == null || i2 == null)) {
                C18586b.m44982a();
                C18586b.m44985a(this.f51571e, i2);
            }
            this.f51571e = null;
            return i2;
        }
    }

    private C18658n() {
    }

    /* renamed from: a */
    public static C18658n m45272a() {
        if (f51567d == null) {
            synchronized (C18658n.class) {
                if (f51567d == null) {
                    f51567d = new C18658n();
                }
            }
        }
        return f51567d;
    }

    /* renamed from: c */
    private int m45285c() {
        if (C18744j.m45721a(C18673u.m45399a())) {
            C18735a.m45667b("超过广告当日展示次数，不展示广告");
            if (C18642g.m45226d()) {
                C18749n.m45747a(C18642g.m45184L().getString(R.string.dm1));
            }
            m45273a(2001, 2);
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (C18642g.m45210a() && Math.abs(currentTimeMillis - C18642g.m45222c()) > 10000) {
            if (C18642g.m45226d()) {
                C18749n.m45747a(C18642g.m45184L().getString(R.string.dlz));
            }
            m45273a(2002, 3);
            return 3;
        } else if (Math.abs(currentTimeMillis - C18642g.m45173A()) < C18654k.m45259a().f51558e) {
            C18735a.m45667b("不满足切后台时间，不展示广告");
            if (C18642g.m45226d()) {
                C18749n.m45747a(C18642g.m45184L().getString(R.string.dm0));
            }
            m45273a(2003, 4);
            return 1;
        } else if (!m45279a(currentTimeMillis)) {
            return 4;
        } else {
            C18735a.m45667b("不满足两次广告展示间隔，不展示广告");
            if (C18642g.m45226d()) {
                C18749n.m45747a(C18642g.m45184L().getString(R.string.dm4));
            }
            m45273a(2004, 5);
            return 2;
        }
    }

    /* renamed from: d */
    private List<C18602b> m45290d() {
        ArrayList arrayList = new ArrayList();
        List<C18602b> list = C18654k.m45259a().f51555b;
        if (!C18740f.m45691a(list)) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C18602b bVar = (C18602b) it.next();
                if (bVar.mo37968D()) {
                    arrayList.add(bVar);
                    C18735a.m45661a(bVar.mo37863p(), "回捞到首刷广告");
                    new StringBuilder("成功回捞 ad: ").append(bVar.mo37863p());
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.putOpt("is_ad_event", "1").putOpt("log_extra", bVar.mo37864r()).putOpt("ad_fetch_time", Long.valueOf(bVar.mo37862f()));
                    } catch (Exception unused) {
                    }
                    C18642g.m45201a(bVar.mo37863p(), "splash_ad", "launch_miss", jSONObject);
                    C18673u.m45399a().mo38144a(false).mo38164h();
                    break;
                }
                C18735a.m45661a(bVar.mo37863p(), "回捞首刷广告失败，广告过期");
                new StringBuilder("回捞失败——ad过期 ad: ").append(bVar.mo37863p());
            }
        } else {
            C18735a.m45667b("回捞失败，本地回捞队列为空");
        }
        if (arrayList.size() > 0) {
            this.f51570c = ((C18602b) arrayList.get(0)).mo37863p();
        }
        return arrayList;
    }

    /* renamed from: b */
    private C18602b m45282b() {
        C18602b bVar;
        if (C18674v.m45443a().f51621h) {
            return null;
        }
        C18602b b = C18628f.m45128a().mo38031b();
        if (b != null) {
            C18628f.m45128a().mo38032c();
            return b;
        }
        int c = m45285c();
        if (c != 4) {
            if (c == 0) {
                C18735a.m45667b("符合频控，但广告展示超过今日最大次数，无法展示广告，刷次增加");
                m45287c(true);
                C18586b.m44982a();
                C18586b.m44995d(new C18585a().mo37934a(84378473382L).mo37935a(C18654k.m45259a().f51563j).mo37933a(6).mo37937a());
            } else {
                C18735a.m45667b("不符合广告频控，无法展示广告，刷次不增加");
                C18586b.m44982a();
                C18586b.m44988b(new C18585a().mo37934a(84378473382L).mo37933a(2).mo37935a(C18654k.m45259a().f51563j).mo37937a());
            }
            return null;
        }
        C18735a.m45667b("符合频控，刷次增加，开始检查停投状态");
        m45287c(false);
        StringBuilder sb = new StringBuilder("UDPClient. getCurrentSplashAd ");
        sb.append(System.currentTimeMillis());
        sb.append("result :");
        sb.append(C18674v.m45443a().f51615b);
        if (C18674v.m45443a().f51615b != -1) {
            long j = C18674v.m45443a().f51620g;
            if (C18674v.m45443a().f51615b == 1) {
                m45275a(j, true);
                C18735a.m45667b("成功接收到停投指令，且结果是停止展示广告");
                return null;
            } else if (C18674v.m45443a().f51615b == 2) {
                C18735a.m45667b("成功接收到停投指令，且结果是继续展示广告");
                m45275a(j, false);
            }
        } else {
            C18735a.m45667b("没有接收到停投指令，开始检查预加载停投时间段");
            if (!C18674v.m45443a().mo38184e()) {
                long j2 = C18654k.m45259a().f51559f;
                long j3 = C18654k.m45259a().f51560g;
                if (C18744j.m45717a(j2, j3)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis >= j2 && currentTimeMillis <= j3) {
                        if (C18642g.m45193U()) {
                            m45284b(true);
                        }
                        C18735a.m45667b("命中预加载停投时间段，停止展示广告");
                        return null;
                    }
                }
            }
            if (C18642g.m45193U()) {
                m45284b(false);
            }
            C18735a.m45667b("没有命中预加载停投时间段，继续展示广告");
        }
        List<C18602b> list = C18654k.m45259a().f51554a;
        if (C18642g.m45212ab() || !C18740f.m45691a(list) || !C18673u.m45399a().mo38173p()) {
            List b2 = m45283b(list);
            if (!C18740f.m45691a(b2) || C18642g.m45212ab()) {
                if (C18642g.m45174B()) {
                    boolean z = !C18673u.m45399a().mo38156d();
                    StringBuilder sb2 = new StringBuilder("支持首刷逻辑，当前是否为首刷次：");
                    sb2.append(z);
                    C18735a.m45667b(sb2.toString());
                    if (z) {
                        C18673u.m45399a().mo38150b(true).mo38164h();
                        C18735a.m45667b("当前是首刷次，标记消耗首刷，开始挑选首刷广告");
                        List g = m45293g(b2);
                        m45291e(g);
                        bVar = m45271a(g);
                    } else {
                        C18735a.m45667b("当前非首刷次，挑选非首刷广告");
                        List h = m45294h(b2);
                        m45291e(h);
                        bVar = m45271a(h);
                    }
                } else {
                    C18735a.m45667b("不支持首刷逻辑");
                    m45291e(b2);
                    bVar = m45271a(b2);
                }
                if (!(this.f51571e == null || bVar == null)) {
                    C18586b.m44982a();
                    C18586b.m44985a(this.f51571e, bVar);
                }
                this.f51571e = null;
                if (C18642g.m45212ab() && C18673u.m45399a().mo38173p()) {
                    C18586b.m44982a();
                    C18586b.m44988b(new C18585a().mo37934a(84378473382L).mo37933a(3).mo37935a(C18654k.m45259a().f51563j).mo37937a());
                    C18557b.m44917a();
                    C18557b.m44918a(1);
                }
                return bVar;
            }
            C18735a.m45667b("没有广告通过了合法性和展示时间校验，且不允许首刷回捞，不展示广告");
            C18586b.m44982a().mo37940a(false);
            return null;
        }
        C18586b.m44982a();
        C18586b.m44988b(new C18585a().mo37934a(84378473382L).mo37933a(3).mo37935a(C18654k.m45259a().f51563j).mo37937a());
        C18557b.m44917a();
        C18557b.m44918a(1);
        return null;
    }

    /* renamed from: b */
    private void m45284b(boolean z) {
        m45276a(0, false, z, false);
    }

    /* renamed from: c */
    private static void m45287c(boolean z) {
        C18673u.m45399a().mo38159f().mo38164h();
        C18735a.m45667b("发送 stock 请求");
        C18728a.m45652a().mo38338a(z);
    }

    /* renamed from: a */
    private C18602b m45271a(List<C18602b> list) {
        if (C18740f.m45691a(list)) {
            C18735a.m45667b("没有可以用来展示的广告，本次开屏不展示");
            return null;
        } else if (C18674v.m45443a().mo38183d()) {
            C18735a.m45667b("开始根据实时接口数据检查广告资源");
            return m45289d(list);
        } else {
            C18735a.m45667b("开始根据非实时数据检查广告资源");
            C18550a.m44899a().mo37843a("service_real_time_show", 3, (JSONObject) null);
            return m45286c(list);
        }
    }

    /* renamed from: e */
    private static void m45291e(List<C18602b> list) {
        if (!C18740f.m45691a(list)) {
            C18602b bVar = (C18602b) list.get(0);
            if (bVar != null && bVar.mo37977a()) {
                HashMap hashMap = new HashMap();
                hashMap.put("show_expected", Integer.valueOf(bVar.f51328b));
                C18642g.m45204a(bVar, "splash_ad", "should_show", (Map<String, Object>) hashMap);
            }
        }
    }

    /* renamed from: h */
    private static List<C18602b> m45294h(List<C18602b> list) {
        if (C18740f.m45691a(list)) {
            C18735a.m45667b("非首刷次，但是非首刷的广告队列为空，此次开屏不展示广告");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C18602b bVar : list) {
            if (bVar.f51341o != 1) {
                C18735a.m45661a(bVar.mo37863p(), "非首刷次，挑选到一个非首刷广告");
                arrayList.add(bVar);
            } else {
                C18586b.m44982a().mo37939a(new C18585a().mo37934a(bVar.mo37863p()).mo37938b(5005).mo37937a());
            }
        }
        if (C18642g.m45226d() && C18740f.m45691a(arrayList)) {
            C18749n.m45747a(C18642g.m45184L().getString(R.string.dm3));
        }
        return arrayList;
    }

    /* renamed from: b */
    private static int m45281b(C18602b bVar) {
        if (bVar == null) {
            return 5006;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (C18642g.m45216af()) {
            currentTimeMillis = C18744j.m45735f();
        }
        if (bVar.mo37981d() > currentTimeMillis) {
            C18735a.m45661a(bVar.mo37863p(), "广告未到展示时间");
            if (C18642g.m45226d()) {
                C18749n.m45747a(C18642g.m45184L().getString(R.string.dm5, new Object[]{Long.valueOf(bVar.mo37863p())}));
            }
            return 5001;
        } else if (bVar.mo37982e() < currentTimeMillis) {
            C18735a.m45661a(bVar.mo37863p(), "广告已过期");
            if (C18642g.m45226d()) {
                C18749n.m45747a(C18642g.m45184L().getString(R.string.dlv, new Object[]{Long.valueOf(bVar.mo37863p())}));
            }
            return 5002;
        } else if (bVar.f51340n) {
            C18735a.m45661a(bVar.mo37863p(), "广告被召回");
            if (C18642g.m45226d()) {
                C18749n.m45747a(C18642g.m45184L().getString(R.string.dlu, new Object[]{Long.valueOf(bVar.mo37863p())}));
            }
            return 5003;
        } else if (C18642g.m45217ag() == null || C18642g.m45217ag().mo38334a(bVar)) {
            return 5000;
        } else {
            C18735a.m45661a(bVar.mo37863p(), "业务方拦截了这个广告");
            return 5007;
        }
    }

    /* renamed from: g */
    private List<C18602b> m45293g(List<C18602b> list) {
        if (C18740f.m45691a(list)) {
            C18735a.m45667b("当前没有挑选出合法且在展示时间内的广告");
            if (!C18642g.m45212ab()) {
                return null;
            }
            list = new ArrayList<>();
        }
        List<C18602b> arrayList = new ArrayList<>();
        for (C18602b bVar : list) {
            if (bVar.f51341o == 1) {
                C18735a.m45661a(bVar.mo37863p(), "挑选到首刷广告");
                arrayList.add(bVar);
            }
        }
        if (C18740f.m45691a(arrayList) && C18642g.m45212ab()) {
            C18735a.m45667b("没有挑选到首刷广告，开始回捞首刷广告");
            arrayList = m45290d();
        }
        for (C18602b bVar2 : list) {
            if (bVar2.f51341o == 3) {
                C18735a.m45667b("挑选到一个 GD 广告");
                arrayList.add(bVar2);
            }
        }
        if (C18642g.m45226d() && C18740f.m45691a(list)) {
            C18749n.m45747a(C18642g.m45184L().getString(R.string.dlw));
        }
        return arrayList;
    }

    /* renamed from: i */
    private C18602b m45295i(List<C18602b> list) {
        C18602b bVar = null;
        for (C18602b bVar2 : list) {
            if (bVar2 != null) {
                if (bVar != null) {
                    C18586b.m44982a();
                    C18586b.m44989b(bVar2);
                } else {
                    C18586b.m44982a();
                    C18586b.m44984a(bVar2);
                    if (!bVar2.mo37990l() && !bVar2.mo37991m()) {
                        boolean a = bVar2.mo37977a();
                        boolean c = m45288c(bVar2);
                        if (a && c) {
                            C18735a.m45661a(bVar2.mo37863p(), "普通广告资源已存在且数据合法，可以用来展示");
                            bVar = bVar2;
                        } else if (!c) {
                            C18735a.m45661a(bVar2.mo37863p(), "普通广告资源不存在或数据不合法，不能用来展示");
                            if (!TextUtils.isEmpty(bVar2.mo37971G()) && !TextUtils.isEmpty(this.f51569b) && bVar2.mo37971G().equals(this.f51569b)) {
                                C18586b.m44982a();
                                C18586b.m44992c(new C18585a().mo37934a(bVar2.mo37863p()).mo37938b(4004).mo37935a(bVar2.mo37864r()).mo37933a(1).mo37937a());
                            }
                        }
                    } else if (m45280a(bVar2)) {
                        C18735a.m45661a(bVar2.mo37863p(), "端上确认可以展示原生开屏广告");
                        return bVar2;
                    } else {
                        C18735a.m45661a(bVar2.mo37863p(), "端上拒绝展示原生开屏广告");
                    }
                }
            }
        }
        return bVar;
    }

    /* renamed from: b */
    private List<C18602b> m45283b(List<C18602b> list) {
        if (C18740f.m45691a(list)) {
            if (C18642g.m45226d()) {
                C18749n.m45747a(C18642g.m45184L().getString(R.string.dm2));
            }
            return null;
        }
        if (C18642g.m45216af()) {
            if (C18744j.m45735f() == -1) {
                C18586b.m44982a();
                C18586b.m44983a(0, 1);
                return null;
            }
            C18586b.m44982a();
            C18586b.m44983a(1, 0);
        }
        if (C18740f.m45691a(list)) {
            C18735a.m45667b("本地广告队列为空，上次下发的数据无广告");
            if (C18642g.m45226d()) {
                C18749n.m45747a(C18642g.m45184L().getString(R.string.dm2));
            }
            return null;
        }
        this.f51570c = ((C18602b) list.get(0)).mo37863p();
        C18586b a = C18586b.m44982a();
        if (a.f51234a == null) {
            a.f51234a = new ArrayList();
        }
        a.f51234a.clear();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C18602b bVar = (C18602b) list.get(i);
            if (bVar != null) {
                if (bVar.f51337k != null && !bVar.f51337k.isEmpty()) {
                    C18735a.m45661a(bVar.mo37863p(), "开始挑选分时广告");
                    for (int i2 = 0; i2 < bVar.f51337k.size(); i2++) {
                        C18602b bVar2 = (C18602b) bVar.f51337k.get(i2);
                        if (bVar2 != null) {
                            int b = bVar.mo37978b();
                            if (b != 2000) {
                                C18735a.m45661a(bVar2.mo37863p(), "分时广告数据不合法，可能是下发数据有问题");
                                StringBuilder sb = new StringBuilder();
                                sb.append(i);
                                sb.append("_");
                                sb.append(i2);
                                m45278a(bVar2, b, sb.toString());
                                if (i == 0) {
                                    C18586b.m44982a();
                                    C18586b.m44992c(new C18585a().mo37934a(bVar.mo37863p()).mo37938b(b).mo37935a(bVar.mo37864r()).mo37933a(1).mo37937a());
                                }
                            } else {
                                int b2 = m45281b(bVar2);
                                if (b2 == 5000) {
                                    C18735a.m45661a(bVar2.mo37863p(), "分时广告通过展示时间和合法性校验");
                                    arrayList.add(bVar2);
                                } else {
                                    C18586b.m44982a();
                                    C18586b.m44992c(new C18585a().mo37934a(bVar.mo37863p()).mo37938b(b2).mo37935a(bVar.mo37864r()).mo37936a(C18744j.m45718a(bVar2)).mo37933a(1).mo37937a());
                                }
                            }
                        }
                    }
                }
                int b3 = bVar.mo37978b();
                if (b3 != 2000) {
                    C18735a.m45661a(bVar.mo37863p(), "广告数据不合法，可能是下发数据有问题");
                    m45278a(bVar, b3, String.valueOf(i));
                    if (i == 0) {
                        C18586b.m44982a();
                        C18586b.m44992c(new C18585a().mo37934a(bVar.mo37863p()).mo37938b(b3).mo37935a(bVar.mo37864r()).mo37933a(1).mo37937a());
                    }
                } else {
                    int b4 = m45281b(bVar);
                    if (b4 == 5000) {
                        C18735a.m45661a(bVar.mo37863p(), "广告通过展示时间和合法性校验");
                        arrayList.add(bVar);
                    } else {
                        C18586b.m44982a();
                        C18586b.m44992c(new C18585a().mo37934a(bVar.mo37863p()).mo37938b(b4).mo37935a(bVar.mo37864r()).mo37936a(C18744j.m45718a(bVar)).mo37933a(1).mo37937a());
                    }
                }
            }
        }
        if (C18642g.m45216af()) {
            C18674v.m45443a().f51623j = true;
        }
        return arrayList;
    }

    /* renamed from: c */
    private C18602b m45286c(List<C18602b> list) {
        C18602b bVar = null;
        for (C18602b bVar2 : list) {
            if (bVar2 != null) {
                if (bVar != null) {
                    C18586b.m44982a();
                    C18586b.m44989b(bVar2);
                } else {
                    C18586b.m44982a();
                    C18586b.m44984a(bVar2);
                    if (bVar2.mo37990l() || bVar2.mo37991m()) {
                        if (m45280a(bVar2)) {
                            C18735a.m45661a(bVar2.mo37863p(), "端上确认可以展示原生开屏广告");
                        } else {
                            C18735a.m45661a(bVar2.mo37863p(), "端上拒绝展示原生开屏广告");
                        }
                    } else if (bVar2.mo37977a()) {
                        if (m45288c(bVar2)) {
                            C18735a.m45661a(bVar2.mo37863p(), "普通广告资源已存在且数据合法，可以用来展示");
                        } else {
                            C18735a.m45661a(bVar2.mo37863p(), "普通广告资源不存在或数据不合法，不能用来展示");
                            if (this.f51570c == bVar2.mo37863p()) {
                                C18586b.m44982a();
                                C18586b.m44992c(new C18585a().mo37934a(bVar2.mo37863p()).mo37938b(4004).mo37935a(bVar2.mo37864r()).mo37933a(1).mo37937a());
                            }
                        }
                    }
                    bVar = bVar2;
                }
            }
        }
        if (bVar == null) {
            C18557b.m44917a();
            C18557b.m44918a(6);
        }
        return bVar;
    }

    /* renamed from: d */
    private C18602b m45289d(List<C18602b> list) {
        LinkedHashMap c = C18674v.m45443a().mo38182c();
        if (c != null && c.size() > 0) {
            C18602b bVar = null;
            boolean z = false;
            for (Entry entry : c.entrySet()) {
                Long l = (Long) entry.getKey();
                String str = (String) entry.getValue();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C18602b bVar2 = (C18602b) it.next();
                    if (bVar2 != null && bVar2.mo37863p() == l.longValue()) {
                        if (bVar != null) {
                            C18586b.m44982a();
                            C18586b.m44989b(bVar2);
                        } else {
                            C18586b.m44982a();
                            C18586b.m44984a(bVar2);
                            if (!bVar2.mo37990l() && !bVar2.mo37991m()) {
                                boolean a = bVar2.mo37977a();
                                boolean c2 = m45288c(bVar2);
                                if (!a || !c2) {
                                    C18735a.m45661a(bVar2.mo37863p(), "普通广告资源不存在或数据不合法，不能用来展示");
                                    if (!c2 && this.f51570c == bVar2.mo37863p()) {
                                        C18586b.m44982a();
                                        C18586b.m44992c(new C18585a().mo37934a(bVar2.mo37863p()).mo37938b(4004).mo37935a(bVar2.mo37864r()).mo37933a(1).mo37937a());
                                    }
                                } else {
                                    C18735a.m45661a(bVar2.mo37863p(), "普通广告资源已存在且数据合法，可以用来展示");
                                    bVar = (C18602b) bVar2.clone();
                                    bVar.f51347u = true;
                                    bVar.f51333g = str;
                                    C18550a.m44899a().mo37843a("service_real_time_show", 0, (JSONObject) null);
                                }
                                z = true;
                            } else if (m45280a(bVar2)) {
                                C18735a.m45661a(bVar2.mo37863p(), "端上确认可以展示原生开屏广告");
                                bVar = bVar2;
                            } else {
                                C18735a.m45661a(bVar2.mo37863p(), "端上拒绝展示原生开屏广告");
                            }
                        }
                    }
                }
            }
            if (!z) {
                m45274a(1, 1, true);
            }
            return bVar;
        } else if (c == null) {
            return null;
        } else {
            m45274a(4, 2, true);
            return null;
        }
    }

    /* renamed from: f */
    private List<C18602b> m45292f(List<C18602b> list) {
        if (C18740f.m45691a(list)) {
            if (C18642g.m45226d()) {
                C18749n.m45747a(C18642g.m45184L().getString(R.string.dm2));
            }
            return null;
        }
        if (C18642g.m45216af()) {
            if (C18744j.m45735f() == -1) {
                C18586b.m44982a();
                C18586b.m44983a(0, 1);
                return null;
            }
            C18586b.m44982a();
            C18586b.m44983a(1, 0);
        }
        if (C18740f.m45691a(list)) {
            C18735a.m45667b("开屏广告队列为空，此次开屏不展示广告");
            if (C18642g.m45226d()) {
                C18749n.m45747a(C18642g.m45184L().getString(R.string.dm2));
            }
            return null;
        }
        if (!TextUtils.isEmpty(((C18602b) list.get(0)).mo37971G())) {
            this.f51569b = ((C18602b) list.get(0)).mo37971G();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C18602b bVar = (C18602b) list.get(i);
            if (bVar != null) {
                if (bVar.f51337k != null && !bVar.f51337k.isEmpty()) {
                    C18735a.m45661a(bVar.mo37863p(), "开始挑选分时广告");
                    for (int i2 = 0; i2 < bVar.f51337k.size(); i2++) {
                        C18602b bVar2 = (C18602b) bVar.f51337k.get(i2);
                        if (bVar2 != null) {
                            int b = bVar.mo37978b();
                            if (b != 2000) {
                                C18735a.m45661a(bVar2.mo37863p(), "分时广告数据不合法，可能是下发数据有问题");
                                StringBuilder sb = new StringBuilder();
                                sb.append(i);
                                sb.append("_");
                                sb.append(i2);
                                m45278a(bVar2, b, sb.toString());
                                if (i == 0) {
                                    C18586b.m44982a();
                                    C18586b.m44992c(new C18585a().mo37934a(bVar.mo37863p()).mo37938b(b).mo37935a(bVar.mo37864r()).mo37933a(1).mo37937a());
                                }
                            } else {
                                int b2 = m45281b(bVar2);
                                if (b2 == 5000) {
                                    C18735a.m45661a(bVar2.mo37863p(), "分时广告通过展示时间和合法性校验");
                                    arrayList.add(bVar2);
                                } else {
                                    C18586b.m44982a();
                                    C18586b.m44992c(new C18585a().mo37934a(bVar.mo37863p()).mo37938b(b2).mo37935a(bVar.mo37864r()).mo37936a(C18744j.m45718a(bVar2)).mo37933a(1).mo37937a());
                                }
                            }
                        }
                    }
                }
                int b3 = bVar.mo37978b();
                if (b3 != 2000) {
                    C18735a.m45661a(bVar.mo37863p(), "广告数据不合法，可能是下发数据有问题");
                    m45278a(bVar, b3, String.valueOf(i));
                    if (i == 0) {
                        C18586b.m44982a();
                        C18586b.m44992c(new C18585a().mo37934a(bVar.mo37863p()).mo37938b(b3).mo37935a(bVar.mo37864r()).mo37933a(1).mo37937a());
                    }
                } else {
                    int b4 = m45281b(bVar);
                    if (b4 == 5000) {
                        C18735a.m45661a(bVar.mo37863p(), "广告通过展示时间和合法性校验");
                        arrayList.add(bVar);
                    } else {
                        C18586b.m44982a();
                        C18586b.m44992c(new C18585a().mo37934a(bVar.mo37863p()).mo37938b(b4).mo37935a(bVar.mo37864r()).mo37936a(C18744j.m45718a(bVar)).mo37933a(1).mo37937a());
                    }
                }
            }
        }
        if (C18642g.m45216af()) {
            C18674v.m45443a().f51623j = true;
        }
        return arrayList;
    }

    /* renamed from: c */
    private boolean m45288c(C18602b bVar) {
        boolean z;
        int x = bVar.mo37865x();
        if (x != 0) {
            switch (x) {
                case 2:
                    boolean a = C18744j.m45720a(bVar.f51339m, C18673u.m45399a());
                    if (a) {
                        return a;
                    }
                    m45277a(bVar, 2);
                    if (!C18642g.m45226d()) {
                        return a;
                    }
                    C18749n.m45747a(C18642g.m45184L().getString(R.string.dm6, new Object[]{Long.valueOf(bVar.mo37863p())}));
                    return a;
                case 3:
                    boolean a2 = C18744j.m45719a(bVar.f51317a, C18673u.m45399a());
                    if (!a2) {
                        m45277a(bVar, 1);
                    }
                    boolean a3 = C18744j.m45720a(bVar.f51339m, C18673u.m45399a());
                    if (!a3) {
                        m45277a(bVar, 2);
                    }
                    if (!a2 || !a3) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z || !C18642g.m45226d()) {
                        return z;
                    }
                    C18749n.m45747a(C18642g.m45184L().getString(R.string.dly, new Object[]{Long.valueOf(bVar.mo37863p())}));
                    return z;
                case 4:
                    break;
                default:
                    return false;
            }
        }
        boolean a4 = C18744j.m45719a(bVar.f51317a, C18673u.m45399a());
        if (a4) {
            return a4;
        }
        m45277a(bVar, 1);
        if (!C18642g.m45226d()) {
            return a4;
        }
        C18749n.m45747a(C18642g.m45184L().getString(R.string.dlx, new Object[]{Long.valueOf(bVar.mo37863p())}));
        return a4;
    }

    /* renamed from: a */
    private boolean m45279a(long j) {
        if (j - this.f51568a < C18654k.m45259a().f51557d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m45273a(int i, int i2) {
        C18557b.m44917a();
        C18557b.m44918a(i2);
    }

    /* renamed from: a */
    private void m45275a(long j, boolean z) {
        m45276a(j, true, false, z);
    }

    /* renamed from: a */
    private static void m45277a(C18602b bVar, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("is_ad_event", "1").putOpt("log_extra", bVar.mo37864r());
            JSONObject jSONObject2 = new JSONObject();
            String str = "";
            String str2 = "";
            switch (i) {
                case 1:
                    str = "not_download_image";
                    str2 = C18744j.m45705a(bVar.f51317a);
                    break;
                case 2:
                    str = "not_download_video";
                    str2 = C18744j.m45706a(bVar.f51339m);
                    break;
            }
            jSONObject2.putOpt("reason", str);
            jSONObject2.putOpt("url", str2);
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("ad_fetch_time", Long.valueOf(bVar.mo37862f()));
        } catch (Exception unused) {
        }
        C18642g.m45201a(bVar.mo37863p(), "splash_ad", "not_showing_reason", jSONObject);
    }

    /* renamed from: a */
    private static void m45274a(int i, int i2, boolean z) {
        C18586b.m44982a();
        C18586b.m44995d(new C18585a().mo37934a(84378473382L).mo37933a(i).mo37935a("{}").mo37937a());
        C18586b.m44982a().mo37941b();
        C18550a.m44899a().mo37843a("service_real_time_show", i2, (JSONObject) null);
    }

    /* renamed from: a */
    private static void m45278a(C18602b bVar, int i, String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("log_extra", bVar.mo37864r()).putOpt("is_ad_event", "1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("ad_position", str);
            jSONObject2.putOpt("error_code", Integer.valueOf(i));
            String str3 = "is_topview";
            if (C18744j.m45718a(bVar)) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            jSONObject2.putOpt(str3, str2);
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.put("ad_fetch_time", bVar.mo37862f());
        } catch (Exception unused) {
        }
        C18642g.m45201a(bVar.mo37863p(), "splash_ad", "data_invalid", jSONObject);
    }

    /* renamed from: a */
    private static void m45276a(long j, boolean z, boolean z2, boolean z3) {
        String str;
        String str2;
        String str3;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.putOpt("is_ad_event", "1");
            String str4 = "status";
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            jSONObject2.putOpt(str4, str);
            if (z) {
                jSONObject2.putOpt("duration", Long.valueOf(j));
                String str5 = "stop_show";
                if (z3) {
                    str3 = "1";
                } else {
                    str3 = "0";
                }
                jSONObject2.putOpt(str5, str3);
            } else {
                String str6 = "is_penalty_period";
                if (z2) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                jSONObject2.putOpt(str6, str2);
            }
            jSONObject.put("ad_extra_data", jSONObject2);
        } catch (Exception unused) {
        }
        C18642g.m45201a(84378473382L, "splash_ad", "stop_showing_monitor", jSONObject);
    }
}
