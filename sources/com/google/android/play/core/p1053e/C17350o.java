package com.google.android.play.core.p1053e;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.play.core.e.o */
final class C17350o {

    /* renamed from: a */
    private final XmlPullParser f48853a;

    /* renamed from: b */
    private final C17357v f48854b = new C17357v();

    C17350o(XmlPullParser xmlPullParser) {
        this.f48853a = xmlPullParser;
    }

    /* renamed from: a */
    private final String m42492a(String str) {
        for (int i = 0; i < this.f48853a.getAttributeCount(); i++) {
            if (this.f48853a.getAttributeName(i).equals(str)) {
                return this.f48853a.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    private final void m42493b() throws IOException, XmlPullParserException {
        int i = 1;
        while (i != 0) {
            switch (this.f48853a.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C17355t mo33645a() {
        while (this.f48853a.next() != 1) {
            try {
                if (this.f48853a.getEventType() == 2) {
                    if (this.f48853a.getName().equals("splits")) {
                        while (this.f48853a.next() != 3) {
                            if (this.f48853a.getEventType() == 2) {
                                if (this.f48853a.getName().equals("module")) {
                                    String a = m42492a(LeakCanaryFileProvider.f132049i);
                                    if (a == null) {
                                        m42493b();
                                    } else {
                                        while (this.f48853a.next() != 3) {
                                            if (this.f48853a.getEventType() == 2) {
                                                if (this.f48853a.getName().equals("language")) {
                                                    while (this.f48853a.next() != 3) {
                                                        if (this.f48853a.getEventType() == 2) {
                                                            if (this.f48853a.getName().equals("entry")) {
                                                                String a2 = m42492a("key");
                                                                String a3 = m42492a("split");
                                                                m42493b();
                                                                if (!(a2 == null || a3 == null)) {
                                                                    C17357v vVar = this.f48854b;
                                                                    if (!vVar.f48871a.containsKey(a2)) {
                                                                        vVar.f48871a.put(a2, new HashMap());
                                                                    }
                                                                    ((Map) vVar.f48871a.get(a2)).put(a, a3);
                                                                }
                                                            } else {
                                                                m42493b();
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    m42493b();
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    m42493b();
                                }
                            }
                        }
                    } else {
                        m42493b();
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException unused) {
                return null;
            }
        }
        return this.f48854b.mo33651a();
    }
}
