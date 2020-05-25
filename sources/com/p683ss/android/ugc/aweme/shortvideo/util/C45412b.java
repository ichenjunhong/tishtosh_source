package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45371a.C45373b;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.b */
public final class C45412b implements Callback, IAVPerformance {

    /* renamed from: a */
    private HashMap<String, C45459v> f114801a;

    /* renamed from: b */
    private HashMap<String, Boolean> f114802b;

    /* renamed from: c */
    private Handler f114803c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.b$a */
    static class C45414a {

        /* renamed from: a */
        public static C45412b f114804a = new C45412b();
    }

    /* renamed from: a */
    public static C45412b m98979a() {
        return C45414a.f114804a;
    }

    private C45412b() {
        this.f114801a = new HashMap<>();
        this.f114802b = new HashMap<>();
        this.f114803c = new Handler(C45452q.m99043a(), this);
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                C45459v vVar = new C45459v();
                C45382ag agVar = (C45382ag) message.obj;
                vVar.f114876a.add(agVar);
                this.f114801a.put(agVar.f114766b, vVar);
                break;
            case 2:
                C45382ag agVar2 = (C45382ag) message.obj;
                C45459v vVar2 = (C45459v) this.f114801a.get(agVar2.f114766b);
                if (vVar2 != null) {
                    vVar2.f114876a.add(agVar2);
                    break;
                }
                break;
            case 3:
                C45382ag agVar3 = (C45382ag) message.obj;
                C45459v vVar3 = (C45459v) this.f114801a.remove(agVar3.f114766b);
                if (vVar3 != null) {
                    vVar3.f114876a.add(agVar3);
                    int size = vVar3.f114876a.size();
                    if (size > 1) {
                        C23088c a = C23088c.m56631a();
                        int i = 0;
                        while (i < size - 1) {
                            int i2 = i + 1;
                            Long valueOf = Long.valueOf(((C45382ag) vVar3.f114876a.get(i2)).f114765a - ((C45382ag) vVar3.f114876a.get(i)).f114765a);
                            StringBuilder sb = new StringBuilder("step");
                            sb.append(i2);
                            a.mo47823a(sb.toString(), valueOf);
                            i = i2;
                        }
                        a.mo47823a("totaltime", Long.valueOf(((C45382ag) vVar3.f114876a.get(vVar3.f114876a.size() - 1)).f114765a - ((C45382ag) vVar3.f114876a.get(0)).f114765a));
                        a.mo47824a("type", agVar3.f114766b);
                        Boolean bool = (Boolean) this.f114802b.get(agVar3.f114766b);
                        if (bool == null || bool.booleanValue()) {
                            a.mo47819a("cold_start", Boolean.valueOf(true));
                            this.f114802b.put(agVar3.f114766b, Boolean.valueOf(false));
                        } else {
                            a.mo47819a("cold_start", Boolean.valueOf(false));
                        }
                        JSONObject b = a.mo47825b();
                        C23569o.m57779a(agVar3.f114766b, b);
                        C47702b.f120193a.mo94985a("tool_performance_operation_cost_time", b);
                        vVar3.f114876a.clear();
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public final void end(String str, String str2) {
        m98982a(str, str2, 3);
    }

    public final void start(String str, String str2) {
        m98982a(str, str2, 1);
    }

    public final void step(String str, String str2) {
        m98982a(str, str2, 2);
    }

    public final void enter(Context context, String str) {
        C0013i.m16a((Callable<TResult>) new C45432c<TResult>(context, str));
    }

    public final void leave(Context context, String str) {
        C0013i.m16a((Callable<TResult>) new C45434e<TResult>(context, str));
    }

    /* renamed from: a */
    static final /* synthetic */ Object m98980a(Context context, String str) throws Exception {
        C45371a b = C45371a.m98923b(context, str);
        b.f114739b++;
        if (!b.f114740c) {
            b.f114740c = true;
            b.f114738a = b.mo91712a(b.f114741d, "entering");
        }
        return null;
    }

    /* renamed from: a */
    private void m98982a(String str, String str2, int i) {
        if (!TextUtils.isEmpty(str)) {
            Message obtain = Message.obtain();
            obtain.what = i;
            C45382ag agVar = new C45382ag();
            agVar.f114765a = System.currentTimeMillis();
            agVar.f114766b = str;
            agVar.f114767c = str2;
            obtain.obj = agVar;
            this.f114803c.sendMessage(obtain);
        }
    }

    public final void pause(Context context, String str, String str2, String str3) {
        C0013i.m16a((Callable<TResult>) new C45433d<TResult>(context, str, str2, str3));
    }

    /* renamed from: a */
    static final /* synthetic */ Object m98981a(Context context, String str, String str2, String str3) throws Exception {
        C45371a b = C45371a.m98923b(context, str);
        C45373b a = b.mo91712a(b.f114741d, "leaving");
        if (!(a == null || b.f114738a == null)) {
            String str4 = b.f114742e;
            C45373b bVar = b.f114738a;
            if (bVar == null) {
                C52711k.m112234a();
            }
            StringBuilder sb = new StringBuilder("monitor change value => \nscene = ");
            sb.append(str4);
            sb.append("\napp memory change: ");
            sb.append(bVar.f114743a - a.f114743a);
            sb.append(" Mb, system memory change: ");
            sb.append(bVar.f114744b - a.f114744b);
            sb.append(" Mb, available memory change: ");
            sb.append(bVar.f114745c - a.f114745c);
            sb.append("Mb. ");
            StringBuilder sb2 = new StringBuilder("\n");
            sb2.append("av-performance\n");
            C45407ay.m98973d(sb2.toString());
            String str5 = b.f114742e;
            int i = b.f114739b;
            C45373b bVar2 = b.f114738a;
            if (bVar2 == null) {
                C52711k.m112234a();
            }
            long j = bVar2.f114743a;
            long j2 = a.f114743a;
            C45373b bVar3 = b.f114738a;
            if (bVar3 == null) {
                C52711k.m112234a();
            }
            long j3 = bVar3.f114745c;
            long j4 = a.f114745c;
            C45373b bVar4 = b.f114738a;
            if (bVar4 == null) {
                C52711k.m112234a();
            }
            long j5 = bVar4.f114744b;
            long j6 = a.f114744b;
            C52711k.m112240b(str5, "scene");
            C47702b bVar5 = C47702b.f120193a;
            long j7 = j6;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str5);
            sb3.append("_page");
            long j8 = j7;
            bVar5.mo94984a("scene_memory_usage", C42438az.m93209a().mo86526a("creation_id", str3).mo86526a("shoot_way", str2).mo86526a("scene_name", sb3.toString()).mo86523a("finish_count", i).mo86524a("app_memory_end", j2).mo86524a("app_memory_start", j).mo86524a("app_memory_change", j - j2).mo86524a("available_memory_start", j3).mo86524a("available_memory_end", j4).mo86524a("available_memory_change", j3 - j4).mo86524a("used_memory_start", j5).mo86524a("used_memory_end", j8).mo86524a("used_memory_change", j5 - j8).f107329a);
        }
        return null;
    }
}
