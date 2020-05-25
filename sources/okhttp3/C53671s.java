package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.internal.C53559c;

/* renamed from: okhttp3.s */
public final class C53671s {

    /* renamed from: a */
    private final String[] f133137a;

    /* renamed from: okhttp3.s$a */
    public static final class C53672a {

        /* renamed from: a */
        final List<String> f133138a = new ArrayList(20);

        /* renamed from: a */
        public final C53671s mo111605a() {
            return new C53671s(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C53672a mo111603a(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                return mo111607b(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            if (str.startsWith(":")) {
                return mo111607b("", str.substring(1));
            }
            return mo111607b("", str);
        }

        /* renamed from: b */
        public final C53672a mo111606b(String str) {
            int i = 0;
            while (i < this.f133138a.size()) {
                if (str.equalsIgnoreCase((String) this.f133138a.get(i))) {
                    this.f133138a.remove(i);
                    this.f133138a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: c */
        public final String mo111608c(String str) {
            for (int size = this.f133138a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase((String) this.f133138a.get(size))) {
                    return (String) this.f133138a.get(size + 1);
                }
            }
            return null;
        }

        /* renamed from: a */
        public final C53672a mo111604a(String str, String str2) {
            m114160d(str, str2);
            return mo111607b(str, str2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C53672a mo111607b(String str, String str2) {
            this.f133138a.add(str);
            this.f133138a.add(str2.trim());
            return this;
        }

        /* renamed from: c */
        public final C53672a mo111609c(String str, String str2) {
            m114160d(str, str2);
            mo111606b(str);
            mo111607b(str, str2);
            return this;
        }

        /* renamed from: d */
        private static void m114160d(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (!str.isEmpty()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= ' ' || charAt >= 127) {
                        throw new IllegalArgumentException(C53559c.m113798a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    int i2 = 0;
                    while (i2 < length2) {
                        char charAt2 = str2.charAt(i2);
                        if ((charAt2 > 31 || charAt2 == 9) && charAt2 < 127) {
                            i2++;
                        } else {
                            throw new IllegalArgumentException(C53559c.m113798a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt2), Integer.valueOf(i2), str, str2));
                        }
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder("value for name ");
                sb.append(str);
                sb.append(" == null");
                throw new NullPointerException(sb.toString());
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }
    }

    /* renamed from: a */
    public final int mo111591a() {
        return this.f133137a.length / 2;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f133137a);
    }

    /* renamed from: d */
    public final C53672a mo111598d() {
        C53672a aVar = new C53672a();
        Collections.addAll(aVar.f133138a, this.f133137a);
        return aVar;
    }

    /* renamed from: b */
    public final Set<String> mo111596b() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int a = mo111591a();
        for (int i = 0; i < a; i++) {
            treeSet.add(mo111592a(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    /* renamed from: c */
    public final long mo111597c() {
        long length = (long) (this.f133137a.length * 2);
        for (String length2 : this.f133137a) {
            length += (long) length2.length();
        }
        return length;
    }

    /* renamed from: e */
    public final Map<String, List<String>> mo111599e() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int a = mo111591a();
        for (int i = 0; i < a; i++) {
            String lowerCase = mo111592a(i).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(mo111594b(i));
        }
        return treeMap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int a = mo111591a();
        for (int i = 0; i < a; i++) {
            sb.append(mo111592a(i));
            sb.append(": ");
            sb.append(mo111594b(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    private C53671s(String[] strArr) {
        this.f133137a = strArr;
    }

    /* renamed from: a */
    public final String mo111592a(int i) {
        return this.f133137a[i * 2];
    }

    /* renamed from: b */
    public final String mo111594b(int i) {
        return this.f133137a[(i * 2) + 1];
    }

    C53671s(C53672a aVar) {
        this.f133137a = (String[]) aVar.f133138a.toArray(new String[aVar.f133138a.size()]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C53671s) || !Arrays.equals(((C53671s) obj).f133137a, this.f133137a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final String mo111593a(String str) {
        return m114148a(this.f133137a, str);
    }

    /* renamed from: b */
    public final List<String> mo111595b(String str) {
        int a = mo111591a();
        ArrayList arrayList = null;
        for (int i = 0; i < a; i++) {
            if (str.equalsIgnoreCase(mo111592a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mo111594b(i));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public static C53671s m114150a(String... strArr) {
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int i = 0;
            while (i < strArr2.length) {
                if (strArr2[i] != null) {
                    strArr2[i] = strArr2[i].trim();
                    i++;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            int i2 = 0;
            while (i2 < strArr2.length) {
                String str = strArr2[i2];
                String str2 = strArr2[i2 + 1];
                if (str.length() != 0 && str.indexOf(0) == -1 && str2.indexOf(0) == -1) {
                    i2 += 2;
                } else {
                    StringBuilder sb = new StringBuilder("Unexpected header: ");
                    sb.append(str);
                    sb.append(": ");
                    sb.append(str2);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            return new C53671s(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }

    /* renamed from: a */
    public static C53671s m114149a(Map<String, String> map) {
        if (map != null) {
            String[] strArr = new String[(map.size() * 2)];
            int i = 0;
            for (Entry entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                String trim = ((String) entry.getKey()).trim();
                String trim2 = ((String) entry.getValue()).trim();
                if (trim.length() != 0 && trim.indexOf(0) == -1 && trim2.indexOf(0) == -1) {
                    strArr[i] = trim;
                    strArr[i + 1] = trim2;
                    i += 2;
                } else {
                    StringBuilder sb = new StringBuilder("Unexpected header: ");
                    sb.append(trim);
                    sb.append(": ");
                    sb.append(trim2);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            return new C53671s(strArr);
        }
        throw new NullPointerException("headers == null");
    }

    /* renamed from: a */
    private static String m114148a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }
}
