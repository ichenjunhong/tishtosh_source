package android.support.p043v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.widget.c */
class C1469c extends DataSetObservable {

    /* renamed from: a */
    static final String f5292a = "c";

    /* renamed from: g */
    private static final Object f5293g = new Object();

    /* renamed from: h */
    private static final Map<String, C1469c> f5294h = new HashMap();

    /* renamed from: b */
    final Object f5295b;

    /* renamed from: c */
    final List<C1470a> f5296c;

    /* renamed from: d */
    final Context f5297d;

    /* renamed from: e */
    final String f5298e;

    /* renamed from: f */
    boolean f5299f;

    /* renamed from: i */
    private final List<C1472c> f5300i;

    /* renamed from: j */
    private Intent f5301j;

    /* renamed from: k */
    private C1471b f5302k;

    /* renamed from: l */
    private int f5303l;

    /* renamed from: m */
    private boolean f5304m;

    /* renamed from: n */
    private boolean f5305n;

    /* renamed from: o */
    private boolean f5306o;

    /* renamed from: p */
    private C1473d f5307p;

    /* renamed from: android.support.v7.widget.c$a */
    public static final class C1470a implements Comparable<C1470a> {

        /* renamed from: a */
        public final ResolveInfo f5308a;

        /* renamed from: b */
        public float f5309b;

        public final int hashCode() {
            return Float.floatToIntBits(this.f5309b) + 31;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("resolveInfo:");
            sb.append(this.f5308a.toString());
            sb.append("; weight:");
            sb.append(new BigDecimal((double) this.f5309b));
            sb.append("]");
            return sb.toString();
        }

        public C1470a(ResolveInfo resolveInfo) {
            this.f5308a = resolveInfo;
        }

        public final /* synthetic */ int compareTo(Object obj) {
            return Float.floatToIntBits(((C1470a) obj).f5309b) - Float.floatToIntBits(this.f5309b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            if (Float.floatToIntBits(this.f5309b) != Float.floatToIntBits(((C1470a) obj).f5309b)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: android.support.v7.widget.c$b */
    public interface C1471b {
    }

    /* renamed from: android.support.v7.widget.c$c */
    public static final class C1472c {

        /* renamed from: a */
        public final ComponentName f5310a;

        /* renamed from: b */
        public final long f5311b;

        /* renamed from: c */
        public final float f5312c;

        public final int hashCode() {
            int i;
            if (this.f5310a == null) {
                i = 0;
            } else {
                i = this.f5310a.hashCode();
            }
            return ((((i + 31) * 31) + ((int) (this.f5311b ^ (this.f5311b >>> 32)))) * 31) + Float.floatToIntBits(this.f5312c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("; activity:");
            sb.append(this.f5310a);
            sb.append("; time:");
            sb.append(this.f5311b);
            sb.append("; weight:");
            sb.append(new BigDecimal((double) this.f5312c));
            sb.append("]");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1472c cVar = (C1472c) obj;
            if (this.f5310a == null) {
                if (cVar.f5310a != null) {
                    return false;
                }
            } else if (!this.f5310a.equals(cVar.f5310a)) {
                return false;
            }
            if (this.f5311b == cVar.f5311b && Float.floatToIntBits(this.f5312c) == Float.floatToIntBits(cVar.f5312c)) {
                return true;
            }
            return false;
        }

        public C1472c(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public C1472c(ComponentName componentName, long j, float f) {
            this.f5310a = componentName;
            this.f5311b = j;
            this.f5312c = f;
        }
    }

    /* renamed from: android.support.v7.widget.c$d */
    public interface C1473d {
        /* renamed from: a */
        boolean mo5743a(C1469c cVar, Intent intent);
    }

    /* renamed from: android.support.v7.widget.c$e */
    final class C1474e extends AsyncTask<Object, Void, Void> {
        C1474e() {
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x006f, code lost:
            if (r12 != null) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r12.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0085, code lost:
            if (r12 == null) goto L_0x0098;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
            if (r12 == null) goto L_0x0098;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0095, code lost:
            if (r12 == null) goto L_0x0098;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Object... r12) {
            /*
                r11 = this;
                r0 = 0
                r1 = r12[r0]
                java.util.List r1 = (java.util.List) r1
                r2 = 1
                r12 = r12[r2]
                java.lang.String r12 = (java.lang.String) r12
                r3 = 0
                android.support.v7.widget.c r4 = android.support.p043v7.widget.C1469c.this     // Catch:{ FileNotFoundException -> 0x0099 }
                android.content.Context r4 = r4.f5297d     // Catch:{ FileNotFoundException -> 0x0099 }
                java.io.FileOutputStream r12 = r4.openFileOutput(r12, r0)     // Catch:{ FileNotFoundException -> 0x0099 }
                org.xmlpull.v1.XmlSerializer r4 = android.util.Xml.newSerializer()
                r4.setOutput(r12, r3)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                java.lang.String r5 = "UTF-8"
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                r4.startDocument(r5, r6)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                java.lang.String r5 = "historical-records"
                r4.startTag(r3, r5)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                int r5 = r1.size()     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                r6 = 0
            L_0x002d:
                if (r6 >= r5) goto L_0x0063
                java.lang.Object r7 = r1.remove(r0)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                android.support.v7.widget.c$c r7 = (android.support.p043v7.widget.C1469c.C1472c) r7     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                java.lang.String r8 = "historical-record"
                r4.startTag(r3, r8)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                java.lang.String r8 = "activity"
                android.content.ComponentName r9 = r7.f5310a     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                java.lang.String r9 = r9.flattenToString()     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                r4.attribute(r3, r8, r9)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                java.lang.String r8 = "time"
                long r9 = r7.f5311b     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                r4.attribute(r3, r8, r9)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                java.lang.String r8 = "weight"
                float r7 = r7.f5312c     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                r4.attribute(r3, r8, r7)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                java.lang.String r7 = "historical-record"
                r4.endTag(r3, r7)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                int r6 = r6 + 1
                goto L_0x002d
            L_0x0063:
                java.lang.String r0 = "historical-records"
                r4.endTag(r3, r0)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                r4.endDocument()     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                android.support.v7.widget.c r0 = android.support.p043v7.widget.C1469c.this
                r0.f5299f = r2
                if (r12 == 0) goto L_0x0098
            L_0x0071:
                r12.close()     // Catch:{ IOException -> 0x0098 }
                goto L_0x0098
            L_0x0075:
                r0 = move-exception
                android.support.v7.widget.c r1 = android.support.p043v7.widget.C1469c.this
                r1.f5299f = r2
                if (r12 == 0) goto L_0x007f
                r12.close()     // Catch:{ IOException -> 0x007f }
            L_0x007f:
                throw r0
            L_0x0080:
                android.support.v7.widget.c r0 = android.support.p043v7.widget.C1469c.this
                r0.f5299f = r2
                if (r12 == 0) goto L_0x0098
                goto L_0x0071
            L_0x0088:
                android.support.v7.widget.c r0 = android.support.p043v7.widget.C1469c.this
                r0.f5299f = r2
                if (r12 == 0) goto L_0x0098
                goto L_0x0071
            L_0x0090:
                android.support.v7.widget.c r0 = android.support.p043v7.widget.C1469c.this
                r0.f5299f = r2
                if (r12 == 0) goto L_0x0098
                goto L_0x0071
            L_0x0098:
                return r3
            L_0x0099:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.C1469c.C1474e.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    /* renamed from: g */
    private boolean m5144g() {
        if (!this.f5299f || !this.f5305n || TextUtils.isEmpty(this.f5298e)) {
            return false;
        }
        this.f5299f = false;
        this.f5304m = true;
        m5146i();
        return true;
    }

    /* renamed from: h */
    private void m5145h() {
        int size = this.f5300i.size() - this.f5303l;
        if (size > 0) {
            this.f5305n = true;
            for (int i = 0; i < size; i++) {
                this.f5300i.remove(0);
            }
        }
    }

    /* renamed from: a */
    public final int mo5729a() {
        int size;
        synchronized (this.f5295b) {
            mo5735c();
            size = this.f5296c.size();
        }
        return size;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5735c() {
        boolean f = m5143f() | m5144g();
        m5145h();
        if (f) {
            m5142e();
            notifyChanged();
        }
    }

    /* renamed from: d */
    private void m5141d() {
        if (!this.f5304m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f5305n) {
            this.f5305n = false;
            if (!TextUtils.isEmpty(this.f5298e)) {
                new C1474e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.f5300i), this.f5298e});
            }
        }
    }

    /* renamed from: e */
    private boolean m5142e() {
        if (this.f5302k == null || this.f5301j == null || this.f5296c.isEmpty() || this.f5300i.isEmpty()) {
            return false;
        }
        Collections.unmodifiableList(this.f5300i);
        return true;
    }

    /* renamed from: f */
    private boolean m5143f() {
        if (!this.f5306o || this.f5301j == null) {
            return false;
        }
        this.f5306o = false;
        this.f5296c.clear();
        List queryIntentActivities = this.f5297d.getPackageManager().queryIntentActivities(this.f5301j, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f5296c.add(new C1470a((ResolveInfo) queryIntentActivities.get(i)));
        }
        return true;
    }

    /* renamed from: b */
    public final ResolveInfo mo5734b() {
        synchronized (this.f5295b) {
            mo5735c();
            if (this.f5296c.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = ((C1470a) this.f5296c.get(0)).f5308a;
            return resolveInfo;
        }
    }

    /* renamed from: i */
    private void m5146i() {
        try {
            boolean openFileInput = this.f5297d.openFileInput(this.f5298e);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                int i = 0;
                while (i != 1 && i != 2) {
                    i = newPullParser.next();
                }
                openFileInput = "historical-records".equals(newPullParser.getName());
                if (openFileInput) {
                    List<C1472c> list = this.f5300i;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next != 1) {
                            if (!(next == 3 || next == 4)) {
                                if ("historical-record".equals(newPullParser.getName())) {
                                    list.add(new C1472c(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                                } else {
                                    throw new XmlPullParserException("Share records file not well-formed.");
                                }
                            }
                        } else if (openFileInput != null) {
                            try {
                                openFileInput.close();
                            } catch (IOException unused) {
                            }
                            return;
                        }
                    }
                    return;
                }
                throw new XmlPullParserException("Share records file does not start with historical-records tag.");
            } catch (XmlPullParserException unused2) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (IOException unused4) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused5) {
                    }
                }
            } finally {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused6) {
                    }
                }
            }
        } catch (FileNotFoundException unused7) {
        }
    }

    /* renamed from: a */
    public final int mo5730a(ResolveInfo resolveInfo) {
        synchronized (this.f5295b) {
            mo5735c();
            List<C1470a> list = this.f5296c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((C1470a) list.get(i)).f5308a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public final ResolveInfo mo5731a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f5295b) {
            mo5735c();
            resolveInfo = ((C1470a) this.f5296c.get(i)).f5308a;
        }
        return resolveInfo;
    }

    /* renamed from: b */
    public final Intent mo5733b(int i) {
        synchronized (this.f5295b) {
            if (this.f5301j == null) {
                return null;
            }
            mo5735c();
            C1470a aVar = (C1470a) this.f5296c.get(i);
            ComponentName componentName = new ComponentName(aVar.f5308a.activityInfo.packageName, aVar.f5308a.activityInfo.name);
            Intent intent = new Intent(this.f5301j);
            intent.setComponent(componentName);
            if (this.f5307p != null) {
                if (this.f5307p.mo5743a(this, new Intent(intent))) {
                    return null;
                }
            }
            mo5732a(new C1472c(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5732a(C1472c cVar) {
        boolean add = this.f5300i.add(cVar);
        if (add) {
            this.f5305n = true;
            m5145h();
            m5141d();
            m5142e();
            notifyChanged();
        }
        return add;
    }
}
