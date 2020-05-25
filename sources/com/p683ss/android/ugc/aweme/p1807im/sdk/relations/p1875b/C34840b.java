package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b;

import android.icu.text.AlphabeticIndex;
import android.icu.text.AlphabeticIndex.Bucket.LabelType;
import android.icu.text.AlphabeticIndex.ImmutableIndex;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35189ae;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.b */
public class C34840b {

    /* renamed from: a */
    private static volatile C34840b f89765a;

    /* renamed from: b */
    private C34846c f89766b;

    /* renamed from: c */
    private Locale f89767c = C35189ae.m79440a();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.b$a */
    static class C34841a extends C34843c {
        public C34841a(List<Locale> list) {
            super(list);
        }

        /* renamed from: a */
        public final int mo72961a(String str, int i) {
            int c = mo72965c(str.substring(i, i + 1));
            char charAt = str.charAt(i);
            if (i != 0 && Character.isLowerCase(charAt)) {
                c += 26;
            }
            if (c != -1) {
                return c;
            }
            if (C34839a.m78907b(charAt)) {
                return ((mo72964a() + charAt) - 48) + 26;
            }
            if (C34839a.m78909c(charAt)) {
                return mo72964a() + 36;
            }
            if (C34839a.m78905a(str.substring(i))) {
                return 99;
            }
            return mo72964a() + 37;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.b$b */
    static class C34842b implements C34846c {

        /* renamed from: a */
        private boolean f89768a;

        public C34842b() {
            boolean z;
            if (TextUtils.equals(Locale.getDefault().getLanguage(), Locale.CHINESE.getLanguage()) || TextUtils.equals(Locale.getDefault().getLanguage(), Locale.ENGLISH.getLanguage())) {
                z = true;
            } else {
                z = false;
            }
            this.f89768a = z;
        }

        /* renamed from: b */
        public final String mo72963b(String str) {
            return C34839a.m78910d(str);
        }

        /* renamed from: a */
        public final String mo72962a(String str) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4 = this.f89768a;
            String str2 = "#";
            if (TextUtils.isEmpty(str)) {
                return str2;
            }
            char charAt = str.charAt(0);
            if (charAt < 19968 || charAt > 40869) {
                z = false;
            } else {
                z = true;
            }
            if (z || C34839a.m78904a(charAt)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                String upperCase = C34839a.m78908c(str).substring(0, 1).toUpperCase();
                if (TextUtils.isEmpty(upperCase)) {
                    return str.substring(0, 1).toUpperCase();
                }
                return upperCase;
            }
            if (C34839a.m78907b(charAt) || C34839a.m78909c(charAt)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 || C34839a.m78905a(str)) {
                return "#";
            }
            if (z4) {
                return "#";
            }
            return str.substring(0, 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.b$c */
    static class C34843c implements C34846c {

        /* renamed from: a */
        protected final ImmutableIndex f89769a;

        /* renamed from: b */
        private final int f89770b;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo72964a() {
            return this.f89770b + 1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo72965c(String str) {
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            int bucketIndex = this.f89769a.getBucketIndex(str);
            if (this.f89769a.getBucket(bucketIndex).getLabelType() != LabelType.NORMAL) {
                return -1;
            }
            return bucketIndex;
        }

        public C34843c(List<Locale> list) {
            AlphabeticIndex maxLabelCount = new AlphabeticIndex((Locale) list.get(0)).setMaxLabelCount(100);
            for (Locale locale : list) {
                maxLabelCount.addLabels(new Locale[]{locale});
            }
            this.f89769a = maxLabelCount.buildImmutableIndex();
            this.f89770b = this.f89769a.getBucketCount();
        }

        /* renamed from: a */
        public final String mo72962a(String str) {
            if (C34839a.m78905a(str)) {
                return "#";
            }
            int c = mo72965c(str);
            if (c < 0 || c >= mo72964a()) {
                return "#";
            }
            return this.f89769a.getBucket(c).getLabel();
        }

        /* renamed from: b */
        public final String mo72963b(String str) {
            int i;
            if (TextUtils.isEmpty(str)) {
                return "0";
            }
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            int i3 = 0;
            while (i2 < 12) {
                if (i3 < str.length()) {
                    i = mo72961a(str, i3);
                } else {
                    i = 0;
                }
                if (i < 10) {
                    sb.append("0");
                }
                if (i == 99) {
                    i3++;
                }
                sb.append(String.valueOf(i));
                i2++;
                i3++;
            }
            return sb.toString();
        }

        /* renamed from: a */
        public int mo72961a(String str, int i) {
            int c = mo72965c(str.substring(i, i + 1));
            if (c != -1) {
                return c;
            }
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                return (mo72964a() + charAt) - 65;
            }
            if (Character.isLowerCase(charAt)) {
                return ((mo72964a() + charAt) - 97) + 26;
            }
            if (C34839a.m78907b(charAt)) {
                return ((mo72964a() + charAt) - 48) + 52;
            }
            if (C34839a.m78909c(charAt)) {
                return mo72964a() + 62;
            }
            if (C34839a.m78905a(str.substring(i))) {
                return 99;
            }
            return mo72964a() + 63;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.b$d */
    static class C34844d extends C34843c {
        public C34844d(List<Locale> list) {
            super(list);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final int mo72965c(String str) {
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            int c = super.mo72965c(str);
            if (c == -1) {
                c = super.mo72965c(C34839a.m78908c(str));
            }
            return c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.b$e */
    static class C34845e extends C34843c {
        public C34845e(List<Locale> list) {
            super(list);
        }
    }

    /* renamed from: a */
    public static C34840b m78911a() {
        C34840b bVar = f89765a;
        if (bVar == null) {
            synchronized (C34840b.class) {
                if (bVar == null) {
                    try {
                        bVar = new C34840b();
                        f89765a = bVar;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return bVar;
    }

    private C34840b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f89767c);
        if (VERSION.SDK_INT <= 24) {
            this.f89766b = new C34842b();
        } else if (this.f89767c.getLanguage().equals(Locale.CHINESE.getLanguage())) {
            this.f89766b = new C34841a(arrayList);
        } else if (this.f89767c.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
            this.f89766b = new C34841a(arrayList);
        } else if (this.f89767c.getLanguage().equals(Locale.JAPANESE.getLanguage())) {
            arrayList.add(Locale.CHINESE);
            this.f89766b = new C34844d(arrayList);
        } else if (this.f89767c.getLanguage().equals(Locale.KOREAN.getLanguage())) {
            this.f89766b = new C34845e(arrayList);
        } else {
            this.f89766b = new C34843c(arrayList);
        }
    }

    /* renamed from: a */
    public final String mo72959a(String str) {
        return this.f89766b.mo72962a(str);
    }

    /* renamed from: b */
    public final String mo72960b(String str) {
        return this.f89766b.mo72963b(str);
    }
}
