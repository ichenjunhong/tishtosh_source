package com.google.android.gms.internal.measurement;

import com.C2240a;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.measurement.lb */
public final class C16851lb {
    /* renamed from: a */
    public static <T extends C16850la> String m40924a(T t) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            m40926a(null, t, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            String str = "Error printing proto: ";
            String valueOf = String.valueOf(e.getMessage());
            return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        } catch (InvocationTargetException e2) {
            String str2 = "Error printing proto: ";
            String valueOf2 = String.valueOf(e2.getMessage());
            return valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2);
        }
    }

    /* renamed from: a */
    private static void m40926a(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, InvocationTargetException {
        Field[] fields;
        int i;
        if (obj != null) {
            if (obj instanceof C16850la) {
                int length = stringBuffer.length();
                if (str != null) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(m40925a(str));
                    stringBuffer2.append(" <\n");
                    stringBuffer.append("  ");
                }
                Class cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    String name = field.getName();
                    if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                        Class type = field.getType();
                        Object obj2 = field.get(obj);
                        if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                            m40926a(name, obj2, stringBuffer, stringBuffer2);
                        } else {
                            if (obj2 == null) {
                                i = 0;
                            } else {
                                i = Array.getLength(obj2);
                            }
                            for (int i2 = 0; i2 < i; i2++) {
                                m40926a(name, Array.get(obj2, i2), stringBuffer, stringBuffer2);
                            }
                        }
                    }
                }
                for (Method name2 : cls.getMethods()) {
                    String name3 = name2.getName();
                    if (name3.startsWith("set")) {
                        String substring = name3.substring(3);
                        String str2 = "has";
                        try {
                            String valueOf = String.valueOf(substring);
                            if (((Boolean) cls.getMethod(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                                String str3 = "get";
                                String valueOf2 = String.valueOf(substring);
                                m40926a(substring, cls.getMethod(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3), new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                }
                if (str != null) {
                    stringBuffer.setLength(length);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(">\n");
                }
                return;
            }
            String a = m40925a(str);
            stringBuffer2.append(stringBuffer);
            stringBuffer2.append(a);
            stringBuffer2.append(": ");
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!str4.startsWith(WebKitApi.SCHEME_HTTP) && str4.length() > 200) {
                    str4 = String.valueOf(str4.substring(0, 200)).concat("[...]");
                }
                int length2 = str4.length();
                StringBuilder sb = new StringBuilder(length2);
                for (int i3 = 0; i3 < length2; i3++) {
                    char charAt = str4.charAt(i3);
                    if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                        sb.append(C2240a.m6772a("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                    } else {
                        sb.append(charAt);
                    }
                }
                String sb2 = sb.toString();
                stringBuffer2.append("\"");
                stringBuffer2.append(sb2);
                stringBuffer2.append("\"");
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (bArr == null) {
                    stringBuffer2.append("\"\"");
                } else {
                    stringBuffer2.append('\"');
                    for (byte b : bArr) {
                        byte b2 = b & 255;
                        if (b2 == 92 || b2 == 34) {
                            stringBuffer2.append('\\');
                            stringBuffer2.append((char) b2);
                        } else if (b2 < 32 || b2 >= Byte.MAX_VALUE) {
                            stringBuffer2.append(C2240a.m6772a("\\%03o", new Object[]{Integer.valueOf(b2)}));
                        } else {
                            stringBuffer2.append((char) b2);
                        }
                    }
                    stringBuffer2.append('\"');
                }
            } else {
                stringBuffer2.append(obj);
            }
            stringBuffer2.append("\n");
        }
    }

    /* renamed from: a */
    private static String m40925a(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }
}
