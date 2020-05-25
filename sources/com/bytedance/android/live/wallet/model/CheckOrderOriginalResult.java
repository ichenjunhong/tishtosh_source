package com.bytedance.android.live.wallet.model;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.network.response.C4175b;
import com.google.gson.p1076a.C17952c;
import java.util.List;

public class CheckOrderOriginalResult extends C4175b<C4453a, C4454b> {
    public static final int FAIL = 0;
    public static final int SUCCESS = 1;
    private Exception exception;
    private String orderId;
    private String payChannel;
    private int retry;

    /* renamed from: com.bytedance.android.live.wallet.model.CheckOrderOriginalResult$a */
    public static class C4453a {
        @C17952c(mo34828a = "status")

        /* renamed from: a */
        public int f12140a;

        public final String toString() {
            StringBuilder sb = new StringBuilder("CheckOrderData{status=");
            sb.append(this.f12140a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.model.CheckOrderOriginalResult$b */
    public static class C4454b extends Extra {
        @C17952c(mo34828a = "coupon")

        /* renamed from: a */
        public String f12141a;
        @C17952c(mo34828a = "coupon_description")

        /* renamed from: b */
        public String f12142b;
        @C17952c(mo34828a = "coupon_detail")

        /* renamed from: c */
        public List<Object> f12143c;

        public final String toString() {
            StringBuilder sb = new StringBuilder("CheckOrderExtra{coupon='");
            sb.append(this.f12141a);
            sb.append('\'');
            sb.append(", couponDescription='");
            sb.append(this.f12142b);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    public Exception getException() {
        return this.exception;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getPayChannel() {
        return this.payChannel;
    }

    public int getRetry() {
        return this.retry;
    }

    public C4453a getData() {
        return (C4453a) this.data;
    }

    public C4454b getExtra() {
        return (C4454b) this.extra;
    }

    public int getStatus() {
        if (this.data == null) {
            return 0;
        }
        return ((C4453a) this.data).f12140a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CheckOrderOriginalResult{data=");
        sb.append(this.data);
        sb.append(", extra=");
        sb.append(this.extra);
        sb.append(", retry=");
        sb.append(this.retry);
        sb.append(", orderId='");
        sb.append(this.orderId);
        sb.append('\'');
        sb.append(", exception=");
        sb.append(this.exception);
        sb.append('}');
        return sb.toString();
    }

    public void setData(C4453a aVar) {
        this.data = aVar;
    }

    public CheckOrderOriginalResult setException(Exception exc) {
        this.exception = exc;
        return this;
    }

    public void setExtra(C4454b bVar) {
        this.extra = bVar;
    }

    public CheckOrderOriginalResult setOrderId(String str) {
        this.orderId = str;
        return this;
    }

    public void setPayChannel(String str) {
        this.payChannel = str;
    }

    public CheckOrderOriginalResult setRetry(int i) {
        this.retry = i;
        return this;
    }

    public CheckOrderOriginalResult setStatus(int i) {
        if (this.data == null) {
            this.data = new C4453a();
        }
        ((C4453a) this.data).f12140a = i;
        return this;
    }
}
