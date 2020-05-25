package com.p683ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.baselib.network.http.C9841b;
import com.bytedance.frameworks.baselib.network.http.p574e.C9917l;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12743e;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.ttnet.p887e.C13333g;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.ttuploader.TTExternNetLoader;
import com.p683ss.ttuploader.TTExternNetLoaderListener;
import com.p683ss.ttuploader.TTExternRequestInfo;
import com.p683ss.ttuploader.TTExternResponseInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fh */
public final class C43831fh implements TTExternNetLoader {

    /* renamed from: a */
    private C12690b<String> f110995a;

    public final void cancelTask() {
        if (this.f110995a != null) {
            this.f110995a.cancel();
        }
    }

    /* renamed from: a */
    private static List<C12685b> m96261a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            arrayList.add(new C12685b(str, jSONObject.optString(str)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static JSONObject m96262a(List<C12685b> list) {
        if (list == null && list.size() == 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < list.size(); i++) {
            C12685b bVar = (C12685b) list.get(i);
            try {
                jSONObject.put(bVar.f33318a, bVar.f33319b);
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public final int sendRequest(TTExternRequestInfo tTExternRequestInfo, final TTExternNetLoaderListener tTExternNetLoaderListener) {
        TypedOutput typedOutput;
        TypedOutput typedOutput2;
        String url = tTExternRequestInfo.getUrl();
        if (!C9431p.m18664a(url)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                Pair a = C9917l.m19876a(url, (Map<String, String>) linkedHashMap);
                String str = (String) a.second;
                IUploadFileApi iUploadFileApi = (IUploadFileApi) C13333g.m26867b((String) a.first).mo23937a(IUploadFileApi.class);
                JSONObject requestHeader = tTExternRequestInfo.getRequestHeader();
                String str2 = "Content-Type";
                String str3 = null;
                if (requestHeader != null && !TextUtils.isEmpty(str2)) {
                    String optString = requestHeader.optString(str2);
                    str3 = TextUtils.isEmpty(optString) ? requestHeader.optString(str2.toLowerCase(), null) : optString;
                }
                List a2 = m96261a(requestHeader);
                C9841b extraInfo = tTExternRequestInfo.getExtraInfo();
                String lowerCase = tTExternRequestInfo.getMethod().toLowerCase();
                char c = 65535;
                int hashCode = lowerCase.hashCode();
                if (hashCode != 102230) {
                    if (hashCode != 111375) {
                        if (hashCode == 3446944 && lowerCase.equals("post")) {
                            c = 1;
                        }
                    } else if (lowerCase.equals("put")) {
                        c = 2;
                    }
                } else if (lowerCase.equals("get")) {
                    c = 0;
                }
                switch (c) {
                    case 0:
                        this.f110995a = iUploadFileApi.doGet(false, -1, str, linkedHashMap, a2, extraInfo);
                        break;
                    case 1:
                        byte[] data = tTExternRequestInfo.getData();
                        if (data != null) {
                            typedOutput = new TypedByteArray(str3, data, new String[0]);
                        } else {
                            TypedByteArray typedByteArray = new TypedByteArray(str3, TEVideoRecorder.FACE_BEAUTY_NULL.getBytes(), new String[0]);
                            if (TextUtils.isEmpty(str3)) {
                                a2.add(new C12685b("Content-Type", "application/unknown"));
                            }
                            typedOutput = typedByteArray;
                        }
                        this.f110995a = iUploadFileApi.postBody(-1, typedOutput, str, linkedHashMap, a2, extraInfo);
                        break;
                    case 2:
                        byte[] data2 = tTExternRequestInfo.getData();
                        if (data2 != null) {
                            typedOutput2 = new TypedByteArray(str3, data2, new String[0]);
                        } else {
                            TypedByteArray typedByteArray2 = new TypedByteArray(str3, TEVideoRecorder.FACE_BEAUTY_NULL.getBytes(), new String[0]);
                            if (TextUtils.isEmpty(str3)) {
                                a2.add(new C12685b("Content-Type", "application/unknown"));
                            }
                            typedOutput2 = typedByteArray2;
                        }
                        this.f110995a = iUploadFileApi.doPut(-1, typedOutput2, str, linkedHashMap, a2, extraInfo);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Method(");
                        sb.append(lowerCase);
                        sb.append(") is unsupported.");
                        throw new IllegalArgumentException(sb.toString());
                }
                this.f110995a.enqueue(new C12743e<String>() {
                    /* renamed from: a */
                    public final void mo19943a(C12690b<String> bVar, Throwable th) {
                        tTExternNetLoaderListener.onFailed(bVar.request().f33321b, th);
                    }

                    /* renamed from: a */
                    public final void mo19942a(C12690b<String> bVar, C12799u<String> uVar) {
                        TTExternResponseInfo tTExternResponseInfo = new TTExternResponseInfo();
                        tTExternResponseInfo.setStatusCode(uVar.mo23958a());
                        tTExternResponseInfo.setResponseBody(((String) uVar.f33552b).getBytes());
                        tTExternResponseInfo.setResponseHeader(C43831fh.m96262a(uVar.mo23959b()));
                        tTExternResponseInfo.setUrl(bVar.request().f33321b);
                        tTExternNetLoaderListener.onComplete(tTExternResponseInfo);
                    }
                });
                return 0;
            } catch (IOException unused) {
                StringBuilder sb2 = new StringBuilder("Request url(");
                sb2.append(url);
                sb2.append(") is invalid.");
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            StringBuilder sb3 = new StringBuilder("Request url(");
            sb3.append(url);
            sb3.append(") is null or empty.");
            throw new IllegalArgumentException(sb3.toString());
        }
    }
}
