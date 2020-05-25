package com.bytedance.android.live.gson;

import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.C18080j;
import com.google.gson.C18081k;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.C18086p;
import com.google.gson.C18089s;
import com.google.gson.C18090t;
import java.lang.reflect.Type;

public class FeedItemTypeAdapter implements C18081k<FeedItem>, C18090t<FeedItem> {
    /* renamed from: a */
    public final /* synthetic */ Object mo9501a(C18082l lVar, Type type, C18080j jVar) throws C18086p {
        return m10269b(lVar, type, jVar);
    }

    /* renamed from: b */
    private static FeedItem m10269b(C18082l lVar, Type type, C18080j jVar) throws C18086p {
        try {
            FeedItem feedItem = (FeedItem) C2942b.m8370b().mo34881a(lVar, FeedItem.class);
            feedItem.init();
            return feedItem;
        } catch (Exception unused) {
            throw new C18086p("error type");
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C18082l mo9500a(Object obj, Type type, C18089s sVar) {
        FeedItem feedItem = (FeedItem) obj;
        C18085o m = C2942b.m8370b().mo34875a((Object) feedItem).mo35009m();
        m.mo35017a("data", C2942b.m8370b().mo34876a((Object) feedItem.getRoom(), (Type) Room.class));
        return m;
    }
}
