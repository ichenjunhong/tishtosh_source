package com.p683ss.android.socialbase.downloader.p1219h;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.p1221j.C20037h;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.h.a */
public final class C19938a {

    /* renamed from: a */
    public static JSONObject f54784a;

    /* renamed from: b */
    private static final C20037h<Integer, C19938a> f54785b = new C20037h<>(8, 8);

    /* renamed from: c */
    private static final C19938a f54786c = new C19938a(null);

    /* renamed from: d */
    private static JSONObject f54787d;

    /* renamed from: e */
    private static JSONObject f54788e;

    /* renamed from: f */
    private static Boolean f54789f;

    /* renamed from: g */
    private static boolean f54790g;

    /* renamed from: h */
    private static C19938a f54791h;

    /* renamed from: i */
    private final JSONObject f54792i;

    /* renamed from: j */
    private final JSONObject f54793j;

    /* renamed from: k */
    private final Boolean f54794k;

    /* renamed from: l */
    private int f54795l;

    /* renamed from: b */
    public static C19938a m48933b() {
        return f54786c;
    }

    static {
        m48932a();
    }

    /* renamed from: a */
    public static void m48932a() {
        boolean z;
        JSONObject s = C19884b.m48622s();
        if (f54787d != s) {
            f54787d = s;
            boolean z2 = false;
            if (s.optInt("disable_task_setting", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            f54790g = z;
            f54788e = s.optJSONObject("disabled_task_keys");
            JSONObject optJSONObject = s.optJSONObject("bugfix");
            Boolean bool = null;
            if (optJSONObject != null && optJSONObject.has("default")) {
                if (optJSONObject.optInt("default", 0) == 1) {
                    z2 = true;
                }
                bool = Boolean.valueOf(z2);
            }
            f54784a = optJSONObject;
            f54789f = bool;
        }
    }

    /* renamed from: a */
    public static C19938a m48929a(int i) {
        return m48930a(i, (DownloadInfo) null);
    }

    /* renamed from: a */
    public static C19938a m48931a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return f54786c;
        }
        return m48930a(downloadInfo.getId(), downloadInfo);
    }

    /* renamed from: c */
    private static boolean m48936c(String str) {
        if (f54788e == null || f54788e.optInt(str, 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static C19938a m48934b(DownloadInfo downloadInfo) {
        if (f54790g) {
            return f54786c;
        }
        try {
            String downloadSettingString = downloadInfo.getDownloadSettingString();
            if (!TextUtils.isEmpty(downloadSettingString)) {
                return new C19938a(new JSONObject(downloadSettingString));
            }
        } catch (Throwable unused) {
        }
        return f54786c;
    }

    private C19938a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        this.f54792i = jSONObject;
        Boolean bool = null;
        if (jSONObject == null || m48936c("bugfix")) {
            jSONObject2 = null;
        } else {
            jSONObject2 = jSONObject.optJSONObject("bugfix");
            if (jSONObject2 != null && jSONObject2.has("default") && !m48936c("default")) {
                boolean z = false;
                if (jSONObject2.optInt("default", 0) == 1) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
        }
        this.f54793j = jSONObject2;
        this.f54794k = bool;
    }

    /* renamed from: b */
    public static void m48935b(int i) {
        C19938a aVar = f54791h;
        if (aVar != null && aVar.f54795l == i) {
            f54791h = null;
        }
        synchronized (f54785b) {
            f54785b.remove(Integer.valueOf(i));
        }
    }

    /* renamed from: b */
    public final JSONObject mo41662b(String str) {
        if (this.f54792i == null || !this.f54792i.has(str) || m48936c(str)) {
            return f54787d.optJSONObject(str);
        }
        return this.f54792i.optJSONObject(str);
    }

    /* renamed from: a */
    public final boolean mo41660a(String str) {
        return mo41661a(str, false);
    }

    /* renamed from: a */
    public final int mo41658a(String str, int i) {
        if (this.f54792i == null || !this.f54792i.has(str) || m48936c(str)) {
            return f54787d.optInt(str, i);
        }
        return this.f54792i.optInt(str, i);
    }

    /* renamed from: a */
    public final long mo41659a(String str, long j) {
        if (this.f54792i == null || !this.f54792i.has(str) || m48936c(str)) {
            return f54787d.optLong(str, j);
        }
        return this.f54792i.optLong(str, j);
    }

    /* renamed from: a */
    private static C19938a m48930a(int i, DownloadInfo downloadInfo) {
        C19938a aVar;
        C19938a aVar2;
        C19938a aVar3 = f54791h;
        if (aVar3 != null && aVar3.f54795l == i) {
            return aVar3;
        }
        synchronized (f54785b) {
            aVar = (C19938a) f54785b.get(Integer.valueOf(i));
        }
        if (aVar == null) {
            if (downloadInfo == null) {
                if (!f54790g) {
                    Context x = C19884b.m48627x();
                    if (x != null) {
                        DownloadInfo downloadInfo2 = Downloader.getInstance(x).getDownloadInfo(i);
                        if (downloadInfo2 != null) {
                            aVar2 = m48934b(downloadInfo2);
                        }
                    }
                }
                aVar2 = f54786c;
            } else {
                aVar2 = m48934b(downloadInfo);
            }
            aVar = aVar2;
            synchronized (f54785b) {
                f54785b.put(Integer.valueOf(i), aVar);
            }
        }
        aVar.f54795l = i;
        f54791h = aVar;
        return aVar;
    }

    /* renamed from: a */
    public final boolean mo41661a(String str, boolean z) {
        if (this.f54793j != null && !m48936c(str)) {
            if (this.f54793j.has(str)) {
                if (this.f54793j.optInt(str, 0) == 1) {
                    return true;
                }
                return false;
            } else if (this.f54794k != null) {
                return this.f54794k.booleanValue();
            }
        }
        if (f54784a != null) {
            if (f54784a.has(str)) {
                if (f54784a.optInt(str, 0) == 1) {
                    return true;
                }
                return false;
            } else if (f54789f != null) {
                return f54789f.booleanValue();
            }
        }
        return false;
    }
}
