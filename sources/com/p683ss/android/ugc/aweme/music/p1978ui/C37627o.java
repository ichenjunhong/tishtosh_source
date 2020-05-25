package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0210y.C0212b;
import android.os.Message;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11791ad;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11872h;
import com.bytedance.jedi.arch.C11872h.C11873a;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.base.arch.C23473i;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37646v.C37650a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23208an;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IRecordService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import p064c.p065a.p069b.C1690c;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.music.ui.o */
public abstract class C37627o extends C23526a implements C9382a, C11791ad<C23473i>, C11872h, C37650a {

    /* renamed from: a */
    public ProgressDialog f95950a;

    /* renamed from: b */
    protected C37646v f95951b;

    /* renamed from: c */
    public C23473i f95952c = new C23473i();

    /* renamed from: d */
    public C9381g f95953d = new C9381g(this);

    /* renamed from: e */
    private String f95954e;

    /* renamed from: j */
    private String f95955j;

    /* renamed from: k */
    private HashMap f95956k;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.o$a */
    static final class C37628a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C37627o f95957a;

        C37628a(C37627o oVar) {
            this.f95957a = oVar;
        }

        public final void run() {
            ProgressDialog progressDialog = this.f95957a.f95950a;
            if (progressDialog != null && progressDialog.isShowing()) {
                progressDialog.setProgress(100);
            }
            C37627o oVar = this.f95957a;
            ProgressDialog progressDialog2 = oVar.f95950a;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                progressDialog2.dismiss();
                oVar.f95950a = null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.o$b */
    public static final class C37629b implements AsyncServiceLoader {

        /* renamed from: a */
        final /* synthetic */ C37627o f95958a;

        /* renamed from: b */
        final /* synthetic */ Builder f95959b;

        /* renamed from: c */
        final /* synthetic */ MusicModel f95960c;

        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C52711k.m112240b(asyncAVService, "service");
            IRecordService recordService = asyncAVService.uiService().recordService();
            FragmentActivity activity = this.f95958a.getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity, "activity!!");
            recordService.startRecord((Activity) activity, this.f95959b.build(), this.f95960c, true);
        }

        C37629b(C37627o oVar, Builder builder, MusicModel musicModel) {
            this.f95958a = oVar;
            this.f95959b = builder;
            this.f95960c = musicModel;
        }
    }

    /* renamed from: a */
    public final void mo76949a(MusicModel musicModel) {
        C52711k.m112240b(musicModel, "musicModel");
    }

    /* renamed from: b */
    public View mo77089b(int i) {
        if (this.f95956k == null) {
            this.f95956k = new HashMap();
        }
        View view = (View) this.f95956k.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f95956k.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public abstract String mo77091g();

    public void handleMsg(Message message) {
        C52711k.m112240b(message, "msg");
    }

    /* renamed from: j */
    public void mo77092j() {
        if (this.f95956k != null) {
            this.f95956k.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo77092j();
    }

    /* renamed from: a */
    public final void mo76950a(String str, MusicModel musicModel) {
        C52711k.m112240b(str, "musicFile");
        C52711k.m112240b(musicModel, "musicModel");
        C23208an.m56934a(mo77091g());
        if (TextUtils.isEmpty(this.f95954e)) {
            this.f95954e = UUID.randomUUID().toString();
        }
        Builder builder = new Builder();
        String str2 = this.f95954e;
        if (str2 == null) {
            C52711k.m112234a();
        }
        Builder musicPath = builder.creationId(str2).translationType(3).shootWay(mo77091g()).musicOrigin("single_song").musicPath(str);
        if (!TextUtils.isEmpty(this.f95955j)) {
            ArrayList a = C37583br.m84026a(this.f95955j);
            C52711k.m112236a((Object) a, "StickerHelper.convert(mStickerIds)");
            musicPath.stickers(a);
            if (!a.isEmpty()) {
                Object obj = a.get(0);
                C52711k.m112236a(obj, "musicReuseStickerIds[0]");
                musicPath.musicSticker((String) obj);
            }
        }
        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C37629b(this, musicPath, musicModel));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0212b mo22542a() {
        return this.f95952c;
    }

    public final boolean by_() {
        return isAdded();
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return C11873a.m24226a(this);
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C11873a.m24228b(this);
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return C11873a.m24231e(this);
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return C11873a.m24229c(this);
    }

    /* renamed from: i */
    public final /* synthetic */ C11796d mo22645i() {
        return C11873a.m24230d(this);
    }

    public final void bz_() {
        C18842a.m45934b(new C37628a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C37646v mo77137e() {
        C37646v vVar = this.f95951b;
        if (vVar == null) {
            C52711k.m112237a("mMusicDetailDownloadHelper");
        }
        return vVar;
    }

    /* renamed from: b */
    public final void mo76951b() {
        this.f95950a = C45547d.m99208b(getActivity(), getString(R.string.cds));
        ProgressDialog progressDialog = this.f95950a;
        if (progressDialog != null) {
            progressDialog.setIndeterminate(false);
        }
    }

    public final void bx_() {
        C27965f.m66724a((Fragment) this, mo77091g(), "click_music_shoot", C47661ab.m103163a().mo94972a("login_title", C11010c.m22280a().getString(R.string.dij)).f120139a);
    }

    /* renamed from: e_ */
    public final void mo76955e_(int i) {
        ProgressDialog progressDialog = this.f95950a;
        if (progressDialog != null) {
            progressDialog.setProgress(i);
            if (i >= 98 && this.f95950a != null) {
                progressDialog.setCancelable(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo77136a(C37646v vVar) {
        C52711k.m112240b(vVar, "<set-?>");
        this.f95951b = vVar;
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C11873a.m24227a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C11873a.m24220a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C11873a.m24221a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C11873a.m24223a(this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C11873a.m24222a((C11872h) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C11873a.m24224a((C11872h) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C, D> C1690c mo22551a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super C11866f, ? super A, ? super B, ? super C, ? super D, C52860x> sVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(jVar4, "prop4");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(sVar, "subscriber");
        return C11873a.m24225a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
    }
}
