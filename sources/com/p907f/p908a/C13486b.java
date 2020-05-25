package com.p907f.p908a;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.ServiceManager;
import android.util.Pair;
import android.util.Size;
import android.util.Slog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.f.a.b */
public class C13486b {

    /* renamed from: a */
    public static C13483a f35163a;

    /* renamed from: d */
    private static C13486b f35164d;

    /* renamed from: b */
    public IBinder f35165b;

    /* renamed from: c */
    public DeathRecipient f35166c = new DeathRecipient() {
        public final void binderDied() {
            Slog.w("OMediaManager", "omedia server die.");
            if (C13486b.this.f35165b != null) {
                C13486b.this.f35165b.unlinkToDeath(C13486b.this.f35166c, 0);
                C13486b.this.f35165b = null;
            }
            C13486b.f35163a = null;
        }
    };

    private C13486b() {
        m27248c();
    }

    /* renamed from: a */
    public static C13486b m27243a() {
        if (f35163a == null) {
            synchronized (C13486b.class) {
                if (f35163a == null) {
                    f35164d = new C13486b();
                }
            }
        }
        return f35164d;
    }

    /* renamed from: b */
    public final String mo25275b() {
        if (f35163a == null && !m27248c()) {
            return null;
        }
        try {
            return f35163a.mo25268a();
        } catch (RemoteException unused) {
            f35163a = null;
            return null;
        }
    }

    /* renamed from: c */
    private boolean m27248c() {
        C13483a aVar;
        this.f35165b = ServiceManager.checkService("omedia");
        IBinder iBinder = this.f35165b;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.oppo.omedia.IOMediaService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C13483a)) {
                aVar = new C13485a(iBinder);
            } else {
                aVar = (C13483a) queryLocalInterface;
            }
        }
        f35163a = aVar;
        if (aVar == null) {
            return false;
        }
        try {
            this.f35165b.linkToDeath(this.f35166c, 0);
            return true;
        } catch (RemoteException unused) {
            f35163a = null;
            this.f35165b = null;
            return false;
        }
    }

    /* renamed from: c */
    public final String mo25277c(String str) {
        if (f35163a == null && !m27248c()) {
            return null;
        }
        try {
            return f35163a.mo25269a(str);
        } catch (RemoteException unused) {
            f35163a = null;
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo25274a(String str) {
        if (f35163a == null && !m27248c()) {
            return false;
        }
        try {
            return f35163a.mo25271b(str);
        } catch (RemoteException unused) {
            f35163a = null;
            return false;
        }
    }

    /* renamed from: b */
    public final String mo25276b(String str) {
        if (f35163a == null && !m27248c()) {
            return null;
        }
        try {
            String a = f35163a.mo25270a("1.1:2019-03-27", str);
            if (a == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(":1.1");
            return sb.toString();
        } catch (RemoteException unused) {
            f35163a = null;
            return null;
        }
    }

    /* renamed from: a */
    private static List<Size> m27244a(String str, String str2) {
        String[] strArr;
        Size size;
        List<Size> list = null;
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            Slog.w("OMediaManager", "input param is invalid.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("StreamSize");
            String sb2 = sb.toString();
            if (jSONObject.has(sb2)) {
                String string = jSONObject.getString(sb2);
                if (!string.isEmpty()) {
                    if (string.isEmpty()) {
                        strArr = null;
                    } else {
                        strArr = string.split(",");
                    }
                    if (strArr != null) {
                        if (strArr.length != 0) {
                            for (String str3 : strArr) {
                                if (str3.isEmpty()) {
                                    size = new Size(0, 0);
                                } else {
                                    size = Size.parseSize(str3);
                                }
                                if (size.getHeight() > 0 && size.getWidth() > 0) {
                                    arrayList.add(size);
                                }
                            }
                        }
                    }
                    StringBuilder sb3 = new StringBuilder("stream split fail.");
                    sb3.append(string);
                    Slog.w("OMediaManager", sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder("capabiliyJson:");
                sb4.append(jSONObject);
                sb4.append("key:");
                sb4.append(sb2);
                Slog.w("OMediaManager", sb4.toString());
            }
            list = arrayList;
        } catch (JSONException unused) {
            Slog.w("OMediaManager", "got a json exception.");
        } catch (NumberFormatException unused2) {
            StringBuilder sb5 = new StringBuilder("capablity format is invalid.");
            sb5.append(str);
            sb5.append(" ");
            sb5.append(str2);
            Slog.w("OMediaManager", sb5.toString());
        }
        return list;
    }

    /* renamed from: b */
    private static Pair<Integer, Integer> m27247b(String str, String str2) {
        String[] strArr;
        Pair<Integer, Integer> create = Pair.create(Integer.valueOf(0), Integer.valueOf(0));
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            Slog.w("OMediaManager", "input param is invalid.");
            return create;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("StreamCount");
            String sb2 = sb.toString();
            if (jSONObject.has(sb2)) {
                String string = jSONObject.getString(sb2);
                if (string.isEmpty()) {
                    strArr = null;
                } else {
                    strArr = string.split(":");
                }
                if (2 == strArr.length) {
                    Integer valueOf = Integer.valueOf(Integer.parseInt(strArr[0]));
                    Integer valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1]));
                    if (valueOf2.intValue() >= valueOf.intValue() && valueOf.intValue() > 0) {
                        create = Pair.create(valueOf, valueOf2);
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder("capablity format is invalid.");
                    sb3.append(str);
                    sb3.append(" ");
                    sb3.append(str2);
                    Slog.w("OMediaManager", sb3.toString());
                }
            }
        } catch (JSONException unused) {
            StringBuilder sb4 = new StringBuilder("capablity format is invalid.");
            sb4.append(str);
            sb4.append(" ");
            sb4.append(str2);
            Slog.w("OMediaManager", sb4.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder sb5 = new StringBuilder("capablity format is invalid.");
            sb5.append(str);
            sb5.append(" ");
            sb5.append(str2);
            Slog.w("OMediaManager", sb5.toString());
        }
        return create;
    }

    /* renamed from: a */
    public static boolean m27245a(String str, String str2, int i) {
        if (str == null || str.isEmpty() || str2.isEmpty()) {
            Slog.w("OMediaManager", "input param is invalid.");
            return false;
        }
        Pair b = m27247b(str, str2);
        Integer num = new Integer(i);
        if (((Integer) b.first).intValue() <= 0 || ((Integer) b.second).intValue() <= 0 || num.intValue() < ((Integer) b.first).intValue() || num.intValue() > ((Integer) b.second).intValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m27246a(String str, String str2, Size size) {
        if (str == null || str.isEmpty() || str2.isEmpty()) {
            Slog.w("OMediaManager", "input param is invalid.");
            return false;
        }
        List<Size> a = m27244a(str, str2);
        if (a == null || a.size() == 0) {
            Slog.w("OMediaManager", "feature size is empty.");
            return false;
        }
        for (Size equals : a) {
            if (size.equals(equals)) {
                return true;
            }
        }
        return false;
    }
}
