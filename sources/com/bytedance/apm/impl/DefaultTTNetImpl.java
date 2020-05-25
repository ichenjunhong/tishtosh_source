package com.bytedance.apm.impl;

import com.bytedance.apm.p501q.C9182d;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.services.apm.api.C13219b;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.ttnet.p887e.C13333g;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DefaultTTNetImpl implements IHttpService {
    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        if (inputStream != null) {
            inputStream.close();
        }
        return byteArrayOutputStream.toByteArray();
    }

    private List<C12685b> convertHeaderMap(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null && !map.isEmpty()) {
            for (Entry entry : map.entrySet()) {
                if (entry != null) {
                    arrayList.add(new C12685b((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    public C13219b doGet(String str, Map<String, String> map) throws Exception {
        URL url = new URL(str);
        StringBuilder sb = new StringBuilder();
        sb.append(url.getProtocol());
        sb.append("://");
        sb.append(url.getHost());
        C12799u execute = ((RetrofitMonitorService) C13333g.m26861a(sb.toString(), RetrofitMonitorService.class)).fetch(str, map).execute();
        return new C13219b(execute.mo23958a(), toByteArray(((TypedInput) execute.f33552b).mo9554in()));
    }

    private C13219b doUploadFiles(String str, List<File> list, Map<String, String> map) {
        return C9182d.m18227a(str, list, map);
    }

    public C13219b uploadFiles(String str, List<File> list, Map<String, String> map) throws Exception {
        return doUploadFiles(str, list, map);
    }

    public C13219b doPost(String str, byte[] bArr, Map<String, String> map) throws Exception {
        URL url = new URL(str);
        StringBuilder sb = new StringBuilder();
        sb.append(url.getProtocol());
        sb.append("://");
        sb.append(url.getHost());
        C12799u execute = ((RetrofitMonitorService) C13333g.m26861a(sb.toString(), RetrofitMonitorService.class)).report(str, new TypedByteArray("application/json; charset=utf-8", bArr, new String[0]), convertHeaderMap(map)).execute();
        return new C13219b(execute.mo23958a(), toByteArray(((TypedInput) execute.f33552b).mo9554in()));
    }
}
