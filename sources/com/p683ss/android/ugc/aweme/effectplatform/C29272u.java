package com.p683ss.android.ugc.aweme.effectplatform;

import com.p683ss.android.ugc.aweme.port.p2082in.C39567as;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48699d;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.u */
public final class C29272u implements C48699d {

    /* renamed from: a */
    private final C48705j f76646a;

    /* renamed from: b */
    private long f76647b;

    /* renamed from: c */
    private long f76648c;

    private C29272u(C48705j jVar) {
        this.f76646a = jVar;
    }

    /* renamed from: a */
    private static JSONObject m68987a(JSONObject jSONObject) {
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
    public final void mo8643a(Effect effect) {
        this.f76647b = System.currentTimeMillis();
        this.f76648c = 0;
        if (this.f76646a != null) {
            this.f76646a.mo8643a(effect);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00c1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo8638a(java.lang.Object r15) {
        /*
            r14 = this;
            com.ss.android.ugc.effectmanager.effect.model.Effect r15 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r15
            android.app.Application r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88233b()
            boolean r0 = com.p683ss.android.ugc.aweme.effectplatform.C29273v.m68992a(r0)
            if (r0 == 0) goto L_0x0103
            r0 = 1
            r1 = 0
            if (r15 == 0) goto L_0x0024
            java.util.List r2 = r15.getTypes()
            boolean r3 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)
            if (r3 != 0) goto L_0x0024
            java.lang.String r3 = "AR"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x0024
            r2 = 1
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r14.f76647b
            long r3 = r3 - r5
            com.ss.android.ugc.aweme.port.in.u r5 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.property.h r5 = r5.mo58583n()
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.UseNewEffectExecutorType
            boolean r6 = r5.mo83103a(r6)
            com.ss.android.ugc.aweme.property.h$a r7 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.PreFetchPopEffectModel
            boolean r7 = r5.mo83103a(r7)
            com.ss.android.ugc.aweme.property.h$a r8 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.FetchEffectModelType
            int r5 = r5.mo83104b(r8)
            com.ss.android.ugc.aweme.port.in.u r8 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.port.in.as r8 = r8.mo58567E()
            java.lang.String r9 = "sticker_download_error_rate"
            com.ss.android.ugc.aweme.shortvideo.ay r10 = new com.ss.android.ugc.aweme.shortvideo.ay
            r10.<init>()
            java.lang.String r11 = "type"
            java.lang.String r12 = java.lang.String.valueOf(r2)
            com.ss.android.ugc.aweme.shortvideo.ay r10 = r10.mo86521a(r11, r12)
            java.lang.String r11 = "url"
            com.ss.android.ugc.aweme.port.in.u r12 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.google.gson.f r12 = r12.mo58566D()
            com.ss.android.ugc.effectmanager.common.model.UrlModel r13 = r15.getFileUrl()
            java.lang.String r12 = r12.mo34889b(r13)
            com.ss.android.ugc.aweme.shortvideo.ay r10 = r10.mo86521a(r11, r12)
            java.lang.String r11 = "executor_type"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.ss.android.ugc.aweme.shortvideo.ay r6 = r10.mo86519a(r11, r6)
            java.lang.String r10 = "prefetch_model"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.ss.android.ugc.aweme.shortvideo.ay r6 = r6.mo86519a(r10, r7)
            java.lang.String r7 = "zip_model"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.ss.android.ugc.aweme.shortvideo.ay r5 = r6.mo86519a(r7, r5)
            java.lang.String r6 = "duration"
            java.lang.String r7 = java.lang.String.valueOf(r3)
            com.ss.android.ugc.aweme.shortvideo.ay r5 = r5.mo86521a(r6, r7)
            org.json.JSONObject r5 = r5.mo86522b()
            r8.mo49426a(r9, r1, r5)
            com.ss.android.ugc.aweme.port.in.u r5 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.port.in.as r5 = r5.mo58567E()
            java.lang.String r6 = "type_av_sticker_download_time"
            com.ss.android.ugc.aweme.shortvideo.ay r7 = com.p683ss.android.ugc.aweme.shortvideo.C42437ay.m93202a()
            java.lang.String r8 = "duration"
            java.lang.Long r9 = java.lang.Long.valueOf(r3)
            com.ss.android.ugc.aweme.shortvideo.ay r7 = r7.mo86520a(r8, r9)
            java.lang.String r8 = "isAr"
            if (r2 != r0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r0 = 0
        L_0x00c2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.ss.android.ugc.aweme.shortvideo.ay r0 = r7.mo86517a(r8, r0)
            org.json.JSONObject r0 = r0.mo86522b()
            r5.mo49431a(r6, r0)
            com.ss.android.ugc.aweme.shortvideo.ay r0 = new com.ss.android.ugc.aweme.shortvideo.ay
            r0.<init>()
            java.lang.String r2 = "duration"
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            com.ss.android.ugc.aweme.shortvideo.ay r0 = r0.mo86520a(r2, r5)
            org.json.JSONObject r0 = r0.mo86522b()
            r2 = 0
            org.json.JSONObject r2 = m68987a(r2)
            com.ss.android.ugc.aweme.port.in.u r5 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.port.in.as r5 = r5.mo58567E()
            java.lang.String r6 = "ttlive_download_sticker_all"
            r5.mo49427a(r6, r1, r0, r2)
            com.ss.android.ugc.aweme.effectplatform.b r0 = new com.ss.android.ugc.aweme.effectplatform.b
            r0.<init>()
            long r1 = r14.f76648c
            r5 = 0
            r6 = 0
            r0 = r15
            com.p683ss.android.ugc.aweme.effectplatform.C29241b.m68867a(r0, r1, r3, r5, r6)
        L_0x0103:
            com.ss.android.ugc.effectmanager.effect.c.j r0 = r14.f76646a
            if (r0 == 0) goto L_0x010c
            com.ss.android.ugc.effectmanager.effect.c.j r0 = r14.f76646a
            r0.mo8638a(r15)
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.effectplatform.C29272u.mo8638a(java.lang.Object):void");
    }

    /* renamed from: a */
    public static C29272u m68985a(C48705j jVar, String str) {
        return m68986a(jVar, str, false);
    }

    /* renamed from: a */
    public final void mo8644a(Effect effect, C48649d dVar) {
        Object obj;
        String str;
        String str2;
        if (C29273v.m68992a(C39629l.m88233b())) {
            C40789h n = C39629l.m88232a().mo58583n();
            boolean a = n.mo83103a(C40790a.UseNewEffectExecutorType);
            boolean a2 = n.mo83103a(C40790a.PreFetchPopEffectModel);
            int b = n.mo83104b(C40790a.FetchEffectModelType);
            StringBuilder sb = new StringBuilder();
            sb.append(dVar.f122280b);
            if (dVar.f122279a == -1) {
                obj = dVar.f122281c.getStackTrace();
            } else {
                obj = "";
            }
            sb.append(obj);
            String sb2 = sb.toString();
            C39567as E = C39629l.m88232a().mo58567E();
            String str3 = "sticker_download_error_rate";
            C42437ay ayVar = new C42437ay();
            String str4 = "sticker_id";
            if (effect == null) {
                str = "";
            } else {
                str = effect.getEffectId();
            }
            C42437ay a3 = ayVar.mo86521a(str4, str).mo86521a("errorCode", String.valueOf(dVar.f122279a)).mo86521a("errorMsg", sb2).mo86519a("executor_type", Integer.valueOf(a ? 1 : 0)).mo86519a("prefetch_model", Integer.valueOf(a2 ? 1 : 0)).mo86519a("zip_model", Integer.valueOf(b));
            String str5 = "url";
            if (effect == null) {
                str2 = "";
            } else {
                str2 = C39629l.m88232a().mo58566D().mo34889b(effect.getFileUrl());
            }
            E.mo49426a(str3, 1, a3.mo86521a(str5, str2).mo86522b());
            JSONObject b2 = new C42437ay().mo86519a("error_code", Integer.valueOf(dVar.f122279a)).mo86521a("error_msg", sb2).mo86522b();
            C39629l.m88232a().mo58567E().mo49427a("ttlive_download_sticker_all", 1, null, m68987a(b2));
            C39629l.m88232a().mo58567E().mo49426a("ttlive_download_sticker_error", 1, b2);
        }
        new C29241b();
        C29241b.m68867a(effect, this.f76648c, System.currentTimeMillis() - this.f76647b, -1, dVar);
        if (this.f76646a != null) {
            this.f76646a.mo8644a(effect, dVar);
        }
    }

    /* renamed from: a */
    public static C29272u m68986a(C48705j jVar, String str, boolean z) {
        return new C29272u(new C29260n(str, jVar, z));
    }

    /* renamed from: a */
    public final void mo59191a(Effect effect, int i, long j) {
        if (this.f76648c == 0) {
            this.f76648c = j;
            new C29241b();
            C29241b.m68866a(effect, j);
        }
        if (this.f76646a instanceof C48699d) {
            ((C48699d) this.f76646a).mo59191a(effect, i, j);
        }
    }
}
