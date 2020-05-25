package com.bytedance.android.live.broadcast.preview;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.C3007g;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.p230g.C3899m;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.room.C4182c.C4183a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.HashMap;
import p064c.p065a.C1683ag;
import p064c.p065a.C1686aj;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.live.broadcast.preview.am */
final /* synthetic */ class C3523am implements C4183a {

    /* renamed from: a */
    private final C3514al f10080a;

    C3523am(C3514al alVar) {
        this.f10080a = alVar;
    }

    /* renamed from: b_ */
    public final void mo8916b_() {
    }

    /* renamed from: a */
    public final void mo8915a(String str, String str2) {
        C3514al alVar = this.f10080a;
        alVar.f10053h.mo9577a();
        File file = new File(str);
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder("avatar file don't exists in path ");
            sb.append(str);
            alVar.mo8900a((Throwable) new Exception(sb.toString()));
            return;
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("file", new TypedFile("multipart/form-data", file));
        C3395f.m9156f().mo8742c().mo9021d().uploadAvatar(multipartTypedOutput).mo6149a((C1686aj<? super T, ? extends R>) C4064k.m10182a()).mo6159b((C1683ag<? super T>) new C1683ag<C4177d<C3007g>>(str) {

            /* renamed from: a */
            final /* synthetic */ String f10073a;

            public final void onSubscribe(C1690c cVar) {
            }

            public final void onError(Throwable th) {
                C3514al.this.mo8900a(th);
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                String str;
                String str2;
                C4177d dVar = (C4177d) obj;
                if (!C3514al.this.mo8452l()) {
                    C3514al.this.f10055j = null;
                    return;
                }
                ((C3007g) dVar.data).f8842c = this.f10073a;
                C3899m.m9869b(C3514al.this.f10051f, ((C3007g) dVar.data).f8842c);
                C3514al.this.f10052g.setText(C3514al.this.getString(R.string.efb));
                C3514al.this.f10052g.setAlpha(1.0f);
                C3514al.this.f10053h.mo9579b();
                if (!TextUtils.isEmpty(((C3007g) dVar.data).f8840a)) {
                    C3514al.this.f10054i = (C3007g) dVar.data;
                }
                C3514al.this.f10055j = null;
                HashMap hashMap = new HashMap();
                String str3 = "live_type";
                if (C3514al.this.f10057l == C8710m.AUDIO) {
                    str = "voice_live";
                } else {
                    str = "video_live";
                }
                hashMap.put(str3, str);
                String str4 = "anchor_id";
                if (C3514al.this.f10058m == null) {
                    str2 = "0";
                } else {
                    str2 = String.valueOf(C3514al.this.f10058m.getId());
                }
                hashMap.put(str4, str2);
                C8049c.m15979a().mo14202a("pm_live_photo_upload", hashMap, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click").mo14213a("live_take_page"));
            }

            {
                this.f10073a = r2;
            }
        });
        alVar.f10055j = str2;
    }
}
