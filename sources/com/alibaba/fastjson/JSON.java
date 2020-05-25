package com.alibaba.fastjson;

import com.google.gson.C17971f;
import com.google.gson.C17978g;
import com.google.gson.C18091u;
import com.google.gson.C18095w;
import com.google.gson.internal.C17986b;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public abstract class JSON {
    private static final C18095w<Boolean> booleanAsIntAdapter = new C18095w<Boolean>() {
        public final Boolean read(C17958a aVar) throws IOException {
            boolean z;
            C17960b f = aVar.mo34843f();
            switch (C24853.$SwitchMap$com$google$gson$stream$JsonToken[f.ordinal()]) {
                case 1:
                    return Boolean.valueOf(aVar.mo34846j());
                case 2:
                    aVar.mo34847k();
                    return null;
                case 3:
                    try {
                        if (aVar.mo34850n() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    } catch (NumberFormatException e) {
                        throw new C18091u((Throwable) e);
                    }
                case 4:
                    return Boolean.valueOf(Boolean.parseBoolean(aVar.mo34845i()));
                default:
                    StringBuilder sb = new StringBuilder("Expected BOOLEAN or NUMBER but was ");
                    sb.append(f);
                    throw new IllegalStateException(sb.toString());
            }
        }

        public final void write(C17961c cVar, Boolean bool) throws IOException {
            if (bool == null) {
                cVar.mo34870f();
            } else {
                cVar.mo34859a(bool);
            }
        }
    };
    private static final C18095w<Integer> intAsBooleanAdapter = new C18095w<Integer>() {
        public final Integer read(C17958a aVar) throws IOException {
            C17960b f = aVar.mo34843f();
            switch (C24853.$SwitchMap$com$google$gson$stream$JsonToken[f.ordinal()]) {
                case 1:
                    return Integer.valueOf(aVar.mo34846j() ? 1 : 0);
                case 2:
                    aVar.mo34847k();
                    return null;
                case 3:
                    try {
                        return Integer.valueOf(aVar.mo34850n());
                    } catch (NumberFormatException e) {
                        throw new C18091u((Throwable) e);
                    }
                case 4:
                    return Integer.valueOf(Boolean.parseBoolean(aVar.mo34845i()) ? 1 : 0);
                default:
                    StringBuilder sb = new StringBuilder("Expected BOOLEAN or NUMBER but was ");
                    sb.append(f);
                    throw new IllegalStateException(sb.toString());
            }
        }

        public final void write(C17961c cVar, Integer num) throws IOException {
            if (num == null) {
                cVar.mo34870f();
            } else {
                cVar.mo34860a((Number) num);
            }
        }
    };

    /* renamed from: com.alibaba.fastjson.JSON$3 */
    static /* synthetic */ class C24853 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken = new int[C17960b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.google.gson.c.b[] r0 = com.google.gson.p1078c.C17960b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$gson$stream$JsonToken = r0
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.gson.c.b r1 = com.google.gson.p1078c.C17960b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.gson.c.b r1 = com.google.gson.p1078c.C17960b.NULL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x002a }
                com.google.gson.c.b r1 = com.google.gson.p1078c.C17960b.NUMBER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.google.gson.c.b r1 = com.google.gson.p1078c.C17960b.STRING     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSON.C24853.<clinit>():void");
        }
    }

    static C17971f createAdapterGson() {
        return createAdapterGsonBuilder().mo34900d();
    }

    public static C17978g createAdapterGsonBuilder() {
        C17978g a = new C17978g().mo34896a((Type) Boolean.class, (Object) booleanAsIntAdapter).mo34896a((Type) Boolean.TYPE, (Object) booleanAsIntAdapter).mo34896a((Type) Integer.class, (Object) intAsBooleanAdapter).mo34896a((Type) Integer.TYPE, (Object) intAsBooleanAdapter);
        a.f49904c = true;
        return a;
    }

    public static C17971f createAdapterGsonFromGsonBuilder(C17978g gVar) {
        return gVar.mo34900d();
    }

    public static String toJSONString(Object obj) {
        return createAdapterGson().mo34889b(obj);
    }

    public static <T> List<T> parseArray(String str, Class<T> cls) {
        try {
            return (List) createAdapterGson().mo34885a(str, (Type) C17986b.m44142a((Type) null, (Type) ArrayList.class, cls));
        } catch (NullPointerException unused) {
            return new ArrayList();
        }
    }

    public static <T> T parseObject(String str, Class<T> cls) {
        C17971f createAdapterGson = createAdapterGson();
        if (cls == null) {
            return new JSONObject();
        }
        return createAdapterGson.mo34884a(str, cls);
    }
}
