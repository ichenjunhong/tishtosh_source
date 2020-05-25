package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p683ss.android.ugc.gamora.jedi.BaseJediViewModel;
import java.util.ArrayList;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel */
public final class ChooseMediaViewModel extends BaseJediViewModel<ChooseMediaState> {

    /* renamed from: d */
    final ArrayList<MyMediaModel> f111462d = new ArrayList<>();

    /* renamed from: e */
    final ArrayList<MyMediaModel> f111463e = new ArrayList<>();

    /* renamed from: f */
    final ArrayList<MyMediaModel> f111464f = new ArrayList<>();

    /* renamed from: g */
    int f111465g;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$a */
    public static final class C44016a extends C52712l implements C52671b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ MyMediaModel f111466a;

        public C44016a(MyMediaModel myMediaModel) {
            this.f111466a = myMediaModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
            C52711k.m112240b(chooseMediaState, "$receiver");
            return ChooseMediaState.copy$default(chooseMediaState, null, null, null, chooseMediaState.getPreviewMediaState().copy(this.f111466a, chooseMediaState.getPreviewMediaState().getValue() + 1), 7, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$b */
    static final class C44017b extends C52712l implements C52671b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        public static final C44017b f111467a = new C44017b();

        C44017b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
            C52711k.m112240b(chooseMediaState, "$receiver");
            return ChooseMediaState.copy$default(chooseMediaState, chooseMediaState.getMediaListState().copy(chooseMediaState.getMediaListState().getMediaList(), chooseMediaState.getMediaListState().getValue() + 1), null, null, null, 14, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$c */
    public static final class C44018c extends C52712l implements C52671b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ MyMediaModel f111468a;

        public C44018c(MyMediaModel myMediaModel) {
            this.f111468a = myMediaModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
            C52711k.m112240b(chooseMediaState, "$receiver");
            return ChooseMediaState.copy$default(chooseMediaState, null, chooseMediaState.getSelectMediaState().copy(this.f111468a, chooseMediaState.getSelectMediaState().getValue() + 1), null, null, 13, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$d */
    static final class C44019d extends C52712l implements C52671b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f111469a;

        C44019d(ArrayList arrayList) {
            this.f111469a = arrayList;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
            C52711k.m112240b(chooseMediaState, "$receiver");
            ArrayList mediaList = chooseMediaState.getMediaListState().getMediaList();
            mediaList.clear();
            int i = 0;
            for (MyMediaModel myMediaModel : this.f111469a) {
                myMediaModel.f111663s = i;
                i++;
            }
            mediaList.addAll(this.f111469a);
            return ChooseMediaState.copy$default(chooseMediaState, chooseMediaState.getMediaListState().copy(mediaList, chooseMediaState.getMediaListState().getValue() + 1), null, null, null, 14, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$e */
    static final class C44020e extends C52712l implements C52671b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ MyMediaModel f111470a;

        C44020e(MyMediaModel myMediaModel) {
            this.f111470a = myMediaModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
            C52711k.m112240b(chooseMediaState, "$receiver");
            return ChooseMediaState.copy$default(chooseMediaState, null, null, chooseMediaState.getUnSelectMediaState().copy(this.f111470a, chooseMediaState.getUnSelectMediaState().getValue() + 1), null, 11, null);
        }
    }

    /* renamed from: e */
    public final void mo89862e() {
        mo22530c(C44017b.f111467a);
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        ChooseMediaState chooseMediaState = new ChooseMediaState(null, null, null, null, 15, null);
        return chooseMediaState;
    }

    /* renamed from: a */
    public final void mo89860a(MyMediaModel myMediaModel) {
        C52711k.m112240b(myMediaModel, "media");
        mo22530c(new C44020e(myMediaModel));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo89861a(ArrayList<MyMediaModel> arrayList) {
        mo22530c(new C44019d(arrayList));
    }
}
