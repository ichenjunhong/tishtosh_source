package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.C1506w;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.ies.uikit.base.C11079a;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11203l;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11213r;
import com.p683ss.android.ugc.aweme.framework.p1781b.C32461a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.C34002d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33519b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33521c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33521c.C33534a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33521c.C33535b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33611i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33631o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio.C33484a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio.C33485b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio.C33486c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio.widget.AudioRecordStateView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.p1823b.C33520a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo.C33655i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33374a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33440v;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1819b.C33403g.C33405b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1819b.C33406h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.selectmsg.C33707b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.view.MentionEditText.C33727e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33849j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.GroupMemberSelectActivity.C34178a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34472c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.StrangerMessageList;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1836g.C34173a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1836g.C34175b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1845j.C34389a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1845j.C34391b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35221bc;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar.C35356a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p1807im.service.p1901c.C35432b;
import com.p683ss.android.ugc.aweme.story.api.model.C46634c;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C53755c;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatPanel */
public class BaseChatPanel extends BasePanel {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f86382a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BaseChatPanel.class), "mRecyclerViewGestureDetector", "getMRecyclerViewGestureDetector()Landroid/view/GestureDetector;"))};

    /* renamed from: b */
    public final View f86383b = this.f86397p;

    /* renamed from: c */
    public final Context f86384c = this.f86397p.getContext();

    /* renamed from: d */
    public final FragmentActivity f86385d;

    /* renamed from: e */
    public final Fragment f86386e;

    /* renamed from: f */
    public final ImTextTitleBar f86387f;

    /* renamed from: g */
    public final RecyclerView f86388g;

    /* renamed from: h */
    public final WrapLinearLayoutManager f86389h;

    /* renamed from: i */
    public final DmtStatusView f86390i;

    /* renamed from: j */
    public C33519b f86391j;

    /* renamed from: k */
    public C0198r<List<C11207p>> f86392k;

    /* renamed from: l */
    public C33486c f86393l;

    /* renamed from: m */
    protected C33689r f86394m;

    /* renamed from: n */
    public boolean f86395n;

    /* renamed from: o */
    final C52668f f86396o;

    /* renamed from: p */
    public final View f86397p;

    /* renamed from: q */
    public final C33353ab f86398q;

    /* renamed from: u */
    private boolean f86399u = true;

    /* renamed from: v */
    private final AudioRecordStateView f86400v;

    /* renamed from: w */
    private final C33317f f86401w;

    /* renamed from: x */
    private C33709u f86402x;

    /* renamed from: y */
    private C33360ag f86403y;

    /* renamed from: z */
    private final C33321i f86404z;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatPanel$a */
    static final class C33312a<T> implements C0199s<List<? extends C11207p>> {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f86408a;

        /* renamed from: b */
        final /* synthetic */ C0184k f86409b;

        C33312a(BaseChatPanel baseChatPanel, C0184k kVar) {
            this.f86408a = baseChatPanel;
            this.f86409b = kVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f86408a.mo70652a((List) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatPanel$b */
    static final class C33313b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f86410a;

        C33313b(BaseChatPanel baseChatPanel) {
            this.f86410a = baseChatPanel;
        }

        public final void run() {
            this.f86410a.mo70654b(this.f86410a.f86387f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatPanel$c */
    static final class C33314c implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f86411a;

        /* renamed from: b */
        final /* synthetic */ BaseChatPanel f86412b;

        C33314c(RecyclerView recyclerView, BaseChatPanel baseChatPanel) {
            this.f86411a = recyclerView;
            this.f86412b = baseChatPanel;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (!C52711k.m112239a((Object) view, (Object) this.f86411a) || !((GestureDetector) this.f86412b.f86396o.getValue()).onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatPanel$d */
    public static final class C33315d extends C32461a {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f86413a;

        C33315d(Context context, BaseChatPanel baseChatPanel) {
            this.f86413a = baseChatPanel;
            super(context);
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 1) {
                BaseChatPanel.m76423a(this.f86413a).mo70587d();
            }
            C33849j.m77600e().mo70736a(recyclerView, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatPanel$e */
    public static final class C33316e extends C1506w {
        C33316e() {
        }

        /* renamed from: a */
        public final boolean mo5628a(C1352v vVar, C1352v vVar2, int i, int i2, int i3, int i4) {
            C52711k.m112240b(vVar, "oldHolder");
            C52711k.m112240b(vVar2, "newHolder");
            if (vVar == vVar2) {
                return super.mo5628a(vVar, vVar2, i, i2, i3, i4);
            }
            vVar.itemView.animate().cancel();
            vVar2.itemView.animate().cancel();
            vVar.itemView.animate().alpha(0.0f).setDuration(125).start();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatPanel$f */
    public final class C33317f implements C33702b {
        public C33317f() {
        }

        /* renamed from: a */
        public final void mo70668a(String str) {
            IMUser b = C34010e.m77748a().mo71964b(str);
            if (b != null) {
                String uid = b.getUid();
                if (uid != null) {
                    BaseChatPanel baseChatPanel = BaseChatPanel.this;
                    String nickName = b.getNickName();
                    C52711k.m112236a((Object) nickName, "nickName");
                    baseChatPanel.mo70651a(nickName, uid);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatPanel$g */
    public static final class C33318g implements C35356a {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f86415a;

        /* renamed from: c */
        public final void mo70671c() {
        }

        /* renamed from: a */
        public final void mo70669a() {
            this.f86415a.f86385d.onBackPressed();
        }

        /* renamed from: b */
        public final void mo70670b() {
            boolean z;
            boolean z2;
            String str;
            boolean z3;
            List<C11207p> list = (List) this.f86415a.f86392k.getValue();
            Collection collection = list;
            boolean z4 = false;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C10691a.m21533a(this.f86415a.f86384c, (int) R.string.beb).mo19066a();
                return;
            }
            if (collection == null || collection.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                str = "";
            } else {
                str = "";
                String str2 = ",";
                StringBuilder sb = new StringBuilder();
                for (C11207p pVar : list) {
                    if (pVar != null) {
                        sb.append(pVar.getMsgId());
                        sb.append(str2);
                    }
                }
                if (sb.length() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    str = sb.substring(0, sb.length() - 1);
                    C52711k.m112236a((Object) str, "msgIdBuilder.substring(0, msgIdBuilder.length - 1)");
                }
            }
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z4 = true;
            }
            if (!z4) {
                String conversationId = this.f86415a.f86398q.getConversationId();
                if (C33707b.f87417a == null) {
                    C33707b.f87417a = new HashMap<>();
                }
                HashMap<String, List<C11207p>> hashMap = C33707b.f87417a;
                if (hashMap == null) {
                    C52711k.m112234a();
                }
                hashMap.put(conversationId, list);
                C35432b bVar = new C35432b();
                bVar.f91103b = this.f86415a.f86398q.getConversationId();
                bVar.f91102a = str;
                C53755c.m114319a().mo112960d(bVar);
                this.f86415a.f86385d.finish();
            }
        }

        C33318g(BaseChatPanel baseChatPanel) {
            this.f86415a = baseChatPanel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatPanel$h */
    static final class C33319h extends C52712l implements C52670a<GestureDetector> {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f86416a;

        C33319h(BaseChatPanel baseChatPanel) {
            this.f86416a = baseChatPanel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new GestureDetector(this.f86416a.f86384c, new SimpleOnGestureListener(this) {

                /* renamed from: a */
                final /* synthetic */ C33319h f86417a;

                {
                    this.f86417a = r1;
                }

                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    C52711k.m112240b(motionEvent, "e");
                    BaseChatPanel.m76423a(this.f86417a.f86416a);
                    return super.onSingleTapConfirmed(motionEvent);
                }

                public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    if (motionEvent == null || motionEvent2 == null) {
                        return super.onFling(motionEvent, motionEvent2, f, f2);
                    }
                    float x = motionEvent.getX() - motionEvent2.getX();
                    if (motionEvent.getY() < motionEvent2.getY()) {
                        float y = motionEvent2.getY() - motionEvent.getY();
                        if (x == 0.0f) {
                            x = 1.0f;
                        }
                        if (y / Math.abs(x) > 0.65f && this.f86417a.f86416a.f86389h.mo4752m() == this.f86417a.f86416a.mo70646a().getItemCount() - 1) {
                            this.f86417a.f86416a.mo70657e();
                        }
                    }
                    return super.onFling(motionEvent, motionEvent2, f, f2);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatPanel$i */
    public static final class C33321i {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f86418a;

        C33321i(BaseChatPanel baseChatPanel) {
            this.f86418a = baseChatPanel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatPanel$j */
    static final class C33322j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f86419a;

        /* renamed from: b */
        final /* synthetic */ Intent f86420b;

        C33322j(BaseChatPanel baseChatPanel, Intent intent) {
            this.f86419a = baseChatPanel;
            this.f86420b = intent;
        }

        public final void run() {
            BaseChatPanel baseChatPanel = this.f86419a;
            Intent intent = this.f86420b;
            if (intent != null) {
                ArrayList stringArrayListExtra = intent.getStringArrayListExtra("im_edit_texts");
                boolean z = false;
                int intExtra = intent.getIntExtra("im_is_from_gallery", 0);
                int intExtra2 = intent.getIntExtra("im_height", 0);
                int intExtra3 = intent.getIntExtra("im_width", 0);
                String stringExtra = intent.getStringExtra("im_local_path");
                CharSequence stringExtra2 = intent.getStringExtra("im_type");
                if (TextUtils.equals(stringExtra2, "im_photo")) {
                    C33655i iVar = new C33655i();
                    iVar.setFromGallery(intExtra);
                    iVar.setCheckTexts(stringArrayListExtra);
                    iVar.setPath(stringExtra);
                    iVar.setHeight(intExtra2);
                    iVar.setWith(intExtra3);
                    C33440v.m76638a().mo70848a(baseChatPanel.f86398q.getConversationId(), C52575l.m112092a(iVar));
                } else {
                    if (TextUtils.equals(stringExtra2, "im_video")) {
                        String stringExtra3 = intent.getStringExtra("im_src_frame_path");
                        String stringExtra4 = intent.getStringExtra("im_video_cover");
                        String stringExtra5 = intent.getStringExtra("im_src_video_md5");
                        C33406h hVar = new C33406h();
                        hVar.setThumbnailPath(stringExtra4);
                        hVar.setFromGallery(intExtra);
                        hVar.setSrcVideoMD5(stringExtra5);
                        hVar.setCheckTexts(stringArrayListExtra);
                        hVar.setCheckPic(stringExtra3);
                        hVar.setVideoPath(stringExtra);
                        hVar.setHeight(intExtra2);
                        hVar.setWidth(intExtra3);
                        String conversationId = baseChatPanel.f86398q.getConversationId();
                        CharSequence charSequence = conversationId;
                        if (charSequence == null || charSequence.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            C0013i.m16a((Callable<TResult>) new C33405b<TResult>(hVar, conversationId));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatPanel$k */
    static final class C33323k<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f86421a;

        C33323k(BaseChatPanel baseChatPanel) {
            this.f86421a = baseChatPanel;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            if (C52711k.m112239a((Object) (Boolean) obj, (Object) Boolean.valueOf(true))) {
                this.f86421a.f86390i.mo19212f();
            } else {
                this.f86421a.f86390i.mo19209d();
            }
        }
    }

    /* renamed from: a */
    public void mo70648a(C33709u uVar) {
        C52711k.m112240b(uVar, "messageObserver");
    }

    /* renamed from: a */
    public void mo70650a(ImTextTitleBar imTextTitleBar) {
        C52711k.m112240b(imTextTitleBar, "titleBar");
    }

    /* renamed from: c */
    public void mo70655c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C33689r mo70653b() {
        return new C33689r(this.f86398q);
    }

    /* renamed from: d */
    public void mo70656d() {
        C33689r rVar = this.f86394m;
        if (rVar == null) {
            C52711k.m112237a("mMessageAdapter");
        }
        rVar.mo71714e();
    }

    /* renamed from: e */
    public final void mo70657e() {
        C33689r rVar = this.f86394m;
        if (rVar == null) {
            C52711k.m112237a("mMessageAdapter");
        }
        rVar.mo71715f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C33689r mo70646a() {
        C33689r rVar = this.f86394m;
        if (rVar == null) {
            C52711k.m112237a("mMessageAdapter");
        }
        return rVar;
    }

    public void onStop() {
        super.onStop();
        C33486c cVar = this.f86393l;
        if (cVar == null) {
            C52711k.m112237a("mAudioHelper");
        }
        cVar.mo70903a();
        this.f86403y.f86524o.mo71716g();
        C33849j.m77600e().mo70739c();
    }

    public void onPause() {
        super.onPause();
        C33689r rVar = this.f86394m;
        if (rVar == null) {
            C52711k.m112237a("mMessageAdapter");
        }
        rVar.mo71718i();
        C34173a a = C34002d.m77716a();
        if (a != null) {
            C34175b a2 = a.mo72175a(this.f86385d);
            if (a2 != null) {
                NextLiveData a3 = a2.mo72178a();
                if (a3 != null) {
                    a3.setValue(Boolean.valueOf(false));
                }
            }
        }
    }

    public void onCreate() {
        super.onCreate();
        C35190af.m79449a(this.f86398q);
        mo70655c();
        mo70654b(this.f86387f);
        C33709u uVar = this.f86402x;
        if (uVar == null) {
            C52711k.m112237a("mMessageObserver");
        }
        mo70648a(uVar);
        mo70656d();
        C33849j.m77600e();
        C33849j.m77600e();
        C34173a a = C34002d.m77716a();
        if (a != null) {
            C34175b a2 = a.mo72175a(this.f86385d);
            if (a2 != null) {
                NextLiveData c = a2.mo72180c();
                if (c != null) {
                    c.observe(this.f86385d, new C33323k(this));
                }
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C33486c cVar = this.f86393l;
        if (cVar == null) {
            C52711k.m112237a("mAudioHelper");
        }
        cVar.mo70907b();
        C33689r rVar = this.f86394m;
        if (rVar == null) {
            C52711k.m112237a("mMessageAdapter");
        }
        rVar.mo71719j();
        C33709u uVar = this.f86402x;
        if (uVar == null) {
            C52711k.m112237a("mMessageObserver");
        }
        uVar.bi_();
        C33374a.m76531a().mo70756d();
        if (this.f86386e instanceof C11079a) {
            C11079a aVar = (C11079a) this.f86386e;
            C33709u uVar2 = this.f86402x;
            if (uVar2 == null) {
                C52711k.m112237a("mMessageObserver");
            }
            aVar.mo20103b(uVar2);
        }
        C35190af.m79449a((C33353ab) null);
        C33849j.m77600e();
        C33849j.m77600e().mo70740d();
    }

    public void onResume() {
        super.onResume();
        mo70654b(this.f86387f);
        if (!this.f86399u) {
            C33849j.m77600e().mo70734a();
        }
        this.f86399u = false;
        C34173a a = C34002d.m77716a();
        if (a != null) {
            C34175b a2 = a.mo72175a(this.f86385d);
            if (a2 != null) {
                a2.mo72178a().setValue(Boolean.valueOf(true));
                if (C52711k.m112239a((Object) (Boolean) a2.mo72179b().getValue(), (Object) Boolean.valueOf(true))) {
                    a2.mo72179b().setValue(Boolean.valueOf(false));
                }
            }
        }
        C33689r rVar = this.f86394m;
        if (rVar == null) {
            C52711k.m112237a("mMessageAdapter");
        }
        rVar.mo71717h();
    }

    /* renamed from: a */
    public static final /* synthetic */ C33519b m76423a(BaseChatPanel baseChatPanel) {
        C33519b bVar = baseChatPanel.f86391j;
        if (bVar == null) {
            C52711k.m112237a("mInputView");
        }
        return bVar;
    }

    /* renamed from: b */
    public final void mo70654b(ImTextTitleBar imTextTitleBar) {
        mo70650a(imTextTitleBar);
        m76424c(imTextTitleBar);
    }

    /* renamed from: c */
    private final void m76424c(ImTextTitleBar imTextTitleBar) {
        if (this.f86398q.getSelectMsgType() == 1) {
            imTextTitleBar.setOnTitlebarClickListener(new C33318g(this));
            imTextTitleBar.setRightTextColor(C0726c.m2098c(this.f86384c, R.color.apo));
            imTextTitleBar.setLeftIcon((int) R.drawable.azi);
            imTextTitleBar.setRightText((int) R.string.bg2);
            mo70652a((List) this.f86392k.getValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo70649a(StrangerMessageList strangerMessageList) {
        C52711k.m112240b(strangerMessageList, "data");
        C33689r rVar = this.f86394m;
        if (rVar == null) {
            C52711k.m112237a("mMessageAdapter");
        }
        rVar.mo71710a(strangerMessageList.toChatMessages());
    }

    /* renamed from: a */
    public final void mo70652a(List<C11207p> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View rightView = this.f86387f.getRightView();
            C52711k.m112236a((Object) rightView, "mTitleBar.rightView");
            rightView.setAlpha(0.34f);
            C35221bc.m79616b(this.f86387f.getRightView());
            return;
        }
        View rightView2 = this.f86387f.getRightView();
        C52711k.m112236a((Object) rightView2, "mTitleBar.rightView");
        rightView2.setAlpha(1.0f);
        C35221bc.m79614a(this.f86387f.getRightView());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo70651a(String str, String str2) {
        C52711k.m112240b(str, "nickname");
        C52711k.m112240b(str2, "uid");
        C33519b bVar = this.f86391j;
        if (bVar == null) {
            C52711k.m112237a("mInputView");
        }
        bVar.mo70582a(str, str2);
    }

    /* renamed from: a */
    public void mo70647a(int i, int i2, Intent intent) {
        Serializable serializable;
        Serializable serializable2;
        if (i2 == -1 && i == 220) {
            if (intent != null) {
                Serializable serializableExtra = intent.getSerializableExtra("extra_story_detail_params");
                if (serializableExtra != null) {
                    if (serializableExtra != null) {
                        boolean z = ((C46634c) serializableExtra).storyState;
                        Iterator it = C34391b.f88756b.iterator();
                        while (it.hasNext()) {
                            C34389a aVar = (C34389a) it.next();
                            if (aVar != null) {
                                aVar.mo71712a(z, (String) C34391b.f88755a.get(aVar));
                                C34391b.m78320a(aVar);
                            }
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.story.api.model.DetailParams");
                    }
                }
            }
        } else if (i2 == 7 && i == 6) {
            this.f86388g.postDelayed(new C33322j(this, intent), 300);
        } else if (i == 2001) {
            if (intent != null) {
                serializable2 = intent.getSerializableExtra("extra_choose_result");
            } else {
                serializable2 = null;
            }
            if (!(serializable2 instanceof C34472c)) {
                serializable2 = null;
            }
            C34472c cVar = (C34472c) serializable2;
            if (i2 == 2012 && cVar != null) {
                C33520a.m76820a(this.f86385d, this.f86398q.getConversationId(), cVar);
            }
        } else if (i == 2002) {
            if (intent != null) {
                serializable = intent.getSerializableExtra("extra_choose_result");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof C34472c)) {
                serializable = null;
            }
            C34472c cVar2 = (C34472c) serializable;
            if (i2 == 2012) {
                if (cVar2 != null) {
                    C33520a.m76820a(this.f86385d, this.f86398q.getConversationId(), cVar2);
                }
            } else if (cVar2 != null) {
                C33520a.m76819a(this.f86385d, cVar2);
            }
        }
    }

    public BaseChatPanel(C0184k kVar, View view, C33353ab abVar) {
        C33519b bVar;
        C52711k.m112240b(kVar, "parent");
        C52711k.m112240b(view, "rootView");
        C52711k.m112240b(abVar, "sessionInfo");
        super(kVar);
        this.f86397p = view;
        this.f86398q = abVar;
        Context context = this.f86384c;
        if (context != null) {
            this.f86385d = (FragmentActivity) context;
            this.f86386e = (Fragment) kVar;
            View findViewById = this.f86397p.findViewById(R.id.sr);
            C52711k.m112236a((Object) findViewById, "rootView.findViewById(R.id.chat_title_layout)");
            this.f86387f = (ImTextTitleBar) findViewById;
            View findViewById2 = this.f86397p.findViewById(R.id.ca2);
            C52711k.m112236a((Object) findViewById2, "rootView.findViewById(R.id.recycle_view)");
            this.f86388g = (RecyclerView) findViewById2;
            this.f86389h = new WrapLinearLayoutManager(this.f86384c);
            View findViewById3 = this.f86397p.findViewById(R.id.gb);
            C52711k.m112236a((Object) findViewById3, "rootView.findViewById(R.id.arsv_state)");
            this.f86400v = (AudioRecordStateView) findViewById3;
            View findViewById4 = this.f86397p.findViewById(R.id.f7b);
            C52711k.m112236a((Object) findViewById4, "rootView.findViewById(R.id.view_loading)");
            this.f86390i = (DmtStatusView) findViewById4;
            C0198r<List<C11207p>> rVar = new C0198r<>();
            rVar.observe(kVar, new C33312a(this, kVar));
            this.f86392k = rVar;
            this.f86401w = new C33317f();
            this.f86395n = true;
            this.f86396o = C52732g.m112285a(new C33319h(this));
            this.f86404z = new C33321i(this);
            ViewGroup viewGroup = (ViewGroup) this.f86397p.findViewById(R.id.au5);
            if (C33229c.f86227e.mo70573f() == 1 || C33229c.f86227e.mo70573f() == 2) {
                viewGroup.removeView(this.f86397p.findViewById(R.id.e6q));
                View view2 = this.f86397p;
                if (view2 != null) {
                    C33521c a = C33521c.m76821a((ViewGroup) view2, this.f86398q);
                    C52711k.m112236a((Object) a, "InputView.inject(rootVie…s ViewGroup, sessionInfo)");
                    bVar = a;
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                }
            } else {
                viewGroup.removeView(this.f86397p.findViewById(R.id.e6p));
                View view3 = this.f86397p;
                if (view3 != null) {
                    C33611i a2 = C33611i.m76998a((ViewGroup) view3, this.f86398q);
                    C52711k.m112236a((Object) a2, "InputViewForAbTest.injec…s ViewGroup, sessionInfo)");
                    bVar = a2;
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            this.f86391j = bVar;
            C33486c cVar = new C33486c();
            C33485b a3 = C33485b.m76737a();
            C52711k.m112236a((Object) a3, "AudioCenter.inst()");
            a3.f86770a = new C33484a();
            C33519b bVar2 = this.f86391j;
            if (bVar2 == null) {
                C52711k.m112237a("mInputView");
            }
            cVar.mo70905a(bVar2.mo70588e(), this.f86400v);
            this.f86393l = cVar;
            C33689r b = mo70653b();
            b.setHasStableIds(true);
            C33486c cVar2 = this.f86393l;
            if (cVar2 == null) {
                C52711k.m112237a("mAudioHelper");
            }
            b.mo71707a(cVar2);
            b.f87370o = this.f86401w;
            b.mo71705a(this.f86392k);
            this.f86394m = b;
            String conversationId = this.f86398q.getConversationId();
            C33689r rVar2 = this.f86394m;
            if (rVar2 == null) {
                C52711k.m112237a("mMessageAdapter");
            }
            C33709u uVar = new C33709u(conversationId, rVar2);
            uVar.f87426d = new C33313b(this);
            this.f86402x = uVar;
            RecyclerView recyclerView = this.f86388g;
            recyclerView.setClickable(true);
            C33316e eVar = new C33316e();
            eVar.f5184m = false;
            recyclerView.setItemAnimator(eVar);
            WrapLinearLayoutManager wrapLinearLayoutManager = this.f86389h;
            wrapLinearLayoutManager.mo4732b(true);
            recyclerView.setLayoutManager(wrapLinearLayoutManager);
            recyclerView.setVerticalScrollBarEnabled(true);
            recyclerView.setScrollBarStyle(33554432);
            C33689r rVar3 = this.f86394m;
            if (rVar3 == null) {
                C52711k.m112237a("mMessageAdapter");
            }
            recyclerView.setAdapter(rVar3);
            recyclerView.requestDisallowInterceptTouchEvent(true);
            recyclerView.setOnTouchListener(new C33314c(recyclerView, this));
            recyclerView.mo4801a((C1340m) new C33315d(this.f86384c, this));
            C33849j.m77600e().mo70735a(recyclerView);
            this.f86390i.setBuilder(C10719a.m21676a(this.f86384c).mo19223a());
            C33519b bVar3 = this.f86391j;
            if (bVar3 == null) {
                C52711k.m112237a("mInputView");
            }
            bVar3.mo70579a((C33535b) new C33535b(this) {

                /* renamed from: a */
                final /* synthetic */ BaseChatPanel f86405a;

                {
                    this.f86405a = r1;
                }

                /* renamed from: a */
                public final void mo70663a(int i) {
                    if (i == 0) {
                        if (this.f86405a.f86427s && !this.f86405a.f86395n && this.f86405a.f86398q.isGroupChat()) {
                            BaseChatPanel.m76423a(this.f86405a).mo70584b(4);
                        }
                        BaseChatPanel baseChatPanel = this.f86405a;
                        if (baseChatPanel.f86388g.getLayoutManager() instanceof LinearLayoutManager) {
                            C1332i layoutManager = baseChatPanel.f86388g.getLayoutManager();
                            if (layoutManager != null) {
                                if (layoutManager != null) {
                                    ((LinearLayoutManager) layoutManager).mo4721a(0, 0);
                                } else {
                                    throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                                }
                            }
                        }
                        C33849j.m77600e().mo70737a(this.f86405a.f86388g, true);
                        return;
                    }
                    C33849j.m77600e().mo70737a(this.f86405a.f86388g, false);
                }
            });
            if (this.f86391j == null) {
                C52711k.m112237a("mInputView");
            }
            new C33631o(this) {

                /* renamed from: a */
                final /* synthetic */ BaseChatPanel f86406a;

                {
                    this.f86406a = r1;
                }

                public final void onClick(View view) {
                    super.onClick(view);
                    C33849j.m77600e().mo70737a(this.f86406a.f86388g, true);
                }
            };
            C33519b bVar4 = this.f86391j;
            if (bVar4 == null) {
                C52711k.m112237a("mInputView");
            }
            bVar4.mo70580a((C33727e) new C33727e(this) {

                /* renamed from: a */
                final /* synthetic */ BaseChatPanel f86407a;

                /* renamed from: a */
                public final void mo70665a() {
                    C11180b a = C11182d.m22641a().mo20658a(this.f86407a.f86398q.getConversationId());
                    if (this.f86407a.f86398q.isGroupChat()) {
                        C52711k.m112236a((Object) a, "conversation");
                        if (a.getMemberCount() > 1) {
                            BaseChatPanel.m76423a(this.f86407a).mo70587d();
                            C34178a.m78000a(this.f86407a.f86385d, 6, this.f86407a.f86398q.getConversationId(), 223);
                        }
                    }
                }

                {
                    this.f86407a = r1;
                }
            });
            FragmentActivity fragmentActivity = this.f86385d;
            C52711k.m112240b(fragmentActivity, "activity");
            C0209x a4 = C0214z.m440a(fragmentActivity).mo359a(ReadStateViewModel.class);
            C52711k.m112236a((Object) a4, "ViewModelProviders.of(ac…ateViewModel::class.java)");
            ReadStateViewModel readStateViewModel = (ReadStateViewModel) a4;
            C33353ab abVar2 = this.f86398q;
            C33709u uVar2 = this.f86402x;
            if (uVar2 == null) {
                C52711k.m112237a("mMessageObserver");
            }
            C11213r rVar4 = uVar2.f87424b;
            C52711k.m112236a((Object) rVar4, "mMessageObserver.messageModel");
            C52711k.m112240b(abVar2, "sessionInfo");
            C52711k.m112240b(rVar4, "messageModel");
            readStateViewModel.f86457b.mo70862b().clear();
            readStateViewModel.f86457b.mo70863c().setValue(null);
            C33449f fVar = readStateViewModel.f86457b;
            C52711k.m112240b(abVar2, "<set-?>");
            fVar.f86694c = abVar2;
            C33449f fVar2 = readStateViewModel.f86457b;
            C52711k.m112240b(rVar4, "<set-?>");
            fVar2.f86693b = rVar4;
            C11472i.m23483a().mo21113a(rVar4.f30222b, (C11203l) readStateViewModel);
            C0184k kVar2 = this.f86386e;
            C52711k.m112240b(kVar2, "lifecycleOwner");
            kVar2.getLifecycle().mo324a(readStateViewModel);
            kVar2.getLifecycle().mo324a(readStateViewModel.mo70685b());
            kVar2.getLifecycle().mo324a(readStateViewModel.mo70686c());
            C33689r rVar5 = this.f86394m;
            if (rVar5 == null) {
                C52711k.m112237a("mMessageAdapter");
            }
            rVar5.mo70693a((C33683o) readStateViewModel);
            C33519b bVar5 = this.f86391j;
            if (bVar5 == null) {
                C52711k.m112237a("mInputView");
            }
            bVar5.mo70578a((C33534a) readStateViewModel);
            View view4 = this.f86383b;
            RecyclerView recyclerView2 = this.f86388g;
            C33689r rVar6 = this.f86394m;
            if (rVar6 == null) {
                C52711k.m112237a("mMessageAdapter");
            }
            this.f86403y = new C33360ag(view4, recyclerView2, rVar6);
            if (this.f86386e instanceof C11079a) {
                C11079a aVar = (C11079a) this.f86386e;
                C33709u uVar3 = this.f86402x;
                if (uVar3 == null) {
                    C52711k.m112237a("mMessageObserver");
                }
                aVar.mo20101a(uVar3);
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
