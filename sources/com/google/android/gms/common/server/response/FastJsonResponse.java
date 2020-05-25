package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.C15462p.C15463a;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.C15512c;
import com.google.android.gms.common.util.C15522m;
import com.google.android.gms.common.util.C15523n;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class FastJsonResponse {

    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final C15492a CREATOR = new C15492a();

        /* renamed from: a */
        protected final int f39912a;

        /* renamed from: b */
        protected final boolean f39913b;

        /* renamed from: c */
        protected final int f39914c;

        /* renamed from: d */
        protected final boolean f39915d;

        /* renamed from: e */
        protected final String f39916e;

        /* renamed from: f */
        public final int f39917f;

        /* renamed from: g */
        protected final Class<? extends FastJsonResponse> f39918g;

        /* renamed from: h */
        public zak f39919h;

        /* renamed from: i */
        C15491a<I, O> f39920i;

        /* renamed from: j */
        private final int f39921j;

        /* renamed from: k */
        private final String f39922k;

        Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zaa zaa) {
            this.f39921j = i;
            this.f39912a = i2;
            this.f39913b = z;
            this.f39914c = i3;
            this.f39915d = z2;
            this.f39916e = str;
            this.f39917f = i4;
            if (str2 == null) {
                this.f39918g = null;
                this.f39922k = null;
            } else {
                this.f39918g = SafeParcelResponse.class;
                this.f39922k = str2;
            }
            if (zaa == null) {
                this.f39920i = null;
            } else if (zaa.f39910a != null) {
                this.f39920i = zaa.f39910a;
            } else {
                throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
            }
        }

        public Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class<? extends FastJsonResponse> cls, C15491a<I, O> aVar) {
            this.f39921j = 1;
            this.f39912a = i;
            this.f39913b = z;
            this.f39914c = i2;
            this.f39915d = z2;
            this.f39916e = str;
            this.f39917f = i3;
            this.f39918g = cls;
            if (cls == null) {
                this.f39922k = null;
            } else {
                this.f39922k = cls.getCanonicalName();
            }
            this.f39920i = null;
        }

        /* renamed from: b */
        private final String m32224b() {
            if (this.f39922k == null) {
                return null;
            }
            return this.f39922k;
        }

        /* renamed from: a */
        public final Map<String, Field<?, ?>> mo28487a() {
            C15464q.m32123a(this.f39922k);
            C15464q.m32123a(this.f39919h);
            return this.f39919h.mo28504a(this.f39922k);
        }

        /* renamed from: a */
        public static Field<String, String> m32221a(String str, int i) {
            Field field = new Field(7, false, 7, false, str, i, null, null);
            return field;
        }

        /* renamed from: b */
        public static Field<ArrayList<String>, ArrayList<String>> m32223b(String str, int i) {
            Field field = new Field(7, true, 7, true, str, i, null, null);
            return field;
        }

        /* renamed from: a */
        public static <T extends FastJsonResponse> Field<T, T> m32222a(String str, int i, Class<T> cls) {
            Field field = new Field(11, false, 11, false, str, i, cls, null);
            return field;
        }

        public void writeToParcel(Parcel parcel, int i) {
            Parcelable parcelable;
            int a = C15469b.m32174a(parcel);
            C15469b.m32195b(parcel, 1, this.f39921j);
            C15469b.m32195b(parcel, 2, this.f39912a);
            C15469b.m32189a(parcel, 3, this.f39913b);
            C15469b.m32195b(parcel, 4, this.f39914c);
            C15469b.m32189a(parcel, 5, this.f39915d);
            C15469b.m32187a(parcel, 6, this.f39916e, false);
            C15469b.m32195b(parcel, 7, this.f39917f);
            C15469b.m32187a(parcel, 8, m32224b(), false);
            if (this.f39920i == null) {
                parcelable = null;
            } else {
                C15491a<I, O> aVar = this.f39920i;
                if (aVar instanceof StringToIntConverter) {
                    parcelable = new zaa((StringToIntConverter) aVar);
                } else {
                    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
                }
            }
            C15469b.m32183a(parcel, 9, parcelable, i, false);
            C15469b.m32197c(parcel, a);
        }

        public String toString() {
            C15463a a = C15462p.m32119a((Object) this).mo28449a("versionCode", Integer.valueOf(this.f39921j)).mo28449a("typeIn", Integer.valueOf(this.f39912a)).mo28449a("typeInArray", Boolean.valueOf(this.f39913b)).mo28449a("typeOut", Integer.valueOf(this.f39914c)).mo28449a("typeOutArray", Boolean.valueOf(this.f39915d)).mo28449a("outputFieldName", this.f39916e).mo28449a("safeParcelFieldId", Integer.valueOf(this.f39917f)).mo28449a("concreteTypeName", m32224b());
            Class<? extends FastJsonResponse> cls = this.f39918g;
            if (cls != null) {
                a.mo28449a("concreteType.class", cls.getCanonicalName());
            }
            if (this.f39920i != null) {
                a.mo28449a("converterName", this.f39920i.getClass().getCanonicalName());
            }
            return a.toString();
        }
    }

    /* renamed from: com.google.android.gms.common.server.response.FastJsonResponse$a */
    public interface C15491a<I, O> {
        /* renamed from: a */
        I mo28474a(O o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo28484a(String str);

    /* renamed from: a */
    public abstract Map<String, Field<?, ?>> mo27875a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo28485b(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo27876a(Field field) {
        if (field.f39914c != 11) {
            return mo28485b(field.f39916e);
        }
        if (field.f39915d) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public String toString() {
        Map a = mo27875a();
        StringBuilder sb = new StringBuilder(100);
        for (String str : a.keySet()) {
            Field field = (Field) a.get(str);
            if (mo27876a(field)) {
                Object a2 = m32214a(field, mo27877b(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (a2 != null) {
                    switch (field.f39914c) {
                        case 8:
                            sb.append("\"");
                            sb.append(C15512c.m32268a((byte[]) a2));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(C15512c.m32269b((byte[]) a2));
                            sb.append("\"");
                            break;
                        case 10:
                            C15523n.m32292a(sb, (HashMap) a2);
                            break;
                        default:
                            if (!field.f39913b) {
                                m32215a(sb, field, a2);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) a2;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        m32215a(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            }
                    }
                } else {
                    sb.append(TEVideoRecorder.FACE_BEAUTY_NULL);
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo27877b(Field field) {
        String str = field.f39916e;
        if (field.f39918g == null) {
            return mo28484a(field.f39916e);
        }
        mo28484a(field.f39916e);
        C15464q.m32131a(true, "Concrete field shouldn't be value object: %s", field.f39916e);
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static void m32215a(StringBuilder sb, Field field, Object obj) {
        if (field.f39912a == 11) {
            sb.append(((FastJsonResponse) field.f39918g.cast(obj)).toString());
        } else if (field.f39912a == 7) {
            sb.append("\"");
            sb.append(C15522m.m32291a((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }

    /* renamed from: a */
    protected static <O, I> I m32214a(Field<I, O> field, Object obj) {
        return field.f39920i != null ? field.f39920i.mo28474a(obj) : obj;
    }
}
