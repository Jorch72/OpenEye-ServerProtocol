package openeye.protocol.responses;

import com.google.gson.annotations.SerializedName;

public class ResponseSuspend implements IResponse {
	public static final String TYPE = "suspend";

	@Override
	public String getType() {
		return TYPE;
	}

	@SerializedName("duration")
	public int duration;

	@SerializedName("reason")
	public String reason;
}
