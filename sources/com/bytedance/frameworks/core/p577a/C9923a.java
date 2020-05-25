package com.bytedance.frameworks.core.p577a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.frameworks.core.a.a */
public final class C9923a {

    /* renamed from: a */
    private static C9924a f26995a;

    /* renamed from: b */
    private static boolean f26996b;

    /* renamed from: com.bytedance.frameworks.core.a.a$a */
    public interface C9924a {
        /* renamed from: c */
        boolean mo17861c();

        /* renamed from: d */
        boolean mo17862d();

        /* renamed from: e */
        boolean mo17863e();
    }

    /* renamed from: a */
    public static void m19901a(C9924a aVar) {
        f26995a = aVar;
    }

    /* renamed from: a */
    private static String m19897a(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    private static void m19900a(Uri uri, Map<String, List<String>> map) throws IOException {
        String[] split;
        if (uri != null) {
            try {
                String encodedQuery = uri.getEncodedQuery();
                if (encodedQuery != null) {
                    for (String str : encodedQuery.split("&")) {
                        int indexOf = str.indexOf("=");
                        if (indexOf >= 0) {
                            String decode = URLDecoder.decode(str.substring(0, indexOf), "UTF-8");
                            List list = (List) map.get(decode);
                            if (list == null) {
                                list = new LinkedList();
                            }
                            list.add(URLDecoder.decode(str.substring(indexOf + 1), "UTF-8"));
                            map.put(decode, list);
                        } else {
                            String decode2 = URLDecoder.decode(str, "UTF-8");
                            List list2 = (List) map.get(decode2);
                            if (list2 == null) {
                                list2 = new LinkedList();
                            }
                            list2.add("");
                            map.put(decode2, list2);
                        }
                    }
                }
            } catch (Throwable unused) {
                throw new IOException("parseUrl url is null !!!");
            }
        } else {
            throw new IOException("parseUrl url is null !!!");
        }
    }

    /* renamed from: a */
    public static String m19898a(String str, List<Pair<String, String>> list) {
        if (TextUtils.isEmpty(str) || f26995a == null || f26996b) {
            return str;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Uri parse = Uri.parse(str);
            m19900a(parse, (Map<String, List<String>>) linkedHashMap);
            LinkedList linkedList = new LinkedList();
            m19902a((Map<String, List<String>>) linkedHashMap, (List<Pair<String, List<String>>>) linkedList, "device_id");
            m19902a((Map<String, List<String>>) linkedHashMap, (List<Pair<String, List<String>>>) linkedList, "device_type");
            m19902a((Map<String, List<String>>) linkedHashMap, (List<Pair<String, List<String>>>) linkedList, "device_brand");
            m19902a((Map<String, List<String>>) linkedHashMap, (List<Pair<String, List<String>>>) linkedList, "uuid");
            m19902a((Map<String, List<String>>) linkedHashMap, (List<Pair<String, List<String>>>) linkedList, "openudid");
            String a = m19899a((List<Pair<String, List<String>>>) linkedList, false, "UTF-8");
            if (TextUtils.isEmpty(a)) {
                return str;
            }
            byte[] bytes = a.getBytes();
            byte[] a2 = EncryptorUtil.m19985a(bytes, bytes.length);
            if (a2 == null) {
                return str;
            }
            String encodeToString = Base64.encodeToString(a2, 2);
            LinkedList linkedList2 = new LinkedList();
            if (f26995a.mo17861c()) {
                LinkedList linkedList3 = new LinkedList();
                linkedList3.add(encodeToString);
                linkedList2.add(new Pair("ss_queries", linkedList3));
            }
            if (f26995a.mo17862d()) {
                list.add(new Pair("X-SS-QUERIES", m19897a(encodeToString, "UTF-8")));
            }
            if (!linkedHashMap.isEmpty()) {
                for (Entry entry : linkedHashMap.entrySet()) {
                    if (entry != null) {
                        linkedList2.add(new Pair(entry.getKey(), entry.getValue()));
                    }
                }
            }
            String a3 = m19899a((List<Pair<String, List<String>>>) linkedList2, true, "UTF-8");
            String scheme = parse.getScheme();
            String host = parse.getHost();
            int port = parse.getPort();
            String path = parse.getPath();
            String fragment = parse.getFragment();
            StringBuilder sb = new StringBuilder();
            if (host != null) {
                if (scheme != null) {
                    sb.append(scheme);
                    sb.append("://");
                }
                sb.append(host);
                if (port > 0) {
                    sb.append(':');
                    sb.append(port);
                }
            }
            if (path == null || !path.startsWith("/")) {
                sb.append('/');
            }
            if (path != null) {
                sb.append(path);
            }
            if (a3 != null) {
                sb.append('?');
                sb.append(a3);
            }
            if (fragment != null) {
                sb.append('#');
                sb.append(fragment);
            }
            return Uri.parse(sb.toString()).toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: a */
    private static boolean m19902a(Map<String, List<String>> map, List<Pair<String, List<String>>> list, String str) throws UnsupportedEncodingException {
        if (TextUtils.isEmpty(str) || !map.containsKey(str)) {
            return false;
        }
        list.add(new Pair(str, map.get(str)));
        if (!f26995a.mo17863e()) {
            map.remove(str);
        }
        return true;
    }

    /* renamed from: a */
    private static String m19899a(List<Pair<String, List<String>>> list, boolean z, String str) {
        StringBuilder sb = new StringBuilder();
        for (Pair pair : list) {
            String str2 = (String) pair.first;
            if (z) {
                str2 = m19897a((String) pair.first, str);
            }
            List<String> list2 = (List) pair.second;
            if (list2 != null && list2.size() > 0) {
                for (String str3 : list2) {
                    if (z) {
                        if (str3 != null) {
                            str3 = m19897a(str3, str);
                        } else {
                            str3 = "";
                        }
                    }
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    sb.append(str2);
                    sb.append("=");
                    sb.append(str3);
                }
            }
        }
        return sb.toString();
    }
}
