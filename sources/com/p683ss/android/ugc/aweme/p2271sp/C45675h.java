package com.p683ss.android.ugc.aweme.p2271sp;

import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import leakcanary.internal.LeakCanaryFileProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: com.ss.android.ugc.aweme.sp.h */
public final class C45675h {
    /* renamed from: a */
    private static void m99439a(byte[] bArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (bArr == null) {
            xmlSerializer.startTag(null, TEVideoRecorder.FACE_BEAUTY_NULL);
            xmlSerializer.endTag(null, TEVideoRecorder.FACE_BEAUTY_NULL);
            return;
        }
        xmlSerializer.startTag(null, "byte-array");
        if (str != null) {
            xmlSerializer.attribute(null, LeakCanaryFileProvider.f132049i, str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(r7));
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b >> 4;
            sb.append(i >= 10 ? (i + 97) - 10 : i + 48);
            byte b2 = b & 255;
            sb.append(b2 >= 10 ? (b2 + 97) - 10 : b2 + 48);
        }
        xmlSerializer.text(sb.toString());
        xmlSerializer.endTag(null, "byte-array");
    }

    /* renamed from: a */
    private static void m99440a(int[] iArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (iArr == null) {
            xmlSerializer.startTag(null, TEVideoRecorder.FACE_BEAUTY_NULL);
            xmlSerializer.endTag(null, TEVideoRecorder.FACE_BEAUTY_NULL);
            return;
        }
        xmlSerializer.startTag(null, "int-array");
        if (str != null) {
            xmlSerializer.attribute(null, LeakCanaryFileProvider.f132049i, str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(r5));
        for (int num : iArr) {
            xmlSerializer.startTag(null, "item");
            xmlSerializer.attribute(null, "value", Integer.toString(num));
            xmlSerializer.endTag(null, "item");
        }
        xmlSerializer.endTag(null, "int-array");
    }

    /* renamed from: a */
    public static final Object m99433a(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 2) {
            if (eventType == 3) {
                StringBuilder sb = new StringBuilder("Unexpected end tag at: ");
                sb.append(xmlPullParser.getName());
                throw new XmlPullParserException(sb.toString());
            } else if (eventType != 4) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    throw new XmlPullParserException("Unexpected end of document");
                }
            } else {
                StringBuilder sb2 = new StringBuilder("Unexpected text: ");
                sb2.append(xmlPullParser.getText());
                throw new XmlPullParserException(sb2.toString());
            }
        }
        return m99441b(xmlPullParser, strArr);
    }

    /* renamed from: b */
    private static final Object m99441b(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        int next;
        Object obj = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, LeakCanaryFileProvider.f132049i);
        String name = xmlPullParser.getName();
        if (!name.equals(TEVideoRecorder.FACE_BEAUTY_NULL)) {
            if (name.equals("string")) {
                String str = "";
                while (true) {
                    int next2 = xmlPullParser.next();
                    if (next2 == 1) {
                        throw new XmlPullParserException("Unexpected end of document in <string>");
                    } else if (next2 == 3) {
                        if (xmlPullParser.getName().equals("string")) {
                            strArr[0] = attributeValue;
                            return str;
                        }
                        StringBuilder sb = new StringBuilder("Unexpected end tag in <string>: ");
                        sb.append(xmlPullParser.getName());
                        throw new XmlPullParserException(sb.toString());
                    } else if (next2 == 4) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(xmlPullParser.getText());
                        str = sb2.toString();
                    } else if (next2 == 2) {
                        StringBuilder sb3 = new StringBuilder("Unexpected start tag in <string>: ");
                        sb3.append(xmlPullParser.getName());
                        throw new XmlPullParserException(sb3.toString());
                    }
                }
            } else if (name.equals("int")) {
                obj = Integer.valueOf(Integer.parseInt(xmlPullParser.getAttributeValue(null, "value")));
            } else if (name.equals("long")) {
                obj = Long.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("float")) {
                obj = Float.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("double")) {
                obj = Double.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("boolean")) {
                obj = Boolean.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("int-array")) {
                xmlPullParser.next();
                int[] d = m99444d(xmlPullParser, "int-array", strArr);
                strArr[0] = attributeValue;
                return d;
            } else if (name.equals("map")) {
                xmlPullParser.next();
                HashMap a = m99434a(xmlPullParser, "map", strArr);
                strArr[0] = attributeValue;
                return a;
            } else if (name.equals("list")) {
                xmlPullParser.next();
                ArrayList b = m99442b(xmlPullParser, "list", strArr);
                strArr[0] = attributeValue;
                return b;
            } else if (name.equals("set")) {
                xmlPullParser.next();
                HashSet c = m99443c(xmlPullParser, "set", strArr);
                strArr[0] = attributeValue;
                return c;
            } else {
                StringBuilder sb4 = new StringBuilder("Unknown tag: ");
                sb4.append(name);
                throw new XmlPullParserException(sb4.toString());
            }
        }
        do {
            next = xmlPullParser.next();
            if (next == 1) {
                StringBuilder sb5 = new StringBuilder("Unexpected end of document in <");
                sb5.append(name);
                sb5.append(">");
                throw new XmlPullParserException(sb5.toString());
            } else if (next == 3) {
                if (xmlPullParser.getName().equals(name)) {
                    strArr[0] = attributeValue;
                    return obj;
                }
                StringBuilder sb6 = new StringBuilder("Unexpected end tag in <");
                sb6.append(name);
                sb6.append(">: ");
                sb6.append(xmlPullParser.getName());
                throw new XmlPullParserException(sb6.toString());
            } else if (next == 4) {
                StringBuilder sb7 = new StringBuilder("Unexpected text in <");
                sb7.append(name);
                sb7.append(">: ");
                sb7.append(xmlPullParser.getName());
                throw new XmlPullParserException(sb7.toString());
            }
        } while (next != 2);
        StringBuilder sb8 = new StringBuilder("Unexpected start tag in <");
        sb8.append(name);
        sb8.append(">: ");
        sb8.append(xmlPullParser.getName());
        throw new XmlPullParserException(sb8.toString());
    }

    /* renamed from: a */
    private static void m99436a(List list, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (list == null) {
            xmlSerializer.startTag(null, TEVideoRecorder.FACE_BEAUTY_NULL);
            xmlSerializer.endTag(null, TEVideoRecorder.FACE_BEAUTY_NULL);
            return;
        }
        xmlSerializer.startTag(null, "list");
        if (str != null) {
            xmlSerializer.attribute(null, LeakCanaryFileProvider.f132049i, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m99435a(list.get(i), (String) null, xmlSerializer);
        }
        xmlSerializer.endTag(null, "list");
    }

    /* renamed from: b */
    private static ArrayList m99442b(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayList.add(m99441b(xmlPullParser, strArr));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return arrayList;
                }
                StringBuilder sb = new StringBuilder("Expected ");
                sb.append(str);
                sb.append(" end tag at: ");
                sb.append(xmlPullParser.getName());
                throw new XmlPullParserException(sb.toString());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        StringBuilder sb2 = new StringBuilder("Document ended before ");
        sb2.append(str);
        sb2.append(" end tag");
        throw new XmlPullParserException(sb2.toString());
    }

    /* renamed from: c */
    private static HashSet m99443c(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        HashSet hashSet = new HashSet();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                hashSet.add(m99441b(xmlPullParser, strArr));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashSet;
                }
                StringBuilder sb = new StringBuilder("Expected ");
                sb.append(str);
                sb.append(" end tag at: ");
                sb.append(xmlPullParser.getName());
                throw new XmlPullParserException(sb.toString());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        StringBuilder sb2 = new StringBuilder("Document ended before ");
        sb2.append(str);
        sb2.append(" end tag");
        throw new XmlPullParserException(sb2.toString());
    }

    /* renamed from: a */
    private static HashMap m99434a(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        HashMap hashMap = new HashMap();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                Object b = m99441b(xmlPullParser, strArr);
                if (strArr[0] != null) {
                    hashMap.put(strArr[0], b);
                } else {
                    StringBuilder sb = new StringBuilder("Map value without name attribute: ");
                    sb.append(xmlPullParser.getName());
                    throw new XmlPullParserException(sb.toString());
                }
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashMap;
                }
                StringBuilder sb2 = new StringBuilder("Expected ");
                sb2.append(str);
                sb2.append(" end tag at: ");
                sb2.append(xmlPullParser.getName());
                throw new XmlPullParserException(sb2.toString());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        StringBuilder sb3 = new StringBuilder("Document ended before ");
        sb3.append(str);
        sb3.append(" end tag");
        throw new XmlPullParserException(sb3.toString());
    }

    /* renamed from: d */
    private static int[] m99444d(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        try {
            int[] iArr = new int[Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"))];
            int i = 0;
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            iArr[i] = Integer.parseInt(xmlPullParser.getAttributeValue(null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("Expected item tag at: ");
                        sb.append(xmlPullParser.getName());
                        throw new XmlPullParserException(sb.toString());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return iArr;
                    }
                    if (xmlPullParser.getName().equals("item")) {
                        i++;
                    } else {
                        StringBuilder sb2 = new StringBuilder("Expected ");
                        sb2.append(str);
                        sb2.append(" end tag at: ");
                        sb2.append(xmlPullParser.getName());
                        throw new XmlPullParserException(sb2.toString());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            StringBuilder sb3 = new StringBuilder("Document ended before ");
            sb3.append(str);
            sb3.append(" end tag");
            throw new XmlPullParserException(sb3.toString());
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in byte-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in byte-array");
        }
    }

    /* renamed from: a */
    private static void m99435a(Object obj, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        String str2;
        if (obj == null) {
            xmlSerializer.startTag(null, TEVideoRecorder.FACE_BEAUTY_NULL);
            if (str != null) {
                xmlSerializer.attribute(null, LeakCanaryFileProvider.f132049i, str);
            }
            xmlSerializer.endTag(null, TEVideoRecorder.FACE_BEAUTY_NULL);
        } else if (obj instanceof String) {
            xmlSerializer.startTag(null, "string");
            if (str != null) {
                xmlSerializer.attribute(null, LeakCanaryFileProvider.f132049i, str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag(null, "string");
        } else {
            if (obj instanceof Integer) {
                str2 = "int";
            } else if (obj instanceof Long) {
                str2 = "long";
            } else if (obj instanceof Float) {
                str2 = "float";
            } else if (obj instanceof Double) {
                str2 = "double";
            } else if (obj instanceof Boolean) {
                str2 = "boolean";
            } else if (obj instanceof byte[]) {
                m99439a((byte[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof int[]) {
                m99440a((int[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof Map) {
                m99437a((Map) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof List) {
                m99436a((List) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof Set) {
                m99438a((Set) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof CharSequence) {
                xmlSerializer.startTag(null, "string");
                if (str != null) {
                    xmlSerializer.attribute(null, LeakCanaryFileProvider.f132049i, str);
                }
                xmlSerializer.text(obj.toString());
                xmlSerializer.endTag(null, "string");
                return;
            } else {
                StringBuilder sb = new StringBuilder("writeValueXml: unable to write value ");
                sb.append(obj);
                throw new RuntimeException(sb.toString());
            }
            xmlSerializer.startTag(null, str2);
            if (str != null) {
                xmlSerializer.attribute(null, LeakCanaryFileProvider.f132049i, str);
            }
            xmlSerializer.attribute(null, "value", obj.toString());
            xmlSerializer.endTag(null, str2);
        }
    }

    /* renamed from: a */
    public static final void m99437a(Map map, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (map == null) {
            xmlSerializer.startTag(null, TEVideoRecorder.FACE_BEAUTY_NULL);
            xmlSerializer.endTag(null, TEVideoRecorder.FACE_BEAUTY_NULL);
            return;
        }
        xmlSerializer.startTag(null, "map");
        if (str != null) {
            xmlSerializer.attribute(null, LeakCanaryFileProvider.f132049i, str);
        }
        for (Entry entry : map.entrySet()) {
            m99435a(entry.getValue(), (String) entry.getKey(), xmlSerializer);
        }
        xmlSerializer.endTag(null, "map");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Set, code=java.util.Set<java.lang.Object>, for r2v0, types: [java.util.Set<java.lang.Object>, java.util.Set] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m99438a(java.util.Set<java.lang.Object> r2, java.lang.String r3, org.xmlpull.v1.XmlSerializer r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = 0
            if (r2 != 0) goto L_0x000e
            java.lang.String r2 = "null"
            r4.startTag(r0, r2)
            java.lang.String r2 = "null"
            r4.endTag(r0, r2)
            return
        L_0x000e:
            java.lang.String r1 = "set"
            r4.startTag(r0, r1)
            if (r3 == 0) goto L_0x001a
            java.lang.String r1 = "name"
            r4.attribute(r0, r1, r3)
        L_0x001a:
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x002c
            java.lang.Object r3 = r2.next()
            m99435a(r3, r0, r4)
            goto L_0x001e
        L_0x002c:
            java.lang.String r2 = "set"
            r4.endTag(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p2271sp.C45675h.m99438a(java.util.Set, java.lang.String, org.xmlpull.v1.XmlSerializer):void");
    }
}
