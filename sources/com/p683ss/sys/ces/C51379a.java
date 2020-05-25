package com.p683ss.sys.ces;

import android.content.Context;
import com.p683ss.p1096a.p1098b.C18483c;
import com.p683ss.sys.ces.p2580a.C51380a;
import com.p683ss.sys.ces.p2580a.C51381b;
import com.p683ss.sys.ces.p2580a.C51382c;
import com.p683ss.sys.ces.p2580a.C51384d;
import com.p683ss.sys.ces.p2580a.C51385e;
import com.p683ss.sys.ces.p2580a.C51386f;
import com.p683ss.sys.ces.p2580a.C51387g;
import com.p683ss.sys.ces.p2581b.C51389a;
import com.p683ss.sys.ces.p2581b.C51391c;
import com.p683ss.sys.p2577b.C51373a;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.sys.ces.a */
public final class C51379a {
    public static byte[] sMetaData;

    private static final void Bill() {
    }

    public static final void Louis() {
    }

    public static final void Zeoy() {
    }

    public static native byte[] decode(int i, byte[] bArr);

    public static native byte[] encode(byte[] bArr);

    public static native byte[] leviathan(int i, int i2, byte[] bArr);

    public static native Object meta(int i, Context context, Object obj);

    public final void Francies() {
    }

    public static Object njss(int i, Object obj) {
        Object obj2;
        Object obj3 = null;
        try {
            Context context = C51393c.m110533a().f128514c;
            if (i == 123) {
                obj2 = C51386f.m110517a(context);
            } else if (i == 121) {
                obj2 = C51384d.m110514a(context);
            } else if (i == 122) {
                obj2 = C51384d.m110513a();
            } else if (i == 126) {
                obj2 = C51384d.m110515b(context);
            } else if (i == 127) {
                obj2 = C18483c.m44730a("");
            } else if (i == 128) {
                obj2 = C18483c.m44730a(null);
            } else if (i == 120) {
                obj2 = C51382c.m110508a();
            } else if (i == 124) {
                obj2 = "[]";
            } else if (i == 130) {
                obj2 = C51387g.m110520a(context);
            } else if (i == 125) {
                obj2 = C18483c.m44730a(null);
            } else if (i == 226) {
                obj2 = C18483c.m44730a(null);
            } else if (i == 129) {
                obj2 = C51385e.m110516a(context);
            } else if (i == 131) {
                obj2 = C51373a.m110489a().mo102052b();
            } else {
                if (i == 132) {
                    C51393c.m110533a().reportNow((String) obj);
                } else if (i == 134) {
                    obj2 = C51391c.m110527a(context).mo102068b();
                } else if (i == 140) {
                    obj2 = C51389a.m110522a(context).mo102059b();
                } else if (i == 139) {
                    obj2 = C51380a.m110506e(context);
                } else if (i == 133) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (Entry entry : C51393c.m110533a().f128522n.entrySet()) {
                            if (entry.getValue() == null) {
                                jSONObject.put((String) entry.getKey(), "");
                            } else {
                                jSONObject.put((String) entry.getKey(), entry.getValue());
                            }
                        }
                        obj3 = jSONObject.toString();
                    } catch (Throwable unused) {
                    }
                    obj3 = obj3 == null ? "{}" : ((String) obj3).trim();
                } else if (i == 135) {
                    obj2 = C51409f.m110570a();
                } else if (i == 136) {
                    try {
                        obj2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray();
                    } catch (Throwable unused2) {
                    }
                } else if (i == 234) {
                    sMetaData = (byte[]) obj;
                } else if (i == 235) {
                    C51381b.m110507a(context);
                }
                obj2 = obj3;
            }
            return obj2;
        } catch (Throwable unused3) {
            return obj3;
        }
    }
}
