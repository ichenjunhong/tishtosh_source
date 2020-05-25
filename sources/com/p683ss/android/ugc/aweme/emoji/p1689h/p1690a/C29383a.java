package com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1689h.C29382a;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.C29396d.C29397a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.emoji.h.a.a */
public final class C29383a implements C29382a {

    /* renamed from: a */
    public static final C29384a f76960a = new C29384a(null);

    /* renamed from: com.ss.android.ugc.aweme.emoji.h.a.a$a */
    public static final class C29384a {
        private C29384a() {
        }

        public /* synthetic */ C29384a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final String mo59405b() {
        return C29397a.m69317a().f77002d;
    }

    /* renamed from: a */
    public final int mo59398a() {
        return C29397a.m69317a().mo59466b().size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r0 == null) goto L_0x0030;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo59399a(android.content.Context r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.emoji.h.a.d r0 = com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.C29396d.C29397a.m69317a()
            r1 = 0
            if (r6 != 0) goto L_0x0008
            return r1
        L_0x0008:
            com.ss.android.ugc.aweme.emoji.h.a.a.c r2 = r0.f77000b
            if (r2 == 0) goto L_0x0030
            java.lang.String r2 = r2.getMiniCover()
            if (r2 == 0) goto L_0x0030
            com.ss.android.ugc.aweme.emoji.h.a.b r0 = r0.f77001c
            if (r0 == 0) goto L_0x001c
            r3 = 0
            r4 = 2
            android.graphics.Bitmap r1 = r0.mo59454a(r2, true)
        L_0x001c:
            if (r1 == 0) goto L_0x002a
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r2 = r6.getResources()
            r0.<init>(r2, r1)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            goto L_0x002e
        L_0x002a:
            android.graphics.drawable.Drawable r0 = com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.C29396d.m69308a(r6)
        L_0x002e:
            if (r0 != 0) goto L_0x0034
        L_0x0030:
            android.graphics.drawable.Drawable r0 = com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.C29396d.m69308a(r6)
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.C29383a.mo59399a(android.content.Context):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public final boolean mo59404a(String str) {
        boolean z;
        boolean z2 = false;
        if (str != null) {
            C29396d a = C29397a.m69317a();
            if (str != null) {
                CharSequence charSequence = (CharSequence) a.mo59463a().get(str);
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return false;
                }
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo59400a(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x003c
            r1 = r6
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            if (r1 == 0) goto L_0x0012
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            if (r1 != 0) goto L_0x003c
            com.ss.android.ugc.aweme.emoji.h.a.d r1 = com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.C29396d.C29397a.m69317a()
            boolean r3 = r1.mo59467c()
            if (r3 != 0) goto L_0x0021
        L_0x001f:
            r6 = r0
            goto L_0x002e
        L_0x0021:
            com.ss.android.ugc.aweme.emoji.h.a.b r3 = r1.f77001c
            if (r3 == 0) goto L_0x001f
            java.lang.String r6 = r1.mo59465b(r6)
            r1 = 2
            android.graphics.Bitmap r6 = r3.mo59454a(r6, true)
        L_0x002e:
            if (r6 == 0) goto L_0x003c
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r5 = r5.getResources()
            r0.<init>(r5, r6)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            return r0
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.C29383a.mo59400a(android.content.Context, java.lang.String):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public final List<C29285a> mo59401a(int i, int i2) {
        C29396d a = C29397a.m69317a();
        if (!a.mo59467c()) {
            return new ArrayList<>();
        }
        List<C29285a> arrayList = new ArrayList<>();
        if (i < a.mo59466b().size()) {
            int i3 = 0;
            for (Entry entry : a.mo59466b().entrySet()) {
                if (i3 >= i && i3 < i + i2) {
                    C29285a aVar = new C29285a();
                    aVar.f76667c = (String) entry.getKey();
                    aVar.f76666b = a.mo59462a((String) entry.getValue());
                    arrayList.add(aVar);
                }
                i3++;
                if (i3 >= i + i2) {
                    break;
                }
            }
            int size = i2 - arrayList.size();
            if (size > 0) {
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(new C29285a());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List<C29285a> mo59402a(List<String> list, int i) {
        List<C29285a> list2;
        boolean z;
        if (list != null) {
            C29396d a = C29397a.m69317a();
            if (!a.mo59467c()) {
                list2 = new ArrayList<>();
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (list != null) {
                    for (String str : list) {
                        String str2 = (String) a.mo59466b().get(str);
                        CharSequence charSequence = str2;
                        if (charSequence == null || charSequence.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            linkedHashMap.put(str, str2);
                        }
                    }
                }
                if (linkedHashMap.size() < i) {
                    Map b = a.mo59466b();
                    Map linkedHashMap2 = new LinkedHashMap();
                    for (Entry entry : b.entrySet()) {
                        if (!linkedHashMap.keySet().contains(entry.getKey())) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    for (Entry entry2 : C52575l.m112129b((Iterable<? extends T>) linkedHashMap2.entrySet(), i - linkedHashMap.size())) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
                List<C29285a> arrayList = new ArrayList<>();
                for (Entry entry3 : linkedHashMap.entrySet()) {
                    C29285a aVar = new C29285a();
                    aVar.f76667c = (String) entry3.getKey();
                    aVar.f76666b = a.mo59462a((String) entry3.getValue());
                    arrayList.add(aVar);
                }
                return arrayList;
            }
        } else {
            list2 = new ArrayList<>();
        }
        return list2;
    }

    /* renamed from: a */
    public final void mo59403a(RemoteImageView remoteImageView, C29285a aVar) {
        boolean z;
        C29285a aVar2;
        if (!(remoteImageView == null || aVar == null)) {
            CharSequence charSequence = aVar.f76666b;
            boolean z2 = false;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                aVar2 = aVar;
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                C29396d a = C29397a.m69317a();
                C52711k.m112240b(remoteImageView, "view");
                C52711k.m112240b(aVar2, "emoji");
                if (a.mo59467c()) {
                    C29389b bVar = a.f77001c;
                    if (bVar != null) {
                        Bitmap a2 = bVar.mo59454a(a.mo59465b(aVar2.f76667c), false);
                        if (a2 != null) {
                            Context context = remoteImageView.getContext();
                            C52711k.m112236a((Object) context, "view.context");
                            remoteImageView.setImageDrawable(new BitmapDrawable(context.getResources(), a2));
                        }
                    }
                    StringBuilder sb = new StringBuilder("file://");
                    sb.append(aVar2.f76666b);
                    C23515d.m57677a(remoteImageView, sb.toString());
                }
            } else {
                if (aVar.f76665a > 0) {
                    z2 = true;
                }
                if (!z2) {
                    aVar = null;
                }
                if (aVar != null) {
                    remoteImageView.setImageResource(aVar.f76665a);
                }
            }
        }
    }
}
