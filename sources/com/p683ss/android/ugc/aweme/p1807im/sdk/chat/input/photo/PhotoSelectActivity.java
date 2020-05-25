package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.p1099a.C18489a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.C33298c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33220b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33242d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33631o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.EmojiAddActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1813a.C33350a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33440v;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34042m;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35221bc.C35225a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.C35401g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.WrapGridLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C53755c;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity */
public class PhotoSelectActivity extends AmeActivity {

    /* renamed from: a */
    public int f87210a;

    /* renamed from: b */
    public int f87211b;

    /* renamed from: c */
    public String f87212c;

    /* renamed from: d */
    public WrapGridLayoutManager f87213d;

    /* renamed from: e */
    public RecyclerView f87214e;

    /* renamed from: f */
    public View f87215f;

    /* renamed from: g */
    public View f87216g;

    /* renamed from: h */
    public View f87217h;

    /* renamed from: i */
    public TextView f87218i;

    /* renamed from: j */
    public ImageView f87219j;

    /* renamed from: k */
    public TextView f87220k;

    /* renamed from: l */
    public C33631o f87221l;

    /* renamed from: m */
    public C35225a f87222m;

    /* renamed from: n */
    public C33644d f87223n;

    /* renamed from: o */
    public C33640a f87224o;

    /* renamed from: p */
    public C33672w f87225p;

    /* renamed from: q */
    public int f87226q;

    /* renamed from: r */
    private final int f87227r = 4;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity$a */
    static final class C33640a extends C34042m {

        /* renamed from: a */
        public PopupWindow f87230a;

        /* renamed from: b */
        public View f87231b;

        /* renamed from: c */
        View f87232c;

        /* renamed from: d */
        public PhotoSelectActivity f87233d;

        /* renamed from: e */
        final List<C33647a> f87234e = new ArrayList();

        /* renamed from: f */
        boolean f87235f;

        /* renamed from: g */
        int f87236g;

        /* renamed from: h */
        public boolean f87237h;

        /* renamed from: i */
        private RecyclerView f87238i;

        /* renamed from: j */
        private C33642b f87239j;

        /* renamed from: k */
        private OnClickListener f87240k;

        /* renamed from: l */
        private Animator f87241l;

        /* renamed from: m */
        private float f87242m;

        public final void dismiss() {
            mo71103a(false);
        }

        /* renamed from: f */
        private boolean m77072f() {
            if (this.f87241l == null || !this.f87241l.isRunning()) {
                return false;
            }
            return true;
        }

        public final void bi_() {
            if (this.f87233d != null) {
                this.f87233d.unregisterLifeCycleMonitor(this);
            }
            this.f87233d = null;
        }

        /* renamed from: d */
        public final boolean mo71104d() {
            if (this.f87230a == null || !this.f87230a.isShowing()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo71106e() {
            if (this.f87233d != null && !this.f87233d.isFinishing()) {
                if (this.f87234e.isEmpty()) {
                    C33670u.m77097a(this.f87230a);
                    C9432q.m18672a(this.f87232c.getContext(), (int) R.string.beh);
                    return;
                }
                this.f87239j.mo71111a(this.f87234e);
                this.f87230a.showAtLocation(this.f87232c, 8388659, 0, (int) this.f87242m);
                mo71103a(true);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo71103a(final boolean z) {
            float f;
            if (m77072f()) {
                this.f87241l.cancel();
            }
            float f2 = -1.0f;
            if (z) {
                f = 0.0f;
            } else {
                f2 = ((-this.f87231b.getY()) / ((float) this.f87236g)) * -1.0f;
                f = -1.0f;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{f2, f}).setDuration(500);
            duration.setInterpolator(new AccelerateDecelerateInterpolator());
            duration.addUpdateListener(new C33668s(this));
            duration.addListener(new AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    if (!z) {
                        C33640a.this.f87231b.postDelayed(new C33669t(this), 10);
                    }
                    C33640a.this.f87237h = false;
                }

                public final void onAnimationStart(Animator animator) {
                    if (z) {
                        PhotoSelectActivity photoSelectActivity = C33640a.this.f87233d;
                        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
                        rotateAnimation.setDuration(500);
                        rotateAnimation.setFillAfter(true);
                        photoSelectActivity.f87219j.startAnimation(rotateAnimation);
                        return;
                    }
                    C33640a.this.f87237h = true;
                    PhotoSelectActivity photoSelectActivity2 = C33640a.this.f87233d;
                    RotateAnimation rotateAnimation2 = new RotateAnimation(180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation2.setDuration(500);
                    rotateAnimation2.setFillAfter(true);
                    photoSelectActivity2.f87219j.startAnimation(rotateAnimation2);
                }
            });
            duration.start();
            this.f87241l = duration;
        }

        public C33640a(PhotoSelectActivity photoSelectActivity, View view, OnClickListener onClickListener, int i) {
            this.f87233d = photoSelectActivity;
            this.f87232c = view;
            this.f87240k = onClickListener;
            this.f87236g = i;
            photoSelectActivity.registerLifeCycleMonitor(this);
            this.f87231b = View.inflate(C11010c.m22280a(), R.layout.bgm, null);
            this.f87242m = this.f87231b.getContext().getResources().getDimension(R.dimen.it) + ((float) C11065a.m22390a(this.f87231b.getContext()));
            this.f87230a = new PopupWindow(this.f87231b, -1, this.f87236g, true);
            this.f87230a.setTouchInterceptor(new C33665p(this));
            this.f87230a.setTouchable(true);
            this.f87238i = (RecyclerView) this.f87231b.findViewById(R.id.bc2);
            this.f87238i.setLayoutManager(new LinearLayoutManager(C11010c.m22280a(), 1, false));
            this.f87239j = new C33642b(this.f87240k);
            this.f87238i.setAdapter(this.f87239j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity$b */
    static class C33642b extends C1322a<C33643c> {

        /* renamed from: a */
        private List<C33647a> f87245a;

        /* renamed from: b */
        private OnClickListener f87246b;

        public final int getItemCount() {
            return this.f87245a.size();
        }

        private C33642b(OnClickListener onClickListener) {
            this.f87245a = new ArrayList();
            this.f87246b = onClickListener;
        }

        /* renamed from: a */
        public final void mo71111a(List<C33647a> list) {
            this.f87245a.clear();
            this.f87245a.addAll(list);
            notifyDataSetChanged();
        }

        public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
            ((C33643c) vVar).mo70626a((C33647a) this.f87245a.get(i));
        }

        public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C33643c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bcv, viewGroup, false), this.f87246b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity$c */
    static class C33643c extends C33298c<C33647a> {

        /* renamed from: b */
        private RemoteImageView f87247b;

        /* renamed from: c */
        private TextView f87248c;

        /* renamed from: d */
        private TextView f87249d;

        /* renamed from: c */
        public final void mo70629c() {
            super.mo70629c();
        }

        /* renamed from: b */
        public final void mo70628b() {
            super.mo70628b();
            this.f87247b = (RemoteImageView) this.itemView.findViewById(R.id.avo);
            this.f87248c = (TextView) this.itemView.findViewById(R.id.axe);
            this.f87249d = (TextView) this.itemView.findViewById(R.id.d8u);
        }

        /* renamed from: a */
        public final void mo70626a(C33647a aVar) {
            super.mo70626a(aVar);
            this.f87248c.setText(C2240a.m6773a(Locale.ENGLISH, "%1$s", new Object[]{aVar.f87264e}));
            this.f87249d.setText(C2240a.m6773a(Locale.ENGLISH, "%1$d", new Object[]{Integer.valueOf(aVar.f87260a)}));
            RemoteImageView remoteImageView = this.f87247b;
            StringBuilder sb = new StringBuilder("file://");
            sb.append(aVar.f87263d);
            C23515d.m57686b(remoteImageView, sb.toString(), NormalGiftView.MASK_TRANSLATE_VALUE, NormalGiftView.MASK_TRANSLATE_VALUE);
            this.itemView.setTag(aVar);
        }

        private C33643c(View view, OnClickListener onClickListener) {
            super(view);
            view.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity$d */
    final class C33644d extends C1322a<C33646e> {

        /* renamed from: b */
        private List<C33654h> f87251b;

        /* renamed from: c */
        private C33631o f87252c;

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getItemCount() {
            return this.f87251b.size();
        }

        private C33644d() {
            this.f87251b = new ArrayList();
            this.f87252c = new C33631o() {
                public final void onClick(View view) {
                    Object tag = view.getTag();
                    if (tag != null && (tag instanceof C33654h)) {
                        C33654h hVar = (C33654h) tag;
                        boolean z = true;
                        if (view.getId() != R.id.bxn) {
                            if (view.getId() == R.id.ckk) {
                                if (view.isSelected()) {
                                    PhotoSelectActivity.this.f87225p.mo71151b(hVar);
                                } else if (PhotoSelectActivity.this.f87225p.mo71152c() >= C33672w.f87298a) {
                                    C9432q.m18672a(C11010c.m22280a(), (int) R.string.bn8);
                                    return;
                                } else {
                                    PhotoSelectActivity.this.f87225p.mo71147a(hVar);
                                }
                                hVar.f87273b = true;
                                view.setSelected(!view.isSelected());
                                PhotoSelectActivity.this.f87223n.notifyDataSetChanged();
                                TextView textView = PhotoSelectActivity.this.f87218i;
                                if (PhotoSelectActivity.this.f87225p.mo71152c() <= 0) {
                                    z = false;
                                }
                                textView.setEnabled(z);
                                PhotoSelectActivity.this.f87218i.setText(PhotoSelectActivity.this.f87225p.mo71153d());
                            }
                        } else if (1 == PhotoSelectActivity.this.f87226q) {
                            PhotoSelectActivity photoSelectActivity = PhotoSelectActivity.this;
                            C33655i fromMediaModel = C33655i.fromMediaModel(hVar.f87272a);
                            Intent intent = new Intent(photoSelectActivity, EmojiAddActivity.class);
                            intent.putExtra("photo_param", fromMediaModel);
                            photoSelectActivity.startActivityForResult(intent, 17);
                        } else {
                            PhotoSelectActivity photoSelectActivity2 = PhotoSelectActivity.this;
                            String str = PhotoSelectActivity.this.f87212c;
                            int a = C33644d.this.mo71113a(hVar, PhotoSelectActivity.this.f87213d.mo4749j(), PhotoSelectActivity.this.f87213d.mo4751l());
                            Intent intent2 = new Intent(photoSelectActivity2, PhotoPreviewListActivity.class);
                            intent2.putExtra("session_id", str);
                            intent2.putExtra("photo_start_index", a);
                            photoSelectActivity2.startActivityForResult(intent2, 48);
                        }
                    }
                }
            };
        }

        /* renamed from: a */
        public final void mo71114a(List<C18489a> list) {
            if (list != null && !list.isEmpty()) {
                this.f87251b.clear();
                ArrayList arrayList = new ArrayList(list.size());
                for (C18489a a : list) {
                    arrayList.add(C33654h.m77093a(a));
                }
                this.f87251b.addAll(arrayList);
                PhotoSelectActivity.this.f87225p.f87302c = arrayList;
                C18842a.m45934b(new C33671v(this));
            }
        }

        public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C33646e(View.inflate(viewGroup.getContext(), R.layout.bf8, null), this.f87252c);
        }

        public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
            C33646e eVar = (C33646e) vVar;
            if (PhotoSelectActivity.this.f87210a == 0) {
                PhotoSelectActivity.this.f87210a = PhotoSelectActivity.this.f87214e.getMeasuredWidth() / 4;
                PhotoSelectActivity.this.f87211b = PhotoSelectActivity.this.f87210a;
            }
            eVar.mo70626a((C33654h) this.f87251b.get(i));
        }

        /* renamed from: a */
        public final int mo71113a(C33654h hVar, int i, int i2) {
            while (hVar != null && i <= i2 && i < this.f87251b.size()) {
                if (((C33654h) this.f87251b.get(i)).equals(hVar)) {
                    return i;
                }
                i++;
            }
            return -1;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity$e */
    class C33646e extends C33298c<C33654h> {

        /* renamed from: c */
        private ImageView f87255c;

        /* renamed from: d */
        private TextView f87256d;

        /* renamed from: e */
        private RemoteImageView f87257e;

        /* renamed from: f */
        private View f87258f;

        /* renamed from: g */
        private View f87259g;

        /* renamed from: b */
        public final void mo70628b() {
            this.f87255c = (ImageView) this.itemView.findViewById(R.id.ckk);
            this.f87256d = (TextView) this.itemView.findViewById(R.id.ckl);
            this.f87257e = (RemoteImageView) this.itemView.findViewById(R.id.bxn);
            this.f87258f = this.itemView.findViewById(R.id.bxp);
            this.f87259g = this.itemView.findViewById(R.id.ckm);
        }

        /* renamed from: c */
        public final void mo70629c() {
            PhotoSelectActivity.this.f87222m.mo73331a(this.f87257e, this.f87255c);
            C33631o.m77054a((OnClickListener) this.f86358a, this.f87257e, this.f87255c);
        }

        /* renamed from: a */
        public final void mo70626a(C33654h hVar) {
            String str;
            LayoutParams layoutParams = (LayoutParams) this.f87257e.getLayoutParams();
            layoutParams.width = PhotoSelectActivity.this.f87210a;
            layoutParams.height = PhotoSelectActivity.this.f87211b;
            this.f87257e.setLayoutParams(layoutParams);
            this.f87258f.setLayoutParams(layoutParams);
            if (hVar.f87272a != null) {
                str = hVar.f87272a.f50916b;
            } else {
                str = "";
            }
            String str2 = str;
            StringBuilder sb = new StringBuilder("file://");
            sb.append(str2);
            C23515d.m57686b(this.f87257e, sb.toString(), PhotoSelectActivity.this.f87210a, PhotoSelectActivity.this.f87211b);
            if (hVar.f87273b) {
                PhotoSelectActivity.this.f87225p.mo71145a(this.f87257e, this.f87259g, this.f87256d, this.f87255c, this.f87258f, str2);
                hVar.f87273b = false;
            } else {
                PhotoSelectActivity.this.f87225p.mo71146a(this.f87256d, this.f87255c, this.f87258f, str2);
            }
            this.f87255c.setTag(hVar);
            this.f87257e.setTag(hVar);
            if (1 == PhotoSelectActivity.this.f87226q) {
                this.f87259g.setVisibility(8);
            }
        }

        public C33646e(View view, C33631o oVar) {
            super(view, oVar);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    /* renamed from: a */
    public final boolean mo71101a() {
        if (1 == this.f87226q) {
            return true;
        }
        return false;
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.f87225p.mo71155f();
    }

    public void onResume() {
        boolean z = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity", "onResume", true);
        super.onResume();
        if (this.f87223n != null) {
            this.f87223n.notifyDataSetChanged();
        }
        TextView textView = this.f87218i;
        if (this.f87225p.mo71152c() <= 0) {
            z = false;
        }
        textView.setEnabled(z);
        this.f87218i.setText(this.f87225p.mo71153d());
        this.f87215f.setSelected(this.f87225p.f87301b);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity", "onResume", false);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("session_id", this.f87212c);
        bundle.putInt("album_action", this.f87226q);
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bbu);
        C34004b.m77718b().setupStatusBar(this);
        if (bundle != null) {
            this.f87212c = bundle.getString("session_id");
            this.f87226q = bundle.getInt("album_action");
        } else {
            this.f87212c = getIntent().getStringExtra("session_id");
            this.f87226q = getIntent().getIntExtra("album_action", 0);
        }
        this.f87225p = C33672w.m77098a();
        this.f87214e = (RecyclerView) findViewById(R.id.bxo);
        this.f87215f = findViewById(R.id.c8o);
        this.f87217h = findViewById(R.id.lz);
        this.f87218i = (TextView) findViewById(R.id.cl4);
        this.f87218i.setText(this.f87225p.mo71153d());
        TextView textView = this.f87218i;
        if (this.f87225p.mo71152c() > 0) {
            z = true;
        } else {
            z = false;
        }
        textView.setEnabled(z);
        this.f87216g = findViewById(R.id.it);
        this.f87220k = (TextView) findViewById(R.id.ea);
        this.f87219j = (ImageView) findViewById(R.id.e7);
        if (1 == this.f87226q) {
            this.f87217h.setVisibility(8);
        }
        if (this.f87221l == null) {
            this.f87221l = new C33631o() {
                public final void onClick(View view) {
                    if (view.equals(PhotoSelectActivity.this.f87218i)) {
                        new C33220b(PhotoSelectActivity.this, new C33242d() {
                            public final void sendMsg() {
                                PhotoSelectActivity photoSelectActivity = PhotoSelectActivity.this;
                                C33440v.m76638a().mo70848a(photoSelectActivity.f87212c, (List<C33655i>) C33655i.fromPhotoItems(photoSelectActivity.f87225p.mo71150b()));
                                photoSelectActivity.f87225p.mo71154e();
                                C53755c.m114319a().mo112960d(new C33350a(new C33655i()));
                                photoSelectActivity.finish();
                            }
                        }).sendMsg();
                    } else if (view.equals(PhotoSelectActivity.this.f87215f)) {
                        PhotoSelectActivity.this.f87215f.setSelected(!PhotoSelectActivity.this.f87215f.isSelected());
                        PhotoSelectActivity.this.f87225p.f87301b = PhotoSelectActivity.this.f87215f.isSelected();
                    } else if (view.equals(PhotoSelectActivity.this.f87216g)) {
                        PhotoSelectActivity.this.f87225p.mo71155f();
                        PhotoSelectActivity.this.finish();
                    } else {
                        if (view.equals(PhotoSelectActivity.this.f87219j) || view.equals(PhotoSelectActivity.this.f87220k)) {
                            if (PhotoSelectActivity.this.f87224o == null) {
                                PhotoSelectActivity.this.f87224o = new C33640a(PhotoSelectActivity.this, PhotoSelectActivity.this.findViewById(R.id.d10), PhotoSelectActivity.this.f87221l, PhotoSelectActivity.this.f87214e.getHeight() + PhotoSelectActivity.this.f87217h.getHeight());
                            }
                            if (PhotoSelectActivity.this.f87224o.mo71104d()) {
                                PhotoSelectActivity.this.f87224o.dismiss();
                                return;
                            }
                            C33640a aVar = PhotoSelectActivity.this.f87224o;
                            if (aVar.f87233d != null && !aVar.f87233d.isFinishing()) {
                                if (aVar.f87235f && aVar.f87234e.isEmpty()) {
                                    C9432q.m18672a(aVar.f87232c.getContext(), (int) R.string.beh);
                                } else if (aVar.f87235f) {
                                    aVar.mo71106e();
                                } else {
                                    C0013i.m16a((Callable<TResult>) new C33666q<TResult>(aVar)).mo20a((C0011g<TResult, TContinuationResult>) new C33667r<TResult,TContinuationResult>(aVar), C0013i.f25b);
                                }
                            }
                        } else if (view.getId() == R.id.av_) {
                            Object tag = view.getTag();
                            if (tag != null) {
                                C33647a aVar2 = (C33647a) tag;
                                PhotoSelectActivity.this.f87220k.setText(aVar2.f87264e);
                                C0013i.m16a((Callable<TResult>) new C33663n<TResult>(this, aVar2)).mo20a((C0011g<TResult, TContinuationResult>) new C33664o<TResult,TContinuationResult>(this), C0013i.f25b);
                            }
                        }
                    }
                }
            };
        }
        if (this.f87222m == null) {
            this.f87222m = C35225a.m79617l();
        }
        this.f87222m.mo73331a(this.f87216g, this.f87215f, this.f87218i, this.f87219j, this.f87220k);
        C33631o.m77054a((OnClickListener) this.f87221l, this.f87218i, this.f87215f, this.f87216g, this.f87219j, this.f87220k);
        this.f87213d = new WrapGridLayoutManager(this, 4);
        this.f87214e.setLayoutManager(this.f87213d);
        if (this.f87223n == null) {
            this.f87223n = new C33644d();
            this.f87223n.setHasStableIds(true);
        }
        this.f87214e.mo4798a((C1331h) new C35401g(4, (int) C9432q.m18687b((Context) this, 1.0f), false));
        this.f87214e.setAdapter(this.f87223n);
        C18842a.m45932a(new C33662m(this));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 49 && intent != null && intent.getBooleanExtra("send_photo", false)) {
            C53755c.m114319a().mo112960d(new C33350a(new C33655i()));
            finish();
        }
        if (i == 17 && i2 == -1) {
            finish();
        }
    }
}
