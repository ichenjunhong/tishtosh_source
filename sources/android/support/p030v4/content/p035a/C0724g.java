package android.support.p030v4.content.p035a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.content.a.g */
public final class C0724g {
    /* renamed from: a */
    public static boolean m2085a(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static TypedValue m2087b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m2085a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(0);
    }

    /* renamed from: a */
    public static TypedArray m2082a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static String m2084a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m2085a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: a */
    public static float m2080a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!m2085a(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    /* renamed from: b */
    public static int m2086b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m2085a(xmlPullParser, str)) {
            return 0;
        }
        return typedArray.getColor(i, 0);
    }

    /* renamed from: c */
    public static int m2088c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m2085a(xmlPullParser, str)) {
            return 0;
        }
        return typedArray.getResourceId(i, 0);
    }

    /* renamed from: a */
    public static int m2081a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m2085a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    /* renamed from: a */
    public static C0711b m2083a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme, String str, int i, int i2) {
        if (m2085a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return C0711b.m2058a(typedValue.data);
            }
            C0711b a = C0711b.m2059a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (a != null) {
                return a;
            }
        }
        return C0711b.m2058a(0);
    }
}
