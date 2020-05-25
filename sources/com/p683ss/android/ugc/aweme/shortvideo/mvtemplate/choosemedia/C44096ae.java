package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.util.Pair;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ae */
final /* synthetic */ class C44096ae implements Callable {

    /* renamed from: a */
    private final C44091ad f111715a;

    /* renamed from: b */
    private final boolean f111716b;

    /* renamed from: c */
    private final int f111717c;

    /* renamed from: d */
    private final List f111718d;

    C44096ae(C44091ad adVar, boolean z, int i, List list) {
        this.f111715a = adVar;
        this.f111716b = z;
        this.f111717c = i;
        this.f111718d = list;
    }

    public final Object call() {
        C44091ad adVar = this.f111715a;
        boolean z = this.f111716b;
        int i = this.f111717c;
        List<MyMediaModel> list = this.f111718d;
        if (z) {
            Iterator it = adVar.f111698a.iterator();
            while (it.hasNext()) {
                C44092a aVar = (C44092a) it.next();
                if (i == 4) {
                    aVar.f111708c.clear();
                } else if (i == 3) {
                    aVar.f111707b.clear();
                }
                if (aVar.f111707b.size() + aVar.f111708c.size() == 0) {
                    it.remove();
                    adVar.f111699b.remove(aVar.f111706a);
                }
            }
        }
        C44092a aVar2 = (C44092a) adVar.f111698a.get(0);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (MyMediaModel myMediaModel : list) {
            C44091ad.m96727a(aVar2, myMediaModel, i);
            String[] split = myMediaModel.f95383b.split(File.separator);
            String str = "";
            if (split.length >= 2) {
                str = split[split.length - 2];
            }
            C44092a aVar3 = (C44092a) adVar.f111699b.get(str);
            if (aVar3 == null) {
                aVar3 = new C44092a();
                aVar3.f111706a = str;
                arrayList.add(aVar3);
                adVar.f111699b.put(str, aVar3);
            }
            C44091ad.m96727a(aVar3, myMediaModel, i);
            hashSet.add(aVar3);
        }
        return Pair.create(arrayList, hashSet);
    }
}
