package com.p683ss.android.ugc.aweme.p1308ad.comment;

import android.arch.lifecycle.C0199s;
import android.view.View;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.Widget;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.BaseAdCommentWidget */
public abstract class BaseAdCommentWidget extends Widget implements C0199s<KVData> {

    /* renamed from: a */
    protected Aweme f60147a;

    /* renamed from: b */
    protected C22380t f60148b;

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.BaseAdCommentWidget$a */
    protected static final class C22334a<T extends View> {

        /* renamed from: a */
        public T f60149a;

        /* renamed from: b */
        public final int f60150b;

        public C22334a(int i) {
            this.f60150b = i;
        }

        /* renamed from: a */
        public final T mo46497a(BaseAdCommentWidget baseAdCommentWidget, C52767h<?> hVar) {
            C52711k.m112240b(baseAdCommentWidget, "thisRef");
            C52711k.m112240b(hVar, "property");
            if (this.f60149a == null) {
                T findViewById = baseAdCommentWidget.contentView.findViewById(this.f60150b);
                if (findViewById == null) {
                    C52711k.m112234a();
                }
                this.f60149a = findViewById;
            }
            T t = this.f60149a;
            if (t == null) {
                C52711k.m112237a("_value");
            }
            return t;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo46496d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Aweme mo46492a() {
        Aweme aweme = this.f60147a;
        if (aweme == null) {
            C52711k.m112237a("aweme");
        }
        return aweme;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo46494b() {
        if (this.f60147a != null) {
            return true;
        }
        return false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.dataCenter.removeObserver(this);
    }

    public void onCreate() {
        super.onCreate();
        mo46496d();
        C0199s sVar = this;
        this.dataCenter.observe("comment_aweme", sVar, true).observe("comment_params", sVar, true).observe("comment_visible", sVar, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo46495c() {
        boolean z;
        if (this.f60148b != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return "";
        }
        C22380t tVar = this.f60148b;
        if (tVar == null) {
            C52711k.m112237a("params");
        }
        String eventType = tVar.getEventType();
        C52711k.m112236a((Object) eventType, "params.eventType");
        return eventType;
    }

    /* renamed from: a */
    protected static <T extends View> C22334a<T> m55301a(int i) {
        return new C22334a<>(i);
    }

    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null) {
            String key = kVData.getKey();
            int hashCode = key.hashCode();
            if (hashCode != -1122609433) {
                if (hashCode != -31658138) {
                    if (hashCode == 278836882 && key.equals("comment_visible")) {
                        Boolean bool = (Boolean) kVData.getData();
                        if (bool != null) {
                            C52711k.m112236a((Object) bool, "kvData.getData<Boolean>() ?: return");
                            bool.booleanValue();
                        }
                    }
                } else if (key.equals("comment_params")) {
                    C22380t tVar = (C22380t) kVData.getData();
                    if (tVar != null) {
                        this.f60148b = tVar;
                    }
                }
            } else if (key.equals("comment_aweme")) {
                Aweme aweme = (Aweme) kVData.getData();
                if (aweme != null) {
                    this.f60147a = aweme;
                }
            }
        }
    }
}
