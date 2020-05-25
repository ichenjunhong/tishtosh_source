package com.p683ss.android.ugc.aweme.utils;

import com.alibaba.fastjson.JSON;
import com.google.gson.C17971f;
import com.google.gson.C17978g;
import com.google.gson.C18097x;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.net.BaseResponseObjectTypeAdapterFactory;
import com.p683ss.android.ugc.aweme.net.CollectionTypeAdapterFactory;
import com.p683ss.android.ugc.aweme.net.ModelCheckerTypeAdapterFactory;
import com.p683ss.android.ugc.aweme.net.MusicTypeAdapterFactory;
import com.p683ss.android.ugc.aweme.net.UserTypeAdapterFactory;
import com.p683ss.android.ugc.aweme.search.C41431k;
import com.p683ss.android.ugc.aweme.sticker.model.C46066a;
import com.p683ss.android.ugc.aweme.typeadapter.BackgroundVideoDeserializer;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.utils.GsonHolder */
public class GsonHolder implements GsonProvider {
    private final C17971f gson;
    private final C17971f settingGson = this.gson;

    public C17971f getGson() {
        return this.gson;
    }

    public C17971f getSettingGson() {
        return this.settingGson;
    }

    public GsonHolder() {
        C17978g commonGsonBuilder = commonGsonBuilder();
        C41431k.f105004a.buildGson(commonGsonBuilder);
        this.gson = commonGsonBuilder.mo34900d();
    }

    public static C17978g commonGsonBuilder() {
        C17978g createAdapterGsonBuilder = JSON.createAdapterGsonBuilder();
        createAdapterGsonBuilder.mo34894a((C18097x) new ModelCheckerTypeAdapterFactory());
        createAdapterGsonBuilder.mo34894a((C18097x) new CollectionTypeAdapterFactory());
        createAdapterGsonBuilder.mo34894a((C18097x) new MusicTypeAdapterFactory());
        createAdapterGsonBuilder.mo34894a((C18097x) new UserTypeAdapterFactory());
        createAdapterGsonBuilder.mo34896a((Type) C46066a.class, (Object) new BackgroundVideoDeserializer());
        createAdapterGsonBuilder.mo34894a((C18097x) new BaseResponseObjectTypeAdapterFactory());
        return createAdapterGsonBuilder;
    }

    public static GsonProvider createGsonProviderbyMonsterPlugin() {
        Object a = C27991b.m66756a(GsonProvider.class);
        if (a != null) {
            return (GsonProvider) a;
        }
        if (C27991b.f73466aW == null) {
            synchronized (GsonProvider.class) {
                if (C27991b.f73466aW == null) {
                    C27991b.f73466aW = new GsonHolder();
                }
            }
        }
        return (GsonHolder) C27991b.f73466aW;
    }
}
