package com.google.ads.mediation;

import com.google.android.gms.internal.ads.afc;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.ads.mediation.e */
public class C14871e {

    /* renamed from: com.google.ads.mediation.e$a */
    public static final class C14872a extends Exception {
        public C14872a(String str) {
            super(str);
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.google.ads.mediation.e$b */
    public @interface C14873b {
        /* renamed from: a */
        String mo27223a();

        /* renamed from: b */
        boolean mo27224b() default true;
    }

    /* renamed from: a */
    public final void mo27222a(Map<String, String> map) throws C14872a {
        Field[] fields;
        HashMap hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            C14873b bVar = (C14873b) field.getAnnotation(C14873b.class);
            if (bVar != null) {
                hashMap.put(bVar.mo27223a(), field);
            }
        }
        if (hashMap.isEmpty()) {
            afc.m32798e("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Entry entry : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException unused) {
                    String str = (String) entry.getKey();
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
                    sb.append("Server option \"");
                    sb.append(str);
                    sb.append("\" could not be set: Illegal Access");
                    afc.m32798e(sb.toString());
                } catch (IllegalArgumentException unused2) {
                    String str2 = (String) entry.getKey();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 43);
                    sb2.append("Server option \"");
                    sb2.append(str2);
                    sb2.append("\" could not be set: Bad Type");
                    afc.m32798e(sb2.toString());
                }
            } else {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 31 + String.valueOf(str4).length());
                sb3.append("Unexpected server option: ");
                sb3.append(str3);
                sb3.append(" = \"");
                sb3.append(str4);
                sb3.append("\"");
                afc.m32792b(sb3.toString());
            }
        }
        StringBuilder sb4 = new StringBuilder();
        for (Field field3 : hashMap.values()) {
            if (((C14873b) field3.getAnnotation(C14873b.class)).mo27224b()) {
                String str5 = "Required server option missing: ";
                String valueOf = String.valueOf(((C14873b) field3.getAnnotation(C14873b.class)).mo27223a());
                afc.m32798e(valueOf.length() != 0 ? str5.concat(valueOf) : new String(str5));
                if (sb4.length() > 0) {
                    sb4.append(", ");
                }
                sb4.append(((C14873b) field3.getAnnotation(C14873b.class)).mo27223a());
            }
        }
        if (sb4.length() > 0) {
            String str6 = "Required server option(s) missing: ";
            String valueOf2 = String.valueOf(sb4.toString());
            throw new C14872a(valueOf2.length() != 0 ? str6.concat(valueOf2) : new String(str6));
        }
    }
}
