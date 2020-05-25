package com.p683ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.p659c.C10617a;
import com.bytedance.ies.p659c.C10618b;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgFrequentLimit */
public final class UgFrequentLimit extends Message<UgFrequentLimit, Builder> {
    public static final DefaultValueProtoAdapter<UgFrequentLimit> ADAPTER = new ProtoAdapter_UgFrequentLimit();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer days_no_show;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer days_window;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer max_close;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgFrequentLimit$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UgFrequentLimit, Builder> {
        public Integer days_no_show;
        public Integer days_window;
        public Integer max_close;

        public final UgFrequentLimit build() {
            return new UgFrequentLimit(this.days_window, this.max_close, this.days_no_show, super.buildUnknownFields());
        }

        public final Builder days_no_show(Integer num) {
            this.days_no_show = num;
            return this;
        }

        public final Builder days_window(Integer num) {
            this.days_window = num;
            return this;
        }

        public final Builder max_close(Integer num) {
            this.max_close = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgFrequentLimit$ProtoAdapter_UgFrequentLimit */
    static final class ProtoAdapter_UgFrequentLimit extends DefaultValueProtoAdapter<UgFrequentLimit> {
        public final UgFrequentLimit redact(UgFrequentLimit ugFrequentLimit) {
            return ugFrequentLimit;
        }

        public ProtoAdapter_UgFrequentLimit() {
            super(FieldEncoding.LENGTH_DELIMITED, UgFrequentLimit.class);
        }

        public final UgFrequentLimit decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (UgFrequentLimit) null);
        }

        public final int encodedSize(UgFrequentLimit ugFrequentLimit) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, ugFrequentLimit.days_window) + ProtoAdapter.INT32.encodedSizeWithTag(2, ugFrequentLimit.max_close) + ProtoAdapter.INT32.encodedSizeWithTag(3, ugFrequentLimit.days_no_show) + ugFrequentLimit.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, UgFrequentLimit ugFrequentLimit) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, ugFrequentLimit.days_window);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, ugFrequentLimit.max_close);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, ugFrequentLimit.days_no_show);
            protoWriter.writeBytes(ugFrequentLimit.unknownFields());
        }

        public final UgFrequentLimit decode(ProtoReader protoReader, UgFrequentLimit ugFrequentLimit) throws IOException {
            Builder builder;
            UgFrequentLimit ugFrequentLimit2 = (UgFrequentLimit) C10617a.m21405a().mo18840a(UgFrequentLimit.class, ugFrequentLimit);
            if (ugFrequentLimit2 != null) {
                builder = ugFrequentLimit2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.days_window((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.max_close((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.days_no_show((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (C10618b e) {
                                if (ugFrequentLimit2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final Integer getDaysNoShow() throws C10174a {
        if (this.days_no_show != null) {
            return this.days_no_show;
        }
        throw new C10174a();
    }

    public final Integer getDaysWindow() throws C10174a {
        if (this.days_window != null) {
            return this.days_window;
        }
        throw new C10174a();
    }

    public final Integer getMaxClose() throws C10174a {
        if (this.max_close != null) {
            return this.max_close;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.days_window = this.days_window;
        builder.max_close = this.max_close;
        builder.days_no_show = this.days_no_show;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.days_window != null) {
            i = this.days_window.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.max_close != null) {
            i2 = this.max_close.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.days_no_show != null) {
            i4 = this.days_no_show.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.days_window != null) {
            sb.append(", days_window=");
            sb.append(this.days_window);
        }
        if (this.max_close != null) {
            sb.append(", max_close=");
            sb.append(this.max_close);
        }
        if (this.days_no_show != null) {
            sb.append(", days_no_show=");
            sb.append(this.days_no_show);
        }
        StringBuilder replace = sb.replace(0, 2, "UgFrequentLimit{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UgFrequentLimit)) {
            return false;
        }
        UgFrequentLimit ugFrequentLimit = (UgFrequentLimit) obj;
        if (!unknownFields().equals(ugFrequentLimit.unknownFields()) || !Internal.equals(this.days_window, ugFrequentLimit.days_window) || !Internal.equals(this.max_close, ugFrequentLimit.max_close) || !Internal.equals(this.days_no_show, ugFrequentLimit.days_no_show)) {
            return false;
        }
        return true;
    }

    public UgFrequentLimit(Integer num, Integer num2, Integer num3) {
        this(num, num2, num3, ByteString.EMPTY);
    }

    public UgFrequentLimit(Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.days_window = num;
        this.max_close = num2;
        this.days_no_show = num3;
    }
}
