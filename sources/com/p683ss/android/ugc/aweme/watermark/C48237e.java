package com.p683ss.android.ugc.aweme.watermark;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.festival.C43825m;
import com.p683ss.android.ugc.aweme.shortvideo.festival.C43827o;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.watermark.e */
public final class C48237e {
    /* renamed from: a */
    public static String[] m104491a(C48234c[] cVarArr, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < cVarArr.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(i);
            sb.append(".png");
            String path = new File(str, sb.toString()).getPath();
            if (cVarArr[i].mo95726a(path)) {
                arrayList.add(path);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    public static C48234c[] m104489a(int i, int i2, String str, boolean z, boolean z2, boolean z3, C48235d dVar) {
        boolean z4;
        List a = C43827o.m96260a(dVar.f121382b);
        if (C9414h.m18630a(a)) {
            return m104492b(i, i2, str, z, z2, z3, dVar);
        }
        StringBuilder sb = new StringBuilder("@");
        sb.append(str);
        String sb2 = sb.toString();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < a.size(); i3++) {
            C48234c cVar = new C48234c();
            String str2 = ((C43825m) a.get(i3)).f110986b;
            if (!z2 || C39618d.f101169j.mo74139a() != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            cVar.mo95725a(i, i2, sb2, str2, z, z4, z3, dVar);
            arrayList.add(cVar);
        }
        return (C48234c[]) arrayList.toArray(new C48234c[arrayList.size()]);
    }

    /* renamed from: b */
    private static C48234c[] m104492b(int i, int i2, String str, boolean z, boolean z2, boolean z3, C48235d dVar) {
        boolean z4;
        TypedArray obtainTypedArray = C39618d.f101160a.getResources().obtainTypedArray(R.array.av);
        int length = obtainTypedArray.length();
        int[] iArr = new int[length];
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("@");
        sb.append(str);
        String sb2 = sb.toString();
        for (int i3 = 0; i3 < length; i3++) {
            C48234c cVar = new C48234c();
            iArr[i3] = obtainTypedArray.getResourceId(i3, 0);
            int i4 = iArr[i3];
            if (!z2 || C39618d.f101169j.mo74139a() != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            Bitmap decodeResource = BitmapFactory.decodeResource(C39618d.f101160a.getResources(), i4, null);
            if (!z4) {
                cVar.mo95724a(i, i2, sb2, decodeResource, z, z3, dVar);
            } else {
                cVar.mo95723a(i, i2, sb2, decodeResource, z, z3);
            }
            arrayList.add(cVar);
        }
        obtainTypedArray.recycle();
        return (C48234c[]) arrayList.toArray(new C48234c[arrayList.size()]);
    }

    /* renamed from: a */
    public static String[] m104490a(int i, int i2, String str, String str2, String str3, boolean z, boolean z2, boolean z3, C48235d dVar) {
        return m104491a(m104489a(i, i2, str, z, z2, z3, dVar), str2, str3);
    }
}
