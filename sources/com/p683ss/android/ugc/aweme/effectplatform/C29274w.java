package com.p683ss.android.ugc.aweme.effectplatform;

import com.google.p1057b.p1058a.C17429o;
import com.p683ss.android.ugc.aweme.effectplatform.C29262o.C29263a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48707l;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.w */
public final class C29274w implements C48707l {

    /* renamed from: c */
    public static final C29275a f76649c = new C29275a(null);

    /* renamed from: a */
    public final String f76650a;

    /* renamed from: b */
    public final C48707l f76651b;

    /* renamed from: d */
    private final C17429o f76652d;

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.w$a */
    public static final class C29275a {
        private C29275a() {
        }

        public /* synthetic */ C29275a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C29274w m68997a(String str, C48707l lVar) {
            C52711k.m112240b(str, "panel");
            C52711k.m112240b(lVar, "listener");
            return new C29274w(str, C29263a.m68967a(str, lVar), null);
        }
    }

    /* renamed from: a */
    public static final C29274w m68993a(String str, C48707l lVar) {
        return C29275a.m68997a(str, lVar);
    }

    /* renamed from: a */
    private static JSONObject m68994a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8638a(Object obj) {
        PanelInfoModel panelInfoModel = (PanelInfoModel) obj;
        long a = this.f76652d.mo33754a(TimeUnit.MILLISECONDS);
        C48707l lVar = this.f76651b;
        if (lVar != null) {
            lVar.mo8638a(panelInfoModel);
        }
        JSONObject b = new C42437ay().mo86520a("duration", Long.valueOf(a)).mo86519a("abParam", Integer.valueOf(C39629l.m88232a().mo58583n().mo83104b(C40790a.PlatformOptimizeStrategy))).mo86521a("panel", this.f76650a).mo86522b();
        C39629l.m88232a().mo58567E().mo49426a("sticker_list_error_rate", 0, b);
        C39629l.m88232a().mo58567E().mo49427a("ttlive_load_sticker_list_all", 0, b, m68994a(new C42437ay().mo86521a("panel_type", this.f76650a).mo86522b()));
    }

    /* renamed from: a */
    public final void mo59192a(C48649d dVar) {
        String str;
        int i;
        if (dVar == null) {
            i = -2;
            str = "unknown error";
        } else {
            i = dVar.f122279a;
            str = dVar.f122280b;
            C52711k.m112236a((Object) str, "e.msg");
        }
        C39629l.m88232a().mo58567E().mo49426a("sticker_list_error_rate", 1, new C42437ay().mo86519a("errorCode", Integer.valueOf(i)).mo86521a("errorDesc", str).mo86521a("panel", this.f76650a).mo86522b());
        JSONObject b = new C42437ay().mo86519a("error_code", Integer.valueOf(i)).mo86521a("error_msg", str).mo86521a("panel_type", this.f76650a).mo86522b();
        C39629l.m88232a().mo58567E().mo49427a("ttlive_load_sticker_list_all", 1, null, m68994a(b));
        C39629l.m88232a().mo58567E().mo49426a("ttlive_load_sticker_list_error", 1, b);
        C48707l lVar = this.f76651b;
        if (lVar != null) {
            lVar.mo59192a(dVar);
        }
    }

    private C29274w(String str, C48707l lVar) {
        this.f76650a = str;
        this.f76651b = lVar;
        C17429o b = C17429o.m42675b();
        C52711k.m112236a((Object) b, "Stopwatch.createStarted()");
        this.f76652d = b;
    }

    public /* synthetic */ C29274w(String str, C48707l lVar, C52707g gVar) {
        this(str, lVar);
    }
}
