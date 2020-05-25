package android.support.p030v4.content.p035a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p030v4.p036d.C0746a;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import com.p683ss.ttm.player.MediaPlayer;
import com.ss.android.ugc.trill.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.content.a.c */
public final class C0712c {

    /* renamed from: android.support.v4.content.a.c$a */
    public interface C0713a {
    }

    /* renamed from: android.support.v4.content.a.c$b */
    public static final class C0714b implements C0713a {

        /* renamed from: a */
        public final C0715c[] f2503a;

        public C0714b(C0715c[] cVarArr) {
            this.f2503a = cVarArr;
        }
    }

    /* renamed from: android.support.v4.content.a.c$c */
    public static final class C0715c {

        /* renamed from: a */
        public final String f2504a;

        /* renamed from: b */
        public int f2505b;

        /* renamed from: c */
        public boolean f2506c;

        /* renamed from: d */
        public String f2507d;

        /* renamed from: e */
        public int f2508e;

        /* renamed from: f */
        public int f2509f;

        public C0715c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f2504a = str;
            this.f2505b = i;
            this.f2506c = z;
            this.f2507d = str2;
            this.f2508e = i2;
            this.f2509f = i3;
        }
    }

    /* renamed from: android.support.v4.content.a.c$d */
    public static final class C0716d implements C0713a {

        /* renamed from: a */
        public final C0746a f2510a;

        /* renamed from: b */
        public final int f2511b;

        /* renamed from: c */
        public final int f2512c;

        public C0716d(C0746a aVar, int i, int i2) {
            this.f2510a = aVar;
            this.f2512c = i;
            this.f2511b = i2;
        }
    }

    /* renamed from: a */
    private static List<byte[]> m2066a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m2067a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
            }
        }
    }

    /* renamed from: a */
    public static C0713a m2064a(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlPullParser.require(2, null, "font-family");
            if (xmlPullParser.getName().equals("font-family")) {
                return m2068b(xmlPullParser, resources);
            }
            m2067a(xmlPullParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: a */
    public static List<List<byte[]>> m2065a(Resources resources, int i) {
        int i2;
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (VERSION.SDK_INT >= 21) {
                i2 = obtainTypedArray.getType(0);
            } else {
                TypedValue typedValue = new TypedValue();
                obtainTypedArray.getValue(0, typedValue);
                i2 = typedValue.type;
            }
            if (i2 == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(m2066a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m2066a(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: b */
    private static C0713a m2068b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), new int[]{R.attr.m3, R.attr.m4, R.attr.m5, R.attr.m6, R.attr.m7, R.attr.m8});
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(4);
        String string3 = obtainAttributes.getString(5);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int integer = obtainAttributes.getInteger(2, 1);
        int integer2 = obtainAttributes.getInteger(3, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m2069c(xmlPullParser, resources));
                    } else {
                        m2067a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0714b((C0715c[]) arrayList.toArray(new C0715c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m2067a(xmlPullParser);
        }
        return new C0716d(new C0746a(string, string2, string3, m2065a(resources, resourceId)), integer, integer2);
    }

    /* renamed from: c */
    private static C0715c m2069c(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        boolean z;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), new int[]{16844082, 16844083, 16844095, 16844143, 16844144, R.attr.m1, R.attr.m9, R.attr.ma, R.attr.mb, R.attr.a7y});
        int i = 8;
        if (!obtainAttributes.hasValue(8)) {
            i = 1;
        }
        int i2 = obtainAttributes.getInt(i, MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL);
        int i3 = 6;
        if (!obtainAttributes.hasValue(6)) {
            i3 = 2;
        }
        if (1 == obtainAttributes.getInt(i3, 0)) {
            z = true;
        } else {
            z = false;
        }
        int i4 = 9;
        if (!obtainAttributes.hasValue(9)) {
            i4 = 3;
        }
        int i5 = 7;
        if (!obtainAttributes.hasValue(7)) {
            i5 = 4;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = 5;
        if (!obtainAttributes.hasValue(5)) {
            i7 = 0;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m2067a(xmlPullParser);
        }
        C0715c cVar = new C0715c(string2, i2, z, string, i6, resourceId);
        return cVar;
    }
}
