package com.bytedance.p502b.p503a.p504a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.p502b.p503a.p504a.p505a.C9209a;
import com.bytedance.p502b.p503a.p504a.p505a.C9210b;
import com.bytedance.p502b.p503a.p504a.p505a.C9211c;
import com.bytedance.p502b.p503a.p504a.p505a.C9212d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.a.a.a */
public final class C9208a {

    /* renamed from: a */
    public Map<String, List<C9217f>> f25180a = new HashMap();

    /* renamed from: b */
    public Map<Class<?>, C9216e> f25181b = new HashMap();

    /* renamed from: c */
    private Set<String> f25182c = new HashSet();

    /* renamed from: d */
    private Set<String> f25183d = new HashSet();

    /* renamed from: e */
    private Set<String> f25184e = new HashSet();

    /* renamed from: a */
    public final void mo16568a(Object obj) {
        Class cls;
        C9216e eVar;
        Class cls2;
        int i;
        Method[] methodArr;
        Class cls3;
        Method[] methodArr2;
        int i2;
        Object obj2;
        SystemClock.elapsedRealtime();
        Class cls4 = obj.getClass();
        boolean z = true;
        if (cls4 == null) {
            cls = cls4;
            eVar = null;
        } else {
            Class cls5 = cls4;
            C9216e eVar2 = null;
            while (cls5 != null && !C9213b.m18302a(cls5.getName())) {
                if (C9213b.f25185a.containsKey(cls5)) {
                    for (C9214c cVar : ((C9216e) C9213b.f25185a.get(cls5)).mo16579a()) {
                        if (eVar2 == null) {
                            eVar2 = new C9216e();
                        }
                        if (!eVar2.mo16581a(cVar.f25187b)) {
                            eVar2.mo16580a(cVar.f25187b, cVar);
                        }
                    }
                }
                cls5 = cls5.getSuperclass();
            }
            if (eVar2 == null) {
                C9216e eVar3 = new C9216e();
                Class cls6 = cls4;
                while (cls6 != null && !C9213b.m18302a(cls6.getName())) {
                    C9216e eVar4 = new C9216e();
                    Method[] declaredMethods = cls6.getDeclaredMethods();
                    int length = declaredMethods.length;
                    int i3 = 0;
                    while (i3 < length) {
                        Method method = declaredMethods[i3];
                        C9209a aVar = (C9209a) method.getAnnotation(C9209a.class);
                        if (aVar != null) {
                            String a = aVar.mo16570a();
                            if (!TextUtils.isEmpty(a) && !eVar3.mo16581a(a)) {
                                method.setAccessible(z);
                                String b = aVar.mo16571b();
                                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                                Class<String>[] parameterTypes = method.getParameterTypes();
                                C9215d[] dVarArr = new C9215d[parameterAnnotations.length];
                                int i4 = 0;
                                while (i4 < parameterAnnotations.length) {
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= parameterAnnotations[i4].length) {
                                            cls3 = cls4;
                                            methodArr2 = declaredMethods;
                                            i2 = length;
                                            break;
                                        } else if (parameterAnnotations[i4][i5] instanceof C9212d) {
                                            C9212d dVar = (C9212d) parameterAnnotations[i4][i5];
                                            Class<String> cls7 = parameterTypes[i4];
                                            methodArr2 = declaredMethods;
                                            String a2 = dVar.mo16572a();
                                            i2 = length;
                                            if (cls7 == Integer.TYPE) {
                                                obj2 = Integer.valueOf(dVar.mo16573b());
                                            } else if (cls7 == Long.TYPE) {
                                                obj2 = Long.valueOf(dVar.mo16574c());
                                            } else if (cls7 == Boolean.TYPE) {
                                                obj2 = Boolean.valueOf(dVar.mo16577f());
                                            } else if (cls7 == Double.TYPE) {
                                                obj2 = Double.valueOf(dVar.mo16575d());
                                            } else if (cls7 == Float.TYPE) {
                                                obj2 = Float.valueOf(dVar.mo16576e());
                                            } else if (cls7 == String.class) {
                                                obj2 = dVar.mo16578g();
                                            } else {
                                                obj2 = null;
                                            }
                                            cls3 = cls4;
                                            dVarArr[i4] = new C9215d(0, cls7, a2, obj2);
                                        } else {
                                            cls3 = cls4;
                                            methodArr2 = declaredMethods;
                                            i2 = length;
                                            if (parameterAnnotations[i4][i5] instanceof C9210b) {
                                                dVarArr[i4] = new C9215d(1);
                                                break;
                                            } else if (parameterAnnotations[i4][i5] instanceof C9211c) {
                                                dVarArr[i4] = new C9215d(2);
                                                break;
                                            } else {
                                                i5++;
                                                declaredMethods = methodArr2;
                                                length = i2;
                                                cls4 = cls3;
                                            }
                                        }
                                    }
                                    if (dVarArr[i4] != null) {
                                        i4++;
                                        declaredMethods = methodArr2;
                                        length = i2;
                                        cls4 = cls3;
                                    } else {
                                        throw new IllegalArgumentException("param must be Annotated!");
                                    }
                                }
                                cls2 = cls4;
                                methodArr = declaredMethods;
                                i = length;
                                C9214c cVar2 = new C9214c(method, a, b, dVarArr);
                                eVar3.mo16580a(a, cVar2);
                                eVar4.mo16580a(a, cVar2);
                                i3++;
                                declaredMethods = methodArr;
                                length = i;
                                cls4 = cls2;
                                z = true;
                            }
                        }
                        cls2 = cls4;
                        methodArr = declaredMethods;
                        i = length;
                        i3++;
                        declaredMethods = methodArr;
                        length = i;
                        cls4 = cls2;
                        z = true;
                    }
                    Class cls8 = cls4;
                    if (!eVar4.mo16579a().isEmpty()) {
                        C9213b.f25185a.put(cls6, eVar4);
                    }
                    cls6 = cls6.getSuperclass();
                    cls4 = cls8;
                    z = true;
                }
                cls = cls4;
                eVar = eVar3;
            } else {
                cls = cls4;
                eVar = eVar2;
            }
        }
        this.f25181b.put(cls, eVar);
        for (C9214c cVar3 : eVar.mo16579a()) {
            String str = cVar3.f25188c;
            String str2 = cVar3.f25187b;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1106578487) {
                if (hashCode != -977423767) {
                    if (hashCode == -608539730 && str.equals("protected")) {
                        c = 1;
                    }
                } else if (str.equals("public")) {
                    c = 0;
                }
            } else if (str.equals("legacy")) {
                c = 2;
            }
            switch (c) {
                case 0:
                    this.f25182c.add(str2);
                    break;
                case 1:
                    this.f25183d.add(str2);
                    break;
                case 2:
                    this.f25184e.add(str2);
                    break;
            }
            if (!this.f25180a.containsKey(str2)) {
                this.f25180a.put(str2, new ArrayList());
            }
            ((List) this.f25180a.get(str2)).add(new C9217f(obj, cVar3.f25186a));
        }
    }

    /* renamed from: a */
    public final boolean mo16569a(String str, JSONObject jSONObject, String str2, JSONObject jSONObject2) {
        String str3;
        float f;
        double d;
        boolean z;
        long j;
        int i;
        C9208a aVar = this;
        String str4 = str;
        JSONObject jSONObject3 = jSONObject;
        SystemClock.elapsedRealtime();
        if (!aVar.f25180a.containsKey(str4)) {
            return false;
        }
        boolean z2 = false;
        for (C9217f fVar : (List) aVar.f25180a.get(str4)) {
            if (fVar.mo16582a() != null) {
                Method method = fVar.f25195a;
                C9215d[] dVarArr = ((C9214c) ((C9216e) aVar.f25181b.get(fVar.f25196b)).f25194a.get(str4)).f25189d;
                Object[] objArr = new Object[dVarArr.length];
                int i2 = 0;
                while (i2 < dVarArr.length) {
                    C9215d dVar = dVarArr[i2];
                    switch (dVar.f25190a) {
                        case 0:
                            String str5 = dVar.f25192c;
                            if (TextUtils.isEmpty(dVar.f25192c)) {
                                break;
                            } else {
                                Class<?> cls = dVar.f25191b;
                                Object obj = dVar.f25193d;
                                Object obj2 = null;
                                if (cls == Integer.TYPE) {
                                    if (jSONObject3 != null) {
                                        i = jSONObject3.optInt(str5, ((Integer) obj).intValue());
                                    } else {
                                        i = ((Integer) obj).intValue();
                                    }
                                    obj2 = Integer.valueOf(i);
                                } else if (cls == Long.TYPE) {
                                    if (jSONObject3 != null) {
                                        j = jSONObject3.optLong(str5, ((Long) obj).longValue());
                                    } else {
                                        j = ((Long) obj).longValue();
                                    }
                                    obj2 = Long.valueOf(j);
                                } else if (cls == Boolean.TYPE) {
                                    if (jSONObject3 != null) {
                                        z = jSONObject3.optBoolean(str5, ((Boolean) obj).booleanValue());
                                    } else {
                                        z = ((Boolean) obj).booleanValue();
                                    }
                                    obj2 = Boolean.valueOf(z);
                                } else if (cls == Double.TYPE) {
                                    if (jSONObject3 != null) {
                                        d = jSONObject3.optDouble(str5, ((Double) obj).doubleValue());
                                    } else {
                                        d = ((Double) obj).doubleValue();
                                    }
                                    obj2 = Double.valueOf(d);
                                } else if (cls == Float.TYPE) {
                                    if (jSONObject3 != null) {
                                        f = (float) jSONObject3.optDouble(str5, (double) ((Float) obj).floatValue());
                                    } else {
                                        f = ((Float) obj).floatValue();
                                    }
                                    obj2 = Float.valueOf(f);
                                } else if (cls == String.class) {
                                    if (jSONObject3 != null) {
                                        str3 = jSONObject3.optString(str5, (String) obj);
                                    } else {
                                        str3 = (String) obj;
                                    }
                                    objArr[i2] = str3;
                                    break;
                                } else if (cls == JSONObject.class) {
                                    if (jSONObject3 != null) {
                                        obj2 = jSONObject3.optJSONObject(str5);
                                    }
                                    objArr[i2] = obj2;
                                    break;
                                } else if (cls != JSONArray.class) {
                                    break;
                                } else if (jSONObject3 != null) {
                                    obj2 = jSONObject3.optJSONArray(str5);
                                }
                                objArr[i2] = obj2;
                                break;
                            }
                        case 1:
                            objArr[i2] = str2;
                            break;
                        case 2:
                            objArr[i2] = jSONObject2;
                            break;
                    }
                    i2++;
                    String str6 = str;
                }
                try {
                    Object invoke = method.invoke(fVar.mo16582a(), objArr);
                    if (!(invoke instanceof Boolean) || !((Boolean) invoke).booleanValue()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } catch (Throwable unused) {
                }
            }
            aVar = this;
            str4 = str;
        }
        return z2;
    }
}
