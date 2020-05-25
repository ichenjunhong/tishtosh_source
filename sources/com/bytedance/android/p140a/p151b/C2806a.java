package com.bytedance.android.p140a.p151b;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.p140a.p141a.C2786e;
import com.bytedance.android.p140a.p141a.p146e.C2787a;
import com.bytedance.android.p140a.p141a.p146e.C2788b;
import com.bytedance.android.p140a.p141a.p148g.C2792a;
import com.bytedance.android.p140a.p141a.p149h.C2796a;
import com.bytedance.android.p140a.p141a.p150i.C2799a;
import com.bytedance.android.p140a.p141a.p150i.C2801c;
import com.bytedance.android.p140a.p141a.p150i.C2802d;
import com.bytedance.android.p140a.p151b.p152a.C2809a;
import com.bytedance.android.p140a.p151b.p153b.C2811a;
import com.bytedance.android.p140a.p151b.p153b.C2822d;
import com.bytedance.android.p140a.p151b.p153b.p154a.C2815b;
import com.bytedance.android.p140a.p151b.p155c.C2823a;
import com.bytedance.android.p140a.p151b.p155c.C2823a.C2825a;
import com.bytedance.android.p140a.p151b.p156d.C2826a;
import com.bytedance.android.p140a.p151b.p156d.C2828b;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.b.a */
public final class C2806a extends C2796a<C2823a> {

    /* renamed from: a */
    public C2823a f8390a;

    /* renamed from: b */
    private C2808a f8391b;

    /* renamed from: c */
    private C2828b f8392c;

    /* renamed from: d */
    private C2811a f8393d;

    /* renamed from: com.bytedance.android.a.b.a$a */
    public static class C2808a {

        /* renamed from: a */
        public boolean f8394a = true;

        /* renamed from: b */
        public int f8395b;

        /* renamed from: c */
        public C2809a f8396c;

        /* renamed from: d */
        public List<C2815b> f8397d;
    }

    /* renamed from: b */
    public final String mo7402b() {
        return "c2s";
    }

    /* renamed from: a */
    public final void mo7361a() {
        C2792a aVar = C2786e.m7920d().f8356c;
        JSONObject jSONObject = null;
        if (aVar != null) {
            String b = mo7402b();
            if (!TextUtils.isEmpty(b)) {
                if (aVar.f8382g == null) {
                    aVar.f8382g = new HashMap();
                }
                jSONObject = (JSONObject) aVar.f8382g.get(b);
            }
        }
        if (jSONObject != null) {
            this.f8390a.mo7397a(jSONObject);
            this.f8392c.mo7421a(this.f8390a.f8424d);
        }
    }

    /* renamed from: c */
    public final void mo7403c() {
        C2825a aVar = new C2825a();
        aVar.f8429a = this.f8391b.f8394a;
        aVar.f8430b = this.f8391b.f8395b;
        aVar.f8431c = this.f8391b.f8396c;
        this.f8390a = new C2823a(aVar);
        this.f8393d = new C2811a(this, this.f8391b.f8397d);
        this.f8392c = new C2826a(this);
    }

    /* renamed from: d */
    public final void mo7404d() {
        if (this.f8390a.f8388h) {
            List<C2788b> c = this.f8392c.mo7425c();
            if (c != null && !c.isEmpty()) {
                C2810b.m7996a().mo7408c();
                if (!C2802d.m7967a()) {
                    for (C2788b bVar : c) {
                        C2799a.m7955a(bVar);
                        bVar.f8372j++;
                        this.f8392c.mo7426c(bVar);
                    }
                    return;
                }
                for (C2788b a : c) {
                    m7976a(a, true);
                }
            }
        }
    }

    private C2806a(C2808a aVar) {
        this.f8391b = aVar;
    }

    /* renamed from: a */
    private void m7976a(C2788b bVar, boolean z) {
        int i;
        for (String str : bVar.f8368f) {
            C2799a.m7960b(bVar);
            int[] iArr = new int[4];
            if (C2801c.m7963b(str)) {
                new StringBuilder("invalid url containing %:").append(str);
                iArr[0] = 3002;
                i = 1;
            } else {
                i = 0;
            }
            if (C2801c.m7964c(str)) {
                new StringBuilder("invalid url containing %%:").append(str);
                int i2 = i + 1;
                iArr[i] = 3001;
                i = i2;
            }
            if (C2801c.m7965d(str)) {
                new StringBuilder("invalid url containing space:").append(str);
                int i3 = i + 1;
                iArr[i] = 3003;
                i = i3;
            }
            if (C2801c.m7966e(str)) {
                new StringBuilder("invalid url containing ×:").append(str);
                int i4 = i + 1;
                iArr[i] = 3004;
                i = i4;
            }
            for (int i5 = 0; i5 < i; i5++) {
                C2799a.m7956a(bVar, iArr[i5]);
            }
            C2822d a = this.f8393d.mo7409a(str, bVar);
            if (a != null) {
                StringBuilder sb = new StringBuilder("code:");
                sb.append(a.f8415a);
                sb.append(" msg:");
                sb.append(a.f8416b);
            }
        }
        if (z) {
            this.f8392c.mo7424b(bVar);
        }
    }

    /* renamed from: a */
    public final void mo7362a(View view, C2787a aVar) {
        String str;
        if (!(aVar instanceof C2788b)) {
            StringBuilder sb = new StringBuilder("incompatible event type: ");
            if (aVar != null) {
                str = aVar.getClass().getName();
            } else {
                str = TEVideoRecorder.FACE_BEAUTY_NULL;
            }
            sb.append(str);
        } else if (this.f8390a.f8388h) {
            C2788b bVar = (C2788b) aVar;
            List<String> list = bVar.f8368f;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (String str2 : list) {
                    if (!C2801c.m7962a(str2)) {
                        new StringBuilder("not a valid http url:").append(str2);
                        arrayList.add(str2);
                    }
                }
                list.removeAll(arrayList);
            }
            if (list == null || list.isEmpty()) {
                C2799a.m7956a(bVar, 1);
                return;
            }
            bVar.f8368f = list;
            C2810b.m7996a().mo7407b();
            if (!C2802d.m7967a()) {
                C2799a.m7955a(bVar);
                if (this.f8390a.f8423c) {
                    bVar.f8372j++;
                    this.f8392c.mo7422a(bVar);
                }
                return;
            }
            m7976a(bVar, false);
        }
    }
}
