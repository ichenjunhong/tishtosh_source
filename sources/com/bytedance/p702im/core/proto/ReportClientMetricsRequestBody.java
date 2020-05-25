package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ReportClientMetricsRequestBody */
public final class ReportClientMetricsRequestBody extends Message<ReportClientMetricsRequestBody, Builder> {
    public static final ProtoAdapter<ReportClientMetricsRequestBody> ADAPTER = new ProtoAdapter_ReportClientMetricsRequestBody();
    private static final long serialVersionUID = 0;
    public final List<ClientMetric> report_metrics_list;

    /* renamed from: com.bytedance.im.core.proto.ReportClientMetricsRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ReportClientMetricsRequestBody, Builder> {
        public List<ClientMetric> report_metrics_list = Internal.newMutableList();

        public final ReportClientMetricsRequestBody build() {
            return new ReportClientMetricsRequestBody(this.report_metrics_list, super.buildUnknownFields());
        }

        public final Builder report_metrics_list(List<ClientMetric> list) {
            Internal.checkElementsNotNull(list);
            this.report_metrics_list = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ReportClientMetricsRequestBody$ProtoAdapter_ReportClientMetricsRequestBody */
    static final class ProtoAdapter_ReportClientMetricsRequestBody extends ProtoAdapter<ReportClientMetricsRequestBody> {
        public ProtoAdapter_ReportClientMetricsRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ReportClientMetricsRequestBody.class);
        }

        public final int encodedSize(ReportClientMetricsRequestBody reportClientMetricsRequestBody) {
            return ClientMetric.ADAPTER.asRepeated().encodedSizeWithTag(1, reportClientMetricsRequestBody.report_metrics_list) + reportClientMetricsRequestBody.unknownFields().size();
        }

        public final ReportClientMetricsRequestBody redact(ReportClientMetricsRequestBody reportClientMetricsRequestBody) {
            Builder newBuilder = reportClientMetricsRequestBody.newBuilder();
            Internal.redactElements(newBuilder.report_metrics_list, ClientMetric.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final ReportClientMetricsRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.report_metrics_list.add(ClientMetric.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ReportClientMetricsRequestBody reportClientMetricsRequestBody) throws IOException {
            ClientMetric.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, reportClientMetricsRequestBody.report_metrics_list);
            protoWriter.writeBytes(reportClientMetricsRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.report_metrics_list = Internal.copyOf("report_metrics_list", this.report_metrics_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.report_metrics_list.isEmpty()) {
            sb.append(", report_metrics_list=");
            sb.append(this.report_metrics_list);
        }
        StringBuilder replace = sb.replace(0, 2, "ReportClientMetricsRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public ReportClientMetricsRequestBody(List<ClientMetric> list) {
        this(list, ByteString.EMPTY);
    }

    public ReportClientMetricsRequestBody(List<ClientMetric> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.report_metrics_list = Internal.immutableCopyOf("report_metrics_list", list);
    }
}
