package openeye.protocol.responses;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

public class ResponseError implements IResponse {
	public static final String TYPE = "error";

	@Override
	public String getType() {
		return TYPE;
	}

	@SerializedName("reportType")
	public String reportType;

	@SerializedName("reportIndex")
	public int reportIndex;

	@SerializedName("debug")
	public JsonElement debug;

}
