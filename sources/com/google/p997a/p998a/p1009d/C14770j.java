package com.google.p997a.p998a.p1009d;

import com.google.p997a.p998a.p1020g.C14792b;
import com.google.p997a.p998a.p1020g.C14792b.C14793a;
import com.google.p997a.p998a.p1020g.C14794c;
import com.google.p997a.p998a.p1020g.C14795d;
import com.google.p997a.p998a.p1020g.C14799f;
import com.google.p997a.p998a.p1020g.C14805i;
import com.google.p997a.p998a.p1020g.C14806j;
import com.google.p997a.p998a.p1020g.C14812m;
import com.google.p997a.p998a.p1020g.C14814o;
import com.google.p997a.p998a.p1020g.C14816q;
import com.google.p997a.p998a.p1020g.p1021a.C14786a;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.google.a.a.d.j */
public final class C14770j implements C14812m {

    /* renamed from: a */
    public static final String f38282a;

    static {
        String str;
        C14766f fVar = new C14766f("application/x-www-form-urlencoded");
        Charset charset = C14794c.f38313a;
        String str2 = "charset";
        if (charset == null) {
            str = null;
        } else {
            str = charset.name();
        }
        fVar.mo27058a(str2, str);
        f38282a = fVar.mo27059a();
    }

    /* renamed from: a */
    public static void m30184a(Reader reader, Object obj) throws IOException {
        C14806j jVar;
        Map map;
        int read;
        boolean z;
        boolean z2;
        Type type;
        Type type2;
        Class cls;
        Collection collection;
        boolean z3;
        Object obj2 = obj;
        Class cls2 = obj.getClass();
        C14795d a = C14795d.m30256a(cls2);
        List asList = Arrays.asList(new Type[]{cls2});
        if (C14806j.class.isAssignableFrom(cls2)) {
            jVar = (C14806j) obj2;
        } else {
            jVar = null;
        }
        if (Map.class.isAssignableFrom(cls2)) {
            map = (Map) obj2;
        } else {
            map = null;
        }
        C14792b bVar = new C14792b(obj2);
        StringWriter stringWriter = new StringWriter();
        StringWriter stringWriter2 = new StringWriter();
        StringWriter stringWriter3 = stringWriter;
        while (true) {
            boolean z4 = true;
            while (true) {
                read = reader.read();
                if (read == -1 || read == 38) {
                    String a2 = C14786a.m30242a(stringWriter3.toString());
                } else if (read == 61) {
                    z4 = false;
                } else if (z4) {
                    stringWriter3.write(read);
                } else {
                    stringWriter2.write(read);
                }
            }
            String a22 = C14786a.m30242a(stringWriter3.toString());
            if (a22.length() != 0) {
                String a3 = C14786a.m30242a(stringWriter2.toString());
                C14805i a4 = a.mo27115a(a22);
                if (a4 != null) {
                    Type a5 = C14799f.m30264a(asList, a4.f38356b.getGenericType());
                    if ((a5 instanceof GenericArrayType) || ((a5 instanceof Class) && ((Class) a5).isArray())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        Class<?> a6 = C14816q.m30294a(asList, C14816q.m30300a(a5));
                        Field field = a4.f38356b;
                        Object a7 = m30183a(a6, asList, a3);
                        C14793a aVar = (C14793a) bVar.f38308a.get(field);
                        if (aVar == null) {
                            aVar = new C14793a(a6);
                            bVar.f38308a.put(field, aVar);
                        }
                        if (a6 == aVar.f38311a) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        C14814o.m30289a(z3);
                        aVar.f38312b.add(a7);
                    } else {
                        Class a8 = C14816q.m30294a(asList, a5);
                        Class<Iterable> cls3 = Iterable.class;
                        if (a8.isAssignableFrom(cls3) || cls3.isAssignableFrom(a8)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            Collection collection2 = (Collection) a4.mo27144a(obj2);
                            if (collection2 == null) {
                                if (a5 instanceof WildcardType) {
                                    type2 = C14816q.m30301a((WildcardType) a5);
                                } else {
                                    type2 = a5;
                                }
                                if (type2 instanceof ParameterizedType) {
                                    type2 = ((ParameterizedType) type2).getRawType();
                                }
                                if (type2 instanceof Class) {
                                    cls = (Class) type2;
                                } else {
                                    cls = null;
                                }
                                if (type2 == null || (type2 instanceof GenericArrayType) || (cls != null && (cls.isArray() || cls.isAssignableFrom(ArrayList.class)))) {
                                    collection = new ArrayList();
                                } else if (cls == null) {
                                    String valueOf = String.valueOf(String.valueOf(type2));
                                    StringBuilder sb = new StringBuilder(valueOf.length() + 39);
                                    sb.append("unable to create new instance of type: ");
                                    sb.append(valueOf);
                                    throw new IllegalArgumentException(sb.toString());
                                } else if (cls.isAssignableFrom(HashSet.class)) {
                                    collection = new HashSet();
                                } else if (cls.isAssignableFrom(TreeSet.class)) {
                                    collection = new TreeSet();
                                } else {
                                    collection = (Collection) C14816q.m30297a(cls);
                                }
                                collection2 = collection;
                                a4.mo27145a(obj2, (Object) collection2);
                            }
                            if (a5 != Object.class) {
                                ParameterizedType a9 = C14816q.m30299a(a5, Iterable.class);
                                if (a9 != null) {
                                    type = a9.getActualTypeArguments()[0];
                                    if (type instanceof TypeVariable) {
                                        Type a10 = C14816q.m30302a(Arrays.asList(new Type[]{a5}), (TypeVariable) type);
                                        if (a10 != null) {
                                            type = a10;
                                        }
                                    }
                                    collection2.add(m30183a(type, asList, a3));
                                }
                            }
                            type = null;
                            collection2.add(m30183a(type, asList, a3));
                        } else {
                            a4.mo27145a(obj2, m30183a(a5, asList, a3));
                        }
                    }
                } else if (map != null) {
                    ArrayList arrayList = (ArrayList) map.get(a22);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        if (jVar != null) {
                            jVar.mo27048b(a22, arrayList);
                        } else {
                            map.put(a22, arrayList);
                        }
                    }
                    arrayList.add(a3);
                }
            }
            StringWriter stringWriter4 = new StringWriter();
            StringWriter stringWriter5 = new StringWriter();
            if (read == -1) {
                bVar.mo27113a();
                return;
            } else {
                stringWriter3 = stringWriter4;
                stringWriter2 = stringWriter5;
            }
        }
    }

    /* renamed from: a */
    private static Object m30183a(Type type, List<Type> list, String str) {
        return C14799f.m30263a(C14799f.m30264a(list, type), str);
    }
}
