package com.bytedance.android.livesdk.feed.services;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.base.model.C2973f;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.C8706l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.C17971f;
import com.google.gson.C18080j;
import com.google.gson.C18081k;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.C18086p;
import com.p683ss.android.ugc.aweme.effect.C29094ad;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;

public class FeedItemDeserializer implements C18081k<FeedItem> {

    /* renamed from: a */
    private C17971f f19308a = C2942b.m8369a();

    /* access modifiers changed from: private */
    /* renamed from: b */
    public FeedItem mo9501a(C18082l lVar, Type type, C18080j jVar) throws C18086p {
        try {
            FeedItem feedItem = (FeedItem) this.f19308a.mo34881a(lVar, FeedItem.class);
            C18085o m = lVar.mo35009m();
            switch (feedItem.type) {
                case 1:
                case 2:
                case 4:
                case 5:
                    feedItem.item = (C2973f) jVar.mo34940a(m.mo35022b("data"), Room.class);
                    break;
                case 3:
                    String str = new String(Base64.decode(m.mo35022b(C29094ad.f76264a).mo34905c(), 1));
                    if (!TextUtils.isEmpty(str)) {
                        feedItem.adJSONObject = new JSONObject(str);
                        feedItem.item = (C2973f) C2942b.m8369a().mo34884a(str, C8706l.class);
                        long currentTimeMillis = System.currentTimeMillis();
                        ((C8706l) feedItem.item).f23858K = currentTimeMillis;
                        try {
                            feedItem.adJSONObject.put("subId", currentTimeMillis);
                            break;
                        } catch (JSONException unused) {
                            break;
                        }
                    }
                    break;
            }
            return feedItem;
        } catch (Exception unused2) {
            throw new C18086p("error type");
        }
    }
}
