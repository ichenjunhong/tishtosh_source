package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1819b;

import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryVideoContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryVideoContent.Companion;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33393ac;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33410c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35237bj;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35237bj.C35241a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.b.g */
public final class C33403g extends C33410c {

    /* renamed from: a */
    public static final C33403g f86598a = new C33403g();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.b.g$a */
    public static final class C33404a implements C35241a {
        C33404a() {
        }

        public final void onSendFailure(C11202k kVar) {
        }

        public final void onSendSuccess(C11207p pVar) {
        }

        public final void onSend(C11180b bVar, List<C11207p> list) {
            if (list != null && list.size() > 0) {
                for (C11207p pVar : list) {
                    if (pVar.getMsgType() == 30) {
                        C33403g.f86598a.mo70816a(pVar);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.b.g$b */
    public static final class C33405b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C33406h f86599a;

        /* renamed from: b */
        final /* synthetic */ String f86600b;

        public C33405b(C33406h hVar, String str) {
            this.f86599a = hVar;
            this.f86600b = str;
        }

        public final /* synthetic */ Object call() {
            Companion companion = StoryVideoContent.Companion;
            C33406h hVar = this.f86599a;
            if (hVar == null) {
                C52711k.m112234a();
            }
            C33403g.m76572a(this.f86600b, companion.obtain(hVar));
            return null;
        }
    }

    private C33403g() {
    }

    /* renamed from: b */
    public final void mo70791b(C11207p pVar) {
        C52711k.m112240b(pVar, "chatMessage");
        Object obj = this.f86617b.get(C33397b.m76551a(pVar));
        if (!(obj instanceof C33397b)) {
            obj = null;
        }
        C33397b bVar = (C33397b) obj;
        if (bVar != null) {
            bVar.f86591c = null;
        }
    }

    /* renamed from: a */
    public final C33393ac mo70778a(C11207p pVar, BaseContent baseContent) {
        if (baseContent instanceof StoryVideoContent) {
            return new C33397b(this.f86620e, (StoryVideoContent) baseContent, pVar);
        }
        C33393ac a = super.mo70778a(pVar, baseContent);
        C52711k.m112236a((Object) a, "super.obtainUploadItem(chatMessage, content)");
        return a;
    }

    /* renamed from: a */
    public static void m76572a(String str, StoryVideoContent storyVideoContent) {
        C52711k.m112240b(str, "sessionId");
        C52711k.m112240b(storyVideoContent, "storyVideoContent");
        storyVideoContent.setSendStartTime(Long.valueOf(System.currentTimeMillis()));
        C35237bj.m79649a().mo73343a(Collections.singletonList(str), Collections.singletonList(storyVideoContent), (C35241a) new C33404a(), StoryVideoContent.Companion.obtainAttachmentList(storyVideoContent));
    }

    /* renamed from: a */
    public final void mo70790a(C11207p pVar, C33396a aVar) {
        C52711k.m112240b(pVar, "chatMessage");
        C52711k.m112240b(aVar, "uploadCallback");
        Object obj = this.f86617b.get(C33397b.m76551a(pVar));
        if (!(obj instanceof C33397b)) {
            obj = null;
        }
        C33397b bVar = (C33397b) obj;
        if (bVar != null) {
            bVar.f86591c = aVar;
        }
    }
}
