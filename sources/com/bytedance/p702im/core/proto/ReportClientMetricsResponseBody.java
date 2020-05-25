package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ReportClientMetricsResponseBody */
public final class ReportClientMetricsResponseBody extends Message<ReportClientMetricsResponseBody, Builder> {
    public static final ProtoAdapter<ReportClientMetricsResponseBody> ADAPTER = new ProtoAdapter_ReportClientMetricsResponseBody();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.ReportClientMetricsResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ReportClientMetricsResponseBody, Builder> {
        public final ReportClientMetricsResponseBody build() {
            return new ReportClientMetricsResponseBody(super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ReportClientMetricsResponseBody$ProtoAdapter_ReportClientMetricsResponseBody */
    static final class ProtoAdapter_ReportClientMetricsResponseBody extends ProtoAdapter<ReportClientMetricsResponseBody> {
        public ProtoAdapter_ReportClientMetricsResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ReportClientMetricsResponseBody.class);
        }

        public final int encodedSize(ReportClientMetricsResponseBody reportClientMetricsResponseBody) {
            return reportClientMetricsResponseBody.unknownFields().size();
        }

        public final ReportClientMetricsResponseBody redact(ReportClientMetricsResponseBody reportClientMetricsResponseBody) {
            Builder newBuilder = reportClientMetricsResponseBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final ReportClientMetricsResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ReportClientMetricsResponseBody reportClientMetricsResponseBody) throws IOException {
            protoWriter.writeBytes(reportClientMetricsResponseBody.unknownFields());
        }
    }

    public ReportClientMetricsResponseBody() {
        this(ByteString.EMPTY);
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "ReportClientMetricsResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public ReportClientMetricsResponseBody(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
