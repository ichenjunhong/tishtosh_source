package com.p683ss.sys.p2584ck.p2585a;

import android.app.Application;
import android.content.Context;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12743e;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.ttnet.p887e.C13333g;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.sys.p2584ck.SCCheckUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.ss.sys.ck.a.e */
public class C51430e {

    /* renamed from: a */
    public static Context f128604a = null;

    /* renamed from: b */
    public static int f128605b = 25200;

    /* renamed from: c */
    public static int f128606c = 100;

    /* renamed from: d */
    private static C51428c f128607d;

    /* renamed from: com.ss.sys.ck.a.e$a */
    public static class C51431a extends Thread {

        /* renamed from: a */
        private String f128608a;

        public C51431a(String str) {
            this.f128608a = str;
        }

        public final void run() {
            String str = this.f128608a;
            if (str != null && !str.equals("")) {
                try {
                    Object nextValue = new JSONTokener(str).nextValue();
                    if (nextValue instanceof JSONObject) {
                        C51430e.m110608a((JSONObject) nextValue);
                    } else if (nextValue instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) nextValue;
                        for (int i = 0; i < jSONArray.length(); i++) {
                            C51430e.m110608a((JSONObject) jSONArray.get(i));
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            C51430e.m110606a((Context) null);
        }
    }

    public C51430e() {
        f128607d = C51428c.m110596a(m110605a());
    }

    /* renamed from: a */
    private static long m110604a(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    private static Context m110605a() {
        if (f128604a != null) {
            return f128604a;
        }
        try {
            Context applicationContext = ((Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0])).getApplicationContext();
            f128604a = applicationContext;
            return applicationContext;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m110607a(long j, String str) {
        try {
            m110610b().mo102181a(j, str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static long m110609b(JSONObject jSONObject) {
        long j;
        try {
            j = jSONObject.getLong("time");
        } catch (Throwable unused) {
            j = 0;
        }
        if (j == 0) {
            j = System.currentTimeMillis() / 1000;
            try {
                jSONObject.put("time", j);
            } catch (JSONException unused2) {
            }
        }
        return j;
    }

    /* renamed from: b */
    private static C51428c m110610b() {
        synchronized (C51430e.class) {
            if (f128607d == null) {
                f128607d = C51428c.m110596a(m110605a());
            }
        }
        return f128607d;
    }

    /* renamed from: a */
    static boolean m110608a(JSONObject jSONObject) {
        try {
            long b = m110609b(jSONObject);
            jSONObject.put("did", m110604a(SCCheckUtils.getInstance().getDid()));
            jSONObject.put("iid", m110604a(SCCheckUtils.getInstance().getIid()));
            jSONObject.put("aid", m110604a(SCCheckUtils.getInstance().getAid()));
            jSONObject.put("ip", C51437i.m110618b());
            jSONObject.put("uid", 0);
            jSONObject.put("version_code", m110604a(C51437i.m110617a()));
            jSONObject.put("os", "0");
            jSONObject.put("channel", SCCheckUtils.getInstance().getChannel());
            String jSONObject2 = jSONObject.toString();
            C51428c b2 = m110610b();
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            sb.append("_");
            int i = C51428c.f128597a;
            C51428c.f128597a++;
            sb.append(i);
            b2.mo102182a(sb.toString(), b, jSONObject2);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m110606a(Context context) {
        Context a = m110605a();
        if (a != null) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            long currentTimeMillis2 = (System.currentTimeMillis() / 1000) - ((long) f128605b);
            String a2 = m110610b().mo102180a(currentTimeMillis2, ">?", (long) f128606c);
            if (!a2.equals("")) {
                byte[] bytes = a2.getBytes();
                try {
                    C51432f fVar = new C51432f(a);
                    ((C51434g) C13333g.m26867b(fVar.f128611b).mo23937a(C51434g.class)).mo102184a(fVar.f128611b, new TypedByteArray("application/json; charset=utf-8", bytes, new String[0])).enqueue(new C12743e<TypedInput>() {
                        /* renamed from: a */
                        public final void mo19942a(C12690b<TypedInput> bVar, C12799u<TypedInput> uVar) {
                            boolean z;
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
                                InputStream in = ((TypedInput) uVar.f33552b).mo9554in();
                                while (true) {
                                    z = false;
                                    int read = in.read(bArr, 0, PreloadTask.BYTE_UNIT_NUMBER);
                                    if (read <= 0) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, read);
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                if (byteArray != null && new JSONObject(new String(byteArray)).getInt("code") == 200) {
                                    z = true;
                                }
                                C51430e.m110607a(C51429d.f128602f, "<?");
                                if (z) {
                                    C51430e.m110607a(C51429d.f128603g, "<?");
                                }
                            } catch (Throwable unused) {
                            }
                        }

                        /* renamed from: a */
                        public final void mo19943a(C12690b<TypedInput> bVar, Throwable th) {
                        }
                    });
                } catch (Throwable unused) {
                    new C51429d(a, SCCheckUtils.getInstance().getSession()).mo37726a(1, 1, bytes);
                }
                C51429d.f128603g = currentTimeMillis;
                C51429d.f128602f = currentTimeMillis2;
            }
        }
    }
}
