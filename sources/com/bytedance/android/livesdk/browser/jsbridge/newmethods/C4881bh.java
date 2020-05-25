package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.user.C8325b.C8326a;
import com.bytedance.android.livesdk.user.C8325b.C8327b;
import com.bytedance.android.livesdk.user.C8333e;
import com.bytedance.android.livesdk.user.C8334f;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdk.user.C8341k.C8343b;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a.C8687a;
import com.bytedance.ies.p675g.p677b.C10779d;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bh */
public final class C4881bh extends C10779d<JSONObject, Object> {

    /* renamed from: a */
    private C1690c f13150a;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo10636a(Throwable th) {
        finishWithFailure(th);
    }

    public final void onTerminate() {
        if (this.f13150a != null) {
            this.f13150a.dispose();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10635a(C8686a aVar, Context context) {
        if (aVar != null) {
            if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                if (context instanceof FragmentActivity) {
                    this.f13150a = TTLiveSDKContext.getHostService().mo10315h().mo14516a((FragmentActivity) context, C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.eva)).mo14539a(-1).mo14544d("search_result").mo14543c("recommend").mo14545e("follow").mo14541a()).mo6505a((C1710e<? super T>) new C4883bj<Object>(this, aVar, context), (C1710e<? super Throwable>) new C4884bk<Object>(this));
                }
            } else if (aVar.f23738g) {
                this.f13150a = TTLiveSDKContext.getHostService().mo10315h().mo14517a(((C8327b) ((C8327b) ((C8326a) C8334f.m16517a().mo14503a(aVar.f23732a)).mo14506b(aVar.f23733b)).mo14508c(aVar.f23734c)).mo14510c()).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C4885bl<Object>(this), (C1710e<? super Throwable>) new C4886bm<Object>(this));
            } else {
                this.f13150a = TTLiveSDKContext.getHostService().mo10315h().mo14519a(((C8343b) ((C8343b) ((C8343b) C8334f.m16519c().mo14503a(aVar.f23732a)).mo14548a(aVar.f23734c)).mo14546a(aVar.f23736e)).mo14551c()).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C4887bn<Object>(this), (C1710e<? super Throwable>) new C4888bo<Object>(this));
            }
        }
    }

    public final /* synthetic */ void invoke(Object obj, C10783f fVar) throws Exception {
        C10783f fVar2 = fVar;
        JSONObject jSONObject = (JSONObject) obj;
        String optString = jSONObject.optString("type");
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        if (optJSONObject == null) {
            finishWithFailure();
        } else if (TextUtils.equals("follow", optString)) {
            Context context = fVar2.f28972a;
            long parseLong = Long.parseLong(optJSONObject.getString("user_id"));
            long j = 0;
            try {
                j = Long.parseLong(optJSONObject.getString("room_id"));
            } catch (Exception e) {
                C8064d.m16005b();
                C8064d.m9718a(5, e.getStackTrace());
            }
            String string = optJSONObject.getString("from_label");
            String optString2 = optJSONObject.optString("url");
            C8686a aVar = new C8686a();
            aVar.f23737f = C8687a.FromWeb;
            aVar.f23732a = parseLong;
            aVar.f23733b = j;
            aVar.f23735d = optString2;
            aVar.f23734c = string;
            aVar.f23738g = true;
            mo10635a(aVar, context);
        } else {
            if (TextUtils.equals("unfollow", optString)) {
                Context context2 = fVar2.f28972a;
                long parseLong2 = Long.parseLong(optJSONObject.getString("user_id"));
                String optString3 = optJSONObject.optString("from_label", "");
                String optString4 = optJSONObject.optString("url", "");
                C8333e h = TTLiveSDKContext.getHostService().mo10315h();
                String a = C3922z.m9903a((int) R.string.e9u);
                C4882bi biVar = new C4882bi(this, optJSONObject, parseLong2, optString4, optString3, context2);
                h.mo14526a(a, biVar, context2, optString3, "", parseLong2, false);
                return;
            }
            finishWithFailure();
        }
    }
}
