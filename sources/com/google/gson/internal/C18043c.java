package com.google.gson.internal;

import com.google.gson.C17979h;
import com.google.gson.C18083m;
import com.google.gson.internal.p1079a.C17984b;
import com.google.gson.p1077b.C17956a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: com.google.gson.internal.c */
public final class C18043c {

    /* renamed from: a */
    private final Map<Type, C17979h<?>> f50081a;

    /* renamed from: b */
    private final C17984b f50082b = C17984b.m44136a();

    public final String toString() {
        return this.f50081a.toString();
    }

    public C18043c(Map<Type, C17979h<?>> map) {
        this.f50081a = map;
    }

    /* renamed from: a */
    private <T> C18069h<T> m44229a(Class<? super T> cls) {
        try {
            final Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f50082b.mo34921a(declaredConstructor);
            }
            return new C18069h<T>() {
                /* renamed from: a */
                public final T mo34956a() {
                    try {
                        return declaredConstructor.newInstance(null);
                    } catch (InstantiationException e) {
                        StringBuilder sb = new StringBuilder("Failed to invoke ");
                        sb.append(declaredConstructor);
                        sb.append(" with no args");
                        throw new RuntimeException(sb.toString(), e);
                    } catch (InvocationTargetException e2) {
                        StringBuilder sb2 = new StringBuilder("Failed to invoke ");
                        sb2.append(declaredConstructor);
                        sb2.append(" with no args");
                        throw new RuntimeException(sb2.toString(), e2.getTargetException());
                    } catch (IllegalAccessException e3) {
                        throw new AssertionError(e3);
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final <T> C18069h<T> mo34954a(C17956a<T> aVar) {
        C18069h<T> hVar;
        final Type type = aVar.f49843c;
        final Class<? super T> cls = aVar.f49842b;
        final C17979h hVar2 = (C17979h) this.f50081a.get(type);
        if (hVar2 != null) {
            return new C18069h<T>() {
                /* renamed from: a */
                public final T mo34956a() {
                    return hVar2.mo13189a(type);
                }
            };
        }
        final C17979h hVar3 = (C17979h) this.f50081a.get(cls);
        if (hVar3 != null) {
            return new C18069h<T>() {
                /* renamed from: a */
                public final T mo34956a() {
                    return hVar3.mo13189a(type);
                }
            };
        }
        C18069h<T> a = m44229a(cls);
        if (a != null) {
            return a;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                hVar = new C18069h<T>() {
                    /* renamed from: a */
                    public final T mo34956a() {
                        return new TreeSet();
                    }
                };
            } else if (EnumSet.class.isAssignableFrom(cls)) {
                hVar = new C18069h<T>() {
                    /* renamed from: a */
                    public final T mo34956a() {
                        if (type instanceof ParameterizedType) {
                            Type type = ((ParameterizedType) type).getActualTypeArguments()[0];
                            if (type instanceof Class) {
                                return EnumSet.noneOf((Class) type);
                            }
                            StringBuilder sb = new StringBuilder("Invalid EnumSet type: ");
                            sb.append(type.toString());
                            throw new C18083m(sb.toString());
                        }
                        StringBuilder sb2 = new StringBuilder("Invalid EnumSet type: ");
                        sb2.append(type.toString());
                        throw new C18083m(sb2.toString());
                    }
                };
            } else if (Set.class.isAssignableFrom(cls)) {
                hVar = new C18069h<T>() {
                    /* renamed from: a */
                    public final T mo34956a() {
                        return new LinkedHashSet();
                    }
                };
            } else if (Queue.class.isAssignableFrom(cls)) {
                hVar = new C18069h<T>() {
                    /* renamed from: a */
                    public final T mo34956a() {
                        return new ArrayDeque();
                    }
                };
            } else {
                hVar = new C18069h<T>() {
                    /* renamed from: a */
                    public final T mo34956a() {
                        return new ArrayList();
                    }
                };
            }
        } else if (!Map.class.isAssignableFrom(cls)) {
            hVar = null;
        } else if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            hVar = new C18069h<T>() {
                /* renamed from: a */
                public final T mo34956a() {
                    return new ConcurrentSkipListMap();
                }
            };
        } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
            hVar = new C18069h<T>() {
                /* renamed from: a */
                public final T mo34956a() {
                    return new ConcurrentHashMap();
                }
            };
        } else if (SortedMap.class.isAssignableFrom(cls)) {
            hVar = new C18069h<T>() {
                /* renamed from: a */
                public final T mo34956a() {
                    return new TreeMap();
                }
            };
        } else if (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C17956a.m44007a(((ParameterizedType) type).getActualTypeArguments()[0]).f49842b)) {
            hVar = new C18069h<T>() {
                /* renamed from: a */
                public final T mo34956a() {
                    return new C18061g();
                }
            };
        } else {
            hVar = new C18069h<T>() {
                /* renamed from: a */
                public final T mo34956a() {
                    return new LinkedHashMap();
                }
            };
        }
        if (hVar != null) {
            return hVar;
        }
        return new C18069h<T>() {

            /* renamed from: d */
            private final C18075l f50099d = C18075l.m44268a();

            /* renamed from: a */
            public final T mo34956a() {
                try {
                    return this.f50099d.mo35004a(cls);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Unable to invoke no-args constructor for ");
                    sb.append(type);
                    sb.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        };
    }
}
