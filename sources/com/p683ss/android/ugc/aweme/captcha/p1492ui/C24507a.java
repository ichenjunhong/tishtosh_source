package com.p683ss.android.ugc.aweme.captcha.p1492ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.C0535b;
import android.support.design.widget.C0540c;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.p929d.C13745c;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.C23515d.C23520a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.captcha.C24493b;
import com.p683ss.android.ugc.aweme.captcha.p1489a.C24485b;
import com.p683ss.android.ugc.aweme.captcha.p1489a.C24486c;
import com.p683ss.android.ugc.aweme.captcha.p1489a.C24489e;
import com.p683ss.android.ugc.aweme.captcha.p1490b.C24494a;
import com.p683ss.android.ugc.aweme.captcha.p1490b.C24495b;
import com.p683ss.android.ugc.aweme.captcha.p1490b.C24496c;
import com.p683ss.android.ugc.aweme.captcha.p1490b.C24497d;
import com.p683ss.android.ugc.aweme.captcha.p1491c.C24500a;
import com.p683ss.android.ugc.aweme.captcha.p1492ui.DragBar.C24506a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.captcha.ui.a */
public class C24507a extends C0540c implements OnClickListener, C24494a, C24495b {

    /* renamed from: a */
    public AnimatedImageView f64906a;

    /* renamed from: b */
    public AnimatedImageView f64907b;

    /* renamed from: c */
    public View f64908c;

    /* renamed from: d */
    public DragBar f64909d;

    /* renamed from: e */
    public C24493b f64910e;

    /* renamed from: f */
    public C24496c f64911f;

    /* renamed from: g */
    public C24485b f64912g;

    /* renamed from: h */
    public View f64913h;

    /* renamed from: i */
    public Runnable f64914i;

    /* renamed from: j */
    public boolean f64915j;

    /* renamed from: k */
    public long f64916k;

    /* renamed from: l */
    public boolean f64917l;

    /* renamed from: m */
    int f64918m;

    /* renamed from: n */
    private View f64919n;

    /* renamed from: o */
    private TextView f64920o;

    /* renamed from: p */
    private C24497d f64921p;

    /* renamed from: q */
    private int f64922q;

    /* renamed from: r */
    private boolean f64923r;

    /* renamed from: s */
    private float f64924s;

    /* renamed from: t */
    private float f64925t;

    public void onDestroyView() {
        this.f64921p.mo46991S_();
        this.f64911f.mo46991S_();
        super.onDestroyView();
    }

    /* renamed from: a */
    private void m59906a() {
        synchronized (C24507a.class) {
            if (this.f64910e != null) {
                this.f64910e.mo45354b();
                this.f64910e = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo50258a(Exception exc) {
        if (this.f64915j) {
            C22971a.m56493a((Context) getActivity(), (Throwable) exc);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.gt);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return new C0535b(getActivity(), this.mTheme);
    }

    /* renamed from: b */
    public final void mo50260b(Exception exc) {
        if (this.f64915j) {
            C22971a.m56493a((Context) getActivity(), (Throwable) exc);
            this.f64909d.postDelayed(new Runnable() {
                public final void run() {
                    if (C24507a.this.f64915j) {
                        C24507a.this.mo50276a(false);
                        C24507a.this.f64909d.mo50267a();
                    }
                }
            }, 600);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new OnShowListener() {
                public final void onShow(DialogInterface dialogInterface) {
                    FrameLayout frameLayout = (FrameLayout) ((C0535b) dialogInterface).findViewById(R.id.a4q);
                    if (frameLayout != null) {
                        BottomSheetBehavior a = BottomSheetBehavior.m1227a(frameLayout);
                        a.mo1296a(frameLayout.getHeight());
                        a.f1639j = true;
                    }
                }
            });
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f64915j = false;
        this.f64913h.removeCallbacks(this.f64914i);
        if (!this.f64923r && this.f64910e != null) {
            m59906a();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.f64915j = false;
        this.f64913h.removeCallbacks(this.f64914i);
        if (!this.f64923r && this.f64910e != null) {
            m59906a();
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.az9) {
            dismiss();
            return;
        }
        if (id == R.id.b3i) {
            if (this.f64914i != null) {
                this.f64913h.removeCallbacks(this.f64914i);
            }
            mo50276a(true);
        }
    }

    /* renamed from: a */
    public final void mo50256a(C24485b bVar) {
        if (this.f64915j && bVar != null) {
            this.f64912g = bVar;
            m59907a(this.f64906a, bVar.f64874b);
            m59907a(this.f64907b, bVar.f64876d);
            LayoutParams layoutParams = (LayoutParams) this.f64907b.getLayoutParams();
            layoutParams.setMargins(this.f64922q, (int) ((((float) bVar.f64878f) * this.f64925t) / ((float) bVar.f64875c.f64872b)), 0, 0);
            this.f64907b.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo50257a(C24486c cVar) {
        if (this.f64915j && cVar != null) {
            C18842a.m45932a(new Runnable(cVar.f64880a) {

                /* renamed from: a */
                final /* synthetic */ String f64894a;

                public final void run() {
                    try {
                        String str = this.f64894a;
                        int length = str.length();
                        byte[] bArr = new byte[(length / 2)];
                        for (int i = 0; i < length; i += 2) {
                            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
                        }
                        SecretKeySpec secretKeySpec = new SecretKeySpec(C24500a.m59892a().getBytes(), "AES");
                        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15});
                        Cipher instance = Cipher.getInstance("AES/CFB/NoPadding ");
                        instance.init(2, secretKeySpec, ivParameterSpec);
                        final C24485b bVar = (C24485b) JSON.parseObject(new String(instance.doFinal(bArr), "UTF-8"), C24485b.class);
                        C18842a.m45934b(new Runnable() {
                            public final void run() {
                                if (C24497d.this.f70701g != null) {
                                    ((C24494a) C24497d.this.f70701g).mo50256a(bVar);
                                }
                            }
                        });
                    } catch (Exception e) {
                        if (C24497d.this.f70701g != null) {
                            ((C24494a) C24497d.this.f70701g).mo50258a(e);
                        }
                    }
                }

                {
                    this.f64894a = r2;
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo50259a(C24489e eVar) {
        if (this.f64915j) {
            C10691a.m21537a(getContext(), eVar.f64890d).mo19066a();
            this.f64923r = true;
            dismiss();
            if (this.f64910e != null) {
                this.f64910e.mo45353a();
            }
        }
    }

    /* renamed from: a */
    public final void mo50276a(boolean z) {
        this.f64908c.animate().rotation(360.0f).setDuration(400).withEndAction(new Runnable() {
            public final void run() {
                C24507a.this.f64908c.setRotation(0.0f);
            }
        }).start();
        this.f64921p.mo44934a_(Boolean.valueOf(z));
    }

    public int show(C0679r rVar, String str) {
        int show = super.show(rVar, str);
        this.f64915j = true;
        return show;
    }

    public void show(C0654k kVar, String str) {
        super.show(kVar, str);
        this.f64915j = true;
    }

    /* renamed from: a */
    private void m59907a(final AnimatedImageView animatedImageView, String str) {
        C23515d.m57677a((RemoteImageView) animatedImageView, str);
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(new ArrayList());
        urlModel.getUrlList().add(str);
        C23515d.m57667a(urlModel, (C23520a) new C23520a() {
            /* renamed from: a */
            public final void mo48680a(Exception exc) {
            }

            /* renamed from: a */
            public final void mo48679a(C13745c<C13715a<C14042c>> cVar) {
                if (C24507a.this.f64915j) {
                    C24507a.this.f64918m++;
                    if (C24507a.this.f64918m == 2) {
                        C24507a aVar = C24507a.this;
                        if (aVar.f64915j && aVar.f64913h != null) {
                            aVar.f64909d.setCanDragged(true);
                            aVar.f64917l = false;
                            if (aVar.f64914i == null) {
                                aVar.f64914i = new Runnable() {
                                    public final void run() {
                                        if (C24507a.this.f64915j) {
                                            C10691a.m21545b(C24507a.this.getContext(), C24507a.this.getString(R.string.fam)).mo19066a();
                                            C24507a.this.f64917l = true;
                                        }
                                    }
                                };
                            }
                            aVar.f64913h.removeCallbacks(aVar.f64914i);
                            aVar.f64913h.postDelayed(aVar.f64914i, (long) (((Integer) SharePrefCache.inst().getVerifyExceed().mo47782d()).intValue() * 1000));
                        }
                        C24507a.this.f64918m = 0;
                    }
                    if (animatedImageView.getVisibility() == 4) {
                        animatedImageView.setVisibility(0);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final String mo50275a(float f, long j) {
        if (this.f64912g == null) {
            return "";
        }
        int i = (int) (f * ((float) (this.f64912g.f64875c.f64871a - this.f64912g.f64877e.f64871a)));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ts", this.f64912g.f64879g + (j / 1000));
            jSONObject.put("offset", i);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f64913h = view;
        this.f64919n = view.findViewById(R.id.az9);
        this.f64906a = (AnimatedImageView) view.findViewById(R.id.ayr);
        this.f64907b = (AnimatedImageView) view.findViewById(R.id.b07);
        this.f64909d = (DragBar) view.findViewById(R.id.a8p);
        this.f64908c = view.findViewById(R.id.b3i);
        this.f64920o = (TextView) view.findViewById(R.id.title);
        this.f64907b.setVisibility(4);
        this.f64924s = C9432q.m18687b(getContext(), 262.5f);
        this.f64925t = C9432q.m18687b(getContext(), 150.0f);
        this.f64906a.getLayoutParams().width = (int) this.f64924s;
        this.f64906a.getLayoutParams().height = (int) this.f64925t;
        this.f64907b.getLayoutParams().width = (int) (this.f64924s * 0.33333334f);
        this.f64907b.getLayoutParams().height = (int) (this.f64925t * 0.4f);
        this.f64922q = (int) ((((float) C9432q.m18670a(getContext())) - this.f64924s) / 2.0f);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null) {
            str = arguments.getString("title", "");
        }
        if (!TextUtils.isEmpty(str)) {
            this.f64920o.setText(str);
        }
        this.f64919n.setOnClickListener(this);
        this.f64908c.setOnClickListener(this);
        this.f64909d.setOnDragListener(new C24506a() {
            /* renamed from: a */
            public final void mo50272a() {
                C24507a.this.f64916k = System.currentTimeMillis();
            }

            /* renamed from: a */
            public final void mo50273a(float f) {
                C24507a.this.f64907b.setTranslationX(f * ((float) (C24507a.this.f64906a.getMeasuredWidth() - C24507a.this.f64907b.getMeasuredWidth())));
            }

            /* renamed from: b */
            public final void mo50274b(float f) {
                if (C24507a.this.f64917l) {
                    if (C24507a.this.f64914i != null) {
                        C24507a.this.f64913h.removeCallbacks(C24507a.this.f64914i);
                    }
                    C10691a.m21542b(C24507a.this.getContext(), (int) R.string.fam).mo19066a();
                    C24507a.this.f64909d.mo50267a();
                    C24507a.this.f64909d.setCanDragged(true);
                } else {
                    if (C24507a.this.f64914i != null) {
                        C24507a.this.f64913h.removeCallbacks(C24507a.this.f64914i);
                    }
                    if (C24507a.this.f64912g != null) {
                        C24507a.this.f64911f.mo44934a_(C24507a.this.mo50275a(f, System.currentTimeMillis() - C24507a.this.f64916k));
                    }
                }
                C24507a.this.f64916k = 0;
            }
        });
        this.f64909d.setCanDragged(false);
        this.f64921p = new C24497d();
        this.f64921p.mo54800a(this);
        this.f64921p.mo44934a_(Boolean.valueOf(false));
        this.f64911f = new C24496c();
        this.f64911f.mo54800a(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.bkq, viewGroup, false);
    }
}
