package com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail;

import android.os.Bundle;
import com.bytedance.p702im.core.p706c.C11207p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.b */
public final class C34707b {

    /* renamed from: e */
    public static List<C11207p> f89403e;

    /* renamed from: f */
    public static final C34709b f89404f = new C34709b(null);

    /* renamed from: a */
    public String f89405a;

    /* renamed from: b */
    public C11207p f89406b;

    /* renamed from: c */
    public List<C11207p> f89407c;

    /* renamed from: d */
    public ArrayList<DragViewInfo> f89408d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.b$a */
    public static final class C34708a {

        /* renamed from: a */
        public final C34707b f89409a = new C34707b();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.b$b */
    public static final class C34709b {
        private C34709b() {
        }

        /* renamed from: a */
        public static void m78702a(List<C11207p> list) {
            C34707b.f89403e = list;
        }

        public /* synthetic */ C34709b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final Bundle mo72762a(Bundle bundle) {
        bundle.putString("conversation_id", this.f89405a);
        bundle.putSerializable("current_message", this.f89406b);
        bundle.putParcelableArrayList("view_info_list", this.f89408d);
        return bundle;
    }

    /* renamed from: b */
    public final C34707b mo72763b(Bundle bundle) {
        String str;
        Serializable serializable;
        ArrayList<DragViewInfo> arrayList = null;
        if (bundle != null) {
            str = bundle.getString("conversation_id");
        } else {
            str = null;
        }
        this.f89405a = str;
        if (bundle != null) {
            serializable = bundle.getSerializable("current_message");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof C11207p)) {
            serializable = null;
        }
        this.f89406b = (C11207p) serializable;
        this.f89407c = f89403e;
        if (bundle != null) {
            arrayList = bundle.getParcelableArrayList("view_info_list");
        }
        this.f89408d = arrayList;
        return this;
    }
}
