package com.facebook;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Pair;
import com.C2240a;
import com.facebook.C14564s.C14565a;
import com.facebook.C14564s.C14566b;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14283ab;
import com.facebook.internal.C14349t;
import com.facebook.internal.C14366y;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GraphRequest {

    /* renamed from: a */
    public static final String f35216a = "GraphRequest";

    /* renamed from: b */
    public static final String f35217b;

    /* renamed from: o */
    private static String f35218o;

    /* renamed from: p */
    private static Pattern f35219p = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");

    /* renamed from: r */
    private static volatile String f35220r;

    /* renamed from: c */
    public AccessToken f35221c;

    /* renamed from: d */
    public C14697u f35222d;

    /* renamed from: e */
    public String f35223e;

    /* renamed from: f */
    public JSONObject f35224f;

    /* renamed from: g */
    public String f35225g;

    /* renamed from: h */
    public String f35226h;

    /* renamed from: i */
    public boolean f35227i;

    /* renamed from: j */
    public Bundle f35228j;

    /* renamed from: k */
    public C13501b f35229k;

    /* renamed from: l */
    public Object f35230l;

    /* renamed from: m */
    public String f35231m;

    /* renamed from: n */
    public boolean f35232n;

    /* renamed from: q */
    private String f35233q;

    /* renamed from: com.facebook.GraphRequest$1 */
    static class C134951 implements C13501b {
        /* renamed from: a */
        public final void mo25316a(C14696t tVar) {
        }
    }

    public static class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public static final Creator<ParcelableResourceWithMimeType> CREATOR = new Creator<ParcelableResourceWithMimeType>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new ParcelableResourceWithMimeType[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new ParcelableResourceWithMimeType(parcel, (C134951) null);
            }
        };

        /* renamed from: a */
        public final String f35240a;

        /* renamed from: b */
        public final RESOURCE f35241b;

        public int describeContents() {
            return 1;
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.f35240a = parcel.readString();
            this.f35241b = parcel.readParcelable(C14533n.m29773g().getClassLoader());
        }

        /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, C134951 r2) {
            this(parcel);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, String str) {
            this.f35240a = str;
            this.f35241b = resource;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f35240a);
            parcel.writeParcelable(this.f35241b, i);
        }
    }

    /* renamed from: com.facebook.GraphRequest$a */
    static class C13500a {

        /* renamed from: a */
        public final GraphRequest f35242a;

        /* renamed from: b */
        public final Object f35243b;

        public C13500a(GraphRequest graphRequest, Object obj) {
            this.f35242a = graphRequest;
            this.f35243b = obj;
        }
    }

    /* renamed from: com.facebook.GraphRequest$b */
    public interface C13501b {
        /* renamed from: a */
        void mo25316a(C14696t tVar);
    }

    /* renamed from: com.facebook.GraphRequest$c */
    interface C13502c {
        /* renamed from: a */
        void mo25318a(String str, String str2) throws IOException;
    }

    /* renamed from: com.facebook.GraphRequest$d */
    public interface C13503d extends C13501b {
    }

    /* renamed from: com.facebook.GraphRequest$e */
    static class C13504e implements C13502c {

        /* renamed from: a */
        private final OutputStream f35244a;

        /* renamed from: b */
        private final C14349t f35245b;

        /* renamed from: c */
        private boolean f35246c = true;

        /* renamed from: d */
        private boolean f35247d;

        /* renamed from: a */
        public final void mo25323a(String str, Object obj, GraphRequest graphRequest) throws IOException {
            if (this.f35244a instanceof C13597ab) {
                ((C13597ab) this.f35244a).mo25418a(graphRequest);
            }
            if (GraphRequest.m27281a(obj)) {
                mo25318a(str, GraphRequest.m27283b(obj));
            } else if (obj instanceof Bitmap) {
                m27301a(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                m27305a(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                m27302a(str, (Uri) obj, (String) null);
            } else if (obj instanceof ParcelFileDescriptor) {
                m27303a(str, (ParcelFileDescriptor) obj, (String) null);
            } else if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                RESOURCE resource = parcelableResourceWithMimeType.f35241b;
                String str2 = parcelableResourceWithMimeType.f35240a;
                if (resource instanceof ParcelFileDescriptor) {
                    m27303a(str, (ParcelFileDescriptor) resource, str2);
                } else if (resource instanceof Uri) {
                    m27302a(str, (Uri) resource, str2);
                } else {
                    throw m27300a();
                }
            } else {
                throw m27300a();
            }
        }

        /* renamed from: a */
        public final void mo25324a(String str, JSONArray jSONArray, Collection<GraphRequest> collection) throws IOException, JSONException {
            if (!(this.f35244a instanceof C13597ab)) {
                mo25318a(str, jSONArray.toString());
                return;
            }
            C13597ab abVar = (C13597ab) this.f35244a;
            m27304a(str, (String) null, (String) null);
            m27306a("[", new Object[0]);
            int i = 0;
            for (GraphRequest graphRequest : collection) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                abVar.mo25418a(graphRequest);
                if (i > 0) {
                    m27306a(",%s", jSONObject.toString());
                } else {
                    m27306a("%s", jSONObject.toString());
                }
                i++;
            }
            m27306a("]", new Object[0]);
            if (this.f35245b != null) {
                C14349t tVar = this.f35245b;
                StringBuilder sb = new StringBuilder("    ");
                sb.append(str);
                tVar.mo26550a(sb.toString(), (Object) jSONArray.toString());
            }
        }

        /* renamed from: a */
        public final void mo25318a(String str, String str2) throws IOException {
            m27304a(str, (String) null, (String) null);
            m27308b("%s", str2);
            m27307b();
            if (this.f35245b != null) {
                C14349t tVar = this.f35245b;
                StringBuilder sb = new StringBuilder("    ");
                sb.append(str);
                tVar.mo26550a(sb.toString(), (Object) str2);
            }
        }

        /* renamed from: a */
        private static RuntimeException m27300a() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        /* renamed from: b */
        private void m27307b() throws IOException {
            if (!this.f35247d) {
                m27308b("--%s", GraphRequest.f35217b);
                return;
            }
            this.f35244a.write("&".getBytes());
        }

        /* renamed from: b */
        private void m27308b(String str, Object... objArr) throws IOException {
            m27306a(str, objArr);
            if (!this.f35247d) {
                m27306a("\r\n", new Object[0]);
            }
        }

        /* renamed from: a */
        private void m27301a(String str, Bitmap bitmap) throws IOException {
            m27304a(str, str, "image/png");
            bitmap.compress(CompressFormat.PNG, 100, this.f35244a);
            m27308b("", new Object[0]);
            m27307b();
            if (this.f35245b != null) {
                C14349t tVar = this.f35245b;
                StringBuilder sb = new StringBuilder("    ");
                sb.append(str);
                tVar.mo26550a(sb.toString(), (Object) "<Image>");
            }
        }

        /* renamed from: a */
        private void m27305a(String str, byte[] bArr) throws IOException {
            m27304a(str, str, "content/unknown");
            this.f35244a.write(bArr);
            m27308b("", new Object[0]);
            m27307b();
            if (this.f35245b != null) {
                C14349t tVar = this.f35245b;
                StringBuilder sb = new StringBuilder("    ");
                sb.append(str);
                tVar.mo26550a(sb.toString(), (Object) C2240a.m6773a(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(bArr.length)}));
            }
        }

        /* renamed from: a */
        private void m27306a(String str, Object... objArr) throws IOException {
            if (!this.f35247d) {
                if (this.f35246c) {
                    this.f35244a.write("--".getBytes());
                    this.f35244a.write(GraphRequest.f35217b.getBytes());
                    this.f35244a.write("\r\n".getBytes());
                    this.f35246c = false;
                }
                this.f35244a.write(C2240a.m6772a(str, objArr).getBytes());
                return;
            }
            this.f35244a.write(URLEncoder.encode(C2240a.m6773a(Locale.US, str, objArr), "UTF-8").getBytes());
        }

        public C13504e(OutputStream outputStream, C14349t tVar, boolean z) {
            this.f35244a = outputStream;
            this.f35245b = tVar;
            this.f35247d = z;
        }

        /* renamed from: a */
        private void m27302a(String str, Uri uri, String str2) throws IOException {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m27304a(str, str, str2);
            if (this.f35244a instanceof C14703z) {
                ((C14703z) this.f35244a).mo26971a(C14277aa.m29293e(uri));
                i = 0;
            } else {
                i = C14277aa.m29244a(C14533n.m29773g().getContentResolver().openInputStream(uri), this.f35244a) + 0;
            }
            m27308b("", new Object[0]);
            m27307b();
            if (this.f35245b != null) {
                C14349t tVar = this.f35245b;
                StringBuilder sb = new StringBuilder("    ");
                sb.append(str);
                tVar.mo26550a(sb.toString(), (Object) C2240a.m6773a(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        /* renamed from: a */
        private void m27303a(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws IOException {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m27304a(str, str, str2);
            if (this.f35244a instanceof C14703z) {
                ((C14703z) this.f35244a).mo26971a(parcelFileDescriptor.getStatSize());
                i = 0;
            } else {
                i = C14277aa.m29244a((InputStream) new AutoCloseInputStream(parcelFileDescriptor), this.f35244a) + 0;
            }
            m27308b("", new Object[0]);
            m27307b();
            if (this.f35245b != null) {
                C14349t tVar = this.f35245b;
                StringBuilder sb = new StringBuilder("    ");
                sb.append(str);
                tVar.mo26550a(sb.toString(), (Object) C2240a.m6773a(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        /* renamed from: a */
        private void m27304a(String str, String str2, String str3) throws IOException {
            if (!this.f35247d) {
                m27306a("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    m27306a("; filename=\"%s\"", str2);
                }
                m27308b("", new Object[0]);
                if (str3 != null) {
                    m27308b("%s: %s", "Content-Type", str3);
                }
                m27308b("", new Object[0]);
                return;
            }
            this.f35244a.write(C2240a.m6772a("%s=", new Object[]{str}).getBytes());
        }
    }

    /* renamed from: a */
    public final void mo25313a(final C13501b bVar) {
        if (C14533n.m29765a(C14699w.GRAPH_API_DEBUG_INFO) || C14533n.m29765a(C14699w.GRAPH_API_DEBUG_WARNING)) {
            this.f35229k = new C13501b() {
                /* renamed from: a */
                public final void mo25316a(C14696t tVar) {
                    JSONObject jSONObject;
                    JSONArray jSONArray;
                    String str;
                    String str2;
                    String str3;
                    JSONObject jSONObject2 = tVar.f38084b;
                    if (jSONObject2 != null) {
                        jSONObject = jSONObject2.optJSONObject("__debug__");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        jSONArray = jSONObject.optJSONArray("messages");
                    } else {
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject optJSONObject = jSONArray.optJSONObject(i);
                            if (optJSONObject != null) {
                                str = optJSONObject.optString("message");
                            } else {
                                str = null;
                            }
                            if (optJSONObject != null) {
                                str2 = optJSONObject.optString("type");
                            } else {
                                str2 = null;
                            }
                            if (optJSONObject != null) {
                                str3 = optJSONObject.optString("link");
                            } else {
                                str3 = null;
                            }
                            if (!(str == null || str2 == null)) {
                                C14699w wVar = C14699w.GRAPH_API_DEBUG_INFO;
                                if (str2.equals("warning")) {
                                    wVar = C14699w.GRAPH_API_DEBUG_WARNING;
                                }
                                if (!C14277aa.m29276a(str3)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str);
                                    sb.append(" Link: ");
                                    sb.append(str3);
                                    str = sb.toString();
                                }
                                C14349t.m29408a(wVar, GraphRequest.f35216a, str);
                            }
                        }
                    }
                    if (bVar != null) {
                        bVar.mo25316a(tVar);
                    }
                }
            };
        } else {
            this.f35229k = bVar;
        }
    }

    /* renamed from: a */
    private static void m27276a(final C14564s sVar, List<C14696t> list) {
        int size = sVar.size();
        final ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            GraphRequest a = sVar.get(i);
            if (a.f35229k != null) {
                arrayList.add(new Pair(a.f35229k, list.get(i)));
            }
        }
        if (arrayList.size() > 0) {
            C134973 r7 = new Runnable() {
                public final void run() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        ((C13501b) pair.first).mo25316a((C14696t) pair.second);
                    }
                    for (C14565a a : sVar.f37843e) {
                        a.mo25465a(sVar);
                    }
                }
            };
            Handler handler = sVar.f37839a;
            if (handler == null) {
                r7.run();
                return;
            }
            handler.post(r7);
        }
    }

    /* renamed from: a */
    private void m27279a(JSONArray jSONArray, Map<String, C13500a> map) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        if (this.f35225g != null) {
            jSONObject.put(LeakCanaryFileProvider.f132049i, this.f35225g);
            jSONObject.put("omit_response_on_success", this.f35227i);
        }
        if (this.f35226h != null) {
            jSONObject.put("depends_on", this.f35226h);
        }
        String d = m27287d();
        jSONObject.put("relative_url", d);
        jSONObject.put("method", this.f35222d);
        if (this.f35221c != null) {
            C14349t.m29410a(this.f35221c.f35176e);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f35228j.keySet()) {
            Object obj = this.f35228j.get(str);
            if (m27286c(obj)) {
                String a = C2240a.m6773a(Locale.ROOT, "%s%d", new Object[]{"file", Integer.valueOf(map.size())});
                arrayList.add(a);
                map.put(a, new C13500a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        if (this.f35224f != null) {
            final ArrayList arrayList2 = new ArrayList();
            m27280a(this.f35224f, d, (C13502c) new C13502c() {
                /* renamed from: a */
                public final void mo25318a(String str, String str2) throws IOException {
                    arrayList2.add(C2240a.m6773a(Locale.US, "%s=%s", new Object[]{str, URLEncoder.encode(str2, "UTF-8")}));
                }
            });
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    /* renamed from: a */
    private static void m27275a(C14564s sVar, C14349t tVar, int i, URL url, OutputStream outputStream, boolean z) throws IOException, JSONException {
        C13504e eVar = new C13504e(outputStream, tVar, z);
        if (i == 1) {
            GraphRequest a = sVar.get(0);
            HashMap hashMap = new HashMap();
            for (String str : a.f35228j.keySet()) {
                Object obj = a.f35228j.get(str);
                if (m27286c(obj)) {
                    hashMap.put(str, new C13500a(a, obj));
                }
            }
            if (tVar != null) {
                tVar.mo26551b("  Parameters:\n");
            }
            m27273a(a.f35228j, eVar, a);
            if (tVar != null) {
                tVar.mo26551b("  Attachments:\n");
            }
            m27278a((Map<String, C13500a>) hashMap, eVar);
            if (a.f35224f != null) {
                m27280a(a.f35224f, url.getPath(), (C13502c) eVar);
            }
            return;
        }
        String f = m27291f(sVar);
        if (!C14277aa.m29276a(f)) {
            eVar.mo25318a("batch_app_id", f);
            HashMap hashMap2 = new HashMap();
            m27274a(eVar, (Collection<GraphRequest>) sVar, (Map<String, C13500a>) hashMap2);
            if (tVar != null) {
                tVar.mo26551b("  Attachments:\n");
            }
            m27278a((Map<String, C13500a>) hashMap2, eVar);
            return;
        }
        throw new C14457k("App ID was not specified at the request or Settings.");
    }

    /* renamed from: a */
    private static void m27277a(String str, Object obj, C13502c cVar, boolean z) throws IOException {
        Class cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z) {
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    m27277a(C2240a.m6772a("%s[%s]", new Object[]{str, str2}), jSONObject.opt(str2), cVar, z);
                }
            } else if (jSONObject.has("id")) {
                m27277a(str, (Object) jSONObject.optString("id"), cVar, z);
            } else if (jSONObject.has("url")) {
                m27277a(str, (Object) jSONObject.optString("url"), cVar, z);
            } else {
                if (jSONObject.has("fbsdk:create_object")) {
                    m27277a(str, (Object) jSONObject.toString(), cVar, z);
                }
            }
        } else if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                m27277a(C2240a.m6773a(Locale.ROOT, "%s[%d]", new Object[]{str, Integer.valueOf(i)}), jSONArray.opt(i), cVar, z);
            }
        } else if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
            cVar.mo25318a(str, obj.toString());
        } else if (Date.class.isAssignableFrom(cls)) {
            cVar.mo25318a(str, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj));
        }
    }

    /* renamed from: a */
    private static void m27273a(Bundle bundle, C13504e eVar, GraphRequest graphRequest) throws IOException {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (m27281a(obj)) {
                eVar.mo25323a(str, obj, graphRequest);
            }
        }
    }

    /* renamed from: a */
    private static void m27278a(Map<String, C13500a> map, C13504e eVar) throws IOException {
        for (String str : map.keySet()) {
            C13500a aVar = (C13500a) map.get(str);
            if (m27286c(aVar.f35243b)) {
                eVar.mo25323a(str, aVar.f35243b, aVar.f35242a);
            }
        }
    }

    /* renamed from: a */
    private static void m27274a(C13504e eVar, Collection<GraphRequest> collection, Map<String, C13500a> map) throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        for (GraphRequest a : collection) {
            a.m27279a(jSONArray, map);
        }
        eVar.mo25324a("batch", jSONArray, collection);
    }

    /* renamed from: a */
    public static boolean m27281a(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m27280a(org.json.JSONObject r6, java.lang.String r7, com.facebook.GraphRequest.C13502c r8) throws java.io.IOException {
        /*
            java.util.regex.Pattern r0 = f35219p
            java.util.regex.Matcher r0 = r0.matcher(r7)
            boolean r1 = r0.matches()
            r2 = 1
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = r0.group(r2)
            goto L_0x0013
        L_0x0012:
            r0 = r7
        L_0x0013:
            java.lang.String r1 = "me/"
            boolean r1 = r0.startsWith(r1)
            r3 = 0
            if (r1 != 0) goto L_0x0027
            java.lang.String r1 = "/me/"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r0 = 0
            goto L_0x0028
        L_0x0027:
            r0 = 1
        L_0x0028:
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = ":"
            int r0 = r7.indexOf(r0)
            java.lang.String r1 = "?"
            int r7 = r7.indexOf(r1)
            r1 = 3
            if (r0 <= r1) goto L_0x0040
            r1 = -1
            if (r7 == r1) goto L_0x003e
            if (r0 >= r7) goto L_0x0040
        L_0x003e:
            r7 = 1
            goto L_0x0041
        L_0x0040:
            r7 = 0
        L_0x0041:
            java.util.Iterator r0 = r6.keys()
        L_0x0045:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0066
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r6.opt(r1)
            if (r7 == 0) goto L_0x0061
            java.lang.String r5 = "image"
            boolean r5 = r1.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0061
            r5 = 1
            goto L_0x0062
        L_0x0061:
            r5 = 0
        L_0x0062:
            m27277a(r1, r4, r8, r5)
            goto L_0x0045
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.m27280a(org.json.JSONObject, java.lang.String, com.facebook.GraphRequest$c):void");
    }

    /* renamed from: a */
    public final C14696t mo25312a() {
        return m27267a(this);
    }

    public GraphRequest() {
        this(null, null, null, null, null);
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        f35217b = sb.toString();
    }

    /* renamed from: e */
    private String m27289e() {
        if (f35219p.matcher(this.f35223e).matches()) {
            return this.f35223e;
        }
        return C2240a.m6772a("%s/%s", new Object[]{this.f35231m, this.f35223e});
    }

    /* renamed from: d */
    private String m27287d() {
        if (this.f35233q == null) {
            String a = C2240a.m6772a("%s/%s", new Object[]{C14366y.m29469b(), m27289e()});
            m27285c();
            Uri parse = Uri.parse(m27268a(a, Boolean.valueOf(true)));
            return C2240a.m6772a("%s?%s", new Object[]{parse.getPath(), parse.getQuery()});
        }
        throw new C14457k("Can't override URL for a batch request");
    }

    /* renamed from: b */
    public final C14563r mo25314b() {
        GraphRequest[] graphRequestArr = {this};
        C14283ab.m29306a((Object) graphRequestArr, "requests");
        return m27282b(new C14564s((Collection<GraphRequest>) Arrays.asList(graphRequestArr)));
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("{Request: ");
        sb.append(" accessToken: ");
        if (this.f35221c == null) {
            obj = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            obj = this.f35221c;
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.f35223e);
        sb.append(", graphObject: ");
        sb.append(this.f35224f);
        sb.append(", httpMethod: ");
        sb.append(this.f35222d);
        sb.append(", parameters: ");
        sb.append(this.f35228j);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: c */
    private void m27285c() {
        if (this.f35221c != null) {
            if (!this.f35228j.containsKey("access_token")) {
                String str = this.f35221c.f35176e;
                C14349t.m29410a(str);
                this.f35228j.putString("access_token", str);
            }
        } else if (!this.f35232n && !this.f35228j.containsKey("access_token")) {
            String k = C14533n.m29777k();
            String m = C14533n.m29779m();
            if (!C14277aa.m29276a(k) && !C14277aa.m29276a(m)) {
                StringBuilder sb = new StringBuilder();
                sb.append(k);
                sb.append("|");
                sb.append(m);
                this.f35228j.putString("access_token", sb.toString());
            }
        }
        this.f35228j.putString("sdk", "android");
        this.f35228j.putString("format", "json");
        if (C14533n.m29765a(C14699w.GRAPH_API_DEBUG_INFO)) {
            this.f35228j.putString("debug", "info");
            return;
        }
        if (C14533n.m29765a(C14699w.GRAPH_API_DEBUG_WARNING)) {
            this.f35228j.putString("debug", "warning");
        }
    }

    /* renamed from: b */
    public static C14563r m27282b(C14564s sVar) {
        C14283ab.m29308a((Collection<T>) sVar, "requests");
        C14563r rVar = new C14563r(sVar);
        rVar.executeOnExecutor(C14533n.m29771e(), new Void[0]);
        return rVar;
    }

    /* renamed from: c */
    private static boolean m27286c(Object obj) {
        if ((obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C14696t m27267a(GraphRequest graphRequest) {
        List a = m27272a(graphRequest);
        if (a != null && a.size() == 1) {
            return (C14696t) a.get(0);
        }
        throw new C14457k("invalid state: expected a single response");
    }

    /* renamed from: b */
    public static String m27283b(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (obj instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(obj);
        }
        throw new IllegalArgumentException("Unsupported parameter type.");
    }

    /* renamed from: d */
    private static boolean m27288d(C14564s sVar) {
        for (C14565a aVar : sVar.f37843e) {
            if (aVar instanceof C14566b) {
                return true;
            }
        }
        Iterator it = sVar.iterator();
        while (it.hasNext()) {
            if (((GraphRequest) it.next()).f35229k instanceof C13503d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private static String m27291f(C14564s sVar) {
        if (!C14277aa.m29276a(sVar.f37844f)) {
            return sVar.f37844f;
        }
        Iterator it = sVar.iterator();
        while (it.hasNext()) {
            AccessToken accessToken = ((GraphRequest) it.next()).f35221c;
            if (accessToken != null) {
                String str = accessToken.f35179h;
                if (str != null) {
                    return str;
                }
            }
        }
        if (!C14277aa.m29276a(f35218o)) {
            return f35218o;
        }
        return C14533n.m29777k();
    }

    /* renamed from: e */
    private static boolean m27290e(C14564s sVar) {
        Iterator it = sVar.iterator();
        while (it.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) it.next();
            Iterator it2 = graphRequest.f35228j.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (m27286c(graphRequest.f35228j.get((String) it2.next()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static List<C14696t> m27269a(C14564s sVar) {
        C14283ab.m29308a((Collection<T>) sVar, "requests");
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection c = m27284c(sVar);
            try {
                List<C14696t> a = m27270a(c, sVar);
                C14277aa.m29271a((URLConnection) c);
                return a;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = c;
                C14277aa.m29271a((URLConnection) httpURLConnection);
                throw th;
            }
        } catch (Exception e) {
            List<C14696t> a2 = C14696t.m30059a(sVar.f37840b, (HttpURLConnection) null, new C14457k((Throwable) e));
            m27276a(sVar, a2);
            C14277aa.m29271a((URLConnection) null);
            return a2;
        } catch (Throwable th2) {
            th = th2;
            C14277aa.m29271a((URLConnection) httpURLConnection);
            throw th;
        }
    }

    /* renamed from: a */
    private static List<C14696t> m27271a(Collection<GraphRequest> collection) {
        return m27269a(new C14564s(collection));
    }

    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r10v0, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r6v4, types: [com.facebook.aa] */
    /* JADX WARNING: type inference failed for: r7v12, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12, types: [java.util.zip.GZIPOutputStream] */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v6
      assigns: []
      uses: []
      mth insns count: 233
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0004 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 9 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.net.HttpURLConnection m27284c(com.facebook.C14564s r15) {
        /*
            java.util.Iterator r0 = r15.iterator()
        L_0x0004:
            boolean r1 = r0.hasNext()
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x008b
            java.lang.Object r1 = r0.next()
            com.facebook.GraphRequest r1 = (com.facebook.GraphRequest) r1
            com.facebook.u r5 = com.facebook.C14697u.GET
            com.facebook.u r6 = r1.f35222d
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0004
            java.lang.String r5 = r1.f35231m
            boolean r6 = com.facebook.internal.C14277aa.m29276a(r5)
            if (r6 == 0) goto L_0x0027
        L_0x0025:
            r2 = 1
            goto L_0x0057
        L_0x0027:
            java.lang.String r6 = "v"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L_0x0033
            java.lang.String r5 = r5.substring(r4)
        L_0x0033:
            java.lang.String r6 = "\\."
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            if (r6 < r2) goto L_0x0044
            r6 = r5[r3]
            int r6 = java.lang.Integer.parseInt(r6)
            if (r6 > r2) goto L_0x0025
        L_0x0044:
            r6 = r5[r3]
            int r6 = java.lang.Integer.parseInt(r6)
            if (r6 < r2) goto L_0x0056
            r2 = r5[r4]
            int r2 = java.lang.Integer.parseInt(r2)
            r5 = 4
            if (r2 < r5) goto L_0x0056
            goto L_0x0025
        L_0x0056:
            r2 = 0
        L_0x0057:
            if (r2 == 0) goto L_0x0004
            android.os.Bundle r2 = r1.f35228j
            java.lang.String r5 = "fields"
            boolean r5 = r2.containsKey(r5)
            if (r5 == 0) goto L_0x006f
            java.lang.String r5 = "fields"
            java.lang.String r2 = r2.getString(r5)
            boolean r2 = com.facebook.internal.C14277aa.m29276a(r2)
            if (r2 == 0) goto L_0x0004
        L_0x006f:
            com.facebook.w r2 = com.facebook.C14699w.DEVELOPER_ERRORS
            java.lang.String r5 = "Request"
            java.lang.String r6 = "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter."
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r1 = r1.f35223e
            r4[r3] = r1
            boolean r1 = com.facebook.C14533n.m29765a(r2)
            if (r1 == 0) goto L_0x0004
            java.lang.String r1 = com.C2240a.m6772a(r6, r4)
            r3 = 5
            com.facebook.internal.C14349t.m29407a(r2, r3, r5, r1)
            goto L_0x0004
        L_0x008b:
            int r0 = r15.size()     // Catch:{ MalformedURLException -> 0x022f }
            if (r0 != r4) goto L_0x00e8
            com.facebook.GraphRequest r0 = r15.get(r3)     // Catch:{ MalformedURLException -> 0x022f }
            java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x022f }
            java.lang.String r5 = r0.f35233q     // Catch:{ MalformedURLException -> 0x022f }
            if (r5 == 0) goto L_0x00a2
            java.lang.String r0 = r0.f35233q     // Catch:{ MalformedURLException -> 0x022f }
            java.lang.String r0 = r0.toString()     // Catch:{ MalformedURLException -> 0x022f }
            goto L_0x00e4
        L_0x00a2:
            com.facebook.u r5 = r0.f35222d     // Catch:{ MalformedURLException -> 0x022f }
            com.facebook.u r6 = com.facebook.C14697u.POST     // Catch:{ MalformedURLException -> 0x022f }
            if (r5 != r6) goto L_0x00c5
            java.lang.String r5 = r0.f35223e     // Catch:{ MalformedURLException -> 0x022f }
            if (r5 == 0) goto L_0x00c5
            java.lang.String r5 = r0.f35223e     // Catch:{ MalformedURLException -> 0x022f }
            java.lang.String r6 = "/videos"
            boolean r5 = r5.endsWith(r6)     // Catch:{ MalformedURLException -> 0x022f }
            if (r5 == 0) goto L_0x00c5
            java.lang.String r5 = "https://graph-video.%s"
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ MalformedURLException -> 0x022f }
            java.lang.String r7 = com.facebook.C14533n.m29772f()     // Catch:{ MalformedURLException -> 0x022f }
            r6[r3] = r7     // Catch:{ MalformedURLException -> 0x022f }
            java.lang.String r5 = com.C2240a.m6772a(r5, r6)     // Catch:{ MalformedURLException -> 0x022f }
            goto L_0x00c9
        L_0x00c5:
            java.lang.String r5 = com.facebook.internal.C14366y.m29469b()     // Catch:{ MalformedURLException -> 0x022f }
        L_0x00c9:
            java.lang.String r6 = "%s/%s"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ MalformedURLException -> 0x022f }
            r7[r3] = r5     // Catch:{ MalformedURLException -> 0x022f }
            java.lang.String r5 = r0.m27289e()     // Catch:{ MalformedURLException -> 0x022f }
            r7[r4] = r5     // Catch:{ MalformedURLException -> 0x022f }
            java.lang.String r5 = com.C2240a.m6772a(r6, r7)     // Catch:{ MalformedURLException -> 0x022f }
            r0.m27285c()     // Catch:{ MalformedURLException -> 0x022f }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)     // Catch:{ MalformedURLException -> 0x022f }
            java.lang.String r0 = r0.m27268a(r5, r6)     // Catch:{ MalformedURLException -> 0x022f }
        L_0x00e4:
            r1.<init>(r0)     // Catch:{ MalformedURLException -> 0x022f }
            goto L_0x00f1
        L_0x00e8:
            java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x022f }
            java.lang.String r0 = com.facebook.internal.C14366y.m29469b()     // Catch:{ MalformedURLException -> 0x022f }
            r1.<init>(r0)     // Catch:{ MalformedURLException -> 0x022f }
        L_0x00f1:
            r0 = 0
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ IOException | JSONException -> 0x0222 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException | JSONException -> 0x0222 }
            java.lang.String r5 = "User-Agent"
            java.lang.String r6 = f35220r     // Catch:{ IOException | JSONException -> 0x0222 }
            if (r6 != 0) goto L_0x012a
            java.lang.String r6 = "%s.%s"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ IOException | JSONException -> 0x0222 }
            java.lang.String r8 = "FBAndroidSDK"
            r7[r3] = r8     // Catch:{ IOException | JSONException -> 0x0222 }
            java.lang.String r8 = "5.5.2"
            r7[r4] = r8     // Catch:{ IOException | JSONException -> 0x0222 }
            java.lang.String r6 = com.C2240a.m6772a(r6, r7)     // Catch:{ IOException | JSONException -> 0x0222 }
            f35220r = r6     // Catch:{ IOException | JSONException -> 0x0222 }
            java.lang.String r6 = com.facebook.internal.C14346r.f37326a     // Catch:{ IOException | JSONException -> 0x0222 }
            boolean r7 = com.facebook.internal.C14277aa.m29276a(r6)     // Catch:{ IOException | JSONException -> 0x0222 }
            if (r7 != 0) goto L_0x012a
            java.util.Locale r7 = java.util.Locale.ROOT     // Catch:{ IOException | JSONException -> 0x0222 }
            java.lang.String r8 = "%s/%s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IOException | JSONException -> 0x0222 }
            java.lang.String r9 = f35220r     // Catch:{ IOException | JSONException -> 0x0222 }
            r2[r3] = r9     // Catch:{ IOException | JSONException -> 0x0222 }
            r2[r4] = r6     // Catch:{ IOException | JSONException -> 0x0222 }
            java.lang.String r2 = com.C2240a.m6773a(r7, r8, r2)     // Catch:{ IOException | JSONException -> 0x0222 }
            f35220r = r2     // Catch:{ IOException | JSONException -> 0x0222 }
        L_0x012a:
            java.lang.String r2 = f35220r     // Catch:{ IOException | JSONException -> 0x0222 }
            com.facebook.C14562q.m29814a(r1, r5, r2)     // Catch:{ IOException | JSONException -> 0x0222 }
            java.lang.String r2 = "Accept-Language"
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ IOException | JSONException -> 0x0222 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException | JSONException -> 0x0222 }
            com.facebook.C14562q.m29814a(r1, r2, r5)     // Catch:{ IOException | JSONException -> 0x0222 }
            r1.setChunkedStreamingMode(r3)     // Catch:{ IOException | JSONException -> 0x0222 }
            com.facebook.internal.t r2 = new com.facebook.internal.t     // Catch:{ IOException | JSONException -> 0x0220 }
            com.facebook.w r5 = com.facebook.C14699w.REQUESTS     // Catch:{ IOException | JSONException -> 0x0220 }
            java.lang.String r6 = "Request"
            r2.<init>(r5, r6)     // Catch:{ IOException | JSONException -> 0x0220 }
            int r5 = r15.size()     // Catch:{ IOException | JSONException -> 0x0220 }
            boolean r13 = m27290e(r15)     // Catch:{ IOException | JSONException -> 0x0220 }
            if (r5 != r4) goto L_0x0159
            com.facebook.GraphRequest r6 = r15.get(r3)     // Catch:{ IOException | JSONException -> 0x0220 }
            com.facebook.u r6 = r6.f35222d     // Catch:{ IOException | JSONException -> 0x0220 }
            goto L_0x015b
        L_0x0159:
            com.facebook.u r6 = com.facebook.C14697u.POST     // Catch:{ IOException | JSONException -> 0x0220 }
        L_0x015b:
            java.lang.String r7 = r6.name()     // Catch:{ IOException | JSONException -> 0x0220 }
            r1.setRequestMethod(r7)     // Catch:{ IOException | JSONException -> 0x0220 }
            if (r13 == 0) goto L_0x0173
            java.lang.String r7 = "Content-Type"
            java.lang.String r8 = "application/x-www-form-urlencoded"
            com.facebook.C14562q.m29814a(r1, r7, r8)     // Catch:{ IOException | JSONException -> 0x0220 }
            java.lang.String r7 = "Content-Encoding"
            java.lang.String r8 = "gzip"
            com.facebook.C14562q.m29814a(r1, r7, r8)     // Catch:{ IOException | JSONException -> 0x0220 }
            goto L_0x0184
        L_0x0173:
            java.lang.String r7 = "Content-Type"
            java.lang.String r8 = "multipart/form-data; boundary=%s"
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ IOException | JSONException -> 0x0220 }
            java.lang.String r10 = f35217b     // Catch:{ IOException | JSONException -> 0x0220 }
            r9[r3] = r10     // Catch:{ IOException | JSONException -> 0x0220 }
            java.lang.String r8 = com.C2240a.m6772a(r8, r9)     // Catch:{ IOException | JSONException -> 0x0220 }
            com.facebook.C14562q.m29814a(r1, r7, r8)     // Catch:{ IOException | JSONException -> 0x0220 }
        L_0x0184:
            java.net.URL r14 = r1.getURL()     // Catch:{ IOException | JSONException -> 0x0220 }
            java.lang.String r7 = "Request:\n"
            r2.mo26551b(r7)     // Catch:{ IOException | JSONException -> 0x0220 }
            java.lang.String r7 = "Id"
            java.lang.String r8 = r15.f37842d     // Catch:{ IOException | JSONException -> 0x0220 }
            r2.mo26550a(r7, r8)     // Catch:{ IOException | JSONException -> 0x0220 }
            java.lang.String r7 = "URL"
            r2.mo26550a(r7, r14)     // Catch:{ IOException | JSONException -> 0x0220 }
            java.lang.String r7 = "Method"
            java.lang.String r8 = r1.getRequestMethod()     // Catch:{ IOException | JSONException -> 0x0220 }
            r2.mo26550a(r7, r8)     // Catch:{ IOException | JSONException -> 0x0220 }
            java.lang.String r7 = "User-Agent"
            java.lang.String r8 = "User-Agent"
            java.lang.String r8 = r1.getRequestProperty(r8)     // Catch:{ IOException | JSONException -> 0x0220 }
            r2.mo26550a(r7, r8)     // Catch:{ IOException | JSONException -> 0x0220 }
            java.lang.String r7 = "Content-Type"
            java.lang.String r8 = "Content-Type"
            java.lang.String r8 = r1.getRequestProperty(r8)     // Catch:{ IOException | JSONException -> 0x0220 }
            r2.mo26550a(r7, r8)     // Catch:{ IOException | JSONException -> 0x0220 }
            int r7 = r15.f37841c     // Catch:{ IOException | JSONException -> 0x0220 }
            r1.setConnectTimeout(r7)     // Catch:{ IOException | JSONException -> 0x0220 }
            int r7 = r15.f37841c     // Catch:{ IOException | JSONException -> 0x0220 }
            r1.setReadTimeout(r7)     // Catch:{ IOException | JSONException -> 0x0220 }
            com.facebook.u r7 = com.facebook.C14697u.POST     // Catch:{ IOException | JSONException -> 0x0220 }
            if (r6 != r7) goto L_0x01c7
            r3 = 1
        L_0x01c7:
            if (r3 != 0) goto L_0x01cd
            r2.mo26549a()     // Catch:{ IOException | JSONException -> 0x0220 }
            goto L_0x0218
        L_0x01cd:
            r1.setDoOutput(r4)     // Catch:{ IOException | JSONException -> 0x0220 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0219 }
            java.io.OutputStream r4 = r1.getOutputStream()     // Catch:{ all -> 0x0219 }
            r3.<init>(r4)     // Catch:{ all -> 0x0219 }
            if (r13 == 0) goto L_0x01e4
            java.util.zip.GZIPOutputStream r0 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x01e1 }
            r0.<init>(r3)     // Catch:{ all -> 0x01e1 }
            goto L_0x01e5
        L_0x01e1:
            r15 = move-exception
            r0 = r3
            goto L_0x021a
        L_0x01e4:
            r0 = r3
        L_0x01e5:
            boolean r3 = m27288d(r15)     // Catch:{ all -> 0x0219 }
            if (r3 == 0) goto L_0x0209
            com.facebook.z r3 = new com.facebook.z     // Catch:{ all -> 0x0219 }
            android.os.Handler r4 = r15.f37839a     // Catch:{ all -> 0x0219 }
            r3.<init>(r4)     // Catch:{ all -> 0x0219 }
            r8 = 0
            r7 = r15
            r9 = r5
            r10 = r14
            r11 = r3
            r12 = r13
            m27275a(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0219 }
            int r4 = r3.f38100b     // Catch:{ all -> 0x0219 }
            java.util.Map<com.facebook.GraphRequest, com.facebook.ac> r9 = r3.f38099a     // Catch:{ all -> 0x0219 }
            com.facebook.aa r3 = new com.facebook.aa     // Catch:{ all -> 0x0219 }
            long r10 = (long) r4     // Catch:{ all -> 0x0219 }
            r6 = r3
            r7 = r0
            r8 = r15
            r6.<init>(r7, r8, r9, r10)     // Catch:{ all -> 0x0219 }
            r0 = r3
        L_0x0209:
            r6 = r15
            r7 = r2
            r8 = r5
            r9 = r14
            r10 = r0
            r11 = r13
            m27275a(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0219 }
            r0.close()     // Catch:{ IOException | JSONException -> 0x0220 }
            r2.mo26549a()     // Catch:{ IOException | JSONException -> 0x0220 }
        L_0x0218:
            return r1
        L_0x0219:
            r15 = move-exception
        L_0x021a:
            if (r0 == 0) goto L_0x021f
            r0.close()     // Catch:{ IOException | JSONException -> 0x0220 }
        L_0x021f:
            throw r15     // Catch:{ IOException | JSONException -> 0x0220 }
        L_0x0220:
            r15 = move-exception
            goto L_0x0224
        L_0x0222:
            r15 = move-exception
            r1 = r0
        L_0x0224:
            com.facebook.internal.C14277aa.m29271a(r1)
            com.facebook.k r0 = new com.facebook.k
            java.lang.String r1 = "could not construct request body"
            r0.<init>(r1, r15)
            throw r0
        L_0x022f:
            r15 = move-exception
            com.facebook.k r0 = new com.facebook.k
            java.lang.String r1 = "could not construct URL for request"
            r0.<init>(r1, r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.m27284c(com.facebook.s):java.net.HttpURLConnection");
    }

    /* renamed from: a */
    private static List<C14696t> m27272a(GraphRequest... graphRequestArr) {
        C14283ab.m29306a((Object) graphRequestArr, "requests");
        return m27271a((Collection<GraphRequest>) Arrays.asList(graphRequestArr));
    }

    /* renamed from: a */
    private String m27268a(String str, Boolean bool) {
        if (!bool.booleanValue() && this.f35222d == C14697u.POST) {
            return str;
        }
        Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f35228j.keySet()) {
            Object obj = this.f35228j.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (m27281a(obj)) {
                buildUpon.appendQueryParameter(str2, m27283b(obj).toString());
            } else if (this.f35222d == C14697u.GET) {
                throw new IllegalArgumentException(C2240a.m6773a(Locale.US, "Unsupported parameter type for GET request: %s", new Object[]{obj.getClass().getSimpleName()}));
            }
        }
        return buildUpon.toString();
    }

    /* renamed from: a */
    public static List<C14696t> m27270a(HttpURLConnection httpURLConnection, C14564s sVar) {
        List<C14696t> a = C14696t.m30057a(httpURLConnection, sVar);
        C14277aa.m29271a((URLConnection) httpURLConnection);
        int size = sVar.size();
        if (size == a.size()) {
            m27276a(sVar, a);
            C13607b.m27474a().mo25463b();
            return a;
        }
        throw new C14457k(C2240a.m6773a(Locale.US, "Received %d responses while expecting %d", new Object[]{Integer.valueOf(a.size()), Integer.valueOf(size)}));
    }

    /* renamed from: a */
    public static GraphRequest m27265a(AccessToken accessToken, String str, C13501b bVar) {
        GraphRequest graphRequest = new GraphRequest(null, str, null, null, null);
        return graphRequest;
    }

    /* renamed from: a */
    public static GraphRequest m27266a(AccessToken accessToken, String str, JSONObject jSONObject, C13501b bVar) {
        GraphRequest graphRequest = new GraphRequest(accessToken, str, null, C14697u.POST, bVar);
        graphRequest.f35224f = jSONObject;
        return graphRequest;
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, C14697u uVar, C13501b bVar) {
        this(accessToken, str, bundle, uVar, bVar, null);
    }

    private GraphRequest(AccessToken accessToken, String str, Bundle bundle, C14697u uVar, C13501b bVar, String str2) {
        this.f35227i = true;
        this.f35221c = accessToken;
        this.f35223e = str;
        this.f35231m = null;
        mo25313a(bVar);
        if (this.f35233q == null || uVar == C14697u.GET) {
            if (uVar == null) {
                uVar = C14697u.GET;
            }
            this.f35222d = uVar;
            if (bundle != null) {
                this.f35228j = new Bundle(bundle);
            } else {
                this.f35228j = new Bundle();
            }
            if (this.f35231m == null) {
                this.f35231m = C14533n.m29774h();
                return;
            }
            return;
        }
        throw new C14457k("Can't change HTTP method on request with overridden URL.");
    }
}
