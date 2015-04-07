package openeye.protocol.responses;

import com.google.gson.annotations.SerializedName;

public class ResponseKnownCrash implements IResponse {
	public static final String TYPE = "known_crash";

	@Override
	public String getType() {
		return TYPE;
	}

	@SerializedName("note")
	public String note;

	@SerializedName("url")
	public String url;

}
