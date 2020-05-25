package com.p683ss.android.ugc.aweme.effect;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.effect.C29158bp.C29159a;
import com.p683ss.android.ugc.aweme.effect.p1673c.p1674a.C29164a;
import com.p683ss.android.ugc.aweme.effect.p1673c.p1674a.C29165b;
import com.p683ss.android.ugc.aweme.effect.p1673c.p1674a.C29165b.C29166a;
import com.p683ss.android.ugc.aweme.effect.p1679f.C29200c;
import com.p683ss.android.ugc.aweme.port.internal.C39654d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C52906ab;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effect.z */
public final class C29233z extends Fragment {

    /* renamed from: a */
    boolean f76560a = true;

    /* renamed from: b */
    private HashMap f76561b;

    /* renamed from: com.ss.android.ugc.aweme.effect.z$a */
    static final class C29234a<T> implements C0199s<C29165b> {

        /* renamed from: a */
        final /* synthetic */ C29233z f76562a;

        /* renamed from: b */
        final /* synthetic */ C29158bp f76563b;

        C29234a(C29233z zVar, C29158bp bpVar) {
            this.f76562a = zVar;
            this.f76563b = bpVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            CharSequence charSequence;
            int i;
            C29165b bVar = (C29165b) obj;
            if (bVar != null) {
                AVDmtTextView aVDmtTextView = (AVDmtTextView) this.f76562a.mo59119a(R.id.d6_);
                C52711k.m112236a((Object) aVDmtTextView, "tvHint");
                switch (bVar.f76429a) {
                    case 0:
                        C29233z zVar = this.f76562a;
                        if (!C29164a.m68670a((long) bVar.f76430b)) {
                            i = R.string.awg;
                        } else if (zVar.f76560a) {
                            zVar.f76560a = false;
                            i = R.string.awi;
                        } else {
                            i = R.string.awh;
                        }
                        String string = zVar.getString(i);
                        C52711k.m112236a((Object) string, "getString(hintStringRes)");
                        charSequence = string;
                        break;
                    case 1:
                        Locale locale = Locale.getDefault();
                        C52711k.m112236a((Object) locale, "Locale.getDefault()");
                        String a = C2240a.m6773a(locale, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(bVar.f76430b)}, 1));
                        C52711k.m112236a((Object) a, "java.lang.String.format(locale, format, *args)");
                        charSequence = this.f76562a.getString(R.string.avx, a);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("unexpected TimeEffectHintOp, op = ");
                        sb.append(bVar.f76429a);
                        throw new IllegalArgumentException(sb.toString());
                }
                aVDmtTextView.setText(charSequence);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.z$b */
    static final class C29235b<T> implements C0199s<C52906ab> {

        /* renamed from: a */
        final /* synthetic */ C29233z f76564a;

        /* renamed from: b */
        final /* synthetic */ C29158bp f76565b;

        C29235b(C29233z zVar, C29158bp bpVar) {
            this.f76564a = zVar;
            this.f76565b = bpVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C52906ab abVar = (C52906ab) obj;
            if (abVar != null) {
                String str = abVar.f131241a;
                switch (str.hashCode()) {
                    case 49:
                        if (str.equals("1")) {
                            this.f76565b.mo59030a(1);
                            return;
                        }
                        break;
                    case 50:
                        if (str.equals("2")) {
                            this.f76565b.mo59030a(2);
                            return;
                        }
                        break;
                    case 51:
                        if (str.equals("3")) {
                            this.f76565b.mo59030a(3);
                            return;
                        }
                        break;
                }
                this.f76565b.mo59029a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.z$c */
    static final class C29236c<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C29233z f76566a;

        /* renamed from: b */
        final /* synthetic */ C29158bp f76567b;

        C29236c(C29233z zVar, C29158bp bpVar) {
            this.f76566a = zVar;
            this.f76567b = bpVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                this.f76567b.mo59032b();
                if (!bool.booleanValue()) {
                    this.f76567b.mo59033c();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.z$d */
    static final class C29237d implements C29159a {

        /* renamed from: a */
        final /* synthetic */ C29233z f76568a;

        C29237d(C29233z zVar) {
            this.f76568a = zVar;
        }

        /* renamed from: a */
        public final boolean mo59034a(int i) {
            boolean z;
            FragmentActivity activity = this.f76568a.getActivity();
            if (activity == null) {
                return false;
            }
            C52711k.m112236a((Object) activity, "activity ?: return@setOnItemClickListener false");
            FragmentActivity activity2 = this.f76568a.getActivity();
            VideoPublishEditModel videoPublishEditModel = null;
            if (activity2 != null) {
                C52711k.m112236a((Object) activity2, "activity ?: return null");
                C0209x a = C0214z.m440a(activity2).mo359a(EditEffectVideoModel.class);
                C52711k.m112236a((Object) a, "ViewModelProviders.of(ho…ctVideoModel::class.java)");
                C29200c a2 = ((EditEffectVideoModel) a).mo58842a();
                if (a2 != null) {
                    videoPublishEditModel = a2.mo59092b();
                }
            }
            if (videoPublishEditModel == null) {
                return false;
            }
            if (i == 0 || !videoPublishEditModel.hasLyricSticker()) {
                C29164a aVar = C29164a.f76427a;
                int a3 = this.f76568a.mo59118a();
                long a4 = C29164a.m68666a(a3);
                switch (i) {
                    case 2:
                        z = C29164a.m68670a(((long) a3) + (a4 * 2));
                        break;
                    case 3:
                        z = C29164a.m68670a((((long) a3) - a4) + ((long) (((float) a4) / 0.5f)));
                        break;
                    default:
                        z = false;
                        break;
                }
                if (z) {
                    C50275d.m108541c(activity, R.string.awh).mo98174a();
                    return false;
                }
                C0209x a5 = C0214z.m440a(activity).mo359a(EditEffectVideoModel.class);
                C52711k.m112236a((Object) a5, "ViewModelProviders.of(fr…ctVideoModel::class.java)");
                ((EditEffectVideoModel) a5).mo58849g().setValue(VEEffectSelectOp.selectTime(i));
                return true;
            }
            C50275d.m108541c(activity, R.string.gb7).mo98174a();
            return false;
        }
    }

    /* renamed from: a */
    public final View mo59119a(int i) {
        if (this.f76561b == null) {
            this.f76561b = new HashMap();
        }
        View view = (View) this.f76561b.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f76561b.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public final void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f76561b != null) {
            this.f76561b.clear();
        }
    }

    /* renamed from: a */
    public final int mo59118a() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return 0;
        }
        C52711k.m112236a((Object) activity, "activity ?: return 0");
        C0209x a = C0214z.m440a(activity).mo359a(EditEffectVideoModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ho…ctVideoModel::class.java)");
        C29200c a2 = ((EditEffectVideoModel) a).mo58842a();
        if (a2 != null) {
            C0198r e = a2.mo59095e();
            if (e != null) {
                C20347c cVar = (C20347c) e.getValue();
                if (cVar != null) {
                    return cVar.mo42966A();
                }
            }
        }
        return 0;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C0209x a = C0214z.m440a(activity).mo359a(EditEffectVideoModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(fr…ctVideoModel::class.java)");
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) a;
            if (!editEffectVideoModel.mo58844b()) {
                C39654d f = C39629l.m88232a().mo58575f();
                C52711k.m112236a((Object) activity, "fragmentActivity");
                editEffectVideoModel.mo58843a(f.mo58629a(activity));
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) mo59119a(R.id.d66);
        C52711k.m112236a((Object) aVDmtHorizontalImageTextLayout, "tvDelete");
        aVDmtHorizontalImageTextLayout.setVisibility(8);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
        linearLayoutManager.mo4731b(0);
        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) mo59119a(R.id.cal);
        C52711k.m112236a((Object) aVDmtPanelRecyleView, "recyerview");
        aVDmtPanelRecyleView.setLayoutManager(linearLayoutManager);
        C29158bp bpVar = new C29158bp();
        bpVar.mo59031a(C29164a.m68670a((long) mo59118a()));
        bpVar.f76414b = new C29237d(this);
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = (AVDmtPanelRecyleView) mo59119a(R.id.cal);
        C52711k.m112236a((Object) aVDmtPanelRecyleView2, "recyerview");
        aVDmtPanelRecyleView2.setAdapter(bpVar);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C0209x a = C0214z.m440a(activity).mo359a(EditEffectVideoModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(fr…ctVideoModel::class.java)");
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) a;
            C0184k kVar = this;
            editEffectVideoModel.mo58848f().observe(kVar, new C29234a(this, bpVar));
            editEffectVideoModel.mo58848f().setValue(C29166a.m68678b((float) mo59118a()));
            editEffectVideoModel.mo58842a().mo59103m().observe(kVar, new C29235b(this, bpVar));
            editEffectVideoModel.mo58842a().mo59097g().observe(kVar, new C29236c(this, bpVar));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.nm, viewGroup, false);
    }
}
