package openeye.protocol.reports;

import com.google.gson.annotations.SerializedName;

public class ReportPing implements IReport {
	public static final String TYPE = "ping";

	@Override
	public String getType() {
		return TYPE;
	}

	@SerializedName("payload")
	public String payload = "Mary Had a Little Lamb";
}
