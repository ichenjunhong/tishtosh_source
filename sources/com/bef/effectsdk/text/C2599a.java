package com.bef.effectsdk.text;

import android.graphics.Typeface;
import java.io.File;
import java.util.Hashtable;
import java.util.LinkedList;

/* renamed from: com.bef.effectsdk.text.a */
public final class C2599a {

    /* renamed from: a */
    private static Hashtable<String, Typeface> f8012a = new Hashtable<>();

    /* renamed from: b */
    private static LinkedList<String> f8013b = new LinkedList<>();

    /* renamed from: a */
    public static synchronized Typeface m7542a(String str, int i) {
        Typeface typeface;
        synchronized (C2599a.class) {
            StringBuilder sb = new StringBuilder("SYSTEM_");
            sb.append(str);
            sb.append("_");
            sb.append(i);
            String sb2 = sb.toString();
            typeface = (Typeface) f8012a.get(sb2);
            if (typeface == null) {
                try {
                    typeface = Typeface.create(str, i);
                    if (f8013b.size() >= 32) {
                        f8012a.remove((String) f8013b.removeLast());
                        System.gc();
                    }
                    f8012a.put(sb2, typeface);
                    f8013b.addFirst(sb2);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                f8013b.remove(sb2);
                f8013b.addFirst(sb2);
            }
        }
        return typeface;
    }

    /* renamed from: a */
    public static synchronized Typeface m7543a(String str, String str2) {
        Typeface typeface;
        synchronized (C2599a.class) {
            StringBuilder sb = new StringBuilder("FILE_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            String sb2 = sb.toString();
            typeface = (Typeface) f8012a.get(sb2);
            if (typeface == null) {
                try {
                    typeface = Typeface.createFromFile(new File(str, str2));
                    if (f8013b.size() >= 32) {
                        f8012a.remove((String) f8013b.removeLast());
                        System.gc();
                    }
                    f8012a.put(sb2, typeface);
                    f8013b.addFirst(sb2);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                f8013b.remove(sb2);
                f8013b.addFirst(sb2);
            }
        }
        return typeface;
    }
}
