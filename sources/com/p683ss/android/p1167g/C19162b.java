package com.p683ss.android.p1167g;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.ss.android.g.b */
public final class C19162b {

    /* renamed from: a */
    public String f52802a;

    /* renamed from: b */
    public String f52803b;

    /* renamed from: c */
    public int f52804c;

    /* renamed from: d */
    public String f52805d;

    /* renamed from: e */
    public AssetManager f52806e;

    /* renamed from: f */
    private Resources f52807f;

    /* renamed from: com.ss.android.g.b$a */
    public static class C19163a extends Exception {
        private static final long serialVersionUID = -1169146753281314803L;

        public C19163a(String str) {
            super(str);
        }

        public C19163a(Throwable th) {
            super(th);
        }
    }

    /* renamed from: b */
    public final void mo39110b() {
        this.f52806e.close();
    }

    /* renamed from: a */
    public final Resources mo39109a() {
        if (this.f52807f == null) {
            synchronized (this) {
                if (this.f52807f == null) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    displayMetrics.setToDefaults();
                    this.f52807f = new Resources(this.f52806e, displayMetrics, null);
                }
            }
        }
        return this.f52807f;
    }

    public C19162b(File file) throws C19163a {
        String absolutePath = file.getAbsolutePath();
        try {
            this.f52806e = new AssetManager();
            int addAssetPath = this.f52806e.addAssetPath(absolutePath);
            if (addAssetPath != 0) {
                try {
                    XmlResourceParser openXmlResourceParser = this.f52806e.openXmlResourceParser(addAssetPath, "AndroidManifest.xml");
                    m46713a(openXmlResourceParser);
                    this.f52802a = absolutePath;
                    this.f52803b = m46712a(openXmlResourceParser, null, "package");
                    String a = m46712a(openXmlResourceParser, "http://schemas.android.com/apk/res/android", "versionCode");
                    if (!TextUtils.isEmpty(a) && TextUtils.isDigitsOnly(a)) {
                        this.f52804c = Integer.parseInt(a);
                    }
                    this.f52805d = m46712a(openXmlResourceParser, "http://schemas.android.com/apk/res/android", "versionName");
                    openXmlResourceParser.close();
                } catch (IOException e) {
                    throw new C19163a((Throwable) e);
                }
            } else {
                StringBuilder sb = new StringBuilder("cannot add ");
                sb.append(absolutePath);
                sb.append(" to asset manager.");
                throw new C19163a(sb.toString());
            }
        } catch (Throwable th) {
            throw new C19163a(th);
        }
    }

    /* renamed from: a */
    private static void m46713a(XmlPullParser xmlPullParser) throws C19163a {
        int next;
        do {
            try {
                next = xmlPullParser.next();
                if (next == 1) {
                    throw new C19163a("No start tag found");
                }
            } catch (XmlPullParserException e) {
                throw new C19163a((Throwable) e);
            } catch (IOException e2) {
                throw new C19163a((Throwable) e2);
            }
        } while (next != 2);
    }

    /* renamed from: a */
    private static String m46712a(XmlPullParser xmlPullParser, String str, String str2) throws C19163a {
        if ("manifest".equals(xmlPullParser.getName())) {
            String attributeValue = xmlPullParser.getAttributeValue(str, str2);
            if (attributeValue == null || attributeValue.length() == 0) {
                return "";
            }
            return attributeValue.intern();
        }
        throw new C19163a("No <manifest> tag");
    }
}
