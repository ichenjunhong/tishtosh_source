package com.p683ss.android.ugc.aweme.global.config.settings;

import com.alibaba.fastjson.JSON;
import com.aweme.storage.C2562f;
import com.google.gson.C17971f;
import com.google.gson.C18080j;
import com.google.gson.C18081k;
import com.google.gson.C18082l;
import com.google.gson.C18086p;
import com.google.gson.C18097x;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.global.config.settings._default.AbstractSettingsGroup;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.JsonStubWillConvertToString;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.JsonStubWillConvertToString.Builder;
import com.squareup.wire.DefaultValueBuilder;
import com.squareup.wire.WireDeserializeErrorListener;
import com.squareup.wire.WireTypeAdapterFactory;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.SettingsUtil */
public final class SettingsUtil {

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.SettingsUtil$JsonObjectDeserializer */
    static final class JsonObjectDeserializer implements C18081k<JsonStubWillConvertToString> {
        JsonObjectDeserializer() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo9501a(C18082l lVar, Type type, C18080j jVar) throws C18086p {
            return m75698b(lVar, type, jVar);
        }

        /* renamed from: b */
        private static JsonStubWillConvertToString m75698b(C18082l lVar, Type type, C18080j jVar) throws C18086p {
            try {
                return new Builder().jsonobj_convert_string(lVar.toString()).build();
            } catch (Exception e) {
                SettingsUtil.m75695a(e);
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.SettingsUtil$a */
    static class C32806a {
        C32806a() {
        }

        /* renamed from: a */
        static IESSettings m75700a(List<AbstractSettingsGroup> list) {
            DefaultValueBuilder defaultValueBuilder = new DefaultValueBuilder(new IESSettings.Builder());
            for (AbstractSettingsGroup addDefaultSettingGroup : list) {
                defaultValueBuilder.addDefaultSettingGroup(addDefaultSettingGroup);
            }
            return (IESSettings) defaultValueBuilder.build();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.SettingsUtil$b */
    public static final class C32807b {

        /* renamed from: a */
        public C17971f f85409a;

        C32807b(IESSettings iESSettings, List<AbstractSettingsGroup> list) {
            WireTypeAdapterFactory wireTypeAdapterFactory = new WireTypeAdapterFactory();
            WireDeserializeErrorListener wireDeserializeErrorListener = SettingsUtil$SettingsTTRetrofitFactory$$Lambda$0.$instance;
            wireTypeAdapterFactory.registerDefaultValue(iESSettings, wireDeserializeErrorListener);
            for (AbstractSettingsGroup registerOptionalObjectDefaultValue : list) {
                registerOptionalObjectDefaultValue.registerOptionalObjectDefaultValue(wireTypeAdapterFactory, wireDeserializeErrorListener);
            }
            this.f85409a = JSON.createAdapterGsonBuilder().mo34894a((C18097x) wireTypeAdapterFactory).mo34896a((Type) JsonStubWillConvertToString.class, (Object) new JsonObjectDeserializer()).mo34900d();
        }
    }

    /* renamed from: a */
    public static void m75695a(Throwable th) {
        if (th != null && th.getMessage() != null) {
        }
    }

    /* renamed from: b */
    private static String m75697b(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            C17840a.m43751a(th, printWriter);
            return stringWriter.toString();
        } finally {
            printWriter.close();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ String m75692a(String str, Throwable th, String str2) throws Exception {
        String b = C2562f.m7498b(str);
        if (b == null) {
            b = "";
        }
        if (th != null) {
            m75694a(str2, str2, th, b, 1);
        } else {
            m75694a(str2, str2, null, b, 0);
        }
        return null;
    }

    /* renamed from: a */
    public static void m75696a(Throwable th, String str, String str2) {
        C0013i.m16a((Callable<TResult>) new C32820k<TResult>(str2, th, str));
    }

    /* renamed from: a */
    static final /* synthetic */ String m75693a(String str, Throwable th, String str2, IESSettings iESSettings) throws Exception {
        String b = C2562f.m7498b(str);
        if (b == null) {
            b = "";
        }
        if (th != null) {
            m75694a(str2, str2, th, b, 1);
        }
        if (iESSettings != null) {
            m75694a(str2, str2, null, b, 0);
        }
        return null;
    }

    /* renamed from: a */
    public static void m75694a(String str, String str2, Throwable th, String str3, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("classDesc", str);
            jSONObject.put("errorField", str2);
            jSONObject.put("errorDesc", m75697b(th));
            jSONObject.put("jsonDesc", str3);
            jSONObject.put("status", i);
            C23569o.m57779a("aweme_settings_error_log", jSONObject);
        } catch (Exception unused) {
            m75695a(th);
        }
    }
}
