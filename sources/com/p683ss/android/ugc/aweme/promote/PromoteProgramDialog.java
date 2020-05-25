package com.p683ss.android.ugc.aweme.promote;

import android.app.Activity;
import android.content.SharedPreferences.Editor;
import android.os.Message;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.views.C48191h;
import com.p683ss.android.ugc.aweme.views.C48217o;
import com.p683ss.android.ugc.aweme.views.TextClickable;
import com.p683ss.android.ugc.aweme.views.TextClickable.C48168a;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import org.greenrobot.eventbus.C53755c;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.promote.PromoteProgramDialog */
public class PromoteProgramDialog extends C48217o implements C9382a {

    /* renamed from: a */
    public String f103775a;

    /* renamed from: b */
    public Activity f103776b;

    /* renamed from: c */
    public C40739a f103777c;

    /* renamed from: d */
    public C9381g f103778d;

    /* renamed from: e */
    private String f103779e;

    /* renamed from: f */
    private View f103780f;

    /* renamed from: g */
    private C48191h f103781g;
    View mBtnJoin;
    View mBtnNext;
    View mRootView;
    String mStrRegular;
    TextView mTvMsg;
    TextView mTvProtocol;
    TextView mTvTitle;

    public void dismiss() {
        super.dismiss();
        mo83012a(false);
    }

    public void show() {
        super.show();
        C10641a.m21428a(true, this.mRootView);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C53755c a = C53755c.m114319a();
        if (a.mo112958b((Object) this)) {
            a.mo112959c((Object) this);
        }
    }

    @C53771m
    public void closeKrCopyright(C40743d dVar) {
        dismiss();
    }

    /* renamed from: a */
    public final void mo83012a(boolean z) {
        if (z) {
            if (this.f103781g == null) {
                this.f103781g = new C48191h(this.f103776b);
            }
            this.f103781g.show();
            return;
        }
        if (this.f103781g != null) {
            this.f103781g.dismiss();
        }
    }

    public void handleMsg(Message message) {
        mo83012a(false);
        Object obj = message.obj;
        int i = message.what;
        if (obj instanceof C23459a) {
            C10691a.m21545b(C11010c.m22280a(), ((C23459a) obj).getErrorMsg()).mo19066a();
        } else if (obj instanceof Exception) {
            C10691a.m21545b(getContext(), getContext().getResources().getString(R.string.cg2)).mo19066a();
        } else {
            if ((obj instanceof PromoteProgramResponse) && i == 1 && ((PromoteProgramResponse) obj).isConfirmedSuccess()) {
                dismiss();
                Editor edit = C40741c.m90140a().edit();
                edit.putBoolean("joined", true);
                edit.apply();
            }
        }
    }

    public PromoteProgramDialog(Activity activity, String str, int i) {
        super(activity, R.style.vb, false, true, true);
        this.f103776b = activity;
        this.f103779e = str;
        setCancelable(false);
        C53755c a = C53755c.m114319a();
        if (!a.mo112958b((Object) this)) {
            a.mo112955a((Object) this);
        }
        this.f103780f = LayoutInflater.from(activity).inflate(R.layout.km, null);
        setContentView(this.f103780f);
        Window window = getWindow();
        LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = C10641a.f28183h;
        window.addFlags(2);
        window.setAttributes(attributes);
        window.setWindowAnimations(0);
        attributes.width = (int) C9432q.m18687b(getContext(), 280.0f);
        ButterKnife.bind((Object) this, this.f103780f);
        this.f103777c = new C40743d();
        String str2 = (String) SharePrefCache.inst().getPromoteDialogPopupPopupUrl().mo47782d();
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        this.f103775a = str2;
        String str3 = (String) SharePrefCache.inst().getPromoteDialogPopupPopupLinkText().mo47782d();
        if (TextUtils.isEmpty(str3)) {
            str3 = this.mStrRegular;
        }
        this.mStrRegular = str3;
        this.f103778d = new C9381g(this);
        final Integer num = (Integer) SharePrefCache.inst().getPromoteDialogPopupClickType().mo47782d();
        this.mBtnJoin.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C26890h.m65011a("creative_permission_yes", C23089d.m56640a().f61491a);
                if (num.intValue() == 0) {
                    PromoteProgramDialog.this.mo83012a(true);
                    C23566n.m57766a().mo48750a(PromoteProgramDialog.this.f103778d, new Callable() {
                        public final Object call() throws Exception {
                            try {
                                return PromoteProgramRequestApiManager.f103788b.confirmPromoteProgram("1").get();
                            } catch (ExecutionException e) {
                                throw RetrofitService.createIRetrofitServicebyMonsterPlugin().propagateCompatibleException(e);
                            }
                        }
                    }, 1);
                    return;
                }
                if (num.intValue() == 1) {
                    PromoteProgramDialog.this.f103777c.mo83026a(PromoteProgramDialog.this.f103776b, PromoteProgramDialog.this.f103775a, PromoteProgramDialog.this.mStrRegular);
                }
            }
        });
        this.mBtnNext.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                PromoteProgramDialog.this.mo83012a(true);
                C26890h.m65011a("creative_permission_no", C23089d.m56640a().f61491a);
                C23566n.m57766a().mo48750a(null, new Callable() {
                    public final Object call() throws Exception {
                        try {
                            return PromoteProgramRequestApiManager.f103788b.cancelPromoteProgram().get();
                        } catch (ExecutionException e) {
                            throw RetrofitService.createIRetrofitServicebyMonsterPlugin().propagateCompatibleException(e);
                        }
                    }
                }, 1);
                PromoteProgramDialog.this.dismiss();
            }
        });
        String str4 = (String) SharePrefCache.inst().getPromoteDialogPopupPopupTitle().mo47782d();
        String str5 = (String) SharePrefCache.inst().getPromoteDialogPopupPopupMsg().mo47782d();
        String str6 = (String) SharePrefCache.inst().getPromoteDialogPopupPopupContent().mo47782d();
        if (!TextUtils.isEmpty(str4)) {
            this.mTvTitle.setText(str4);
        }
        if (this.mTvTitle.getText() != null) {
            if (num.intValue() == 0) {
                this.mTvTitle.setText(this.mTvTitle.getText().toString().replaceAll("!", "").replaceAll("！", ""));
            }
            this.mTvTitle.setText(this.mTvTitle.getText().toString().replaceAll("\\\\n", "\n"));
        }
        if (!TextUtils.isEmpty(str5)) {
            this.mTvMsg.setText(str5);
        } else {
            this.mTvMsg.setVisibility(8);
        }
        if (!TextUtils.isEmpty(str6)) {
            this.mTvProtocol.setText(str6);
        }
        TextClickable textClickable = new TextClickable();
        textClickable.f121174d = Pattern.compile(this.mStrRegular);
        textClickable.f121172b = 0;
        TextView textView = this.mTvProtocol;
        if (textView != null) {
            SpannableString spannableString = new SpannableString(textView.getText());
            if (textClickable.mo95586a(spannableString)) {
                textView.setText(spannableString);
                textView.setOnTouchListener(new OnTouchListener(spannableString) {

                    /* renamed from: a */
                    final /* synthetic */ SpannableString f121178a;

                    {
                        this.f121178a = r2;
                    }

                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        TextView textView = (TextView) view;
                        if (motionEvent.getAction() == 1) {
                            int x = (int) motionEvent.getX();
                            int totalPaddingLeft = (x - textView.getTotalPaddingLeft()) + textView.getScrollX();
                            int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
                            Layout layout = textView.getLayout();
                            if (layout == null) {
                                return false;
                            }
                            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) totalPaddingLeft);
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.f121178a.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length != 0) {
                                clickableSpanArr[0].onClick(textView);
                            }
                        }
                        return true;
                    }
                });
            }
        }
        textClickable.f121173c = new C48168a() {
            /* renamed from: a */
            public final void mo83019a(TextPaint textPaint) {
                textPaint.setFakeBoldText(true);
                textPaint.setColor(PromoteProgramDialog.this.f103776b.getResources().getColor(R.color.a1p));
                textPaint.setUnderlineText(true);
            }

            /* renamed from: a */
            public final void mo83020a(View view, String str, int i) {
                if (PromoteProgramDialog.this.mStrRegular.equals(str)) {
                    PromoteProgramDialog.this.f103777c.mo83026a(PromoteProgramDialog.this.f103776b, PromoteProgramDialog.this.f103775a, PromoteProgramDialog.this.mStrRegular);
                }
            }
        };
    }
}
