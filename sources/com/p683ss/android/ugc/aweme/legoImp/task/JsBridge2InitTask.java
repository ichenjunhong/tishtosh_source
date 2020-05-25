package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.p675g.p677b.C10791k;
import com.bytedance.ies.p675g.p677b.C10791k.C10792a;
import com.bytedance.ies.p675g.p677b.C10791k.C10792a.C10793a;
import com.bytedance.ies.p675g.p677b.C10791k.C10794b;
import com.bytedance.ies.p675g.p677b.C10791k.C10796d;
import com.bytedance.ies.p675g.p677b.C10805r;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12710l;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.ttnet.p887e.C13333g;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.web.C48380q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask */
public class JsBridge2InitTask implements LegoTask {

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask$NetRequest */
    interface NetRequest {
        @C12718t
        C12690b<String> postBody(@C12699af String str, @C12700b TypedOutput typedOutput, @C12710l List<C12685b> list);
    }

    static final /* synthetic */ void lambda$enablePermissionCheck$0$JsBridge2InitTask() {
    }

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    private void enablePermissionCheck() {
        final ExecutorService d = C24076h.m58903d();
        C10805r.m21925a((C10791k) new C10791k() {
            /* renamed from: a */
            public final C10796d mo19550a() {
                return C10796d.SG;
            }

            /* renamed from: h */
            public final Executor mo19558h() {
                return d;
            }

            /* renamed from: b */
            public final int mo19552b() {
                return C11010c.m22289j();
            }

            /* renamed from: c */
            public final String mo19553c() {
                return C11010c.m22288i();
            }

            /* renamed from: d */
            public final String mo19554d() {
                return AppLog.getServerDeviceId();
            }

            /* renamed from: g */
            public final C10792a mo19557g() {
                return new C10792a() {
                    /* renamed from: a */
                    public final void mo19560a(String str, String str2) {
                        Keva.getRepo("jsbridge2-permission", 1).storeString(str, str2);
                    }

                    /* renamed from: a */
                    public final void mo19559a(String str, C10793a aVar) {
                        aVar.mo19561a(Keva.getRepo("jsbridge2-permission", 1).getString(str, ""));
                    }
                };
            }

            /* renamed from: e */
            public final String mo19555e() {
                return C48380q.m104672e().mo41210d();
            }

            /* renamed from: f */
            public final Collection<String> mo19556f() {
                LinkedList linkedList = new LinkedList();
                linkedList.add("webcast");
                return linkedList;
            }

            /* renamed from: a */
            public final void mo19551a(String str, Map<String, String> map, String str2, byte[] bArr, C10794b bVar) {
                try {
                    NetRequest netRequest = (NetRequest) C13333g.m26861a(str, NetRequest.class);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C12685b("ContentType", str2));
                    bVar.mo19562a((String) netRequest.postBody(str, new TypedByteArray(null, bArr, new String[0]), arrayList).execute().f33552b);
                } catch (Exception e) {
                    bVar.mo19563a((Throwable) e);
                }
            }
        }, C35981h.f92210a);
    }

    public void run(Context context) {
        init(context);
    }

    private void init(Context context) {
        boolean z;
        try {
            z = C32816h.m75716b().getUseBridgeEngineV2().booleanValue();
        } catch (C10174a unused) {
            z = false;
        }
        if (z) {
            enablePermissionCheck();
        }
    }
}
