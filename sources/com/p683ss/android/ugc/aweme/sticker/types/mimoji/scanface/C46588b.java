package com.p683ss.android.ugc.aweme.sticker.types.mimoji.scanface;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.util.Pair;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.mimoji.scanface.b */
public final class C46588b {

    /* renamed from: a */
    public C46591c f117536a;

    /* renamed from: b */
    public C1690c f117537b;

    /* renamed from: c */
    final C46587a f117538c;

    /* renamed from: d */
    private final int f117539d = 1;

    /* renamed from: e */
    private final int f117540e = 2;

    /* renamed from: f */
    private int f117541f = this.f117539d;

    /* renamed from: a */
    public final void mo93381a() {
        if (this.f117541f != this.f117540e) {
            this.f117541f = this.f117540e;
            this.f117536a.mo93383a();
        }
    }

    /* renamed from: a */
    public final void mo93382a(boolean z, boolean z2) {
        C1690c cVar = this.f117537b;
        if (cVar != null) {
            cVar.dispose();
        }
        if (this.f117541f != this.f117539d) {
            this.f117541f = this.f117539d;
            this.f117536a.mo93384b();
            this.f117538c.mo93061a(z, z2);
        }
    }

    public C46588b(final AppCompatActivity appCompatActivity, FrameLayout frameLayout, C46587a aVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(frameLayout, "containerView");
        C52711k.m112240b(aVar, "listener");
        this.f117538c = aVar;
        this.f117536a = new C46591c(frameLayout);
        ((ScanFaceViewModel) C0214z.m440a((FragmentActivity) appCompatActivity).mo359a(ScanFaceViewModel.class)).mo93380a().observe(appCompatActivity, new C0199s<Pair<Integer, String>>(this) {

            /* renamed from: a */
            final /* synthetic */ C46588b f117542a;

            {
                this.f117542a = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    Integer num = (Integer) pair.first;
                    String str = (String) pair.second;
                    if (num != null && num.intValue() == 7) {
                        C46588b bVar = this.f117542a;
                        C52711k.m112236a((Object) str, "res");
                        bVar.f117538c.mo93060a(str);
                    } else if (num != null && num.intValue() == 16) {
                        C1690c cVar = this.f117542a.f117537b;
                        if (cVar != null) {
                            cVar.dispose();
                        }
                        this.f117542a.f117537b = C2201v.m6592a(5, TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C1710e<Long>(this) {

                            /* renamed from: a */
                            final /* synthetic */ C465891 f117544a;

                            {
                                this.f117544a = r1;
                            }

                            public final /* synthetic */ void accept(Object obj) {
                                Long l = (Long) obj;
                                C50275d.m108531a((Context) appCompatActivity, (int) R.string.bsx, 0).mo98174a();
                                this.f117544a.f117542a.mo93382a(false, false);
                            }
                        });
                    } else if (num != null && num.intValue() == 9) {
                        this.f117542a.mo93382a(true, false);
                    }
                    C46591c cVar2 = this.f117542a.f117536a;
                    C52711k.m112236a((Object) num, "status");
                    int intValue = num.intValue();
                    if (intValue == 5) {
                        TextView textView = cVar2.f117545a;
                        if (textView == null) {
                            C52711k.m112237a("hintTextView");
                        }
                        textView.setText(R.string.alp);
                    } else if (intValue == 7) {
                        TextView textView2 = cVar2.f117545a;
                        if (textView2 == null) {
                            C52711k.m112237a("hintTextView");
                        }
                        textView2.setText(R.string.ako);
                    } else if (intValue != 16) {
                        switch (intValue) {
                            case 2:
                                TextView textView3 = cVar2.f117545a;
                                if (textView3 == null) {
                                    C52711k.m112237a("hintTextView");
                                }
                                textView3.setText(R.string.akb);
                                return;
                            case 3:
                                TextView textView4 = cVar2.f117545a;
                                if (textView4 == null) {
                                    C52711k.m112237a("hintTextView");
                                }
                                textView4.setText(R.string.am8);
                                return;
                        }
                    } else {
                        TextView textView5 = cVar2.f117545a;
                        if (textView5 == null) {
                            C52711k.m112237a("hintTextView");
                        }
                        textView5.setText(R.string.aln);
                    }
                }
            }
        });
    }
}
