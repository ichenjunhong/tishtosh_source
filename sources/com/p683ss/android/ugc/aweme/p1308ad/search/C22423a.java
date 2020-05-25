package com.p683ss.android.ugc.aweme.p1308ad.search;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.graphics.Color;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.gson.C17971f;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1318d.C22403c;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1318d.C22405e;
import com.p683ss.android.ugc.aweme.p1308ad.services.p1322a.C22430d;
import com.p683ss.android.ugc.aweme.p1308ad.view.C22450d;
import com.p683ss.android.ugc.aweme.utils.GsonHolder;
import com.p683ss.android.ugc.aweme.utils.GsonProvider;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ad.search.a */
public final class C22423a extends C22450d<C22405e> {

    /* renamed from: b */
    public static final C22424a f60415b = new C22424a(null);

    /* renamed from: a */
    public final C0184k f60416a;

    /* renamed from: c */
    private AwemeTextLabelModel f60417c;

    /* renamed from: d */
    private TextView f60418d;

    /* renamed from: e */
    private LinearLayout f60419e;

    /* renamed from: com.ss.android.ugc.aweme.ad.search.a$a */
    public static final class C22424a {
        private C22424a() {
        }

        public /* synthetic */ C22424a(C52707g gVar) {
            this();
        }
    }

    public C22423a(View view, C0184k kVar) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(kVar, "lifecycleOwner");
        super(view);
        this.f60416a = kVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo46525a(Context context, C22430d dVar) {
        CharSequence charSequence;
        CharSequence charSequence2;
        int i;
        String str;
        String str2;
        C22405e eVar = (C22405e) dVar;
        if (eVar != null) {
            C22403c cVar = eVar.f60343a;
            if (cVar != null) {
                List<String> list = cVar.f60341b;
                if (list != null) {
                    C22403c cVar2 = eVar.f60343a;
                    this.f60419e = (LinearLayout) this.itemView.findViewById(R.id.e64);
                    this.f60418d = (TextView) this.itemView.findViewById(R.id.f0i);
                    GsonProvider createGsonProviderbyMonsterPlugin = GsonHolder.createGsonProviderbyMonsterPlugin();
                    C52711k.m112236a((Object) createGsonProviderbyMonsterPlugin, "ServiceManager.get().get…GsonProvider::class.java)");
                    C17971f gson = createGsonProviderbyMonsterPlugin.getGson();
                    LinearLayout linearLayout = this.f60419e;
                    if (linearLayout != null) {
                        linearLayout.removeAllViews();
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        int i2 = -1;
                        if (it.hasNext()) {
                            String str3 = (String) it.next();
                            if (gson == null) {
                                break;
                            }
                            AwemeRawAd awemeRawAd = (AwemeRawAd) gson.mo34884a(str3, AwemeRawAd.class);
                            if (awemeRawAd == null) {
                                break;
                            }
                            if (this.f60417c == null && awemeRawAd.getLabel() != null) {
                                this.f60417c = awemeRawAd.getLabel();
                            }
                            if (awemeRawAd.isHideIfExists()) {
                                View view = this.itemView;
                                C52711k.m112236a((Object) view, "itemView");
                                if (C18920g.m46052b(view.getContext(), awemeRawAd.getPackageName())) {
                                }
                            }
                            View view2 = this.itemView;
                            C52711k.m112236a((Object) view2, "itemView");
                            Context context2 = view2.getContext();
                            C52711k.m112236a((Object) context2, "itemView.context");
                            SearchAdItemView searchAdItemView = new SearchAdItemView(context2, null, 0, true, 6, null);
                            SearchAdBaseItemView searchAdBaseItemView = searchAdItemView;
                            searchAdBaseItemView.setLifecycleOwner(this.f60416a);
                            LayoutParams layoutParams = new LayoutParams(-1, -2);
                            LinearLayout linearLayout2 = this.f60419e;
                            if (linearLayout2 != null) {
                                linearLayout2.addView(searchAdBaseItemView, layoutParams);
                            }
                            searchAdBaseItemView.setTitleVisibility(8);
                            searchAdBaseItemView.setIsStrongStyle(true);
                            searchAdBaseItemView.mo46691a(awemeRawAd);
                            searchAdBaseItemView.setDividerVisibility(8);
                            searchAdBaseItemView.setVisibility(0);
                        } else {
                            CharSequence charSequence3 = cVar2.f60342c;
                            if (!TextUtils.isEmpty(charSequence3)) {
                                TextView textView = this.f60418d;
                                if (textView != null) {
                                    textView.setText(charSequence3);
                                }
                            } else {
                                TextView textView2 = this.f60418d;
                                if (textView2 != null) {
                                    textView2.setText(R.string.fm5);
                                }
                            }
                            TextView textView3 = (TextView) this.itemView.findViewById(R.id.cw);
                            if (textView3 != null) {
                                if (this.f60417c != null) {
                                    textView3.setVisibility(0);
                                    AwemeTextLabelModel awemeTextLabelModel = this.f60417c;
                                    String str4 = null;
                                    if (awemeTextLabelModel != null) {
                                        charSequence = awemeTextLabelModel.getTextColor();
                                    } else {
                                        charSequence = null;
                                    }
                                    if (!TextUtils.isEmpty(charSequence)) {
                                        AwemeTextLabelModel awemeTextLabelModel2 = this.f60417c;
                                        if (awemeTextLabelModel2 != null) {
                                            str2 = awemeTextLabelModel2.getTextColor();
                                        } else {
                                            str2 = null;
                                        }
                                        i2 = Color.parseColor(str2);
                                    }
                                    textView3.setTextColor(i2);
                                    AwemeTextLabelModel awemeTextLabelModel3 = this.f60417c;
                                    if (awemeTextLabelModel3 != null) {
                                        charSequence2 = awemeTextLabelModel3.getBgColor();
                                    } else {
                                        charSequence2 = null;
                                    }
                                    if (TextUtils.isEmpty(charSequence2)) {
                                        View view3 = this.itemView;
                                        C52711k.m112236a((Object) view3, "itemView");
                                        i = C0726c.m2098c(view3.getContext(), R.color.ss);
                                    } else {
                                        AwemeTextLabelModel awemeTextLabelModel4 = this.f60417c;
                                        if (awemeTextLabelModel4 != null) {
                                            str = awemeTextLabelModel4.getBgColor();
                                        } else {
                                            str = null;
                                        }
                                        i = Color.parseColor(str);
                                    }
                                    textView3.setBackgroundDrawable(C23729p.m58249a(i, (float) C23728o.m58241a(2.0d)));
                                    AwemeTextLabelModel awemeTextLabelModel5 = this.f60417c;
                                    if (awemeTextLabelModel5 != null) {
                                        str4 = awemeTextLabelModel5.getLabelName();
                                    }
                                    textView3.setText(str4);
                                    return;
                                }
                                textView3.setVisibility(8);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }
}
