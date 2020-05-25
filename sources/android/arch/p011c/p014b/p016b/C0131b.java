package android.arch.p011c.p014b.p016b;

import android.arch.p011c.p012a.C0118b;
import android.database.Cursor;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: android.arch.c.b.b.b */
public final class C0131b {

    /* renamed from: a */
    public final String f306a;

    /* renamed from: b */
    public final Map<String, C0132a> f307b;

    /* renamed from: c */
    public final Set<C0133b> f308c;

    /* renamed from: d */
    public final Set<C0135d> f309d;

    /* renamed from: android.arch.c.b.b.b$a */
    public static class C0132a {

        /* renamed from: a */
        public final String f310a;

        /* renamed from: b */
        public final String f311b;

        /* renamed from: c */
        public final int f312c;

        /* renamed from: d */
        public final boolean f313d;

        /* renamed from: e */
        public final int f314e;

        /* renamed from: a */
        private boolean m290a() {
            if (this.f314e > 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int hashCode = ((this.f310a.hashCode() * 31) + this.f312c) * 31;
            if (this.f313d) {
                i = 1231;
            } else {
                i = 1237;
            }
            return ((hashCode + i) * 31) + this.f314e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Column{name='");
            sb.append(this.f310a);
            sb.append('\'');
            sb.append(", type='");
            sb.append(this.f311b);
            sb.append('\'');
            sb.append(", affinity='");
            sb.append(this.f312c);
            sb.append('\'');
            sb.append(", notNull=");
            sb.append(this.f313d);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f314e);
            sb.append('}');
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0132a aVar = (C0132a) obj;
            if (VERSION.SDK_INT >= 20) {
                if (this.f314e != aVar.f314e) {
                    return false;
                }
            } else if (m290a() != aVar.m290a()) {
                return false;
            }
            if (this.f310a.equals(aVar.f310a) && this.f313d == aVar.f313d && this.f312c == aVar.f312c) {
                return true;
            }
            return false;
        }

        public C0132a(String str, String str2, boolean z, int i) {
            this.f310a = str;
            this.f311b = str2;
            this.f313d = z;
            this.f314e = i;
            int i2 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i2 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i2 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i2 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.f312c = i2;
        }
    }

    /* renamed from: android.arch.c.b.b.b$b */
    public static class C0133b {

        /* renamed from: a */
        public final String f315a;

        /* renamed from: b */
        public final String f316b;

        /* renamed from: c */
        public final String f317c;

        /* renamed from: d */
        public final List<String> f318d;

        /* renamed from: e */
        public final List<String> f319e;

        public final int hashCode() {
            return (((((((this.f315a.hashCode() * 31) + this.f316b.hashCode()) * 31) + this.f317c.hashCode()) * 31) + this.f318d.hashCode()) * 31) + this.f319e.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ForeignKey{referenceTable='");
            sb.append(this.f315a);
            sb.append('\'');
            sb.append(", onDelete='");
            sb.append(this.f316b);
            sb.append('\'');
            sb.append(", onUpdate='");
            sb.append(this.f317c);
            sb.append('\'');
            sb.append(", columnNames=");
            sb.append(this.f318d);
            sb.append(", referenceColumnNames=");
            sb.append(this.f319e);
            sb.append('}');
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0133b bVar = (C0133b) obj;
            if (this.f315a.equals(bVar.f315a) && this.f316b.equals(bVar.f316b) && this.f317c.equals(bVar.f317c) && this.f318d.equals(bVar.f318d)) {
                return this.f319e.equals(bVar.f319e);
            }
            return false;
        }

        public C0133b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f315a = str;
            this.f316b = str2;
            this.f317c = str3;
            this.f318d = Collections.unmodifiableList(list);
            this.f319e = Collections.unmodifiableList(list2);
        }
    }

    /* renamed from: android.arch.c.b.b.b$c */
    static class C0134c implements Comparable<C0134c> {

        /* renamed from: a */
        final int f320a;

        /* renamed from: b */
        final int f321b;

        /* renamed from: c */
        final String f322c;

        /* renamed from: d */
        final String f323d;

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            C0134c cVar = (C0134c) obj;
            int i = this.f320a - cVar.f320a;
            if (i == 0) {
                return this.f321b - cVar.f321b;
            }
            return i;
        }

        C0134c(int i, int i2, String str, String str2) {
            this.f320a = i;
            this.f321b = i2;
            this.f322c = str;
            this.f323d = str2;
        }
    }

    /* renamed from: android.arch.c.b.b.b$d */
    public static class C0135d {

        /* renamed from: a */
        public final String f324a;

        /* renamed from: b */
        public final boolean f325b;

        /* renamed from: c */
        public final List<String> f326c;

        public final int hashCode() {
            int i;
            if (this.f324a.startsWith("index_")) {
                i = "index_".hashCode();
            } else {
                i = this.f324a.hashCode();
            }
            return (((i * 31) + (this.f325b ? 1 : 0)) * 31) + this.f326c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Index{name='");
            sb.append(this.f324a);
            sb.append('\'');
            sb.append(", unique=");
            sb.append(this.f325b);
            sb.append(", columns=");
            sb.append(this.f326c);
            sb.append('}');
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0135d dVar = (C0135d) obj;
            if (this.f325b != dVar.f325b || !this.f326c.equals(dVar.f326c)) {
                return false;
            }
            if (this.f324a.startsWith("index_")) {
                return dVar.f324a.startsWith("index_");
            }
            return this.f324a.equals(dVar.f324a);
        }

        public C0135d(String str, boolean z, List<String> list) {
            this.f324a = str;
            this.f325b = z;
            this.f326c = list;
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (this.f306a != null) {
            i = this.f306a.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        if (this.f307b != null) {
            i2 = this.f307b.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        if (this.f308c != null) {
            i3 = this.f308c.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TableInfo{name='");
        sb.append(this.f306a);
        sb.append('\'');
        sb.append(", columns=");
        sb.append(this.f307b);
        sb.append(", foreignKeys=");
        sb.append(this.f308c);
        sb.append(", indices=");
        sb.append(this.f309d);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0131b bVar = (C0131b) obj;
        if (this.f306a == null ? bVar.f306a != null : !this.f306a.equals(bVar.f306a)) {
            return false;
        }
        if (this.f307b == null ? bVar.f307b != null : !this.f307b.equals(bVar.f307b)) {
            return false;
        }
        if (this.f308c == null ? bVar.f308c != null : !this.f308c.equals(bVar.f308c)) {
            return false;
        }
        if (this.f309d == null || bVar.f309d == null) {
            return true;
        }
        return this.f309d.equals(bVar.f309d);
    }

    /* renamed from: a */
    private static List<C0134c> m286a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C0134c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public static C0131b m285a(C0118b bVar, String str) {
        return new C0131b(str, m288c(bVar, str), m287b(bVar, str), m289d(bVar, str));
    }

    /* renamed from: c */
    private static Map<String, C0132a> m288c(C0118b bVar, String str) {
        boolean z;
        StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(str);
        sb.append("`)");
        Cursor b = bVar.mo177b(sb.toString());
        HashMap hashMap = new HashMap();
        try {
            if (b.getColumnCount() > 0) {
                int columnIndex = b.getColumnIndex(LeakCanaryFileProvider.f132049i);
                int columnIndex2 = b.getColumnIndex("type");
                int columnIndex3 = b.getColumnIndex("notnull");
                int columnIndex4 = b.getColumnIndex("pk");
                while (b.moveToNext()) {
                    String string = b.getString(columnIndex);
                    String string2 = b.getString(columnIndex2);
                    if (b.getInt(columnIndex3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hashMap.put(string, new C0132a(string, string2, z, b.getInt(columnIndex4)));
                }
            }
            return hashMap;
        } finally {
            b.close();
        }
    }

    /* renamed from: d */
    private static Set<C0135d> m289d(C0118b bVar, String str) {
        StringBuilder sb = new StringBuilder("PRAGMA index_list(`");
        sb.append(str);
        sb.append("`)");
        Cursor b = bVar.mo177b(sb.toString());
        try {
            int columnIndex = b.getColumnIndex(LeakCanaryFileProvider.f132049i);
            int columnIndex2 = b.getColumnIndex("origin");
            int columnIndex3 = b.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (b.moveToNext()) {
                        if ("c".equals(b.getString(columnIndex2))) {
                            String string = b.getString(columnIndex);
                            boolean z = true;
                            if (b.getInt(columnIndex3) != 1) {
                                z = false;
                            }
                            C0135d a = m284a(bVar, string, z);
                            if (a == null) {
                                b.close();
                                return null;
                            }
                            hashSet.add(a);
                        }
                    }
                    b.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            b.close();
        }
    }

    /* renamed from: b */
    private static Set<C0133b> m287b(C0118b bVar, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder("PRAGMA foreign_key_list(`");
        sb.append(str);
        sb.append("`)");
        Cursor b = bVar.mo177b(sb.toString());
        try {
            int columnIndex = b.getColumnIndex("id");
            int columnIndex2 = b.getColumnIndex("seq");
            int columnIndex3 = b.getColumnIndex("table");
            int columnIndex4 = b.getColumnIndex("on_delete");
            int columnIndex5 = b.getColumnIndex("on_update");
            List<C0134c> a = m286a(b);
            int count = b.getCount();
            for (int i = 0; i < count; i++) {
                b.moveToPosition(i);
                if (b.getInt(columnIndex2) == 0) {
                    int i2 = b.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C0134c cVar : a) {
                        if (cVar.f320a == i2) {
                            arrayList.add(cVar.f322c);
                            arrayList2.add(cVar.f323d);
                        }
                    }
                    C0133b bVar2 = new C0133b(b.getString(columnIndex3), b.getString(columnIndex4), b.getString(columnIndex5), arrayList, arrayList2);
                    hashSet.add(bVar2);
                }
            }
            return hashSet;
        } finally {
            b.close();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static C0135d m284a(C0118b bVar, String str, boolean z) {
        StringBuilder sb = new StringBuilder("PRAGMA index_xinfo(`");
        sb.append(str);
        sb.append("`)");
        Cursor b = bVar.mo177b(sb.toString());
        try {
            int columnIndex = b.getColumnIndex("seqno");
            int columnIndex2 = b.getColumnIndex("cid");
            int columnIndex3 = b.getColumnIndex(LeakCanaryFileProvider.f132049i);
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (b.moveToNext()) {
                        if (b.getInt(columnIndex2) >= 0) {
                            int i = b.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), b.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    C0135d dVar = new C0135d(str, z, arrayList);
                    b.close();
                    return dVar;
                }
            }
            b.close();
            return null;
        } catch (Throwable th) {
            b.close();
            throw th;
        }
    }

    public C0131b(String str, Map<String, C0132a> map, Set<C0133b> set, Set<C0135d> set2) {
        Set<C0135d> set3;
        this.f306a = str;
        this.f307b = Collections.unmodifiableMap(map);
        this.f308c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            set3 = null;
        } else {
            set3 = Collections.unmodifiableSet(set2);
        }
        this.f309d = set3;
    }
}
