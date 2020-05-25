package com.p683ss.android.ugc.aweme.emoji.p1689h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.C2240a;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.emoji.R$drawable;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.emoji.h.b */
public final class C29404b implements C29382a {

    /* renamed from: a */
    public static final C29405a f77014a = new C29405a(null);

    /* renamed from: b */
    private Map<String, Integer> f77015b;

    /* renamed from: c */
    private String[] f77016c;

    /* renamed from: d */
    private List<String> f77017d;

    /* renamed from: com.ss.android.ugc.aweme.emoji.h.b$a */
    public static final class C29405a {
        private C29405a() {
        }

        public /* synthetic */ C29405a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final String mo59405b() {
        return null;
    }

    /* renamed from: a */
    public final int mo59398a() {
        m69320c();
        List<String> list = this.f77017d;
        if (list == null) {
            C52711k.m112234a();
        }
        return list.size();
    }

    /* renamed from: c */
    private final void m69320c() {
        boolean z;
        boolean z2;
        String[] strArr = this.f77016c;
        if (strArr != null) {
            if (strArr.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z = false;
                if (!z && this.f77015b == null) {
                    this.f77017d = new ArrayList();
                    String[] strArr2 = this.f77016c;
                    if (strArr2 == null) {
                        C52711k.m112234a();
                    }
                    this.f77015b = new HashMap(strArr2.length);
                    String[] strArr3 = this.f77016c;
                    if (strArr3 == null) {
                        C52711k.m112234a();
                    }
                    for (String a : strArr3) {
                        String[] a2 = C29408b.m69344a(a, "\\|", 2);
                        int parseInt = Integer.parseInt(a2[0]);
                        Locale locale = Locale.ENGLISH;
                        C52711k.m112236a((Object) locale, "Locale.ENGLISH");
                        String a3 = C2240a.m6773a(locale, "im_e%d", Arrays.copyOf(new Object[]{Integer.valueOf(parseInt)}, 1));
                        C52711k.m112236a((Object) a3, "java.lang.String.format(locale, format, *args)");
                        Map<String, Integer> map = this.f77015b;
                        if (map == null) {
                            C52711k.m112234a();
                        }
                        String str = a2[1];
                        C52711k.m112236a((Object) str, "emojiIdAndName[1]");
                        map.put(str, Integer.valueOf(m69319c(a3)));
                        List<String> list = this.f77017d;
                        if (list == null) {
                            C52711k.m112234a();
                        }
                        if (list.size() == parseInt) {
                            List<String> list2 = this.f77017d;
                            if (list2 == null) {
                                C52711k.m112234a();
                            }
                            int i = parseInt - 1;
                            String str2 = a2[1];
                            C52711k.m112236a((Object) str2, "emojiIdAndName[1]");
                            list2.set(i, str2);
                        } else {
                            List<String> list3 = this.f77017d;
                            if (list3 == null) {
                                C52711k.m112234a();
                            }
                            String str3 = a2[1];
                            C52711k.m112236a((Object) str3, "emojiIdAndName[1]");
                            list3.add(str3);
                        }
                    }
                    return;
                }
            }
        }
        z = true;
        if (!z) {
        }
    }

    /* renamed from: c */
    private static int m69319c(String str) {
        int i;
        if (str == null) {
            return -1;
        }
        Class<R$drawable> cls = R$drawable.class;
        try {
            i = cls.getField(str).getInt(cls);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException | SecurityException unused) {
            i = 0;
        }
        return i;
    }

    /* renamed from: a */
    public final Drawable mo59399a(Context context) {
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                return resources.getDrawable(R.drawable.y_);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r0 != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C29404b(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            r3.<init>()
            java.lang.String[] r0 = r3.f77016c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0016
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0017
        L_0x0016:
            r1 = 1
        L_0x0017:
            if (r1 == 0) goto L_0x0026
            android.content.res.Resources r4 = r4.getResources()
            r0 = 2131230744(0x7f080018, float:1.807755E38)
            java.lang.String[] r4 = r4.getStringArray(r0)
            r3.f77016c = r4
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.emoji.p1689h.C29404b.<init>(android.content.Context):void");
    }

    /* renamed from: b */
    private final int m69318b(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        m69320c();
        Map<String, Integer> map = this.f77015b;
        if (map == null) {
            C52711k.m112234a();
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo59404a(String str) {
        if (str == null || m69318b(str) <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final Drawable mo59400a(Context context, String str) {
        boolean z;
        if (context != null) {
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int b = m69318b(str);
                if (b > 0) {
                    return context.getResources().getDrawable(b);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final List<C29285a> mo59401a(int i, int i2) {
        String str;
        ArrayList arrayList = new ArrayList();
        int i3 = i2 + i;
        while (i < i3) {
            C29285a aVar = new C29285a();
            m69320c();
            List<String> list = this.f77017d;
            if (list == null || i >= list.size()) {
                str = "";
            } else {
                str = (String) list.get(i);
            }
            aVar.f76667c = str;
            Locale locale = Locale.ENGLISH;
            C52711k.m112236a((Object) locale, "Locale.ENGLISH");
            i++;
            String a = C2240a.m6773a(locale, "im_e%d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            C52711k.m112236a((Object) a, "java.lang.String.format(locale, format, *args)");
            aVar.f76665a = m69319c(a);
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List<C29285a> mo59402a(List<String> list, int i) {
        if (list == null) {
            return new ArrayList<>();
        }
        m69320c();
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (m69318b(str) > 0) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() < i) {
            List<String> list2 = this.f77017d;
            if (list2 == null) {
                C52711k.m112234a();
            }
            for (String str2 : list2) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
                if (arrayList.size() >= i) {
                    break;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            C29285a aVar = new C29285a();
            aVar.f76667c = str3;
            aVar.f76665a = m69318b(str3);
            arrayList2.add(aVar);
        }
        return arrayList2;
    }

    /* renamed from: a */
    public final void mo59403a(RemoteImageView remoteImageView, C29285a aVar) {
        boolean z;
        if (!(remoteImageView == null || aVar == null)) {
            if (aVar.f76665a > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                aVar = null;
            }
            if (aVar != null) {
                remoteImageView.setImageResource(aVar.f76665a);
            }
        }
    }
}
