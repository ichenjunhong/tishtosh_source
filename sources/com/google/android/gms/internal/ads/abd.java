package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.C15514e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@C16299uq
public final class abd {

    /* renamed from: a */
    public final C15514e f40139a;

    /* renamed from: b */
    public final abq f40140b;

    /* renamed from: c */
    public final LinkedList<abe> f40141c;

    /* renamed from: d */
    public final Object f40142d = new Object();

    /* renamed from: e */
    public final String f40143e;

    /* renamed from: f */
    public long f40144f = -1;

    /* renamed from: g */
    public long f40145g = -1;

    /* renamed from: h */
    public boolean f40146h = false;

    /* renamed from: i */
    public long f40147i = -1;

    /* renamed from: j */
    public long f40148j = 0;

    /* renamed from: k */
    public long f40149k = -1;

    /* renamed from: l */
    public long f40150l = -1;

    /* renamed from: m */
    private final String f40151m;

    public abd(C15514e eVar, abq abq, String str, String str2) {
        this.f40139a = eVar;
        this.f40140b = abq;
        this.f40143e = str;
        this.f40151m = str2;
        this.f40141c = new LinkedList<>();
    }

    /* renamed from: a */
    public final Bundle mo28584a() {
        Bundle bundle;
        synchronized (this.f40142d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f40143e);
            bundle.putString("slotid", this.f40151m);
            bundle.putBoolean("ismediation", this.f40146h);
            bundle.putLong("treq", this.f40149k);
            bundle.putLong("tresponse", this.f40150l);
            bundle.putLong("timp", this.f40145g);
            bundle.putLong("tload", this.f40147i);
            bundle.putLong("pcc", this.f40148j);
            bundle.putLong("tfetch", this.f40144f);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f40141c.iterator();
            while (it.hasNext()) {
                abe abe = (abe) it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("topen", abe.f40152a);
                bundle2.putLong("tclose", abe.f40153b);
                arrayList.add(bundle2);
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }
}
