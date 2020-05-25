package com.bytedance.android.live.broadcast.widget;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.C3007g;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.p225d.C3833a;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.core.p230g.C3899m;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4182c.C4183a;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;
import p064c.p065a.C1683ag;
import p064c.p065a.C1686aj;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.live.broadcast.widget.t */
final /* synthetic */ class C3794t implements C4183a {

    /* renamed from: a */
    private final C3792s f10728a;

    C3794t(C3792s sVar) {
        this.f10728a = sVar;
    }

    /* renamed from: b_ */
    public final void mo8916b_() {
    }

    /* renamed from: a */
    public final void mo8915a(String str, String str2) {
        C3792s sVar = this.f10728a;
        sVar.f10719d.mo9577a();
        File file = new File(str);
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder("avatar file don't exists in path ");
            sb.append(str);
            sVar.mo9164a((Throwable) new Exception(sb.toString()));
            return;
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("file", new TypedFile("multipart/form-data", file));
        C3395f.m9156f().mo8742c().mo9021d().uploadAvatar(multipartTypedOutput).mo6149a((C1686aj<? super T, ? extends R>) C4064k.m10182a()).mo6159b((C1683ag<? super T>) new C1683ag<C4177d<C3007g>>(str) {

            /* renamed from: a */
            final /* synthetic */ String f10726a;

            public final void onSubscribe(C1690c cVar) {
                C3792s.this.f10721f.mo6181a(cVar);
            }

            public final void onError(Throwable th) {
                C3792s.this.mo9164a(th);
                JSONObject jSONObject = new JSONObject();
                C3833a.m9731a(jSONObject, "error_code", "1");
                C3833a.m9731a(jSONObject, "error_msg", th.toString());
                C3837e.m9744a("ttlive_upload_cover_all", 1, jSONObject);
                C3837e.m9744a("ttlive_upload_cover_error", 1, jSONObject);
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                String str;
                String str2;
                C4177d dVar = (C4177d) obj;
                ((C3007g) dVar.data).f8842c = this.f10726a;
                C3792s sVar = C3792s.this;
                C3007g gVar = (C3007g) dVar.data;
                if (!sVar.f10718c.mo8452l()) {
                    sVar.f10720e = null;
                } else {
                    C13833a aVar = (C13833a) sVar.f10716a.getHierarchy();
                    if (aVar != null) {
                        aVar.mo25898a(C13818b.f36067g);
                        sVar.f10716a.setHierarchy(aVar);
                    }
                    C3899m.m9869b(sVar.f10716a, gVar.f8842c);
                    sVar.f10717b.setText(sVar.f10718c.getString(R.string.efb));
                    sVar.f10717b.setAlpha(1.0f);
                    sVar.f10719d.mo9579b();
                    if (!TextUtils.isEmpty(gVar.f8840a)) {
                        sVar.f10723h = gVar;
                    }
                    if (sVar.f10724i != null) {
                        sVar.f10724i.mo8881i().postValue(sVar.mo9163a());
                    }
                    HashMap hashMap = new HashMap();
                    String str3 = "live_type";
                    if (sVar.f10722g == C8710m.AUDIO) {
                        str = "voice_live";
                    } else {
                        str = "video_live";
                    }
                    hashMap.put(str3, str);
                    hashMap.put("shooting_date", sVar.f10720e);
                    hashMap.put("current_date", String.valueOf(System.currentTimeMillis()));
                    hashMap.put("cover_url", sVar.f10723h.f8840a);
                    C8049c.m15979a().mo14202a("cover_modify_over", hashMap, new C8059j().mo14218f("click").mo14214b(CustomActionPushReceiver.f104061f).mo14213a("cover_edit"));
                    sVar.f10720e = null;
                    C8710m mVar = sVar.f10722g;
                    C3009i a = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a();
                    if (a instanceof User) {
                        User user = (User) a;
                        HashMap hashMap2 = new HashMap();
                        String str4 = "live_type";
                        if (mVar == C8710m.AUDIO) {
                            str2 = "voice_live";
                        } else {
                            str2 = "video_live";
                        }
                        hashMap2.put(str4, str2);
                        hashMap2.put("anchor_id", String.valueOf(user.getId()));
                        C8049c.m15979a().mo14202a("pm_live_photo_upload", hashMap2, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click").mo14213a("live_take_page"));
                    }
                }
                C3837e.m9744a("ttlive_upload_cover_all", 0, (JSONObject) null);
            }

            {
                this.f10726a = r2;
            }
        });
        sVar.f10720e = str2;
    }
}
