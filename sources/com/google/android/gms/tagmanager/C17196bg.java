package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.C16654ei;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.android.gms.tagmanager.bg */
public final class C17196bg {

    /* renamed from: a */
    static C16654ei f48618a = m42132b((Object) f48622e);

    /* renamed from: b */
    private static Long f48619b = new Long(0);

    /* renamed from: c */
    private static Double f48620c = new Double(ProfileUiInitOptimizeEnterThreshold.DEFAULT);

    /* renamed from: d */
    private static C17195bf f48621d = new C17195bf(0);

    /* renamed from: e */
    private static String f48622e = new String("");

    /* renamed from: f */
    private static Boolean f48623f = new Boolean(false);

    /* renamed from: g */
    private static List<Object> f48624g = new ArrayList(0);

    /* renamed from: h */
    private static Map<Object, Object> f48625h = new HashMap();

    /* renamed from: a */
    static String m42131a(Object obj) {
        return obj == null ? f48622e : obj.toString();
    }

    /* renamed from: a */
    public static Boolean m42130a(C16654ei eiVar) {
        Object b = m42133b(eiVar);
        if (b instanceof Boolean) {
            return (Boolean) b;
        }
        String a = m42131a(b);
        if ("true".equalsIgnoreCase(a)) {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(a)) {
            return Boolean.FALSE;
        }
        return f48623f;
    }

    /* renamed from: b */
    public static C16654ei m42132b(Object obj) {
        String str;
        C16654ei eiVar = new C16654ei();
        if (obj instanceof C16654ei) {
            return (C16654ei) obj;
        }
        boolean z = false;
        if (obj instanceof String) {
            eiVar.f46856a = 1;
            eiVar.f46857b = (String) obj;
        } else if (obj instanceof List) {
            eiVar.f46856a = 2;
            List<Object> list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            boolean z2 = false;
            for (Object b : list) {
                C16654ei b2 = m42132b(b);
                if (b2 == f48618a) {
                    return f48618a;
                }
                z2 = z2 || b2.f46867l;
                arrayList.add(b2);
            }
            eiVar.f46858c = (C16654ei[]) arrayList.toArray(new C16654ei[0]);
            z = z2;
        } else if (obj instanceof Map) {
            eiVar.f46856a = 3;
            Set<Entry> entrySet = ((Map) obj).entrySet();
            ArrayList arrayList2 = new ArrayList(entrySet.size());
            ArrayList arrayList3 = new ArrayList(entrySet.size());
            boolean z3 = false;
            for (Entry entry : entrySet) {
                C16654ei b3 = m42132b(entry.getKey());
                C16654ei b4 = m42132b(entry.getValue());
                if (b3 == f48618a || b4 == f48618a) {
                    return f48618a;
                }
                z3 = z3 || b3.f46867l || b4.f46867l;
                arrayList2.add(b3);
                arrayList3.add(b4);
            }
            eiVar.f46859d = (C16654ei[]) arrayList2.toArray(new C16654ei[0]);
            eiVar.f46860e = (C16654ei[]) arrayList3.toArray(new C16654ei[0]);
            z = z3;
        } else if (m42134c(obj)) {
            eiVar.f46856a = 1;
            eiVar.f46857b = obj.toString();
        } else if (m42135d(obj)) {
            eiVar.f46856a = 6;
            eiVar.f46863h = m42136e(obj);
        } else if (obj instanceof Boolean) {
            eiVar.f46856a = 8;
            eiVar.f46864i = ((Boolean) obj).booleanValue();
        } else {
            String str2 = "Converting to Value from unknown object type: ";
            if (obj == null) {
                str = TEVideoRecorder.FACE_BEAUTY_NULL;
            } else {
                str = obj.getClass().toString();
            }
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return f48618a;
        }
        eiVar.f46867l = z;
        return eiVar;
    }

    /* renamed from: c */
    private static boolean m42134c(Object obj) {
        return (obj instanceof Double) || (obj instanceof Float) || ((obj instanceof C17195bf) && ((C17195bf) obj).mo33445a());
    }

    /* renamed from: d */
    private static boolean m42135d(Object obj) {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || ((obj instanceof C17195bf) && ((C17195bf) obj).mo33446b());
    }

    /* renamed from: e */
    private static long m42136e(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        return 0;
    }

    /* renamed from: b */
    public static Object m42133b(C16654ei eiVar) {
        if (eiVar == null) {
            return null;
        }
        int i = 0;
        switch (eiVar.f46856a) {
            case 1:
                return eiVar.f46857b;
            case 2:
                ArrayList arrayList = new ArrayList(eiVar.f46858c.length);
                C16654ei[] eiVarArr = eiVar.f46858c;
                int length = eiVarArr.length;
                while (i < length) {
                    Object b = m42133b(eiVarArr[i]);
                    if (b == null) {
                        return null;
                    }
                    arrayList.add(b);
                    i++;
                }
                return arrayList;
            case 3:
                if (eiVar.f46859d.length != eiVar.f46860e.length) {
                    String str = "Converting an invalid value to object: ";
                    String valueOf = String.valueOf(eiVar.toString());
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        new String(str);
                    }
                    return null;
                }
                HashMap hashMap = new HashMap(eiVar.f46860e.length);
                while (i < eiVar.f46859d.length) {
                    Object b2 = m42133b(eiVar.f46859d[i]);
                    Object b3 = m42133b(eiVar.f46860e[i]);
                    if (b2 == null || b3 == null) {
                        return null;
                    }
                    hashMap.put(b2, b3);
                    i++;
                }
                return hashMap;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return Long.valueOf(eiVar.f46863h);
            case 7:
                StringBuilder sb = new StringBuilder();
                C16654ei[] eiVarArr2 = eiVar.f46865j;
                int length2 = eiVarArr2.length;
                while (i < length2) {
                    String a = m42131a(m42133b(eiVarArr2[i]));
                    if (a == f48622e) {
                        return null;
                    }
                    sb.append(a);
                    i++;
                }
                return sb.toString();
            case 8:
                return Boolean.valueOf(eiVar.f46864i);
            default:
                int i2 = eiVar.f46856a;
                StringBuilder sb2 = new StringBuilder(46);
                sb2.append("Failed to convert a value of type: ");
                sb2.append(i2);
                return null;
        }
    }
}
