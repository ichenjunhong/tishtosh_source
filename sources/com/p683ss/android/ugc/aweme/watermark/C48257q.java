package com.p683ss.android.ugc.aweme.watermark;

import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.festival.C43825m;
import com.p683ss.android.ugc.aweme.shortvideo.festival.C43827o;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.watermark.q */
public final class C48257q {
    /* renamed from: a */
    private static C48256p[] m104539a(String str, boolean z) {
        TypedArray obtainTypedArray = C39618d.f101160a.getResources().obtainTypedArray(R.array.av);
        int length = obtainTypedArray.length();
        int[] iArr = new int[length];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            C48256p pVar = new C48256p();
            iArr[i] = obtainTypedArray.getResourceId(i, 0);
            pVar.mo95755a(str, BitmapFactory.decodeResource(C39618d.f101160a.getResources(), iArr[i], null), z);
            arrayList.add(pVar);
        }
        obtainTypedArray.recycle();
        return (C48256p[]) arrayList.toArray(new C48256p[arrayList.size()]);
    }

    /* renamed from: a */
    private static C48256p[] m104538a(String str, String str2, boolean z) {
        List a = C43827o.m96260a(str2);
        if (C9414h.m18630a(a)) {
            return m104539a(str, z);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < a.size(); i++) {
            C48256p pVar = new C48256p();
            pVar.mo95756a(str, ((C43825m) a.get(i)).f110986b, z);
            arrayList.add(pVar);
        }
        return (C48256p[]) arrayList.toArray(new C48256p[arrayList.size()]);
    }

    /* renamed from: a */
    private static String[] m104541a(C48256p[] pVarArr, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < pVarArr.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(i);
            sb.append(".png");
            String path = new File(str, sb.toString()).getPath();
            if (pVarArr[i].mo95757a(path)) {
                arrayList.add(path);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    public static String[] m104540a(String str, String str2, String str3, String str4, boolean z) {
        return m104541a(m104538a(str, str4, z), str2, str3);
    }
}
