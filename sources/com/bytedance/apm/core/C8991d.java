package com.bytedance.apm.core;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import com.bytedance.apm.p501q.C9190h;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.bytedance.apm.core.d */
public final class C8991d implements SharedPreferences {

    /* renamed from: d */
    private static int f24470d = -1;

    /* renamed from: a */
    public Application f24471a;

    /* renamed from: b */
    public String f24472b;

    /* renamed from: c */
    public Uri f24473c = Uri.parse(this.f24472b);

    /* renamed from: com.bytedance.apm.core.d$a */
    class C8993a implements Editor {

        /* renamed from: b */
        private boolean f24475b;

        /* renamed from: c */
        private HashMap<String, Object> f24476c;

        public final boolean commit() {
            apply();
            return true;
        }

        public final Editor clear() {
            this.f24476c.clear();
            this.f24475b = true;
            return this;
        }

        public final void apply() {
            if (this.f24475b || !this.f24476c.isEmpty()) {
                Bundle bundle = new Bundle();
                if (this.f24475b) {
                    bundle.putBoolean("clear", true);
                }
                ArrayList arrayList = new ArrayList(this.f24476c.size());
                for (Entry entry : this.f24476c.entrySet()) {
                    arrayList.add(new SpPair((String) entry.getKey(), entry.getValue()));
                }
                bundle.putParcelableArrayList("edit", arrayList);
                try {
                    C8991d.this.f24471a.getContentResolver().call(C8991d.this.f24473c, C8991d.this.f24472b, "edit", bundle);
                } catch (Exception unused) {
                }
            }
        }

        public final Editor remove(String str) {
            this.f24476c.put(str, null);
            return this;
        }

        private C8993a() {
            this.f24476c = new HashMap<>();
        }

        public final Editor putString(String str, String str2) {
            this.f24476c.put(str, str2);
            return this;
        }

        public final Editor putBoolean(String str, boolean z) {
            this.f24476c.put(str, Boolean.valueOf(z));
            return this;
        }

        public final Editor putFloat(String str, float f) {
            this.f24476c.put(str, Float.valueOf(f));
            return this;
        }

        public final Editor putInt(String str, int i) {
            this.f24476c.put(str, Integer.valueOf(i));
            return this;
        }

        public final Editor putLong(String str, long j) {
            this.f24476c.put(str, Long.valueOf(j));
            return this;
        }

        public final Editor putStringSet(String str, Set<String> set) {
            this.f24476c.put(str, C9190h.m18254a(set));
            return this;
        }
    }

    public final void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public final void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public final Editor edit() {
        return new C8993a();
    }

    public final Map<String, ?> getAll() {
        ArrayList a = m17798a((String) null, (Object) null);
        if (a == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            SpPair spPair = (SpPair) it.next();
            hashMap.put(spPair.f24468a, spPair.f24469b);
        }
        return hashMap;
    }

    /* renamed from: a */
    private static int m17796a(Context context) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            StringBuilder sb = new StringBuilder("content://");
            sb.append(context.getPackageName());
            sb.append(".apm");
            Bundle call = contentResolver.call(Uri.parse(sb.toString()), "getPid", null, null);
            if (call != null) {
                return call.getInt("Pid", -1);
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    public final boolean contains(String str) {
        Bundle bundle;
        String str2;
        try {
            ContentResolver contentResolver = this.f24471a.getContentResolver();
            Uri uri = this.f24473c;
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f24472b);
                sb.append("/");
                sb.append(str);
                str2 = sb.toString();
            } else {
                str2 = this.f24472b;
            }
            bundle = contentResolver.call(uri, str2, "contains", null);
        } catch (Exception unused) {
            bundle = null;
        }
        if (bundle == null || !bundle.getBoolean("contains")) {
            return false;
        }
        return true;
    }

    public final String getString(String str, String str2) {
        ArrayList a = m17798a(str, (Object) str2);
        if (a == null) {
            return null;
        }
        return (String) ((SpPair) a.get(0)).f24469b;
    }

    private C8991d(Application application, String str) {
        this.f24471a = application;
        StringBuilder sb = new StringBuilder("content://");
        sb.append(application.getPackageName());
        sb.append(".apm/sp/");
        sb.append(str);
        this.f24472b = sb.toString();
    }

    public final boolean getBoolean(String str, boolean z) {
        ArrayList a = m17798a(str, (Object) String.valueOf(z));
        if (a == null) {
            return z;
        }
        Object obj = ((SpPair) a.get(0)).f24469b;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return Boolean.valueOf((String) obj).booleanValue();
        }
        return z;
    }

    public final float getFloat(String str, float f) {
        ArrayList a = m17798a(str, (Object) String.valueOf(f));
        if (a == null) {
            return f;
        }
        Object obj = ((SpPair) a.get(0)).f24469b;
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof String) {
            return Float.valueOf((String) obj).floatValue();
        }
        return f;
    }

    public final int getInt(String str, int i) {
        ArrayList a = m17798a(str, (Object) String.valueOf(i));
        if (a == null) {
            return i;
        }
        Object obj = ((SpPair) a.get(0)).f24469b;
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            return Integer.decode((String) obj).intValue();
        }
        return i;
    }

    public final long getLong(String str, long j) {
        ArrayList a = m17798a(str, (Object) String.valueOf(j));
        if (a == null) {
            return j;
        }
        Object obj = ((SpPair) a.get(0)).f24469b;
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            return Long.decode((String) obj).longValue();
        }
        return j;
    }

    public final Set<String> getStringSet(String str, Set<String> set) {
        ArrayList a = m17798a(str, (Object) set);
        if (a == null || ((SpPair) a.get(0)).f24469b == null) {
            return null;
        }
        String[] strArr = (String[]) ((SpPair) a.get(0)).f24469b;
        HashSet hashSet = new HashSet(strArr.length);
        hashSet.addAll(Arrays.asList(strArr));
        return hashSet;
    }

    /* renamed from: a */
    public static SharedPreferences m17797a(Context context, String str) {
        boolean z;
        Application application;
        if (f24470d == -1) {
            f24470d = m17796a(context);
        }
        if (f24470d == Process.myPid()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C35807d.m80935a(context, str, 0);
        }
        if (context instanceof Application) {
            application = (Application) context;
        } else {
            application = (Application) context.getApplicationContext();
        }
        return new C8991d(application, str);
    }

    /* renamed from: a */
    private ArrayList<SpPair> m17798a(String str, Object obj) {
        Bundle bundle;
        String str2;
        Bundle bundle2 = new Bundle();
        if (obj != null) {
            bundle2.putParcelable("sp", new SpPair(str, obj));
        }
        try {
            ContentResolver contentResolver = this.f24471a.getContentResolver();
            Uri uri = this.f24473c;
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f24472b);
                sb.append("/");
                sb.append(str);
                str2 = sb.toString();
            } else {
                str2 = this.f24472b;
            }
            String str3 = "query";
            if (obj == null) {
                bundle2 = null;
            }
            bundle = contentResolver.call(uri, str2, str3, bundle2);
        } catch (Exception unused) {
            bundle = null;
        }
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(getClass().getClassLoader());
        return bundle.getParcelableArrayList("sp");
    }
}
