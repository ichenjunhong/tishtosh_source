package com.p683ss.android.ugc.aweme.effectplatform;

import com.google.p1057b.p1058a.C17429o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.t */
public final class C29271t implements C48702g {

    /* renamed from: a */
    private C48702g f76643a;

    /* renamed from: b */
    private C17429o f76644b = C17429o.m42675b();

    /* renamed from: c */
    private String f76645c;

    /* renamed from: a */
    private static JSONObject m68982a(JSONObject jSONObject) {
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
        EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
        JSONObject b = new C42437ay().mo86520a("duration", Long.valueOf(this.f76644b.mo33754a(TimeUnit.MILLISECONDS))).mo86521a("panel", this.f76645c).mo86522b();
        C39629l.m88232a().mo58567E().mo49426a("sticker_list_error_rate", 0, b);
        C39629l.m88232a().mo58567E().mo49427a("ttlive_load_sticker_list_all", 0, b, m68982a(new C42437ay().mo86521a("panel_type", this.f76645c).mo86522b()));
        if (this.f76643a != null) {
            this.f76643a.mo8638a(effectChannelResponse);
        }
    }

    /* renamed from: a */
    public final void mo8637a(C48649d dVar) {
        String str;
        int i;
        if (dVar == null) {
            i = -2;
            str = "unknow error";
        } else {
            i = dVar.f122279a;
            str = dVar.f122280b;
        }
        C39629l.m88232a().mo58567E().mo49426a("sticker_list_error_rate", 1, new C42437ay().mo86519a("errorCode", Integer.valueOf(i)).mo86521a("errorDesc", str).mo86521a("panel", this.f76645c).mo86522b());
        JSONObject b = new C42437ay().mo86519a("error_code", Integer.valueOf(i)).mo86521a("error_msg", str).mo86521a("panel_type", this.f76645c).mo86522b();
        C39629l.m88232a().mo58567E().mo49427a("ttlive_load_sticker_list_all", 1, null, m68982a(b));
        C39629l.m88232a().mo58567E().mo49426a("ttlive_load_sticker_list_error", 1, b);
        if (this.f76643a != null) {
            this.f76643a.mo8637a(dVar);
        }
    }

    private C29271t(String str, C48702g gVar) {
        this.f76643a = gVar;
        this.f76645c = str;
    }

    /* renamed from: a */
    public static C29271t m68981a(String str, C48702g gVar) {
        return new C29271t(str, new C29256j(str, gVar));
    }
}
