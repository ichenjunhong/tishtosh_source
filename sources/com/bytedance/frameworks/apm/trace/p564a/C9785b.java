package com.bytedance.frameworks.apm.trace.p564a;

import android.text.TextUtils;
import com.C2240a;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p478d.C9001b;
import com.bytedance.apm.p480f.p481a.C9014a;
import com.bytedance.apm.p480f.p482b.C9022d;
import com.bytedance.apm.p488k.C9075b;
import com.bytedance.apm.p489l.C9111g;
import com.bytedance.apm.p497o.C9149b;
import com.bytedance.apm.p498p.p499a.C9165b;
import com.bytedance.frameworks.apm.trace.C9782a;
import com.bytedance.frameworks.apm.trace.C9789b;
import com.bytedance.frameworks.apm.trace.C9790c;
import com.bytedance.frameworks.apm.trace.C9790c.C9792a;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.apm.trace.MethodCollector.C9781a;
import com.bytedance.news.common.service.manager.C12401c;
import com.bytedance.services.slardar.config.C13226a;
import com.bytedance.services.slardar.config.IConfigManager;
import com.p683ss.ttm.player.MediaPlayer;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.apm.trace.a.b */
public final class C9785b extends C9784a implements C13226a {

    /* renamed from: b */
    private C9781a f26631b;

    /* renamed from: c */
    private long[] f26632c = new long[3];

    /* renamed from: d */
    private long f26633d;

    /* renamed from: e */
    private boolean f26634e;

    /* renamed from: com.bytedance.frameworks.apm.trace.a.b$a */
    class C9786a implements Runnable {

        /* renamed from: a */
        long[] f26635a;

        /* renamed from: b */
        long[] f26636b;

        /* renamed from: c */
        long f26637c;

        /* renamed from: d */
        long f26638d;

        /* renamed from: e */
        long f26639e;

        /* renamed from: f */
        String f26640f;

        /* renamed from: g */
        boolean f26641g;

        public final void run() {
            StringBuilder sb;
            long j;
            int i;
            LinkedList linkedList = new LinkedList();
            if (this.f26636b.length > 0) {
                C9790c.m19596a(this.f26636b, linkedList, true, this.f26639e);
                C9790c.m19595a((List<C9789b>) linkedList, 30, (C9792a) new C9792a() {
                    /* renamed from: a */
                    public final boolean mo17630a(long j, int i) {
                        return j < ((long) (i * 5));
                    }

                    /* renamed from: a */
                    public final void mo17629a(List<C9789b> list, int i) {
                        if (C8976c.m17751g()) {
                            C9075b.m17974b("EvilMethodTracer", "[fallback] size:%s targetSize:%s stack:%s", Integer.valueOf(i), Integer.valueOf(30), list);
                        }
                        ListIterator listIterator = list.listIterator(Math.min(i, 30));
                        while (listIterator.hasNext()) {
                            listIterator.next();
                            listIterator.remove();
                        }
                    }
                });
            }
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            long max = Math.max(this.f26638d, C9790c.m19592a(linkedList, sb2, sb3));
            String a = C9790c.m19593a((List<C9789b>) linkedList, max);
            if (C8976c.m17751g()) {
                Object[] objArr = new Object[1];
                String str = this.f26640f;
                boolean z = this.f26641g;
                long size = (long) linkedList.size();
                j = max;
                long j2 = this.f26635a[0];
                long j3 = this.f26635a[1];
                StringBuilder sb4 = sb3;
                long j4 = this.f26635a[2];
                sb = sb2;
                long j5 = this.f26638d;
                StringBuilder sb5 = new StringBuilder(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL);
                Object[] objArr2 = objArr;
                sb5.append(C2240a.m6772a("-\n>>>>>>>>>>>>>>>>>>>>> maybe happens Jankiness!(%sms) <<<<<<<<<<<<<<<<<<<<<\n", new Object[]{Long.valueOf(j5)}));
                sb5.append("|* scene: ");
                sb5.append(str);
                sb5.append("\n");
                sb5.append("|* [ProcessStat]\n");
                sb5.append("|*\t\tForeground: ");
                sb5.append(z);
                sb5.append("\n");
                sb5.append("|* [CPU]\n");
                sb5.append("|* [doFrame]\n");
                sb5.append("|*\t\tinputCost: ");
                sb5.append(j2);
                sb5.append("\n");
                sb5.append("|*\t\tanimationCost: ");
                sb5.append(j3);
                sb5.append("\n");
                sb5.append("|*\t\ttraversalCost: ");
                sb5.append(j4);
                sb5.append("\n");
                sb5.append("|* [Trace]\n");
                sb5.append("|*\t\tStackSize: ");
                sb5.append(size);
                sb5.append("\n");
                sb5.append("|*\t\tStackKey: ");
                sb5.append(a);
                sb5.append("\n");
                sb5.append(sb4.toString());
                sb5.append("=========================================================================");
                i = 0;
                objArr2[0] = sb5.toString();
                String str2 = "EvilMethodTracer";
                C9075b.m17974b(str2, "%s", objArr2);
            } else {
                sb = sb2;
                j = max;
                i = 0;
            }
            if (j >= 5500) {
                C9075b.m17974b("EvilMethodTracer", "The checked anr task was not executed on time. The possible reason is that the current process has a low priority. just pass this report", new Object[i]);
                return;
            }
            try {
                if (C9111g.m18066a().mo16479b("drop_frame_stack")) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("stack", sb.toString());
                    jSONObject.put("stack_key", a);
                    try {
                        jSONObject.put("scene", this.f26640f);
                        long j6 = j;
                        jSONObject.put("cost_time", j6);
                        jSONObject.put("method_time", j6);
                        jSONObject.put("event_type", "lag_drop_frame");
                        jSONObject.put("filters", ApmDelegate.m17947a().mo16434c("drop_frame_stack"));
                        C9014a.m17825a().mo16336a(new C9022d("drop_frame_stack", jSONObject));
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
            }
        }

        C9786a(boolean z, String str, long[] jArr, long[] jArr2, long j, long j2, long j3) {
            this.f26641g = z;
            this.f26640f = str;
            this.f26638d = j2;
            this.f26637c = j;
            this.f26636b = jArr;
            this.f26635a = jArr2;
            this.f26639e = j3;
        }
    }

    /* renamed from: e */
    public final void mo16224e() {
    }

    /* renamed from: a */
    public final void mo17626a() {
        super.mo17626a();
        if (this.f26634e) {
            C9782a a = C9782a.m19570a();
            if (!a.f26624a) {
                a.mo17624b();
            }
            synchronized (a.f26626c) {
                a.f26626c.add(this);
            }
        }
    }

    public C9785b() {
        boolean z;
        C9001b d = ApmDelegate.m17947a().mo16436d();
        this.f26633d = d.f24496g;
        if (!d.f24495f || !ApmDelegate.f24740l) {
            z = false;
        } else {
            z = true;
        }
        this.f26634e = z;
        ((IConfigManager) C12401c.m24975a(IConfigManager.class)).registerConfigListener(this);
    }

    /* renamed from: a */
    public final void mo16270a(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject = jSONObject.optJSONObject("performance_modules");
        if (optJSONObject != null) {
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("smooth");
            if (optJSONObject2 != null) {
                this.f26633d = optJSONObject2.optLong("drop_threshold", this.f26633d);
                this.f26634e = optJSONObject2.optBoolean("drop_slow_method_switch", this.f26634e);
                if (!this.f26634e) {
                    C9782a a = C9782a.m19570a();
                    synchronized (a.f26626c) {
                        a.f26626c.remove(this);
                        if (a.f26626c.isEmpty()) {
                            a.mo17625c();
                        }
                    }
                    this.f26631b = null;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo16263a(long j, long j2, long j3) {
        C9781a aVar;
        C9781a aVar2;
        super.mo16263a(j, j2, j3);
        String str = "EvilMethodTracer#dispatchBegin";
        if (MethodCollector.f26614o == null) {
            C9781a aVar3 = new C9781a(MethodCollector.f26604e - 1);
            MethodCollector.f26614o = aVar3;
            aVar3.f26622d = str;
            aVar = MethodCollector.f26614o;
        } else {
            C9781a aVar4 = new C9781a(MethodCollector.f26604e - 1);
            aVar4.f26622d = str;
            C9781a aVar5 = MethodCollector.f26614o;
            C9781a aVar6 = null;
            while (true) {
                C9781a aVar7 = aVar6;
                aVar6 = aVar5;
                C9781a aVar8 = aVar7;
                if (aVar6 == null) {
                    aVar8.f26620b = aVar4;
                    break;
                } else if (aVar4.f26619a <= aVar6.f26619a) {
                    if (aVar8 == null) {
                        aVar2 = MethodCollector.f26614o;
                        MethodCollector.f26614o = aVar4;
                    } else {
                        C9781a aVar9 = aVar8.f26620b;
                        if (aVar8.f26620b != null) {
                            aVar8.f26620b = aVar4;
                        }
                        aVar2 = aVar9;
                    }
                    aVar4.f26620b = aVar2;
                } else {
                    aVar5 = aVar6.f26620b;
                }
            }
            aVar = aVar4;
        }
        this.f26631b = aVar;
    }

    /* renamed from: a */
    public final void mo16264a(long j, long j2, long j3, long j4, long j5, boolean z) {
        boolean z2;
        String sb;
        super.mo16264a(j, j2, j3, j4, j5, z);
        try {
            if (MethodCollector.f26601b >= 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                long j6 = j3 - j;
                if (j6 >= this.f26633d) {
                    MethodCollector methodCollector = MethodCollector.f26600a;
                    long[] a = MethodCollector.m19563a(this.f26631b, new C9781a(MethodCollector.f26604e - 1));
                    if (a != null) {
                        if (a.length != 0) {
                            long[] jArr = new long[3];
                            System.arraycopy(this.f26632c, 0, jArr, 0, 3);
                            String c = C9165b.m18189c();
                            if (TextUtils.isEmpty(c)) {
                                sb = ActivityLifeObserver.getInstance().getTopActivityClassName();
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(c);
                                sb2.append(",");
                                sb2.append(ActivityLifeObserver.getInstance().getTopActivityClassName());
                                sb = sb2.toString();
                            }
                            String str = sb;
                            C9149b a2 = C9149b.m18170a();
                            C9786a aVar = new C9786a(ActivityLifeObserver.getInstance().isForeground(), str, a, jArr, j4 - j2, j6, j3);
                            a2.mo16524a((Runnable) aVar);
                        }
                    }
                    this.f26631b.mo17622a();
                    return;
                }
                this.f26631b.mo17622a();
            }
        } finally {
            this.f26631b.mo17622a();
        }
    }
}
