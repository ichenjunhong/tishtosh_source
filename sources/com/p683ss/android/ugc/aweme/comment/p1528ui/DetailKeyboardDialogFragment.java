package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25219b;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25230h;
import com.p683ss.android.ugc.aweme.detail.p1628ui.FadeImageView.C27482a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.DetailKeyboardDialogFragment */
public class DetailKeyboardDialogFragment extends KeyboardDialogFragment {
    View tabDivider;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo51830a() {
        if (this.mEmojiView.isSelected()) {
            return R.drawable.a9u;
        }
        return R.drawable.a9t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo51831b() {
        if (this.mEmojiView.isSelected()) {
            return R.drawable.a9x;
        }
        return R.drawable.a9w;
    }

    public void dismiss() {
        this.mEditText.setCursorVisible(false);
        this.mAtView.mo55892a();
        this.mEmojiView.mo55892a();
        this.mAtView.setSelected(false);
        this.mEmojiView.setSelected(false);
        super.dismiss();
    }

    public void onShow(DialogInterface dialogInterface) {
        super.onShow(dialogInterface);
        this.mAtView.mo55892a();
        this.mEmojiView.mo55892a();
        this.mAtView.setSelected(true);
        this.mEmojiView.setSelected(true);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getDialog().getWindow().setLayout(-1, -1);
        getDialog().setCanceledOnTouchOutside(false);
        this.mAtView.setListener(new C27482a() {
            /* renamed from: a */
            public final void mo51833a(ImageView imageView) {
                if (DetailKeyboardDialogFragment.this.getContext() != null && !DetailKeyboardDialogFragment.this.isDetached()) {
                    if (imageView.isSelected()) {
                        imageView.setImageDrawable(DetailKeyboardDialogFragment.this.getResources().getDrawable(R.drawable.a9r));
                        return;
                    }
                    imageView.setImageDrawable(DetailKeyboardDialogFragment.this.getResources().getDrawable(R.drawable.a9q));
                }
            }
        });
        this.mEmojiView.setListener(new C27482a() {
            /* renamed from: a */
            public final void mo51833a(ImageView imageView) {
                if (DetailKeyboardDialogFragment.this.getContext() != null && !DetailKeyboardDialogFragment.this.isDetached()) {
                    if (DetailKeyboardDialogFragment.this.f66976l) {
                        imageView.setImageResource(DetailKeyboardDialogFragment.this.mo51831b());
                        return;
                    }
                    imageView.setImageResource(DetailKeyboardDialogFragment.this.mo51830a());
                }
            }
        });
        this.mPublishView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C25230h.m61352a(DetailKeyboardDialogFragment.this.getContext(), new C25219b() {
                    /* renamed from: a */
                    public final void mo51480a(boolean z) {
                        DetailKeyboardDialogFragment.this.mo51858c();
                    }
                });
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.b1k, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        return inflate;
    }
}
