package com.bytedance.android.live.broadcast.widget;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.C3007g;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.p225d.C3833a;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.core.p230g.C3899m;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4182c.C4183a;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;
import p064c.p065a.C1683ag;
import p064c.p065a.C1686aj;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.live.broadcast.widget.l */
final /* synthetic */ class C3778l implements C4183a {

    /* renamed from: a */
    private final C3776k f10680a;

    C3778l(C3776k kVar) {
        this.f10680a = kVar;
    }

    /* renamed from: b_ */
    public final void mo8916b_() {
    }

    /* renamed from: a */
    public final void mo8915a(String str, String str2) {
        C3776k kVar = this.f10680a;
        kVar.f10672e.mo9577a();
        File file = new File(str);
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder("avatar file don't exists in path ");
            sb.append(str);
            kVar.mo9150a((Throwable) new Exception(sb.toString()));
            return;
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("file", new TypedFile("multipart/form-data", file));
        C3395f.m9156f().mo8742c().mo9021d().uploadAvatar(multipartTypedOutput).mo6149a((C1686aj<? super T, ? extends R>) C4064k.m10182a()).mo6159b((C1683ag<? super T>) new C1683ag<C4177d<C3007g>>(str) {

            /* renamed from: a */
            final /* synthetic */ String f10678a;

            public final void onSubscribe(C1690c cVar) {
                C3776k.this.f10674g.mo6181a(cVar);
            }

            public final void onError(Throwable th) {
                C3776k.this.mo9150a(th);
                JSONObject jSONObject = new JSONObject();
                C3833a.m9731a(jSONObject, "error_code", "1");
                C3833a.m9731a(jSONObject, "error_msg", th.toString());
                C3837e.m9744a("ttlive_upload_cover_all", 1, jSONObject);
                C3837e.m9744a("ttlive_upload_cover_error", 1, jSONObject);
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                Object obj2;
                C4177d dVar = (C4177d) obj;
                ((C3007g) dVar.data).f8842c = this.f10678a;
                C3776k kVar = C3776k.this;
                C3007g gVar = (C3007g) dVar.data;
                if (!kVar.f10671d.mo8452l()) {
                    kVar.f10673f = null;
                } else {
                    C3899m.m9869b(kVar.f10668a, gVar.f8842c);
                    kVar.f10670c.setText(C3922z.m9903a((int) R.string.gyf));
                    kVar.f10670c.setAlpha(1.0f);
                    kVar.f10672e.mo9579b();
                    if (!TextUtils.isEmpty(gVar.f8840a)) {
                        kVar.f10675h = gVar;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("live_type", kVar.mo9152c());
                    hashMap.put("shooting_date", kVar.f10673f);
                    hashMap.put("current_date", String.valueOf(System.currentTimeMillis()));
                    hashMap.put("cover_url", kVar.f10675h.f8840a);
                    if (kVar.f10676i != null) {
                        hashMap.put("anchor_id", String.valueOf(kVar.f10676i.getId()));
                    }
                    C8049c.m15979a().mo14202a("livesdk_cover_modify_over", hashMap, new C8059j().mo14218f("click").mo14214b(CustomActionPushReceiver.f104061f).mo14213a("cover_edit"));
                    kVar.f10673f = null;
                    User user = (User) ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("live_type", kVar.mo9152c());
                    String str = "anchor_id";
                    if (user == null) {
                        obj2 = "0";
                    } else {
                        obj2 = Long.valueOf(user.getId());
                    }
                    hashMap2.put(str, String.valueOf(obj2));
                    C8049c.m15979a().mo14202a("pm_live_photo_upload", hashMap2, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click").mo14213a("live_take_page"));
                }
                C3837e.m9744a("ttlive_upload_cover_all", 0, (JSONObject) null);
            }

            {
                this.f10678a = r2;
            }
        });
        kVar.f10673f = str2;
    }
}
